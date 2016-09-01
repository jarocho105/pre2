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

import com.bydan.erp.inventario.util.MarcaProductoConstantesFunciones;
import com.bydan.erp.inventario.util.MarcaProductoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.MarcaProductoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.MarcaProductoBean;
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
public class MarcaProductoBeanSwingJInternalFrame extends MarcaProductoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(MarcaProductoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<MarcaProducto> marcaproductoValidator = new ClassValidator<MarcaProducto>(MarcaProducto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public MarcaProducto marcaproducto;	
	public MarcaProducto marcaproductoAux;
	public MarcaProducto marcaproductoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public MarcaProducto marcaproductoTotales;
	public Long idMarcaProductoActual;
	public Long iIdNuevoMarcaProducto=0L;
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
	
	public Boolean isPermisoTodoMarcaProducto;
	public Boolean isPermisoNuevoMarcaProducto;
	public Boolean isPermisoActualizarMarcaProducto;
	public Boolean isPermisoActualizarOriginalMarcaProducto;
	public Boolean isPermisoEliminarMarcaProducto;
	public Boolean isPermisoGuardarCambiosMarcaProducto;
	public Boolean isPermisoConsultaMarcaProducto;
	public Boolean isPermisoBusquedaMarcaProducto;
	public Boolean isPermisoReporteMarcaProducto;
	public Boolean isPermisoPaginacionMedioMarcaProducto;
	public Boolean isPermisoPaginacionAltoMarcaProducto;
	public Boolean isPermisoPaginacionTodoMarcaProducto;
	public Boolean isPermisoCopiarMarcaProducto;
	public Boolean isPermisoVerFormMarcaProducto;
	public Boolean isPermisoDuplicarMarcaProducto;
	public Boolean isPermisoOrdenMarcaProducto;
	
	
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
	
	public MarcaProductoParameterReturnGeneral marcaproductoReturnGeneral;
	public MarcaProductoParameterReturnGeneral marcaproductoParameterGeneral;
	
	

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
	
	public Boolean isEsNuevoMarcaProducto=false;
	public Boolean esParaAccionDesdeFormularioMarcaProducto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected MarcaProductoSessionBeanAdditional marcaproductoSessionBeanAdditional=null;
	
	public MarcaProductoSessionBeanAdditional getMarcaProductoSessionBeanAdditional() {
		return this.marcaproductoSessionBeanAdditional;
	}
	
	public void setMarcaProductoSessionBeanAdditional(MarcaProductoSessionBeanAdditional marcaproductoSessionBeanAdditional) {
		try {
			this.marcaproductoSessionBeanAdditional=marcaproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected MarcaProductoBeanSwingJInternalFrameAdditional marcaproductoBeanSwingJInternalFrameAdditional=null;
	//public class MarcaProductoBeanSwingJInternalFrame
	
	public MarcaProductoBeanSwingJInternalFrameAdditional getMarcaProductoBeanSwingJInternalFrameAdditional() {
		return this.marcaproductoBeanSwingJInternalFrameAdditional;
	}
	
	public void setMarcaProductoBeanSwingJInternalFrameAdditional(MarcaProductoBeanSwingJInternalFrameAdditional marcaproductoBeanSwingJInternalFrameAdditional) {
		try {
			this.marcaproductoBeanSwingJInternalFrameAdditional=marcaproductoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public MarcaProductoLogic marcaproductoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public MarcaProducto marcaproductoBean;
	public MarcaProductoConstantesFunciones marcaproductoConstantesFunciones;
	//public MarcaProductoParameterReturnGeneral marcaproductoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoProductoLogic tipoproductoLogic;
	
	//PARAMETROS
	
	
	//public List<MarcaProducto> marcaproductos;	
	//public List<MarcaProducto> marcaproductosEliminados;
	//public List<MarcaProducto> marcaproductosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoMarcaProducto=false;
	public Boolean isVisibilidadCeldaDuplicarMarcaProducto=true;
	public Boolean isVisibilidadCeldaCopiarMarcaProducto=true;
	public Boolean isVisibilidadCeldaVerFormMarcaProducto=true;
	public Boolean isVisibilidadCeldaOrdenMarcaProducto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesMarcaProducto=false;
	public Boolean isVisibilidadCeldaModificarMarcaProducto=false;
	public Boolean isVisibilidadCeldaActualizarMarcaProducto=false;
	public Boolean isVisibilidadCeldaEliminarMarcaProducto=false;
	public Boolean isVisibilidadCeldaCancelarMarcaProducto=false;
	public Boolean isVisibilidadCeldaGuardarMarcaProducto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosMarcaProducto=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoProducto=false;
	
	public Long getiIdNuevoMarcaProducto() {
		return this.iIdNuevoMarcaProducto;
	}

	public void setiIdNuevoMarcaProducto(Long iIdNuevoMarcaProducto) {
		this.iIdNuevoMarcaProducto = iIdNuevoMarcaProducto;
	}
	
	public Long getidMarcaProductoActual() {
		return this.idMarcaProductoActual;
	}

	public void setidMarcaProductoActual(Long idMarcaProductoActual) {
		this.idMarcaProductoActual = idMarcaProductoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public MarcaProducto getmarcaproducto() {
		return this.marcaproducto;
	}

	public void setmarcaproducto(MarcaProducto marcaproducto) {
		this.marcaproducto = marcaproducto;
	}
	
	public MarcaProducto getmarcaproductoAux() {
		return this.marcaproductoAux;
	}

	public void setmarcaproductoAux(MarcaProducto marcaproductoAux) {
		this.marcaproductoAux = marcaproductoAux;
	}				
	
	public MarcaProducto getmarcaproductoAnterior() {
		return this.marcaproductoAnterior;
	}

	public void setmarcaproductoAnterior(MarcaProducto marcaproductoAnterior) {
		this.marcaproductoAnterior = marcaproductoAnterior;
	}	
	
	public MarcaProducto getmarcaproductoTotales() {
		return this.marcaproductoTotales;
	}

	public void setmarcaproductoTotales(MarcaProducto marcaproductoTotales) {
		this.marcaproductoTotales = marcaproductoTotales;
	}	
	
	public MarcaProducto getmarcaproductoBean() {
		return this.marcaproductoBean;
	}

	public void setmarcaproductoBean(MarcaProducto marcaproductoBean) {
		this.marcaproductoBean = marcaproductoBean;
	}	
	
	public MarcaProductoParameterReturnGeneral getmarcaproductoReturnGeneral() {
		return this.marcaproductoReturnGeneral;
	}

	public void setmarcaproductoReturnGeneral(MarcaProductoParameterReturnGeneral marcaproductoReturnGeneral) {
		this.marcaproductoReturnGeneral = marcaproductoReturnGeneral;
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
	
	
	public MarcaProductoLogic getMarcaProductoLogic()	{		
		return marcaproductoLogic;
	}

	public void setMarcaProductoLogic(MarcaProductoLogic marcaproductoLogic) {
		this.marcaproductoLogic = marcaproductoLogic;
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
	
	public Boolean getIsEsNuevoMarcaProducto() {
		return isEsNuevoMarcaProducto;
	}

	public void setIsEsNuevoMarcaProducto(Boolean isEsNuevoMarcaProducto) {
		this.isEsNuevoMarcaProducto = isEsNuevoMarcaProducto;
	}

	public Boolean getEsParaAccionDesdeFormularioMarcaProducto() {
		return esParaAccionDesdeFormularioMarcaProducto;
	}
	
	public void setEsParaAccionDesdeFormularioMarcaProducto(Boolean esParaAccionDesdeFormularioMarcaProducto) {
		this.esParaAccionDesdeFormularioMarcaProducto = esParaAccionDesdeFormularioMarcaProducto;
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

			if(this.marcaproductoSessionBean==null) {
				this.marcaproductoSessionBean=new MarcaProductoSessionBean();
			}

			if(!this.marcaproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(marcaproductoSessionBean.getlidEmpresaActual());
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

			if(this.marcaproductoSessionBean==null) {
				this.marcaproductoSessionBean=new MarcaProductoSessionBean();
			}

			if(!this.marcaproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProducto()) {
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
					tipoproductoLogic.getEntityWithConnection(marcaproductoSessionBean.getlidTipoProductoActual());
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

					if(this.marcaproducto!=null) {
						this.marcaproducto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
						this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_empresaMarcaProducto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaMarcaProducto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
						if(this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_empresaMarcaProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_empresaMarcaProducto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaMarcaProductoGenerico)throws Exception
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
				jComboBoxid_empresaMarcaProductoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaMarcaProductoGenerico!=null && jComboBoxid_empresaMarcaProductoGenerico.getItemCount()>0) {
					jComboBoxid_empresaMarcaProductoGenerico.setSelectedIndex(0);
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

					if(this.marcaproducto!=null) {
						this.marcaproducto.setTipoProducto(tipoproductoTemp);
					}

					if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
						this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_tipo_productoMarcaProducto.setSelectedItem(tipoproductoTemp);
					}
				} else {
					//jComboBoxid_tipo_productoMarcaProducto.setSelectedItem(tipoproductoTemp);
					if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
						if(this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_tipo_productoMarcaProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_tipo_productoMarcaProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoproductoTemp!=null && jComboBoxid_tipo_productoFK_IdTipoProductoMarcaProducto!=null) {
						jComboBoxid_tipo_productoFK_IdTipoProductoMarcaProducto.setSelectedItem(tipoproductoTemp);
					} else {
						if(jComboBoxid_tipo_productoFK_IdTipoProductoMarcaProducto!=null) {
							//jComboBoxid_tipo_productoFK_IdTipoProductoMarcaProducto.setSelectedItem(tipoproductoTemp);
							if(jComboBoxid_tipo_productoFK_IdTipoProductoMarcaProducto.getItemCount()>0) {
								jComboBoxid_tipo_productoFK_IdTipoProductoMarcaProducto.setSelectedIndex(0);
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
	public void setActualTipoProductoForeignKeyGenerico(Long idTipoProductoSeleccionado,JComboBox jComboBoxid_tipo_productoMarcaProductoGenerico)throws Exception
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
				jComboBoxid_tipo_productoMarcaProductoGenerico.setSelectedItem(tipoproductoTemp);
			} else {
				if(jComboBoxid_tipo_productoMarcaProductoGenerico!=null && jComboBoxid_tipo_productoMarcaProductoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_productoMarcaProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(MarcaProducto marcaproducto,JComboBox jComboBoxid_empresaMarcaProductoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaMarcaProductoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_empresaMarcaProducto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaMarcaProductoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				marcaproducto.setid_empresa(empresaAux.getId());
				marcaproducto.setempresa_descripcion(MarcaProductoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				marcaproducto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoProductoForeignKey(MarcaProducto marcaproducto,JComboBox jComboBoxid_tipo_productoMarcaProductoGenerico)throws Exception
	{
		try
		{
			TipoProducto  tipoproductoAux=new TipoProducto();

			if(jComboBoxid_tipo_productoMarcaProductoGenerico==null) {
				tipoproductoAux=(TipoProducto)this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_tipo_productoMarcaProducto.getSelectedItem();
			} else {
				tipoproductoAux=(TipoProducto)jComboBoxid_tipo_productoMarcaProductoGenerico.getSelectedItem();
			}

			if(tipoproductoAux!=null && tipoproductoAux.getId()!=null) {
				marcaproducto.setid_tipo_producto(tipoproductoAux.getId());
				marcaproducto.settipoproducto_descripcion(MarcaProductoConstantesFunciones.getTipoProductoDescripcion(tipoproductoAux));
				marcaproducto.setTipoProducto(tipoproductoAux);			}
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

					if(!MarcaProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMarcaProducto!=null) { 
							this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_empresaMarcaProducto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_empresaMarcaProducto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMarcaProducto!=null) { 
					}

					if(!MarcaProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!MarcaProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMarcaProducto!=null) { 
							this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_tipo_productoMarcaProducto.removeAllItems();

							for(TipoProducto tipoproducto:this.tipoproductosForeignKey) {
								this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_tipo_productoMarcaProducto.addItem(tipoproducto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMarcaProducto!=null) { 
					}

					if(!MarcaProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!MarcaProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_productoFK_IdTipoProductoMarcaProducto.removeAllItems();

							for(TipoProducto tipoproducto:this.tipoproductosForeignKey) {
								this.jComboBoxid_tipo_productoFK_IdTipoProductoMarcaProducto.addItem(tipoproducto);
							}
						}

						if(!MarcaProductoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
							this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_empresaMarcaProducto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
							this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_empresaMarcaProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
							this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_tipo_productoMarcaProducto.setSelectedItem(tipoproducto);
						}
					} else {
						if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
							this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_tipo_productoMarcaProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_productoFK_IdTipoProductoMarcaProducto.setSelectedItem(tipoproducto);
						} else {
							this.jComboBoxid_tipo_productoFK_IdTipoProductoMarcaProducto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesMarcaProducto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			MarcaProductoConstantesFunciones.refrescarForeignKeysDescripcionesMarcaProducto(this.marcaproductoLogic.getMarcaProductos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			MarcaProductoConstantesFunciones.refrescarForeignKeysDescripcionesMarcaProducto(this.marcaproductos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(TipoProducto.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//marcaproductoLogic.setMarcaProductos(this.marcaproductos);
			marcaproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public MarcaProductoParameterReturnGeneral getMarcaProductoParameterGeneral() {
		return this.marcaproductoParameterGeneral;
	}
	
	public void setMarcaProductoParameterGeneral(MarcaProductoParameterReturnGeneral marcaproductoParameterGeneral) {
		this.marcaproductoParameterGeneral = marcaproductoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoMarcaProducto() {
		return isPermisoTodoMarcaProducto;
	}

	public void setIsPermisoTodoMarcaProducto(Boolean isPermisoTodoMarcaProducto) {
		this.isPermisoTodoMarcaProducto = isPermisoTodoMarcaProducto;
	}

	public Boolean getIsPermisoNuevoMarcaProducto() {
		return isPermisoNuevoMarcaProducto;
	}

	public void setIsPermisoNuevoMarcaProducto(Boolean isPermisoNuevoMarcaProducto) {
		this.isPermisoNuevoMarcaProducto = isPermisoNuevoMarcaProducto;
	}

	public Boolean getIsPermisoActualizarMarcaProducto() {
		return isPermisoActualizarMarcaProducto;
	}

	public void setIsPermisoActualizarMarcaProducto(Boolean isPermisoActualizarMarcaProducto) {
		this.isPermisoActualizarMarcaProducto = isPermisoActualizarMarcaProducto;
	}

	public Boolean getIsPermisoEliminarMarcaProducto() {
		return isPermisoEliminarMarcaProducto;
	}

	public void setIsPermisoEliminarMarcaProducto(Boolean isPermisoEliminarMarcaProducto) {
		this.isPermisoEliminarMarcaProducto = isPermisoEliminarMarcaProducto;
	}

	public Boolean getIsPermisoGuardarCambiosMarcaProducto() {
		return isPermisoGuardarCambiosMarcaProducto;
	}

	public void setIsPermisoGuardarCambiosMarcaProducto(Boolean isPermisoGuardarCambiosMarcaProducto) {
		this.isPermisoGuardarCambiosMarcaProducto = isPermisoGuardarCambiosMarcaProducto;
	}
	
	public Boolean getIsPermisoConsultaMarcaProducto() {
		return isPermisoConsultaMarcaProducto;
	}

	public void setIsPermisoConsultaMarcaProducto(Boolean isPermisoConsultaMarcaProducto) {
		this.isPermisoConsultaMarcaProducto = isPermisoConsultaMarcaProducto;
	}

	public Boolean getIsPermisoBusquedaMarcaProducto() {
		return isPermisoBusquedaMarcaProducto;
	}

	public void setIsPermisoBusquedaMarcaProducto(Boolean isPermisoBusquedaMarcaProducto) {
		this.isPermisoBusquedaMarcaProducto = isPermisoBusquedaMarcaProducto;
	}

	public Boolean getIsPermisoReporteMarcaProducto() {
		return isPermisoReporteMarcaProducto;
	}

	public void setIsPermisoReporteMarcaProducto(Boolean isPermisoReporteMarcaProducto) {
		this.isPermisoReporteMarcaProducto = isPermisoReporteMarcaProducto;
	}
	
	public Boolean getIsPermisoPaginacionMedioMarcaProducto() {
		return isPermisoPaginacionMedioMarcaProducto;
	}

	public void setIsPermisoPaginacionMedioMarcaProducto(Boolean isPermisoPaginacionMedioMarcaProducto) {
		this.isPermisoPaginacionMedioMarcaProducto = isPermisoPaginacionMedioMarcaProducto;
	}
	
	public Boolean getIsPermisoPaginacionTodoMarcaProducto() {
		return isPermisoPaginacionTodoMarcaProducto;
	}

	public void setIsPermisoPaginacionTodoMarcaProducto(Boolean isPermisoPaginacionTodoMarcaProducto) {
		this.isPermisoPaginacionTodoMarcaProducto = isPermisoPaginacionTodoMarcaProducto;
	}
	
	public Boolean getIsPermisoPaginacionAltoMarcaProducto() {
		return isPermisoPaginacionAltoMarcaProducto;
	}

	public void setIsPermisoPaginacionAltoMarcaProducto(Boolean isPermisoPaginacionAltoMarcaProducto) {
		this.isPermisoPaginacionAltoMarcaProducto = isPermisoPaginacionAltoMarcaProducto;
	}
	
	public Boolean getIsPermisoCopiarMarcaProducto() {
		return isPermisoCopiarMarcaProducto;
	}

	public void setIsPermisoCopiarMarcaProducto(Boolean isPermisoCopiarMarcaProducto) {
		this.isPermisoCopiarMarcaProducto = isPermisoCopiarMarcaProducto;
	}
	
	public Boolean getIsPermisoVerFormMarcaProducto() {
		return isPermisoVerFormMarcaProducto;
	}

	public void setIsPermisoVerFormMarcaProducto(Boolean isPermisoVerFormMarcaProducto) {
		this.isPermisoVerFormMarcaProducto = isPermisoVerFormMarcaProducto;
	}
	
	public Boolean getIsPermisoDuplicarMarcaProducto() {
		return isPermisoDuplicarMarcaProducto;
	}

	public void setIsPermisoDuplicarMarcaProducto(Boolean isPermisoDuplicarMarcaProducto) {
		this.isPermisoDuplicarMarcaProducto = isPermisoDuplicarMarcaProducto;
	}
	
	public Boolean getIsPermisoOrdenMarcaProducto() {
		return isPermisoOrdenMarcaProducto;
	}

	public void setIsPermisoOrdenMarcaProducto(Boolean isPermisoOrdenMarcaProducto) {
		this.isPermisoOrdenMarcaProducto = isPermisoOrdenMarcaProducto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoMarcaProducto() {
		return isVisibilidadCeldaNuevoMarcaProducto;
	}

	public void setIsVisibilidadCeldaNuevoMarcaProducto(Boolean isVisibilidadCeldaNuevoMarcaProducto) {
		this.isVisibilidadCeldaNuevoMarcaProducto = isVisibilidadCeldaNuevoMarcaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarMarcaProducto() {
		return isVisibilidadCeldaDuplicarMarcaProducto;
	}

	public void setIsVisibilidadCeldaDuplicarMarcaProducto(Boolean isVisibilidadCeldaDuplicarMarcaProducto) {
		this.isVisibilidadCeldaDuplicarMarcaProducto = isVisibilidadCeldaDuplicarMarcaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarMarcaProducto() {
		return isVisibilidadCeldaCopiarMarcaProducto;
	}

	public void setIsVisibilidadCeldaCopiarMarcaProducto(Boolean isVisibilidadCeldaCopiarMarcaProducto) {
		this.isVisibilidadCeldaCopiarMarcaProducto = isVisibilidadCeldaCopiarMarcaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormMarcaProducto() {
		return isVisibilidadCeldaVerFormMarcaProducto;
	}

	public void setIsVisibilidadCeldaVerFormMarcaProducto(Boolean isVisibilidadCeldaVerFormMarcaProducto) {
		this.isVisibilidadCeldaVerFormMarcaProducto = isVisibilidadCeldaVerFormMarcaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenMarcaProducto() {
		return isVisibilidadCeldaOrdenMarcaProducto;
	}

	public void setIsVisibilidadCeldaOrdenMarcaProducto(Boolean isVisibilidadCeldaOrdenMarcaProducto) {
		this.isVisibilidadCeldaOrdenMarcaProducto = isVisibilidadCeldaOrdenMarcaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesMarcaProducto() {
		return isVisibilidadCeldaNuevoRelacionesMarcaProducto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesMarcaProducto(Boolean isVisibilidadCeldaNuevoRelacionesMarcaProducto) {
		this.isVisibilidadCeldaNuevoRelacionesMarcaProducto = isVisibilidadCeldaNuevoRelacionesMarcaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarMarcaProducto() {
		return isVisibilidadCeldaModificarMarcaProducto;
	}

	public void setIsVisibilidadCeldaModificarMarcaProducto(Boolean isVisibilidadCeldaModificarMarcaProducto) {
		this.isVisibilidadCeldaModificarMarcaProducto = isVisibilidadCeldaModificarMarcaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarMarcaProducto() {
		return isVisibilidadCeldaActualizarMarcaProducto;
	}

	public void setIsVisibilidadCeldaActualizarMarcaProducto(Boolean isVisibilidadCeldaActualizarMarcaProducto) {
		this.isVisibilidadCeldaActualizarMarcaProducto = isVisibilidadCeldaActualizarMarcaProducto;
	}

	public Boolean getIsVisibilidadCeldaEliminarMarcaProducto() {
		return isVisibilidadCeldaEliminarMarcaProducto;
	}

	public void setIsVisibilidadCeldaEliminarMarcaProducto(Boolean isVisibilidadCeldaEliminarMarcaProducto) {
		this.isVisibilidadCeldaEliminarMarcaProducto = isVisibilidadCeldaEliminarMarcaProducto;
	}

	public Boolean getIsVisibilidadCeldaCancelarMarcaProducto() {
		return isVisibilidadCeldaCancelarMarcaProducto;
	}

	public void setIsVisibilidadCeldaCancelarMarcaProducto(Boolean isVisibilidadCeldaCancelarMarcaProducto) {
		this.isVisibilidadCeldaCancelarMarcaProducto = isVisibilidadCeldaCancelarMarcaProducto;
	}

	public Boolean getIsVisibilidadCeldaGuardarMarcaProducto() {
		return isVisibilidadCeldaGuardarMarcaProducto;
	}

	public void setIsVisibilidadCeldaGuardarMarcaProducto(Boolean isVisibilidadCeldaGuardarMarcaProducto) {
		this.isVisibilidadCeldaGuardarMarcaProducto = isVisibilidadCeldaGuardarMarcaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosMarcaProducto() {
		return isVisibilidadCeldaGuardarCambiosMarcaProducto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosMarcaProducto(Boolean isVisibilidadCeldaGuardarCambiosMarcaProducto) {
		this.isVisibilidadCeldaGuardarCambiosMarcaProducto = isVisibilidadCeldaGuardarCambiosMarcaProducto;
	}
		
	public MarcaProductoSessionBean getmarcaproductoSessionBean() {
		return this.marcaproductoSessionBean;
	}
	
	public void setmarcaproductoSessionBean(MarcaProductoSessionBean marcaproductoSessionBean) {
		this.marcaproductoSessionBean=marcaproductoSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysMarcaProducto(MarcaProducto marcaproducto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(marcaproducto,null);
				this.setActualParaGuardarTipoProductoForeignKey(marcaproducto,null);
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
	
	public void bugActualizarReferenciaActual(MarcaProducto marcaproducto,MarcaProducto marcaproductoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalMarcaProducto(marcaproducto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		marcaproductoAux.setId(marcaproducto.getId());
		marcaproductoAux.setVersionRow(marcaproducto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessMarcaProducto();
		
			int intSelectedRow = this.jTableDatosMarcaProducto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproducto =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.marcaproducto =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(MarcaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualMarcaProducto(this.marcaproducto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysMarcaProducto(this.marcaproducto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = marcaproductoValidator.getInvalidValues(this.marcaproducto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			marcaproductoLogic.setDatosCliente(datosCliente);
			marcaproductoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				marcaproductoAux=new  MarcaProducto();
				
				marcaproductoAux.setIsNew(true);
				marcaproductoAux.setIsChanged(true);
				
				marcaproductoAux.setMarcaProductoOriginal(this.marcaproducto);
				
				marcaproductoAux.setId(this.marcaproducto.getId());	
				marcaproductoAux.setVersionRow(this.marcaproducto.getVersionRow());	
				marcaproductoAux.setid_empresa(this.marcaproducto.getid_empresa());	
				marcaproductoAux.setid_tipo_producto(this.marcaproducto.getid_tipo_producto());	
				marcaproductoAux.setcodigo(this.marcaproducto.getcodigo());	
				marcaproductoAux.setnombre(this.marcaproducto.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.marcaproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.marcaproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(marcaproductoAux,marcaproductoLogic.getMarcaProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(marcaproductoAux,marcaproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.marcaproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.marcaproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						marcaproductoLogic.saveMarcaProductos();//WithConnection
						//marcaproductoLogic.getSetVersionRowMarcaProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.marcaproducto,marcaproductoAux);
					
					this.refrescarForeignKeysDescripcionesMarcaProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.marcaproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								marcaproductoLogic.saveMarcaProductoRelaciones(marcaproductoAux,this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//marcaproductoLogic.getSetVersionRowMarcaProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.marcaproducto,marcaproductoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							marcaproductoAux.setProductos(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							marcaproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.marcaproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.marcaproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(marcaproductoAux,marcaproductoLogic.getMarcaProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(marcaproductoAux,marcaproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.marcaproducto,marcaproductoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				marcaproductoAux=new  MarcaProducto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.marcaproductoSessionBean.getEsGuardarRelacionado() 
					|| (this.marcaproductoSessionBean.getEsGuardarRelacionado() && this.marcaproducto.getId()>=0)) {
						
					marcaproductoAux.setIsNew(false);
				}
				
				marcaproductoAux.setIsDeleted(false);
			
				marcaproductoAux.setId(this.marcaproducto.getId());	
				marcaproductoAux.setVersionRow(this.marcaproducto.getVersionRow());	
				marcaproductoAux.setid_empresa(this.marcaproducto.getid_empresa());	
				marcaproductoAux.setid_tipo_producto(this.marcaproducto.getid_tipo_producto());	
				marcaproductoAux.setcodigo(this.marcaproducto.getcodigo());	
				marcaproductoAux.setnombre(this.marcaproducto.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(marcaproductoAux,marcaproductoLogic.getMarcaProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(marcaproductoAux,marcaproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.marcaproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.marcaproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						marcaproductoLogic.saveMarcaProductos();//WithConnection
						//marcaproductoLogic.getSetVersionRowMarcaProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.marcaproducto,marcaproductoAux);
					
					this.refrescarForeignKeysDescripcionesMarcaProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.marcaproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								marcaproductoLogic.saveMarcaProductoRelaciones(marcaproductoAux,this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//marcaproductoLogic.getSetVersionRowMarcaProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.marcaproducto,marcaproductoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							marcaproductoAux.setProductos(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							marcaproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.marcaproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.marcaproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(marcaproductoAux,marcaproductoLogic.getMarcaProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(marcaproductoAux,marcaproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.marcaproducto,marcaproductoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				marcaproductoAux=new  MarcaProducto();
				
				marcaproductoAux.setIsNew(false);
				marcaproductoAux.setIsChanged(false);
				
				marcaproductoAux.setIsDeleted(true);
				
				marcaproductoAux.setId(this.marcaproducto.getId());	
				marcaproductoAux.setVersionRow(this.marcaproducto.getVersionRow());	
				marcaproductoAux.setid_empresa(this.marcaproducto.getid_empresa());	
				marcaproductoAux.setid_tipo_producto(this.marcaproducto.getid_tipo_producto());	
				marcaproductoAux.setcodigo(this.marcaproducto.getcodigo());	
				marcaproductoAux.setnombre(this.marcaproducto.getnombre());	
				
				if(this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.marcaproductoAux.getId()>=0) {	
						this.marcaproductosEliminados.add(marcaproductoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(marcaproductoAux,marcaproductoLogic.getMarcaProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(marcaproductoAux,marcaproductos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.marcaproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.marcaproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						marcaproductoLogic.saveMarcaProductos();//WithConnection
						//marcaproductoLogic.getSetVersionRowMarcaProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.marcaproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								marcaproductoLogic.saveMarcaProductoRelaciones(marcaproductoAux,this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//marcaproductoLogic.getSetVersionRowMarcaProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							marcaproductoAux.setProductos(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							marcaproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.marcaproductoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.marcaproductoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(marcaproductoAux,marcaproductoLogic.getMarcaProductos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(marcaproductoAux,marcaproductos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.getMarcaProductos().addAll(this.marcaproductosEliminados);
					
					marcaproductoLogic.saveMarcaProductos();//WithConnection
					//marcaproductoLogic.getSetVersionRowMarcaProductos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesMarcaProducto();
				
				this.marcaproductosEliminados= new ArrayList<MarcaProducto>();		
			}
			
			if(this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.marcaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Marca Producto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Marca Producto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.marcaproducto=marcaproductoAux;
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
      		//this.finishProcessMarcaProducto();
      	}
		
	}	
	
	public void actualizarRelaciones(MarcaProducto marcaproductoLocal) throws Exception {
		
		if(this.marcaproductoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				marcaproductoLocal.setProductos(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());
				marcaproductoLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
			
			} else {
			
				marcaproductoLocal.setProductos(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productos);
				marcaproductoLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(MarcaProducto marcaproductoLocal) throws Exception {	
		if(this.marcaproductoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				marcaproductoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoProductoDetalleFormJInternalFrame.class)) {
				TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrameLocal=(TipoProductoBeanSwingJInternalFrame) ((TipoProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoproductoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoProducto(tipoproductoBeanSwingJInternalFrameLocal.gettipoproducto(),true);
				tipoproductoBeanSwingJInternalFrameLocal.actualizarLista(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto,this.tipoproductosForeignKey);

				tipoproductoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto);

				marcaproductoLocal.setTipoProducto(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto);

				this.addItemDefectoCombosForeignKeyTipoProducto();
				this.cargarCombosFrameTipoProductosForeignKey("Formulario");
				this.setActualTipoProductoForeignKey(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarMarcaProductoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosMarcaProducto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.marcaproducto =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.marcaproducto =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = marcaproductoValidator.getInvalidValues(this.marcaproducto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(MarcaProducto marcaproducto,List<MarcaProducto> marcaproductos) throws Exception {
		try	{		
			MarcaProductoConstantesFunciones.actualizarLista(marcaproducto,marcaproductos,this.marcaproductoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(MarcaProducto marcaproducto,List<MarcaProducto> marcaproductos) throws Exception {
		try	{			
			MarcaProductoConstantesFunciones.actualizarSelectedLista(marcaproducto,marcaproductos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<MarcaProducto> marcaproductosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				marcaproductosLocal=this.marcaproductoLogic.getMarcaProductos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				marcaproductosLocal=this.marcaproductos;
			}
			//ARCHITECTURE
		
			for(MarcaProducto marcaproductoLocal:marcaproductosLocal) {
				if(this.permiteMantenimiento(marcaproductoLocal) && marcaproductoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+MarcaProductoConstantesFunciones.getMarcaProductoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(MarcaProductoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMarcaProducto.jLabelid_empresaMarcaProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MarcaProductoConstantesFunciones.IDTIPOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMarcaProducto.jLabelid_tipo_productoMarcaProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MarcaProductoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMarcaProducto.jLabelcodigoMarcaProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MarcaProductoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMarcaProducto.jLabelnombreMarcaProducto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMarcaProducto.jLabelid_empresaMarcaProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMarcaProducto.jLabelid_tipo_productoMarcaProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMarcaProducto.jLabelcodigoMarcaProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMarcaProducto.jLabelnombreMarcaProducto,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Producto")) {
			if(this.marcaproducto==null) {
				this.marcaproducto= new MarcaProducto();
			}

			if(this.marcaproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoMarcaProducto
				this.setVariablesFormularioToObjetoActualMarcaProducto(this.marcaproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysMarcaProducto(this.marcaproducto);

				this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.getproducto().setMarcaProducto(this.marcaproducto);
			}

			return;
		}
		 else  if(sTipo.equals("ParametroInventarioDefecto")) {
			if(this.marcaproducto==null) {
				this.marcaproducto= new MarcaProducto();
			}

			if(this.marcaproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoMarcaProducto
				this.setVariablesFormularioToObjetoActualMarcaProducto(this.marcaproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysMarcaProducto(this.marcaproducto);

				this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.getparametroinventariodefecto().setMarcaProducto(this.marcaproducto);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoMarcaProducto--;	
		
		
		this.marcaproductoAux=new MarcaProducto();
		
		this.marcaproductoAux.setId(this.iIdNuevoMarcaProducto);
		this.marcaproductoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.marcaproductoLogic.getMarcaProductos().add(this.marcaproductoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.marcaproductos.add(this.marcaproductoAux);
		}
		//ARCHITECTURE
		
		this.marcaproducto=this.marcaproductoAux;
		
		if(MarcaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioMarcaProducto(this.marcaproducto);
			this.setVariablesObjetoActualToFormularioForeignKeyMarcaProducto(this.marcaproducto);
		}
				
		//this.setDefaultControlesMarcaProducto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyMarcaProducto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyMarcaProducto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyMarcaProducto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMarcaProducto(this.marcaproductoBean,this.marcaproducto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysMarcaProducto(this.marcaproducto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(MarcaProductoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.marcaproductoSessionBean.getConGuardarRelaciones()) {
			classes=MarcaProductoConstantesFunciones.getClassesRelationshipsOfMarcaProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.marcaproductoReturnGeneral=marcaproductoLogic.procesarEventosMarcaProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.marcaproductoLogic.getMarcaProductos(),this.marcaproducto,this.marcaproductoParameterGeneral,this.isEsNuevoMarcaProducto,classes);//this.marcaproductoLogic.getMarcaProducto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanMarcaProducto(this.marcaproductoReturnGeneral,this.marcaproductoBean,false);
		
		if(this.marcaproductoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyMarcaProducto(this.marcaproductoReturnGeneral.getMarcaProducto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioMarcaProducto(this.marcaproductoReturnGeneral.getMarcaProducto());
		}
		
		if(this.marcaproductoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioMarcaProducto(this.marcaproductoReturnGeneral.getMarcaProducto(),classes);//this.marcaproductoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualMarcaProducto(this.marcaproducto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyMarcaProducto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyMarcaProducto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MarcaProductoBeanSwingJInternalFrameAdditional.RecargarFormMarcaProducto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingMarcaProducto(false);
						
			if(marcaproductoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado() && ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(MarcaProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMarcaProducto();
			}
			
			this.actualizarVisualTableDatosMarcaProducto();
			
			this.jTableDatosMarcaProducto.setRowSelectionInterval(this.getIndiceNuevoMarcaProducto(), this.getIndiceNuevoMarcaProducto());
			
			this.seleccionarFilaTablaMarcaProductoActual();
						
			this.actualizarEstadoCeldasBotonesMarcaProducto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesMarcaProducto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormMarcaProducto.jTextFieldcodigoMarcaProducto.setEnabled(isHabilitar && this.marcaproductoConstantesFunciones.activarcodigoMarcaProducto);
		this.jInternalFrameDetalleFormMarcaProducto.jTextAreanombreMarcaProducto.setEnabled(isHabilitar && this.marcaproductoConstantesFunciones.activarnombreMarcaProducto);	
		//
		this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_empresaMarcaProducto.setEnabled(isHabilitar && this.marcaproductoConstantesFunciones.activarid_empresaMarcaProducto);
		this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_tipo_productoMarcaProducto.setEnabled(isHabilitar && this.marcaproductoConstantesFunciones.activarid_tipo_productoMarcaProducto);
	};
	
	public void setDefaultControlesMarcaProducto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoMarcaProducto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.marcaproductoSessionBean.setConGuardarRelaciones(true);			
			this.marcaproductoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormMarcaProducto.jTabbedPaneRelacionesMarcaProducto.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.marcaproductoSessionBean.setConGuardarRelaciones(false);			
			this.marcaproductoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormMarcaProducto.jTabbedPaneRelacionesMarcaProducto.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoMarcaProducto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MarcaProducto marcaproductoAux:this.marcaproductoLogic.getMarcaProductos()) {
				if(marcaproductoAux.getId().equals(this.iIdNuevoMarcaProducto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MarcaProducto marcaproductoAux:this.marcaproductos) {
				if(marcaproductoAux.getId().equals(this.iIdNuevoMarcaProducto)) {
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
	
	public int getIndiceActualMarcaProducto(MarcaProducto marcaproducto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MarcaProducto marcaproductoAux:this.marcaproductoLogic.getMarcaProductos()) {
				if(marcaproductoAux.getId().equals(marcaproducto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MarcaProducto marcaproductoAux:this.marcaproductos) {
				if(marcaproductoAux.getId().equals(marcaproducto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalMarcaProducto(MarcaProducto marcaproductoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MarcaProducto marcaproductoAux:this.marcaproductoLogic.getMarcaProductos()) {
				if(marcaproductoAux.getMarcaProductoOriginal().getId().equals(marcaproductoOriginal.getId())) {
					existe=true;
					marcaproductoOriginal.setId(marcaproductoAux.getId());
					marcaproductoOriginal.setVersionRow(marcaproductoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MarcaProducto marcaproductoAux:this.marcaproductos) {
				if(marcaproductoAux.getMarcaProductoOriginal().getId().equals(marcaproductoOriginal.getId())) {
					existe=true;
					marcaproductoOriginal.setId(marcaproductoAux.getId());
					marcaproductoOriginal.setVersionRow(marcaproductoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosMarcaProducto(Boolean esParaCancelar) throws Exception {
		marcaproductosAux=new ArrayList<MarcaProducto>();
		marcaproductoAux=new MarcaProducto();
		
		if(!this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(MarcaProducto marcaproductoAux:this.marcaproductoLogic.getMarcaProductos()) {
					if(marcaproductoAux.getId()<0) {
						marcaproductosAux.add(marcaproductoAux);
					}		
				}
				this.iIdNuevoMarcaProducto=0L;
				this.marcaproductoLogic.getMarcaProductos().removeAll(marcaproductosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MarcaProducto marcaproductoAux:this.marcaproductos) {
					if(marcaproductoAux.getId()<0) {
						marcaproductosAux.add(marcaproductoAux);
					}		
				}
				this.iIdNuevoMarcaProducto=0L;
				this.marcaproductos.removeAll(marcaproductosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoMarcaProducto 
					&& this.marcaproductoLogic.getMarcaProductos().size()>0
					) {
					marcaproductoAux=this.marcaproductoLogic.getMarcaProductos().get(this.marcaproductoLogic.getMarcaProductos().size() - 1);
				
					if(marcaproductoAux.getId()<0) {
						this.marcaproductoLogic.getMarcaProductos().remove(marcaproductoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoMarcaProducto && this.marcaproductos.size()>0) {
					marcaproductoAux=this.marcaproductos.get(this.marcaproductos.size() - 1);
				
					if(marcaproductoAux.getId()<0) {
						this.marcaproductos.remove(marcaproductoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoMarcaProducto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(marcaproducto.getId()<0) {
				this.marcaproductoLogic.getMarcaProductos().remove(this.marcaproducto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(marcaproducto.getId()<0) {
				this.marcaproductos.remove(this.marcaproducto);
			}
		}			
	}
	
	public void setEstadosInicialesMarcaProducto(List<MarcaProducto> marcaproductosAux) throws Exception {
		MarcaProductoConstantesFunciones.setEstadosInicialesMarcaProducto(marcaproductosAux);
	}
	
	public void setEstadosInicialesMarcaProducto(MarcaProducto marcaproductoAux) throws Exception {
		MarcaProductoConstantesFunciones.setEstadosInicialesMarcaProducto(marcaproductoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarMarcaProductoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesMarcaProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarMarcaProductoActual()) {
				if(!this.isEsNuevoMarcaProducto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesMarcaProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoMarcaProducto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarMarcaProductoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Marca Producto ?", "MANTENIMIENTO DE Marca Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesMarcaProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(MarcaProducto marcaproducto) throws Exception {
		MarcaProductoConstantesFunciones.seleccionarAsignar(this.marcaproducto,marcaproducto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarMarcaProducto=this.isPermisoActualizarOriginalMarcaProducto;
			
			
			this.seleccionarAsignar(marcaproducto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MarcaProductoConstantesFunciones.quitarEspaciosMarcaProducto(this.marcaproducto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesMarcaProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.marcaproductoSessionBean.setsFuncionBusquedaRapida(this.marcaproductoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoMarcaProducto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosMarcaProducto(esParaCancelar);				
				this.cancelarNuevoMarcaProducto(esParaCancelar);								
			}
			
			this.marcaproducto=new MarcaProducto();
			
			this.inicializarMarcaProducto();
			
			this.actualizarEstadoCeldasBotonesMarcaProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarMarcaProducto() throws Exception {
		try {
			MarcaProductoConstantesFunciones.inicializarMarcaProducto(this.marcaproducto);
			
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
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.marcaproductoLogic.getMarcaProductos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteMarcaProductos(String sAccionBusqueda,List<MarcaProducto> marcaproductosParaReportes) throws Exception {
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
					sPathReporteFinal="MarcaProducto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="MarcaProductoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("MarcaProductoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="MarcaProducto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Marca Productos");		
		parameters.put("busquedapor", MarcaProductoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
					
					MarcaProductoLogic marcaproductoLogicAuxiliar=new MarcaProductoLogic();
					marcaproductoLogicAuxiliar.setDatosCliente(marcaproductoLogic.getDatosCliente());				
					marcaproductoLogicAuxiliar.setMarcaProductos(marcaproductosParaReportes);
					
					marcaproductoLogicAuxiliar.cargarRelacionesLoteForeignKeyMarcaProductoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					marcaproductosParaReportes=marcaproductoLogicAuxiliar.getMarcaProductos();
					
					//marcaproductoLogic.getNewConnexionToDeep();
					
					//for (MarcaProducto marcaproducto:marcaproductosParaReportes) {
					//	marcaproductoLogic.deepLoad(marcaproducto, false, DeepLoadType.INCLUDE, classes);
					//}						
					//marcaproductoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//marcaproductoLogic.closeNewConnexionToDeep();
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceMarcaProducto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			MarcaProductoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			MarcaProductoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceMarcaProducto=new JRBeanArrayDataSource(MarcaProductoJInternalFrame.TraerMarcaProductoBeans(marcaproductosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceMarcaProducto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+MarcaProductoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+MarcaProductoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(MarcaProductoBean.TraerMarcaProductoBeans(marcaproductosParaReportes).toArray()));
							
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
				this.generarExcelReporteMarcaProductos(sAccionBusqueda,sTipoArchivoReporte,marcaproductosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalMarcaProductos(sAccionBusqueda,sTipoArchivoReporte,marcaproductosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoMarcaProductoActionPerformed(null);
					//this.generarExcelReporteMarcaProductos(sAccionBusqueda,sTipoArchivoReporte,marcaproductosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalMarcaProductos(sAccionBusqueda,sTipoArchivoReporte,marcaproductosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesMarcaProductos(sAccionBusqueda,sTipoArchivoReporte,marcaproductosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesMarcaProductos(sAccionBusqueda,sTipoArchivoReporte,marcaproductosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteMarcaProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<MarcaProducto> marcaproductosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"marcaproducto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MarcaProductos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMarcaProducto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(MarcaProducto marcaproducto : marcaproductosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			MarcaProductoConstantesFunciones.generarExcelReporteDataMarcaProducto("NORMAL",row,workbook,marcaproducto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.marcaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Marca Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderMarcaProducto(String sTipo,Row row,Workbook workbook) {
		
		MarcaProductoConstantesFunciones.generarExcelReporteHeaderMarcaProducto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalMarcaProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<MarcaProducto> marcaproductosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"marcaproducto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MarcaProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(MarcaProducto marcaproducto : marcaproductosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(MarcaProductoConstantesFunciones.getMarcaProductoDescripcion(marcaproducto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MarcaProductoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MarcaProductoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(marcaproducto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MarcaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MarcaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(marcaproducto.gettipoproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MarcaProductoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MarcaProductoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(marcaproducto.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MarcaProductoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MarcaProductoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(marcaproducto.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.marcaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Marca Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesMarcaProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<MarcaProducto> marcaproductosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<MarcaProducto> marcaproductosRespaldo=null;
		
		classes=MarcaProductoConstantesFunciones.getClassesRelationshipsOfMarcaProducto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.marcaproductoLogic.setDatosCliente(this.datosCliente);
		this.marcaproductoLogic.setDatosDeep(this.datosDeep);
		this.marcaproductoLogic.setIsConDeep(true);
		
		marcaproductosRespaldo=this.marcaproductoLogic.getMarcaProductos();
		
		this.marcaproductoLogic.setMarcaProductos(marcaproductosParaReportes);	
		this.marcaproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		marcaproductosParaReportes=this.marcaproductoLogic.getMarcaProductos();
		this.marcaproductoLogic.setMarcaProductos(marcaproductosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"marcaproducto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MarcaProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMarcaProducto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(MarcaProducto marcaproducto : marcaproductosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderMarcaProducto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			MarcaProductoConstantesFunciones.generarExcelReporteDataMarcaProducto("NORMAL",row,workbook,marcaproducto,cellStyleDataAux);
		
			
			


				//Producto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoConstantesFunciones.SCLASSWEBTITULO))) {

				if(marcaproducto.getProductos()!=null && marcaproducto.getProductos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoConstantesFunciones.generarExcelReporteHeaderProducto("RELACIONADO",row,workbook);
				}

				if(marcaproducto.getProductos()!=null) {
					i2=0;
					for(Producto producto : marcaproducto.getProductos()) {
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

				if(marcaproducto.getParametroInventarioDefectos()!=null && marcaproducto.getParametroInventarioDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroInventarioDefectoConstantesFunciones.generarExcelReporteHeaderParametroInventarioDefecto("RELACIONADO",row,workbook);
				}

				if(marcaproducto.getParametroInventarioDefectos()!=null) {
					i2=0;
					for(ParametroInventarioDefecto parametroinventariodefecto : marcaproducto.getParametroInventarioDefectos()) {
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
		cell.setCellValue(MarcaProductoConstantesFunciones.getMarcaProductoDescripcion(marcaproducto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.marcaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Marca Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoMarcaProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMarcaProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoMarcaProducto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMarcaProducto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessMarcaProducto() throws Exception {		
		this.startProcessMarcaProducto(true);
	}
	
	public void startProcessMarcaProducto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasMarcaProducto ,this.jPanelParametrosReportesMarcaProducto, this.jScrollPanelDatosMarcaProducto,this.jPanelPaginacionMarcaProducto, this.jScrollPanelDatosEdicionMarcaProducto, this.jPanelAccionesMarcaProducto,this.jPanelAccionesFormularioMarcaProducto,this.jmenuBarMarcaProducto,this.jmenuBarDetalleMarcaProducto,this.jTtoolBarMarcaProducto,this.jTtoolBarDetalleMarcaProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasMarcaProducto=this.jTabbedPaneBusquedasMarcaProducto; 
		
		final JPanel jPanelParametrosReportesMarcaProducto=this.jPanelParametrosReportesMarcaProducto;
		//final JScrollPane jScrollPanelDatosMarcaProducto=this.jScrollPanelDatosMarcaProducto;
		final JTable jTableDatosMarcaProducto=this.jTableDatosMarcaProducto;		
		final JPanel jPanelPaginacionMarcaProducto=this.jPanelPaginacionMarcaProducto;
		//final JScrollPane jScrollPanelDatosEdicionMarcaProducto=this.jScrollPanelDatosEdicionMarcaProducto;
		final JPanel jPanelAccionesMarcaProducto=this.jPanelAccionesMarcaProducto;
		
		JPanel jPanelCamposAuxiliarMarcaProducto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarMarcaProducto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
			jPanelCamposAuxiliarMarcaProducto=this.jInternalFrameDetalleFormMarcaProducto.jPanelCamposMarcaProducto;
			jPanelAccionesFormularioAuxiliarMarcaProducto=this.jInternalFrameDetalleFormMarcaProducto.jPanelAccionesFormularioMarcaProducto;
		}
		
		final JPanel jPanelCamposMarcaProducto=jPanelCamposAuxiliarMarcaProducto;
		final JPanel jPanelAccionesFormularioMarcaProducto=jPanelAccionesFormularioAuxiliarMarcaProducto;
		
		
		final JMenuBar jmenuBarMarcaProducto=this.jmenuBarMarcaProducto;
		final JToolBar jTtoolBarMarcaProducto=this.jTtoolBarMarcaProducto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarMarcaProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMarcaProducto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
			jmenuBarDetalleAuxiliarMarcaProducto=this.jInternalFrameDetalleFormMarcaProducto.jmenuBarDetalleMarcaProducto;
			jTtoolBarDetalleAuxiliarMarcaProducto=this.jInternalFrameDetalleFormMarcaProducto.jTtoolBarDetalleMarcaProducto;
		}
		
		final JMenuBar jmenuBarDetalleMarcaProducto=jmenuBarDetalleAuxiliarMarcaProducto;
		final JToolBar jTtoolBarDetalleMarcaProducto=jTtoolBarDetalleAuxiliarMarcaProducto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMarcaProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMarcaProducto;
			processRunnable.jTableDatos=jTableDatosMarcaProducto;
			processRunnable.jPanelCampos=jPanelCamposMarcaProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionMarcaProducto;
			processRunnable.jPanelAcciones=jPanelAccionesMarcaProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMarcaProducto;
			
			
			processRunnable.jmenuBar=jmenuBarMarcaProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMarcaProducto;
			processRunnable.jTtoolBar=jTtoolBarMarcaProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMarcaProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMarcaProducto ,jPanelParametrosReportesMarcaProducto,jTableDatosMarcaProducto, /*jScrollPanelDatosMarcaProducto,*/jPanelCamposMarcaProducto,jPanelPaginacionMarcaProducto, /*jScrollPanelDatosEdicionMarcaProducto,*/ jPanelAccionesMarcaProducto,jPanelAccionesFormularioMarcaProducto,jmenuBarMarcaProducto,jmenuBarDetalleMarcaProducto,jTtoolBarMarcaProducto,jTtoolBarDetalleMarcaProducto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMarcaProducto ,jPanelParametrosReportesMarcaProducto, jScrollPanelDatosMarcaProducto,jPanelPaginacionMarcaProducto, jScrollPanelDatosEdicionMarcaProducto, jPanelAccionesMarcaProducto,jPanelAccionesFormularioMarcaProducto,jmenuBarMarcaProducto,jmenuBarDetalleMarcaProducto,jTtoolBarMarcaProducto,jTtoolBarDetalleMarcaProducto);
						
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
	
	public void finishProcessMarcaProducto() {// throws Exception 
		this.finishProcessMarcaProducto(true);
	}
	
	public void finishProcessMarcaProducto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasMarcaProducto ,this.jPanelParametrosReportesMarcaProducto, this.jScrollPanelDatosMarcaProducto,this.jPanelPaginacionMarcaProducto, this.jScrollPanelDatosEdicionMarcaProducto, this.jPanelAccionesMarcaProducto,this.jPanelAccionesFormularioMarcaProducto,this.jmenuBarMarcaProducto,this.jmenuBarDetalleMarcaProducto,this.jTtoolBarMarcaProducto,this.jTtoolBarDetalleMarcaProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasMarcaProducto=this.jTabbedPaneBusquedasMarcaProducto; 
		
		final JPanel jPanelParametrosReportesMarcaProducto=this.jPanelParametrosReportesMarcaProducto;
		//final JScrollPane jScrollPanelDatosMarcaProducto=this.jScrollPanelDatosMarcaProducto;
		final JTable jTableDatosMarcaProducto=this.jTableDatosMarcaProducto;		
		final JPanel jPanelPaginacionMarcaProducto=this.jPanelPaginacionMarcaProducto;
		//final JScrollPane jScrollPanelDatosEdicionMarcaProducto=this.jScrollPanelDatosEdicionMarcaProducto;
		final JPanel jPanelAccionesMarcaProducto=this.jPanelAccionesMarcaProducto;
		
		JPanel jPanelCamposAuxiliarMarcaProducto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarMarcaProducto=new JPanel();
		
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
			jPanelCamposAuxiliarMarcaProducto=this.jInternalFrameDetalleFormMarcaProducto.jPanelCamposMarcaProducto;
			jPanelAccionesFormularioAuxiliarMarcaProducto=this.jInternalFrameDetalleFormMarcaProducto.jPanelAccionesFormularioMarcaProducto;
		}
		
		final JPanel jPanelCamposMarcaProducto=jPanelCamposAuxiliarMarcaProducto;
		final JPanel jPanelAccionesFormularioMarcaProducto=jPanelAccionesFormularioAuxiliarMarcaProducto;
		
		
		final JMenuBar jmenuBarMarcaProducto=this.jmenuBarMarcaProducto;		
		final JToolBar jTtoolBarMarcaProducto=this.jTtoolBarMarcaProducto;
				
		JMenuBar jmenuBarDetalleAuxiliarMarcaProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMarcaProducto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
			jmenuBarDetalleAuxiliarMarcaProducto=this.jInternalFrameDetalleFormMarcaProducto.jmenuBarDetalleMarcaProducto;
			jTtoolBarDetalleAuxiliarMarcaProducto=this.jInternalFrameDetalleFormMarcaProducto.jTtoolBarDetalleMarcaProducto;		
		}
		
		final JMenuBar jmenuBarDetalleMarcaProducto=jmenuBarDetalleAuxiliarMarcaProducto;
		final JToolBar jTtoolBarDetalleMarcaProducto=jTtoolBarDetalleAuxiliarMarcaProducto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMarcaProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMarcaProducto;
			processRunnable.jTableDatos=jTableDatosMarcaProducto;
			processRunnable.jPanelCampos=jPanelCamposMarcaProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionMarcaProducto;
			processRunnable.jPanelAcciones=jPanelAccionesMarcaProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMarcaProducto;
			
			
			processRunnable.jmenuBar=jmenuBarMarcaProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMarcaProducto;
			processRunnable.jTtoolBar=jTtoolBarMarcaProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMarcaProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasMarcaProducto ,jPanelParametrosReportesMarcaProducto, jTableDatosMarcaProducto,/*jScrollPanelDatosMarcaProducto,*/jPanelCamposMarcaProducto,jPanelPaginacionMarcaProducto, /*jScrollPanelDatosEdicionMarcaProducto,*/ jPanelAccionesMarcaProducto,jPanelAccionesFormularioMarcaProducto,jmenuBarMarcaProducto,jmenuBarDetalleMarcaProducto,jTtoolBarMarcaProducto,jTtoolBarDetalleMarcaProducto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesMarcaProducto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarMarcaProducto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuMarcaProducto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarMarcaProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarMarcaProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleMarcaProducto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuMarcaProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarMarcaProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleMarcaProducto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.marcaproductoConstantesFunciones.getsFinalQueryMarcaProducto();
		String  finalQueryPaginacionTodos=this.marcaproductoConstantesFunciones.getsFinalQueryMarcaProducto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=MarcaProductoConstantesFunciones.getArrayColumnasGlobalesNoMarcaProducto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=MarcaProductoConstantesFunciones.getArrayColumnasGlobalesMarcaProducto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,MarcaProductoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.marcaproductosEliminados= new ArrayList<MarcaProducto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessMarcaProducto();
		
				///*MarcaProductoSessionBean*/this.marcaproductoSessionBean=new MarcaProductoSessionBean();
			
			if(this.marcaproductoSessionBean==null) {
				this.marcaproductoSessionBean=new MarcaProductoSessionBean();
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
					this.iNumeroPaginacion=MarcaProductoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=MarcaProductoConstantesFunciones.getClassesForeignKeysOfMarcaProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/marcaproducto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			marcaproductosAux= new ArrayList<MarcaProducto>();
			
				
			marcaproductoLogic.setDatosCliente(this.datosCliente);
			marcaproductoLogic.setDatosDeep(this.datosDeep);
			marcaproductoLogic.setIsConDeep(true);
			
			
			marcaproductoLogic.getMarcaProductoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					marcaproductoLogic.getTodosMarcaProductos(finalQueryGlobal,pagination);
					
					//marcaproductoLogic.getTodosMarcaProductosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(marcaproductoLogic.getMarcaProductos()==null|| marcaproductoLogic.getMarcaProductos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							marcaproductosAux= new ArrayList<MarcaProducto>();
							marcaproductosAux.addAll(marcaproductoLogic.getMarcaProductos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							marcaproductosAux= new ArrayList<MarcaProducto>();
							marcaproductosAux.addAll(marcaproductos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							marcaproductoLogic.getTodosMarcaProductos(finalQueryGlobal+"",this.pagination);												
							
							//marcaproductoLogic.getTodosMarcaProductosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteMarcaProductos("Todos",marcaproductoLogic.getMarcaProductos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							marcaproductoLogic.setMarcaProductos(new ArrayList<MarcaProducto>());					
							marcaproductoLogic.getMarcaProductos().addAll(marcaproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							marcaproductos=new ArrayList<MarcaProducto>();
							marcaproductos.addAll(marcaproductosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idMarcaProducto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idMarcaProducto=this.idActual;
				
				} else if(this.idMarcaProductoActual!=null && this.idMarcaProductoActual!=0L) {
					idMarcaProducto=idMarcaProductoActual;
				}
				
					
				this.sDetalleReporte=MarcaProductoConstantesFunciones.getDetalleIndicePorId(idMarcaProducto);
				
				this.marcaproductos=new ArrayList<MarcaProducto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					marcaproductoLogic.getEntity(idMarcaProducto);
					
					//marcaproductoLogic.getEntityWithConnection(idMarcaProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					marcaproductoLogic.setMarcaProductos(new ArrayList<MarcaProducto>());
					marcaproductoLogic.getMarcaProductos().add(marcaproductoLogic.getMarcaProducto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.marcaproductos=new ArrayList<MarcaProducto>();
					this.marcaproductos.add(marcaproducto);
				}
				
				if(marcaproductoLogic.getMarcaProducto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=MarcaProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					marcaproductoLogic.getMarcaProductosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MarcaProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MarcaProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=marcaproductoLogic.getMarcaProductos()==null||marcaproductoLogic.getMarcaProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=marcaproductos==null|| marcaproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						marcaproductosAux=new ArrayList<MarcaProducto>();
						marcaproductosAux.addAll(marcaproductoLogic.getMarcaProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							marcaproductosAux=new ArrayList<MarcaProducto>();
							marcaproductosAux.addAll(marcaproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							marcaproductoLogic.getMarcaProductosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MarcaProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MarcaProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMarcaProductos("BusquedaPorCodigo",marcaproductoLogic.getMarcaProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMarcaProductos("BusquedaPorCodigo",marcaproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						marcaproductoLogic.setMarcaProductos(new ArrayList<MarcaProducto>());
						marcaproductoLogic.getMarcaProductos().addAll(marcaproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							marcaproductos=new ArrayList<MarcaProducto>();
							marcaproductos.addAll(marcaproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=MarcaProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					marcaproductoLogic.getMarcaProductosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MarcaProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MarcaProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=marcaproductoLogic.getMarcaProductos()==null||marcaproductoLogic.getMarcaProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=marcaproductos==null|| marcaproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						marcaproductosAux=new ArrayList<MarcaProducto>();
						marcaproductosAux.addAll(marcaproductoLogic.getMarcaProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							marcaproductosAux=new ArrayList<MarcaProducto>();
							marcaproductosAux.addAll(marcaproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							marcaproductoLogic.getMarcaProductosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MarcaProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MarcaProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMarcaProductos("BusquedaPorNombre",marcaproductoLogic.getMarcaProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMarcaProductos("BusquedaPorNombre",marcaproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						marcaproductoLogic.setMarcaProductos(new ArrayList<MarcaProducto>());
						marcaproductoLogic.getMarcaProductos().addAll(marcaproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							marcaproductos=new ArrayList<MarcaProducto>();
							marcaproductos.addAll(marcaproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=MarcaProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					marcaproductoLogic.getMarcaProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MarcaProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MarcaProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=marcaproductoLogic.getMarcaProductos()==null||marcaproductoLogic.getMarcaProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=marcaproductos==null|| marcaproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						marcaproductosAux=new ArrayList<MarcaProducto>();
						marcaproductosAux.addAll(marcaproductoLogic.getMarcaProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							marcaproductosAux=new ArrayList<MarcaProducto>();
							marcaproductosAux.addAll(marcaproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							marcaproductoLogic.getMarcaProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MarcaProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MarcaProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMarcaProductos("FK_IdEmpresa",marcaproductoLogic.getMarcaProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMarcaProductos("FK_IdEmpresa",marcaproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						marcaproductoLogic.setMarcaProductos(new ArrayList<MarcaProducto>());
						marcaproductoLogic.getMarcaProductos().addAll(marcaproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							marcaproductos=new ArrayList<MarcaProducto>();
							marcaproductos.addAll(marcaproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoProducto")) {
				this.sDetalleReporte=MarcaProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					marcaproductoLogic.getMarcaProductosFK_IdTipoProducto(finalQueryGlobal,pagination,id_tipo_productoFK_IdTipoProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MarcaProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MarcaProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=marcaproductoLogic.getMarcaProductos()==null||marcaproductoLogic.getMarcaProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=marcaproductos==null|| marcaproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						marcaproductosAux=new ArrayList<MarcaProducto>();
						marcaproductosAux.addAll(marcaproductoLogic.getMarcaProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							marcaproductosAux=new ArrayList<MarcaProducto>();
							marcaproductosAux.addAll(marcaproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							marcaproductoLogic.getMarcaProductosFK_IdTipoProducto(finalQueryGlobal,pagination,id_tipo_productoFK_IdTipoProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MarcaProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MarcaProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMarcaProductos("FK_IdTipoProducto",marcaproductoLogic.getMarcaProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMarcaProductos("FK_IdTipoProducto",marcaproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						marcaproductoLogic.setMarcaProductos(new ArrayList<MarcaProducto>());
						marcaproductoLogic.getMarcaProductos().addAll(marcaproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							marcaproductos=new ArrayList<MarcaProducto>();
							marcaproductos.addAll(marcaproductosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesMarcaProducto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessMarcaProducto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=marcaproductoLogic.getMarcaProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=marcaproductos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=marcaproductoLogic.getMarcaProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=marcaproductos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(MarcaProducto marcaproducto) {
		Boolean permite=true;
		
		if(this.marcaproducto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=MarcaProductoConstantesFunciones.getOrderByListaMarcaProducto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=MarcaProductoConstantesFunciones.getOrderByListaMarcaProducto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MarcaProducto marcaproducto:marcaproductoLogic.getMarcaProductos()) {
				if(marcaproducto.getsType().equals(Constantes2.S_TOTALES)) {
					marcaproductoTotales=marcaproducto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MarcaProducto marcaproducto:this.marcaproductos) {
				if(marcaproducto.getsType().equals(Constantes2.S_TOTALES)) {
					marcaproductoTotales=marcaproducto;
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
			this.marcaproductoAux=new MarcaProducto();
			this.marcaproductoAux.setsType(Constantes2.S_TOTALES);
			this.marcaproductoAux.setIsNew(false);
			this.marcaproductoAux.setIsChanged(false);
			this.marcaproductoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				MarcaProductoConstantesFunciones.TotalizarValoresFilaMarcaProducto(this.marcaproductoLogic.getMarcaProductos(),this.marcaproductoAux);
				
				this.marcaproductoLogic.getMarcaProductos().add(this.marcaproductoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				MarcaProductoConstantesFunciones.TotalizarValoresFilaMarcaProducto(this.marcaproductos,this.marcaproductoAux);
				
				this.marcaproductos.add(this.marcaproductoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		marcaproductoTotales=new MarcaProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.marcaproductoLogic.getMarcaProductos().remove(marcaproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.marcaproductos.remove(marcaproductoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		marcaproductoTotales=new MarcaProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MarcaProducto marcaproducto:marcaproductoLogic.getMarcaProductos()) {
				if(marcaproducto.getsType().equals(Constantes2.S_TOTALES)) {
					marcaproductoTotales=marcaproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MarcaProductoConstantesFunciones.TotalizarValoresFilaMarcaProducto(this.marcaproductoLogic.getMarcaProductos(),marcaproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MarcaProducto marcaproducto:this.marcaproductos) {
				if(marcaproducto.getsType().equals(Constantes2.S_TOTALES)) {
					marcaproductoTotales=marcaproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MarcaProductoConstantesFunciones.TotalizarValoresFilaMarcaProducto(this.marcaproductos,marcaproductoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getMarcaProductosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMarcaProductosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMarcaProductosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMarcaProductosFK_IdTipoProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getMarcaProductosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					marcaproductoLogic.getMarcaProductosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMarcaProductosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					marcaproductoLogic.getMarcaProductosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMarcaProductosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					marcaproductoLogic.getMarcaProductosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMarcaProductosFK_IdTipoProducto(String sFinalQuery,Long id_tipo_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					marcaproductoLogic.getMarcaProductosFK_IdTipoProducto(sFinalQuery,this.pagination,id_tipo_producto);
				
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
	
	public void inicializarPermisosMarcaProducto() {
		this.isPermisoTodoMarcaProducto=false;
		this.isPermisoNuevoMarcaProducto=false;
		this.isPermisoActualizarMarcaProducto=false;
		this.isPermisoActualizarOriginalMarcaProducto=false;
		this.isPermisoEliminarMarcaProducto=false;
		this.isPermisoGuardarCambiosMarcaProducto=false;
		this.isPermisoConsultaMarcaProducto=false;
		this.isPermisoBusquedaMarcaProducto=false;
		this.isPermisoReporteMarcaProducto=false;		
		this.isPermisoOrdenMarcaProducto=false;		
		this.isPermisoPaginacionMedioMarcaProducto=false;		
		this.isPermisoPaginacionAltoMarcaProducto=false;
		this.isPermisoPaginacionTodoMarcaProducto=false;
		this.isPermisoCopiarMarcaProducto=false;		
		this.isPermisoVerFormMarcaProducto=false;		
		this.isPermisoDuplicarMarcaProducto=false;		
		this.isPermisoOrdenMarcaProducto=false;		
	}
	
	public void setPermisosUsuarioMarcaProducto(Boolean isPermiso) {
		this.isPermisoTodoMarcaProducto=isPermiso;
		this.isPermisoNuevoMarcaProducto=isPermiso;
		this.isPermisoActualizarMarcaProducto=isPermiso;
		this.isPermisoActualizarOriginalMarcaProducto=isPermiso;
		this.isPermisoEliminarMarcaProducto=isPermiso;
		this.isPermisoGuardarCambiosMarcaProducto=isPermiso;
		this.isPermisoConsultaMarcaProducto=isPermiso;
		this.isPermisoBusquedaMarcaProducto=isPermiso;
		this.isPermisoReporteMarcaProducto=isPermiso;
		this.isPermisoOrdenMarcaProducto=isPermiso;		
		this.isPermisoPaginacionMedioMarcaProducto=isPermiso;		
		this.isPermisoPaginacionAltoMarcaProducto=isPermiso;		
		this.isPermisoPaginacionTodoMarcaProducto=isPermiso;		
		this.isPermisoCopiarMarcaProducto=isPermiso;		
		this.isPermisoVerFormMarcaProducto=isPermiso;		
		this.isPermisoDuplicarMarcaProducto=isPermiso;
		this.isPermisoOrdenMarcaProducto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioMarcaProducto(Boolean isPermiso) {
		//this.isPermisoTodoMarcaProducto=isPermiso;
		this.isPermisoNuevoMarcaProducto=isPermiso;
		this.isPermisoActualizarMarcaProducto=isPermiso;
		this.isPermisoActualizarOriginalMarcaProducto=isPermiso;
		this.isPermisoEliminarMarcaProducto=isPermiso;
		this.isPermisoGuardarCambiosMarcaProducto=isPermiso;
		//this.isPermisoConsultaMarcaProducto=isPermiso;
		//this.isPermisoBusquedaMarcaProducto=isPermiso;
		//this.isPermisoReporteMarcaProducto=isPermiso;
		//this.isPermisoOrdenMarcaProducto=isPermiso;		
		//this.isPermisoPaginacionMedioMarcaProducto=isPermiso;		
		//this.isPermisoPaginacionAltoMarcaProducto=isPermiso;		
		//this.isPermisoPaginacionTodoMarcaProducto=isPermiso;		
		//this.isPermisoCopiarMarcaProducto=isPermiso;		
		//this.isPermisoDuplicarMarcaProducto=isPermiso;
		//this.isPermisoOrdenMarcaProducto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioMarcaProductoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ProductoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
		if(MarcaProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosProducto=this.verificarGetPermisosUsuarioOpcionMarcaProductoClaseRelacionada(this.opcionsRelacionadas,ProductoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosParametroInventarioDefecto=false;
		this.isTienePermisosParametroInventarioDefecto=this.verificarGetPermisosUsuarioOpcionMarcaProductoClaseRelacionada(this.opcionsRelacionadas,ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebMarcaProducto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioMarcaProductoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosProducto=conPermiso;
		this.isTienePermisosParametroInventarioDefecto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioMarcaProductoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionMarcaProductoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioMarcaProductoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosProducto && this.jInternalFrameDetalleFormMarcaProducto!=null && this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormMarcaProducto.jTabbedPaneRelacionesMarcaProducto.remove(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosParametroInventarioDefecto && this.jInternalFrameDetalleFormMarcaProducto!=null && this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormMarcaProducto.jTabbedPaneRelacionesMarcaProducto.remove(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioMarcaProducto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(MarcaProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, MarcaProductoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoMarcaProducto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarMarcaProducto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalMarcaProducto=this.isPermisoActualizarMarcaProducto;
			this.isPermisoEliminarMarcaProducto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosMarcaProducto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaMarcaProducto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaMarcaProducto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoMarcaProducto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteMarcaProducto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMarcaProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioMarcaProducto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoMarcaProducto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoMarcaProducto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarMarcaProducto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormMarcaProducto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarMarcaProducto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMarcaProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosMarcaProducto.setToolTipText(this.jTableDatosMarcaProducto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioMarcaProducto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioMarcaProducto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(MarcaProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(MarcaProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioMarcaProducto() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosProducto && this.marcaproductoConstantesFunciones.mostrarProductoMarcaProducto && !MarcaProductoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Producto");
			reporte.setsDescripcion("Producto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosParametroInventarioDefecto && this.marcaproductoConstantesFunciones.mostrarParametroInventarioDefectoMarcaProducto && !MarcaProductoConstantesFunciones.ISGUARDARREL) {

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
	public void inicializarCombosForeignKeyMarcaProductoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tipoproductosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyMarcaProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(MarcaProductoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyMarcaProductoListas(false);
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
	
	public void cargarCombosLoteForeignKeyMarcaProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			MarcaProductoParameterReturnGeneral marcaproductoReturnGeneral=new MarcaProductoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.marcaproductoConstantesFunciones.cargarid_empresaMarcaProducto)
					 || (this.esRecargarFks && this.marcaproductoConstantesFunciones.cargarid_empresaMarcaProducto)) {

					if(!this.marcaproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+marcaproductoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTipoProducto="";

				if(((this.tipoproductosForeignKey==null||this.tipoproductosForeignKey.size()<=0) && this.marcaproductoConstantesFunciones.cargarid_tipo_productoMarcaProducto)
					 || (this.esRecargarFks && this.marcaproductoConstantesFunciones.cargarid_tipo_productoMarcaProducto)) {

					if(!this.marcaproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoProductoConstantesFunciones.getArrayColumnasGlobalesTipoProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoProducto, "");
						finalQueryGlobalTipoProducto+=TipoProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoProducto=" WHERE " + ConstantesSql.ID + "="+marcaproductoSessionBean.getlidTipoProductoActual();
					}
				} else {
					finalQueryGlobalTipoProducto="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				marcaproductoReturnGeneral=marcaproductoLogic.cargarCombosLoteForeignKeyMarcaProducto(finalQueryGlobalEmpresa,finalQueryGlobalTipoProducto);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=marcaproductoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTipoProducto.equals("NONE")) {
				this.tipoproductosForeignKey=marcaproductoReturnGeneral.gettipoproductosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyMarcaProducto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoProducto();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.marcaproductoSessionBean==null) {
				this.marcaproductoSessionBean=new MarcaProductoSessionBean();
			}

			if(!this.marcaproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.marcaproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProducto()) {
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
	
	public void initActionsCombosTodosForeignKeyMarcaProducto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyMarcaProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyMarcaProducto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyMarcaProducto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyMarcaProducto(MarcaProducto marcaproducto)throws Exception {	
		try {
			
			this.setActualTipoProductoForeignKey(marcaproducto.getid_tipo_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyMarcaProducto(MarcaProducto marcaproducto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyMarcaProducto()throws Exception {	
		try {
			
			this.setActualTipoProductoForeignKey(this.marcaproductoConstantesFunciones.getid_tipo_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyMarcaProducto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyMarcaProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyMarcaProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroMarcaProducto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyMarcaProducto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoProductosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyMarcaProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyMarcaProducto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_empresaMarcaProducto!=null && this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_empresaMarcaProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_empresaMarcaProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_tipo_productoMarcaProducto!=null && this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_tipo_productoMarcaProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_tipo_productoMarcaProducto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public MarcaProductoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public MarcaProductoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public MarcaProductoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.marcaproductoSessionBean=new MarcaProductoSessionBean(); 
		this.marcaproductoConstantesFunciones=new MarcaProductoConstantesFunciones(); 
		this.marcaproductoBean=new MarcaProducto();//(this.marcaproductoConstantesFunciones); 		
		this.marcaproductoReturnGeneral=new MarcaProductoParameterReturnGeneral(); 
		
		this.marcaproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.marcaproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public MarcaProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public MarcaProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public MarcaProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessMarcaProducto(true);
			
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
			
			this.marcaproductoConstantesFunciones=new MarcaProductoConstantesFunciones(); 
			this.marcaproductoBean=new MarcaProducto();//this.marcaproductoConstantesFunciones); 			
			this.marcaproductoReturnGeneral=new MarcaProductoParameterReturnGeneral(); 
		
			MarcaProductoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Marca Producto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.marcaproducto=new MarcaProducto();
			this.marcaproductos = new ArrayList<MarcaProducto>();
			this.marcaproductosAux = new ArrayList<MarcaProducto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic=new MarcaProductoLogic();
				this.marcaproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.marcaproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.marcaproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormMarcaProducto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoMarcaProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMarcaProducto);	
					}
					
					if(this.jInternalFrameImportacionMarcaProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMarcaProducto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByMarcaProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByMarcaProducto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormMarcaProducto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormMarcaProducto);
				this.jInternalFrameDetalleFormMarcaProducto.setVisible(false);
				this.jInternalFrameDetalleFormMarcaProducto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoMarcaProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMarcaProducto);
					this.jInternalFrameReporteDinamicoMarcaProducto.setVisible(false);
					this.jInternalFrameReporteDinamicoMarcaProducto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionMarcaProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionMarcaProducto);
					this.jInternalFrameImportacionMarcaProducto.setVisible(false);
					this.jInternalFrameImportacionMarcaProducto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByMarcaProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByMarcaProducto);
					this.jInternalFrameOrderByMarcaProducto.setVisible(false);
					this.jInternalFrameOrderByMarcaProducto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idMarcaProductoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=MarcaProductoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.marcaproductoReturnGeneral=new MarcaProductoParameterReturnGeneral();
			
			this.marcaproductoParameterGeneral=new MarcaProductoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.marcaproductoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(MarcaProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ProductoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MarcaProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.marcaproductoSessionBean.getEsGuardarRelacionado(),this.marcaproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MarcaProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.marcaproductoSessionBean.getEsGuardarRelacionado(),this.marcaproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoMarcaProducto=false;
			this.isVisibilidadCeldaDuplicarMarcaProducto=true;
			this.isVisibilidadCeldaCopiarMarcaProducto=true;
			this.isVisibilidadCeldaVerFormMarcaProducto=true;
			this.isVisibilidadCeldaOrdenMarcaProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesMarcaProducto=false;
			this.isVisibilidadCeldaModificarMarcaProducto=false;
			this.isVisibilidadCeldaActualizarMarcaProducto=false;
			this.isVisibilidadCeldaEliminarMarcaProducto=false;
			this.isVisibilidadCeldaCancelarMarcaProducto=false;
			this.isVisibilidadCeldaGuardarMarcaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosMarcaProducto=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoProducto=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesMarcaProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosMarcaProducto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioMarcaProducto(false);
			
			this.setPermisosUsuarioMarcaProducto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.marcaproductoSessionBean.getEsGuardarRelacionado() 
				|| (this.marcaproductoSessionBean.getEsGuardarRelacionado() && this.marcaproductoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioMarcaProductoClasesRelacionadas();
			}
			
			if(this.marcaproductoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioMarcaProductoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!MarcaProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosMarcaProducto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualMarcaProducto();
			}
			
			if(!this.isPermisoBusquedaMarcaProducto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasMarcaProducto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.marcaproductoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioMarcaProducto,this.isPermisoPaginacionMedioMarcaProducto,this.isPermisoPaginacionTodoMarcaProducto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(MarcaProductoConstantesFunciones.getTiposSeleccionarMarcaProducto());
				
				this.tiposColumnasSelect=MarcaProductoConstantesFunciones.getTiposSeleccionarMarcaProducto(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectMarcaProducto();				
				//this.tiposRelacionesSelect=MarcaProductoConstantesFunciones.getTiposRelacionesMarcaProducto(true);
				
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
			//if(!this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioMarcaProducto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioMarcaProducto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioMarcaProducto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesMarcaProducto() ;
			
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
				marcaproductoImplementable= (MarcaProductoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MarcaProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				marcaproductoImplementableHome= (MarcaProductoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MarcaProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.marcaproductos= new ArrayList<MarcaProducto>();
			this.marcaproductosEliminados= new ArrayList<MarcaProducto>();
						
			this.isEsNuevoMarcaProducto=false;
			this.esParaAccionDesdeFormularioMarcaProducto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tipoproductosForeignKey=new ArrayList<TipoProducto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyMarcaProducto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroMarcaProducto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			MarcaProductoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=MarcaProductoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesMarcaProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingMarcaProducto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormMarcaProducto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioMarcaProducto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioMarcaProducto();
			}
			
			MarcaProductoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasMarcaProducto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasMarcaProducto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasMarcaProducto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessMarcaProducto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga MarcaProducto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectMarcaProducto() {
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
			if(sTipo.equals("RelacionesMarcaProducto")) {
				iIndex=this.jInternalFrameDetalleFormMarcaProducto.jTabbedPaneRelacionesMarcaProducto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormMarcaProducto.jTabbedPaneRelacionesMarcaProducto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosMarcaProducto.getSelectedRow();	
				
				

				if(sTitle.equals("Parametro Inventario Defectos")) {
					if(!ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessMarcaProducto();

						this.cargarParteTabPanelRelacionadaParametroInventarioDefecto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Productos")) {
					if(!ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessMarcaProducto();

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
				this.finishProcessMarcaProducto();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaParametroInventarioDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormMarcaProducto.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(false,true,iIndex);
		this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();

		//this.jTabbedPaneRelacionesMarcaProducto.updateUI();
		//this.jTabbedPaneRelacionesMarcaProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesMarcaProducto.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProducto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormMarcaProducto.cargarSessionConBeanSwingJInternalFrameProducto(false,true,iIndex);
		this.jButtonProductoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProducto();

		//this.jTabbedPaneRelacionesMarcaProducto.updateUI();
		//this.jTabbedPaneRelacionesMarcaProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesMarcaProducto.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Producto")) {
				int row=this.jTableDatosMarcaProducto.getSelectedRow();
				jButtonProductoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ParametroInventarioDefecto")) {
				int row=this.jTableDatosMarcaProducto.getSelectedRow();
				jButtonParametroInventarioDefectoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Producto")) {

					if(this.isTienePermisosProducto && this.marcaproductoConstantesFunciones.mostrarProductoMarcaProducto && !MarcaProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Productos"+"("+ProductoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Productos");

						if(marcaproductoConstantesFunciones.resaltarProductoMarcaProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(marcaproductoConstantesFunciones.resaltarProductoMarcaProducto);
						}

						jmenuItem.setEnabled(this.marcaproductoConstantesFunciones.activarProductoMarcaProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Producto"));

						

						this.jInternalFrameDetalleFormMarcaProducto.jmenuDetalleMarcaProducto.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Parametro Inventario Defecto")) {

					if(this.isTienePermisosParametroInventarioDefecto && this.marcaproductoConstantesFunciones.mostrarParametroInventarioDefectoMarcaProducto && !MarcaProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Inventario Defectos"+"("+ParametroInventarioDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Inventario Defectos");

						if(marcaproductoConstantesFunciones.resaltarParametroInventarioDefectoMarcaProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(marcaproductoConstantesFunciones.resaltarParametroInventarioDefectoMarcaProducto);
						}

						jmenuItem.setEnabled(this.marcaproductoConstantesFunciones.activarParametroInventarioDefectoMarcaProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroInventarioDefecto"));

						

						this.jInternalFrameDetalleFormMarcaProducto.jmenuDetalleMarcaProducto.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyMarcaProducto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyMarcaProducto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyMarcaProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyMarcaProductoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyMarcaProducto();
		
		this.cargarCombosFrameForeignKeyMarcaProducto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyMarcaProducto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyMarcaProducto();
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
	
	public void jButtonNuevoMarcaProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.marcaproductoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormMarcaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
			
			
			if(jTableDatosMarcaProducto.getRowCount()>=1) {
				jTableDatosMarcaProducto.removeRowSelectionInterval(0, jTableDatosMarcaProducto.getRowCount()-1);						
			}
			
			this.isEsNuevoMarcaProducto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoMarcaProducto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesMarcaProducto(true);			
			//this.marcaproducto=new MarcaProducto();
			//this.marcaproducto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMarcaProducto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMarcaProducto() ;
			
			if(MarcaProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMarcaProducto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.marcaproducto);	
			this.actualizarInformacion("INFO_PADRE",false,this.marcaproducto);				
			
			MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
			
			if(this.marcaproductoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar MarcaProducto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarMarcaProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<MarcaProducto> marcaproductosSeleccionados=new ArrayList<MarcaProducto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosMarcaProducto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosMarcaProducto.getSelectedRows().length;			
			}
			
			marcaproductosSeleccionados=this.getMarcaProductosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoMarcaProducto--;			
				//MarcaProducto marcaproductoAux= new MarcaProducto();			
				//marcaproductoAux.setId(this.iIdNuevoMarcaProducto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//MarcaProducto marcaproductoOrigen=new MarcaProducto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(MarcaProducto marcaproductoOrigen : marcaproductosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosMarcaProducto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							marcaproductoOrigen =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							marcaproductoOrigen =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaMarcaProducto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.marcaproducto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosMarcaProducto(marcaproductoOrigen,this.marcaproducto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysMarcaProducto(this.marcaproducto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.marcaproductoLogic.getMarcaProductos().add(this.marcaproductoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.marcaproductos.add(this.marcaproductoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaMarcaProducto(false);
				
				this.jTableDatosMarcaProducto.setRowSelectionInterval(this.getIndiceNuevoMarcaProducto(), this.getIndiceNuevoMarcaProducto());
				
				int iLastRow =  this.jTableDatosMarcaProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMarcaProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMarcaProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMarcaProducto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarMarcaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<MarcaProducto> marcaproductosSeleccionados=new ArrayList<MarcaProducto>();									
		
			MarcaProducto marcaproductoOrigen=new MarcaProducto();
			MarcaProducto marcaproductoDestino=new MarcaProducto();
				
			marcaproductosSeleccionados=this.getMarcaProductosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosMarcaProducto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || marcaproductosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosMarcaProducto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						marcaproductoOrigen =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						marcaproductoOrigen =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						marcaproductoDestino =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						marcaproductoDestino =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				marcaproductoOrigen =marcaproductosSeleccionados.get(0);
				marcaproductoDestino =marcaproductosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosMarcaProducto(marcaproductoOrigen,marcaproductoDestino,true,false);
				
				marcaproductoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(marcaproductoDestino,marcaproductoLogic.getMarcaProductos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(marcaproductoDestino,marcaproductos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaMarcaProducto(false);
				
				//this.jTableDatosMarcaProducto.setRowSelectionInterval(this.getIndiceNuevoMarcaProducto(), this.getIndiceNuevoMarcaProducto());
				
				int iLastRow =  this.jTableDatosMarcaProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMarcaProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMarcaProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMarcaProducto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormMarcaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMarcaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormMarcaProducto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarMarcaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesMarcaProducto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasMarcaProducto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesMarcaProducto.setVisible(!isVisible);
			this.jPanelPaginacionMarcaProducto.setVisible(!isVisible);
			this.jPanelAccionesMarcaProducto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarMarcaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameMarcaProducto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoMarcaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoMarcaProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionMarcaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionMarcaProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByMarcaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByMarcaProducto();
			
			this.abrirFrameOrderByMarcaProducto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByMarcaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByMarcaProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleMarcaProducto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormMarcaProducto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormMarcaProducto.isMaximum()) {
					this.jInternalFrameDetalleFormMarcaProducto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormMarcaProducto.setSize(this.jInternalFrameDetalleFormMarcaProducto.iWidthFormulario,this.jInternalFrameDetalleFormMarcaProducto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormMarcaProducto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormMarcaProducto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormMarcaProducto.isMaximum()) {
						this.jInternalFrameDetalleFormMarcaProducto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormMarcaProducto.jContentPaneDetalleMarcaProducto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormMarcaProducto.jTabbedPaneRelacionesMarcaProducto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormMarcaProducto.jContentPaneDetalleMarcaProducto.getWidth(),MarcaProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMarcaProducto.jTabbedPaneRelacionesMarcaProducto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormMarcaProducto.jContentPaneDetalleMarcaProducto.getWidth(),MarcaProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMarcaProducto.jTabbedPaneRelacionesMarcaProducto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormMarcaProducto.jContentPaneDetalleMarcaProducto.getWidth(),MarcaProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();
					}

					if(ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProducto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormMarcaProducto.setVisible(true);
	        this.jInternalFrameDetalleFormMarcaProducto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByMarcaProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByMarcaProducto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByMarcaProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMarcaProducto,false,this);
				} else {
					this.jInternalFrameOrderByMarcaProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMarcaProducto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByMarcaProducto);
				this.jInternalFrameOrderByMarcaProducto.setVisible(false);
				this.jInternalFrameOrderByMarcaProducto.setSelected(false);
				
				this.jInternalFrameOrderByMarcaProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMarcaProducto"));
				
				this.inicializarActualizarBindingTablaOrderByMarcaProducto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionMarcaProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionMarcaProducto==null) {
				
				this.jInternalFrameImportacionMarcaProducto=new ImportacionJInternalFrame(MarcaProductoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMarcaProducto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionMarcaProducto);
				this.jInternalFrameImportacionMarcaProducto.setVisible(false);
				this.jInternalFrameImportacionMarcaProducto.setSelected(false);


				this.jInternalFrameImportacionMarcaProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMarcaProducto"));
				this.jInternalFrameImportacionMarcaProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMarcaProducto"));
				this.jInternalFrameImportacionMarcaProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMarcaProducto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoMarcaProducto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoMarcaProducto==null) {
				this.jInternalFrameReporteDinamicoMarcaProducto=new ReporteDinamicoJInternalFrame(MarcaProductoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMarcaProducto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMarcaProducto);
				this.jInternalFrameReporteDinamicoMarcaProducto.setVisible(false);
				this.jInternalFrameReporteDinamicoMarcaProducto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoMarcaProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMarcaProducto"));
				this.jInternalFrameReporteDinamicoMarcaProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMarcaProducto"));
				this.jInternalFrameReporteDinamicoMarcaProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMarcaProducto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMarcaProducto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaParametroInventarioDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormMarcaProducto.jContentPaneDetalleMarcaProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProducto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormMarcaProducto.jContentPaneDetalleMarcaProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleMarcaProducto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormMarcaProducto);
			
	       	this.jInternalFrameDetalleFormMarcaProducto.setVisible(false);
	        this.jInternalFrameDetalleFormMarcaProducto.setSelected(false);
			
			//this.jInternalFrameDetalleFormMarcaProducto.dispose();
			//this.jInternalFrameDetalleFormMarcaProducto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoMarcaProducto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoMarcaProducto.setVisible(true);
	        this.jInternalFrameReporteDinamicoMarcaProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionMarcaProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionMarcaProducto.setVisible(true);
	        this.jInternalFrameImportacionMarcaProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByMarcaProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByMarcaProducto.setVisible(true);
	        this.jInternalFrameOrderByMarcaProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByMarcaProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByMarcaProducto.setVisible(false);
	        this.jInternalFrameOrderByMarcaProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoMarcaProducto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoMarcaProducto.setVisible(false);
	        this.jInternalFrameReporteDinamicoMarcaProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionMarcaProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionMarcaProducto.setVisible(false);
	        this.jInternalFrameImportacionMarcaProducto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarMarcaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarMarcaProducto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarMarcaProducto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMarcaProducto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesMarcaProducto(true);
			//this.isEsNuevoMarcaProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproducto =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.marcaproducto =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesMarcaProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMarcaProducto(false) ;
			
			if(marcaproductoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado() && ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(MarcaProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMarcaProducto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMarcaProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaMarcaProductoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosMarcaProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproducto =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.marcaproducto =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarMarcaProducto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMarcaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMarcaProducto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesMarcaProducto(true);
			//this.isEsNuevoMarcaProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproducto =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.marcaproducto =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.marcaproducto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesMarcaProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesMarcaProducto(false) ;
			
			if(MarcaProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMarcaProducto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMarcaProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoProducto(List<TipoProducto> tipoproductosForeignKey)throws Exception{
		TableColumn tableColumnTipoProducto=this.jTableDatosMarcaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMarcaProducto,MarcaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO));
		TableCellEditor tableCellEditorTipoProducto =tableColumnTipoProducto.getCellEditor();

		TipoProductoTableCell tipoproductoTableCellFk=(TipoProductoTableCell)tableCellEditorTipoProducto;

		if(tipoproductoTableCellFk!=null) {
			tipoproductoTableCellFk.settipoproductosForeignKey(tipoproductosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosMarcaProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoproductoTableCellFk.setRowActual(intSelectedRow);
			//tipoproductoTableCellFk.settipoproductosForeignKeyActual(tipoproductosForeignKey);
		//}


		if(tipoproductoTableCellFk!=null) {
			tipoproductoTableCellFk.RecargarTipoProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarMarcaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesMarcaProducto(false);
			
			//if(!this.isEsNuevoMarcaProducto) {								
				int intSelectedRow = this.jTableDatosMarcaProducto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproducto =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.marcaproducto =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(MarcaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualMarcaProducto(this.marcaproducto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysMarcaProducto(this.marcaproducto);
				
			}
			
			if(this.permiteMantenimiento(this.marcaproducto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoMarcaProducto=true;
					this.inicializarActualizarBindingTablaMarcaProducto(false);
					this.isEsNuevoMarcaProducto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoMarcaProducto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoMarcaProducto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMarcaProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMarcaProducto(false);
				
				this.habilitarDeshabilitarControlesMarcaProducto(false);
			
												
				
				if(MarcaProductoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleMarcaProducto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoMarcaProductoActionPerformed(evt,marcaproductoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualMarcaProducto(this.marcaproducto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosMarcaProducto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,marcaproductoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.marcaproducto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(MarcaProducto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MarcaProducto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarMarcaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosMarcaProducto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproducto =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				this.marcaproducto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.marcaproducto =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				this.marcaproducto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.marcaproducto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((MarcaProductoModel) this.jTableDatosMarcaProducto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoMarcaProducto=true;
				this.inicializarActualizarBindingTablaMarcaProducto(false);
				this.isEsNuevoMarcaProducto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMarcaProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMarcaProducto(false);
				
				this.habilitarDeshabilitarControlesMarcaProducto(false);
				
				
				
				if(MarcaProductoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleMarcaProducto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarMarcaProductoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosMarcaProducto.getRowCount()>=1) {
				jTableDatosMarcaProducto.removeRowSelectionInterval(0, jTableDatosMarcaProducto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesMarcaProducto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaMarcaProducto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMarcaProducto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMarcaProducto(false) ;
			
			this.isEsNuevoMarcaProducto=false;
			
			if(MarcaProductoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleMarcaProducto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosMarcaProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingMarcaProducto(false);
				
				//SI ES MANUAL
				if(MarcaProductoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualMarcaProducto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosMarcaProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoMarcaProducto--;			
			//MarcaProducto marcaproductoAux= new MarcaProducto();			
			//marcaproductoAux.setId(this.iIdNuevoMarcaProducto);
			
			if(this.jInternalFrameDetalleFormMarcaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaMarcaProducto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysMarcaProducto(this.marcaproducto);
			
			this.marcaproducto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.marcaproductoLogic.getMarcaProductos().add(this.marcaproductoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.marcaproductos.add(this.marcaproductoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaMarcaProducto(false);
			
			this.jTableDatosMarcaProducto.setRowSelectionInterval(this.getIndiceNuevoMarcaProducto(), this.getIndiceNuevoMarcaProducto());
			
			int iLastRow =  this.jTableDatosMarcaProducto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosMarcaProducto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosMarcaProducto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaMarcaProducto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionMarcaProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingMarcaProducto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMarcaProducto(false);
			
			//SI ES MANUAL
			if(MarcaProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMarcaProducto();
			}
			
			//this.abrirFrameTreeMarcaProducto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionMarcaProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Marca ProductoS ?", "MANTENIMIENTO DE Marca Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionMarcaProducto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralMarcaProducto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.marcaproductoReturnGeneral=marcaproductoLogic.procesarImportacionMarcaProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.marcaproductoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarMarcaProductoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionMarcaProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionMarcaProducto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionMarcaProducto.setFileImportacion(this.jInternalFrameImportacionMarcaProducto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionMarcaProducto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionMarcaProducto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionMarcaProducto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionMarcaProducto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoMarcaProductoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<MarcaProducto> marcaproductosSeleccionados=new ArrayList<MarcaProducto>();		

		marcaproductosSeleccionados=this.getMarcaProductosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMarcaProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMarcaProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("MarcaProductoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"MarcaProductoBaseDesign.jrxml";
			
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
			
			this.generarReporteMarcaProductos("Todos",marcaproductosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.marcaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Marca Producto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoMarcaProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMarcaProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MarcaProductoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MarcaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MarcaProductoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MarcaProductoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoMarcaProducto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoMarcaProducto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoMarcaProducto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case MarcaProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case MarcaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					sNombreCampoCategoria="id_tipo_producto";
					break;

				case MarcaProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case MarcaProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoMarcaProducto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case MarcaProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case MarcaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					sNombreCampoCategoriaValor="id_tipo_producto";
					break;

				case MarcaProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case MarcaProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoMarcaProducto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMarcaProducto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MarcaProductoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case MarcaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_producto");
					break;

				case MarcaProductoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case MarcaProductoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoMarcaProductoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<MarcaProducto> marcaproductosSeleccionados=new ArrayList<MarcaProducto>();		
		
		marcaproductosSeleccionados=this.getMarcaProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"marcaproducto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("MarcaProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoMarcaProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoMarcaProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case MarcaProductoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MarcaProductoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(MarcaProducto marcaproducto:marcaproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(marcaproducto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MarcaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MarcaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
					iRow++;

					for(MarcaProducto marcaproducto:marcaproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(marcaproducto.gettipoproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MarcaProductoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MarcaProductoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(MarcaProducto marcaproducto:marcaproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(marcaproducto.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MarcaProductoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MarcaProductoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(MarcaProducto marcaproducto:marcaproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(marcaproducto.getnombre());
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
			//	this.getFilaCabeceraExportarExcelMarcaProducto(row);				
			//	iRow++;
			//}				
			
			//for(MarcaProducto marcaproductoAux:marcaproductosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelMarcaProducto(marcaproductoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.marcaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Marca Producto",JOptionPane.INFORMATION_MESSAGE);
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
				this.marcaproductoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMarcaProducto(false);
			
			//SI ES MANUAL
			if(MarcaProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMarcaProducto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresMarcaProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMarcaProducto(false);
			
			//SI ES MANUAL
			if(MarcaProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMarcaProducto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesMarcaProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMarcaProducto(false);
			
			//SI ES MANUAL
			if(MarcaProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMarcaProducto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaMarcaProducto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosMarcaProducto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosMarcaProducto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosMarcaProducto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosMarcaProducto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosMarcaProducto.setMinimumSize(dimensionMinimum);
		this.jTableDatosMarcaProducto.setMaximumSize(dimensionMaximum);
		this.jTableDatosMarcaProducto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingMarcaProducto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingMarcaProducto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingMarcaProducto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaMarcaProducto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesMarcaProducto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasMarcaProducto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMarcaProducto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesMarcaProducto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !MarcaProductoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!MarcaProductoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualMarcaProducto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaMarcaProducto();
		
		this.inicializarActualizarBindingBotonesManualMarcaProducto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualMarcaProducto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMarcaProducto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualMarcaProducto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualMarcaProducto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosMarcaProducto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosMarcaProducto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteMarcaProducto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormMarcaProducto.jCheckBoxPostAccionNuevoMarcaProducto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormMarcaProducto.jCheckBoxPostAccionSinCerrarMarcaProducto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormMarcaProducto.jCheckBoxPostAccionSinMensajeMarcaProducto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosMarcaProducto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosMarcaProducto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteMarcaProducto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
				this.jInternalFrameDetalleFormMarcaProducto.jCheckBoxPostAccionNuevoMarcaProducto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormMarcaProducto.jCheckBoxPostAccionSinCerrarMarcaProducto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormMarcaProducto.jCheckBoxPostAccionSinMensajeMarcaProducto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionMarcaProducto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionMarcaProducto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormMarcaProducto.jComboBoxTiposAccionesFormularioMarcaProducto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesMarcaProducto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoMarcaProducto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMarcaProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesMarcaProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesMarcaProducto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarMarcaProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesMarcaProducto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoMarcaProducto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMarcaProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesMarcaProducto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralMarcaProducto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesMarcaProducto(Boolean esInicializar) throws Exception {
		try	{	
			if(MarcaProductoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualMarcaProducto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesMarcaProducto() throws Exception {
		try	{
			if(MarcaProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualMarcaProducto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMarcaProducto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormMarcaProducto.jComboBoxTiposAccionesFormularioMarcaProducto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormMarcaProducto.jComboBoxTiposAccionesFormularioMarcaProducto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualMarcaProducto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesMarcaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesMarcaProducto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesMarcaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesMarcaProducto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesMarcaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesMarcaProducto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionMarcaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionMarcaProducto.addItem(reporte);
			}
			
			
			if(!this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionMarcaProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionMarcaProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesMarcaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesMarcaProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesMarcaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesMarcaProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormMarcaProducto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormMarcaProducto.jComboBoxTiposAccionesFormularioMarcaProducto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormMarcaProducto.jComboBoxTiposAccionesFormularioMarcaProducto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarMarcaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarMarcaProducto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarMarcaProducto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMarcaProducto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMarcaProducto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMarcaProducto!=null) {
				this.jInternalFrameReporteDinamicoMarcaProducto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoMarcaProducto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMarcaProducto!=null) {
				this.jInternalFrameReporteDinamicoMarcaProducto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoMarcaProducto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoMarcaProducto!=null) {
				
				if(this.jInternalFrameReporteDinamicoMarcaProducto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMarcaProducto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMarcaProducto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoMarcaProducto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMarcaProducto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMarcaProducto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualMarcaProducto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoMarcaProducto.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreMarcaProducto.getText();
		if(this.jComboBoxid_tipo_productoFK_IdTipoProductoMarcaProducto.getSelectedItem()!=null){this.id_tipo_productoFK_IdTipoProducto=((TipoProducto)this.jComboBoxid_tipo_productoFK_IdTipoProductoMarcaProducto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasMarcaProducto(Boolean esInicializar) throws Exception {				
		if(MarcaProductoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualMarcaProducto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaMarcaProducto() throws Exception {
		this.inicializarActualizarBindingTablaMarcaProducto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByMarcaProducto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByMarcaProducto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByMarcaProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMarcaProducto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new MarcaProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByMarcaProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMarcaProducto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new MarcaProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosMarcaProductoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMarcaProductoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new MarcaProductoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByMarcaProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMarcaProducto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new MarcaProductoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByMarcaProducto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaMarcaProducto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=marcaproductoLogic.getMarcaProductos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=marcaproductos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(MarcaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosMarcaProducto.setModel(new MarcaProductoModel(this.marcaproductoLogic.getMarcaProductos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosMarcaProducto.setModel(new MarcaProductoModel(this.marcaproductos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByMarcaProducto!=null && this.jInternalFrameOrderByMarcaProducto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByMarcaProducto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosMarcaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMarcaProducto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new MarcaProductoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO,marcaproductoConstantesFunciones.resaltarSeleccionarMarcaProducto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO,marcaproductoConstantesFunciones.resaltarSeleccionarMarcaProducto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosMarcaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMarcaProducto,MarcaProductoConstantesFunciones.LABEL_ID));

		if(this.marcaproductoConstantesFunciones.mostraridMarcaProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MarcaProductoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.marcaproductoConstantesFunciones.resaltaridMarcaProducto,this.marcaproductoConstantesFunciones.activaridMarcaProducto,this,true,"idMarcaProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.marcaproductoConstantesFunciones.resaltaridMarcaProducto,this.marcaproductoConstantesFunciones.activaridMarcaProducto,this,true,"idMarcaProducto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMarcaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMarcaProducto,MarcaProductoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.marcaproductoConstantesFunciones.mostrarid_empresaMarcaProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MarcaProductoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.marcaproductoConstantesFunciones.resaltarid_empresaMarcaProducto,this,this.marcaproductoConstantesFunciones.activarid_empresaMarcaProducto));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.marcaproductoConstantesFunciones.resaltarid_empresaMarcaProducto,this,this.marcaproductoConstantesFunciones.activarid_empresaMarcaProducto,false,"id_empresaMarcaProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MarcaProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMarcaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMarcaProducto,MarcaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO));

		if(this.marcaproductoConstantesFunciones.mostrarid_tipo_productoMarcaProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MarcaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoProductoTableCell(this.tipoproductosForeignKey,this.marcaproductoConstantesFunciones.resaltarid_tipo_productoMarcaProducto,this,this.marcaproductoConstantesFunciones.activarid_tipo_productoMarcaProducto));
			tableColumn.setCellEditor(new TipoProductoTableCell(this.tipoproductosForeignKey,this.marcaproductoConstantesFunciones.resaltarid_tipo_productoMarcaProducto,this,this.marcaproductoConstantesFunciones.activarid_tipo_productoMarcaProducto,true,"id_tipo_productoMarcaProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MarcaProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMarcaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMarcaProducto,MarcaProductoConstantesFunciones.LABEL_CODIGO));

		if(this.marcaproductoConstantesFunciones.mostrarcodigoMarcaProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MarcaProductoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.marcaproductoConstantesFunciones.resaltarcodigoMarcaProducto,this.marcaproductoConstantesFunciones.activarcodigoMarcaProducto,this,true,"codigoMarcaProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.marcaproductoConstantesFunciones.resaltarcodigoMarcaProducto,this.marcaproductoConstantesFunciones.activarcodigoMarcaProducto,this,true,"codigoMarcaProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MarcaProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMarcaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMarcaProducto,MarcaProductoConstantesFunciones.LABEL_NOMBRE));

		if(this.marcaproductoConstantesFunciones.mostrarnombreMarcaProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MarcaProductoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.marcaproductoConstantesFunciones.resaltarnombreMarcaProducto,this.marcaproductoConstantesFunciones.activarnombreMarcaProducto,this,true,"nombreMarcaProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.marcaproductoConstantesFunciones.resaltarnombreMarcaProducto,this.marcaproductoConstantesFunciones.activarnombreMarcaProducto,this,true,"nombreMarcaProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MarcaProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.marcaproductoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosProducto && this.marcaproductoConstantesFunciones.mostrarProductoMarcaProducto && !MarcaProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Productos");
				tableColumn.setHeaderValue("Productos");
				tableColumn.setCellRenderer(new ProductoTableCell(marcaproductoConstantesFunciones.resaltarProductoMarcaProducto,this,this.marcaproductoConstantesFunciones.activarProductoMarcaProducto));
				tableColumn.setCellEditor(new ProductoTableCell(marcaproductoConstantesFunciones.resaltarProductoMarcaProducto,this,this.marcaproductoConstantesFunciones.activarProductoMarcaProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosMarcaProducto.addColumn(tableColumn);
			}

			if(this.isTienePermisosParametroInventarioDefecto && this.marcaproductoConstantesFunciones.mostrarParametroInventarioDefectoMarcaProducto && !MarcaProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Inventario Defectos");
				tableColumn.setHeaderValue("Parametro Inventario Defectos");
				tableColumn.setCellRenderer(new ParametroInventarioDefectoTableCell(marcaproductoConstantesFunciones.resaltarParametroInventarioDefectoMarcaProducto,this,this.marcaproductoConstantesFunciones.activarParametroInventarioDefectoMarcaProducto));
				tableColumn.setCellEditor(new ParametroInventarioDefectoTableCell(marcaproductoConstantesFunciones.resaltarParametroInventarioDefectoMarcaProducto,this,this.marcaproductoConstantesFunciones.activarParametroInventarioDefectoMarcaProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosMarcaProducto.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.marcaproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.marcaproductoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMarcaProducto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.marcaproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.marcaproductoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMarcaProducto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarMarcaProducto && this.isPermisoGuardarCambiosMarcaProducto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.marcaproductoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.marcaproductoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosMarcaProducto.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.marcaproductoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosMarcaProducto.addColumn(tableColumn);
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
			
			this.jTableDatosMarcaProducto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMarcaProducto && this.isPermisoGuardarCambiosMarcaProducto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.marcaproductoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMarcaProducto && this.isPermisoGuardarCambiosMarcaProducto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosMarcaProducto.moveColumn(this.jTableDatosMarcaProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosMarcaProducto.moveColumn(this.jTableDatosMarcaProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.marcaproductoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosMarcaProducto.moveColumn(this.jTableDatosMarcaProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosMarcaProducto.moveColumn(this.jTableDatosMarcaProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosMarcaProducto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosMarcaProducto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosMarcaProducto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!MarcaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosMarcaProducto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosMarcaProducto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!MarcaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!MarcaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosMarcaProducto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosMarcaProducto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosMarcaProducto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=marcaproductoLogic.getMarcaProductos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=marcaproductos.size()-1;
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
		//this.jTableDatosMarcaProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosMarcaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosMarcaProducto();
			
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
				
				//this.isEsNuevoMarcaProducto=false;
					
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
			
				if(this.marcaproductoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormMarcaProducto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMarcaProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMarcaProducto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproducto =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.marcaproducto =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.marcaproducto.getsType().equals("DUPLICADO")
				   || this.marcaproducto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoMarcaProducto=true;
				
				} else {
					this.isEsNuevoMarcaProducto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
					if(this.marcaproducto.getId()>=0 && !this.marcaproducto.getIsNew()) {						
						this.isEsNuevoMarcaProducto=false;
						
					} else {
						this.isEsNuevoMarcaProducto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoMarcaProducto(esRelaciones);						
				
				this.seleccionarMarcaProducto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.marcaproducto.getId()<0) {
					this.isEsNuevoMarcaProducto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarMarcaProducto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarMarcaProducto(evt,rowIndex);
				}	
				
				if(this.marcaproductoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion MarcaProducto: " + this.dDif); 
					}
				}								
				
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarMarcaProducto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.marcaproducto)) {
					if(this.marcaproducto.getId()>0) {
						this.marcaproducto.setIsDeleted(true);
						
						this.marcaproductosEliminados.add(this.marcaproducto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.marcaproductoLogic.getMarcaProductos().remove(this.marcaproducto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.marcaproductos.remove(this.marcaproducto);				
					}
					
					
					((MarcaProductoModel) this.jTableDatosMarcaProducto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaMarcaProducto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarMarcaProducto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoMarcaProducto) {
			
			if(this.jInternalFrameDetalleFormMarcaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMarcaProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMarcaProducto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproducto =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.marcaproducto =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(MarcaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioMarcaProducto(this.marcaproducto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.marcaproductoConstantesFunciones.cargarid_empresaMarcaProducto || this.marcaproductoConstantesFunciones.event_dependid_empresaMarcaProducto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.marcaproducto.getid_empresa());
									//this.inicializarActualizarBindingMarcaProducto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(marcaproducto.getEmpresa()!=null) {
							this.empresasForeignKey.add(marcaproducto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.marcaproducto.getid_empresa(),false,"Formulario");

					//TipoProducto
					if(!this.marcaproductoConstantesFunciones.cargarid_tipo_productoMarcaProducto || this.marcaproductoConstantesFunciones.event_dependid_tipo_productoMarcaProducto) {
						//this.cargarCombosTipoProductosForeignKeyLista(" where id="+this.marcaproducto.getid_tipo_producto());
									//this.inicializarActualizarBindingMarcaProducto(false,false);
						this.tipoproductosForeignKey=new ArrayList<TipoProducto>();

						if(marcaproducto.getTipoProducto()!=null) {
							this.tipoproductosForeignKey.add(marcaproducto.getTipoProducto());
						}

						this.addItemDefectoCombosForeignKeyTipoProducto();
						this.cargarCombosFrameTipoProductosForeignKey("Todos");
					}
					this.setActualTipoProductoForeignKey(this.marcaproducto.getid_tipo_producto(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesMarcaProducto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesMarcaProducto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMarcaProducto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoMarcaProducto(MarcaProducto marcaproducto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoMarcaProducto(marcaproducto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoMarcaProducto(MarcaProducto marcaproducto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioMarcaProducto(marcaproducto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyMarcaProducto(marcaproducto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyMarcaProducto(marcaproducto);
	}
	
	public void setVariablesObjetoActualToFormularioMarcaProducto(MarcaProducto marcaproducto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormMarcaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormMarcaProducto.jLabelidMarcaProducto.setText(marcaproducto.getId().toString());
			this.jInternalFrameDetalleFormMarcaProducto.jTextFieldcodigoMarcaProducto.setText(marcaproducto.getcodigo());
			this.jInternalFrameDetalleFormMarcaProducto.jTextAreanombreMarcaProducto.setText(marcaproducto.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,MarcaProducto marcaproductoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,marcaproductoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,MarcaProducto marcaproductoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				marcaproductoLocal=this.marcaproducto;
			} else {
				marcaproductoLocal=this.marcaproductoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(marcaproductoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoMarcaProducto(marcaproductoLocal,true);
					
					if(marcaproductoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(marcaproductoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(marcaproductoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoMarcaProducto(MarcaProducto marcaproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMarcaProducto(marcaproducto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysMarcaProducto(marcaproducto);
	}
	
	public void setVariablesFormularioToObjetoActualMarcaProducto(MarcaProducto marcaproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMarcaProducto(marcaproducto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualMarcaProducto(MarcaProducto marcaproducto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormMarcaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormMarcaProducto.jLabelidMarcaProducto.getText()==null || this.jInternalFrameDetalleFormMarcaProducto.jLabelidMarcaProducto.getText()=="" || this.jInternalFrameDetalleFormMarcaProducto.jLabelidMarcaProducto.getText()=="Id") {
				this.jInternalFrameDetalleFormMarcaProducto.jLabelidMarcaProducto.setText("0");
			}

			if(conColumnasBase) {marcaproducto.setId(Long.parseLong(this.jInternalFrameDetalleFormMarcaProducto.jLabelidMarcaProducto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MarcaProductoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMarcaProducto.jLabelIdMarcaProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			marcaproducto.setcodigo(this.jInternalFrameDetalleFormMarcaProducto.jTextFieldcodigoMarcaProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MarcaProductoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMarcaProducto.jLabelcodigoMarcaProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			marcaproducto.setnombre(this.jInternalFrameDetalleFormMarcaProducto.jTextAreanombreMarcaProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MarcaProductoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMarcaProducto.jLabelnombreMarcaProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMarcaProducto(MarcaProducto marcaproductoBean,MarcaProducto marcaproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && marcaproductoBean.getid_tipo_producto()!=null && !marcaproductoBean.getid_tipo_producto().equals(-1L))) {marcaproducto.setid_tipo_producto(marcaproductoBean.getid_tipo_producto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosMarcaProducto(MarcaProducto marcaproductoOrigen,MarcaProducto marcaproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && marcaproductoOrigen.getId()!=null && !marcaproductoOrigen.getId().equals(0L))) {marcaproducto.setId(marcaproductoOrigen.getId());}}
			if(conDefault || (!conDefault && marcaproductoOrigen.getid_tipo_producto()!=null && !marcaproductoOrigen.getid_tipo_producto().equals(-1L))) {marcaproducto.setid_tipo_producto(marcaproductoOrigen.getid_tipo_producto());}
			if(conDefault || (!conDefault && marcaproductoOrigen.getcodigo()!=null && !marcaproductoOrigen.getcodigo().equals(""))) {marcaproducto.setcodigo(marcaproductoOrigen.getcodigo());}
			if(conDefault || (!conDefault && marcaproductoOrigen.getnombre()!=null && !marcaproductoOrigen.getnombre().equals(""))) {marcaproducto.setnombre(marcaproductoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMarcaProducto(MarcaProducto marcaproducto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMarcaProducto.jLabelidMarcaProducto.setText(marcaproducto.getId().toString());
			this.jInternalFrameDetalleFormMarcaProducto.jTextFieldcodigoMarcaProducto.setText(marcaproducto.getcodigo());
			this.jInternalFrameDetalleFormMarcaProducto.jTextAreanombreMarcaProducto.setText(marcaproducto.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMarcaProducto(MarcaProductoBean marcaproductoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMarcaProducto.jLabelidMarcaProducto.setText(marcaproductoBean.getId().toString());
			this.jInternalFrameDetalleFormMarcaProducto.jTextFieldcodigoMarcaProducto.setText(marcaproductoBean.getcodigo());
			this.jInternalFrameDetalleFormMarcaProducto.jTextAreanombreMarcaProducto.setText(marcaproductoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanMarcaProducto(MarcaProductoParameterReturnGeneral marcaproductoReturnGeneral,MarcaProductoBean marcaproductoBean,Boolean conDefault) throws Exception { 
		try {
			MarcaProducto marcaproductoLocal=new MarcaProducto();
			
			marcaproductoLocal=marcaproductoReturnGeneral.getMarcaProducto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && marcaproductoLocal.getId()!=null && !marcaproductoLocal.getId().equals(0L))) {marcaproductoBean.setId(marcaproductoLocal.getId());}}
			if(conDefault || (!conDefault && marcaproductoLocal.getid_tipo_producto()!=null && !marcaproductoLocal.getid_tipo_producto().equals(-1L))) {marcaproductoBean.setid_tipo_producto(marcaproductoLocal.getid_tipo_producto());}
			if(conDefault || (!conDefault && marcaproductoLocal.getcodigo()!=null && !marcaproductoLocal.getcodigo().equals(""))) {marcaproductoBean.setcodigo(marcaproductoLocal.getcodigo());}
			if(conDefault || (!conDefault && marcaproductoLocal.getnombre()!=null && !marcaproductoLocal.getnombre().equals(""))) {marcaproductoBean.setnombre(marcaproductoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxMarcaProductoGenerico(Long idMarcaProductoSeleccionado,JComboBox jComboBoxMarcaProducto,List<MarcaProducto> marcaproductosLocal)throws Exception {
		try {
			MarcaProducto  marcaproductoTemp=null;

			for(MarcaProducto marcaproductoAux:marcaproductosLocal) {
				if(marcaproductoAux.getId()!=null && marcaproductoAux.getId().equals(idMarcaProductoSeleccionado)) {
					marcaproductoTemp=marcaproductoAux;
					break;
				}
			}

			jComboBoxMarcaProducto.setSelectedItem(marcaproductoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxMarcaProductoGenerico(JComboBox jComboBoxMarcaProducto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxMarcaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMarcaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxMarcaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMarcaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMarcaProducto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxMarcaProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMarcaProducto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxMarcaProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxMarcaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxMarcaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			marcaproducto=(MarcaProducto) marcaproductoLogic.getMarcaProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			marcaproducto =(MarcaProducto) marcaproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!marcaproducto.getIsNew() && !marcaproducto.getIsChanged() && !marcaproducto.getIsDeleted()) {
				sDescripcion=marcaproducto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=marcaproducto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoProducto")) {
			//sDescripcion=this.getActualTipoProductoForeignKeyDescripcion((Long)value);
			if(!marcaproducto.getIsNew() && !marcaproducto.getIsChanged() && !marcaproducto.getIsDeleted()) {
				sDescripcion=marcaproducto.gettipoproducto_descripcion();
			} else {
				//sDescripcion=this.getActualTipoProductoForeignKeyDescripcion((Long)value);
				sDescripcion=marcaproducto.gettipoproducto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		MarcaProducto marcaproductoRow=new MarcaProducto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			marcaproductoRow=(MarcaProducto) marcaproductoLogic.getMarcaProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			marcaproductoRow=(MarcaProducto) marcaproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonProductoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,MarcaProducto marcaproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormMarcaProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.marcaproducto = (MarcaProducto)this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.marcaproducto = (MarcaProducto)this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(marcaproducto!=null) {
						this.marcaproducto = marcaproducto;
					} else {
						this.marcaproducto = new MarcaProducto();
					}
				}

				if(this.isTienePermisosProducto && this.permiteMantenimiento(this.marcaproducto)) {
					ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFramePopup=new ProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFramePopup;
					} else {
						productoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame;
					}

					List<MarcaProducto> marcaproductos=new ArrayList<MarcaProducto>();
					marcaproductos.add(this.marcaproducto);
					if(!esRelacionado) {
						//productoBeanSwingJInternalFrame.productoSessionBean.setConGuardarRelaciones(false);
						//productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormMarcaProducto.cargarProductoBeanSwingJInternalFrame(marcaproductos,this.marcaproducto,productoBeanSwingJInternalFrame,/*conInicializar,*/productoBeanSwingJInternalFrame.productoSessionBean.getConGuardarRelaciones(),productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado());
					productoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoBeanSwingJInternalFrame.actualizarEstadoPanelsProducto("no_relacionado");

						productoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoConstantesFunciones.ITAMANIOFILATABLA + (ProductoConstantesFunciones.ITAMANIOFILATABLA/2));

						productoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderMarcaProducto=(TitledBorder)this.jScrollPanelDatosMarcaProducto.getBorder();
						TitledBorder titledBorderProducto=(TitledBorder)productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

						titledBorderProducto.setTitle(titledBorderMarcaProducto.getTitle() + " -> Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoBeanSwingJInternalFrame);
						}

						productoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoBeanSwingJInternalFrame);

						productoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.marcaproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonParametroInventarioDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,MarcaProducto marcaproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormMarcaProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.marcaproducto = (MarcaProducto)this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.marcaproducto = (MarcaProducto)this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(marcaproducto!=null) {
						this.marcaproducto = marcaproducto;
					} else {
						this.marcaproducto = new MarcaProducto();
					}
				}

				if(this.isTienePermisosParametroInventarioDefecto && this.permiteMantenimiento(this.marcaproducto)) {
					ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFramePopup=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFramePopup;
					} else {
						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame;
					}

					List<MarcaProducto> marcaproductos=new ArrayList<MarcaProducto>();
					marcaproductos.add(this.marcaproducto);
					if(!esRelacionado) {
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setConGuardarRelaciones(false);
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormMarcaProducto.cargarParametroInventarioDefectoBeanSwingJInternalFrame(marcaproductos,this.marcaproducto,parametroinventariodefectoBeanSwingJInternalFrame,/*conInicializar,*/parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getConGuardarRelaciones(),parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("no_relacionado");

						parametroinventariodefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametroinventariodefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderMarcaProducto=(TitledBorder)this.jScrollPanelDatosMarcaProducto.getBorder();
						TitledBorder titledBorderParametroInventarioDefecto=(TitledBorder)parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getBorder();

						titledBorderParametroInventarioDefecto.setTitle(titledBorderMarcaProducto.getTitle() + " -> Parametro Inventario Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametroinventariodefectoBeanSwingJInternalFrame);
						}

						parametroinventariodefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametroinventariodefectoBeanSwingJInternalFrame);

						parametroinventariodefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.marcaproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Inventario Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualMarcaProducto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoMarcaProducto.setVisible((this.isVisibilidadCeldaNuevoMarcaProducto && this.isPermisoNuevoMarcaProducto));			
			this.jButtonDuplicarMarcaProducto.setVisible((this.isVisibilidadCeldaDuplicarMarcaProducto && this.isPermisoDuplicarMarcaProducto));			
			this.jButtonCopiarMarcaProducto.setVisible((this.isVisibilidadCeldaCopiarMarcaProducto && this.isPermisoCopiarMarcaProducto));
			this.jButtonVerFormMarcaProducto.setVisible((this.isVisibilidadCeldaVerFormMarcaProducto && this.isPermisoVerFormMarcaProducto));
			
			this.jButtonAbrirOrderByMarcaProducto.setVisible((this.isVisibilidadCeldaOrdenMarcaProducto && this.isPermisoOrdenMarcaProducto));			
			
			this.jButtonNuevoRelacionesMarcaProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesMarcaProducto && this.isPermisoNuevoMarcaProducto));			
			this.jButtonNuevoGuardarCambiosMarcaProducto.setVisible((this.isVisibilidadCeldaNuevoMarcaProducto && this.isPermisoNuevoMarcaProducto && this.isPermisoGuardarCambiosMarcaProducto));
			
			if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
			this.jInternalFrameDetalleFormMarcaProducto.jButtonModificarMarcaProducto.setVisible((this.isVisibilidadCeldaModificarMarcaProducto && this.isPermisoActualizarMarcaProducto));	
			this.jInternalFrameDetalleFormMarcaProducto.jButtonActualizarMarcaProducto.setVisible((this.isVisibilidadCeldaActualizarMarcaProducto && this.isPermisoActualizarMarcaProducto));	
			this.jInternalFrameDetalleFormMarcaProducto.jButtonEliminarMarcaProducto.setVisible((this.isVisibilidadCeldaEliminarMarcaProducto && this.isPermisoEliminarMarcaProducto));
			this.jInternalFrameDetalleFormMarcaProducto.jButtonCancelarMarcaProducto.setVisible(this.isVisibilidadCeldaCancelarMarcaProducto);							
			this.jInternalFrameDetalleFormMarcaProducto.jButtonGuardarCambiosMarcaProducto.setVisible((this.isVisibilidadCeldaGuardarMarcaProducto && this.isPermisoGuardarCambiosMarcaProducto));			
			
			}
						
			this.jButtonGuardarCambiosTablaMarcaProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosMarcaProducto && this.isPermisoGuardarCambiosMarcaProducto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarMarcaProducto.setVisible((this.isVisibilidadCeldaNuevoMarcaProducto && this.isPermisoNuevoMarcaProducto));						
			this.jButtonDuplicarToolBarMarcaProducto.setVisible((this.isVisibilidadCeldaDuplicarMarcaProducto && this.isPermisoDuplicarMarcaProducto));						
			this.jButtonCopiarToolBarMarcaProducto.setVisible((this.isVisibilidadCeldaCopiarMarcaProducto && this.isPermisoCopiarMarcaProducto));			
			this.jButtonVerFormToolBarMarcaProducto.setVisible((this.isVisibilidadCeldaVerFormMarcaProducto && this.isPermisoVerFormMarcaProducto));			
			this.jButtonAbrirOrderByToolBarMarcaProducto.setVisible((this.isVisibilidadCeldaOrdenMarcaProducto && this.isPermisoOrdenMarcaProducto));
			this.jButtonNuevoRelacionesToolBarMarcaProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesMarcaProducto && this.isPermisoNuevoMarcaProducto));			
			this.jButtonNuevoGuardarCambiosToolBarMarcaProducto.setVisible((this.isVisibilidadCeldaNuevoMarcaProducto && this.isPermisoNuevoMarcaProducto && this.isPermisoGuardarCambiosMarcaProducto));			
			
			if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
			this.jInternalFrameDetalleFormMarcaProducto.jButtonModificarToolBarMarcaProducto.setVisible((this.isVisibilidadCeldaModificarMarcaProducto && this.isPermisoActualizarMarcaProducto));	
			this.jInternalFrameDetalleFormMarcaProducto.jButtonActualizarToolBarMarcaProducto.setVisible((this.isVisibilidadCeldaActualizarMarcaProducto  && this.isPermisoActualizarMarcaProducto));	
			this.jInternalFrameDetalleFormMarcaProducto.jButtonEliminarToolBarMarcaProducto.setVisible((this.isVisibilidadCeldaEliminarMarcaProducto && this.isPermisoEliminarMarcaProducto));
			this.jInternalFrameDetalleFormMarcaProducto.jButtonCancelarToolBarMarcaProducto.setVisible(this.isVisibilidadCeldaCancelarMarcaProducto);				
			this.jInternalFrameDetalleFormMarcaProducto.jButtonGuardarCambiosToolBarMarcaProducto.setVisible((this.isVisibilidadCeldaGuardarMarcaProducto && this.isPermisoGuardarCambiosMarcaProducto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarMarcaProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosMarcaProducto && this.isPermisoGuardarCambiosMarcaProducto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoMarcaProducto.setVisible((this.isVisibilidadCeldaNuevoMarcaProducto && this.isPermisoNuevoMarcaProducto));			
			this.jMenuItemDuplicarMarcaProducto.setVisible((this.isVisibilidadCeldaDuplicarMarcaProducto && this.isPermisoDuplicarMarcaProducto));			
			this.jMenuItemCopiarMarcaProducto.setVisible((this.isVisibilidadCeldaCopiarMarcaProducto && this.isPermisoCopiarMarcaProducto));			
			this.jMenuItemVerFormMarcaProducto.setVisible((this.isVisibilidadCeldaVerFormMarcaProducto && this.isPermisoVerFormMarcaProducto));			
			this.jMenuItemAbrirOrderByMarcaProducto.setVisible((this.isVisibilidadCeldaOrdenMarcaProducto && this.isPermisoOrdenMarcaProducto));			
			//this.jMenuItemMostrarOcultarMarcaProducto.setVisible((this.isVisibilidadCeldaOrdenMarcaProducto && this.isPermisoOrdenMarcaProducto));
			this.jMenuItemDetalleAbrirOrderByMarcaProducto.setVisible((this.isVisibilidadCeldaOrdenMarcaProducto && this.isPermisoOrdenMarcaProducto));			
			//this.jMenuItemDetalleMostrarOcultarMarcaProducto.setVisible((this.isVisibilidadCeldaOrdenMarcaProducto && this.isPermisoOrdenMarcaProducto));			
			this.jMenuItemNuevoRelacionesMarcaProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesMarcaProducto && this.isPermisoNuevoMarcaProducto));			
			this.jMenuItemNuevoGuardarCambiosMarcaProducto.setVisible((this.isVisibilidadCeldaNuevoMarcaProducto && this.isPermisoNuevoMarcaProducto && this.isPermisoGuardarCambiosMarcaProducto));									
			
			if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
			this.jInternalFrameDetalleFormMarcaProducto.jMenuItemModificarMarcaProducto.setVisible((this.isVisibilidadCeldaModificarMarcaProducto && this.isPermisoActualizarMarcaProducto));	
			this.jInternalFrameDetalleFormMarcaProducto.jMenuItemActualizarMarcaProducto.setVisible((this.isVisibilidadCeldaActualizarMarcaProducto && this.isPermisoActualizarMarcaProducto));	
			this.jInternalFrameDetalleFormMarcaProducto.jMenuItemEliminarMarcaProducto.setVisible((this.isVisibilidadCeldaEliminarMarcaProducto && this.isPermisoEliminarMarcaProducto));
			this.jInternalFrameDetalleFormMarcaProducto.jMenuItemCancelarMarcaProducto.setVisible(this.isVisibilidadCeldaCancelarMarcaProducto);				
			}
			
			this.jMenuItemGuardarCambiosMarcaProducto.setVisible((this.isVisibilidadCeldaGuardarMarcaProducto && this.isPermisoGuardarCambiosMarcaProducto));						
			this.jMenuItemGuardarCambiosTablaMarcaProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosMarcaProducto && this.isPermisoGuardarCambiosMarcaProducto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoMarcaProducto=this.jButtonNuevoMarcaProducto.isVisible();
			this.isVisibilidadCeldaDuplicarMarcaProducto=this.jButtonDuplicarMarcaProducto.isVisible();
			this.isVisibilidadCeldaCopiarMarcaProducto=this.jButtonCopiarMarcaProducto.isVisible();
			this.isVisibilidadCeldaVerFormMarcaProducto=this.jButtonVerFormMarcaProducto.isVisible();
			
			this.isVisibilidadCeldaOrdenMarcaProducto=this.jButtonAbrirOrderByMarcaProducto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesMarcaProducto=this.jButtonNuevoRelacionesMarcaProducto.isVisible();
			this.isVisibilidadCeldaModificarMarcaProducto=this.jButtonModificarMarcaProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
			this.isVisibilidadCeldaActualizarMarcaProducto=this.jInternalFrameDetalleFormMarcaProducto.jButtonActualizarMarcaProducto.isVisible();
			this.isVisibilidadCeldaEliminarMarcaProducto=this.jInternalFrameDetalleFormMarcaProducto.jButtonEliminarMarcaProducto.isVisible();
			this.isVisibilidadCeldaCancelarMarcaProducto=this.jInternalFrameDetalleFormMarcaProducto.jButtonCancelarMarcaProducto.isVisible();
			this.isVisibilidadCeldaGuardarMarcaProducto=this.jInternalFrameDetalleFormMarcaProducto.jButtonGuardarCambiosMarcaProducto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosMarcaProducto=this.jButtonGuardarCambiosTablaMarcaProducto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoMarcaProducto=this.jButtonNuevoToolBarMarcaProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMarcaProducto=this.jButtonNuevoRelacionesToolBarMarcaProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
			this.isVisibilidadCeldaModificarMarcaProducto=this.jInternalFrameDetalleFormMarcaProducto.jButtonModificarToolBarMarcaProducto.isVisible();
			this.isVisibilidadCeldaActualizarMarcaProducto=this.jInternalFrameDetalleFormMarcaProducto.jButtonActualizarToolBarMarcaProducto.isVisible();
			this.isVisibilidadCeldaEliminarMarcaProducto=this.jInternalFrameDetalleFormMarcaProducto.jButtonEliminarToolBarMarcaProducto.isVisible();
			this.isVisibilidadCeldaCancelarMarcaProducto=this.jInternalFrameDetalleFormMarcaProducto.jButtonCancelarToolBarMarcaProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMarcaProducto=this.jButtonGuardarCambiosToolBarMarcaProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMarcaProducto=this.jButtonGuardarCambiosTablaToolBarMarcaProducto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoMarcaProducto=this.jMenuItemNuevoMarcaProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMarcaProducto=this.jMenuItemNuevoRelacionesMarcaProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
			this.isVisibilidadCeldaModificarMarcaProducto=this.jInternalFrameDetalleFormMarcaProducto.jMenuItemModificarMarcaProducto.isVisible();
			this.isVisibilidadCeldaActualizarMarcaProducto=this.jInternalFrameDetalleFormMarcaProducto.jMenuItemActualizarMarcaProducto.isVisible();
			this.isVisibilidadCeldaEliminarMarcaProducto=this.jInternalFrameDetalleFormMarcaProducto.jMenuItemEliminarMarcaProducto.isVisible();
			this.isVisibilidadCeldaCancelarMarcaProducto=this.jInternalFrameDetalleFormMarcaProducto.jMenuItemCancelarMarcaProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMarcaProducto=this.jMenuItemGuardarCambiosMarcaProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMarcaProducto=this.jMenuItemGuardarCambiosTablaMarcaProducto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesMarcaProducto(Boolean esInicializar) {
		if(MarcaProductoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.marcaproductoSessionBean.getConGuardarRelaciones()) {
				//if(this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesMarcaProducto();
			}
			
			this.inicializarActualizarBindingBotonesManualMarcaProducto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualMarcaProducto() {
		this.jButtonNuevoMarcaProducto.setVisible(this.isPermisoNuevoMarcaProducto);			
		this.jButtonDuplicarMarcaProducto.setVisible(this.isPermisoDuplicarMarcaProducto);			
		this.jButtonCopiarMarcaProducto.setVisible(this.isPermisoCopiarMarcaProducto);			
		this.jButtonVerFormMarcaProducto.setVisible(this.isPermisoVerFormMarcaProducto);			
		
		this.jButtonAbrirOrderByMarcaProducto.setVisible(this.isPermisoOrdenMarcaProducto);					
		
		this.jButtonNuevoRelacionesMarcaProducto.setVisible(this.isPermisoNuevoMarcaProducto);			
		
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMarcaProducto.jButtonModificarMarcaProducto.setVisible(this.isPermisoActualizarMarcaProducto);	
			this.jInternalFrameDetalleFormMarcaProducto.jButtonActualizarMarcaProducto.setVisible(this.isPermisoActualizarMarcaProducto);	
			this.jInternalFrameDetalleFormMarcaProducto.jButtonEliminarMarcaProducto.setVisible(this.isPermisoEliminarMarcaProducto);
			this.jInternalFrameDetalleFormMarcaProducto.jButtonCancelarMarcaProducto.setVisible(this.isVisibilidadCeldaCancelarMarcaProducto);						
			this.jInternalFrameDetalleFormMarcaProducto.jButtonGuardarCambiosMarcaProducto.setVisible(this.isPermisoGuardarCambiosMarcaProducto);							
		}
		
		this.jButtonGuardarCambiosTablaMarcaProducto.setVisible(this.isPermisoActualizarMarcaProducto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleMarcaProducto() {
		this.jInternalFrameDetalleFormMarcaProducto.jButtonModificarMarcaProducto.setVisible(this.isPermisoActualizarMarcaProducto);	
		this.jInternalFrameDetalleFormMarcaProducto.jButtonActualizarMarcaProducto.setVisible(this.isPermisoActualizarMarcaProducto);	
		this.jInternalFrameDetalleFormMarcaProducto.jButtonEliminarMarcaProducto.setVisible(this.isPermisoEliminarMarcaProducto);
		this.jInternalFrameDetalleFormMarcaProducto.jButtonCancelarMarcaProducto.setVisible(this.isVisibilidadCeldaCancelarMarcaProducto);							
		this.jInternalFrameDetalleFormMarcaProducto.jButtonGuardarCambiosMarcaProducto.setVisible((this.isVisibilidadCeldaGuardarMarcaProducto && this.isPermisoGuardarCambiosMarcaProducto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosMarcaProducto() {
		if(MarcaProductoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualMarcaProducto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesMarcaProducto() {
	}
	
	public void jTableDatosMarcaProductoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarMarcaProducto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidMarcaProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMarcaProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMarcaProducto(this.getmarcaproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMarcaProducto(this.marcaproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.marcaproducto =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.marcaproducto =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.marcaproducto==null) {
						this.marcaproducto = new MarcaProducto();
					}

					this.setVariablesFormularioToObjetoActualMarcaProducto(this.marcaproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMarcaProducto(this.marcaproducto);
				}

				if(this.marcaproducto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.marcaproducto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMarcaProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaMarcaProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebMarcaProducto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMarcaProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMarcaProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMarcaProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproducto =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.marcaproducto =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMarcaProducto(this.getmarcaproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMarcaProducto(this.marcaproducto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.marcaproductoLogic.getConnexion());

				if(this.marcaproducto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.marcaproducto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMarcaProducto=(TitledBorder)this.jScrollPanelDatosMarcaProducto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderMarcaProducto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaMarcaProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMarcaProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMarcaProducto(this.getmarcaproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMarcaProducto(this.marcaproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.marcaproducto =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.marcaproducto =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.marcaproducto==null) {
						this.marcaproducto = new MarcaProducto();
					}

					this.setVariablesFormularioToObjetoActualMarcaProducto(this.marcaproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMarcaProducto(this.marcaproducto);
				}

				if(this.marcaproducto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.marcaproducto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMarcaProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_productoMarcaProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoproducto=true;

			idTienePermisotipoproducto=this.tienePermisosUsuarioEnPaginaWebMarcaProducto(TipoProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMarcaProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMarcaProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMarcaProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproducto =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.marcaproducto =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMarcaProducto(this.getmarcaproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMarcaProducto(this.marcaproducto);

				this.tipoproductoBeanSwingJInternalFrame=new TipoProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoproductoBeanSwingJInternalFrame.getTipoProductoLogic().setConnexion(this.marcaproductoLogic.getConnexion());

				if(this.marcaproducto.getid_tipo_producto()!=null) {
					this.tipoproductoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoproductoBeanSwingJInternalFrame.setIdActual(this.marcaproducto.getid_tipo_producto());
					this.tipoproductoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoproductoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoProducto();
				}

				JInternalFrameBase jinternalFrame =this.tipoproductoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMarcaProducto=(TitledBorder)this.jScrollPanelDatosMarcaProducto.getBorder();
				TitledBorder titledBordertipoproducto=(TitledBorder)this.tipoproductoBeanSwingJInternalFrame.jScrollPanelDatosTipoProducto.getBorder();

				titledBordertipoproducto.setTitle(titledBorderMarcaProducto.getTitle() + " -> Tipo Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_productoMarcaProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMarcaProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMarcaProducto(this.getmarcaproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMarcaProducto(this.marcaproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.marcaproducto =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.marcaproducto =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.marcaproducto==null) {
						this.marcaproducto = new MarcaProducto();
					}

					this.setVariablesFormularioToObjetoActualMarcaProducto(this.marcaproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMarcaProducto(this.marcaproducto);
				}

				if(this.marcaproducto.getid_tipo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_producto = "+this.marcaproducto.getid_tipo_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMarcaProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoMarcaProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMarcaProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMarcaProducto(this.getmarcaproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMarcaProducto(this.marcaproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.marcaproducto =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.marcaproducto =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.marcaproducto==null) {
						this.marcaproducto = new MarcaProducto();
					}

					this.setVariablesFormularioToObjetoActualMarcaProducto(this.marcaproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMarcaProducto(this.marcaproducto);
				}

				if(this.marcaproducto.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.marcaproducto.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMarcaProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreMarcaProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMarcaProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMarcaProducto(this.getmarcaproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMarcaProducto(this.marcaproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.marcaproducto =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.marcaproducto =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.marcaproducto==null) {
						this.marcaproducto = new MarcaProducto();
					}

					this.setVariablesFormularioToObjetoActualMarcaProducto(this.marcaproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMarcaProducto(this.marcaproducto);
				}

				if(this.marcaproducto.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.marcaproducto.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMarcaProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoMarcaProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMarcaProducto(false,false);

			this.getMarcaProductosBusquedaPorCodigo();

			this.inicializarActualizarBindingMarcaProducto(false);

			//if(MarcaProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMarcaProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreMarcaProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMarcaProducto(false,false);

			this.getMarcaProductosBusquedaPorNombre();

			this.inicializarActualizarBindingMarcaProducto(false);

			//if(MarcaProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMarcaProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaMarcaProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMarcaProducto(false,false);

			this.getMarcaProductosFK_IdEmpresa();

			this.inicializarActualizarBindingMarcaProducto(false);

			//if(MarcaProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMarcaProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoProductoMarcaProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMarcaProducto(false,false);

			this.getMarcaProductosFK_IdTipoProducto();

			this.inicializarActualizarBindingMarcaProducto(false);

			//if(MarcaProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMarcaProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.marcaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameMarcaProducto() {
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
		

		if(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
			this.jInternalFrameDetalleFormMarcaProducto.setVisible(false);	    			
			this.jInternalFrameDetalleFormMarcaProducto.dispose();
			this.jInternalFrameDetalleFormMarcaProducto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoMarcaProducto!=null) {
			this.jInternalFrameReporteDinamicoMarcaProducto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoMarcaProducto.dispose();
			this.jInternalFrameReporteDinamicoMarcaProducto=null;
		}
		
		if(this.jInternalFrameImportacionMarcaProducto!=null) {
			this.jInternalFrameImportacionMarcaProducto.setVisible(false);	    			
			this.jInternalFrameImportacionMarcaProducto.dispose();
			this.jInternalFrameImportacionMarcaProducto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessMarcaProducto();
			
			MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
			
			
			if(sTipo.equals("NuevoMarcaProducto")) {
				jButtonNuevoMarcaProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarMarcaProducto")) {
				jButtonDuplicarMarcaProductoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarMarcaProducto")) {
				jButtonCopiarMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormMarcaProducto")) {
				jButtonVerFormMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarMarcaProducto")) {
				jButtonNuevoMarcaProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarMarcaProducto")) {
				jButtonDuplicarMarcaProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoMarcaProducto")) {
				jButtonNuevoMarcaProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarMarcaProducto")) {
				jButtonDuplicarMarcaProductoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesMarcaProducto")) {
				jButtonNuevoMarcaProductoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarMarcaProducto")) {
				jButtonNuevoMarcaProductoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesMarcaProducto")) {
				jButtonNuevoMarcaProductoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarMarcaProducto")) {
				jButtonModificarMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarMarcaProducto")) {
				jButtonModificarMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarMarcaProducto")) {
				jButtonModificarMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarMarcaProducto")) {
				jButtonActualizarMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarMarcaProducto")) {
				jButtonActualizarMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarMarcaProducto")) {
				jButtonActualizarMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarMarcaProducto")) {
				jButtonEliminarMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarMarcaProducto")) {
				jButtonEliminarMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarMarcaProducto")) {
				jButtonEliminarMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarMarcaProducto")) {
				jButtonCancelarMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarMarcaProducto")) {
				jButtonCancelarMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarMarcaProducto")) {
				jButtonCancelarMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarMarcaProducto")) {
				jButtonCerrarMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarMarcaProducto")) {
				jButtonCerrarMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarMarcaProducto")) {
				jButtonCerrarMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarMarcaProducto")) {
				jButtonMostrarOcultarMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarMarcaProducto")) {
				jButtonCancelarMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosMarcaProducto")) {
				jButtonGuardarCambiosMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarMarcaProducto")) {
				jButtonGuardarCambiosMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarMarcaProducto")) {
				jButtonCopiarMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarMarcaProducto")) {
				jButtonVerFormMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosMarcaProducto")) {
				jButtonGuardarCambiosMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarMarcaProducto")) {
				jButtonCopiarMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormMarcaProducto")) {
				jButtonVerFormMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaMarcaProducto")) {
				jButtonGuardarCambiosMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarMarcaProducto")) {
				jButtonGuardarCambiosMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaMarcaProducto")) {
				jButtonGuardarCambiosMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionMarcaProducto")) {
				jButtonRecargarInformacionMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarMarcaProducto")) {
				jButtonRecargarInformacionMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionMarcaProducto")) {
				jButtonRecargarInformacionMarcaProductoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresMarcaProducto")) {
				jButtonAnterioresMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarMarcaProducto")) {
				jButtonAnterioresMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreMarcaProducto")) {
				jButtonAnterioresMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesMarcaProducto")) {
				jButtonSiguientesMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarMarcaProducto")) {
				jButtonSiguientesMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesMarcaProducto")) {
				jButtonSiguientesMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByMarcaProducto") || sTipo.equals("MenuItemDetalleAbrirOrderByMarcaProducto")) {
				jButtonAbrirOrderByMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarMarcaProducto") || sTipo.equals("MenuItemDetalleMostrarOcultarMarcaProducto")) {
				jButtonMostrarOcultarMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosMarcaProducto")) {
				jButtonNuevoGuardarCambiosMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarMarcaProducto")) {
				jButtonNuevoGuardarCambiosMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosMarcaProducto")) {
				jButtonNuevoGuardarCambiosMarcaProductoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoMarcaProducto")) {
				jButtonCerrarReporteDinamicoMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoMarcaProducto")) {
				jButtonGenerarReporteDinamicoMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoMarcaProducto")) {
				
				jButtonGenerarExcelReporteDinamicoMarcaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionMarcaProducto")) {
				jButtonCerrarImportacionMarcaProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionMarcaProducto")) {
				
				jButtonGenerarImportacionMarcaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionMarcaProducto")) {
				
				jButtonAbrirImportacionMarcaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesMarcaProducto")) {
				jComboBoxTiposAccionesMarcaProductoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesMarcaProducto")) {
				jComboBoxTiposRelacionesMarcaProductoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioMarcaProducto")) {
				jComboBoxTiposAccionesMarcaProductoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarMarcaProducto")) {
				
				jComboBoxTiposSeleccionarMarcaProductoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralMarcaProducto")) {
				jTextFieldValorCampoGeneralMarcaProductoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByMarcaProducto")) {
				jButtonAbrirOrderByMarcaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarMarcaProducto")) {
				jButtonAbrirOrderByMarcaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByMarcaProducto")) {
				jButtonCerrarOrderByMarcaProductoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMarcaProductoBusqueda")) {
				this.jButtonidMarcaProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMarcaProductoUpdate")) {
				this.jButtonid_empresaMarcaProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMarcaProductoBusqueda")) {
				this.jButtonid_empresaMarcaProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_productoMarcaProductoUpdate")) {
				this.jButtonid_tipo_productoMarcaProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_productoMarcaProductoBusqueda")) {
				this.jButtonid_tipo_productoMarcaProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoMarcaProductoBusqueda")) {
				this.jButtoncodigoMarcaProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreMarcaProductoBusqueda")) {
				this.jButtonnombreMarcaProductoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoMarcaProducto")) {
				this.jButtonBusquedaPorCodigoMarcaProductoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreMarcaProducto")) {
				this.jButtonBusquedaPorNombreMarcaProductoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoProductoMarcaProducto")) {
				this.jButtonFK_IdTipoProductoMarcaProductoActionPerformed(evt);
			}
			
			;
			
			
			MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessMarcaProducto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMarcaProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.marcaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.marcaproducto);
				
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
				
				


				
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MarcaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MarcaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			MarcaProducto marcaproductoLocal=null;
			
			if(!this.getEsControlTabla()) {
				marcaproductoLocal=this.marcaproducto;
			} else {
				marcaproductoLocal=this.marcaproductoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.marcaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.marcaproducto);
				
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
							
				
				


				
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MarcaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MarcaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMarcaProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMarcaProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoAnterior =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.marcaproductoAnterior =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
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
			
			MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
			
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
			
			


			
			MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMarcaProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.marcaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.marcaproducto);
				
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
								
						
				


				
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MarcaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MarcaProducto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.marcaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.marcaproducto);
				
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
								
				
				


				
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MarcaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MarcaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMarcaProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMarcaProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoAnterior =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.marcaproductoAnterior =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.marcaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.marcaproducto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMarcaProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMarcaProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoAnterior =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.marcaproductoAnterior =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMarcaProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.marcaproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.marcaproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.marcaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.marcaproducto);
				
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
							
				
				


				
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MarcaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MarcaProducto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMarcaProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMarcaProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.marcaproductoAnterior =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.marcaproductoAnterior =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
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
			
			MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
			
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
			
			


			
			MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMarcaProductoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.marcaproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.marcaproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.marcaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.marcaproducto);
				
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
								
				
				


				
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MarcaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MarcaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMarcaProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMarcaProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoAnterior =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.marcaproductoAnterior =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMarcaProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.marcaproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.marcaproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMarcaProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.marcaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.marcaproducto);
				
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosMarcaProducto")) {
					jCheckBoxSeleccionarTodosMarcaProductoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosMarcaProducto")) {
					jCheckBoxSeleccionadosMarcaProductoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarMarcaProducto")) {
					
				}
				
				


				
				
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MarcaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MarcaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.marcaproducto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.marcaproducto);
				
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
												
				
				


				
				
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MarcaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MarcaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMarcaProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMarcaProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.marcaproductoAnterior =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.marcaproductoAnterior =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMarcaProductoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.marcaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.marcaproducto);
				
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
				
				
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
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
			
			MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
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
			
			


			
			MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMarcaProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.marcaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.marcaproducto);
				
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MarcaProducto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MarcaProducto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.marcaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.marcaproducto);
				
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
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
				
				


				
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MarcaProducto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MarcaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMarcaProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMarcaProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.marcaproductoAnterior =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.marcaproductoAnterior =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarMarcaProducto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosMarcaProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosMarcaProducto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.marcaproducto =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.marcaproducto =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.marcaproducto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarMarcaProducto")) {
				
				}
				
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarMarcaProducto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosMarcaProducto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarMarcaProducto")) {
			
			}
			
			MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessMarcaProducto();
			
			MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
			
			if(sTipo.equals("NuevoMarcaProducto")) {
				jButtonNuevoMarcaProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarMarcaProducto")) {
				jButtonDuplicarMarcaProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarMarcaProducto")) {
				jButtonCopiarMarcaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormMarcaProducto")) {
				jButtonVerFormMarcaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesMarcaProducto")) {
				jButtonNuevoMarcaProductoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarMarcaProducto")) {
				jButtonModificarMarcaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarMarcaProducto")) {
				jButtonActualizarMarcaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarMarcaProducto")) {
				jButtonEliminarMarcaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaMarcaProducto")) {
				jButtonGuardarCambiosMarcaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarMarcaProducto")) {
				jButtonCancelarMarcaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarMarcaProducto")) {
				jButtonCerrarMarcaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosMarcaProducto")) {
				jButtonGuardarCambiosMarcaProductoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosMarcaProducto")) {
				jButtonNuevoGuardarCambiosMarcaProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByMarcaProducto")) {
				jButtonAbrirOrderByMarcaProductoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionMarcaProducto")) {
				jButtonRecargarInformacionMarcaProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresMarcaProducto")) {
				jButtonAnterioresMarcaProductoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesMarcaProducto")) {
				jButtonSiguientesMarcaProductoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMarcaProductoBusqueda")) {
				this.jButtonidMarcaProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMarcaProductoUpdate")) {
				this.jButtonid_empresaMarcaProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMarcaProductoBusqueda")) {
				this.jButtonid_empresaMarcaProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_productoMarcaProductoUpdate")) {
				this.jButtonid_tipo_productoMarcaProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_productoMarcaProductoBusqueda")) {
				this.jButtonid_tipo_productoMarcaProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoMarcaProductoBusqueda")) {
				this.jButtoncodigoMarcaProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreMarcaProductoBusqueda")) {
				this.jButtonnombreMarcaProductoBusquedaActionPerformed(evt);
			}
			
			MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessMarcaProducto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameMarcaProducto")) {
				closingInternalFrameMarcaProducto();
				
			} else if(sTipo.equals("jButtonCancelarMarcaProducto")) {
				JInternalFrameBase jInternalFrameDetalleFormMarcaProducto = (JInternalFrameBase)evt.getSource();
	            	
	            MarcaProductoBeanSwingJInternalFrame jInternalFrameParent=(MarcaProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormMarcaProducto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarMarcaProductoActionPerformed(null);
			}
			
			MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.marcaproducto,new Object(),this.marcaproductoParameterGeneral,this.marcaproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormMarcaProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormMarcaProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormMarcaProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.marcaproducto)) {
			if(!esControlTabla) {
				if(MarcaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualMarcaProducto(this.marcaproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMarcaProducto(this.marcaproducto);			
				}
				
				if(this.marcaproductoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualMarcaProducto(this.marcaproducto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.marcaproductoReturnGeneral=marcaproductoLogic.procesarEventosMarcaProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.marcaproductoLogic.getMarcaProductos(),this.marcaproducto,this.marcaproductoParameterGeneral,this.isEsNuevoMarcaProducto,classes);//this.marcaproductoLogic.getMarcaProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanMarcaProducto(this.marcaproductoReturnGeneral,this.marcaproductoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.marcaproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanMarcaProducto(classes,this.marcaproductoReturnGeneral,this.marcaproductoBean,false);
					}
						
					if(this.marcaproductoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyMarcaProducto(this.marcaproductoReturnGeneral.getMarcaProducto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioMarcaProducto(this.marcaproductoReturnGeneral.getMarcaProducto());	
					}
						
					if(this.marcaproductoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioMarcaProducto(this.marcaproductoReturnGeneral.getMarcaProducto(),classes);//this.marcaproductoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioMarcaProducto(this.marcaproducto,classes);//this.marcaproductoBean);									
				}
			
				if(MarcaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualMarcaProducto(this.marcaproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMarcaProducto(this.marcaproducto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.marcaproductoAnterior!=null) {
						this.marcaproducto=this.marcaproductoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.marcaproductoReturnGeneral=marcaproductoLogic.procesarEventosMarcaProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.marcaproductoLogic.getMarcaProductos(),this.marcaproducto,this.marcaproductoParameterGeneral,this.isEsNuevoMarcaProducto,classes);//this.marcaproductoLogic.getMarcaProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.marcaproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.marcaproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.marcaproductoReturnGeneral.getMarcaProducto(),marcaproductoLogic.getMarcaProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.marcaproductoReturnGeneral.getMarcaProducto(),this.marcaproductos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosMarcaProducto.repaint();
				
				//((AbstractTableModel) this.jTableDatosMarcaProducto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosMarcaProducto();
			}
		}
	}
	
	public void actualizarVisualTableDatosMarcaProducto() throws Exception {
		
		MarcaProductoModel marcaproductoModel=(MarcaProductoModel)this.jTableDatosMarcaProducto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			marcaproductoModel.marcaproductos=this.marcaproductoLogic.getMarcaProductos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			marcaproductoModel.marcaproductos=this.marcaproductos;
		}
		
		
		((MarcaProductoModel) this.jTableDatosMarcaProducto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaMarcaProducto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getmarcaproductoAnterior(),this.marcaproductoLogic.getMarcaProductos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getmarcaproductoAnterior(),this.marcaproductos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosMarcaProducto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioMarcaProducto(MarcaProducto marcaproducto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(marcaproducto.getProductos());
					this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(marcaproducto.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
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
										
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.marcaproducto,new Object(),generalEntityParameterGeneral,this.marcaproductoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.marcaproductoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=MarcaProductoConstantesFunciones.getClassesRelationshipsOfMarcaProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=MarcaProductoConstantesFunciones.getClassesRelationshipsFromStringsOfMarcaProducto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormMarcaProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				MarcaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.marcaproducto,new Object(),generalEntityParameterGeneral,this.marcaproductoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioMarcaProducto(MarcaProductoBean marcaproductoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(marcaproducto.getProductos());
					this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(marcaproducto.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanMarcaProducto(ArrayList<Classe> classes,MarcaProductoReturnGeneral marcaproductoReturnGeneral,MarcaProductoBean marcaproductoBean,Boolean conDefault) throws Exception {
		
			this.marcaproductoBean.setProductos(marcaproductoReturnGeneral.getMarcaProducto().getProductos());
			this.marcaproductoBean.setParametroInventarioDefectos(marcaproductoReturnGeneral.getMarcaProducto().getParametroInventarioDefectos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualMarcaProducto(MarcaProducto marcaproducto,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					marcaproducto.setProductos(this.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					marcaproducto.setParametroInventarioDefectos(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.marcaproducto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormMarcaProducto = new MarcaProductoDetalleFormJInternalFrame(jDesktopPane,this.marcaproductoSessionBean.getConGuardarRelaciones(),this.marcaproductoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormMarcaProducto);
		this.jInternalFrameDetalleFormMarcaProducto.setVisible(false);
		this.jInternalFrameDetalleFormMarcaProducto.setSelected(false);						
		
		this.jInternalFrameDetalleFormMarcaProducto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormMarcaProducto.marcaproductoLogic=this.marcaproductoLogic;
		
		this.cargarCombosFrameForeignKeyMarcaProducto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleMarcaProducto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMarcaProducto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyMarcaProducto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyMarcaProducto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormMarcaProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMarcaProducto"));
		
		this.jInternalFrameDetalleFormMarcaProducto.jButtonModificarMarcaProducto.addActionListener(new ButtonActionListener(this,"ModificarMarcaProducto"));

		
		this.jInternalFrameDetalleFormMarcaProducto.jButtonModificarToolBarMarcaProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarMarcaProducto"));
					
		this.jInternalFrameDetalleFormMarcaProducto.jMenuItemModificarMarcaProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarMarcaProducto"));		
		
		
		
		this.jInternalFrameDetalleFormMarcaProducto.jButtonActualizarMarcaProducto.addActionListener (new ButtonActionListener(this,"ActualizarMarcaProducto"));
		
		
		this.jInternalFrameDetalleFormMarcaProducto.jButtonActualizarToolBarMarcaProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMarcaProducto"));
						
		this.jInternalFrameDetalleFormMarcaProducto.jMenuItemActualizarMarcaProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMarcaProducto"));		
		
		
		
		this.jInternalFrameDetalleFormMarcaProducto.jButtonEliminarMarcaProducto.addActionListener (new ButtonActionListener(this,"EliminarMarcaProducto"));
		
		
		this.jInternalFrameDetalleFormMarcaProducto.jButtonEliminarToolBarMarcaProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarMarcaProducto"));
								
		this.jInternalFrameDetalleFormMarcaProducto.jMenuItemEliminarMarcaProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMarcaProducto"));		
		
		
		
		this.jInternalFrameDetalleFormMarcaProducto.jButtonCancelarMarcaProducto.addActionListener (new ButtonActionListener(this,"CancelarMarcaProducto"));
		
		
		this.jInternalFrameDetalleFormMarcaProducto.jButtonCancelarToolBarMarcaProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarMarcaProducto"));
					
		this.jInternalFrameDetalleFormMarcaProducto.jMenuItemCancelarMarcaProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMarcaProducto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormMarcaProducto.jMenuItemDetalleCerrarMarcaProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMarcaProducto"));		
		
		
		
		this.jInternalFrameDetalleFormMarcaProducto.jButtonGuardarCambiosToolBarMarcaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMarcaProducto"));
		
		
		
		this.jInternalFrameDetalleFormMarcaProducto.jButtonGuardarCambiosToolBarMarcaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMarcaProducto"));
		
		
		
		this.jInternalFrameDetalleFormMarcaProducto.jComboBoxTiposAccionesFormularioMarcaProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMarcaProducto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMarcaProducto.jButtonidMarcaProductoBusqueda.addActionListener(new ButtonActionListener(this,"idMarcaProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMarcaProducto.jButtonid_empresaMarcaProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMarcaProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMarcaProducto.jButtonid_empresaMarcaProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMarcaProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMarcaProducto.jButtonid_tipo_productoMarcaProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_productoMarcaProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMarcaProducto.jButtonid_tipo_productoMarcaProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_productoMarcaProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMarcaProducto.jButtoncodigoMarcaProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoMarcaProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMarcaProducto.jButtonnombreMarcaProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreMarcaProductoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormMarcaProducto.jTabbedPaneRelacionesMarcaProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMarcaProducto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameMarcaProducto"));
		
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMarcaProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMarcaProducto"));
		}
		
		this.jTableDatosMarcaProducto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarMarcaProducto"));
		
		this.jTableDatosMarcaProducto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarMarcaProducto"));
		
		this.jButtonNuevoMarcaProducto.addActionListener(new ButtonActionListener(this,"NuevoMarcaProducto"));
		
		this.jButtonDuplicarMarcaProducto.addActionListener(new ButtonActionListener(this,"DuplicarMarcaProducto"));
		
		this.jButtonCopiarMarcaProducto.addActionListener(new ButtonActionListener(this,"CopiarMarcaProducto"));
		
		this.jButtonVerFormMarcaProducto.addActionListener(new ButtonActionListener(this,"VerFormMarcaProducto"));
		
		
		this.jButtonNuevoToolBarMarcaProducto.addActionListener(new ButtonActionListener(this,"NuevoToolBarMarcaProducto"));
			
		this.jButtonDuplicarToolBarMarcaProducto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarMarcaProducto"));
			
		this.jMenuItemNuevoMarcaProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoMarcaProducto"));
			
		this.jMenuItemDuplicarMarcaProducto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarMarcaProducto"));		
		
		
		this.jButtonNuevoRelacionesMarcaProducto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesMarcaProducto"));
		
		
		this.jButtonNuevoRelacionesToolBarMarcaProducto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarMarcaProducto"));
			
		this.jMenuItemNuevoRelacionesMarcaProducto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesMarcaProducto"));		
		
		
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMarcaProducto.jButtonModificarMarcaProducto.addActionListener(new ButtonActionListener(this,"ModificarMarcaProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMarcaProducto.jButtonModificarToolBarMarcaProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarMarcaProducto"));
			
			this.jInternalFrameDetalleFormMarcaProducto.jMenuItemModificarMarcaProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarMarcaProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormMarcaProducto.jButtonActualizarMarcaProducto.addActionListener (new ButtonActionListener(this,"ActualizarMarcaProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMarcaProducto.jButtonActualizarToolBarMarcaProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMarcaProducto"));
				
			this.jInternalFrameDetalleFormMarcaProducto.jMenuItemActualizarMarcaProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMarcaProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMarcaProducto.jButtonEliminarMarcaProducto.addActionListener (new ButtonActionListener(this,"EliminarMarcaProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMarcaProducto.jButtonEliminarToolBarMarcaProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarMarcaProducto"));
						
			this.jInternalFrameDetalleFormMarcaProducto.jMenuItemEliminarMarcaProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMarcaProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMarcaProducto.jButtonCancelarMarcaProducto.addActionListener (new ButtonActionListener(this,"CancelarMarcaProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMarcaProducto.jButtonCancelarToolBarMarcaProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarMarcaProducto"));
			
			this.jInternalFrameDetalleFormMarcaProducto.jMenuItemCancelarMarcaProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMarcaProducto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarMarcaProducto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarMarcaProducto"));		
		
		
		this.jButtonCerrarMarcaProducto.addActionListener (new ButtonActionListener(this,"CerrarMarcaProducto"));
		
		
		this.jButtonCerrarToolBarMarcaProducto.addActionListener (new ButtonActionListener(this,"CerrarToolBarMarcaProducto"));
			
		this.jMenuItemCerrarMarcaProducto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarMarcaProducto"));
			
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMarcaProducto.jMenuItemDetalleCerrarMarcaProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMarcaProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMarcaProducto.jButtonGuardarCambiosMarcaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosMarcaProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMarcaProducto.jButtonGuardarCambiosToolBarMarcaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMarcaProducto"));
		}
		
		this.jButtonCopiarToolBarMarcaProducto.addActionListener (new ButtonActionListener(this,"CopiarToolBarMarcaProducto"));
			
		this.jButtonVerFormToolBarMarcaProducto.addActionListener (new ButtonActionListener(this,"VerFormToolBarMarcaProducto"));
		
		this.jMenuItemGuardarCambiosMarcaProducto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosMarcaProducto"));
			
		this.jMenuItemCopiarMarcaProducto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarMarcaProducto"));		
		
		this.jMenuItemVerFormMarcaProducto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormMarcaProducto"));		
		
		
		this.jButtonGuardarCambiosTablaMarcaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMarcaProducto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarMarcaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarMarcaProducto"));
			
		this.jMenuItemGuardarCambiosTablaMarcaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMarcaProducto"));		
		
		
		
		this.jButtonRecargarInformacionMarcaProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionMarcaProducto"));
					
		this.jButtonRecargarInformacionToolBarMarcaProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarMarcaProducto"));
		
		this.jMenuItemRecargarInformacionMarcaProducto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionMarcaProducto"));		
		
		
		
		this.jButtonAnterioresMarcaProducto.addActionListener (new ButtonActionListener(this,"AnterioresMarcaProducto"));
		
		
		this.jButtonAnterioresToolBarMarcaProducto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarMarcaProducto"));
		
		this.jMenuItemAnterioresMarcaProducto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresMarcaProducto"));		
		
		
		this.jButtonSiguientesMarcaProducto.addActionListener (new ButtonActionListener(this,"SiguientesMarcaProducto"));
		
		
		this.jButtonSiguientesToolBarMarcaProducto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarMarcaProducto"));
			
		this.jMenuItemSiguientesMarcaProducto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesMarcaProducto"));
			
		this.jMenuItemAbrirOrderByMarcaProducto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByMarcaProducto"));
			
		this.jMenuItemMostrarOcultarMarcaProducto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarMarcaProducto"));
			
		this.jMenuItemDetalleAbrirOrderByMarcaProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByMarcaProducto"));
			
		this.jMenuItemDetalleMostarOcultarMarcaProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarMarcaProducto"));		
		
		
		this.jButtonNuevoGuardarCambiosMarcaProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosMarcaProducto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarMarcaProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarMarcaProducto"));
			
		this.jMenuItemNuevoGuardarCambiosMarcaProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosMarcaProducto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosMarcaProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosMarcaProducto"));

		this.jCheckBoxSeleccionadosMarcaProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosMarcaProducto"));
		
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMarcaProducto.jComboBoxTiposAccionesFormularioMarcaProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMarcaProducto"));
		}
		
		
		this.jComboBoxTiposRelacionesMarcaProducto.addActionListener (new ButtonActionListener(this,"TiposRelacionesMarcaProducto"));
			
		this.jComboBoxTiposAccionesMarcaProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesMarcaProducto"));
					
		this.jComboBoxTiposSeleccionarMarcaProducto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarMarcaProducto"));
			
		this.jTextFieldValorCampoGeneralMarcaProducto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralMarcaProducto"));		
		
		
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMarcaProducto.jButtonidMarcaProductoBusqueda.addActionListener(new ButtonActionListener(this,"idMarcaProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMarcaProducto.jButtonid_empresaMarcaProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMarcaProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMarcaProducto.jButtonid_empresaMarcaProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMarcaProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMarcaProducto.jButtonid_tipo_productoMarcaProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_productoMarcaProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMarcaProducto.jButtonid_tipo_productoMarcaProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_productoMarcaProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMarcaProducto.jButtoncodigoMarcaProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoMarcaProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMarcaProducto.jButtonnombreMarcaProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreMarcaProductoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoMarcaProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoMarcaProducto"));

			this.jButtonBusquedaPorNombreMarcaProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreMarcaProducto"));

			this.jButtonFK_IdTipoProductoMarcaProducto.addActionListener(new ButtonActionListener(this,"FK_IdTipoProductoMarcaProducto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoMarcaProducto!=null) {
				this.jInternalFrameReporteDinamicoMarcaProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMarcaProducto"));
				this.jInternalFrameReporteDinamicoMarcaProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMarcaProducto"));
				this.jInternalFrameReporteDinamicoMarcaProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMarcaProducto"));
			}
			
			//this.jButtonCerrarReporteDinamicoMarcaProducto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMarcaProducto"));				
			//this.jButtonGenerarReporteDinamicoMarcaProducto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMarcaProducto"));
			//this.jButtonGenerarExcelReporteDinamicoMarcaProducto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMarcaProducto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionMarcaProducto!=null) {
				this.jInternalFrameImportacionMarcaProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMarcaProducto"));
				this.jInternalFrameImportacionMarcaProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMarcaProducto"));
				this.jInternalFrameImportacionMarcaProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMarcaProducto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByMarcaProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByMarcaProducto"));
			
			this.jButtonAbrirOrderByToolBarMarcaProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarMarcaProducto"));			
			
			if(this.jInternalFrameOrderByMarcaProducto!=null) {
				this.jInternalFrameOrderByMarcaProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMarcaProducto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormMarcaProducto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMarcaProducto.jTabbedPaneRelacionesMarcaProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMarcaProducto"));
		
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
            		closingInternalFrameMarcaProducto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormMarcaProducto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormMarcaProducto = (JInternalFrameBase)event.getSource();
	            	
	            MarcaProductoBeanSwingJInternalFrame jInternalFrameParent=(MarcaProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormMarcaProducto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarMarcaProductoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosMarcaProducto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosMarcaProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosMarcaProducto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosMarcaProducto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMarcaProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMarcaProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMarcaProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoMarcaProducto";
		inputMap = this.jButtonNuevoMarcaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoMarcaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMarcaProductoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMarcaProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMarcaProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMarcaProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesMarcaProducto";
		inputMap = this.jButtonNuevoRelacionesMarcaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesMarcaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMarcaProductoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarMarcaProducto";
		inputMap = this.jButtonModificarMarcaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarMarcaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarMarcaProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarMarcaProducto";
		inputMap = this.jButtonActualizarMarcaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarMarcaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarMarcaProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarMarcaProducto";
		inputMap = this.jButtonEliminarMarcaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarMarcaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarMarcaProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarMarcaProducto";
		inputMap = this.jButtonCancelarMarcaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarMarcaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarMarcaProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarMarcaProducto";
		inputMap = this.jButtonCerrarMarcaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarMarcaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarMarcaProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormMarcaProducto.jButtonGuardarCambiosMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosMarcaProducto";
		inputMap = this.jInternalFrameDetalleFormMarcaProducto.jButtonGuardarCambiosMarcaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormMarcaProducto.jButtonGuardarCambiosMarcaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosMarcaProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosMarcaProducto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosMarcaProductoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesMarcaProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesMarcaProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarMarcaProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarMarcaProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralMarcaProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralMarcaProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMarcaProducto.jButtonidMarcaProductoBusqueda.addActionListener(new ButtonActionListener(this,"idMarcaProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMarcaProducto.jButtonid_empresaMarcaProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMarcaProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMarcaProducto.jButtonid_empresaMarcaProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMarcaProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMarcaProducto.jButtonid_tipo_productoMarcaProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_productoMarcaProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMarcaProducto.jButtonid_tipo_productoMarcaProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_productoMarcaProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMarcaProducto.jButtoncodigoMarcaProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoMarcaProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMarcaProducto.jButtonnombreMarcaProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreMarcaProductoBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoMarcaProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoMarcaProducto"));

		this.jButtonBusquedaPorNombreMarcaProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreMarcaProducto"));

		this.jButtonFK_IdTipoProductoMarcaProducto.addActionListener(new ButtonActionListener(this,"FK_IdTipoProductoMarcaProducto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionMarcaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionMarcaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarMarcaProductoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarMarcaProducto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosMarcaProducto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(MarcaProducto marcaproductoAux:this.marcaproductoLogic.getMarcaProductos()) {
					marcaproductoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MarcaProducto marcaproductoAux:marcaproductos) {
					marcaproductoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosMarcaProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMarcaProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(MarcaProducto marcaproductoAux:this.marcaproductoLogic.getMarcaProductos()) {
						marcaproductoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MarcaProducto marcaproductoAux:marcaproductos) {
						marcaproductoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(MarcaProducto marcaproductoAux:this.marcaproductoLogic.getMarcaProductos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MarcaProducto marcaproductoAux:marcaproductos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaMarcaProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMarcaProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMarcaProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMarcaProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosMarcaProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMarcaProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosMarcaProducto.getSelectedRows();
			
			MarcaProducto marcaproductoLocal=new MarcaProducto();
			
			//this.seleccionarTodosMarcaProducto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					marcaproductoLocal =(MarcaProducto) this.marcaproductoLogic.getMarcaProductos().toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					marcaproductoLocal =(MarcaProducto) this.marcaproductos.toArray()[this.jTableDatosMarcaProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				marcaproductoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(MarcaProducto marcaproductoAux:this.marcaproductoLogic.getMarcaProductos()) {
						marcaproductoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MarcaProducto marcaproductoAux:marcaproductos) {
						marcaproductoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaMarcaProducto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMarcaProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMarcaProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMarcaProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualMarcaProductoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarMarcaProductoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralMarcaProductoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingMarcaProducto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralMarcaProducto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(MarcaProducto marcaproductoAux:this.marcaproductoLogic.getMarcaProductos()) {
				
						if(sTipoSeleccionar.equals(MarcaProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							marcaproductoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MarcaProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							marcaproductoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MarcaProducto marcaproductoAux:marcaproductos) {
					
						if(sTipoSeleccionar.equals(MarcaProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							marcaproductoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MarcaProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							marcaproductoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaMarcaProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesMarcaProductoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingMarcaProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioMarcaProducto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesMarcaProducto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormMarcaProducto.jComboBoxTiposAccionesFormularioMarcaProducto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteMarcaProducto) {				
					conSplash=true;//false;										
					
					//this.startProcessMarcaProducto(conSplash);
				
					this.generarReporteMarcaProductosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMarcaProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMarcaProducto.jComboBoxTiposAccionesFormularioMarcaProducto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoMarcaProductosSeleccionados();
				//this.jComboBoxTiposAccionesMarcaProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMarcaProductosSeleccionados(false);
				//this.jComboBoxTiposAccionesMarcaProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMarcaProductosSeleccionados(true);
				//this.jComboBoxTiposAccionesMarcaProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMarcaProducto();
				
				this.exportarMarcaProductosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMarcaProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMarcaProducto.jComboBoxTiposAccionesFormularioMarcaProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionMarcaProductos();
				//this.importarMarcaProductos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMarcaProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMarcaProducto.jComboBoxTiposAccionesFormularioMarcaProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMarcaProducto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelMarcaProductosSeleccionados();
				//this.jComboBoxTiposAccionesMarcaProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Marca Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessMarcaProducto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoMarcaProducto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyMarcaProducto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Marca Producto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMarcaProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMarcaProducto.jComboBoxTiposAccionesFormularioMarcaProducto.setSelectedIndex(0);					
				}	
			} 			
			else if(MarcaProductoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteMarcaProducto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessMarcaProducto(conSplash);
					
						//this.actualizarParametrosGeneralMarcaProducto();
						
						this.generarReporteProcesoAccionMarcaProductosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesMarcaProducto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormMarcaProducto.jComboBoxTiposAccionesFormularioMarcaProducto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(MarcaProductoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Marca ProductoS SELECCIONADOS?", "MANTENIMIENTO DE Marca Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessMarcaProducto();
				
						this.actualizarParametrosGeneralMarcaProducto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.marcaproductoReturnGeneral=marcaproductoLogic.procesarAccionMarcaProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.marcaproductoLogic.getMarcaProductos(),this.marcaproductoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarMarcaProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMarcaProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMarcaProducto.jComboBoxTiposAccionesFormularioMarcaProducto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralMarcaProducto();
					
					MarcaProductoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarMarcaProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMarcaProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMarcaProducto.jComboBoxTiposAccionesFormularioMarcaProducto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessMarcaProducto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesMarcaProductoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessMarcaProducto();
			
			if(this.jInternalFrameDetalleFormMarcaProducto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<MarcaProducto> marcaproductosSeleccionados=new ArrayList<MarcaProducto>();		
			MarcaProducto marcaproducto=new MarcaProducto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingMarcaProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesMarcaProducto.getSelectedItem();
			
			
			
			
			marcaproductosSeleccionados=this.getMarcaProductosSeleccionados(true);
			//this.sTipoAccion;
			
			if(marcaproductosSeleccionados.size()==1) {
				for(MarcaProducto marcaproductoAux:marcaproductosSeleccionados) {
					marcaproducto=marcaproductoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Producto")) {
					jButtonProductoActionPerformed(null,rowIndex,true,false,marcaproducto);
				}
				else if(this.sTipoRelacion.equals("Parametro Inventario Defecto")) {
					jButtonParametroInventarioDefectoActionPerformed(null,rowIndex,true,false,marcaproducto);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessMarcaProducto();
			
      		//this.finishProcessMarcaProducto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarMarcaProductoReturnGeneral() throws Exception {
		if(this.marcaproductoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.marcaproductoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.marcaproductoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.marcaproductoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.marcaproductoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.marcaproductoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingMarcaProducto(false);
		}
		
		if(this.marcaproductoReturnGeneral.getConRetornoLista() || this.marcaproductoReturnGeneral.getConRetornoObjeto()) {
			if(this.marcaproductoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.marcaproductoLogic.setMarcaProductos(this.marcaproductoReturnGeneral.getMarcaProductos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.marcaproductoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.marcaproductoLogic.setMarcaProducto(this.marcaproductoReturnGeneral.getMarcaProducto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingMarcaProducto(false);
		}
	}
	
	public void actualizarParametrosGeneralMarcaProducto() throws Exception {
		
		
	}
	
	public ArrayList<MarcaProducto> getMarcaProductosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<MarcaProducto> marcaproductosSeleccionados=new ArrayList<MarcaProducto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioMarcaProducto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(MarcaProducto marcaproductoAux:marcaproductoLogic.getMarcaProductos()) {
					if(marcaproductoAux.getIsSelected()) {
						marcaproductosSeleccionados.add(marcaproductoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MarcaProducto marcaproductoAux:this.marcaproductos) {
					if(marcaproductoAux.getIsSelected()) {
						marcaproductosSeleccionados.add(marcaproductoAux);				
					}
				}
			}
			
			if(marcaproductosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						marcaproductosSeleccionados.addAll(this.marcaproductoLogic.getMarcaProductos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						marcaproductosSeleccionados.addAll(this.marcaproductos);				
					}
				}
			}
		} else {
			marcaproductosSeleccionados.add(this.marcaproducto);
		}
		
		return marcaproductosSeleccionados;
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
	
	public void generarReporteMarcaProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalMarcaProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoMarcaProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMarcaProductosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMarcaProductosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesMarcaProductosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Marca Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesMarcaProductosSeleccionados() throws Exception {
		ArrayList<MarcaProducto> marcaproductosSeleccionados=new ArrayList<MarcaProducto>();		
		
		marcaproductosSeleccionados=this.getMarcaProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteMarcaProductos("Todos",marcaproductosSeleccionados);
		
	}	
	
	public void generarReporteNormalMarcaProductosSeleccionados() throws Exception {
		ArrayList<MarcaProducto> marcaproductosSeleccionados=new ArrayList<MarcaProducto>();		
		
		marcaproductosSeleccionados=this.getMarcaProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteMarcaProductos("Todos",marcaproductosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionMarcaProductosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<MarcaProducto> marcaproductosSeleccionados=new ArrayList<MarcaProducto>();
		
		marcaproductosSeleccionados=this.getMarcaProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteMarcaProductos("Todos",marcaproductosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoMarcaProductosSeleccionados() throws Exception {
		ArrayList<MarcaProducto> marcaproductosSeleccionados=new ArrayList<MarcaProducto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoMarcaProducto();
		
		
		marcaproductosSeleccionados=this.getMarcaProductosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoMarcaProducto();
		
		
		//this.generarReporteMarcaProductos("Todos",marcaproductosSeleccionados ,marcaproductoImplementable,marcaproductoImplementableHome);
	}
	
	public void mostrarImportacionMarcaProductos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionMarcaProducto();
		
		this.abrirFrameImportacionMarcaProducto();		
		
			
		//this.generarReporteMarcaProductos("Todos",marcaproductosSeleccionados ,marcaproductoImplementable,marcaproductoImplementableHome);
	}
	
	public void importarMarcaProductos() throws Exception {		
	
	}
	
	public void exportarMarcaProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelMarcaProductosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoMarcaProductosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlMarcaProductosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Marca Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoMarcaProductosSeleccionados() throws Exception {
		ArrayList<MarcaProducto> marcaproductosSeleccionados=new ArrayList<MarcaProducto>();		
		
		marcaproductosSeleccionados=this.getMarcaProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"marcaproducto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarMarcaProducto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(MarcaProducto marcaproductoAux:marcaproductosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarMarcaProducto(marcaproductoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//marcaproductoAux.setsDetalleGeneralEntityReporte(marcaproductoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.marcaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Marca Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarMarcaProducto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=MarcaProductoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MarcaProductoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MarcaProductoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MarcaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MarcaProductoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MarcaProductoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarMarcaProducto(MarcaProducto marcaproducto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=marcaproducto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=marcaproducto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=marcaproducto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=marcaproducto.gettipoproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=marcaproducto.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=marcaproducto.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelMarcaProductosSeleccionados() throws Exception {
		ArrayList<MarcaProducto> marcaproductosSeleccionados=new ArrayList<MarcaProducto>();		
		
		marcaproductosSeleccionados=this.getMarcaProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"marcaproducto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("MarcaProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelMarcaProducto(row);				
				iRow++;
			}				
			
			for(MarcaProducto marcaproductoAux:marcaproductosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelMarcaProducto(marcaproductoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.marcaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Marca Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlMarcaProductosSeleccionados() throws Exception {
		ArrayList<MarcaProducto> marcaproductosSeleccionados=new ArrayList<MarcaProducto>();		
		
		marcaproductosSeleccionados=this.getMarcaProductosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"marcaproducto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("marcaproductos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("marcaproducto");
			//elementRoot.appendChild(element);
		
			for(MarcaProducto marcaproductoAux:marcaproductosSeleccionados) {
				element = document.createElement("marcaproducto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlMarcaProducto(marcaproductoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.marcaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Marca Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelMarcaProducto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(MarcaProductoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(MarcaProductoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(MarcaProductoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(MarcaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(MarcaProductoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(MarcaProductoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelMarcaProducto(MarcaProducto marcaproducto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(marcaproducto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(marcaproducto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(marcaproducto.gettipoproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(marcaproducto.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(marcaproducto.getnombre());				
	}
	
	public void setFilaDatosExportarXmlMarcaProducto(MarcaProducto marcaproducto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(MarcaProductoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(marcaproducto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(MarcaProductoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(marcaproducto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(MarcaProductoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(marcaproducto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtipoproducto_descripcion = document.createElement(MarcaProductoConstantesFunciones.IDTIPOPRODUCTO);
		elementtipoproducto_descripcion.appendChild(document.createTextNode(marcaproducto.gettipoproducto_descripcion()));
		element.appendChild(elementtipoproducto_descripcion);

		Element elementcodigo = document.createElement(MarcaProductoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(marcaproducto.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(MarcaProductoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(marcaproducto.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoMarcaProductosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<MarcaProducto> marcaproductosSeleccionados=new ArrayList<MarcaProducto>();
		
		marcaproductosSeleccionados=this.getMarcaProductosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoMarcaProducto(marcaproductosSeleccionados);
		
		this.generarReporteMarcaProductos("Todos",marcaproductosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoMarcaProducto(ArrayList<MarcaProducto> marcaproductosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(MarcaProducto marcaproductoAux:marcaproductosSeleccionados) {
				marcaproductoAux.setsDetalleGeneralEntityReporte(marcaproductoAux.toString());
			
				if(sTipoSeleccionar.equals(MarcaProductoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					marcaproductoAux.setsDescripcionGeneralEntityReporte1(marcaproductoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MarcaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO)) {
					existe=true;
					marcaproductoAux.setsDescripcionGeneralEntityReporte1(marcaproductoAux.gettipoproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MarcaProductoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					marcaproductoAux.setsDescripcionGeneralEntityReporte1(marcaproductoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(MarcaProductoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					marcaproductoAux.setsDescripcionGeneralEntityReporte1(marcaproductoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MarcaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesMarcaProducto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoMarcaProducto=true;
				this.isVisibilidadCeldaNuevoRelacionesMarcaProducto=true;
				this.isVisibilidadCeldaGuardarCambiosMarcaProducto=true;
			}
			
			this.isVisibilidadCeldaModificarMarcaProducto=false;
			this.isVisibilidadCeldaActualizarMarcaProducto=false;
			this.isVisibilidadCeldaEliminarMarcaProducto=false;
			this.isVisibilidadCeldaCancelarMarcaProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMarcaProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarMarcaProducto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoMarcaProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesMarcaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosMarcaProducto=false;
			this.isVisibilidadCeldaModificarMarcaProducto=false;
			this.isVisibilidadCeldaActualizarMarcaProducto=true;
			this.isVisibilidadCeldaEliminarMarcaProducto=false;
			this.isVisibilidadCeldaCancelarMarcaProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMarcaProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarMarcaProducto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoMarcaProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesMarcaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosMarcaProducto=false;
			this.isVisibilidadCeldaModificarMarcaProducto=false;
			this.isVisibilidadCeldaActualizarMarcaProducto=true;
			this.isVisibilidadCeldaEliminarMarcaProducto=true;
			this.isVisibilidadCeldaCancelarMarcaProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMarcaProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarMarcaProducto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoMarcaProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesMarcaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosMarcaProducto=false;
			this.isVisibilidadCeldaModificarMarcaProducto=false;
			this.isVisibilidadCeldaActualizarMarcaProducto=true;
			this.isVisibilidadCeldaEliminarMarcaProducto=false;
			this.isVisibilidadCeldaCancelarMarcaProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMarcaProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarMarcaProducto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoMarcaProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesMarcaProducto=true;
			this.isVisibilidadCeldaGuardarCambiosMarcaProducto=true;
			this.isVisibilidadCeldaModificarMarcaProducto=false;
			this.isVisibilidadCeldaActualizarMarcaProducto=false;
			this.isVisibilidadCeldaEliminarMarcaProducto=false;
			this.isVisibilidadCeldaCancelarMarcaProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMarcaProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarMarcaProducto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoMarcaProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesMarcaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosMarcaProducto=false;
			this.isVisibilidadCeldaActualizarMarcaProducto=false;
			this.isVisibilidadCeldaEliminarMarcaProducto=false;
			this.isVisibilidadCeldaCancelarMarcaProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMarcaProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarMarcaProducto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoMarcaProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesMarcaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosMarcaProducto=false;
			this.isVisibilidadCeldaModificarMarcaProducto=true;
			this.isVisibilidadCeldaActualizarMarcaProducto=false;
			this.isVisibilidadCeldaEliminarMarcaProducto=false;
			this.isVisibilidadCeldaCancelarMarcaProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMarcaProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarMarcaProducto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(MarcaProductoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoMarcaProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesMarcaProducto=true;
			this.isVisibilidadCeldaGuardarCambiosMarcaProducto=true;
		} else {
			this.actualizarEstadoPanelsMarcaProducto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarMarcaProducto=false;
			//this.isVisibilidadCeldaVerFormMarcaProducto=false;
			this.isVisibilidadCeldaDuplicarMarcaProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!marcaproductoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesMarcaProducto=false;
		} else {
			this.isVisibilidadCeldaNuevoMarcaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosMarcaProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(marcaproductoSessionBean.getEsGuardarRelacionado()) {
			if(!marcaproductoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesMarcaProducto=false;												
			}
			
			this.jButtonCerrarMarcaProducto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesMarcaProducto=false;
		}
		
		if(!this.permiteMantenimiento(this.marcaproducto)) {
			this.isVisibilidadCeldaActualizarMarcaProducto=false;
			this.isVisibilidadCeldaEliminarMarcaProducto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesMarcaProducto() {
		this.isVisibilidadCeldaNuevoMarcaProducto=false;
		this.isVisibilidadCeldaGuardarCambiosMarcaProducto=false;
	}
	
	public void actualizarEstadoPanelsMarcaProducto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionMarcaProducto!=null) {
				this.jScrollPanelDatosEdicionMarcaProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMarcaProducto!=null) {
				this.jTabbedPaneBusquedasMarcaProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMarcaProducto!=null) {
				this.jScrollPanelDatosMarcaProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionMarcaProducto!=null) {
				this.jPanelPaginacionMarcaProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMarcaProducto!=null) {
				this.jPanelParametrosReportesMarcaProducto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionMarcaProducto!=null) {
				this.jScrollPanelDatosEdicionMarcaProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMarcaProducto!=null) {
				this.jTabbedPaneBusquedasMarcaProducto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosMarcaProducto!=null) {
				this.jScrollPanelDatosMarcaProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionMarcaProducto!=null) {
				this.jPanelPaginacionMarcaProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMarcaProducto!=null) {
				this.jPanelParametrosReportesMarcaProducto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionMarcaProducto!=null) {
				this.jScrollPanelDatosEdicionMarcaProducto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMarcaProducto!=null) {
				this.jTabbedPaneBusquedasMarcaProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMarcaProducto!=null) {
				this.jScrollPanelDatosMarcaProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionMarcaProducto!=null) {
				this.jPanelPaginacionMarcaProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMarcaProducto!=null) {
				this.jPanelParametrosReportesMarcaProducto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionMarcaProducto!=null) {
				this.jScrollPanelDatosEdicionMarcaProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMarcaProducto!=null) {
				this.jTabbedPaneBusquedasMarcaProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMarcaProducto!=null) {
				this.jScrollPanelDatosMarcaProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionMarcaProducto!=null) {
				this.jPanelPaginacionMarcaProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMarcaProducto!=null) {
				this.jPanelParametrosReportesMarcaProducto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionMarcaProducto!=null) {
				this.jScrollPanelDatosEdicionMarcaProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMarcaProducto!=null) {
				this.jTabbedPaneBusquedasMarcaProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMarcaProducto!=null) {
				this.jScrollPanelDatosMarcaProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionMarcaProducto!=null) {
				this.jPanelPaginacionMarcaProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMarcaProducto!=null) {
				this.jPanelParametrosReportesMarcaProducto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionMarcaProducto!=null) {
				this.jScrollPanelDatosEdicionMarcaProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMarcaProducto!=null) {
				this.jTabbedPaneBusquedasMarcaProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMarcaProducto!=null) {
				this.jScrollPanelDatosMarcaProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionMarcaProducto!=null) {
				this.jPanelPaginacionMarcaProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMarcaProducto!=null) {
				this.jPanelParametrosReportesMarcaProducto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionMarcaProducto!=null) {
				this.jScrollPanelDatosEdicionMarcaProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMarcaProducto!=null) {
				this.jTabbedPaneBusquedasMarcaProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMarcaProducto!=null) {
				this.jScrollPanelDatosMarcaProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionMarcaProducto!=null) {
				this.jPanelPaginacionMarcaProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMarcaProducto!=null) {
				this.jPanelParametrosReportesMarcaProducto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasMarcaProducto!=null) {
					this.jTabbedPaneBusquedasMarcaProducto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesMarcaProducto!=null) {
				this.jPanelParametrosReportesMarcaProducto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMarcaProducto!=null) {
				this.jTabbedPaneBusquedasMarcaProducto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesMarcaProducto!=null) {
				this.jPanelParametrosReportesMarcaProducto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasMarcaProducto.remove(jPanelBusquedaPorCodigoMarcaProducto);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasMarcaProducto.remove(jPanelBusquedaPorNombreMarcaProducto);}

			this.isVisibilidadFK_IdTipoProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoProducto) {this.jTabbedPaneBusquedasMarcaProducto.remove(jPanelFK_IdTipoProductoMarcaProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoProducto(Boolean isParaTipoProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoProductoNegation=!isParaTipoProducto;

			this.isVisibilidadBusquedaPorCodigo=isParaTipoProductoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasMarcaProducto.remove(jPanelBusquedaPorCodigoMarcaProducto);}

			this.isVisibilidadBusquedaPorNombre=isParaTipoProductoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasMarcaProducto.remove(jPanelBusquedaPorNombreMarcaProducto);}

			this.isVisibilidadFK_IdTipoProducto=isParaTipoProducto;
			if(!this.isVisibilidadFK_IdTipoProducto) {this.jTabbedPaneBusquedasMarcaProducto.remove(jPanelFK_IdTipoProductoMarcaProducto);}
		}
		
	}
	
	

	public String registrarSesionMarcaProductoParaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(this.marcaproductoSessionBean==null) {
				this.marcaproductoSessionBean=new MarcaProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormMarcaProducto.productoSessionBean==null) {
				this.jInternalFrameDetalleFormMarcaProducto.productoSessionBean=new ProductoSessionBean();
			}

			this.jInternalFrameDetalleFormMarcaProducto.productoSessionBean.setsPathNavegacionActual(marcaproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormMarcaProducto.productoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProducto=this.jInternalFrameDetalleFormMarcaProducto.productoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormMarcaProducto.productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			this.jInternalFrameDetalleFormMarcaProducto.productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(MarcaProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormMarcaProducto.productoSessionBean.setisBusquedaDesdeForeignKeySesionMarcaProducto(true);
			this.jInternalFrameDetalleFormMarcaProducto.productoSessionBean.setlidMarcaProductoActual(this.idMarcaProductoActual);

			marcaproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyMarcaProducto(true);
			marcaproductoSessionBean.setlIdMarcaProductoActualForeignKey(this.idMarcaProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionMarcaProductoParaParametroInventarioDefectos() throws Exception {
		Boolean isPaginaPopupParametroInventarioDefecto=false;

		try {

			if(this.marcaproductoSessionBean==null) {
				this.marcaproductoSessionBean=new MarcaProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoSessionBean==null) {
				this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoSessionBean.setsPathNavegacionActual(marcaproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroInventarioDefecto=this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(true);
			this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(MarcaProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionMarcaProducto(true);
			this.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoSessionBean.setlidMarcaProductoActual(this.idMarcaProductoActual);

			marcaproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyMarcaProducto(true);
			marcaproductoSessionBean.setlIdMarcaProductoActualForeignKey(this.idMarcaProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//MarcaProductoSessionBean marcaproductoSessionBean=new MarcaProductoSessionBean();
		
		if(this.marcaproductoSessionBean==null) {
			this.marcaproductoSessionBean=new MarcaProductoSessionBean();
		}
		
		this.marcaproductoSessionBean.setsUltimaBusquedaMarcaProducto(this.getsAccionBusqueda());
		this.marcaproductoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.marcaproductoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			marcaproductoSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			marcaproductoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			marcaproductoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoProducto")) {
			marcaproductoSessionBean.setid_tipo_producto(this.getid_tipo_productoFK_IdTipoProducto());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//MarcaProductoSessionBean marcaproductoSessionBean=new MarcaProductoSessionBean();
		
		if(this.marcaproductoSessionBean==null) {
			this.marcaproductoSessionBean=new MarcaProductoSessionBean();
		}
		
		if(this.marcaproductoSessionBean.getsUltimaBusquedaMarcaProducto()!=null&&!this.marcaproductoSessionBean.getsUltimaBusquedaMarcaProducto().equals("")) {
			this.setsAccionBusqueda(marcaproductoSessionBean.getsUltimaBusquedaMarcaProducto());
			this.setiNumeroPaginacion(marcaproductoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(marcaproductoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(marcaproductoSessionBean.getcodigo());
				marcaproductoSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(marcaproductoSessionBean.getnombre());
				marcaproductoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(marcaproductoSessionBean.getid_empresa());
				marcaproductoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoProducto")) {
				this.setid_tipo_productoFK_IdTipoProducto(marcaproductoSessionBean.getid_tipo_producto());
				marcaproductoSessionBean.setid_tipo_producto(-1L);
			}
		}
		
		this.marcaproductoSessionBean.setsUltimaBusquedaMarcaProducto("");
		this.marcaproductoSessionBean.setiNumeroPaginacion(MarcaProductoConstantesFunciones.INUMEROPAGINACION);
		this.marcaproductoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaMarcaProducto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioMarcaProducto() {
		this.updateBorderResaltarBusquedasFormularioMarcaProducto();
		this.updateVisibilidadBusquedasFormularioMarcaProducto();
		this.updateHabilitarBusquedasFormularioMarcaProducto();
	}
	
	public void updateBorderResaltarBusquedasFormularioMarcaProducto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasMarcaProducto.getComponents().length>0) {
	

		if(this.marcaproductoConstantesFunciones.resaltarBusquedaPorCodigoMarcaProducto!=null) {
			index= this.jTabbedPaneBusquedasMarcaProducto.indexOfComponent(this.jPanelBusquedaPorCodigoMarcaProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMarcaProducto.getComponent(index);
				jPanel.setBorder(this.marcaproductoConstantesFunciones.resaltarBusquedaPorCodigoMarcaProducto);
			}
		}

		if(this.marcaproductoConstantesFunciones.resaltarBusquedaPorNombreMarcaProducto!=null) {
			index= this.jTabbedPaneBusquedasMarcaProducto.indexOfComponent(this.jPanelBusquedaPorNombreMarcaProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMarcaProducto.getComponent(index);
				jPanel.setBorder(this.marcaproductoConstantesFunciones.resaltarBusquedaPorNombreMarcaProducto);
			}
		}

		if(this.marcaproductoConstantesFunciones.resaltarFK_IdTipoProductoMarcaProducto!=null) {
			index= this.jTabbedPaneBusquedasMarcaProducto.indexOfComponent(this.jPanelFK_IdTipoProductoMarcaProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMarcaProducto.getComponent(index);
				jPanel.setBorder(this.marcaproductoConstantesFunciones.resaltarFK_IdTipoProductoMarcaProducto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioMarcaProducto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasMarcaProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasMarcaProducto.indexOfComponent(this.jPanelBusquedaPorCodigoMarcaProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasMarcaProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.marcaproductoConstantesFunciones.mostrarBusquedaPorCodigoMarcaProducto);
			if(!this.marcaproductoConstantesFunciones.mostrarBusquedaPorCodigoMarcaProducto && index>-1) {
				this.jTabbedPaneBusquedasMarcaProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasMarcaProducto.indexOfComponent(this.jPanelBusquedaPorNombreMarcaProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasMarcaProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.marcaproductoConstantesFunciones.mostrarBusquedaPorNombreMarcaProducto);
			if(!this.marcaproductoConstantesFunciones.mostrarBusquedaPorNombreMarcaProducto && index>-1) {
				this.jTabbedPaneBusquedasMarcaProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasMarcaProducto.indexOfComponent(this.jPanelFK_IdTipoProductoMarcaProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasMarcaProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.marcaproductoConstantesFunciones.mostrarFK_IdTipoProductoMarcaProducto);
			if(!this.marcaproductoConstantesFunciones.mostrarFK_IdTipoProductoMarcaProducto && index>-1) {
				this.jTabbedPaneBusquedasMarcaProducto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioMarcaProducto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasMarcaProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasMarcaProducto.indexOfComponent(this.jPanelBusquedaPorCodigoMarcaProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasMarcaProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.marcaproductoConstantesFunciones.activarBusquedaPorCodigoMarcaProducto);
				this.jTabbedPaneBusquedasMarcaProducto.setEnabledAt(index,this.marcaproductoConstantesFunciones.activarBusquedaPorCodigoMarcaProducto);
			}

			index= this.jTabbedPaneBusquedasMarcaProducto.indexOfComponent(this.jPanelBusquedaPorNombreMarcaProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasMarcaProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.marcaproductoConstantesFunciones.activarBusquedaPorNombreMarcaProducto);
				this.jTabbedPaneBusquedasMarcaProducto.setEnabledAt(index,this.marcaproductoConstantesFunciones.activarBusquedaPorNombreMarcaProducto);
			}

			index= this.jTabbedPaneBusquedasMarcaProducto.indexOfComponent(this.jPanelFK_IdTipoProductoMarcaProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasMarcaProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.marcaproductoConstantesFunciones.activarFK_IdTipoProductoMarcaProducto);
				this.jTabbedPaneBusquedasMarcaProducto.setEnabledAt(index,this.marcaproductoConstantesFunciones.activarFK_IdTipoProductoMarcaProducto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaMarcaProducto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasMarcaProducto.indexOfComponent(this.jPanelBusquedaPorCodigoMarcaProducto);

			this.jTabbedPaneBusquedasMarcaProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMarcaProducto.getComponent(index);

			this.marcaproductoConstantesFunciones.setResaltarBusquedaPorCodigoMarcaProducto(resaltar);

			jPanel.setBorder(this.marcaproductoConstantesFunciones.resaltarBusquedaPorCodigoMarcaProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasMarcaProducto.indexOfComponent(this.jPanelBusquedaPorNombreMarcaProducto);

			this.jTabbedPaneBusquedasMarcaProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMarcaProducto.getComponent(index);

			this.marcaproductoConstantesFunciones.setResaltarBusquedaPorNombreMarcaProducto(resaltar);

			jPanel.setBorder(this.marcaproductoConstantesFunciones.resaltarBusquedaPorNombreMarcaProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoProducto")) {
			index= this.jTabbedPaneBusquedasMarcaProducto.indexOfComponent(this.jPanelFK_IdTipoProductoMarcaProducto);

			this.jTabbedPaneBusquedasMarcaProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMarcaProducto.getComponent(index);

			this.marcaproductoConstantesFunciones.setResaltarFK_IdTipoProductoMarcaProducto(resaltar);

			jPanel.setBorder(this.marcaproductoConstantesFunciones.resaltarFK_IdTipoProductoMarcaProducto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarMarcaProducto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioMarcaProducto() throws Exception {

		if(this.jInternalFrameDetalleFormMarcaProducto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioMarcaProducto();
		this.updateVisibilidadResaltarControlesFormularioMarcaProducto();
		this.updateHabilitarResaltarControlesFormularioMarcaProducto();
		
	}
	
	public void updateBorderResaltarControlesFormularioMarcaProducto() throws Exception {
		if(this.jInternalFrameDetalleFormMarcaProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.marcaproductoConstantesFunciones.resaltaridMarcaProducto!=null && this.jInternalFrameDetalleFormMarcaProducto!=null) {this.jInternalFrameDetalleFormMarcaProducto.jLabelidMarcaProducto.setBorder(this.marcaproductoConstantesFunciones.resaltaridMarcaProducto);}
		if(this.marcaproductoConstantesFunciones.resaltarid_empresaMarcaProducto!=null && this.jInternalFrameDetalleFormMarcaProducto!=null) {this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_empresaMarcaProducto.setBorder(this.marcaproductoConstantesFunciones.resaltarid_empresaMarcaProducto);}
		if(this.marcaproductoConstantesFunciones.resaltarid_tipo_productoMarcaProducto!=null && this.jInternalFrameDetalleFormMarcaProducto!=null) {this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_tipo_productoMarcaProducto.setBorder(this.marcaproductoConstantesFunciones.resaltarid_tipo_productoMarcaProducto);}
		if(this.marcaproductoConstantesFunciones.resaltarcodigoMarcaProducto!=null && this.jInternalFrameDetalleFormMarcaProducto!=null) {this.jInternalFrameDetalleFormMarcaProducto.jTextFieldcodigoMarcaProducto.setBorder(this.marcaproductoConstantesFunciones.resaltarcodigoMarcaProducto);}
		if(this.marcaproductoConstantesFunciones.resaltarnombreMarcaProducto!=null && this.jInternalFrameDetalleFormMarcaProducto!=null) {this.jInternalFrameDetalleFormMarcaProducto.jTextAreanombreMarcaProducto.setBorder(this.marcaproductoConstantesFunciones.resaltarnombreMarcaProducto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioMarcaProducto() throws Exception {		
		if(this.jInternalFrameDetalleFormMarcaProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
	
		//this.jInternalFrameDetalleFormMarcaProducto.jLabelidMarcaProducto.setVisible(this.marcaproductoConstantesFunciones.mostraridMarcaProducto);
		this.jInternalFrameDetalleFormMarcaProducto.jPanelidMarcaProducto.setVisible(this.marcaproductoConstantesFunciones.mostraridMarcaProducto);
		//this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_empresaMarcaProducto.setVisible(this.marcaproductoConstantesFunciones.mostrarid_empresaMarcaProducto);
		this.jInternalFrameDetalleFormMarcaProducto.jPanelid_empresaMarcaProducto.setVisible(this.marcaproductoConstantesFunciones.mostrarid_empresaMarcaProducto);
		//this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_tipo_productoMarcaProducto.setVisible(this.marcaproductoConstantesFunciones.mostrarid_tipo_productoMarcaProducto);
		this.jInternalFrameDetalleFormMarcaProducto.jPanelid_tipo_productoMarcaProducto.setVisible(this.marcaproductoConstantesFunciones.mostrarid_tipo_productoMarcaProducto);
		//this.jInternalFrameDetalleFormMarcaProducto.jTextFieldcodigoMarcaProducto.setVisible(this.marcaproductoConstantesFunciones.mostrarcodigoMarcaProducto);
		this.jInternalFrameDetalleFormMarcaProducto.jPanelcodigoMarcaProducto.setVisible(this.marcaproductoConstantesFunciones.mostrarcodigoMarcaProducto);
		//this.jInternalFrameDetalleFormMarcaProducto.jTextAreanombreMarcaProducto.setVisible(this.marcaproductoConstantesFunciones.mostrarnombreMarcaProducto);
		this.jInternalFrameDetalleFormMarcaProducto.jPanelnombreMarcaProducto.setVisible(this.marcaproductoConstantesFunciones.mostrarnombreMarcaProducto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioMarcaProducto() throws Exception {
		if(this.jInternalFrameDetalleFormMarcaProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMarcaProducto!=null) {
	
		this.jInternalFrameDetalleFormMarcaProducto.jLabelidMarcaProducto.setEnabled(this.marcaproductoConstantesFunciones.activaridMarcaProducto);
		this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_empresaMarcaProducto.setEnabled(this.marcaproductoConstantesFunciones.activarid_empresaMarcaProducto);
		this.jInternalFrameDetalleFormMarcaProducto.jComboBoxid_tipo_productoMarcaProducto.setEnabled(this.marcaproductoConstantesFunciones.activarid_tipo_productoMarcaProducto);
		this.jInternalFrameDetalleFormMarcaProducto.jTextFieldcodigoMarcaProducto.setEnabled(this.marcaproductoConstantesFunciones.activarcodigoMarcaProducto);
		this.jInternalFrameDetalleFormMarcaProducto.jTextAreanombreMarcaProducto.setEnabled(this.marcaproductoConstantesFunciones.activarnombreMarcaProducto);
		}
	}
	
		
}