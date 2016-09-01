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

import com.bydan.erp.inventario.util.LineaConstantesFunciones;
import com.bydan.erp.inventario.util.LineaParameterReturnGeneral;
//import com.bydan.erp.inventario.util.LineaParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.LineaBean;
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
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class LineaBeanSwingJInternalFrame extends LineaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(LineaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Linea> lineaValidator = new ClassValidator<Linea>(Linea.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Linea linea;	
	public Linea lineaAux;
	public Linea lineaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Linea lineaTotales;
	public Long idLineaActual;
	public Long iIdNuevoLinea=0L;
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

	public String sFinalQueryComboNivelLinea="";

	public List<NivelLinea> nivellineasForeignKey;

	public List<NivelLinea> getnivellineasForeignKey() {
		return nivellineasForeignKey;
	}

	public void setnivellineasForeignKey(List<NivelLinea> nivellineasForeignKey) {
		this.nivellineasForeignKey = nivellineasForeignKey;
	}

	//OBJETO FK ACTUAL
	public NivelLinea nivellineaForeignKey;

	public NivelLinea getnivellineaForeignKey() {
		return nivellineaForeignKey;
	}

	public void setnivellineaForeignKey(NivelLinea nivellineaForeignKey) {
		this.nivellineaForeignKey = nivellineaForeignKey;
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

		
	
	
	
	//BUSQUEDA INTERNA FK
	
	

	public Boolean isTienePermisosPresupuestoLinea=false;

	public Boolean getIsTienePermisosPresupuestoLinea() {
		return isTienePermisosPresupuestoLinea;
	}

	public void setIsTienePermisosPresupuestoLinea(Boolean isTienePermisosPresupuestoLinea) {
		this.isTienePermisosPresupuestoLinea= isTienePermisosPresupuestoLinea;
	}


	public Boolean isTienePermisosLinea=false;

	public Boolean getIsTienePermisosLinea() {
		return isTienePermisosLinea;
	}

	public void setIsTienePermisosLinea(Boolean isTienePermisosLinea) {
		this.isTienePermisosLinea= isTienePermisosLinea;
	}


	public Boolean isTienePermisosComisionGrupo=false;

	public Boolean getIsTienePermisosComisionGrupo() {
		return isTienePermisosComisionGrupo;
	}

	public void setIsTienePermisosComisionGrupo(Boolean isTienePermisosComisionGrupo) {
		this.isTienePermisosComisionGrupo= isTienePermisosComisionGrupo;
	}


	public Boolean isTienePermisosProductoPuntoVenta=false;

	public Boolean getIsTienePermisosProductoPuntoVenta() {
		return isTienePermisosProductoPuntoVenta;
	}

	public void setIsTienePermisosProductoPuntoVenta(Boolean isTienePermisosProductoPuntoVenta) {
		this.isTienePermisosProductoPuntoVenta= isTienePermisosProductoPuntoVenta;
	}


	public Boolean isTienePermisosComisionLinea=false;

	public Boolean getIsTienePermisosComisionLinea() {
		return isTienePermisosComisionLinea;
	}

	public void setIsTienePermisosComisionLinea(Boolean isTienePermisosComisionLinea) {
		this.isTienePermisosComisionLinea= isTienePermisosComisionLinea;
	}


	public Boolean isTienePermisosComisionCate=false;

	public Boolean getIsTienePermisosComisionCate() {
		return isTienePermisosComisionCate;
	}

	public void setIsTienePermisosComisionCate(Boolean isTienePermisosComisionCate) {
		this.isTienePermisosComisionCate= isTienePermisosComisionCate;
	}


	public Boolean isTienePermisosDetallePlaneacionCompra=false;

	public Boolean getIsTienePermisosDetallePlaneacionCompra() {
		return isTienePermisosDetallePlaneacionCompra;
	}

	public void setIsTienePermisosDetallePlaneacionCompra(Boolean isTienePermisosDetallePlaneacionCompra) {
		this.isTienePermisosDetallePlaneacionCompra= isTienePermisosDetallePlaneacionCompra;
	}


	public Boolean isTienePermisosCuentasContablesLineaProducto=false;

	public Boolean getIsTienePermisosCuentasContablesLineaProducto() {
		return isTienePermisosCuentasContablesLineaProducto;
	}

	public void setIsTienePermisosCuentasContablesLineaProducto(Boolean isTienePermisosCuentasContablesLineaProducto) {
		this.isTienePermisosCuentasContablesLineaProducto= isTienePermisosCuentasContablesLineaProducto;
	}


	public Boolean isTienePermisosPrecio=false;

	public Boolean getIsTienePermisosPrecio() {
		return isTienePermisosPrecio;
	}

	public void setIsTienePermisosPrecio(Boolean isTienePermisosPrecio) {
		this.isTienePermisosPrecio= isTienePermisosPrecio;
	}


	public Boolean isTienePermisosLineaPuntoVenta=false;

	public Boolean getIsTienePermisosLineaPuntoVenta() {
		return isTienePermisosLineaPuntoVenta;
	}

	public void setIsTienePermisosLineaPuntoVenta(Boolean isTienePermisosLineaPuntoVenta) {
		this.isTienePermisosLineaPuntoVenta= isTienePermisosLineaPuntoVenta;
	}


	public Boolean isTienePermisosDetalleCodigoBarraProducto=false;

	public Boolean getIsTienePermisosDetalleCodigoBarraProducto() {
		return isTienePermisosDetalleCodigoBarraProducto;
	}

	public void setIsTienePermisosDetalleCodigoBarraProducto(Boolean isTienePermisosDetalleCodigoBarraProducto) {
		this.isTienePermisosDetalleCodigoBarraProducto= isTienePermisosDetalleCodigoBarraProducto;
	}


	public Boolean isTienePermisosPresupuestoVentasLineas=false;

	public Boolean getIsTienePermisosPresupuestoVentasLineas() {
		return isTienePermisosPresupuestoVentasLineas;
	}

	public void setIsTienePermisosPresupuestoVentasLineas(Boolean isTienePermisosPresupuestoVentasLineas) {
		this.isTienePermisosPresupuestoVentasLineas= isTienePermisosPresupuestoVentasLineas;
	}


	public Boolean isTienePermisosCentroCostoGrupoProducto=false;

	public Boolean getIsTienePermisosCentroCostoGrupoProducto() {
		return isTienePermisosCentroCostoGrupoProducto;
	}

	public void setIsTienePermisosCentroCostoGrupoProducto(Boolean isTienePermisosCentroCostoGrupoProducto) {
		this.isTienePermisosCentroCostoGrupoProducto= isTienePermisosCentroCostoGrupoProducto;
	}


	public Boolean isTienePermisosProducto=false;

	public Boolean getIsTienePermisosProducto() {
		return isTienePermisosProducto;
	}

	public void setIsTienePermisosProducto(Boolean isTienePermisosProducto) {
		this.isTienePermisosProducto= isTienePermisosProducto;
	}


	public Boolean isTienePermisosComisionMarca=false;

	public Boolean getIsTienePermisosComisionMarca() {
		return isTienePermisosComisionMarca;
	}

	public void setIsTienePermisosComisionMarca(Boolean isTienePermisosComisionMarca) {
		this.isTienePermisosComisionMarca= isTienePermisosComisionMarca;
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
	
	public Boolean isPermisoTodoLinea;
	public Boolean isPermisoNuevoLinea;
	public Boolean isPermisoActualizarLinea;
	public Boolean isPermisoActualizarOriginalLinea;
	public Boolean isPermisoEliminarLinea;
	public Boolean isPermisoGuardarCambiosLinea;
	public Boolean isPermisoConsultaLinea;
	public Boolean isPermisoBusquedaLinea;
	public Boolean isPermisoReporteLinea;
	public Boolean isPermisoPaginacionMedioLinea;
	public Boolean isPermisoPaginacionAltoLinea;
	public Boolean isPermisoPaginacionTodoLinea;
	public Boolean isPermisoCopiarLinea;
	public Boolean isPermisoVerFormLinea;
	public Boolean isPermisoDuplicarLinea;
	public Boolean isPermisoOrdenLinea;
	
	public List<Linea> lineasArbol;
	
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
	
	public LineaParameterReturnGeneral lineaReturnGeneral;
	public LineaParameterReturnGeneral lineaParameterGeneral;
	
	

	public PresupuestoLineaLogic presupuestolineaLogic=null;

	public PresupuestoLineaLogic getPresupuestoLineaLogic() {
		return presupuestolineaLogic;
	}

	public void setPresupuestoLineaLogic(PresupuestoLineaLogic presupuestolineaLogic) {
		this.presupuestolineaLogic = presupuestolineaLogic;
	}


	public ComisionGrupoLogic comisiongrupoGrupoLogic=null;

	public ComisionGrupoLogic getComisionGrupoGrupoLogic() {
		return comisiongrupoGrupoLogic;
	}

	public void setComisionGrupoGrupoLogic(ComisionGrupoLogic comisiongrupoGrupoLogic) {
		this.comisiongrupoGrupoLogic = comisiongrupoGrupoLogic;
	}


	public ProductoPuntoVentaLogic productopuntoventaLogic=null;

	public ProductoPuntoVentaLogic getProductoPuntoVentaLogic() {
		return productopuntoventaLogic;
	}

	public void setProductoPuntoVentaLogic(ProductoPuntoVentaLogic productopuntoventaLogic) {
		this.productopuntoventaLogic = productopuntoventaLogic;
	}


	public ComisionLineaLogic comisionlineaLogic=null;

	public ComisionLineaLogic getComisionLineaLogic() {
		return comisionlineaLogic;
	}

	public void setComisionLineaLogic(ComisionLineaLogic comisionlineaLogic) {
		this.comisionlineaLogic = comisionlineaLogic;
	}


	public ComisionCateLogic comisioncateLogic=null;

	public ComisionCateLogic getComisionCateLogic() {
		return comisioncateLogic;
	}

	public void setComisionCateLogic(ComisionCateLogic comisioncateLogic) {
		this.comisioncateLogic = comisioncateLogic;
	}


	public DetallePlaneacionCompraLogic detalleplaneacioncompraLogic=null;

	public DetallePlaneacionCompraLogic getDetallePlaneacionCompraLogic() {
		return detalleplaneacioncompraLogic;
	}

	public void setDetallePlaneacionCompraLogic(DetallePlaneacionCompraLogic detalleplaneacioncompraLogic) {
		this.detalleplaneacioncompraLogic = detalleplaneacioncompraLogic;
	}


	public CuentasContablesLineaProductoLogic cuentascontableslineaproductoCategoriaLogic=null;

	public CuentasContablesLineaProductoLogic getCuentasContablesLineaProductoCategoriaLogic() {
		return cuentascontableslineaproductoCategoriaLogic;
	}

	public void setCuentasContablesLineaProductoCategoriaLogic(CuentasContablesLineaProductoLogic cuentascontableslineaproductoCategoriaLogic) {
		this.cuentascontableslineaproductoCategoriaLogic = cuentascontableslineaproductoCategoriaLogic;
	}


	public PrecioLogic precioGrupoLogic=null;

	public PrecioLogic getPrecioGrupoLogic() {
		return precioGrupoLogic;
	}

	public void setPrecioGrupoLogic(PrecioLogic precioGrupoLogic) {
		this.precioGrupoLogic = precioGrupoLogic;
	}


	public LineaPuntoVentaLogic lineapuntoventaMarcaLogic=null;

	public LineaPuntoVentaLogic getLineaPuntoVentaMarcaLogic() {
		return lineapuntoventaMarcaLogic;
	}

	public void setLineaPuntoVentaMarcaLogic(LineaPuntoVentaLogic lineapuntoventaMarcaLogic) {
		this.lineapuntoventaMarcaLogic = lineapuntoventaMarcaLogic;
	}


	public DetalleCodigoBarraProductoLogic detallecodigobarraproductoMarcaLogic=null;

	public DetalleCodigoBarraProductoLogic getDetalleCodigoBarraProductoMarcaLogic() {
		return detallecodigobarraproductoMarcaLogic;
	}

	public void setDetalleCodigoBarraProductoMarcaLogic(DetalleCodigoBarraProductoLogic detallecodigobarraproductoMarcaLogic) {
		this.detallecodigobarraproductoMarcaLogic = detallecodigobarraproductoMarcaLogic;
	}


	public PresupuestoVentasLineasLogic presupuestoventaslineasMarcaLogic=null;

	public PresupuestoVentasLineasLogic getPresupuestoVentasLineasMarcaLogic() {
		return presupuestoventaslineasMarcaLogic;
	}

	public void setPresupuestoVentasLineasMarcaLogic(PresupuestoVentasLineasLogic presupuestoventaslineasMarcaLogic) {
		this.presupuestoventaslineasMarcaLogic = presupuestoventaslineasMarcaLogic;
	}


	public CentroCostoGrupoProductoLogic centrocostogrupoproductoLogic=null;

	public CentroCostoGrupoProductoLogic getCentroCostoGrupoProductoLogic() {
		return centrocostogrupoproductoLogic;
	}

	public void setCentroCostoGrupoProductoLogic(CentroCostoGrupoProductoLogic centrocostogrupoproductoLogic) {
		this.centrocostogrupoproductoLogic = centrocostogrupoproductoLogic;
	}


	public ProductoLogic productoLogic=null;

	public ProductoLogic getProductoLogic() {
		return productoLogic;
	}

	public void setProductoLogic(ProductoLogic productoLogic) {
		this.productoLogic = productoLogic;
	}


	public ComisionMarcaLogic comisionmarcaGrupoLogic=null;

	public ComisionMarcaLogic getComisionMarcaGrupoLogic() {
		return comisionmarcaGrupoLogic;
	}

	public void setComisionMarcaGrupoLogic(ComisionMarcaLogic comisionmarcaGrupoLogic) {
		this.comisionmarcaGrupoLogic = comisionmarcaGrupoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoLinea=false;
	public Boolean esParaAccionDesdeFormularioLinea=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected LineaSessionBeanAdditional lineaSessionBeanAdditional=null;
	
	public LineaSessionBeanAdditional getLineaSessionBeanAdditional() {
		return this.lineaSessionBeanAdditional;
	}
	
	public void setLineaSessionBeanAdditional(LineaSessionBeanAdditional lineaSessionBeanAdditional) {
		try {
			this.lineaSessionBeanAdditional=lineaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected LineaBeanSwingJInternalFrameAdditional lineaBeanSwingJInternalFrameAdditional=null;
	//public class LineaBeanSwingJInternalFrame
	
	public LineaBeanSwingJInternalFrameAdditional getLineaBeanSwingJInternalFrameAdditional() {
		return this.lineaBeanSwingJInternalFrameAdditional;
	}
	
	public void setLineaBeanSwingJInternalFrameAdditional(LineaBeanSwingJInternalFrameAdditional lineaBeanSwingJInternalFrameAdditional) {
		try {
			this.lineaBeanSwingJInternalFrameAdditional=lineaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public LineaLogic lineaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Linea lineaBean;
	public LineaConstantesFunciones lineaConstantesFunciones;
	//public LineaParameterReturnGeneral lineaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public NivelLineaLogic nivellineaLogic;
	
	//PARAMETROS
	
	
	//public List<Linea> lineas;	
	//public List<Linea> lineasEliminados;
	//public List<Linea> lineasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoLinea=false;
	public Boolean isVisibilidadCeldaDuplicarLinea=true;
	public Boolean isVisibilidadCeldaCopiarLinea=true;
	public Boolean isVisibilidadCeldaVerFormLinea=true;
	public Boolean isVisibilidadCeldaOrdenLinea=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesLinea=false;
	public Boolean isVisibilidadCeldaModificarLinea=false;
	public Boolean isVisibilidadCeldaActualizarLinea=false;
	public Boolean isVisibilidadCeldaEliminarLinea=false;
	public Boolean isVisibilidadCeldaCancelarLinea=false;
	public Boolean isVisibilidadCeldaGuardarLinea=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosLinea=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdNivelLinea=false;
	
	public Long getiIdNuevoLinea() {
		return this.iIdNuevoLinea;
	}

	public void setiIdNuevoLinea(Long iIdNuevoLinea) {
		this.iIdNuevoLinea = iIdNuevoLinea;
	}
	
	public Long getidLineaActual() {
		return this.idLineaActual;
	}

	public void setidLineaActual(Long idLineaActual) {
		this.idLineaActual = idLineaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Linea getlinea() {
		return this.linea;
	}

	public void setlinea(Linea linea) {
		this.linea = linea;
	}
	
	public Linea getlineaAux() {
		return this.lineaAux;
	}

	public void setlineaAux(Linea lineaAux) {
		this.lineaAux = lineaAux;
	}				
	
	public Linea getlineaAnterior() {
		return this.lineaAnterior;
	}

	public void setlineaAnterior(Linea lineaAnterior) {
		this.lineaAnterior = lineaAnterior;
	}	
	
	public Linea getlineaTotales() {
		return this.lineaTotales;
	}

	public void setlineaTotales(Linea lineaTotales) {
		this.lineaTotales = lineaTotales;
	}	
	
	public Linea getlineaBean() {
		return this.lineaBean;
	}

	public void setlineaBean(Linea lineaBean) {
		this.lineaBean = lineaBean;
	}	
	
	public LineaParameterReturnGeneral getlineaReturnGeneral() {
		return this.lineaReturnGeneral;
	}

	public void setlineaReturnGeneral(LineaParameterReturnGeneral lineaReturnGeneral) {
		this.lineaReturnGeneral = lineaReturnGeneral;
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

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_lineaFK_IdLinea=null;

	public Long getid_lineaFK_IdLinea() {
		return this.id_lineaFK_IdLinea;
	}

	public void setid_lineaFK_IdLinea(Long id_lineaFK_IdLinea) {
		this.id_lineaFK_IdLinea = id_lineaFK_IdLinea;
	}

	public Long id_nivel_lineaFK_IdNivelLinea=-1L;

	public Long getid_nivel_lineaFK_IdNivelLinea() {
		return this.id_nivel_lineaFK_IdNivelLinea;
	}

	public void setid_nivel_lineaFK_IdNivelLinea(Long id_nivel_lineaFK_IdNivelLinea) {
		this.id_nivel_lineaFK_IdNivelLinea = id_nivel_lineaFK_IdNivelLinea;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public LineaLogic getLineaLogic()	{		
		return lineaLogic;
	}

	public void setLineaLogic(LineaLogic lineaLogic) {
		this.lineaLogic = lineaLogic;
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
	
	public Boolean getIsEsNuevoLinea() {
		return isEsNuevoLinea;
	}

	public void setIsEsNuevoLinea(Boolean isEsNuevoLinea) {
		this.isEsNuevoLinea = isEsNuevoLinea;
	}

	public Boolean getEsParaAccionDesdeFormularioLinea() {
		return esParaAccionDesdeFormularioLinea;
	}
	
	public void setEsParaAccionDesdeFormularioLinea(Boolean esParaAccionDesdeFormularioLinea) {
		this.esParaAccionDesdeFormularioLinea = esParaAccionDesdeFormularioLinea;
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

			if(this.lineaSessionBean==null) {
				this.lineaSessionBean=new LineaSessionBean();
			}

			if(!this.lineaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(lineaSessionBean.getlidEmpresaActual());
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

	public void cargarCombosNivelLineasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.nivellineasForeignKey=new ArrayList<NivelLinea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			NivelLineaLogic nivellineaLogic=new NivelLineaLogic();

			//nivellineaLogic.getNivelLineaDataAccess().setIsForForeingKeyData(true);

			if(this.lineaSessionBean==null) {
				this.lineaSessionBean=new LineaSessionBean();
			}

			if(!this.lineaSessionBean.getisBusquedaDesdeForeignKeySesionNivelLinea()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//nivellineaLogic.getNivelLineaDataAccess().setIsForForeingKeyData(true);

					nivellineaLogic.getTodosNivelLineasWithConnection(sFinalQuery,new Pagination());

					this.nivellineasForeignKey=nivellineaLogic.getNivelLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaNivelLinea(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					nivellineaLogic.getEntityWithConnection(lineaSessionBean.getlidNivelLineaActual());
					this.nivellineasForeignKey.add(nivellineaLogic.getNivelLinea());
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

			Linea lineaNulo = new Linea();

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.lineaSessionBean==null) {
				this.lineaSessionBean=new LineaSessionBean();
			}

			if(!this.lineaSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.lineasForeignKey.add(0, lineaNulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLinea(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(lineaSessionBean.getlidLineaActual());
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

					if(this.linea!=null) {
						this.linea.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormLinea!=null) {
						this.jInternalFrameDetalleFormLinea.jComboBoxid_empresaLinea.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaLinea.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormLinea!=null) {
						if(this.jInternalFrameDetalleFormLinea.jComboBoxid_empresaLinea.getItemCount()>0) {
							this.jInternalFrameDetalleFormLinea.jComboBoxid_empresaLinea.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaLineaGenerico)throws Exception
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
				jComboBoxid_empresaLineaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaLineaGenerico!=null && jComboBoxid_empresaLineaGenerico.getItemCount()>0) {
					jComboBoxid_empresaLineaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualNivelLineaForeignKey(Long idNivelLineaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			NivelLinea  nivellineaTemp=null;

			for(NivelLinea nivellineaAux:nivellineasForeignKey) {
				if(nivellineaAux.getId()!=null && nivellineaAux.getId().equals(idNivelLineaSeleccionado)) {
					nivellineaTemp=nivellineaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(nivellineaTemp!=null) {

					if(this.linea!=null) {
						this.linea.setNivelLinea(nivellineaTemp);
					}

					if(this.jInternalFrameDetalleFormLinea!=null) {
						this.jInternalFrameDetalleFormLinea.jComboBoxid_nivel_lineaLinea.setSelectedItem(nivellineaTemp);
					}
				} else {
					//jComboBoxid_nivel_lineaLinea.setSelectedItem(nivellineaTemp);
					if(this.jInternalFrameDetalleFormLinea!=null) {
						if(this.jInternalFrameDetalleFormLinea.jComboBoxid_nivel_lineaLinea.getItemCount()>0) {
							this.jInternalFrameDetalleFormLinea.jComboBoxid_nivel_lineaLinea.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdNivelLinea") || sFormularioTipoBusqueda.equals("Todos")){
					if(nivellineaTemp!=null && jComboBoxid_nivel_lineaFK_IdNivelLineaLinea!=null) {
						jComboBoxid_nivel_lineaFK_IdNivelLineaLinea.setSelectedItem(nivellineaTemp);
					} else {
						if(jComboBoxid_nivel_lineaFK_IdNivelLineaLinea!=null) {
							//jComboBoxid_nivel_lineaFK_IdNivelLineaLinea.setSelectedItem(nivellineaTemp);
							if(jComboBoxid_nivel_lineaFK_IdNivelLineaLinea.getItemCount()>0) {
								jComboBoxid_nivel_lineaFK_IdNivelLineaLinea.setSelectedIndex(0);
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

	public String getActualNivelLineaForeignKeyDescripcion(Long idNivelLineaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			NivelLinea  nivellineaTemp=null;

			for(NivelLinea nivellineaAux:nivellineasForeignKey) {
				if(nivellineaAux.getId()!=null && nivellineaAux.getId().equals(idNivelLineaSeleccionado)) {
					nivellineaTemp=nivellineaAux;
					break;
				}
			}


			sDescripcion=NivelLineaConstantesFunciones.getNivelLineaDescripcion(nivellineaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualNivelLineaForeignKeyGenerico(Long idNivelLineaSeleccionado,JComboBox jComboBoxid_nivel_lineaLineaGenerico)throws Exception
	{
		try
		{
			NivelLinea  nivellineaTemp=null;

			for(NivelLinea nivellineaAux:nivellineasForeignKey) {
				if(nivellineaAux.getId()!=null && nivellineaAux.getId().equals(idNivelLineaSeleccionado)) {
					nivellineaTemp=nivellineaAux;
					break;
				}
			}

			if(nivellineaTemp!=null) {
				jComboBoxid_nivel_lineaLineaGenerico.setSelectedItem(nivellineaTemp);
			} else {
				if(jComboBoxid_nivel_lineaLineaGenerico!=null && jComboBoxid_nivel_lineaLineaGenerico.getItemCount()>0) {
					jComboBoxid_nivel_lineaLineaGenerico.setSelectedIndex(0);
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

					if(this.linea!=null) {
						this.linea.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormLinea!=null) {
						this.jInternalFrameDetalleFormLinea.jComboBoxid_lineaLinea.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaLinea.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormLinea!=null) {
						if(this.jInternalFrameDetalleFormLinea.jComboBoxid_lineaLinea.getItemCount()>0) {
							this.jInternalFrameDetalleFormLinea.jComboBoxid_lineaLinea.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdLinea") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaFK_IdLineaLinea!=null) {
						jComboBoxid_lineaFK_IdLineaLinea.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaFK_IdLineaLinea!=null) {
							//jComboBoxid_lineaFK_IdLineaLinea.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaFK_IdLineaLinea.getItemCount()>0) {
								jComboBoxid_lineaFK_IdLineaLinea.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaLineaGenerico)throws Exception
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
				jComboBoxid_lineaLineaGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaLineaGenerico!=null && jComboBoxid_lineaLineaGenerico.getItemCount()>0) {
					jComboBoxid_lineaLineaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Linea linea,JComboBox jComboBoxid_empresaLineaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaLineaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormLinea.jComboBoxid_empresaLinea.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaLineaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				linea.setid_empresa(empresaAux.getId());
				linea.setempresa_descripcion(LineaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				linea.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarNivelLineaForeignKey(Linea linea,JComboBox jComboBoxid_nivel_lineaLineaGenerico)throws Exception
	{
		try
		{
			NivelLinea  nivellineaAux=new NivelLinea();

			if(jComboBoxid_nivel_lineaLineaGenerico==null) {
				nivellineaAux=(NivelLinea)this.jInternalFrameDetalleFormLinea.jComboBoxid_nivel_lineaLinea.getSelectedItem();
			} else {
				nivellineaAux=(NivelLinea)jComboBoxid_nivel_lineaLineaGenerico.getSelectedItem();
			}

			if(nivellineaAux!=null && nivellineaAux.getId()!=null) {
				linea.setid_nivel_linea(nivellineaAux.getId());
				linea.setnivellinea_descripcion(LineaConstantesFunciones.getNivelLineaDescripcion(nivellineaAux));
				linea.setNivelLinea(nivellineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(Linea linea,JComboBox jComboBoxid_lineaLineaGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaLineaGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormLinea.jComboBoxid_lineaLinea.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaLineaGenerico.getSelectedItem();
			}

			if(lineaAux!=null) {
				linea.setid_linea(lineaAux.getId());
				linea.setlinea_descripcion(LineaConstantesFunciones.getLineaDescripcion(lineaAux));
				linea.setLinea(lineaAux);			}
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

					if(!LineaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLinea!=null) { 
							this.jInternalFrameDetalleFormLinea.jComboBoxid_empresaLinea.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormLinea.jComboBoxid_empresaLinea.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLinea!=null) { 
					}

					if(!LineaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameNivelLineasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingNivelLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!LineaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLinea!=null) { 
							this.jInternalFrameDetalleFormLinea.jComboBoxid_nivel_lineaLinea.removeAllItems();

							for(NivelLinea nivellinea:this.nivellineasForeignKey) {
								this.jInternalFrameDetalleFormLinea.jComboBoxid_nivel_lineaLinea.addItem(nivellinea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLinea!=null) { 
					}

					if(!LineaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdNivelLinea") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!LineaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_nivel_lineaFK_IdNivelLineaLinea.removeAllItems();

							for(NivelLinea nivellinea:this.nivellineasForeignKey) {
								this.jComboBoxid_nivel_lineaFK_IdNivelLineaLinea.addItem(nivellinea);
							}
						}

						if(!LineaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!LineaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLinea!=null) { 
							this.jInternalFrameDetalleFormLinea.jComboBoxid_lineaLinea.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormLinea.jComboBoxid_lineaLinea.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLinea!=null) { 
					}

					if(!LineaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdLinea") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!LineaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaFK_IdLineaLinea.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaFK_IdLineaLinea.addItem(linea);
							}
						}

						if(!LineaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormLinea!=null) {
							this.jInternalFrameDetalleFormLinea.jComboBoxid_empresaLinea.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormLinea!=null) {
							this.jInternalFrameDetalleFormLinea.jComboBoxid_empresaLinea.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameNivelLineaForeignKey(NivelLinea nivellinea,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormLinea!=null) {
							this.jInternalFrameDetalleFormLinea.jComboBoxid_nivel_lineaLinea.setSelectedItem(nivellinea);
						}
					} else {
						if(this.jInternalFrameDetalleFormLinea!=null) {
							this.jInternalFrameDetalleFormLinea.jComboBoxid_nivel_lineaLinea.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_nivel_lineaFK_IdNivelLineaLinea.setSelectedItem(nivellinea);
						} else {
							this.jComboBoxid_nivel_lineaFK_IdNivelLineaLinea.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormLinea!=null) {
							this.jInternalFrameDetalleFormLinea.jComboBoxid_lineaLinea.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormLinea!=null) {
							this.jInternalFrameDetalleFormLinea.jComboBoxid_lineaLinea.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaFK_IdLineaLinea.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaFK_IdLineaLinea.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesLinea() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			LineaConstantesFunciones.refrescarForeignKeysDescripcionesLinea(this.lineaLogic.getLineas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			LineaConstantesFunciones.refrescarForeignKeysDescripcionesLinea(this.lineas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(NivelLinea.class));
		classes.add(new Classe(Linea.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//lineaLogic.setLineas(this.lineas);
			lineaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public LineaParameterReturnGeneral getLineaParameterGeneral() {
		return this.lineaParameterGeneral;
	}
	
	public void setLineaParameterGeneral(LineaParameterReturnGeneral lineaParameterGeneral) {
		this.lineaParameterGeneral = lineaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoLinea() {
		return isPermisoTodoLinea;
	}

	public void setIsPermisoTodoLinea(Boolean isPermisoTodoLinea) {
		this.isPermisoTodoLinea = isPermisoTodoLinea;
	}

	public Boolean getIsPermisoNuevoLinea() {
		return isPermisoNuevoLinea;
	}

	public void setIsPermisoNuevoLinea(Boolean isPermisoNuevoLinea) {
		this.isPermisoNuevoLinea = isPermisoNuevoLinea;
	}

	public Boolean getIsPermisoActualizarLinea() {
		return isPermisoActualizarLinea;
	}

	public void setIsPermisoActualizarLinea(Boolean isPermisoActualizarLinea) {
		this.isPermisoActualizarLinea = isPermisoActualizarLinea;
	}

	public Boolean getIsPermisoEliminarLinea() {
		return isPermisoEliminarLinea;
	}

	public void setIsPermisoEliminarLinea(Boolean isPermisoEliminarLinea) {
		this.isPermisoEliminarLinea = isPermisoEliminarLinea;
	}

	public Boolean getIsPermisoGuardarCambiosLinea() {
		return isPermisoGuardarCambiosLinea;
	}

	public void setIsPermisoGuardarCambiosLinea(Boolean isPermisoGuardarCambiosLinea) {
		this.isPermisoGuardarCambiosLinea = isPermisoGuardarCambiosLinea;
	}
	
	public Boolean getIsPermisoConsultaLinea() {
		return isPermisoConsultaLinea;
	}

	public void setIsPermisoConsultaLinea(Boolean isPermisoConsultaLinea) {
		this.isPermisoConsultaLinea = isPermisoConsultaLinea;
	}

	public Boolean getIsPermisoBusquedaLinea() {
		return isPermisoBusquedaLinea;
	}

	public void setIsPermisoBusquedaLinea(Boolean isPermisoBusquedaLinea) {
		this.isPermisoBusquedaLinea = isPermisoBusquedaLinea;
	}

	public Boolean getIsPermisoReporteLinea() {
		return isPermisoReporteLinea;
	}

	public void setIsPermisoReporteLinea(Boolean isPermisoReporteLinea) {
		this.isPermisoReporteLinea = isPermisoReporteLinea;
	}
	
	public Boolean getIsPermisoPaginacionMedioLinea() {
		return isPermisoPaginacionMedioLinea;
	}

	public void setIsPermisoPaginacionMedioLinea(Boolean isPermisoPaginacionMedioLinea) {
		this.isPermisoPaginacionMedioLinea = isPermisoPaginacionMedioLinea;
	}
	
	public Boolean getIsPermisoPaginacionTodoLinea() {
		return isPermisoPaginacionTodoLinea;
	}

	public void setIsPermisoPaginacionTodoLinea(Boolean isPermisoPaginacionTodoLinea) {
		this.isPermisoPaginacionTodoLinea = isPermisoPaginacionTodoLinea;
	}
	
	public Boolean getIsPermisoPaginacionAltoLinea() {
		return isPermisoPaginacionAltoLinea;
	}

	public void setIsPermisoPaginacionAltoLinea(Boolean isPermisoPaginacionAltoLinea) {
		this.isPermisoPaginacionAltoLinea = isPermisoPaginacionAltoLinea;
	}
	
	public Boolean getIsPermisoCopiarLinea() {
		return isPermisoCopiarLinea;
	}

	public void setIsPermisoCopiarLinea(Boolean isPermisoCopiarLinea) {
		this.isPermisoCopiarLinea = isPermisoCopiarLinea;
	}
	
	public Boolean getIsPermisoVerFormLinea() {
		return isPermisoVerFormLinea;
	}

	public void setIsPermisoVerFormLinea(Boolean isPermisoVerFormLinea) {
		this.isPermisoVerFormLinea = isPermisoVerFormLinea;
	}
	
	public Boolean getIsPermisoDuplicarLinea() {
		return isPermisoDuplicarLinea;
	}

	public void setIsPermisoDuplicarLinea(Boolean isPermisoDuplicarLinea) {
		this.isPermisoDuplicarLinea = isPermisoDuplicarLinea;
	}
	
	public Boolean getIsPermisoOrdenLinea() {
		return isPermisoOrdenLinea;
	}

	public void setIsPermisoOrdenLinea(Boolean isPermisoOrdenLinea) {
		this.isPermisoOrdenLinea = isPermisoOrdenLinea;
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
	
	public Boolean getIsVisibilidadCeldaNuevoLinea() {
		return isVisibilidadCeldaNuevoLinea;
	}

	public void setIsVisibilidadCeldaNuevoLinea(Boolean isVisibilidadCeldaNuevoLinea) {
		this.isVisibilidadCeldaNuevoLinea = isVisibilidadCeldaNuevoLinea;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarLinea() {
		return isVisibilidadCeldaDuplicarLinea;
	}

	public void setIsVisibilidadCeldaDuplicarLinea(Boolean isVisibilidadCeldaDuplicarLinea) {
		this.isVisibilidadCeldaDuplicarLinea = isVisibilidadCeldaDuplicarLinea;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarLinea() {
		return isVisibilidadCeldaCopiarLinea;
	}

	public void setIsVisibilidadCeldaCopiarLinea(Boolean isVisibilidadCeldaCopiarLinea) {
		this.isVisibilidadCeldaCopiarLinea = isVisibilidadCeldaCopiarLinea;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormLinea() {
		return isVisibilidadCeldaVerFormLinea;
	}

	public void setIsVisibilidadCeldaVerFormLinea(Boolean isVisibilidadCeldaVerFormLinea) {
		this.isVisibilidadCeldaVerFormLinea = isVisibilidadCeldaVerFormLinea;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenLinea() {
		return isVisibilidadCeldaOrdenLinea;
	}

	public void setIsVisibilidadCeldaOrdenLinea(Boolean isVisibilidadCeldaOrdenLinea) {
		this.isVisibilidadCeldaOrdenLinea = isVisibilidadCeldaOrdenLinea;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesLinea() {
		return isVisibilidadCeldaNuevoRelacionesLinea;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesLinea(Boolean isVisibilidadCeldaNuevoRelacionesLinea) {
		this.isVisibilidadCeldaNuevoRelacionesLinea = isVisibilidadCeldaNuevoRelacionesLinea;
	}
	
	public Boolean getIsVisibilidadCeldaModificarLinea() {
		return isVisibilidadCeldaModificarLinea;
	}

	public void setIsVisibilidadCeldaModificarLinea(Boolean isVisibilidadCeldaModificarLinea) {
		this.isVisibilidadCeldaModificarLinea = isVisibilidadCeldaModificarLinea;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarLinea() {
		return isVisibilidadCeldaActualizarLinea;
	}

	public void setIsVisibilidadCeldaActualizarLinea(Boolean isVisibilidadCeldaActualizarLinea) {
		this.isVisibilidadCeldaActualizarLinea = isVisibilidadCeldaActualizarLinea;
	}

	public Boolean getIsVisibilidadCeldaEliminarLinea() {
		return isVisibilidadCeldaEliminarLinea;
	}

	public void setIsVisibilidadCeldaEliminarLinea(Boolean isVisibilidadCeldaEliminarLinea) {
		this.isVisibilidadCeldaEliminarLinea = isVisibilidadCeldaEliminarLinea;
	}

	public Boolean getIsVisibilidadCeldaCancelarLinea() {
		return isVisibilidadCeldaCancelarLinea;
	}

	public void setIsVisibilidadCeldaCancelarLinea(Boolean isVisibilidadCeldaCancelarLinea) {
		this.isVisibilidadCeldaCancelarLinea = isVisibilidadCeldaCancelarLinea;
	}

	public Boolean getIsVisibilidadCeldaGuardarLinea() {
		return isVisibilidadCeldaGuardarLinea;
	}

	public void setIsVisibilidadCeldaGuardarLinea(Boolean isVisibilidadCeldaGuardarLinea) {
		this.isVisibilidadCeldaGuardarLinea = isVisibilidadCeldaGuardarLinea;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosLinea() {
		return isVisibilidadCeldaGuardarCambiosLinea;
	}

	public void setIsVisibilidadCeldaGuardarCambiosLinea(Boolean isVisibilidadCeldaGuardarCambiosLinea) {
		this.isVisibilidadCeldaGuardarCambiosLinea = isVisibilidadCeldaGuardarCambiosLinea;
	}
		
	public LineaSessionBean getlineaSessionBean() {
		return this.lineaSessionBean;
	}
	
	public void setlineaSessionBean(LineaSessionBean lineaSessionBean) {
		this.lineaSessionBean=lineaSessionBean;
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

	public Boolean getisVisibilidadFK_IdNivelLinea() {
		return this.isVisibilidadFK_IdNivelLinea;
	}

	public void setisVisibilidadFK_IdNivelLinea(Boolean isVisibilidadFK_IdNivelLinea) {
		this.isVisibilidadFK_IdNivelLinea=isVisibilidadFK_IdNivelLinea;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysLinea(Linea linea)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(linea,null);
				this.setActualParaGuardarNivelLineaForeignKey(linea,null);
				this.setActualParaGuardarLineaForeignKey(linea,null);
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
	
	public void bugActualizarReferenciaActual(Linea linea,Linea lineaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalLinea(linea);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		lineaAux.setId(linea.getId());
		lineaAux.setVersionRow(linea.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessLinea();
		
			int intSelectedRow = this.jTableDatosLinea.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.linea =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.linea =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(LineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualLinea(this.linea,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = lineaValidator.getInvalidValues(this.linea);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			lineaLogic.setDatosCliente(datosCliente);
			lineaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				lineaAux=new  Linea();
				
				lineaAux.setIsNew(true);
				lineaAux.setIsChanged(true);
				
				lineaAux.setLineaOriginal(this.linea);
				
				lineaAux.setId(this.linea.getId());	
				lineaAux.setVersionRow(this.linea.getVersionRow());	
				lineaAux.setid_empresa(this.linea.getid_empresa());	
				lineaAux.setid_nivel_linea(this.linea.getid_nivel_linea());	
				
				if(this.linea.getid_linea()!=null && this.linea.getid_linea()>0L) {
					lineaAux.setid_linea(this.linea.getid_linea());
				} else {
					lineaAux.setid_linea(null);
				}	
				lineaAux.setcodigo(this.linea.getcodigo());	
				lineaAux.setnombre(this.linea.getnombre());	
				lineaAux.setdescripcion(this.linea.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.lineaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.lineaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(lineaAux,lineaLogic.getLineas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(lineaAux,lineas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.lineaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.lineaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaLogic.saveLineas();//WithConnection
						//lineaLogic.getSetVersionRowLineas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.linea,lineaAux);
					
					this.refrescarForeignKeysDescripcionesLinea();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.lineaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineaLogic.getPresupuestoLineas().addAll(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineasEliminados);
							this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineaLogic.getLineas().addAll(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineasEliminados);
							this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.getComisionGrupos().addAll(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongruposEliminados);
							this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventaLogic.getProductoPuntoVentas().addAll(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventasEliminados);
							this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.getComisionLineas().addAll(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineasEliminados);
							this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncateLogic.getComisionCates().addAll(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncatesEliminados);
							this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().addAll(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncomprasEliminados);
							this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoLogic.getCuentasContablesLineaProductos().addAll(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductosEliminados);
							this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precioLogic.getPrecios().addAll(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.preciosEliminados);
							this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaLogic.getLineaPuntoVentas().addAll(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventasEliminados);
							this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoLogic.getDetalleCodigoBarraProductos().addAll(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductosEliminados);
							this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.getPresupuestoVentasLineass().addAll(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineassEliminados);
							this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().addAll(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductosEliminados);
							this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.getComisionMarcas().addAll(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineas.addAll(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineasEliminados);
							this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineas.addAll(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineasEliminados);
							this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupos.addAll(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongruposEliminados);
							this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventas.addAll(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventasEliminados);
							this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineas.addAll(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineasEliminados);
							this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncates.addAll(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncatesEliminados);
							this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompras.addAll(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncomprasEliminados);
							this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductos.addAll(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductosEliminados);
							this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precios.addAll(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.preciosEliminados);
							this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventas.addAll(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventasEliminados);
							this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductos.addAll(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductosEliminados);
							this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineass.addAll(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineassEliminados);
							this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductos.addAll(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductosEliminados);
							this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcas.addAll(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.lineaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								lineaLogic.saveLineaRelaciones(lineaAux,this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineaLogic.getPresupuestoLineas(),this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineaLogic.getLineas(),this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.getComisionGrupos(),this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventaLogic.getProductoPuntoVentas(),this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.getComisionLineas(),this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncateLogic.getComisionCates(),this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.getDetallePlaneacionCompras(),this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoLogic.getCuentasContablesLineaProductos(),this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precioLogic.getPrecios(),this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaLogic.getLineaPuntoVentas(),this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoLogic.getDetalleCodigoBarraProductos(),this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.getPresupuestoVentasLineass(),this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos(),this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.getComisionMarcas());//WithConnection
								//lineaLogic.getSetVersionRowLineas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.linea,lineaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineaLogic.setPresupuestoLineas(new ArrayList<PresupuestoLinea>());
							this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineaLogic.setLineas(new ArrayList<Linea>());
							this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.setComisionGrupos(new ArrayList<ComisionGrupo>());
							this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventaLogic.setProductoPuntoVentas(new ArrayList<ProductoPuntoVenta>());
							this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.setComisionLineas(new ArrayList<ComisionLinea>());
							this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncateLogic.setComisionCates(new ArrayList<ComisionCate>());
							this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.setDetallePlaneacionCompras(new ArrayList<DetallePlaneacionCompra>());
							this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoLogic.setCuentasContablesLineaProductos(new ArrayList<CuentasContablesLineaProducto>());
							this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precioLogic.setPrecios(new ArrayList<Precio>());
							this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaLogic.setLineaPuntoVentas(new ArrayList<LineaPuntoVenta>());
							this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoLogic.setDetalleCodigoBarraProductos(new ArrayList<DetalleCodigoBarraProducto>());
							this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.setPresupuestoVentasLineass(new ArrayList<PresupuestoVentasLineas>());
							this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoLogic.setCentroCostoGrupoProductos(new ArrayList<CentroCostoGrupoProducto>());
							this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.setComisionMarcas(new ArrayList<ComisionMarca>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineas= new ArrayList<PresupuestoLinea>();
							this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineas= new ArrayList<Linea>();
							this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupos= new ArrayList<ComisionGrupo>();
							this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventas= new ArrayList<ProductoPuntoVenta>();
							this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineas= new ArrayList<ComisionLinea>();
							this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncates= new ArrayList<ComisionCate>();
							this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompras= new ArrayList<DetallePlaneacionCompra>();
							this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductos= new ArrayList<CuentasContablesLineaProducto>();
							this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precios= new ArrayList<Precio>();
							this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventas= new ArrayList<LineaPuntoVenta>();
							this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductos= new ArrayList<DetalleCodigoBarraProducto>();
							this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineass= new ArrayList<PresupuestoVentasLineas>();
							this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductos= new ArrayList<CentroCostoGrupoProducto>();
							this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcas= new ArrayList<ComisionMarca>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setPresupuestoLineas(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineaLogic.getPresupuestoLineas());

							if(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setLineas(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineaLogic.getLineas());

							if(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setComisionGrupoGrupos(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.getComisionGrupos());

							if(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setProductoPuntoVentas(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventaLogic.getProductoPuntoVentas());

							if(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setComisionLineas(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.getComisionLineas());

							if(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setComisionCates(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncateLogic.getComisionCates());

							if(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setDetallePlaneacionCompras(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.getDetallePlaneacionCompras());

							if(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setCuentasContablesLineaProductoCategorias(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoLogic.getCuentasContablesLineaProductos());

							if(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setPrecioGrupos(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precioLogic.getPrecios());

							if(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setLineaPuntoVentaMarcas(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaLogic.getLineaPuntoVentas());

							if(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setDetalleCodigoBarraProductoMarcas(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoLogic.getDetalleCodigoBarraProductos());

							if(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setPresupuestoVentasLineasMarcas(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.getPresupuestoVentasLineass());

							if(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setCentroCostoGrupoProductos(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());

							if(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setProductos(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setComisionMarcaGrupos(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.getComisionMarcas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.lineaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.lineaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(lineaAux,lineaLogic.getLineas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(lineaAux,lineas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.linea,lineaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				lineaAux=new  Linea();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.lineaSessionBean.getEsGuardarRelacionado() 
					|| (this.lineaSessionBean.getEsGuardarRelacionado() && this.linea.getId()>=0)) {
						
					lineaAux.setIsNew(false);
				}
				
				lineaAux.setIsDeleted(false);
			
				lineaAux.setId(this.linea.getId());	
				lineaAux.setVersionRow(this.linea.getVersionRow());	
				lineaAux.setid_empresa(this.linea.getid_empresa());	
				lineaAux.setid_nivel_linea(this.linea.getid_nivel_linea());	
				
				if(this.linea.getid_linea()!=null && this.linea.getid_linea()>0L) {
					lineaAux.setid_linea(this.linea.getid_linea());
				} else {
					lineaAux.setid_linea(null);
				}	
				lineaAux.setcodigo(this.linea.getcodigo());	
				lineaAux.setnombre(this.linea.getnombre());	
				lineaAux.setdescripcion(this.linea.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(lineaAux,lineaLogic.getLineas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(lineaAux,lineas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.lineaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.lineaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaLogic.saveLineas();//WithConnection
						//lineaLogic.getSetVersionRowLineas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.linea,lineaAux);
					
					this.refrescarForeignKeysDescripcionesLinea();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.lineaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineaLogic.getPresupuestoLineas().addAll(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineasEliminados);
							this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineaLogic.getLineas().addAll(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineasEliminados);
							this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.getComisionGrupos().addAll(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongruposEliminados);
							this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventaLogic.getProductoPuntoVentas().addAll(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventasEliminados);
							this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.getComisionLineas().addAll(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineasEliminados);
							this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncateLogic.getComisionCates().addAll(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncatesEliminados);
							this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().addAll(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncomprasEliminados);
							this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoLogic.getCuentasContablesLineaProductos().addAll(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductosEliminados);
							this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precioLogic.getPrecios().addAll(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.preciosEliminados);
							this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaLogic.getLineaPuntoVentas().addAll(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventasEliminados);
							this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoLogic.getDetalleCodigoBarraProductos().addAll(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductosEliminados);
							this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.getPresupuestoVentasLineass().addAll(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineassEliminados);
							this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().addAll(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductosEliminados);
							this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.getComisionMarcas().addAll(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineas.addAll(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineasEliminados);
							this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineas.addAll(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineasEliminados);
							this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupos.addAll(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongruposEliminados);
							this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventas.addAll(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventasEliminados);
							this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineas.addAll(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineasEliminados);
							this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncates.addAll(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncatesEliminados);
							this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompras.addAll(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncomprasEliminados);
							this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductos.addAll(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductosEliminados);
							this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precios.addAll(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.preciosEliminados);
							this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventas.addAll(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventasEliminados);
							this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductos.addAll(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductosEliminados);
							this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineass.addAll(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineassEliminados);
							this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductos.addAll(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductosEliminados);
							this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcas.addAll(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.lineaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								lineaLogic.saveLineaRelaciones(lineaAux,this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineaLogic.getPresupuestoLineas(),this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineaLogic.getLineas(),this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.getComisionGrupos(),this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventaLogic.getProductoPuntoVentas(),this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.getComisionLineas(),this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncateLogic.getComisionCates(),this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.getDetallePlaneacionCompras(),this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoLogic.getCuentasContablesLineaProductos(),this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precioLogic.getPrecios(),this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaLogic.getLineaPuntoVentas(),this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoLogic.getDetalleCodigoBarraProductos(),this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.getPresupuestoVentasLineass(),this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos(),this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.getComisionMarcas());//WithConnection
								//lineaLogic.getSetVersionRowLineas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.linea,lineaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineaLogic.setPresupuestoLineas(new ArrayList<PresupuestoLinea>());
							this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineaLogic.setLineas(new ArrayList<Linea>());
							this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.setComisionGrupos(new ArrayList<ComisionGrupo>());
							this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventaLogic.setProductoPuntoVentas(new ArrayList<ProductoPuntoVenta>());
							this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.setComisionLineas(new ArrayList<ComisionLinea>());
							this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncateLogic.setComisionCates(new ArrayList<ComisionCate>());
							this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.setDetallePlaneacionCompras(new ArrayList<DetallePlaneacionCompra>());
							this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoLogic.setCuentasContablesLineaProductos(new ArrayList<CuentasContablesLineaProducto>());
							this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precioLogic.setPrecios(new ArrayList<Precio>());
							this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaLogic.setLineaPuntoVentas(new ArrayList<LineaPuntoVenta>());
							this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoLogic.setDetalleCodigoBarraProductos(new ArrayList<DetalleCodigoBarraProducto>());
							this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.setPresupuestoVentasLineass(new ArrayList<PresupuestoVentasLineas>());
							this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoLogic.setCentroCostoGrupoProductos(new ArrayList<CentroCostoGrupoProducto>());
							this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.setComisionMarcas(new ArrayList<ComisionMarca>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineas= new ArrayList<PresupuestoLinea>();
							this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineas= new ArrayList<Linea>();
							this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupos= new ArrayList<ComisionGrupo>();
							this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventas= new ArrayList<ProductoPuntoVenta>();
							this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineas= new ArrayList<ComisionLinea>();
							this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncates= new ArrayList<ComisionCate>();
							this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompras= new ArrayList<DetallePlaneacionCompra>();
							this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductos= new ArrayList<CuentasContablesLineaProducto>();
							this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precios= new ArrayList<Precio>();
							this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventas= new ArrayList<LineaPuntoVenta>();
							this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductos= new ArrayList<DetalleCodigoBarraProducto>();
							this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineass= new ArrayList<PresupuestoVentasLineas>();
							this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductos= new ArrayList<CentroCostoGrupoProducto>();
							this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcas= new ArrayList<ComisionMarca>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setPresupuestoLineas(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineaLogic.getPresupuestoLineas());

							if(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setLineas(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineaLogic.getLineas());

							if(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setComisionGrupoGrupos(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.getComisionGrupos());

							if(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setProductoPuntoVentas(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventaLogic.getProductoPuntoVentas());

							if(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setComisionLineas(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.getComisionLineas());

							if(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setComisionCates(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncateLogic.getComisionCates());

							if(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setDetallePlaneacionCompras(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.getDetallePlaneacionCompras());

							if(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setCuentasContablesLineaProductoCategorias(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoLogic.getCuentasContablesLineaProductos());

							if(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setPrecioGrupos(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precioLogic.getPrecios());

							if(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setLineaPuntoVentaMarcas(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaLogic.getLineaPuntoVentas());

							if(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setDetalleCodigoBarraProductoMarcas(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoLogic.getDetalleCodigoBarraProductos());

							if(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setPresupuestoVentasLineasMarcas(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.getPresupuestoVentasLineass());

							if(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setCentroCostoGrupoProductos(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());

							if(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setProductos(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setComisionMarcaGrupos(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.getComisionMarcas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.lineaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.lineaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(lineaAux,lineaLogic.getLineas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(lineaAux,lineas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.linea,lineaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				lineaAux=new  Linea();
				
				lineaAux.setIsNew(false);
				lineaAux.setIsChanged(false);
				
				lineaAux.setIsDeleted(true);
				
				lineaAux.setId(this.linea.getId());	
				lineaAux.setVersionRow(this.linea.getVersionRow());	
				lineaAux.setid_empresa(this.linea.getid_empresa());	
				lineaAux.setid_nivel_linea(this.linea.getid_nivel_linea());	
				
				if(this.linea.getid_linea()!=null && this.linea.getid_linea()>0L) {
					lineaAux.setid_linea(this.linea.getid_linea());
				} else {
					lineaAux.setid_linea(null);
				}	
				lineaAux.setcodigo(this.linea.getcodigo());	
				lineaAux.setnombre(this.linea.getnombre());	
				lineaAux.setdescripcion(this.linea.getdescripcion());	
				
				if(this.lineaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.lineaAux.getId()>=0) {	
						this.lineasEliminados.add(lineaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(lineaAux,lineaLogic.getLineas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(lineaAux,lineas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.lineaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.lineaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaLogic.saveLineas();//WithConnection
						//lineaLogic.getSetVersionRowLineas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.lineaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineaLogic.getPresupuestoLineas().addAll(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineasEliminados);
							this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineaLogic.getLineas().addAll(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineasEliminados);
							this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.getComisionGrupos().addAll(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongruposEliminados);
							this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventaLogic.getProductoPuntoVentas().addAll(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventasEliminados);
							this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.getComisionLineas().addAll(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineasEliminados);
							this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncateLogic.getComisionCates().addAll(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncatesEliminados);
							this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().addAll(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncomprasEliminados);
							this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoLogic.getCuentasContablesLineaProductos().addAll(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductosEliminados);
							this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precioLogic.getPrecios().addAll(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.preciosEliminados);
							this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaLogic.getLineaPuntoVentas().addAll(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventasEliminados);
							this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoLogic.getDetalleCodigoBarraProductos().addAll(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductosEliminados);
							this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.getPresupuestoVentasLineass().addAll(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineassEliminados);
							this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().addAll(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductosEliminados);
							this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.getComisionMarcas().addAll(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineas.addAll(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineasEliminados);
							this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineas.addAll(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineasEliminados);
							this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupos.addAll(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongruposEliminados);
							this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventas.addAll(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventasEliminados);
							this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineas.addAll(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineasEliminados);
							this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncates.addAll(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncatesEliminados);
							this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompras.addAll(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncomprasEliminados);
							this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductos.addAll(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductosEliminados);
							this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precios.addAll(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.preciosEliminados);
							this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventas.addAll(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventasEliminados);
							this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductos.addAll(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductosEliminados);
							this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineass.addAll(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineassEliminados);
							this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductos.addAll(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductosEliminados);
							this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcas.addAll(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.lineaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								lineaLogic.saveLineaRelaciones(lineaAux,this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineaLogic.getPresupuestoLineas(),this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineaLogic.getLineas(),this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.getComisionGrupos(),this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventaLogic.getProductoPuntoVentas(),this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.getComisionLineas(),this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncateLogic.getComisionCates(),this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.getDetallePlaneacionCompras(),this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoLogic.getCuentasContablesLineaProductos(),this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precioLogic.getPrecios(),this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaLogic.getLineaPuntoVentas(),this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoLogic.getDetalleCodigoBarraProductos(),this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.getPresupuestoVentasLineass(),this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos(),this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.getComisionMarcas());//WithConnection
								//lineaLogic.getSetVersionRowLineas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineaLogic.setPresupuestoLineas(new ArrayList<PresupuestoLinea>());
							this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineaLogic.setLineas(new ArrayList<Linea>());
							this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.setComisionGrupos(new ArrayList<ComisionGrupo>());
							this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventaLogic.setProductoPuntoVentas(new ArrayList<ProductoPuntoVenta>());
							this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.setComisionLineas(new ArrayList<ComisionLinea>());
							this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncateLogic.setComisionCates(new ArrayList<ComisionCate>());
							this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.setDetallePlaneacionCompras(new ArrayList<DetallePlaneacionCompra>());
							this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoLogic.setCuentasContablesLineaProductos(new ArrayList<CuentasContablesLineaProducto>());
							this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precioLogic.setPrecios(new ArrayList<Precio>());
							this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaLogic.setLineaPuntoVentas(new ArrayList<LineaPuntoVenta>());
							this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoLogic.setDetalleCodigoBarraProductos(new ArrayList<DetalleCodigoBarraProducto>());
							this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.setPresupuestoVentasLineass(new ArrayList<PresupuestoVentasLineas>());
							this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoLogic.setCentroCostoGrupoProductos(new ArrayList<CentroCostoGrupoProducto>());
							this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.setComisionMarcas(new ArrayList<ComisionMarca>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineas= new ArrayList<PresupuestoLinea>();
							this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineas= new ArrayList<Linea>();
							this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupos= new ArrayList<ComisionGrupo>();
							this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventas= new ArrayList<ProductoPuntoVenta>();
							this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineas= new ArrayList<ComisionLinea>();
							this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncates= new ArrayList<ComisionCate>();
							this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompras= new ArrayList<DetallePlaneacionCompra>();
							this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductos= new ArrayList<CuentasContablesLineaProducto>();
							this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precios= new ArrayList<Precio>();
							this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventas= new ArrayList<LineaPuntoVenta>();
							this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductos= new ArrayList<DetalleCodigoBarraProducto>();
							this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineass= new ArrayList<PresupuestoVentasLineas>();
							this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductos= new ArrayList<CentroCostoGrupoProducto>();
							this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcas= new ArrayList<ComisionMarca>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setPresupuestoLineas(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineaLogic.getPresupuestoLineas());

							if(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setLineas(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineaLogic.getLineas());

							if(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setComisionGrupoGrupos(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.getComisionGrupos());

							if(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setProductoPuntoVentas(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventaLogic.getProductoPuntoVentas());

							if(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setComisionLineas(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.getComisionLineas());

							if(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setComisionCates(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncateLogic.getComisionCates());

							if(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setDetallePlaneacionCompras(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.getDetallePlaneacionCompras());

							if(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setCuentasContablesLineaProductoCategorias(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoLogic.getCuentasContablesLineaProductos());

							if(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setPrecioGrupos(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precioLogic.getPrecios());

							if(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setLineaPuntoVentaMarcas(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaLogic.getLineaPuntoVentas());

							if(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setDetalleCodigoBarraProductoMarcas(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoLogic.getDetalleCodigoBarraProductos());

							if(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setPresupuestoVentasLineasMarcas(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.getPresupuestoVentasLineass());

							if(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setCentroCostoGrupoProductos(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());

							if(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setProductos(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();}
							lineaAux.setComisionMarcaGrupos(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.getComisionMarcas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.lineaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.lineaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(lineaAux,lineaLogic.getLineas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(lineaAux,lineas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.getLineas().addAll(this.lineasEliminados);
					
					lineaLogic.saveLineas();//WithConnection
					//lineaLogic.getSetVersionRowLineas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesLinea();
				
				this.lineasEliminados= new ArrayList<Linea>();		
			}
			
			if(this.lineaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
			//ACTUALIZA ARBOL
			this.getTodosLineaArbol();
			
			//TO_OPTIMIZE POR TIPO FK NO TODOS
			this.inicializarCombosForeignKeyLineaListas();
			
			this.cargarCombosForeignKeyLinea(false);
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Linea GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Linea",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.linea=lineaAux;
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
      		//this.finishProcessLinea();
      	}
		
	}	
	
	public void actualizarRelaciones(Linea lineaLocal) throws Exception {
		
		if(this.lineaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				lineaLocal.setPresupuestoLineas(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineaLogic.getPresupuestoLineas());
				lineaLocal.setLineas(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineaLogic.getLineas());
				lineaLocal.setComisionGrupoGrupos(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.getComisionGrupos());
				lineaLocal.setProductoPuntoVentas(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventaLogic.getProductoPuntoVentas());
				lineaLocal.setComisionLineas(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.getComisionLineas());
				lineaLocal.setComisionCates(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncateLogic.getComisionCates());
				lineaLocal.setDetallePlaneacionCompras(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
				lineaLocal.setCuentasContablesLineaProductoCategorias(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoLogic.getCuentasContablesLineaProductos());
				lineaLocal.setPrecioGrupos(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precioLogic.getPrecios());
				lineaLocal.setLineaPuntoVentaMarcas(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaLogic.getLineaPuntoVentas());
				lineaLocal.setDetalleCodigoBarraProductoMarcas(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoLogic.getDetalleCodigoBarraProductos());
				lineaLocal.setPresupuestoVentasLineasMarcas(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.getPresupuestoVentasLineass());
				lineaLocal.setCentroCostoGrupoProductos(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());
				lineaLocal.setProductos(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productoLogic.getProductos());
				lineaLocal.setComisionMarcaGrupos(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.getComisionMarcas());
			
			} else {
			
				lineaLocal.setPresupuestoLineas(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineas);
				lineaLocal.setLineas(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineas);
				lineaLocal.setComisionGrupoGrupos(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupos);
				lineaLocal.setProductoPuntoVentas(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventas);
				lineaLocal.setComisionLineas(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineas);
				lineaLocal.setComisionCates(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncates);
				lineaLocal.setDetallePlaneacionCompras(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompras);
				lineaLocal.setCuentasContablesLineaProductoCategorias(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductos);
				lineaLocal.setPrecioGrupos(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precios);
				lineaLocal.setLineaPuntoVentaMarcas(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventas);
				lineaLocal.setDetalleCodigoBarraProductoMarcas(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductos);
				lineaLocal.setPresupuestoVentasLineasMarcas(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineass);
				lineaLocal.setCentroCostoGrupoProductos(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductos);
				lineaLocal.setProductos(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productos);
				lineaLocal.setComisionMarcaGrupos(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Linea lineaLocal) throws Exception {	
		if(this.lineaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				lineaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(NivelLineaDetalleFormJInternalFrame.class)) {
				NivelLineaBeanSwingJInternalFrame nivellineaBeanSwingJInternalFrameLocal=(NivelLineaBeanSwingJInternalFrame) ((NivelLineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				nivellineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoNivelLinea(nivellineaBeanSwingJInternalFrameLocal.getnivellinea(),true);
				nivellineaBeanSwingJInternalFrameLocal.actualizarLista(nivellineaBeanSwingJInternalFrameLocal.nivellinea,this.nivellineasForeignKey);

				nivellineaBeanSwingJInternalFrameLocal.actualizarRelaciones(nivellineaBeanSwingJInternalFrameLocal.nivellinea);

				lineaLocal.setNivelLinea(nivellineaBeanSwingJInternalFrameLocal.nivellinea);

				this.addItemDefectoCombosForeignKeyNivelLinea();
				this.cargarCombosFrameNivelLineasForeignKey("Formulario");
				this.setActualNivelLineaForeignKey(nivellineaBeanSwingJInternalFrameLocal.nivellinea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				lineaLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarLineaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosLinea.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.linea =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.linea =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = lineaValidator.getInvalidValues(this.linea);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Linea linea,List<Linea> lineas) throws Exception {
		try	{		
			LineaConstantesFunciones.actualizarLista(linea,lineas,this.lineaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Linea linea,List<Linea> lineas) throws Exception {
		try	{			
			LineaConstantesFunciones.actualizarSelectedLista(linea,lineas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Linea> lineasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				lineasLocal=this.lineaLogic.getLineas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				lineasLocal=this.lineas;
			}
			//ARCHITECTURE
		
			for(Linea lineaLocal:lineasLocal) {
				if(this.permiteMantenimiento(lineaLocal) && lineaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+LineaConstantesFunciones.getLineaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(LineaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLinea.jLabelid_empresaLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LineaConstantesFunciones.IDNIVELLINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLinea.jLabelid_nivel_lineaLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LineaConstantesFunciones.IDLINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLinea.jLabelid_lineaLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LineaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLinea.jLabelcodigoLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LineaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLinea.jLabelnombreLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LineaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLinea.jLabeldescripcionLinea,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormLinea!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLinea.jLabelid_empresaLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLinea.jLabelid_nivel_lineaLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLinea.jLabelid_lineaLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLinea.jLabelcodigoLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLinea.jLabelnombreLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLinea.jLabeldescripcionLinea,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("PresupuestoLinea")) {
			if(this.linea==null) {
				this.linea= new Linea();
			}

			if(this.lineaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoLinea
				this.setVariablesFormularioToObjetoActualLinea(this.linea,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);

				this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.getpresupuestolinea().setLinea(this.linea);
			}

			return;
		}
		 else  if(sTipo.equals("Linea")) {
			if(this.linea==null) {
				this.linea= new Linea();
			}

			if(this.lineaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoLinea
				this.setVariablesFormularioToObjetoActualLinea(this.linea,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);

				this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.getlinea().setLinea(this.linea);
			}

			return;
		}
		 else  if(sTipo.equals("ComisionGrupo")) {
			if(this.linea==null) {
				this.linea= new Linea();
			}

			if(this.lineaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoLinea
				this.setVariablesFormularioToObjetoActualLinea(this.linea,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);

				this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.getcomisiongrupo().setLineaGrupo(this.linea);
			}

			return;
		}
		 else  if(sTipo.equals("ProductoPuntoVenta")) {
			if(this.linea==null) {
				this.linea= new Linea();
			}

			if(this.lineaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoLinea
				this.setVariablesFormularioToObjetoActualLinea(this.linea,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);

				this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.getproductopuntoventa().setLinea(this.linea);
			}

			return;
		}
		 else  if(sTipo.equals("ComisionLinea")) {
			if(this.linea==null) {
				this.linea= new Linea();
			}

			if(this.lineaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoLinea
				this.setVariablesFormularioToObjetoActualLinea(this.linea,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);

				this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.getcomisionlinea().setLinea(this.linea);
			}

			return;
		}
		 else  if(sTipo.equals("ComisionCate")) {
			if(this.linea==null) {
				this.linea= new Linea();
			}

			if(this.lineaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoLinea
				this.setVariablesFormularioToObjetoActualLinea(this.linea,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);

				this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.getcomisioncate().setLinea(this.linea);
			}

			return;
		}
		 else  if(sTipo.equals("DetallePlaneacionCompra")) {
			if(this.linea==null) {
				this.linea= new Linea();
			}

			if(this.lineaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoLinea
				this.setVariablesFormularioToObjetoActualLinea(this.linea,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);

				this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.getdetalleplaneacioncompra().setLinea(this.linea);
			}

			return;
		}
		 else  if(sTipo.equals("CuentasContablesLineaProducto")) {
			if(this.linea==null) {
				this.linea= new Linea();
			}

			if(this.lineaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoLinea
				this.setVariablesFormularioToObjetoActualLinea(this.linea,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);

				this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.getcuentascontableslineaproducto().setLineaCategoria(this.linea);
			}

			return;
		}
		 else  if(sTipo.equals("Precio")) {
			if(this.linea==null) {
				this.linea= new Linea();
			}

			if(this.lineaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoLinea
				this.setVariablesFormularioToObjetoActualLinea(this.linea,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);

				this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.getprecio().setLineaGrupo(this.linea);
			}

			return;
		}
		 else  if(sTipo.equals("LineaPuntoVenta")) {
			if(this.linea==null) {
				this.linea= new Linea();
			}

			if(this.lineaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoLinea
				this.setVariablesFormularioToObjetoActualLinea(this.linea,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);

				this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.getlineapuntoventa().setLineaMarca(this.linea);
			}

			return;
		}
		 else  if(sTipo.equals("DetalleCodigoBarraProducto")) {
			if(this.linea==null) {
				this.linea= new Linea();
			}

			if(this.lineaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoLinea
				this.setVariablesFormularioToObjetoActualLinea(this.linea,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);

				this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.getdetallecodigobarraproducto().setLineaMarca(this.linea);
			}

			return;
		}
		 else  if(sTipo.equals("PresupuestoVentasLineas")) {
			if(this.linea==null) {
				this.linea= new Linea();
			}

			if(this.lineaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoLinea
				this.setVariablesFormularioToObjetoActualLinea(this.linea,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);

				this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.getpresupuestoventaslineas().setLineaMarca(this.linea);
			}

			return;
		}
		 else  if(sTipo.equals("CentroCostoGrupoProducto")) {
			if(this.linea==null) {
				this.linea= new Linea();
			}

			if(this.lineaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoLinea
				this.setVariablesFormularioToObjetoActualLinea(this.linea,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);

				this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.getcentrocostogrupoproducto().setLinea(this.linea);
			}

			return;
		}
		 else  if(sTipo.equals("Producto")) {
			if(this.linea==null) {
				this.linea= new Linea();
			}

			if(this.lineaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoLinea
				this.setVariablesFormularioToObjetoActualLinea(this.linea,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);

				this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.getproducto().setLinea(this.linea);
			}

			return;
		}
		 else  if(sTipo.equals("ComisionMarca")) {
			if(this.linea==null) {
				this.linea= new Linea();
			}

			if(this.lineaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoLinea
				this.setVariablesFormularioToObjetoActualLinea(this.linea,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);

				this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.getcomisionmarca().setLineaGrupo(this.linea);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoLinea--;	
		
		
		this.lineaAux=new Linea();
		
		this.lineaAux.setId(this.iIdNuevoLinea);
		this.lineaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.lineaLogic.getLineas().add(this.lineaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.lineas.add(this.lineaAux);
		}
		//ARCHITECTURE
		
		this.linea=this.lineaAux;
		
		if(LineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioLinea(this.linea);
			this.setVariablesObjetoActualToFormularioForeignKeyLinea(this.linea);
		}
				
		//this.setDefaultControlesLinea();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyLinea();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyLinea();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyLinea();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualLinea(this.lineaBean,this.linea,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(LineaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.lineaSessionBean.getConGuardarRelaciones()) {
			classes=LineaConstantesFunciones.getClassesRelationshipsOfLinea(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.lineaReturnGeneral=lineaLogic.procesarEventosLineasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.lineaLogic.getLineas(),this.linea,this.lineaParameterGeneral,this.isEsNuevoLinea,classes);//this.lineaLogic.getLinea()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanLinea(this.lineaReturnGeneral,this.lineaBean,false);
		
		if(this.lineaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyLinea(this.lineaReturnGeneral.getLinea());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioLinea(this.lineaReturnGeneral.getLinea());
		}
		
		if(this.lineaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioLinea(this.lineaReturnGeneral.getLinea(),classes);//this.lineaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualLinea(this.linea,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyLinea();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyLinea();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			LineaBeanSwingJInternalFrameAdditional.RecargarFormLinea(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingLinea(false);
						
			if(lineaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineaSessionBean.getEsGuardarRelacionado() && PresupuestoLineaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPresupuestoLineaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineaSessionBean.getEsGuardarRelacionado() && LineaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonLineaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupoSessionBean.getEsGuardarRelacionado() && ComisionGrupoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonComisionGrupoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventaSessionBean.getEsGuardarRelacionado() && ProductoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoPuntoVentaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineaSessionBean.getEsGuardarRelacionado() && ComisionLineaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonComisionLineaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncateSessionBean.getEsGuardarRelacionado() && ComisionCateJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonComisionCateActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado() && DetallePlaneacionCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetallePlaneacionCompraActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado() && CuentasContablesLineaProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCuentasContablesLineaProductoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precioSessionBean.getEsGuardarRelacionado() && PrecioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPrecioActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaSessionBean.getEsGuardarRelacionado() && LineaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonLineaPuntoVentaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado() && DetalleCodigoBarraProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleCodigoBarraProductoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasSessionBean.getEsGuardarRelacionado() && PresupuestoVentasLineasJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPresupuestoVentasLineasActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado() && CentroCostoGrupoProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCentroCostoGrupoProductoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado() && ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcaSessionBean.getEsGuardarRelacionado() && ComisionMarcaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonComisionMarcaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(LineaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualLinea();
			}
			
			this.actualizarVisualTableDatosLinea();
			
			this.jTableDatosLinea.setRowSelectionInterval(this.getIndiceNuevoLinea(), this.getIndiceNuevoLinea());
			
			this.seleccionarFilaTablaLineaActual();
						
			this.actualizarEstadoCeldasBotonesLinea("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesLinea(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormLinea.jTextFieldcodigoLinea.setEnabled(isHabilitar && this.lineaConstantesFunciones.activarcodigoLinea);
		this.jInternalFrameDetalleFormLinea.jTextAreanombreLinea.setEnabled(isHabilitar && this.lineaConstantesFunciones.activarnombreLinea);
		this.jInternalFrameDetalleFormLinea.jTextAreadescripcionLinea.setEnabled(isHabilitar && this.lineaConstantesFunciones.activardescripcionLinea);	
		//
		this.jInternalFrameDetalleFormLinea.jComboBoxid_empresaLinea.setEnabled(isHabilitar && this.lineaConstantesFunciones.activarid_empresaLinea);
		this.jInternalFrameDetalleFormLinea.jComboBoxid_nivel_lineaLinea.setEnabled(isHabilitar && this.lineaConstantesFunciones.activarid_nivel_lineaLinea);
		this.jInternalFrameDetalleFormLinea.jComboBoxid_lineaLinea.setEnabled(isHabilitar && this.lineaConstantesFunciones.activarid_lineaLinea);
	};
	
	public void setDefaultControlesLinea() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoLinea(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.lineaSessionBean.setConGuardarRelaciones(true);			
			this.lineaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormLinea.jTabbedPaneRelacionesLinea.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncateSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precioSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.lineaSessionBean.setConGuardarRelaciones(false);			
			this.lineaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormLinea.jTabbedPaneRelacionesLinea.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncateSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precioSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoLinea() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Linea lineaAux:this.lineaLogic.getLineas()) {
				if(lineaAux.getId().equals(this.iIdNuevoLinea)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Linea lineaAux:this.lineas) {
				if(lineaAux.getId().equals(this.iIdNuevoLinea)) {
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
	
	public int getIndiceActualLinea(Linea linea,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Linea lineaAux:this.lineaLogic.getLineas()) {
				if(lineaAux.getId().equals(linea.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Linea lineaAux:this.lineas) {
				if(lineaAux.getId().equals(linea.getId())) {
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
	
	public void setCamposBaseDesdeOriginalLinea(Linea lineaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Linea lineaAux:this.lineaLogic.getLineas()) {
				if(lineaAux.getLineaOriginal().getId().equals(lineaOriginal.getId())) {
					existe=true;
					lineaOriginal.setId(lineaAux.getId());
					lineaOriginal.setVersionRow(lineaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Linea lineaAux:this.lineas) {
				if(lineaAux.getLineaOriginal().getId().equals(lineaOriginal.getId())) {
					existe=true;
					lineaOriginal.setId(lineaAux.getId());
					lineaOriginal.setVersionRow(lineaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosLinea(Boolean esParaCancelar) throws Exception {
		lineasAux=new ArrayList<Linea>();
		lineaAux=new Linea();
		
		if(!this.lineaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Linea lineaAux:this.lineaLogic.getLineas()) {
					if(lineaAux.getId()<0) {
						lineasAux.add(lineaAux);
					}		
				}
				this.iIdNuevoLinea=0L;
				this.lineaLogic.getLineas().removeAll(lineasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Linea lineaAux:this.lineas) {
					if(lineaAux.getId()<0) {
						lineasAux.add(lineaAux);
					}		
				}
				this.iIdNuevoLinea=0L;
				this.lineas.removeAll(lineasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoLinea 
					&& this.lineaLogic.getLineas().size()>0
					) {
					lineaAux=this.lineaLogic.getLineas().get(this.lineaLogic.getLineas().size() - 1);
				
					if(lineaAux.getId()<0) {
						this.lineaLogic.getLineas().remove(lineaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoLinea && this.lineas.size()>0) {
					lineaAux=this.lineas.get(this.lineas.size() - 1);
				
					if(lineaAux.getId()<0) {
						this.lineas.remove(lineaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoLinea(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(linea.getId()<0) {
				this.lineaLogic.getLineas().remove(this.linea);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(linea.getId()<0) {
				this.lineas.remove(this.linea);
			}
		}			
	}
	
	public void setEstadosInicialesLinea(List<Linea> lineasAux) throws Exception {
		LineaConstantesFunciones.setEstadosInicialesLinea(lineasAux);
	}
	
	public void setEstadosInicialesLinea(Linea lineaAux) throws Exception {
		LineaConstantesFunciones.setEstadosInicialesLinea(lineaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarLineaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarLineaActual()) {
				if(!this.isEsNuevoLinea) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoLinea=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarLineaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Linea ?", "MANTENIMIENTO DE Linea", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Linea linea) throws Exception {
		LineaConstantesFunciones.seleccionarAsignar(this.linea,linea);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarLinea=this.isPermisoActualizarOriginalLinea;
			
			
			this.seleccionarAsignar(linea);
			
			

			idLineaActual=linea.getid_linea();
			this.seleccionarLineaActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			LineaConstantesFunciones.quitarEspaciosLinea(this.linea,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesLinea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.lineaSessionBean.setsFuncionBusquedaRapida(this.lineaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarLineaActual() throws Exception {
		try	{
			Linea lineaAux=new Linea();

			if(this.idLineaActual != null && this.idLineaActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(this.idLineaActual);
					lineaAux= lineaLogic.getLinea();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				lineasForeignKey=new ArrayList<Linea>();
				lineasForeignKey.add(lineaAux);
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
			if(this.isEsNuevoLinea) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosLinea(esParaCancelar);				
				this.cancelarNuevoLinea(esParaCancelar);								
			}
			
			this.linea=new Linea();
			
			this.inicializarLinea();
			
			this.actualizarEstadoCeldasBotonesLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarLinea() throws Exception {
		try {
			LineaConstantesFunciones.inicializarLinea(this.linea);
			
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
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.lineaLogic.getLineas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteLineas(String sAccionBusqueda,List<Linea> lineasParaReportes) throws Exception {
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
					sPathReporteFinal="Linea"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="LineaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("LineaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Linea"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Lineas");		
		parameters.put("busquedapor", LineaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(PresupuestoLinea.class));
			classes.add(new Classe(Linea.class));
			classes.add(new Classe(ComisionGrupo.class));
			classes.add(new Classe(ProductoPuntoVenta.class));
			classes.add(new Classe(ComisionLinea.class));
			classes.add(new Classe(ComisionCate.class));
			classes.add(new Classe(DetallePlaneacionCompra.class));
			classes.add(new Classe(CuentasContablesLineaProducto.class));
			classes.add(new Classe(Precio.class));
			classes.add(new Classe(LineaPuntoVenta.class));
			classes.add(new Classe(DetalleCodigoBarraProducto.class));
			classes.add(new Classe(PresupuestoVentasLineas.class));
			classes.add(new Classe(CentroCostoGrupoProducto.class));
			classes.add(new Classe(Producto.class));
			classes.add(new Classe(ComisionMarca.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					LineaLogic lineaLogicAuxiliar=new LineaLogic();
					lineaLogicAuxiliar.setDatosCliente(lineaLogic.getDatosCliente());				
					lineaLogicAuxiliar.setLineas(lineasParaReportes);
					
					lineaLogicAuxiliar.cargarRelacionesLoteForeignKeyLineaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					lineasParaReportes=lineaLogicAuxiliar.getLineas();
					
					//lineaLogic.getNewConnexionToDeep();
					
					//for (Linea linea:lineasParaReportes) {
					//	lineaLogic.deepLoad(linea, false, DeepLoadType.INCLUDE, classes);
					//}						
					//lineaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//lineaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFilePresupuestoLinea = AuxiliarReportes.class.getResourceAsStream("PresupuestoLineaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_presupuestolinea", reportFilePresupuestoLinea);

			InputStream reportFileLinea = AuxiliarReportes.class.getResourceAsStream("LineaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_linea", reportFileLinea);

			InputStream reportFileComisionGrupo = AuxiliarReportes.class.getResourceAsStream("ComisionGrupoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_comisiongrupo", reportFileComisionGrupo);

			InputStream reportFileProductoPuntoVenta = AuxiliarReportes.class.getResourceAsStream("ProductoPuntoVentaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_productopuntoventa", reportFileProductoPuntoVenta);

			InputStream reportFileComisionLinea = AuxiliarReportes.class.getResourceAsStream("ComisionLineaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_comisionlinea", reportFileComisionLinea);

			InputStream reportFileComisionCate = AuxiliarReportes.class.getResourceAsStream("ComisionCateDetalleRelacionesDesign.jasper");
			parameters.put("subreport_comisioncate", reportFileComisionCate);

			InputStream reportFileDetallePlaneacionCompra = AuxiliarReportes.class.getResourceAsStream("DetallePlaneacionCompraDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleplaneacioncompra", reportFileDetallePlaneacionCompra);

			InputStream reportFileCuentasContablesLineaProducto = AuxiliarReportes.class.getResourceAsStream("CuentasContablesLineaProductoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cuentascontableslineaproducto", reportFileCuentasContablesLineaProducto);

			InputStream reportFilePrecio = AuxiliarReportes.class.getResourceAsStream("PrecioDetalleRelacionesDesign.jasper");
			parameters.put("subreport_precio", reportFilePrecio);

			InputStream reportFileLineaPuntoVenta = AuxiliarReportes.class.getResourceAsStream("LineaPuntoVentaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_lineapuntoventa", reportFileLineaPuntoVenta);

			InputStream reportFileDetalleCodigoBarraProducto = AuxiliarReportes.class.getResourceAsStream("DetalleCodigoBarraProductoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detallecodigobarraproducto", reportFileDetalleCodigoBarraProducto);

			InputStream reportFilePresupuestoVentasLineas = AuxiliarReportes.class.getResourceAsStream("PresupuestoVentasLineasDetalleRelacionesDesign.jasper");
			parameters.put("subreport_presupuestoventaslineas", reportFilePresupuestoVentasLineas);

			InputStream reportFileCentroCostoGrupoProducto = AuxiliarReportes.class.getResourceAsStream("CentroCostoGrupoProductoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_centrocostogrupoproducto", reportFileCentroCostoGrupoProducto);

			InputStream reportFileProducto = AuxiliarReportes.class.getResourceAsStream("ProductoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_producto", reportFileProducto);

			InputStream reportFileComisionMarca = AuxiliarReportes.class.getResourceAsStream("ComisionMarcaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_comisionmarca", reportFileComisionMarca);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceLinea=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			LineaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			LineaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceLinea=new JRBeanArrayDataSource(LineaJInternalFrame.TraerLineaBeans(lineasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceLinea);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+LineaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+LineaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(LineaBean.TraerLineaBeans(lineasParaReportes).toArray()));
							
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
				this.generarExcelReporteLineas(sAccionBusqueda,sTipoArchivoReporte,lineasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalLineas(sAccionBusqueda,sTipoArchivoReporte,lineasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoLineaActionPerformed(null);
					//this.generarExcelReporteLineas(sAccionBusqueda,sTipoArchivoReporte,lineasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalLineas(sAccionBusqueda,sTipoArchivoReporte,lineasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesLineas(sAccionBusqueda,sTipoArchivoReporte,lineasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesLineas(sAccionBusqueda,sTipoArchivoReporte,lineasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteLineas(String sAccionBusqueda,String sTipoArchivoReporte,List<Linea> lineasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"linea";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Lineas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderLinea("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Linea linea : lineasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			LineaConstantesFunciones.generarExcelReporteDataLinea("NORMAL",row,workbook,linea,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderLinea(String sTipo,Row row,Workbook workbook) {
		
		LineaConstantesFunciones.generarExcelReporteHeaderLinea(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalLineas(String sAccionBusqueda,String sTipoArchivoReporte,List<Linea> lineasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"linea_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Lineas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Linea linea : lineasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(LineaConstantesFunciones.getLineaDescripcion(linea));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LineaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LineaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(linea.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LineaConstantesFunciones.LABEL_IDNIVELLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LineaConstantesFunciones.LABEL_IDNIVELLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(linea.getnivellinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LineaConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LineaConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(linea.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LineaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LineaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(linea.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LineaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LineaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(linea.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LineaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LineaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(linea.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesLineas(String sAccionBusqueda,String sTipoArchivoReporte,List<Linea> lineasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Linea> lineasRespaldo=null;
		
		classes=LineaConstantesFunciones.getClassesRelationshipsOfLinea(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.lineaLogic.setDatosCliente(this.datosCliente);
		this.lineaLogic.setDatosDeep(this.datosDeep);
		this.lineaLogic.setIsConDeep(true);
		
		lineasRespaldo=this.lineaLogic.getLineas();
		
		this.lineaLogic.setLineas(lineasParaReportes);	
		this.lineaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		lineasParaReportes=this.lineaLogic.getLineas();
		this.lineaLogic.setLineas(lineasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"linea_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Lineas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderLinea("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Linea linea : lineasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderLinea("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			LineaConstantesFunciones.generarExcelReporteDataLinea("NORMAL",row,workbook,linea,cellStyleDataAux);
		
			
			


				//PresupuestoLinea
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO))) {

				if(linea.getPresupuestoLineas()!=null && linea.getPresupuestoLineas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PresupuestoLineaConstantesFunciones.generarExcelReporteHeaderPresupuestoLinea("RELACIONADO",row,workbook);
				}

				if(linea.getPresupuestoLineas()!=null) {
					i2=0;
					for(PresupuestoLinea presupuestolinea : linea.getPresupuestoLineas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PresupuestoLineaConstantesFunciones.generarExcelReporteDataPresupuestoLinea("RELACIONADO",row,workbook,presupuestolinea,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Linea
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(LineaConstantesFunciones.SCLASSWEBTITULO))) {

				if(linea.getLineas()!=null && linea.getLineas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(LineaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					LineaConstantesFunciones.generarExcelReporteHeaderLinea("RELACIONADO",row,workbook);
				}

				if(linea.getLineas()!=null) {
					i2=0;
					for(Linea lineaAutoRef : linea.getLineas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						LineaConstantesFunciones.generarExcelReporteDataLinea("RELACIONADO",row,workbook,lineaAutoRef,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ComisionGrupo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ComisionGrupoConstantesFunciones.SCLASSWEBTITULO))) {

				if(linea.getComisionGrupoGrupos()!=null && linea.getComisionGrupoGrupos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ComisionGrupoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ComisionGrupoConstantesFunciones.generarExcelReporteHeaderComisionGrupo("RELACIONADO",row,workbook);
				}

				if(linea.getComisionGrupoGrupos()!=null) {
					i2=0;
					for(ComisionGrupo comisiongrupo : linea.getComisionGrupoGrupos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ComisionGrupoConstantesFunciones.generarExcelReporteDataComisionGrupo("RELACIONADO",row,workbook,comisiongrupo,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ProductoPuntoVenta
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO))) {

				if(linea.getProductoPuntoVentas()!=null && linea.getProductoPuntoVentas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoPuntoVentaConstantesFunciones.generarExcelReporteHeaderProductoPuntoVenta("RELACIONADO",row,workbook);
				}

				if(linea.getProductoPuntoVentas()!=null) {
					i2=0;
					for(ProductoPuntoVenta productopuntoventa : linea.getProductoPuntoVentas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ProductoPuntoVentaConstantesFunciones.generarExcelReporteDataProductoPuntoVenta("RELACIONADO",row,workbook,productopuntoventa,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ComisionLinea
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ComisionLineaConstantesFunciones.SCLASSWEBTITULO))) {

				if(linea.getComisionLineas()!=null && linea.getComisionLineas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ComisionLineaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ComisionLineaConstantesFunciones.generarExcelReporteHeaderComisionLinea("RELACIONADO",row,workbook);
				}

				if(linea.getComisionLineas()!=null) {
					i2=0;
					for(ComisionLinea comisionlinea : linea.getComisionLineas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ComisionLineaConstantesFunciones.generarExcelReporteDataComisionLinea("RELACIONADO",row,workbook,comisionlinea,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ComisionCate
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ComisionCateConstantesFunciones.SCLASSWEBTITULO))) {

				if(linea.getComisionCates()!=null && linea.getComisionCates().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ComisionCateConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ComisionCateConstantesFunciones.generarExcelReporteHeaderComisionCate("RELACIONADO",row,workbook);
				}

				if(linea.getComisionCates()!=null) {
					i2=0;
					for(ComisionCate comisioncate : linea.getComisionCates()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ComisionCateConstantesFunciones.generarExcelReporteDataComisionCate("RELACIONADO",row,workbook,comisioncate,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//DetallePlaneacionCompra
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO))) {

				if(linea.getDetallePlaneacionCompras()!=null && linea.getDetallePlaneacionCompras().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetallePlaneacionCompraConstantesFunciones.generarExcelReporteHeaderDetallePlaneacionCompra("RELACIONADO",row,workbook);
				}

				if(linea.getDetallePlaneacionCompras()!=null) {
					i2=0;
					for(DetallePlaneacionCompra detalleplaneacioncompra : linea.getDetallePlaneacionCompras()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetallePlaneacionCompraConstantesFunciones.generarExcelReporteDataDetallePlaneacionCompra("RELACIONADO",row,workbook,detalleplaneacioncompra,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//CuentasContablesLineaProducto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO))) {

				if(linea.getCuentasContablesLineaProductoCategorias()!=null && linea.getCuentasContablesLineaProductoCategorias().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CuentasContablesLineaProductoConstantesFunciones.generarExcelReporteHeaderCuentasContablesLineaProducto("RELACIONADO",row,workbook);
				}

				if(linea.getCuentasContablesLineaProductoCategorias()!=null) {
					i2=0;
					for(CuentasContablesLineaProducto cuentascontableslineaproducto : linea.getCuentasContablesLineaProductoCategorias()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CuentasContablesLineaProductoConstantesFunciones.generarExcelReporteDataCuentasContablesLineaProducto("RELACIONADO",row,workbook,cuentascontableslineaproducto,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Precio
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PrecioConstantesFunciones.SCLASSWEBTITULO))) {

				if(linea.getPrecioGrupos()!=null && linea.getPrecioGrupos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PrecioConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PrecioConstantesFunciones.generarExcelReporteHeaderPrecio("RELACIONADO",row,workbook);
				}

				if(linea.getPrecioGrupos()!=null) {
					i2=0;
					for(Precio precio : linea.getPrecioGrupos()) {
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


				//LineaPuntoVenta
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO))) {

				if(linea.getLineaPuntoVentaMarcas()!=null && linea.getLineaPuntoVentaMarcas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					LineaPuntoVentaConstantesFunciones.generarExcelReporteHeaderLineaPuntoVenta("RELACIONADO",row,workbook);
				}

				if(linea.getLineaPuntoVentaMarcas()!=null) {
					i2=0;
					for(LineaPuntoVenta lineapuntoventa : linea.getLineaPuntoVentaMarcas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						LineaPuntoVentaConstantesFunciones.generarExcelReporteDataLineaPuntoVenta("RELACIONADO",row,workbook,lineapuntoventa,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//DetalleCodigoBarraProducto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO))) {

				if(linea.getDetalleCodigoBarraProductoMarcas()!=null && linea.getDetalleCodigoBarraProductoMarcas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleCodigoBarraProductoConstantesFunciones.generarExcelReporteHeaderDetalleCodigoBarraProducto("RELACIONADO",row,workbook);
				}

				if(linea.getDetalleCodigoBarraProductoMarcas()!=null) {
					i2=0;
					for(DetalleCodigoBarraProducto detallecodigobarraproducto : linea.getDetalleCodigoBarraProductoMarcas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleCodigoBarraProductoConstantesFunciones.generarExcelReporteDataDetalleCodigoBarraProducto("RELACIONADO",row,workbook,detallecodigobarraproducto,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//PresupuestoVentasLineas
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO))) {

				if(linea.getPresupuestoVentasLineasMarcas()!=null && linea.getPresupuestoVentasLineasMarcas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PresupuestoVentasLineasConstantesFunciones.generarExcelReporteHeaderPresupuestoVentasLineas("RELACIONADO",row,workbook);
				}

				if(linea.getPresupuestoVentasLineasMarcas()!=null) {
					i2=0;
					for(PresupuestoVentasLineas presupuestoventaslineas : linea.getPresupuestoVentasLineasMarcas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PresupuestoVentasLineasConstantesFunciones.generarExcelReporteDataPresupuestoVentasLineas("RELACIONADO",row,workbook,presupuestoventaslineas,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//CentroCostoGrupoProducto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO))) {

				if(linea.getCentroCostoGrupoProductos()!=null && linea.getCentroCostoGrupoProductos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CentroCostoGrupoProductoConstantesFunciones.generarExcelReporteHeaderCentroCostoGrupoProducto("RELACIONADO",row,workbook);
				}

				if(linea.getCentroCostoGrupoProductos()!=null) {
					i2=0;
					for(CentroCostoGrupoProducto centrocostogrupoproducto : linea.getCentroCostoGrupoProductos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CentroCostoGrupoProductoConstantesFunciones.generarExcelReporteDataCentroCostoGrupoProducto("RELACIONADO",row,workbook,centrocostogrupoproducto,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Producto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoConstantesFunciones.SCLASSWEBTITULO))) {

				if(linea.getProductos()!=null && linea.getProductos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoConstantesFunciones.generarExcelReporteHeaderProducto("RELACIONADO",row,workbook);
				}

				if(linea.getProductos()!=null) {
					i2=0;
					for(Producto producto : linea.getProductos()) {
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


				//ComisionMarca
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ComisionMarcaConstantesFunciones.SCLASSWEBTITULO))) {

				if(linea.getComisionMarcaGrupos()!=null && linea.getComisionMarcaGrupos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ComisionMarcaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ComisionMarcaConstantesFunciones.generarExcelReporteHeaderComisionMarca("RELACIONADO",row,workbook);
				}

				if(linea.getComisionMarcaGrupos()!=null) {
					i2=0;
					for(ComisionMarca comisionmarca : linea.getComisionMarcaGrupos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ComisionMarcaConstantesFunciones.generarExcelReporteDataComisionMarca("RELACIONADO",row,workbook,comisionmarca,cellStyleDataAuxHijo);
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
		cell.setCellValue(LineaConstantesFunciones.getLineaDescripcion(linea));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoLinea.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLinea.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoLinea.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLinea.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessLinea() throws Exception {		
		this.startProcessLinea(true);
	}
	
	public void startProcessLinea(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasLinea ,this.jPanelParametrosReportesLinea, this.jScrollPanelDatosLinea,this.jPanelPaginacionLinea, this.jScrollPanelDatosEdicionLinea, this.jPanelAccionesLinea,this.jPanelAccionesFormularioLinea,this.jmenuBarLinea,this.jmenuBarDetalleLinea,this.jTtoolBarLinea,this.jTtoolBarDetalleLinea);		
		
		final JTabbedPane jTabbedPaneBusquedasLinea=this.jTabbedPaneBusquedasLinea; 
		
		final JPanel jPanelParametrosReportesLinea=this.jPanelParametrosReportesLinea;
		//final JScrollPane jScrollPanelDatosLinea=this.jScrollPanelDatosLinea;
		final JTable jTableDatosLinea=this.jTableDatosLinea;		
		final JPanel jPanelPaginacionLinea=this.jPanelPaginacionLinea;
		//final JScrollPane jScrollPanelDatosEdicionLinea=this.jScrollPanelDatosEdicionLinea;
		final JPanel jPanelAccionesLinea=this.jPanelAccionesLinea;
		
		JPanel jPanelCamposAuxiliarLinea=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarLinea=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormLinea!=null) {
			jPanelCamposAuxiliarLinea=this.jInternalFrameDetalleFormLinea.jPanelCamposLinea;
			jPanelAccionesFormularioAuxiliarLinea=this.jInternalFrameDetalleFormLinea.jPanelAccionesFormularioLinea;
		}
		
		final JPanel jPanelCamposLinea=jPanelCamposAuxiliarLinea;
		final JPanel jPanelAccionesFormularioLinea=jPanelAccionesFormularioAuxiliarLinea;
		
		
		final JMenuBar jmenuBarLinea=this.jmenuBarLinea;
		final JToolBar jTtoolBarLinea=this.jTtoolBarLinea;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarLinea=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarLinea=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormLinea!=null) {
			jmenuBarDetalleAuxiliarLinea=this.jInternalFrameDetalleFormLinea.jmenuBarDetalleLinea;
			jTtoolBarDetalleAuxiliarLinea=this.jInternalFrameDetalleFormLinea.jTtoolBarDetalleLinea;
		}
		
		final JMenuBar jmenuBarDetalleLinea=jmenuBarDetalleAuxiliarLinea;
		final JToolBar jTtoolBarDetalleLinea=jTtoolBarDetalleAuxiliarLinea;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasLinea;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesLinea;
			processRunnable.jTableDatos=jTableDatosLinea;
			processRunnable.jPanelCampos=jPanelCamposLinea;
			processRunnable.jPanelPaginacion=jPanelPaginacionLinea;
			processRunnable.jPanelAcciones=jPanelAccionesLinea;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioLinea;
			
			
			processRunnable.jmenuBar=jmenuBarLinea;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleLinea;
			processRunnable.jTtoolBar=jTtoolBarLinea;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleLinea;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasLinea ,jPanelParametrosReportesLinea,jTableDatosLinea, /*jScrollPanelDatosLinea,*/jPanelCamposLinea,jPanelPaginacionLinea, /*jScrollPanelDatosEdicionLinea,*/ jPanelAccionesLinea,jPanelAccionesFormularioLinea,jmenuBarLinea,jmenuBarDetalleLinea,jTtoolBarLinea,jTtoolBarDetalleLinea);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasLinea ,jPanelParametrosReportesLinea, jScrollPanelDatosLinea,jPanelPaginacionLinea, jScrollPanelDatosEdicionLinea, jPanelAccionesLinea,jPanelAccionesFormularioLinea,jmenuBarLinea,jmenuBarDetalleLinea,jTtoolBarLinea,jTtoolBarDetalleLinea);
						
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
	
	public void finishProcessLinea() {// throws Exception 
		this.finishProcessLinea(true);
	}
	
	public void finishProcessLinea(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasLinea ,this.jPanelParametrosReportesLinea, this.jScrollPanelDatosLinea,this.jPanelPaginacionLinea, this.jScrollPanelDatosEdicionLinea, this.jPanelAccionesLinea,this.jPanelAccionesFormularioLinea,this.jmenuBarLinea,this.jmenuBarDetalleLinea,this.jTtoolBarLinea,this.jTtoolBarDetalleLinea);		
		
		final JTabbedPane jTabbedPaneBusquedasLinea=this.jTabbedPaneBusquedasLinea; 
		
		final JPanel jPanelParametrosReportesLinea=this.jPanelParametrosReportesLinea;
		//final JScrollPane jScrollPanelDatosLinea=this.jScrollPanelDatosLinea;
		final JTable jTableDatosLinea=this.jTableDatosLinea;		
		final JPanel jPanelPaginacionLinea=this.jPanelPaginacionLinea;
		//final JScrollPane jScrollPanelDatosEdicionLinea=this.jScrollPanelDatosEdicionLinea;
		final JPanel jPanelAccionesLinea=this.jPanelAccionesLinea;
		
		JPanel jPanelCamposAuxiliarLinea=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarLinea=new JPanel();
		
		if(this.jInternalFrameDetalleFormLinea!=null) {
			jPanelCamposAuxiliarLinea=this.jInternalFrameDetalleFormLinea.jPanelCamposLinea;
			jPanelAccionesFormularioAuxiliarLinea=this.jInternalFrameDetalleFormLinea.jPanelAccionesFormularioLinea;
		}
		
		final JPanel jPanelCamposLinea=jPanelCamposAuxiliarLinea;
		final JPanel jPanelAccionesFormularioLinea=jPanelAccionesFormularioAuxiliarLinea;
		
		
		final JMenuBar jmenuBarLinea=this.jmenuBarLinea;		
		final JToolBar jTtoolBarLinea=this.jTtoolBarLinea;
				
		JMenuBar jmenuBarDetalleAuxiliarLinea=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarLinea=new JToolBar();
		
		if(this.jInternalFrameDetalleFormLinea!=null) {
			jmenuBarDetalleAuxiliarLinea=this.jInternalFrameDetalleFormLinea.jmenuBarDetalleLinea;
			jTtoolBarDetalleAuxiliarLinea=this.jInternalFrameDetalleFormLinea.jTtoolBarDetalleLinea;		
		}
		
		final JMenuBar jmenuBarDetalleLinea=jmenuBarDetalleAuxiliarLinea;
		final JToolBar jTtoolBarDetalleLinea=jTtoolBarDetalleAuxiliarLinea;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasLinea;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesLinea;
			processRunnable.jTableDatos=jTableDatosLinea;
			processRunnable.jPanelCampos=jPanelCamposLinea;
			processRunnable.jPanelPaginacion=jPanelPaginacionLinea;
			processRunnable.jPanelAcciones=jPanelAccionesLinea;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioLinea;
			
			
			processRunnable.jmenuBar=jmenuBarLinea;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleLinea;
			processRunnable.jTtoolBar=jTtoolBarLinea;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleLinea;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasLinea ,jPanelParametrosReportesLinea, jTableDatosLinea,/*jScrollPanelDatosLinea,*/jPanelCamposLinea,jPanelPaginacionLinea, /*jScrollPanelDatosEdicionLinea,*/ jPanelAccionesLinea,jPanelAccionesFormularioLinea,jmenuBarLinea,jmenuBarDetalleLinea,jTtoolBarLinea,jTtoolBarDetalleLinea));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesLinea(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarLinea(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuLinea(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarLinea(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarLinea,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleLinea,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuLinea(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarLinea,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleLinea,esHabilitar,1,1);
		}
	}
	*/
	
	
	public void getTodosLineaArbol() throws Exception {	
		ArrayList<String> arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral);
		
		String  finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);
		
		this.pagination=new Pagination();
		
		this.pagination.setiFirstResult(-1);
		this.pagination.setiMaxResults(-1);
		
		this.cargarDatosCliente();
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			lineaLogic.getTodosLineas(finalQueryGlobal+"",this.pagination);//WithConnection
			this.lineasArbol=lineaLogic.getLineas();
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
	}
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.lineaConstantesFunciones.getsFinalQueryLinea();
		String  finalQueryPaginacionTodos=this.lineaConstantesFunciones.getsFinalQueryLinea();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=LineaConstantesFunciones.getArrayColumnasGlobalesNoLinea(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.lineasEliminados= new ArrayList<Linea>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessLinea();
		
				///*LineaSessionBean*/this.lineaSessionBean=new LineaSessionBean();
			
			if(this.lineaSessionBean==null) {
				this.lineaSessionBean=new LineaSessionBean();
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
					this.iNumeroPaginacion=LineaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=LineaConstantesFunciones.getClassesForeignKeysOfLinea(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/linea."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			lineasAux= new ArrayList<Linea>();
			
				
			lineaLogic.setDatosCliente(this.datosCliente);
			lineaLogic.setDatosDeep(this.datosDeep);
			lineaLogic.setIsConDeep(true);
			
			
			lineaLogic.getLineaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					lineaLogic.getTodosLineas(finalQueryGlobal,pagination);
					
					//lineaLogic.getTodosLineasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(lineaLogic.getLineas()==null|| lineaLogic.getLineas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							lineasAux= new ArrayList<Linea>();
							lineasAux.addAll(lineaLogic.getLineas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineasAux= new ArrayList<Linea>();
							lineasAux.addAll(lineas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							lineaLogic.getTodosLineas(finalQueryGlobal+"",this.pagination);												
							
							//lineaLogic.getTodosLineasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteLineas("Todos",lineaLogic.getLineas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							lineaLogic.setLineas(new ArrayList<Linea>());					
							lineaLogic.getLineas().addAll(lineasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineas=new ArrayList<Linea>();
							lineas.addAll(lineasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idLinea=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idLinea=this.idActual;
				
				} else if(this.idLineaActual!=null && this.idLineaActual!=0L) {
					idLinea=idLineaActual;
				}
				
					
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndicePorId(idLinea);
				
				this.lineas=new ArrayList<Linea>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					lineaLogic.getEntity(idLinea);
					
					//lineaLogic.getEntityWithConnection(idLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.setLineas(new ArrayList<Linea>());
					lineaLogic.getLineas().add(lineaLogic.getLinea());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.lineas=new ArrayList<Linea>();
					this.lineas.add(linea);
				}
				
				if(lineaLogic.getLinea()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					lineaLogic.getLineasBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=lineaLogic.getLineas()==null||lineaLogic.getLineas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=lineas==null|| lineas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						lineasAux=new ArrayList<Linea>();
						lineasAux.addAll(lineaLogic.getLineas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineasAux=new ArrayList<Linea>();
							lineasAux.addAll(lineas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							lineaLogic.getLineasBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLineas("BusquedaPorCodigo",lineaLogic.getLineas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLineas("BusquedaPorCodigo",lineas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaLogic.setLineas(new ArrayList<Linea>());
						lineaLogic.getLineas().addAll(lineasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineas=new ArrayList<Linea>();
							lineas.addAll(lineasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					lineaLogic.getLineasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=lineaLogic.getLineas()==null||lineaLogic.getLineas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=lineas==null|| lineas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						lineasAux=new ArrayList<Linea>();
						lineasAux.addAll(lineaLogic.getLineas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineasAux=new ArrayList<Linea>();
							lineasAux.addAll(lineas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							lineaLogic.getLineasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLineas("BusquedaPorNombre",lineaLogic.getLineas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLineas("BusquedaPorNombre",lineas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaLogic.setLineas(new ArrayList<Linea>());
						lineaLogic.getLineas().addAll(lineasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineas=new ArrayList<Linea>();
							lineas.addAll(lineasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					lineaLogic.getLineasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=lineaLogic.getLineas()==null||lineaLogic.getLineas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=lineas==null|| lineas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						lineasAux=new ArrayList<Linea>();
						lineasAux.addAll(lineaLogic.getLineas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineasAux=new ArrayList<Linea>();
							lineasAux.addAll(lineas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							lineaLogic.getLineasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLineas("FK_IdEmpresa",lineaLogic.getLineas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLineas("FK_IdEmpresa",lineas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaLogic.setLineas(new ArrayList<Linea>());
						lineaLogic.getLineas().addAll(lineasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineas=new ArrayList<Linea>();
							lineas.addAll(lineasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdLinea")) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					lineaLogic.getLineasFK_IdLinea(finalQueryGlobal,pagination,id_lineaFK_IdLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=lineaLogic.getLineas()==null||lineaLogic.getLineas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=lineas==null|| lineas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						lineasAux=new ArrayList<Linea>();
						lineasAux.addAll(lineaLogic.getLineas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineasAux=new ArrayList<Linea>();
							lineasAux.addAll(lineas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							lineaLogic.getLineasFK_IdLinea(finalQueryGlobal,pagination,id_lineaFK_IdLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLineas("FK_IdLinea",lineaLogic.getLineas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLineas("FK_IdLinea",lineas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaLogic.setLineas(new ArrayList<Linea>());
						lineaLogic.getLineas().addAll(lineasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineas=new ArrayList<Linea>();
							lineas.addAll(lineasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdNivelLinea")) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceFK_IdNivelLinea(id_nivel_lineaFK_IdNivelLinea);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					lineaLogic.getLineasFK_IdNivelLinea(finalQueryGlobal,pagination,id_nivel_lineaFK_IdNivelLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceFK_IdNivelLinea(id_nivel_lineaFK_IdNivelLinea);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceFK_IdNivelLinea(id_nivel_lineaFK_IdNivelLinea);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=lineaLogic.getLineas()==null||lineaLogic.getLineas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=lineas==null|| lineas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						lineasAux=new ArrayList<Linea>();
						lineasAux.addAll(lineaLogic.getLineas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineasAux=new ArrayList<Linea>();
							lineasAux.addAll(lineas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							lineaLogic.getLineasFK_IdNivelLinea(finalQueryGlobal,pagination,id_nivel_lineaFK_IdNivelLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceFK_IdNivelLinea(id_nivel_lineaFK_IdNivelLinea);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaConstantesFunciones.getDetalleIndiceFK_IdNivelLinea(id_nivel_lineaFK_IdNivelLinea);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLineas("FK_IdNivelLinea",lineaLogic.getLineas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLineas("FK_IdNivelLinea",lineas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaLogic.setLineas(new ArrayList<Linea>());
						lineaLogic.getLineas().addAll(lineasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineas=new ArrayList<Linea>();
							lineas.addAll(lineasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesLinea();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessLinea();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=lineaLogic.getLineas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=lineas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=lineaLogic.getLineas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=lineas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Linea linea) {
		Boolean permite=true;
		
		if(this.linea.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=LineaConstantesFunciones.getOrderByListaLinea();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=LineaConstantesFunciones.getOrderByListaLinea();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Linea linea:lineaLogic.getLineas()) {
				if(linea.getsType().equals(Constantes2.S_TOTALES)) {
					lineaTotales=linea;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Linea linea:this.lineas) {
				if(linea.getsType().equals(Constantes2.S_TOTALES)) {
					lineaTotales=linea;
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
			this.lineaAux=new Linea();
			this.lineaAux.setsType(Constantes2.S_TOTALES);
			this.lineaAux.setIsNew(false);
			this.lineaAux.setIsChanged(false);
			this.lineaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				LineaConstantesFunciones.TotalizarValoresFilaLinea(this.lineaLogic.getLineas(),this.lineaAux);
				
				this.lineaLogic.getLineas().add(this.lineaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				LineaConstantesFunciones.TotalizarValoresFilaLinea(this.lineas,this.lineaAux);
				
				this.lineas.add(this.lineaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		lineaTotales=new Linea();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.lineaLogic.getLineas().remove(lineaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.lineas.remove(lineaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		lineaTotales=new Linea();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Linea linea:lineaLogic.getLineas()) {
				if(linea.getsType().equals(Constantes2.S_TOTALES)) {
					lineaTotales=linea;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				LineaConstantesFunciones.TotalizarValoresFilaLinea(this.lineaLogic.getLineas(),lineaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Linea linea:this.lineas) {
				if(linea.getsType().equals(Constantes2.S_TOTALES)) {
					lineaTotales=linea;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				LineaConstantesFunciones.TotalizarValoresFilaLinea(this.lineas,lineaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getLineasBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLineasBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLineasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLineasFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLineasFK_IdNivelLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdNivelLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getLineasBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getLineasBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLineasBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getLineasBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLineasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getLineasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLineasFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getLineasFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLineasFK_IdNivelLinea(String sFinalQuery,Long id_nivel_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getLineasFK_IdNivelLinea(sFinalQuery,this.pagination,id_nivel_linea);
				
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
	
	public void inicializarPermisosLinea() {
		this.isPermisoTodoLinea=false;
		this.isPermisoNuevoLinea=false;
		this.isPermisoActualizarLinea=false;
		this.isPermisoActualizarOriginalLinea=false;
		this.isPermisoEliminarLinea=false;
		this.isPermisoGuardarCambiosLinea=false;
		this.isPermisoConsultaLinea=false;
		this.isPermisoBusquedaLinea=false;
		this.isPermisoReporteLinea=false;		
		this.isPermisoOrdenLinea=false;		
		this.isPermisoPaginacionMedioLinea=false;		
		this.isPermisoPaginacionAltoLinea=false;
		this.isPermisoPaginacionTodoLinea=false;
		this.isPermisoCopiarLinea=false;		
		this.isPermisoVerFormLinea=false;		
		this.isPermisoDuplicarLinea=false;		
		this.isPermisoOrdenLinea=false;		
	}
	
	public void setPermisosUsuarioLinea(Boolean isPermiso) {
		this.isPermisoTodoLinea=isPermiso;
		this.isPermisoNuevoLinea=isPermiso;
		this.isPermisoActualizarLinea=isPermiso;
		this.isPermisoActualizarOriginalLinea=isPermiso;
		this.isPermisoEliminarLinea=isPermiso;
		this.isPermisoGuardarCambiosLinea=isPermiso;
		this.isPermisoConsultaLinea=isPermiso;
		this.isPermisoBusquedaLinea=isPermiso;
		this.isPermisoReporteLinea=isPermiso;
		this.isPermisoOrdenLinea=isPermiso;		
		this.isPermisoPaginacionMedioLinea=isPermiso;		
		this.isPermisoPaginacionAltoLinea=isPermiso;		
		this.isPermisoPaginacionTodoLinea=isPermiso;		
		this.isPermisoCopiarLinea=isPermiso;		
		this.isPermisoVerFormLinea=isPermiso;		
		this.isPermisoDuplicarLinea=isPermiso;
		this.isPermisoOrdenLinea=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioLinea(Boolean isPermiso) {
		//this.isPermisoTodoLinea=isPermiso;
		this.isPermisoNuevoLinea=isPermiso;
		this.isPermisoActualizarLinea=isPermiso;
		this.isPermisoActualizarOriginalLinea=isPermiso;
		this.isPermisoEliminarLinea=isPermiso;
		this.isPermisoGuardarCambiosLinea=isPermiso;
		//this.isPermisoConsultaLinea=isPermiso;
		//this.isPermisoBusquedaLinea=isPermiso;
		//this.isPermisoReporteLinea=isPermiso;
		//this.isPermisoOrdenLinea=isPermiso;		
		//this.isPermisoPaginacionMedioLinea=isPermiso;		
		//this.isPermisoPaginacionAltoLinea=isPermiso;		
		//this.isPermisoPaginacionTodoLinea=isPermiso;		
		//this.isPermisoCopiarLinea=isPermiso;		
		//this.isPermisoDuplicarLinea=isPermiso;
		//this.isPermisoOrdenLinea=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioLineaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(PresupuestoLineaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(LineaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ComisionGrupoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ProductoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ComisionLineaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ComisionCateConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(DetallePlaneacionCompraConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(CuentasContablesLineaProductoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(PrecioConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(LineaPuntoVentaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(DetalleCodigoBarraProductoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(PresupuestoVentasLineasConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(CentroCostoGrupoProductoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ProductoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ComisionMarcaConstantesFunciones.SNOMBREOPCION);
		
		if(LineaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPresupuestoLinea=false;
		this.isTienePermisosPresupuestoLinea=this.verificarGetPermisosUsuarioOpcionLineaClaseRelacionada(this.opcionsRelacionadas,PresupuestoLineaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosLinea=false;
		this.isTienePermisosLinea=this.verificarGetPermisosUsuarioOpcionLineaClaseRelacionada(this.opcionsRelacionadas,LineaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosComisionGrupo=false;
		this.isTienePermisosComisionGrupo=this.verificarGetPermisosUsuarioOpcionLineaClaseRelacionada(this.opcionsRelacionadas,ComisionGrupoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosProductoPuntoVenta=false;
		this.isTienePermisosProductoPuntoVenta=this.verificarGetPermisosUsuarioOpcionLineaClaseRelacionada(this.opcionsRelacionadas,ProductoPuntoVentaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosComisionLinea=false;
		this.isTienePermisosComisionLinea=this.verificarGetPermisosUsuarioOpcionLineaClaseRelacionada(this.opcionsRelacionadas,ComisionLineaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosComisionCate=false;
		this.isTienePermisosComisionCate=this.verificarGetPermisosUsuarioOpcionLineaClaseRelacionada(this.opcionsRelacionadas,ComisionCateConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosDetallePlaneacionCompra=false;
		this.isTienePermisosDetallePlaneacionCompra=this.verificarGetPermisosUsuarioOpcionLineaClaseRelacionada(this.opcionsRelacionadas,DetallePlaneacionCompraConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCuentasContablesLineaProducto=false;
		this.isTienePermisosCuentasContablesLineaProducto=this.verificarGetPermisosUsuarioOpcionLineaClaseRelacionada(this.opcionsRelacionadas,CuentasContablesLineaProductoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosPrecio=false;
		this.isTienePermisosPrecio=this.verificarGetPermisosUsuarioOpcionLineaClaseRelacionada(this.opcionsRelacionadas,PrecioConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosLineaPuntoVenta=false;
		this.isTienePermisosLineaPuntoVenta=this.verificarGetPermisosUsuarioOpcionLineaClaseRelacionada(this.opcionsRelacionadas,LineaPuntoVentaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosDetalleCodigoBarraProducto=false;
		this.isTienePermisosDetalleCodigoBarraProducto=this.verificarGetPermisosUsuarioOpcionLineaClaseRelacionada(this.opcionsRelacionadas,DetalleCodigoBarraProductoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosPresupuestoVentasLineas=false;
		this.isTienePermisosPresupuestoVentasLineas=this.verificarGetPermisosUsuarioOpcionLineaClaseRelacionada(this.opcionsRelacionadas,PresupuestoVentasLineasConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCentroCostoGrupoProducto=false;
		this.isTienePermisosCentroCostoGrupoProducto=this.verificarGetPermisosUsuarioOpcionLineaClaseRelacionada(this.opcionsRelacionadas,CentroCostoGrupoProductoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosProducto=false;
		this.isTienePermisosProducto=this.verificarGetPermisosUsuarioOpcionLineaClaseRelacionada(this.opcionsRelacionadas,ProductoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosComisionMarca=false;
		this.isTienePermisosComisionMarca=this.verificarGetPermisosUsuarioOpcionLineaClaseRelacionada(this.opcionsRelacionadas,ComisionMarcaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebLinea(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioLineaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosPresupuestoLinea=conPermiso;
		this.isTienePermisosLinea=conPermiso;
		this.isTienePermisosComisionGrupo=conPermiso;
		this.isTienePermisosProductoPuntoVenta=conPermiso;
		this.isTienePermisosComisionLinea=conPermiso;
		this.isTienePermisosComisionCate=conPermiso;
		this.isTienePermisosDetallePlaneacionCompra=conPermiso;
		this.isTienePermisosCuentasContablesLineaProducto=conPermiso;
		this.isTienePermisosPrecio=conPermiso;
		this.isTienePermisosLineaPuntoVenta=conPermiso;
		this.isTienePermisosDetalleCodigoBarraProducto=conPermiso;
		this.isTienePermisosPresupuestoVentasLineas=conPermiso;
		this.isTienePermisosCentroCostoGrupoProducto=conPermiso;
		this.isTienePermisosProducto=conPermiso;
		this.isTienePermisosComisionMarca=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioLineaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionLineaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioLineaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosPresupuestoLinea && this.jInternalFrameDetalleFormLinea!=null && this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.jTabbedPaneRelacionesLinea.remove(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosLinea && this.jInternalFrameDetalleFormLinea!=null && this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.jTabbedPaneRelacionesLinea.remove(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosComisionGrupo && this.jInternalFrameDetalleFormLinea!=null && this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.jTabbedPaneRelacionesLinea.remove(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosProductoPuntoVenta && this.jInternalFrameDetalleFormLinea!=null && this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.jTabbedPaneRelacionesLinea.remove(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosComisionLinea && this.jInternalFrameDetalleFormLinea!=null && this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.jTabbedPaneRelacionesLinea.remove(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosComisionCate && this.jInternalFrameDetalleFormLinea!=null && this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.jTabbedPaneRelacionesLinea.remove(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosDetallePlaneacionCompra && this.jInternalFrameDetalleFormLinea!=null && this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.jTabbedPaneRelacionesLinea.remove(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCuentasContablesLineaProducto && this.jInternalFrameDetalleFormLinea!=null && this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.jTabbedPaneRelacionesLinea.remove(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosPrecio && this.jInternalFrameDetalleFormLinea!=null && this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.jTabbedPaneRelacionesLinea.remove(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosLineaPuntoVenta && this.jInternalFrameDetalleFormLinea!=null && this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.jTabbedPaneRelacionesLinea.remove(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosDetalleCodigoBarraProducto && this.jInternalFrameDetalleFormLinea!=null && this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.jTabbedPaneRelacionesLinea.remove(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosPresupuestoVentasLineas && this.jInternalFrameDetalleFormLinea!=null && this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.jTabbedPaneRelacionesLinea.remove(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCentroCostoGrupoProducto && this.jInternalFrameDetalleFormLinea!=null && this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.jTabbedPaneRelacionesLinea.remove(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosProducto && this.jInternalFrameDetalleFormLinea!=null && this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.jTabbedPaneRelacionesLinea.remove(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosComisionMarca && this.jInternalFrameDetalleFormLinea!=null && this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.jTabbedPaneRelacionesLinea.remove(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioLinea() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(LineaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.lineaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, LineaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoLinea=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarLinea=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalLinea=this.isPermisoActualizarLinea;
			this.isPermisoEliminarLinea=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosLinea=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaLinea=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaLinea=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoLinea=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteLinea=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenLinea=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioLinea=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoLinea=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoLinea=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarLinea=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormLinea=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarLinea=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenLinea=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.lineaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosLinea.setToolTipText(this.jTableDatosLinea.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioLinea(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioLinea(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(LineaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(LineaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioLinea() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosPresupuestoLinea && this.lineaConstantesFunciones.mostrarPresupuestoLineaLinea && !LineaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Presupuesto Linea");
			reporte.setsDescripcion("Presupuesto Linea");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosLinea && this.lineaConstantesFunciones.mostrarLineaLinea && !LineaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Linea");
			reporte.setsDescripcion("Linea");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosComisionGrupo && this.lineaConstantesFunciones.mostrarComisionGrupoLinea && !LineaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Comision Grupo");
			reporte.setsDescripcion("Comision Grupo");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosProductoPuntoVenta && this.lineaConstantesFunciones.mostrarProductoPuntoVentaLinea && !LineaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Producto Punto Venta");
			reporte.setsDescripcion("Producto Punto Venta");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosComisionLinea && this.lineaConstantesFunciones.mostrarComisionLineaLinea && !LineaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Comision Linea");
			reporte.setsDescripcion("Comision Linea");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosComisionCate && this.lineaConstantesFunciones.mostrarComisionCateLinea && !LineaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Comision Cate");
			reporte.setsDescripcion("Comision Cate");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosDetallePlaneacionCompra && this.lineaConstantesFunciones.mostrarDetallePlaneacionCompraLinea && !LineaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Planeacion Compra");
			reporte.setsDescripcion("Detalle Planeacion Compra");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCuentasContablesLineaProducto && this.lineaConstantesFunciones.mostrarCuentasContablesLineaProductoLinea && !LineaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cuentas Contables Linea Producto");
			reporte.setsDescripcion("Cuentas Contables Linea Producto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosPrecio && this.lineaConstantesFunciones.mostrarPrecioLinea && !LineaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Precio");
			reporte.setsDescripcion("Precio");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosLineaPuntoVenta && this.lineaConstantesFunciones.mostrarLineaPuntoVentaLinea && !LineaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Linea Punto Venta");
			reporte.setsDescripcion("Linea Punto Venta");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosDetalleCodigoBarraProducto && this.lineaConstantesFunciones.mostrarDetalleCodigoBarraProductoLinea && !LineaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Codigo Barra Producto");
			reporte.setsDescripcion("Detalle Codigo Barra Producto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosPresupuestoVentasLineas && this.lineaConstantesFunciones.mostrarPresupuestoVentasLineasLinea && !LineaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Presupuesto Ventas_lineas");
			reporte.setsDescripcion("Presupuesto Ventas_lineas");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCentroCostoGrupoProducto && this.lineaConstantesFunciones.mostrarCentroCostoGrupoProductoLinea && !LineaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Centro Costo Grupo Producto");
			reporte.setsDescripcion("Centro Costo Grupo Producto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosProducto && this.lineaConstantesFunciones.mostrarProductoLinea && !LineaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Producto");
			reporte.setsDescripcion("Producto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosComisionMarca && this.lineaConstantesFunciones.mostrarComisionMarcaLinea && !LineaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Comision Marca");
			reporte.setsDescripcion("Comision Marca");
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
	public void inicializarCombosForeignKeyLineaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.nivellineasForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyLineaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(LineaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyLineaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyNivelLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyNivelLineaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.nivellineasForeignKey==null||this.nivellineasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=NivelLineaConstantesFunciones.getArrayColumnasGlobalesNivelLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,NivelLineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=NivelLineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosNivelLineasForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyLineaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			LineaParameterReturnGeneral lineaReturnGeneral=new LineaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.lineaConstantesFunciones.cargarid_empresaLinea)
					 || (this.esRecargarFks && this.lineaConstantesFunciones.cargarid_empresaLinea)) {

					if(!this.lineaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+lineaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalNivelLinea="";

				if(((this.nivellineasForeignKey==null||this.nivellineasForeignKey.size()<=0) && this.lineaConstantesFunciones.cargarid_nivel_lineaLinea)
					 || (this.esRecargarFks && this.lineaConstantesFunciones.cargarid_nivel_lineaLinea)) {

					if(!this.lineaSessionBean.getisBusquedaDesdeForeignKeySesionNivelLinea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=NivelLineaConstantesFunciones.getArrayColumnasGlobalesNivelLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalNivelLinea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,NivelLineaConstantesFunciones.TABLENAME);

						finalQueryGlobalNivelLinea=Funciones.GetFinalQueryAppend(finalQueryGlobalNivelLinea, "");
						finalQueryGlobalNivelLinea+=NivelLineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosNivelLineasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalNivelLinea=" WHERE " + ConstantesSql.ID + "="+lineaSessionBean.getlidNivelLineaActual();
					}
				} else {
					finalQueryGlobalNivelLinea="NONE";
				}


				String finalQueryGlobalLinea="";

				if(((this.lineasForeignKey==null||this.lineasForeignKey.size()<=0) && this.lineaConstantesFunciones.cargarid_lineaLinea)
					 || (this.esRecargarFks && this.lineaConstantesFunciones.cargarid_lineaLinea)) {

					if(!this.lineaSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLinea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLinea=Funciones.GetFinalQueryAppend(finalQueryGlobalLinea, "");
						finalQueryGlobalLinea+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLinea=" WHERE " + ConstantesSql.ID + "="+lineaSessionBean.getlidLineaActual();
					}
				} else {
					finalQueryGlobalLinea="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				lineaReturnGeneral=lineaLogic.cargarCombosLoteForeignKeyLinea(finalQueryGlobalEmpresa,finalQueryGlobalNivelLinea,finalQueryGlobalLinea);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=lineaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalNivelLinea.equals("NONE")) {
				this.nivellineasForeignKey=lineaReturnGeneral.getnivellineasForeignKey();
			}

			if(!finalQueryGlobalLinea.equals("NONE")) {
				this.lineasForeignKey=lineaReturnGeneral.getlineasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyLinea()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyNivelLinea();
			this.addItemDefectoCombosForeignKeyLinea();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.lineaSessionBean==null) {
				this.lineaSessionBean=new LineaSessionBean();
			}

			if(!this.lineaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyNivelLinea()throws Exception {
		try {

			if(!this.lineaSessionBean.getisBusquedaDesdeForeignKeySesionNivelLinea()) {
				NivelLinea nivellinea=new NivelLinea();
				NivelLineaConstantesFunciones.setNivelLineaDescripcion(nivellinea,Constantes.SMENSAJE_ESCOJA_OPCION);
				nivellinea.setId(null);

				if(!NivelLineaConstantesFunciones.ExisteEnLista(this.nivellineasForeignKey,nivellinea,true)) {

					this.nivellineasForeignKey.add(0,nivellinea);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLinea()throws Exception {
		try {

			if(!this.lineaSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
	
	public void initActionsCombosTodosForeignKeyLinea()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyLinea(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyLinea()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyLinea();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyLinea(Linea linea)throws Exception {	
		try {
			
			this.setActualNivelLineaForeignKey(linea.getid_nivel_linea(),false,"Formulario");
			this.setActualLineaForeignKey(linea.getid_linea(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyLinea(Linea linea,String sTipoEvento)throws Exception {	
		try {
			
			

				if(linea.getLinea()!=null && !sTipoEvento.equals("id_lineaLinea")) { //sTipoEvento Evita Bucle Infinito

					this.lineasForeignKey=new ArrayList<Linea>();
					this.lineasForeignKey.add(linea.getLinea());

					this.addItemDefectoCombosForeignKeyLinea();
					this.cargarCombosFrameLineasForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyLinea()throws Exception {	
		try {
			
			this.setActualNivelLineaForeignKey(this.lineaConstantesFunciones.getid_nivel_linea(),false,"Formulario");
			this.setActualLineaForeignKey(this.lineaConstantesFunciones.getid_linea(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyLinea()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyLinea()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyLinea()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroLinea()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyLinea()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameNivelLineasForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyLinea(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameNivelLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyLinea()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormLinea.jComboBoxid_empresaLinea!=null && this.jInternalFrameDetalleFormLinea.jComboBoxid_empresaLinea.getItemCount()>0) {
				this.jInternalFrameDetalleFormLinea.jComboBoxid_empresaLinea.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormLinea.jComboBoxid_nivel_lineaLinea!=null && this.jInternalFrameDetalleFormLinea.jComboBoxid_nivel_lineaLinea.getItemCount()>0) {
				this.jInternalFrameDetalleFormLinea.jComboBoxid_nivel_lineaLinea.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormLinea.jComboBoxid_lineaLinea!=null && this.jInternalFrameDetalleFormLinea.jComboBoxid_lineaLinea.getItemCount()>0) {
				this.jInternalFrameDetalleFormLinea.jComboBoxid_lineaLinea.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public LineaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public LineaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public LineaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.lineaSessionBean=new LineaSessionBean(); 
		this.lineaConstantesFunciones=new LineaConstantesFunciones(); 
		this.lineaBean=new Linea();//(this.lineaConstantesFunciones); 		
		this.lineaReturnGeneral=new LineaParameterReturnGeneral(); 
		
		this.lineaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.lineaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public LineaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public LineaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public LineaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessLinea(true);
			
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
			
			this.lineaConstantesFunciones=new LineaConstantesFunciones(); 
			this.lineaBean=new Linea();//this.lineaConstantesFunciones); 			
			this.lineaReturnGeneral=new LineaParameterReturnGeneral(); 
		
			LineaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Linea Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.linea=new Linea();
			this.lineas = new ArrayList<Linea>();
			this.lineasAux = new ArrayList<Linea>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic=new LineaLogic();
				this.lineaLogic.getNewConnexionToDeep("");
			}
			
			//this.lineaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.lineaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormLinea);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoLinea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoLinea);	
					}
					
					if(this.jInternalFrameImportacionLinea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionLinea);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByLinea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByLinea);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormLinea!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormLinea);
				this.jInternalFrameDetalleFormLinea.setVisible(false);
				this.jInternalFrameDetalleFormLinea.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoLinea!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoLinea);
					this.jInternalFrameReporteDinamicoLinea.setVisible(false);
					this.jInternalFrameReporteDinamicoLinea.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionLinea!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionLinea);
					this.jInternalFrameImportacionLinea.setVisible(false);
					this.jInternalFrameImportacionLinea.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByLinea!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByLinea);
					this.jInternalFrameOrderByLinea.setVisible(false);
					this.jInternalFrameOrderByLinea.setSelected(false);				
				}
				
			}
			
			this.lineasArbol= new ArrayList<Linea>();
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameTreeLinea);    		
			}
			
			this.jDesktopPane.add(this.jInternalFrameTreeLinea);
			this.jInternalFrameTreeLinea.setVisible(false);
	        this.jInternalFrameTreeLinea.setSelected(false);						
			
			if(!esParaBusquedaForeignKey) {
				this.getTodosLineaArbol();
			}			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idLineaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=LineaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.lineaReturnGeneral=new LineaParameterReturnGeneral();
			
			this.lineaParameterGeneral=new LineaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.lineaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.lineaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(LineaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.lineaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(PresupuestoLineaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(LineaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ComisionGrupoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ProductoPuntoVentaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ComisionLineaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ComisionCateConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(DetallePlaneacionCompraConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(CuentasContablesLineaProductoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(PrecioConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(LineaPuntoVentaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(DetalleCodigoBarraProductoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(PresupuestoVentasLineasConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(CentroCostoGrupoProductoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ProductoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ComisionMarcaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,LineaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.lineaSessionBean.getEsGuardarRelacionado(),this.lineaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,LineaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.lineaSessionBean.getEsGuardarRelacionado(),this.lineaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoLinea=false;
			this.isVisibilidadCeldaDuplicarLinea=true;
			this.isVisibilidadCeldaCopiarLinea=true;
			this.isVisibilidadCeldaVerFormLinea=true;
			this.isVisibilidadCeldaOrdenLinea=true;
			this.isVisibilidadCeldaNuevoRelacionesLinea=false;
			this.isVisibilidadCeldaModificarLinea=false;
			this.isVisibilidadCeldaActualizarLinea=false;
			this.isVisibilidadCeldaEliminarLinea=false;
			this.isVisibilidadCeldaCancelarLinea=false;
			this.isVisibilidadCeldaGuardarLinea=false;
			this.isVisibilidadCeldaGuardarCambiosLinea=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdNivelLinea=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosLinea();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioLinea(false);
			
			this.setPermisosUsuarioLinea();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.lineaSessionBean.getEsGuardarRelacionado() 
				|| (this.lineaSessionBean.getEsGuardarRelacionado() && this.lineaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioLineaClasesRelacionadas();
			}
			
			if(this.lineaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioLineaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!LineaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosLinea();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualLinea();
			}
			
			if(!this.isPermisoBusquedaLinea) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasLinea.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.lineaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioLinea,this.isPermisoPaginacionMedioLinea,this.isPermisoPaginacionTodoLinea);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(LineaConstantesFunciones.getTiposSeleccionarLinea());
				
				this.tiposColumnasSelect=LineaConstantesFunciones.getTiposSeleccionarLinea(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectLinea();				
				//this.tiposRelacionesSelect=LineaConstantesFunciones.getTiposRelacionesLinea(true);
				
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
			//if(!this.lineaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioLinea();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioLinea(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioLinea(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesLinea() ;
			
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
			
			
			this.presupuestolineaLogic=new PresupuestoLineaLogic();
			this.comisiongrupoGrupoLogic=new ComisionGrupoLogic();
			this.productopuntoventaLogic=new ProductoPuntoVentaLogic();
			this.comisionlineaLogic=new ComisionLineaLogic();
			this.comisioncateLogic=new ComisionCateLogic();
			this.detalleplaneacioncompraLogic=new DetallePlaneacionCompraLogic();
			this.cuentascontableslineaproductoCategoriaLogic=new CuentasContablesLineaProductoLogic();
			this.precioGrupoLogic=new PrecioLogic();
			this.lineapuntoventaMarcaLogic=new LineaPuntoVentaLogic();
			this.detallecodigobarraproductoMarcaLogic=new DetalleCodigoBarraProductoLogic();
			this.presupuestoventaslineasMarcaLogic=new PresupuestoVentasLineasLogic();
			this.centrocostogrupoproductoLogic=new CentroCostoGrupoProductoLogic();
			this.productoLogic=new ProductoLogic();
			this.comisionmarcaGrupoLogic=new ComisionMarcaLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.nivellineaLogic=new NivelLineaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				lineaImplementable= (LineaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+LineaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				lineaImplementableHome= (LineaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+LineaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.lineas= new ArrayList<Linea>();
			this.lineasEliminados= new ArrayList<Linea>();
						
			this.isEsNuevoLinea=false;
			this.esParaAccionDesdeFormularioLinea=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idLineaActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.nivellineasForeignKey=new ArrayList<NivelLinea>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyLinea(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroLinea();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.lineaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			LineaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=LineaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingLinea(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormLinea!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioLinea();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioLinea();
			}
			
			LineaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasLinea.getTabCount(); i++) {
					this.jTabbedPaneBusquedasLinea.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasLinea.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessLinea(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Linea: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectLinea() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(LineaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(LineaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ComisionGrupoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ComisionGrupoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ComisionLineaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ComisionLineaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ComisionCateConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ComisionCateConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(PrecioConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PrecioConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ProductoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProductoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ComisionMarcaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ComisionMarcaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesLinea")) {
				iIndex=this.jInternalFrameDetalleFormLinea.jTabbedPaneRelacionesLinea.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormLinea.jTabbedPaneRelacionesLinea.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosLinea.getSelectedRow();	
				
				

				if(sTitle.equals("Centro Costo Grupo Productos")) {
					if(!CentroCostoGrupoProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessLinea();

						this.cargarParteTabPanelRelacionadaCentroCostoGrupoProducto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Comision Cates")) {
					if(!ComisionCateJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessLinea();

						this.cargarParteTabPanelRelacionadaComisionCate(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Comision Grupos")) {
					if(!ComisionGrupoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessLinea();

						this.cargarParteTabPanelRelacionadaComisionGrupo(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Comision Lineas")) {
					if(!ComisionLineaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessLinea();

						this.cargarParteTabPanelRelacionadaComisionLinea(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Comision Marcas")) {
					if(!ComisionMarcaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessLinea();

						this.cargarParteTabPanelRelacionadaComisionMarca(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Cuentas Contables Linea Productoes")) {
					if(!CuentasContablesLineaProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessLinea();

						this.cargarParteTabPanelRelacionadaCuentasContablesLineaProducto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Detalle Codigo Barra Productos")) {
					if(!DetalleCodigoBarraProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessLinea();

						this.cargarParteTabPanelRelacionadaDetalleCodigoBarraProducto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Detalle Planeacion Compras")) {
					if(!DetallePlaneacionCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessLinea();

						this.cargarParteTabPanelRelacionadaDetallePlaneacionCompra(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Lineas")) {
					if(!LineaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessLinea();

						this.cargarParteTabPanelRelacionadaLinea(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Linea Punto Ventas")) {
					if(!LineaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessLinea();

						this.cargarParteTabPanelRelacionadaLineaPuntoVenta(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Precios")) {
					if(!PrecioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessLinea();

						this.cargarParteTabPanelRelacionadaPrecio(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Presupuesto Lineaes")) {
					if(!PresupuestoLineaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessLinea();

						this.cargarParteTabPanelRelacionadaPresupuestoLinea(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Presupuesto Ventas_lineases")) {
					if(!PresupuestoVentasLineasJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessLinea();

						this.cargarParteTabPanelRelacionadaPresupuestoVentasLineas(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Productos")) {
					if(!ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessLinea();

						this.cargarParteTabPanelRelacionadaProducto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Producto Punto Ventas")) {
					if(!ProductoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessLinea();

						this.cargarParteTabPanelRelacionadaProductoPuntoVenta(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessLinea();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCentroCostoGrupoProducto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormLinea.cargarSessionConBeanSwingJInternalFrameCentroCostoGrupoProducto(false,true,iIndex);
		this.jButtonCentroCostoGrupoProductoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCentroCostoGrupoProducto();

		//this.jTabbedPaneRelacionesLinea.updateUI();
		//this.jTabbedPaneRelacionesLinea.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesLinea.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaComisionCate(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormLinea.cargarSessionConBeanSwingJInternalFrameComisionCate(false,true,iIndex);
		this.jButtonComisionCateActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaComisionCate();

		//this.jTabbedPaneRelacionesLinea.updateUI();
		//this.jTabbedPaneRelacionesLinea.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesLinea.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaComisionGrupo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormLinea.cargarSessionConBeanSwingJInternalFrameComisionGrupo(false,true,iIndex);
		this.jButtonComisionGrupoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaComisionGrupo();

		//this.jTabbedPaneRelacionesLinea.updateUI();
		//this.jTabbedPaneRelacionesLinea.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesLinea.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaComisionLinea(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormLinea.cargarSessionConBeanSwingJInternalFrameComisionLinea(false,true,iIndex);
		this.jButtonComisionLineaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaComisionLinea();

		//this.jTabbedPaneRelacionesLinea.updateUI();
		//this.jTabbedPaneRelacionesLinea.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesLinea.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaComisionMarca(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormLinea.cargarSessionConBeanSwingJInternalFrameComisionMarca(false,true,iIndex);
		this.jButtonComisionMarcaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaComisionMarca();

		//this.jTabbedPaneRelacionesLinea.updateUI();
		//this.jTabbedPaneRelacionesLinea.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesLinea.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaCuentasContablesLineaProducto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormLinea.cargarSessionConBeanSwingJInternalFrameCuentasContablesLineaProducto(false,true,iIndex);
		this.jButtonCuentasContablesLineaProductoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCuentasContablesLineaProducto();

		//this.jTabbedPaneRelacionesLinea.updateUI();
		//this.jTabbedPaneRelacionesLinea.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesLinea.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaDetalleCodigoBarraProducto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormLinea.cargarSessionConBeanSwingJInternalFrameDetalleCodigoBarraProducto(false,true,iIndex);
		this.jButtonDetalleCodigoBarraProductoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleCodigoBarraProducto();

		//this.jTabbedPaneRelacionesLinea.updateUI();
		//this.jTabbedPaneRelacionesLinea.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesLinea.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaDetallePlaneacionCompra(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormLinea.cargarSessionConBeanSwingJInternalFrameDetallePlaneacionCompra(false,true,iIndex);
		this.jButtonDetallePlaneacionCompraActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetallePlaneacionCompra();

		//this.jTabbedPaneRelacionesLinea.updateUI();
		//this.jTabbedPaneRelacionesLinea.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesLinea.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaLinea(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormLinea.cargarSessionConBeanSwingJInternalFrameLinea(false,true,iIndex);
		this.jButtonLineaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaLinea();

		//this.jTabbedPaneRelacionesLinea.updateUI();
		//this.jTabbedPaneRelacionesLinea.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesLinea.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaLineaPuntoVenta(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormLinea.cargarSessionConBeanSwingJInternalFrameLineaPuntoVenta(false,true,iIndex);
		this.jButtonLineaPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaLineaPuntoVenta();

		//this.jTabbedPaneRelacionesLinea.updateUI();
		//this.jTabbedPaneRelacionesLinea.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesLinea.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPrecio(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormLinea.cargarSessionConBeanSwingJInternalFramePrecio(false,true,iIndex);
		this.jButtonPrecioActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPrecio();

		//this.jTabbedPaneRelacionesLinea.updateUI();
		//this.jTabbedPaneRelacionesLinea.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesLinea.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPresupuestoLinea(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormLinea.cargarSessionConBeanSwingJInternalFramePresupuestoLinea(false,true,iIndex);
		this.jButtonPresupuestoLineaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPresupuestoLinea();

		//this.jTabbedPaneRelacionesLinea.updateUI();
		//this.jTabbedPaneRelacionesLinea.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesLinea.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPresupuestoVentasLineas(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormLinea.cargarSessionConBeanSwingJInternalFramePresupuestoVentasLineas(false,true,iIndex);
		this.jButtonPresupuestoVentasLineasActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPresupuestoVentasLineas();

		//this.jTabbedPaneRelacionesLinea.updateUI();
		//this.jTabbedPaneRelacionesLinea.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesLinea.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProducto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormLinea.cargarSessionConBeanSwingJInternalFrameProducto(false,true,iIndex);
		this.jButtonProductoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProducto();

		//this.jTabbedPaneRelacionesLinea.updateUI();
		//this.jTabbedPaneRelacionesLinea.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesLinea.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProductoPuntoVenta(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormLinea.cargarSessionConBeanSwingJInternalFrameProductoPuntoVenta(false,true,iIndex);
		this.jButtonProductoPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProductoPuntoVenta();

		//this.jTabbedPaneRelacionesLinea.updateUI();
		//this.jTabbedPaneRelacionesLinea.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesLinea.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("PresupuestoLinea")) {
				int row=this.jTableDatosLinea.getSelectedRow();
				jButtonPresupuestoLineaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Linea")) {
				int row=this.jTableDatosLinea.getSelectedRow();
				jButtonLineaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ComisionGrupo")) {
				int row=this.jTableDatosLinea.getSelectedRow();
				jButtonComisionGrupoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ProductoPuntoVenta")) {
				int row=this.jTableDatosLinea.getSelectedRow();
				jButtonProductoPuntoVentaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ComisionLinea")) {
				int row=this.jTableDatosLinea.getSelectedRow();
				jButtonComisionLineaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ComisionCate")) {
				int row=this.jTableDatosLinea.getSelectedRow();
				jButtonComisionCateActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("DetallePlaneacionCompra")) {
				int row=this.jTableDatosLinea.getSelectedRow();
				jButtonDetallePlaneacionCompraActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("CuentasContablesLineaProducto")) {
				int row=this.jTableDatosLinea.getSelectedRow();
				jButtonCuentasContablesLineaProductoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Precio")) {
				int row=this.jTableDatosLinea.getSelectedRow();
				jButtonPrecioActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("LineaPuntoVenta")) {
				int row=this.jTableDatosLinea.getSelectedRow();
				jButtonLineaPuntoVentaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("DetalleCodigoBarraProducto")) {
				int row=this.jTableDatosLinea.getSelectedRow();
				jButtonDetalleCodigoBarraProductoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("PresupuestoVentasLineas")) {
				int row=this.jTableDatosLinea.getSelectedRow();
				jButtonPresupuestoVentasLineasActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("CentroCostoGrupoProducto")) {
				int row=this.jTableDatosLinea.getSelectedRow();
				jButtonCentroCostoGrupoProductoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Producto")) {
				int row=this.jTableDatosLinea.getSelectedRow();
				jButtonProductoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ComisionMarca")) {
				int row=this.jTableDatosLinea.getSelectedRow();
				jButtonComisionMarcaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.lineaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Presupuesto Linea")) {

					if(this.isTienePermisosPresupuestoLinea && this.lineaConstantesFunciones.mostrarPresupuestoLineaLinea && !LineaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Presupuesto Lineaes"+"("+PresupuestoLineaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Presupuesto Lineaes");

						if(lineaConstantesFunciones.resaltarPresupuestoLineaLinea!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(lineaConstantesFunciones.resaltarPresupuestoLineaLinea);
						}

						jmenuItem.setEnabled(this.lineaConstantesFunciones.activarPresupuestoLineaLinea);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PresupuestoLinea"));

						

						this.jInternalFrameDetalleFormLinea.jmenuDetalleLinea.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Linea")) {

					if(this.isTienePermisosLinea && this.lineaConstantesFunciones.mostrarLineaLinea && !LineaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Lineas"+"("+LineaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Lineas");

						if(lineaConstantesFunciones.resaltarLineaLinea!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(lineaConstantesFunciones.resaltarLineaLinea);
						}

						jmenuItem.setEnabled(this.lineaConstantesFunciones.activarLineaLinea);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Linea"));

						

						this.jInternalFrameDetalleFormLinea.jmenuDetalleLinea.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Comision Grupo")) {

					if(this.isTienePermisosComisionGrupo && this.lineaConstantesFunciones.mostrarComisionGrupoLinea && !LineaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Comision Grupos"+"("+ComisionGrupoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Comision Grupos");

						if(lineaConstantesFunciones.resaltarComisionGrupoLinea!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(lineaConstantesFunciones.resaltarComisionGrupoLinea);
						}

						jmenuItem.setEnabled(this.lineaConstantesFunciones.activarComisionGrupoLinea);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ComisionGrupo"));

						

						this.jInternalFrameDetalleFormLinea.jmenuDetalleLinea.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Producto Punto Venta")) {

					if(this.isTienePermisosProductoPuntoVenta && this.lineaConstantesFunciones.mostrarProductoPuntoVentaLinea && !LineaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Producto Punto Ventas"+"("+ProductoPuntoVentaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Producto Punto Ventas");

						if(lineaConstantesFunciones.resaltarProductoPuntoVentaLinea!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(lineaConstantesFunciones.resaltarProductoPuntoVentaLinea);
						}

						jmenuItem.setEnabled(this.lineaConstantesFunciones.activarProductoPuntoVentaLinea);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ProductoPuntoVenta"));

						

						this.jInternalFrameDetalleFormLinea.jmenuDetalleLinea.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Comision Linea")) {

					if(this.isTienePermisosComisionLinea && this.lineaConstantesFunciones.mostrarComisionLineaLinea && !LineaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Comision Lineas"+"("+ComisionLineaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Comision Lineas");

						if(lineaConstantesFunciones.resaltarComisionLineaLinea!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(lineaConstantesFunciones.resaltarComisionLineaLinea);
						}

						jmenuItem.setEnabled(this.lineaConstantesFunciones.activarComisionLineaLinea);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ComisionLinea"));

						

						this.jInternalFrameDetalleFormLinea.jmenuDetalleLinea.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Comision Cate")) {

					if(this.isTienePermisosComisionCate && this.lineaConstantesFunciones.mostrarComisionCateLinea && !LineaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Comision Cates"+"("+ComisionCateConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Comision Cates");

						if(lineaConstantesFunciones.resaltarComisionCateLinea!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(lineaConstantesFunciones.resaltarComisionCateLinea);
						}

						jmenuItem.setEnabled(this.lineaConstantesFunciones.activarComisionCateLinea);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ComisionCate"));

						

						this.jInternalFrameDetalleFormLinea.jmenuDetalleLinea.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Detalle Planeacion Compra")) {

					if(this.isTienePermisosDetallePlaneacionCompra && this.lineaConstantesFunciones.mostrarDetallePlaneacionCompraLinea && !LineaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Planeacion Compras"+"("+DetallePlaneacionCompraConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Planeacion Compras");

						if(lineaConstantesFunciones.resaltarDetallePlaneacionCompraLinea!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(lineaConstantesFunciones.resaltarDetallePlaneacionCompraLinea);
						}

						jmenuItem.setEnabled(this.lineaConstantesFunciones.activarDetallePlaneacionCompraLinea);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetallePlaneacionCompra"));

						

						this.jInternalFrameDetalleFormLinea.jmenuDetalleLinea.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Cuentas Contables Linea Producto")) {

					if(this.isTienePermisosCuentasContablesLineaProducto && this.lineaConstantesFunciones.mostrarCuentasContablesLineaProductoLinea && !LineaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Cuentas Contables Linea Productoes"+"("+CuentasContablesLineaProductoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Cuentas Contables Linea Productoes");

						if(lineaConstantesFunciones.resaltarCuentasContablesLineaProductoLinea!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(lineaConstantesFunciones.resaltarCuentasContablesLineaProductoLinea);
						}

						jmenuItem.setEnabled(this.lineaConstantesFunciones.activarCuentasContablesLineaProductoLinea);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CuentasContablesLineaProducto"));

						

						this.jInternalFrameDetalleFormLinea.jmenuDetalleLinea.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Precio")) {

					if(this.isTienePermisosPrecio && this.lineaConstantesFunciones.mostrarPrecioLinea && !LineaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Precios"+"("+PrecioConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Precios");

						if(lineaConstantesFunciones.resaltarPrecioLinea!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(lineaConstantesFunciones.resaltarPrecioLinea);
						}

						jmenuItem.setEnabled(this.lineaConstantesFunciones.activarPrecioLinea);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Precio"));

						

						this.jInternalFrameDetalleFormLinea.jmenuDetalleLinea.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Linea Punto Venta")) {

					if(this.isTienePermisosLineaPuntoVenta && this.lineaConstantesFunciones.mostrarLineaPuntoVentaLinea && !LineaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Linea Punto Ventas"+"("+LineaPuntoVentaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Linea Punto Ventas");

						if(lineaConstantesFunciones.resaltarLineaPuntoVentaLinea!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(lineaConstantesFunciones.resaltarLineaPuntoVentaLinea);
						}

						jmenuItem.setEnabled(this.lineaConstantesFunciones.activarLineaPuntoVentaLinea);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"LineaPuntoVenta"));

						

						this.jInternalFrameDetalleFormLinea.jmenuDetalleLinea.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Detalle Codigo Barra Producto")) {

					if(this.isTienePermisosDetalleCodigoBarraProducto && this.lineaConstantesFunciones.mostrarDetalleCodigoBarraProductoLinea && !LineaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Codigo Barra Productos"+"("+DetalleCodigoBarraProductoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Codigo Barra Productos");

						if(lineaConstantesFunciones.resaltarDetalleCodigoBarraProductoLinea!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(lineaConstantesFunciones.resaltarDetalleCodigoBarraProductoLinea);
						}

						jmenuItem.setEnabled(this.lineaConstantesFunciones.activarDetalleCodigoBarraProductoLinea);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleCodigoBarraProducto"));

						

						this.jInternalFrameDetalleFormLinea.jmenuDetalleLinea.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Presupuesto Ventas_lineas")) {

					if(this.isTienePermisosPresupuestoVentasLineas && this.lineaConstantesFunciones.mostrarPresupuestoVentasLineasLinea && !LineaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Presupuesto Ventas_lineases"+"("+PresupuestoVentasLineasConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Presupuesto Ventas_lineases");

						if(lineaConstantesFunciones.resaltarPresupuestoVentasLineasLinea!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(lineaConstantesFunciones.resaltarPresupuestoVentasLineasLinea);
						}

						jmenuItem.setEnabled(this.lineaConstantesFunciones.activarPresupuestoVentasLineasLinea);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PresupuestoVentasLineas"));

						

						this.jInternalFrameDetalleFormLinea.jmenuDetalleLinea.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Centro Costo Grupo Producto")) {

					if(this.isTienePermisosCentroCostoGrupoProducto && this.lineaConstantesFunciones.mostrarCentroCostoGrupoProductoLinea && !LineaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Centro Costo Grupo Productos"+"("+CentroCostoGrupoProductoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Centro Costo Grupo Productos");

						if(lineaConstantesFunciones.resaltarCentroCostoGrupoProductoLinea!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(lineaConstantesFunciones.resaltarCentroCostoGrupoProductoLinea);
						}

						jmenuItem.setEnabled(this.lineaConstantesFunciones.activarCentroCostoGrupoProductoLinea);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CentroCostoGrupoProducto"));

						

						this.jInternalFrameDetalleFormLinea.jmenuDetalleLinea.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Producto")) {

					if(this.isTienePermisosProducto && this.lineaConstantesFunciones.mostrarProductoLinea && !LineaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Productos"+"("+ProductoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Productos");

						if(lineaConstantesFunciones.resaltarProductoLinea!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(lineaConstantesFunciones.resaltarProductoLinea);
						}

						jmenuItem.setEnabled(this.lineaConstantesFunciones.activarProductoLinea);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Producto"));

						

						this.jInternalFrameDetalleFormLinea.jmenuDetalleLinea.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Comision Marca")) {

					if(this.isTienePermisosComisionMarca && this.lineaConstantesFunciones.mostrarComisionMarcaLinea && !LineaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Comision Marcas"+"("+ComisionMarcaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Comision Marcas");

						if(lineaConstantesFunciones.resaltarComisionMarcaLinea!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(lineaConstantesFunciones.resaltarComisionMarcaLinea);
						}

						jmenuItem.setEnabled(this.lineaConstantesFunciones.activarComisionMarcaLinea);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ComisionMarca"));

						

						this.jInternalFrameDetalleFormLinea.jmenuDetalleLinea.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyLinea(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyLinea(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyLinea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyLineaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyLinea();
		
		this.cargarCombosFrameForeignKeyLinea();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyLinea();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyLinea();
		}
	}
	
	

	public void cargarCombosForeignKeyNivelLinea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyNivelLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyNivelLinea();
				this.cargarCombosFrameNivelLineasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaNivelLinea(this.nivellineasForeignKey);

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
	
	public void jButtonNuevoLineaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.lineaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
			
			
			if(jTableDatosLinea.getRowCount()>=1) {
				jTableDatosLinea.removeRowSelectionInterval(0, jTableDatosLinea.getRowCount()-1);						
			}
			
			this.isEsNuevoLinea=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoLinea(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesLinea(true);			
			//this.linea=new Linea();
			//this.linea.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesLinea(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLinea() ;
			
			if(LineaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleLinea(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.linea);	
			this.actualizarInformacion("INFO_PADRE",false,this.linea);				
			
			LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
			
			if(this.lineaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Linea: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarLineaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Linea> lineasSeleccionados=new ArrayList<Linea>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosLinea.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosLinea.getSelectedRows().length;			
			}
			
			lineasSeleccionados=this.getLineasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoLinea--;			
				//Linea lineaAux= new Linea();			
				//lineaAux.setId(this.iIdNuevoLinea);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Linea lineaOrigen=new Linea();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Linea lineaOrigen : lineasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosLinea.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							lineaOrigen =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineaOrigen =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaLinea();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.linea.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosLinea(lineaOrigen,this.linea,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.lineaLogic.getLineas().add(this.lineaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.lineas.add(this.lineaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaLinea(false);
				
				this.jTableDatosLinea.setRowSelectionInterval(this.getIndiceNuevoLinea(), this.getIndiceNuevoLinea());
				
				int iLastRow =  this.jTableDatosLinea.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosLinea.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosLinea.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaLinea(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Linea> lineasSeleccionados=new ArrayList<Linea>();									
		
			Linea lineaOrigen=new Linea();
			Linea lineaDestino=new Linea();
				
			lineasSeleccionados=this.getLineasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosLinea.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || lineasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosLinea.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaOrigen =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						lineaOrigen =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaDestino =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						lineaDestino =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				lineaOrigen =lineasSeleccionados.get(0);
				lineaDestino =lineasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosLinea(lineaOrigen,lineaDestino,true,false);
				
				lineaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(lineaDestino,lineaLogic.getLineas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(lineaDestino,lineas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaLinea(false);
				
				//this.jTableDatosLinea.setRowSelectionInterval(this.getIndiceNuevoLinea(), this.getIndiceNuevoLinea());
				
				int iLastRow =  this.jTableDatosLinea.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosLinea.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosLinea.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaLinea(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormLinea.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesLinea.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasLinea.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesLinea.setVisible(!isVisible);
			this.jPanelPaginacionLinea.setVisible(!isVisible);
			this.jPanelAccionesLinea.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameLinea();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoLinea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionLinea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByLinea();
			
			this.abrirFrameOrderByLinea();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByLinea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleLinea(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormLinea);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormLinea.isMaximum()) {
					this.jInternalFrameDetalleFormLinea.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormLinea.setSize(this.jInternalFrameDetalleFormLinea.iWidthFormulario,this.jInternalFrameDetalleFormLinea.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormLinea.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormLinea.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormLinea.isMaximum()) {
						this.jInternalFrameDetalleFormLinea.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormLinea.jContentPaneDetalleLinea.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormLinea.jTabbedPaneRelacionesLinea.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormLinea.jContentPaneDetalleLinea.getWidth(),LineaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormLinea.jTabbedPaneRelacionesLinea.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormLinea.jContentPaneDetalleLinea.getWidth(),LineaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormLinea.jTabbedPaneRelacionesLinea.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormLinea.jContentPaneDetalleLinea.getWidth(),LineaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CentroCostoGrupoProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCentroCostoGrupoProducto();
					}

					if(ComisionCateJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaComisionCate();
					}

					if(ComisionGrupoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaComisionGrupo();
					}

					if(ComisionLineaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaComisionLinea();
					}

					if(ComisionMarcaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaComisionMarca();
					}

					if(CuentasContablesLineaProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCuentasContablesLineaProducto();
					}

					if(DetalleCodigoBarraProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleCodigoBarraProducto();
					}

					if(DetallePlaneacionCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetallePlaneacionCompra();
					}

					if(LineaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaLinea();
					}

					if(LineaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaLineaPuntoVenta();
					}

					if(PrecioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPrecio();
					}

					if(PresupuestoLineaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPresupuestoLinea();
					}

					if(PresupuestoVentasLineasJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPresupuestoVentasLineas();
					}

					if(ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProducto();
					}

					if(ProductoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProductoPuntoVenta();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormLinea.setVisible(true);
	        this.jInternalFrameDetalleFormLinea.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByLinea() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByLinea==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByLinea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLinea,false,this);
				} else {
					this.jInternalFrameOrderByLinea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLinea,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByLinea);
				this.jInternalFrameOrderByLinea.setVisible(false);
				this.jInternalFrameOrderByLinea.setSelected(false);
				
				this.jInternalFrameOrderByLinea.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByLinea"));
				
				this.inicializarActualizarBindingTablaOrderByLinea();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionLinea() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionLinea==null) {
				
				this.jInternalFrameImportacionLinea=new ImportacionJInternalFrame(LineaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionLinea);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionLinea);
				this.jInternalFrameImportacionLinea.setVisible(false);
				this.jInternalFrameImportacionLinea.setSelected(false);


				this.jInternalFrameImportacionLinea.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionLinea"));
				this.jInternalFrameImportacionLinea.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionLinea"));
				this.jInternalFrameImportacionLinea.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionLinea"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoLinea() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoLinea==null) {
				this.jInternalFrameReporteDinamicoLinea=new ReporteDinamicoJInternalFrame(LineaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoLinea);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoLinea);
				this.jInternalFrameReporteDinamicoLinea.setVisible(false);
				this.jInternalFrameReporteDinamicoLinea.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoLinea.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoLinea"));
				this.jInternalFrameReporteDinamicoLinea.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoLinea"));
				this.jInternalFrameReporteDinamicoLinea.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoLinea"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualLinea();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCentroCostoGrupoProducto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.jScrollPanelDatosCentroCostoGrupoProducto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormLinea.jContentPaneDetalleLinea.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.jScrollPanelDatosCentroCostoGrupoProducto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.jScrollPanelDatosCentroCostoGrupoProducto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.jScrollPanelDatosCentroCostoGrupoProducto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaComisionCate() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.jScrollPanelDatosComisionCate.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormLinea.jContentPaneDetalleLinea.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.jScrollPanelDatosComisionCate.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.jScrollPanelDatosComisionCate.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.jScrollPanelDatosComisionCate.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaComisionGrupo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.jScrollPanelDatosComisionGrupo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormLinea.jContentPaneDetalleLinea.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.jScrollPanelDatosComisionGrupo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.jScrollPanelDatosComisionGrupo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.jScrollPanelDatosComisionGrupo.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaComisionLinea() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.jScrollPanelDatosComisionLinea.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormLinea.jContentPaneDetalleLinea.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.jScrollPanelDatosComisionLinea.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.jScrollPanelDatosComisionLinea.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.jScrollPanelDatosComisionLinea.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaComisionMarca() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.jScrollPanelDatosComisionMarca.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormLinea.jContentPaneDetalleLinea.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.jScrollPanelDatosComisionMarca.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.jScrollPanelDatosComisionMarca.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.jScrollPanelDatosComisionMarca.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaCuentasContablesLineaProducto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.jScrollPanelDatosCuentasContablesLineaProducto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormLinea.jContentPaneDetalleLinea.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.jScrollPanelDatosCuentasContablesLineaProducto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.jScrollPanelDatosCuentasContablesLineaProducto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.jScrollPanelDatosCuentasContablesLineaProducto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaDetalleCodigoBarraProducto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.jScrollPanelDatosDetalleCodigoBarraProducto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormLinea.jContentPaneDetalleLinea.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.jScrollPanelDatosDetalleCodigoBarraProducto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.jScrollPanelDatosDetalleCodigoBarraProducto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.jScrollPanelDatosDetalleCodigoBarraProducto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaDetallePlaneacionCompra() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.jScrollPanelDatosDetallePlaneacionCompra.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormLinea.jContentPaneDetalleLinea.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.jScrollPanelDatosDetallePlaneacionCompra.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.jScrollPanelDatosDetallePlaneacionCompra.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.jScrollPanelDatosDetallePlaneacionCompra.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaLinea() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormLinea.jContentPaneDetalleLinea.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaLineaPuntoVenta() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.jScrollPanelDatosLineaPuntoVenta.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormLinea.jContentPaneDetalleLinea.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.jScrollPanelDatosLineaPuntoVenta.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.jScrollPanelDatosLineaPuntoVenta.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.jScrollPanelDatosLineaPuntoVenta.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPrecio() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.jScrollPanelDatosPrecio.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormLinea.jContentPaneDetalleLinea.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.jScrollPanelDatosPrecio.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.jScrollPanelDatosPrecio.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.jScrollPanelDatosPrecio.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPresupuestoLinea() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.jScrollPanelDatosPresupuestoLinea.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormLinea.jContentPaneDetalleLinea.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.jScrollPanelDatosPresupuestoLinea.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.jScrollPanelDatosPresupuestoLinea.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.jScrollPanelDatosPresupuestoLinea.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPresupuestoVentasLineas() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.jScrollPanelDatosPresupuestoVentasLineas.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormLinea.jContentPaneDetalleLinea.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.jScrollPanelDatosPresupuestoVentasLineas.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.jScrollPanelDatosPresupuestoVentasLineas.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.jScrollPanelDatosPresupuestoVentasLineas.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProducto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormLinea.jContentPaneDetalleLinea.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProductoPuntoVenta() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosProductoPuntoVenta.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormLinea.jContentPaneDetalleLinea.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosProductoPuntoVenta.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosProductoPuntoVenta.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosProductoPuntoVenta.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleLinea() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormLinea);
			
	       	this.jInternalFrameDetalleFormLinea.setVisible(false);
	        this.jInternalFrameDetalleFormLinea.setSelected(false);
			
			//this.jInternalFrameDetalleFormLinea.dispose();
			//this.jInternalFrameDetalleFormLinea=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoLinea() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoLinea.setVisible(true);
	        this.jInternalFrameReporteDinamicoLinea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionLinea() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionLinea.setVisible(true);
	        this.jInternalFrameImportacionLinea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByLinea() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByLinea.setVisible(true);
	        this.jInternalFrameOrderByLinea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByLinea() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByLinea.setVisible(false);
	        this.jInternalFrameOrderByLinea.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoLinea() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoLinea.setVisible(false);
	        this.jInternalFrameReporteDinamicoLinea.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionLinea() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionLinea.setVisible(false);
	        this.jInternalFrameImportacionLinea.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	 public void abrirFrameTreeLinea(String sTipoProceso) { //throws Exception	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameTreeLinea);
			
			this.jInternalFrameTreeLinea.setsTipoProceso(sTipoProceso);
			
			if(sTipoProceso.equals("BUSQUEDA_FK")) {
				this.jInternalFrameTreeLinea.sTipoBusqueda="Linea";
			}
			
			this.jInternalFrameTreeLinea.setLineas(this.lineasArbol);
			this.jInternalFrameTreeLinea.CargarTreeLinea();
			
	       	this.jInternalFrameTreeLinea.setVisible(true);
	        this.jInternalFrameTreeLinea.setSelected(true);
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			e.getStackTrace();
			//FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
	    }
	}
	
	public void cerrarFrameTreeLinea() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameTreeLinea);
			
	       	this.jInternalFrameTreeLinea.setVisible(false);
	        this.jInternalFrameTreeLinea.setSelected(false);
			
			//this.jInternalFrameTreeLinea.dispose();
			//this.jInternalFrameTreeLinea=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void jButtonModificarLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarLinea(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarLinea(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosLinea.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesLinea(true);
			//this.isEsNuevoLinea=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.linea =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.linea =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesLinea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesLinea(false) ;
			
			if(lineaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineaSessionBean.getEsGuardarRelacionado() && PresupuestoLineaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPresupuestoLineaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineaSessionBean.getEsGuardarRelacionado() && LineaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonLineaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupoSessionBean.getEsGuardarRelacionado() && ComisionGrupoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonComisionGrupoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventaSessionBean.getEsGuardarRelacionado() && ProductoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineaSessionBean.getEsGuardarRelacionado() && ComisionLineaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonComisionLineaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncateSessionBean.getEsGuardarRelacionado() && ComisionCateJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonComisionCateActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado() && DetallePlaneacionCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetallePlaneacionCompraActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado() && CuentasContablesLineaProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCuentasContablesLineaProductoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precioSessionBean.getEsGuardarRelacionado() && PrecioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPrecioActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaSessionBean.getEsGuardarRelacionado() && LineaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonLineaPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado() && DetalleCodigoBarraProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleCodigoBarraProductoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasSessionBean.getEsGuardarRelacionado() && PresupuestoVentasLineasJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPresupuestoVentasLineasActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado() && CentroCostoGrupoProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCentroCostoGrupoProductoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado() && ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcaSessionBean.getEsGuardarRelacionado() && ComisionMarcaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonComisionMarcaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(LineaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleLinea(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLinea(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaLineaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.linea =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.linea =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarLinea(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosLinea.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesLinea(true);
			//this.isEsNuevoLinea=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.linea =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.linea =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.linea.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesLinea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesLinea(false) ;
			
			if(LineaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleLinea(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLinea(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Linea")) {
				if(!this.lineaConstantesFunciones.cargarid_lineaLinea) {
					this.cargarCombosLineasForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingLinea(false,false);
					this.cargarCombosFrameLineasForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_linea (id);

				this.recargarComboTablaLinea(this.lineasForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaNivelLinea(List<NivelLinea> nivellineasForeignKey)throws Exception{
		TableColumn tableColumnNivelLinea=this.jTableDatosLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLinea,LineaConstantesFunciones.LABEL_IDNIVELLINEA));
		TableCellEditor tableCellEditorNivelLinea =tableColumnNivelLinea.getCellEditor();

		NivelLineaTableCell nivellineaTableCellFk=(NivelLineaTableCell)tableCellEditorNivelLinea;

		if(nivellineaTableCellFk!=null) {
			nivellineaTableCellFk.setnivellineasForeignKey(nivellineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosLinea.getSelectedRow();

		//if(intSelectedRow<=0) {
			//nivellineaTableCellFk.setRowActual(intSelectedRow);
			//nivellineaTableCellFk.setnivellineasForeignKeyActual(nivellineasForeignKey);
		//}


		if(nivellineaTableCellFk!=null) {
			nivellineaTableCellFk.RecargarNivelLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLinea(List<Linea> lineasForeignKey)throws Exception{
		TableColumn tableColumnLinea=this.jTableDatosLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLinea,LineaConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosLinea.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_linea (Long id) throws Exception {
		this.setActualLineaForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarLineaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesLinea(false);
			
			//if(!this.isEsNuevoLinea) {								
				int intSelectedRow = this.jTableDatosLinea.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.linea =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.linea =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(LineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualLinea(this.linea,true);
				this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);
				
			}
			
			if(this.permiteMantenimiento(this.linea)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.lineaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoLinea=true;
					this.inicializarActualizarBindingTablaLinea(false);
					this.isEsNuevoLinea=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoLinea=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoLinea=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesLinea(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualLinea(false);
				
				this.habilitarDeshabilitarControlesLinea(false);
			
												
				
				if(LineaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleLinea();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoLineaActionPerformed(evt,lineaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualLinea(this.linea,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosLinea.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,lineaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.linea.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Linea.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Linea.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarLineaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosLinea.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.linea =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				this.linea.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.linea =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				this.linea.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.linea)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.lineaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((LineaModel) this.jTableDatosLinea.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoLinea=true;
				this.inicializarActualizarBindingTablaLinea(false);
				this.isEsNuevoLinea=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesLinea(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualLinea(false);
				
				this.habilitarDeshabilitarControlesLinea(false);
				
				
				
				if(LineaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleLinea();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarLineaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosLinea.getRowCount()>=1) {
				jTableDatosLinea.removeRowSelectionInterval(0, jTableDatosLinea.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesLinea(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaLinea(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesLinea(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLinea(false) ;
			
			this.isEsNuevoLinea=false;
			
			if(LineaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleLinea();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingLinea(false);
				
				//SI ES MANUAL
				if(LineaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualLinea();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoLinea--;			
			//Linea lineaAux= new Linea();			
			//lineaAux.setId(this.iIdNuevoLinea);
			
			if(this.jInternalFrameDetalleFormLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaLinea();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);
			
			this.linea.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.lineaLogic.getLineas().add(this.lineaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.lineas.add(this.lineaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaLinea(false);
			
			this.jTableDatosLinea.setRowSelectionInterval(this.getIndiceNuevoLinea(), this.getIndiceNuevoLinea());
			
			int iLastRow =  this.jTableDatosLinea.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosLinea.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosLinea.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaLinea(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingLinea(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLinea(false);
			
			//SI ES MANUAL
			if(LineaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualLinea();
			}
			
			//this.abrirFrameTreeLinea();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionLineaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE LineaS ?", "MANTENIMIENTO DE Linea", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionLinea.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralLinea();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.lineaReturnGeneral=lineaLogic.procesarImportacionLineasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.lineaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarLineaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionLineaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionLinea.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionLinea.setFileImportacion(this.jInternalFrameImportacionLinea.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionLinea.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionLinea.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionLinea.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionLinea.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoLineaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Linea> lineasSeleccionados=new ArrayList<Linea>();		

		lineasSeleccionados=this.getLineasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLinea.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLinea.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("LineaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"LineaBaseDesign.jrxml";
			
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
			
			this.generarReporteLineas("Todos",lineasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoLinea.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLinea.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case LineaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LineaConstantesFunciones.LABEL_IDNIVELLINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_NivelLinea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_NivelLinea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_NivelLinea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_NivelLinea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LineaConstantesFunciones.LABEL_IDLINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Linea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Linea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Linea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Linea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LineaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LineaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LineaConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoLinea.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoLinea.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoLinea.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case LineaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case LineaConstantesFunciones.LABEL_IDNIVELLINEA:
					sNombreCampoCategoria="id_nivel_linea";
					break;

				case LineaConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoria="id_linea";
					break;

				case LineaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case LineaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case LineaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoLinea.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case LineaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case LineaConstantesFunciones.LABEL_IDNIVELLINEA:
					sNombreCampoCategoriaValor="id_nivel_linea";
					break;

				case LineaConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoriaValor="id_linea";
					break;

				case LineaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case LineaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case LineaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoLinea.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLinea.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case LineaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case LineaConstantesFunciones.LABEL_IDNIVELLINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nivel Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_nivel_linea");
					break;

				case LineaConstantesFunciones.LABEL_IDLINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Padre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea");
					break;

				case LineaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case LineaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case LineaConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoLineaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Linea> lineasSeleccionados=new ArrayList<Linea>();		
		
		lineasSeleccionados=this.getLineasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"linea";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Lineas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoLinea.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoLinea.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case LineaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LineaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Linea linea:lineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(linea.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LineaConstantesFunciones.LABEL_IDNIVELLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LineaConstantesFunciones.LABEL_IDNIVELLINEA);
					iRow++;

					for(Linea linea:lineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(linea.getnivellinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LineaConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LineaConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(Linea linea:lineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(linea.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LineaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LineaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Linea linea:lineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(linea.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LineaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LineaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Linea linea:lineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(linea.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LineaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LineaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Linea linea:lineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(linea.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelLinea(row);				
			//	iRow++;
			//}				
			
			//for(Linea lineaAux:lineasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelLinea(lineaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	public void jButtonArbolLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.abrirFrameTreeLinea("BUSQUEDA_NORMAL");
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLinea(false);
			
			//SI ES MANUAL
			if(LineaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualLinea();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLinea(false);
			
			//SI ES MANUAL
			if(LineaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualLinea();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLinea(false);
			
			//SI ES MANUAL
			if(LineaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualLinea();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaLinea() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosLinea.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosLinea.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosLinea.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosLinea.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosLinea.setMinimumSize(dimensionMinimum);
		this.jTableDatosLinea.setMaximumSize(dimensionMaximum);
		this.jTableDatosLinea.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingLinea(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingLinea(esInicializar,true);
	}
	
	public void inicializarActualizarBindingLinea(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaLinea(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesLinea(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.lineaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasLinea(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesLinea(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesLinea(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !LineaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!LineaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualLinea() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaLinea();
		
		this.inicializarActualizarBindingBotonesManualLinea(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.lineaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualLinea();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesLinea() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualLinea(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualLinea(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosLinea.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosLinea.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteLinea.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormLinea!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormLinea.jCheckBoxPostAccionNuevoLinea.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormLinea.jCheckBoxPostAccionSinCerrarLinea.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormLinea.jCheckBoxPostAccionSinMensajeLinea.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosLinea.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosLinea.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteLinea.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormLinea!=null) {
				this.jInternalFrameDetalleFormLinea.jCheckBoxPostAccionNuevoLinea.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormLinea.jCheckBoxPostAccionSinCerrarLinea.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormLinea.jCheckBoxPostAccionSinMensajeLinea.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionLinea.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionLinea.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormLinea!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormLinea.jComboBoxTiposAccionesFormularioLinea.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesLinea.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoLinea!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLinea.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesLinea.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesLinea.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarLinea.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesLinea.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoLinea!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLinea.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesLinea.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralLinea.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesLinea(Boolean esInicializar) throws Exception {
		try	{	
			if(LineaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualLinea(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesLinea() throws Exception {
		try	{
			if(LineaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualLinea();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleLinea() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormLinea.jComboBoxTiposAccionesFormularioLinea.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormLinea.jComboBoxTiposAccionesFormularioLinea.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualLinea() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesLinea.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesLinea.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesLinea.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionLinea.addItem(reporte);
			}
			
			
			if(!this.lineaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionLinea.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionLinea.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesLinea.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesLinea.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormLinea!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormLinea.jComboBoxTiposAccionesFormularioLinea.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormLinea.jComboBoxTiposAccionesFormularioLinea.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarLinea.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarLinea.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualLinea();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualLinea() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoLinea!=null) {
				this.jInternalFrameReporteDinamicoLinea.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoLinea.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoLinea!=null) {
				this.jInternalFrameReporteDinamicoLinea.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoLinea.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoLinea!=null) {
				
				if(this.jInternalFrameReporteDinamicoLinea.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoLinea.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoLinea.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoLinea.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoLinea.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoLinea.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualLinea()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoLinea.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreLinea.getText();
		if(this.jComboBoxid_lineaFK_IdLineaLinea.getSelectedItem()!=null){this.id_lineaFK_IdLinea=((Linea)this.jComboBoxid_lineaFK_IdLineaLinea.getSelectedItem()).getId();}
		if(this.jComboBoxid_nivel_lineaFK_IdNivelLineaLinea.getSelectedItem()!=null){this.id_nivel_lineaFK_IdNivelLinea=((NivelLinea)this.jComboBoxid_nivel_lineaFK_IdNivelLineaLinea.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasLinea(Boolean esInicializar) throws Exception {				
		if(LineaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualLinea();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaLinea() throws Exception {
		this.inicializarActualizarBindingTablaLinea(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByLinea() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByLinea.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByLinea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByLinea.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new LineaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByLinea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByLinea.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new LineaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosLineaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new LineaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByLinea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByLinea.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new LineaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByLinea.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaLinea(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=lineaLogic.getLineas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=lineas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(LineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosLinea.setModel(new LineaModel(this.lineaLogic.getLineas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosLinea.setModel(new LineaModel(this.lineas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByLinea!=null && this.jInternalFrameOrderByLinea.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByLinea();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLinea,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new LineaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+LineaConstantesFunciones.SCLASSWEBTITULO,lineaConstantesFunciones.resaltarSeleccionarLinea,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+LineaConstantesFunciones.SCLASSWEBTITULO,lineaConstantesFunciones.resaltarSeleccionarLinea,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLinea,LineaConstantesFunciones.LABEL_ID));

		if(this.lineaConstantesFunciones.mostraridLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.lineaConstantesFunciones.resaltaridLinea,this.lineaConstantesFunciones.activaridLinea,this,true,"idLinea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.lineaConstantesFunciones.resaltaridLinea,this.lineaConstantesFunciones.activaridLinea,this,true,"idLinea","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLinea,LineaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.lineaConstantesFunciones.mostrarid_empresaLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.lineaConstantesFunciones.resaltarid_empresaLinea,this,this.lineaConstantesFunciones.activarid_empresaLinea));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.lineaConstantesFunciones.resaltarid_empresaLinea,this,this.lineaConstantesFunciones.activarid_empresaLinea,false,"id_empresaLinea","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLinea,LineaConstantesFunciones.LABEL_IDNIVELLINEA));

		if(this.lineaConstantesFunciones.mostrarid_nivel_lineaLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaConstantesFunciones.LABEL_IDNIVELLINEA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new NivelLineaTableCell(this.nivellineasForeignKey,this.lineaConstantesFunciones.resaltarid_nivel_lineaLinea,this,this.lineaConstantesFunciones.activarid_nivel_lineaLinea));
			tableColumn.setCellEditor(new NivelLineaTableCell(this.nivellineasForeignKey,this.lineaConstantesFunciones.resaltarid_nivel_lineaLinea,this,this.lineaConstantesFunciones.activarid_nivel_lineaLinea,true,"id_nivel_lineaLinea","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLinea,LineaConstantesFunciones.LABEL_IDLINEA));

		if(this.lineaConstantesFunciones.mostrarid_lineaLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaConstantesFunciones.LABEL_IDLINEA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineasForeignKey,this.lineaConstantesFunciones.resaltarid_lineaLinea,this,this.lineaConstantesFunciones.activarid_lineaLinea));
			tableColumn.setCellEditor(new LineaTableCell(this.lineasForeignKey,this.lineaConstantesFunciones.resaltarid_lineaLinea,this,this.lineaConstantesFunciones.activarid_lineaLinea,true,"id_lineaLinea","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLinea,LineaConstantesFunciones.LABEL_CODIGO));

		if(this.lineaConstantesFunciones.mostrarcodigoLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.lineaConstantesFunciones.resaltarcodigoLinea,this.lineaConstantesFunciones.activarcodigoLinea,this,true,"codigoLinea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.lineaConstantesFunciones.resaltarcodigoLinea,this.lineaConstantesFunciones.activarcodigoLinea,this,true,"codigoLinea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLinea,LineaConstantesFunciones.LABEL_NOMBRE));

		if(this.lineaConstantesFunciones.mostrarnombreLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.lineaConstantesFunciones.resaltarnombreLinea,this.lineaConstantesFunciones.activarnombreLinea,this,true,"nombreLinea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.lineaConstantesFunciones.resaltarnombreLinea,this.lineaConstantesFunciones.activarnombreLinea,this,true,"nombreLinea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLinea,LineaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.lineaConstantesFunciones.mostrardescripcionLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.lineaConstantesFunciones.resaltardescripcionLinea,this.lineaConstantesFunciones.activardescripcionLinea,this,true,"descripcionLinea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.lineaConstantesFunciones.resaltardescripcionLinea,this.lineaConstantesFunciones.activardescripcionLinea,this,true,"descripcionLinea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.lineaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosPresupuestoLinea && this.lineaConstantesFunciones.mostrarPresupuestoLineaLinea && !LineaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Presupuesto Lineaes");
				tableColumn.setHeaderValue("Presupuesto Lineaes");
				tableColumn.setCellRenderer(new PresupuestoLineaTableCell(lineaConstantesFunciones.resaltarPresupuestoLineaLinea,this,this.lineaConstantesFunciones.activarPresupuestoLineaLinea));
				tableColumn.setCellEditor(new PresupuestoLineaTableCell(lineaConstantesFunciones.resaltarPresupuestoLineaLinea,this,this.lineaConstantesFunciones.activarPresupuestoLineaLinea));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosLinea.addColumn(tableColumn);
			}

			if(this.isTienePermisosLinea && this.lineaConstantesFunciones.mostrarLineaLinea && !LineaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Lineas");
				tableColumn.setHeaderValue("Lineas");
				tableColumn.setCellRenderer(new LineaTableCell(lineaConstantesFunciones.resaltarLineaLinea,this,this.lineaConstantesFunciones.activarLineaLinea));
				tableColumn.setCellEditor(new LineaTableCell(lineaConstantesFunciones.resaltarLineaLinea,this,this.lineaConstantesFunciones.activarLineaLinea));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosLinea.addColumn(tableColumn);
			}

			if(this.isTienePermisosComisionGrupo && this.lineaConstantesFunciones.mostrarComisionGrupoLinea && !LineaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Comision Grupos");
				tableColumn.setHeaderValue("Comision Grupos");
				tableColumn.setCellRenderer(new ComisionGrupoTableCell(lineaConstantesFunciones.resaltarComisionGrupoLinea,this,this.lineaConstantesFunciones.activarComisionGrupoLinea));
				tableColumn.setCellEditor(new ComisionGrupoTableCell(lineaConstantesFunciones.resaltarComisionGrupoLinea,this,this.lineaConstantesFunciones.activarComisionGrupoLinea));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosLinea.addColumn(tableColumn);
			}

			if(this.isTienePermisosProductoPuntoVenta && this.lineaConstantesFunciones.mostrarProductoPuntoVentaLinea && !LineaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Producto Punto Ventas");
				tableColumn.setHeaderValue("Producto Punto Ventas");
				tableColumn.setCellRenderer(new ProductoPuntoVentaTableCell(lineaConstantesFunciones.resaltarProductoPuntoVentaLinea,this,this.lineaConstantesFunciones.activarProductoPuntoVentaLinea));
				tableColumn.setCellEditor(new ProductoPuntoVentaTableCell(lineaConstantesFunciones.resaltarProductoPuntoVentaLinea,this,this.lineaConstantesFunciones.activarProductoPuntoVentaLinea));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosLinea.addColumn(tableColumn);
			}

			if(this.isTienePermisosComisionLinea && this.lineaConstantesFunciones.mostrarComisionLineaLinea && !LineaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Comision Lineas");
				tableColumn.setHeaderValue("Comision Lineas");
				tableColumn.setCellRenderer(new ComisionLineaTableCell(lineaConstantesFunciones.resaltarComisionLineaLinea,this,this.lineaConstantesFunciones.activarComisionLineaLinea));
				tableColumn.setCellEditor(new ComisionLineaTableCell(lineaConstantesFunciones.resaltarComisionLineaLinea,this,this.lineaConstantesFunciones.activarComisionLineaLinea));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosLinea.addColumn(tableColumn);
			}

			if(this.isTienePermisosComisionCate && this.lineaConstantesFunciones.mostrarComisionCateLinea && !LineaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Comision Cates");
				tableColumn.setHeaderValue("Comision Cates");
				tableColumn.setCellRenderer(new ComisionCateTableCell(lineaConstantesFunciones.resaltarComisionCateLinea,this,this.lineaConstantesFunciones.activarComisionCateLinea));
				tableColumn.setCellEditor(new ComisionCateTableCell(lineaConstantesFunciones.resaltarComisionCateLinea,this,this.lineaConstantesFunciones.activarComisionCateLinea));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosLinea.addColumn(tableColumn);
			}

			if(this.isTienePermisosDetallePlaneacionCompra && this.lineaConstantesFunciones.mostrarDetallePlaneacionCompraLinea && !LineaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Planeacion Compras");
				tableColumn.setHeaderValue("Detalle Planeacion Compras");
				tableColumn.setCellRenderer(new DetallePlaneacionCompraTableCell(lineaConstantesFunciones.resaltarDetallePlaneacionCompraLinea,this,this.lineaConstantesFunciones.activarDetallePlaneacionCompraLinea));
				tableColumn.setCellEditor(new DetallePlaneacionCompraTableCell(lineaConstantesFunciones.resaltarDetallePlaneacionCompraLinea,this,this.lineaConstantesFunciones.activarDetallePlaneacionCompraLinea));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosLinea.addColumn(tableColumn);
			}

			if(this.isTienePermisosCuentasContablesLineaProducto && this.lineaConstantesFunciones.mostrarCuentasContablesLineaProductoLinea && !LineaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Cuentas Contables Linea Productoes");
				tableColumn.setHeaderValue("Cuentas Contables Linea Productoes");
				tableColumn.setCellRenderer(new CuentasContablesLineaProductoTableCell(lineaConstantesFunciones.resaltarCuentasContablesLineaProductoLinea,this,this.lineaConstantesFunciones.activarCuentasContablesLineaProductoLinea));
				tableColumn.setCellEditor(new CuentasContablesLineaProductoTableCell(lineaConstantesFunciones.resaltarCuentasContablesLineaProductoLinea,this,this.lineaConstantesFunciones.activarCuentasContablesLineaProductoLinea));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosLinea.addColumn(tableColumn);
			}

			if(this.isTienePermisosPrecio && this.lineaConstantesFunciones.mostrarPrecioLinea && !LineaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Precios");
				tableColumn.setHeaderValue("Precios");
				tableColumn.setCellRenderer(new PrecioTableCell(lineaConstantesFunciones.resaltarPrecioLinea,this,this.lineaConstantesFunciones.activarPrecioLinea));
				tableColumn.setCellEditor(new PrecioTableCell(lineaConstantesFunciones.resaltarPrecioLinea,this,this.lineaConstantesFunciones.activarPrecioLinea));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosLinea.addColumn(tableColumn);
			}

			if(this.isTienePermisosLineaPuntoVenta && this.lineaConstantesFunciones.mostrarLineaPuntoVentaLinea && !LineaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Linea Punto Ventas");
				tableColumn.setHeaderValue("Linea Punto Ventas");
				tableColumn.setCellRenderer(new LineaPuntoVentaTableCell(lineaConstantesFunciones.resaltarLineaPuntoVentaLinea,this,this.lineaConstantesFunciones.activarLineaPuntoVentaLinea));
				tableColumn.setCellEditor(new LineaPuntoVentaTableCell(lineaConstantesFunciones.resaltarLineaPuntoVentaLinea,this,this.lineaConstantesFunciones.activarLineaPuntoVentaLinea));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosLinea.addColumn(tableColumn);
			}

			if(this.isTienePermisosDetalleCodigoBarraProducto && this.lineaConstantesFunciones.mostrarDetalleCodigoBarraProductoLinea && !LineaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Codigo Barra Productos");
				tableColumn.setHeaderValue("Detalle Codigo Barra Productos");
				tableColumn.setCellRenderer(new DetalleCodigoBarraProductoTableCell(lineaConstantesFunciones.resaltarDetalleCodigoBarraProductoLinea,this,this.lineaConstantesFunciones.activarDetalleCodigoBarraProductoLinea));
				tableColumn.setCellEditor(new DetalleCodigoBarraProductoTableCell(lineaConstantesFunciones.resaltarDetalleCodigoBarraProductoLinea,this,this.lineaConstantesFunciones.activarDetalleCodigoBarraProductoLinea));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosLinea.addColumn(tableColumn);
			}

			if(this.isTienePermisosPresupuestoVentasLineas && this.lineaConstantesFunciones.mostrarPresupuestoVentasLineasLinea && !LineaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Presupuesto Ventas_lineases");
				tableColumn.setHeaderValue("Presupuesto Ventas_lineases");
				tableColumn.setCellRenderer(new PresupuestoVentasLineasTableCell(lineaConstantesFunciones.resaltarPresupuestoVentasLineasLinea,this,this.lineaConstantesFunciones.activarPresupuestoVentasLineasLinea));
				tableColumn.setCellEditor(new PresupuestoVentasLineasTableCell(lineaConstantesFunciones.resaltarPresupuestoVentasLineasLinea,this,this.lineaConstantesFunciones.activarPresupuestoVentasLineasLinea));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosLinea.addColumn(tableColumn);
			}

			if(this.isTienePermisosCentroCostoGrupoProducto && this.lineaConstantesFunciones.mostrarCentroCostoGrupoProductoLinea && !LineaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Centro Costo Grupo Productos");
				tableColumn.setHeaderValue("Centro Costo Grupo Productos");
				tableColumn.setCellRenderer(new CentroCostoGrupoProductoTableCell(lineaConstantesFunciones.resaltarCentroCostoGrupoProductoLinea,this,this.lineaConstantesFunciones.activarCentroCostoGrupoProductoLinea));
				tableColumn.setCellEditor(new CentroCostoGrupoProductoTableCell(lineaConstantesFunciones.resaltarCentroCostoGrupoProductoLinea,this,this.lineaConstantesFunciones.activarCentroCostoGrupoProductoLinea));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosLinea.addColumn(tableColumn);
			}

			if(this.isTienePermisosProducto && this.lineaConstantesFunciones.mostrarProductoLinea && !LineaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Productos");
				tableColumn.setHeaderValue("Productos");
				tableColumn.setCellRenderer(new ProductoTableCell(lineaConstantesFunciones.resaltarProductoLinea,this,this.lineaConstantesFunciones.activarProductoLinea));
				tableColumn.setCellEditor(new ProductoTableCell(lineaConstantesFunciones.resaltarProductoLinea,this,this.lineaConstantesFunciones.activarProductoLinea));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosLinea.addColumn(tableColumn);
			}

			if(this.isTienePermisosComisionMarca && this.lineaConstantesFunciones.mostrarComisionMarcaLinea && !LineaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Comision Marcas");
				tableColumn.setHeaderValue("Comision Marcas");
				tableColumn.setCellRenderer(new ComisionMarcaTableCell(lineaConstantesFunciones.resaltarComisionMarcaLinea,this,this.lineaConstantesFunciones.activarComisionMarcaLinea));
				tableColumn.setCellEditor(new ComisionMarcaTableCell(lineaConstantesFunciones.resaltarComisionMarcaLinea,this,this.lineaConstantesFunciones.activarComisionMarcaLinea));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosLinea.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.lineaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.lineaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosLinea.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.lineaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.lineaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosLinea.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarLinea && this.isPermisoGuardarCambiosLinea) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.lineaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.lineaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosLinea.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.lineaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosLinea.addColumn(tableColumn);
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
			
			this.jTableDatosLinea.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarLinea && this.isPermisoGuardarCambiosLinea) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.lineaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarLinea && this.isPermisoGuardarCambiosLinea) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosLinea.moveColumn(this.jTableDatosLinea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosLinea.moveColumn(this.jTableDatosLinea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.lineaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosLinea.moveColumn(this.jTableDatosLinea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosLinea.moveColumn(this.jTableDatosLinea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosLinea.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosLinea.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosLinea,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!LineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosLinea.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosLinea.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!LineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!LineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosLinea.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosLinea.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosLinea.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=lineaLogic.getLineas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=lineas.size()-1;
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
		//this.jTableDatosLinea.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosLinea();
			
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
				
				//this.isEsNuevoLinea=false;
					
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
			
				if(this.lineaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormLinea==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosLinea.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosLinea.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.linea =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.linea =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.linea.getsType().equals("DUPLICADO")
				   || this.linea.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoLinea=true;
				
				} else {
					this.isEsNuevoLinea=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.lineaSessionBean.getEsGuardarRelacionado()) {
					if(this.linea.getId()>=0 && !this.linea.getIsNew()) {						
						this.isEsNuevoLinea=false;
						
					} else {
						this.isEsNuevoLinea=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoLinea(esRelaciones);						
				
				this.seleccionarLinea(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.linea.getId()<0) {
					this.isEsNuevoLinea=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarLinea(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarLinea(evt,rowIndex);
				}	
				
				if(this.lineaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Linea: " + this.dDif); 
					}
				}								
				
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarLinea(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.linea)) {
					if(this.linea.getId()>0) {
						this.linea.setIsDeleted(true);
						
						this.lineasEliminados.add(this.linea);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.lineaLogic.getLineas().remove(this.linea);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.lineas.remove(this.linea);				
					}
					
					
					((LineaModel) this.jTableDatosLinea.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaLinea(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarLinea(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoLinea) {
			
			if(this.jInternalFrameDetalleFormLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosLinea.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosLinea.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.linea =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.linea =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(LineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioLinea(this.linea);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.lineaConstantesFunciones.cargarid_empresaLinea || this.lineaConstantesFunciones.event_dependid_empresaLinea) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.linea.getid_empresa());
									//this.inicializarActualizarBindingLinea(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(linea.getEmpresa()!=null) {
							this.empresasForeignKey.add(linea.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.linea.getid_empresa(),false,"Formulario");

					//NivelLinea
					if(!this.lineaConstantesFunciones.cargarid_nivel_lineaLinea || this.lineaConstantesFunciones.event_dependid_nivel_lineaLinea) {
						//this.cargarCombosNivelLineasForeignKeyLista(" where id="+this.linea.getid_nivel_linea());
									//this.inicializarActualizarBindingLinea(false,false);
						this.nivellineasForeignKey=new ArrayList<NivelLinea>();

						if(linea.getNivelLinea()!=null) {
							this.nivellineasForeignKey.add(linea.getNivelLinea());
						}

						this.addItemDefectoCombosForeignKeyNivelLinea();
						this.cargarCombosFrameNivelLineasForeignKey("Todos");
					}
					this.setActualNivelLineaForeignKey(this.linea.getid_nivel_linea(),false,"Formulario");

					//Linea
					if(!this.lineaConstantesFunciones.cargarid_lineaLinea || this.lineaConstantesFunciones.event_dependid_lineaLinea) {
						//this.cargarCombosLineasForeignKeyLista(" where id="+this.linea.getid_linea());
									//this.inicializarActualizarBindingLinea(false,false);
						this.lineasForeignKey=new ArrayList<Linea>();

						if(linea.getLinea()!=null) {
							this.lineasForeignKey.add(linea.getLinea());
						}

						this.addItemDefectoCombosForeignKeyLinea();
						this.cargarCombosFrameLineasForeignKey("Todos");
					}
					this.setActualLineaForeignKey(this.linea.getid_linea(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesLinea("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesLinea(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualLinea() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoLinea(Linea linea) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoLinea(linea,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoLinea(Linea linea,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioLinea(linea);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyLinea(linea,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyLinea(linea);
	}
	
	public void setVariablesObjetoActualToFormularioLinea(Linea linea) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormLinea.jLabelidLinea.setText(linea.getId().toString());
			this.jInternalFrameDetalleFormLinea.jTextFieldcodigoLinea.setText(linea.getcodigo());
			this.jInternalFrameDetalleFormLinea.jTextAreanombreLinea.setText(linea.getnombre());
			this.jInternalFrameDetalleFormLinea.jTextAreadescripcionLinea.setText(linea.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Linea lineaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,lineaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Linea lineaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				lineaLocal=this.linea;
			} else {
				lineaLocal=this.lineaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(lineaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoLinea(lineaLocal,true);
					
					if(lineaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(lineaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.lineaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(lineaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoLinea(Linea linea,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualLinea(linea,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysLinea(linea);
	}
	
	public void setVariablesFormularioToObjetoActualLinea(Linea linea,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualLinea(linea,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualLinea(Linea linea,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormLinea.jLabelidLinea.getText()==null || this.jInternalFrameDetalleFormLinea.jLabelidLinea.getText()=="" || this.jInternalFrameDetalleFormLinea.jLabelidLinea.getText()=="Id") {
				this.jInternalFrameDetalleFormLinea.jLabelidLinea.setText("0");
			}

			if(conColumnasBase) {linea.setId(Long.parseLong(this.jInternalFrameDetalleFormLinea.jLabelidLinea.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LineaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLinea.jLabelIdLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			linea.setcodigo(this.jInternalFrameDetalleFormLinea.jTextFieldcodigoLinea.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LineaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLinea.jLabelcodigoLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			linea.setnombre(this.jInternalFrameDetalleFormLinea.jTextAreanombreLinea.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LineaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLinea.jLabelnombreLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			linea.setdescripcion(this.jInternalFrameDetalleFormLinea.jTextAreadescripcionLinea.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LineaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLinea.jLabeldescripcionLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualLinea(Linea lineaBean,Linea linea,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && lineaBean.getid_nivel_linea()!=null && !lineaBean.getid_nivel_linea().equals(-1L))) {linea.setid_nivel_linea(lineaBean.getid_nivel_linea());}
			if(conDefault || (!conDefault && lineaBean.getid_linea()!=null && !lineaBean.getid_linea().equals(null))) {linea.setid_linea(lineaBean.getid_linea());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosLinea(Linea lineaOrigen,Linea linea,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && lineaOrigen.getId()!=null && !lineaOrigen.getId().equals(0L))) {linea.setId(lineaOrigen.getId());}}
			if(conDefault || (!conDefault && lineaOrigen.getid_nivel_linea()!=null && !lineaOrigen.getid_nivel_linea().equals(-1L))) {linea.setid_nivel_linea(lineaOrigen.getid_nivel_linea());}
			if(conDefault || (!conDefault && lineaOrigen.getid_linea()!=null && !lineaOrigen.getid_linea().equals(null))) {linea.setid_linea(lineaOrigen.getid_linea());}
			if(conDefault || (!conDefault && lineaOrigen.getcodigo()!=null && !lineaOrigen.getcodigo().equals(""))) {linea.setcodigo(lineaOrigen.getcodigo());}
			if(conDefault || (!conDefault && lineaOrigen.getnombre()!=null && !lineaOrigen.getnombre().equals(""))) {linea.setnombre(lineaOrigen.getnombre());}
			if(conDefault || (!conDefault && lineaOrigen.getdescripcion()!=null && !lineaOrigen.getdescripcion().equals(""))) {linea.setdescripcion(lineaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioLinea(Linea linea) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormLinea.jLabelidLinea.setText(linea.getId().toString());
			this.jInternalFrameDetalleFormLinea.jTextFieldcodigoLinea.setText(linea.getcodigo());
			this.jInternalFrameDetalleFormLinea.jTextAreanombreLinea.setText(linea.getnombre());
			this.jInternalFrameDetalleFormLinea.jTextAreadescripcionLinea.setText(linea.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioLinea(LineaBean lineaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormLinea.jLabelidLinea.setText(lineaBean.getId().toString());
			this.jInternalFrameDetalleFormLinea.jTextFieldcodigoLinea.setText(lineaBean.getcodigo());
			this.jInternalFrameDetalleFormLinea.jTextAreanombreLinea.setText(lineaBean.getnombre());
			this.jInternalFrameDetalleFormLinea.jTextAreadescripcionLinea.setText(lineaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanLinea(LineaParameterReturnGeneral lineaReturnGeneral,LineaBean lineaBean,Boolean conDefault) throws Exception { 
		try {
			Linea lineaLocal=new Linea();
			
			lineaLocal=lineaReturnGeneral.getLinea();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && lineaLocal.getId()!=null && !lineaLocal.getId().equals(0L))) {lineaBean.setId(lineaLocal.getId());}}
			if(conDefault || (!conDefault && lineaLocal.getid_nivel_linea()!=null && !lineaLocal.getid_nivel_linea().equals(-1L))) {lineaBean.setid_nivel_linea(lineaLocal.getid_nivel_linea());}
			if(conDefault || (!conDefault && lineaLocal.getid_linea()!=null && !lineaLocal.getid_linea().equals(null))) {lineaBean.setid_linea(lineaLocal.getid_linea());}
			if(conDefault || (!conDefault && lineaLocal.getcodigo()!=null && !lineaLocal.getcodigo().equals(""))) {lineaBean.setcodigo(lineaLocal.getcodigo());}
			if(conDefault || (!conDefault && lineaLocal.getnombre()!=null && !lineaLocal.getnombre().equals(""))) {lineaBean.setnombre(lineaLocal.getnombre());}
			if(conDefault || (!conDefault && lineaLocal.getdescripcion()!=null && !lineaLocal.getdescripcion().equals(""))) {lineaBean.setdescripcion(lineaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxLineaGenerico(Long idLineaSeleccionado,JComboBox jComboBoxLinea,List<Linea> lineasLocal)throws Exception {
		try {
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasLocal) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}

			jComboBoxLinea.setSelectedItem(lineaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxLineaGenerico(JComboBox jComboBoxLinea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxLinea.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxLinea.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxLinea.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxLinea.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
				//AUTOREFERENCIADA
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
				
				jComboBoxLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Arbol"));			
				//AUTOREFERENCIADA
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
			
		if(sTipo.equals("PresupuestoLinea")) {
			jButtonPresupuestoLineaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Linea")) {
			jButtonLineaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ComisionGrupo")) {
			jButtonComisionGrupoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ProductoPuntoVenta")) {
			jButtonProductoPuntoVentaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ComisionLinea")) {
			jButtonComisionLineaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ComisionCate")) {
			jButtonComisionCateActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("DetallePlaneacionCompra")) {
			jButtonDetallePlaneacionCompraActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("CuentasContablesLineaProducto")) {
			jButtonCuentasContablesLineaProductoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Precio")) {
			jButtonPrecioActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("LineaPuntoVenta")) {
			jButtonLineaPuntoVentaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("DetalleCodigoBarraProducto")) {
			jButtonDetalleCodigoBarraProductoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("PresupuestoVentasLineas")) {
			jButtonPresupuestoVentasLineasActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("CentroCostoGrupoProducto")) {
			jButtonCentroCostoGrupoProductoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Producto")) {
			jButtonProductoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ComisionMarca")) {
			jButtonComisionMarcaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			linea=(Linea) lineaLogic.getLineas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			linea =(Linea) lineas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!linea.getIsNew() && !linea.getIsChanged() && !linea.getIsDeleted()) {
				sDescripcion=linea.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=linea.getempresa_descripcion();
			}
		}

		if(sTipo.equals("NivelLinea")) {
			//sDescripcion=this.getActualNivelLineaForeignKeyDescripcion((Long)value);
			if(!linea.getIsNew() && !linea.getIsChanged() && !linea.getIsDeleted()) {
				sDescripcion=linea.getnivellinea_descripcion();
			} else {
				//sDescripcion=this.getActualNivelLineaForeignKeyDescripcion((Long)value);
				sDescripcion=linea.getnivellinea_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!linea.getIsNew() && !linea.getIsChanged() && !linea.getIsDeleted()) {
				sDescripcion=linea.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=linea.getlinea_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Linea lineaRow=new Linea();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			lineaRow=(Linea) lineaLogic.getLineas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			lineaRow=(Linea) lineas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonPresupuestoLineaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Linea linea) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormLinea==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.linea = (Linea)this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.linea = (Linea)this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(linea!=null) {
						this.linea = linea;
					} else {
						this.linea = new Linea();
					}
				}

				if(this.isTienePermisosPresupuestoLinea && this.permiteMantenimiento(this.linea)) {
					PresupuestoLineaBeanSwingJInternalFrame presupuestolineaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFramePopup=new PresupuestoLineaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						presupuestolineaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFramePopup;
					} else {
						presupuestolineaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame;
					}

					List<Linea> lineas=new ArrayList<Linea>();
					lineas.add(this.linea);
					if(!esRelacionado) {
						//presupuestolineaBeanSwingJInternalFrame.presupuestolineaSessionBean.setConGuardarRelaciones(false);
						//presupuestolineaBeanSwingJInternalFrame.presupuestolineaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					presupuestolineaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormLinea.cargarPresupuestoLineaBeanSwingJInternalFrame(lineas,this.linea,presupuestolineaBeanSwingJInternalFrame,/*conInicializar,*/presupuestolineaBeanSwingJInternalFrame.presupuestolineaSessionBean.getConGuardarRelaciones(),presupuestolineaBeanSwingJInternalFrame.presupuestolineaSessionBean.getEsGuardarRelacionado());
					presupuestolineaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						presupuestolineaBeanSwingJInternalFrame.actualizarEstadoPanelsPresupuestoLinea("no_relacionado");

						presupuestolineaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PresupuestoLineaConstantesFunciones.ITAMANIOFILATABLA + (PresupuestoLineaConstantesFunciones.ITAMANIOFILATABLA/2));

						presupuestolineaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderLinea=(TitledBorder)this.jScrollPanelDatosLinea.getBorder();
						TitledBorder titledBorderPresupuestoLinea=(TitledBorder)presupuestolineaBeanSwingJInternalFrame.jScrollPanelDatosPresupuestoLinea.getBorder();

						titledBorderPresupuestoLinea.setTitle(titledBorderLinea.getTitle() + " -> Presupuesto Linea");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,presupuestolineaBeanSwingJInternalFrame);
						}

						presupuestolineaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(presupuestolineaBeanSwingJInternalFrame);

						presupuestolineaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.lineaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Presupuesto Linea",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonLineaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Linea linea) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormLinea==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.linea = (Linea)this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.linea = (Linea)this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(linea!=null) {
						this.linea = linea;
					} else {
						this.linea = new Linea();
					}
				}

				if(this.isTienePermisosLinea && this.permiteMantenimiento(this.linea)) {
					LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFramePopup=new LineaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						lineaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFramePopup;
					} else {
						lineaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame;
					}

					List<Linea> lineas=new ArrayList<Linea>();
					lineas.add(this.linea);
					if(!esRelacionado) {
						//lineaBeanSwingJInternalFrame.lineaSessionBean.setConGuardarRelaciones(false);
						//lineaBeanSwingJInternalFrame.lineaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					lineaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormLinea.cargarLineaBeanSwingJInternalFrame(lineas,this.linea,lineaBeanSwingJInternalFrame,/*conInicializar,*/lineaBeanSwingJInternalFrame.lineaSessionBean.getConGuardarRelaciones(),lineaBeanSwingJInternalFrame.lineaSessionBean.getEsGuardarRelacionado());
					lineaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						lineaBeanSwingJInternalFrame.actualizarEstadoPanelsLinea("no_relacionado");

						lineaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(LineaConstantesFunciones.ITAMANIOFILATABLA + (LineaConstantesFunciones.ITAMANIOFILATABLA/2));

						lineaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderLinea=(TitledBorder)this.jScrollPanelDatosLinea.getBorder();
						titledBorderLinea.setTitle(titledBorderLinea.getTitle() + " -> Linea");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,lineaBeanSwingJInternalFrame);
						}

						lineaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(lineaBeanSwingJInternalFrame);

						lineaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.lineaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Linea",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonComisionGrupoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Linea linea) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormLinea==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.linea = (Linea)this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.linea = (Linea)this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(linea!=null) {
						this.linea = linea;
					} else {
						this.linea = new Linea();
					}
				}

				if(this.isTienePermisosComisionGrupo && this.permiteMantenimiento(this.linea)) {
					ComisionGrupoBeanSwingJInternalFrame comisiongrupoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFramePopup=new ComisionGrupoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						comisiongrupoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFramePopup;
					} else {
						comisiongrupoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame;
					}

					List<Linea> lineas=new ArrayList<Linea>();
					lineas.add(this.linea);
					if(!esRelacionado) {
						//comisiongrupoBeanSwingJInternalFrame.comisiongrupoSessionBean.setConGuardarRelaciones(false);
						//comisiongrupoBeanSwingJInternalFrame.comisiongrupoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					comisiongrupoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormLinea.cargarComisionGrupoBeanSwingJInternalFrame(lineas,this.linea,comisiongrupoBeanSwingJInternalFrame,/*conInicializar,*/comisiongrupoBeanSwingJInternalFrame.comisiongrupoSessionBean.getConGuardarRelaciones(),comisiongrupoBeanSwingJInternalFrame.comisiongrupoSessionBean.getEsGuardarRelacionado());
					comisiongrupoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						comisiongrupoBeanSwingJInternalFrame.actualizarEstadoPanelsComisionGrupo("no_relacionado");

						comisiongrupoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ComisionGrupoConstantesFunciones.ITAMANIOFILATABLA + (ComisionGrupoConstantesFunciones.ITAMANIOFILATABLA/2));

						comisiongrupoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderLinea=(TitledBorder)this.jScrollPanelDatosLinea.getBorder();
						TitledBorder titledBorderComisionGrupo=(TitledBorder)comisiongrupoBeanSwingJInternalFrame.jScrollPanelDatosComisionGrupo.getBorder();

						titledBorderComisionGrupo.setTitle(titledBorderLinea.getTitle() + " -> Comision Grupo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,comisiongrupoBeanSwingJInternalFrame);
						}

						comisiongrupoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(comisiongrupoBeanSwingJInternalFrame);

						comisiongrupoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.lineaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Comision Grupo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonProductoPuntoVentaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Linea linea) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormLinea==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.linea = (Linea)this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.linea = (Linea)this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(linea!=null) {
						this.linea = linea;
					} else {
						this.linea = new Linea();
					}
				}

				if(this.isTienePermisosProductoPuntoVenta && this.permiteMantenimiento(this.linea)) {
					ProductoPuntoVentaBeanSwingJInternalFrame productopuntoventaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFramePopup=new ProductoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productopuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFramePopup;
					} else {
						productopuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame;
					}

					List<Linea> lineas=new ArrayList<Linea>();
					lineas.add(this.linea);
					if(!esRelacionado) {
						//productopuntoventaBeanSwingJInternalFrame.productopuntoventaSessionBean.setConGuardarRelaciones(false);
						//productopuntoventaBeanSwingJInternalFrame.productopuntoventaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productopuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormLinea.cargarProductoPuntoVentaBeanSwingJInternalFrame(lineas,this.linea,productopuntoventaBeanSwingJInternalFrame,/*conInicializar,*/productopuntoventaBeanSwingJInternalFrame.productopuntoventaSessionBean.getConGuardarRelaciones(),productopuntoventaBeanSwingJInternalFrame.productopuntoventaSessionBean.getEsGuardarRelacionado());
					productopuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoPuntoVenta("no_relacionado");

						productopuntoventaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA + (ProductoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA/2));

						productopuntoventaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderLinea=(TitledBorder)this.jScrollPanelDatosLinea.getBorder();
						TitledBorder titledBorderProductoPuntoVenta=(TitledBorder)productopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosProductoPuntoVenta.getBorder();

						titledBorderProductoPuntoVenta.setTitle(titledBorderLinea.getTitle() + " -> Producto Punto Venta");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productopuntoventaBeanSwingJInternalFrame);
						}

						productopuntoventaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productopuntoventaBeanSwingJInternalFrame);

						productopuntoventaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.lineaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Producto Punto Venta",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonComisionLineaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Linea linea) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormLinea==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.linea = (Linea)this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.linea = (Linea)this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(linea!=null) {
						this.linea = linea;
					} else {
						this.linea = new Linea();
					}
				}

				if(this.isTienePermisosComisionLinea && this.permiteMantenimiento(this.linea)) {
					ComisionLineaBeanSwingJInternalFrame comisionlineaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFramePopup=new ComisionLineaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						comisionlineaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFramePopup;
					} else {
						comisionlineaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame;
					}

					List<Linea> lineas=new ArrayList<Linea>();
					lineas.add(this.linea);
					if(!esRelacionado) {
						//comisionlineaBeanSwingJInternalFrame.comisionlineaSessionBean.setConGuardarRelaciones(false);
						//comisionlineaBeanSwingJInternalFrame.comisionlineaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					comisionlineaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormLinea.cargarComisionLineaBeanSwingJInternalFrame(lineas,this.linea,comisionlineaBeanSwingJInternalFrame,/*conInicializar,*/comisionlineaBeanSwingJInternalFrame.comisionlineaSessionBean.getConGuardarRelaciones(),comisionlineaBeanSwingJInternalFrame.comisionlineaSessionBean.getEsGuardarRelacionado());
					comisionlineaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						comisionlineaBeanSwingJInternalFrame.actualizarEstadoPanelsComisionLinea("no_relacionado");

						comisionlineaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ComisionLineaConstantesFunciones.ITAMANIOFILATABLA + (ComisionLineaConstantesFunciones.ITAMANIOFILATABLA/2));

						comisionlineaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderLinea=(TitledBorder)this.jScrollPanelDatosLinea.getBorder();
						TitledBorder titledBorderComisionLinea=(TitledBorder)comisionlineaBeanSwingJInternalFrame.jScrollPanelDatosComisionLinea.getBorder();

						titledBorderComisionLinea.setTitle(titledBorderLinea.getTitle() + " -> Comision Linea");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,comisionlineaBeanSwingJInternalFrame);
						}

						comisionlineaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(comisionlineaBeanSwingJInternalFrame);

						comisionlineaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.lineaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Comision Linea",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonComisionCateActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Linea linea) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormLinea==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.linea = (Linea)this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.linea = (Linea)this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(linea!=null) {
						this.linea = linea;
					} else {
						this.linea = new Linea();
					}
				}

				if(this.isTienePermisosComisionCate && this.permiteMantenimiento(this.linea)) {
					ComisionCateBeanSwingJInternalFrame comisioncateBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFramePopup=new ComisionCateBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						comisioncateBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFramePopup;
					} else {
						comisioncateBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame;
					}

					List<Linea> lineas=new ArrayList<Linea>();
					lineas.add(this.linea);
					if(!esRelacionado) {
						//comisioncateBeanSwingJInternalFrame.comisioncateSessionBean.setConGuardarRelaciones(false);
						//comisioncateBeanSwingJInternalFrame.comisioncateSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					comisioncateBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormLinea.cargarComisionCateBeanSwingJInternalFrame(lineas,this.linea,comisioncateBeanSwingJInternalFrame,/*conInicializar,*/comisioncateBeanSwingJInternalFrame.comisioncateSessionBean.getConGuardarRelaciones(),comisioncateBeanSwingJInternalFrame.comisioncateSessionBean.getEsGuardarRelacionado());
					comisioncateBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						comisioncateBeanSwingJInternalFrame.actualizarEstadoPanelsComisionCate("no_relacionado");

						comisioncateBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ComisionCateConstantesFunciones.ITAMANIOFILATABLA + (ComisionCateConstantesFunciones.ITAMANIOFILATABLA/2));

						comisioncateBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderLinea=(TitledBorder)this.jScrollPanelDatosLinea.getBorder();
						TitledBorder titledBorderComisionCate=(TitledBorder)comisioncateBeanSwingJInternalFrame.jScrollPanelDatosComisionCate.getBorder();

						titledBorderComisionCate.setTitle(titledBorderLinea.getTitle() + " -> Comision Cate");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,comisioncateBeanSwingJInternalFrame);
						}

						comisioncateBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(comisioncateBeanSwingJInternalFrame);

						comisioncateBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.lineaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Comision Cate",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonDetallePlaneacionCompraActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Linea linea) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormLinea==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.linea = (Linea)this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.linea = (Linea)this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(linea!=null) {
						this.linea = linea;
					} else {
						this.linea = new Linea();
					}
				}

				if(this.isTienePermisosDetallePlaneacionCompra && this.permiteMantenimiento(this.linea)) {
					DetallePlaneacionCompraBeanSwingJInternalFrame detalleplaneacioncompraBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFramePopup=new DetallePlaneacionCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleplaneacioncompraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFramePopup;
					} else {
						detalleplaneacioncompraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame;
					}

					List<Linea> lineas=new ArrayList<Linea>();
					lineas.add(this.linea);
					if(!esRelacionado) {
						//detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraSessionBean.setConGuardarRelaciones(false);
						//detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleplaneacioncompraBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormLinea.cargarDetallePlaneacionCompraBeanSwingJInternalFrame(lineas,this.linea,detalleplaneacioncompraBeanSwingJInternalFrame,/*conInicializar,*/detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraSessionBean.getConGuardarRelaciones(),detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado());
					detalleplaneacioncompraBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleplaneacioncompraBeanSwingJInternalFrame.actualizarEstadoPanelsDetallePlaneacionCompra("no_relacionado");

						detalleplaneacioncompraBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetallePlaneacionCompraConstantesFunciones.ITAMANIOFILATABLA + (DetallePlaneacionCompraConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleplaneacioncompraBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderLinea=(TitledBorder)this.jScrollPanelDatosLinea.getBorder();
						TitledBorder titledBorderDetallePlaneacionCompra=(TitledBorder)detalleplaneacioncompraBeanSwingJInternalFrame.jScrollPanelDatosDetallePlaneacionCompra.getBorder();

						titledBorderDetallePlaneacionCompra.setTitle(titledBorderLinea.getTitle() + " -> Detalle Planeacion Compra");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleplaneacioncompraBeanSwingJInternalFrame);
						}

						detalleplaneacioncompraBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleplaneacioncompraBeanSwingJInternalFrame);

						detalleplaneacioncompraBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.lineaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Planeacion Compra",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonCuentasContablesLineaProductoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Linea linea) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormLinea==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.linea = (Linea)this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.linea = (Linea)this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(linea!=null) {
						this.linea = linea;
					} else {
						this.linea = new Linea();
					}
				}

				if(this.isTienePermisosCuentasContablesLineaProducto && this.permiteMantenimiento(this.linea)) {
					CuentasContablesLineaProductoBeanSwingJInternalFrame cuentascontableslineaproductoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFramePopup=new CuentasContablesLineaProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cuentascontableslineaproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFramePopup;
					} else {
						cuentascontableslineaproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame;
					}

					List<Linea> lineas=new ArrayList<Linea>();
					lineas.add(this.linea);
					if(!esRelacionado) {
						//cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoSessionBean.setConGuardarRelaciones(false);
						//cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cuentascontableslineaproductoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormLinea.cargarCuentasContablesLineaProductoBeanSwingJInternalFrame(lineas,this.linea,cuentascontableslineaproductoBeanSwingJInternalFrame,/*conInicializar,*/cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoSessionBean.getConGuardarRelaciones(),cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado());
					cuentascontableslineaproductoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cuentascontableslineaproductoBeanSwingJInternalFrame.actualizarEstadoPanelsCuentasContablesLineaProducto("no_relacionado");

						cuentascontableslineaproductoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CuentasContablesLineaProductoConstantesFunciones.ITAMANIOFILATABLA + (CuentasContablesLineaProductoConstantesFunciones.ITAMANIOFILATABLA/2));

						cuentascontableslineaproductoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderLinea=(TitledBorder)this.jScrollPanelDatosLinea.getBorder();
						TitledBorder titledBorderCuentasContablesLineaProducto=(TitledBorder)cuentascontableslineaproductoBeanSwingJInternalFrame.jScrollPanelDatosCuentasContablesLineaProducto.getBorder();

						titledBorderCuentasContablesLineaProducto.setTitle(titledBorderLinea.getTitle() + " -> Cuentas Contables Linea Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentascontableslineaproductoBeanSwingJInternalFrame);
						}

						cuentascontableslineaproductoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cuentascontableslineaproductoBeanSwingJInternalFrame);

						cuentascontableslineaproductoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.lineaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cuentas Contables Linea Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonPrecioActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Linea linea) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormLinea==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.linea = (Linea)this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.linea = (Linea)this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(linea!=null) {
						this.linea = linea;
					} else {
						this.linea = new Linea();
					}
				}

				if(this.isTienePermisosPrecio && this.permiteMantenimiento(this.linea)) {
					PrecioBeanSwingJInternalFrame precioBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFramePopup=new PrecioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						precioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFramePopup;
					} else {
						precioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame;
					}

					List<Linea> lineas=new ArrayList<Linea>();
					lineas.add(this.linea);
					if(!esRelacionado) {
						//precioBeanSwingJInternalFrame.precioSessionBean.setConGuardarRelaciones(false);
						//precioBeanSwingJInternalFrame.precioSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					precioBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormLinea.cargarPrecioBeanSwingJInternalFrame(lineas,this.linea,precioBeanSwingJInternalFrame,/*conInicializar,*/precioBeanSwingJInternalFrame.precioSessionBean.getConGuardarRelaciones(),precioBeanSwingJInternalFrame.precioSessionBean.getEsGuardarRelacionado());
					precioBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						precioBeanSwingJInternalFrame.actualizarEstadoPanelsPrecio("no_relacionado");

						precioBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PrecioConstantesFunciones.ITAMANIOFILATABLA + (PrecioConstantesFunciones.ITAMANIOFILATABLA/2));

						precioBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderLinea=(TitledBorder)this.jScrollPanelDatosLinea.getBorder();
						TitledBorder titledBorderPrecio=(TitledBorder)precioBeanSwingJInternalFrame.jScrollPanelDatosPrecio.getBorder();

						titledBorderPrecio.setTitle(titledBorderLinea.getTitle() + " -> Precio");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,precioBeanSwingJInternalFrame);
						}

						precioBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(precioBeanSwingJInternalFrame);

						precioBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.lineaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Precio",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonLineaPuntoVentaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Linea linea) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormLinea==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.linea = (Linea)this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.linea = (Linea)this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(linea!=null) {
						this.linea = linea;
					} else {
						this.linea = new Linea();
					}
				}

				if(this.isTienePermisosLineaPuntoVenta && this.permiteMantenimiento(this.linea)) {
					LineaPuntoVentaBeanSwingJInternalFrame lineapuntoventaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFramePopup=new LineaPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						lineapuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFramePopup;
					} else {
						lineapuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame;
					}

					List<Linea> lineas=new ArrayList<Linea>();
					lineas.add(this.linea);
					if(!esRelacionado) {
						//lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaSessionBean.setConGuardarRelaciones(false);
						//lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					lineapuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormLinea.cargarLineaPuntoVentaBeanSwingJInternalFrame(lineas,this.linea,lineapuntoventaBeanSwingJInternalFrame,/*conInicializar,*/lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaSessionBean.getConGuardarRelaciones(),lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaSessionBean.getEsGuardarRelacionado());
					lineapuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						lineapuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsLineaPuntoVenta("no_relacionado");

						lineapuntoventaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(LineaPuntoVentaConstantesFunciones.ITAMANIOFILATABLA + (LineaPuntoVentaConstantesFunciones.ITAMANIOFILATABLA/2));

						lineapuntoventaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderLinea=(TitledBorder)this.jScrollPanelDatosLinea.getBorder();
						TitledBorder titledBorderLineaPuntoVenta=(TitledBorder)lineapuntoventaBeanSwingJInternalFrame.jScrollPanelDatosLineaPuntoVenta.getBorder();

						titledBorderLineaPuntoVenta.setTitle(titledBorderLinea.getTitle() + " -> Linea Punto Venta");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,lineapuntoventaBeanSwingJInternalFrame);
						}

						lineapuntoventaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(lineapuntoventaBeanSwingJInternalFrame);

						lineapuntoventaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.lineaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Linea Punto Venta",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonDetalleCodigoBarraProductoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Linea linea) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormLinea==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.linea = (Linea)this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.linea = (Linea)this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(linea!=null) {
						this.linea = linea;
					} else {
						this.linea = new Linea();
					}
				}

				if(this.isTienePermisosDetalleCodigoBarraProducto && this.permiteMantenimiento(this.linea)) {
					DetalleCodigoBarraProductoBeanSwingJInternalFrame detallecodigobarraproductoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFramePopup=new DetalleCodigoBarraProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detallecodigobarraproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFramePopup;
					} else {
						detallecodigobarraproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame;
					}

					List<Linea> lineas=new ArrayList<Linea>();
					lineas.add(this.linea);
					if(!esRelacionado) {
						//detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoSessionBean.setConGuardarRelaciones(false);
						//detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detallecodigobarraproductoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormLinea.cargarDetalleCodigoBarraProductoBeanSwingJInternalFrame(lineas,this.linea,detallecodigobarraproductoBeanSwingJInternalFrame,/*conInicializar,*/detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoSessionBean.getConGuardarRelaciones(),detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado());
					detallecodigobarraproductoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detallecodigobarraproductoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleCodigoBarraProducto("no_relacionado");

						detallecodigobarraproductoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleCodigoBarraProductoConstantesFunciones.ITAMANIOFILATABLA + (DetalleCodigoBarraProductoConstantesFunciones.ITAMANIOFILATABLA/2));

						detallecodigobarraproductoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderLinea=(TitledBorder)this.jScrollPanelDatosLinea.getBorder();
						TitledBorder titledBorderDetalleCodigoBarraProducto=(TitledBorder)detallecodigobarraproductoBeanSwingJInternalFrame.jScrollPanelDatosDetalleCodigoBarraProducto.getBorder();

						titledBorderDetalleCodigoBarraProducto.setTitle(titledBorderLinea.getTitle() + " -> Detalle Codigo Barra Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detallecodigobarraproductoBeanSwingJInternalFrame);
						}

						detallecodigobarraproductoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detallecodigobarraproductoBeanSwingJInternalFrame);

						detallecodigobarraproductoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.lineaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Codigo Barra Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonPresupuestoVentasLineasActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Linea linea) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormLinea==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.linea = (Linea)this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.linea = (Linea)this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(linea!=null) {
						this.linea = linea;
					} else {
						this.linea = new Linea();
					}
				}

				if(this.isTienePermisosPresupuestoVentasLineas && this.permiteMantenimiento(this.linea)) {
					PresupuestoVentasLineasBeanSwingJInternalFrame presupuestoventaslineasBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFramePopup=new PresupuestoVentasLineasBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						presupuestoventaslineasBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFramePopup;
					} else {
						presupuestoventaslineasBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame;
					}

					List<Linea> lineas=new ArrayList<Linea>();
					lineas.add(this.linea);
					if(!esRelacionado) {
						//presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasSessionBean.setConGuardarRelaciones(false);
						//presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					presupuestoventaslineasBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormLinea.cargarPresupuestoVentasLineasBeanSwingJInternalFrame(lineas,this.linea,presupuestoventaslineasBeanSwingJInternalFrame,/*conInicializar,*/presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasSessionBean.getConGuardarRelaciones(),presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasSessionBean.getEsGuardarRelacionado());
					presupuestoventaslineasBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						presupuestoventaslineasBeanSwingJInternalFrame.actualizarEstadoPanelsPresupuestoVentasLineas("no_relacionado");

						presupuestoventaslineasBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PresupuestoVentasLineasConstantesFunciones.ITAMANIOFILATABLA + (PresupuestoVentasLineasConstantesFunciones.ITAMANIOFILATABLA/2));

						presupuestoventaslineasBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderLinea=(TitledBorder)this.jScrollPanelDatosLinea.getBorder();
						TitledBorder titledBorderPresupuestoVentasLineas=(TitledBorder)presupuestoventaslineasBeanSwingJInternalFrame.jScrollPanelDatosPresupuestoVentasLineas.getBorder();

						titledBorderPresupuestoVentasLineas.setTitle(titledBorderLinea.getTitle() + " -> Presupuesto Ventas_lineas");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,presupuestoventaslineasBeanSwingJInternalFrame);
						}

						presupuestoventaslineasBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(presupuestoventaslineasBeanSwingJInternalFrame);

						presupuestoventaslineasBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.lineaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Presupuesto Ventas_lineas",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonCentroCostoGrupoProductoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Linea linea) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormLinea==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.linea = (Linea)this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.linea = (Linea)this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(linea!=null) {
						this.linea = linea;
					} else {
						this.linea = new Linea();
					}
				}

				if(this.isTienePermisosCentroCostoGrupoProducto && this.permiteMantenimiento(this.linea)) {
					CentroCostoGrupoProductoBeanSwingJInternalFrame centrocostogrupoproductoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFramePopup=new CentroCostoGrupoProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						centrocostogrupoproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFramePopup;
					} else {
						centrocostogrupoproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame;
					}

					List<Linea> lineas=new ArrayList<Linea>();
					lineas.add(this.linea);
					if(!esRelacionado) {
						//centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoSessionBean.setConGuardarRelaciones(false);
						//centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					centrocostogrupoproductoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormLinea.cargarCentroCostoGrupoProductoBeanSwingJInternalFrame(lineas,this.linea,centrocostogrupoproductoBeanSwingJInternalFrame,/*conInicializar,*/centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoSessionBean.getConGuardarRelaciones(),centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado());
					centrocostogrupoproductoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						centrocostogrupoproductoBeanSwingJInternalFrame.actualizarEstadoPanelsCentroCostoGrupoProducto("no_relacionado");

						centrocostogrupoproductoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CentroCostoGrupoProductoConstantesFunciones.ITAMANIOFILATABLA + (CentroCostoGrupoProductoConstantesFunciones.ITAMANIOFILATABLA/2));

						centrocostogrupoproductoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderLinea=(TitledBorder)this.jScrollPanelDatosLinea.getBorder();
						TitledBorder titledBorderCentroCostoGrupoProducto=(TitledBorder)centrocostogrupoproductoBeanSwingJInternalFrame.jScrollPanelDatosCentroCostoGrupoProducto.getBorder();

						titledBorderCentroCostoGrupoProducto.setTitle(titledBorderLinea.getTitle() + " -> Centro Costo Grupo Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,centrocostogrupoproductoBeanSwingJInternalFrame);
						}

						centrocostogrupoproductoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(centrocostogrupoproductoBeanSwingJInternalFrame);

						centrocostogrupoproductoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.lineaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Centro Costo Grupo Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonProductoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Linea linea) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormLinea==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.linea = (Linea)this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.linea = (Linea)this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(linea!=null) {
						this.linea = linea;
					} else {
						this.linea = new Linea();
					}
				}

				if(this.isTienePermisosProducto && this.permiteMantenimiento(this.linea)) {
					ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFramePopup=new ProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFramePopup;
					} else {
						productoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame;
					}

					List<Linea> lineas=new ArrayList<Linea>();
					lineas.add(this.linea);
					if(!esRelacionado) {
						//productoBeanSwingJInternalFrame.productoSessionBean.setConGuardarRelaciones(false);
						//productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormLinea.cargarProductoBeanSwingJInternalFrame(lineas,this.linea,productoBeanSwingJInternalFrame,/*conInicializar,*/productoBeanSwingJInternalFrame.productoSessionBean.getConGuardarRelaciones(),productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado());
					productoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoBeanSwingJInternalFrame.actualizarEstadoPanelsProducto("no_relacionado");

						productoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoConstantesFunciones.ITAMANIOFILATABLA + (ProductoConstantesFunciones.ITAMANIOFILATABLA/2));

						productoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderLinea=(TitledBorder)this.jScrollPanelDatosLinea.getBorder();
						TitledBorder titledBorderProducto=(TitledBorder)productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

						titledBorderProducto.setTitle(titledBorderLinea.getTitle() + " -> Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoBeanSwingJInternalFrame);
						}

						productoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoBeanSwingJInternalFrame);

						productoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.lineaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonComisionMarcaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Linea linea) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormLinea==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.linea = (Linea)this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.linea = (Linea)this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(linea!=null) {
						this.linea = linea;
					} else {
						this.linea = new Linea();
					}
				}

				if(this.isTienePermisosComisionMarca && this.permiteMantenimiento(this.linea)) {
					ComisionMarcaBeanSwingJInternalFrame comisionmarcaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFramePopup=new ComisionMarcaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						comisionmarcaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFramePopup;
					} else {
						comisionmarcaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame;
					}

					List<Linea> lineas=new ArrayList<Linea>();
					lineas.add(this.linea);
					if(!esRelacionado) {
						//comisionmarcaBeanSwingJInternalFrame.comisionmarcaSessionBean.setConGuardarRelaciones(false);
						//comisionmarcaBeanSwingJInternalFrame.comisionmarcaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					comisionmarcaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormLinea.cargarComisionMarcaBeanSwingJInternalFrame(lineas,this.linea,comisionmarcaBeanSwingJInternalFrame,/*conInicializar,*/comisionmarcaBeanSwingJInternalFrame.comisionmarcaSessionBean.getConGuardarRelaciones(),comisionmarcaBeanSwingJInternalFrame.comisionmarcaSessionBean.getEsGuardarRelacionado());
					comisionmarcaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						comisionmarcaBeanSwingJInternalFrame.actualizarEstadoPanelsComisionMarca("no_relacionado");

						comisionmarcaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ComisionMarcaConstantesFunciones.ITAMANIOFILATABLA + (ComisionMarcaConstantesFunciones.ITAMANIOFILATABLA/2));

						comisionmarcaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderLinea=(TitledBorder)this.jScrollPanelDatosLinea.getBorder();
						TitledBorder titledBorderComisionMarca=(TitledBorder)comisionmarcaBeanSwingJInternalFrame.jScrollPanelDatosComisionMarca.getBorder();

						titledBorderComisionMarca.setTitle(titledBorderLinea.getTitle() + " -> Comision Marca");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,comisionmarcaBeanSwingJInternalFrame);
						}

						comisionmarcaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(comisionmarcaBeanSwingJInternalFrame);

						comisionmarcaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.lineaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Comision Marca",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualLinea(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoLinea.setVisible((this.isVisibilidadCeldaNuevoLinea && this.isPermisoNuevoLinea));			
			this.jButtonDuplicarLinea.setVisible((this.isVisibilidadCeldaDuplicarLinea && this.isPermisoDuplicarLinea));			
			this.jButtonCopiarLinea.setVisible((this.isVisibilidadCeldaCopiarLinea && this.isPermisoCopiarLinea));
			this.jButtonVerFormLinea.setVisible((this.isVisibilidadCeldaVerFormLinea && this.isPermisoVerFormLinea));
			
			this.jButtonAbrirOrderByLinea.setVisible((this.isVisibilidadCeldaOrdenLinea && this.isPermisoOrdenLinea));			
			
			this.jButtonNuevoRelacionesLinea.setVisible((this.isVisibilidadCeldaNuevoRelacionesLinea && this.isPermisoNuevoLinea));			
			this.jButtonNuevoGuardarCambiosLinea.setVisible((this.isVisibilidadCeldaNuevoLinea && this.isPermisoNuevoLinea && this.isPermisoGuardarCambiosLinea));
			
			if(this.jInternalFrameDetalleFormLinea!=null) {
			this.jInternalFrameDetalleFormLinea.jButtonModificarLinea.setVisible((this.isVisibilidadCeldaModificarLinea && this.isPermisoActualizarLinea));	
			this.jInternalFrameDetalleFormLinea.jButtonActualizarLinea.setVisible((this.isVisibilidadCeldaActualizarLinea && this.isPermisoActualizarLinea));	
			this.jInternalFrameDetalleFormLinea.jButtonEliminarLinea.setVisible((this.isVisibilidadCeldaEliminarLinea && this.isPermisoEliminarLinea));
			this.jInternalFrameDetalleFormLinea.jButtonCancelarLinea.setVisible(this.isVisibilidadCeldaCancelarLinea);							
			this.jInternalFrameDetalleFormLinea.jButtonGuardarCambiosLinea.setVisible((this.isVisibilidadCeldaGuardarLinea && this.isPermisoGuardarCambiosLinea));			
			
			}
						
			this.jButtonGuardarCambiosTablaLinea.setVisible((this.isVisibilidadCeldaGuardarCambiosLinea && this.isPermisoGuardarCambiosLinea));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarLinea.setVisible((this.isVisibilidadCeldaNuevoLinea && this.isPermisoNuevoLinea));						
			this.jButtonDuplicarToolBarLinea.setVisible((this.isVisibilidadCeldaDuplicarLinea && this.isPermisoDuplicarLinea));						
			this.jButtonCopiarToolBarLinea.setVisible((this.isVisibilidadCeldaCopiarLinea && this.isPermisoCopiarLinea));			
			this.jButtonVerFormToolBarLinea.setVisible((this.isVisibilidadCeldaVerFormLinea && this.isPermisoVerFormLinea));			
			this.jButtonAbrirOrderByToolBarLinea.setVisible((this.isVisibilidadCeldaOrdenLinea && this.isPermisoOrdenLinea));
			this.jButtonNuevoRelacionesToolBarLinea.setVisible((this.isVisibilidadCeldaNuevoRelacionesLinea && this.isPermisoNuevoLinea));			
			this.jButtonNuevoGuardarCambiosToolBarLinea.setVisible((this.isVisibilidadCeldaNuevoLinea && this.isPermisoNuevoLinea && this.isPermisoGuardarCambiosLinea));			
			
			if(this.jInternalFrameDetalleFormLinea!=null) {
			this.jInternalFrameDetalleFormLinea.jButtonModificarToolBarLinea.setVisible((this.isVisibilidadCeldaModificarLinea && this.isPermisoActualizarLinea));	
			this.jInternalFrameDetalleFormLinea.jButtonActualizarToolBarLinea.setVisible((this.isVisibilidadCeldaActualizarLinea  && this.isPermisoActualizarLinea));	
			this.jInternalFrameDetalleFormLinea.jButtonEliminarToolBarLinea.setVisible((this.isVisibilidadCeldaEliminarLinea && this.isPermisoEliminarLinea));
			this.jInternalFrameDetalleFormLinea.jButtonCancelarToolBarLinea.setVisible(this.isVisibilidadCeldaCancelarLinea);				
			this.jInternalFrameDetalleFormLinea.jButtonGuardarCambiosToolBarLinea.setVisible((this.isVisibilidadCeldaGuardarLinea && this.isPermisoGuardarCambiosLinea));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarLinea.setVisible((this.isVisibilidadCeldaGuardarCambiosLinea && this.isPermisoGuardarCambiosLinea));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoLinea.setVisible((this.isVisibilidadCeldaNuevoLinea && this.isPermisoNuevoLinea));			
			this.jMenuItemDuplicarLinea.setVisible((this.isVisibilidadCeldaDuplicarLinea && this.isPermisoDuplicarLinea));			
			this.jMenuItemCopiarLinea.setVisible((this.isVisibilidadCeldaCopiarLinea && this.isPermisoCopiarLinea));			
			this.jMenuItemVerFormLinea.setVisible((this.isVisibilidadCeldaVerFormLinea && this.isPermisoVerFormLinea));			
			this.jMenuItemAbrirOrderByLinea.setVisible((this.isVisibilidadCeldaOrdenLinea && this.isPermisoOrdenLinea));			
			//this.jMenuItemMostrarOcultarLinea.setVisible((this.isVisibilidadCeldaOrdenLinea && this.isPermisoOrdenLinea));
			this.jMenuItemDetalleAbrirOrderByLinea.setVisible((this.isVisibilidadCeldaOrdenLinea && this.isPermisoOrdenLinea));			
			//this.jMenuItemDetalleMostrarOcultarLinea.setVisible((this.isVisibilidadCeldaOrdenLinea && this.isPermisoOrdenLinea));			
			this.jMenuItemNuevoRelacionesLinea.setVisible((this.isVisibilidadCeldaNuevoRelacionesLinea && this.isPermisoNuevoLinea));			
			this.jMenuItemNuevoGuardarCambiosLinea.setVisible((this.isVisibilidadCeldaNuevoLinea && this.isPermisoNuevoLinea && this.isPermisoGuardarCambiosLinea));									
			
			if(this.jInternalFrameDetalleFormLinea!=null) {
			this.jInternalFrameDetalleFormLinea.jMenuItemModificarLinea.setVisible((this.isVisibilidadCeldaModificarLinea && this.isPermisoActualizarLinea));	
			this.jInternalFrameDetalleFormLinea.jMenuItemActualizarLinea.setVisible((this.isVisibilidadCeldaActualizarLinea && this.isPermisoActualizarLinea));	
			this.jInternalFrameDetalleFormLinea.jMenuItemEliminarLinea.setVisible((this.isVisibilidadCeldaEliminarLinea && this.isPermisoEliminarLinea));
			this.jInternalFrameDetalleFormLinea.jMenuItemCancelarLinea.setVisible(this.isVisibilidadCeldaCancelarLinea);				
			}
			
			this.jMenuItemGuardarCambiosLinea.setVisible((this.isVisibilidadCeldaGuardarLinea && this.isPermisoGuardarCambiosLinea));						
			this.jMenuItemGuardarCambiosTablaLinea.setVisible((this.isVisibilidadCeldaGuardarCambiosLinea && this.isPermisoGuardarCambiosLinea));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoLinea=this.jButtonNuevoLinea.isVisible();
			this.isVisibilidadCeldaDuplicarLinea=this.jButtonDuplicarLinea.isVisible();
			this.isVisibilidadCeldaCopiarLinea=this.jButtonCopiarLinea.isVisible();
			this.isVisibilidadCeldaVerFormLinea=this.jButtonVerFormLinea.isVisible();
			
			this.isVisibilidadCeldaOrdenLinea=this.jButtonAbrirOrderByLinea.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesLinea=this.jButtonNuevoRelacionesLinea.isVisible();
			this.isVisibilidadCeldaModificarLinea=this.jButtonModificarLinea.isVisible();
			
			if(this.jInternalFrameDetalleFormLinea!=null) {
			this.isVisibilidadCeldaActualizarLinea=this.jInternalFrameDetalleFormLinea.jButtonActualizarLinea.isVisible();
			this.isVisibilidadCeldaEliminarLinea=this.jInternalFrameDetalleFormLinea.jButtonEliminarLinea.isVisible();
			this.isVisibilidadCeldaCancelarLinea=this.jInternalFrameDetalleFormLinea.jButtonCancelarLinea.isVisible();
			this.isVisibilidadCeldaGuardarLinea=this.jInternalFrameDetalleFormLinea.jButtonGuardarCambiosLinea.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosLinea=this.jButtonGuardarCambiosTablaLinea.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoLinea=this.jButtonNuevoToolBarLinea.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesLinea=this.jButtonNuevoRelacionesToolBarLinea.isVisible();
			
			if(this.jInternalFrameDetalleFormLinea!=null) {
			this.isVisibilidadCeldaModificarLinea=this.jInternalFrameDetalleFormLinea.jButtonModificarToolBarLinea.isVisible();
			this.isVisibilidadCeldaActualizarLinea=this.jInternalFrameDetalleFormLinea.jButtonActualizarToolBarLinea.isVisible();
			this.isVisibilidadCeldaEliminarLinea=this.jInternalFrameDetalleFormLinea.jButtonEliminarToolBarLinea.isVisible();
			this.isVisibilidadCeldaCancelarLinea=this.jInternalFrameDetalleFormLinea.jButtonCancelarToolBarLinea.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarLinea=this.jButtonGuardarCambiosToolBarLinea.isVisible();
			this.isVisibilidadCeldaGuardarCambiosLinea=this.jButtonGuardarCambiosTablaToolBarLinea.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoLinea=this.jMenuItemNuevoLinea.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesLinea=this.jMenuItemNuevoRelacionesLinea.isVisible();
			
			if(this.jInternalFrameDetalleFormLinea!=null) {
			this.isVisibilidadCeldaModificarLinea=this.jInternalFrameDetalleFormLinea.jMenuItemModificarLinea.isVisible();
			this.isVisibilidadCeldaActualizarLinea=this.jInternalFrameDetalleFormLinea.jMenuItemActualizarLinea.isVisible();
			this.isVisibilidadCeldaEliminarLinea=this.jInternalFrameDetalleFormLinea.jMenuItemEliminarLinea.isVisible();
			this.isVisibilidadCeldaCancelarLinea=this.jInternalFrameDetalleFormLinea.jMenuItemCancelarLinea.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarLinea=this.jMenuItemGuardarCambiosLinea.isVisible();
			this.isVisibilidadCeldaGuardarCambiosLinea=this.jMenuItemGuardarCambiosTablaLinea.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesLinea(Boolean esInicializar) {
		if(LineaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.lineaSessionBean.getConGuardarRelaciones()) {
				//if(this.lineaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesLinea();
			}
			
			this.inicializarActualizarBindingBotonesManualLinea(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualLinea() {
		this.jButtonNuevoLinea.setVisible(this.isPermisoNuevoLinea);			
		this.jButtonDuplicarLinea.setVisible(this.isPermisoDuplicarLinea);			
		this.jButtonCopiarLinea.setVisible(this.isPermisoCopiarLinea);			
		this.jButtonVerFormLinea.setVisible(this.isPermisoVerFormLinea);			
		
		this.jButtonAbrirOrderByLinea.setVisible(this.isPermisoOrdenLinea);					
		
		this.jButtonNuevoRelacionesLinea.setVisible(this.isPermisoNuevoLinea);			
		
		if(this.jInternalFrameDetalleFormLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLinea.jButtonModificarLinea.setVisible(this.isPermisoActualizarLinea);	
			this.jInternalFrameDetalleFormLinea.jButtonActualizarLinea.setVisible(this.isPermisoActualizarLinea);	
			this.jInternalFrameDetalleFormLinea.jButtonEliminarLinea.setVisible(this.isPermisoEliminarLinea);
			this.jInternalFrameDetalleFormLinea.jButtonCancelarLinea.setVisible(this.isVisibilidadCeldaCancelarLinea);						
			this.jInternalFrameDetalleFormLinea.jButtonGuardarCambiosLinea.setVisible(this.isPermisoGuardarCambiosLinea);							
		}
		
		this.jButtonGuardarCambiosTablaLinea.setVisible(this.isPermisoActualizarLinea);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleLinea() {
		this.jInternalFrameDetalleFormLinea.jButtonModificarLinea.setVisible(this.isPermisoActualizarLinea);	
		this.jInternalFrameDetalleFormLinea.jButtonActualizarLinea.setVisible(this.isPermisoActualizarLinea);	
		this.jInternalFrameDetalleFormLinea.jButtonEliminarLinea.setVisible(this.isPermisoEliminarLinea);
		this.jInternalFrameDetalleFormLinea.jButtonCancelarLinea.setVisible(this.isVisibilidadCeldaCancelarLinea);							
		this.jInternalFrameDetalleFormLinea.jButtonGuardarCambiosLinea.setVisible((this.isVisibilidadCeldaGuardarLinea && this.isPermisoGuardarCambiosLinea));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosLinea() {
		if(LineaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualLinea();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesLinea() {
	}
	
	public void jTableDatosLineaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarLinea(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLinea(this.getlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.linea =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.linea =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.linea==null) {
						this.linea = new Linea();
					}

					this.setVariablesFormularioToObjetoActualLinea(this.linea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);
				}

				if(this.linea.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.linea.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaLineaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebLinea(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLinea.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLinea.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLinea.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.linea =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.linea =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLinea(this.getlinea(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.lineaLogic.getConnexion());

				if(this.linea.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.linea.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLinea=(TitledBorder)this.jScrollPanelDatosLinea.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderLinea.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLinea(this.getlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.linea =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.linea =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.linea==null) {
						this.linea = new Linea();
					}

					this.setVariablesFormularioToObjetoActualLinea(this.linea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);
				}

				if(this.linea.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.linea.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_nivel_lineaLineaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisonivellinea=true;

			idTienePermisonivellinea=this.tienePermisosUsuarioEnPaginaWebLinea(NivelLineaConstantesFunciones.CLASSNAME);

			if(idTienePermisonivellinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLinea.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLinea.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLinea.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.linea =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.linea =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLinea(this.getlinea(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);

				this.nivellineaBeanSwingJInternalFrame=new NivelLineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.nivellineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.nivellineaBeanSwingJInternalFrame.getNivelLineaLogic().setConnexion(this.lineaLogic.getConnexion());

				if(this.linea.getid_nivel_linea()!=null) {
					this.nivellineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.nivellineaBeanSwingJInternalFrame.setIdActual(this.linea.getid_nivel_linea());
					this.nivellineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.nivellineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.nivellineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaNivelLinea();
				}

				JInternalFrameBase jinternalFrame =this.nivellineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLinea=(TitledBorder)this.jScrollPanelDatosLinea.getBorder();
				TitledBorder titledBordernivellinea=(TitledBorder)this.nivellineaBeanSwingJInternalFrame.jScrollPanelDatosNivelLinea.getBorder();

				titledBordernivellinea.setTitle(titledBorderLinea.getTitle() + " -> Nivel Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_nivel_lineaLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLinea(this.getlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.linea =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.linea =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.linea==null) {
						this.linea = new Linea();
					}

					this.setVariablesFormularioToObjetoActualLinea(this.linea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);
				}

				if(this.linea.getid_nivel_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_nivel_linea = "+this.linea.getid_nivel_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaLineaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.lineaBeanSwingJInternalFrame.sTipoBusqueda="Linea";

			if(!this.sFinalQueryGeneral_linea.equals("")) {
				this.lineaBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_linea);
				this.lineaBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.lineaBeanSwingJInternalFrame.procesarBusqueda(this.lineaBeanSwingJInternalFrame.sAccionBusqueda);
				this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingLinea(false);
			}

			if(!this.sFinalQueryComboLinea.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderLinea=null;
			TitledBorder titledBorderlinea=null;

			if(!this.jScrollPanelDatosLinea.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderLinea=(TitledBorder)this.jScrollPanelDatosLinea.getBorder();
				titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderLinea.getTitle() + " -> Linea");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_lineaLineaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebLinea(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLinea.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLinea.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLinea.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.linea =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.linea =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLinea(this.getlinea(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.lineaLogic.getConnexion());

				if(this.linea.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.linea.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLinea=(TitledBorder)this.jScrollPanelDatosLinea.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderLinea.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLinea(this.getlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.linea =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.linea =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.linea==null) {
						this.linea = new Linea();
					}

					this.setVariablesFormularioToObjetoActualLinea(this.linea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);
				}

				if(this.linea.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.linea.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLinea(this.getlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.linea =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.linea =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.linea==null) {
						this.linea = new Linea();
					}

					this.setVariablesFormularioToObjetoActualLinea(this.linea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);
				}

				if(this.linea.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.linea.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLinea(this.getlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.linea =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.linea =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.linea==null) {
						this.linea = new Linea();
					}

					this.setVariablesFormularioToObjetoActualLinea(this.linea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);
				}

				if(this.linea.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.linea.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLinea(this.getlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.linea =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.linea =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.linea==null) {
						this.linea = new Linea();
					}

					this.setVariablesFormularioToObjetoActualLinea(this.linea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);
				}

				if(this.linea.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.linea.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoLineaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLinea(false,false);

			this.getLineasBusquedaPorCodigo();

			this.inicializarActualizarBindingLinea(false);

			//if(LineaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLinea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreLineaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLinea(false,false);

			this.getLineasBusquedaPorNombre();

			this.inicializarActualizarBindingLinea(false);

			//if(LineaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLinea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaLineaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLinea(false,false);

			this.getLineasFK_IdEmpresa();

			this.inicializarActualizarBindingLinea(false);

			//if(LineaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLinea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaLineaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLinea(false,false);

			this.getLineasFK_IdLinea();

			this.inicializarActualizarBindingLinea(false);

			//if(LineaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLinea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdNivelLineaLineaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLinea(false,false);

			this.getLineasFK_IdNivelLinea();

			this.inicializarActualizarBindingLinea(false);

			//if(LineaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLinea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameLinea() {
		if(this.jInternalFrameDetalleFormLinea!=null) {
		

		if(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormLinea!=null) {
			this.jInternalFrameDetalleFormLinea.setVisible(false);	    			
			this.jInternalFrameDetalleFormLinea.dispose();
			this.jInternalFrameDetalleFormLinea=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoLinea!=null) {
			this.jInternalFrameReporteDinamicoLinea.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoLinea.dispose();
			this.jInternalFrameReporteDinamicoLinea=null;
		}
		
		if(this.jInternalFrameImportacionLinea!=null) {
			this.jInternalFrameImportacionLinea.setVisible(false);	    			
			this.jInternalFrameImportacionLinea.dispose();
			this.jInternalFrameImportacionLinea=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	public void closingTreeFrameLinea() {
		
		if(this.jInternalFrameTreeLinea!=null) {
			this.jInternalFrameTreeLinea.setVisible(false);	    			
			this.jInternalFrameTreeLinea.dispose();
			this.jInternalFrameTreeLinea=null;
		}
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessLinea();
			
			LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
			
			
			if(sTipo.equals("NuevoLinea")) {
				jButtonNuevoLineaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarLinea")) {
				jButtonDuplicarLineaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarLinea")) {
				jButtonCopiarLineaActionPerformed(evt);
			} else if(sTipo.equals("VerFormLinea")) {
				jButtonVerFormLineaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarLinea")) {
				jButtonNuevoLineaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarLinea")) {
				jButtonDuplicarLineaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoLinea")) {
				jButtonNuevoLineaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarLinea")) {
				jButtonDuplicarLineaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesLinea")) {
				jButtonNuevoLineaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarLinea")) {
				jButtonNuevoLineaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesLinea")) {
				jButtonNuevoLineaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarLinea")) {
				jButtonModificarLineaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarLinea")) {
				jButtonModificarLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarLinea")) {
				jButtonModificarLineaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarLinea")) {
				jButtonActualizarLineaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarLinea")) {
				jButtonActualizarLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarLinea")) {
				jButtonActualizarLineaActionPerformed(evt);
			} else if(sTipo.equals("EliminarLinea")) {
				jButtonEliminarLineaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarLinea")) {
				jButtonEliminarLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarLinea")) {
				jButtonEliminarLineaActionPerformed(evt);
			} else if(sTipo.equals("CancelarLinea")) {
				jButtonCancelarLineaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarLinea")) {
				jButtonCancelarLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarLinea")) {
				jButtonCancelarLineaActionPerformed(evt);
			} else if(sTipo.equals("CerrarLinea")) {
				jButtonCerrarLineaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarLinea")) {
				jButtonCerrarLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarLinea")) {
				jButtonCerrarLineaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarLinea")) {
				jButtonMostrarOcultarLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarLinea")) {
				jButtonCancelarLineaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosLinea")) {
				jButtonGuardarCambiosLineaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarLinea")) {
				jButtonGuardarCambiosLineaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarLinea")) {
				jButtonCopiarLineaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarLinea")) {
				jButtonVerFormLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosLinea")) {
				jButtonGuardarCambiosLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarLinea")) {
				jButtonCopiarLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormLinea")) {
				jButtonVerFormLineaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaLinea")) {
				jButtonGuardarCambiosLineaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarLinea")) {
				jButtonGuardarCambiosLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaLinea")) {
				jButtonGuardarCambiosLineaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionLinea")) {
				jButtonRecargarInformacionLineaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarLinea")) {
				jButtonRecargarInformacionLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionLinea")) {
				jButtonRecargarInformacionLineaActionPerformed(evt);
			}
			else if(sTipo.equals("ArbolLinea")) {
				jButtonArbolLineaActionPerformed(evt);
			} 
			else if(sTipo.equals("AnterioresLinea")) {
				jButtonAnterioresLineaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarLinea")) {
				jButtonAnterioresLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreLinea")) {
				jButtonAnterioresLineaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesLinea")) {
				jButtonSiguientesLineaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarLinea")) {
				jButtonSiguientesLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesLinea")) {
				jButtonSiguientesLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByLinea") || sTipo.equals("MenuItemDetalleAbrirOrderByLinea")) {
				jButtonAbrirOrderByLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarLinea") || sTipo.equals("MenuItemDetalleMostrarOcultarLinea")) {
				jButtonMostrarOcultarLineaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosLinea")) {
				jButtonNuevoGuardarCambiosLineaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarLinea")) {
				jButtonNuevoGuardarCambiosLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosLinea")) {
				jButtonNuevoGuardarCambiosLineaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoLinea")) {
				jButtonCerrarReporteDinamicoLineaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoLinea")) {
				jButtonGenerarReporteDinamicoLineaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoLinea")) {
				
				jButtonGenerarExcelReporteDinamicoLineaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionLinea")) {
				jButtonCerrarImportacionLineaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionLinea")) {
				
				jButtonGenerarImportacionLineaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionLinea")) {
				
				jButtonAbrirImportacionLineaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesLinea")) {
				jComboBoxTiposAccionesLineaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesLinea")) {
				jComboBoxTiposRelacionesLineaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioLinea")) {
				jComboBoxTiposAccionesLineaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarLinea")) {
				
				jComboBoxTiposSeleccionarLineaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralLinea")) {
				jTextFieldValorCampoGeneralLineaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByLinea")) {
				jButtonAbrirOrderByLineaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarLinea")) {
				jButtonAbrirOrderByLineaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByLinea")) {
				jButtonCerrarOrderByLineaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idLineaBusqueda")) {
				this.jButtonidLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaLineaUpdate")) {
				this.jButtonid_empresaLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaLineaBusqueda")) {
				this.jButtonid_empresaLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_nivel_lineaLineaUpdate")) {
				this.jButtonid_nivel_lineaLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_nivel_lineaLineaBusqueda")) {
				this.jButtonid_nivel_lineaLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_lineaLinea")) {
				this.jButtonid_lineaLineaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_lineaLineaArbol")) {
				this.abrirFrameTreeLinea("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaLineaUpdate")) {
				this.jButtonid_lineaLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaLineaBusqueda")) {
				this.jButtonid_lineaLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoLineaBusqueda")) {
				this.jButtoncodigoLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreLineaBusqueda")) {
				this.jButtonnombreLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionLineaBusqueda")) {
				this.jButtondescripcionLineaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_lineaLinea")) {
				this.jButtonid_lineaLineaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("BusquedaPorCodigoLinea")) {
				this.jButtonBusquedaPorCodigoLineaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreLinea")) {
				this.jButtonBusquedaPorNombreLineaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdLineaLinea")) {
				this.jButtonFK_IdLineaLineaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdNivelLineaLinea")) {
				this.jButtonFK_IdNivelLineaLineaActionPerformed(evt);
			}
			
			;
			
			
			LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessLinea();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.linea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.linea);
				
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
				
				


				
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Linea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Linea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Linea lineaLocal=null;
			
			if(!this.getEsControlTabla()) {
				lineaLocal=this.linea;
			} else {
				lineaLocal=this.lineaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.linea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.linea);
				
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
							
				
				


				
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Linea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Linea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaAnterior =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineaAnterior =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
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
			
			LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
			
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
			
			


			
			LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.linea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.linea);
				
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
								
						
				


				
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Linea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Linea.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.linea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.linea);
				
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
								
				
				


				
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Linea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Linea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaAnterior =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineaAnterior =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.linea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.linea);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaAnterior =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineaAnterior =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.linea);
			
			this.actualizarInformacion("INFO_PADRE",false,this.linea);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.linea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.linea);
				
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
							
				
				


				
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Linea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Linea.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosLinea.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineaAnterior =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.lineaAnterior =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
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
			
			LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
			
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
			
			


			
			LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.linea);
			
			this.actualizarInformacion("INFO_PADRE",false,this.linea);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.linea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.linea);
				
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
								
				
				


				
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Linea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Linea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaAnterior =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineaAnterior =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.linea);
			
			this.actualizarInformacion("INFO_PADRE",false,this.linea);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.linea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.linea);
				
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosLinea")) {
					jCheckBoxSeleccionarTodosLineaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosLinea")) {
					jCheckBoxSeleccionadosLineaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarLinea")) {
					
				}
				
				


				
				
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Linea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Linea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.linea);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.linea);
				
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
												
				
				


				
				
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Linea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Linea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosLinea.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineaAnterior =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.lineaAnterior =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.linea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.linea);
				
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
				
				
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
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
			
			LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
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
			
			


			
			LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.linea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.linea);
				
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Linea.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Linea.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.linea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.linea);
				
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
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
				
				


				
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Linea.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Linea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaAnterior =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineaAnterior =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarLinea")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosLineaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosLinea.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.linea =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.linea =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.linea);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarLinea")) {
				
				}
				
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarLinea")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosLinea.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarLinea")) {
			
			}
			
			LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessLinea();
			
			LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
			
			if(sTipo.equals("NuevoLinea")) {
				jButtonNuevoLineaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarLinea")) {
				jButtonDuplicarLineaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarLinea")) {
				jButtonCopiarLineaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormLinea")) {
				jButtonVerFormLineaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesLinea")) {
				jButtonNuevoLineaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarLinea")) {
				jButtonModificarLineaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarLinea")) {
				jButtonActualizarLineaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarLinea")) {
				jButtonEliminarLineaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaLinea")) {
				jButtonGuardarCambiosLineaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarLinea")) {
				jButtonCancelarLineaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarLinea")) {
				jButtonCerrarLineaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosLinea")) {
				jButtonGuardarCambiosLineaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosLinea")) {
				jButtonNuevoGuardarCambiosLineaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByLinea")) {
				jButtonAbrirOrderByLineaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionLinea")) {
				jButtonRecargarInformacionLineaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresLinea")) {
				jButtonAnterioresLineaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesLinea")) {
				jButtonSiguientesLineaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idLineaBusqueda")) {
				this.jButtonidLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaLineaUpdate")) {
				this.jButtonid_empresaLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaLineaBusqueda")) {
				this.jButtonid_empresaLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_nivel_lineaLineaUpdate")) {
				this.jButtonid_nivel_lineaLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_nivel_lineaLineaBusqueda")) {
				this.jButtonid_nivel_lineaLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_lineaLinea")) {
				this.jButtonid_lineaLineaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_lineaLineaArbol")) {
				this.abrirFrameTreeLinea("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaLineaUpdate")) {
				this.jButtonid_lineaLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaLineaBusqueda")) {
				this.jButtonid_lineaLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoLineaBusqueda")) {
				this.jButtoncodigoLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreLineaBusqueda")) {
				this.jButtonnombreLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionLineaBusqueda")) {
				this.jButtondescripcionLineaBusquedaActionPerformed(evt);
			}
			
			LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessLinea();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameLinea")) {
				closingInternalFrameLinea();
				
			} else if(sTipo.equals("jButtonCancelarLinea")) {
				JInternalFrameBase jInternalFrameDetalleFormLinea = (JInternalFrameBase)evt.getSource();
	            	
	            LineaBeanSwingJInternalFrame jInternalFrameParent=(LineaBeanSwingJInternalFrame)jInternalFrameDetalleFormLinea.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarLineaActionPerformed(null);
			}
			
			LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.linea,new Object(),this.lineaParameterGeneral,this.lineaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormLinea(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormLinea(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormLinea(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.linea)) {
			if(!esControlTabla) {
				if(LineaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualLinea(this.linea,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);			
				}
				
				if(this.lineaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualLinea(this.linea,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.lineaReturnGeneral=lineaLogic.procesarEventosLineasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.lineaLogic.getLineas(),this.linea,this.lineaParameterGeneral,this.isEsNuevoLinea,classes);//this.lineaLogic.getLinea()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanLinea(this.lineaReturnGeneral,this.lineaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.lineaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanLinea(classes,this.lineaReturnGeneral,this.lineaBean,false);
					}
						
					if(this.lineaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyLinea(this.lineaReturnGeneral.getLinea());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioLinea(this.lineaReturnGeneral.getLinea());	
					}
						
					if(this.lineaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioLinea(this.lineaReturnGeneral.getLinea(),classes);//this.lineaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioLinea(this.linea,classes);//this.lineaBean);									
				}
			
				if(LineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualLinea(this.linea,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysLinea(this.linea);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.lineaAnterior!=null) {
						this.linea=this.lineaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.lineaReturnGeneral=lineaLogic.procesarEventosLineasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.lineaLogic.getLineas(),this.linea,this.lineaParameterGeneral,this.isEsNuevoLinea,classes);//this.lineaLogic.getLinea()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.lineaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.lineaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.lineaReturnGeneral.getLinea(),lineaLogic.getLineas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.lineaReturnGeneral.getLinea(),this.lineas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosLinea.repaint();
				
				//((AbstractTableModel) this.jTableDatosLinea.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosLinea();
			}
		}
	}
	
	public void actualizarVisualTableDatosLinea() throws Exception {
		
		LineaModel lineaModel=(LineaModel)this.jTableDatosLinea.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			lineaModel.lineas=this.lineaLogic.getLineas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			lineaModel.lineas=this.lineas;
		}
		
		
		((LineaModel) this.jTableDatosLinea.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaLinea() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getlineaAnterior(),this.lineaLogic.getLineas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getlineaAnterior(),this.lineas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosLinea();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioLinea(Linea linea,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PresupuestoLinea.class)) {
					this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineaLogic.setPresupuestoLineas(linea.getPresupuestoLineas());
					this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresupuestoLinea(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Linea.class)) {
					this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineaLogic.setLineas(linea.getLineas());
					this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionGrupo.class)) {
					this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.setComisionGrupos(linea.getComisionGrupoGrupos());
					this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionGrupo(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoPuntoVenta.class)) {
					this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventaLogic.setProductoPuntoVentas(linea.getProductoPuntoVentas());
					this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoPuntoVenta(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionLinea.class)) {
					this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.setComisionLineas(linea.getComisionLineas());
					this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionLinea(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionCate.class)) {
					this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncateLogic.setComisionCates(linea.getComisionCates());
					this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionCate(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetallePlaneacionCompra.class)) {
					this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.setDetallePlaneacionCompras(linea.getDetallePlaneacionCompras());
					this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetallePlaneacionCompra(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentasContablesLineaProducto.class)) {
					this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoLogic.setCuentasContablesLineaProductos(linea.getCuentasContablesLineaProductoCategorias());
					this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentasContablesLineaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Precio.class)) {
					this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precioLogic.setPrecios(linea.getPrecioGrupos());
					this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.inicializarActualizarBindingTablaPrecio(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(LineaPuntoVenta.class)) {
					this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaLogic.setLineaPuntoVentas(linea.getLineaPuntoVentaMarcas());
					this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLineaPuntoVenta(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleCodigoBarraProducto.class)) {
					this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoLogic.setDetalleCodigoBarraProductos(linea.getDetalleCodigoBarraProductoMarcas());
					this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleCodigoBarraProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PresupuestoVentasLineas.class)) {
					this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.setPresupuestoVentasLineass(linea.getPresupuestoVentasLineasMarcas());
					this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresupuestoVentasLineas(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CentroCostoGrupoProducto.class)) {
					this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoLogic.setCentroCostoGrupoProductos(linea.getCentroCostoGrupoProductos());
					this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCentroCostoGrupoProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productoLogic.setProductos(linea.getProductos());
					this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionMarca.class)) {
					this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.setComisionMarcas(linea.getComisionMarcaGrupos());
					this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionMarca(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
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
										
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.linea,new Object(),generalEntityParameterGeneral,this.lineaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.lineaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=LineaConstantesFunciones.getClassesRelationshipsOfLinea(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=LineaConstantesFunciones.getClassesRelationshipsFromStringsOfLinea(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormLinea(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				LineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.linea,new Object(),generalEntityParameterGeneral,this.lineaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioLinea(LineaBean lineaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PresupuestoLinea.class)) {
					this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineaLogic.setPresupuestoLineas(linea.getPresupuestoLineas());
					this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresupuestoLinea(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Linea.class)) {
					this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineaLogic.setLineas(linea.getLineas());
					this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionGrupo.class)) {
					this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.setComisionGrupos(linea.getComisionGrupoGrupos());
					this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionGrupo(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoPuntoVenta.class)) {
					this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventaLogic.setProductoPuntoVentas(linea.getProductoPuntoVentas());
					this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoPuntoVenta(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionLinea.class)) {
					this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.setComisionLineas(linea.getComisionLineas());
					this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionLinea(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionCate.class)) {
					this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncateLogic.setComisionCates(linea.getComisionCates());
					this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionCate(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetallePlaneacionCompra.class)) {
					this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.setDetallePlaneacionCompras(linea.getDetallePlaneacionCompras());
					this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetallePlaneacionCompra(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentasContablesLineaProducto.class)) {
					this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoLogic.setCuentasContablesLineaProductos(linea.getCuentasContablesLineaProductoCategorias());
					this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentasContablesLineaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Precio.class)) {
					this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precioLogic.setPrecios(linea.getPrecioGrupos());
					this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.inicializarActualizarBindingTablaPrecio(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(LineaPuntoVenta.class)) {
					this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaLogic.setLineaPuntoVentas(linea.getLineaPuntoVentaMarcas());
					this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLineaPuntoVenta(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleCodigoBarraProducto.class)) {
					this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoLogic.setDetalleCodigoBarraProductos(linea.getDetalleCodigoBarraProductoMarcas());
					this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleCodigoBarraProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PresupuestoVentasLineas.class)) {
					this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.setPresupuestoVentasLineass(linea.getPresupuestoVentasLineasMarcas());
					this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresupuestoVentasLineas(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CentroCostoGrupoProducto.class)) {
					this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoLogic.setCentroCostoGrupoProductos(linea.getCentroCostoGrupoProductos());
					this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCentroCostoGrupoProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productoLogic.setProductos(linea.getProductos());
					this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionMarca.class)) {
					this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.setComisionMarcas(linea.getComisionMarcaGrupos());
					this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionMarca(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanLinea(ArrayList<Classe> classes,LineaReturnGeneral lineaReturnGeneral,LineaBean lineaBean,Boolean conDefault) throws Exception {
		
			this.lineaBean.setPresupuestoLineas(lineaReturnGeneral.getLinea().getPresupuestoLineas());
			this.lineaBean.setLineas(lineaReturnGeneral.getLinea().getLineas());
			this.lineaBean.setComisionGrupos(lineaReturnGeneral.getLinea().getComisionGrupos());
			this.lineaBean.setProductoPuntoVentas(lineaReturnGeneral.getLinea().getProductoPuntoVentas());
			this.lineaBean.setComisionLineas(lineaReturnGeneral.getLinea().getComisionLineas());
			this.lineaBean.setComisionCates(lineaReturnGeneral.getLinea().getComisionCates());
			this.lineaBean.setDetallePlaneacionCompras(lineaReturnGeneral.getLinea().getDetallePlaneacionCompras());
			this.lineaBean.setCuentasContablesLineaProductos(lineaReturnGeneral.getLinea().getCuentasContablesLineaProductos());
			this.lineaBean.setPrecios(lineaReturnGeneral.getLinea().getPrecios());
			this.lineaBean.setLineaPuntoVentas(lineaReturnGeneral.getLinea().getLineaPuntoVentas());
			this.lineaBean.setDetalleCodigoBarraProductos(lineaReturnGeneral.getLinea().getDetalleCodigoBarraProductos());
			this.lineaBean.setPresupuestoVentasLineass(lineaReturnGeneral.getLinea().getPresupuestoVentasLineass());
			this.lineaBean.setCentroCostoGrupoProductos(lineaReturnGeneral.getLinea().getCentroCostoGrupoProductos());
			this.lineaBean.setProductos(lineaReturnGeneral.getLinea().getProductos());
			this.lineaBean.setComisionMarcas(lineaReturnGeneral.getLinea().getComisionMarcas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualLinea(Linea linea,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(PresupuestoLinea.class)) {
					linea.setPresupuestoLineas(this.jInternalFrameDetalleFormLinea.presupuestolineaBeanSwingJInternalFrame.presupuestolineaLogic.getPresupuestoLineas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Linea.class)) {
					linea.setLineas(this.jInternalFrameDetalleFormLinea.lineaBeanSwingJInternalFrame.lineaLogic.getLineas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionGrupo.class)) {
					linea.setComisionGrupoGrupos(this.jInternalFrameDetalleFormLinea.comisiongrupoBeanSwingJInternalFrame.comisiongrupoLogic.getComisionGrupos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoPuntoVenta.class)) {
					linea.setProductoPuntoVentas(this.jInternalFrameDetalleFormLinea.productopuntoventaBeanSwingJInternalFrame.productopuntoventaLogic.getProductoPuntoVentas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionLinea.class)) {
					linea.setComisionLineas(this.jInternalFrameDetalleFormLinea.comisionlineaBeanSwingJInternalFrame.comisionlineaLogic.getComisionLineas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionCate.class)) {
					linea.setComisionCates(this.jInternalFrameDetalleFormLinea.comisioncateBeanSwingJInternalFrame.comisioncateLogic.getComisionCates());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetallePlaneacionCompra.class)) {
					linea.setDetallePlaneacionCompras(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentasContablesLineaProducto.class)) {
					linea.setCuentasContablesLineaProductoCategorias(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoBeanSwingJInternalFrame.cuentascontableslineaproductoLogic.getCuentasContablesLineaProductos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Precio.class)) {
					linea.setPrecioGrupos(this.jInternalFrameDetalleFormLinea.precioBeanSwingJInternalFrame.precioLogic.getPrecios());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(LineaPuntoVenta.class)) {
					linea.setLineaPuntoVentaMarcas(this.jInternalFrameDetalleFormLinea.lineapuntoventaBeanSwingJInternalFrame.lineapuntoventaLogic.getLineaPuntoVentas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleCodigoBarraProducto.class)) {
					linea.setDetalleCodigoBarraProductoMarcas(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoBeanSwingJInternalFrame.detallecodigobarraproductoLogic.getDetalleCodigoBarraProductos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PresupuestoVentasLineas.class)) {
					linea.setPresupuestoVentasLineasMarcas(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasLogic.getPresupuestoVentasLineass());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CentroCostoGrupoProducto.class)) {
					linea.setCentroCostoGrupoProductos(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoBeanSwingJInternalFrame.centrocostogrupoproductoLogic.getCentroCostoGrupoProductos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					linea.setProductos(this.jInternalFrameDetalleFormLinea.productoBeanSwingJInternalFrame.productoLogic.getProductos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionMarca.class)) {
					linea.setComisionMarcaGrupos(this.jInternalFrameDetalleFormLinea.comisionmarcaBeanSwingJInternalFrame.comisionmarcaLogic.getComisionMarcas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.linea)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormLinea = new LineaDetalleFormJInternalFrame(jDesktopPane,this.lineaSessionBean.getConGuardarRelaciones(),this.lineaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormLinea);
		this.jInternalFrameDetalleFormLinea.setVisible(false);
		this.jInternalFrameDetalleFormLinea.setSelected(false);						
		
		this.jInternalFrameDetalleFormLinea.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormLinea.lineaLogic=this.lineaLogic;
		
		this.cargarCombosFrameForeignKeyLinea("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleLinea();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleLinea();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyLinea("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyLinea();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormLinea.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarLinea"));
		
		this.jInternalFrameDetalleFormLinea.jButtonModificarLinea.addActionListener(new ButtonActionListener(this,"ModificarLinea"));

		
		this.jInternalFrameDetalleFormLinea.jButtonModificarToolBarLinea.addActionListener(new ButtonActionListener(this,"ModificarToolBarLinea"));
					
		this.jInternalFrameDetalleFormLinea.jMenuItemModificarLinea.addActionListener(new ButtonActionListener(this,"MenuItemModificarLinea"));		
		
		
		
		this.jInternalFrameDetalleFormLinea.jButtonActualizarLinea.addActionListener (new ButtonActionListener(this,"ActualizarLinea"));
		
		
		this.jInternalFrameDetalleFormLinea.jButtonActualizarToolBarLinea.addActionListener(new ButtonActionListener(this,"ActualizarToolBarLinea"));
						
		this.jInternalFrameDetalleFormLinea.jMenuItemActualizarLinea.addActionListener (new ButtonActionListener(this,"MenuItemActualizarLinea"));		
		
		
		
		this.jInternalFrameDetalleFormLinea.jButtonEliminarLinea.addActionListener (new ButtonActionListener(this,"EliminarLinea"));
		
		
		this.jInternalFrameDetalleFormLinea.jButtonEliminarToolBarLinea.addActionListener (new ButtonActionListener(this,"EliminarToolBarLinea"));
								
		this.jInternalFrameDetalleFormLinea.jMenuItemEliminarLinea.addActionListener (new ButtonActionListener(this,"MenuItemEliminarLinea"));		
		
		
		
		this.jInternalFrameDetalleFormLinea.jButtonCancelarLinea.addActionListener (new ButtonActionListener(this,"CancelarLinea"));
		
		
		this.jInternalFrameDetalleFormLinea.jButtonCancelarToolBarLinea.addActionListener (new ButtonActionListener(this,"CancelarToolBarLinea"));
					
		this.jInternalFrameDetalleFormLinea.jMenuItemCancelarLinea.addActionListener (new ButtonActionListener(this,"MenuItemCancelarLinea"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormLinea.jMenuItemDetalleCerrarLinea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarLinea"));		
		
		
		
		this.jInternalFrameDetalleFormLinea.jButtonGuardarCambiosToolBarLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarLinea"));
		
		
		
		this.jInternalFrameDetalleFormLinea.jButtonGuardarCambiosToolBarLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarLinea"));
		
		
		
		this.jInternalFrameDetalleFormLinea.jComboBoxTiposAccionesFormularioLinea.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioLinea"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLinea.jButtonidLineaBusqueda.addActionListener(new ButtonActionListener(this,"idLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLinea.jButtonid_empresaLineaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLinea.jButtonid_empresaLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLinea.jButtonid_nivel_lineaLineaUpdate.addActionListener(new ButtonActionListener(this,"id_nivel_lineaLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLinea.jButtonid_nivel_lineaLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_nivel_lineaLineaBusqueda"));
		//jButtonid_lineaLinea.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_lineaLineaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormLinea.jButtonid_lineaLinea.addActionListener(new ButtonActionListener(this,"id_lineaLinea"));
		//jButtonid_lineaLineaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeLinea("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormLinea.jButtonid_lineaLineaArbol.addActionListener(new ButtonActionListener(this,"id_lineaLineaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLinea.jButtonid_lineaLineaUpdate.addActionListener(new ButtonActionListener(this,"id_lineaLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLinea.jButtonid_lineaLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLinea.jButtoncodigoLineaBusqueda.addActionListener(new ButtonActionListener(this,"codigoLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLinea.jButtonnombreLineaBusqueda.addActionListener(new ButtonActionListener(this,"nombreLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLinea.jButtondescripcionLineaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionLineaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormLinea.jTabbedPaneRelacionesLinea.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesLinea"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameLinea"));
		
		if(this.jInternalFrameDetalleFormLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLinea.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarLinea"));
		}
		
		this.jTableDatosLinea.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarLinea"));
		
		this.jTableDatosLinea.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarLinea"));
		
		this.jButtonNuevoLinea.addActionListener(new ButtonActionListener(this,"NuevoLinea"));
		
		this.jButtonDuplicarLinea.addActionListener(new ButtonActionListener(this,"DuplicarLinea"));
		
		this.jButtonCopiarLinea.addActionListener(new ButtonActionListener(this,"CopiarLinea"));
		
		this.jButtonVerFormLinea.addActionListener(new ButtonActionListener(this,"VerFormLinea"));
		
		
		this.jButtonNuevoToolBarLinea.addActionListener(new ButtonActionListener(this,"NuevoToolBarLinea"));
			
		this.jButtonDuplicarToolBarLinea.addActionListener(new ButtonActionListener(this,"DuplicarToolBarLinea"));
			
		this.jMenuItemNuevoLinea.addActionListener (new ButtonActionListener(this,"MenuItemNuevoLinea"));
			
		this.jMenuItemDuplicarLinea.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarLinea"));		
		
		
		this.jButtonNuevoRelacionesLinea.addActionListener (new ButtonActionListener(this,"NuevoRelacionesLinea"));
		
		
		this.jButtonNuevoRelacionesToolBarLinea.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarLinea"));
			
		this.jMenuItemNuevoRelacionesLinea.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesLinea"));		
		
		
		if(this.jInternalFrameDetalleFormLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLinea.jButtonModificarLinea.addActionListener(new ButtonActionListener(this,"ModificarLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLinea.jButtonModificarToolBarLinea.addActionListener(new ButtonActionListener(this,"ModificarToolBarLinea"));
			
			this.jInternalFrameDetalleFormLinea.jMenuItemModificarLinea.addActionListener(new ButtonActionListener(this,"MenuItemModificarLinea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLinea!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormLinea.jButtonActualizarLinea.addActionListener (new ButtonActionListener(this,"ActualizarLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLinea.jButtonActualizarToolBarLinea.addActionListener(new ButtonActionListener(this,"ActualizarToolBarLinea"));
				
			this.jInternalFrameDetalleFormLinea.jMenuItemActualizarLinea.addActionListener (new ButtonActionListener(this,"MenuItemActualizarLinea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLinea.jButtonEliminarLinea.addActionListener (new ButtonActionListener(this,"EliminarLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLinea.jButtonEliminarToolBarLinea.addActionListener (new ButtonActionListener(this,"EliminarToolBarLinea"));
						
			this.jInternalFrameDetalleFormLinea.jMenuItemEliminarLinea.addActionListener (new ButtonActionListener(this,"MenuItemEliminarLinea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLinea.jButtonCancelarLinea.addActionListener (new ButtonActionListener(this,"CancelarLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLinea.jButtonCancelarToolBarLinea.addActionListener (new ButtonActionListener(this,"CancelarToolBarLinea"));
			
			this.jInternalFrameDetalleFormLinea.jMenuItemCancelarLinea.addActionListener (new ButtonActionListener(this,"MenuItemCancelarLinea"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarLinea.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarLinea"));		
		
		
		this.jButtonCerrarLinea.addActionListener (new ButtonActionListener(this,"CerrarLinea"));
		
		
		this.jButtonCerrarToolBarLinea.addActionListener (new ButtonActionListener(this,"CerrarToolBarLinea"));
			
		this.jMenuItemCerrarLinea.addActionListener (new ButtonActionListener(this,"MenuItemCerrarLinea"));
			
		if(this.jInternalFrameDetalleFormLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLinea.jMenuItemDetalleCerrarLinea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarLinea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLinea.jButtonGuardarCambiosLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLinea.jButtonGuardarCambiosToolBarLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarLinea"));
		}
		
		this.jButtonCopiarToolBarLinea.addActionListener (new ButtonActionListener(this,"CopiarToolBarLinea"));
			
		this.jButtonVerFormToolBarLinea.addActionListener (new ButtonActionListener(this,"VerFormToolBarLinea"));
		
		this.jMenuItemGuardarCambiosLinea.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosLinea"));
			
		this.jMenuItemCopiarLinea.addActionListener (new ButtonActionListener(this,"MenuItemCopiarLinea"));		
		
		this.jMenuItemVerFormLinea.addActionListener (new ButtonActionListener(this,"MenuItemVerFormLinea"));		
		
		
		this.jButtonGuardarCambiosTablaLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaLinea"));
		
		
		this.jButtonGuardarCambiosTablaToolBarLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarLinea"));
			
		this.jMenuItemGuardarCambiosTablaLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaLinea"));		
		
		
		
		this.jButtonRecargarInformacionLinea.addActionListener (new ButtonActionListener(this,"RecargarInformacionLinea"));
					
		this.jButtonRecargarInformacionToolBarLinea.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarLinea"));
		
		this.jMenuItemRecargarInformacionLinea.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionLinea"));		
		
		
		this.jButtonArbolLinea.addActionListener (new ButtonActionListener(this,"ArbolLinea"));
		
		this.jButtonAnterioresLinea.addActionListener (new ButtonActionListener(this,"AnterioresLinea"));
		
		
		this.jButtonAnterioresToolBarLinea.addActionListener (new ButtonActionListener(this,"AnterioresToolBarLinea"));
		
		this.jMenuItemAnterioresLinea.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresLinea"));		
		
		
		this.jButtonSiguientesLinea.addActionListener (new ButtonActionListener(this,"SiguientesLinea"));
		
		
		this.jButtonSiguientesToolBarLinea.addActionListener (new ButtonActionListener(this,"SiguientesToolBarLinea"));
			
		this.jMenuItemSiguientesLinea.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesLinea"));
			
		this.jMenuItemAbrirOrderByLinea.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByLinea"));
			
		this.jMenuItemMostrarOcultarLinea.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarLinea"));
			
		this.jMenuItemDetalleAbrirOrderByLinea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByLinea"));
			
		this.jMenuItemDetalleMostarOcultarLinea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarLinea"));		
		
		
		this.jButtonNuevoGuardarCambiosLinea.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosLinea"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarLinea.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarLinea"));
			
		this.jMenuItemNuevoGuardarCambiosLinea.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosLinea"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosLinea.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosLinea"));

		this.jCheckBoxSeleccionadosLinea.addItemListener(new CheckBoxItemListener(this,"SeleccionadosLinea"));
		
		if(this.jInternalFrameDetalleFormLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLinea.jComboBoxTiposAccionesFormularioLinea.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioLinea"));
		}
		
		
		this.jComboBoxTiposRelacionesLinea.addActionListener (new ButtonActionListener(this,"TiposRelacionesLinea"));
			
		this.jComboBoxTiposAccionesLinea.addActionListener (new ButtonActionListener(this,"TiposAccionesLinea"));
					
		this.jComboBoxTiposSeleccionarLinea.addActionListener (new ButtonActionListener(this,"TiposSeleccionarLinea"));
			
		this.jTextFieldValorCampoGeneralLinea.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralLinea"));		
		
		
		if(this.jInternalFrameDetalleFormLinea!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLinea.jButtonidLineaBusqueda.addActionListener(new ButtonActionListener(this,"idLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLinea.jButtonid_empresaLineaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLinea.jButtonid_empresaLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLinea.jButtonid_nivel_lineaLineaUpdate.addActionListener(new ButtonActionListener(this,"id_nivel_lineaLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLinea.jButtonid_nivel_lineaLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_nivel_lineaLineaBusqueda"));
		//jButtonid_lineaLinea.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_lineaLineaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormLinea.jButtonid_lineaLinea.addActionListener(new ButtonActionListener(this,"id_lineaLinea"));
		//jButtonid_lineaLineaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeLinea("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormLinea.jButtonid_lineaLineaArbol.addActionListener(new ButtonActionListener(this,"id_lineaLineaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLinea.jButtonid_lineaLineaUpdate.addActionListener(new ButtonActionListener(this,"id_lineaLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLinea.jButtonid_lineaLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLinea.jButtoncodigoLineaBusqueda.addActionListener(new ButtonActionListener(this,"codigoLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLinea.jButtonnombreLineaBusqueda.addActionListener(new ButtonActionListener(this,"nombreLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLinea.jButtondescripcionLineaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionLineaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoLinea.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoLinea"));

			this.jButtonBusquedaPorNombreLinea.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreLinea"));

			this.jButtonFK_IdLineaLinea.addActionListener(new ButtonActionListener(this,"FK_IdLineaLinea"));

			this.jButtonBuscarFK_IdLineaid_lineaLinea.addActionListener(new ButtonActionListener(this,"id_lineaLinea"));

			this.jButtonFK_IdNivelLineaLinea.addActionListener(new ButtonActionListener(this,"FK_IdNivelLineaLinea"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoLinea!=null) {
				this.jInternalFrameReporteDinamicoLinea.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoLinea"));
				this.jInternalFrameReporteDinamicoLinea.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoLinea"));
				this.jInternalFrameReporteDinamicoLinea.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoLinea"));
			}
			
			//this.jButtonCerrarReporteDinamicoLinea.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoLinea"));				
			//this.jButtonGenerarReporteDinamicoLinea.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoLinea"));
			//this.jButtonGenerarExcelReporteDinamicoLinea.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoLinea"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionLinea!=null) {
				this.jInternalFrameImportacionLinea.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionLinea"));
				this.jInternalFrameImportacionLinea.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionLinea"));
				this.jInternalFrameImportacionLinea.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionLinea"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByLinea.addActionListener (new ButtonActionListener(this,"AbrirOrderByLinea"));
			
			this.jButtonAbrirOrderByToolBarLinea.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarLinea"));			
			
			if(this.jInternalFrameOrderByLinea!=null) {
				this.jInternalFrameOrderByLinea.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByLinea"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormLinea!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLinea.jTabbedPaneRelacionesLinea.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesLinea"));
		
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
            		closingInternalFrameLinea();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormLinea.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormLinea = (JInternalFrameBase)event.getSource();
	            	
	            LineaBeanSwingJInternalFrame jInternalFrameParent=(LineaBeanSwingJInternalFrame)jInternalFrameDetalleFormLinea.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarLineaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosLinea.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosLineaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosLinea.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosLinea.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLineaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLineaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLineaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoLinea";
		inputMap = this.jButtonNuevoLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoLineaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLineaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLineaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLineaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesLinea";
		inputMap = this.jButtonNuevoRelacionesLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoLineaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarLinea";
		inputMap = this.jButtonModificarLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarLinea";
		inputMap = this.jButtonActualizarLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarLinea";
		inputMap = this.jButtonEliminarLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarLinea";
		inputMap = this.jButtonCancelarLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarLinea";
		inputMap = this.jButtonCerrarLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormLinea.jButtonGuardarCambiosLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosLinea";
		inputMap = this.jInternalFrameDetalleFormLinea.jButtonGuardarCambiosLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormLinea.jButtonGuardarCambiosLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonArbolLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonArbolLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosLinea.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosLineaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesLinea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesLineaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarLinea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarLineaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralLinea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralLineaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLinea.jButtonidLineaBusqueda.addActionListener(new ButtonActionListener(this,"idLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLinea.jButtonid_empresaLineaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLinea.jButtonid_empresaLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLinea.jButtonid_nivel_lineaLineaUpdate.addActionListener(new ButtonActionListener(this,"id_nivel_lineaLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLinea.jButtonid_nivel_lineaLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_nivel_lineaLineaBusqueda"));
		//jButtonid_lineaLinea.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_lineaLineaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormLinea.jButtonid_lineaLinea.addActionListener(new ButtonActionListener(this,"id_lineaLinea"));
		//jButtonid_lineaLineaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeLinea("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormLinea.jButtonid_lineaLineaArbol.addActionListener(new ButtonActionListener(this,"id_lineaLineaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLinea.jButtonid_lineaLineaUpdate.addActionListener(new ButtonActionListener(this,"id_lineaLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLinea.jButtonid_lineaLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLinea.jButtoncodigoLineaBusqueda.addActionListener(new ButtonActionListener(this,"codigoLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLinea.jButtonnombreLineaBusqueda.addActionListener(new ButtonActionListener(this,"nombreLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLinea.jButtondescripcionLineaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionLineaBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoLinea.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoLinea"));

		this.jButtonBusquedaPorNombreLinea.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreLinea"));

		this.jButtonFK_IdLineaLinea.addActionListener(new ButtonActionListener(this,"FK_IdLineaLinea"));

		this.jButtonBuscarFK_IdLineaid_lineaLinea.addActionListener(new ButtonActionListener(this,"id_lineaLinea"));

		this.jButtonFK_IdNivelLineaLinea.addActionListener(new ButtonActionListener(this,"FK_IdNivelLineaLinea"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarLineaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarLinea.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosLinea(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Linea lineaAux:this.lineaLogic.getLineas()) {
					lineaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Linea lineaAux:lineas) {
					lineaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosLineaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingLinea(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Linea lineaAux:this.lineaLogic.getLineas()) {
						lineaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Linea lineaAux:lineas) {
						lineaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Linea lineaAux:this.lineaLogic.getLineas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Linea lineaAux:lineas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaLinea(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosLinea.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosLinea.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosLinea,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosLineaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingLinea(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosLinea.getSelectedRows();
			
			Linea lineaLocal=new Linea();
			
			//this.seleccionarTodosLinea(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLocal =(Linea) this.lineaLogic.getLineas().toArray()[this.jTableDatosLinea.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					lineaLocal =(Linea) this.lineas.toArray()[this.jTableDatosLinea.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				lineaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Linea lineaAux:this.lineaLogic.getLineas()) {
						lineaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Linea lineaAux:lineas) {
						lineaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaLinea(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosLinea.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosLinea.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosLinea,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualLineaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarLineaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralLineaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingLinea(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralLinea.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Linea lineaAux:this.lineaLogic.getLineas()) {
				
						if(sTipoSeleccionar.equals(LineaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							lineaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(LineaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							lineaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(LineaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							lineaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Linea lineaAux:lineas) {
					
						if(sTipoSeleccionar.equals(LineaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							lineaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(LineaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							lineaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(LineaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							lineaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaLinea(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesLineaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingLinea(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioLinea=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesLinea.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormLinea.jComboBoxTiposAccionesFormularioLinea.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteLinea) {				
					conSplash=true;//false;										
					
					//this.startProcessLinea(conSplash);
				
					this.generarReporteLineasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLinea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLinea.jComboBoxTiposAccionesFormularioLinea.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoLineasSeleccionados();
				//this.jComboBoxTiposAccionesLinea.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoLineasSeleccionados(false);
				//this.jComboBoxTiposAccionesLinea.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoLineasSeleccionados(true);
				//this.jComboBoxTiposAccionesLinea.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessLinea();
				
				this.exportarLineasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLinea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLinea.jComboBoxTiposAccionesFormularioLinea.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionLineas();
				//this.importarLineas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLinea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLinea.jComboBoxTiposAccionesFormularioLinea.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessLinea();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelLineasSeleccionados();
				//this.jComboBoxTiposAccionesLinea.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Linea", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessLinea();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoLinea)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyLinea(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Linea",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLinea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLinea.jComboBoxTiposAccionesFormularioLinea.setSelectedIndex(0);					
				}	
			} 			
			else if(LineaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteLinea) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessLinea(conSplash);
					
						//this.actualizarParametrosGeneralLinea();
						
						this.generarReporteProcesoAccionLineasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesLinea.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormLinea.jComboBoxTiposAccionesFormularioLinea.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(LineaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO LineaS SELECCIONADOS?", "MANTENIMIENTO DE Linea", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessLinea();
				
						this.actualizarParametrosGeneralLinea();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.lineaReturnGeneral=lineaLogic.procesarAccionLineasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.lineaLogic.getLineas(),this.lineaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarLineaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesLinea.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormLinea.jComboBoxTiposAccionesFormularioLinea.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralLinea();
					
					LineaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarLineaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesLinea.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormLinea.jComboBoxTiposAccionesFormularioLinea.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessLinea(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesLineaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessLinea();
			
			if(this.jInternalFrameDetalleFormLinea==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Linea> lineasSeleccionados=new ArrayList<Linea>();		
			Linea linea=new Linea();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingLinea(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesLinea.getSelectedItem();
			
			
			
			
			lineasSeleccionados=this.getLineasSeleccionados(true);
			//this.sTipoAccion;
			
			if(lineasSeleccionados.size()==1) {
				for(Linea lineaAux:lineasSeleccionados) {
					linea=lineaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Presupuesto Linea")) {
					jButtonPresupuestoLineaActionPerformed(null,rowIndex,true,false,linea);
				}
				else if(this.sTipoRelacion.equals("Linea")) {
					jButtonLineaActionPerformed(null,rowIndex,true,false,linea);
				}
				else if(this.sTipoRelacion.equals("Comision Grupo")) {
					jButtonComisionGrupoActionPerformed(null,rowIndex,true,false,linea);
				}
				else if(this.sTipoRelacion.equals("Producto Punto Venta")) {
					jButtonProductoPuntoVentaActionPerformed(null,rowIndex,true,false,linea);
				}
				else if(this.sTipoRelacion.equals("Comision Linea")) {
					jButtonComisionLineaActionPerformed(null,rowIndex,true,false,linea);
				}
				else if(this.sTipoRelacion.equals("Comision Cate")) {
					jButtonComisionCateActionPerformed(null,rowIndex,true,false,linea);
				}
				else if(this.sTipoRelacion.equals("Detalle Planeacion Compra")) {
					jButtonDetallePlaneacionCompraActionPerformed(null,rowIndex,true,false,linea);
				}
				else if(this.sTipoRelacion.equals("Cuentas Contables Linea Producto")) {
					jButtonCuentasContablesLineaProductoActionPerformed(null,rowIndex,true,false,linea);
				}
				else if(this.sTipoRelacion.equals("Precio")) {
					jButtonPrecioActionPerformed(null,rowIndex,true,false,linea);
				}
				else if(this.sTipoRelacion.equals("Linea Punto Venta")) {
					jButtonLineaPuntoVentaActionPerformed(null,rowIndex,true,false,linea);
				}
				else if(this.sTipoRelacion.equals("Detalle Codigo Barra Producto")) {
					jButtonDetalleCodigoBarraProductoActionPerformed(null,rowIndex,true,false,linea);
				}
				else if(this.sTipoRelacion.equals("Presupuesto Ventas_lineas")) {
					jButtonPresupuestoVentasLineasActionPerformed(null,rowIndex,true,false,linea);
				}
				else if(this.sTipoRelacion.equals("Centro Costo Grupo Producto")) {
					jButtonCentroCostoGrupoProductoActionPerformed(null,rowIndex,true,false,linea);
				}
				else if(this.sTipoRelacion.equals("Producto")) {
					jButtonProductoActionPerformed(null,rowIndex,true,false,linea);
				}
				else if(this.sTipoRelacion.equals("Comision Marca")) {
					jButtonComisionMarcaActionPerformed(null,rowIndex,true,false,linea);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessLinea();
			
      		//this.finishProcessLinea(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarLineaReturnGeneral() throws Exception {
		if(this.lineaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.lineaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.lineaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.lineaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.lineaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.lineaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingLinea(false);
		}
		
		if(this.lineaReturnGeneral.getConRetornoLista() || this.lineaReturnGeneral.getConRetornoObjeto()) {
			if(this.lineaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.lineaLogic.setLineas(this.lineaReturnGeneral.getLineas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.lineaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.lineaLogic.setLinea(this.lineaReturnGeneral.getLinea());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingLinea(false);
		}
	}
	
	public void actualizarParametrosGeneralLinea() throws Exception {
		
		
	}
	
	public ArrayList<Linea> getLineasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Linea> lineasSeleccionados=new ArrayList<Linea>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioLinea) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Linea lineaAux:lineaLogic.getLineas()) {
					if(lineaAux.getIsSelected()) {
						lineasSeleccionados.add(lineaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Linea lineaAux:this.lineas) {
					if(lineaAux.getIsSelected()) {
						lineasSeleccionados.add(lineaAux);				
					}
				}
			}
			
			if(lineasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						lineasSeleccionados.addAll(this.lineaLogic.getLineas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						lineasSeleccionados.addAll(this.lineas);				
					}
				}
			}
		} else {
			lineasSeleccionados.add(this.linea);
		}
		
		return lineasSeleccionados;
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
	
	public void generarReporteLineasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalLineasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoLineasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoLineasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoLineasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesLineasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Linea",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesLineasSeleccionados() throws Exception {
		ArrayList<Linea> lineasSeleccionados=new ArrayList<Linea>();		
		
		lineasSeleccionados=this.getLineasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteLineas("Todos",lineasSeleccionados);
		
	}	
	
	public void generarReporteNormalLineasSeleccionados() throws Exception {
		ArrayList<Linea> lineasSeleccionados=new ArrayList<Linea>();		
		
		lineasSeleccionados=this.getLineasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteLineas("Todos",lineasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionLineasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Linea> lineasSeleccionados=new ArrayList<Linea>();
		
		lineasSeleccionados=this.getLineasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteLineas("Todos",lineasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoLineasSeleccionados() throws Exception {
		ArrayList<Linea> lineasSeleccionados=new ArrayList<Linea>();		
		
		
		this.abrirInicializarFrameReporteDinamicoLinea();
		
		
		lineasSeleccionados=this.getLineasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoLinea();
		
		
		//this.generarReporteLineas("Todos",lineasSeleccionados ,lineaImplementable,lineaImplementableHome);
	}
	
	public void mostrarImportacionLineas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionLinea();
		
		this.abrirFrameImportacionLinea();		
		
			
		//this.generarReporteLineas("Todos",lineasSeleccionados ,lineaImplementable,lineaImplementableHome);
	}
	
	public void importarLineas() throws Exception {		
	
	}
	
	public void exportarLineasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelLineasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoLineasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlLineasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Linea",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoLineasSeleccionados() throws Exception {
		ArrayList<Linea> lineasSeleccionados=new ArrayList<Linea>();		
		
		lineasSeleccionados=this.getLineasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"linea."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarLinea(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Linea lineaAux:lineasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarLinea(lineaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//lineaAux.setsDetalleGeneralEntityReporte(lineaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarLinea(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=LineaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaConstantesFunciones.LABEL_IDNIVELLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarLinea(Linea linea,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=linea.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=linea.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=linea.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=linea.getnivellinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=linea.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=linea.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=linea.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=linea.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelLineasSeleccionados() throws Exception {
		ArrayList<Linea> lineasSeleccionados=new ArrayList<Linea>();		
		
		lineasSeleccionados=this.getLineasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"linea.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Lineas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelLinea(row);				
				iRow++;
			}				
			
			for(Linea lineaAux:lineasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelLinea(lineaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlLineasSeleccionados() throws Exception {
		ArrayList<Linea> lineasSeleccionados=new ArrayList<Linea>();		
		
		lineasSeleccionados=this.getLineasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"linea.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("lineas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("linea");
			//elementRoot.appendChild(element);
		
			for(Linea lineaAux:lineasSeleccionados) {
				element = document.createElement("linea");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlLinea(lineaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelLinea(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(LineaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(LineaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(LineaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(LineaConstantesFunciones.LABEL_IDNIVELLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(LineaConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(LineaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(LineaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(LineaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelLinea(Linea linea,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(linea.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(linea.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(linea.getnivellinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(linea.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(linea.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(linea.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(linea.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlLinea(Linea linea,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(LineaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(linea.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(LineaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(linea.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(LineaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(linea.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnivellinea_descripcion = document.createElement(LineaConstantesFunciones.IDNIVELLINEA);
		elementnivellinea_descripcion.appendChild(document.createTextNode(linea.getnivellinea_descripcion()));
		element.appendChild(elementnivellinea_descripcion);

		Element elementlinea_descripcion = document.createElement(LineaConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(linea.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementcodigo = document.createElement(LineaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(linea.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(LineaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(linea.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(LineaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(linea.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoLineasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Linea> lineasSeleccionados=new ArrayList<Linea>();
		
		lineasSeleccionados=this.getLineasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoLinea(lineasSeleccionados);
		
		this.generarReporteLineas("Todos",lineasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoLinea(ArrayList<Linea> lineasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Linea lineaAux:lineasSeleccionados) {
				lineaAux.setsDetalleGeneralEntityReporte(lineaAux.toString());
			
				if(sTipoSeleccionar.equals(LineaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					lineaAux.setsDescripcionGeneralEntityReporte1(lineaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LineaConstantesFunciones.LABEL_IDNIVELLINEA)) {
					existe=true;
					lineaAux.setsDescripcionGeneralEntityReporte1(lineaAux.getnivellinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LineaConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					lineaAux.setsDescripcionGeneralEntityReporte1(lineaAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LineaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					lineaAux.setsDescripcionGeneralEntityReporte1(lineaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(LineaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					lineaAux.setsDescripcionGeneralEntityReporte1(lineaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(LineaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					lineaAux.setsDescripcionGeneralEntityReporte1(lineaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesLinea(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoLinea=true;
				this.isVisibilidadCeldaNuevoRelacionesLinea=true;
				this.isVisibilidadCeldaGuardarCambiosLinea=true;
			}
			
			this.isVisibilidadCeldaModificarLinea=false;
			this.isVisibilidadCeldaActualizarLinea=false;
			this.isVisibilidadCeldaEliminarLinea=false;
			this.isVisibilidadCeldaCancelarLinea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLinea=true;
				} else {
					this.isVisibilidadCeldaGuardarLinea=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesLinea=false;
			this.isVisibilidadCeldaGuardarCambiosLinea=false;
			this.isVisibilidadCeldaModificarLinea=false;
			this.isVisibilidadCeldaActualizarLinea=true;
			this.isVisibilidadCeldaEliminarLinea=false;
			this.isVisibilidadCeldaCancelarLinea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLinea=true;
				} else {
					this.isVisibilidadCeldaGuardarLinea=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesLinea=false;
			this.isVisibilidadCeldaGuardarCambiosLinea=false;
			this.isVisibilidadCeldaModificarLinea=false;
			this.isVisibilidadCeldaActualizarLinea=true;
			this.isVisibilidadCeldaEliminarLinea=true;
			this.isVisibilidadCeldaCancelarLinea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLinea=true;
				} else {
					this.isVisibilidadCeldaGuardarLinea=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesLinea=false;
			this.isVisibilidadCeldaGuardarCambiosLinea=false;
			this.isVisibilidadCeldaModificarLinea=false;
			this.isVisibilidadCeldaActualizarLinea=true;
			this.isVisibilidadCeldaEliminarLinea=false;
			this.isVisibilidadCeldaCancelarLinea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLinea=false;
				} else {
					this.isVisibilidadCeldaGuardarLinea=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoLinea=true;
			this.isVisibilidadCeldaNuevoRelacionesLinea=true;
			this.isVisibilidadCeldaGuardarCambiosLinea=true;
			this.isVisibilidadCeldaModificarLinea=false;
			this.isVisibilidadCeldaActualizarLinea=false;
			this.isVisibilidadCeldaEliminarLinea=false;
			this.isVisibilidadCeldaCancelarLinea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLinea=true;
				} else {
					this.isVisibilidadCeldaGuardarLinea=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesLinea=false;
			this.isVisibilidadCeldaGuardarCambiosLinea=false;
			this.isVisibilidadCeldaActualizarLinea=false;
			this.isVisibilidadCeldaEliminarLinea=false;
			this.isVisibilidadCeldaCancelarLinea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLinea=false;
				} else {
					this.isVisibilidadCeldaGuardarLinea=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesLinea=false;
			this.isVisibilidadCeldaGuardarCambiosLinea=false;
			this.isVisibilidadCeldaModificarLinea=true;
			this.isVisibilidadCeldaActualizarLinea=false;
			this.isVisibilidadCeldaEliminarLinea=false;
			this.isVisibilidadCeldaCancelarLinea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLinea=false;
				} else {
					this.isVisibilidadCeldaGuardarLinea=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(LineaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoLinea=true;
			this.isVisibilidadCeldaNuevoRelacionesLinea=true;
			this.isVisibilidadCeldaGuardarCambiosLinea=true;
		} else {
			this.actualizarEstadoPanelsLinea(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarLinea=false;
			//this.isVisibilidadCeldaVerFormLinea=false;
			this.isVisibilidadCeldaDuplicarLinea=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!lineaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesLinea=false;
		} else {
			this.isVisibilidadCeldaNuevoLinea=false;
			this.isVisibilidadCeldaGuardarCambiosLinea=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(lineaSessionBean.getEsGuardarRelacionado()) {
			if(!lineaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesLinea=false;												
			}
			
			this.jButtonCerrarLinea.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesLinea=false;
		}
		
		if(!this.permiteMantenimiento(this.linea)) {
			this.isVisibilidadCeldaActualizarLinea=false;
			this.isVisibilidadCeldaEliminarLinea=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesLinea() {
		this.isVisibilidadCeldaNuevoLinea=false;
		this.isVisibilidadCeldaGuardarCambiosLinea=false;
	}
	
	public void actualizarEstadoPanelsLinea(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionLinea!=null) {
				this.jScrollPanelDatosEdicionLinea.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLinea!=null) {
				this.jTabbedPaneBusquedasLinea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLinea!=null) {
				this.jScrollPanelDatosLinea.setVisible(true);
			}
			
			if(this.jPanelPaginacionLinea!=null) {
				this.jPanelPaginacionLinea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLinea!=null) {
				this.jPanelParametrosReportesLinea.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionLinea!=null) {
				this.jScrollPanelDatosEdicionLinea.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLinea!=null) {
				this.jTabbedPaneBusquedasLinea.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosLinea!=null) {
				this.jScrollPanelDatosLinea.setVisible(false);
			}
			
			if(this.jPanelPaginacionLinea!=null) {
				this.jPanelPaginacionLinea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesLinea!=null) {
				this.jPanelParametrosReportesLinea.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionLinea!=null) {
				this.jScrollPanelDatosEdicionLinea.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLinea!=null) {
				this.jTabbedPaneBusquedasLinea.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosLinea!=null) {
				this.jScrollPanelDatosLinea.setVisible(false);
			}
			
			if(this.jPanelPaginacionLinea!=null) {
				this.jPanelPaginacionLinea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesLinea!=null) {
				this.jPanelParametrosReportesLinea.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionLinea!=null) {
				this.jScrollPanelDatosEdicionLinea.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLinea!=null) {
				this.jTabbedPaneBusquedasLinea.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosLinea!=null) {
				this.jScrollPanelDatosLinea.setVisible(false);
			}
			
			if(this.jPanelPaginacionLinea!=null) {
				this.jPanelPaginacionLinea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesLinea!=null) {
				this.jPanelParametrosReportesLinea.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionLinea!=null) {
				this.jScrollPanelDatosEdicionLinea.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLinea!=null) {
				this.jTabbedPaneBusquedasLinea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLinea!=null) {
				this.jScrollPanelDatosLinea.setVisible(true);
			}
			
			if(this.jPanelPaginacionLinea!=null) {
				this.jPanelPaginacionLinea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLinea!=null) {
				this.jPanelParametrosReportesLinea.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionLinea!=null) {
				this.jScrollPanelDatosEdicionLinea.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLinea!=null) {
				this.jTabbedPaneBusquedasLinea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLinea!=null) {
				this.jScrollPanelDatosLinea.setVisible(true);
			}
			
			if(this.jPanelPaginacionLinea!=null) {
				this.jPanelPaginacionLinea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLinea!=null) {
				this.jPanelParametrosReportesLinea.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionLinea!=null) {
				this.jScrollPanelDatosEdicionLinea.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLinea!=null) {
				this.jTabbedPaneBusquedasLinea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLinea!=null) {
				this.jScrollPanelDatosLinea.setVisible(true);
			}
			
			if(this.jPanelPaginacionLinea!=null) {
				this.jPanelPaginacionLinea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLinea!=null) {
				this.jPanelParametrosReportesLinea.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.lineaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasLinea!=null) {
					this.jTabbedPaneBusquedasLinea.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesLinea!=null) {
				this.jPanelParametrosReportesLinea.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.lineaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLinea!=null) {
				this.jTabbedPaneBusquedasLinea.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesLinea!=null) {
				this.jPanelParametrosReportesLinea.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasLinea.remove(jPanelBusquedaPorCodigoLinea);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasLinea.remove(jPanelBusquedaPorNombreLinea);}

			this.isVisibilidadFK_IdLinea=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasLinea.remove(jPanelFK_IdLineaLinea);}

			this.isVisibilidadFK_IdNivelLinea=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdNivelLinea) {this.jTabbedPaneBusquedasLinea.remove(jPanelFK_IdNivelLineaLinea);}
		}
		
	}

	public void setVisibilidadBusquedasParaNivelLinea(Boolean isParaNivelLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaNivelLineaNegation=!isParaNivelLinea;

			this.isVisibilidadBusquedaPorCodigo=isParaNivelLineaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasLinea.remove(jPanelBusquedaPorCodigoLinea);}

			this.isVisibilidadBusquedaPorNombre=isParaNivelLineaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasLinea.remove(jPanelBusquedaPorNombreLinea);}

			this.isVisibilidadFK_IdLinea=isParaNivelLineaNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasLinea.remove(jPanelFK_IdLineaLinea);}

			this.isVisibilidadFK_IdNivelLinea=isParaNivelLinea;
			if(!this.isVisibilidadFK_IdNivelLinea) {this.jTabbedPaneBusquedasLinea.remove(jPanelFK_IdNivelLineaLinea);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaPorCodigo=isParaLineaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasLinea.remove(jPanelBusquedaPorCodigoLinea);}

			this.isVisibilidadBusquedaPorNombre=isParaLineaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasLinea.remove(jPanelBusquedaPorNombreLinea);}

			this.isVisibilidadFK_IdLinea=isParaLinea;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasLinea.remove(jPanelFK_IdLineaLinea);}

			this.isVisibilidadFK_IdNivelLinea=isParaLineaNegation;
			if(!this.isVisibilidadFK_IdNivelLinea) {this.jTabbedPaneBusquedasLinea.remove(jPanelFK_IdNivelLineaLinea);}
		}
		
	}
	
	

	public String registrarSesionLineaParaPresupuestoLineaes() throws Exception {
		Boolean isPaginaPopupPresupuestoLinea=false;

		try {

			if(this.lineaSessionBean==null) {
				this.lineaSessionBean=new LineaSessionBean();
			}

			if(this.jInternalFrameDetalleFormLinea.presupuestolineaSessionBean==null) {
				this.jInternalFrameDetalleFormLinea.presupuestolineaSessionBean=new PresupuestoLineaSessionBean();
			}

			this.jInternalFrameDetalleFormLinea.presupuestolineaSessionBean.setsPathNavegacionActual(lineaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormLinea.presupuestolineaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPresupuestoLinea=this.jInternalFrameDetalleFormLinea.presupuestolineaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormLinea.presupuestolineaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePresupuestoLinea(true);
			this.jInternalFrameDetalleFormLinea.presupuestolineaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePresupuestoLinea(LineaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormLinea.presupuestolineaSessionBean.setisBusquedaDesdeForeignKeySesionLinea(true);
			this.jInternalFrameDetalleFormLinea.presupuestolineaSessionBean.setlidLineaActual(this.idLineaActual);

			lineaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyLinea(true);
			lineaSessionBean.setlIdLineaActualForeignKey(this.idLineaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionLineaParaLineas() throws Exception {
		Boolean isPaginaPopupLinea=false;

		try {

			if(this.lineaSessionBean==null) {
				this.lineaSessionBean=new LineaSessionBean();
			}

			if(this.jInternalFrameDetalleFormLinea.lineaSessionBean==null) {
				this.jInternalFrameDetalleFormLinea.lineaSessionBean=new LineaSessionBean();
			}

			this.jInternalFrameDetalleFormLinea.lineaSessionBean.setsPathNavegacionActual(lineaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+LineaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormLinea.lineaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupLinea=this.jInternalFrameDetalleFormLinea.lineaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormLinea.lineaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeLinea(true);
			this.jInternalFrameDetalleFormLinea.lineaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeLinea(LineaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormLinea.lineaSessionBean.setisBusquedaDesdeForeignKeySesionLinea(true);
			this.jInternalFrameDetalleFormLinea.lineaSessionBean.setlidLineaActual(this.idLineaActual);

			lineaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyLinea(true);
			lineaSessionBean.setlIdLineaActualForeignKey(this.idLineaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionLineaGrupoParaComisionGrupos() throws Exception {
		Boolean isPaginaPopupComisionGrupo=false;

		try {

			if(this.lineaSessionBean==null) {
				this.lineaSessionBean=new LineaSessionBean();
			}

			if(this.jInternalFrameDetalleFormLinea.comisiongrupoSessionBean==null) {
				this.jInternalFrameDetalleFormLinea.comisiongrupoSessionBean=new ComisionGrupoSessionBean();
			}

			this.jInternalFrameDetalleFormLinea.comisiongrupoSessionBean.setsPathNavegacionActual(lineaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormLinea.comisiongrupoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupComisionGrupo=this.jInternalFrameDetalleFormLinea.comisiongrupoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormLinea.comisiongrupoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeComisionGrupo(true);
			this.jInternalFrameDetalleFormLinea.comisiongrupoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeComisionGrupo(LineaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormLinea.comisiongrupoSessionBean.setisBusquedaDesdeForeignKeySesionLineaGrupo(true);
			this.jInternalFrameDetalleFormLinea.comisiongrupoSessionBean.setlidLineaGrupoActual(this.idLineaActual);

			lineaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyLinea(true);
			lineaSessionBean.setlIdLineaActualForeignKey(this.idLineaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionLineaParaProductoPuntoVentas() throws Exception {
		Boolean isPaginaPopupProductoPuntoVenta=false;

		try {

			if(this.lineaSessionBean==null) {
				this.lineaSessionBean=new LineaSessionBean();
			}

			if(this.jInternalFrameDetalleFormLinea.productopuntoventaSessionBean==null) {
				this.jInternalFrameDetalleFormLinea.productopuntoventaSessionBean=new ProductoPuntoVentaSessionBean();
			}

			this.jInternalFrameDetalleFormLinea.productopuntoventaSessionBean.setsPathNavegacionActual(lineaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormLinea.productopuntoventaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProductoPuntoVenta=this.jInternalFrameDetalleFormLinea.productopuntoventaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormLinea.productopuntoventaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProductoPuntoVenta(true);
			this.jInternalFrameDetalleFormLinea.productopuntoventaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoPuntoVenta(LineaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormLinea.productopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionLinea(true);
			this.jInternalFrameDetalleFormLinea.productopuntoventaSessionBean.setlidLineaActual(this.idLineaActual);

			lineaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyLinea(true);
			lineaSessionBean.setlIdLineaActualForeignKey(this.idLineaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionLineaParaComisionLineas() throws Exception {
		Boolean isPaginaPopupComisionLinea=false;

		try {

			if(this.lineaSessionBean==null) {
				this.lineaSessionBean=new LineaSessionBean();
			}

			if(this.jInternalFrameDetalleFormLinea.comisionlineaSessionBean==null) {
				this.jInternalFrameDetalleFormLinea.comisionlineaSessionBean=new ComisionLineaSessionBean();
			}

			this.jInternalFrameDetalleFormLinea.comisionlineaSessionBean.setsPathNavegacionActual(lineaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ComisionLineaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormLinea.comisionlineaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupComisionLinea=this.jInternalFrameDetalleFormLinea.comisionlineaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormLinea.comisionlineaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeComisionLinea(true);
			this.jInternalFrameDetalleFormLinea.comisionlineaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeComisionLinea(LineaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormLinea.comisionlineaSessionBean.setisBusquedaDesdeForeignKeySesionLinea(true);
			this.jInternalFrameDetalleFormLinea.comisionlineaSessionBean.setlidLineaActual(this.idLineaActual);

			lineaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyLinea(true);
			lineaSessionBean.setlIdLineaActualForeignKey(this.idLineaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionLineaParaComisionCates() throws Exception {
		Boolean isPaginaPopupComisionCate=false;

		try {

			if(this.lineaSessionBean==null) {
				this.lineaSessionBean=new LineaSessionBean();
			}

			if(this.jInternalFrameDetalleFormLinea.comisioncateSessionBean==null) {
				this.jInternalFrameDetalleFormLinea.comisioncateSessionBean=new ComisionCateSessionBean();
			}

			this.jInternalFrameDetalleFormLinea.comisioncateSessionBean.setsPathNavegacionActual(lineaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ComisionCateConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormLinea.comisioncateSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupComisionCate=this.jInternalFrameDetalleFormLinea.comisioncateSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormLinea.comisioncateSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeComisionCate(true);
			this.jInternalFrameDetalleFormLinea.comisioncateSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeComisionCate(LineaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormLinea.comisioncateSessionBean.setisBusquedaDesdeForeignKeySesionLinea(true);
			this.jInternalFrameDetalleFormLinea.comisioncateSessionBean.setlidLineaActual(this.idLineaActual);

			lineaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyLinea(true);
			lineaSessionBean.setlIdLineaActualForeignKey(this.idLineaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionLineaParaDetallePlaneacionCompras() throws Exception {
		Boolean isPaginaPopupDetallePlaneacionCompra=false;

		try {

			if(this.lineaSessionBean==null) {
				this.lineaSessionBean=new LineaSessionBean();
			}

			if(this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraSessionBean==null) {
				this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean();
			}

			this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraSessionBean.setsPathNavegacionActual(lineaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetallePlaneacionCompra=this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetallePlaneacionCompra(true);
			this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetallePlaneacionCompra(LineaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraSessionBean.setisBusquedaDesdeForeignKeySesionLinea(true);
			this.jInternalFrameDetalleFormLinea.detalleplaneacioncompraSessionBean.setlidLineaActual(this.idLineaActual);

			lineaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyLinea(true);
			lineaSessionBean.setlIdLineaActualForeignKey(this.idLineaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionLineaCategoriaParaCuentasContablesLineaProductoes() throws Exception {
		Boolean isPaginaPopupCuentasContablesLineaProducto=false;

		try {

			if(this.lineaSessionBean==null) {
				this.lineaSessionBean=new LineaSessionBean();
			}

			if(this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoSessionBean==null) {
				this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoSessionBean=new CuentasContablesLineaProductoSessionBean();
			}

			this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoSessionBean.setsPathNavegacionActual(lineaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCuentasContablesLineaProducto=this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentasContablesLineaProducto(true);
			this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentasContablesLineaProducto(LineaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoSessionBean.setisBusquedaDesdeForeignKeySesionLineaCategoria(true);
			this.jInternalFrameDetalleFormLinea.cuentascontableslineaproductoSessionBean.setlidLineaCategoriaActual(this.idLineaActual);

			lineaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyLinea(true);
			lineaSessionBean.setlIdLineaActualForeignKey(this.idLineaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionLineaGrupoParaPrecios() throws Exception {
		Boolean isPaginaPopupPrecio=false;

		try {

			if(this.lineaSessionBean==null) {
				this.lineaSessionBean=new LineaSessionBean();
			}

			if(this.jInternalFrameDetalleFormLinea.precioSessionBean==null) {
				this.jInternalFrameDetalleFormLinea.precioSessionBean=new PrecioSessionBean();
			}

			this.jInternalFrameDetalleFormLinea.precioSessionBean.setsPathNavegacionActual(lineaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PrecioConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormLinea.precioSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPrecio=this.jInternalFrameDetalleFormLinea.precioSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormLinea.precioSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePrecio(true);
			this.jInternalFrameDetalleFormLinea.precioSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePrecio(LineaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormLinea.precioSessionBean.setisBusquedaDesdeForeignKeySesionLineaGrupo(true);
			this.jInternalFrameDetalleFormLinea.precioSessionBean.setlidLineaGrupoActual(this.idLineaActual);

			lineaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyLinea(true);
			lineaSessionBean.setlIdLineaActualForeignKey(this.idLineaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionLineaMarcaParaLineaPuntoVentas() throws Exception {
		Boolean isPaginaPopupLineaPuntoVenta=false;

		try {

			if(this.lineaSessionBean==null) {
				this.lineaSessionBean=new LineaSessionBean();
			}

			if(this.jInternalFrameDetalleFormLinea.lineapuntoventaSessionBean==null) {
				this.jInternalFrameDetalleFormLinea.lineapuntoventaSessionBean=new LineaPuntoVentaSessionBean();
			}

			this.jInternalFrameDetalleFormLinea.lineapuntoventaSessionBean.setsPathNavegacionActual(lineaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormLinea.lineapuntoventaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupLineaPuntoVenta=this.jInternalFrameDetalleFormLinea.lineapuntoventaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormLinea.lineapuntoventaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeLineaPuntoVenta(true);
			this.jInternalFrameDetalleFormLinea.lineapuntoventaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeLineaPuntoVenta(LineaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormLinea.lineapuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionLineaMarca(true);
			this.jInternalFrameDetalleFormLinea.lineapuntoventaSessionBean.setlidLineaMarcaActual(this.idLineaActual);

			lineaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyLinea(true);
			lineaSessionBean.setlIdLineaActualForeignKey(this.idLineaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionLineaMarcaParaDetalleCodigoBarraProductos() throws Exception {
		Boolean isPaginaPopupDetalleCodigoBarraProducto=false;

		try {

			if(this.lineaSessionBean==null) {
				this.lineaSessionBean=new LineaSessionBean();
			}

			if(this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoSessionBean==null) {
				this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoSessionBean=new DetalleCodigoBarraProductoSessionBean();
			}

			this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoSessionBean.setsPathNavegacionActual(lineaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleCodigoBarraProducto=this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleCodigoBarraProducto(true);
			this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleCodigoBarraProducto(LineaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoSessionBean.setisBusquedaDesdeForeignKeySesionLineaMarca(true);
			this.jInternalFrameDetalleFormLinea.detallecodigobarraproductoSessionBean.setlidLineaMarcaActual(this.idLineaActual);

			lineaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyLinea(true);
			lineaSessionBean.setlIdLineaActualForeignKey(this.idLineaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionLineaMarcaParaPresupuestoVentasLineases() throws Exception {
		Boolean isPaginaPopupPresupuestoVentasLineas=false;

		try {

			if(this.lineaSessionBean==null) {
				this.lineaSessionBean=new LineaSessionBean();
			}

			if(this.jInternalFrameDetalleFormLinea.presupuestoventaslineasSessionBean==null) {
				this.jInternalFrameDetalleFormLinea.presupuestoventaslineasSessionBean=new PresupuestoVentasLineasSessionBean();
			}

			this.jInternalFrameDetalleFormLinea.presupuestoventaslineasSessionBean.setsPathNavegacionActual(lineaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PresupuestoVentasLineasConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormLinea.presupuestoventaslineasSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPresupuestoVentasLineas=this.jInternalFrameDetalleFormLinea.presupuestoventaslineasSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormLinea.presupuestoventaslineasSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePresupuestoVentasLineas(true);
			this.jInternalFrameDetalleFormLinea.presupuestoventaslineasSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePresupuestoVentasLineas(LineaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormLinea.presupuestoventaslineasSessionBean.setisBusquedaDesdeForeignKeySesionLineaMarca(true);
			this.jInternalFrameDetalleFormLinea.presupuestoventaslineasSessionBean.setlidLineaMarcaActual(this.idLineaActual);

			lineaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyLinea(true);
			lineaSessionBean.setlIdLineaActualForeignKey(this.idLineaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionLineaParaCentroCostoGrupoProductos() throws Exception {
		Boolean isPaginaPopupCentroCostoGrupoProducto=false;

		try {

			if(this.lineaSessionBean==null) {
				this.lineaSessionBean=new LineaSessionBean();
			}

			if(this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoSessionBean==null) {
				this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoSessionBean=new CentroCostoGrupoProductoSessionBean();
			}

			this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoSessionBean.setsPathNavegacionActual(lineaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCentroCostoGrupoProducto=this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCentroCostoGrupoProducto(true);
			this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCentroCostoGrupoProducto(LineaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoSessionBean.setisBusquedaDesdeForeignKeySesionLinea(true);
			this.jInternalFrameDetalleFormLinea.centrocostogrupoproductoSessionBean.setlidLineaActual(this.idLineaActual);

			lineaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyLinea(true);
			lineaSessionBean.setlIdLineaActualForeignKey(this.idLineaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionLineaParaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(this.lineaSessionBean==null) {
				this.lineaSessionBean=new LineaSessionBean();
			}

			if(this.jInternalFrameDetalleFormLinea.productoSessionBean==null) {
				this.jInternalFrameDetalleFormLinea.productoSessionBean=new ProductoSessionBean();
			}

			this.jInternalFrameDetalleFormLinea.productoSessionBean.setsPathNavegacionActual(lineaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormLinea.productoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProducto=this.jInternalFrameDetalleFormLinea.productoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormLinea.productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			this.jInternalFrameDetalleFormLinea.productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(LineaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormLinea.productoSessionBean.setisBusquedaDesdeForeignKeySesionLinea(true);
			this.jInternalFrameDetalleFormLinea.productoSessionBean.setlidLineaActual(this.idLineaActual);

			lineaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyLinea(true);
			lineaSessionBean.setlIdLineaActualForeignKey(this.idLineaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionLineaGrupoParaComisionMarcas() throws Exception {
		Boolean isPaginaPopupComisionMarca=false;

		try {

			if(this.lineaSessionBean==null) {
				this.lineaSessionBean=new LineaSessionBean();
			}

			if(this.jInternalFrameDetalleFormLinea.comisionmarcaSessionBean==null) {
				this.jInternalFrameDetalleFormLinea.comisionmarcaSessionBean=new ComisionMarcaSessionBean();
			}

			this.jInternalFrameDetalleFormLinea.comisionmarcaSessionBean.setsPathNavegacionActual(lineaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormLinea.comisionmarcaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupComisionMarca=this.jInternalFrameDetalleFormLinea.comisionmarcaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormLinea.comisionmarcaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeComisionMarca(true);
			this.jInternalFrameDetalleFormLinea.comisionmarcaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeComisionMarca(LineaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormLinea.comisionmarcaSessionBean.setisBusquedaDesdeForeignKeySesionLineaGrupo(true);
			this.jInternalFrameDetalleFormLinea.comisionmarcaSessionBean.setlidLineaGrupoActual(this.idLineaActual);

			lineaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyLinea(true);
			lineaSessionBean.setlIdLineaActualForeignKey(this.idLineaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	

	public String registrarSesionLineaParaBusquedaLineas() throws Exception {
		Boolean isPaginaPopupLinea=false;

		try {

			if(lineaSessionBean==null) {
				lineaSessionBean=new LineaSessionBean();
			}

			if(lineaSessionBean==null) {
				lineaSessionBean=new LineaSessionBean();
			}

			lineaSessionBean.setsPathNavegacionActual(lineaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+LineaConstantesFunciones.SCLASSWEBTITULO);
			lineaSessionBean.setisPermiteRecargarInformacion(false);
			lineaSessionBean.setisPaginaPopup(true);
			isPaginaPopupLinea=lineaSessionBean.getisPaginaPopup();
			lineaSessionBean.setisPaginaPopup(false);
			lineaSessionBean.setEstaModoBusqueda(true);
			lineaSessionBean.setsFuncionBusquedaRapida("window.opener.lineaFuncionGeneral.setCombosCodigoDesdeBusquedaid_linea(TO_REPLACE);");
			lineaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeLinea(true);
			lineaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeLinea(LineaConstantesFunciones.SNOMBREOPCION);
			//lineaSessionBean.setisBusquedaDesdeForeignKeySesionLinea(true);
			//lineaSessionBean.setlidLineaActual(this.idLineaActual);

			lineaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyLinea(true);
			lineaSessionBean.setlIdLineaActualForeignKey(this.idLineaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//LineaSessionBean lineaSessionBean=new LineaSessionBean();
		
		if(this.lineaSessionBean==null) {
			this.lineaSessionBean=new LineaSessionBean();
		}
		
		this.lineaSessionBean.setsUltimaBusquedaLinea(this.getsAccionBusqueda());
		this.lineaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.lineaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			lineaSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			lineaSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			lineaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdLinea")) {
			lineaSessionBean.setid_linea(this.getid_lineaFK_IdLinea());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdNivelLinea")) {
			lineaSessionBean.setid_nivel_linea(this.getid_nivel_lineaFK_IdNivelLinea());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//LineaSessionBean lineaSessionBean=new LineaSessionBean();
		
		if(this.lineaSessionBean==null) {
			this.lineaSessionBean=new LineaSessionBean();
		}
		
		if(this.lineaSessionBean.getsUltimaBusquedaLinea()!=null&&!this.lineaSessionBean.getsUltimaBusquedaLinea().equals("")) {
			this.setsAccionBusqueda(lineaSessionBean.getsUltimaBusquedaLinea());
			this.setiNumeroPaginacion(lineaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(lineaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(lineaSessionBean.getcodigo());
				lineaSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(lineaSessionBean.getnombre());
				lineaSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(lineaSessionBean.getid_empresa());
				lineaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdLinea")) {
				this.setid_lineaFK_IdLinea(lineaSessionBean.getid_linea());
				lineaSessionBean.setid_linea(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdNivelLinea")) {
				this.setid_nivel_lineaFK_IdNivelLinea(lineaSessionBean.getid_nivel_linea());
				lineaSessionBean.setid_nivel_linea(-1L);
			}
		}
		
		this.lineaSessionBean.setsUltimaBusquedaLinea("");
		this.lineaSessionBean.setiNumeroPaginacion(LineaConstantesFunciones.INUMEROPAGINACION);
		this.lineaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaLinea(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioLinea() {
		this.updateBorderResaltarBusquedasFormularioLinea();
		this.updateVisibilidadBusquedasFormularioLinea();
		this.updateHabilitarBusquedasFormularioLinea();
	}
	
	public void updateBorderResaltarBusquedasFormularioLinea() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasLinea.getComponents().length>0) {
	

		if(this.lineaConstantesFunciones.resaltarBusquedaPorCodigoLinea!=null) {
			index= this.jTabbedPaneBusquedasLinea.indexOfComponent(this.jPanelBusquedaPorCodigoLinea);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLinea.getComponent(index);
				jPanel.setBorder(this.lineaConstantesFunciones.resaltarBusquedaPorCodigoLinea);
			}
		}

		if(this.lineaConstantesFunciones.resaltarBusquedaPorNombreLinea!=null) {
			index= this.jTabbedPaneBusquedasLinea.indexOfComponent(this.jPanelBusquedaPorNombreLinea);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLinea.getComponent(index);
				jPanel.setBorder(this.lineaConstantesFunciones.resaltarBusquedaPorNombreLinea);
			}
		}

		if(this.lineaConstantesFunciones.resaltarFK_IdLineaLinea!=null) {
			index= this.jTabbedPaneBusquedasLinea.indexOfComponent(this.jPanelFK_IdLineaLinea);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLinea.getComponent(index);
				jPanel.setBorder(this.lineaConstantesFunciones.resaltarFK_IdLineaLinea);
			}
		}

		if(this.lineaConstantesFunciones.resaltarFK_IdNivelLineaLinea!=null) {
			index= this.jTabbedPaneBusquedasLinea.indexOfComponent(this.jPanelFK_IdNivelLineaLinea);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLinea.getComponent(index);
				jPanel.setBorder(this.lineaConstantesFunciones.resaltarFK_IdNivelLineaLinea);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioLinea() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasLinea.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasLinea.indexOfComponent(this.jPanelBusquedaPorCodigoLinea);
			jPanel=(JPanel)this.jTabbedPaneBusquedasLinea.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.lineaConstantesFunciones.mostrarBusquedaPorCodigoLinea);
			if(!this.lineaConstantesFunciones.mostrarBusquedaPorCodigoLinea && index>-1) {
				this.jTabbedPaneBusquedasLinea.remove(index);
			}

			index= this.jTabbedPaneBusquedasLinea.indexOfComponent(this.jPanelBusquedaPorNombreLinea);
			jPanel=(JPanel)this.jTabbedPaneBusquedasLinea.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.lineaConstantesFunciones.mostrarBusquedaPorNombreLinea);
			if(!this.lineaConstantesFunciones.mostrarBusquedaPorNombreLinea && index>-1) {
				this.jTabbedPaneBusquedasLinea.remove(index);
			}

			index= this.jTabbedPaneBusquedasLinea.indexOfComponent(this.jPanelFK_IdLineaLinea);
			jPanel=(JPanel)this.jTabbedPaneBusquedasLinea.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.lineaConstantesFunciones.mostrarFK_IdLineaLinea);
			if(!this.lineaConstantesFunciones.mostrarFK_IdLineaLinea && index>-1) {
				this.jTabbedPaneBusquedasLinea.remove(index);
			}

			index= this.jTabbedPaneBusquedasLinea.indexOfComponent(this.jPanelFK_IdNivelLineaLinea);
			jPanel=(JPanel)this.jTabbedPaneBusquedasLinea.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.lineaConstantesFunciones.mostrarFK_IdNivelLineaLinea);
			if(!this.lineaConstantesFunciones.mostrarFK_IdNivelLineaLinea && index>-1) {
				this.jTabbedPaneBusquedasLinea.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioLinea() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasLinea.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasLinea.indexOfComponent(this.jPanelBusquedaPorCodigoLinea);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasLinea.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.lineaConstantesFunciones.activarBusquedaPorCodigoLinea);
				this.jTabbedPaneBusquedasLinea.setEnabledAt(index,this.lineaConstantesFunciones.activarBusquedaPorCodigoLinea);
			}

			index= this.jTabbedPaneBusquedasLinea.indexOfComponent(this.jPanelBusquedaPorNombreLinea);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasLinea.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.lineaConstantesFunciones.activarBusquedaPorNombreLinea);
				this.jTabbedPaneBusquedasLinea.setEnabledAt(index,this.lineaConstantesFunciones.activarBusquedaPorNombreLinea);
			}

			index= this.jTabbedPaneBusquedasLinea.indexOfComponent(this.jPanelFK_IdLineaLinea);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasLinea.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.lineaConstantesFunciones.activarFK_IdLineaLinea);
				this.jTabbedPaneBusquedasLinea.setEnabledAt(index,this.lineaConstantesFunciones.activarFK_IdLineaLinea);
			}

			index= this.jTabbedPaneBusquedasLinea.indexOfComponent(this.jPanelFK_IdNivelLineaLinea);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasLinea.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.lineaConstantesFunciones.activarFK_IdNivelLineaLinea);
				this.jTabbedPaneBusquedasLinea.setEnabledAt(index,this.lineaConstantesFunciones.activarFK_IdNivelLineaLinea);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaLinea(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasLinea.indexOfComponent(this.jPanelBusquedaPorCodigoLinea);

			this.jTabbedPaneBusquedasLinea.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLinea.getComponent(index);

			this.lineaConstantesFunciones.setResaltarBusquedaPorCodigoLinea(resaltar);

			jPanel.setBorder(this.lineaConstantesFunciones.resaltarBusquedaPorCodigoLinea);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasLinea.indexOfComponent(this.jPanelBusquedaPorNombreLinea);

			this.jTabbedPaneBusquedasLinea.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLinea.getComponent(index);

			this.lineaConstantesFunciones.setResaltarBusquedaPorNombreLinea(resaltar);

			jPanel.setBorder(this.lineaConstantesFunciones.resaltarBusquedaPorNombreLinea);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdLinea")) {
			index= this.jTabbedPaneBusquedasLinea.indexOfComponent(this.jPanelFK_IdLineaLinea);

			this.jTabbedPaneBusquedasLinea.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLinea.getComponent(index);

			this.lineaConstantesFunciones.setResaltarFK_IdLineaLinea(resaltar);

			jPanel.setBorder(this.lineaConstantesFunciones.resaltarFK_IdLineaLinea);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdNivelLinea")) {
			index= this.jTabbedPaneBusquedasLinea.indexOfComponent(this.jPanelFK_IdNivelLineaLinea);

			this.jTabbedPaneBusquedasLinea.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLinea.getComponent(index);

			this.lineaConstantesFunciones.setResaltarFK_IdNivelLineaLinea(resaltar);

			jPanel.setBorder(this.lineaConstantesFunciones.resaltarFK_IdNivelLineaLinea);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarLinea.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioLinea() throws Exception {

		if(this.jInternalFrameDetalleFormLinea==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioLinea();
		this.updateVisibilidadResaltarControlesFormularioLinea();
		this.updateHabilitarResaltarControlesFormularioLinea();
		
	}
	
	public void updateBorderResaltarControlesFormularioLinea() throws Exception {
		if(this.jInternalFrameDetalleFormLinea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.lineaConstantesFunciones.resaltaridLinea!=null && this.jInternalFrameDetalleFormLinea!=null) {this.jInternalFrameDetalleFormLinea.jLabelidLinea.setBorder(this.lineaConstantesFunciones.resaltaridLinea);}
		if(this.lineaConstantesFunciones.resaltarid_empresaLinea!=null && this.jInternalFrameDetalleFormLinea!=null) {this.jInternalFrameDetalleFormLinea.jComboBoxid_empresaLinea.setBorder(this.lineaConstantesFunciones.resaltarid_empresaLinea);}
		if(this.lineaConstantesFunciones.resaltarid_nivel_lineaLinea!=null && this.jInternalFrameDetalleFormLinea!=null) {this.jInternalFrameDetalleFormLinea.jComboBoxid_nivel_lineaLinea.setBorder(this.lineaConstantesFunciones.resaltarid_nivel_lineaLinea);}
		if(this.lineaConstantesFunciones.resaltarid_lineaLinea!=null && this.jInternalFrameDetalleFormLinea!=null) {this.jInternalFrameDetalleFormLinea.jComboBoxid_lineaLinea.setBorder(this.lineaConstantesFunciones.resaltarid_lineaLinea);}
		if(this.lineaConstantesFunciones.resaltarcodigoLinea!=null && this.jInternalFrameDetalleFormLinea!=null) {this.jInternalFrameDetalleFormLinea.jTextFieldcodigoLinea.setBorder(this.lineaConstantesFunciones.resaltarcodigoLinea);}
		if(this.lineaConstantesFunciones.resaltarnombreLinea!=null && this.jInternalFrameDetalleFormLinea!=null) {this.jInternalFrameDetalleFormLinea.jTextAreanombreLinea.setBorder(this.lineaConstantesFunciones.resaltarnombreLinea);}
		if(this.lineaConstantesFunciones.resaltardescripcionLinea!=null && this.jInternalFrameDetalleFormLinea!=null) {this.jInternalFrameDetalleFormLinea.jTextAreadescripcionLinea.setBorder(this.lineaConstantesFunciones.resaltardescripcionLinea);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioLinea() throws Exception {		
		if(this.jInternalFrameDetalleFormLinea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormLinea!=null) {
	
		//this.jInternalFrameDetalleFormLinea.jLabelidLinea.setVisible(this.lineaConstantesFunciones.mostraridLinea);
		this.jInternalFrameDetalleFormLinea.jPanelidLinea.setVisible(this.lineaConstantesFunciones.mostraridLinea);
		//this.jInternalFrameDetalleFormLinea.jComboBoxid_empresaLinea.setVisible(this.lineaConstantesFunciones.mostrarid_empresaLinea);
		this.jInternalFrameDetalleFormLinea.jPanelid_empresaLinea.setVisible(this.lineaConstantesFunciones.mostrarid_empresaLinea);
		//this.jInternalFrameDetalleFormLinea.jComboBoxid_nivel_lineaLinea.setVisible(this.lineaConstantesFunciones.mostrarid_nivel_lineaLinea);
		this.jInternalFrameDetalleFormLinea.jPanelid_nivel_lineaLinea.setVisible(this.lineaConstantesFunciones.mostrarid_nivel_lineaLinea);
		//this.jInternalFrameDetalleFormLinea.jComboBoxid_lineaLinea.setVisible(this.lineaConstantesFunciones.mostrarid_lineaLinea);
		this.jInternalFrameDetalleFormLinea.jPanelid_lineaLinea.setVisible(this.lineaConstantesFunciones.mostrarid_lineaLinea);
			this.jInternalFrameDetalleFormLinea.jButtonid_lineaLinea.setVisible(this.lineaConstantesFunciones.mostrarid_lineaLinea);
		//this.jInternalFrameDetalleFormLinea.jTextFieldcodigoLinea.setVisible(this.lineaConstantesFunciones.mostrarcodigoLinea);
		this.jInternalFrameDetalleFormLinea.jPanelcodigoLinea.setVisible(this.lineaConstantesFunciones.mostrarcodigoLinea);
		//this.jInternalFrameDetalleFormLinea.jTextAreanombreLinea.setVisible(this.lineaConstantesFunciones.mostrarnombreLinea);
		this.jInternalFrameDetalleFormLinea.jPanelnombreLinea.setVisible(this.lineaConstantesFunciones.mostrarnombreLinea);
		//this.jInternalFrameDetalleFormLinea.jTextAreadescripcionLinea.setVisible(this.lineaConstantesFunciones.mostrardescripcionLinea);
		this.jInternalFrameDetalleFormLinea.jPaneldescripcionLinea.setVisible(this.lineaConstantesFunciones.mostrardescripcionLinea);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioLinea() throws Exception {
		if(this.jInternalFrameDetalleFormLinea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormLinea!=null) {
	
		this.jInternalFrameDetalleFormLinea.jLabelidLinea.setEnabled(this.lineaConstantesFunciones.activaridLinea);
		this.jInternalFrameDetalleFormLinea.jComboBoxid_empresaLinea.setEnabled(this.lineaConstantesFunciones.activarid_empresaLinea);
		this.jInternalFrameDetalleFormLinea.jComboBoxid_nivel_lineaLinea.setEnabled(this.lineaConstantesFunciones.activarid_nivel_lineaLinea);
		this.jInternalFrameDetalleFormLinea.jComboBoxid_lineaLinea.setEnabled(this.lineaConstantesFunciones.activarid_lineaLinea);
			this.jInternalFrameDetalleFormLinea.jButtonid_lineaLinea.setEnabled(this.lineaConstantesFunciones.activarid_lineaLinea);
		this.jInternalFrameDetalleFormLinea.jTextFieldcodigoLinea.setEnabled(this.lineaConstantesFunciones.activarcodigoLinea);
		this.jInternalFrameDetalleFormLinea.jTextAreanombreLinea.setEnabled(this.lineaConstantesFunciones.activarnombreLinea);
		this.jInternalFrameDetalleFormLinea.jTextAreadescripcionLinea.setEnabled(this.lineaConstantesFunciones.activardescripcionLinea);
		}
	}
	
		
}