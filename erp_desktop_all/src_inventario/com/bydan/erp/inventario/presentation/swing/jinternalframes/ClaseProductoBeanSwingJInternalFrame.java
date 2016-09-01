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

import com.bydan.erp.inventario.util.ClaseProductoConstantesFunciones;
import com.bydan.erp.inventario.util.ClaseProductoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.ClaseProductoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.ClaseProductoBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ClaseProductoBeanSwingJInternalFrame extends ClaseProductoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ClaseProductoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ClaseProducto> claseproductoValidator = new ClassValidator<ClaseProducto>(ClaseProducto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ClaseProducto claseproducto;	
	public ClaseProducto claseproductoAux;
	public ClaseProducto claseproductoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ClaseProducto claseproductoTotales;
	public Long idClaseProductoActual;
	public Long iIdNuevoClaseProducto=0L;
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

	public String sFinalQueryComboTipoProducto="";

	public List<TipoProducto> tipoproductosForeignKey;

	public List<TipoProducto> gettipoproductosForeignKey() {
		return tipoproductosForeignKey;
	}

	public void settipoproductosForeignKey(List<TipoProducto> tipoproductosForeignKey) {
		this.tipoproductosForeignKey = tipoproductosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoProducto tipoproductoForeignKey;

	public TipoProducto gettipoproductoForeignKey() {
		return tipoproductoForeignKey;
	}

	public void settipoproductoForeignKey(TipoProducto tipoproductoForeignKey) {
		this.tipoproductoForeignKey = tipoproductoForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosProducto=false;

	public Boolean getIsTienePermisosProducto() {
		return isTienePermisosProducto;
	}

	public void setIsTienePermisosProducto(Boolean isTienePermisosProducto) {
		this.isTienePermisosProducto= isTienePermisosProducto;
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
	
	public Boolean isPermisoTodoClaseProducto;
	public Boolean isPermisoNuevoClaseProducto;
	public Boolean isPermisoActualizarClaseProducto;
	public Boolean isPermisoActualizarOriginalClaseProducto;
	public Boolean isPermisoEliminarClaseProducto;
	public Boolean isPermisoGuardarCambiosClaseProducto;
	public Boolean isPermisoConsultaClaseProducto;
	public Boolean isPermisoBusquedaClaseProducto;
	public Boolean isPermisoReporteClaseProducto;
	public Boolean isPermisoPaginacionMedioClaseProducto;
	public Boolean isPermisoPaginacionAltoClaseProducto;
	public Boolean isPermisoPaginacionTodoClaseProducto;
	public Boolean isPermisoCopiarClaseProducto;
	public Boolean isPermisoVerFormClaseProducto;
	public Boolean isPermisoDuplicarClaseProducto;
	public Boolean isPermisoOrdenClaseProducto;
	
	
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
	
	public ClaseProductoParameterReturnGeneral claseproductoReturnGeneral;
	public ClaseProductoParameterReturnGeneral claseproductoParameterGeneral;
	
	

	public ProductoLogic productoLogic=null;

	public ProductoLogic getProductoLogic() {
		return productoLogic;
	}

	public void setProductoLogic(ProductoLogic productoLogic) {
		this.productoLogic = productoLogic;
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
	
	public Boolean isEsNuevoClaseProducto=false;
	public Boolean esParaAccionDesdeFormularioClaseProducto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ClaseProductoSessionBeanAdditional claseproductoSessionBeanAdditional=null;
	
	public ClaseProductoSessionBeanAdditional getClaseProductoSessionBeanAdditional() {
		return this.claseproductoSessionBeanAdditional;
	}
	
	public void setClaseProductoSessionBeanAdditional(ClaseProductoSessionBeanAdditional claseproductoSessionBeanAdditional) {
		try {
			this.claseproductoSessionBeanAdditional=claseproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ClaseProductoBeanSwingJInternalFrameAdditional claseproductoBeanSwingJInternalFrameAdditional=null;
	//public class ClaseProductoBeanSwingJInternalFrame
	
	public ClaseProductoBeanSwingJInternalFrameAdditional getClaseProductoBeanSwingJInternalFrameAdditional() {
		return this.claseproductoBeanSwingJInternalFrameAdditional;
	}
	
	public void setClaseProductoBeanSwingJInternalFrameAdditional(ClaseProductoBeanSwingJInternalFrameAdditional claseproductoBeanSwingJInternalFrameAdditional) {
		try {
			this.claseproductoBeanSwingJInternalFrameAdditional=claseproductoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ClaseProductoLogic claseproductoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ClaseProducto claseproductoBean;
	public ClaseProductoConstantesFunciones claseproductoConstantesFunciones;
	//public ClaseProductoParameterReturnGeneral claseproductoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoProductoLogic tipoproductoLogic;
	
	//PARAMETROS
	
	
	//public List<ClaseProducto> claseproductos;	
	//public List<ClaseProducto> claseproductosEliminados;
	//public List<ClaseProducto> claseproductosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoClaseProducto=false;
	public Boolean isVisibilidadCeldaDuplicarClaseProducto=true;
	public Boolean isVisibilidadCeldaCopiarClaseProducto=true;
	public Boolean isVisibilidadCeldaVerFormClaseProducto=true;
	public Boolean isVisibilidadCeldaOrdenClaseProducto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesClaseProducto=false;
	public Boolean isVisibilidadCeldaModificarClaseProducto=false;
	public Boolean isVisibilidadCeldaActualizarClaseProducto=false;
	public Boolean isVisibilidadCeldaEliminarClaseProducto=false;
	public Boolean isVisibilidadCeldaCancelarClaseProducto=false;
	public Boolean isVisibilidadCeldaGuardarClaseProducto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosClaseProducto=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoProducto=false;
	
	public Long getiIdNuevoClaseProducto() {
		return this.iIdNuevoClaseProducto;
	}

	public void setiIdNuevoClaseProducto(Long iIdNuevoClaseProducto) {
		this.iIdNuevoClaseProducto = iIdNuevoClaseProducto;
	}
	
	public Long getidClaseProductoActual() {
		return this.idClaseProductoActual;
	}

	public void setidClaseProductoActual(Long idClaseProductoActual) {
		this.idClaseProductoActual = idClaseProductoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ClaseProducto getclaseproducto() {
		return this.claseproducto;
	}

	public void setclaseproducto(ClaseProducto claseproducto) {
		this.claseproducto = claseproducto;
	}
	
	public ClaseProducto getclaseproductoAux() {
		return this.claseproductoAux;
	}

	public void setclaseproductoAux(ClaseProducto claseproductoAux) {
		this.claseproductoAux = claseproductoAux;
	}				
	
	public ClaseProducto getclaseproductoAnterior() {
		return this.claseproductoAnterior;
	}

	public void setclaseproductoAnterior(ClaseProducto claseproductoAnterior) {
		this.claseproductoAnterior = claseproductoAnterior;
	}	
	
	public ClaseProducto getclaseproductoTotales() {
		return this.claseproductoTotales;
	}

	public void setclaseproductoTotales(ClaseProducto claseproductoTotales) {
		this.claseproductoTotales = claseproductoTotales;
	}	
	
	public ClaseProducto getclaseproductoBean() {
		return this.claseproductoBean;
	}

	public void setclaseproductoBean(ClaseProducto claseproductoBean) {
		this.claseproductoBean = claseproductoBean;
	}	
	
	public ClaseProductoParameterReturnGeneral getclaseproductoReturnGeneral() {
		return this.claseproductoReturnGeneral;
	}

	public void setclaseproductoReturnGeneral(ClaseProductoParameterReturnGeneral claseproductoReturnGeneral) {
		this.claseproductoReturnGeneral = claseproductoReturnGeneral;
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

	public Long id_tipo_productoFK_IdTipoProducto=-1L;

	public Long getid_tipo_productoFK_IdTipoProducto() {
		return this.id_tipo_productoFK_IdTipoProducto;
	}

	public void setid_tipo_productoFK_IdTipoProducto(Long id_tipo_productoFK_IdTipoProducto) {
		this.id_tipo_productoFK_IdTipoProducto = id_tipo_productoFK_IdTipoProducto;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ClaseProductoLogic getClaseProductoLogic()	{		
		return claseproductoLogic;
	}

	public void setClaseProductoLogic(ClaseProductoLogic claseproductoLogic) {
		this.claseproductoLogic = claseproductoLogic;
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
	
	public Boolean getIsEsNuevoClaseProducto() {
		return isEsNuevoClaseProducto;
	}

	public void setIsEsNuevoClaseProducto(Boolean isEsNuevoClaseProducto) {
		this.isEsNuevoClaseProducto = isEsNuevoClaseProducto;
	}

	public Boolean getEsParaAccionDesdeFormularioClaseProducto() {
		return esParaAccionDesdeFormularioClaseProducto;
	}
	
	public void setEsParaAccionDesdeFormularioClaseProducto(Boolean esParaAccionDesdeFormularioClaseProducto) {
		this.esParaAccionDesdeFormularioClaseProducto = esParaAccionDesdeFormularioClaseProducto;
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

			if(this.claseproductoSessionBean==null) {
				this.claseproductoSessionBean=new ClaseProductoSessionBean();
			}

			if(!this.claseproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(claseproductoSessionBean.getlidEmpresaActual());
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

	public void cargarCombosTipoProductosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoproductosForeignKey=new ArrayList<TipoProducto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoProductoLogic tipoproductoLogic=new TipoProductoLogic();

			//tipoproductoLogic.getTipoProductoDataAccess().setIsForForeingKeyData(true);

			if(this.claseproductoSessionBean==null) {
				this.claseproductoSessionBean=new ClaseProductoSessionBean();
			}

			if(!this.claseproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProducto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoproductoLogic.getTipoProductoDataAccess().setIsForForeingKeyData(true);

					tipoproductoLogic.getTodosTipoProductosWithConnection(sFinalQuery,new Pagination());

					this.tipoproductosForeignKey=tipoproductoLogic.getTipoProductos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoProducto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoproductoLogic.getEntityWithConnection(claseproductoSessionBean.getlidTipoProductoActual());
					this.tipoproductosForeignKey.add(tipoproductoLogic.getTipoProducto());
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

					if(this.claseproducto!=null) {
						this.claseproducto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormClaseProducto!=null) {
						this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_empresaClaseProducto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaClaseProducto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormClaseProducto!=null) {
						if(this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_empresaClaseProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_empresaClaseProducto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaClaseProductoGenerico)throws Exception
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
				jComboBoxid_empresaClaseProductoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaClaseProductoGenerico!=null && jComboBoxid_empresaClaseProductoGenerico.getItemCount()>0) {
					jComboBoxid_empresaClaseProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoProductoForeignKey(Long idTipoProductoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoProducto  tipoproductoTemp=null;

			for(TipoProducto tipoproductoAux:tipoproductosForeignKey) {
				if(tipoproductoAux.getId()!=null && tipoproductoAux.getId().equals(idTipoProductoSeleccionado)) {
					tipoproductoTemp=tipoproductoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoproductoTemp!=null) {

					if(this.claseproducto!=null) {
						this.claseproducto.setTipoProducto(tipoproductoTemp);
					}

					if(this.jInternalFrameDetalleFormClaseProducto!=null) {
						this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_tipo_productoClaseProducto.setSelectedItem(tipoproductoTemp);
					}
				} else {
					//jComboBoxid_tipo_productoClaseProducto.setSelectedItem(tipoproductoTemp);
					if(this.jInternalFrameDetalleFormClaseProducto!=null) {
						if(this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_tipo_productoClaseProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_tipo_productoClaseProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoproductoTemp!=null && jComboBoxid_tipo_productoFK_IdTipoProductoClaseProducto!=null) {
						jComboBoxid_tipo_productoFK_IdTipoProductoClaseProducto.setSelectedItem(tipoproductoTemp);
					} else {
						if(jComboBoxid_tipo_productoFK_IdTipoProductoClaseProducto!=null) {
							//jComboBoxid_tipo_productoFK_IdTipoProductoClaseProducto.setSelectedItem(tipoproductoTemp);
							if(jComboBoxid_tipo_productoFK_IdTipoProductoClaseProducto.getItemCount()>0) {
								jComboBoxid_tipo_productoFK_IdTipoProductoClaseProducto.setSelectedIndex(0);
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

	public String getActualTipoProductoForeignKeyDescripcion(Long idTipoProductoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoProducto  tipoproductoTemp=null;

			for(TipoProducto tipoproductoAux:tipoproductosForeignKey) {
				if(tipoproductoAux.getId()!=null && tipoproductoAux.getId().equals(idTipoProductoSeleccionado)) {
					tipoproductoTemp=tipoproductoAux;
					break;
				}
			}


			sDescripcion=TipoProductoConstantesFunciones.getTipoProductoDescripcion(tipoproductoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoProductoForeignKeyGenerico(Long idTipoProductoSeleccionado,JComboBox jComboBoxid_tipo_productoClaseProductoGenerico)throws Exception
	{
		try
		{
			TipoProducto  tipoproductoTemp=null;

			for(TipoProducto tipoproductoAux:tipoproductosForeignKey) {
				if(tipoproductoAux.getId()!=null && tipoproductoAux.getId().equals(idTipoProductoSeleccionado)) {
					tipoproductoTemp=tipoproductoAux;
					break;
				}
			}

			if(tipoproductoTemp!=null) {
				jComboBoxid_tipo_productoClaseProductoGenerico.setSelectedItem(tipoproductoTemp);
			} else {
				if(jComboBoxid_tipo_productoClaseProductoGenerico!=null && jComboBoxid_tipo_productoClaseProductoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_productoClaseProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ClaseProducto claseproducto,JComboBox jComboBoxid_empresaClaseProductoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaClaseProductoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_empresaClaseProducto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaClaseProductoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				claseproducto.setid_empresa(empresaAux.getId());
				claseproducto.setempresa_descripcion(ClaseProductoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				claseproducto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoProductoForeignKey(ClaseProducto claseproducto,JComboBox jComboBoxid_tipo_productoClaseProductoGenerico)throws Exception
	{
		try
		{
			TipoProducto  tipoproductoAux=new TipoProducto();

			if(jComboBoxid_tipo_productoClaseProductoGenerico==null) {
				tipoproductoAux=(TipoProducto)this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_tipo_productoClaseProducto.getSelectedItem();
			} else {
				tipoproductoAux=(TipoProducto)jComboBoxid_tipo_productoClaseProductoGenerico.getSelectedItem();
			}

			if(tipoproductoAux!=null && tipoproductoAux.getId()!=null) {
				claseproducto.setid_tipo_producto(tipoproductoAux.getId());
				claseproducto.settipoproducto_descripcion(ClaseProductoConstantesFunciones.getTipoProductoDescripcion(tipoproductoAux));
				claseproducto.setTipoProducto(tipoproductoAux);			}
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

					if(!ClaseProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormClaseProducto!=null) { 
							this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_empresaClaseProducto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_empresaClaseProducto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormClaseProducto!=null) { 
					}

					if(!ClaseProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoProductosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoProducto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ClaseProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormClaseProducto!=null) { 
							this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_tipo_productoClaseProducto.removeAllItems();

							for(TipoProducto tipoproducto:this.tipoproductosForeignKey) {
								this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_tipo_productoClaseProducto.addItem(tipoproducto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormClaseProducto!=null) { 
					}

					if(!ClaseProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ClaseProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_productoFK_IdTipoProductoClaseProducto.removeAllItems();

							for(TipoProducto tipoproducto:this.tipoproductosForeignKey) {
								this.jComboBoxid_tipo_productoFK_IdTipoProductoClaseProducto.addItem(tipoproducto);
							}
						}

						if(!ClaseProductoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormClaseProducto!=null) {
							this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_empresaClaseProducto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormClaseProducto!=null) {
							this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_empresaClaseProducto.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoProductoForeignKey(TipoProducto tipoproducto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormClaseProducto!=null) {
							this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_tipo_productoClaseProducto.setSelectedItem(tipoproducto);
						}
					} else {
						if(this.jInternalFrameDetalleFormClaseProducto!=null) {
							this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_tipo_productoClaseProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_productoFK_IdTipoProductoClaseProducto.setSelectedItem(tipoproducto);
						} else {
							this.jComboBoxid_tipo_productoFK_IdTipoProductoClaseProducto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesClaseProducto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ClaseProductoConstantesFunciones.refrescarForeignKeysDescripcionesClaseProducto(this.claseproductoLogic.getClaseProductos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ClaseProductoConstantesFunciones.refrescarForeignKeysDescripcionesClaseProducto(this.claseproductos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(TipoProducto.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//claseproductoLogic.setClaseProductos(this.claseproductos);
			claseproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ClaseProductoParameterReturnGeneral getClaseProductoParameterGeneral() {
		return this.claseproductoParameterGeneral;
	}
	
	public void setClaseProductoParameterGeneral(ClaseProductoParameterReturnGeneral claseproductoParameterGeneral) {
		this.claseproductoParameterGeneral = claseproductoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoClaseProducto() {
		return isPermisoTodoClaseProducto;
	}

	public void setIsPermisoTodoClaseProducto(Boolean isPermisoTodoClaseProducto) {
		this.isPermisoTodoClaseProducto = isPermisoTodoClaseProducto;
	}

	public Boolean getIsPermisoNuevoClaseProducto() {
		return isPermisoNuevoClaseProducto;
	}

	public void setIsPermisoNuevoClaseProducto(Boolean isPermisoNuevoClaseProducto) {
		this.isPermisoNuevoClaseProducto = isPermisoNuevoClaseProducto;
	}

	public Boolean getIsPermisoActualizarClaseProducto() {
		return isPermisoActualizarClaseProducto;
	}

	public void setIsPermisoActualizarClaseProducto(Boolean isPermisoActualizarClaseProducto) {
		this.isPermisoActualizarClaseProducto = isPermisoActualizarClaseProducto;
	}

	public Boolean getIsPermisoEliminarClaseProducto() {
		return isPermisoEliminarClaseProducto;
	}

	public void setIsPermisoEliminarClaseProducto(Boolean isPermisoEliminarClaseProducto) {
		this.isPermisoEliminarClaseProducto = isPermisoEliminarClaseProducto;
	}

	public Boolean getIsPermisoGuardarCambiosClaseProducto() {
		return isPermisoGuardarCambiosClaseProducto;
	}

	public void setIsPermisoGuardarCambiosClaseProducto(Boolean isPermisoGuardarCambiosClaseProducto) {
		this.isPermisoGuardarCambiosClaseProducto = isPermisoGuardarCambiosClaseProducto;
	}
	
	public Boolean getIsPermisoConsultaClaseProducto() {
		return isPermisoConsultaClaseProducto;
	}

	public void setIsPermisoConsultaClaseProducto(Boolean isPermisoConsultaClaseProducto) {
		this.isPermisoConsultaClaseProducto = isPermisoConsultaClaseProducto;
	}

	public Boolean getIsPermisoBusquedaClaseProducto() {
		return isPermisoBusquedaClaseProducto;
	}

	public void setIsPermisoBusquedaClaseProducto(Boolean isPermisoBusquedaClaseProducto) {
		this.isPermisoBusquedaClaseProducto = isPermisoBusquedaClaseProducto;
	}

	public Boolean getIsPermisoReporteClaseProducto() {
		return isPermisoReporteClaseProducto;
	}

	public void setIsPermisoReporteClaseProducto(Boolean isPermisoReporteClaseProducto) {
		this.isPermisoReporteClaseProducto = isPermisoReporteClaseProducto;
	}
	
	public Boolean getIsPermisoPaginacionMedioClaseProducto() {
		return isPermisoPaginacionMedioClaseProducto;
	}

	public void setIsPermisoPaginacionMedioClaseProducto(Boolean isPermisoPaginacionMedioClaseProducto) {
		this.isPermisoPaginacionMedioClaseProducto = isPermisoPaginacionMedioClaseProducto;
	}
	
	public Boolean getIsPermisoPaginacionTodoClaseProducto() {
		return isPermisoPaginacionTodoClaseProducto;
	}

	public void setIsPermisoPaginacionTodoClaseProducto(Boolean isPermisoPaginacionTodoClaseProducto) {
		this.isPermisoPaginacionTodoClaseProducto = isPermisoPaginacionTodoClaseProducto;
	}
	
	public Boolean getIsPermisoPaginacionAltoClaseProducto() {
		return isPermisoPaginacionAltoClaseProducto;
	}

	public void setIsPermisoPaginacionAltoClaseProducto(Boolean isPermisoPaginacionAltoClaseProducto) {
		this.isPermisoPaginacionAltoClaseProducto = isPermisoPaginacionAltoClaseProducto;
	}
	
	public Boolean getIsPermisoCopiarClaseProducto() {
		return isPermisoCopiarClaseProducto;
	}

	public void setIsPermisoCopiarClaseProducto(Boolean isPermisoCopiarClaseProducto) {
		this.isPermisoCopiarClaseProducto = isPermisoCopiarClaseProducto;
	}
	
	public Boolean getIsPermisoVerFormClaseProducto() {
		return isPermisoVerFormClaseProducto;
	}

	public void setIsPermisoVerFormClaseProducto(Boolean isPermisoVerFormClaseProducto) {
		this.isPermisoVerFormClaseProducto = isPermisoVerFormClaseProducto;
	}
	
	public Boolean getIsPermisoDuplicarClaseProducto() {
		return isPermisoDuplicarClaseProducto;
	}

	public void setIsPermisoDuplicarClaseProducto(Boolean isPermisoDuplicarClaseProducto) {
		this.isPermisoDuplicarClaseProducto = isPermisoDuplicarClaseProducto;
	}
	
	public Boolean getIsPermisoOrdenClaseProducto() {
		return isPermisoOrdenClaseProducto;
	}

	public void setIsPermisoOrdenClaseProducto(Boolean isPermisoOrdenClaseProducto) {
		this.isPermisoOrdenClaseProducto = isPermisoOrdenClaseProducto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoClaseProducto() {
		return isVisibilidadCeldaNuevoClaseProducto;
	}

	public void setIsVisibilidadCeldaNuevoClaseProducto(Boolean isVisibilidadCeldaNuevoClaseProducto) {
		this.isVisibilidadCeldaNuevoClaseProducto = isVisibilidadCeldaNuevoClaseProducto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarClaseProducto() {
		return isVisibilidadCeldaDuplicarClaseProducto;
	}

	public void setIsVisibilidadCeldaDuplicarClaseProducto(Boolean isVisibilidadCeldaDuplicarClaseProducto) {
		this.isVisibilidadCeldaDuplicarClaseProducto = isVisibilidadCeldaDuplicarClaseProducto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarClaseProducto() {
		return isVisibilidadCeldaCopiarClaseProducto;
	}

	public void setIsVisibilidadCeldaCopiarClaseProducto(Boolean isVisibilidadCeldaCopiarClaseProducto) {
		this.isVisibilidadCeldaCopiarClaseProducto = isVisibilidadCeldaCopiarClaseProducto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormClaseProducto() {
		return isVisibilidadCeldaVerFormClaseProducto;
	}

	public void setIsVisibilidadCeldaVerFormClaseProducto(Boolean isVisibilidadCeldaVerFormClaseProducto) {
		this.isVisibilidadCeldaVerFormClaseProducto = isVisibilidadCeldaVerFormClaseProducto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenClaseProducto() {
		return isVisibilidadCeldaOrdenClaseProducto;
	}

	public void setIsVisibilidadCeldaOrdenClaseProducto(Boolean isVisibilidadCeldaOrdenClaseProducto) {
		this.isVisibilidadCeldaOrdenClaseProducto = isVisibilidadCeldaOrdenClaseProducto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesClaseProducto() {
		return isVisibilidadCeldaNuevoRelacionesClaseProducto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesClaseProducto(Boolean isVisibilidadCeldaNuevoRelacionesClaseProducto) {
		this.isVisibilidadCeldaNuevoRelacionesClaseProducto = isVisibilidadCeldaNuevoRelacionesClaseProducto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarClaseProducto() {
		return isVisibilidadCeldaModificarClaseProducto;
	}

	public void setIsVisibilidadCeldaModificarClaseProducto(Boolean isVisibilidadCeldaModificarClaseProducto) {
		this.isVisibilidadCeldaModificarClaseProducto = isVisibilidadCeldaModificarClaseProducto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarClaseProducto() {
		return isVisibilidadCeldaActualizarClaseProducto;
	}

	public void setIsVisibilidadCeldaActualizarClaseProducto(Boolean isVisibilidadCeldaActualizarClaseProducto) {
		this.isVisibilidadCeldaActualizarClaseProducto = isVisibilidadCeldaActualizarClaseProducto;
	}

	public Boolean getIsVisibilidadCeldaEliminarClaseProducto() {
		return isVisibilidadCeldaEliminarClaseProducto;
	}

	public void setIsVisibilidadCeldaEliminarClaseProducto(Boolean isVisibilidadCeldaEliminarClaseProducto) {
		this.isVisibilidadCeldaEliminarClaseProducto = isVisibilidadCeldaEliminarClaseProducto;
	}

	public Boolean getIsVisibilidadCeldaCancelarClaseProducto() {
		return isVisibilidadCeldaCancelarClaseProducto;
	}

	public void setIsVisibilidadCeldaCancelarClaseProducto(Boolean isVisibilidadCeldaCancelarClaseProducto) {
		this.isVisibilidadCeldaCancelarClaseProducto = isVisibilidadCeldaCancelarClaseProducto;
	}

	public Boolean getIsVisibilidadCeldaGuardarClaseProducto() {
		return isVisibilidadCeldaGuardarClaseProducto;
	}

	public void setIsVisibilidadCeldaGuardarClaseProducto(Boolean isVisibilidadCeldaGuardarClaseProducto) {
		this.isVisibilidadCeldaGuardarClaseProducto = isVisibilidadCeldaGuardarClaseProducto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosClaseProducto() {
		return isVisibilidadCeldaGuardarCambiosClaseProducto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosClaseProducto(Boolean isVisibilidadCeldaGuardarCambiosClaseProducto) {
		this.isVisibilidadCeldaGuardarCambiosClaseProducto = isVisibilidadCeldaGuardarCambiosClaseProducto;
	}
		
	public ClaseProductoSessionBean getclaseproductoSessionBean() {
		return this.claseproductoSessionBean;
	}
	
	public void setclaseproductoSessionBean(ClaseProductoSessionBean claseproductoSessionBean) {
		this.claseproductoSessionBean=claseproductoSessionBean;
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

	public Boolean getisVisibilidadFK_IdTipoProducto() {
		return this.isVisibilidadFK_IdTipoProducto;
	}

	public void setisVisibilidadFK_IdTipoProducto(Boolean isVisibilidadFK_IdTipoProducto) {
		this.isVisibilidadFK_IdTipoProducto=isVisibilidadFK_IdTipoProducto;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysClaseProducto(ClaseProducto claseproducto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(claseproducto,null);
				this.setActualParaGuardarTipoProductoForeignKey(claseproducto,null);
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
	
	public void bugActualizarReferenciaActual(ClaseProducto claseproducto,ClaseProducto claseproductoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalClaseProducto(claseproducto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		claseproductoAux.setId(claseproducto.getId());
		claseproductoAux.setVersionRow(claseproducto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessClaseProducto();
		
			int intSelectedRow = this.jTableDatosClaseProducto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproducto =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.claseproducto =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ClaseProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualClaseProducto(this.claseproducto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysClaseProducto(this.claseproducto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = claseproductoValidator.getInvalidValues(this.claseproducto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			claseproductoLogic.setDatosCliente(datosCliente);
			claseproductoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				claseproductoAux=new  ClaseProducto();
				
				claseproductoAux.setIsNew(true);
				claseproductoAux.setIsChanged(true);
				
				claseproductoAux.setClaseProductoOriginal(this.claseproducto);
				
				claseproductoAux.setId(this.claseproducto.getId());	
				claseproductoAux.setVersionRow(this.claseproducto.getVersionRow());	
				claseproductoAux.setid_empresa(this.claseproducto.getid_empresa());	
				claseproductoAux.setid_tipo_producto(this.claseproducto.getid_tipo_producto());	
				claseproductoAux.setcodigo(this.claseproducto.getcodigo());	
				claseproductoAux.setnombre(this.claseproducto.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.claseproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.claseproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(claseproductoAux,claseproductoLogic.getClaseProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(claseproductoAux,claseproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.claseproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.claseproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						claseproductoLogic.saveClaseProductos();//WithConnection
						//claseproductoLogic.getSetVersionRowClaseProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.claseproducto,claseproductoAux);
					
					this.refrescarForeignKeysDescripcionesClaseProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.claseproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.claseproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								claseproductoLogic.saveClaseProductoRelaciones(claseproductoAux,this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//claseproductoLogic.getSetVersionRowClaseProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.claseproducto,claseproductoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							claseproductoAux.setProductos(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							claseproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.claseproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.claseproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(claseproductoAux,claseproductoLogic.getClaseProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(claseproductoAux,claseproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.claseproducto,claseproductoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				claseproductoAux=new  ClaseProducto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.claseproductoSessionBean.getEsGuardarRelacionado() 
					|| (this.claseproductoSessionBean.getEsGuardarRelacionado() && this.claseproducto.getId()>=0)) {
						
					claseproductoAux.setIsNew(false);
				}
				
				claseproductoAux.setIsDeleted(false);
			
				claseproductoAux.setId(this.claseproducto.getId());	
				claseproductoAux.setVersionRow(this.claseproducto.getVersionRow());	
				claseproductoAux.setid_empresa(this.claseproducto.getid_empresa());	
				claseproductoAux.setid_tipo_producto(this.claseproducto.getid_tipo_producto());	
				claseproductoAux.setcodigo(this.claseproducto.getcodigo());	
				claseproductoAux.setnombre(this.claseproducto.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(claseproductoAux,claseproductoLogic.getClaseProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(claseproductoAux,claseproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.claseproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.claseproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						claseproductoLogic.saveClaseProductos();//WithConnection
						//claseproductoLogic.getSetVersionRowClaseProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.claseproducto,claseproductoAux);
					
					this.refrescarForeignKeysDescripcionesClaseProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.claseproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.claseproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								claseproductoLogic.saveClaseProductoRelaciones(claseproductoAux,this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//claseproductoLogic.getSetVersionRowClaseProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.claseproducto,claseproductoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							claseproductoAux.setProductos(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							claseproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.claseproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.claseproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(claseproductoAux,claseproductoLogic.getClaseProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(claseproductoAux,claseproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.claseproducto,claseproductoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				claseproductoAux=new  ClaseProducto();
				
				claseproductoAux.setIsNew(false);
				claseproductoAux.setIsChanged(false);
				
				claseproductoAux.setIsDeleted(true);
				
				claseproductoAux.setId(this.claseproducto.getId());	
				claseproductoAux.setVersionRow(this.claseproducto.getVersionRow());	
				claseproductoAux.setid_empresa(this.claseproducto.getid_empresa());	
				claseproductoAux.setid_tipo_producto(this.claseproducto.getid_tipo_producto());	
				claseproductoAux.setcodigo(this.claseproducto.getcodigo());	
				claseproductoAux.setnombre(this.claseproducto.getnombre());	
				
				if(this.claseproductoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.claseproductoAux.getId()>=0) {	
						this.claseproductosEliminados.add(claseproductoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(claseproductoAux,claseproductoLogic.getClaseProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(claseproductoAux,claseproductos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.claseproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.claseproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						claseproductoLogic.saveClaseProductos();//WithConnection
						//claseproductoLogic.getSetVersionRowClaseProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.claseproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.claseproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								claseproductoLogic.saveClaseProductoRelaciones(claseproductoAux,this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//claseproductoLogic.getSetVersionRowClaseProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							claseproductoAux.setProductos(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							claseproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.claseproductoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.claseproductoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(claseproductoAux,claseproductoLogic.getClaseProductos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(claseproductoAux,claseproductos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.getClaseProductos().addAll(this.claseproductosEliminados);
					
					claseproductoLogic.saveClaseProductos();//WithConnection
					//claseproductoLogic.getSetVersionRowClaseProductos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesClaseProducto();
				
				this.claseproductosEliminados= new ArrayList<ClaseProducto>();		
			}
			
			if(this.claseproductoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.claseproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Clase Producto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Clase Producto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.claseproducto=claseproductoAux;
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
      		//this.finishProcessClaseProducto();
      	}
		
	}	
	
	public void actualizarRelaciones(ClaseProducto claseproductoLocal) throws Exception {
		
		if(this.claseproductoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				claseproductoLocal.setProductos(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());
				claseproductoLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
			
			} else {
			
				claseproductoLocal.setProductos(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productos);
				claseproductoLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ClaseProducto claseproductoLocal) throws Exception {	
		if(this.claseproductoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				claseproductoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoProductoDetalleFormJInternalFrame.class)) {
				TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrameLocal=(TipoProductoBeanSwingJInternalFrame) ((TipoProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoproductoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoProducto(tipoproductoBeanSwingJInternalFrameLocal.gettipoproducto(),true);
				tipoproductoBeanSwingJInternalFrameLocal.actualizarLista(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto,this.tipoproductosForeignKey);

				tipoproductoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto);

				claseproductoLocal.setTipoProducto(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto);

				this.addItemDefectoCombosForeignKeyTipoProducto();
				this.cargarCombosFrameTipoProductosForeignKey("Formulario");
				this.setActualTipoProductoForeignKey(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarClaseProductoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosClaseProducto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.claseproducto =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.claseproducto =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = claseproductoValidator.getInvalidValues(this.claseproducto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ClaseProducto claseproducto,List<ClaseProducto> claseproductos) throws Exception {
		try	{		
			ClaseProductoConstantesFunciones.actualizarLista(claseproducto,claseproductos,this.claseproductoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ClaseProducto claseproducto,List<ClaseProducto> claseproductos) throws Exception {
		try	{			
			ClaseProductoConstantesFunciones.actualizarSelectedLista(claseproducto,claseproductos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ClaseProducto> claseproductosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				claseproductosLocal=this.claseproductoLogic.getClaseProductos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				claseproductosLocal=this.claseproductos;
			}
			//ARCHITECTURE
		
			for(ClaseProducto claseproductoLocal:claseproductosLocal) {
				if(this.permiteMantenimiento(claseproductoLocal) && claseproductoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ClaseProductoConstantesFunciones.getClaseProductoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ClaseProductoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClaseProducto.jLabelid_empresaClaseProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ClaseProductoConstantesFunciones.IDTIPOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClaseProducto.jLabelid_tipo_productoClaseProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ClaseProductoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClaseProducto.jLabelcodigoClaseProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ClaseProductoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClaseProducto.jLabelnombreClaseProducto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormClaseProducto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClaseProducto.jLabelid_empresaClaseProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClaseProducto.jLabelid_tipo_productoClaseProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClaseProducto.jLabelcodigoClaseProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClaseProducto.jLabelnombreClaseProducto,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Producto")) {
			if(this.claseproducto==null) {
				this.claseproducto= new ClaseProducto();
			}

			if(this.claseproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoClaseProducto
				this.setVariablesFormularioToObjetoActualClaseProducto(this.claseproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysClaseProducto(this.claseproducto);

				this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.getproducto().setClaseProducto(this.claseproducto);
			}

			return;
		}
		 else  if(sTipo.equals("ParametroInventarioDefecto")) {
			if(this.claseproducto==null) {
				this.claseproducto= new ClaseProducto();
			}

			if(this.claseproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoClaseProducto
				this.setVariablesFormularioToObjetoActualClaseProducto(this.claseproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysClaseProducto(this.claseproducto);

				this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.getparametroinventariodefecto().setClaseProducto(this.claseproducto);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoClaseProducto--;	
		
		
		this.claseproductoAux=new ClaseProducto();
		
		this.claseproductoAux.setId(this.iIdNuevoClaseProducto);
		this.claseproductoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.claseproductoLogic.getClaseProductos().add(this.claseproductoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.claseproductos.add(this.claseproductoAux);
		}
		//ARCHITECTURE
		
		this.claseproducto=this.claseproductoAux;
		
		if(ClaseProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioClaseProducto(this.claseproducto);
			this.setVariablesObjetoActualToFormularioForeignKeyClaseProducto(this.claseproducto);
		}
				
		//this.setDefaultControlesClaseProducto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyClaseProducto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyClaseProducto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyClaseProducto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualClaseProducto(this.claseproductoBean,this.claseproducto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysClaseProducto(this.claseproducto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ClaseProductoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.claseproductoSessionBean.getConGuardarRelaciones()) {
			classes=ClaseProductoConstantesFunciones.getClassesRelationshipsOfClaseProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.claseproductoReturnGeneral=claseproductoLogic.procesarEventosClaseProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.claseproductoLogic.getClaseProductos(),this.claseproducto,this.claseproductoParameterGeneral,this.isEsNuevoClaseProducto,classes);//this.claseproductoLogic.getClaseProducto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanClaseProducto(this.claseproductoReturnGeneral,this.claseproductoBean,false);
		
		if(this.claseproductoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyClaseProducto(this.claseproductoReturnGeneral.getClaseProducto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioClaseProducto(this.claseproductoReturnGeneral.getClaseProducto());
		}
		
		if(this.claseproductoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioClaseProducto(this.claseproductoReturnGeneral.getClaseProducto(),classes);//this.claseproductoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualClaseProducto(this.claseproducto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyClaseProducto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyClaseProducto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ClaseProductoBeanSwingJInternalFrameAdditional.RecargarFormClaseProducto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingClaseProducto(false);
						
			if(claseproductoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado() && ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(ClaseProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualClaseProducto();
			}
			
			this.actualizarVisualTableDatosClaseProducto();
			
			this.jTableDatosClaseProducto.setRowSelectionInterval(this.getIndiceNuevoClaseProducto(), this.getIndiceNuevoClaseProducto());
			
			this.seleccionarFilaTablaClaseProductoActual();
						
			this.actualizarEstadoCeldasBotonesClaseProducto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesClaseProducto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormClaseProducto.jTextFieldcodigoClaseProducto.setEnabled(isHabilitar && this.claseproductoConstantesFunciones.activarcodigoClaseProducto);
		this.jInternalFrameDetalleFormClaseProducto.jTextAreanombreClaseProducto.setEnabled(isHabilitar && this.claseproductoConstantesFunciones.activarnombreClaseProducto);	
		//
		this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_empresaClaseProducto.setEnabled(isHabilitar && this.claseproductoConstantesFunciones.activarid_empresaClaseProducto);
		this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_tipo_productoClaseProducto.setEnabled(isHabilitar && this.claseproductoConstantesFunciones.activarid_tipo_productoClaseProducto);
	};
	
	public void setDefaultControlesClaseProducto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoClaseProducto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.claseproductoSessionBean.setConGuardarRelaciones(true);			
			this.claseproductoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormClaseProducto.jTabbedPaneRelacionesClaseProducto.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.claseproductoSessionBean.setConGuardarRelaciones(false);			
			this.claseproductoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormClaseProducto.jTabbedPaneRelacionesClaseProducto.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoClaseProducto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClaseProducto claseproductoAux:this.claseproductoLogic.getClaseProductos()) {
				if(claseproductoAux.getId().equals(this.iIdNuevoClaseProducto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClaseProducto claseproductoAux:this.claseproductos) {
				if(claseproductoAux.getId().equals(this.iIdNuevoClaseProducto)) {
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
	
	public int getIndiceActualClaseProducto(ClaseProducto claseproducto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClaseProducto claseproductoAux:this.claseproductoLogic.getClaseProductos()) {
				if(claseproductoAux.getId().equals(claseproducto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClaseProducto claseproductoAux:this.claseproductos) {
				if(claseproductoAux.getId().equals(claseproducto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalClaseProducto(ClaseProducto claseproductoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClaseProducto claseproductoAux:this.claseproductoLogic.getClaseProductos()) {
				if(claseproductoAux.getClaseProductoOriginal().getId().equals(claseproductoOriginal.getId())) {
					existe=true;
					claseproductoOriginal.setId(claseproductoAux.getId());
					claseproductoOriginal.setVersionRow(claseproductoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClaseProducto claseproductoAux:this.claseproductos) {
				if(claseproductoAux.getClaseProductoOriginal().getId().equals(claseproductoOriginal.getId())) {
					existe=true;
					claseproductoOriginal.setId(claseproductoAux.getId());
					claseproductoOriginal.setVersionRow(claseproductoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosClaseProducto(Boolean esParaCancelar) throws Exception {
		claseproductosAux=new ArrayList<ClaseProducto>();
		claseproductoAux=new ClaseProducto();
		
		if(!this.claseproductoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ClaseProducto claseproductoAux:this.claseproductoLogic.getClaseProductos()) {
					if(claseproductoAux.getId()<0) {
						claseproductosAux.add(claseproductoAux);
					}		
				}
				this.iIdNuevoClaseProducto=0L;
				this.claseproductoLogic.getClaseProductos().removeAll(claseproductosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ClaseProducto claseproductoAux:this.claseproductos) {
					if(claseproductoAux.getId()<0) {
						claseproductosAux.add(claseproductoAux);
					}		
				}
				this.iIdNuevoClaseProducto=0L;
				this.claseproductos.removeAll(claseproductosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoClaseProducto 
					&& this.claseproductoLogic.getClaseProductos().size()>0
					) {
					claseproductoAux=this.claseproductoLogic.getClaseProductos().get(this.claseproductoLogic.getClaseProductos().size() - 1);
				
					if(claseproductoAux.getId()<0) {
						this.claseproductoLogic.getClaseProductos().remove(claseproductoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoClaseProducto && this.claseproductos.size()>0) {
					claseproductoAux=this.claseproductos.get(this.claseproductos.size() - 1);
				
					if(claseproductoAux.getId()<0) {
						this.claseproductos.remove(claseproductoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoClaseProducto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(claseproducto.getId()<0) {
				this.claseproductoLogic.getClaseProductos().remove(this.claseproducto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(claseproducto.getId()<0) {
				this.claseproductos.remove(this.claseproducto);
			}
		}			
	}
	
	public void setEstadosInicialesClaseProducto(List<ClaseProducto> claseproductosAux) throws Exception {
		ClaseProductoConstantesFunciones.setEstadosInicialesClaseProducto(claseproductosAux);
	}
	
	public void setEstadosInicialesClaseProducto(ClaseProducto claseproductoAux) throws Exception {
		ClaseProductoConstantesFunciones.setEstadosInicialesClaseProducto(claseproductoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarClaseProductoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesClaseProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarClaseProductoActual()) {
				if(!this.isEsNuevoClaseProducto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesClaseProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoClaseProducto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarClaseProductoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Clase Producto ?", "MANTENIMIENTO DE Clase Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesClaseProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ClaseProducto claseproducto) throws Exception {
		ClaseProductoConstantesFunciones.seleccionarAsignar(this.claseproducto,claseproducto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarClaseProducto=this.isPermisoActualizarOriginalClaseProducto;
			
			
			this.seleccionarAsignar(claseproducto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ClaseProductoConstantesFunciones.quitarEspaciosClaseProducto(this.claseproducto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesClaseProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.claseproductoSessionBean.setsFuncionBusquedaRapida(this.claseproductoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoClaseProducto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosClaseProducto(esParaCancelar);				
				this.cancelarNuevoClaseProducto(esParaCancelar);								
			}
			
			this.claseproducto=new ClaseProducto();
			
			this.inicializarClaseProducto();
			
			this.actualizarEstadoCeldasBotonesClaseProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarClaseProducto() throws Exception {
		try {
			ClaseProductoConstantesFunciones.inicializarClaseProducto(this.claseproducto);
			
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
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.claseproductoLogic.getClaseProductos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteClaseProductos(String sAccionBusqueda,List<ClaseProducto> claseproductosParaReportes) throws Exception {
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
					sPathReporteFinal="ClaseProducto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ClaseProductoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ClaseProductoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ClaseProducto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Clase Productos");		
		parameters.put("busquedapor", ClaseProductoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Producto.class));
			classes.add(new Classe(ParametroInventarioDefecto.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					ClaseProductoLogic claseproductoLogicAuxiliar=new ClaseProductoLogic();
					claseproductoLogicAuxiliar.setDatosCliente(claseproductoLogic.getDatosCliente());				
					claseproductoLogicAuxiliar.setClaseProductos(claseproductosParaReportes);
					
					claseproductoLogicAuxiliar.cargarRelacionesLoteForeignKeyClaseProductoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					claseproductosParaReportes=claseproductoLogicAuxiliar.getClaseProductos();
					
					//claseproductoLogic.getNewConnexionToDeep();
					
					//for (ClaseProducto claseproducto:claseproductosParaReportes) {
					//	claseproductoLogic.deepLoad(claseproducto, false, DeepLoadType.INCLUDE, classes);
					//}						
					//claseproductoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//claseproductoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileProducto = AuxiliarReportes.class.getResourceAsStream("ProductoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_producto", reportFileProducto);

			InputStream reportFileParametroInventarioDefecto = AuxiliarReportes.class.getResourceAsStream("ParametroInventarioDefectoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametroinventariodefecto", reportFileParametroInventarioDefecto);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceClaseProducto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ClaseProductoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ClaseProductoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceClaseProducto=new JRBeanArrayDataSource(ClaseProductoJInternalFrame.TraerClaseProductoBeans(claseproductosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceClaseProducto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ClaseProductoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ClaseProductoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ClaseProductoBean.TraerClaseProductoBeans(claseproductosParaReportes).toArray()));
							
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
				this.generarExcelReporteClaseProductos(sAccionBusqueda,sTipoArchivoReporte,claseproductosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalClaseProductos(sAccionBusqueda,sTipoArchivoReporte,claseproductosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoClaseProductoActionPerformed(null);
					//this.generarExcelReporteClaseProductos(sAccionBusqueda,sTipoArchivoReporte,claseproductosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalClaseProductos(sAccionBusqueda,sTipoArchivoReporte,claseproductosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesClaseProductos(sAccionBusqueda,sTipoArchivoReporte,claseproductosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesClaseProductos(sAccionBusqueda,sTipoArchivoReporte,claseproductosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteClaseProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<ClaseProducto> claseproductosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"claseproducto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ClaseProductos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderClaseProducto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ClaseProducto claseproducto : claseproductosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ClaseProductoConstantesFunciones.generarExcelReporteDataClaseProducto("NORMAL",row,workbook,claseproducto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.claseproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Clase Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderClaseProducto(String sTipo,Row row,Workbook workbook) {
		
		ClaseProductoConstantesFunciones.generarExcelReporteHeaderClaseProducto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalClaseProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<ClaseProducto> claseproductosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"claseproducto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ClaseProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ClaseProducto claseproducto : claseproductosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ClaseProductoConstantesFunciones.getClaseProductoDescripcion(claseproducto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClaseProductoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClaseProductoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(claseproducto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClaseProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClaseProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(claseproducto.gettipoproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClaseProductoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClaseProductoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(claseproducto.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClaseProductoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClaseProductoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(claseproducto.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.claseproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Clase Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesClaseProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<ClaseProducto> claseproductosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ClaseProducto> claseproductosRespaldo=null;
		
		classes=ClaseProductoConstantesFunciones.getClassesRelationshipsOfClaseProducto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.claseproductoLogic.setDatosCliente(this.datosCliente);
		this.claseproductoLogic.setDatosDeep(this.datosDeep);
		this.claseproductoLogic.setIsConDeep(true);
		
		claseproductosRespaldo=this.claseproductoLogic.getClaseProductos();
		
		this.claseproductoLogic.setClaseProductos(claseproductosParaReportes);	
		this.claseproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		claseproductosParaReportes=this.claseproductoLogic.getClaseProductos();
		this.claseproductoLogic.setClaseProductos(claseproductosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"claseproducto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ClaseProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderClaseProducto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ClaseProducto claseproducto : claseproductosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderClaseProducto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ClaseProductoConstantesFunciones.generarExcelReporteDataClaseProducto("NORMAL",row,workbook,claseproducto,cellStyleDataAux);
		
			
			


				//Producto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoConstantesFunciones.SCLASSWEBTITULO))) {

				if(claseproducto.getProductos()!=null && claseproducto.getProductos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoConstantesFunciones.generarExcelReporteHeaderProducto("RELACIONADO",row,workbook);
				}

				if(claseproducto.getProductos()!=null) {
					i2=0;
					for(Producto producto : claseproducto.getProductos()) {
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


				//ParametroInventarioDefecto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO))) {

				if(claseproducto.getParametroInventarioDefectos()!=null && claseproducto.getParametroInventarioDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroInventarioDefectoConstantesFunciones.generarExcelReporteHeaderParametroInventarioDefecto("RELACIONADO",row,workbook);
				}

				if(claseproducto.getParametroInventarioDefectos()!=null) {
					i2=0;
					for(ParametroInventarioDefecto parametroinventariodefecto : claseproducto.getParametroInventarioDefectos()) {
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
		cell.setCellValue(ClaseProductoConstantesFunciones.getClaseProductoDescripcion(claseproducto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.claseproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Clase Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoClaseProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoClaseProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoClaseProducto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoClaseProducto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessClaseProducto() throws Exception {		
		this.startProcessClaseProducto(true);
	}
	
	public void startProcessClaseProducto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasClaseProducto ,this.jPanelParametrosReportesClaseProducto, this.jScrollPanelDatosClaseProducto,this.jPanelPaginacionClaseProducto, this.jScrollPanelDatosEdicionClaseProducto, this.jPanelAccionesClaseProducto,this.jPanelAccionesFormularioClaseProducto,this.jmenuBarClaseProducto,this.jmenuBarDetalleClaseProducto,this.jTtoolBarClaseProducto,this.jTtoolBarDetalleClaseProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasClaseProducto=this.jTabbedPaneBusquedasClaseProducto; 
		
		final JPanel jPanelParametrosReportesClaseProducto=this.jPanelParametrosReportesClaseProducto;
		//final JScrollPane jScrollPanelDatosClaseProducto=this.jScrollPanelDatosClaseProducto;
		final JTable jTableDatosClaseProducto=this.jTableDatosClaseProducto;		
		final JPanel jPanelPaginacionClaseProducto=this.jPanelPaginacionClaseProducto;
		//final JScrollPane jScrollPanelDatosEdicionClaseProducto=this.jScrollPanelDatosEdicionClaseProducto;
		final JPanel jPanelAccionesClaseProducto=this.jPanelAccionesClaseProducto;
		
		JPanel jPanelCamposAuxiliarClaseProducto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarClaseProducto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormClaseProducto!=null) {
			jPanelCamposAuxiliarClaseProducto=this.jInternalFrameDetalleFormClaseProducto.jPanelCamposClaseProducto;
			jPanelAccionesFormularioAuxiliarClaseProducto=this.jInternalFrameDetalleFormClaseProducto.jPanelAccionesFormularioClaseProducto;
		}
		
		final JPanel jPanelCamposClaseProducto=jPanelCamposAuxiliarClaseProducto;
		final JPanel jPanelAccionesFormularioClaseProducto=jPanelAccionesFormularioAuxiliarClaseProducto;
		
		
		final JMenuBar jmenuBarClaseProducto=this.jmenuBarClaseProducto;
		final JToolBar jTtoolBarClaseProducto=this.jTtoolBarClaseProducto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarClaseProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarClaseProducto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormClaseProducto!=null) {
			jmenuBarDetalleAuxiliarClaseProducto=this.jInternalFrameDetalleFormClaseProducto.jmenuBarDetalleClaseProducto;
			jTtoolBarDetalleAuxiliarClaseProducto=this.jInternalFrameDetalleFormClaseProducto.jTtoolBarDetalleClaseProducto;
		}
		
		final JMenuBar jmenuBarDetalleClaseProducto=jmenuBarDetalleAuxiliarClaseProducto;
		final JToolBar jTtoolBarDetalleClaseProducto=jTtoolBarDetalleAuxiliarClaseProducto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasClaseProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesClaseProducto;
			processRunnable.jTableDatos=jTableDatosClaseProducto;
			processRunnable.jPanelCampos=jPanelCamposClaseProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionClaseProducto;
			processRunnable.jPanelAcciones=jPanelAccionesClaseProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioClaseProducto;
			
			
			processRunnable.jmenuBar=jmenuBarClaseProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleClaseProducto;
			processRunnable.jTtoolBar=jTtoolBarClaseProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleClaseProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasClaseProducto ,jPanelParametrosReportesClaseProducto,jTableDatosClaseProducto, /*jScrollPanelDatosClaseProducto,*/jPanelCamposClaseProducto,jPanelPaginacionClaseProducto, /*jScrollPanelDatosEdicionClaseProducto,*/ jPanelAccionesClaseProducto,jPanelAccionesFormularioClaseProducto,jmenuBarClaseProducto,jmenuBarDetalleClaseProducto,jTtoolBarClaseProducto,jTtoolBarDetalleClaseProducto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasClaseProducto ,jPanelParametrosReportesClaseProducto, jScrollPanelDatosClaseProducto,jPanelPaginacionClaseProducto, jScrollPanelDatosEdicionClaseProducto, jPanelAccionesClaseProducto,jPanelAccionesFormularioClaseProducto,jmenuBarClaseProducto,jmenuBarDetalleClaseProducto,jTtoolBarClaseProducto,jTtoolBarDetalleClaseProducto);
						
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
	
	public void finishProcessClaseProducto() {// throws Exception 
		this.finishProcessClaseProducto(true);
	}
	
	public void finishProcessClaseProducto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasClaseProducto ,this.jPanelParametrosReportesClaseProducto, this.jScrollPanelDatosClaseProducto,this.jPanelPaginacionClaseProducto, this.jScrollPanelDatosEdicionClaseProducto, this.jPanelAccionesClaseProducto,this.jPanelAccionesFormularioClaseProducto,this.jmenuBarClaseProducto,this.jmenuBarDetalleClaseProducto,this.jTtoolBarClaseProducto,this.jTtoolBarDetalleClaseProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasClaseProducto=this.jTabbedPaneBusquedasClaseProducto; 
		
		final JPanel jPanelParametrosReportesClaseProducto=this.jPanelParametrosReportesClaseProducto;
		//final JScrollPane jScrollPanelDatosClaseProducto=this.jScrollPanelDatosClaseProducto;
		final JTable jTableDatosClaseProducto=this.jTableDatosClaseProducto;		
		final JPanel jPanelPaginacionClaseProducto=this.jPanelPaginacionClaseProducto;
		//final JScrollPane jScrollPanelDatosEdicionClaseProducto=this.jScrollPanelDatosEdicionClaseProducto;
		final JPanel jPanelAccionesClaseProducto=this.jPanelAccionesClaseProducto;
		
		JPanel jPanelCamposAuxiliarClaseProducto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarClaseProducto=new JPanel();
		
		if(this.jInternalFrameDetalleFormClaseProducto!=null) {
			jPanelCamposAuxiliarClaseProducto=this.jInternalFrameDetalleFormClaseProducto.jPanelCamposClaseProducto;
			jPanelAccionesFormularioAuxiliarClaseProducto=this.jInternalFrameDetalleFormClaseProducto.jPanelAccionesFormularioClaseProducto;
		}
		
		final JPanel jPanelCamposClaseProducto=jPanelCamposAuxiliarClaseProducto;
		final JPanel jPanelAccionesFormularioClaseProducto=jPanelAccionesFormularioAuxiliarClaseProducto;
		
		
		final JMenuBar jmenuBarClaseProducto=this.jmenuBarClaseProducto;		
		final JToolBar jTtoolBarClaseProducto=this.jTtoolBarClaseProducto;
				
		JMenuBar jmenuBarDetalleAuxiliarClaseProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarClaseProducto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormClaseProducto!=null) {
			jmenuBarDetalleAuxiliarClaseProducto=this.jInternalFrameDetalleFormClaseProducto.jmenuBarDetalleClaseProducto;
			jTtoolBarDetalleAuxiliarClaseProducto=this.jInternalFrameDetalleFormClaseProducto.jTtoolBarDetalleClaseProducto;		
		}
		
		final JMenuBar jmenuBarDetalleClaseProducto=jmenuBarDetalleAuxiliarClaseProducto;
		final JToolBar jTtoolBarDetalleClaseProducto=jTtoolBarDetalleAuxiliarClaseProducto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasClaseProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesClaseProducto;
			processRunnable.jTableDatos=jTableDatosClaseProducto;
			processRunnable.jPanelCampos=jPanelCamposClaseProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionClaseProducto;
			processRunnable.jPanelAcciones=jPanelAccionesClaseProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioClaseProducto;
			
			
			processRunnable.jmenuBar=jmenuBarClaseProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleClaseProducto;
			processRunnable.jTtoolBar=jTtoolBarClaseProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleClaseProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasClaseProducto ,jPanelParametrosReportesClaseProducto, jTableDatosClaseProducto,/*jScrollPanelDatosClaseProducto,*/jPanelCamposClaseProducto,jPanelPaginacionClaseProducto, /*jScrollPanelDatosEdicionClaseProducto,*/ jPanelAccionesClaseProducto,jPanelAccionesFormularioClaseProducto,jmenuBarClaseProducto,jmenuBarDetalleClaseProducto,jTtoolBarClaseProducto,jTtoolBarDetalleClaseProducto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesClaseProducto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarClaseProducto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuClaseProducto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarClaseProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarClaseProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleClaseProducto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuClaseProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarClaseProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleClaseProducto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.claseproductoConstantesFunciones.getsFinalQueryClaseProducto();
		String  finalQueryPaginacionTodos=this.claseproductoConstantesFunciones.getsFinalQueryClaseProducto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ClaseProductoConstantesFunciones.getArrayColumnasGlobalesNoClaseProducto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ClaseProductoConstantesFunciones.getArrayColumnasGlobalesClaseProducto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ClaseProductoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.claseproductosEliminados= new ArrayList<ClaseProducto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessClaseProducto();
		
				///*ClaseProductoSessionBean*/this.claseproductoSessionBean=new ClaseProductoSessionBean();
			
			if(this.claseproductoSessionBean==null) {
				this.claseproductoSessionBean=new ClaseProductoSessionBean();
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
					this.iNumeroPaginacion=ClaseProductoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ClaseProductoConstantesFunciones.getClassesForeignKeysOfClaseProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/claseproducto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			claseproductosAux= new ArrayList<ClaseProducto>();
			
				
			claseproductoLogic.setDatosCliente(this.datosCliente);
			claseproductoLogic.setDatosDeep(this.datosDeep);
			claseproductoLogic.setIsConDeep(true);
			
			
			claseproductoLogic.getClaseProductoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					claseproductoLogic.getTodosClaseProductos(finalQueryGlobal,pagination);
					
					//claseproductoLogic.getTodosClaseProductosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(claseproductoLogic.getClaseProductos()==null|| claseproductoLogic.getClaseProductos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							claseproductosAux= new ArrayList<ClaseProducto>();
							claseproductosAux.addAll(claseproductoLogic.getClaseProductos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							claseproductosAux= new ArrayList<ClaseProducto>();
							claseproductosAux.addAll(claseproductos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							claseproductoLogic.getTodosClaseProductos(finalQueryGlobal+"",this.pagination);												
							
							//claseproductoLogic.getTodosClaseProductosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteClaseProductos("Todos",claseproductoLogic.getClaseProductos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							claseproductoLogic.setClaseProductos(new ArrayList<ClaseProducto>());					
							claseproductoLogic.getClaseProductos().addAll(claseproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							claseproductos=new ArrayList<ClaseProducto>();
							claseproductos.addAll(claseproductosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idClaseProducto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idClaseProducto=this.idActual;
				
				} else if(this.idClaseProductoActual!=null && this.idClaseProductoActual!=0L) {
					idClaseProducto=idClaseProductoActual;
				}
				
					
				this.sDetalleReporte=ClaseProductoConstantesFunciones.getDetalleIndicePorId(idClaseProducto);
				
				this.claseproductos=new ArrayList<ClaseProducto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					claseproductoLogic.getEntity(idClaseProducto);
					
					//claseproductoLogic.getEntityWithConnection(idClaseProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					claseproductoLogic.setClaseProductos(new ArrayList<ClaseProducto>());
					claseproductoLogic.getClaseProductos().add(claseproductoLogic.getClaseProducto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.claseproductos=new ArrayList<ClaseProducto>();
					this.claseproductos.add(claseproducto);
				}
				
				if(claseproductoLogic.getClaseProducto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=ClaseProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					claseproductoLogic.getClaseProductosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClaseProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClaseProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=claseproductoLogic.getClaseProductos()==null||claseproductoLogic.getClaseProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=claseproductos==null|| claseproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						claseproductosAux=new ArrayList<ClaseProducto>();
						claseproductosAux.addAll(claseproductoLogic.getClaseProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							claseproductosAux=new ArrayList<ClaseProducto>();
							claseproductosAux.addAll(claseproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							claseproductoLogic.getClaseProductosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClaseProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClaseProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteClaseProductos("BusquedaPorCodigo",claseproductoLogic.getClaseProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteClaseProductos("BusquedaPorCodigo",claseproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						claseproductoLogic.setClaseProductos(new ArrayList<ClaseProducto>());
						claseproductoLogic.getClaseProductos().addAll(claseproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							claseproductos=new ArrayList<ClaseProducto>();
							claseproductos.addAll(claseproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=ClaseProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					claseproductoLogic.getClaseProductosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClaseProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClaseProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=claseproductoLogic.getClaseProductos()==null||claseproductoLogic.getClaseProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=claseproductos==null|| claseproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						claseproductosAux=new ArrayList<ClaseProducto>();
						claseproductosAux.addAll(claseproductoLogic.getClaseProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							claseproductosAux=new ArrayList<ClaseProducto>();
							claseproductosAux.addAll(claseproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							claseproductoLogic.getClaseProductosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClaseProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClaseProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteClaseProductos("BusquedaPorNombre",claseproductoLogic.getClaseProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteClaseProductos("BusquedaPorNombre",claseproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						claseproductoLogic.setClaseProductos(new ArrayList<ClaseProducto>());
						claseproductoLogic.getClaseProductos().addAll(claseproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							claseproductos=new ArrayList<ClaseProducto>();
							claseproductos.addAll(claseproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ClaseProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					claseproductoLogic.getClaseProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClaseProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClaseProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=claseproductoLogic.getClaseProductos()==null||claseproductoLogic.getClaseProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=claseproductos==null|| claseproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						claseproductosAux=new ArrayList<ClaseProducto>();
						claseproductosAux.addAll(claseproductoLogic.getClaseProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							claseproductosAux=new ArrayList<ClaseProducto>();
							claseproductosAux.addAll(claseproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							claseproductoLogic.getClaseProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClaseProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClaseProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteClaseProductos("FK_IdEmpresa",claseproductoLogic.getClaseProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteClaseProductos("FK_IdEmpresa",claseproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						claseproductoLogic.setClaseProductos(new ArrayList<ClaseProducto>());
						claseproductoLogic.getClaseProductos().addAll(claseproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							claseproductos=new ArrayList<ClaseProducto>();
							claseproductos.addAll(claseproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoProducto")) {
				this.sDetalleReporte=ClaseProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					claseproductoLogic.getClaseProductosFK_IdTipoProducto(finalQueryGlobal,pagination,id_tipo_productoFK_IdTipoProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClaseProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClaseProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=claseproductoLogic.getClaseProductos()==null||claseproductoLogic.getClaseProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=claseproductos==null|| claseproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						claseproductosAux=new ArrayList<ClaseProducto>();
						claseproductosAux.addAll(claseproductoLogic.getClaseProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							claseproductosAux=new ArrayList<ClaseProducto>();
							claseproductosAux.addAll(claseproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							claseproductoLogic.getClaseProductosFK_IdTipoProducto(finalQueryGlobal,pagination,id_tipo_productoFK_IdTipoProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClaseProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClaseProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteClaseProductos("FK_IdTipoProducto",claseproductoLogic.getClaseProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteClaseProductos("FK_IdTipoProducto",claseproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						claseproductoLogic.setClaseProductos(new ArrayList<ClaseProducto>());
						claseproductoLogic.getClaseProductos().addAll(claseproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							claseproductos=new ArrayList<ClaseProducto>();
							claseproductos.addAll(claseproductosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesClaseProducto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessClaseProducto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=claseproductoLogic.getClaseProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=claseproductos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=claseproductoLogic.getClaseProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=claseproductos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ClaseProducto claseproducto) {
		Boolean permite=true;
		
		if(this.claseproducto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ClaseProductoConstantesFunciones.getOrderByListaClaseProducto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ClaseProductoConstantesFunciones.getOrderByListaClaseProducto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClaseProducto claseproducto:claseproductoLogic.getClaseProductos()) {
				if(claseproducto.getsType().equals(Constantes2.S_TOTALES)) {
					claseproductoTotales=claseproducto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClaseProducto claseproducto:this.claseproductos) {
				if(claseproducto.getsType().equals(Constantes2.S_TOTALES)) {
					claseproductoTotales=claseproducto;
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
			this.claseproductoAux=new ClaseProducto();
			this.claseproductoAux.setsType(Constantes2.S_TOTALES);
			this.claseproductoAux.setIsNew(false);
			this.claseproductoAux.setIsChanged(false);
			this.claseproductoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ClaseProductoConstantesFunciones.TotalizarValoresFilaClaseProducto(this.claseproductoLogic.getClaseProductos(),this.claseproductoAux);
				
				this.claseproductoLogic.getClaseProductos().add(this.claseproductoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ClaseProductoConstantesFunciones.TotalizarValoresFilaClaseProducto(this.claseproductos,this.claseproductoAux);
				
				this.claseproductos.add(this.claseproductoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		claseproductoTotales=new ClaseProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.claseproductoLogic.getClaseProductos().remove(claseproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.claseproductos.remove(claseproductoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		claseproductoTotales=new ClaseProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClaseProducto claseproducto:claseproductoLogic.getClaseProductos()) {
				if(claseproducto.getsType().equals(Constantes2.S_TOTALES)) {
					claseproductoTotales=claseproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ClaseProductoConstantesFunciones.TotalizarValoresFilaClaseProducto(this.claseproductoLogic.getClaseProductos(),claseproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClaseProducto claseproducto:this.claseproductos) {
				if(claseproducto.getsType().equals(Constantes2.S_TOTALES)) {
					claseproductoTotales=claseproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ClaseProductoConstantesFunciones.TotalizarValoresFilaClaseProducto(this.claseproductos,claseproductoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getClaseProductosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getClaseProductosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getClaseProductosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getClaseProductosFK_IdTipoProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getClaseProductosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					claseproductoLogic.getClaseProductosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getClaseProductosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					claseproductoLogic.getClaseProductosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getClaseProductosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					claseproductoLogic.getClaseProductosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getClaseProductosFK_IdTipoProducto(String sFinalQuery,Long id_tipo_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					claseproductoLogic.getClaseProductosFK_IdTipoProducto(sFinalQuery,this.pagination,id_tipo_producto);
				
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
	
	public void inicializarPermisosClaseProducto() {
		this.isPermisoTodoClaseProducto=false;
		this.isPermisoNuevoClaseProducto=false;
		this.isPermisoActualizarClaseProducto=false;
		this.isPermisoActualizarOriginalClaseProducto=false;
		this.isPermisoEliminarClaseProducto=false;
		this.isPermisoGuardarCambiosClaseProducto=false;
		this.isPermisoConsultaClaseProducto=false;
		this.isPermisoBusquedaClaseProducto=false;
		this.isPermisoReporteClaseProducto=false;		
		this.isPermisoOrdenClaseProducto=false;		
		this.isPermisoPaginacionMedioClaseProducto=false;		
		this.isPermisoPaginacionAltoClaseProducto=false;
		this.isPermisoPaginacionTodoClaseProducto=false;
		this.isPermisoCopiarClaseProducto=false;		
		this.isPermisoVerFormClaseProducto=false;		
		this.isPermisoDuplicarClaseProducto=false;		
		this.isPermisoOrdenClaseProducto=false;		
	}
	
	public void setPermisosUsuarioClaseProducto(Boolean isPermiso) {
		this.isPermisoTodoClaseProducto=isPermiso;
		this.isPermisoNuevoClaseProducto=isPermiso;
		this.isPermisoActualizarClaseProducto=isPermiso;
		this.isPermisoActualizarOriginalClaseProducto=isPermiso;
		this.isPermisoEliminarClaseProducto=isPermiso;
		this.isPermisoGuardarCambiosClaseProducto=isPermiso;
		this.isPermisoConsultaClaseProducto=isPermiso;
		this.isPermisoBusquedaClaseProducto=isPermiso;
		this.isPermisoReporteClaseProducto=isPermiso;
		this.isPermisoOrdenClaseProducto=isPermiso;		
		this.isPermisoPaginacionMedioClaseProducto=isPermiso;		
		this.isPermisoPaginacionAltoClaseProducto=isPermiso;		
		this.isPermisoPaginacionTodoClaseProducto=isPermiso;		
		this.isPermisoCopiarClaseProducto=isPermiso;		
		this.isPermisoVerFormClaseProducto=isPermiso;		
		this.isPermisoDuplicarClaseProducto=isPermiso;
		this.isPermisoOrdenClaseProducto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioClaseProducto(Boolean isPermiso) {
		//this.isPermisoTodoClaseProducto=isPermiso;
		this.isPermisoNuevoClaseProducto=isPermiso;
		this.isPermisoActualizarClaseProducto=isPermiso;
		this.isPermisoActualizarOriginalClaseProducto=isPermiso;
		this.isPermisoEliminarClaseProducto=isPermiso;
		this.isPermisoGuardarCambiosClaseProducto=isPermiso;
		//this.isPermisoConsultaClaseProducto=isPermiso;
		//this.isPermisoBusquedaClaseProducto=isPermiso;
		//this.isPermisoReporteClaseProducto=isPermiso;
		//this.isPermisoOrdenClaseProducto=isPermiso;		
		//this.isPermisoPaginacionMedioClaseProducto=isPermiso;		
		//this.isPermisoPaginacionAltoClaseProducto=isPermiso;		
		//this.isPermisoPaginacionTodoClaseProducto=isPermiso;		
		//this.isPermisoCopiarClaseProducto=isPermiso;		
		//this.isPermisoDuplicarClaseProducto=isPermiso;
		//this.isPermisoOrdenClaseProducto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioClaseProductoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ProductoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
		if(ClaseProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosProducto=this.verificarGetPermisosUsuarioOpcionClaseProductoClaseRelacionada(this.opcionsRelacionadas,ProductoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosParametroInventarioDefecto=false;
		this.isTienePermisosParametroInventarioDefecto=this.verificarGetPermisosUsuarioOpcionClaseProductoClaseRelacionada(this.opcionsRelacionadas,ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebClaseProducto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioClaseProductoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosProducto=conPermiso;
		this.isTienePermisosParametroInventarioDefecto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioClaseProductoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionClaseProductoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioClaseProductoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosProducto && this.jInternalFrameDetalleFormClaseProducto!=null && this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormClaseProducto.jTabbedPaneRelacionesClaseProducto.remove(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosParametroInventarioDefecto && this.jInternalFrameDetalleFormClaseProducto!=null && this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormClaseProducto.jTabbedPaneRelacionesClaseProducto.remove(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioClaseProducto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ClaseProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.claseproductoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ClaseProductoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoClaseProducto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarClaseProducto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalClaseProducto=this.isPermisoActualizarClaseProducto;
			this.isPermisoEliminarClaseProducto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosClaseProducto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaClaseProducto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaClaseProducto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoClaseProducto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteClaseProducto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenClaseProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioClaseProducto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoClaseProducto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoClaseProducto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarClaseProducto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormClaseProducto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarClaseProducto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenClaseProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.claseproductoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosClaseProducto.setToolTipText(this.jTableDatosClaseProducto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioClaseProducto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioClaseProducto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ClaseProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ClaseProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioClaseProducto() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosProducto && this.claseproductoConstantesFunciones.mostrarProductoClaseProducto && !ClaseProductoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Producto");
			reporte.setsDescripcion("Producto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosParametroInventarioDefecto && this.claseproductoConstantesFunciones.mostrarParametroInventarioDefectoClaseProducto && !ClaseProductoConstantesFunciones.ISGUARDARREL) {

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
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyClaseProductoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tipoproductosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyClaseProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ClaseProductoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyClaseProductoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoProductoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoProductoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoproductosForeignKey==null||this.tipoproductosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoProductoConstantesFunciones.getArrayColumnasGlobalesTipoProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProductoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoProductoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoProductosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyClaseProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ClaseProductoParameterReturnGeneral claseproductoReturnGeneral=new ClaseProductoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.claseproductoConstantesFunciones.cargarid_empresaClaseProducto)
					 || (this.esRecargarFks && this.claseproductoConstantesFunciones.cargarid_empresaClaseProducto)) {

					if(!this.claseproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+claseproductoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTipoProducto="";

				if(((this.tipoproductosForeignKey==null||this.tipoproductosForeignKey.size()<=0) && this.claseproductoConstantesFunciones.cargarid_tipo_productoClaseProducto)
					 || (this.esRecargarFks && this.claseproductoConstantesFunciones.cargarid_tipo_productoClaseProducto)) {

					if(!this.claseproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoProductoConstantesFunciones.getArrayColumnasGlobalesTipoProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoProducto, "");
						finalQueryGlobalTipoProducto+=TipoProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoProducto=" WHERE " + ConstantesSql.ID + "="+claseproductoSessionBean.getlidTipoProductoActual();
					}
				} else {
					finalQueryGlobalTipoProducto="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				claseproductoReturnGeneral=claseproductoLogic.cargarCombosLoteForeignKeyClaseProducto(finalQueryGlobalEmpresa,finalQueryGlobalTipoProducto);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=claseproductoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTipoProducto.equals("NONE")) {
				this.tipoproductosForeignKey=claseproductoReturnGeneral.gettipoproductosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyClaseProducto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoProducto();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.claseproductoSessionBean==null) {
				this.claseproductoSessionBean=new ClaseProductoSessionBean();
			}

			if(!this.claseproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyTipoProducto()throws Exception {
		try {

			if(!this.claseproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProducto()) {
				TipoProducto tipoproducto=new TipoProducto();
				TipoProductoConstantesFunciones.setTipoProductoDescripcion(tipoproducto,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoproducto.setId(null);

				if(!TipoProductoConstantesFunciones.ExisteEnLista(this.tipoproductosForeignKey,tipoproducto,true)) {

					this.tipoproductosForeignKey.add(0,tipoproducto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyClaseProducto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyClaseProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyClaseProducto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyClaseProducto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyClaseProducto(ClaseProducto claseproducto)throws Exception {	
		try {
			
			this.setActualTipoProductoForeignKey(claseproducto.getid_tipo_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyClaseProducto(ClaseProducto claseproducto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyClaseProducto()throws Exception {	
		try {
			
			this.setActualTipoProductoForeignKey(this.claseproductoConstantesFunciones.getid_tipo_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyClaseProducto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyClaseProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyClaseProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroClaseProducto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyClaseProducto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoProductosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyClaseProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyClaseProducto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_empresaClaseProducto!=null && this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_empresaClaseProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_empresaClaseProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_tipo_productoClaseProducto!=null && this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_tipo_productoClaseProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_tipo_productoClaseProducto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public ClaseProductoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ClaseProductoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ClaseProductoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.claseproductoSessionBean=new ClaseProductoSessionBean(); 
		this.claseproductoConstantesFunciones=new ClaseProductoConstantesFunciones(); 
		this.claseproductoBean=new ClaseProducto();//(this.claseproductoConstantesFunciones); 		
		this.claseproductoReturnGeneral=new ClaseProductoParameterReturnGeneral(); 
		
		this.claseproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.claseproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ClaseProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ClaseProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ClaseProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessClaseProducto(true);
			
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
			
			this.claseproductoConstantesFunciones=new ClaseProductoConstantesFunciones(); 
			this.claseproductoBean=new ClaseProducto();//this.claseproductoConstantesFunciones); 			
			this.claseproductoReturnGeneral=new ClaseProductoParameterReturnGeneral(); 
		
			ClaseProductoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Clase Producto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.claseproducto=new ClaseProducto();
			this.claseproductos = new ArrayList<ClaseProducto>();
			this.claseproductosAux = new ArrayList<ClaseProducto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic=new ClaseProductoLogic();
				this.claseproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.claseproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.claseproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormClaseProducto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoClaseProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoClaseProducto);	
					}
					
					if(this.jInternalFrameImportacionClaseProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionClaseProducto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByClaseProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByClaseProducto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormClaseProducto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormClaseProducto);
				this.jInternalFrameDetalleFormClaseProducto.setVisible(false);
				this.jInternalFrameDetalleFormClaseProducto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoClaseProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoClaseProducto);
					this.jInternalFrameReporteDinamicoClaseProducto.setVisible(false);
					this.jInternalFrameReporteDinamicoClaseProducto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionClaseProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionClaseProducto);
					this.jInternalFrameImportacionClaseProducto.setVisible(false);
					this.jInternalFrameImportacionClaseProducto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByClaseProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByClaseProducto);
					this.jInternalFrameOrderByClaseProducto.setVisible(false);
					this.jInternalFrameOrderByClaseProducto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idClaseProductoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ClaseProductoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.claseproductoReturnGeneral=new ClaseProductoParameterReturnGeneral();
			
			this.claseproductoParameterGeneral=new ClaseProductoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.claseproductoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.claseproductoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ClaseProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.claseproductoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ProductoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ClaseProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.claseproductoSessionBean.getEsGuardarRelacionado(),this.claseproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ClaseProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.claseproductoSessionBean.getEsGuardarRelacionado(),this.claseproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoClaseProducto=false;
			this.isVisibilidadCeldaDuplicarClaseProducto=true;
			this.isVisibilidadCeldaCopiarClaseProducto=true;
			this.isVisibilidadCeldaVerFormClaseProducto=true;
			this.isVisibilidadCeldaOrdenClaseProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesClaseProducto=false;
			this.isVisibilidadCeldaModificarClaseProducto=false;
			this.isVisibilidadCeldaActualizarClaseProducto=false;
			this.isVisibilidadCeldaEliminarClaseProducto=false;
			this.isVisibilidadCeldaCancelarClaseProducto=false;
			this.isVisibilidadCeldaGuardarClaseProducto=false;
			this.isVisibilidadCeldaGuardarCambiosClaseProducto=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoProducto=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesClaseProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosClaseProducto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioClaseProducto(false);
			
			this.setPermisosUsuarioClaseProducto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.claseproductoSessionBean.getEsGuardarRelacionado() 
				|| (this.claseproductoSessionBean.getEsGuardarRelacionado() && this.claseproductoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioClaseProductoClasesRelacionadas();
			}
			
			if(this.claseproductoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioClaseProductoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ClaseProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosClaseProducto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualClaseProducto();
			}
			
			if(!this.isPermisoBusquedaClaseProducto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasClaseProducto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.claseproductoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioClaseProducto,this.isPermisoPaginacionMedioClaseProducto,this.isPermisoPaginacionTodoClaseProducto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ClaseProductoConstantesFunciones.getTiposSeleccionarClaseProducto());
				
				this.tiposColumnasSelect=ClaseProductoConstantesFunciones.getTiposSeleccionarClaseProducto(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectClaseProducto();				
				//this.tiposRelacionesSelect=ClaseProductoConstantesFunciones.getTiposRelacionesClaseProducto(true);
				
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
			//if(!this.claseproductoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioClaseProducto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioClaseProducto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioClaseProducto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesClaseProducto() ;
			
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
			this.parametroinventariodefectoLogic=new ParametroInventarioDefectoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.tipoproductoLogic=new TipoProductoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				claseproductoImplementable= (ClaseProductoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ClaseProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				claseproductoImplementableHome= (ClaseProductoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ClaseProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.claseproductos= new ArrayList<ClaseProducto>();
			this.claseproductosEliminados= new ArrayList<ClaseProducto>();
						
			this.isEsNuevoClaseProducto=false;
			this.esParaAccionDesdeFormularioClaseProducto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tipoproductosForeignKey=new ArrayList<TipoProducto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyClaseProducto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroClaseProducto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.claseproductoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ClaseProductoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ClaseProductoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesClaseProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingClaseProducto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormClaseProducto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioClaseProducto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioClaseProducto();
			}
			
			ClaseProductoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasClaseProducto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasClaseProducto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasClaseProducto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessClaseProducto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ClaseProducto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectClaseProducto() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ProductoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProductoConstantesFunciones.SCLASSWEBTITULO);
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
			if(sTipo.equals("RelacionesClaseProducto")) {
				iIndex=this.jInternalFrameDetalleFormClaseProducto.jTabbedPaneRelacionesClaseProducto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormClaseProducto.jTabbedPaneRelacionesClaseProducto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosClaseProducto.getSelectedRow();	
				
				

				if(sTitle.equals("Parametro Inventario Defectos")) {
					if(!ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessClaseProducto();

						this.cargarParteTabPanelRelacionadaParametroInventarioDefecto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Productos")) {
					if(!ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessClaseProducto();

						this.cargarParteTabPanelRelacionadaProducto(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessClaseProducto();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaParametroInventarioDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormClaseProducto.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(false,true,iIndex);
		this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();

		//this.jTabbedPaneRelacionesClaseProducto.updateUI();
		//this.jTabbedPaneRelacionesClaseProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesClaseProducto.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProducto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormClaseProducto.cargarSessionConBeanSwingJInternalFrameProducto(false,true,iIndex);
		this.jButtonProductoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProducto();

		//this.jTabbedPaneRelacionesClaseProducto.updateUI();
		//this.jTabbedPaneRelacionesClaseProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesClaseProducto.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Producto")) {
				int row=this.jTableDatosClaseProducto.getSelectedRow();
				jButtonProductoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ParametroInventarioDefecto")) {
				int row=this.jTableDatosClaseProducto.getSelectedRow();
				jButtonParametroInventarioDefectoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.claseproductoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Producto")) {

					if(this.isTienePermisosProducto && this.claseproductoConstantesFunciones.mostrarProductoClaseProducto && !ClaseProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Productos"+"("+ProductoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Productos");

						if(claseproductoConstantesFunciones.resaltarProductoClaseProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(claseproductoConstantesFunciones.resaltarProductoClaseProducto);
						}

						jmenuItem.setEnabled(this.claseproductoConstantesFunciones.activarProductoClaseProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Producto"));

						

						this.jInternalFrameDetalleFormClaseProducto.jmenuDetalleClaseProducto.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Parametro Inventario Defecto")) {

					if(this.isTienePermisosParametroInventarioDefecto && this.claseproductoConstantesFunciones.mostrarParametroInventarioDefectoClaseProducto && !ClaseProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Inventario Defectos"+"("+ParametroInventarioDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Inventario Defectos");

						if(claseproductoConstantesFunciones.resaltarParametroInventarioDefectoClaseProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(claseproductoConstantesFunciones.resaltarParametroInventarioDefectoClaseProducto);
						}

						jmenuItem.setEnabled(this.claseproductoConstantesFunciones.activarParametroInventarioDefectoClaseProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroInventarioDefecto"));

						

						this.jInternalFrameDetalleFormClaseProducto.jmenuDetalleClaseProducto.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyClaseProducto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyClaseProducto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyClaseProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyClaseProductoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyClaseProducto();
		
		this.cargarCombosFrameForeignKeyClaseProducto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyClaseProducto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyClaseProducto();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoProducto();
				this.cargarCombosFrameTipoProductosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoProducto(this.tipoproductosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoClaseProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.claseproductoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormClaseProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
			
			
			if(jTableDatosClaseProducto.getRowCount()>=1) {
				jTableDatosClaseProducto.removeRowSelectionInterval(0, jTableDatosClaseProducto.getRowCount()-1);						
			}
			
			this.isEsNuevoClaseProducto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoClaseProducto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesClaseProducto(true);			
			//this.claseproducto=new ClaseProducto();
			//this.claseproducto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesClaseProducto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualClaseProducto() ;
			
			if(ClaseProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleClaseProducto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.claseproducto);	
			this.actualizarInformacion("INFO_PADRE",false,this.claseproducto);				
			
			ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
			
			if(this.claseproductoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ClaseProducto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarClaseProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ClaseProducto> claseproductosSeleccionados=new ArrayList<ClaseProducto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosClaseProducto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosClaseProducto.getSelectedRows().length;			
			}
			
			claseproductosSeleccionados=this.getClaseProductosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoClaseProducto--;			
				//ClaseProducto claseproductoAux= new ClaseProducto();			
				//claseproductoAux.setId(this.iIdNuevoClaseProducto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ClaseProducto claseproductoOrigen=new ClaseProducto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ClaseProducto claseproductoOrigen : claseproductosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosClaseProducto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							claseproductoOrigen =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							claseproductoOrigen =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaClaseProducto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.claseproducto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosClaseProducto(claseproductoOrigen,this.claseproducto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysClaseProducto(this.claseproducto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.claseproductoLogic.getClaseProductos().add(this.claseproductoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.claseproductos.add(this.claseproductoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaClaseProducto(false);
				
				this.jTableDatosClaseProducto.setRowSelectionInterval(this.getIndiceNuevoClaseProducto(), this.getIndiceNuevoClaseProducto());
				
				int iLastRow =  this.jTableDatosClaseProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosClaseProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosClaseProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaClaseProducto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarClaseProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ClaseProducto> claseproductosSeleccionados=new ArrayList<ClaseProducto>();									
		
			ClaseProducto claseproductoOrigen=new ClaseProducto();
			ClaseProducto claseproductoDestino=new ClaseProducto();
				
			claseproductosSeleccionados=this.getClaseProductosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosClaseProducto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || claseproductosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosClaseProducto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						claseproductoOrigen =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						claseproductoOrigen =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						claseproductoDestino =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						claseproductoDestino =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				claseproductoOrigen =claseproductosSeleccionados.get(0);
				claseproductoDestino =claseproductosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosClaseProducto(claseproductoOrigen,claseproductoDestino,true,false);
				
				claseproductoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(claseproductoDestino,claseproductoLogic.getClaseProductos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(claseproductoDestino,claseproductos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaClaseProducto(false);
				
				//this.jTableDatosClaseProducto.setRowSelectionInterval(this.getIndiceNuevoClaseProducto(), this.getIndiceNuevoClaseProducto());
				
				int iLastRow =  this.jTableDatosClaseProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosClaseProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosClaseProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaClaseProducto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormClaseProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormClaseProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormClaseProducto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarClaseProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesClaseProducto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasClaseProducto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesClaseProducto.setVisible(!isVisible);
			this.jPanelPaginacionClaseProducto.setVisible(!isVisible);
			this.jPanelAccionesClaseProducto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarClaseProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameClaseProducto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoClaseProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoClaseProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionClaseProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionClaseProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByClaseProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByClaseProducto();
			
			this.abrirFrameOrderByClaseProducto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByClaseProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByClaseProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleClaseProducto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormClaseProducto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormClaseProducto.isMaximum()) {
					this.jInternalFrameDetalleFormClaseProducto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormClaseProducto.setSize(this.jInternalFrameDetalleFormClaseProducto.iWidthFormulario,this.jInternalFrameDetalleFormClaseProducto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormClaseProducto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormClaseProducto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormClaseProducto.isMaximum()) {
						this.jInternalFrameDetalleFormClaseProducto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormClaseProducto.jContentPaneDetalleClaseProducto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormClaseProducto.jTabbedPaneRelacionesClaseProducto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormClaseProducto.jContentPaneDetalleClaseProducto.getWidth(),ClaseProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormClaseProducto.jTabbedPaneRelacionesClaseProducto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormClaseProducto.jContentPaneDetalleClaseProducto.getWidth(),ClaseProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormClaseProducto.jTabbedPaneRelacionesClaseProducto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormClaseProducto.jContentPaneDetalleClaseProducto.getWidth(),ClaseProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();
					}

					if(ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProducto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormClaseProducto.setVisible(true);
	        this.jInternalFrameDetalleFormClaseProducto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByClaseProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByClaseProducto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByClaseProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByClaseProducto,false,this);
				} else {
					this.jInternalFrameOrderByClaseProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByClaseProducto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByClaseProducto);
				this.jInternalFrameOrderByClaseProducto.setVisible(false);
				this.jInternalFrameOrderByClaseProducto.setSelected(false);
				
				this.jInternalFrameOrderByClaseProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByClaseProducto"));
				
				this.inicializarActualizarBindingTablaOrderByClaseProducto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionClaseProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionClaseProducto==null) {
				
				this.jInternalFrameImportacionClaseProducto=new ImportacionJInternalFrame(ClaseProductoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionClaseProducto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionClaseProducto);
				this.jInternalFrameImportacionClaseProducto.setVisible(false);
				this.jInternalFrameImportacionClaseProducto.setSelected(false);


				this.jInternalFrameImportacionClaseProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionClaseProducto"));
				this.jInternalFrameImportacionClaseProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionClaseProducto"));
				this.jInternalFrameImportacionClaseProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionClaseProducto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoClaseProducto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoClaseProducto==null) {
				this.jInternalFrameReporteDinamicoClaseProducto=new ReporteDinamicoJInternalFrame(ClaseProductoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoClaseProducto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoClaseProducto);
				this.jInternalFrameReporteDinamicoClaseProducto.setVisible(false);
				this.jInternalFrameReporteDinamicoClaseProducto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoClaseProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoClaseProducto"));
				this.jInternalFrameReporteDinamicoClaseProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoClaseProducto"));
				this.jInternalFrameReporteDinamicoClaseProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoClaseProducto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualClaseProducto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaParametroInventarioDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormClaseProducto.jContentPaneDetalleClaseProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProducto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormClaseProducto.jContentPaneDetalleClaseProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleClaseProducto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormClaseProducto);
			
	       	this.jInternalFrameDetalleFormClaseProducto.setVisible(false);
	        this.jInternalFrameDetalleFormClaseProducto.setSelected(false);
			
			//this.jInternalFrameDetalleFormClaseProducto.dispose();
			//this.jInternalFrameDetalleFormClaseProducto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoClaseProducto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoClaseProducto.setVisible(true);
	        this.jInternalFrameReporteDinamicoClaseProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionClaseProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionClaseProducto.setVisible(true);
	        this.jInternalFrameImportacionClaseProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByClaseProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByClaseProducto.setVisible(true);
	        this.jInternalFrameOrderByClaseProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByClaseProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByClaseProducto.setVisible(false);
	        this.jInternalFrameOrderByClaseProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoClaseProducto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoClaseProducto.setVisible(false);
	        this.jInternalFrameReporteDinamicoClaseProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionClaseProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionClaseProducto.setVisible(false);
	        this.jInternalFrameImportacionClaseProducto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarClaseProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarClaseProducto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarClaseProducto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosClaseProducto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesClaseProducto(true);
			//this.isEsNuevoClaseProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproducto =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.claseproducto =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesClaseProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesClaseProducto(false) ;
			
			if(claseproductoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado() && ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(ClaseProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleClaseProducto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualClaseProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaClaseProductoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosClaseProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproducto =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.claseproducto =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarClaseProducto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormClaseProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosClaseProducto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesClaseProducto(true);
			//this.isEsNuevoClaseProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproducto =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.claseproducto =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.claseproducto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesClaseProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesClaseProducto(false) ;
			
			if(ClaseProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleClaseProducto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualClaseProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoProducto(List<TipoProducto> tipoproductosForeignKey)throws Exception{
		TableColumn tableColumnTipoProducto=this.jTableDatosClaseProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClaseProducto,ClaseProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO));
		TableCellEditor tableCellEditorTipoProducto =tableColumnTipoProducto.getCellEditor();

		TipoProductoTableCell tipoproductoTableCellFk=(TipoProductoTableCell)tableCellEditorTipoProducto;

		if(tipoproductoTableCellFk!=null) {
			tipoproductoTableCellFk.settipoproductosForeignKey(tipoproductosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosClaseProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoproductoTableCellFk.setRowActual(intSelectedRow);
			//tipoproductoTableCellFk.settipoproductosForeignKeyActual(tipoproductosForeignKey);
		//}


		if(tipoproductoTableCellFk!=null) {
			tipoproductoTableCellFk.RecargarTipoProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarClaseProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesClaseProducto(false);
			
			//if(!this.isEsNuevoClaseProducto) {								
				int intSelectedRow = this.jTableDatosClaseProducto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproducto =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.claseproducto =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ClaseProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualClaseProducto(this.claseproducto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysClaseProducto(this.claseproducto);
				
			}
			
			if(this.permiteMantenimiento(this.claseproducto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.claseproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoClaseProducto=true;
					this.inicializarActualizarBindingTablaClaseProducto(false);
					this.isEsNuevoClaseProducto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoClaseProducto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoClaseProducto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesClaseProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualClaseProducto(false);
				
				this.habilitarDeshabilitarControlesClaseProducto(false);
			
												
				
				if(ClaseProductoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleClaseProducto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoClaseProductoActionPerformed(evt,claseproductoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualClaseProducto(this.claseproducto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosClaseProducto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,claseproductoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.claseproducto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ClaseProducto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClaseProducto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarClaseProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosClaseProducto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproducto =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				this.claseproducto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.claseproducto =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				this.claseproducto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.claseproducto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.claseproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ClaseProductoModel) this.jTableDatosClaseProducto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoClaseProducto=true;
				this.inicializarActualizarBindingTablaClaseProducto(false);
				this.isEsNuevoClaseProducto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesClaseProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualClaseProducto(false);
				
				this.habilitarDeshabilitarControlesClaseProducto(false);
				
				
				
				if(ClaseProductoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleClaseProducto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarClaseProductoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosClaseProducto.getRowCount()>=1) {
				jTableDatosClaseProducto.removeRowSelectionInterval(0, jTableDatosClaseProducto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesClaseProducto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaClaseProducto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesClaseProducto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualClaseProducto(false) ;
			
			this.isEsNuevoClaseProducto=false;
			
			if(ClaseProductoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleClaseProducto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosClaseProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingClaseProducto(false);
				
				//SI ES MANUAL
				if(ClaseProductoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualClaseProducto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosClaseProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoClaseProducto--;			
			//ClaseProducto claseproductoAux= new ClaseProducto();			
			//claseproductoAux.setId(this.iIdNuevoClaseProducto);
			
			if(this.jInternalFrameDetalleFormClaseProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaClaseProducto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysClaseProducto(this.claseproducto);
			
			this.claseproducto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.claseproductoLogic.getClaseProductos().add(this.claseproductoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.claseproductos.add(this.claseproductoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaClaseProducto(false);
			
			this.jTableDatosClaseProducto.setRowSelectionInterval(this.getIndiceNuevoClaseProducto(), this.getIndiceNuevoClaseProducto());
			
			int iLastRow =  this.jTableDatosClaseProducto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosClaseProducto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosClaseProducto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaClaseProducto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionClaseProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingClaseProducto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingClaseProducto(false);
			
			//SI ES MANUAL
			if(ClaseProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualClaseProducto();
			}
			
			//this.abrirFrameTreeClaseProducto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionClaseProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Clase ProductoS ?", "MANTENIMIENTO DE Clase Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionClaseProducto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralClaseProducto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.claseproductoReturnGeneral=claseproductoLogic.procesarImportacionClaseProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.claseproductoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarClaseProductoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionClaseProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionClaseProducto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionClaseProducto.setFileImportacion(this.jInternalFrameImportacionClaseProducto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionClaseProducto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionClaseProducto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionClaseProducto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionClaseProducto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoClaseProductoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ClaseProducto> claseproductosSeleccionados=new ArrayList<ClaseProducto>();		

		claseproductosSeleccionados=this.getClaseProductosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoClaseProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoClaseProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ClaseProductoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ClaseProductoBaseDesign.jrxml";
			
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
			
			this.generarReporteClaseProductos("Todos",claseproductosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.claseproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Clase Producto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoClaseProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoClaseProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ClaseProductoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ClaseProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ClaseProductoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ClaseProductoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoClaseProducto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoClaseProducto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoClaseProducto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ClaseProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ClaseProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					sNombreCampoCategoria="id_tipo_producto";
					break;

				case ClaseProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ClaseProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoClaseProducto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ClaseProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ClaseProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					sNombreCampoCategoriaValor="id_tipo_producto";
					break;

				case ClaseProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ClaseProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoClaseProducto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoClaseProducto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ClaseProductoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ClaseProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_producto");
					break;

				case ClaseProductoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ClaseProductoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoClaseProductoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ClaseProducto> claseproductosSeleccionados=new ArrayList<ClaseProducto>();		
		
		claseproductosSeleccionados=this.getClaseProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"claseproducto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ClaseProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoClaseProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoClaseProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ClaseProductoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClaseProductoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ClaseProducto claseproducto:claseproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(claseproducto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ClaseProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClaseProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
					iRow++;

					for(ClaseProducto claseproducto:claseproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(claseproducto.gettipoproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ClaseProductoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClaseProductoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ClaseProducto claseproducto:claseproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(claseproducto.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ClaseProductoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClaseProductoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ClaseProducto claseproducto:claseproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(claseproducto.getnombre());
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
			//	this.getFilaCabeceraExportarExcelClaseProducto(row);				
			//	iRow++;
			//}				
			
			//for(ClaseProducto claseproductoAux:claseproductosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelClaseProducto(claseproductoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.claseproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Clase Producto",JOptionPane.INFORMATION_MESSAGE);
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
				this.claseproductoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingClaseProducto(false);
			
			//SI ES MANUAL
			if(ClaseProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualClaseProducto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresClaseProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingClaseProducto(false);
			
			//SI ES MANUAL
			if(ClaseProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualClaseProducto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesClaseProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingClaseProducto(false);
			
			//SI ES MANUAL
			if(ClaseProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualClaseProducto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaClaseProducto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosClaseProducto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosClaseProducto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosClaseProducto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosClaseProducto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosClaseProducto.setMinimumSize(dimensionMinimum);
		this.jTableDatosClaseProducto.setMaximumSize(dimensionMaximum);
		this.jTableDatosClaseProducto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingClaseProducto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingClaseProducto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingClaseProducto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaClaseProducto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesClaseProducto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.claseproductoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasClaseProducto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesClaseProducto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesClaseProducto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ClaseProductoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ClaseProductoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualClaseProducto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaClaseProducto();
		
		this.inicializarActualizarBindingBotonesManualClaseProducto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.claseproductoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualClaseProducto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesClaseProducto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualClaseProducto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualClaseProducto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosClaseProducto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosClaseProducto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteClaseProducto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormClaseProducto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormClaseProducto.jCheckBoxPostAccionNuevoClaseProducto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormClaseProducto.jCheckBoxPostAccionSinCerrarClaseProducto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormClaseProducto.jCheckBoxPostAccionSinMensajeClaseProducto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosClaseProducto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosClaseProducto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteClaseProducto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormClaseProducto!=null) {
				this.jInternalFrameDetalleFormClaseProducto.jCheckBoxPostAccionNuevoClaseProducto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormClaseProducto.jCheckBoxPostAccionSinCerrarClaseProducto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormClaseProducto.jCheckBoxPostAccionSinMensajeClaseProducto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionClaseProducto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionClaseProducto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormClaseProducto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormClaseProducto.jComboBoxTiposAccionesFormularioClaseProducto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesClaseProducto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoClaseProducto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoClaseProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesClaseProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesClaseProducto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarClaseProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesClaseProducto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoClaseProducto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoClaseProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesClaseProducto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralClaseProducto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesClaseProducto(Boolean esInicializar) throws Exception {
		try	{	
			if(ClaseProductoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualClaseProducto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesClaseProducto() throws Exception {
		try	{
			if(ClaseProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualClaseProducto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleClaseProducto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormClaseProducto.jComboBoxTiposAccionesFormularioClaseProducto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormClaseProducto.jComboBoxTiposAccionesFormularioClaseProducto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualClaseProducto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesClaseProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesClaseProducto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesClaseProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesClaseProducto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesClaseProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesClaseProducto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionClaseProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionClaseProducto.addItem(reporte);
			}
			
			
			if(!this.claseproductoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionClaseProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionClaseProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesClaseProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesClaseProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesClaseProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesClaseProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormClaseProducto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormClaseProducto.jComboBoxTiposAccionesFormularioClaseProducto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormClaseProducto.jComboBoxTiposAccionesFormularioClaseProducto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarClaseProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarClaseProducto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarClaseProducto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualClaseProducto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualClaseProducto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoClaseProducto!=null) {
				this.jInternalFrameReporteDinamicoClaseProducto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoClaseProducto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoClaseProducto!=null) {
				this.jInternalFrameReporteDinamicoClaseProducto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoClaseProducto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoClaseProducto!=null) {
				
				if(this.jInternalFrameReporteDinamicoClaseProducto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoClaseProducto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoClaseProducto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoClaseProducto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoClaseProducto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoClaseProducto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualClaseProducto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoClaseProducto.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreClaseProducto.getText();
		if(this.jComboBoxid_tipo_productoFK_IdTipoProductoClaseProducto.getSelectedItem()!=null){this.id_tipo_productoFK_IdTipoProducto=((TipoProducto)this.jComboBoxid_tipo_productoFK_IdTipoProductoClaseProducto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasClaseProducto(Boolean esInicializar) throws Exception {				
		if(ClaseProductoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualClaseProducto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaClaseProducto() throws Exception {
		this.inicializarActualizarBindingTablaClaseProducto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByClaseProducto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByClaseProducto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByClaseProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByClaseProducto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ClaseProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByClaseProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByClaseProducto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ClaseProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosClaseProductoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClaseProductoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ClaseProductoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByClaseProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByClaseProducto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ClaseProductoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByClaseProducto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaClaseProducto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=claseproductoLogic.getClaseProductos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=claseproductos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ClaseProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosClaseProducto.setModel(new ClaseProductoModel(this.claseproductoLogic.getClaseProductos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosClaseProducto.setModel(new ClaseProductoModel(this.claseproductos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByClaseProducto!=null && this.jInternalFrameOrderByClaseProducto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByClaseProducto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosClaseProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClaseProducto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ClaseProductoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO,claseproductoConstantesFunciones.resaltarSeleccionarClaseProducto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ClaseProductoConstantesFunciones.SCLASSWEBTITULO,claseproductoConstantesFunciones.resaltarSeleccionarClaseProducto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosClaseProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClaseProducto,ClaseProductoConstantesFunciones.LABEL_ID));

		if(this.claseproductoConstantesFunciones.mostraridClaseProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClaseProductoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.claseproductoConstantesFunciones.resaltaridClaseProducto,this.claseproductoConstantesFunciones.activaridClaseProducto,this,true,"idClaseProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.claseproductoConstantesFunciones.resaltaridClaseProducto,this.claseproductoConstantesFunciones.activaridClaseProducto,this,true,"idClaseProducto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClaseProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClaseProducto,ClaseProductoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.claseproductoConstantesFunciones.mostrarid_empresaClaseProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClaseProductoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.claseproductoConstantesFunciones.resaltarid_empresaClaseProducto,this,this.claseproductoConstantesFunciones.activarid_empresaClaseProducto));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.claseproductoConstantesFunciones.resaltarid_empresaClaseProducto,this,this.claseproductoConstantesFunciones.activarid_empresaClaseProducto,false,"id_empresaClaseProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ClaseProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClaseProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClaseProducto,ClaseProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO));

		if(this.claseproductoConstantesFunciones.mostrarid_tipo_productoClaseProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClaseProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoProductoTableCell(this.tipoproductosForeignKey,this.claseproductoConstantesFunciones.resaltarid_tipo_productoClaseProducto,this,this.claseproductoConstantesFunciones.activarid_tipo_productoClaseProducto));
			tableColumn.setCellEditor(new TipoProductoTableCell(this.tipoproductosForeignKey,this.claseproductoConstantesFunciones.resaltarid_tipo_productoClaseProducto,this,this.claseproductoConstantesFunciones.activarid_tipo_productoClaseProducto,true,"id_tipo_productoClaseProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ClaseProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClaseProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClaseProducto,ClaseProductoConstantesFunciones.LABEL_CODIGO));

		if(this.claseproductoConstantesFunciones.mostrarcodigoClaseProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClaseProductoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.claseproductoConstantesFunciones.resaltarcodigoClaseProducto,this.claseproductoConstantesFunciones.activarcodigoClaseProducto,this,true,"codigoClaseProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.claseproductoConstantesFunciones.resaltarcodigoClaseProducto,this.claseproductoConstantesFunciones.activarcodigoClaseProducto,this,true,"codigoClaseProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ClaseProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClaseProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClaseProducto,ClaseProductoConstantesFunciones.LABEL_NOMBRE));

		if(this.claseproductoConstantesFunciones.mostrarnombreClaseProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClaseProductoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.claseproductoConstantesFunciones.resaltarnombreClaseProducto,this.claseproductoConstantesFunciones.activarnombreClaseProducto,this,true,"nombreClaseProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.claseproductoConstantesFunciones.resaltarnombreClaseProducto,this.claseproductoConstantesFunciones.activarnombreClaseProducto,this,true,"nombreClaseProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ClaseProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.claseproductoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosProducto && this.claseproductoConstantesFunciones.mostrarProductoClaseProducto && !ClaseProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Productos");
				tableColumn.setHeaderValue("Productos");
				tableColumn.setCellRenderer(new ProductoTableCell(claseproductoConstantesFunciones.resaltarProductoClaseProducto,this,this.claseproductoConstantesFunciones.activarProductoClaseProducto));
				tableColumn.setCellEditor(new ProductoTableCell(claseproductoConstantesFunciones.resaltarProductoClaseProducto,this,this.claseproductoConstantesFunciones.activarProductoClaseProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosClaseProducto.addColumn(tableColumn);
			}

			if(this.isTienePermisosParametroInventarioDefecto && this.claseproductoConstantesFunciones.mostrarParametroInventarioDefectoClaseProducto && !ClaseProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Inventario Defectos");
				tableColumn.setHeaderValue("Parametro Inventario Defectos");
				tableColumn.setCellRenderer(new ParametroInventarioDefectoTableCell(claseproductoConstantesFunciones.resaltarParametroInventarioDefectoClaseProducto,this,this.claseproductoConstantesFunciones.activarParametroInventarioDefectoClaseProducto));
				tableColumn.setCellEditor(new ParametroInventarioDefectoTableCell(claseproductoConstantesFunciones.resaltarParametroInventarioDefectoClaseProducto,this,this.claseproductoConstantesFunciones.activarParametroInventarioDefectoClaseProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosClaseProducto.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.claseproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.claseproductoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosClaseProducto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.claseproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.claseproductoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosClaseProducto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarClaseProducto && this.isPermisoGuardarCambiosClaseProducto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.claseproductoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.claseproductoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosClaseProducto.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.claseproductoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosClaseProducto.addColumn(tableColumn);
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
			
			this.jTableDatosClaseProducto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarClaseProducto && this.isPermisoGuardarCambiosClaseProducto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.claseproductoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarClaseProducto && this.isPermisoGuardarCambiosClaseProducto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosClaseProducto.moveColumn(this.jTableDatosClaseProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosClaseProducto.moveColumn(this.jTableDatosClaseProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.claseproductoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosClaseProducto.moveColumn(this.jTableDatosClaseProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosClaseProducto.moveColumn(this.jTableDatosClaseProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosClaseProducto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosClaseProducto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosClaseProducto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ClaseProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosClaseProducto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosClaseProducto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ClaseProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ClaseProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosClaseProducto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosClaseProducto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosClaseProducto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=claseproductoLogic.getClaseProductos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=claseproductos.size()-1;
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
		//this.jTableDatosClaseProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosClaseProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosClaseProducto();
			
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
				
				//this.isEsNuevoClaseProducto=false;
					
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
			
				if(this.claseproductoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormClaseProducto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosClaseProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosClaseProducto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproducto =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.claseproducto =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.claseproducto.getsType().equals("DUPLICADO")
				   || this.claseproducto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoClaseProducto=true;
				
				} else {
					this.isEsNuevoClaseProducto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.claseproductoSessionBean.getEsGuardarRelacionado()) {
					if(this.claseproducto.getId()>=0 && !this.claseproducto.getIsNew()) {						
						this.isEsNuevoClaseProducto=false;
						
					} else {
						this.isEsNuevoClaseProducto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoClaseProducto(esRelaciones);						
				
				this.seleccionarClaseProducto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.claseproducto.getId()<0) {
					this.isEsNuevoClaseProducto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarClaseProducto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarClaseProducto(evt,rowIndex);
				}	
				
				if(this.claseproductoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ClaseProducto: " + this.dDif); 
					}
				}								
				
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarClaseProducto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.claseproducto)) {
					if(this.claseproducto.getId()>0) {
						this.claseproducto.setIsDeleted(true);
						
						this.claseproductosEliminados.add(this.claseproducto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.claseproductoLogic.getClaseProductos().remove(this.claseproducto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.claseproductos.remove(this.claseproducto);				
					}
					
					
					((ClaseProductoModel) this.jTableDatosClaseProducto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaClaseProducto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarClaseProducto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoClaseProducto) {
			
			if(this.jInternalFrameDetalleFormClaseProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosClaseProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosClaseProducto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproducto =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.claseproducto =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ClaseProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioClaseProducto(this.claseproducto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.claseproductoConstantesFunciones.cargarid_empresaClaseProducto || this.claseproductoConstantesFunciones.event_dependid_empresaClaseProducto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.claseproducto.getid_empresa());
									//this.inicializarActualizarBindingClaseProducto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(claseproducto.getEmpresa()!=null) {
							this.empresasForeignKey.add(claseproducto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.claseproducto.getid_empresa(),false,"Formulario");

					//TipoProducto
					if(!this.claseproductoConstantesFunciones.cargarid_tipo_productoClaseProducto || this.claseproductoConstantesFunciones.event_dependid_tipo_productoClaseProducto) {
						//this.cargarCombosTipoProductosForeignKeyLista(" where id="+this.claseproducto.getid_tipo_producto());
									//this.inicializarActualizarBindingClaseProducto(false,false);
						this.tipoproductosForeignKey=new ArrayList<TipoProducto>();

						if(claseproducto.getTipoProducto()!=null) {
							this.tipoproductosForeignKey.add(claseproducto.getTipoProducto());
						}

						this.addItemDefectoCombosForeignKeyTipoProducto();
						this.cargarCombosFrameTipoProductosForeignKey("Todos");
					}
					this.setActualTipoProductoForeignKey(this.claseproducto.getid_tipo_producto(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesClaseProducto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesClaseProducto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualClaseProducto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoClaseProducto(ClaseProducto claseproducto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoClaseProducto(claseproducto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoClaseProducto(ClaseProducto claseproducto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioClaseProducto(claseproducto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyClaseProducto(claseproducto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyClaseProducto(claseproducto);
	}
	
	public void setVariablesObjetoActualToFormularioClaseProducto(ClaseProducto claseproducto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormClaseProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormClaseProducto.jLabelidClaseProducto.setText(claseproducto.getId().toString());
			this.jInternalFrameDetalleFormClaseProducto.jTextFieldcodigoClaseProducto.setText(claseproducto.getcodigo());
			this.jInternalFrameDetalleFormClaseProducto.jTextAreanombreClaseProducto.setText(claseproducto.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ClaseProducto claseproductoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,claseproductoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ClaseProducto claseproductoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				claseproductoLocal=this.claseproducto;
			} else {
				claseproductoLocal=this.claseproductoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(claseproductoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoClaseProducto(claseproductoLocal,true);
					
					if(claseproductoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(claseproductoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.claseproductoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(claseproductoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoClaseProducto(ClaseProducto claseproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualClaseProducto(claseproducto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysClaseProducto(claseproducto);
	}
	
	public void setVariablesFormularioToObjetoActualClaseProducto(ClaseProducto claseproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualClaseProducto(claseproducto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualClaseProducto(ClaseProducto claseproducto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormClaseProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormClaseProducto.jLabelidClaseProducto.getText()==null || this.jInternalFrameDetalleFormClaseProducto.jLabelidClaseProducto.getText()=="" || this.jInternalFrameDetalleFormClaseProducto.jLabelidClaseProducto.getText()=="Id") {
				this.jInternalFrameDetalleFormClaseProducto.jLabelidClaseProducto.setText("0");
			}

			if(conColumnasBase) {claseproducto.setId(Long.parseLong(this.jInternalFrameDetalleFormClaseProducto.jLabelidClaseProducto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ClaseProductoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClaseProducto.jLabelIdClaseProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			claseproducto.setcodigo(this.jInternalFrameDetalleFormClaseProducto.jTextFieldcodigoClaseProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ClaseProductoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClaseProducto.jLabelcodigoClaseProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			claseproducto.setnombre(this.jInternalFrameDetalleFormClaseProducto.jTextAreanombreClaseProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ClaseProductoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClaseProducto.jLabelnombreClaseProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualClaseProducto(ClaseProducto claseproductoBean,ClaseProducto claseproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && claseproductoBean.getid_tipo_producto()!=null && !claseproductoBean.getid_tipo_producto().equals(-1L))) {claseproducto.setid_tipo_producto(claseproductoBean.getid_tipo_producto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosClaseProducto(ClaseProducto claseproductoOrigen,ClaseProducto claseproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && claseproductoOrigen.getId()!=null && !claseproductoOrigen.getId().equals(0L))) {claseproducto.setId(claseproductoOrigen.getId());}}
			if(conDefault || (!conDefault && claseproductoOrigen.getid_tipo_producto()!=null && !claseproductoOrigen.getid_tipo_producto().equals(-1L))) {claseproducto.setid_tipo_producto(claseproductoOrigen.getid_tipo_producto());}
			if(conDefault || (!conDefault && claseproductoOrigen.getcodigo()!=null && !claseproductoOrigen.getcodigo().equals(""))) {claseproducto.setcodigo(claseproductoOrigen.getcodigo());}
			if(conDefault || (!conDefault && claseproductoOrigen.getnombre()!=null && !claseproductoOrigen.getnombre().equals(""))) {claseproducto.setnombre(claseproductoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioClaseProducto(ClaseProducto claseproducto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormClaseProducto.jLabelidClaseProducto.setText(claseproducto.getId().toString());
			this.jInternalFrameDetalleFormClaseProducto.jTextFieldcodigoClaseProducto.setText(claseproducto.getcodigo());
			this.jInternalFrameDetalleFormClaseProducto.jTextAreanombreClaseProducto.setText(claseproducto.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioClaseProducto(ClaseProductoBean claseproductoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormClaseProducto.jLabelidClaseProducto.setText(claseproductoBean.getId().toString());
			this.jInternalFrameDetalleFormClaseProducto.jTextFieldcodigoClaseProducto.setText(claseproductoBean.getcodigo());
			this.jInternalFrameDetalleFormClaseProducto.jTextAreanombreClaseProducto.setText(claseproductoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanClaseProducto(ClaseProductoParameterReturnGeneral claseproductoReturnGeneral,ClaseProductoBean claseproductoBean,Boolean conDefault) throws Exception { 
		try {
			ClaseProducto claseproductoLocal=new ClaseProducto();
			
			claseproductoLocal=claseproductoReturnGeneral.getClaseProducto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && claseproductoLocal.getId()!=null && !claseproductoLocal.getId().equals(0L))) {claseproductoBean.setId(claseproductoLocal.getId());}}
			if(conDefault || (!conDefault && claseproductoLocal.getid_tipo_producto()!=null && !claseproductoLocal.getid_tipo_producto().equals(-1L))) {claseproductoBean.setid_tipo_producto(claseproductoLocal.getid_tipo_producto());}
			if(conDefault || (!conDefault && claseproductoLocal.getcodigo()!=null && !claseproductoLocal.getcodigo().equals(""))) {claseproductoBean.setcodigo(claseproductoLocal.getcodigo());}
			if(conDefault || (!conDefault && claseproductoLocal.getnombre()!=null && !claseproductoLocal.getnombre().equals(""))) {claseproductoBean.setnombre(claseproductoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxClaseProductoGenerico(Long idClaseProductoSeleccionado,JComboBox jComboBoxClaseProducto,List<ClaseProducto> claseproductosLocal)throws Exception {
		try {
			ClaseProducto  claseproductoTemp=null;

			for(ClaseProducto claseproductoAux:claseproductosLocal) {
				if(claseproductoAux.getId()!=null && claseproductoAux.getId().equals(idClaseProductoSeleccionado)) {
					claseproductoTemp=claseproductoAux;
					break;
				}
			}

			jComboBoxClaseProducto.setSelectedItem(claseproductoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxClaseProductoGenerico(JComboBox jComboBoxClaseProducto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxClaseProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxClaseProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxClaseProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxClaseProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxClaseProducto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxClaseProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxClaseProducto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxClaseProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxClaseProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxClaseProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
		 else if(sTipo.equals("ParametroInventarioDefecto")) {
			jButtonParametroInventarioDefectoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			claseproducto=(ClaseProducto) claseproductoLogic.getClaseProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			claseproducto =(ClaseProducto) claseproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!claseproducto.getIsNew() && !claseproducto.getIsChanged() && !claseproducto.getIsDeleted()) {
				sDescripcion=claseproducto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=claseproducto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoProducto")) {
			//sDescripcion=this.getActualTipoProductoForeignKeyDescripcion((Long)value);
			if(!claseproducto.getIsNew() && !claseproducto.getIsChanged() && !claseproducto.getIsDeleted()) {
				sDescripcion=claseproducto.gettipoproducto_descripcion();
			} else {
				//sDescripcion=this.getActualTipoProductoForeignKeyDescripcion((Long)value);
				sDescripcion=claseproducto.gettipoproducto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ClaseProducto claseproductoRow=new ClaseProducto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			claseproductoRow=(ClaseProducto) claseproductoLogic.getClaseProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			claseproductoRow=(ClaseProducto) claseproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonProductoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,ClaseProducto claseproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormClaseProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.claseproducto = (ClaseProducto)this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.claseproducto = (ClaseProducto)this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(claseproducto!=null) {
						this.claseproducto = claseproducto;
					} else {
						this.claseproducto = new ClaseProducto();
					}
				}

				if(this.isTienePermisosProducto && this.permiteMantenimiento(this.claseproducto)) {
					ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFramePopup=new ProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFramePopup;
					} else {
						productoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame;
					}

					List<ClaseProducto> claseproductos=new ArrayList<ClaseProducto>();
					claseproductos.add(this.claseproducto);
					if(!esRelacionado) {
						//productoBeanSwingJInternalFrame.productoSessionBean.setConGuardarRelaciones(false);
						//productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormClaseProducto.cargarProductoBeanSwingJInternalFrame(claseproductos,this.claseproducto,productoBeanSwingJInternalFrame,/*conInicializar,*/productoBeanSwingJInternalFrame.productoSessionBean.getConGuardarRelaciones(),productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado());
					productoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoBeanSwingJInternalFrame.actualizarEstadoPanelsProducto("no_relacionado");

						productoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoConstantesFunciones.ITAMANIOFILATABLA + (ProductoConstantesFunciones.ITAMANIOFILATABLA/2));

						productoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderClaseProducto=(TitledBorder)this.jScrollPanelDatosClaseProducto.getBorder();
						TitledBorder titledBorderProducto=(TitledBorder)productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

						titledBorderProducto.setTitle(titledBorderClaseProducto.getTitle() + " -> Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoBeanSwingJInternalFrame);
						}

						productoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoBeanSwingJInternalFrame);

						productoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.claseproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonParametroInventarioDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,ClaseProducto claseproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormClaseProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.claseproducto = (ClaseProducto)this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.claseproducto = (ClaseProducto)this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(claseproducto!=null) {
						this.claseproducto = claseproducto;
					} else {
						this.claseproducto = new ClaseProducto();
					}
				}

				if(this.isTienePermisosParametroInventarioDefecto && this.permiteMantenimiento(this.claseproducto)) {
					ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFramePopup=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFramePopup;
					} else {
						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame;
					}

					List<ClaseProducto> claseproductos=new ArrayList<ClaseProducto>();
					claseproductos.add(this.claseproducto);
					if(!esRelacionado) {
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setConGuardarRelaciones(false);
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormClaseProducto.cargarParametroInventarioDefectoBeanSwingJInternalFrame(claseproductos,this.claseproducto,parametroinventariodefectoBeanSwingJInternalFrame,/*conInicializar,*/parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getConGuardarRelaciones(),parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("no_relacionado");

						parametroinventariodefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametroinventariodefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderClaseProducto=(TitledBorder)this.jScrollPanelDatosClaseProducto.getBorder();
						TitledBorder titledBorderParametroInventarioDefecto=(TitledBorder)parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getBorder();

						titledBorderParametroInventarioDefecto.setTitle(titledBorderClaseProducto.getTitle() + " -> Parametro Inventario Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametroinventariodefectoBeanSwingJInternalFrame);
						}

						parametroinventariodefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametroinventariodefectoBeanSwingJInternalFrame);

						parametroinventariodefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.claseproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Inventario Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualClaseProducto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoClaseProducto.setVisible((this.isVisibilidadCeldaNuevoClaseProducto && this.isPermisoNuevoClaseProducto));			
			this.jButtonDuplicarClaseProducto.setVisible((this.isVisibilidadCeldaDuplicarClaseProducto && this.isPermisoDuplicarClaseProducto));			
			this.jButtonCopiarClaseProducto.setVisible((this.isVisibilidadCeldaCopiarClaseProducto && this.isPermisoCopiarClaseProducto));
			this.jButtonVerFormClaseProducto.setVisible((this.isVisibilidadCeldaVerFormClaseProducto && this.isPermisoVerFormClaseProducto));
			
			this.jButtonAbrirOrderByClaseProducto.setVisible((this.isVisibilidadCeldaOrdenClaseProducto && this.isPermisoOrdenClaseProducto));			
			
			this.jButtonNuevoRelacionesClaseProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesClaseProducto && this.isPermisoNuevoClaseProducto));			
			this.jButtonNuevoGuardarCambiosClaseProducto.setVisible((this.isVisibilidadCeldaNuevoClaseProducto && this.isPermisoNuevoClaseProducto && this.isPermisoGuardarCambiosClaseProducto));
			
			if(this.jInternalFrameDetalleFormClaseProducto!=null) {
			this.jInternalFrameDetalleFormClaseProducto.jButtonModificarClaseProducto.setVisible((this.isVisibilidadCeldaModificarClaseProducto && this.isPermisoActualizarClaseProducto));	
			this.jInternalFrameDetalleFormClaseProducto.jButtonActualizarClaseProducto.setVisible((this.isVisibilidadCeldaActualizarClaseProducto && this.isPermisoActualizarClaseProducto));	
			this.jInternalFrameDetalleFormClaseProducto.jButtonEliminarClaseProducto.setVisible((this.isVisibilidadCeldaEliminarClaseProducto && this.isPermisoEliminarClaseProducto));
			this.jInternalFrameDetalleFormClaseProducto.jButtonCancelarClaseProducto.setVisible(this.isVisibilidadCeldaCancelarClaseProducto);							
			this.jInternalFrameDetalleFormClaseProducto.jButtonGuardarCambiosClaseProducto.setVisible((this.isVisibilidadCeldaGuardarClaseProducto && this.isPermisoGuardarCambiosClaseProducto));			
			
			}
						
			this.jButtonGuardarCambiosTablaClaseProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosClaseProducto && this.isPermisoGuardarCambiosClaseProducto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarClaseProducto.setVisible((this.isVisibilidadCeldaNuevoClaseProducto && this.isPermisoNuevoClaseProducto));						
			this.jButtonDuplicarToolBarClaseProducto.setVisible((this.isVisibilidadCeldaDuplicarClaseProducto && this.isPermisoDuplicarClaseProducto));						
			this.jButtonCopiarToolBarClaseProducto.setVisible((this.isVisibilidadCeldaCopiarClaseProducto && this.isPermisoCopiarClaseProducto));			
			this.jButtonVerFormToolBarClaseProducto.setVisible((this.isVisibilidadCeldaVerFormClaseProducto && this.isPermisoVerFormClaseProducto));			
			this.jButtonAbrirOrderByToolBarClaseProducto.setVisible((this.isVisibilidadCeldaOrdenClaseProducto && this.isPermisoOrdenClaseProducto));
			this.jButtonNuevoRelacionesToolBarClaseProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesClaseProducto && this.isPermisoNuevoClaseProducto));			
			this.jButtonNuevoGuardarCambiosToolBarClaseProducto.setVisible((this.isVisibilidadCeldaNuevoClaseProducto && this.isPermisoNuevoClaseProducto && this.isPermisoGuardarCambiosClaseProducto));			
			
			if(this.jInternalFrameDetalleFormClaseProducto!=null) {
			this.jInternalFrameDetalleFormClaseProducto.jButtonModificarToolBarClaseProducto.setVisible((this.isVisibilidadCeldaModificarClaseProducto && this.isPermisoActualizarClaseProducto));	
			this.jInternalFrameDetalleFormClaseProducto.jButtonActualizarToolBarClaseProducto.setVisible((this.isVisibilidadCeldaActualizarClaseProducto  && this.isPermisoActualizarClaseProducto));	
			this.jInternalFrameDetalleFormClaseProducto.jButtonEliminarToolBarClaseProducto.setVisible((this.isVisibilidadCeldaEliminarClaseProducto && this.isPermisoEliminarClaseProducto));
			this.jInternalFrameDetalleFormClaseProducto.jButtonCancelarToolBarClaseProducto.setVisible(this.isVisibilidadCeldaCancelarClaseProducto);				
			this.jInternalFrameDetalleFormClaseProducto.jButtonGuardarCambiosToolBarClaseProducto.setVisible((this.isVisibilidadCeldaGuardarClaseProducto && this.isPermisoGuardarCambiosClaseProducto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarClaseProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosClaseProducto && this.isPermisoGuardarCambiosClaseProducto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoClaseProducto.setVisible((this.isVisibilidadCeldaNuevoClaseProducto && this.isPermisoNuevoClaseProducto));			
			this.jMenuItemDuplicarClaseProducto.setVisible((this.isVisibilidadCeldaDuplicarClaseProducto && this.isPermisoDuplicarClaseProducto));			
			this.jMenuItemCopiarClaseProducto.setVisible((this.isVisibilidadCeldaCopiarClaseProducto && this.isPermisoCopiarClaseProducto));			
			this.jMenuItemVerFormClaseProducto.setVisible((this.isVisibilidadCeldaVerFormClaseProducto && this.isPermisoVerFormClaseProducto));			
			this.jMenuItemAbrirOrderByClaseProducto.setVisible((this.isVisibilidadCeldaOrdenClaseProducto && this.isPermisoOrdenClaseProducto));			
			//this.jMenuItemMostrarOcultarClaseProducto.setVisible((this.isVisibilidadCeldaOrdenClaseProducto && this.isPermisoOrdenClaseProducto));
			this.jMenuItemDetalleAbrirOrderByClaseProducto.setVisible((this.isVisibilidadCeldaOrdenClaseProducto && this.isPermisoOrdenClaseProducto));			
			//this.jMenuItemDetalleMostrarOcultarClaseProducto.setVisible((this.isVisibilidadCeldaOrdenClaseProducto && this.isPermisoOrdenClaseProducto));			
			this.jMenuItemNuevoRelacionesClaseProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesClaseProducto && this.isPermisoNuevoClaseProducto));			
			this.jMenuItemNuevoGuardarCambiosClaseProducto.setVisible((this.isVisibilidadCeldaNuevoClaseProducto && this.isPermisoNuevoClaseProducto && this.isPermisoGuardarCambiosClaseProducto));									
			
			if(this.jInternalFrameDetalleFormClaseProducto!=null) {
			this.jInternalFrameDetalleFormClaseProducto.jMenuItemModificarClaseProducto.setVisible((this.isVisibilidadCeldaModificarClaseProducto && this.isPermisoActualizarClaseProducto));	
			this.jInternalFrameDetalleFormClaseProducto.jMenuItemActualizarClaseProducto.setVisible((this.isVisibilidadCeldaActualizarClaseProducto && this.isPermisoActualizarClaseProducto));	
			this.jInternalFrameDetalleFormClaseProducto.jMenuItemEliminarClaseProducto.setVisible((this.isVisibilidadCeldaEliminarClaseProducto && this.isPermisoEliminarClaseProducto));
			this.jInternalFrameDetalleFormClaseProducto.jMenuItemCancelarClaseProducto.setVisible(this.isVisibilidadCeldaCancelarClaseProducto);				
			}
			
			this.jMenuItemGuardarCambiosClaseProducto.setVisible((this.isVisibilidadCeldaGuardarClaseProducto && this.isPermisoGuardarCambiosClaseProducto));						
			this.jMenuItemGuardarCambiosTablaClaseProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosClaseProducto && this.isPermisoGuardarCambiosClaseProducto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoClaseProducto=this.jButtonNuevoClaseProducto.isVisible();
			this.isVisibilidadCeldaDuplicarClaseProducto=this.jButtonDuplicarClaseProducto.isVisible();
			this.isVisibilidadCeldaCopiarClaseProducto=this.jButtonCopiarClaseProducto.isVisible();
			this.isVisibilidadCeldaVerFormClaseProducto=this.jButtonVerFormClaseProducto.isVisible();
			
			this.isVisibilidadCeldaOrdenClaseProducto=this.jButtonAbrirOrderByClaseProducto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesClaseProducto=this.jButtonNuevoRelacionesClaseProducto.isVisible();
			this.isVisibilidadCeldaModificarClaseProducto=this.jButtonModificarClaseProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormClaseProducto!=null) {
			this.isVisibilidadCeldaActualizarClaseProducto=this.jInternalFrameDetalleFormClaseProducto.jButtonActualizarClaseProducto.isVisible();
			this.isVisibilidadCeldaEliminarClaseProducto=this.jInternalFrameDetalleFormClaseProducto.jButtonEliminarClaseProducto.isVisible();
			this.isVisibilidadCeldaCancelarClaseProducto=this.jInternalFrameDetalleFormClaseProducto.jButtonCancelarClaseProducto.isVisible();
			this.isVisibilidadCeldaGuardarClaseProducto=this.jInternalFrameDetalleFormClaseProducto.jButtonGuardarCambiosClaseProducto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosClaseProducto=this.jButtonGuardarCambiosTablaClaseProducto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoClaseProducto=this.jButtonNuevoToolBarClaseProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesClaseProducto=this.jButtonNuevoRelacionesToolBarClaseProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormClaseProducto!=null) {
			this.isVisibilidadCeldaModificarClaseProducto=this.jInternalFrameDetalleFormClaseProducto.jButtonModificarToolBarClaseProducto.isVisible();
			this.isVisibilidadCeldaActualizarClaseProducto=this.jInternalFrameDetalleFormClaseProducto.jButtonActualizarToolBarClaseProducto.isVisible();
			this.isVisibilidadCeldaEliminarClaseProducto=this.jInternalFrameDetalleFormClaseProducto.jButtonEliminarToolBarClaseProducto.isVisible();
			this.isVisibilidadCeldaCancelarClaseProducto=this.jInternalFrameDetalleFormClaseProducto.jButtonCancelarToolBarClaseProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarClaseProducto=this.jButtonGuardarCambiosToolBarClaseProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosClaseProducto=this.jButtonGuardarCambiosTablaToolBarClaseProducto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoClaseProducto=this.jMenuItemNuevoClaseProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesClaseProducto=this.jMenuItemNuevoRelacionesClaseProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormClaseProducto!=null) {
			this.isVisibilidadCeldaModificarClaseProducto=this.jInternalFrameDetalleFormClaseProducto.jMenuItemModificarClaseProducto.isVisible();
			this.isVisibilidadCeldaActualizarClaseProducto=this.jInternalFrameDetalleFormClaseProducto.jMenuItemActualizarClaseProducto.isVisible();
			this.isVisibilidadCeldaEliminarClaseProducto=this.jInternalFrameDetalleFormClaseProducto.jMenuItemEliminarClaseProducto.isVisible();
			this.isVisibilidadCeldaCancelarClaseProducto=this.jInternalFrameDetalleFormClaseProducto.jMenuItemCancelarClaseProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarClaseProducto=this.jMenuItemGuardarCambiosClaseProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosClaseProducto=this.jMenuItemGuardarCambiosTablaClaseProducto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesClaseProducto(Boolean esInicializar) {
		if(ClaseProductoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.claseproductoSessionBean.getConGuardarRelaciones()) {
				//if(this.claseproductoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesClaseProducto();
			}
			
			this.inicializarActualizarBindingBotonesManualClaseProducto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualClaseProducto() {
		this.jButtonNuevoClaseProducto.setVisible(this.isPermisoNuevoClaseProducto);			
		this.jButtonDuplicarClaseProducto.setVisible(this.isPermisoDuplicarClaseProducto);			
		this.jButtonCopiarClaseProducto.setVisible(this.isPermisoCopiarClaseProducto);			
		this.jButtonVerFormClaseProducto.setVisible(this.isPermisoVerFormClaseProducto);			
		
		this.jButtonAbrirOrderByClaseProducto.setVisible(this.isPermisoOrdenClaseProducto);					
		
		this.jButtonNuevoRelacionesClaseProducto.setVisible(this.isPermisoNuevoClaseProducto);			
		
		if(this.jInternalFrameDetalleFormClaseProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseProducto.jButtonModificarClaseProducto.setVisible(this.isPermisoActualizarClaseProducto);	
			this.jInternalFrameDetalleFormClaseProducto.jButtonActualizarClaseProducto.setVisible(this.isPermisoActualizarClaseProducto);	
			this.jInternalFrameDetalleFormClaseProducto.jButtonEliminarClaseProducto.setVisible(this.isPermisoEliminarClaseProducto);
			this.jInternalFrameDetalleFormClaseProducto.jButtonCancelarClaseProducto.setVisible(this.isVisibilidadCeldaCancelarClaseProducto);						
			this.jInternalFrameDetalleFormClaseProducto.jButtonGuardarCambiosClaseProducto.setVisible(this.isPermisoGuardarCambiosClaseProducto);							
		}
		
		this.jButtonGuardarCambiosTablaClaseProducto.setVisible(this.isPermisoActualizarClaseProducto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleClaseProducto() {
		this.jInternalFrameDetalleFormClaseProducto.jButtonModificarClaseProducto.setVisible(this.isPermisoActualizarClaseProducto);	
		this.jInternalFrameDetalleFormClaseProducto.jButtonActualizarClaseProducto.setVisible(this.isPermisoActualizarClaseProducto);	
		this.jInternalFrameDetalleFormClaseProducto.jButtonEliminarClaseProducto.setVisible(this.isPermisoEliminarClaseProducto);
		this.jInternalFrameDetalleFormClaseProducto.jButtonCancelarClaseProducto.setVisible(this.isVisibilidadCeldaCancelarClaseProducto);							
		this.jInternalFrameDetalleFormClaseProducto.jButtonGuardarCambiosClaseProducto.setVisible((this.isVisibilidadCeldaGuardarClaseProducto && this.isPermisoGuardarCambiosClaseProducto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosClaseProducto() {
		if(ClaseProductoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualClaseProducto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesClaseProducto() {
	}
	
	public void jTableDatosClaseProductoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarClaseProducto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidClaseProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClaseProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClaseProducto(this.getclaseproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClaseProducto(this.claseproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.claseproducto =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.claseproducto =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.claseproducto==null) {
						this.claseproducto = new ClaseProducto();
					}

					this.setVariablesFormularioToObjetoActualClaseProducto(this.claseproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClaseProducto(this.claseproducto);
				}

				if(this.claseproducto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.claseproducto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClaseProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaClaseProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebClaseProducto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClaseProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosClaseProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosClaseProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproducto =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.claseproducto =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualClaseProducto(this.getclaseproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysClaseProducto(this.claseproducto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.claseproductoLogic.getConnexion());

				if(this.claseproducto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.claseproducto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderClaseProducto=(TitledBorder)this.jScrollPanelDatosClaseProducto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderClaseProducto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaClaseProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClaseProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClaseProducto(this.getclaseproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClaseProducto(this.claseproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.claseproducto =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.claseproducto =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.claseproducto==null) {
						this.claseproducto = new ClaseProducto();
					}

					this.setVariablesFormularioToObjetoActualClaseProducto(this.claseproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClaseProducto(this.claseproducto);
				}

				if(this.claseproducto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.claseproducto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClaseProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_productoClaseProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoproducto=true;

			idTienePermisotipoproducto=this.tienePermisosUsuarioEnPaginaWebClaseProducto(TipoProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClaseProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosClaseProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosClaseProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproducto =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.claseproducto =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualClaseProducto(this.getclaseproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysClaseProducto(this.claseproducto);

				this.tipoproductoBeanSwingJInternalFrame=new TipoProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoproductoBeanSwingJInternalFrame.getTipoProductoLogic().setConnexion(this.claseproductoLogic.getConnexion());

				if(this.claseproducto.getid_tipo_producto()!=null) {
					this.tipoproductoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoproductoBeanSwingJInternalFrame.setIdActual(this.claseproducto.getid_tipo_producto());
					this.tipoproductoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoproductoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoProducto();
				}

				JInternalFrameBase jinternalFrame =this.tipoproductoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderClaseProducto=(TitledBorder)this.jScrollPanelDatosClaseProducto.getBorder();
				TitledBorder titledBordertipoproducto=(TitledBorder)this.tipoproductoBeanSwingJInternalFrame.jScrollPanelDatosTipoProducto.getBorder();

				titledBordertipoproducto.setTitle(titledBorderClaseProducto.getTitle() + " -> Tipo Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_productoClaseProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClaseProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClaseProducto(this.getclaseproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClaseProducto(this.claseproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.claseproducto =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.claseproducto =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.claseproducto==null) {
						this.claseproducto = new ClaseProducto();
					}

					this.setVariablesFormularioToObjetoActualClaseProducto(this.claseproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClaseProducto(this.claseproducto);
				}

				if(this.claseproducto.getid_tipo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_producto = "+this.claseproducto.getid_tipo_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClaseProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoClaseProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClaseProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClaseProducto(this.getclaseproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClaseProducto(this.claseproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.claseproducto =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.claseproducto =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.claseproducto==null) {
						this.claseproducto = new ClaseProducto();
					}

					this.setVariablesFormularioToObjetoActualClaseProducto(this.claseproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClaseProducto(this.claseproducto);
				}

				if(this.claseproducto.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.claseproducto.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClaseProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreClaseProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClaseProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClaseProducto(this.getclaseproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClaseProducto(this.claseproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.claseproducto =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.claseproducto =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.claseproducto==null) {
						this.claseproducto = new ClaseProducto();
					}

					this.setVariablesFormularioToObjetoActualClaseProducto(this.claseproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClaseProducto(this.claseproducto);
				}

				if(this.claseproducto.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.claseproducto.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClaseProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoClaseProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingClaseProducto(false,false);

			this.getClaseProductosBusquedaPorCodigo();

			this.inicializarActualizarBindingClaseProducto(false);

			//if(ClaseProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingClaseProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreClaseProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingClaseProducto(false,false);

			this.getClaseProductosBusquedaPorNombre();

			this.inicializarActualizarBindingClaseProducto(false);

			//if(ClaseProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingClaseProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaClaseProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingClaseProducto(false,false);

			this.getClaseProductosFK_IdEmpresa();

			this.inicializarActualizarBindingClaseProducto(false);

			//if(ClaseProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingClaseProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoProductoClaseProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingClaseProducto(false,false);

			this.getClaseProductosFK_IdTipoProducto();

			this.inicializarActualizarBindingClaseProducto(false);

			//if(ClaseProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingClaseProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameClaseProducto() {
		if(this.jInternalFrameDetalleFormClaseProducto!=null) {
		

		if(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormClaseProducto!=null) {
			this.jInternalFrameDetalleFormClaseProducto.setVisible(false);	    			
			this.jInternalFrameDetalleFormClaseProducto.dispose();
			this.jInternalFrameDetalleFormClaseProducto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoClaseProducto!=null) {
			this.jInternalFrameReporteDinamicoClaseProducto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoClaseProducto.dispose();
			this.jInternalFrameReporteDinamicoClaseProducto=null;
		}
		
		if(this.jInternalFrameImportacionClaseProducto!=null) {
			this.jInternalFrameImportacionClaseProducto.setVisible(false);	    			
			this.jInternalFrameImportacionClaseProducto.dispose();
			this.jInternalFrameImportacionClaseProducto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessClaseProducto();
			
			ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
			
			
			if(sTipo.equals("NuevoClaseProducto")) {
				jButtonNuevoClaseProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarClaseProducto")) {
				jButtonDuplicarClaseProductoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarClaseProducto")) {
				jButtonCopiarClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormClaseProducto")) {
				jButtonVerFormClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarClaseProducto")) {
				jButtonNuevoClaseProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarClaseProducto")) {
				jButtonDuplicarClaseProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoClaseProducto")) {
				jButtonNuevoClaseProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarClaseProducto")) {
				jButtonDuplicarClaseProductoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesClaseProducto")) {
				jButtonNuevoClaseProductoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarClaseProducto")) {
				jButtonNuevoClaseProductoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesClaseProducto")) {
				jButtonNuevoClaseProductoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarClaseProducto")) {
				jButtonModificarClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarClaseProducto")) {
				jButtonModificarClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarClaseProducto")) {
				jButtonModificarClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarClaseProducto")) {
				jButtonActualizarClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarClaseProducto")) {
				jButtonActualizarClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarClaseProducto")) {
				jButtonActualizarClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarClaseProducto")) {
				jButtonEliminarClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarClaseProducto")) {
				jButtonEliminarClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarClaseProducto")) {
				jButtonEliminarClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarClaseProducto")) {
				jButtonCancelarClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarClaseProducto")) {
				jButtonCancelarClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarClaseProducto")) {
				jButtonCancelarClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarClaseProducto")) {
				jButtonCerrarClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarClaseProducto")) {
				jButtonCerrarClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarClaseProducto")) {
				jButtonCerrarClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarClaseProducto")) {
				jButtonMostrarOcultarClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarClaseProducto")) {
				jButtonCancelarClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosClaseProducto")) {
				jButtonGuardarCambiosClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarClaseProducto")) {
				jButtonGuardarCambiosClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarClaseProducto")) {
				jButtonCopiarClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarClaseProducto")) {
				jButtonVerFormClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosClaseProducto")) {
				jButtonGuardarCambiosClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarClaseProducto")) {
				jButtonCopiarClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormClaseProducto")) {
				jButtonVerFormClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaClaseProducto")) {
				jButtonGuardarCambiosClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarClaseProducto")) {
				jButtonGuardarCambiosClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaClaseProducto")) {
				jButtonGuardarCambiosClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionClaseProducto")) {
				jButtonRecargarInformacionClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarClaseProducto")) {
				jButtonRecargarInformacionClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionClaseProducto")) {
				jButtonRecargarInformacionClaseProductoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresClaseProducto")) {
				jButtonAnterioresClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarClaseProducto")) {
				jButtonAnterioresClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreClaseProducto")) {
				jButtonAnterioresClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesClaseProducto")) {
				jButtonSiguientesClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarClaseProducto")) {
				jButtonSiguientesClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesClaseProducto")) {
				jButtonSiguientesClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByClaseProducto") || sTipo.equals("MenuItemDetalleAbrirOrderByClaseProducto")) {
				jButtonAbrirOrderByClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarClaseProducto") || sTipo.equals("MenuItemDetalleMostrarOcultarClaseProducto")) {
				jButtonMostrarOcultarClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosClaseProducto")) {
				jButtonNuevoGuardarCambiosClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarClaseProducto")) {
				jButtonNuevoGuardarCambiosClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosClaseProducto")) {
				jButtonNuevoGuardarCambiosClaseProductoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoClaseProducto")) {
				jButtonCerrarReporteDinamicoClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoClaseProducto")) {
				jButtonGenerarReporteDinamicoClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoClaseProducto")) {
				
				jButtonGenerarExcelReporteDinamicoClaseProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionClaseProducto")) {
				jButtonCerrarImportacionClaseProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionClaseProducto")) {
				
				jButtonGenerarImportacionClaseProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionClaseProducto")) {
				
				jButtonAbrirImportacionClaseProductoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesClaseProducto")) {
				jComboBoxTiposAccionesClaseProductoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesClaseProducto")) {
				jComboBoxTiposRelacionesClaseProductoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioClaseProducto")) {
				jComboBoxTiposAccionesClaseProductoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarClaseProducto")) {
				
				jComboBoxTiposSeleccionarClaseProductoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralClaseProducto")) {
				jTextFieldValorCampoGeneralClaseProductoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByClaseProducto")) {
				jButtonAbrirOrderByClaseProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarClaseProducto")) {
				jButtonAbrirOrderByClaseProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByClaseProducto")) {
				jButtonCerrarOrderByClaseProductoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idClaseProductoBusqueda")) {
				this.jButtonidClaseProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaClaseProductoUpdate")) {
				this.jButtonid_empresaClaseProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaClaseProductoBusqueda")) {
				this.jButtonid_empresaClaseProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_productoClaseProductoUpdate")) {
				this.jButtonid_tipo_productoClaseProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_productoClaseProductoBusqueda")) {
				this.jButtonid_tipo_productoClaseProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoClaseProductoBusqueda")) {
				this.jButtoncodigoClaseProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreClaseProductoBusqueda")) {
				this.jButtonnombreClaseProductoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoClaseProducto")) {
				this.jButtonBusquedaPorCodigoClaseProductoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreClaseProducto")) {
				this.jButtonBusquedaPorNombreClaseProductoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoProductoClaseProducto")) {
				this.jButtonFK_IdTipoProductoClaseProductoActionPerformed(evt);
			}
			
			;
			
			
			ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessClaseProducto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClaseProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.claseproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.claseproducto);
				
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
				
				


				
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClaseProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClaseProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ClaseProducto claseproductoLocal=null;
			
			if(!this.getEsControlTabla()) {
				claseproductoLocal=this.claseproducto;
			} else {
				claseproductoLocal=this.claseproductoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.claseproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.claseproducto);
				
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
							
				
				


				
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClaseProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClaseProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClaseProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClaseProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoAnterior =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.claseproductoAnterior =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
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
			
			ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
			
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
			
			


			
			ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClaseProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.claseproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.claseproducto);
				
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
								
						
				


				
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClaseProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClaseProducto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.claseproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.claseproducto);
				
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
								
				
				


				
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClaseProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClaseProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClaseProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClaseProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoAnterior =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.claseproductoAnterior =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.claseproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.claseproducto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClaseProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClaseProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoAnterior =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.claseproductoAnterior =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClaseProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.claseproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.claseproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.claseproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.claseproducto);
				
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
							
				
				


				
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClaseProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClaseProducto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClaseProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosClaseProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.claseproductoAnterior =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.claseproductoAnterior =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
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
			
			ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
			
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
			
			


			
			ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClaseProductoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.claseproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.claseproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.claseproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.claseproducto);
				
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
								
				
				


				
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClaseProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClaseProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClaseProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClaseProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoAnterior =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.claseproductoAnterior =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClaseProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.claseproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.claseproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClaseProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.claseproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.claseproducto);
				
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosClaseProducto")) {
					jCheckBoxSeleccionarTodosClaseProductoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosClaseProducto")) {
					jCheckBoxSeleccionadosClaseProductoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarClaseProducto")) {
					
				}
				
				


				
				
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClaseProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClaseProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.claseproducto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.claseproducto);
				
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
												
				
				


				
				
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClaseProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClaseProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClaseProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosClaseProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.claseproductoAnterior =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.claseproductoAnterior =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClaseProductoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.claseproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.claseproducto);
				
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
				
				
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
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
			
			ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
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
			
			


			
			ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClaseProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.claseproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.claseproducto);
				
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClaseProducto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClaseProducto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.claseproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.claseproducto);
				
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
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
				
				


				
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClaseProducto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClaseProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClaseProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClaseProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseproductoAnterior =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.claseproductoAnterior =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarClaseProducto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosClaseProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosClaseProducto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.claseproducto =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.claseproducto =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.claseproducto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarClaseProducto")) {
				
				}
				
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarClaseProducto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosClaseProducto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarClaseProducto")) {
			
			}
			
			ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessClaseProducto();
			
			ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
			
			if(sTipo.equals("NuevoClaseProducto")) {
				jButtonNuevoClaseProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarClaseProducto")) {
				jButtonDuplicarClaseProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarClaseProducto")) {
				jButtonCopiarClaseProductoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormClaseProducto")) {
				jButtonVerFormClaseProductoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesClaseProducto")) {
				jButtonNuevoClaseProductoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarClaseProducto")) {
				jButtonModificarClaseProductoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarClaseProducto")) {
				jButtonActualizarClaseProductoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarClaseProducto")) {
				jButtonEliminarClaseProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaClaseProducto")) {
				jButtonGuardarCambiosClaseProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarClaseProducto")) {
				jButtonCancelarClaseProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarClaseProducto")) {
				jButtonCerrarClaseProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosClaseProducto")) {
				jButtonGuardarCambiosClaseProductoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosClaseProducto")) {
				jButtonNuevoGuardarCambiosClaseProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByClaseProducto")) {
				jButtonAbrirOrderByClaseProductoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionClaseProducto")) {
				jButtonRecargarInformacionClaseProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresClaseProducto")) {
				jButtonAnterioresClaseProductoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesClaseProducto")) {
				jButtonSiguientesClaseProductoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idClaseProductoBusqueda")) {
				this.jButtonidClaseProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaClaseProductoUpdate")) {
				this.jButtonid_empresaClaseProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaClaseProductoBusqueda")) {
				this.jButtonid_empresaClaseProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_productoClaseProductoUpdate")) {
				this.jButtonid_tipo_productoClaseProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_productoClaseProductoBusqueda")) {
				this.jButtonid_tipo_productoClaseProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoClaseProductoBusqueda")) {
				this.jButtoncodigoClaseProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreClaseProductoBusqueda")) {
				this.jButtonnombreClaseProductoBusquedaActionPerformed(evt);
			}
			
			ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessClaseProducto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameClaseProducto")) {
				closingInternalFrameClaseProducto();
				
			} else if(sTipo.equals("jButtonCancelarClaseProducto")) {
				JInternalFrameBase jInternalFrameDetalleFormClaseProducto = (JInternalFrameBase)evt.getSource();
	            	
	            ClaseProductoBeanSwingJInternalFrame jInternalFrameParent=(ClaseProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormClaseProducto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarClaseProductoActionPerformed(null);
			}
			
			ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.claseproducto,new Object(),this.claseproductoParameterGeneral,this.claseproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormClaseProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormClaseProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormClaseProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.claseproducto)) {
			if(!esControlTabla) {
				if(ClaseProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualClaseProducto(this.claseproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysClaseProducto(this.claseproducto);			
				}
				
				if(this.claseproductoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualClaseProducto(this.claseproducto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.claseproductoReturnGeneral=claseproductoLogic.procesarEventosClaseProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.claseproductoLogic.getClaseProductos(),this.claseproducto,this.claseproductoParameterGeneral,this.isEsNuevoClaseProducto,classes);//this.claseproductoLogic.getClaseProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanClaseProducto(this.claseproductoReturnGeneral,this.claseproductoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.claseproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanClaseProducto(classes,this.claseproductoReturnGeneral,this.claseproductoBean,false);
					}
						
					if(this.claseproductoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyClaseProducto(this.claseproductoReturnGeneral.getClaseProducto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioClaseProducto(this.claseproductoReturnGeneral.getClaseProducto());	
					}
						
					if(this.claseproductoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioClaseProducto(this.claseproductoReturnGeneral.getClaseProducto(),classes);//this.claseproductoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioClaseProducto(this.claseproducto,classes);//this.claseproductoBean);									
				}
			
				if(ClaseProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualClaseProducto(this.claseproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysClaseProducto(this.claseproducto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.claseproductoAnterior!=null) {
						this.claseproducto=this.claseproductoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.claseproductoReturnGeneral=claseproductoLogic.procesarEventosClaseProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.claseproductoLogic.getClaseProductos(),this.claseproducto,this.claseproductoParameterGeneral,this.isEsNuevoClaseProducto,classes);//this.claseproductoLogic.getClaseProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.claseproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.claseproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.claseproductoReturnGeneral.getClaseProducto(),claseproductoLogic.getClaseProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.claseproductoReturnGeneral.getClaseProducto(),this.claseproductos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosClaseProducto.repaint();
				
				//((AbstractTableModel) this.jTableDatosClaseProducto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosClaseProducto();
			}
		}
	}
	
	public void actualizarVisualTableDatosClaseProducto() throws Exception {
		
		ClaseProductoModel claseproductoModel=(ClaseProductoModel)this.jTableDatosClaseProducto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			claseproductoModel.claseproductos=this.claseproductoLogic.getClaseProductos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			claseproductoModel.claseproductos=this.claseproductos;
		}
		
		
		((ClaseProductoModel) this.jTableDatosClaseProducto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaClaseProducto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getclaseproductoAnterior(),this.claseproductoLogic.getClaseProductos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getclaseproductoAnterior(),this.claseproductos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosClaseProducto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioClaseProducto(ClaseProducto claseproducto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(claseproducto.getProductos());
					this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(claseproducto.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
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
										
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.claseproducto,new Object(),generalEntityParameterGeneral,this.claseproductoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.claseproductoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ClaseProductoConstantesFunciones.getClassesRelationshipsOfClaseProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ClaseProductoConstantesFunciones.getClassesRelationshipsFromStringsOfClaseProducto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormClaseProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ClaseProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.claseproducto,new Object(),generalEntityParameterGeneral,this.claseproductoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioClaseProducto(ClaseProductoBean claseproductoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(claseproducto.getProductos());
					this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(claseproducto.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanClaseProducto(ArrayList<Classe> classes,ClaseProductoReturnGeneral claseproductoReturnGeneral,ClaseProductoBean claseproductoBean,Boolean conDefault) throws Exception {
		
			this.claseproductoBean.setProductos(claseproductoReturnGeneral.getClaseProducto().getProductos());
			this.claseproductoBean.setParametroInventarioDefectos(claseproductoReturnGeneral.getClaseProducto().getParametroInventarioDefectos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualClaseProducto(ClaseProducto claseproducto,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					claseproducto.setProductos(this.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					claseproducto.setParametroInventarioDefectos(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.claseproducto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormClaseProducto = new ClaseProductoDetalleFormJInternalFrame(jDesktopPane,this.claseproductoSessionBean.getConGuardarRelaciones(),this.claseproductoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormClaseProducto);
		this.jInternalFrameDetalleFormClaseProducto.setVisible(false);
		this.jInternalFrameDetalleFormClaseProducto.setSelected(false);						
		
		this.jInternalFrameDetalleFormClaseProducto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormClaseProducto.claseproductoLogic=this.claseproductoLogic;
		
		this.cargarCombosFrameForeignKeyClaseProducto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleClaseProducto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleClaseProducto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyClaseProducto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyClaseProducto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormClaseProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarClaseProducto"));
		
		this.jInternalFrameDetalleFormClaseProducto.jButtonModificarClaseProducto.addActionListener(new ButtonActionListener(this,"ModificarClaseProducto"));

		
		this.jInternalFrameDetalleFormClaseProducto.jButtonModificarToolBarClaseProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarClaseProducto"));
					
		this.jInternalFrameDetalleFormClaseProducto.jMenuItemModificarClaseProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarClaseProducto"));		
		
		
		
		this.jInternalFrameDetalleFormClaseProducto.jButtonActualizarClaseProducto.addActionListener (new ButtonActionListener(this,"ActualizarClaseProducto"));
		
		
		this.jInternalFrameDetalleFormClaseProducto.jButtonActualizarToolBarClaseProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarClaseProducto"));
						
		this.jInternalFrameDetalleFormClaseProducto.jMenuItemActualizarClaseProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarClaseProducto"));		
		
		
		
		this.jInternalFrameDetalleFormClaseProducto.jButtonEliminarClaseProducto.addActionListener (new ButtonActionListener(this,"EliminarClaseProducto"));
		
		
		this.jInternalFrameDetalleFormClaseProducto.jButtonEliminarToolBarClaseProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarClaseProducto"));
								
		this.jInternalFrameDetalleFormClaseProducto.jMenuItemEliminarClaseProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarClaseProducto"));		
		
		
		
		this.jInternalFrameDetalleFormClaseProducto.jButtonCancelarClaseProducto.addActionListener (new ButtonActionListener(this,"CancelarClaseProducto"));
		
		
		this.jInternalFrameDetalleFormClaseProducto.jButtonCancelarToolBarClaseProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarClaseProducto"));
					
		this.jInternalFrameDetalleFormClaseProducto.jMenuItemCancelarClaseProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarClaseProducto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormClaseProducto.jMenuItemDetalleCerrarClaseProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarClaseProducto"));		
		
		
		
		this.jInternalFrameDetalleFormClaseProducto.jButtonGuardarCambiosToolBarClaseProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarClaseProducto"));
		
		
		
		this.jInternalFrameDetalleFormClaseProducto.jButtonGuardarCambiosToolBarClaseProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarClaseProducto"));
		
		
		
		this.jInternalFrameDetalleFormClaseProducto.jComboBoxTiposAccionesFormularioClaseProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioClaseProducto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseProducto.jButtonidClaseProductoBusqueda.addActionListener(new ButtonActionListener(this,"idClaseProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClaseProducto.jButtonid_empresaClaseProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaClaseProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseProducto.jButtonid_empresaClaseProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaClaseProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClaseProducto.jButtonid_tipo_productoClaseProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_productoClaseProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseProducto.jButtonid_tipo_productoClaseProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_productoClaseProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseProducto.jButtoncodigoClaseProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoClaseProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseProducto.jButtonnombreClaseProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreClaseProductoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormClaseProducto.jTabbedPaneRelacionesClaseProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesClaseProducto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameClaseProducto"));
		
		if(this.jInternalFrameDetalleFormClaseProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarClaseProducto"));
		}
		
		this.jTableDatosClaseProducto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarClaseProducto"));
		
		this.jTableDatosClaseProducto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarClaseProducto"));
		
		this.jButtonNuevoClaseProducto.addActionListener(new ButtonActionListener(this,"NuevoClaseProducto"));
		
		this.jButtonDuplicarClaseProducto.addActionListener(new ButtonActionListener(this,"DuplicarClaseProducto"));
		
		this.jButtonCopiarClaseProducto.addActionListener(new ButtonActionListener(this,"CopiarClaseProducto"));
		
		this.jButtonVerFormClaseProducto.addActionListener(new ButtonActionListener(this,"VerFormClaseProducto"));
		
		
		this.jButtonNuevoToolBarClaseProducto.addActionListener(new ButtonActionListener(this,"NuevoToolBarClaseProducto"));
			
		this.jButtonDuplicarToolBarClaseProducto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarClaseProducto"));
			
		this.jMenuItemNuevoClaseProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoClaseProducto"));
			
		this.jMenuItemDuplicarClaseProducto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarClaseProducto"));		
		
		
		this.jButtonNuevoRelacionesClaseProducto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesClaseProducto"));
		
		
		this.jButtonNuevoRelacionesToolBarClaseProducto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarClaseProducto"));
			
		this.jMenuItemNuevoRelacionesClaseProducto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesClaseProducto"));		
		
		
		if(this.jInternalFrameDetalleFormClaseProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseProducto.jButtonModificarClaseProducto.addActionListener(new ButtonActionListener(this,"ModificarClaseProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormClaseProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseProducto.jButtonModificarToolBarClaseProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarClaseProducto"));
			
			this.jInternalFrameDetalleFormClaseProducto.jMenuItemModificarClaseProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarClaseProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormClaseProducto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormClaseProducto.jButtonActualizarClaseProducto.addActionListener (new ButtonActionListener(this,"ActualizarClaseProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormClaseProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseProducto.jButtonActualizarToolBarClaseProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarClaseProducto"));
				
			this.jInternalFrameDetalleFormClaseProducto.jMenuItemActualizarClaseProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarClaseProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormClaseProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseProducto.jButtonEliminarClaseProducto.addActionListener (new ButtonActionListener(this,"EliminarClaseProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormClaseProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseProducto.jButtonEliminarToolBarClaseProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarClaseProducto"));
						
			this.jInternalFrameDetalleFormClaseProducto.jMenuItemEliminarClaseProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarClaseProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormClaseProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseProducto.jButtonCancelarClaseProducto.addActionListener (new ButtonActionListener(this,"CancelarClaseProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormClaseProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseProducto.jButtonCancelarToolBarClaseProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarClaseProducto"));
			
			this.jInternalFrameDetalleFormClaseProducto.jMenuItemCancelarClaseProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarClaseProducto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarClaseProducto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarClaseProducto"));		
		
		
		this.jButtonCerrarClaseProducto.addActionListener (new ButtonActionListener(this,"CerrarClaseProducto"));
		
		
		this.jButtonCerrarToolBarClaseProducto.addActionListener (new ButtonActionListener(this,"CerrarToolBarClaseProducto"));
			
		this.jMenuItemCerrarClaseProducto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarClaseProducto"));
			
		if(this.jInternalFrameDetalleFormClaseProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseProducto.jMenuItemDetalleCerrarClaseProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarClaseProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormClaseProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseProducto.jButtonGuardarCambiosClaseProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosClaseProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormClaseProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseProducto.jButtonGuardarCambiosToolBarClaseProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarClaseProducto"));
		}
		
		this.jButtonCopiarToolBarClaseProducto.addActionListener (new ButtonActionListener(this,"CopiarToolBarClaseProducto"));
			
		this.jButtonVerFormToolBarClaseProducto.addActionListener (new ButtonActionListener(this,"VerFormToolBarClaseProducto"));
		
		this.jMenuItemGuardarCambiosClaseProducto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosClaseProducto"));
			
		this.jMenuItemCopiarClaseProducto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarClaseProducto"));		
		
		this.jMenuItemVerFormClaseProducto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormClaseProducto"));		
		
		
		this.jButtonGuardarCambiosTablaClaseProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaClaseProducto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarClaseProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarClaseProducto"));
			
		this.jMenuItemGuardarCambiosTablaClaseProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaClaseProducto"));		
		
		
		
		this.jButtonRecargarInformacionClaseProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionClaseProducto"));
					
		this.jButtonRecargarInformacionToolBarClaseProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarClaseProducto"));
		
		this.jMenuItemRecargarInformacionClaseProducto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionClaseProducto"));		
		
		
		
		this.jButtonAnterioresClaseProducto.addActionListener (new ButtonActionListener(this,"AnterioresClaseProducto"));
		
		
		this.jButtonAnterioresToolBarClaseProducto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarClaseProducto"));
		
		this.jMenuItemAnterioresClaseProducto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresClaseProducto"));		
		
		
		this.jButtonSiguientesClaseProducto.addActionListener (new ButtonActionListener(this,"SiguientesClaseProducto"));
		
		
		this.jButtonSiguientesToolBarClaseProducto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarClaseProducto"));
			
		this.jMenuItemSiguientesClaseProducto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesClaseProducto"));
			
		this.jMenuItemAbrirOrderByClaseProducto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByClaseProducto"));
			
		this.jMenuItemMostrarOcultarClaseProducto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarClaseProducto"));
			
		this.jMenuItemDetalleAbrirOrderByClaseProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByClaseProducto"));
			
		this.jMenuItemDetalleMostarOcultarClaseProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarClaseProducto"));		
		
		
		this.jButtonNuevoGuardarCambiosClaseProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosClaseProducto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarClaseProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarClaseProducto"));
			
		this.jMenuItemNuevoGuardarCambiosClaseProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosClaseProducto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosClaseProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosClaseProducto"));

		this.jCheckBoxSeleccionadosClaseProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosClaseProducto"));
		
		if(this.jInternalFrameDetalleFormClaseProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseProducto.jComboBoxTiposAccionesFormularioClaseProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioClaseProducto"));
		}
		
		
		this.jComboBoxTiposRelacionesClaseProducto.addActionListener (new ButtonActionListener(this,"TiposRelacionesClaseProducto"));
			
		this.jComboBoxTiposAccionesClaseProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesClaseProducto"));
					
		this.jComboBoxTiposSeleccionarClaseProducto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarClaseProducto"));
			
		this.jTextFieldValorCampoGeneralClaseProducto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralClaseProducto"));		
		
		
		if(this.jInternalFrameDetalleFormClaseProducto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseProducto.jButtonidClaseProductoBusqueda.addActionListener(new ButtonActionListener(this,"idClaseProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClaseProducto.jButtonid_empresaClaseProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaClaseProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseProducto.jButtonid_empresaClaseProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaClaseProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClaseProducto.jButtonid_tipo_productoClaseProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_productoClaseProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseProducto.jButtonid_tipo_productoClaseProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_productoClaseProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseProducto.jButtoncodigoClaseProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoClaseProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseProducto.jButtonnombreClaseProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreClaseProductoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoClaseProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoClaseProducto"));

			this.jButtonBusquedaPorNombreClaseProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreClaseProducto"));

			this.jButtonFK_IdTipoProductoClaseProducto.addActionListener(new ButtonActionListener(this,"FK_IdTipoProductoClaseProducto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoClaseProducto!=null) {
				this.jInternalFrameReporteDinamicoClaseProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoClaseProducto"));
				this.jInternalFrameReporteDinamicoClaseProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoClaseProducto"));
				this.jInternalFrameReporteDinamicoClaseProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoClaseProducto"));
			}
			
			//this.jButtonCerrarReporteDinamicoClaseProducto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoClaseProducto"));				
			//this.jButtonGenerarReporteDinamicoClaseProducto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoClaseProducto"));
			//this.jButtonGenerarExcelReporteDinamicoClaseProducto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoClaseProducto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionClaseProducto!=null) {
				this.jInternalFrameImportacionClaseProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionClaseProducto"));
				this.jInternalFrameImportacionClaseProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionClaseProducto"));
				this.jInternalFrameImportacionClaseProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionClaseProducto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByClaseProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByClaseProducto"));
			
			this.jButtonAbrirOrderByToolBarClaseProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarClaseProducto"));			
			
			if(this.jInternalFrameOrderByClaseProducto!=null) {
				this.jInternalFrameOrderByClaseProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByClaseProducto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormClaseProducto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormClaseProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseProducto.jTabbedPaneRelacionesClaseProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesClaseProducto"));
		
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
            		closingInternalFrameClaseProducto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormClaseProducto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormClaseProducto = (JInternalFrameBase)event.getSource();
	            	
	            ClaseProductoBeanSwingJInternalFrame jInternalFrameParent=(ClaseProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormClaseProducto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarClaseProductoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosClaseProducto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosClaseProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosClaseProducto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosClaseProducto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClaseProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClaseProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClaseProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoClaseProducto";
		inputMap = this.jButtonNuevoClaseProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoClaseProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoClaseProductoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClaseProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClaseProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClaseProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesClaseProducto";
		inputMap = this.jButtonNuevoRelacionesClaseProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesClaseProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoClaseProductoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarClaseProducto";
		inputMap = this.jButtonModificarClaseProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarClaseProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarClaseProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarClaseProducto";
		inputMap = this.jButtonActualizarClaseProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarClaseProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarClaseProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarClaseProducto";
		inputMap = this.jButtonEliminarClaseProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarClaseProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarClaseProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarClaseProducto";
		inputMap = this.jButtonCancelarClaseProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarClaseProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarClaseProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarClaseProducto";
		inputMap = this.jButtonCerrarClaseProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarClaseProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarClaseProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormClaseProducto.jButtonGuardarCambiosClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosClaseProducto";
		inputMap = this.jInternalFrameDetalleFormClaseProducto.jButtonGuardarCambiosClaseProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormClaseProducto.jButtonGuardarCambiosClaseProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosClaseProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosClaseProducto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosClaseProductoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesClaseProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesClaseProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarClaseProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarClaseProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralClaseProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralClaseProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseProducto.jButtonidClaseProductoBusqueda.addActionListener(new ButtonActionListener(this,"idClaseProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClaseProducto.jButtonid_empresaClaseProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaClaseProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseProducto.jButtonid_empresaClaseProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaClaseProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClaseProducto.jButtonid_tipo_productoClaseProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_productoClaseProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseProducto.jButtonid_tipo_productoClaseProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_productoClaseProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseProducto.jButtoncodigoClaseProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoClaseProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseProducto.jButtonnombreClaseProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreClaseProductoBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoClaseProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoClaseProducto"));

		this.jButtonBusquedaPorNombreClaseProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreClaseProducto"));

		this.jButtonFK_IdTipoProductoClaseProducto.addActionListener(new ButtonActionListener(this,"FK_IdTipoProductoClaseProducto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionClaseProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionClaseProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarClaseProductoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarClaseProducto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosClaseProducto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ClaseProducto claseproductoAux:this.claseproductoLogic.getClaseProductos()) {
					claseproductoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ClaseProducto claseproductoAux:claseproductos) {
					claseproductoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosClaseProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingClaseProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ClaseProducto claseproductoAux:this.claseproductoLogic.getClaseProductos()) {
						claseproductoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ClaseProducto claseproductoAux:claseproductos) {
						claseproductoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ClaseProducto claseproductoAux:this.claseproductoLogic.getClaseProductos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ClaseProducto claseproductoAux:claseproductos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaClaseProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosClaseProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosClaseProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosClaseProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosClaseProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingClaseProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosClaseProducto.getSelectedRows();
			
			ClaseProducto claseproductoLocal=new ClaseProducto();
			
			//this.seleccionarTodosClaseProducto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					claseproductoLocal =(ClaseProducto) this.claseproductoLogic.getClaseProductos().toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					claseproductoLocal =(ClaseProducto) this.claseproductos.toArray()[this.jTableDatosClaseProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				claseproductoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ClaseProducto claseproductoAux:this.claseproductoLogic.getClaseProductos()) {
						claseproductoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ClaseProducto claseproductoAux:claseproductos) {
						claseproductoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaClaseProducto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosClaseProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosClaseProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosClaseProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualClaseProductoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarClaseProductoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralClaseProductoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingClaseProducto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralClaseProducto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ClaseProducto claseproductoAux:this.claseproductoLogic.getClaseProductos()) {
				
						if(sTipoSeleccionar.equals(ClaseProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							claseproductoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ClaseProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							claseproductoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ClaseProducto claseproductoAux:claseproductos) {
					
						if(sTipoSeleccionar.equals(ClaseProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							claseproductoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ClaseProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							claseproductoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaClaseProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesClaseProductoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingClaseProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioClaseProducto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesClaseProducto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormClaseProducto.jComboBoxTiposAccionesFormularioClaseProducto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteClaseProducto) {				
					conSplash=true;//false;										
					
					//this.startProcessClaseProducto(conSplash);
				
					this.generarReporteClaseProductosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesClaseProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormClaseProducto.jComboBoxTiposAccionesFormularioClaseProducto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoClaseProductosSeleccionados();
				//this.jComboBoxTiposAccionesClaseProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoClaseProductosSeleccionados(false);
				//this.jComboBoxTiposAccionesClaseProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoClaseProductosSeleccionados(true);
				//this.jComboBoxTiposAccionesClaseProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessClaseProducto();
				
				this.exportarClaseProductosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesClaseProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormClaseProducto.jComboBoxTiposAccionesFormularioClaseProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionClaseProductos();
				//this.importarClaseProductos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesClaseProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormClaseProducto.jComboBoxTiposAccionesFormularioClaseProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessClaseProducto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelClaseProductosSeleccionados();
				//this.jComboBoxTiposAccionesClaseProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Clase Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessClaseProducto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoClaseProducto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyClaseProducto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Clase Producto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesClaseProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormClaseProducto.jComboBoxTiposAccionesFormularioClaseProducto.setSelectedIndex(0);					
				}	
			} 			
			else if(ClaseProductoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteClaseProducto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessClaseProducto(conSplash);
					
						//this.actualizarParametrosGeneralClaseProducto();
						
						this.generarReporteProcesoAccionClaseProductosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesClaseProducto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormClaseProducto.jComboBoxTiposAccionesFormularioClaseProducto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ClaseProductoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Clase ProductoS SELECCIONADOS?", "MANTENIMIENTO DE Clase Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessClaseProducto();
				
						this.actualizarParametrosGeneralClaseProducto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.claseproductoReturnGeneral=claseproductoLogic.procesarAccionClaseProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.claseproductoLogic.getClaseProductos(),this.claseproductoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarClaseProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesClaseProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormClaseProducto.jComboBoxTiposAccionesFormularioClaseProducto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralClaseProducto();
					
					ClaseProductoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarClaseProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesClaseProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormClaseProducto.jComboBoxTiposAccionesFormularioClaseProducto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessClaseProducto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesClaseProductoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessClaseProducto();
			
			if(this.jInternalFrameDetalleFormClaseProducto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ClaseProducto> claseproductosSeleccionados=new ArrayList<ClaseProducto>();		
			ClaseProducto claseproducto=new ClaseProducto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingClaseProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesClaseProducto.getSelectedItem();
			
			
			
			
			claseproductosSeleccionados=this.getClaseProductosSeleccionados(true);
			//this.sTipoAccion;
			
			if(claseproductosSeleccionados.size()==1) {
				for(ClaseProducto claseproductoAux:claseproductosSeleccionados) {
					claseproducto=claseproductoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Producto")) {
					jButtonProductoActionPerformed(null,rowIndex,true,false,claseproducto);
				}
				else if(this.sTipoRelacion.equals("Parametro Inventario Defecto")) {
					jButtonParametroInventarioDefectoActionPerformed(null,rowIndex,true,false,claseproducto);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessClaseProducto();
			
      		//this.finishProcessClaseProducto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarClaseProductoReturnGeneral() throws Exception {
		if(this.claseproductoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.claseproductoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.claseproductoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.claseproductoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.claseproductoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.claseproductoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingClaseProducto(false);
		}
		
		if(this.claseproductoReturnGeneral.getConRetornoLista() || this.claseproductoReturnGeneral.getConRetornoObjeto()) {
			if(this.claseproductoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.claseproductoLogic.setClaseProductos(this.claseproductoReturnGeneral.getClaseProductos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.claseproductoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.claseproductoLogic.setClaseProducto(this.claseproductoReturnGeneral.getClaseProducto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingClaseProducto(false);
		}
	}
	
	public void actualizarParametrosGeneralClaseProducto() throws Exception {
		
		
	}
	
	public ArrayList<ClaseProducto> getClaseProductosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ClaseProducto> claseproductosSeleccionados=new ArrayList<ClaseProducto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioClaseProducto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ClaseProducto claseproductoAux:claseproductoLogic.getClaseProductos()) {
					if(claseproductoAux.getIsSelected()) {
						claseproductosSeleccionados.add(claseproductoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ClaseProducto claseproductoAux:this.claseproductos) {
					if(claseproductoAux.getIsSelected()) {
						claseproductosSeleccionados.add(claseproductoAux);				
					}
				}
			}
			
			if(claseproductosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						claseproductosSeleccionados.addAll(this.claseproductoLogic.getClaseProductos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						claseproductosSeleccionados.addAll(this.claseproductos);				
					}
				}
			}
		} else {
			claseproductosSeleccionados.add(this.claseproducto);
		}
		
		return claseproductosSeleccionados;
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
	
	public void generarReporteClaseProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalClaseProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoClaseProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoClaseProductosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoClaseProductosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesClaseProductosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Clase Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesClaseProductosSeleccionados() throws Exception {
		ArrayList<ClaseProducto> claseproductosSeleccionados=new ArrayList<ClaseProducto>();		
		
		claseproductosSeleccionados=this.getClaseProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteClaseProductos("Todos",claseproductosSeleccionados);
		
	}	
	
	public void generarReporteNormalClaseProductosSeleccionados() throws Exception {
		ArrayList<ClaseProducto> claseproductosSeleccionados=new ArrayList<ClaseProducto>();		
		
		claseproductosSeleccionados=this.getClaseProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteClaseProductos("Todos",claseproductosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionClaseProductosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ClaseProducto> claseproductosSeleccionados=new ArrayList<ClaseProducto>();
		
		claseproductosSeleccionados=this.getClaseProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteClaseProductos("Todos",claseproductosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoClaseProductosSeleccionados() throws Exception {
		ArrayList<ClaseProducto> claseproductosSeleccionados=new ArrayList<ClaseProducto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoClaseProducto();
		
		
		claseproductosSeleccionados=this.getClaseProductosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoClaseProducto();
		
		
		//this.generarReporteClaseProductos("Todos",claseproductosSeleccionados ,claseproductoImplementable,claseproductoImplementableHome);
	}
	
	public void mostrarImportacionClaseProductos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionClaseProducto();
		
		this.abrirFrameImportacionClaseProducto();		
		
			
		//this.generarReporteClaseProductos("Todos",claseproductosSeleccionados ,claseproductoImplementable,claseproductoImplementableHome);
	}
	
	public void importarClaseProductos() throws Exception {		
	
	}
	
	public void exportarClaseProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelClaseProductosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoClaseProductosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlClaseProductosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Clase Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoClaseProductosSeleccionados() throws Exception {
		ArrayList<ClaseProducto> claseproductosSeleccionados=new ArrayList<ClaseProducto>();		
		
		claseproductosSeleccionados=this.getClaseProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"claseproducto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarClaseProducto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ClaseProducto claseproductoAux:claseproductosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarClaseProducto(claseproductoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//claseproductoAux.setsDetalleGeneralEntityReporte(claseproductoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.claseproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Clase Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarClaseProducto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ClaseProductoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClaseProductoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClaseProductoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClaseProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClaseProductoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClaseProductoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarClaseProducto(ClaseProducto claseproducto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=claseproducto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=claseproducto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=claseproducto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=claseproducto.gettipoproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=claseproducto.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=claseproducto.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelClaseProductosSeleccionados() throws Exception {
		ArrayList<ClaseProducto> claseproductosSeleccionados=new ArrayList<ClaseProducto>();		
		
		claseproductosSeleccionados=this.getClaseProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"claseproducto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ClaseProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelClaseProducto(row);				
				iRow++;
			}				
			
			for(ClaseProducto claseproductoAux:claseproductosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelClaseProducto(claseproductoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.claseproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Clase Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlClaseProductosSeleccionados() throws Exception {
		ArrayList<ClaseProducto> claseproductosSeleccionados=new ArrayList<ClaseProducto>();		
		
		claseproductosSeleccionados=this.getClaseProductosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"claseproducto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("claseproductos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("claseproducto");
			//elementRoot.appendChild(element);
		
			for(ClaseProducto claseproductoAux:claseproductosSeleccionados) {
				element = document.createElement("claseproducto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlClaseProducto(claseproductoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.claseproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Clase Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelClaseProducto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ClaseProductoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ClaseProductoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ClaseProductoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ClaseProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ClaseProductoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ClaseProductoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelClaseProducto(ClaseProducto claseproducto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(claseproducto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(claseproducto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(claseproducto.gettipoproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(claseproducto.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(claseproducto.getnombre());				
	}
	
	public void setFilaDatosExportarXmlClaseProducto(ClaseProducto claseproducto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ClaseProductoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(claseproducto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ClaseProductoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(claseproducto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ClaseProductoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(claseproducto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtipoproducto_descripcion = document.createElement(ClaseProductoConstantesFunciones.IDTIPOPRODUCTO);
		elementtipoproducto_descripcion.appendChild(document.createTextNode(claseproducto.gettipoproducto_descripcion()));
		element.appendChild(elementtipoproducto_descripcion);

		Element elementcodigo = document.createElement(ClaseProductoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(claseproducto.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ClaseProductoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(claseproducto.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoClaseProductosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ClaseProducto> claseproductosSeleccionados=new ArrayList<ClaseProducto>();
		
		claseproductosSeleccionados=this.getClaseProductosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoClaseProducto(claseproductosSeleccionados);
		
		this.generarReporteClaseProductos("Todos",claseproductosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoClaseProducto(ArrayList<ClaseProducto> claseproductosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ClaseProducto claseproductoAux:claseproductosSeleccionados) {
				claseproductoAux.setsDetalleGeneralEntityReporte(claseproductoAux.toString());
			
				if(sTipoSeleccionar.equals(ClaseProductoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					claseproductoAux.setsDescripcionGeneralEntityReporte1(claseproductoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ClaseProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO)) {
					existe=true;
					claseproductoAux.setsDescripcionGeneralEntityReporte1(claseproductoAux.gettipoproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ClaseProductoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					claseproductoAux.setsDescripcionGeneralEntityReporte1(claseproductoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ClaseProductoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					claseproductoAux.setsDescripcionGeneralEntityReporte1(claseproductoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesClaseProducto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoClaseProducto=true;
				this.isVisibilidadCeldaNuevoRelacionesClaseProducto=true;
				this.isVisibilidadCeldaGuardarCambiosClaseProducto=true;
			}
			
			this.isVisibilidadCeldaModificarClaseProducto=false;
			this.isVisibilidadCeldaActualizarClaseProducto=false;
			this.isVisibilidadCeldaEliminarClaseProducto=false;
			this.isVisibilidadCeldaCancelarClaseProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClaseProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarClaseProducto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoClaseProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesClaseProducto=false;
			this.isVisibilidadCeldaGuardarCambiosClaseProducto=false;
			this.isVisibilidadCeldaModificarClaseProducto=false;
			this.isVisibilidadCeldaActualizarClaseProducto=true;
			this.isVisibilidadCeldaEliminarClaseProducto=false;
			this.isVisibilidadCeldaCancelarClaseProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClaseProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarClaseProducto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoClaseProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesClaseProducto=false;
			this.isVisibilidadCeldaGuardarCambiosClaseProducto=false;
			this.isVisibilidadCeldaModificarClaseProducto=false;
			this.isVisibilidadCeldaActualizarClaseProducto=true;
			this.isVisibilidadCeldaEliminarClaseProducto=true;
			this.isVisibilidadCeldaCancelarClaseProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClaseProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarClaseProducto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoClaseProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesClaseProducto=false;
			this.isVisibilidadCeldaGuardarCambiosClaseProducto=false;
			this.isVisibilidadCeldaModificarClaseProducto=false;
			this.isVisibilidadCeldaActualizarClaseProducto=true;
			this.isVisibilidadCeldaEliminarClaseProducto=false;
			this.isVisibilidadCeldaCancelarClaseProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClaseProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarClaseProducto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoClaseProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesClaseProducto=true;
			this.isVisibilidadCeldaGuardarCambiosClaseProducto=true;
			this.isVisibilidadCeldaModificarClaseProducto=false;
			this.isVisibilidadCeldaActualizarClaseProducto=false;
			this.isVisibilidadCeldaEliminarClaseProducto=false;
			this.isVisibilidadCeldaCancelarClaseProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClaseProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarClaseProducto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoClaseProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesClaseProducto=false;
			this.isVisibilidadCeldaGuardarCambiosClaseProducto=false;
			this.isVisibilidadCeldaActualizarClaseProducto=false;
			this.isVisibilidadCeldaEliminarClaseProducto=false;
			this.isVisibilidadCeldaCancelarClaseProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClaseProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarClaseProducto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoClaseProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesClaseProducto=false;
			this.isVisibilidadCeldaGuardarCambiosClaseProducto=false;
			this.isVisibilidadCeldaModificarClaseProducto=true;
			this.isVisibilidadCeldaActualizarClaseProducto=false;
			this.isVisibilidadCeldaEliminarClaseProducto=false;
			this.isVisibilidadCeldaCancelarClaseProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClaseProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarClaseProducto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ClaseProductoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoClaseProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesClaseProducto=true;
			this.isVisibilidadCeldaGuardarCambiosClaseProducto=true;
		} else {
			this.actualizarEstadoPanelsClaseProducto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarClaseProducto=false;
			//this.isVisibilidadCeldaVerFormClaseProducto=false;
			this.isVisibilidadCeldaDuplicarClaseProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!claseproductoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesClaseProducto=false;
		} else {
			this.isVisibilidadCeldaNuevoClaseProducto=false;
			this.isVisibilidadCeldaGuardarCambiosClaseProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(claseproductoSessionBean.getEsGuardarRelacionado()) {
			if(!claseproductoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesClaseProducto=false;												
			}
			
			this.jButtonCerrarClaseProducto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesClaseProducto=false;
		}
		
		if(!this.permiteMantenimiento(this.claseproducto)) {
			this.isVisibilidadCeldaActualizarClaseProducto=false;
			this.isVisibilidadCeldaEliminarClaseProducto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesClaseProducto() {
		this.isVisibilidadCeldaNuevoClaseProducto=false;
		this.isVisibilidadCeldaGuardarCambiosClaseProducto=false;
	}
	
	public void actualizarEstadoPanelsClaseProducto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionClaseProducto!=null) {
				this.jScrollPanelDatosEdicionClaseProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClaseProducto!=null) {
				this.jTabbedPaneBusquedasClaseProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosClaseProducto!=null) {
				this.jScrollPanelDatosClaseProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionClaseProducto!=null) {
				this.jPanelPaginacionClaseProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesClaseProducto!=null) {
				this.jPanelParametrosReportesClaseProducto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionClaseProducto!=null) {
				this.jScrollPanelDatosEdicionClaseProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClaseProducto!=null) {
				this.jTabbedPaneBusquedasClaseProducto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosClaseProducto!=null) {
				this.jScrollPanelDatosClaseProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionClaseProducto!=null) {
				this.jPanelPaginacionClaseProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesClaseProducto!=null) {
				this.jPanelParametrosReportesClaseProducto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionClaseProducto!=null) {
				this.jScrollPanelDatosEdicionClaseProducto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClaseProducto!=null) {
				this.jTabbedPaneBusquedasClaseProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosClaseProducto!=null) {
				this.jScrollPanelDatosClaseProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionClaseProducto!=null) {
				this.jPanelPaginacionClaseProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesClaseProducto!=null) {
				this.jPanelParametrosReportesClaseProducto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionClaseProducto!=null) {
				this.jScrollPanelDatosEdicionClaseProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClaseProducto!=null) {
				this.jTabbedPaneBusquedasClaseProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosClaseProducto!=null) {
				this.jScrollPanelDatosClaseProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionClaseProducto!=null) {
				this.jPanelPaginacionClaseProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesClaseProducto!=null) {
				this.jPanelParametrosReportesClaseProducto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionClaseProducto!=null) {
				this.jScrollPanelDatosEdicionClaseProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClaseProducto!=null) {
				this.jTabbedPaneBusquedasClaseProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosClaseProducto!=null) {
				this.jScrollPanelDatosClaseProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionClaseProducto!=null) {
				this.jPanelPaginacionClaseProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesClaseProducto!=null) {
				this.jPanelParametrosReportesClaseProducto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionClaseProducto!=null) {
				this.jScrollPanelDatosEdicionClaseProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClaseProducto!=null) {
				this.jTabbedPaneBusquedasClaseProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosClaseProducto!=null) {
				this.jScrollPanelDatosClaseProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionClaseProducto!=null) {
				this.jPanelPaginacionClaseProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesClaseProducto!=null) {
				this.jPanelParametrosReportesClaseProducto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionClaseProducto!=null) {
				this.jScrollPanelDatosEdicionClaseProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClaseProducto!=null) {
				this.jTabbedPaneBusquedasClaseProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosClaseProducto!=null) {
				this.jScrollPanelDatosClaseProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionClaseProducto!=null) {
				this.jPanelPaginacionClaseProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesClaseProducto!=null) {
				this.jPanelParametrosReportesClaseProducto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.claseproductoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasClaseProducto!=null) {
					this.jTabbedPaneBusquedasClaseProducto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesClaseProducto!=null) {
				this.jPanelParametrosReportesClaseProducto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.claseproductoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClaseProducto!=null) {
				this.jTabbedPaneBusquedasClaseProducto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesClaseProducto!=null) {
				this.jPanelParametrosReportesClaseProducto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasClaseProducto.remove(jPanelBusquedaPorCodigoClaseProducto);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasClaseProducto.remove(jPanelBusquedaPorNombreClaseProducto);}

			this.isVisibilidadFK_IdTipoProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoProducto) {this.jTabbedPaneBusquedasClaseProducto.remove(jPanelFK_IdTipoProductoClaseProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoProducto(Boolean isParaTipoProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoProductoNegation=!isParaTipoProducto;

			this.isVisibilidadBusquedaPorCodigo=isParaTipoProductoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasClaseProducto.remove(jPanelBusquedaPorCodigoClaseProducto);}

			this.isVisibilidadBusquedaPorNombre=isParaTipoProductoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasClaseProducto.remove(jPanelBusquedaPorNombreClaseProducto);}

			this.isVisibilidadFK_IdTipoProducto=isParaTipoProducto;
			if(!this.isVisibilidadFK_IdTipoProducto) {this.jTabbedPaneBusquedasClaseProducto.remove(jPanelFK_IdTipoProductoClaseProducto);}
		}
		
	}
	
	

	public String registrarSesionClaseProductoParaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(this.claseproductoSessionBean==null) {
				this.claseproductoSessionBean=new ClaseProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormClaseProducto.productoSessionBean==null) {
				this.jInternalFrameDetalleFormClaseProducto.productoSessionBean=new ProductoSessionBean();
			}

			this.jInternalFrameDetalleFormClaseProducto.productoSessionBean.setsPathNavegacionActual(claseproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormClaseProducto.productoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProducto=this.jInternalFrameDetalleFormClaseProducto.productoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormClaseProducto.productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			this.jInternalFrameDetalleFormClaseProducto.productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(ClaseProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormClaseProducto.productoSessionBean.setisBusquedaDesdeForeignKeySesionClaseProducto(true);
			this.jInternalFrameDetalleFormClaseProducto.productoSessionBean.setlidClaseProductoActual(this.idClaseProductoActual);

			claseproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyClaseProducto(true);
			claseproductoSessionBean.setlIdClaseProductoActualForeignKey(this.idClaseProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionClaseProductoParaParametroInventarioDefectos() throws Exception {
		Boolean isPaginaPopupParametroInventarioDefecto=false;

		try {

			if(this.claseproductoSessionBean==null) {
				this.claseproductoSessionBean=new ClaseProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoSessionBean==null) {
				this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoSessionBean.setsPathNavegacionActual(claseproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroInventarioDefecto=this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(true);
			this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(ClaseProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionClaseProducto(true);
			this.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoSessionBean.setlidClaseProductoActual(this.idClaseProductoActual);

			claseproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyClaseProducto(true);
			claseproductoSessionBean.setlIdClaseProductoActualForeignKey(this.idClaseProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ClaseProductoSessionBean claseproductoSessionBean=new ClaseProductoSessionBean();
		
		if(this.claseproductoSessionBean==null) {
			this.claseproductoSessionBean=new ClaseProductoSessionBean();
		}
		
		this.claseproductoSessionBean.setsUltimaBusquedaClaseProducto(this.getsAccionBusqueda());
		this.claseproductoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.claseproductoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			claseproductoSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			claseproductoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			claseproductoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoProducto")) {
			claseproductoSessionBean.setid_tipo_producto(this.getid_tipo_productoFK_IdTipoProducto());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ClaseProductoSessionBean claseproductoSessionBean=new ClaseProductoSessionBean();
		
		if(this.claseproductoSessionBean==null) {
			this.claseproductoSessionBean=new ClaseProductoSessionBean();
		}
		
		if(this.claseproductoSessionBean.getsUltimaBusquedaClaseProducto()!=null&&!this.claseproductoSessionBean.getsUltimaBusquedaClaseProducto().equals("")) {
			this.setsAccionBusqueda(claseproductoSessionBean.getsUltimaBusquedaClaseProducto());
			this.setiNumeroPaginacion(claseproductoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(claseproductoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(claseproductoSessionBean.getcodigo());
				claseproductoSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(claseproductoSessionBean.getnombre());
				claseproductoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(claseproductoSessionBean.getid_empresa());
				claseproductoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoProducto")) {
				this.setid_tipo_productoFK_IdTipoProducto(claseproductoSessionBean.getid_tipo_producto());
				claseproductoSessionBean.setid_tipo_producto(-1L);
			}
		}
		
		this.claseproductoSessionBean.setsUltimaBusquedaClaseProducto("");
		this.claseproductoSessionBean.setiNumeroPaginacion(ClaseProductoConstantesFunciones.INUMEROPAGINACION);
		this.claseproductoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaClaseProducto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioClaseProducto() {
		this.updateBorderResaltarBusquedasFormularioClaseProducto();
		this.updateVisibilidadBusquedasFormularioClaseProducto();
		this.updateHabilitarBusquedasFormularioClaseProducto();
	}
	
	public void updateBorderResaltarBusquedasFormularioClaseProducto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasClaseProducto.getComponents().length>0) {
	

		if(this.claseproductoConstantesFunciones.resaltarBusquedaPorCodigoClaseProducto!=null) {
			index= this.jTabbedPaneBusquedasClaseProducto.indexOfComponent(this.jPanelBusquedaPorCodigoClaseProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasClaseProducto.getComponent(index);
				jPanel.setBorder(this.claseproductoConstantesFunciones.resaltarBusquedaPorCodigoClaseProducto);
			}
		}

		if(this.claseproductoConstantesFunciones.resaltarBusquedaPorNombreClaseProducto!=null) {
			index= this.jTabbedPaneBusquedasClaseProducto.indexOfComponent(this.jPanelBusquedaPorNombreClaseProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasClaseProducto.getComponent(index);
				jPanel.setBorder(this.claseproductoConstantesFunciones.resaltarBusquedaPorNombreClaseProducto);
			}
		}

		if(this.claseproductoConstantesFunciones.resaltarFK_IdTipoProductoClaseProducto!=null) {
			index= this.jTabbedPaneBusquedasClaseProducto.indexOfComponent(this.jPanelFK_IdTipoProductoClaseProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasClaseProducto.getComponent(index);
				jPanel.setBorder(this.claseproductoConstantesFunciones.resaltarFK_IdTipoProductoClaseProducto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioClaseProducto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasClaseProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasClaseProducto.indexOfComponent(this.jPanelBusquedaPorCodigoClaseProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasClaseProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.claseproductoConstantesFunciones.mostrarBusquedaPorCodigoClaseProducto);
			if(!this.claseproductoConstantesFunciones.mostrarBusquedaPorCodigoClaseProducto && index>-1) {
				this.jTabbedPaneBusquedasClaseProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasClaseProducto.indexOfComponent(this.jPanelBusquedaPorNombreClaseProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasClaseProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.claseproductoConstantesFunciones.mostrarBusquedaPorNombreClaseProducto);
			if(!this.claseproductoConstantesFunciones.mostrarBusquedaPorNombreClaseProducto && index>-1) {
				this.jTabbedPaneBusquedasClaseProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasClaseProducto.indexOfComponent(this.jPanelFK_IdTipoProductoClaseProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasClaseProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.claseproductoConstantesFunciones.mostrarFK_IdTipoProductoClaseProducto);
			if(!this.claseproductoConstantesFunciones.mostrarFK_IdTipoProductoClaseProducto && index>-1) {
				this.jTabbedPaneBusquedasClaseProducto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioClaseProducto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasClaseProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasClaseProducto.indexOfComponent(this.jPanelBusquedaPorCodigoClaseProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasClaseProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.claseproductoConstantesFunciones.activarBusquedaPorCodigoClaseProducto);
				this.jTabbedPaneBusquedasClaseProducto.setEnabledAt(index,this.claseproductoConstantesFunciones.activarBusquedaPorCodigoClaseProducto);
			}

			index= this.jTabbedPaneBusquedasClaseProducto.indexOfComponent(this.jPanelBusquedaPorNombreClaseProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasClaseProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.claseproductoConstantesFunciones.activarBusquedaPorNombreClaseProducto);
				this.jTabbedPaneBusquedasClaseProducto.setEnabledAt(index,this.claseproductoConstantesFunciones.activarBusquedaPorNombreClaseProducto);
			}

			index= this.jTabbedPaneBusquedasClaseProducto.indexOfComponent(this.jPanelFK_IdTipoProductoClaseProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasClaseProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.claseproductoConstantesFunciones.activarFK_IdTipoProductoClaseProducto);
				this.jTabbedPaneBusquedasClaseProducto.setEnabledAt(index,this.claseproductoConstantesFunciones.activarFK_IdTipoProductoClaseProducto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaClaseProducto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasClaseProducto.indexOfComponent(this.jPanelBusquedaPorCodigoClaseProducto);

			this.jTabbedPaneBusquedasClaseProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasClaseProducto.getComponent(index);

			this.claseproductoConstantesFunciones.setResaltarBusquedaPorCodigoClaseProducto(resaltar);

			jPanel.setBorder(this.claseproductoConstantesFunciones.resaltarBusquedaPorCodigoClaseProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasClaseProducto.indexOfComponent(this.jPanelBusquedaPorNombreClaseProducto);

			this.jTabbedPaneBusquedasClaseProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasClaseProducto.getComponent(index);

			this.claseproductoConstantesFunciones.setResaltarBusquedaPorNombreClaseProducto(resaltar);

			jPanel.setBorder(this.claseproductoConstantesFunciones.resaltarBusquedaPorNombreClaseProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoProducto")) {
			index= this.jTabbedPaneBusquedasClaseProducto.indexOfComponent(this.jPanelFK_IdTipoProductoClaseProducto);

			this.jTabbedPaneBusquedasClaseProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasClaseProducto.getComponent(index);

			this.claseproductoConstantesFunciones.setResaltarFK_IdTipoProductoClaseProducto(resaltar);

			jPanel.setBorder(this.claseproductoConstantesFunciones.resaltarFK_IdTipoProductoClaseProducto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarClaseProducto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioClaseProducto() throws Exception {

		if(this.jInternalFrameDetalleFormClaseProducto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioClaseProducto();
		this.updateVisibilidadResaltarControlesFormularioClaseProducto();
		this.updateHabilitarResaltarControlesFormularioClaseProducto();
		
	}
	
	public void updateBorderResaltarControlesFormularioClaseProducto() throws Exception {
		if(this.jInternalFrameDetalleFormClaseProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.claseproductoConstantesFunciones.resaltaridClaseProducto!=null && this.jInternalFrameDetalleFormClaseProducto!=null) {this.jInternalFrameDetalleFormClaseProducto.jLabelidClaseProducto.setBorder(this.claseproductoConstantesFunciones.resaltaridClaseProducto);}
		if(this.claseproductoConstantesFunciones.resaltarid_empresaClaseProducto!=null && this.jInternalFrameDetalleFormClaseProducto!=null) {this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_empresaClaseProducto.setBorder(this.claseproductoConstantesFunciones.resaltarid_empresaClaseProducto);}
		if(this.claseproductoConstantesFunciones.resaltarid_tipo_productoClaseProducto!=null && this.jInternalFrameDetalleFormClaseProducto!=null) {this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_tipo_productoClaseProducto.setBorder(this.claseproductoConstantesFunciones.resaltarid_tipo_productoClaseProducto);}
		if(this.claseproductoConstantesFunciones.resaltarcodigoClaseProducto!=null && this.jInternalFrameDetalleFormClaseProducto!=null) {this.jInternalFrameDetalleFormClaseProducto.jTextFieldcodigoClaseProducto.setBorder(this.claseproductoConstantesFunciones.resaltarcodigoClaseProducto);}
		if(this.claseproductoConstantesFunciones.resaltarnombreClaseProducto!=null && this.jInternalFrameDetalleFormClaseProducto!=null) {this.jInternalFrameDetalleFormClaseProducto.jTextAreanombreClaseProducto.setBorder(this.claseproductoConstantesFunciones.resaltarnombreClaseProducto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioClaseProducto() throws Exception {		
		if(this.jInternalFrameDetalleFormClaseProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormClaseProducto!=null) {
	
		//this.jInternalFrameDetalleFormClaseProducto.jLabelidClaseProducto.setVisible(this.claseproductoConstantesFunciones.mostraridClaseProducto);
		this.jInternalFrameDetalleFormClaseProducto.jPanelidClaseProducto.setVisible(this.claseproductoConstantesFunciones.mostraridClaseProducto);
		//this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_empresaClaseProducto.setVisible(this.claseproductoConstantesFunciones.mostrarid_empresaClaseProducto);
		this.jInternalFrameDetalleFormClaseProducto.jPanelid_empresaClaseProducto.setVisible(this.claseproductoConstantesFunciones.mostrarid_empresaClaseProducto);
		//this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_tipo_productoClaseProducto.setVisible(this.claseproductoConstantesFunciones.mostrarid_tipo_productoClaseProducto);
		this.jInternalFrameDetalleFormClaseProducto.jPanelid_tipo_productoClaseProducto.setVisible(this.claseproductoConstantesFunciones.mostrarid_tipo_productoClaseProducto);
		//this.jInternalFrameDetalleFormClaseProducto.jTextFieldcodigoClaseProducto.setVisible(this.claseproductoConstantesFunciones.mostrarcodigoClaseProducto);
		this.jInternalFrameDetalleFormClaseProducto.jPanelcodigoClaseProducto.setVisible(this.claseproductoConstantesFunciones.mostrarcodigoClaseProducto);
		//this.jInternalFrameDetalleFormClaseProducto.jTextAreanombreClaseProducto.setVisible(this.claseproductoConstantesFunciones.mostrarnombreClaseProducto);
		this.jInternalFrameDetalleFormClaseProducto.jPanelnombreClaseProducto.setVisible(this.claseproductoConstantesFunciones.mostrarnombreClaseProducto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioClaseProducto() throws Exception {
		if(this.jInternalFrameDetalleFormClaseProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormClaseProducto!=null) {
	
		this.jInternalFrameDetalleFormClaseProducto.jLabelidClaseProducto.setEnabled(this.claseproductoConstantesFunciones.activaridClaseProducto);
		this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_empresaClaseProducto.setEnabled(this.claseproductoConstantesFunciones.activarid_empresaClaseProducto);
		this.jInternalFrameDetalleFormClaseProducto.jComboBoxid_tipo_productoClaseProducto.setEnabled(this.claseproductoConstantesFunciones.activarid_tipo_productoClaseProducto);
		this.jInternalFrameDetalleFormClaseProducto.jTextFieldcodigoClaseProducto.setEnabled(this.claseproductoConstantesFunciones.activarcodigoClaseProducto);
		this.jInternalFrameDetalleFormClaseProducto.jTextAreanombreClaseProducto.setEnabled(this.claseproductoConstantesFunciones.activarnombreClaseProducto);
		}
	}
	
		
}