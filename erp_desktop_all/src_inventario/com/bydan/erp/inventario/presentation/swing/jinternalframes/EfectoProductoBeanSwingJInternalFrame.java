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

import com.bydan.erp.inventario.util.EfectoProductoConstantesFunciones;
import com.bydan.erp.inventario.util.EfectoProductoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.EfectoProductoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.EfectoProductoBean;
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
public class EfectoProductoBeanSwingJInternalFrame extends EfectoProductoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EfectoProductoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EfectoProducto> efectoproductoValidator = new ClassValidator<EfectoProducto>(EfectoProducto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EfectoProducto efectoproducto;	
	public EfectoProducto efectoproductoAux;
	public EfectoProducto efectoproductoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EfectoProducto efectoproductoTotales;
	public Long idEfectoProductoActual;
	public Long iIdNuevoEfectoProducto=0L;
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
	
	public Boolean isPermisoTodoEfectoProducto;
	public Boolean isPermisoNuevoEfectoProducto;
	public Boolean isPermisoActualizarEfectoProducto;
	public Boolean isPermisoActualizarOriginalEfectoProducto;
	public Boolean isPermisoEliminarEfectoProducto;
	public Boolean isPermisoGuardarCambiosEfectoProducto;
	public Boolean isPermisoConsultaEfectoProducto;
	public Boolean isPermisoBusquedaEfectoProducto;
	public Boolean isPermisoReporteEfectoProducto;
	public Boolean isPermisoPaginacionMedioEfectoProducto;
	public Boolean isPermisoPaginacionAltoEfectoProducto;
	public Boolean isPermisoPaginacionTodoEfectoProducto;
	public Boolean isPermisoCopiarEfectoProducto;
	public Boolean isPermisoVerFormEfectoProducto;
	public Boolean isPermisoDuplicarEfectoProducto;
	public Boolean isPermisoOrdenEfectoProducto;
	
	
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
	
	public EfectoProductoParameterReturnGeneral efectoproductoReturnGeneral;
	public EfectoProductoParameterReturnGeneral efectoproductoParameterGeneral;
	
	

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
	
	public Boolean isEsNuevoEfectoProducto=false;
	public Boolean esParaAccionDesdeFormularioEfectoProducto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EfectoProductoSessionBeanAdditional efectoproductoSessionBeanAdditional=null;
	
	public EfectoProductoSessionBeanAdditional getEfectoProductoSessionBeanAdditional() {
		return this.efectoproductoSessionBeanAdditional;
	}
	
	public void setEfectoProductoSessionBeanAdditional(EfectoProductoSessionBeanAdditional efectoproductoSessionBeanAdditional) {
		try {
			this.efectoproductoSessionBeanAdditional=efectoproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EfectoProductoBeanSwingJInternalFrameAdditional efectoproductoBeanSwingJInternalFrameAdditional=null;
	//public class EfectoProductoBeanSwingJInternalFrame
	
	public EfectoProductoBeanSwingJInternalFrameAdditional getEfectoProductoBeanSwingJInternalFrameAdditional() {
		return this.efectoproductoBeanSwingJInternalFrameAdditional;
	}
	
	public void setEfectoProductoBeanSwingJInternalFrameAdditional(EfectoProductoBeanSwingJInternalFrameAdditional efectoproductoBeanSwingJInternalFrameAdditional) {
		try {
			this.efectoproductoBeanSwingJInternalFrameAdditional=efectoproductoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EfectoProductoLogic efectoproductoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EfectoProducto efectoproductoBean;
	public EfectoProductoConstantesFunciones efectoproductoConstantesFunciones;
	//public EfectoProductoParameterReturnGeneral efectoproductoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoProductoLogic tipoproductoLogic;
	
	//PARAMETROS
	
	
	//public List<EfectoProducto> efectoproductos;	
	//public List<EfectoProducto> efectoproductosEliminados;
	//public List<EfectoProducto> efectoproductosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEfectoProducto=false;
	public Boolean isVisibilidadCeldaDuplicarEfectoProducto=true;
	public Boolean isVisibilidadCeldaCopiarEfectoProducto=true;
	public Boolean isVisibilidadCeldaVerFormEfectoProducto=true;
	public Boolean isVisibilidadCeldaOrdenEfectoProducto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEfectoProducto=false;
	public Boolean isVisibilidadCeldaModificarEfectoProducto=false;
	public Boolean isVisibilidadCeldaActualizarEfectoProducto=false;
	public Boolean isVisibilidadCeldaEliminarEfectoProducto=false;
	public Boolean isVisibilidadCeldaCancelarEfectoProducto=false;
	public Boolean isVisibilidadCeldaGuardarEfectoProducto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEfectoProducto=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoProducto=false;
	
	public Long getiIdNuevoEfectoProducto() {
		return this.iIdNuevoEfectoProducto;
	}

	public void setiIdNuevoEfectoProducto(Long iIdNuevoEfectoProducto) {
		this.iIdNuevoEfectoProducto = iIdNuevoEfectoProducto;
	}
	
	public Long getidEfectoProductoActual() {
		return this.idEfectoProductoActual;
	}

	public void setidEfectoProductoActual(Long idEfectoProductoActual) {
		this.idEfectoProductoActual = idEfectoProductoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EfectoProducto getefectoproducto() {
		return this.efectoproducto;
	}

	public void setefectoproducto(EfectoProducto efectoproducto) {
		this.efectoproducto = efectoproducto;
	}
	
	public EfectoProducto getefectoproductoAux() {
		return this.efectoproductoAux;
	}

	public void setefectoproductoAux(EfectoProducto efectoproductoAux) {
		this.efectoproductoAux = efectoproductoAux;
	}				
	
	public EfectoProducto getefectoproductoAnterior() {
		return this.efectoproductoAnterior;
	}

	public void setefectoproductoAnterior(EfectoProducto efectoproductoAnterior) {
		this.efectoproductoAnterior = efectoproductoAnterior;
	}	
	
	public EfectoProducto getefectoproductoTotales() {
		return this.efectoproductoTotales;
	}

	public void setefectoproductoTotales(EfectoProducto efectoproductoTotales) {
		this.efectoproductoTotales = efectoproductoTotales;
	}	
	
	public EfectoProducto getefectoproductoBean() {
		return this.efectoproductoBean;
	}

	public void setefectoproductoBean(EfectoProducto efectoproductoBean) {
		this.efectoproductoBean = efectoproductoBean;
	}	
	
	public EfectoProductoParameterReturnGeneral getefectoproductoReturnGeneral() {
		return this.efectoproductoReturnGeneral;
	}

	public void setefectoproductoReturnGeneral(EfectoProductoParameterReturnGeneral efectoproductoReturnGeneral) {
		this.efectoproductoReturnGeneral = efectoproductoReturnGeneral;
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
	
	
	public EfectoProductoLogic getEfectoProductoLogic()	{		
		return efectoproductoLogic;
	}

	public void setEfectoProductoLogic(EfectoProductoLogic efectoproductoLogic) {
		this.efectoproductoLogic = efectoproductoLogic;
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
	
	public Boolean getIsEsNuevoEfectoProducto() {
		return isEsNuevoEfectoProducto;
	}

	public void setIsEsNuevoEfectoProducto(Boolean isEsNuevoEfectoProducto) {
		this.isEsNuevoEfectoProducto = isEsNuevoEfectoProducto;
	}

	public Boolean getEsParaAccionDesdeFormularioEfectoProducto() {
		return esParaAccionDesdeFormularioEfectoProducto;
	}
	
	public void setEsParaAccionDesdeFormularioEfectoProducto(Boolean esParaAccionDesdeFormularioEfectoProducto) {
		this.esParaAccionDesdeFormularioEfectoProducto = esParaAccionDesdeFormularioEfectoProducto;
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

			if(this.efectoproductoSessionBean==null) {
				this.efectoproductoSessionBean=new EfectoProductoSessionBean();
			}

			if(!this.efectoproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(efectoproductoSessionBean.getlidEmpresaActual());
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

			if(this.efectoproductoSessionBean==null) {
				this.efectoproductoSessionBean=new EfectoProductoSessionBean();
			}

			if(!this.efectoproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProducto()) {
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
					tipoproductoLogic.getEntityWithConnection(efectoproductoSessionBean.getlidTipoProductoActual());
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

					if(this.efectoproducto!=null) {
						this.efectoproducto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
						this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_empresaEfectoProducto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEfectoProducto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
						if(this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_empresaEfectoProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_empresaEfectoProducto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEfectoProductoGenerico)throws Exception
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
				jComboBoxid_empresaEfectoProductoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEfectoProductoGenerico!=null && jComboBoxid_empresaEfectoProductoGenerico.getItemCount()>0) {
					jComboBoxid_empresaEfectoProductoGenerico.setSelectedIndex(0);
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

					if(this.efectoproducto!=null) {
						this.efectoproducto.setTipoProducto(tipoproductoTemp);
					}

					if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
						this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_tipo_productoEfectoProducto.setSelectedItem(tipoproductoTemp);
					}
				} else {
					//jComboBoxid_tipo_productoEfectoProducto.setSelectedItem(tipoproductoTemp);
					if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
						if(this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_tipo_productoEfectoProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_tipo_productoEfectoProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoproductoTemp!=null && jComboBoxid_tipo_productoFK_IdTipoProductoEfectoProducto!=null) {
						jComboBoxid_tipo_productoFK_IdTipoProductoEfectoProducto.setSelectedItem(tipoproductoTemp);
					} else {
						if(jComboBoxid_tipo_productoFK_IdTipoProductoEfectoProducto!=null) {
							//jComboBoxid_tipo_productoFK_IdTipoProductoEfectoProducto.setSelectedItem(tipoproductoTemp);
							if(jComboBoxid_tipo_productoFK_IdTipoProductoEfectoProducto.getItemCount()>0) {
								jComboBoxid_tipo_productoFK_IdTipoProductoEfectoProducto.setSelectedIndex(0);
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
	public void setActualTipoProductoForeignKeyGenerico(Long idTipoProductoSeleccionado,JComboBox jComboBoxid_tipo_productoEfectoProductoGenerico)throws Exception
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
				jComboBoxid_tipo_productoEfectoProductoGenerico.setSelectedItem(tipoproductoTemp);
			} else {
				if(jComboBoxid_tipo_productoEfectoProductoGenerico!=null && jComboBoxid_tipo_productoEfectoProductoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_productoEfectoProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(EfectoProducto efectoproducto,JComboBox jComboBoxid_empresaEfectoProductoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEfectoProductoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_empresaEfectoProducto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEfectoProductoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				efectoproducto.setid_empresa(empresaAux.getId());
				efectoproducto.setempresa_descripcion(EfectoProductoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				efectoproducto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoProductoForeignKey(EfectoProducto efectoproducto,JComboBox jComboBoxid_tipo_productoEfectoProductoGenerico)throws Exception
	{
		try
		{
			TipoProducto  tipoproductoAux=new TipoProducto();

			if(jComboBoxid_tipo_productoEfectoProductoGenerico==null) {
				tipoproductoAux=(TipoProducto)this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_tipo_productoEfectoProducto.getSelectedItem();
			} else {
				tipoproductoAux=(TipoProducto)jComboBoxid_tipo_productoEfectoProductoGenerico.getSelectedItem();
			}

			if(tipoproductoAux!=null && tipoproductoAux.getId()!=null) {
				efectoproducto.setid_tipo_producto(tipoproductoAux.getId());
				efectoproducto.settipoproducto_descripcion(EfectoProductoConstantesFunciones.getTipoProductoDescripcion(tipoproductoAux));
				efectoproducto.setTipoProducto(tipoproductoAux);			}
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

					if(!EfectoProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEfectoProducto!=null) { 
							this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_empresaEfectoProducto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_empresaEfectoProducto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEfectoProducto!=null) { 
					}

					if(!EfectoProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EfectoProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEfectoProducto!=null) { 
							this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_tipo_productoEfectoProducto.removeAllItems();

							for(TipoProducto tipoproducto:this.tipoproductosForeignKey) {
								this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_tipo_productoEfectoProducto.addItem(tipoproducto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEfectoProducto!=null) { 
					}

					if(!EfectoProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EfectoProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_productoFK_IdTipoProductoEfectoProducto.removeAllItems();

							for(TipoProducto tipoproducto:this.tipoproductosForeignKey) {
								this.jComboBoxid_tipo_productoFK_IdTipoProductoEfectoProducto.addItem(tipoproducto);
							}
						}

						if(!EfectoProductoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
							this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_empresaEfectoProducto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
							this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_empresaEfectoProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
							this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_tipo_productoEfectoProducto.setSelectedItem(tipoproducto);
						}
					} else {
						if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
							this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_tipo_productoEfectoProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_productoFK_IdTipoProductoEfectoProducto.setSelectedItem(tipoproducto);
						} else {
							this.jComboBoxid_tipo_productoFK_IdTipoProductoEfectoProducto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEfectoProducto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EfectoProductoConstantesFunciones.refrescarForeignKeysDescripcionesEfectoProducto(this.efectoproductoLogic.getEfectoProductos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EfectoProductoConstantesFunciones.refrescarForeignKeysDescripcionesEfectoProducto(this.efectoproductos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(TipoProducto.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//efectoproductoLogic.setEfectoProductos(this.efectoproductos);
			efectoproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EfectoProductoParameterReturnGeneral getEfectoProductoParameterGeneral() {
		return this.efectoproductoParameterGeneral;
	}
	
	public void setEfectoProductoParameterGeneral(EfectoProductoParameterReturnGeneral efectoproductoParameterGeneral) {
		this.efectoproductoParameterGeneral = efectoproductoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEfectoProducto() {
		return isPermisoTodoEfectoProducto;
	}

	public void setIsPermisoTodoEfectoProducto(Boolean isPermisoTodoEfectoProducto) {
		this.isPermisoTodoEfectoProducto = isPermisoTodoEfectoProducto;
	}

	public Boolean getIsPermisoNuevoEfectoProducto() {
		return isPermisoNuevoEfectoProducto;
	}

	public void setIsPermisoNuevoEfectoProducto(Boolean isPermisoNuevoEfectoProducto) {
		this.isPermisoNuevoEfectoProducto = isPermisoNuevoEfectoProducto;
	}

	public Boolean getIsPermisoActualizarEfectoProducto() {
		return isPermisoActualizarEfectoProducto;
	}

	public void setIsPermisoActualizarEfectoProducto(Boolean isPermisoActualizarEfectoProducto) {
		this.isPermisoActualizarEfectoProducto = isPermisoActualizarEfectoProducto;
	}

	public Boolean getIsPermisoEliminarEfectoProducto() {
		return isPermisoEliminarEfectoProducto;
	}

	public void setIsPermisoEliminarEfectoProducto(Boolean isPermisoEliminarEfectoProducto) {
		this.isPermisoEliminarEfectoProducto = isPermisoEliminarEfectoProducto;
	}

	public Boolean getIsPermisoGuardarCambiosEfectoProducto() {
		return isPermisoGuardarCambiosEfectoProducto;
	}

	public void setIsPermisoGuardarCambiosEfectoProducto(Boolean isPermisoGuardarCambiosEfectoProducto) {
		this.isPermisoGuardarCambiosEfectoProducto = isPermisoGuardarCambiosEfectoProducto;
	}
	
	public Boolean getIsPermisoConsultaEfectoProducto() {
		return isPermisoConsultaEfectoProducto;
	}

	public void setIsPermisoConsultaEfectoProducto(Boolean isPermisoConsultaEfectoProducto) {
		this.isPermisoConsultaEfectoProducto = isPermisoConsultaEfectoProducto;
	}

	public Boolean getIsPermisoBusquedaEfectoProducto() {
		return isPermisoBusquedaEfectoProducto;
	}

	public void setIsPermisoBusquedaEfectoProducto(Boolean isPermisoBusquedaEfectoProducto) {
		this.isPermisoBusquedaEfectoProducto = isPermisoBusquedaEfectoProducto;
	}

	public Boolean getIsPermisoReporteEfectoProducto() {
		return isPermisoReporteEfectoProducto;
	}

	public void setIsPermisoReporteEfectoProducto(Boolean isPermisoReporteEfectoProducto) {
		this.isPermisoReporteEfectoProducto = isPermisoReporteEfectoProducto;
	}
	
	public Boolean getIsPermisoPaginacionMedioEfectoProducto() {
		return isPermisoPaginacionMedioEfectoProducto;
	}

	public void setIsPermisoPaginacionMedioEfectoProducto(Boolean isPermisoPaginacionMedioEfectoProducto) {
		this.isPermisoPaginacionMedioEfectoProducto = isPermisoPaginacionMedioEfectoProducto;
	}
	
	public Boolean getIsPermisoPaginacionTodoEfectoProducto() {
		return isPermisoPaginacionTodoEfectoProducto;
	}

	public void setIsPermisoPaginacionTodoEfectoProducto(Boolean isPermisoPaginacionTodoEfectoProducto) {
		this.isPermisoPaginacionTodoEfectoProducto = isPermisoPaginacionTodoEfectoProducto;
	}
	
	public Boolean getIsPermisoPaginacionAltoEfectoProducto() {
		return isPermisoPaginacionAltoEfectoProducto;
	}

	public void setIsPermisoPaginacionAltoEfectoProducto(Boolean isPermisoPaginacionAltoEfectoProducto) {
		this.isPermisoPaginacionAltoEfectoProducto = isPermisoPaginacionAltoEfectoProducto;
	}
	
	public Boolean getIsPermisoCopiarEfectoProducto() {
		return isPermisoCopiarEfectoProducto;
	}

	public void setIsPermisoCopiarEfectoProducto(Boolean isPermisoCopiarEfectoProducto) {
		this.isPermisoCopiarEfectoProducto = isPermisoCopiarEfectoProducto;
	}
	
	public Boolean getIsPermisoVerFormEfectoProducto() {
		return isPermisoVerFormEfectoProducto;
	}

	public void setIsPermisoVerFormEfectoProducto(Boolean isPermisoVerFormEfectoProducto) {
		this.isPermisoVerFormEfectoProducto = isPermisoVerFormEfectoProducto;
	}
	
	public Boolean getIsPermisoDuplicarEfectoProducto() {
		return isPermisoDuplicarEfectoProducto;
	}

	public void setIsPermisoDuplicarEfectoProducto(Boolean isPermisoDuplicarEfectoProducto) {
		this.isPermisoDuplicarEfectoProducto = isPermisoDuplicarEfectoProducto;
	}
	
	public Boolean getIsPermisoOrdenEfectoProducto() {
		return isPermisoOrdenEfectoProducto;
	}

	public void setIsPermisoOrdenEfectoProducto(Boolean isPermisoOrdenEfectoProducto) {
		this.isPermisoOrdenEfectoProducto = isPermisoOrdenEfectoProducto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEfectoProducto() {
		return isVisibilidadCeldaNuevoEfectoProducto;
	}

	public void setIsVisibilidadCeldaNuevoEfectoProducto(Boolean isVisibilidadCeldaNuevoEfectoProducto) {
		this.isVisibilidadCeldaNuevoEfectoProducto = isVisibilidadCeldaNuevoEfectoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEfectoProducto() {
		return isVisibilidadCeldaDuplicarEfectoProducto;
	}

	public void setIsVisibilidadCeldaDuplicarEfectoProducto(Boolean isVisibilidadCeldaDuplicarEfectoProducto) {
		this.isVisibilidadCeldaDuplicarEfectoProducto = isVisibilidadCeldaDuplicarEfectoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEfectoProducto() {
		return isVisibilidadCeldaCopiarEfectoProducto;
	}

	public void setIsVisibilidadCeldaCopiarEfectoProducto(Boolean isVisibilidadCeldaCopiarEfectoProducto) {
		this.isVisibilidadCeldaCopiarEfectoProducto = isVisibilidadCeldaCopiarEfectoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEfectoProducto() {
		return isVisibilidadCeldaVerFormEfectoProducto;
	}

	public void setIsVisibilidadCeldaVerFormEfectoProducto(Boolean isVisibilidadCeldaVerFormEfectoProducto) {
		this.isVisibilidadCeldaVerFormEfectoProducto = isVisibilidadCeldaVerFormEfectoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEfectoProducto() {
		return isVisibilidadCeldaOrdenEfectoProducto;
	}

	public void setIsVisibilidadCeldaOrdenEfectoProducto(Boolean isVisibilidadCeldaOrdenEfectoProducto) {
		this.isVisibilidadCeldaOrdenEfectoProducto = isVisibilidadCeldaOrdenEfectoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEfectoProducto() {
		return isVisibilidadCeldaNuevoRelacionesEfectoProducto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEfectoProducto(Boolean isVisibilidadCeldaNuevoRelacionesEfectoProducto) {
		this.isVisibilidadCeldaNuevoRelacionesEfectoProducto = isVisibilidadCeldaNuevoRelacionesEfectoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEfectoProducto() {
		return isVisibilidadCeldaModificarEfectoProducto;
	}

	public void setIsVisibilidadCeldaModificarEfectoProducto(Boolean isVisibilidadCeldaModificarEfectoProducto) {
		this.isVisibilidadCeldaModificarEfectoProducto = isVisibilidadCeldaModificarEfectoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEfectoProducto() {
		return isVisibilidadCeldaActualizarEfectoProducto;
	}

	public void setIsVisibilidadCeldaActualizarEfectoProducto(Boolean isVisibilidadCeldaActualizarEfectoProducto) {
		this.isVisibilidadCeldaActualizarEfectoProducto = isVisibilidadCeldaActualizarEfectoProducto;
	}

	public Boolean getIsVisibilidadCeldaEliminarEfectoProducto() {
		return isVisibilidadCeldaEliminarEfectoProducto;
	}

	public void setIsVisibilidadCeldaEliminarEfectoProducto(Boolean isVisibilidadCeldaEliminarEfectoProducto) {
		this.isVisibilidadCeldaEliminarEfectoProducto = isVisibilidadCeldaEliminarEfectoProducto;
	}

	public Boolean getIsVisibilidadCeldaCancelarEfectoProducto() {
		return isVisibilidadCeldaCancelarEfectoProducto;
	}

	public void setIsVisibilidadCeldaCancelarEfectoProducto(Boolean isVisibilidadCeldaCancelarEfectoProducto) {
		this.isVisibilidadCeldaCancelarEfectoProducto = isVisibilidadCeldaCancelarEfectoProducto;
	}

	public Boolean getIsVisibilidadCeldaGuardarEfectoProducto() {
		return isVisibilidadCeldaGuardarEfectoProducto;
	}

	public void setIsVisibilidadCeldaGuardarEfectoProducto(Boolean isVisibilidadCeldaGuardarEfectoProducto) {
		this.isVisibilidadCeldaGuardarEfectoProducto = isVisibilidadCeldaGuardarEfectoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEfectoProducto() {
		return isVisibilidadCeldaGuardarCambiosEfectoProducto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEfectoProducto(Boolean isVisibilidadCeldaGuardarCambiosEfectoProducto) {
		this.isVisibilidadCeldaGuardarCambiosEfectoProducto = isVisibilidadCeldaGuardarCambiosEfectoProducto;
	}
		
	public EfectoProductoSessionBean getefectoproductoSessionBean() {
		return this.efectoproductoSessionBean;
	}
	
	public void setefectoproductoSessionBean(EfectoProductoSessionBean efectoproductoSessionBean) {
		this.efectoproductoSessionBean=efectoproductoSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEfectoProducto(EfectoProducto efectoproducto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(efectoproducto,null);
				this.setActualParaGuardarTipoProductoForeignKey(efectoproducto,null);
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
	
	public void bugActualizarReferenciaActual(EfectoProducto efectoproducto,EfectoProducto efectoproductoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEfectoProducto(efectoproducto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		efectoproductoAux.setId(efectoproducto.getId());
		efectoproductoAux.setVersionRow(efectoproducto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEfectoProducto();
		
			int intSelectedRow = this.jTableDatosEfectoProducto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproducto =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.efectoproducto =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EfectoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEfectoProducto(this.efectoproducto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEfectoProducto(this.efectoproducto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = efectoproductoValidator.getInvalidValues(this.efectoproducto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			efectoproductoLogic.setDatosCliente(datosCliente);
			efectoproductoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				efectoproductoAux=new  EfectoProducto();
				
				efectoproductoAux.setIsNew(true);
				efectoproductoAux.setIsChanged(true);
				
				efectoproductoAux.setEfectoProductoOriginal(this.efectoproducto);
				
				efectoproductoAux.setId(this.efectoproducto.getId());	
				efectoproductoAux.setVersionRow(this.efectoproducto.getVersionRow());	
				efectoproductoAux.setid_empresa(this.efectoproducto.getid_empresa());	
				efectoproductoAux.setid_tipo_producto(this.efectoproducto.getid_tipo_producto());	
				efectoproductoAux.setcodigo(this.efectoproducto.getcodigo());	
				efectoproductoAux.setnombre(this.efectoproducto.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.efectoproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.efectoproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(efectoproductoAux,efectoproductoLogic.getEfectoProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(efectoproductoAux,efectoproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.efectoproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.efectoproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						efectoproductoLogic.saveEfectoProductos();//WithConnection
						//efectoproductoLogic.getSetVersionRowEfectoProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.efectoproducto,efectoproductoAux);
					
					this.refrescarForeignKeysDescripcionesEfectoProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.efectoproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								efectoproductoLogic.saveEfectoProductoRelaciones(efectoproductoAux,this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//efectoproductoLogic.getSetVersionRowEfectoProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.efectoproducto,efectoproductoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							efectoproductoAux.setProductos(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							efectoproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.efectoproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.efectoproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(efectoproductoAux,efectoproductoLogic.getEfectoProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(efectoproductoAux,efectoproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.efectoproducto,efectoproductoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				efectoproductoAux=new  EfectoProducto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.efectoproductoSessionBean.getEsGuardarRelacionado() 
					|| (this.efectoproductoSessionBean.getEsGuardarRelacionado() && this.efectoproducto.getId()>=0)) {
						
					efectoproductoAux.setIsNew(false);
				}
				
				efectoproductoAux.setIsDeleted(false);
			
				efectoproductoAux.setId(this.efectoproducto.getId());	
				efectoproductoAux.setVersionRow(this.efectoproducto.getVersionRow());	
				efectoproductoAux.setid_empresa(this.efectoproducto.getid_empresa());	
				efectoproductoAux.setid_tipo_producto(this.efectoproducto.getid_tipo_producto());	
				efectoproductoAux.setcodigo(this.efectoproducto.getcodigo());	
				efectoproductoAux.setnombre(this.efectoproducto.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(efectoproductoAux,efectoproductoLogic.getEfectoProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(efectoproductoAux,efectoproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.efectoproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.efectoproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						efectoproductoLogic.saveEfectoProductos();//WithConnection
						//efectoproductoLogic.getSetVersionRowEfectoProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.efectoproducto,efectoproductoAux);
					
					this.refrescarForeignKeysDescripcionesEfectoProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.efectoproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								efectoproductoLogic.saveEfectoProductoRelaciones(efectoproductoAux,this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//efectoproductoLogic.getSetVersionRowEfectoProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.efectoproducto,efectoproductoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							efectoproductoAux.setProductos(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							efectoproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.efectoproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.efectoproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(efectoproductoAux,efectoproductoLogic.getEfectoProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(efectoproductoAux,efectoproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.efectoproducto,efectoproductoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				efectoproductoAux=new  EfectoProducto();
				
				efectoproductoAux.setIsNew(false);
				efectoproductoAux.setIsChanged(false);
				
				efectoproductoAux.setIsDeleted(true);
				
				efectoproductoAux.setId(this.efectoproducto.getId());	
				efectoproductoAux.setVersionRow(this.efectoproducto.getVersionRow());	
				efectoproductoAux.setid_empresa(this.efectoproducto.getid_empresa());	
				efectoproductoAux.setid_tipo_producto(this.efectoproducto.getid_tipo_producto());	
				efectoproductoAux.setcodigo(this.efectoproducto.getcodigo());	
				efectoproductoAux.setnombre(this.efectoproducto.getnombre());	
				
				if(this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.efectoproductoAux.getId()>=0) {	
						this.efectoproductosEliminados.add(efectoproductoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(efectoproductoAux,efectoproductoLogic.getEfectoProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(efectoproductoAux,efectoproductos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.efectoproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.efectoproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						efectoproductoLogic.saveEfectoProductos();//WithConnection
						//efectoproductoLogic.getSetVersionRowEfectoProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.efectoproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								efectoproductoLogic.saveEfectoProductoRelaciones(efectoproductoAux,this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//efectoproductoLogic.getSetVersionRowEfectoProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							efectoproductoAux.setProductos(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							efectoproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.efectoproductoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.efectoproductoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(efectoproductoAux,efectoproductoLogic.getEfectoProductos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(efectoproductoAux,efectoproductos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.getEfectoProductos().addAll(this.efectoproductosEliminados);
					
					efectoproductoLogic.saveEfectoProductos();//WithConnection
					//efectoproductoLogic.getSetVersionRowEfectoProductos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEfectoProducto();
				
				this.efectoproductosEliminados= new ArrayList<EfectoProducto>();		
			}
			
			if(this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.efectoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Efecto Producto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Efecto Producto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.efectoproducto=efectoproductoAux;
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
      		//this.finishProcessEfectoProducto();
      	}
		
	}	
	
	public void actualizarRelaciones(EfectoProducto efectoproductoLocal) throws Exception {
		
		if(this.efectoproductoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				efectoproductoLocal.setProductos(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());
				efectoproductoLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
			
			} else {
			
				efectoproductoLocal.setProductos(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productos);
				efectoproductoLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EfectoProducto efectoproductoLocal) throws Exception {	
		if(this.efectoproductoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				efectoproductoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoProductoDetalleFormJInternalFrame.class)) {
				TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrameLocal=(TipoProductoBeanSwingJInternalFrame) ((TipoProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoproductoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoProducto(tipoproductoBeanSwingJInternalFrameLocal.gettipoproducto(),true);
				tipoproductoBeanSwingJInternalFrameLocal.actualizarLista(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto,this.tipoproductosForeignKey);

				tipoproductoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto);

				efectoproductoLocal.setTipoProducto(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto);

				this.addItemDefectoCombosForeignKeyTipoProducto();
				this.cargarCombosFrameTipoProductosForeignKey("Formulario");
				this.setActualTipoProductoForeignKey(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEfectoProductoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEfectoProducto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.efectoproducto =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.efectoproducto =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = efectoproductoValidator.getInvalidValues(this.efectoproducto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EfectoProducto efectoproducto,List<EfectoProducto> efectoproductos) throws Exception {
		try	{		
			EfectoProductoConstantesFunciones.actualizarLista(efectoproducto,efectoproductos,this.efectoproductoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EfectoProducto efectoproducto,List<EfectoProducto> efectoproductos) throws Exception {
		try	{			
			EfectoProductoConstantesFunciones.actualizarSelectedLista(efectoproducto,efectoproductos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EfectoProducto> efectoproductosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				efectoproductosLocal=this.efectoproductoLogic.getEfectoProductos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				efectoproductosLocal=this.efectoproductos;
			}
			//ARCHITECTURE
		
			for(EfectoProducto efectoproductoLocal:efectoproductosLocal) {
				if(this.permiteMantenimiento(efectoproductoLocal) && efectoproductoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EfectoProductoConstantesFunciones.getEfectoProductoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EfectoProductoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEfectoProducto.jLabelid_empresaEfectoProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EfectoProductoConstantesFunciones.IDTIPOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEfectoProducto.jLabelid_tipo_productoEfectoProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EfectoProductoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEfectoProducto.jLabelcodigoEfectoProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EfectoProductoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEfectoProducto.jLabelnombreEfectoProducto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEfectoProducto.jLabelid_empresaEfectoProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEfectoProducto.jLabelid_tipo_productoEfectoProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEfectoProducto.jLabelcodigoEfectoProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEfectoProducto.jLabelnombreEfectoProducto,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Producto")) {
			if(this.efectoproducto==null) {
				this.efectoproducto= new EfectoProducto();
			}

			if(this.efectoproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEfectoProducto
				this.setVariablesFormularioToObjetoActualEfectoProducto(this.efectoproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEfectoProducto(this.efectoproducto);

				this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.getproducto().setEfectoProducto(this.efectoproducto);
			}

			return;
		}
		 else  if(sTipo.equals("ParametroInventarioDefecto")) {
			if(this.efectoproducto==null) {
				this.efectoproducto= new EfectoProducto();
			}

			if(this.efectoproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEfectoProducto
				this.setVariablesFormularioToObjetoActualEfectoProducto(this.efectoproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEfectoProducto(this.efectoproducto);

				this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.getparametroinventariodefecto().setEfectoProducto(this.efectoproducto);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEfectoProducto--;	
		
		
		this.efectoproductoAux=new EfectoProducto();
		
		this.efectoproductoAux.setId(this.iIdNuevoEfectoProducto);
		this.efectoproductoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.efectoproductoLogic.getEfectoProductos().add(this.efectoproductoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.efectoproductos.add(this.efectoproductoAux);
		}
		//ARCHITECTURE
		
		this.efectoproducto=this.efectoproductoAux;
		
		if(EfectoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEfectoProducto(this.efectoproducto);
			this.setVariablesObjetoActualToFormularioForeignKeyEfectoProducto(this.efectoproducto);
		}
				
		//this.setDefaultControlesEfectoProducto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEfectoProducto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEfectoProducto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEfectoProducto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEfectoProducto(this.efectoproductoBean,this.efectoproducto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEfectoProducto(this.efectoproducto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EfectoProductoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.efectoproductoSessionBean.getConGuardarRelaciones()) {
			classes=EfectoProductoConstantesFunciones.getClassesRelationshipsOfEfectoProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.efectoproductoReturnGeneral=efectoproductoLogic.procesarEventosEfectoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.efectoproductoLogic.getEfectoProductos(),this.efectoproducto,this.efectoproductoParameterGeneral,this.isEsNuevoEfectoProducto,classes);//this.efectoproductoLogic.getEfectoProducto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEfectoProducto(this.efectoproductoReturnGeneral,this.efectoproductoBean,false);
		
		if(this.efectoproductoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEfectoProducto(this.efectoproductoReturnGeneral.getEfectoProducto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEfectoProducto(this.efectoproductoReturnGeneral.getEfectoProducto());
		}
		
		if(this.efectoproductoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEfectoProducto(this.efectoproductoReturnGeneral.getEfectoProducto(),classes);//this.efectoproductoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEfectoProducto(this.efectoproducto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEfectoProducto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEfectoProducto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EfectoProductoBeanSwingJInternalFrameAdditional.RecargarFormEfectoProducto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEfectoProducto(false);
						
			if(efectoproductoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado() && ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EfectoProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEfectoProducto();
			}
			
			this.actualizarVisualTableDatosEfectoProducto();
			
			this.jTableDatosEfectoProducto.setRowSelectionInterval(this.getIndiceNuevoEfectoProducto(), this.getIndiceNuevoEfectoProducto());
			
			this.seleccionarFilaTablaEfectoProductoActual();
						
			this.actualizarEstadoCeldasBotonesEfectoProducto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEfectoProducto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEfectoProducto.jTextFieldcodigoEfectoProducto.setEnabled(isHabilitar && this.efectoproductoConstantesFunciones.activarcodigoEfectoProducto);
		this.jInternalFrameDetalleFormEfectoProducto.jTextAreanombreEfectoProducto.setEnabled(isHabilitar && this.efectoproductoConstantesFunciones.activarnombreEfectoProducto);	
		//
		this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_empresaEfectoProducto.setEnabled(isHabilitar && this.efectoproductoConstantesFunciones.activarid_empresaEfectoProducto);
		this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_tipo_productoEfectoProducto.setEnabled(isHabilitar && this.efectoproductoConstantesFunciones.activarid_tipo_productoEfectoProducto);
	};
	
	public void setDefaultControlesEfectoProducto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEfectoProducto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.efectoproductoSessionBean.setConGuardarRelaciones(true);			
			this.efectoproductoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEfectoProducto.jTabbedPaneRelacionesEfectoProducto.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.efectoproductoSessionBean.setConGuardarRelaciones(false);			
			this.efectoproductoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEfectoProducto.jTabbedPaneRelacionesEfectoProducto.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEfectoProducto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EfectoProducto efectoproductoAux:this.efectoproductoLogic.getEfectoProductos()) {
				if(efectoproductoAux.getId().equals(this.iIdNuevoEfectoProducto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EfectoProducto efectoproductoAux:this.efectoproductos) {
				if(efectoproductoAux.getId().equals(this.iIdNuevoEfectoProducto)) {
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
	
	public int getIndiceActualEfectoProducto(EfectoProducto efectoproducto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EfectoProducto efectoproductoAux:this.efectoproductoLogic.getEfectoProductos()) {
				if(efectoproductoAux.getId().equals(efectoproducto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EfectoProducto efectoproductoAux:this.efectoproductos) {
				if(efectoproductoAux.getId().equals(efectoproducto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEfectoProducto(EfectoProducto efectoproductoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EfectoProducto efectoproductoAux:this.efectoproductoLogic.getEfectoProductos()) {
				if(efectoproductoAux.getEfectoProductoOriginal().getId().equals(efectoproductoOriginal.getId())) {
					existe=true;
					efectoproductoOriginal.setId(efectoproductoAux.getId());
					efectoproductoOriginal.setVersionRow(efectoproductoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EfectoProducto efectoproductoAux:this.efectoproductos) {
				if(efectoproductoAux.getEfectoProductoOriginal().getId().equals(efectoproductoOriginal.getId())) {
					existe=true;
					efectoproductoOriginal.setId(efectoproductoAux.getId());
					efectoproductoOriginal.setVersionRow(efectoproductoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEfectoProducto(Boolean esParaCancelar) throws Exception {
		efectoproductosAux=new ArrayList<EfectoProducto>();
		efectoproductoAux=new EfectoProducto();
		
		if(!this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EfectoProducto efectoproductoAux:this.efectoproductoLogic.getEfectoProductos()) {
					if(efectoproductoAux.getId()<0) {
						efectoproductosAux.add(efectoproductoAux);
					}		
				}
				this.iIdNuevoEfectoProducto=0L;
				this.efectoproductoLogic.getEfectoProductos().removeAll(efectoproductosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EfectoProducto efectoproductoAux:this.efectoproductos) {
					if(efectoproductoAux.getId()<0) {
						efectoproductosAux.add(efectoproductoAux);
					}		
				}
				this.iIdNuevoEfectoProducto=0L;
				this.efectoproductos.removeAll(efectoproductosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEfectoProducto 
					&& this.efectoproductoLogic.getEfectoProductos().size()>0
					) {
					efectoproductoAux=this.efectoproductoLogic.getEfectoProductos().get(this.efectoproductoLogic.getEfectoProductos().size() - 1);
				
					if(efectoproductoAux.getId()<0) {
						this.efectoproductoLogic.getEfectoProductos().remove(efectoproductoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEfectoProducto && this.efectoproductos.size()>0) {
					efectoproductoAux=this.efectoproductos.get(this.efectoproductos.size() - 1);
				
					if(efectoproductoAux.getId()<0) {
						this.efectoproductos.remove(efectoproductoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEfectoProducto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(efectoproducto.getId()<0) {
				this.efectoproductoLogic.getEfectoProductos().remove(this.efectoproducto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(efectoproducto.getId()<0) {
				this.efectoproductos.remove(this.efectoproducto);
			}
		}			
	}
	
	public void setEstadosInicialesEfectoProducto(List<EfectoProducto> efectoproductosAux) throws Exception {
		EfectoProductoConstantesFunciones.setEstadosInicialesEfectoProducto(efectoproductosAux);
	}
	
	public void setEstadosInicialesEfectoProducto(EfectoProducto efectoproductoAux) throws Exception {
		EfectoProductoConstantesFunciones.setEstadosInicialesEfectoProducto(efectoproductoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEfectoProductoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEfectoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEfectoProductoActual()) {
				if(!this.isEsNuevoEfectoProducto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEfectoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEfectoProducto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEfectoProductoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Efecto Producto ?", "MANTENIMIENTO DE Efecto Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEfectoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EfectoProducto efectoproducto) throws Exception {
		EfectoProductoConstantesFunciones.seleccionarAsignar(this.efectoproducto,efectoproducto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEfectoProducto=this.isPermisoActualizarOriginalEfectoProducto;
			
			
			this.seleccionarAsignar(efectoproducto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EfectoProductoConstantesFunciones.quitarEspaciosEfectoProducto(this.efectoproducto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEfectoProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.efectoproductoSessionBean.setsFuncionBusquedaRapida(this.efectoproductoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEfectoProducto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEfectoProducto(esParaCancelar);				
				this.cancelarNuevoEfectoProducto(esParaCancelar);								
			}
			
			this.efectoproducto=new EfectoProducto();
			
			this.inicializarEfectoProducto();
			
			this.actualizarEstadoCeldasBotonesEfectoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEfectoProducto() throws Exception {
		try {
			EfectoProductoConstantesFunciones.inicializarEfectoProducto(this.efectoproducto);
			
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
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.efectoproductoLogic.getEfectoProductos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEfectoProductos(String sAccionBusqueda,List<EfectoProducto> efectoproductosParaReportes) throws Exception {
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
					sPathReporteFinal="EfectoProducto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EfectoProductoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EfectoProductoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EfectoProducto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Efecto Productos");		
		parameters.put("busquedapor", EfectoProductoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
					
					EfectoProductoLogic efectoproductoLogicAuxiliar=new EfectoProductoLogic();
					efectoproductoLogicAuxiliar.setDatosCliente(efectoproductoLogic.getDatosCliente());				
					efectoproductoLogicAuxiliar.setEfectoProductos(efectoproductosParaReportes);
					
					efectoproductoLogicAuxiliar.cargarRelacionesLoteForeignKeyEfectoProductoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					efectoproductosParaReportes=efectoproductoLogicAuxiliar.getEfectoProductos();
					
					//efectoproductoLogic.getNewConnexionToDeep();
					
					//for (EfectoProducto efectoproducto:efectoproductosParaReportes) {
					//	efectoproductoLogic.deepLoad(efectoproducto, false, DeepLoadType.INCLUDE, classes);
					//}						
					//efectoproductoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//efectoproductoLogic.closeNewConnexionToDeep();
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEfectoProducto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EfectoProductoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EfectoProductoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEfectoProducto=new JRBeanArrayDataSource(EfectoProductoJInternalFrame.TraerEfectoProductoBeans(efectoproductosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEfectoProducto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EfectoProductoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EfectoProductoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EfectoProductoBean.TraerEfectoProductoBeans(efectoproductosParaReportes).toArray()));
							
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
				this.generarExcelReporteEfectoProductos(sAccionBusqueda,sTipoArchivoReporte,efectoproductosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEfectoProductos(sAccionBusqueda,sTipoArchivoReporte,efectoproductosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEfectoProductoActionPerformed(null);
					//this.generarExcelReporteEfectoProductos(sAccionBusqueda,sTipoArchivoReporte,efectoproductosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEfectoProductos(sAccionBusqueda,sTipoArchivoReporte,efectoproductosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEfectoProductos(sAccionBusqueda,sTipoArchivoReporte,efectoproductosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEfectoProductos(sAccionBusqueda,sTipoArchivoReporte,efectoproductosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEfectoProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<EfectoProducto> efectoproductosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"efectoproducto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EfectoProductos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEfectoProducto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EfectoProducto efectoproducto : efectoproductosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EfectoProductoConstantesFunciones.generarExcelReporteDataEfectoProducto("NORMAL",row,workbook,efectoproducto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.efectoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Efecto Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEfectoProducto(String sTipo,Row row,Workbook workbook) {
		
		EfectoProductoConstantesFunciones.generarExcelReporteHeaderEfectoProducto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEfectoProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<EfectoProducto> efectoproductosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"efectoproducto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EfectoProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EfectoProducto efectoproducto : efectoproductosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EfectoProductoConstantesFunciones.getEfectoProductoDescripcion(efectoproducto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EfectoProductoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EfectoProductoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(efectoproducto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EfectoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EfectoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(efectoproducto.gettipoproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EfectoProductoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EfectoProductoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(efectoproducto.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EfectoProductoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EfectoProductoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(efectoproducto.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.efectoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Efecto Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEfectoProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<EfectoProducto> efectoproductosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EfectoProducto> efectoproductosRespaldo=null;
		
		classes=EfectoProductoConstantesFunciones.getClassesRelationshipsOfEfectoProducto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.efectoproductoLogic.setDatosCliente(this.datosCliente);
		this.efectoproductoLogic.setDatosDeep(this.datosDeep);
		this.efectoproductoLogic.setIsConDeep(true);
		
		efectoproductosRespaldo=this.efectoproductoLogic.getEfectoProductos();
		
		this.efectoproductoLogic.setEfectoProductos(efectoproductosParaReportes);	
		this.efectoproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		efectoproductosParaReportes=this.efectoproductoLogic.getEfectoProductos();
		this.efectoproductoLogic.setEfectoProductos(efectoproductosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"efectoproducto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EfectoProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEfectoProducto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EfectoProducto efectoproducto : efectoproductosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEfectoProducto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EfectoProductoConstantesFunciones.generarExcelReporteDataEfectoProducto("NORMAL",row,workbook,efectoproducto,cellStyleDataAux);
		
			
			


				//Producto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoConstantesFunciones.SCLASSWEBTITULO))) {

				if(efectoproducto.getProductos()!=null && efectoproducto.getProductos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoConstantesFunciones.generarExcelReporteHeaderProducto("RELACIONADO",row,workbook);
				}

				if(efectoproducto.getProductos()!=null) {
					i2=0;
					for(Producto producto : efectoproducto.getProductos()) {
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

				if(efectoproducto.getParametroInventarioDefectos()!=null && efectoproducto.getParametroInventarioDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroInventarioDefectoConstantesFunciones.generarExcelReporteHeaderParametroInventarioDefecto("RELACIONADO",row,workbook);
				}

				if(efectoproducto.getParametroInventarioDefectos()!=null) {
					i2=0;
					for(ParametroInventarioDefecto parametroinventariodefecto : efectoproducto.getParametroInventarioDefectos()) {
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
		cell.setCellValue(EfectoProductoConstantesFunciones.getEfectoProductoDescripcion(efectoproducto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.efectoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Efecto Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEfectoProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEfectoProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEfectoProducto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEfectoProducto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEfectoProducto() throws Exception {		
		this.startProcessEfectoProducto(true);
	}
	
	public void startProcessEfectoProducto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEfectoProducto ,this.jPanelParametrosReportesEfectoProducto, this.jScrollPanelDatosEfectoProducto,this.jPanelPaginacionEfectoProducto, this.jScrollPanelDatosEdicionEfectoProducto, this.jPanelAccionesEfectoProducto,this.jPanelAccionesFormularioEfectoProducto,this.jmenuBarEfectoProducto,this.jmenuBarDetalleEfectoProducto,this.jTtoolBarEfectoProducto,this.jTtoolBarDetalleEfectoProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasEfectoProducto=this.jTabbedPaneBusquedasEfectoProducto; 
		
		final JPanel jPanelParametrosReportesEfectoProducto=this.jPanelParametrosReportesEfectoProducto;
		//final JScrollPane jScrollPanelDatosEfectoProducto=this.jScrollPanelDatosEfectoProducto;
		final JTable jTableDatosEfectoProducto=this.jTableDatosEfectoProducto;		
		final JPanel jPanelPaginacionEfectoProducto=this.jPanelPaginacionEfectoProducto;
		//final JScrollPane jScrollPanelDatosEdicionEfectoProducto=this.jScrollPanelDatosEdicionEfectoProducto;
		final JPanel jPanelAccionesEfectoProducto=this.jPanelAccionesEfectoProducto;
		
		JPanel jPanelCamposAuxiliarEfectoProducto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEfectoProducto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
			jPanelCamposAuxiliarEfectoProducto=this.jInternalFrameDetalleFormEfectoProducto.jPanelCamposEfectoProducto;
			jPanelAccionesFormularioAuxiliarEfectoProducto=this.jInternalFrameDetalleFormEfectoProducto.jPanelAccionesFormularioEfectoProducto;
		}
		
		final JPanel jPanelCamposEfectoProducto=jPanelCamposAuxiliarEfectoProducto;
		final JPanel jPanelAccionesFormularioEfectoProducto=jPanelAccionesFormularioAuxiliarEfectoProducto;
		
		
		final JMenuBar jmenuBarEfectoProducto=this.jmenuBarEfectoProducto;
		final JToolBar jTtoolBarEfectoProducto=this.jTtoolBarEfectoProducto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEfectoProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEfectoProducto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
			jmenuBarDetalleAuxiliarEfectoProducto=this.jInternalFrameDetalleFormEfectoProducto.jmenuBarDetalleEfectoProducto;
			jTtoolBarDetalleAuxiliarEfectoProducto=this.jInternalFrameDetalleFormEfectoProducto.jTtoolBarDetalleEfectoProducto;
		}
		
		final JMenuBar jmenuBarDetalleEfectoProducto=jmenuBarDetalleAuxiliarEfectoProducto;
		final JToolBar jTtoolBarDetalleEfectoProducto=jTtoolBarDetalleAuxiliarEfectoProducto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEfectoProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEfectoProducto;
			processRunnable.jTableDatos=jTableDatosEfectoProducto;
			processRunnable.jPanelCampos=jPanelCamposEfectoProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionEfectoProducto;
			processRunnable.jPanelAcciones=jPanelAccionesEfectoProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEfectoProducto;
			
			
			processRunnable.jmenuBar=jmenuBarEfectoProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEfectoProducto;
			processRunnable.jTtoolBar=jTtoolBarEfectoProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEfectoProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEfectoProducto ,jPanelParametrosReportesEfectoProducto,jTableDatosEfectoProducto, /*jScrollPanelDatosEfectoProducto,*/jPanelCamposEfectoProducto,jPanelPaginacionEfectoProducto, /*jScrollPanelDatosEdicionEfectoProducto,*/ jPanelAccionesEfectoProducto,jPanelAccionesFormularioEfectoProducto,jmenuBarEfectoProducto,jmenuBarDetalleEfectoProducto,jTtoolBarEfectoProducto,jTtoolBarDetalleEfectoProducto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEfectoProducto ,jPanelParametrosReportesEfectoProducto, jScrollPanelDatosEfectoProducto,jPanelPaginacionEfectoProducto, jScrollPanelDatosEdicionEfectoProducto, jPanelAccionesEfectoProducto,jPanelAccionesFormularioEfectoProducto,jmenuBarEfectoProducto,jmenuBarDetalleEfectoProducto,jTtoolBarEfectoProducto,jTtoolBarDetalleEfectoProducto);
						
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
	
	public void finishProcessEfectoProducto() {// throws Exception 
		this.finishProcessEfectoProducto(true);
	}
	
	public void finishProcessEfectoProducto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEfectoProducto ,this.jPanelParametrosReportesEfectoProducto, this.jScrollPanelDatosEfectoProducto,this.jPanelPaginacionEfectoProducto, this.jScrollPanelDatosEdicionEfectoProducto, this.jPanelAccionesEfectoProducto,this.jPanelAccionesFormularioEfectoProducto,this.jmenuBarEfectoProducto,this.jmenuBarDetalleEfectoProducto,this.jTtoolBarEfectoProducto,this.jTtoolBarDetalleEfectoProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasEfectoProducto=this.jTabbedPaneBusquedasEfectoProducto; 
		
		final JPanel jPanelParametrosReportesEfectoProducto=this.jPanelParametrosReportesEfectoProducto;
		//final JScrollPane jScrollPanelDatosEfectoProducto=this.jScrollPanelDatosEfectoProducto;
		final JTable jTableDatosEfectoProducto=this.jTableDatosEfectoProducto;		
		final JPanel jPanelPaginacionEfectoProducto=this.jPanelPaginacionEfectoProducto;
		//final JScrollPane jScrollPanelDatosEdicionEfectoProducto=this.jScrollPanelDatosEdicionEfectoProducto;
		final JPanel jPanelAccionesEfectoProducto=this.jPanelAccionesEfectoProducto;
		
		JPanel jPanelCamposAuxiliarEfectoProducto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEfectoProducto=new JPanel();
		
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
			jPanelCamposAuxiliarEfectoProducto=this.jInternalFrameDetalleFormEfectoProducto.jPanelCamposEfectoProducto;
			jPanelAccionesFormularioAuxiliarEfectoProducto=this.jInternalFrameDetalleFormEfectoProducto.jPanelAccionesFormularioEfectoProducto;
		}
		
		final JPanel jPanelCamposEfectoProducto=jPanelCamposAuxiliarEfectoProducto;
		final JPanel jPanelAccionesFormularioEfectoProducto=jPanelAccionesFormularioAuxiliarEfectoProducto;
		
		
		final JMenuBar jmenuBarEfectoProducto=this.jmenuBarEfectoProducto;		
		final JToolBar jTtoolBarEfectoProducto=this.jTtoolBarEfectoProducto;
				
		JMenuBar jmenuBarDetalleAuxiliarEfectoProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEfectoProducto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
			jmenuBarDetalleAuxiliarEfectoProducto=this.jInternalFrameDetalleFormEfectoProducto.jmenuBarDetalleEfectoProducto;
			jTtoolBarDetalleAuxiliarEfectoProducto=this.jInternalFrameDetalleFormEfectoProducto.jTtoolBarDetalleEfectoProducto;		
		}
		
		final JMenuBar jmenuBarDetalleEfectoProducto=jmenuBarDetalleAuxiliarEfectoProducto;
		final JToolBar jTtoolBarDetalleEfectoProducto=jTtoolBarDetalleAuxiliarEfectoProducto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEfectoProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEfectoProducto;
			processRunnable.jTableDatos=jTableDatosEfectoProducto;
			processRunnable.jPanelCampos=jPanelCamposEfectoProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionEfectoProducto;
			processRunnable.jPanelAcciones=jPanelAccionesEfectoProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEfectoProducto;
			
			
			processRunnable.jmenuBar=jmenuBarEfectoProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEfectoProducto;
			processRunnable.jTtoolBar=jTtoolBarEfectoProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEfectoProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEfectoProducto ,jPanelParametrosReportesEfectoProducto, jTableDatosEfectoProducto,/*jScrollPanelDatosEfectoProducto,*/jPanelCamposEfectoProducto,jPanelPaginacionEfectoProducto, /*jScrollPanelDatosEdicionEfectoProducto,*/ jPanelAccionesEfectoProducto,jPanelAccionesFormularioEfectoProducto,jmenuBarEfectoProducto,jmenuBarDetalleEfectoProducto,jTtoolBarEfectoProducto,jTtoolBarDetalleEfectoProducto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEfectoProducto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEfectoProducto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEfectoProducto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEfectoProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEfectoProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEfectoProducto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEfectoProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEfectoProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEfectoProducto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.efectoproductoConstantesFunciones.getsFinalQueryEfectoProducto();
		String  finalQueryPaginacionTodos=this.efectoproductoConstantesFunciones.getsFinalQueryEfectoProducto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EfectoProductoConstantesFunciones.getArrayColumnasGlobalesNoEfectoProducto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EfectoProductoConstantesFunciones.getArrayColumnasGlobalesEfectoProducto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EfectoProductoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.efectoproductosEliminados= new ArrayList<EfectoProducto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEfectoProducto();
		
				///*EfectoProductoSessionBean*/this.efectoproductoSessionBean=new EfectoProductoSessionBean();
			
			if(this.efectoproductoSessionBean==null) {
				this.efectoproductoSessionBean=new EfectoProductoSessionBean();
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
					this.iNumeroPaginacion=EfectoProductoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EfectoProductoConstantesFunciones.getClassesForeignKeysOfEfectoProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/efectoproducto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			efectoproductosAux= new ArrayList<EfectoProducto>();
			
				
			efectoproductoLogic.setDatosCliente(this.datosCliente);
			efectoproductoLogic.setDatosDeep(this.datosDeep);
			efectoproductoLogic.setIsConDeep(true);
			
			
			efectoproductoLogic.getEfectoProductoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					efectoproductoLogic.getTodosEfectoProductos(finalQueryGlobal,pagination);
					
					//efectoproductoLogic.getTodosEfectoProductosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(efectoproductoLogic.getEfectoProductos()==null|| efectoproductoLogic.getEfectoProductos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							efectoproductosAux= new ArrayList<EfectoProducto>();
							efectoproductosAux.addAll(efectoproductoLogic.getEfectoProductos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							efectoproductosAux= new ArrayList<EfectoProducto>();
							efectoproductosAux.addAll(efectoproductos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							efectoproductoLogic.getTodosEfectoProductos(finalQueryGlobal+"",this.pagination);												
							
							//efectoproductoLogic.getTodosEfectoProductosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEfectoProductos("Todos",efectoproductoLogic.getEfectoProductos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							efectoproductoLogic.setEfectoProductos(new ArrayList<EfectoProducto>());					
							efectoproductoLogic.getEfectoProductos().addAll(efectoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							efectoproductos=new ArrayList<EfectoProducto>();
							efectoproductos.addAll(efectoproductosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEfectoProducto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEfectoProducto=this.idActual;
				
				} else if(this.idEfectoProductoActual!=null && this.idEfectoProductoActual!=0L) {
					idEfectoProducto=idEfectoProductoActual;
				}
				
					
				this.sDetalleReporte=EfectoProductoConstantesFunciones.getDetalleIndicePorId(idEfectoProducto);
				
				this.efectoproductos=new ArrayList<EfectoProducto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					efectoproductoLogic.getEntity(idEfectoProducto);
					
					//efectoproductoLogic.getEntityWithConnection(idEfectoProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					efectoproductoLogic.setEfectoProductos(new ArrayList<EfectoProducto>());
					efectoproductoLogic.getEfectoProductos().add(efectoproductoLogic.getEfectoProducto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.efectoproductos=new ArrayList<EfectoProducto>();
					this.efectoproductos.add(efectoproducto);
				}
				
				if(efectoproductoLogic.getEfectoProducto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=EfectoProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					efectoproductoLogic.getEfectoProductosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EfectoProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EfectoProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=efectoproductoLogic.getEfectoProductos()==null||efectoproductoLogic.getEfectoProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=efectoproductos==null|| efectoproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						efectoproductosAux=new ArrayList<EfectoProducto>();
						efectoproductosAux.addAll(efectoproductoLogic.getEfectoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							efectoproductosAux=new ArrayList<EfectoProducto>();
							efectoproductosAux.addAll(efectoproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							efectoproductoLogic.getEfectoProductosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EfectoProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EfectoProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEfectoProductos("BusquedaPorCodigo",efectoproductoLogic.getEfectoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEfectoProductos("BusquedaPorCodigo",efectoproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						efectoproductoLogic.setEfectoProductos(new ArrayList<EfectoProducto>());
						efectoproductoLogic.getEfectoProductos().addAll(efectoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							efectoproductos=new ArrayList<EfectoProducto>();
							efectoproductos.addAll(efectoproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=EfectoProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					efectoproductoLogic.getEfectoProductosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EfectoProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EfectoProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=efectoproductoLogic.getEfectoProductos()==null||efectoproductoLogic.getEfectoProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=efectoproductos==null|| efectoproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						efectoproductosAux=new ArrayList<EfectoProducto>();
						efectoproductosAux.addAll(efectoproductoLogic.getEfectoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							efectoproductosAux=new ArrayList<EfectoProducto>();
							efectoproductosAux.addAll(efectoproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							efectoproductoLogic.getEfectoProductosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EfectoProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EfectoProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEfectoProductos("BusquedaPorNombre",efectoproductoLogic.getEfectoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEfectoProductos("BusquedaPorNombre",efectoproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						efectoproductoLogic.setEfectoProductos(new ArrayList<EfectoProducto>());
						efectoproductoLogic.getEfectoProductos().addAll(efectoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							efectoproductos=new ArrayList<EfectoProducto>();
							efectoproductos.addAll(efectoproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=EfectoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					efectoproductoLogic.getEfectoProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EfectoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EfectoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=efectoproductoLogic.getEfectoProductos()==null||efectoproductoLogic.getEfectoProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=efectoproductos==null|| efectoproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						efectoproductosAux=new ArrayList<EfectoProducto>();
						efectoproductosAux.addAll(efectoproductoLogic.getEfectoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							efectoproductosAux=new ArrayList<EfectoProducto>();
							efectoproductosAux.addAll(efectoproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							efectoproductoLogic.getEfectoProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EfectoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EfectoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEfectoProductos("FK_IdEmpresa",efectoproductoLogic.getEfectoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEfectoProductos("FK_IdEmpresa",efectoproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						efectoproductoLogic.setEfectoProductos(new ArrayList<EfectoProducto>());
						efectoproductoLogic.getEfectoProductos().addAll(efectoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							efectoproductos=new ArrayList<EfectoProducto>();
							efectoproductos.addAll(efectoproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoProducto")) {
				this.sDetalleReporte=EfectoProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					efectoproductoLogic.getEfectoProductosFK_IdTipoProducto(finalQueryGlobal,pagination,id_tipo_productoFK_IdTipoProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EfectoProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EfectoProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=efectoproductoLogic.getEfectoProductos()==null||efectoproductoLogic.getEfectoProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=efectoproductos==null|| efectoproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						efectoproductosAux=new ArrayList<EfectoProducto>();
						efectoproductosAux.addAll(efectoproductoLogic.getEfectoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							efectoproductosAux=new ArrayList<EfectoProducto>();
							efectoproductosAux.addAll(efectoproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							efectoproductoLogic.getEfectoProductosFK_IdTipoProducto(finalQueryGlobal,pagination,id_tipo_productoFK_IdTipoProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EfectoProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EfectoProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEfectoProductos("FK_IdTipoProducto",efectoproductoLogic.getEfectoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEfectoProductos("FK_IdTipoProducto",efectoproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						efectoproductoLogic.setEfectoProductos(new ArrayList<EfectoProducto>());
						efectoproductoLogic.getEfectoProductos().addAll(efectoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							efectoproductos=new ArrayList<EfectoProducto>();
							efectoproductos.addAll(efectoproductosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEfectoProducto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEfectoProducto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=efectoproductoLogic.getEfectoProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=efectoproductos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=efectoproductoLogic.getEfectoProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=efectoproductos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EfectoProducto efectoproducto) {
		Boolean permite=true;
		
		if(this.efectoproducto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EfectoProductoConstantesFunciones.getOrderByListaEfectoProducto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EfectoProductoConstantesFunciones.getOrderByListaEfectoProducto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EfectoProducto efectoproducto:efectoproductoLogic.getEfectoProductos()) {
				if(efectoproducto.getsType().equals(Constantes2.S_TOTALES)) {
					efectoproductoTotales=efectoproducto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EfectoProducto efectoproducto:this.efectoproductos) {
				if(efectoproducto.getsType().equals(Constantes2.S_TOTALES)) {
					efectoproductoTotales=efectoproducto;
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
			this.efectoproductoAux=new EfectoProducto();
			this.efectoproductoAux.setsType(Constantes2.S_TOTALES);
			this.efectoproductoAux.setIsNew(false);
			this.efectoproductoAux.setIsChanged(false);
			this.efectoproductoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EfectoProductoConstantesFunciones.TotalizarValoresFilaEfectoProducto(this.efectoproductoLogic.getEfectoProductos(),this.efectoproductoAux);
				
				this.efectoproductoLogic.getEfectoProductos().add(this.efectoproductoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EfectoProductoConstantesFunciones.TotalizarValoresFilaEfectoProducto(this.efectoproductos,this.efectoproductoAux);
				
				this.efectoproductos.add(this.efectoproductoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		efectoproductoTotales=new EfectoProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.efectoproductoLogic.getEfectoProductos().remove(efectoproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.efectoproductos.remove(efectoproductoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		efectoproductoTotales=new EfectoProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EfectoProducto efectoproducto:efectoproductoLogic.getEfectoProductos()) {
				if(efectoproducto.getsType().equals(Constantes2.S_TOTALES)) {
					efectoproductoTotales=efectoproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EfectoProductoConstantesFunciones.TotalizarValoresFilaEfectoProducto(this.efectoproductoLogic.getEfectoProductos(),efectoproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EfectoProducto efectoproducto:this.efectoproductos) {
				if(efectoproducto.getsType().equals(Constantes2.S_TOTALES)) {
					efectoproductoTotales=efectoproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EfectoProductoConstantesFunciones.TotalizarValoresFilaEfectoProducto(this.efectoproductos,efectoproductoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEfectoProductosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEfectoProductosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEfectoProductosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEfectoProductosFK_IdTipoProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEfectoProductosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					efectoproductoLogic.getEfectoProductosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEfectoProductosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					efectoproductoLogic.getEfectoProductosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEfectoProductosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					efectoproductoLogic.getEfectoProductosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEfectoProductosFK_IdTipoProducto(String sFinalQuery,Long id_tipo_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					efectoproductoLogic.getEfectoProductosFK_IdTipoProducto(sFinalQuery,this.pagination,id_tipo_producto);
				
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
	
	public void inicializarPermisosEfectoProducto() {
		this.isPermisoTodoEfectoProducto=false;
		this.isPermisoNuevoEfectoProducto=false;
		this.isPermisoActualizarEfectoProducto=false;
		this.isPermisoActualizarOriginalEfectoProducto=false;
		this.isPermisoEliminarEfectoProducto=false;
		this.isPermisoGuardarCambiosEfectoProducto=false;
		this.isPermisoConsultaEfectoProducto=false;
		this.isPermisoBusquedaEfectoProducto=false;
		this.isPermisoReporteEfectoProducto=false;		
		this.isPermisoOrdenEfectoProducto=false;		
		this.isPermisoPaginacionMedioEfectoProducto=false;		
		this.isPermisoPaginacionAltoEfectoProducto=false;
		this.isPermisoPaginacionTodoEfectoProducto=false;
		this.isPermisoCopiarEfectoProducto=false;		
		this.isPermisoVerFormEfectoProducto=false;		
		this.isPermisoDuplicarEfectoProducto=false;		
		this.isPermisoOrdenEfectoProducto=false;		
	}
	
	public void setPermisosUsuarioEfectoProducto(Boolean isPermiso) {
		this.isPermisoTodoEfectoProducto=isPermiso;
		this.isPermisoNuevoEfectoProducto=isPermiso;
		this.isPermisoActualizarEfectoProducto=isPermiso;
		this.isPermisoActualizarOriginalEfectoProducto=isPermiso;
		this.isPermisoEliminarEfectoProducto=isPermiso;
		this.isPermisoGuardarCambiosEfectoProducto=isPermiso;
		this.isPermisoConsultaEfectoProducto=isPermiso;
		this.isPermisoBusquedaEfectoProducto=isPermiso;
		this.isPermisoReporteEfectoProducto=isPermiso;
		this.isPermisoOrdenEfectoProducto=isPermiso;		
		this.isPermisoPaginacionMedioEfectoProducto=isPermiso;		
		this.isPermisoPaginacionAltoEfectoProducto=isPermiso;		
		this.isPermisoPaginacionTodoEfectoProducto=isPermiso;		
		this.isPermisoCopiarEfectoProducto=isPermiso;		
		this.isPermisoVerFormEfectoProducto=isPermiso;		
		this.isPermisoDuplicarEfectoProducto=isPermiso;
		this.isPermisoOrdenEfectoProducto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEfectoProducto(Boolean isPermiso) {
		//this.isPermisoTodoEfectoProducto=isPermiso;
		this.isPermisoNuevoEfectoProducto=isPermiso;
		this.isPermisoActualizarEfectoProducto=isPermiso;
		this.isPermisoActualizarOriginalEfectoProducto=isPermiso;
		this.isPermisoEliminarEfectoProducto=isPermiso;
		this.isPermisoGuardarCambiosEfectoProducto=isPermiso;
		//this.isPermisoConsultaEfectoProducto=isPermiso;
		//this.isPermisoBusquedaEfectoProducto=isPermiso;
		//this.isPermisoReporteEfectoProducto=isPermiso;
		//this.isPermisoOrdenEfectoProducto=isPermiso;		
		//this.isPermisoPaginacionMedioEfectoProducto=isPermiso;		
		//this.isPermisoPaginacionAltoEfectoProducto=isPermiso;		
		//this.isPermisoPaginacionTodoEfectoProducto=isPermiso;		
		//this.isPermisoCopiarEfectoProducto=isPermiso;		
		//this.isPermisoDuplicarEfectoProducto=isPermiso;
		//this.isPermisoOrdenEfectoProducto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEfectoProductoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ProductoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
		if(EfectoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosProducto=this.verificarGetPermisosUsuarioOpcionEfectoProductoClaseRelacionada(this.opcionsRelacionadas,ProductoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosParametroInventarioDefecto=false;
		this.isTienePermisosParametroInventarioDefecto=this.verificarGetPermisosUsuarioOpcionEfectoProductoClaseRelacionada(this.opcionsRelacionadas,ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEfectoProducto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEfectoProductoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosProducto=conPermiso;
		this.isTienePermisosParametroInventarioDefecto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEfectoProductoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEfectoProductoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEfectoProductoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosProducto && this.jInternalFrameDetalleFormEfectoProducto!=null && this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEfectoProducto.jTabbedPaneRelacionesEfectoProducto.remove(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosParametroInventarioDefecto && this.jInternalFrameDetalleFormEfectoProducto!=null && this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEfectoProducto.jTabbedPaneRelacionesEfectoProducto.remove(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEfectoProducto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EfectoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EfectoProductoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEfectoProducto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEfectoProducto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEfectoProducto=this.isPermisoActualizarEfectoProducto;
			this.isPermisoEliminarEfectoProducto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEfectoProducto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEfectoProducto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEfectoProducto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEfectoProducto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEfectoProducto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEfectoProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEfectoProducto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEfectoProducto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEfectoProducto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEfectoProducto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEfectoProducto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEfectoProducto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEfectoProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEfectoProducto.setToolTipText(this.jTableDatosEfectoProducto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEfectoProducto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEfectoProducto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EfectoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EfectoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEfectoProducto() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosProducto && this.efectoproductoConstantesFunciones.mostrarProductoEfectoProducto && !EfectoProductoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Producto");
			reporte.setsDescripcion("Producto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosParametroInventarioDefecto && this.efectoproductoConstantesFunciones.mostrarParametroInventarioDefectoEfectoProducto && !EfectoProductoConstantesFunciones.ISGUARDARREL) {

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
	public void inicializarCombosForeignKeyEfectoProductoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tipoproductosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEfectoProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EfectoProductoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEfectoProductoListas(false);
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
	
	public void cargarCombosLoteForeignKeyEfectoProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EfectoProductoParameterReturnGeneral efectoproductoReturnGeneral=new EfectoProductoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.efectoproductoConstantesFunciones.cargarid_empresaEfectoProducto)
					 || (this.esRecargarFks && this.efectoproductoConstantesFunciones.cargarid_empresaEfectoProducto)) {

					if(!this.efectoproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+efectoproductoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTipoProducto="";

				if(((this.tipoproductosForeignKey==null||this.tipoproductosForeignKey.size()<=0) && this.efectoproductoConstantesFunciones.cargarid_tipo_productoEfectoProducto)
					 || (this.esRecargarFks && this.efectoproductoConstantesFunciones.cargarid_tipo_productoEfectoProducto)) {

					if(!this.efectoproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoProductoConstantesFunciones.getArrayColumnasGlobalesTipoProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoProducto, "");
						finalQueryGlobalTipoProducto+=TipoProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoProducto=" WHERE " + ConstantesSql.ID + "="+efectoproductoSessionBean.getlidTipoProductoActual();
					}
				} else {
					finalQueryGlobalTipoProducto="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				efectoproductoReturnGeneral=efectoproductoLogic.cargarCombosLoteForeignKeyEfectoProducto(finalQueryGlobalEmpresa,finalQueryGlobalTipoProducto);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=efectoproductoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTipoProducto.equals("NONE")) {
				this.tipoproductosForeignKey=efectoproductoReturnGeneral.gettipoproductosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEfectoProducto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoProducto();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.efectoproductoSessionBean==null) {
				this.efectoproductoSessionBean=new EfectoProductoSessionBean();
			}

			if(!this.efectoproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.efectoproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProducto()) {
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
	
	public void initActionsCombosTodosForeignKeyEfectoProducto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEfectoProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEfectoProducto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEfectoProducto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEfectoProducto(EfectoProducto efectoproducto)throws Exception {	
		try {
			
			this.setActualTipoProductoForeignKey(efectoproducto.getid_tipo_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEfectoProducto(EfectoProducto efectoproducto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEfectoProducto()throws Exception {	
		try {
			
			this.setActualTipoProductoForeignKey(this.efectoproductoConstantesFunciones.getid_tipo_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEfectoProducto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEfectoProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEfectoProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEfectoProducto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEfectoProducto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoProductosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEfectoProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEfectoProducto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_empresaEfectoProducto!=null && this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_empresaEfectoProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_empresaEfectoProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_tipo_productoEfectoProducto!=null && this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_tipo_productoEfectoProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_tipo_productoEfectoProducto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public EfectoProductoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EfectoProductoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EfectoProductoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.efectoproductoSessionBean=new EfectoProductoSessionBean(); 
		this.efectoproductoConstantesFunciones=new EfectoProductoConstantesFunciones(); 
		this.efectoproductoBean=new EfectoProducto();//(this.efectoproductoConstantesFunciones); 		
		this.efectoproductoReturnGeneral=new EfectoProductoParameterReturnGeneral(); 
		
		this.efectoproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.efectoproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EfectoProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EfectoProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EfectoProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEfectoProducto(true);
			
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
			
			this.efectoproductoConstantesFunciones=new EfectoProductoConstantesFunciones(); 
			this.efectoproductoBean=new EfectoProducto();//this.efectoproductoConstantesFunciones); 			
			this.efectoproductoReturnGeneral=new EfectoProductoParameterReturnGeneral(); 
		
			EfectoProductoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Efecto Producto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.efectoproducto=new EfectoProducto();
			this.efectoproductos = new ArrayList<EfectoProducto>();
			this.efectoproductosAux = new ArrayList<EfectoProducto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic=new EfectoProductoLogic();
				this.efectoproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.efectoproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.efectoproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEfectoProducto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEfectoProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEfectoProducto);	
					}
					
					if(this.jInternalFrameImportacionEfectoProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEfectoProducto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEfectoProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEfectoProducto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEfectoProducto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEfectoProducto);
				this.jInternalFrameDetalleFormEfectoProducto.setVisible(false);
				this.jInternalFrameDetalleFormEfectoProducto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEfectoProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEfectoProducto);
					this.jInternalFrameReporteDinamicoEfectoProducto.setVisible(false);
					this.jInternalFrameReporteDinamicoEfectoProducto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEfectoProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEfectoProducto);
					this.jInternalFrameImportacionEfectoProducto.setVisible(false);
					this.jInternalFrameImportacionEfectoProducto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEfectoProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEfectoProducto);
					this.jInternalFrameOrderByEfectoProducto.setVisible(false);
					this.jInternalFrameOrderByEfectoProducto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEfectoProductoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EfectoProductoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.efectoproductoReturnGeneral=new EfectoProductoParameterReturnGeneral();
			
			this.efectoproductoParameterGeneral=new EfectoProductoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.efectoproductoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EfectoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ProductoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EfectoProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.efectoproductoSessionBean.getEsGuardarRelacionado(),this.efectoproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EfectoProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.efectoproductoSessionBean.getEsGuardarRelacionado(),this.efectoproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEfectoProducto=false;
			this.isVisibilidadCeldaDuplicarEfectoProducto=true;
			this.isVisibilidadCeldaCopiarEfectoProducto=true;
			this.isVisibilidadCeldaVerFormEfectoProducto=true;
			this.isVisibilidadCeldaOrdenEfectoProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesEfectoProducto=false;
			this.isVisibilidadCeldaModificarEfectoProducto=false;
			this.isVisibilidadCeldaActualizarEfectoProducto=false;
			this.isVisibilidadCeldaEliminarEfectoProducto=false;
			this.isVisibilidadCeldaCancelarEfectoProducto=false;
			this.isVisibilidadCeldaGuardarEfectoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosEfectoProducto=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoProducto=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEfectoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEfectoProducto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEfectoProducto(false);
			
			this.setPermisosUsuarioEfectoProducto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.efectoproductoSessionBean.getEsGuardarRelacionado() 
				|| (this.efectoproductoSessionBean.getEsGuardarRelacionado() && this.efectoproductoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEfectoProductoClasesRelacionadas();
			}
			
			if(this.efectoproductoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEfectoProductoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EfectoProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEfectoProducto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEfectoProducto();
			}
			
			if(!this.isPermisoBusquedaEfectoProducto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEfectoProducto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.efectoproductoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEfectoProducto,this.isPermisoPaginacionMedioEfectoProducto,this.isPermisoPaginacionTodoEfectoProducto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EfectoProductoConstantesFunciones.getTiposSeleccionarEfectoProducto());
				
				this.tiposColumnasSelect=EfectoProductoConstantesFunciones.getTiposSeleccionarEfectoProducto(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEfectoProducto();				
				//this.tiposRelacionesSelect=EfectoProductoConstantesFunciones.getTiposRelacionesEfectoProducto(true);
				
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
			//if(!this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEfectoProducto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioEfectoProducto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioEfectoProducto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEfectoProducto() ;
			
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
				efectoproductoImplementable= (EfectoProductoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EfectoProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				efectoproductoImplementableHome= (EfectoProductoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EfectoProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.efectoproductos= new ArrayList<EfectoProducto>();
			this.efectoproductosEliminados= new ArrayList<EfectoProducto>();
						
			this.isEsNuevoEfectoProducto=false;
			this.esParaAccionDesdeFormularioEfectoProducto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tipoproductosForeignKey=new ArrayList<TipoProducto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEfectoProducto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEfectoProducto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EfectoProductoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EfectoProductoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEfectoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEfectoProducto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEfectoProducto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEfectoProducto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEfectoProducto();
			}
			
			EfectoProductoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEfectoProducto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEfectoProducto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEfectoProducto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEfectoProducto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EfectoProducto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEfectoProducto() {
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
			if(sTipo.equals("RelacionesEfectoProducto")) {
				iIndex=this.jInternalFrameDetalleFormEfectoProducto.jTabbedPaneRelacionesEfectoProducto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEfectoProducto.jTabbedPaneRelacionesEfectoProducto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEfectoProducto.getSelectedRow();	
				
				

				if(sTitle.equals("Parametro Inventario Defectos")) {
					if(!ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEfectoProducto();

						this.cargarParteTabPanelRelacionadaParametroInventarioDefecto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Productos")) {
					if(!ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEfectoProducto();

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
				this.finishProcessEfectoProducto();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaParametroInventarioDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEfectoProducto.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(false,true,iIndex);
		this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();

		//this.jTabbedPaneRelacionesEfectoProducto.updateUI();
		//this.jTabbedPaneRelacionesEfectoProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEfectoProducto.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProducto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEfectoProducto.cargarSessionConBeanSwingJInternalFrameProducto(false,true,iIndex);
		this.jButtonProductoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProducto();

		//this.jTabbedPaneRelacionesEfectoProducto.updateUI();
		//this.jTabbedPaneRelacionesEfectoProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEfectoProducto.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Producto")) {
				int row=this.jTableDatosEfectoProducto.getSelectedRow();
				jButtonProductoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ParametroInventarioDefecto")) {
				int row=this.jTableDatosEfectoProducto.getSelectedRow();
				jButtonParametroInventarioDefectoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Producto")) {

					if(this.isTienePermisosProducto && this.efectoproductoConstantesFunciones.mostrarProductoEfectoProducto && !EfectoProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Productos"+"("+ProductoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Productos");

						if(efectoproductoConstantesFunciones.resaltarProductoEfectoProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(efectoproductoConstantesFunciones.resaltarProductoEfectoProducto);
						}

						jmenuItem.setEnabled(this.efectoproductoConstantesFunciones.activarProductoEfectoProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Producto"));

						

						this.jInternalFrameDetalleFormEfectoProducto.jmenuDetalleEfectoProducto.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Parametro Inventario Defecto")) {

					if(this.isTienePermisosParametroInventarioDefecto && this.efectoproductoConstantesFunciones.mostrarParametroInventarioDefectoEfectoProducto && !EfectoProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Inventario Defectos"+"("+ParametroInventarioDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Inventario Defectos");

						if(efectoproductoConstantesFunciones.resaltarParametroInventarioDefectoEfectoProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(efectoproductoConstantesFunciones.resaltarParametroInventarioDefectoEfectoProducto);
						}

						jmenuItem.setEnabled(this.efectoproductoConstantesFunciones.activarParametroInventarioDefectoEfectoProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroInventarioDefecto"));

						

						this.jInternalFrameDetalleFormEfectoProducto.jmenuDetalleEfectoProducto.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEfectoProducto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEfectoProducto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEfectoProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEfectoProductoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEfectoProducto();
		
		this.cargarCombosFrameForeignKeyEfectoProducto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEfectoProducto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEfectoProducto();
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
	
	public void jButtonNuevoEfectoProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.efectoproductoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEfectoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
			
			
			if(jTableDatosEfectoProducto.getRowCount()>=1) {
				jTableDatosEfectoProducto.removeRowSelectionInterval(0, jTableDatosEfectoProducto.getRowCount()-1);						
			}
			
			this.isEsNuevoEfectoProducto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEfectoProducto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEfectoProducto(true);			
			//this.efectoproducto=new EfectoProducto();
			//this.efectoproducto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEfectoProducto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEfectoProducto() ;
			
			if(EfectoProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEfectoProducto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.efectoproducto);	
			this.actualizarInformacion("INFO_PADRE",false,this.efectoproducto);				
			
			EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
			
			if(this.efectoproductoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EfectoProducto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEfectoProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EfectoProducto> efectoproductosSeleccionados=new ArrayList<EfectoProducto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEfectoProducto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEfectoProducto.getSelectedRows().length;			
			}
			
			efectoproductosSeleccionados=this.getEfectoProductosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEfectoProducto--;			
				//EfectoProducto efectoproductoAux= new EfectoProducto();			
				//efectoproductoAux.setId(this.iIdNuevoEfectoProducto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EfectoProducto efectoproductoOrigen=new EfectoProducto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EfectoProducto efectoproductoOrigen : efectoproductosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEfectoProducto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							efectoproductoOrigen =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							efectoproductoOrigen =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEfectoProducto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.efectoproducto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEfectoProducto(efectoproductoOrigen,this.efectoproducto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEfectoProducto(this.efectoproducto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.efectoproductoLogic.getEfectoProductos().add(this.efectoproductoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.efectoproductos.add(this.efectoproductoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEfectoProducto(false);
				
				this.jTableDatosEfectoProducto.setRowSelectionInterval(this.getIndiceNuevoEfectoProducto(), this.getIndiceNuevoEfectoProducto());
				
				int iLastRow =  this.jTableDatosEfectoProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEfectoProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEfectoProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEfectoProducto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEfectoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EfectoProducto> efectoproductosSeleccionados=new ArrayList<EfectoProducto>();									
		
			EfectoProducto efectoproductoOrigen=new EfectoProducto();
			EfectoProducto efectoproductoDestino=new EfectoProducto();
				
			efectoproductosSeleccionados=this.getEfectoProductosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEfectoProducto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || efectoproductosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEfectoProducto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						efectoproductoOrigen =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						efectoproductoOrigen =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						efectoproductoDestino =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						efectoproductoDestino =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				efectoproductoOrigen =efectoproductosSeleccionados.get(0);
				efectoproductoDestino =efectoproductosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEfectoProducto(efectoproductoOrigen,efectoproductoDestino,true,false);
				
				efectoproductoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(efectoproductoDestino,efectoproductoLogic.getEfectoProductos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(efectoproductoDestino,efectoproductos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEfectoProducto(false);
				
				//this.jTableDatosEfectoProducto.setRowSelectionInterval(this.getIndiceNuevoEfectoProducto(), this.getIndiceNuevoEfectoProducto());
				
				int iLastRow =  this.jTableDatosEfectoProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEfectoProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEfectoProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEfectoProducto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEfectoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEfectoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEfectoProducto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEfectoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEfectoProducto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEfectoProducto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEfectoProducto.setVisible(!isVisible);
			this.jPanelPaginacionEfectoProducto.setVisible(!isVisible);
			this.jPanelAccionesEfectoProducto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEfectoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEfectoProducto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEfectoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEfectoProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEfectoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEfectoProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEfectoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEfectoProducto();
			
			this.abrirFrameOrderByEfectoProducto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEfectoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEfectoProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEfectoProducto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEfectoProducto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEfectoProducto.isMaximum()) {
					this.jInternalFrameDetalleFormEfectoProducto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEfectoProducto.setSize(this.jInternalFrameDetalleFormEfectoProducto.iWidthFormulario,this.jInternalFrameDetalleFormEfectoProducto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEfectoProducto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEfectoProducto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEfectoProducto.isMaximum()) {
						this.jInternalFrameDetalleFormEfectoProducto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEfectoProducto.jContentPaneDetalleEfectoProducto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEfectoProducto.jTabbedPaneRelacionesEfectoProducto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEfectoProducto.jContentPaneDetalleEfectoProducto.getWidth(),EfectoProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEfectoProducto.jTabbedPaneRelacionesEfectoProducto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEfectoProducto.jContentPaneDetalleEfectoProducto.getWidth(),EfectoProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEfectoProducto.jTabbedPaneRelacionesEfectoProducto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEfectoProducto.jContentPaneDetalleEfectoProducto.getWidth(),EfectoProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();
					}

					if(ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProducto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEfectoProducto.setVisible(true);
	        this.jInternalFrameDetalleFormEfectoProducto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEfectoProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEfectoProducto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEfectoProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEfectoProducto,false,this);
				} else {
					this.jInternalFrameOrderByEfectoProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEfectoProducto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEfectoProducto);
				this.jInternalFrameOrderByEfectoProducto.setVisible(false);
				this.jInternalFrameOrderByEfectoProducto.setSelected(false);
				
				this.jInternalFrameOrderByEfectoProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEfectoProducto"));
				
				this.inicializarActualizarBindingTablaOrderByEfectoProducto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEfectoProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEfectoProducto==null) {
				
				this.jInternalFrameImportacionEfectoProducto=new ImportacionJInternalFrame(EfectoProductoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEfectoProducto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEfectoProducto);
				this.jInternalFrameImportacionEfectoProducto.setVisible(false);
				this.jInternalFrameImportacionEfectoProducto.setSelected(false);


				this.jInternalFrameImportacionEfectoProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEfectoProducto"));
				this.jInternalFrameImportacionEfectoProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEfectoProducto"));
				this.jInternalFrameImportacionEfectoProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEfectoProducto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEfectoProducto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEfectoProducto==null) {
				this.jInternalFrameReporteDinamicoEfectoProducto=new ReporteDinamicoJInternalFrame(EfectoProductoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEfectoProducto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEfectoProducto);
				this.jInternalFrameReporteDinamicoEfectoProducto.setVisible(false);
				this.jInternalFrameReporteDinamicoEfectoProducto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEfectoProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEfectoProducto"));
				this.jInternalFrameReporteDinamicoEfectoProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEfectoProducto"));
				this.jInternalFrameReporteDinamicoEfectoProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEfectoProducto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEfectoProducto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaParametroInventarioDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEfectoProducto.jContentPaneDetalleEfectoProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProducto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEfectoProducto.jContentPaneDetalleEfectoProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEfectoProducto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEfectoProducto);
			
	       	this.jInternalFrameDetalleFormEfectoProducto.setVisible(false);
	        this.jInternalFrameDetalleFormEfectoProducto.setSelected(false);
			
			//this.jInternalFrameDetalleFormEfectoProducto.dispose();
			//this.jInternalFrameDetalleFormEfectoProducto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEfectoProducto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEfectoProducto.setVisible(true);
	        this.jInternalFrameReporteDinamicoEfectoProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEfectoProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEfectoProducto.setVisible(true);
	        this.jInternalFrameImportacionEfectoProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEfectoProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEfectoProducto.setVisible(true);
	        this.jInternalFrameOrderByEfectoProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEfectoProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEfectoProducto.setVisible(false);
	        this.jInternalFrameOrderByEfectoProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEfectoProducto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEfectoProducto.setVisible(false);
	        this.jInternalFrameReporteDinamicoEfectoProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEfectoProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEfectoProducto.setVisible(false);
	        this.jInternalFrameImportacionEfectoProducto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEfectoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEfectoProducto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEfectoProducto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEfectoProducto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEfectoProducto(true);
			//this.isEsNuevoEfectoProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproducto =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.efectoproducto =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEfectoProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEfectoProducto(false) ;
			
			if(efectoproductoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado() && ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EfectoProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEfectoProducto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEfectoProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEfectoProductoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEfectoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproducto =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.efectoproducto =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEfectoProducto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEfectoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEfectoProducto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEfectoProducto(true);
			//this.isEsNuevoEfectoProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproducto =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.efectoproducto =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.efectoproducto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEfectoProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEfectoProducto(false) ;
			
			if(EfectoProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEfectoProducto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEfectoProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoProducto(List<TipoProducto> tipoproductosForeignKey)throws Exception{
		TableColumn tableColumnTipoProducto=this.jTableDatosEfectoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEfectoProducto,EfectoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO));
		TableCellEditor tableCellEditorTipoProducto =tableColumnTipoProducto.getCellEditor();

		TipoProductoTableCell tipoproductoTableCellFk=(TipoProductoTableCell)tableCellEditorTipoProducto;

		if(tipoproductoTableCellFk!=null) {
			tipoproductoTableCellFk.settipoproductosForeignKey(tipoproductosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEfectoProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoproductoTableCellFk.setRowActual(intSelectedRow);
			//tipoproductoTableCellFk.settipoproductosForeignKeyActual(tipoproductosForeignKey);
		//}


		if(tipoproductoTableCellFk!=null) {
			tipoproductoTableCellFk.RecargarTipoProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarEfectoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEfectoProducto(false);
			
			//if(!this.isEsNuevoEfectoProducto) {								
				int intSelectedRow = this.jTableDatosEfectoProducto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproducto =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.efectoproducto =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EfectoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEfectoProducto(this.efectoproducto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEfectoProducto(this.efectoproducto);
				
			}
			
			if(this.permiteMantenimiento(this.efectoproducto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEfectoProducto=true;
					this.inicializarActualizarBindingTablaEfectoProducto(false);
					this.isEsNuevoEfectoProducto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEfectoProducto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEfectoProducto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEfectoProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEfectoProducto(false);
				
				this.habilitarDeshabilitarControlesEfectoProducto(false);
			
												
				
				if(EfectoProductoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEfectoProducto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEfectoProductoActionPerformed(evt,efectoproductoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEfectoProducto(this.efectoproducto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEfectoProducto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,efectoproductoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.efectoproducto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EfectoProducto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EfectoProducto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEfectoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEfectoProducto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproducto =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				this.efectoproducto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.efectoproducto =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				this.efectoproducto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.efectoproducto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EfectoProductoModel) this.jTableDatosEfectoProducto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEfectoProducto=true;
				this.inicializarActualizarBindingTablaEfectoProducto(false);
				this.isEsNuevoEfectoProducto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEfectoProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEfectoProducto(false);
				
				this.habilitarDeshabilitarControlesEfectoProducto(false);
				
				
				
				if(EfectoProductoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEfectoProducto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEfectoProductoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEfectoProducto.getRowCount()>=1) {
				jTableDatosEfectoProducto.removeRowSelectionInterval(0, jTableDatosEfectoProducto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEfectoProducto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEfectoProducto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEfectoProducto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEfectoProducto(false) ;
			
			this.isEsNuevoEfectoProducto=false;
			
			if(EfectoProductoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEfectoProducto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEfectoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEfectoProducto(false);
				
				//SI ES MANUAL
				if(EfectoProductoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEfectoProducto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEfectoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEfectoProducto--;			
			//EfectoProducto efectoproductoAux= new EfectoProducto();			
			//efectoproductoAux.setId(this.iIdNuevoEfectoProducto);
			
			if(this.jInternalFrameDetalleFormEfectoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEfectoProducto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEfectoProducto(this.efectoproducto);
			
			this.efectoproducto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.efectoproductoLogic.getEfectoProductos().add(this.efectoproductoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.efectoproductos.add(this.efectoproductoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEfectoProducto(false);
			
			this.jTableDatosEfectoProducto.setRowSelectionInterval(this.getIndiceNuevoEfectoProducto(), this.getIndiceNuevoEfectoProducto());
			
			int iLastRow =  this.jTableDatosEfectoProducto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEfectoProducto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEfectoProducto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEfectoProducto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEfectoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEfectoProducto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEfectoProducto(false);
			
			//SI ES MANUAL
			if(EfectoProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEfectoProducto();
			}
			
			//this.abrirFrameTreeEfectoProducto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEfectoProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Efecto ProductoS ?", "MANTENIMIENTO DE Efecto Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEfectoProducto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEfectoProducto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.efectoproductoReturnGeneral=efectoproductoLogic.procesarImportacionEfectoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.efectoproductoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEfectoProductoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEfectoProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEfectoProducto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEfectoProducto.setFileImportacion(this.jInternalFrameImportacionEfectoProducto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEfectoProducto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEfectoProducto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEfectoProducto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEfectoProducto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEfectoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EfectoProducto> efectoproductosSeleccionados=new ArrayList<EfectoProducto>();		

		efectoproductosSeleccionados=this.getEfectoProductosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEfectoProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEfectoProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EfectoProductoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EfectoProductoBaseDesign.jrxml";
			
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
			
			this.generarReporteEfectoProductos("Todos",efectoproductosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.efectoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Efecto Producto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEfectoProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEfectoProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EfectoProductoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EfectoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EfectoProductoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EfectoProductoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEfectoProducto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEfectoProducto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEfectoProducto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EfectoProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case EfectoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					sNombreCampoCategoria="id_tipo_producto";
					break;

				case EfectoProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EfectoProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEfectoProducto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EfectoProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case EfectoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					sNombreCampoCategoriaValor="id_tipo_producto";
					break;

				case EfectoProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EfectoProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEfectoProducto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEfectoProducto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EfectoProductoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case EfectoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_producto");
					break;

				case EfectoProductoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EfectoProductoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEfectoProductoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EfectoProducto> efectoproductosSeleccionados=new ArrayList<EfectoProducto>();		
		
		efectoproductosSeleccionados=this.getEfectoProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"efectoproducto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EfectoProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEfectoProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEfectoProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EfectoProductoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EfectoProductoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(EfectoProducto efectoproducto:efectoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(efectoproducto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EfectoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EfectoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
					iRow++;

					for(EfectoProducto efectoproducto:efectoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(efectoproducto.gettipoproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EfectoProductoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EfectoProductoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EfectoProducto efectoproducto:efectoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(efectoproducto.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EfectoProductoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EfectoProductoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EfectoProducto efectoproducto:efectoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(efectoproducto.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEfectoProducto(row);				
			//	iRow++;
			//}				
			
			//for(EfectoProducto efectoproductoAux:efectoproductosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEfectoProducto(efectoproductoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.efectoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Efecto Producto",JOptionPane.INFORMATION_MESSAGE);
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
				this.efectoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEfectoProducto(false);
			
			//SI ES MANUAL
			if(EfectoProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEfectoProducto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEfectoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEfectoProducto(false);
			
			//SI ES MANUAL
			if(EfectoProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEfectoProducto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEfectoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEfectoProducto(false);
			
			//SI ES MANUAL
			if(EfectoProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEfectoProducto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEfectoProducto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEfectoProducto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEfectoProducto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEfectoProducto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEfectoProducto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEfectoProducto.setMinimumSize(dimensionMinimum);
		this.jTableDatosEfectoProducto.setMaximumSize(dimensionMaximum);
		this.jTableDatosEfectoProducto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEfectoProducto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEfectoProducto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEfectoProducto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEfectoProducto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEfectoProducto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEfectoProducto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEfectoProducto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEfectoProducto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EfectoProductoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EfectoProductoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEfectoProducto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEfectoProducto();
		
		this.inicializarActualizarBindingBotonesManualEfectoProducto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEfectoProducto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEfectoProducto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEfectoProducto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEfectoProducto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEfectoProducto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEfectoProducto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEfectoProducto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEfectoProducto.jCheckBoxPostAccionNuevoEfectoProducto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEfectoProducto.jCheckBoxPostAccionSinCerrarEfectoProducto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEfectoProducto.jCheckBoxPostAccionSinMensajeEfectoProducto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEfectoProducto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEfectoProducto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEfectoProducto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
				this.jInternalFrameDetalleFormEfectoProducto.jCheckBoxPostAccionNuevoEfectoProducto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEfectoProducto.jCheckBoxPostAccionSinCerrarEfectoProducto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEfectoProducto.jCheckBoxPostAccionSinMensajeEfectoProducto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEfectoProducto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEfectoProducto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEfectoProducto.jComboBoxTiposAccionesFormularioEfectoProducto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEfectoProducto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEfectoProducto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEfectoProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEfectoProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEfectoProducto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEfectoProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEfectoProducto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEfectoProducto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEfectoProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEfectoProducto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEfectoProducto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEfectoProducto(Boolean esInicializar) throws Exception {
		try	{	
			if(EfectoProductoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEfectoProducto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEfectoProducto() throws Exception {
		try	{
			if(EfectoProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEfectoProducto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEfectoProducto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEfectoProducto.jComboBoxTiposAccionesFormularioEfectoProducto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEfectoProducto.jComboBoxTiposAccionesFormularioEfectoProducto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEfectoProducto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEfectoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEfectoProducto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEfectoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEfectoProducto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEfectoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEfectoProducto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEfectoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEfectoProducto.addItem(reporte);
			}
			
			
			if(!this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEfectoProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEfectoProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEfectoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEfectoProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEfectoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEfectoProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEfectoProducto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEfectoProducto.jComboBoxTiposAccionesFormularioEfectoProducto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEfectoProducto.jComboBoxTiposAccionesFormularioEfectoProducto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEfectoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEfectoProducto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEfectoProducto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEfectoProducto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEfectoProducto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEfectoProducto!=null) {
				this.jInternalFrameReporteDinamicoEfectoProducto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEfectoProducto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEfectoProducto!=null) {
				this.jInternalFrameReporteDinamicoEfectoProducto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEfectoProducto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEfectoProducto!=null) {
				
				if(this.jInternalFrameReporteDinamicoEfectoProducto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEfectoProducto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEfectoProducto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEfectoProducto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEfectoProducto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEfectoProducto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEfectoProducto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoEfectoProducto.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreEfectoProducto.getText();
		if(this.jComboBoxid_tipo_productoFK_IdTipoProductoEfectoProducto.getSelectedItem()!=null){this.id_tipo_productoFK_IdTipoProducto=((TipoProducto)this.jComboBoxid_tipo_productoFK_IdTipoProductoEfectoProducto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEfectoProducto(Boolean esInicializar) throws Exception {				
		if(EfectoProductoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEfectoProducto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEfectoProducto() throws Exception {
		this.inicializarActualizarBindingTablaEfectoProducto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEfectoProducto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEfectoProducto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEfectoProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEfectoProducto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EfectoProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEfectoProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEfectoProducto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EfectoProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEfectoProductoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEfectoProductoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EfectoProductoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEfectoProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEfectoProducto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EfectoProductoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEfectoProducto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEfectoProducto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=efectoproductoLogic.getEfectoProductos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=efectoproductos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EfectoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEfectoProducto.setModel(new EfectoProductoModel(this.efectoproductoLogic.getEfectoProductos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEfectoProducto.setModel(new EfectoProductoModel(this.efectoproductos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEfectoProducto!=null && this.jInternalFrameOrderByEfectoProducto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEfectoProducto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEfectoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEfectoProducto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EfectoProductoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO,efectoproductoConstantesFunciones.resaltarSeleccionarEfectoProducto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EfectoProductoConstantesFunciones.SCLASSWEBTITULO,efectoproductoConstantesFunciones.resaltarSeleccionarEfectoProducto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEfectoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEfectoProducto,EfectoProductoConstantesFunciones.LABEL_ID));

		if(this.efectoproductoConstantesFunciones.mostraridEfectoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EfectoProductoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.efectoproductoConstantesFunciones.resaltaridEfectoProducto,this.efectoproductoConstantesFunciones.activaridEfectoProducto,this,true,"idEfectoProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.efectoproductoConstantesFunciones.resaltaridEfectoProducto,this.efectoproductoConstantesFunciones.activaridEfectoProducto,this,true,"idEfectoProducto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEfectoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEfectoProducto,EfectoProductoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.efectoproductoConstantesFunciones.mostrarid_empresaEfectoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EfectoProductoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.efectoproductoConstantesFunciones.resaltarid_empresaEfectoProducto,this,this.efectoproductoConstantesFunciones.activarid_empresaEfectoProducto));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.efectoproductoConstantesFunciones.resaltarid_empresaEfectoProducto,this,this.efectoproductoConstantesFunciones.activarid_empresaEfectoProducto,false,"id_empresaEfectoProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EfectoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEfectoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEfectoProducto,EfectoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO));

		if(this.efectoproductoConstantesFunciones.mostrarid_tipo_productoEfectoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EfectoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoProductoTableCell(this.tipoproductosForeignKey,this.efectoproductoConstantesFunciones.resaltarid_tipo_productoEfectoProducto,this,this.efectoproductoConstantesFunciones.activarid_tipo_productoEfectoProducto));
			tableColumn.setCellEditor(new TipoProductoTableCell(this.tipoproductosForeignKey,this.efectoproductoConstantesFunciones.resaltarid_tipo_productoEfectoProducto,this,this.efectoproductoConstantesFunciones.activarid_tipo_productoEfectoProducto,true,"id_tipo_productoEfectoProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EfectoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEfectoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEfectoProducto,EfectoProductoConstantesFunciones.LABEL_CODIGO));

		if(this.efectoproductoConstantesFunciones.mostrarcodigoEfectoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EfectoProductoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.efectoproductoConstantesFunciones.resaltarcodigoEfectoProducto,this.efectoproductoConstantesFunciones.activarcodigoEfectoProducto,this,true,"codigoEfectoProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.efectoproductoConstantesFunciones.resaltarcodigoEfectoProducto,this.efectoproductoConstantesFunciones.activarcodigoEfectoProducto,this,true,"codigoEfectoProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EfectoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEfectoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEfectoProducto,EfectoProductoConstantesFunciones.LABEL_NOMBRE));

		if(this.efectoproductoConstantesFunciones.mostrarnombreEfectoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EfectoProductoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.efectoproductoConstantesFunciones.resaltarnombreEfectoProducto,this.efectoproductoConstantesFunciones.activarnombreEfectoProducto,this,true,"nombreEfectoProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.efectoproductoConstantesFunciones.resaltarnombreEfectoProducto,this.efectoproductoConstantesFunciones.activarnombreEfectoProducto,this,true,"nombreEfectoProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EfectoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.efectoproductoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosProducto && this.efectoproductoConstantesFunciones.mostrarProductoEfectoProducto && !EfectoProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Productos");
				tableColumn.setHeaderValue("Productos");
				tableColumn.setCellRenderer(new ProductoTableCell(efectoproductoConstantesFunciones.resaltarProductoEfectoProducto,this,this.efectoproductoConstantesFunciones.activarProductoEfectoProducto));
				tableColumn.setCellEditor(new ProductoTableCell(efectoproductoConstantesFunciones.resaltarProductoEfectoProducto,this,this.efectoproductoConstantesFunciones.activarProductoEfectoProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEfectoProducto.addColumn(tableColumn);
			}

			if(this.isTienePermisosParametroInventarioDefecto && this.efectoproductoConstantesFunciones.mostrarParametroInventarioDefectoEfectoProducto && !EfectoProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Inventario Defectos");
				tableColumn.setHeaderValue("Parametro Inventario Defectos");
				tableColumn.setCellRenderer(new ParametroInventarioDefectoTableCell(efectoproductoConstantesFunciones.resaltarParametroInventarioDefectoEfectoProducto,this,this.efectoproductoConstantesFunciones.activarParametroInventarioDefectoEfectoProducto));
				tableColumn.setCellEditor(new ParametroInventarioDefectoTableCell(efectoproductoConstantesFunciones.resaltarParametroInventarioDefectoEfectoProducto,this,this.efectoproductoConstantesFunciones.activarParametroInventarioDefectoEfectoProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEfectoProducto.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.efectoproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.efectoproductoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEfectoProducto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.efectoproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.efectoproductoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEfectoProducto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEfectoProducto && this.isPermisoGuardarCambiosEfectoProducto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.efectoproductoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.efectoproductoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEfectoProducto.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.efectoproductoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEfectoProducto.addColumn(tableColumn);
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
			
			this.jTableDatosEfectoProducto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEfectoProducto && this.isPermisoGuardarCambiosEfectoProducto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.efectoproductoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEfectoProducto && this.isPermisoGuardarCambiosEfectoProducto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEfectoProducto.moveColumn(this.jTableDatosEfectoProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEfectoProducto.moveColumn(this.jTableDatosEfectoProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.efectoproductoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEfectoProducto.moveColumn(this.jTableDatosEfectoProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEfectoProducto.moveColumn(this.jTableDatosEfectoProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEfectoProducto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEfectoProducto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEfectoProducto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EfectoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEfectoProducto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEfectoProducto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EfectoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EfectoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEfectoProducto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEfectoProducto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEfectoProducto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=efectoproductoLogic.getEfectoProductos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=efectoproductos.size()-1;
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
		//this.jTableDatosEfectoProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEfectoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEfectoProducto();
			
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
				
				//this.isEsNuevoEfectoProducto=false;
					
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
			
				if(this.efectoproductoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEfectoProducto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEfectoProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEfectoProducto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproducto =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.efectoproducto =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.efectoproducto.getsType().equals("DUPLICADO")
				   || this.efectoproducto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEfectoProducto=true;
				
				} else {
					this.isEsNuevoEfectoProducto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
					if(this.efectoproducto.getId()>=0 && !this.efectoproducto.getIsNew()) {						
						this.isEsNuevoEfectoProducto=false;
						
					} else {
						this.isEsNuevoEfectoProducto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEfectoProducto(esRelaciones);						
				
				this.seleccionarEfectoProducto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.efectoproducto.getId()<0) {
					this.isEsNuevoEfectoProducto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEfectoProducto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEfectoProducto(evt,rowIndex);
				}	
				
				if(this.efectoproductoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EfectoProducto: " + this.dDif); 
					}
				}								
				
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEfectoProducto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.efectoproducto)) {
					if(this.efectoproducto.getId()>0) {
						this.efectoproducto.setIsDeleted(true);
						
						this.efectoproductosEliminados.add(this.efectoproducto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.efectoproductoLogic.getEfectoProductos().remove(this.efectoproducto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.efectoproductos.remove(this.efectoproducto);				
					}
					
					
					((EfectoProductoModel) this.jTableDatosEfectoProducto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEfectoProducto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEfectoProducto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEfectoProducto) {
			
			if(this.jInternalFrameDetalleFormEfectoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEfectoProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEfectoProducto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproducto =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.efectoproducto =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EfectoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEfectoProducto(this.efectoproducto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.efectoproductoConstantesFunciones.cargarid_empresaEfectoProducto || this.efectoproductoConstantesFunciones.event_dependid_empresaEfectoProducto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.efectoproducto.getid_empresa());
									//this.inicializarActualizarBindingEfectoProducto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(efectoproducto.getEmpresa()!=null) {
							this.empresasForeignKey.add(efectoproducto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.efectoproducto.getid_empresa(),false,"Formulario");

					//TipoProducto
					if(!this.efectoproductoConstantesFunciones.cargarid_tipo_productoEfectoProducto || this.efectoproductoConstantesFunciones.event_dependid_tipo_productoEfectoProducto) {
						//this.cargarCombosTipoProductosForeignKeyLista(" where id="+this.efectoproducto.getid_tipo_producto());
									//this.inicializarActualizarBindingEfectoProducto(false,false);
						this.tipoproductosForeignKey=new ArrayList<TipoProducto>();

						if(efectoproducto.getTipoProducto()!=null) {
							this.tipoproductosForeignKey.add(efectoproducto.getTipoProducto());
						}

						this.addItemDefectoCombosForeignKeyTipoProducto();
						this.cargarCombosFrameTipoProductosForeignKey("Todos");
					}
					this.setActualTipoProductoForeignKey(this.efectoproducto.getid_tipo_producto(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEfectoProducto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEfectoProducto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEfectoProducto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEfectoProducto(EfectoProducto efectoproducto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEfectoProducto(efectoproducto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEfectoProducto(EfectoProducto efectoproducto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEfectoProducto(efectoproducto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEfectoProducto(efectoproducto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEfectoProducto(efectoproducto);
	}
	
	public void setVariablesObjetoActualToFormularioEfectoProducto(EfectoProducto efectoproducto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEfectoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEfectoProducto.jLabelidEfectoProducto.setText(efectoproducto.getId().toString());
			this.jInternalFrameDetalleFormEfectoProducto.jTextFieldcodigoEfectoProducto.setText(efectoproducto.getcodigo());
			this.jInternalFrameDetalleFormEfectoProducto.jTextAreanombreEfectoProducto.setText(efectoproducto.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EfectoProducto efectoproductoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,efectoproductoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EfectoProducto efectoproductoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				efectoproductoLocal=this.efectoproducto;
			} else {
				efectoproductoLocal=this.efectoproductoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(efectoproductoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEfectoProducto(efectoproductoLocal,true);
					
					if(efectoproductoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(efectoproductoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(efectoproductoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEfectoProducto(EfectoProducto efectoproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEfectoProducto(efectoproducto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEfectoProducto(efectoproducto);
	}
	
	public void setVariablesFormularioToObjetoActualEfectoProducto(EfectoProducto efectoproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEfectoProducto(efectoproducto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEfectoProducto(EfectoProducto efectoproducto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEfectoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEfectoProducto.jLabelidEfectoProducto.getText()==null || this.jInternalFrameDetalleFormEfectoProducto.jLabelidEfectoProducto.getText()=="" || this.jInternalFrameDetalleFormEfectoProducto.jLabelidEfectoProducto.getText()=="Id") {
				this.jInternalFrameDetalleFormEfectoProducto.jLabelidEfectoProducto.setText("0");
			}

			if(conColumnasBase) {efectoproducto.setId(Long.parseLong(this.jInternalFrameDetalleFormEfectoProducto.jLabelidEfectoProducto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EfectoProductoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEfectoProducto.jLabelIdEfectoProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			efectoproducto.setcodigo(this.jInternalFrameDetalleFormEfectoProducto.jTextFieldcodigoEfectoProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EfectoProductoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEfectoProducto.jLabelcodigoEfectoProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			efectoproducto.setnombre(this.jInternalFrameDetalleFormEfectoProducto.jTextAreanombreEfectoProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EfectoProductoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEfectoProducto.jLabelnombreEfectoProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEfectoProducto(EfectoProducto efectoproductoBean,EfectoProducto efectoproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && efectoproductoBean.getid_tipo_producto()!=null && !efectoproductoBean.getid_tipo_producto().equals(-1L))) {efectoproducto.setid_tipo_producto(efectoproductoBean.getid_tipo_producto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEfectoProducto(EfectoProducto efectoproductoOrigen,EfectoProducto efectoproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && efectoproductoOrigen.getId()!=null && !efectoproductoOrigen.getId().equals(0L))) {efectoproducto.setId(efectoproductoOrigen.getId());}}
			if(conDefault || (!conDefault && efectoproductoOrigen.getid_tipo_producto()!=null && !efectoproductoOrigen.getid_tipo_producto().equals(-1L))) {efectoproducto.setid_tipo_producto(efectoproductoOrigen.getid_tipo_producto());}
			if(conDefault || (!conDefault && efectoproductoOrigen.getcodigo()!=null && !efectoproductoOrigen.getcodigo().equals(""))) {efectoproducto.setcodigo(efectoproductoOrigen.getcodigo());}
			if(conDefault || (!conDefault && efectoproductoOrigen.getnombre()!=null && !efectoproductoOrigen.getnombre().equals(""))) {efectoproducto.setnombre(efectoproductoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEfectoProducto(EfectoProducto efectoproducto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEfectoProducto.jLabelidEfectoProducto.setText(efectoproducto.getId().toString());
			this.jInternalFrameDetalleFormEfectoProducto.jTextFieldcodigoEfectoProducto.setText(efectoproducto.getcodigo());
			this.jInternalFrameDetalleFormEfectoProducto.jTextAreanombreEfectoProducto.setText(efectoproducto.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEfectoProducto(EfectoProductoBean efectoproductoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEfectoProducto.jLabelidEfectoProducto.setText(efectoproductoBean.getId().toString());
			this.jInternalFrameDetalleFormEfectoProducto.jTextFieldcodigoEfectoProducto.setText(efectoproductoBean.getcodigo());
			this.jInternalFrameDetalleFormEfectoProducto.jTextAreanombreEfectoProducto.setText(efectoproductoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEfectoProducto(EfectoProductoParameterReturnGeneral efectoproductoReturnGeneral,EfectoProductoBean efectoproductoBean,Boolean conDefault) throws Exception { 
		try {
			EfectoProducto efectoproductoLocal=new EfectoProducto();
			
			efectoproductoLocal=efectoproductoReturnGeneral.getEfectoProducto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && efectoproductoLocal.getId()!=null && !efectoproductoLocal.getId().equals(0L))) {efectoproductoBean.setId(efectoproductoLocal.getId());}}
			if(conDefault || (!conDefault && efectoproductoLocal.getid_tipo_producto()!=null && !efectoproductoLocal.getid_tipo_producto().equals(-1L))) {efectoproductoBean.setid_tipo_producto(efectoproductoLocal.getid_tipo_producto());}
			if(conDefault || (!conDefault && efectoproductoLocal.getcodigo()!=null && !efectoproductoLocal.getcodigo().equals(""))) {efectoproductoBean.setcodigo(efectoproductoLocal.getcodigo());}
			if(conDefault || (!conDefault && efectoproductoLocal.getnombre()!=null && !efectoproductoLocal.getnombre().equals(""))) {efectoproductoBean.setnombre(efectoproductoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEfectoProductoGenerico(Long idEfectoProductoSeleccionado,JComboBox jComboBoxEfectoProducto,List<EfectoProducto> efectoproductosLocal)throws Exception {
		try {
			EfectoProducto  efectoproductoTemp=null;

			for(EfectoProducto efectoproductoAux:efectoproductosLocal) {
				if(efectoproductoAux.getId()!=null && efectoproductoAux.getId().equals(idEfectoProductoSeleccionado)) {
					efectoproductoTemp=efectoproductoAux;
					break;
				}
			}

			jComboBoxEfectoProducto.setSelectedItem(efectoproductoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEfectoProductoGenerico(JComboBox jComboBoxEfectoProducto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEfectoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEfectoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEfectoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEfectoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEfectoProducto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEfectoProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEfectoProducto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEfectoProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEfectoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEfectoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			efectoproducto=(EfectoProducto) efectoproductoLogic.getEfectoProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			efectoproducto =(EfectoProducto) efectoproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!efectoproducto.getIsNew() && !efectoproducto.getIsChanged() && !efectoproducto.getIsDeleted()) {
				sDescripcion=efectoproducto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=efectoproducto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoProducto")) {
			//sDescripcion=this.getActualTipoProductoForeignKeyDescripcion((Long)value);
			if(!efectoproducto.getIsNew() && !efectoproducto.getIsChanged() && !efectoproducto.getIsDeleted()) {
				sDescripcion=efectoproducto.gettipoproducto_descripcion();
			} else {
				//sDescripcion=this.getActualTipoProductoForeignKeyDescripcion((Long)value);
				sDescripcion=efectoproducto.gettipoproducto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EfectoProducto efectoproductoRow=new EfectoProducto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			efectoproductoRow=(EfectoProducto) efectoproductoLogic.getEfectoProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			efectoproductoRow=(EfectoProducto) efectoproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonProductoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EfectoProducto efectoproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEfectoProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.efectoproducto = (EfectoProducto)this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.efectoproducto = (EfectoProducto)this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(efectoproducto!=null) {
						this.efectoproducto = efectoproducto;
					} else {
						this.efectoproducto = new EfectoProducto();
					}
				}

				if(this.isTienePermisosProducto && this.permiteMantenimiento(this.efectoproducto)) {
					ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFramePopup=new ProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFramePopup;
					} else {
						productoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame;
					}

					List<EfectoProducto> efectoproductos=new ArrayList<EfectoProducto>();
					efectoproductos.add(this.efectoproducto);
					if(!esRelacionado) {
						//productoBeanSwingJInternalFrame.productoSessionBean.setConGuardarRelaciones(false);
						//productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEfectoProducto.cargarProductoBeanSwingJInternalFrame(efectoproductos,this.efectoproducto,productoBeanSwingJInternalFrame,/*conInicializar,*/productoBeanSwingJInternalFrame.productoSessionBean.getConGuardarRelaciones(),productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado());
					productoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoBeanSwingJInternalFrame.actualizarEstadoPanelsProducto("no_relacionado");

						productoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoConstantesFunciones.ITAMANIOFILATABLA + (ProductoConstantesFunciones.ITAMANIOFILATABLA/2));

						productoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEfectoProducto=(TitledBorder)this.jScrollPanelDatosEfectoProducto.getBorder();
						TitledBorder titledBorderProducto=(TitledBorder)productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

						titledBorderProducto.setTitle(titledBorderEfectoProducto.getTitle() + " -> Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoBeanSwingJInternalFrame);
						}

						productoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoBeanSwingJInternalFrame);

						productoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.efectoproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonParametroInventarioDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EfectoProducto efectoproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEfectoProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.efectoproducto = (EfectoProducto)this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.efectoproducto = (EfectoProducto)this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(efectoproducto!=null) {
						this.efectoproducto = efectoproducto;
					} else {
						this.efectoproducto = new EfectoProducto();
					}
				}

				if(this.isTienePermisosParametroInventarioDefecto && this.permiteMantenimiento(this.efectoproducto)) {
					ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFramePopup=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFramePopup;
					} else {
						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame;
					}

					List<EfectoProducto> efectoproductos=new ArrayList<EfectoProducto>();
					efectoproductos.add(this.efectoproducto);
					if(!esRelacionado) {
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setConGuardarRelaciones(false);
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEfectoProducto.cargarParametroInventarioDefectoBeanSwingJInternalFrame(efectoproductos,this.efectoproducto,parametroinventariodefectoBeanSwingJInternalFrame,/*conInicializar,*/parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getConGuardarRelaciones(),parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("no_relacionado");

						parametroinventariodefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametroinventariodefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEfectoProducto=(TitledBorder)this.jScrollPanelDatosEfectoProducto.getBorder();
						TitledBorder titledBorderParametroInventarioDefecto=(TitledBorder)parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getBorder();

						titledBorderParametroInventarioDefecto.setTitle(titledBorderEfectoProducto.getTitle() + " -> Parametro Inventario Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametroinventariodefectoBeanSwingJInternalFrame);
						}

						parametroinventariodefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametroinventariodefectoBeanSwingJInternalFrame);

						parametroinventariodefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.efectoproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Inventario Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEfectoProducto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEfectoProducto.setVisible((this.isVisibilidadCeldaNuevoEfectoProducto && this.isPermisoNuevoEfectoProducto));			
			this.jButtonDuplicarEfectoProducto.setVisible((this.isVisibilidadCeldaDuplicarEfectoProducto && this.isPermisoDuplicarEfectoProducto));			
			this.jButtonCopiarEfectoProducto.setVisible((this.isVisibilidadCeldaCopiarEfectoProducto && this.isPermisoCopiarEfectoProducto));
			this.jButtonVerFormEfectoProducto.setVisible((this.isVisibilidadCeldaVerFormEfectoProducto && this.isPermisoVerFormEfectoProducto));
			
			this.jButtonAbrirOrderByEfectoProducto.setVisible((this.isVisibilidadCeldaOrdenEfectoProducto && this.isPermisoOrdenEfectoProducto));			
			
			this.jButtonNuevoRelacionesEfectoProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesEfectoProducto && this.isPermisoNuevoEfectoProducto));			
			this.jButtonNuevoGuardarCambiosEfectoProducto.setVisible((this.isVisibilidadCeldaNuevoEfectoProducto && this.isPermisoNuevoEfectoProducto && this.isPermisoGuardarCambiosEfectoProducto));
			
			if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
			this.jInternalFrameDetalleFormEfectoProducto.jButtonModificarEfectoProducto.setVisible((this.isVisibilidadCeldaModificarEfectoProducto && this.isPermisoActualizarEfectoProducto));	
			this.jInternalFrameDetalleFormEfectoProducto.jButtonActualizarEfectoProducto.setVisible((this.isVisibilidadCeldaActualizarEfectoProducto && this.isPermisoActualizarEfectoProducto));	
			this.jInternalFrameDetalleFormEfectoProducto.jButtonEliminarEfectoProducto.setVisible((this.isVisibilidadCeldaEliminarEfectoProducto && this.isPermisoEliminarEfectoProducto));
			this.jInternalFrameDetalleFormEfectoProducto.jButtonCancelarEfectoProducto.setVisible(this.isVisibilidadCeldaCancelarEfectoProducto);							
			this.jInternalFrameDetalleFormEfectoProducto.jButtonGuardarCambiosEfectoProducto.setVisible((this.isVisibilidadCeldaGuardarEfectoProducto && this.isPermisoGuardarCambiosEfectoProducto));			
			
			}
						
			this.jButtonGuardarCambiosTablaEfectoProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosEfectoProducto && this.isPermisoGuardarCambiosEfectoProducto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEfectoProducto.setVisible((this.isVisibilidadCeldaNuevoEfectoProducto && this.isPermisoNuevoEfectoProducto));						
			this.jButtonDuplicarToolBarEfectoProducto.setVisible((this.isVisibilidadCeldaDuplicarEfectoProducto && this.isPermisoDuplicarEfectoProducto));						
			this.jButtonCopiarToolBarEfectoProducto.setVisible((this.isVisibilidadCeldaCopiarEfectoProducto && this.isPermisoCopiarEfectoProducto));			
			this.jButtonVerFormToolBarEfectoProducto.setVisible((this.isVisibilidadCeldaVerFormEfectoProducto && this.isPermisoVerFormEfectoProducto));			
			this.jButtonAbrirOrderByToolBarEfectoProducto.setVisible((this.isVisibilidadCeldaOrdenEfectoProducto && this.isPermisoOrdenEfectoProducto));
			this.jButtonNuevoRelacionesToolBarEfectoProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesEfectoProducto && this.isPermisoNuevoEfectoProducto));			
			this.jButtonNuevoGuardarCambiosToolBarEfectoProducto.setVisible((this.isVisibilidadCeldaNuevoEfectoProducto && this.isPermisoNuevoEfectoProducto && this.isPermisoGuardarCambiosEfectoProducto));			
			
			if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
			this.jInternalFrameDetalleFormEfectoProducto.jButtonModificarToolBarEfectoProducto.setVisible((this.isVisibilidadCeldaModificarEfectoProducto && this.isPermisoActualizarEfectoProducto));	
			this.jInternalFrameDetalleFormEfectoProducto.jButtonActualizarToolBarEfectoProducto.setVisible((this.isVisibilidadCeldaActualizarEfectoProducto  && this.isPermisoActualizarEfectoProducto));	
			this.jInternalFrameDetalleFormEfectoProducto.jButtonEliminarToolBarEfectoProducto.setVisible((this.isVisibilidadCeldaEliminarEfectoProducto && this.isPermisoEliminarEfectoProducto));
			this.jInternalFrameDetalleFormEfectoProducto.jButtonCancelarToolBarEfectoProducto.setVisible(this.isVisibilidadCeldaCancelarEfectoProducto);				
			this.jInternalFrameDetalleFormEfectoProducto.jButtonGuardarCambiosToolBarEfectoProducto.setVisible((this.isVisibilidadCeldaGuardarEfectoProducto && this.isPermisoGuardarCambiosEfectoProducto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEfectoProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosEfectoProducto && this.isPermisoGuardarCambiosEfectoProducto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEfectoProducto.setVisible((this.isVisibilidadCeldaNuevoEfectoProducto && this.isPermisoNuevoEfectoProducto));			
			this.jMenuItemDuplicarEfectoProducto.setVisible((this.isVisibilidadCeldaDuplicarEfectoProducto && this.isPermisoDuplicarEfectoProducto));			
			this.jMenuItemCopiarEfectoProducto.setVisible((this.isVisibilidadCeldaCopiarEfectoProducto && this.isPermisoCopiarEfectoProducto));			
			this.jMenuItemVerFormEfectoProducto.setVisible((this.isVisibilidadCeldaVerFormEfectoProducto && this.isPermisoVerFormEfectoProducto));			
			this.jMenuItemAbrirOrderByEfectoProducto.setVisible((this.isVisibilidadCeldaOrdenEfectoProducto && this.isPermisoOrdenEfectoProducto));			
			//this.jMenuItemMostrarOcultarEfectoProducto.setVisible((this.isVisibilidadCeldaOrdenEfectoProducto && this.isPermisoOrdenEfectoProducto));
			this.jMenuItemDetalleAbrirOrderByEfectoProducto.setVisible((this.isVisibilidadCeldaOrdenEfectoProducto && this.isPermisoOrdenEfectoProducto));			
			//this.jMenuItemDetalleMostrarOcultarEfectoProducto.setVisible((this.isVisibilidadCeldaOrdenEfectoProducto && this.isPermisoOrdenEfectoProducto));			
			this.jMenuItemNuevoRelacionesEfectoProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesEfectoProducto && this.isPermisoNuevoEfectoProducto));			
			this.jMenuItemNuevoGuardarCambiosEfectoProducto.setVisible((this.isVisibilidadCeldaNuevoEfectoProducto && this.isPermisoNuevoEfectoProducto && this.isPermisoGuardarCambiosEfectoProducto));									
			
			if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
			this.jInternalFrameDetalleFormEfectoProducto.jMenuItemModificarEfectoProducto.setVisible((this.isVisibilidadCeldaModificarEfectoProducto && this.isPermisoActualizarEfectoProducto));	
			this.jInternalFrameDetalleFormEfectoProducto.jMenuItemActualizarEfectoProducto.setVisible((this.isVisibilidadCeldaActualizarEfectoProducto && this.isPermisoActualizarEfectoProducto));	
			this.jInternalFrameDetalleFormEfectoProducto.jMenuItemEliminarEfectoProducto.setVisible((this.isVisibilidadCeldaEliminarEfectoProducto && this.isPermisoEliminarEfectoProducto));
			this.jInternalFrameDetalleFormEfectoProducto.jMenuItemCancelarEfectoProducto.setVisible(this.isVisibilidadCeldaCancelarEfectoProducto);				
			}
			
			this.jMenuItemGuardarCambiosEfectoProducto.setVisible((this.isVisibilidadCeldaGuardarEfectoProducto && this.isPermisoGuardarCambiosEfectoProducto));						
			this.jMenuItemGuardarCambiosTablaEfectoProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosEfectoProducto && this.isPermisoGuardarCambiosEfectoProducto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEfectoProducto=this.jButtonNuevoEfectoProducto.isVisible();
			this.isVisibilidadCeldaDuplicarEfectoProducto=this.jButtonDuplicarEfectoProducto.isVisible();
			this.isVisibilidadCeldaCopiarEfectoProducto=this.jButtonCopiarEfectoProducto.isVisible();
			this.isVisibilidadCeldaVerFormEfectoProducto=this.jButtonVerFormEfectoProducto.isVisible();
			
			this.isVisibilidadCeldaOrdenEfectoProducto=this.jButtonAbrirOrderByEfectoProducto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEfectoProducto=this.jButtonNuevoRelacionesEfectoProducto.isVisible();
			this.isVisibilidadCeldaModificarEfectoProducto=this.jButtonModificarEfectoProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
			this.isVisibilidadCeldaActualizarEfectoProducto=this.jInternalFrameDetalleFormEfectoProducto.jButtonActualizarEfectoProducto.isVisible();
			this.isVisibilidadCeldaEliminarEfectoProducto=this.jInternalFrameDetalleFormEfectoProducto.jButtonEliminarEfectoProducto.isVisible();
			this.isVisibilidadCeldaCancelarEfectoProducto=this.jInternalFrameDetalleFormEfectoProducto.jButtonCancelarEfectoProducto.isVisible();
			this.isVisibilidadCeldaGuardarEfectoProducto=this.jInternalFrameDetalleFormEfectoProducto.jButtonGuardarCambiosEfectoProducto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEfectoProducto=this.jButtonGuardarCambiosTablaEfectoProducto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEfectoProducto=this.jButtonNuevoToolBarEfectoProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEfectoProducto=this.jButtonNuevoRelacionesToolBarEfectoProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
			this.isVisibilidadCeldaModificarEfectoProducto=this.jInternalFrameDetalleFormEfectoProducto.jButtonModificarToolBarEfectoProducto.isVisible();
			this.isVisibilidadCeldaActualizarEfectoProducto=this.jInternalFrameDetalleFormEfectoProducto.jButtonActualizarToolBarEfectoProducto.isVisible();
			this.isVisibilidadCeldaEliminarEfectoProducto=this.jInternalFrameDetalleFormEfectoProducto.jButtonEliminarToolBarEfectoProducto.isVisible();
			this.isVisibilidadCeldaCancelarEfectoProducto=this.jInternalFrameDetalleFormEfectoProducto.jButtonCancelarToolBarEfectoProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEfectoProducto=this.jButtonGuardarCambiosToolBarEfectoProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEfectoProducto=this.jButtonGuardarCambiosTablaToolBarEfectoProducto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEfectoProducto=this.jMenuItemNuevoEfectoProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEfectoProducto=this.jMenuItemNuevoRelacionesEfectoProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
			this.isVisibilidadCeldaModificarEfectoProducto=this.jInternalFrameDetalleFormEfectoProducto.jMenuItemModificarEfectoProducto.isVisible();
			this.isVisibilidadCeldaActualizarEfectoProducto=this.jInternalFrameDetalleFormEfectoProducto.jMenuItemActualizarEfectoProducto.isVisible();
			this.isVisibilidadCeldaEliminarEfectoProducto=this.jInternalFrameDetalleFormEfectoProducto.jMenuItemEliminarEfectoProducto.isVisible();
			this.isVisibilidadCeldaCancelarEfectoProducto=this.jInternalFrameDetalleFormEfectoProducto.jMenuItemCancelarEfectoProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEfectoProducto=this.jMenuItemGuardarCambiosEfectoProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEfectoProducto=this.jMenuItemGuardarCambiosTablaEfectoProducto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEfectoProducto(Boolean esInicializar) {
		if(EfectoProductoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.efectoproductoSessionBean.getConGuardarRelaciones()) {
				//if(this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEfectoProducto();
			}
			
			this.inicializarActualizarBindingBotonesManualEfectoProducto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEfectoProducto() {
		this.jButtonNuevoEfectoProducto.setVisible(this.isPermisoNuevoEfectoProducto);			
		this.jButtonDuplicarEfectoProducto.setVisible(this.isPermisoDuplicarEfectoProducto);			
		this.jButtonCopiarEfectoProducto.setVisible(this.isPermisoCopiarEfectoProducto);			
		this.jButtonVerFormEfectoProducto.setVisible(this.isPermisoVerFormEfectoProducto);			
		
		this.jButtonAbrirOrderByEfectoProducto.setVisible(this.isPermisoOrdenEfectoProducto);					
		
		this.jButtonNuevoRelacionesEfectoProducto.setVisible(this.isPermisoNuevoEfectoProducto);			
		
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEfectoProducto.jButtonModificarEfectoProducto.setVisible(this.isPermisoActualizarEfectoProducto);	
			this.jInternalFrameDetalleFormEfectoProducto.jButtonActualizarEfectoProducto.setVisible(this.isPermisoActualizarEfectoProducto);	
			this.jInternalFrameDetalleFormEfectoProducto.jButtonEliminarEfectoProducto.setVisible(this.isPermisoEliminarEfectoProducto);
			this.jInternalFrameDetalleFormEfectoProducto.jButtonCancelarEfectoProducto.setVisible(this.isVisibilidadCeldaCancelarEfectoProducto);						
			this.jInternalFrameDetalleFormEfectoProducto.jButtonGuardarCambiosEfectoProducto.setVisible(this.isPermisoGuardarCambiosEfectoProducto);							
		}
		
		this.jButtonGuardarCambiosTablaEfectoProducto.setVisible(this.isPermisoActualizarEfectoProducto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEfectoProducto() {
		this.jInternalFrameDetalleFormEfectoProducto.jButtonModificarEfectoProducto.setVisible(this.isPermisoActualizarEfectoProducto);	
		this.jInternalFrameDetalleFormEfectoProducto.jButtonActualizarEfectoProducto.setVisible(this.isPermisoActualizarEfectoProducto);	
		this.jInternalFrameDetalleFormEfectoProducto.jButtonEliminarEfectoProducto.setVisible(this.isPermisoEliminarEfectoProducto);
		this.jInternalFrameDetalleFormEfectoProducto.jButtonCancelarEfectoProducto.setVisible(this.isVisibilidadCeldaCancelarEfectoProducto);							
		this.jInternalFrameDetalleFormEfectoProducto.jButtonGuardarCambiosEfectoProducto.setVisible((this.isVisibilidadCeldaGuardarEfectoProducto && this.isPermisoGuardarCambiosEfectoProducto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEfectoProducto() {
		if(EfectoProductoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEfectoProducto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEfectoProducto() {
	}
	
	public void jTableDatosEfectoProductoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEfectoProducto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEfectoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEfectoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEfectoProducto(this.getefectoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEfectoProducto(this.efectoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.efectoproducto =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.efectoproducto =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.efectoproducto==null) {
						this.efectoproducto = new EfectoProducto();
					}

					this.setVariablesFormularioToObjetoActualEfectoProducto(this.efectoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEfectoProducto(this.efectoproducto);
				}

				if(this.efectoproducto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.efectoproducto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEfectoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEfectoProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEfectoProducto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEfectoProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEfectoProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEfectoProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproducto =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.efectoproducto =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEfectoProducto(this.getefectoproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEfectoProducto(this.efectoproducto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.efectoproductoLogic.getConnexion());

				if(this.efectoproducto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.efectoproducto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEfectoProducto=(TitledBorder)this.jScrollPanelDatosEfectoProducto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEfectoProducto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEfectoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEfectoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEfectoProducto(this.getefectoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEfectoProducto(this.efectoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.efectoproducto =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.efectoproducto =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.efectoproducto==null) {
						this.efectoproducto = new EfectoProducto();
					}

					this.setVariablesFormularioToObjetoActualEfectoProducto(this.efectoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEfectoProducto(this.efectoproducto);
				}

				if(this.efectoproducto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.efectoproducto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEfectoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_productoEfectoProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoproducto=true;

			idTienePermisotipoproducto=this.tienePermisosUsuarioEnPaginaWebEfectoProducto(TipoProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEfectoProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEfectoProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEfectoProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproducto =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.efectoproducto =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEfectoProducto(this.getefectoproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEfectoProducto(this.efectoproducto);

				this.tipoproductoBeanSwingJInternalFrame=new TipoProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoproductoBeanSwingJInternalFrame.getTipoProductoLogic().setConnexion(this.efectoproductoLogic.getConnexion());

				if(this.efectoproducto.getid_tipo_producto()!=null) {
					this.tipoproductoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoproductoBeanSwingJInternalFrame.setIdActual(this.efectoproducto.getid_tipo_producto());
					this.tipoproductoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoproductoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoProducto();
				}

				JInternalFrameBase jinternalFrame =this.tipoproductoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEfectoProducto=(TitledBorder)this.jScrollPanelDatosEfectoProducto.getBorder();
				TitledBorder titledBordertipoproducto=(TitledBorder)this.tipoproductoBeanSwingJInternalFrame.jScrollPanelDatosTipoProducto.getBorder();

				titledBordertipoproducto.setTitle(titledBorderEfectoProducto.getTitle() + " -> Tipo Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_productoEfectoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEfectoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEfectoProducto(this.getefectoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEfectoProducto(this.efectoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.efectoproducto =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.efectoproducto =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.efectoproducto==null) {
						this.efectoproducto = new EfectoProducto();
					}

					this.setVariablesFormularioToObjetoActualEfectoProducto(this.efectoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEfectoProducto(this.efectoproducto);
				}

				if(this.efectoproducto.getid_tipo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_producto = "+this.efectoproducto.getid_tipo_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEfectoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEfectoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEfectoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEfectoProducto(this.getefectoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEfectoProducto(this.efectoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.efectoproducto =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.efectoproducto =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.efectoproducto==null) {
						this.efectoproducto = new EfectoProducto();
					}

					this.setVariablesFormularioToObjetoActualEfectoProducto(this.efectoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEfectoProducto(this.efectoproducto);
				}

				if(this.efectoproducto.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.efectoproducto.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEfectoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEfectoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEfectoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEfectoProducto(this.getefectoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEfectoProducto(this.efectoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.efectoproducto =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.efectoproducto =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.efectoproducto==null) {
						this.efectoproducto = new EfectoProducto();
					}

					this.setVariablesFormularioToObjetoActualEfectoProducto(this.efectoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEfectoProducto(this.efectoproducto);
				}

				if(this.efectoproducto.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.efectoproducto.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEfectoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoEfectoProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEfectoProducto(false,false);

			this.getEfectoProductosBusquedaPorCodigo();

			this.inicializarActualizarBindingEfectoProducto(false);

			//if(EfectoProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEfectoProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreEfectoProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEfectoProducto(false,false);

			this.getEfectoProductosBusquedaPorNombre();

			this.inicializarActualizarBindingEfectoProducto(false);

			//if(EfectoProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEfectoProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEfectoProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEfectoProducto(false,false);

			this.getEfectoProductosFK_IdEmpresa();

			this.inicializarActualizarBindingEfectoProducto(false);

			//if(EfectoProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEfectoProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoProductoEfectoProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEfectoProducto(false,false);

			this.getEfectoProductosFK_IdTipoProducto();

			this.inicializarActualizarBindingEfectoProducto(false);

			//if(EfectoProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEfectoProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.efectoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEfectoProducto() {
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
		

		if(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
			this.jInternalFrameDetalleFormEfectoProducto.setVisible(false);	    			
			this.jInternalFrameDetalleFormEfectoProducto.dispose();
			this.jInternalFrameDetalleFormEfectoProducto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEfectoProducto!=null) {
			this.jInternalFrameReporteDinamicoEfectoProducto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEfectoProducto.dispose();
			this.jInternalFrameReporteDinamicoEfectoProducto=null;
		}
		
		if(this.jInternalFrameImportacionEfectoProducto!=null) {
			this.jInternalFrameImportacionEfectoProducto.setVisible(false);	    			
			this.jInternalFrameImportacionEfectoProducto.dispose();
			this.jInternalFrameImportacionEfectoProducto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEfectoProducto();
			
			EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
			
			
			if(sTipo.equals("NuevoEfectoProducto")) {
				jButtonNuevoEfectoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEfectoProducto")) {
				jButtonDuplicarEfectoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEfectoProducto")) {
				jButtonCopiarEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormEfectoProducto")) {
				jButtonVerFormEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEfectoProducto")) {
				jButtonNuevoEfectoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEfectoProducto")) {
				jButtonDuplicarEfectoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEfectoProducto")) {
				jButtonNuevoEfectoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEfectoProducto")) {
				jButtonDuplicarEfectoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEfectoProducto")) {
				jButtonNuevoEfectoProductoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEfectoProducto")) {
				jButtonNuevoEfectoProductoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEfectoProducto")) {
				jButtonNuevoEfectoProductoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEfectoProducto")) {
				jButtonModificarEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEfectoProducto")) {
				jButtonModificarEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEfectoProducto")) {
				jButtonModificarEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEfectoProducto")) {
				jButtonActualizarEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEfectoProducto")) {
				jButtonActualizarEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEfectoProducto")) {
				jButtonActualizarEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarEfectoProducto")) {
				jButtonEliminarEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEfectoProducto")) {
				jButtonEliminarEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEfectoProducto")) {
				jButtonEliminarEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarEfectoProducto")) {
				jButtonCancelarEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEfectoProducto")) {
				jButtonCancelarEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEfectoProducto")) {
				jButtonCancelarEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarEfectoProducto")) {
				jButtonCerrarEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEfectoProducto")) {
				jButtonCerrarEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEfectoProducto")) {
				jButtonCerrarEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEfectoProducto")) {
				jButtonMostrarOcultarEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEfectoProducto")) {
				jButtonCancelarEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEfectoProducto")) {
				jButtonGuardarCambiosEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEfectoProducto")) {
				jButtonGuardarCambiosEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEfectoProducto")) {
				jButtonCopiarEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEfectoProducto")) {
				jButtonVerFormEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEfectoProducto")) {
				jButtonGuardarCambiosEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEfectoProducto")) {
				jButtonCopiarEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEfectoProducto")) {
				jButtonVerFormEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEfectoProducto")) {
				jButtonGuardarCambiosEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEfectoProducto")) {
				jButtonGuardarCambiosEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEfectoProducto")) {
				jButtonGuardarCambiosEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEfectoProducto")) {
				jButtonRecargarInformacionEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEfectoProducto")) {
				jButtonRecargarInformacionEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEfectoProducto")) {
				jButtonRecargarInformacionEfectoProductoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEfectoProducto")) {
				jButtonAnterioresEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEfectoProducto")) {
				jButtonAnterioresEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEfectoProducto")) {
				jButtonAnterioresEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEfectoProducto")) {
				jButtonSiguientesEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEfectoProducto")) {
				jButtonSiguientesEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEfectoProducto")) {
				jButtonSiguientesEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEfectoProducto") || sTipo.equals("MenuItemDetalleAbrirOrderByEfectoProducto")) {
				jButtonAbrirOrderByEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEfectoProducto") || sTipo.equals("MenuItemDetalleMostrarOcultarEfectoProducto")) {
				jButtonMostrarOcultarEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEfectoProducto")) {
				jButtonNuevoGuardarCambiosEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEfectoProducto")) {
				jButtonNuevoGuardarCambiosEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEfectoProducto")) {
				jButtonNuevoGuardarCambiosEfectoProductoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEfectoProducto")) {
				jButtonCerrarReporteDinamicoEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEfectoProducto")) {
				jButtonGenerarReporteDinamicoEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEfectoProducto")) {
				
				jButtonGenerarExcelReporteDinamicoEfectoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEfectoProducto")) {
				jButtonCerrarImportacionEfectoProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEfectoProducto")) {
				
				jButtonGenerarImportacionEfectoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEfectoProducto")) {
				
				jButtonAbrirImportacionEfectoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEfectoProducto")) {
				jComboBoxTiposAccionesEfectoProductoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEfectoProducto")) {
				jComboBoxTiposRelacionesEfectoProductoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEfectoProducto")) {
				jComboBoxTiposAccionesEfectoProductoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEfectoProducto")) {
				
				jComboBoxTiposSeleccionarEfectoProductoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEfectoProducto")) {
				jTextFieldValorCampoGeneralEfectoProductoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEfectoProducto")) {
				jButtonAbrirOrderByEfectoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEfectoProducto")) {
				jButtonAbrirOrderByEfectoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEfectoProducto")) {
				jButtonCerrarOrderByEfectoProductoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEfectoProductoBusqueda")) {
				this.jButtonidEfectoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEfectoProductoUpdate")) {
				this.jButtonid_empresaEfectoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEfectoProductoBusqueda")) {
				this.jButtonid_empresaEfectoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_productoEfectoProductoUpdate")) {
				this.jButtonid_tipo_productoEfectoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_productoEfectoProductoBusqueda")) {
				this.jButtonid_tipo_productoEfectoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEfectoProductoBusqueda")) {
				this.jButtoncodigoEfectoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEfectoProductoBusqueda")) {
				this.jButtonnombreEfectoProductoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoEfectoProducto")) {
				this.jButtonBusquedaPorCodigoEfectoProductoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreEfectoProducto")) {
				this.jButtonBusquedaPorNombreEfectoProductoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoProductoEfectoProducto")) {
				this.jButtonFK_IdTipoProductoEfectoProductoActionPerformed(evt);
			}
			
			;
			
			
			EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEfectoProducto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEfectoProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.efectoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.efectoproducto);
				
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
				
				


				
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EfectoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EfectoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EfectoProducto efectoproductoLocal=null;
			
			if(!this.getEsControlTabla()) {
				efectoproductoLocal=this.efectoproducto;
			} else {
				efectoproductoLocal=this.efectoproductoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.efectoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.efectoproducto);
				
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
							
				
				


				
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EfectoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EfectoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEfectoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEfectoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoAnterior =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.efectoproductoAnterior =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
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
			
			EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
			
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
			
			


			
			EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEfectoProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.efectoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.efectoproducto);
				
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
								
						
				


				
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EfectoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EfectoProducto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.efectoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.efectoproducto);
				
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
								
				
				


				
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EfectoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EfectoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEfectoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEfectoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoAnterior =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.efectoproductoAnterior =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.efectoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.efectoproducto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEfectoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEfectoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoAnterior =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.efectoproductoAnterior =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEfectoProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.efectoproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.efectoproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.efectoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.efectoproducto);
				
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
							
				
				


				
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EfectoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EfectoProducto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEfectoProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEfectoProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.efectoproductoAnterior =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.efectoproductoAnterior =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
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
			
			EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
			
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
			
			


			
			EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEfectoProductoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.efectoproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.efectoproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.efectoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.efectoproducto);
				
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
								
				
				


				
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EfectoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EfectoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEfectoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEfectoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoAnterior =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.efectoproductoAnterior =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEfectoProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.efectoproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.efectoproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEfectoProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.efectoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.efectoproducto);
				
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEfectoProducto")) {
					jCheckBoxSeleccionarTodosEfectoProductoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEfectoProducto")) {
					jCheckBoxSeleccionadosEfectoProductoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEfectoProducto")) {
					
				}
				
				


				
				
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EfectoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EfectoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.efectoproducto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.efectoproducto);
				
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
												
				
				


				
				
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EfectoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EfectoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEfectoProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEfectoProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.efectoproductoAnterior =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.efectoproductoAnterior =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEfectoProductoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.efectoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.efectoproducto);
				
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
				
				
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
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
			
			EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
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
			
			


			
			EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEfectoProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.efectoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.efectoproducto);
				
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EfectoProducto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EfectoProducto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.efectoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.efectoproducto);
				
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
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
				
				


				
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EfectoProducto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EfectoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEfectoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEfectoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.efectoproductoAnterior =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.efectoproductoAnterior =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEfectoProducto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEfectoProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEfectoProducto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.efectoproducto =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.efectoproducto =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.efectoproducto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEfectoProducto")) {
				
				}
				
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEfectoProducto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEfectoProducto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEfectoProducto")) {
			
			}
			
			EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEfectoProducto();
			
			EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
			
			if(sTipo.equals("NuevoEfectoProducto")) {
				jButtonNuevoEfectoProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEfectoProducto")) {
				jButtonDuplicarEfectoProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEfectoProducto")) {
				jButtonCopiarEfectoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEfectoProducto")) {
				jButtonVerFormEfectoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEfectoProducto")) {
				jButtonNuevoEfectoProductoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEfectoProducto")) {
				jButtonModificarEfectoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEfectoProducto")) {
				jButtonActualizarEfectoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEfectoProducto")) {
				jButtonEliminarEfectoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEfectoProducto")) {
				jButtonGuardarCambiosEfectoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEfectoProducto")) {
				jButtonCancelarEfectoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEfectoProducto")) {
				jButtonCerrarEfectoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEfectoProducto")) {
				jButtonGuardarCambiosEfectoProductoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEfectoProducto")) {
				jButtonNuevoGuardarCambiosEfectoProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEfectoProducto")) {
				jButtonAbrirOrderByEfectoProductoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEfectoProducto")) {
				jButtonRecargarInformacionEfectoProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEfectoProducto")) {
				jButtonAnterioresEfectoProductoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEfectoProducto")) {
				jButtonSiguientesEfectoProductoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEfectoProductoBusqueda")) {
				this.jButtonidEfectoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEfectoProductoUpdate")) {
				this.jButtonid_empresaEfectoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEfectoProductoBusqueda")) {
				this.jButtonid_empresaEfectoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_productoEfectoProductoUpdate")) {
				this.jButtonid_tipo_productoEfectoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_productoEfectoProductoBusqueda")) {
				this.jButtonid_tipo_productoEfectoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEfectoProductoBusqueda")) {
				this.jButtoncodigoEfectoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEfectoProductoBusqueda")) {
				this.jButtonnombreEfectoProductoBusquedaActionPerformed(evt);
			}
			
			EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEfectoProducto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEfectoProducto")) {
				closingInternalFrameEfectoProducto();
				
			} else if(sTipo.equals("jButtonCancelarEfectoProducto")) {
				JInternalFrameBase jInternalFrameDetalleFormEfectoProducto = (JInternalFrameBase)evt.getSource();
	            	
	            EfectoProductoBeanSwingJInternalFrame jInternalFrameParent=(EfectoProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormEfectoProducto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEfectoProductoActionPerformed(null);
			}
			
			EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.efectoproducto,new Object(),this.efectoproductoParameterGeneral,this.efectoproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEfectoProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEfectoProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEfectoProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.efectoproducto)) {
			if(!esControlTabla) {
				if(EfectoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEfectoProducto(this.efectoproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEfectoProducto(this.efectoproducto);			
				}
				
				if(this.efectoproductoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEfectoProducto(this.efectoproducto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.efectoproductoReturnGeneral=efectoproductoLogic.procesarEventosEfectoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.efectoproductoLogic.getEfectoProductos(),this.efectoproducto,this.efectoproductoParameterGeneral,this.isEsNuevoEfectoProducto,classes);//this.efectoproductoLogic.getEfectoProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEfectoProducto(this.efectoproductoReturnGeneral,this.efectoproductoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.efectoproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEfectoProducto(classes,this.efectoproductoReturnGeneral,this.efectoproductoBean,false);
					}
						
					if(this.efectoproductoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEfectoProducto(this.efectoproductoReturnGeneral.getEfectoProducto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEfectoProducto(this.efectoproductoReturnGeneral.getEfectoProducto());	
					}
						
					if(this.efectoproductoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEfectoProducto(this.efectoproductoReturnGeneral.getEfectoProducto(),classes);//this.efectoproductoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEfectoProducto(this.efectoproducto,classes);//this.efectoproductoBean);									
				}
			
				if(EfectoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEfectoProducto(this.efectoproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEfectoProducto(this.efectoproducto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.efectoproductoAnterior!=null) {
						this.efectoproducto=this.efectoproductoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.efectoproductoReturnGeneral=efectoproductoLogic.procesarEventosEfectoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.efectoproductoLogic.getEfectoProductos(),this.efectoproducto,this.efectoproductoParameterGeneral,this.isEsNuevoEfectoProducto,classes);//this.efectoproductoLogic.getEfectoProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.efectoproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.efectoproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.efectoproductoReturnGeneral.getEfectoProducto(),efectoproductoLogic.getEfectoProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.efectoproductoReturnGeneral.getEfectoProducto(),this.efectoproductos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEfectoProducto.repaint();
				
				//((AbstractTableModel) this.jTableDatosEfectoProducto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEfectoProducto();
			}
		}
	}
	
	public void actualizarVisualTableDatosEfectoProducto() throws Exception {
		
		EfectoProductoModel efectoproductoModel=(EfectoProductoModel)this.jTableDatosEfectoProducto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			efectoproductoModel.efectoproductos=this.efectoproductoLogic.getEfectoProductos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			efectoproductoModel.efectoproductos=this.efectoproductos;
		}
		
		
		((EfectoProductoModel) this.jTableDatosEfectoProducto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEfectoProducto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getefectoproductoAnterior(),this.efectoproductoLogic.getEfectoProductos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getefectoproductoAnterior(),this.efectoproductos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEfectoProducto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEfectoProducto(EfectoProducto efectoproducto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(efectoproducto.getProductos());
					this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(efectoproducto.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
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
										
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.efectoproducto,new Object(),generalEntityParameterGeneral,this.efectoproductoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.efectoproductoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EfectoProductoConstantesFunciones.getClassesRelationshipsOfEfectoProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EfectoProductoConstantesFunciones.getClassesRelationshipsFromStringsOfEfectoProducto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEfectoProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EfectoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.efectoproducto,new Object(),generalEntityParameterGeneral,this.efectoproductoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEfectoProducto(EfectoProductoBean efectoproductoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(efectoproducto.getProductos());
					this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(efectoproducto.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEfectoProducto(ArrayList<Classe> classes,EfectoProductoReturnGeneral efectoproductoReturnGeneral,EfectoProductoBean efectoproductoBean,Boolean conDefault) throws Exception {
		
			this.efectoproductoBean.setProductos(efectoproductoReturnGeneral.getEfectoProducto().getProductos());
			this.efectoproductoBean.setParametroInventarioDefectos(efectoproductoReturnGeneral.getEfectoProducto().getParametroInventarioDefectos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEfectoProducto(EfectoProducto efectoproducto,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					efectoproducto.setProductos(this.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					efectoproducto.setParametroInventarioDefectos(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.efectoproducto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEfectoProducto = new EfectoProductoDetalleFormJInternalFrame(jDesktopPane,this.efectoproductoSessionBean.getConGuardarRelaciones(),this.efectoproductoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEfectoProducto);
		this.jInternalFrameDetalleFormEfectoProducto.setVisible(false);
		this.jInternalFrameDetalleFormEfectoProducto.setSelected(false);						
		
		this.jInternalFrameDetalleFormEfectoProducto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEfectoProducto.efectoproductoLogic=this.efectoproductoLogic;
		
		this.cargarCombosFrameForeignKeyEfectoProducto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEfectoProducto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEfectoProducto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEfectoProducto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEfectoProducto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEfectoProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEfectoProducto"));
		
		this.jInternalFrameDetalleFormEfectoProducto.jButtonModificarEfectoProducto.addActionListener(new ButtonActionListener(this,"ModificarEfectoProducto"));

		
		this.jInternalFrameDetalleFormEfectoProducto.jButtonModificarToolBarEfectoProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarEfectoProducto"));
					
		this.jInternalFrameDetalleFormEfectoProducto.jMenuItemModificarEfectoProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarEfectoProducto"));		
		
		
		
		this.jInternalFrameDetalleFormEfectoProducto.jButtonActualizarEfectoProducto.addActionListener (new ButtonActionListener(this,"ActualizarEfectoProducto"));
		
		
		this.jInternalFrameDetalleFormEfectoProducto.jButtonActualizarToolBarEfectoProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEfectoProducto"));
						
		this.jInternalFrameDetalleFormEfectoProducto.jMenuItemActualizarEfectoProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEfectoProducto"));		
		
		
		
		this.jInternalFrameDetalleFormEfectoProducto.jButtonEliminarEfectoProducto.addActionListener (new ButtonActionListener(this,"EliminarEfectoProducto"));
		
		
		this.jInternalFrameDetalleFormEfectoProducto.jButtonEliminarToolBarEfectoProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarEfectoProducto"));
								
		this.jInternalFrameDetalleFormEfectoProducto.jMenuItemEliminarEfectoProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEfectoProducto"));		
		
		
		
		this.jInternalFrameDetalleFormEfectoProducto.jButtonCancelarEfectoProducto.addActionListener (new ButtonActionListener(this,"CancelarEfectoProducto"));
		
		
		this.jInternalFrameDetalleFormEfectoProducto.jButtonCancelarToolBarEfectoProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarEfectoProducto"));
					
		this.jInternalFrameDetalleFormEfectoProducto.jMenuItemCancelarEfectoProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEfectoProducto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEfectoProducto.jMenuItemDetalleCerrarEfectoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEfectoProducto"));		
		
		
		
		this.jInternalFrameDetalleFormEfectoProducto.jButtonGuardarCambiosToolBarEfectoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEfectoProducto"));
		
		
		
		this.jInternalFrameDetalleFormEfectoProducto.jButtonGuardarCambiosToolBarEfectoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEfectoProducto"));
		
		
		
		this.jInternalFrameDetalleFormEfectoProducto.jComboBoxTiposAccionesFormularioEfectoProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEfectoProducto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEfectoProducto.jButtonidEfectoProductoBusqueda.addActionListener(new ButtonActionListener(this,"idEfectoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEfectoProducto.jButtonid_empresaEfectoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEfectoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEfectoProducto.jButtonid_empresaEfectoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEfectoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEfectoProducto.jButtonid_tipo_productoEfectoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_productoEfectoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEfectoProducto.jButtonid_tipo_productoEfectoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_productoEfectoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEfectoProducto.jButtoncodigoEfectoProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEfectoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEfectoProducto.jButtonnombreEfectoProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEfectoProductoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEfectoProducto.jTabbedPaneRelacionesEfectoProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEfectoProducto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEfectoProducto"));
		
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEfectoProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEfectoProducto"));
		}
		
		this.jTableDatosEfectoProducto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEfectoProducto"));
		
		this.jTableDatosEfectoProducto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEfectoProducto"));
		
		this.jButtonNuevoEfectoProducto.addActionListener(new ButtonActionListener(this,"NuevoEfectoProducto"));
		
		this.jButtonDuplicarEfectoProducto.addActionListener(new ButtonActionListener(this,"DuplicarEfectoProducto"));
		
		this.jButtonCopiarEfectoProducto.addActionListener(new ButtonActionListener(this,"CopiarEfectoProducto"));
		
		this.jButtonVerFormEfectoProducto.addActionListener(new ButtonActionListener(this,"VerFormEfectoProducto"));
		
		
		this.jButtonNuevoToolBarEfectoProducto.addActionListener(new ButtonActionListener(this,"NuevoToolBarEfectoProducto"));
			
		this.jButtonDuplicarToolBarEfectoProducto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEfectoProducto"));
			
		this.jMenuItemNuevoEfectoProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEfectoProducto"));
			
		this.jMenuItemDuplicarEfectoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEfectoProducto"));		
		
		
		this.jButtonNuevoRelacionesEfectoProducto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEfectoProducto"));
		
		
		this.jButtonNuevoRelacionesToolBarEfectoProducto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEfectoProducto"));
			
		this.jMenuItemNuevoRelacionesEfectoProducto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEfectoProducto"));		
		
		
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEfectoProducto.jButtonModificarEfectoProducto.addActionListener(new ButtonActionListener(this,"ModificarEfectoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEfectoProducto.jButtonModificarToolBarEfectoProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarEfectoProducto"));
			
			this.jInternalFrameDetalleFormEfectoProducto.jMenuItemModificarEfectoProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarEfectoProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEfectoProducto.jButtonActualizarEfectoProducto.addActionListener (new ButtonActionListener(this,"ActualizarEfectoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEfectoProducto.jButtonActualizarToolBarEfectoProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEfectoProducto"));
				
			this.jInternalFrameDetalleFormEfectoProducto.jMenuItemActualizarEfectoProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEfectoProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEfectoProducto.jButtonEliminarEfectoProducto.addActionListener (new ButtonActionListener(this,"EliminarEfectoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEfectoProducto.jButtonEliminarToolBarEfectoProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarEfectoProducto"));
						
			this.jInternalFrameDetalleFormEfectoProducto.jMenuItemEliminarEfectoProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEfectoProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEfectoProducto.jButtonCancelarEfectoProducto.addActionListener (new ButtonActionListener(this,"CancelarEfectoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEfectoProducto.jButtonCancelarToolBarEfectoProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarEfectoProducto"));
			
			this.jInternalFrameDetalleFormEfectoProducto.jMenuItemCancelarEfectoProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEfectoProducto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEfectoProducto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEfectoProducto"));		
		
		
		this.jButtonCerrarEfectoProducto.addActionListener (new ButtonActionListener(this,"CerrarEfectoProducto"));
		
		
		this.jButtonCerrarToolBarEfectoProducto.addActionListener (new ButtonActionListener(this,"CerrarToolBarEfectoProducto"));
			
		this.jMenuItemCerrarEfectoProducto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEfectoProducto"));
			
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEfectoProducto.jMenuItemDetalleCerrarEfectoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEfectoProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEfectoProducto.jButtonGuardarCambiosEfectoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosEfectoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEfectoProducto.jButtonGuardarCambiosToolBarEfectoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEfectoProducto"));
		}
		
		this.jButtonCopiarToolBarEfectoProducto.addActionListener (new ButtonActionListener(this,"CopiarToolBarEfectoProducto"));
			
		this.jButtonVerFormToolBarEfectoProducto.addActionListener (new ButtonActionListener(this,"VerFormToolBarEfectoProducto"));
		
		this.jMenuItemGuardarCambiosEfectoProducto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEfectoProducto"));
			
		this.jMenuItemCopiarEfectoProducto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEfectoProducto"));		
		
		this.jMenuItemVerFormEfectoProducto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEfectoProducto"));		
		
		
		this.jButtonGuardarCambiosTablaEfectoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEfectoProducto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEfectoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEfectoProducto"));
			
		this.jMenuItemGuardarCambiosTablaEfectoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEfectoProducto"));		
		
		
		
		this.jButtonRecargarInformacionEfectoProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionEfectoProducto"));
					
		this.jButtonRecargarInformacionToolBarEfectoProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEfectoProducto"));
		
		this.jMenuItemRecargarInformacionEfectoProducto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEfectoProducto"));		
		
		
		
		this.jButtonAnterioresEfectoProducto.addActionListener (new ButtonActionListener(this,"AnterioresEfectoProducto"));
		
		
		this.jButtonAnterioresToolBarEfectoProducto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEfectoProducto"));
		
		this.jMenuItemAnterioresEfectoProducto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEfectoProducto"));		
		
		
		this.jButtonSiguientesEfectoProducto.addActionListener (new ButtonActionListener(this,"SiguientesEfectoProducto"));
		
		
		this.jButtonSiguientesToolBarEfectoProducto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEfectoProducto"));
			
		this.jMenuItemSiguientesEfectoProducto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEfectoProducto"));
			
		this.jMenuItemAbrirOrderByEfectoProducto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEfectoProducto"));
			
		this.jMenuItemMostrarOcultarEfectoProducto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEfectoProducto"));
			
		this.jMenuItemDetalleAbrirOrderByEfectoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEfectoProducto"));
			
		this.jMenuItemDetalleMostarOcultarEfectoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEfectoProducto"));		
		
		
		this.jButtonNuevoGuardarCambiosEfectoProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEfectoProducto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEfectoProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEfectoProducto"));
			
		this.jMenuItemNuevoGuardarCambiosEfectoProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEfectoProducto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEfectoProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEfectoProducto"));

		this.jCheckBoxSeleccionadosEfectoProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEfectoProducto"));
		
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEfectoProducto.jComboBoxTiposAccionesFormularioEfectoProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEfectoProducto"));
		}
		
		
		this.jComboBoxTiposRelacionesEfectoProducto.addActionListener (new ButtonActionListener(this,"TiposRelacionesEfectoProducto"));
			
		this.jComboBoxTiposAccionesEfectoProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesEfectoProducto"));
					
		this.jComboBoxTiposSeleccionarEfectoProducto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEfectoProducto"));
			
		this.jTextFieldValorCampoGeneralEfectoProducto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEfectoProducto"));		
		
		
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEfectoProducto.jButtonidEfectoProductoBusqueda.addActionListener(new ButtonActionListener(this,"idEfectoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEfectoProducto.jButtonid_empresaEfectoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEfectoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEfectoProducto.jButtonid_empresaEfectoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEfectoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEfectoProducto.jButtonid_tipo_productoEfectoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_productoEfectoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEfectoProducto.jButtonid_tipo_productoEfectoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_productoEfectoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEfectoProducto.jButtoncodigoEfectoProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEfectoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEfectoProducto.jButtonnombreEfectoProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEfectoProductoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoEfectoProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoEfectoProducto"));

			this.jButtonBusquedaPorNombreEfectoProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreEfectoProducto"));

			this.jButtonFK_IdTipoProductoEfectoProducto.addActionListener(new ButtonActionListener(this,"FK_IdTipoProductoEfectoProducto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEfectoProducto!=null) {
				this.jInternalFrameReporteDinamicoEfectoProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEfectoProducto"));
				this.jInternalFrameReporteDinamicoEfectoProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEfectoProducto"));
				this.jInternalFrameReporteDinamicoEfectoProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEfectoProducto"));
			}
			
			//this.jButtonCerrarReporteDinamicoEfectoProducto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEfectoProducto"));				
			//this.jButtonGenerarReporteDinamicoEfectoProducto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEfectoProducto"));
			//this.jButtonGenerarExcelReporteDinamicoEfectoProducto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEfectoProducto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEfectoProducto!=null) {
				this.jInternalFrameImportacionEfectoProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEfectoProducto"));
				this.jInternalFrameImportacionEfectoProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEfectoProducto"));
				this.jInternalFrameImportacionEfectoProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEfectoProducto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEfectoProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByEfectoProducto"));
			
			this.jButtonAbrirOrderByToolBarEfectoProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEfectoProducto"));			
			
			if(this.jInternalFrameOrderByEfectoProducto!=null) {
				this.jInternalFrameOrderByEfectoProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEfectoProducto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEfectoProducto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEfectoProducto.jTabbedPaneRelacionesEfectoProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEfectoProducto"));
		
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
            		closingInternalFrameEfectoProducto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEfectoProducto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEfectoProducto = (JInternalFrameBase)event.getSource();
	            	
	            EfectoProductoBeanSwingJInternalFrame jInternalFrameParent=(EfectoProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormEfectoProducto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEfectoProductoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEfectoProducto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEfectoProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEfectoProducto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEfectoProducto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEfectoProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEfectoProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEfectoProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEfectoProducto";
		inputMap = this.jButtonNuevoEfectoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEfectoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEfectoProductoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEfectoProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEfectoProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEfectoProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEfectoProducto";
		inputMap = this.jButtonNuevoRelacionesEfectoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEfectoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEfectoProductoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEfectoProducto";
		inputMap = this.jButtonModificarEfectoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEfectoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEfectoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEfectoProducto";
		inputMap = this.jButtonActualizarEfectoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEfectoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEfectoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEfectoProducto";
		inputMap = this.jButtonEliminarEfectoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEfectoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEfectoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEfectoProducto";
		inputMap = this.jButtonCancelarEfectoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEfectoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEfectoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEfectoProducto";
		inputMap = this.jButtonCerrarEfectoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEfectoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEfectoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEfectoProducto.jButtonGuardarCambiosEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEfectoProducto";
		inputMap = this.jInternalFrameDetalleFormEfectoProducto.jButtonGuardarCambiosEfectoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEfectoProducto.jButtonGuardarCambiosEfectoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEfectoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEfectoProducto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEfectoProductoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEfectoProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEfectoProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEfectoProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEfectoProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEfectoProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEfectoProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEfectoProducto.jButtonidEfectoProductoBusqueda.addActionListener(new ButtonActionListener(this,"idEfectoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEfectoProducto.jButtonid_empresaEfectoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEfectoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEfectoProducto.jButtonid_empresaEfectoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEfectoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEfectoProducto.jButtonid_tipo_productoEfectoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_productoEfectoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEfectoProducto.jButtonid_tipo_productoEfectoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_productoEfectoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEfectoProducto.jButtoncodigoEfectoProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEfectoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEfectoProducto.jButtonnombreEfectoProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEfectoProductoBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoEfectoProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoEfectoProducto"));

		this.jButtonBusquedaPorNombreEfectoProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreEfectoProducto"));

		this.jButtonFK_IdTipoProductoEfectoProducto.addActionListener(new ButtonActionListener(this,"FK_IdTipoProductoEfectoProducto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEfectoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEfectoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEfectoProductoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEfectoProducto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEfectoProducto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EfectoProducto efectoproductoAux:this.efectoproductoLogic.getEfectoProductos()) {
					efectoproductoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EfectoProducto efectoproductoAux:efectoproductos) {
					efectoproductoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEfectoProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEfectoProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EfectoProducto efectoproductoAux:this.efectoproductoLogic.getEfectoProductos()) {
						efectoproductoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EfectoProducto efectoproductoAux:efectoproductos) {
						efectoproductoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EfectoProducto efectoproductoAux:this.efectoproductoLogic.getEfectoProductos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EfectoProducto efectoproductoAux:efectoproductos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEfectoProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEfectoProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEfectoProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEfectoProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEfectoProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEfectoProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEfectoProducto.getSelectedRows();
			
			EfectoProducto efectoproductoLocal=new EfectoProducto();
			
			//this.seleccionarTodosEfectoProducto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					efectoproductoLocal =(EfectoProducto) this.efectoproductoLogic.getEfectoProductos().toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					efectoproductoLocal =(EfectoProducto) this.efectoproductos.toArray()[this.jTableDatosEfectoProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				efectoproductoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EfectoProducto efectoproductoAux:this.efectoproductoLogic.getEfectoProductos()) {
						efectoproductoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EfectoProducto efectoproductoAux:efectoproductos) {
						efectoproductoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEfectoProducto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEfectoProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEfectoProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEfectoProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEfectoProductoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEfectoProductoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEfectoProductoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEfectoProducto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEfectoProducto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EfectoProducto efectoproductoAux:this.efectoproductoLogic.getEfectoProductos()) {
				
						if(sTipoSeleccionar.equals(EfectoProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							efectoproductoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EfectoProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							efectoproductoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EfectoProducto efectoproductoAux:efectoproductos) {
					
						if(sTipoSeleccionar.equals(EfectoProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							efectoproductoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EfectoProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							efectoproductoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEfectoProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEfectoProductoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEfectoProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEfectoProducto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEfectoProducto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEfectoProducto.jComboBoxTiposAccionesFormularioEfectoProducto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEfectoProducto) {				
					conSplash=true;//false;										
					
					//this.startProcessEfectoProducto(conSplash);
				
					this.generarReporteEfectoProductosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEfectoProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEfectoProducto.jComboBoxTiposAccionesFormularioEfectoProducto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEfectoProductosSeleccionados();
				//this.jComboBoxTiposAccionesEfectoProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEfectoProductosSeleccionados(false);
				//this.jComboBoxTiposAccionesEfectoProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEfectoProductosSeleccionados(true);
				//this.jComboBoxTiposAccionesEfectoProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEfectoProducto();
				
				this.exportarEfectoProductosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEfectoProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEfectoProducto.jComboBoxTiposAccionesFormularioEfectoProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEfectoProductos();
				//this.importarEfectoProductos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEfectoProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEfectoProducto.jComboBoxTiposAccionesFormularioEfectoProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEfectoProducto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEfectoProductosSeleccionados();
				//this.jComboBoxTiposAccionesEfectoProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Efecto Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEfectoProducto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEfectoProducto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEfectoProducto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Efecto Producto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEfectoProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEfectoProducto.jComboBoxTiposAccionesFormularioEfectoProducto.setSelectedIndex(0);					
				}	
			} 			
			else if(EfectoProductoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEfectoProducto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEfectoProducto(conSplash);
					
						//this.actualizarParametrosGeneralEfectoProducto();
						
						this.generarReporteProcesoAccionEfectoProductosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEfectoProducto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEfectoProducto.jComboBoxTiposAccionesFormularioEfectoProducto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EfectoProductoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Efecto ProductoS SELECCIONADOS?", "MANTENIMIENTO DE Efecto Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEfectoProducto();
				
						this.actualizarParametrosGeneralEfectoProducto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.efectoproductoReturnGeneral=efectoproductoLogic.procesarAccionEfectoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.efectoproductoLogic.getEfectoProductos(),this.efectoproductoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEfectoProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEfectoProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEfectoProducto.jComboBoxTiposAccionesFormularioEfectoProducto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEfectoProducto();
					
					EfectoProductoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEfectoProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEfectoProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEfectoProducto.jComboBoxTiposAccionesFormularioEfectoProducto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEfectoProducto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEfectoProductoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEfectoProducto();
			
			if(this.jInternalFrameDetalleFormEfectoProducto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EfectoProducto> efectoproductosSeleccionados=new ArrayList<EfectoProducto>();		
			EfectoProducto efectoproducto=new EfectoProducto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEfectoProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEfectoProducto.getSelectedItem();
			
			
			
			
			efectoproductosSeleccionados=this.getEfectoProductosSeleccionados(true);
			//this.sTipoAccion;
			
			if(efectoproductosSeleccionados.size()==1) {
				for(EfectoProducto efectoproductoAux:efectoproductosSeleccionados) {
					efectoproducto=efectoproductoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Producto")) {
					jButtonProductoActionPerformed(null,rowIndex,true,false,efectoproducto);
				}
				else if(this.sTipoRelacion.equals("Parametro Inventario Defecto")) {
					jButtonParametroInventarioDefectoActionPerformed(null,rowIndex,true,false,efectoproducto);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEfectoProducto();
			
      		//this.finishProcessEfectoProducto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEfectoProductoReturnGeneral() throws Exception {
		if(this.efectoproductoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.efectoproductoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.efectoproductoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.efectoproductoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.efectoproductoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.efectoproductoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEfectoProducto(false);
		}
		
		if(this.efectoproductoReturnGeneral.getConRetornoLista() || this.efectoproductoReturnGeneral.getConRetornoObjeto()) {
			if(this.efectoproductoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.efectoproductoLogic.setEfectoProductos(this.efectoproductoReturnGeneral.getEfectoProductos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.efectoproductoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.efectoproductoLogic.setEfectoProducto(this.efectoproductoReturnGeneral.getEfectoProducto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEfectoProducto(false);
		}
	}
	
	public void actualizarParametrosGeneralEfectoProducto() throws Exception {
		
		
	}
	
	public ArrayList<EfectoProducto> getEfectoProductosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EfectoProducto> efectoproductosSeleccionados=new ArrayList<EfectoProducto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEfectoProducto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EfectoProducto efectoproductoAux:efectoproductoLogic.getEfectoProductos()) {
					if(efectoproductoAux.getIsSelected()) {
						efectoproductosSeleccionados.add(efectoproductoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EfectoProducto efectoproductoAux:this.efectoproductos) {
					if(efectoproductoAux.getIsSelected()) {
						efectoproductosSeleccionados.add(efectoproductoAux);				
					}
				}
			}
			
			if(efectoproductosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						efectoproductosSeleccionados.addAll(this.efectoproductoLogic.getEfectoProductos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						efectoproductosSeleccionados.addAll(this.efectoproductos);				
					}
				}
			}
		} else {
			efectoproductosSeleccionados.add(this.efectoproducto);
		}
		
		return efectoproductosSeleccionados;
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
	
	public void generarReporteEfectoProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEfectoProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEfectoProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEfectoProductosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEfectoProductosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEfectoProductosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Efecto Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEfectoProductosSeleccionados() throws Exception {
		ArrayList<EfectoProducto> efectoproductosSeleccionados=new ArrayList<EfectoProducto>();		
		
		efectoproductosSeleccionados=this.getEfectoProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEfectoProductos("Todos",efectoproductosSeleccionados);
		
	}	
	
	public void generarReporteNormalEfectoProductosSeleccionados() throws Exception {
		ArrayList<EfectoProducto> efectoproductosSeleccionados=new ArrayList<EfectoProducto>();		
		
		efectoproductosSeleccionados=this.getEfectoProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEfectoProductos("Todos",efectoproductosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEfectoProductosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EfectoProducto> efectoproductosSeleccionados=new ArrayList<EfectoProducto>();
		
		efectoproductosSeleccionados=this.getEfectoProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEfectoProductos("Todos",efectoproductosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEfectoProductosSeleccionados() throws Exception {
		ArrayList<EfectoProducto> efectoproductosSeleccionados=new ArrayList<EfectoProducto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEfectoProducto();
		
		
		efectoproductosSeleccionados=this.getEfectoProductosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEfectoProducto();
		
		
		//this.generarReporteEfectoProductos("Todos",efectoproductosSeleccionados ,efectoproductoImplementable,efectoproductoImplementableHome);
	}
	
	public void mostrarImportacionEfectoProductos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEfectoProducto();
		
		this.abrirFrameImportacionEfectoProducto();		
		
			
		//this.generarReporteEfectoProductos("Todos",efectoproductosSeleccionados ,efectoproductoImplementable,efectoproductoImplementableHome);
	}
	
	public void importarEfectoProductos() throws Exception {		
	
	}
	
	public void exportarEfectoProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEfectoProductosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEfectoProductosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEfectoProductosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Efecto Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEfectoProductosSeleccionados() throws Exception {
		ArrayList<EfectoProducto> efectoproductosSeleccionados=new ArrayList<EfectoProducto>();		
		
		efectoproductosSeleccionados=this.getEfectoProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"efectoproducto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEfectoProducto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EfectoProducto efectoproductoAux:efectoproductosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEfectoProducto(efectoproductoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//efectoproductoAux.setsDetalleGeneralEntityReporte(efectoproductoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.efectoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Efecto Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEfectoProducto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EfectoProductoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EfectoProductoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EfectoProductoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EfectoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EfectoProductoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EfectoProductoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEfectoProducto(EfectoProducto efectoproducto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=efectoproducto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=efectoproducto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=efectoproducto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=efectoproducto.gettipoproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=efectoproducto.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=efectoproducto.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEfectoProductosSeleccionados() throws Exception {
		ArrayList<EfectoProducto> efectoproductosSeleccionados=new ArrayList<EfectoProducto>();		
		
		efectoproductosSeleccionados=this.getEfectoProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"efectoproducto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EfectoProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEfectoProducto(row);				
				iRow++;
			}				
			
			for(EfectoProducto efectoproductoAux:efectoproductosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEfectoProducto(efectoproductoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.efectoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Efecto Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEfectoProductosSeleccionados() throws Exception {
		ArrayList<EfectoProducto> efectoproductosSeleccionados=new ArrayList<EfectoProducto>();		
		
		efectoproductosSeleccionados=this.getEfectoProductosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"efectoproducto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("efectoproductos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("efectoproducto");
			//elementRoot.appendChild(element);
		
			for(EfectoProducto efectoproductoAux:efectoproductosSeleccionados) {
				element = document.createElement("efectoproducto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEfectoProducto(efectoproductoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.efectoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Efecto Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEfectoProducto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EfectoProductoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EfectoProductoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EfectoProductoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EfectoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(EfectoProductoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EfectoProductoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEfectoProducto(EfectoProducto efectoproducto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(efectoproducto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(efectoproducto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(efectoproducto.gettipoproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(efectoproducto.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(efectoproducto.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEfectoProducto(EfectoProducto efectoproducto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EfectoProductoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(efectoproducto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EfectoProductoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(efectoproducto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EfectoProductoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(efectoproducto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtipoproducto_descripcion = document.createElement(EfectoProductoConstantesFunciones.IDTIPOPRODUCTO);
		elementtipoproducto_descripcion.appendChild(document.createTextNode(efectoproducto.gettipoproducto_descripcion()));
		element.appendChild(elementtipoproducto_descripcion);

		Element elementcodigo = document.createElement(EfectoProductoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(efectoproducto.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EfectoProductoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(efectoproducto.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEfectoProductosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EfectoProducto> efectoproductosSeleccionados=new ArrayList<EfectoProducto>();
		
		efectoproductosSeleccionados=this.getEfectoProductosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEfectoProducto(efectoproductosSeleccionados);
		
		this.generarReporteEfectoProductos("Todos",efectoproductosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEfectoProducto(ArrayList<EfectoProducto> efectoproductosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EfectoProducto efectoproductoAux:efectoproductosSeleccionados) {
				efectoproductoAux.setsDetalleGeneralEntityReporte(efectoproductoAux.toString());
			
				if(sTipoSeleccionar.equals(EfectoProductoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					efectoproductoAux.setsDescripcionGeneralEntityReporte1(efectoproductoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EfectoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO)) {
					existe=true;
					efectoproductoAux.setsDescripcionGeneralEntityReporte1(efectoproductoAux.gettipoproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EfectoProductoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					efectoproductoAux.setsDescripcionGeneralEntityReporte1(efectoproductoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EfectoProductoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					efectoproductoAux.setsDescripcionGeneralEntityReporte1(efectoproductoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EfectoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEfectoProducto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEfectoProducto=true;
				this.isVisibilidadCeldaNuevoRelacionesEfectoProducto=true;
				this.isVisibilidadCeldaGuardarCambiosEfectoProducto=true;
			}
			
			this.isVisibilidadCeldaModificarEfectoProducto=false;
			this.isVisibilidadCeldaActualizarEfectoProducto=false;
			this.isVisibilidadCeldaEliminarEfectoProducto=false;
			this.isVisibilidadCeldaCancelarEfectoProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEfectoProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarEfectoProducto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEfectoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesEfectoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosEfectoProducto=false;
			this.isVisibilidadCeldaModificarEfectoProducto=false;
			this.isVisibilidadCeldaActualizarEfectoProducto=true;
			this.isVisibilidadCeldaEliminarEfectoProducto=false;
			this.isVisibilidadCeldaCancelarEfectoProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEfectoProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarEfectoProducto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEfectoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesEfectoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosEfectoProducto=false;
			this.isVisibilidadCeldaModificarEfectoProducto=false;
			this.isVisibilidadCeldaActualizarEfectoProducto=true;
			this.isVisibilidadCeldaEliminarEfectoProducto=true;
			this.isVisibilidadCeldaCancelarEfectoProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEfectoProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarEfectoProducto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEfectoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesEfectoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosEfectoProducto=false;
			this.isVisibilidadCeldaModificarEfectoProducto=false;
			this.isVisibilidadCeldaActualizarEfectoProducto=true;
			this.isVisibilidadCeldaEliminarEfectoProducto=false;
			this.isVisibilidadCeldaCancelarEfectoProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEfectoProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarEfectoProducto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEfectoProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesEfectoProducto=true;
			this.isVisibilidadCeldaGuardarCambiosEfectoProducto=true;
			this.isVisibilidadCeldaModificarEfectoProducto=false;
			this.isVisibilidadCeldaActualizarEfectoProducto=false;
			this.isVisibilidadCeldaEliminarEfectoProducto=false;
			this.isVisibilidadCeldaCancelarEfectoProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEfectoProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarEfectoProducto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEfectoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesEfectoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosEfectoProducto=false;
			this.isVisibilidadCeldaActualizarEfectoProducto=false;
			this.isVisibilidadCeldaEliminarEfectoProducto=false;
			this.isVisibilidadCeldaCancelarEfectoProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEfectoProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarEfectoProducto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEfectoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesEfectoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosEfectoProducto=false;
			this.isVisibilidadCeldaModificarEfectoProducto=true;
			this.isVisibilidadCeldaActualizarEfectoProducto=false;
			this.isVisibilidadCeldaEliminarEfectoProducto=false;
			this.isVisibilidadCeldaCancelarEfectoProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEfectoProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarEfectoProducto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EfectoProductoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEfectoProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesEfectoProducto=true;
			this.isVisibilidadCeldaGuardarCambiosEfectoProducto=true;
		} else {
			this.actualizarEstadoPanelsEfectoProducto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEfectoProducto=false;
			//this.isVisibilidadCeldaVerFormEfectoProducto=false;
			this.isVisibilidadCeldaDuplicarEfectoProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!efectoproductoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEfectoProducto=false;
		} else {
			this.isVisibilidadCeldaNuevoEfectoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosEfectoProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(efectoproductoSessionBean.getEsGuardarRelacionado()) {
			if(!efectoproductoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEfectoProducto=false;												
			}
			
			this.jButtonCerrarEfectoProducto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEfectoProducto=false;
		}
		
		if(!this.permiteMantenimiento(this.efectoproducto)) {
			this.isVisibilidadCeldaActualizarEfectoProducto=false;
			this.isVisibilidadCeldaEliminarEfectoProducto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEfectoProducto() {
		this.isVisibilidadCeldaNuevoEfectoProducto=false;
		this.isVisibilidadCeldaGuardarCambiosEfectoProducto=false;
	}
	
	public void actualizarEstadoPanelsEfectoProducto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEfectoProducto!=null) {
				this.jScrollPanelDatosEdicionEfectoProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEfectoProducto!=null) {
				this.jTabbedPaneBusquedasEfectoProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEfectoProducto!=null) {
				this.jScrollPanelDatosEfectoProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionEfectoProducto!=null) {
				this.jPanelPaginacionEfectoProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEfectoProducto!=null) {
				this.jPanelParametrosReportesEfectoProducto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEfectoProducto!=null) {
				this.jScrollPanelDatosEdicionEfectoProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEfectoProducto!=null) {
				this.jTabbedPaneBusquedasEfectoProducto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEfectoProducto!=null) {
				this.jScrollPanelDatosEfectoProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionEfectoProducto!=null) {
				this.jPanelPaginacionEfectoProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEfectoProducto!=null) {
				this.jPanelParametrosReportesEfectoProducto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEfectoProducto!=null) {
				this.jScrollPanelDatosEdicionEfectoProducto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEfectoProducto!=null) {
				this.jTabbedPaneBusquedasEfectoProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEfectoProducto!=null) {
				this.jScrollPanelDatosEfectoProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionEfectoProducto!=null) {
				this.jPanelPaginacionEfectoProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEfectoProducto!=null) {
				this.jPanelParametrosReportesEfectoProducto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEfectoProducto!=null) {
				this.jScrollPanelDatosEdicionEfectoProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEfectoProducto!=null) {
				this.jTabbedPaneBusquedasEfectoProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEfectoProducto!=null) {
				this.jScrollPanelDatosEfectoProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionEfectoProducto!=null) {
				this.jPanelPaginacionEfectoProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEfectoProducto!=null) {
				this.jPanelParametrosReportesEfectoProducto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEfectoProducto!=null) {
				this.jScrollPanelDatosEdicionEfectoProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEfectoProducto!=null) {
				this.jTabbedPaneBusquedasEfectoProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEfectoProducto!=null) {
				this.jScrollPanelDatosEfectoProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionEfectoProducto!=null) {
				this.jPanelPaginacionEfectoProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEfectoProducto!=null) {
				this.jPanelParametrosReportesEfectoProducto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEfectoProducto!=null) {
				this.jScrollPanelDatosEdicionEfectoProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEfectoProducto!=null) {
				this.jTabbedPaneBusquedasEfectoProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEfectoProducto!=null) {
				this.jScrollPanelDatosEfectoProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionEfectoProducto!=null) {
				this.jPanelPaginacionEfectoProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEfectoProducto!=null) {
				this.jPanelParametrosReportesEfectoProducto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEfectoProducto!=null) {
				this.jScrollPanelDatosEdicionEfectoProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEfectoProducto!=null) {
				this.jTabbedPaneBusquedasEfectoProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEfectoProducto!=null) {
				this.jScrollPanelDatosEfectoProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionEfectoProducto!=null) {
				this.jPanelPaginacionEfectoProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEfectoProducto!=null) {
				this.jPanelParametrosReportesEfectoProducto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEfectoProducto!=null) {
					this.jTabbedPaneBusquedasEfectoProducto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEfectoProducto!=null) {
				this.jPanelParametrosReportesEfectoProducto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.efectoproductoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEfectoProducto!=null) {
				this.jTabbedPaneBusquedasEfectoProducto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEfectoProducto!=null) {
				this.jPanelParametrosReportesEfectoProducto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasEfectoProducto.remove(jPanelBusquedaPorCodigoEfectoProducto);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasEfectoProducto.remove(jPanelBusquedaPorNombreEfectoProducto);}

			this.isVisibilidadFK_IdTipoProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoProducto) {this.jTabbedPaneBusquedasEfectoProducto.remove(jPanelFK_IdTipoProductoEfectoProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoProducto(Boolean isParaTipoProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoProductoNegation=!isParaTipoProducto;

			this.isVisibilidadBusquedaPorCodigo=isParaTipoProductoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasEfectoProducto.remove(jPanelBusquedaPorCodigoEfectoProducto);}

			this.isVisibilidadBusquedaPorNombre=isParaTipoProductoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasEfectoProducto.remove(jPanelBusquedaPorNombreEfectoProducto);}

			this.isVisibilidadFK_IdTipoProducto=isParaTipoProducto;
			if(!this.isVisibilidadFK_IdTipoProducto) {this.jTabbedPaneBusquedasEfectoProducto.remove(jPanelFK_IdTipoProductoEfectoProducto);}
		}
		
	}
	
	

	public String registrarSesionEfectoProductoParaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(this.efectoproductoSessionBean==null) {
				this.efectoproductoSessionBean=new EfectoProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormEfectoProducto.productoSessionBean==null) {
				this.jInternalFrameDetalleFormEfectoProducto.productoSessionBean=new ProductoSessionBean();
			}

			this.jInternalFrameDetalleFormEfectoProducto.productoSessionBean.setsPathNavegacionActual(efectoproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEfectoProducto.productoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProducto=this.jInternalFrameDetalleFormEfectoProducto.productoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEfectoProducto.productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			this.jInternalFrameDetalleFormEfectoProducto.productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(EfectoProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEfectoProducto.productoSessionBean.setisBusquedaDesdeForeignKeySesionEfectoProducto(true);
			this.jInternalFrameDetalleFormEfectoProducto.productoSessionBean.setlidEfectoProductoActual(this.idEfectoProductoActual);

			efectoproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEfectoProducto(true);
			efectoproductoSessionBean.setlIdEfectoProductoActualForeignKey(this.idEfectoProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionEfectoProductoParaParametroInventarioDefectos() throws Exception {
		Boolean isPaginaPopupParametroInventarioDefecto=false;

		try {

			if(this.efectoproductoSessionBean==null) {
				this.efectoproductoSessionBean=new EfectoProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoSessionBean==null) {
				this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoSessionBean.setsPathNavegacionActual(efectoproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroInventarioDefecto=this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(true);
			this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(EfectoProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionEfectoProducto(true);
			this.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoSessionBean.setlidEfectoProductoActual(this.idEfectoProductoActual);

			efectoproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEfectoProducto(true);
			efectoproductoSessionBean.setlIdEfectoProductoActualForeignKey(this.idEfectoProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EfectoProductoSessionBean efectoproductoSessionBean=new EfectoProductoSessionBean();
		
		if(this.efectoproductoSessionBean==null) {
			this.efectoproductoSessionBean=new EfectoProductoSessionBean();
		}
		
		this.efectoproductoSessionBean.setsUltimaBusquedaEfectoProducto(this.getsAccionBusqueda());
		this.efectoproductoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.efectoproductoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			efectoproductoSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			efectoproductoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			efectoproductoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoProducto")) {
			efectoproductoSessionBean.setid_tipo_producto(this.getid_tipo_productoFK_IdTipoProducto());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EfectoProductoSessionBean efectoproductoSessionBean=new EfectoProductoSessionBean();
		
		if(this.efectoproductoSessionBean==null) {
			this.efectoproductoSessionBean=new EfectoProductoSessionBean();
		}
		
		if(this.efectoproductoSessionBean.getsUltimaBusquedaEfectoProducto()!=null&&!this.efectoproductoSessionBean.getsUltimaBusquedaEfectoProducto().equals("")) {
			this.setsAccionBusqueda(efectoproductoSessionBean.getsUltimaBusquedaEfectoProducto());
			this.setiNumeroPaginacion(efectoproductoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(efectoproductoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(efectoproductoSessionBean.getcodigo());
				efectoproductoSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(efectoproductoSessionBean.getnombre());
				efectoproductoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(efectoproductoSessionBean.getid_empresa());
				efectoproductoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoProducto")) {
				this.setid_tipo_productoFK_IdTipoProducto(efectoproductoSessionBean.getid_tipo_producto());
				efectoproductoSessionBean.setid_tipo_producto(-1L);
			}
		}
		
		this.efectoproductoSessionBean.setsUltimaBusquedaEfectoProducto("");
		this.efectoproductoSessionBean.setiNumeroPaginacion(EfectoProductoConstantesFunciones.INUMEROPAGINACION);
		this.efectoproductoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEfectoProducto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEfectoProducto() {
		this.updateBorderResaltarBusquedasFormularioEfectoProducto();
		this.updateVisibilidadBusquedasFormularioEfectoProducto();
		this.updateHabilitarBusquedasFormularioEfectoProducto();
	}
	
	public void updateBorderResaltarBusquedasFormularioEfectoProducto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEfectoProducto.getComponents().length>0) {
	

		if(this.efectoproductoConstantesFunciones.resaltarBusquedaPorCodigoEfectoProducto!=null) {
			index= this.jTabbedPaneBusquedasEfectoProducto.indexOfComponent(this.jPanelBusquedaPorCodigoEfectoProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEfectoProducto.getComponent(index);
				jPanel.setBorder(this.efectoproductoConstantesFunciones.resaltarBusquedaPorCodigoEfectoProducto);
			}
		}

		if(this.efectoproductoConstantesFunciones.resaltarBusquedaPorNombreEfectoProducto!=null) {
			index= this.jTabbedPaneBusquedasEfectoProducto.indexOfComponent(this.jPanelBusquedaPorNombreEfectoProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEfectoProducto.getComponent(index);
				jPanel.setBorder(this.efectoproductoConstantesFunciones.resaltarBusquedaPorNombreEfectoProducto);
			}
		}

		if(this.efectoproductoConstantesFunciones.resaltarFK_IdTipoProductoEfectoProducto!=null) {
			index= this.jTabbedPaneBusquedasEfectoProducto.indexOfComponent(this.jPanelFK_IdTipoProductoEfectoProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEfectoProducto.getComponent(index);
				jPanel.setBorder(this.efectoproductoConstantesFunciones.resaltarFK_IdTipoProductoEfectoProducto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEfectoProducto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEfectoProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEfectoProducto.indexOfComponent(this.jPanelBusquedaPorCodigoEfectoProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEfectoProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.efectoproductoConstantesFunciones.mostrarBusquedaPorCodigoEfectoProducto);
			if(!this.efectoproductoConstantesFunciones.mostrarBusquedaPorCodigoEfectoProducto && index>-1) {
				this.jTabbedPaneBusquedasEfectoProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasEfectoProducto.indexOfComponent(this.jPanelBusquedaPorNombreEfectoProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEfectoProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.efectoproductoConstantesFunciones.mostrarBusquedaPorNombreEfectoProducto);
			if(!this.efectoproductoConstantesFunciones.mostrarBusquedaPorNombreEfectoProducto && index>-1) {
				this.jTabbedPaneBusquedasEfectoProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasEfectoProducto.indexOfComponent(this.jPanelFK_IdTipoProductoEfectoProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEfectoProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.efectoproductoConstantesFunciones.mostrarFK_IdTipoProductoEfectoProducto);
			if(!this.efectoproductoConstantesFunciones.mostrarFK_IdTipoProductoEfectoProducto && index>-1) {
				this.jTabbedPaneBusquedasEfectoProducto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEfectoProducto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEfectoProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEfectoProducto.indexOfComponent(this.jPanelBusquedaPorCodigoEfectoProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEfectoProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.efectoproductoConstantesFunciones.activarBusquedaPorCodigoEfectoProducto);
				this.jTabbedPaneBusquedasEfectoProducto.setEnabledAt(index,this.efectoproductoConstantesFunciones.activarBusquedaPorCodigoEfectoProducto);
			}

			index= this.jTabbedPaneBusquedasEfectoProducto.indexOfComponent(this.jPanelBusquedaPorNombreEfectoProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEfectoProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.efectoproductoConstantesFunciones.activarBusquedaPorNombreEfectoProducto);
				this.jTabbedPaneBusquedasEfectoProducto.setEnabledAt(index,this.efectoproductoConstantesFunciones.activarBusquedaPorNombreEfectoProducto);
			}

			index= this.jTabbedPaneBusquedasEfectoProducto.indexOfComponent(this.jPanelFK_IdTipoProductoEfectoProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEfectoProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.efectoproductoConstantesFunciones.activarFK_IdTipoProductoEfectoProducto);
				this.jTabbedPaneBusquedasEfectoProducto.setEnabledAt(index,this.efectoproductoConstantesFunciones.activarFK_IdTipoProductoEfectoProducto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEfectoProducto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasEfectoProducto.indexOfComponent(this.jPanelBusquedaPorCodigoEfectoProducto);

			this.jTabbedPaneBusquedasEfectoProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEfectoProducto.getComponent(index);

			this.efectoproductoConstantesFunciones.setResaltarBusquedaPorCodigoEfectoProducto(resaltar);

			jPanel.setBorder(this.efectoproductoConstantesFunciones.resaltarBusquedaPorCodigoEfectoProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasEfectoProducto.indexOfComponent(this.jPanelBusquedaPorNombreEfectoProducto);

			this.jTabbedPaneBusquedasEfectoProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEfectoProducto.getComponent(index);

			this.efectoproductoConstantesFunciones.setResaltarBusquedaPorNombreEfectoProducto(resaltar);

			jPanel.setBorder(this.efectoproductoConstantesFunciones.resaltarBusquedaPorNombreEfectoProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoProducto")) {
			index= this.jTabbedPaneBusquedasEfectoProducto.indexOfComponent(this.jPanelFK_IdTipoProductoEfectoProducto);

			this.jTabbedPaneBusquedasEfectoProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEfectoProducto.getComponent(index);

			this.efectoproductoConstantesFunciones.setResaltarFK_IdTipoProductoEfectoProducto(resaltar);

			jPanel.setBorder(this.efectoproductoConstantesFunciones.resaltarFK_IdTipoProductoEfectoProducto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEfectoProducto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEfectoProducto() throws Exception {

		if(this.jInternalFrameDetalleFormEfectoProducto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEfectoProducto();
		this.updateVisibilidadResaltarControlesFormularioEfectoProducto();
		this.updateHabilitarResaltarControlesFormularioEfectoProducto();
		
	}
	
	public void updateBorderResaltarControlesFormularioEfectoProducto() throws Exception {
		if(this.jInternalFrameDetalleFormEfectoProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.efectoproductoConstantesFunciones.resaltaridEfectoProducto!=null && this.jInternalFrameDetalleFormEfectoProducto!=null) {this.jInternalFrameDetalleFormEfectoProducto.jLabelidEfectoProducto.setBorder(this.efectoproductoConstantesFunciones.resaltaridEfectoProducto);}
		if(this.efectoproductoConstantesFunciones.resaltarid_empresaEfectoProducto!=null && this.jInternalFrameDetalleFormEfectoProducto!=null) {this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_empresaEfectoProducto.setBorder(this.efectoproductoConstantesFunciones.resaltarid_empresaEfectoProducto);}
		if(this.efectoproductoConstantesFunciones.resaltarid_tipo_productoEfectoProducto!=null && this.jInternalFrameDetalleFormEfectoProducto!=null) {this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_tipo_productoEfectoProducto.setBorder(this.efectoproductoConstantesFunciones.resaltarid_tipo_productoEfectoProducto);}
		if(this.efectoproductoConstantesFunciones.resaltarcodigoEfectoProducto!=null && this.jInternalFrameDetalleFormEfectoProducto!=null) {this.jInternalFrameDetalleFormEfectoProducto.jTextFieldcodigoEfectoProducto.setBorder(this.efectoproductoConstantesFunciones.resaltarcodigoEfectoProducto);}
		if(this.efectoproductoConstantesFunciones.resaltarnombreEfectoProducto!=null && this.jInternalFrameDetalleFormEfectoProducto!=null) {this.jInternalFrameDetalleFormEfectoProducto.jTextAreanombreEfectoProducto.setBorder(this.efectoproductoConstantesFunciones.resaltarnombreEfectoProducto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEfectoProducto() throws Exception {		
		if(this.jInternalFrameDetalleFormEfectoProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
	
		//this.jInternalFrameDetalleFormEfectoProducto.jLabelidEfectoProducto.setVisible(this.efectoproductoConstantesFunciones.mostraridEfectoProducto);
		this.jInternalFrameDetalleFormEfectoProducto.jPanelidEfectoProducto.setVisible(this.efectoproductoConstantesFunciones.mostraridEfectoProducto);
		//this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_empresaEfectoProducto.setVisible(this.efectoproductoConstantesFunciones.mostrarid_empresaEfectoProducto);
		this.jInternalFrameDetalleFormEfectoProducto.jPanelid_empresaEfectoProducto.setVisible(this.efectoproductoConstantesFunciones.mostrarid_empresaEfectoProducto);
		//this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_tipo_productoEfectoProducto.setVisible(this.efectoproductoConstantesFunciones.mostrarid_tipo_productoEfectoProducto);
		this.jInternalFrameDetalleFormEfectoProducto.jPanelid_tipo_productoEfectoProducto.setVisible(this.efectoproductoConstantesFunciones.mostrarid_tipo_productoEfectoProducto);
		//this.jInternalFrameDetalleFormEfectoProducto.jTextFieldcodigoEfectoProducto.setVisible(this.efectoproductoConstantesFunciones.mostrarcodigoEfectoProducto);
		this.jInternalFrameDetalleFormEfectoProducto.jPanelcodigoEfectoProducto.setVisible(this.efectoproductoConstantesFunciones.mostrarcodigoEfectoProducto);
		//this.jInternalFrameDetalleFormEfectoProducto.jTextAreanombreEfectoProducto.setVisible(this.efectoproductoConstantesFunciones.mostrarnombreEfectoProducto);
		this.jInternalFrameDetalleFormEfectoProducto.jPanelnombreEfectoProducto.setVisible(this.efectoproductoConstantesFunciones.mostrarnombreEfectoProducto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEfectoProducto() throws Exception {
		if(this.jInternalFrameDetalleFormEfectoProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEfectoProducto!=null) {
	
		this.jInternalFrameDetalleFormEfectoProducto.jLabelidEfectoProducto.setEnabled(this.efectoproductoConstantesFunciones.activaridEfectoProducto);
		this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_empresaEfectoProducto.setEnabled(this.efectoproductoConstantesFunciones.activarid_empresaEfectoProducto);
		this.jInternalFrameDetalleFormEfectoProducto.jComboBoxid_tipo_productoEfectoProducto.setEnabled(this.efectoproductoConstantesFunciones.activarid_tipo_productoEfectoProducto);
		this.jInternalFrameDetalleFormEfectoProducto.jTextFieldcodigoEfectoProducto.setEnabled(this.efectoproductoConstantesFunciones.activarcodigoEfectoProducto);
		this.jInternalFrameDetalleFormEfectoProducto.jTextAreanombreEfectoProducto.setEnabled(this.efectoproductoConstantesFunciones.activarnombreEfectoProducto);
		}
	}
	
		
}