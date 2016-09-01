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

import com.bydan.erp.inventario.util.SegmentoProductoConstantesFunciones;
import com.bydan.erp.inventario.util.SegmentoProductoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.SegmentoProductoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.SegmentoProductoBean;
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
public class SegmentoProductoBeanSwingJInternalFrame extends SegmentoProductoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SegmentoProductoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<SegmentoProducto> segmentoproductoValidator = new ClassValidator<SegmentoProducto>(SegmentoProducto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public SegmentoProducto segmentoproducto;	
	public SegmentoProducto segmentoproductoAux;
	public SegmentoProducto segmentoproductoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public SegmentoProducto segmentoproductoTotales;
	public Long idSegmentoProductoActual;
	public Long iIdNuevoSegmentoProducto=0L;
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
	
	public Boolean isPermisoTodoSegmentoProducto;
	public Boolean isPermisoNuevoSegmentoProducto;
	public Boolean isPermisoActualizarSegmentoProducto;
	public Boolean isPermisoActualizarOriginalSegmentoProducto;
	public Boolean isPermisoEliminarSegmentoProducto;
	public Boolean isPermisoGuardarCambiosSegmentoProducto;
	public Boolean isPermisoConsultaSegmentoProducto;
	public Boolean isPermisoBusquedaSegmentoProducto;
	public Boolean isPermisoReporteSegmentoProducto;
	public Boolean isPermisoPaginacionMedioSegmentoProducto;
	public Boolean isPermisoPaginacionAltoSegmentoProducto;
	public Boolean isPermisoPaginacionTodoSegmentoProducto;
	public Boolean isPermisoCopiarSegmentoProducto;
	public Boolean isPermisoVerFormSegmentoProducto;
	public Boolean isPermisoDuplicarSegmentoProducto;
	public Boolean isPermisoOrdenSegmentoProducto;
	
	
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
	
	public SegmentoProductoParameterReturnGeneral segmentoproductoReturnGeneral;
	public SegmentoProductoParameterReturnGeneral segmentoproductoParameterGeneral;
	
	

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
	
	public Boolean isEsNuevoSegmentoProducto=false;
	public Boolean esParaAccionDesdeFormularioSegmentoProducto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SegmentoProductoSessionBeanAdditional segmentoproductoSessionBeanAdditional=null;
	
	public SegmentoProductoSessionBeanAdditional getSegmentoProductoSessionBeanAdditional() {
		return this.segmentoproductoSessionBeanAdditional;
	}
	
	public void setSegmentoProductoSessionBeanAdditional(SegmentoProductoSessionBeanAdditional segmentoproductoSessionBeanAdditional) {
		try {
			this.segmentoproductoSessionBeanAdditional=segmentoproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SegmentoProductoBeanSwingJInternalFrameAdditional segmentoproductoBeanSwingJInternalFrameAdditional=null;
	//public class SegmentoProductoBeanSwingJInternalFrame
	
	public SegmentoProductoBeanSwingJInternalFrameAdditional getSegmentoProductoBeanSwingJInternalFrameAdditional() {
		return this.segmentoproductoBeanSwingJInternalFrameAdditional;
	}
	
	public void setSegmentoProductoBeanSwingJInternalFrameAdditional(SegmentoProductoBeanSwingJInternalFrameAdditional segmentoproductoBeanSwingJInternalFrameAdditional) {
		try {
			this.segmentoproductoBeanSwingJInternalFrameAdditional=segmentoproductoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SegmentoProductoLogic segmentoproductoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public SegmentoProducto segmentoproductoBean;
	public SegmentoProductoConstantesFunciones segmentoproductoConstantesFunciones;
	//public SegmentoProductoParameterReturnGeneral segmentoproductoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoProductoLogic tipoproductoLogic;
	
	//PARAMETROS
	
	
	//public List<SegmentoProducto> segmentoproductos;	
	//public List<SegmentoProducto> segmentoproductosEliminados;
	//public List<SegmentoProducto> segmentoproductosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSegmentoProducto=false;
	public Boolean isVisibilidadCeldaDuplicarSegmentoProducto=true;
	public Boolean isVisibilidadCeldaCopiarSegmentoProducto=true;
	public Boolean isVisibilidadCeldaVerFormSegmentoProducto=true;
	public Boolean isVisibilidadCeldaOrdenSegmentoProducto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSegmentoProducto=false;
	public Boolean isVisibilidadCeldaModificarSegmentoProducto=false;
	public Boolean isVisibilidadCeldaActualizarSegmentoProducto=false;
	public Boolean isVisibilidadCeldaEliminarSegmentoProducto=false;
	public Boolean isVisibilidadCeldaCancelarSegmentoProducto=false;
	public Boolean isVisibilidadCeldaGuardarSegmentoProducto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSegmentoProducto=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoProducto=false;
	
	public Long getiIdNuevoSegmentoProducto() {
		return this.iIdNuevoSegmentoProducto;
	}

	public void setiIdNuevoSegmentoProducto(Long iIdNuevoSegmentoProducto) {
		this.iIdNuevoSegmentoProducto = iIdNuevoSegmentoProducto;
	}
	
	public Long getidSegmentoProductoActual() {
		return this.idSegmentoProductoActual;
	}

	public void setidSegmentoProductoActual(Long idSegmentoProductoActual) {
		this.idSegmentoProductoActual = idSegmentoProductoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public SegmentoProducto getsegmentoproducto() {
		return this.segmentoproducto;
	}

	public void setsegmentoproducto(SegmentoProducto segmentoproducto) {
		this.segmentoproducto = segmentoproducto;
	}
	
	public SegmentoProducto getsegmentoproductoAux() {
		return this.segmentoproductoAux;
	}

	public void setsegmentoproductoAux(SegmentoProducto segmentoproductoAux) {
		this.segmentoproductoAux = segmentoproductoAux;
	}				
	
	public SegmentoProducto getsegmentoproductoAnterior() {
		return this.segmentoproductoAnterior;
	}

	public void setsegmentoproductoAnterior(SegmentoProducto segmentoproductoAnterior) {
		this.segmentoproductoAnterior = segmentoproductoAnterior;
	}	
	
	public SegmentoProducto getsegmentoproductoTotales() {
		return this.segmentoproductoTotales;
	}

	public void setsegmentoproductoTotales(SegmentoProducto segmentoproductoTotales) {
		this.segmentoproductoTotales = segmentoproductoTotales;
	}	
	
	public SegmentoProducto getsegmentoproductoBean() {
		return this.segmentoproductoBean;
	}

	public void setsegmentoproductoBean(SegmentoProducto segmentoproductoBean) {
		this.segmentoproductoBean = segmentoproductoBean;
	}	
	
	public SegmentoProductoParameterReturnGeneral getsegmentoproductoReturnGeneral() {
		return this.segmentoproductoReturnGeneral;
	}

	public void setsegmentoproductoReturnGeneral(SegmentoProductoParameterReturnGeneral segmentoproductoReturnGeneral) {
		this.segmentoproductoReturnGeneral = segmentoproductoReturnGeneral;
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
	
	
	public SegmentoProductoLogic getSegmentoProductoLogic()	{		
		return segmentoproductoLogic;
	}

	public void setSegmentoProductoLogic(SegmentoProductoLogic segmentoproductoLogic) {
		this.segmentoproductoLogic = segmentoproductoLogic;
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
	
	public Boolean getIsEsNuevoSegmentoProducto() {
		return isEsNuevoSegmentoProducto;
	}

	public void setIsEsNuevoSegmentoProducto(Boolean isEsNuevoSegmentoProducto) {
		this.isEsNuevoSegmentoProducto = isEsNuevoSegmentoProducto;
	}

	public Boolean getEsParaAccionDesdeFormularioSegmentoProducto() {
		return esParaAccionDesdeFormularioSegmentoProducto;
	}
	
	public void setEsParaAccionDesdeFormularioSegmentoProducto(Boolean esParaAccionDesdeFormularioSegmentoProducto) {
		this.esParaAccionDesdeFormularioSegmentoProducto = esParaAccionDesdeFormularioSegmentoProducto;
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

			if(this.segmentoproductoSessionBean==null) {
				this.segmentoproductoSessionBean=new SegmentoProductoSessionBean();
			}

			if(!this.segmentoproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(segmentoproductoSessionBean.getlidEmpresaActual());
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

			if(this.segmentoproductoSessionBean==null) {
				this.segmentoproductoSessionBean=new SegmentoProductoSessionBean();
			}

			if(!this.segmentoproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProducto()) {
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
					tipoproductoLogic.getEntityWithConnection(segmentoproductoSessionBean.getlidTipoProductoActual());
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

					if(this.segmentoproducto!=null) {
						this.segmentoproducto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
						this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_empresaSegmentoProducto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaSegmentoProducto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
						if(this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_empresaSegmentoProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_empresaSegmentoProducto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaSegmentoProductoGenerico)throws Exception
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
				jComboBoxid_empresaSegmentoProductoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaSegmentoProductoGenerico!=null && jComboBoxid_empresaSegmentoProductoGenerico.getItemCount()>0) {
					jComboBoxid_empresaSegmentoProductoGenerico.setSelectedIndex(0);
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

					if(this.segmentoproducto!=null) {
						this.segmentoproducto.setTipoProducto(tipoproductoTemp);
					}

					if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
						this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_tipo_productoSegmentoProducto.setSelectedItem(tipoproductoTemp);
					}
				} else {
					//jComboBoxid_tipo_productoSegmentoProducto.setSelectedItem(tipoproductoTemp);
					if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
						if(this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_tipo_productoSegmentoProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_tipo_productoSegmentoProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoproductoTemp!=null && jComboBoxid_tipo_productoFK_IdTipoProductoSegmentoProducto!=null) {
						jComboBoxid_tipo_productoFK_IdTipoProductoSegmentoProducto.setSelectedItem(tipoproductoTemp);
					} else {
						if(jComboBoxid_tipo_productoFK_IdTipoProductoSegmentoProducto!=null) {
							//jComboBoxid_tipo_productoFK_IdTipoProductoSegmentoProducto.setSelectedItem(tipoproductoTemp);
							if(jComboBoxid_tipo_productoFK_IdTipoProductoSegmentoProducto.getItemCount()>0) {
								jComboBoxid_tipo_productoFK_IdTipoProductoSegmentoProducto.setSelectedIndex(0);
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
	public void setActualTipoProductoForeignKeyGenerico(Long idTipoProductoSeleccionado,JComboBox jComboBoxid_tipo_productoSegmentoProductoGenerico)throws Exception
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
				jComboBoxid_tipo_productoSegmentoProductoGenerico.setSelectedItem(tipoproductoTemp);
			} else {
				if(jComboBoxid_tipo_productoSegmentoProductoGenerico!=null && jComboBoxid_tipo_productoSegmentoProductoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_productoSegmentoProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(SegmentoProducto segmentoproducto,JComboBox jComboBoxid_empresaSegmentoProductoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaSegmentoProductoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_empresaSegmentoProducto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaSegmentoProductoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				segmentoproducto.setid_empresa(empresaAux.getId());
				segmentoproducto.setempresa_descripcion(SegmentoProductoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				segmentoproducto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoProductoForeignKey(SegmentoProducto segmentoproducto,JComboBox jComboBoxid_tipo_productoSegmentoProductoGenerico)throws Exception
	{
		try
		{
			TipoProducto  tipoproductoAux=new TipoProducto();

			if(jComboBoxid_tipo_productoSegmentoProductoGenerico==null) {
				tipoproductoAux=(TipoProducto)this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_tipo_productoSegmentoProducto.getSelectedItem();
			} else {
				tipoproductoAux=(TipoProducto)jComboBoxid_tipo_productoSegmentoProductoGenerico.getSelectedItem();
			}

			if(tipoproductoAux!=null && tipoproductoAux.getId()!=null) {
				segmentoproducto.setid_tipo_producto(tipoproductoAux.getId());
				segmentoproducto.settipoproducto_descripcion(SegmentoProductoConstantesFunciones.getTipoProductoDescripcion(tipoproductoAux));
				segmentoproducto.setTipoProducto(tipoproductoAux);			}
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

					if(!SegmentoProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSegmentoProducto!=null) { 
							this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_empresaSegmentoProducto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_empresaSegmentoProducto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSegmentoProducto!=null) { 
					}

					if(!SegmentoProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SegmentoProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSegmentoProducto!=null) { 
							this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_tipo_productoSegmentoProducto.removeAllItems();

							for(TipoProducto tipoproducto:this.tipoproductosForeignKey) {
								this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_tipo_productoSegmentoProducto.addItem(tipoproducto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSegmentoProducto!=null) { 
					}

					if(!SegmentoProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SegmentoProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_productoFK_IdTipoProductoSegmentoProducto.removeAllItems();

							for(TipoProducto tipoproducto:this.tipoproductosForeignKey) {
								this.jComboBoxid_tipo_productoFK_IdTipoProductoSegmentoProducto.addItem(tipoproducto);
							}
						}

						if(!SegmentoProductoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
							this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_empresaSegmentoProducto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
							this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_empresaSegmentoProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
							this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_tipo_productoSegmentoProducto.setSelectedItem(tipoproducto);
						}
					} else {
						if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
							this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_tipo_productoSegmentoProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_productoFK_IdTipoProductoSegmentoProducto.setSelectedItem(tipoproducto);
						} else {
							this.jComboBoxid_tipo_productoFK_IdTipoProductoSegmentoProducto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesSegmentoProducto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			SegmentoProductoConstantesFunciones.refrescarForeignKeysDescripcionesSegmentoProducto(this.segmentoproductoLogic.getSegmentoProductos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			SegmentoProductoConstantesFunciones.refrescarForeignKeysDescripcionesSegmentoProducto(this.segmentoproductos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(TipoProducto.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//segmentoproductoLogic.setSegmentoProductos(this.segmentoproductos);
			segmentoproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public SegmentoProductoParameterReturnGeneral getSegmentoProductoParameterGeneral() {
		return this.segmentoproductoParameterGeneral;
	}
	
	public void setSegmentoProductoParameterGeneral(SegmentoProductoParameterReturnGeneral segmentoproductoParameterGeneral) {
		this.segmentoproductoParameterGeneral = segmentoproductoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSegmentoProducto() {
		return isPermisoTodoSegmentoProducto;
	}

	public void setIsPermisoTodoSegmentoProducto(Boolean isPermisoTodoSegmentoProducto) {
		this.isPermisoTodoSegmentoProducto = isPermisoTodoSegmentoProducto;
	}

	public Boolean getIsPermisoNuevoSegmentoProducto() {
		return isPermisoNuevoSegmentoProducto;
	}

	public void setIsPermisoNuevoSegmentoProducto(Boolean isPermisoNuevoSegmentoProducto) {
		this.isPermisoNuevoSegmentoProducto = isPermisoNuevoSegmentoProducto;
	}

	public Boolean getIsPermisoActualizarSegmentoProducto() {
		return isPermisoActualizarSegmentoProducto;
	}

	public void setIsPermisoActualizarSegmentoProducto(Boolean isPermisoActualizarSegmentoProducto) {
		this.isPermisoActualizarSegmentoProducto = isPermisoActualizarSegmentoProducto;
	}

	public Boolean getIsPermisoEliminarSegmentoProducto() {
		return isPermisoEliminarSegmentoProducto;
	}

	public void setIsPermisoEliminarSegmentoProducto(Boolean isPermisoEliminarSegmentoProducto) {
		this.isPermisoEliminarSegmentoProducto = isPermisoEliminarSegmentoProducto;
	}

	public Boolean getIsPermisoGuardarCambiosSegmentoProducto() {
		return isPermisoGuardarCambiosSegmentoProducto;
	}

	public void setIsPermisoGuardarCambiosSegmentoProducto(Boolean isPermisoGuardarCambiosSegmentoProducto) {
		this.isPermisoGuardarCambiosSegmentoProducto = isPermisoGuardarCambiosSegmentoProducto;
	}
	
	public Boolean getIsPermisoConsultaSegmentoProducto() {
		return isPermisoConsultaSegmentoProducto;
	}

	public void setIsPermisoConsultaSegmentoProducto(Boolean isPermisoConsultaSegmentoProducto) {
		this.isPermisoConsultaSegmentoProducto = isPermisoConsultaSegmentoProducto;
	}

	public Boolean getIsPermisoBusquedaSegmentoProducto() {
		return isPermisoBusquedaSegmentoProducto;
	}

	public void setIsPermisoBusquedaSegmentoProducto(Boolean isPermisoBusquedaSegmentoProducto) {
		this.isPermisoBusquedaSegmentoProducto = isPermisoBusquedaSegmentoProducto;
	}

	public Boolean getIsPermisoReporteSegmentoProducto() {
		return isPermisoReporteSegmentoProducto;
	}

	public void setIsPermisoReporteSegmentoProducto(Boolean isPermisoReporteSegmentoProducto) {
		this.isPermisoReporteSegmentoProducto = isPermisoReporteSegmentoProducto;
	}
	
	public Boolean getIsPermisoPaginacionMedioSegmentoProducto() {
		return isPermisoPaginacionMedioSegmentoProducto;
	}

	public void setIsPermisoPaginacionMedioSegmentoProducto(Boolean isPermisoPaginacionMedioSegmentoProducto) {
		this.isPermisoPaginacionMedioSegmentoProducto = isPermisoPaginacionMedioSegmentoProducto;
	}
	
	public Boolean getIsPermisoPaginacionTodoSegmentoProducto() {
		return isPermisoPaginacionTodoSegmentoProducto;
	}

	public void setIsPermisoPaginacionTodoSegmentoProducto(Boolean isPermisoPaginacionTodoSegmentoProducto) {
		this.isPermisoPaginacionTodoSegmentoProducto = isPermisoPaginacionTodoSegmentoProducto;
	}
	
	public Boolean getIsPermisoPaginacionAltoSegmentoProducto() {
		return isPermisoPaginacionAltoSegmentoProducto;
	}

	public void setIsPermisoPaginacionAltoSegmentoProducto(Boolean isPermisoPaginacionAltoSegmentoProducto) {
		this.isPermisoPaginacionAltoSegmentoProducto = isPermisoPaginacionAltoSegmentoProducto;
	}
	
	public Boolean getIsPermisoCopiarSegmentoProducto() {
		return isPermisoCopiarSegmentoProducto;
	}

	public void setIsPermisoCopiarSegmentoProducto(Boolean isPermisoCopiarSegmentoProducto) {
		this.isPermisoCopiarSegmentoProducto = isPermisoCopiarSegmentoProducto;
	}
	
	public Boolean getIsPermisoVerFormSegmentoProducto() {
		return isPermisoVerFormSegmentoProducto;
	}

	public void setIsPermisoVerFormSegmentoProducto(Boolean isPermisoVerFormSegmentoProducto) {
		this.isPermisoVerFormSegmentoProducto = isPermisoVerFormSegmentoProducto;
	}
	
	public Boolean getIsPermisoDuplicarSegmentoProducto() {
		return isPermisoDuplicarSegmentoProducto;
	}

	public void setIsPermisoDuplicarSegmentoProducto(Boolean isPermisoDuplicarSegmentoProducto) {
		this.isPermisoDuplicarSegmentoProducto = isPermisoDuplicarSegmentoProducto;
	}
	
	public Boolean getIsPermisoOrdenSegmentoProducto() {
		return isPermisoOrdenSegmentoProducto;
	}

	public void setIsPermisoOrdenSegmentoProducto(Boolean isPermisoOrdenSegmentoProducto) {
		this.isPermisoOrdenSegmentoProducto = isPermisoOrdenSegmentoProducto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSegmentoProducto() {
		return isVisibilidadCeldaNuevoSegmentoProducto;
	}

	public void setIsVisibilidadCeldaNuevoSegmentoProducto(Boolean isVisibilidadCeldaNuevoSegmentoProducto) {
		this.isVisibilidadCeldaNuevoSegmentoProducto = isVisibilidadCeldaNuevoSegmentoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSegmentoProducto() {
		return isVisibilidadCeldaDuplicarSegmentoProducto;
	}

	public void setIsVisibilidadCeldaDuplicarSegmentoProducto(Boolean isVisibilidadCeldaDuplicarSegmentoProducto) {
		this.isVisibilidadCeldaDuplicarSegmentoProducto = isVisibilidadCeldaDuplicarSegmentoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSegmentoProducto() {
		return isVisibilidadCeldaCopiarSegmentoProducto;
	}

	public void setIsVisibilidadCeldaCopiarSegmentoProducto(Boolean isVisibilidadCeldaCopiarSegmentoProducto) {
		this.isVisibilidadCeldaCopiarSegmentoProducto = isVisibilidadCeldaCopiarSegmentoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSegmentoProducto() {
		return isVisibilidadCeldaVerFormSegmentoProducto;
	}

	public void setIsVisibilidadCeldaVerFormSegmentoProducto(Boolean isVisibilidadCeldaVerFormSegmentoProducto) {
		this.isVisibilidadCeldaVerFormSegmentoProducto = isVisibilidadCeldaVerFormSegmentoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSegmentoProducto() {
		return isVisibilidadCeldaOrdenSegmentoProducto;
	}

	public void setIsVisibilidadCeldaOrdenSegmentoProducto(Boolean isVisibilidadCeldaOrdenSegmentoProducto) {
		this.isVisibilidadCeldaOrdenSegmentoProducto = isVisibilidadCeldaOrdenSegmentoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSegmentoProducto() {
		return isVisibilidadCeldaNuevoRelacionesSegmentoProducto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSegmentoProducto(Boolean isVisibilidadCeldaNuevoRelacionesSegmentoProducto) {
		this.isVisibilidadCeldaNuevoRelacionesSegmentoProducto = isVisibilidadCeldaNuevoRelacionesSegmentoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSegmentoProducto() {
		return isVisibilidadCeldaModificarSegmentoProducto;
	}

	public void setIsVisibilidadCeldaModificarSegmentoProducto(Boolean isVisibilidadCeldaModificarSegmentoProducto) {
		this.isVisibilidadCeldaModificarSegmentoProducto = isVisibilidadCeldaModificarSegmentoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSegmentoProducto() {
		return isVisibilidadCeldaActualizarSegmentoProducto;
	}

	public void setIsVisibilidadCeldaActualizarSegmentoProducto(Boolean isVisibilidadCeldaActualizarSegmentoProducto) {
		this.isVisibilidadCeldaActualizarSegmentoProducto = isVisibilidadCeldaActualizarSegmentoProducto;
	}

	public Boolean getIsVisibilidadCeldaEliminarSegmentoProducto() {
		return isVisibilidadCeldaEliminarSegmentoProducto;
	}

	public void setIsVisibilidadCeldaEliminarSegmentoProducto(Boolean isVisibilidadCeldaEliminarSegmentoProducto) {
		this.isVisibilidadCeldaEliminarSegmentoProducto = isVisibilidadCeldaEliminarSegmentoProducto;
	}

	public Boolean getIsVisibilidadCeldaCancelarSegmentoProducto() {
		return isVisibilidadCeldaCancelarSegmentoProducto;
	}

	public void setIsVisibilidadCeldaCancelarSegmentoProducto(Boolean isVisibilidadCeldaCancelarSegmentoProducto) {
		this.isVisibilidadCeldaCancelarSegmentoProducto = isVisibilidadCeldaCancelarSegmentoProducto;
	}

	public Boolean getIsVisibilidadCeldaGuardarSegmentoProducto() {
		return isVisibilidadCeldaGuardarSegmentoProducto;
	}

	public void setIsVisibilidadCeldaGuardarSegmentoProducto(Boolean isVisibilidadCeldaGuardarSegmentoProducto) {
		this.isVisibilidadCeldaGuardarSegmentoProducto = isVisibilidadCeldaGuardarSegmentoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSegmentoProducto() {
		return isVisibilidadCeldaGuardarCambiosSegmentoProducto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSegmentoProducto(Boolean isVisibilidadCeldaGuardarCambiosSegmentoProducto) {
		this.isVisibilidadCeldaGuardarCambiosSegmentoProducto = isVisibilidadCeldaGuardarCambiosSegmentoProducto;
	}
		
	public SegmentoProductoSessionBean getsegmentoproductoSessionBean() {
		return this.segmentoproductoSessionBean;
	}
	
	public void setsegmentoproductoSessionBean(SegmentoProductoSessionBean segmentoproductoSessionBean) {
		this.segmentoproductoSessionBean=segmentoproductoSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSegmentoProducto(SegmentoProducto segmentoproducto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(segmentoproducto,null);
				this.setActualParaGuardarTipoProductoForeignKey(segmentoproducto,null);
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
	
	public void bugActualizarReferenciaActual(SegmentoProducto segmentoproducto,SegmentoProducto segmentoproductoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSegmentoProducto(segmentoproducto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		segmentoproductoAux.setId(segmentoproducto.getId());
		segmentoproductoAux.setVersionRow(segmentoproducto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessSegmentoProducto();
		
			int intSelectedRow = this.jTableDatosSegmentoProducto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproducto =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.segmentoproducto =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(SegmentoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualSegmentoProducto(this.segmentoproducto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysSegmentoProducto(this.segmentoproducto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = segmentoproductoValidator.getInvalidValues(this.segmentoproducto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			segmentoproductoLogic.setDatosCliente(datosCliente);
			segmentoproductoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				segmentoproductoAux=new  SegmentoProducto();
				
				segmentoproductoAux.setIsNew(true);
				segmentoproductoAux.setIsChanged(true);
				
				segmentoproductoAux.setSegmentoProductoOriginal(this.segmentoproducto);
				
				segmentoproductoAux.setId(this.segmentoproducto.getId());	
				segmentoproductoAux.setVersionRow(this.segmentoproducto.getVersionRow());	
				segmentoproductoAux.setid_empresa(this.segmentoproducto.getid_empresa());	
				segmentoproductoAux.setid_tipo_producto(this.segmentoproducto.getid_tipo_producto());	
				segmentoproductoAux.setcodigo(this.segmentoproducto.getcodigo());	
				segmentoproductoAux.setnombre(this.segmentoproducto.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.segmentoproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.segmentoproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(segmentoproductoAux,segmentoproductoLogic.getSegmentoProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(segmentoproductoAux,segmentoproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.segmentoproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.segmentoproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						segmentoproductoLogic.saveSegmentoProductos();//WithConnection
						//segmentoproductoLogic.getSetVersionRowSegmentoProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.segmentoproducto,segmentoproductoAux);
					
					this.refrescarForeignKeysDescripcionesSegmentoProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.segmentoproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								segmentoproductoLogic.saveSegmentoProductoRelaciones(segmentoproductoAux,this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//segmentoproductoLogic.getSetVersionRowSegmentoProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.segmentoproducto,segmentoproductoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							segmentoproductoAux.setProductos(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							segmentoproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.segmentoproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.segmentoproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(segmentoproductoAux,segmentoproductoLogic.getSegmentoProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(segmentoproductoAux,segmentoproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.segmentoproducto,segmentoproductoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				segmentoproductoAux=new  SegmentoProducto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado() 
					|| (this.segmentoproductoSessionBean.getEsGuardarRelacionado() && this.segmentoproducto.getId()>=0)) {
						
					segmentoproductoAux.setIsNew(false);
				}
				
				segmentoproductoAux.setIsDeleted(false);
			
				segmentoproductoAux.setId(this.segmentoproducto.getId());	
				segmentoproductoAux.setVersionRow(this.segmentoproducto.getVersionRow());	
				segmentoproductoAux.setid_empresa(this.segmentoproducto.getid_empresa());	
				segmentoproductoAux.setid_tipo_producto(this.segmentoproducto.getid_tipo_producto());	
				segmentoproductoAux.setcodigo(this.segmentoproducto.getcodigo());	
				segmentoproductoAux.setnombre(this.segmentoproducto.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(segmentoproductoAux,segmentoproductoLogic.getSegmentoProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(segmentoproductoAux,segmentoproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.segmentoproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.segmentoproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						segmentoproductoLogic.saveSegmentoProductos();//WithConnection
						//segmentoproductoLogic.getSetVersionRowSegmentoProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.segmentoproducto,segmentoproductoAux);
					
					this.refrescarForeignKeysDescripcionesSegmentoProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.segmentoproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								segmentoproductoLogic.saveSegmentoProductoRelaciones(segmentoproductoAux,this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//segmentoproductoLogic.getSetVersionRowSegmentoProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.segmentoproducto,segmentoproductoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							segmentoproductoAux.setProductos(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							segmentoproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.segmentoproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.segmentoproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(segmentoproductoAux,segmentoproductoLogic.getSegmentoProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(segmentoproductoAux,segmentoproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.segmentoproducto,segmentoproductoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				segmentoproductoAux=new  SegmentoProducto();
				
				segmentoproductoAux.setIsNew(false);
				segmentoproductoAux.setIsChanged(false);
				
				segmentoproductoAux.setIsDeleted(true);
				
				segmentoproductoAux.setId(this.segmentoproducto.getId());	
				segmentoproductoAux.setVersionRow(this.segmentoproducto.getVersionRow());	
				segmentoproductoAux.setid_empresa(this.segmentoproducto.getid_empresa());	
				segmentoproductoAux.setid_tipo_producto(this.segmentoproducto.getid_tipo_producto());	
				segmentoproductoAux.setcodigo(this.segmentoproducto.getcodigo());	
				segmentoproductoAux.setnombre(this.segmentoproducto.getnombre());	
				
				if(this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.segmentoproductoAux.getId()>=0) {	
						this.segmentoproductosEliminados.add(segmentoproductoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(segmentoproductoAux,segmentoproductoLogic.getSegmentoProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(segmentoproductoAux,segmentoproductos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.segmentoproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.segmentoproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						segmentoproductoLogic.saveSegmentoProductos();//WithConnection
						//segmentoproductoLogic.getSetVersionRowSegmentoProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.segmentoproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								segmentoproductoLogic.saveSegmentoProductoRelaciones(segmentoproductoAux,this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//segmentoproductoLogic.getSetVersionRowSegmentoProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							segmentoproductoAux.setProductos(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							segmentoproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.segmentoproductoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.segmentoproductoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(segmentoproductoAux,segmentoproductoLogic.getSegmentoProductos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(segmentoproductoAux,segmentoproductos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.getSegmentoProductos().addAll(this.segmentoproductosEliminados);
					
					segmentoproductoLogic.saveSegmentoProductos();//WithConnection
					//segmentoproductoLogic.getSetVersionRowSegmentoProductos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesSegmentoProducto();
				
				this.segmentoproductosEliminados= new ArrayList<SegmentoProducto>();		
			}
			
			if(this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Segmento Producto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Segmento Producto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.segmentoproducto=segmentoproductoAux;
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
      		//this.finishProcessSegmentoProducto();
      	}
		
	}	
	
	public void actualizarRelaciones(SegmentoProducto segmentoproductoLocal) throws Exception {
		
		if(this.segmentoproductoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				segmentoproductoLocal.setProductos(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());
				segmentoproductoLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
			
			} else {
			
				segmentoproductoLocal.setProductos(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productos);
				segmentoproductoLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(SegmentoProducto segmentoproductoLocal) throws Exception {	
		if(this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				segmentoproductoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoProductoDetalleFormJInternalFrame.class)) {
				TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrameLocal=(TipoProductoBeanSwingJInternalFrame) ((TipoProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoproductoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoProducto(tipoproductoBeanSwingJInternalFrameLocal.gettipoproducto(),true);
				tipoproductoBeanSwingJInternalFrameLocal.actualizarLista(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto,this.tipoproductosForeignKey);

				tipoproductoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto);

				segmentoproductoLocal.setTipoProducto(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto);

				this.addItemDefectoCombosForeignKeyTipoProducto();
				this.cargarCombosFrameTipoProductosForeignKey("Formulario");
				this.setActualTipoProductoForeignKey(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarSegmentoProductoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSegmentoProducto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.segmentoproducto =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.segmentoproducto =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = segmentoproductoValidator.getInvalidValues(this.segmentoproducto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(SegmentoProducto segmentoproducto,List<SegmentoProducto> segmentoproductos) throws Exception {
		try	{		
			SegmentoProductoConstantesFunciones.actualizarLista(segmentoproducto,segmentoproductos,this.segmentoproductoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(SegmentoProducto segmentoproducto,List<SegmentoProducto> segmentoproductos) throws Exception {
		try	{			
			SegmentoProductoConstantesFunciones.actualizarSelectedLista(segmentoproducto,segmentoproductos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<SegmentoProducto> segmentoproductosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				segmentoproductosLocal=this.segmentoproductoLogic.getSegmentoProductos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				segmentoproductosLocal=this.segmentoproductos;
			}
			//ARCHITECTURE
		
			for(SegmentoProducto segmentoproductoLocal:segmentoproductosLocal) {
				if(this.permiteMantenimiento(segmentoproductoLocal) && segmentoproductoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SegmentoProductoConstantesFunciones.getSegmentoProductoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SegmentoProductoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSegmentoProducto.jLabelid_empresaSegmentoProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SegmentoProductoConstantesFunciones.IDTIPOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSegmentoProducto.jLabelid_tipo_productoSegmentoProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SegmentoProductoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSegmentoProducto.jLabelcodigoSegmentoProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SegmentoProductoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSegmentoProducto.jLabelnombreSegmentoProducto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSegmentoProducto.jLabelid_empresaSegmentoProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSegmentoProducto.jLabelid_tipo_productoSegmentoProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSegmentoProducto.jLabelcodigoSegmentoProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSegmentoProducto.jLabelnombreSegmentoProducto,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Producto")) {
			if(this.segmentoproducto==null) {
				this.segmentoproducto= new SegmentoProducto();
			}

			if(this.segmentoproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoSegmentoProducto
				this.setVariablesFormularioToObjetoActualSegmentoProducto(this.segmentoproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysSegmentoProducto(this.segmentoproducto);

				this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.getproducto().setSegmentoProducto(this.segmentoproducto);
			}

			return;
		}
		 else  if(sTipo.equals("ParametroInventarioDefecto")) {
			if(this.segmentoproducto==null) {
				this.segmentoproducto= new SegmentoProducto();
			}

			if(this.segmentoproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoSegmentoProducto
				this.setVariablesFormularioToObjetoActualSegmentoProducto(this.segmentoproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysSegmentoProducto(this.segmentoproducto);

				this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.getparametroinventariodefecto().setSegmentoProducto(this.segmentoproducto);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoSegmentoProducto--;	
		
		
		this.segmentoproductoAux=new SegmentoProducto();
		
		this.segmentoproductoAux.setId(this.iIdNuevoSegmentoProducto);
		this.segmentoproductoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.segmentoproductoLogic.getSegmentoProductos().add(this.segmentoproductoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.segmentoproductos.add(this.segmentoproductoAux);
		}
		//ARCHITECTURE
		
		this.segmentoproducto=this.segmentoproductoAux;
		
		if(SegmentoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSegmentoProducto(this.segmentoproducto);
			this.setVariablesObjetoActualToFormularioForeignKeySegmentoProducto(this.segmentoproducto);
		}
				
		//this.setDefaultControlesSegmentoProducto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySegmentoProducto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySegmentoProducto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySegmentoProducto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSegmentoProducto(this.segmentoproductoBean,this.segmentoproducto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSegmentoProducto(this.segmentoproducto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(SegmentoProductoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.segmentoproductoSessionBean.getConGuardarRelaciones()) {
			classes=SegmentoProductoConstantesFunciones.getClassesRelationshipsOfSegmentoProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.segmentoproductoReturnGeneral=segmentoproductoLogic.procesarEventosSegmentoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.segmentoproductoLogic.getSegmentoProductos(),this.segmentoproducto,this.segmentoproductoParameterGeneral,this.isEsNuevoSegmentoProducto,classes);//this.segmentoproductoLogic.getSegmentoProducto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSegmentoProducto(this.segmentoproductoReturnGeneral,this.segmentoproductoBean,false);
		
		if(this.segmentoproductoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySegmentoProducto(this.segmentoproductoReturnGeneral.getSegmentoProducto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSegmentoProducto(this.segmentoproductoReturnGeneral.getSegmentoProducto());
		}
		
		if(this.segmentoproductoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSegmentoProducto(this.segmentoproductoReturnGeneral.getSegmentoProducto(),classes);//this.segmentoproductoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSegmentoProducto(this.segmentoproducto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySegmentoProducto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySegmentoProducto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SegmentoProductoBeanSwingJInternalFrameAdditional.RecargarFormSegmentoProducto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSegmentoProducto(false);
						
			if(segmentoproductoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado() && ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(SegmentoProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSegmentoProducto();
			}
			
			this.actualizarVisualTableDatosSegmentoProducto();
			
			this.jTableDatosSegmentoProducto.setRowSelectionInterval(this.getIndiceNuevoSegmentoProducto(), this.getIndiceNuevoSegmentoProducto());
			
			this.seleccionarFilaTablaSegmentoProductoActual();
						
			this.actualizarEstadoCeldasBotonesSegmentoProducto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSegmentoProducto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSegmentoProducto.jTextFieldcodigoSegmentoProducto.setEnabled(isHabilitar && this.segmentoproductoConstantesFunciones.activarcodigoSegmentoProducto);
		this.jInternalFrameDetalleFormSegmentoProducto.jTextAreanombreSegmentoProducto.setEnabled(isHabilitar && this.segmentoproductoConstantesFunciones.activarnombreSegmentoProducto);	
		//
		this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_empresaSegmentoProducto.setEnabled(isHabilitar && this.segmentoproductoConstantesFunciones.activarid_empresaSegmentoProducto);
		this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_tipo_productoSegmentoProducto.setEnabled(isHabilitar && this.segmentoproductoConstantesFunciones.activarid_tipo_productoSegmentoProducto);
	};
	
	public void setDefaultControlesSegmentoProducto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSegmentoProducto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.segmentoproductoSessionBean.setConGuardarRelaciones(true);			
			this.segmentoproductoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSegmentoProducto.jTabbedPaneRelacionesSegmentoProducto.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.segmentoproductoSessionBean.setConGuardarRelaciones(false);			
			this.segmentoproductoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSegmentoProducto.jTabbedPaneRelacionesSegmentoProducto.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoSegmentoProducto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SegmentoProducto segmentoproductoAux:this.segmentoproductoLogic.getSegmentoProductos()) {
				if(segmentoproductoAux.getId().equals(this.iIdNuevoSegmentoProducto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SegmentoProducto segmentoproductoAux:this.segmentoproductos) {
				if(segmentoproductoAux.getId().equals(this.iIdNuevoSegmentoProducto)) {
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
	
	public int getIndiceActualSegmentoProducto(SegmentoProducto segmentoproducto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SegmentoProducto segmentoproductoAux:this.segmentoproductoLogic.getSegmentoProductos()) {
				if(segmentoproductoAux.getId().equals(segmentoproducto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SegmentoProducto segmentoproductoAux:this.segmentoproductos) {
				if(segmentoproductoAux.getId().equals(segmentoproducto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSegmentoProducto(SegmentoProducto segmentoproductoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SegmentoProducto segmentoproductoAux:this.segmentoproductoLogic.getSegmentoProductos()) {
				if(segmentoproductoAux.getSegmentoProductoOriginal().getId().equals(segmentoproductoOriginal.getId())) {
					existe=true;
					segmentoproductoOriginal.setId(segmentoproductoAux.getId());
					segmentoproductoOriginal.setVersionRow(segmentoproductoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SegmentoProducto segmentoproductoAux:this.segmentoproductos) {
				if(segmentoproductoAux.getSegmentoProductoOriginal().getId().equals(segmentoproductoOriginal.getId())) {
					existe=true;
					segmentoproductoOriginal.setId(segmentoproductoAux.getId());
					segmentoproductoOriginal.setVersionRow(segmentoproductoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSegmentoProducto(Boolean esParaCancelar) throws Exception {
		segmentoproductosAux=new ArrayList<SegmentoProducto>();
		segmentoproductoAux=new SegmentoProducto();
		
		if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SegmentoProducto segmentoproductoAux:this.segmentoproductoLogic.getSegmentoProductos()) {
					if(segmentoproductoAux.getId()<0) {
						segmentoproductosAux.add(segmentoproductoAux);
					}		
				}
				this.iIdNuevoSegmentoProducto=0L;
				this.segmentoproductoLogic.getSegmentoProductos().removeAll(segmentoproductosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SegmentoProducto segmentoproductoAux:this.segmentoproductos) {
					if(segmentoproductoAux.getId()<0) {
						segmentoproductosAux.add(segmentoproductoAux);
					}		
				}
				this.iIdNuevoSegmentoProducto=0L;
				this.segmentoproductos.removeAll(segmentoproductosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSegmentoProducto 
					&& this.segmentoproductoLogic.getSegmentoProductos().size()>0
					) {
					segmentoproductoAux=this.segmentoproductoLogic.getSegmentoProductos().get(this.segmentoproductoLogic.getSegmentoProductos().size() - 1);
				
					if(segmentoproductoAux.getId()<0) {
						this.segmentoproductoLogic.getSegmentoProductos().remove(segmentoproductoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSegmentoProducto && this.segmentoproductos.size()>0) {
					segmentoproductoAux=this.segmentoproductos.get(this.segmentoproductos.size() - 1);
				
					if(segmentoproductoAux.getId()<0) {
						this.segmentoproductos.remove(segmentoproductoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSegmentoProducto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(segmentoproducto.getId()<0) {
				this.segmentoproductoLogic.getSegmentoProductos().remove(this.segmentoproducto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(segmentoproducto.getId()<0) {
				this.segmentoproductos.remove(this.segmentoproducto);
			}
		}			
	}
	
	public void setEstadosInicialesSegmentoProducto(List<SegmentoProducto> segmentoproductosAux) throws Exception {
		SegmentoProductoConstantesFunciones.setEstadosInicialesSegmentoProducto(segmentoproductosAux);
	}
	
	public void setEstadosInicialesSegmentoProducto(SegmentoProducto segmentoproductoAux) throws Exception {
		SegmentoProductoConstantesFunciones.setEstadosInicialesSegmentoProducto(segmentoproductoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSegmentoProductoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSegmentoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSegmentoProductoActual()) {
				if(!this.isEsNuevoSegmentoProducto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSegmentoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSegmentoProducto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSegmentoProductoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Segmento Producto ?", "MANTENIMIENTO DE Segmento Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSegmentoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(SegmentoProducto segmentoproducto) throws Exception {
		SegmentoProductoConstantesFunciones.seleccionarAsignar(this.segmentoproducto,segmentoproducto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSegmentoProducto=this.isPermisoActualizarOriginalSegmentoProducto;
			
			
			this.seleccionarAsignar(segmentoproducto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SegmentoProductoConstantesFunciones.quitarEspaciosSegmentoProducto(this.segmentoproducto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesSegmentoProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.segmentoproductoSessionBean.setsFuncionBusquedaRapida(this.segmentoproductoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoSegmentoProducto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSegmentoProducto(esParaCancelar);				
				this.cancelarNuevoSegmentoProducto(esParaCancelar);								
			}
			
			this.segmentoproducto=new SegmentoProducto();
			
			this.inicializarSegmentoProducto();
			
			this.actualizarEstadoCeldasBotonesSegmentoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSegmentoProducto() throws Exception {
		try {
			SegmentoProductoConstantesFunciones.inicializarSegmentoProducto(this.segmentoproducto);
			
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
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.segmentoproductoLogic.getSegmentoProductos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSegmentoProductos(String sAccionBusqueda,List<SegmentoProducto> segmentoproductosParaReportes) throws Exception {
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
					sPathReporteFinal="SegmentoProducto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SegmentoProductoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SegmentoProductoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="SegmentoProducto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Segmento Productos");		
		parameters.put("busquedapor", SegmentoProductoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
					
					SegmentoProductoLogic segmentoproductoLogicAuxiliar=new SegmentoProductoLogic();
					segmentoproductoLogicAuxiliar.setDatosCliente(segmentoproductoLogic.getDatosCliente());				
					segmentoproductoLogicAuxiliar.setSegmentoProductos(segmentoproductosParaReportes);
					
					segmentoproductoLogicAuxiliar.cargarRelacionesLoteForeignKeySegmentoProductoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					segmentoproductosParaReportes=segmentoproductoLogicAuxiliar.getSegmentoProductos();
					
					//segmentoproductoLogic.getNewConnexionToDeep();
					
					//for (SegmentoProducto segmentoproducto:segmentoproductosParaReportes) {
					//	segmentoproductoLogic.deepLoad(segmentoproducto, false, DeepLoadType.INCLUDE, classes);
					//}						
					//segmentoproductoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//segmentoproductoLogic.closeNewConnexionToDeep();
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSegmentoProducto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SegmentoProductoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SegmentoProductoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSegmentoProducto=new JRBeanArrayDataSource(SegmentoProductoJInternalFrame.TraerSegmentoProductoBeans(segmentoproductosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSegmentoProducto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SegmentoProductoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SegmentoProductoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SegmentoProductoBean.TraerSegmentoProductoBeans(segmentoproductosParaReportes).toArray()));
							
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
				this.generarExcelReporteSegmentoProductos(sAccionBusqueda,sTipoArchivoReporte,segmentoproductosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSegmentoProductos(sAccionBusqueda,sTipoArchivoReporte,segmentoproductosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSegmentoProductoActionPerformed(null);
					//this.generarExcelReporteSegmentoProductos(sAccionBusqueda,sTipoArchivoReporte,segmentoproductosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSegmentoProductos(sAccionBusqueda,sTipoArchivoReporte,segmentoproductosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSegmentoProductos(sAccionBusqueda,sTipoArchivoReporte,segmentoproductosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSegmentoProductos(sAccionBusqueda,sTipoArchivoReporte,segmentoproductosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSegmentoProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<SegmentoProducto> segmentoproductosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"segmentoproducto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SegmentoProductos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSegmentoProducto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(SegmentoProducto segmentoproducto : segmentoproductosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SegmentoProductoConstantesFunciones.generarExcelReporteDataSegmentoProducto("NORMAL",row,workbook,segmentoproducto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Segmento Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSegmentoProducto(String sTipo,Row row,Workbook workbook) {
		
		SegmentoProductoConstantesFunciones.generarExcelReporteHeaderSegmentoProducto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSegmentoProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<SegmentoProducto> segmentoproductosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"segmentoproducto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SegmentoProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(SegmentoProducto segmentoproducto : segmentoproductosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SegmentoProductoConstantesFunciones.getSegmentoProductoDescripcion(segmentoproducto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SegmentoProductoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SegmentoProductoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(segmentoproducto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SegmentoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SegmentoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(segmentoproducto.gettipoproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SegmentoProductoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SegmentoProductoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(segmentoproducto.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SegmentoProductoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SegmentoProductoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(segmentoproducto.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Segmento Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSegmentoProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<SegmentoProducto> segmentoproductosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<SegmentoProducto> segmentoproductosRespaldo=null;
		
		classes=SegmentoProductoConstantesFunciones.getClassesRelationshipsOfSegmentoProducto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.segmentoproductoLogic.setDatosCliente(this.datosCliente);
		this.segmentoproductoLogic.setDatosDeep(this.datosDeep);
		this.segmentoproductoLogic.setIsConDeep(true);
		
		segmentoproductosRespaldo=this.segmentoproductoLogic.getSegmentoProductos();
		
		this.segmentoproductoLogic.setSegmentoProductos(segmentoproductosParaReportes);	
		this.segmentoproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		segmentoproductosParaReportes=this.segmentoproductoLogic.getSegmentoProductos();
		this.segmentoproductoLogic.setSegmentoProductos(segmentoproductosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"segmentoproducto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SegmentoProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSegmentoProducto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(SegmentoProducto segmentoproducto : segmentoproductosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSegmentoProducto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SegmentoProductoConstantesFunciones.generarExcelReporteDataSegmentoProducto("NORMAL",row,workbook,segmentoproducto,cellStyleDataAux);
		
			
			


				//Producto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoConstantesFunciones.SCLASSWEBTITULO))) {

				if(segmentoproducto.getProductos()!=null && segmentoproducto.getProductos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoConstantesFunciones.generarExcelReporteHeaderProducto("RELACIONADO",row,workbook);
				}

				if(segmentoproducto.getProductos()!=null) {
					i2=0;
					for(Producto producto : segmentoproducto.getProductos()) {
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

				if(segmentoproducto.getParametroInventarioDefectos()!=null && segmentoproducto.getParametroInventarioDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroInventarioDefectoConstantesFunciones.generarExcelReporteHeaderParametroInventarioDefecto("RELACIONADO",row,workbook);
				}

				if(segmentoproducto.getParametroInventarioDefectos()!=null) {
					i2=0;
					for(ParametroInventarioDefecto parametroinventariodefecto : segmentoproducto.getParametroInventarioDefectos()) {
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
		cell.setCellValue(SegmentoProductoConstantesFunciones.getSegmentoProductoDescripcion(segmentoproducto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Segmento Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSegmentoProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSegmentoProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSegmentoProducto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSegmentoProducto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSegmentoProducto() throws Exception {		
		this.startProcessSegmentoProducto(true);
	}
	
	public void startProcessSegmentoProducto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasSegmentoProducto ,this.jPanelParametrosReportesSegmentoProducto, this.jScrollPanelDatosSegmentoProducto,this.jPanelPaginacionSegmentoProducto, this.jScrollPanelDatosEdicionSegmentoProducto, this.jPanelAccionesSegmentoProducto,this.jPanelAccionesFormularioSegmentoProducto,this.jmenuBarSegmentoProducto,this.jmenuBarDetalleSegmentoProducto,this.jTtoolBarSegmentoProducto,this.jTtoolBarDetalleSegmentoProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasSegmentoProducto=this.jTabbedPaneBusquedasSegmentoProducto; 
		
		final JPanel jPanelParametrosReportesSegmentoProducto=this.jPanelParametrosReportesSegmentoProducto;
		//final JScrollPane jScrollPanelDatosSegmentoProducto=this.jScrollPanelDatosSegmentoProducto;
		final JTable jTableDatosSegmentoProducto=this.jTableDatosSegmentoProducto;		
		final JPanel jPanelPaginacionSegmentoProducto=this.jPanelPaginacionSegmentoProducto;
		//final JScrollPane jScrollPanelDatosEdicionSegmentoProducto=this.jScrollPanelDatosEdicionSegmentoProducto;
		final JPanel jPanelAccionesSegmentoProducto=this.jPanelAccionesSegmentoProducto;
		
		JPanel jPanelCamposAuxiliarSegmentoProducto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSegmentoProducto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
			jPanelCamposAuxiliarSegmentoProducto=this.jInternalFrameDetalleFormSegmentoProducto.jPanelCamposSegmentoProducto;
			jPanelAccionesFormularioAuxiliarSegmentoProducto=this.jInternalFrameDetalleFormSegmentoProducto.jPanelAccionesFormularioSegmentoProducto;
		}
		
		final JPanel jPanelCamposSegmentoProducto=jPanelCamposAuxiliarSegmentoProducto;
		final JPanel jPanelAccionesFormularioSegmentoProducto=jPanelAccionesFormularioAuxiliarSegmentoProducto;
		
		
		final JMenuBar jmenuBarSegmentoProducto=this.jmenuBarSegmentoProducto;
		final JToolBar jTtoolBarSegmentoProducto=this.jTtoolBarSegmentoProducto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSegmentoProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSegmentoProducto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
			jmenuBarDetalleAuxiliarSegmentoProducto=this.jInternalFrameDetalleFormSegmentoProducto.jmenuBarDetalleSegmentoProducto;
			jTtoolBarDetalleAuxiliarSegmentoProducto=this.jInternalFrameDetalleFormSegmentoProducto.jTtoolBarDetalleSegmentoProducto;
		}
		
		final JMenuBar jmenuBarDetalleSegmentoProducto=jmenuBarDetalleAuxiliarSegmentoProducto;
		final JToolBar jTtoolBarDetalleSegmentoProducto=jTtoolBarDetalleAuxiliarSegmentoProducto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSegmentoProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSegmentoProducto;
			processRunnable.jTableDatos=jTableDatosSegmentoProducto;
			processRunnable.jPanelCampos=jPanelCamposSegmentoProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionSegmentoProducto;
			processRunnable.jPanelAcciones=jPanelAccionesSegmentoProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSegmentoProducto;
			
			
			processRunnable.jmenuBar=jmenuBarSegmentoProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSegmentoProducto;
			processRunnable.jTtoolBar=jTtoolBarSegmentoProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSegmentoProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSegmentoProducto ,jPanelParametrosReportesSegmentoProducto,jTableDatosSegmentoProducto, /*jScrollPanelDatosSegmentoProducto,*/jPanelCamposSegmentoProducto,jPanelPaginacionSegmentoProducto, /*jScrollPanelDatosEdicionSegmentoProducto,*/ jPanelAccionesSegmentoProducto,jPanelAccionesFormularioSegmentoProducto,jmenuBarSegmentoProducto,jmenuBarDetalleSegmentoProducto,jTtoolBarSegmentoProducto,jTtoolBarDetalleSegmentoProducto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSegmentoProducto ,jPanelParametrosReportesSegmentoProducto, jScrollPanelDatosSegmentoProducto,jPanelPaginacionSegmentoProducto, jScrollPanelDatosEdicionSegmentoProducto, jPanelAccionesSegmentoProducto,jPanelAccionesFormularioSegmentoProducto,jmenuBarSegmentoProducto,jmenuBarDetalleSegmentoProducto,jTtoolBarSegmentoProducto,jTtoolBarDetalleSegmentoProducto);
						
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
	
	public void finishProcessSegmentoProducto() {// throws Exception 
		this.finishProcessSegmentoProducto(true);
	}
	
	public void finishProcessSegmentoProducto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasSegmentoProducto ,this.jPanelParametrosReportesSegmentoProducto, this.jScrollPanelDatosSegmentoProducto,this.jPanelPaginacionSegmentoProducto, this.jScrollPanelDatosEdicionSegmentoProducto, this.jPanelAccionesSegmentoProducto,this.jPanelAccionesFormularioSegmentoProducto,this.jmenuBarSegmentoProducto,this.jmenuBarDetalleSegmentoProducto,this.jTtoolBarSegmentoProducto,this.jTtoolBarDetalleSegmentoProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasSegmentoProducto=this.jTabbedPaneBusquedasSegmentoProducto; 
		
		final JPanel jPanelParametrosReportesSegmentoProducto=this.jPanelParametrosReportesSegmentoProducto;
		//final JScrollPane jScrollPanelDatosSegmentoProducto=this.jScrollPanelDatosSegmentoProducto;
		final JTable jTableDatosSegmentoProducto=this.jTableDatosSegmentoProducto;		
		final JPanel jPanelPaginacionSegmentoProducto=this.jPanelPaginacionSegmentoProducto;
		//final JScrollPane jScrollPanelDatosEdicionSegmentoProducto=this.jScrollPanelDatosEdicionSegmentoProducto;
		final JPanel jPanelAccionesSegmentoProducto=this.jPanelAccionesSegmentoProducto;
		
		JPanel jPanelCamposAuxiliarSegmentoProducto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSegmentoProducto=new JPanel();
		
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
			jPanelCamposAuxiliarSegmentoProducto=this.jInternalFrameDetalleFormSegmentoProducto.jPanelCamposSegmentoProducto;
			jPanelAccionesFormularioAuxiliarSegmentoProducto=this.jInternalFrameDetalleFormSegmentoProducto.jPanelAccionesFormularioSegmentoProducto;
		}
		
		final JPanel jPanelCamposSegmentoProducto=jPanelCamposAuxiliarSegmentoProducto;
		final JPanel jPanelAccionesFormularioSegmentoProducto=jPanelAccionesFormularioAuxiliarSegmentoProducto;
		
		
		final JMenuBar jmenuBarSegmentoProducto=this.jmenuBarSegmentoProducto;		
		final JToolBar jTtoolBarSegmentoProducto=this.jTtoolBarSegmentoProducto;
				
		JMenuBar jmenuBarDetalleAuxiliarSegmentoProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSegmentoProducto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
			jmenuBarDetalleAuxiliarSegmentoProducto=this.jInternalFrameDetalleFormSegmentoProducto.jmenuBarDetalleSegmentoProducto;
			jTtoolBarDetalleAuxiliarSegmentoProducto=this.jInternalFrameDetalleFormSegmentoProducto.jTtoolBarDetalleSegmentoProducto;		
		}
		
		final JMenuBar jmenuBarDetalleSegmentoProducto=jmenuBarDetalleAuxiliarSegmentoProducto;
		final JToolBar jTtoolBarDetalleSegmentoProducto=jTtoolBarDetalleAuxiliarSegmentoProducto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSegmentoProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSegmentoProducto;
			processRunnable.jTableDatos=jTableDatosSegmentoProducto;
			processRunnable.jPanelCampos=jPanelCamposSegmentoProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionSegmentoProducto;
			processRunnable.jPanelAcciones=jPanelAccionesSegmentoProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSegmentoProducto;
			
			
			processRunnable.jmenuBar=jmenuBarSegmentoProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSegmentoProducto;
			processRunnable.jTtoolBar=jTtoolBarSegmentoProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSegmentoProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSegmentoProducto ,jPanelParametrosReportesSegmentoProducto, jTableDatosSegmentoProducto,/*jScrollPanelDatosSegmentoProducto,*/jPanelCamposSegmentoProducto,jPanelPaginacionSegmentoProducto, /*jScrollPanelDatosEdicionSegmentoProducto,*/ jPanelAccionesSegmentoProducto,jPanelAccionesFormularioSegmentoProducto,jmenuBarSegmentoProducto,jmenuBarDetalleSegmentoProducto,jTtoolBarSegmentoProducto,jTtoolBarDetalleSegmentoProducto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSegmentoProducto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSegmentoProducto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSegmentoProducto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSegmentoProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSegmentoProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSegmentoProducto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSegmentoProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSegmentoProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSegmentoProducto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.segmentoproductoConstantesFunciones.getsFinalQuerySegmentoProducto();
		String  finalQueryPaginacionTodos=this.segmentoproductoConstantesFunciones.getsFinalQuerySegmentoProducto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SegmentoProductoConstantesFunciones.getArrayColumnasGlobalesNoSegmentoProducto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SegmentoProductoConstantesFunciones.getArrayColumnasGlobalesSegmentoProducto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SegmentoProductoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.segmentoproductosEliminados= new ArrayList<SegmentoProducto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSegmentoProducto();
		
				///*SegmentoProductoSessionBean*/this.segmentoproductoSessionBean=new SegmentoProductoSessionBean();
			
			if(this.segmentoproductoSessionBean==null) {
				this.segmentoproductoSessionBean=new SegmentoProductoSessionBean();
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
					this.iNumeroPaginacion=SegmentoProductoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SegmentoProductoConstantesFunciones.getClassesForeignKeysOfSegmentoProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/segmentoproducto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			segmentoproductosAux= new ArrayList<SegmentoProducto>();
			
				
			segmentoproductoLogic.setDatosCliente(this.datosCliente);
			segmentoproductoLogic.setDatosDeep(this.datosDeep);
			segmentoproductoLogic.setIsConDeep(true);
			
			
			segmentoproductoLogic.getSegmentoProductoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					segmentoproductoLogic.getTodosSegmentoProductos(finalQueryGlobal,pagination);
					
					//segmentoproductoLogic.getTodosSegmentoProductosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(segmentoproductoLogic.getSegmentoProductos()==null|| segmentoproductoLogic.getSegmentoProductos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							segmentoproductosAux= new ArrayList<SegmentoProducto>();
							segmentoproductosAux.addAll(segmentoproductoLogic.getSegmentoProductos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							segmentoproductosAux= new ArrayList<SegmentoProducto>();
							segmentoproductosAux.addAll(segmentoproductos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							segmentoproductoLogic.getTodosSegmentoProductos(finalQueryGlobal+"",this.pagination);												
							
							//segmentoproductoLogic.getTodosSegmentoProductosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteSegmentoProductos("Todos",segmentoproductoLogic.getSegmentoProductos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							segmentoproductoLogic.setSegmentoProductos(new ArrayList<SegmentoProducto>());					
							segmentoproductoLogic.getSegmentoProductos().addAll(segmentoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							segmentoproductos=new ArrayList<SegmentoProducto>();
							segmentoproductos.addAll(segmentoproductosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idSegmentoProducto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idSegmentoProducto=this.idActual;
				
				} else if(this.idSegmentoProductoActual!=null && this.idSegmentoProductoActual!=0L) {
					idSegmentoProducto=idSegmentoProductoActual;
				}
				
					
				this.sDetalleReporte=SegmentoProductoConstantesFunciones.getDetalleIndicePorId(idSegmentoProducto);
				
				this.segmentoproductos=new ArrayList<SegmentoProducto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					segmentoproductoLogic.getEntity(idSegmentoProducto);
					
					//segmentoproductoLogic.getEntityWithConnection(idSegmentoProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					segmentoproductoLogic.setSegmentoProductos(new ArrayList<SegmentoProducto>());
					segmentoproductoLogic.getSegmentoProductos().add(segmentoproductoLogic.getSegmentoProducto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.segmentoproductos=new ArrayList<SegmentoProducto>();
					this.segmentoproductos.add(segmentoproducto);
				}
				
				if(segmentoproductoLogic.getSegmentoProducto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=SegmentoProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					segmentoproductoLogic.getSegmentoProductosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SegmentoProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SegmentoProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=segmentoproductoLogic.getSegmentoProductos()==null||segmentoproductoLogic.getSegmentoProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=segmentoproductos==null|| segmentoproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						segmentoproductosAux=new ArrayList<SegmentoProducto>();
						segmentoproductosAux.addAll(segmentoproductoLogic.getSegmentoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							segmentoproductosAux=new ArrayList<SegmentoProducto>();
							segmentoproductosAux.addAll(segmentoproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							segmentoproductoLogic.getSegmentoProductosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SegmentoProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SegmentoProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSegmentoProductos("BusquedaPorCodigo",segmentoproductoLogic.getSegmentoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSegmentoProductos("BusquedaPorCodigo",segmentoproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						segmentoproductoLogic.setSegmentoProductos(new ArrayList<SegmentoProducto>());
						segmentoproductoLogic.getSegmentoProductos().addAll(segmentoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							segmentoproductos=new ArrayList<SegmentoProducto>();
							segmentoproductos.addAll(segmentoproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=SegmentoProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					segmentoproductoLogic.getSegmentoProductosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SegmentoProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SegmentoProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=segmentoproductoLogic.getSegmentoProductos()==null||segmentoproductoLogic.getSegmentoProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=segmentoproductos==null|| segmentoproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						segmentoproductosAux=new ArrayList<SegmentoProducto>();
						segmentoproductosAux.addAll(segmentoproductoLogic.getSegmentoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							segmentoproductosAux=new ArrayList<SegmentoProducto>();
							segmentoproductosAux.addAll(segmentoproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							segmentoproductoLogic.getSegmentoProductosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SegmentoProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SegmentoProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSegmentoProductos("BusquedaPorNombre",segmentoproductoLogic.getSegmentoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSegmentoProductos("BusquedaPorNombre",segmentoproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						segmentoproductoLogic.setSegmentoProductos(new ArrayList<SegmentoProducto>());
						segmentoproductoLogic.getSegmentoProductos().addAll(segmentoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							segmentoproductos=new ArrayList<SegmentoProducto>();
							segmentoproductos.addAll(segmentoproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=SegmentoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					segmentoproductoLogic.getSegmentoProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SegmentoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SegmentoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=segmentoproductoLogic.getSegmentoProductos()==null||segmentoproductoLogic.getSegmentoProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=segmentoproductos==null|| segmentoproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						segmentoproductosAux=new ArrayList<SegmentoProducto>();
						segmentoproductosAux.addAll(segmentoproductoLogic.getSegmentoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							segmentoproductosAux=new ArrayList<SegmentoProducto>();
							segmentoproductosAux.addAll(segmentoproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							segmentoproductoLogic.getSegmentoProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SegmentoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SegmentoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSegmentoProductos("FK_IdEmpresa",segmentoproductoLogic.getSegmentoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSegmentoProductos("FK_IdEmpresa",segmentoproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						segmentoproductoLogic.setSegmentoProductos(new ArrayList<SegmentoProducto>());
						segmentoproductoLogic.getSegmentoProductos().addAll(segmentoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							segmentoproductos=new ArrayList<SegmentoProducto>();
							segmentoproductos.addAll(segmentoproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoProducto")) {
				this.sDetalleReporte=SegmentoProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					segmentoproductoLogic.getSegmentoProductosFK_IdTipoProducto(finalQueryGlobal,pagination,id_tipo_productoFK_IdTipoProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SegmentoProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SegmentoProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=segmentoproductoLogic.getSegmentoProductos()==null||segmentoproductoLogic.getSegmentoProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=segmentoproductos==null|| segmentoproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						segmentoproductosAux=new ArrayList<SegmentoProducto>();
						segmentoproductosAux.addAll(segmentoproductoLogic.getSegmentoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							segmentoproductosAux=new ArrayList<SegmentoProducto>();
							segmentoproductosAux.addAll(segmentoproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							segmentoproductoLogic.getSegmentoProductosFK_IdTipoProducto(finalQueryGlobal,pagination,id_tipo_productoFK_IdTipoProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SegmentoProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SegmentoProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSegmentoProductos("FK_IdTipoProducto",segmentoproductoLogic.getSegmentoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSegmentoProductos("FK_IdTipoProducto",segmentoproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						segmentoproductoLogic.setSegmentoProductos(new ArrayList<SegmentoProducto>());
						segmentoproductoLogic.getSegmentoProductos().addAll(segmentoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							segmentoproductos=new ArrayList<SegmentoProducto>();
							segmentoproductos.addAll(segmentoproductosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSegmentoProducto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSegmentoProducto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=segmentoproductoLogic.getSegmentoProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=segmentoproductos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=segmentoproductoLogic.getSegmentoProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=segmentoproductos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(SegmentoProducto segmentoproducto) {
		Boolean permite=true;
		
		if(this.segmentoproducto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SegmentoProductoConstantesFunciones.getOrderByListaSegmentoProducto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SegmentoProductoConstantesFunciones.getOrderByListaSegmentoProducto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SegmentoProducto segmentoproducto:segmentoproductoLogic.getSegmentoProductos()) {
				if(segmentoproducto.getsType().equals(Constantes2.S_TOTALES)) {
					segmentoproductoTotales=segmentoproducto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SegmentoProducto segmentoproducto:this.segmentoproductos) {
				if(segmentoproducto.getsType().equals(Constantes2.S_TOTALES)) {
					segmentoproductoTotales=segmentoproducto;
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
			this.segmentoproductoAux=new SegmentoProducto();
			this.segmentoproductoAux.setsType(Constantes2.S_TOTALES);
			this.segmentoproductoAux.setIsNew(false);
			this.segmentoproductoAux.setIsChanged(false);
			this.segmentoproductoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				SegmentoProductoConstantesFunciones.TotalizarValoresFilaSegmentoProducto(this.segmentoproductoLogic.getSegmentoProductos(),this.segmentoproductoAux);
				
				this.segmentoproductoLogic.getSegmentoProductos().add(this.segmentoproductoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SegmentoProductoConstantesFunciones.TotalizarValoresFilaSegmentoProducto(this.segmentoproductos,this.segmentoproductoAux);
				
				this.segmentoproductos.add(this.segmentoproductoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		segmentoproductoTotales=new SegmentoProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.segmentoproductoLogic.getSegmentoProductos().remove(segmentoproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.segmentoproductos.remove(segmentoproductoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		segmentoproductoTotales=new SegmentoProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SegmentoProducto segmentoproducto:segmentoproductoLogic.getSegmentoProductos()) {
				if(segmentoproducto.getsType().equals(Constantes2.S_TOTALES)) {
					segmentoproductoTotales=segmentoproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SegmentoProductoConstantesFunciones.TotalizarValoresFilaSegmentoProducto(this.segmentoproductoLogic.getSegmentoProductos(),segmentoproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SegmentoProducto segmentoproducto:this.segmentoproductos) {
				if(segmentoproducto.getsType().equals(Constantes2.S_TOTALES)) {
					segmentoproductoTotales=segmentoproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SegmentoProductoConstantesFunciones.TotalizarValoresFilaSegmentoProducto(this.segmentoproductos,segmentoproductoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getSegmentoProductosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSegmentoProductosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSegmentoProductosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSegmentoProductosFK_IdTipoProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getSegmentoProductosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					segmentoproductoLogic.getSegmentoProductosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSegmentoProductosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					segmentoproductoLogic.getSegmentoProductosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSegmentoProductosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					segmentoproductoLogic.getSegmentoProductosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSegmentoProductosFK_IdTipoProducto(String sFinalQuery,Long id_tipo_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					segmentoproductoLogic.getSegmentoProductosFK_IdTipoProducto(sFinalQuery,this.pagination,id_tipo_producto);
				
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
	
	public void inicializarPermisosSegmentoProducto() {
		this.isPermisoTodoSegmentoProducto=false;
		this.isPermisoNuevoSegmentoProducto=false;
		this.isPermisoActualizarSegmentoProducto=false;
		this.isPermisoActualizarOriginalSegmentoProducto=false;
		this.isPermisoEliminarSegmentoProducto=false;
		this.isPermisoGuardarCambiosSegmentoProducto=false;
		this.isPermisoConsultaSegmentoProducto=false;
		this.isPermisoBusquedaSegmentoProducto=false;
		this.isPermisoReporteSegmentoProducto=false;		
		this.isPermisoOrdenSegmentoProducto=false;		
		this.isPermisoPaginacionMedioSegmentoProducto=false;		
		this.isPermisoPaginacionAltoSegmentoProducto=false;
		this.isPermisoPaginacionTodoSegmentoProducto=false;
		this.isPermisoCopiarSegmentoProducto=false;		
		this.isPermisoVerFormSegmentoProducto=false;		
		this.isPermisoDuplicarSegmentoProducto=false;		
		this.isPermisoOrdenSegmentoProducto=false;		
	}
	
	public void setPermisosUsuarioSegmentoProducto(Boolean isPermiso) {
		this.isPermisoTodoSegmentoProducto=isPermiso;
		this.isPermisoNuevoSegmentoProducto=isPermiso;
		this.isPermisoActualizarSegmentoProducto=isPermiso;
		this.isPermisoActualizarOriginalSegmentoProducto=isPermiso;
		this.isPermisoEliminarSegmentoProducto=isPermiso;
		this.isPermisoGuardarCambiosSegmentoProducto=isPermiso;
		this.isPermisoConsultaSegmentoProducto=isPermiso;
		this.isPermisoBusquedaSegmentoProducto=isPermiso;
		this.isPermisoReporteSegmentoProducto=isPermiso;
		this.isPermisoOrdenSegmentoProducto=isPermiso;		
		this.isPermisoPaginacionMedioSegmentoProducto=isPermiso;		
		this.isPermisoPaginacionAltoSegmentoProducto=isPermiso;		
		this.isPermisoPaginacionTodoSegmentoProducto=isPermiso;		
		this.isPermisoCopiarSegmentoProducto=isPermiso;		
		this.isPermisoVerFormSegmentoProducto=isPermiso;		
		this.isPermisoDuplicarSegmentoProducto=isPermiso;
		this.isPermisoOrdenSegmentoProducto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSegmentoProducto(Boolean isPermiso) {
		//this.isPermisoTodoSegmentoProducto=isPermiso;
		this.isPermisoNuevoSegmentoProducto=isPermiso;
		this.isPermisoActualizarSegmentoProducto=isPermiso;
		this.isPermisoActualizarOriginalSegmentoProducto=isPermiso;
		this.isPermisoEliminarSegmentoProducto=isPermiso;
		this.isPermisoGuardarCambiosSegmentoProducto=isPermiso;
		//this.isPermisoConsultaSegmentoProducto=isPermiso;
		//this.isPermisoBusquedaSegmentoProducto=isPermiso;
		//this.isPermisoReporteSegmentoProducto=isPermiso;
		//this.isPermisoOrdenSegmentoProducto=isPermiso;		
		//this.isPermisoPaginacionMedioSegmentoProducto=isPermiso;		
		//this.isPermisoPaginacionAltoSegmentoProducto=isPermiso;		
		//this.isPermisoPaginacionTodoSegmentoProducto=isPermiso;		
		//this.isPermisoCopiarSegmentoProducto=isPermiso;		
		//this.isPermisoDuplicarSegmentoProducto=isPermiso;
		//this.isPermisoOrdenSegmentoProducto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSegmentoProductoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ProductoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
		if(SegmentoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosProducto=this.verificarGetPermisosUsuarioOpcionSegmentoProductoClaseRelacionada(this.opcionsRelacionadas,ProductoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosParametroInventarioDefecto=false;
		this.isTienePermisosParametroInventarioDefecto=this.verificarGetPermisosUsuarioOpcionSegmentoProductoClaseRelacionada(this.opcionsRelacionadas,ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebSegmentoProducto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSegmentoProductoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosProducto=conPermiso;
		this.isTienePermisosParametroInventarioDefecto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioSegmentoProductoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSegmentoProductoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSegmentoProductoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosProducto && this.jInternalFrameDetalleFormSegmentoProducto!=null && this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormSegmentoProducto.jTabbedPaneRelacionesSegmentoProducto.remove(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosParametroInventarioDefecto && this.jInternalFrameDetalleFormSegmentoProducto!=null && this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormSegmentoProducto.jTabbedPaneRelacionesSegmentoProducto.remove(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioSegmentoProducto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SegmentoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SegmentoProductoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSegmentoProducto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSegmentoProducto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSegmentoProducto=this.isPermisoActualizarSegmentoProducto;
			this.isPermisoEliminarSegmentoProducto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSegmentoProducto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSegmentoProducto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSegmentoProducto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSegmentoProducto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSegmentoProducto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSegmentoProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSegmentoProducto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSegmentoProducto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSegmentoProducto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSegmentoProducto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSegmentoProducto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSegmentoProducto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSegmentoProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSegmentoProducto.setToolTipText(this.jTableDatosSegmentoProducto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSegmentoProducto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSegmentoProducto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SegmentoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SegmentoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSegmentoProducto() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosProducto && this.segmentoproductoConstantesFunciones.mostrarProductoSegmentoProducto && !SegmentoProductoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Producto");
			reporte.setsDescripcion("Producto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosParametroInventarioDefecto && this.segmentoproductoConstantesFunciones.mostrarParametroInventarioDefectoSegmentoProducto && !SegmentoProductoConstantesFunciones.ISGUARDARREL) {

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
	public void inicializarCombosForeignKeySegmentoProductoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tipoproductosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySegmentoProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SegmentoProductoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeySegmentoProductoListas(false);
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
	
	public void cargarCombosLoteForeignKeySegmentoProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			SegmentoProductoParameterReturnGeneral segmentoproductoReturnGeneral=new SegmentoProductoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.segmentoproductoConstantesFunciones.cargarid_empresaSegmentoProducto)
					 || (this.esRecargarFks && this.segmentoproductoConstantesFunciones.cargarid_empresaSegmentoProducto)) {

					if(!this.segmentoproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+segmentoproductoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTipoProducto="";

				if(((this.tipoproductosForeignKey==null||this.tipoproductosForeignKey.size()<=0) && this.segmentoproductoConstantesFunciones.cargarid_tipo_productoSegmentoProducto)
					 || (this.esRecargarFks && this.segmentoproductoConstantesFunciones.cargarid_tipo_productoSegmentoProducto)) {

					if(!this.segmentoproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoProductoConstantesFunciones.getArrayColumnasGlobalesTipoProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoProducto, "");
						finalQueryGlobalTipoProducto+=TipoProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoProducto=" WHERE " + ConstantesSql.ID + "="+segmentoproductoSessionBean.getlidTipoProductoActual();
					}
				} else {
					finalQueryGlobalTipoProducto="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				segmentoproductoReturnGeneral=segmentoproductoLogic.cargarCombosLoteForeignKeySegmentoProducto(finalQueryGlobalEmpresa,finalQueryGlobalTipoProducto);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=segmentoproductoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTipoProducto.equals("NONE")) {
				this.tipoproductosForeignKey=segmentoproductoReturnGeneral.gettipoproductosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeySegmentoProducto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoProducto();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.segmentoproductoSessionBean==null) {
				this.segmentoproductoSessionBean=new SegmentoProductoSessionBean();
			}

			if(!this.segmentoproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.segmentoproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProducto()) {
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
	
	public void initActionsCombosTodosForeignKeySegmentoProducto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySegmentoProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySegmentoProducto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySegmentoProducto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySegmentoProducto(SegmentoProducto segmentoproducto)throws Exception {	
		try {
			
			this.setActualTipoProductoForeignKey(segmentoproducto.getid_tipo_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySegmentoProducto(SegmentoProducto segmentoproducto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySegmentoProducto()throws Exception {	
		try {
			
			this.setActualTipoProductoForeignKey(this.segmentoproductoConstantesFunciones.getid_tipo_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySegmentoProducto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySegmentoProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySegmentoProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSegmentoProducto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySegmentoProducto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoProductosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySegmentoProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySegmentoProducto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_empresaSegmentoProducto!=null && this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_empresaSegmentoProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_empresaSegmentoProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_tipo_productoSegmentoProducto!=null && this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_tipo_productoSegmentoProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_tipo_productoSegmentoProducto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public SegmentoProductoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SegmentoProductoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SegmentoProductoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.segmentoproductoSessionBean=new SegmentoProductoSessionBean(); 
		this.segmentoproductoConstantesFunciones=new SegmentoProductoConstantesFunciones(); 
		this.segmentoproductoBean=new SegmentoProducto();//(this.segmentoproductoConstantesFunciones); 		
		this.segmentoproductoReturnGeneral=new SegmentoProductoParameterReturnGeneral(); 
		
		this.segmentoproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.segmentoproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SegmentoProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SegmentoProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SegmentoProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSegmentoProducto(true);
			
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
			
			this.segmentoproductoConstantesFunciones=new SegmentoProductoConstantesFunciones(); 
			this.segmentoproductoBean=new SegmentoProducto();//this.segmentoproductoConstantesFunciones); 			
			this.segmentoproductoReturnGeneral=new SegmentoProductoParameterReturnGeneral(); 
		
			SegmentoProductoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Segmento Producto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.segmentoproducto=new SegmentoProducto();
			this.segmentoproductos = new ArrayList<SegmentoProducto>();
			this.segmentoproductosAux = new ArrayList<SegmentoProducto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic=new SegmentoProductoLogic();
				this.segmentoproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.segmentoproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.segmentoproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSegmentoProducto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSegmentoProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSegmentoProducto);	
					}
					
					if(this.jInternalFrameImportacionSegmentoProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSegmentoProducto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySegmentoProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySegmentoProducto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSegmentoProducto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSegmentoProducto);
				this.jInternalFrameDetalleFormSegmentoProducto.setVisible(false);
				this.jInternalFrameDetalleFormSegmentoProducto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSegmentoProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSegmentoProducto);
					this.jInternalFrameReporteDinamicoSegmentoProducto.setVisible(false);
					this.jInternalFrameReporteDinamicoSegmentoProducto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSegmentoProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSegmentoProducto);
					this.jInternalFrameImportacionSegmentoProducto.setVisible(false);
					this.jInternalFrameImportacionSegmentoProducto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySegmentoProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySegmentoProducto);
					this.jInternalFrameOrderBySegmentoProducto.setVisible(false);
					this.jInternalFrameOrderBySegmentoProducto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSegmentoProductoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SegmentoProductoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.segmentoproductoReturnGeneral=new SegmentoProductoParameterReturnGeneral();
			
			this.segmentoproductoParameterGeneral=new SegmentoProductoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.segmentoproductoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SegmentoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ProductoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SegmentoProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.segmentoproductoSessionBean.getEsGuardarRelacionado(),this.segmentoproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SegmentoProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.segmentoproductoSessionBean.getEsGuardarRelacionado(),this.segmentoproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSegmentoProducto=false;
			this.isVisibilidadCeldaDuplicarSegmentoProducto=true;
			this.isVisibilidadCeldaCopiarSegmentoProducto=true;
			this.isVisibilidadCeldaVerFormSegmentoProducto=true;
			this.isVisibilidadCeldaOrdenSegmentoProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesSegmentoProducto=false;
			this.isVisibilidadCeldaModificarSegmentoProducto=false;
			this.isVisibilidadCeldaActualizarSegmentoProducto=false;
			this.isVisibilidadCeldaEliminarSegmentoProducto=false;
			this.isVisibilidadCeldaCancelarSegmentoProducto=false;
			this.isVisibilidadCeldaGuardarSegmentoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosSegmentoProducto=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoProducto=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSegmentoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSegmentoProducto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSegmentoProducto(false);
			
			this.setPermisosUsuarioSegmentoProducto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado() 
				|| (this.segmentoproductoSessionBean.getEsGuardarRelacionado() && this.segmentoproductoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSegmentoProductoClasesRelacionadas();
			}
			
			if(this.segmentoproductoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSegmentoProductoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SegmentoProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSegmentoProducto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSegmentoProducto();
			}
			
			if(!this.isPermisoBusquedaSegmentoProducto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasSegmentoProducto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioSegmentoProducto,this.isPermisoPaginacionMedioSegmentoProducto,this.isPermisoPaginacionTodoSegmentoProducto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SegmentoProductoConstantesFunciones.getTiposSeleccionarSegmentoProducto());
				
				this.tiposColumnasSelect=SegmentoProductoConstantesFunciones.getTiposSeleccionarSegmentoProducto(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectSegmentoProducto();				
				//this.tiposRelacionesSelect=SegmentoProductoConstantesFunciones.getTiposRelacionesSegmentoProducto(true);
				
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
			//if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSegmentoProducto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioSegmentoProducto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioSegmentoProducto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSegmentoProducto() ;
			
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
				segmentoproductoImplementable= (SegmentoProductoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SegmentoProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				segmentoproductoImplementableHome= (SegmentoProductoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SegmentoProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.segmentoproductos= new ArrayList<SegmentoProducto>();
			this.segmentoproductosEliminados= new ArrayList<SegmentoProducto>();
						
			this.isEsNuevoSegmentoProducto=false;
			this.esParaAccionDesdeFormularioSegmentoProducto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tipoproductosForeignKey=new ArrayList<TipoProducto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySegmentoProducto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSegmentoProducto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SegmentoProductoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SegmentoProductoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSegmentoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSegmentoProducto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSegmentoProducto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSegmentoProducto();
			}
			
			SegmentoProductoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasSegmentoProducto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasSegmentoProducto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasSegmentoProducto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSegmentoProducto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga SegmentoProducto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSegmentoProducto() {
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
			if(sTipo.equals("RelacionesSegmentoProducto")) {
				iIndex=this.jInternalFrameDetalleFormSegmentoProducto.jTabbedPaneRelacionesSegmentoProducto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSegmentoProducto.jTabbedPaneRelacionesSegmentoProducto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSegmentoProducto.getSelectedRow();	
				
				

				if(sTitle.equals("Parametro Inventario Defectos")) {
					if(!ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessSegmentoProducto();

						this.cargarParteTabPanelRelacionadaParametroInventarioDefecto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Productos")) {
					if(!ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessSegmentoProducto();

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
				this.finishProcessSegmentoProducto();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaParametroInventarioDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormSegmentoProducto.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(false,true,iIndex);
		this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();

		//this.jTabbedPaneRelacionesSegmentoProducto.updateUI();
		//this.jTabbedPaneRelacionesSegmentoProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesSegmentoProducto.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProducto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormSegmentoProducto.cargarSessionConBeanSwingJInternalFrameProducto(false,true,iIndex);
		this.jButtonProductoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProducto();

		//this.jTabbedPaneRelacionesSegmentoProducto.updateUI();
		//this.jTabbedPaneRelacionesSegmentoProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesSegmentoProducto.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Producto")) {
				int row=this.jTableDatosSegmentoProducto.getSelectedRow();
				jButtonProductoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ParametroInventarioDefecto")) {
				int row=this.jTableDatosSegmentoProducto.getSelectedRow();
				jButtonParametroInventarioDefectoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Producto")) {

					if(this.isTienePermisosProducto && this.segmentoproductoConstantesFunciones.mostrarProductoSegmentoProducto && !SegmentoProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Productos"+"("+ProductoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Productos");

						if(segmentoproductoConstantesFunciones.resaltarProductoSegmentoProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(segmentoproductoConstantesFunciones.resaltarProductoSegmentoProducto);
						}

						jmenuItem.setEnabled(this.segmentoproductoConstantesFunciones.activarProductoSegmentoProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Producto"));

						

						this.jInternalFrameDetalleFormSegmentoProducto.jmenuDetalleSegmentoProducto.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Parametro Inventario Defecto")) {

					if(this.isTienePermisosParametroInventarioDefecto && this.segmentoproductoConstantesFunciones.mostrarParametroInventarioDefectoSegmentoProducto && !SegmentoProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Inventario Defectos"+"("+ParametroInventarioDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Inventario Defectos");

						if(segmentoproductoConstantesFunciones.resaltarParametroInventarioDefectoSegmentoProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(segmentoproductoConstantesFunciones.resaltarParametroInventarioDefectoSegmentoProducto);
						}

						jmenuItem.setEnabled(this.segmentoproductoConstantesFunciones.activarParametroInventarioDefectoSegmentoProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroInventarioDefecto"));

						

						this.jInternalFrameDetalleFormSegmentoProducto.jmenuDetalleSegmentoProducto.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeySegmentoProducto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySegmentoProducto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySegmentoProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySegmentoProductoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySegmentoProducto();
		
		this.cargarCombosFrameForeignKeySegmentoProducto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySegmentoProducto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySegmentoProducto();
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
	
	public void jButtonNuevoSegmentoProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.segmentoproductoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSegmentoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
			
			
			if(jTableDatosSegmentoProducto.getRowCount()>=1) {
				jTableDatosSegmentoProducto.removeRowSelectionInterval(0, jTableDatosSegmentoProducto.getRowCount()-1);						
			}
			
			this.isEsNuevoSegmentoProducto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSegmentoProducto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSegmentoProducto(true);			
			//this.segmentoproducto=new SegmentoProducto();
			//this.segmentoproducto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSegmentoProducto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSegmentoProducto() ;
			
			if(SegmentoProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSegmentoProducto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.segmentoproducto);	
			this.actualizarInformacion("INFO_PADRE",false,this.segmentoproducto);				
			
			SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
			
			if(this.segmentoproductoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar SegmentoProducto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSegmentoProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<SegmentoProducto> segmentoproductosSeleccionados=new ArrayList<SegmentoProducto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSegmentoProducto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSegmentoProducto.getSelectedRows().length;			
			}
			
			segmentoproductosSeleccionados=this.getSegmentoProductosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSegmentoProducto--;			
				//SegmentoProducto segmentoproductoAux= new SegmentoProducto();			
				//segmentoproductoAux.setId(this.iIdNuevoSegmentoProducto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//SegmentoProducto segmentoproductoOrigen=new SegmentoProducto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(SegmentoProducto segmentoproductoOrigen : segmentoproductosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSegmentoProducto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							segmentoproductoOrigen =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							segmentoproductoOrigen =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSegmentoProducto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.segmentoproducto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSegmentoProducto(segmentoproductoOrigen,this.segmentoproducto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSegmentoProducto(this.segmentoproducto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.segmentoproductoLogic.getSegmentoProductos().add(this.segmentoproductoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.segmentoproductos.add(this.segmentoproductoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSegmentoProducto(false);
				
				this.jTableDatosSegmentoProducto.setRowSelectionInterval(this.getIndiceNuevoSegmentoProducto(), this.getIndiceNuevoSegmentoProducto());
				
				int iLastRow =  this.jTableDatosSegmentoProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSegmentoProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSegmentoProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSegmentoProducto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSegmentoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<SegmentoProducto> segmentoproductosSeleccionados=new ArrayList<SegmentoProducto>();									
		
			SegmentoProducto segmentoproductoOrigen=new SegmentoProducto();
			SegmentoProducto segmentoproductoDestino=new SegmentoProducto();
				
			segmentoproductosSeleccionados=this.getSegmentoProductosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSegmentoProducto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || segmentoproductosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSegmentoProducto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						segmentoproductoOrigen =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						segmentoproductoOrigen =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						segmentoproductoDestino =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						segmentoproductoDestino =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				segmentoproductoOrigen =segmentoproductosSeleccionados.get(0);
				segmentoproductoDestino =segmentoproductosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSegmentoProducto(segmentoproductoOrigen,segmentoproductoDestino,true,false);
				
				segmentoproductoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(segmentoproductoDestino,segmentoproductoLogic.getSegmentoProductos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(segmentoproductoDestino,segmentoproductos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSegmentoProducto(false);
				
				//this.jTableDatosSegmentoProducto.setRowSelectionInterval(this.getIndiceNuevoSegmentoProducto(), this.getIndiceNuevoSegmentoProducto());
				
				int iLastRow =  this.jTableDatosSegmentoProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSegmentoProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSegmentoProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSegmentoProducto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSegmentoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSegmentoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSegmentoProducto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSegmentoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSegmentoProducto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasSegmentoProducto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesSegmentoProducto.setVisible(!isVisible);
			this.jPanelPaginacionSegmentoProducto.setVisible(!isVisible);
			this.jPanelAccionesSegmentoProducto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSegmentoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSegmentoProducto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSegmentoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSegmentoProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSegmentoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSegmentoProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySegmentoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySegmentoProducto();
			
			this.abrirFrameOrderBySegmentoProducto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySegmentoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySegmentoProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSegmentoProducto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSegmentoProducto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSegmentoProducto.isMaximum()) {
					this.jInternalFrameDetalleFormSegmentoProducto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSegmentoProducto.setSize(this.jInternalFrameDetalleFormSegmentoProducto.iWidthFormulario,this.jInternalFrameDetalleFormSegmentoProducto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSegmentoProducto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSegmentoProducto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSegmentoProducto.isMaximum()) {
						this.jInternalFrameDetalleFormSegmentoProducto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSegmentoProducto.jContentPaneDetalleSegmentoProducto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSegmentoProducto.jTabbedPaneRelacionesSegmentoProducto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSegmentoProducto.jContentPaneDetalleSegmentoProducto.getWidth(),SegmentoProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSegmentoProducto.jTabbedPaneRelacionesSegmentoProducto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSegmentoProducto.jContentPaneDetalleSegmentoProducto.getWidth(),SegmentoProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSegmentoProducto.jTabbedPaneRelacionesSegmentoProducto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSegmentoProducto.jContentPaneDetalleSegmentoProducto.getWidth(),SegmentoProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();
					}

					if(ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProducto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSegmentoProducto.setVisible(true);
	        this.jInternalFrameDetalleFormSegmentoProducto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySegmentoProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySegmentoProducto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySegmentoProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySegmentoProducto,false,this);
				} else {
					this.jInternalFrameOrderBySegmentoProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySegmentoProducto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySegmentoProducto);
				this.jInternalFrameOrderBySegmentoProducto.setVisible(false);
				this.jInternalFrameOrderBySegmentoProducto.setSelected(false);
				
				this.jInternalFrameOrderBySegmentoProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySegmentoProducto"));
				
				this.inicializarActualizarBindingTablaOrderBySegmentoProducto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSegmentoProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSegmentoProducto==null) {
				
				this.jInternalFrameImportacionSegmentoProducto=new ImportacionJInternalFrame(SegmentoProductoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSegmentoProducto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSegmentoProducto);
				this.jInternalFrameImportacionSegmentoProducto.setVisible(false);
				this.jInternalFrameImportacionSegmentoProducto.setSelected(false);


				this.jInternalFrameImportacionSegmentoProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSegmentoProducto"));
				this.jInternalFrameImportacionSegmentoProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSegmentoProducto"));
				this.jInternalFrameImportacionSegmentoProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSegmentoProducto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSegmentoProducto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSegmentoProducto==null) {
				this.jInternalFrameReporteDinamicoSegmentoProducto=new ReporteDinamicoJInternalFrame(SegmentoProductoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSegmentoProducto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSegmentoProducto);
				this.jInternalFrameReporteDinamicoSegmentoProducto.setVisible(false);
				this.jInternalFrameReporteDinamicoSegmentoProducto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSegmentoProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSegmentoProducto"));
				this.jInternalFrameReporteDinamicoSegmentoProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSegmentoProducto"));
				this.jInternalFrameReporteDinamicoSegmentoProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSegmentoProducto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSegmentoProducto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaParametroInventarioDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormSegmentoProducto.jContentPaneDetalleSegmentoProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProducto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormSegmentoProducto.jContentPaneDetalleSegmentoProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleSegmentoProducto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSegmentoProducto);
			
	       	this.jInternalFrameDetalleFormSegmentoProducto.setVisible(false);
	        this.jInternalFrameDetalleFormSegmentoProducto.setSelected(false);
			
			//this.jInternalFrameDetalleFormSegmentoProducto.dispose();
			//this.jInternalFrameDetalleFormSegmentoProducto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSegmentoProducto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSegmentoProducto.setVisible(true);
	        this.jInternalFrameReporteDinamicoSegmentoProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSegmentoProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSegmentoProducto.setVisible(true);
	        this.jInternalFrameImportacionSegmentoProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySegmentoProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySegmentoProducto.setVisible(true);
	        this.jInternalFrameOrderBySegmentoProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySegmentoProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySegmentoProducto.setVisible(false);
	        this.jInternalFrameOrderBySegmentoProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSegmentoProducto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSegmentoProducto.setVisible(false);
	        this.jInternalFrameReporteDinamicoSegmentoProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSegmentoProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSegmentoProducto.setVisible(false);
	        this.jInternalFrameImportacionSegmentoProducto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarSegmentoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSegmentoProducto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSegmentoProducto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSegmentoProducto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSegmentoProducto(true);
			//this.isEsNuevoSegmentoProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproducto =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.segmentoproducto =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSegmentoProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSegmentoProducto(false) ;
			
			if(segmentoproductoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado() && ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(SegmentoProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSegmentoProducto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSegmentoProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSegmentoProductoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSegmentoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproducto =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.segmentoproducto =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSegmentoProducto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSegmentoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSegmentoProducto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSegmentoProducto(true);
			//this.isEsNuevoSegmentoProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproducto =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.segmentoproducto =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.segmentoproducto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSegmentoProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSegmentoProducto(false) ;
			
			if(SegmentoProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSegmentoProducto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSegmentoProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoProducto(List<TipoProducto> tipoproductosForeignKey)throws Exception{
		TableColumn tableColumnTipoProducto=this.jTableDatosSegmentoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSegmentoProducto,SegmentoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO));
		TableCellEditor tableCellEditorTipoProducto =tableColumnTipoProducto.getCellEditor();

		TipoProductoTableCell tipoproductoTableCellFk=(TipoProductoTableCell)tableCellEditorTipoProducto;

		if(tipoproductoTableCellFk!=null) {
			tipoproductoTableCellFk.settipoproductosForeignKey(tipoproductosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSegmentoProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoproductoTableCellFk.setRowActual(intSelectedRow);
			//tipoproductoTableCellFk.settipoproductosForeignKeyActual(tipoproductosForeignKey);
		//}


		if(tipoproductoTableCellFk!=null) {
			tipoproductoTableCellFk.RecargarTipoProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarSegmentoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSegmentoProducto(false);
			
			//if(!this.isEsNuevoSegmentoProducto) {								
				int intSelectedRow = this.jTableDatosSegmentoProducto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproducto =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.segmentoproducto =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SegmentoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSegmentoProducto(this.segmentoproducto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSegmentoProducto(this.segmentoproducto);
				
			}
			
			if(this.permiteMantenimiento(this.segmentoproducto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSegmentoProducto=true;
					this.inicializarActualizarBindingTablaSegmentoProducto(false);
					this.isEsNuevoSegmentoProducto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSegmentoProducto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSegmentoProducto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSegmentoProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSegmentoProducto(false);
				
				this.habilitarDeshabilitarControlesSegmentoProducto(false);
			
												
				
				if(SegmentoProductoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSegmentoProducto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSegmentoProductoActionPerformed(evt,segmentoproductoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSegmentoProducto(this.segmentoproducto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSegmentoProducto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,segmentoproductoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.segmentoproducto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(SegmentoProducto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SegmentoProducto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSegmentoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSegmentoProducto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproducto =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				this.segmentoproducto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.segmentoproducto =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				this.segmentoproducto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.segmentoproducto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SegmentoProductoModel) this.jTableDatosSegmentoProducto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSegmentoProducto=true;
				this.inicializarActualizarBindingTablaSegmentoProducto(false);
				this.isEsNuevoSegmentoProducto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSegmentoProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSegmentoProducto(false);
				
				this.habilitarDeshabilitarControlesSegmentoProducto(false);
				
				
				
				if(SegmentoProductoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSegmentoProducto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSegmentoProductoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSegmentoProducto.getRowCount()>=1) {
				jTableDatosSegmentoProducto.removeRowSelectionInterval(0, jTableDatosSegmentoProducto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSegmentoProducto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSegmentoProducto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSegmentoProducto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSegmentoProducto(false) ;
			
			this.isEsNuevoSegmentoProducto=false;
			
			if(SegmentoProductoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSegmentoProducto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSegmentoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSegmentoProducto(false);
				
				//SI ES MANUAL
				if(SegmentoProductoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSegmentoProducto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSegmentoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSegmentoProducto--;			
			//SegmentoProducto segmentoproductoAux= new SegmentoProducto();			
			//segmentoproductoAux.setId(this.iIdNuevoSegmentoProducto);
			
			if(this.jInternalFrameDetalleFormSegmentoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSegmentoProducto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSegmentoProducto(this.segmentoproducto);
			
			this.segmentoproducto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.segmentoproductoLogic.getSegmentoProductos().add(this.segmentoproductoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.segmentoproductos.add(this.segmentoproductoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSegmentoProducto(false);
			
			this.jTableDatosSegmentoProducto.setRowSelectionInterval(this.getIndiceNuevoSegmentoProducto(), this.getIndiceNuevoSegmentoProducto());
			
			int iLastRow =  this.jTableDatosSegmentoProducto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSegmentoProducto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSegmentoProducto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSegmentoProducto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSegmentoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSegmentoProducto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSegmentoProducto(false);
			
			//SI ES MANUAL
			if(SegmentoProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSegmentoProducto();
			}
			
			//this.abrirFrameTreeSegmentoProducto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSegmentoProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Segmento ProductoS ?", "MANTENIMIENTO DE Segmento Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionSegmentoProducto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralSegmentoProducto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.segmentoproductoReturnGeneral=segmentoproductoLogic.procesarImportacionSegmentoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.segmentoproductoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarSegmentoProductoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSegmentoProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSegmentoProducto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSegmentoProducto.setFileImportacion(this.jInternalFrameImportacionSegmentoProducto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSegmentoProducto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSegmentoProducto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSegmentoProducto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSegmentoProducto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSegmentoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<SegmentoProducto> segmentoproductosSeleccionados=new ArrayList<SegmentoProducto>();		

		segmentoproductosSeleccionados=this.getSegmentoProductosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSegmentoProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSegmentoProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SegmentoProductoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SegmentoProductoBaseDesign.jrxml";
			
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
			
			this.generarReporteSegmentoProductos("Todos",segmentoproductosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Segmento Producto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSegmentoProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSegmentoProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SegmentoProductoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SegmentoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SegmentoProductoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SegmentoProductoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoSegmentoProducto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSegmentoProducto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSegmentoProducto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SegmentoProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case SegmentoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					sNombreCampoCategoria="id_tipo_producto";
					break;

				case SegmentoProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case SegmentoProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSegmentoProducto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SegmentoProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case SegmentoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					sNombreCampoCategoriaValor="id_tipo_producto";
					break;

				case SegmentoProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case SegmentoProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSegmentoProducto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSegmentoProducto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SegmentoProductoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case SegmentoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_producto");
					break;

				case SegmentoProductoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case SegmentoProductoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoSegmentoProductoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<SegmentoProducto> segmentoproductosSeleccionados=new ArrayList<SegmentoProducto>();		
		
		segmentoproductosSeleccionados=this.getSegmentoProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"segmentoproducto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("SegmentoProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSegmentoProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSegmentoProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SegmentoProductoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SegmentoProductoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(SegmentoProducto segmentoproducto:segmentoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(segmentoproducto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SegmentoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SegmentoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
					iRow++;

					for(SegmentoProducto segmentoproducto:segmentoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(segmentoproducto.gettipoproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SegmentoProductoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SegmentoProductoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(SegmentoProducto segmentoproducto:segmentoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(segmentoproducto.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SegmentoProductoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SegmentoProductoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(SegmentoProducto segmentoproducto:segmentoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(segmentoproducto.getnombre());
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
			//	this.getFilaCabeceraExportarExcelSegmentoProducto(row);				
			//	iRow++;
			//}				
			
			//for(SegmentoProducto segmentoproductoAux:segmentoproductosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSegmentoProducto(segmentoproductoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Segmento Producto",JOptionPane.INFORMATION_MESSAGE);
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
				this.segmentoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSegmentoProducto(false);
			
			//SI ES MANUAL
			if(SegmentoProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSegmentoProducto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSegmentoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSegmentoProducto(false);
			
			//SI ES MANUAL
			if(SegmentoProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSegmentoProducto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSegmentoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSegmentoProducto(false);
			
			//SI ES MANUAL
			if(SegmentoProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSegmentoProducto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSegmentoProducto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSegmentoProducto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSegmentoProducto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSegmentoProducto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSegmentoProducto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSegmentoProducto.setMinimumSize(dimensionMinimum);
		this.jTableDatosSegmentoProducto.setMaximumSize(dimensionMaximum);
		this.jTableDatosSegmentoProducto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSegmentoProducto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSegmentoProducto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSegmentoProducto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSegmentoProducto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSegmentoProducto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSegmentoProducto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSegmentoProducto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSegmentoProducto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SegmentoProductoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SegmentoProductoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSegmentoProducto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSegmentoProducto();
		
		this.inicializarActualizarBindingBotonesManualSegmentoProducto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSegmentoProducto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSegmentoProducto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSegmentoProducto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSegmentoProducto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSegmentoProducto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSegmentoProducto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSegmentoProducto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSegmentoProducto.jCheckBoxPostAccionNuevoSegmentoProducto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSegmentoProducto.jCheckBoxPostAccionSinCerrarSegmentoProducto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSegmentoProducto.jCheckBoxPostAccionSinMensajeSegmentoProducto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSegmentoProducto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSegmentoProducto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSegmentoProducto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
				this.jInternalFrameDetalleFormSegmentoProducto.jCheckBoxPostAccionNuevoSegmentoProducto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSegmentoProducto.jCheckBoxPostAccionSinCerrarSegmentoProducto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSegmentoProducto.jCheckBoxPostAccionSinMensajeSegmentoProducto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSegmentoProducto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSegmentoProducto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxTiposAccionesFormularioSegmentoProducto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSegmentoProducto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSegmentoProducto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSegmentoProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSegmentoProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSegmentoProducto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSegmentoProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSegmentoProducto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSegmentoProducto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSegmentoProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSegmentoProducto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSegmentoProducto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSegmentoProducto(Boolean esInicializar) throws Exception {
		try	{	
			if(SegmentoProductoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSegmentoProducto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSegmentoProducto() throws Exception {
		try	{
			if(SegmentoProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSegmentoProducto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSegmentoProducto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxTiposAccionesFormularioSegmentoProducto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxTiposAccionesFormularioSegmentoProducto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSegmentoProducto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSegmentoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSegmentoProducto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSegmentoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSegmentoProducto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSegmentoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSegmentoProducto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSegmentoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSegmentoProducto.addItem(reporte);
			}
			
			
			if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSegmentoProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSegmentoProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSegmentoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSegmentoProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSegmentoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSegmentoProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSegmentoProducto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxTiposAccionesFormularioSegmentoProducto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxTiposAccionesFormularioSegmentoProducto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSegmentoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSegmentoProducto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSegmentoProducto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSegmentoProducto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSegmentoProducto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSegmentoProducto!=null) {
				this.jInternalFrameReporteDinamicoSegmentoProducto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSegmentoProducto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSegmentoProducto!=null) {
				this.jInternalFrameReporteDinamicoSegmentoProducto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSegmentoProducto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSegmentoProducto!=null) {
				
				if(this.jInternalFrameReporteDinamicoSegmentoProducto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSegmentoProducto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSegmentoProducto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSegmentoProducto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSegmentoProducto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSegmentoProducto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSegmentoProducto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoSegmentoProducto.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreSegmentoProducto.getText();
		if(this.jComboBoxid_tipo_productoFK_IdTipoProductoSegmentoProducto.getSelectedItem()!=null){this.id_tipo_productoFK_IdTipoProducto=((TipoProducto)this.jComboBoxid_tipo_productoFK_IdTipoProductoSegmentoProducto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSegmentoProducto(Boolean esInicializar) throws Exception {				
		if(SegmentoProductoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSegmentoProducto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSegmentoProducto() throws Exception {
		this.inicializarActualizarBindingTablaSegmentoProducto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySegmentoProducto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySegmentoProducto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySegmentoProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySegmentoProducto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SegmentoProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySegmentoProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySegmentoProducto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SegmentoProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSegmentoProductoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSegmentoProductoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SegmentoProductoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySegmentoProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySegmentoProducto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SegmentoProductoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySegmentoProducto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSegmentoProducto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=segmentoproductoLogic.getSegmentoProductos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=segmentoproductos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SegmentoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSegmentoProducto.setModel(new SegmentoProductoModel(this.segmentoproductoLogic.getSegmentoProductos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSegmentoProducto.setModel(new SegmentoProductoModel(this.segmentoproductos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySegmentoProducto!=null && this.jInternalFrameOrderBySegmentoProducto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySegmentoProducto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSegmentoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSegmentoProducto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SegmentoProductoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO,segmentoproductoConstantesFunciones.resaltarSeleccionarSegmentoProducto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO,segmentoproductoConstantesFunciones.resaltarSeleccionarSegmentoProducto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSegmentoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSegmentoProducto,SegmentoProductoConstantesFunciones.LABEL_ID));

		if(this.segmentoproductoConstantesFunciones.mostraridSegmentoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SegmentoProductoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.segmentoproductoConstantesFunciones.resaltaridSegmentoProducto,this.segmentoproductoConstantesFunciones.activaridSegmentoProducto,this,true,"idSegmentoProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.segmentoproductoConstantesFunciones.resaltaridSegmentoProducto,this.segmentoproductoConstantesFunciones.activaridSegmentoProducto,this,true,"idSegmentoProducto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSegmentoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSegmentoProducto,SegmentoProductoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.segmentoproductoConstantesFunciones.mostrarid_empresaSegmentoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SegmentoProductoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.segmentoproductoConstantesFunciones.resaltarid_empresaSegmentoProducto,this,this.segmentoproductoConstantesFunciones.activarid_empresaSegmentoProducto));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.segmentoproductoConstantesFunciones.resaltarid_empresaSegmentoProducto,this,this.segmentoproductoConstantesFunciones.activarid_empresaSegmentoProducto,false,"id_empresaSegmentoProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SegmentoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSegmentoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSegmentoProducto,SegmentoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO));

		if(this.segmentoproductoConstantesFunciones.mostrarid_tipo_productoSegmentoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SegmentoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoProductoTableCell(this.tipoproductosForeignKey,this.segmentoproductoConstantesFunciones.resaltarid_tipo_productoSegmentoProducto,this,this.segmentoproductoConstantesFunciones.activarid_tipo_productoSegmentoProducto));
			tableColumn.setCellEditor(new TipoProductoTableCell(this.tipoproductosForeignKey,this.segmentoproductoConstantesFunciones.resaltarid_tipo_productoSegmentoProducto,this,this.segmentoproductoConstantesFunciones.activarid_tipo_productoSegmentoProducto,true,"id_tipo_productoSegmentoProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SegmentoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSegmentoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSegmentoProducto,SegmentoProductoConstantesFunciones.LABEL_CODIGO));

		if(this.segmentoproductoConstantesFunciones.mostrarcodigoSegmentoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SegmentoProductoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.segmentoproductoConstantesFunciones.resaltarcodigoSegmentoProducto,this.segmentoproductoConstantesFunciones.activarcodigoSegmentoProducto,this,true,"codigoSegmentoProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.segmentoproductoConstantesFunciones.resaltarcodigoSegmentoProducto,this.segmentoproductoConstantesFunciones.activarcodigoSegmentoProducto,this,true,"codigoSegmentoProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SegmentoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSegmentoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSegmentoProducto,SegmentoProductoConstantesFunciones.LABEL_NOMBRE));

		if(this.segmentoproductoConstantesFunciones.mostrarnombreSegmentoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SegmentoProductoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.segmentoproductoConstantesFunciones.resaltarnombreSegmentoProducto,this.segmentoproductoConstantesFunciones.activarnombreSegmentoProducto,this,true,"nombreSegmentoProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.segmentoproductoConstantesFunciones.resaltarnombreSegmentoProducto,this.segmentoproductoConstantesFunciones.activarnombreSegmentoProducto,this,true,"nombreSegmentoProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SegmentoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosProducto && this.segmentoproductoConstantesFunciones.mostrarProductoSegmentoProducto && !SegmentoProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Productos");
				tableColumn.setHeaderValue("Productos");
				tableColumn.setCellRenderer(new ProductoTableCell(segmentoproductoConstantesFunciones.resaltarProductoSegmentoProducto,this,this.segmentoproductoConstantesFunciones.activarProductoSegmentoProducto));
				tableColumn.setCellEditor(new ProductoTableCell(segmentoproductoConstantesFunciones.resaltarProductoSegmentoProducto,this,this.segmentoproductoConstantesFunciones.activarProductoSegmentoProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosSegmentoProducto.addColumn(tableColumn);
			}

			if(this.isTienePermisosParametroInventarioDefecto && this.segmentoproductoConstantesFunciones.mostrarParametroInventarioDefectoSegmentoProducto && !SegmentoProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Inventario Defectos");
				tableColumn.setHeaderValue("Parametro Inventario Defectos");
				tableColumn.setCellRenderer(new ParametroInventarioDefectoTableCell(segmentoproductoConstantesFunciones.resaltarParametroInventarioDefectoSegmentoProducto,this,this.segmentoproductoConstantesFunciones.activarParametroInventarioDefectoSegmentoProducto));
				tableColumn.setCellEditor(new ParametroInventarioDefectoTableCell(segmentoproductoConstantesFunciones.resaltarParametroInventarioDefectoSegmentoProducto,this,this.segmentoproductoConstantesFunciones.activarParametroInventarioDefectoSegmentoProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosSegmentoProducto.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.segmentoproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.segmentoproductoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSegmentoProducto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.segmentoproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.segmentoproductoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSegmentoProducto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSegmentoProducto && this.isPermisoGuardarCambiosSegmentoProducto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.segmentoproductoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.segmentoproductoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSegmentoProducto.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.segmentoproductoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosSegmentoProducto.addColumn(tableColumn);
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
			
			this.jTableDatosSegmentoProducto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSegmentoProducto && this.isPermisoGuardarCambiosSegmentoProducto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.segmentoproductoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSegmentoProducto && this.isPermisoGuardarCambiosSegmentoProducto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSegmentoProducto.moveColumn(this.jTableDatosSegmentoProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSegmentoProducto.moveColumn(this.jTableDatosSegmentoProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.segmentoproductoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosSegmentoProducto.moveColumn(this.jTableDatosSegmentoProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSegmentoProducto.moveColumn(this.jTableDatosSegmentoProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSegmentoProducto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSegmentoProducto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSegmentoProducto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SegmentoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSegmentoProducto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSegmentoProducto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SegmentoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SegmentoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSegmentoProducto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSegmentoProducto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSegmentoProducto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=segmentoproductoLogic.getSegmentoProductos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=segmentoproductos.size()-1;
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
		//this.jTableDatosSegmentoProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSegmentoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSegmentoProducto();
			
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
				
				//this.isEsNuevoSegmentoProducto=false;
					
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
			
				if(this.segmentoproductoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSegmentoProducto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSegmentoProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSegmentoProducto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproducto =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.segmentoproducto =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.segmentoproducto.getsType().equals("DUPLICADO")
				   || this.segmentoproducto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSegmentoProducto=true;
				
				} else {
					this.isEsNuevoSegmentoProducto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
					if(this.segmentoproducto.getId()>=0 && !this.segmentoproducto.getIsNew()) {						
						this.isEsNuevoSegmentoProducto=false;
						
					} else {
						this.isEsNuevoSegmentoProducto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSegmentoProducto(esRelaciones);						
				
				this.seleccionarSegmentoProducto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.segmentoproducto.getId()<0) {
					this.isEsNuevoSegmentoProducto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSegmentoProducto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSegmentoProducto(evt,rowIndex);
				}	
				
				if(this.segmentoproductoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion SegmentoProducto: " + this.dDif); 
					}
				}								
				
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSegmentoProducto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.segmentoproducto)) {
					if(this.segmentoproducto.getId()>0) {
						this.segmentoproducto.setIsDeleted(true);
						
						this.segmentoproductosEliminados.add(this.segmentoproducto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.segmentoproductoLogic.getSegmentoProductos().remove(this.segmentoproducto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.segmentoproductos.remove(this.segmentoproducto);				
					}
					
					
					((SegmentoProductoModel) this.jTableDatosSegmentoProducto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSegmentoProducto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSegmentoProducto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSegmentoProducto) {
			
			if(this.jInternalFrameDetalleFormSegmentoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSegmentoProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSegmentoProducto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproducto =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.segmentoproducto =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SegmentoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSegmentoProducto(this.segmentoproducto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.segmentoproductoConstantesFunciones.cargarid_empresaSegmentoProducto || this.segmentoproductoConstantesFunciones.event_dependid_empresaSegmentoProducto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.segmentoproducto.getid_empresa());
									//this.inicializarActualizarBindingSegmentoProducto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(segmentoproducto.getEmpresa()!=null) {
							this.empresasForeignKey.add(segmentoproducto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.segmentoproducto.getid_empresa(),false,"Formulario");

					//TipoProducto
					if(!this.segmentoproductoConstantesFunciones.cargarid_tipo_productoSegmentoProducto || this.segmentoproductoConstantesFunciones.event_dependid_tipo_productoSegmentoProducto) {
						//this.cargarCombosTipoProductosForeignKeyLista(" where id="+this.segmentoproducto.getid_tipo_producto());
									//this.inicializarActualizarBindingSegmentoProducto(false,false);
						this.tipoproductosForeignKey=new ArrayList<TipoProducto>();

						if(segmentoproducto.getTipoProducto()!=null) {
							this.tipoproductosForeignKey.add(segmentoproducto.getTipoProducto());
						}

						this.addItemDefectoCombosForeignKeyTipoProducto();
						this.cargarCombosFrameTipoProductosForeignKey("Todos");
					}
					this.setActualTipoProductoForeignKey(this.segmentoproducto.getid_tipo_producto(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSegmentoProducto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSegmentoProducto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSegmentoProducto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSegmentoProducto(SegmentoProducto segmentoproducto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSegmentoProducto(segmentoproducto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSegmentoProducto(SegmentoProducto segmentoproducto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSegmentoProducto(segmentoproducto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySegmentoProducto(segmentoproducto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySegmentoProducto(segmentoproducto);
	}
	
	public void setVariablesObjetoActualToFormularioSegmentoProducto(SegmentoProducto segmentoproducto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSegmentoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSegmentoProducto.jLabelidSegmentoProducto.setText(segmentoproducto.getId().toString());
			this.jInternalFrameDetalleFormSegmentoProducto.jTextFieldcodigoSegmentoProducto.setText(segmentoproducto.getcodigo());
			this.jInternalFrameDetalleFormSegmentoProducto.jTextAreanombreSegmentoProducto.setText(segmentoproducto.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,SegmentoProducto segmentoproductoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,segmentoproductoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,SegmentoProducto segmentoproductoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				segmentoproductoLocal=this.segmentoproducto;
			} else {
				segmentoproductoLocal=this.segmentoproductoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(segmentoproductoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSegmentoProducto(segmentoproductoLocal,true);
					
					if(segmentoproductoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(segmentoproductoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(segmentoproductoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSegmentoProducto(SegmentoProducto segmentoproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSegmentoProducto(segmentoproducto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSegmentoProducto(segmentoproducto);
	}
	
	public void setVariablesFormularioToObjetoActualSegmentoProducto(SegmentoProducto segmentoproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSegmentoProducto(segmentoproducto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSegmentoProducto(SegmentoProducto segmentoproducto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSegmentoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSegmentoProducto.jLabelidSegmentoProducto.getText()==null || this.jInternalFrameDetalleFormSegmentoProducto.jLabelidSegmentoProducto.getText()=="" || this.jInternalFrameDetalleFormSegmentoProducto.jLabelidSegmentoProducto.getText()=="Id") {
				this.jInternalFrameDetalleFormSegmentoProducto.jLabelidSegmentoProducto.setText("0");
			}

			if(conColumnasBase) {segmentoproducto.setId(Long.parseLong(this.jInternalFrameDetalleFormSegmentoProducto.jLabelidSegmentoProducto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SegmentoProductoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSegmentoProducto.jLabelIdSegmentoProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			segmentoproducto.setcodigo(this.jInternalFrameDetalleFormSegmentoProducto.jTextFieldcodigoSegmentoProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SegmentoProductoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSegmentoProducto.jLabelcodigoSegmentoProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			segmentoproducto.setnombre(this.jInternalFrameDetalleFormSegmentoProducto.jTextAreanombreSegmentoProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SegmentoProductoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSegmentoProducto.jLabelnombreSegmentoProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSegmentoProducto(SegmentoProducto segmentoproductoBean,SegmentoProducto segmentoproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && segmentoproductoBean.getid_tipo_producto()!=null && !segmentoproductoBean.getid_tipo_producto().equals(-1L))) {segmentoproducto.setid_tipo_producto(segmentoproductoBean.getid_tipo_producto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSegmentoProducto(SegmentoProducto segmentoproductoOrigen,SegmentoProducto segmentoproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && segmentoproductoOrigen.getId()!=null && !segmentoproductoOrigen.getId().equals(0L))) {segmentoproducto.setId(segmentoproductoOrigen.getId());}}
			if(conDefault || (!conDefault && segmentoproductoOrigen.getid_tipo_producto()!=null && !segmentoproductoOrigen.getid_tipo_producto().equals(-1L))) {segmentoproducto.setid_tipo_producto(segmentoproductoOrigen.getid_tipo_producto());}
			if(conDefault || (!conDefault && segmentoproductoOrigen.getcodigo()!=null && !segmentoproductoOrigen.getcodigo().equals(""))) {segmentoproducto.setcodigo(segmentoproductoOrigen.getcodigo());}
			if(conDefault || (!conDefault && segmentoproductoOrigen.getnombre()!=null && !segmentoproductoOrigen.getnombre().equals(""))) {segmentoproducto.setnombre(segmentoproductoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSegmentoProducto(SegmentoProducto segmentoproducto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSegmentoProducto.jLabelidSegmentoProducto.setText(segmentoproducto.getId().toString());
			this.jInternalFrameDetalleFormSegmentoProducto.jTextFieldcodigoSegmentoProducto.setText(segmentoproducto.getcodigo());
			this.jInternalFrameDetalleFormSegmentoProducto.jTextAreanombreSegmentoProducto.setText(segmentoproducto.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSegmentoProducto(SegmentoProductoBean segmentoproductoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSegmentoProducto.jLabelidSegmentoProducto.setText(segmentoproductoBean.getId().toString());
			this.jInternalFrameDetalleFormSegmentoProducto.jTextFieldcodigoSegmentoProducto.setText(segmentoproductoBean.getcodigo());
			this.jInternalFrameDetalleFormSegmentoProducto.jTextAreanombreSegmentoProducto.setText(segmentoproductoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSegmentoProducto(SegmentoProductoParameterReturnGeneral segmentoproductoReturnGeneral,SegmentoProductoBean segmentoproductoBean,Boolean conDefault) throws Exception { 
		try {
			SegmentoProducto segmentoproductoLocal=new SegmentoProducto();
			
			segmentoproductoLocal=segmentoproductoReturnGeneral.getSegmentoProducto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && segmentoproductoLocal.getId()!=null && !segmentoproductoLocal.getId().equals(0L))) {segmentoproductoBean.setId(segmentoproductoLocal.getId());}}
			if(conDefault || (!conDefault && segmentoproductoLocal.getid_tipo_producto()!=null && !segmentoproductoLocal.getid_tipo_producto().equals(-1L))) {segmentoproductoBean.setid_tipo_producto(segmentoproductoLocal.getid_tipo_producto());}
			if(conDefault || (!conDefault && segmentoproductoLocal.getcodigo()!=null && !segmentoproductoLocal.getcodigo().equals(""))) {segmentoproductoBean.setcodigo(segmentoproductoLocal.getcodigo());}
			if(conDefault || (!conDefault && segmentoproductoLocal.getnombre()!=null && !segmentoproductoLocal.getnombre().equals(""))) {segmentoproductoBean.setnombre(segmentoproductoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSegmentoProductoGenerico(Long idSegmentoProductoSeleccionado,JComboBox jComboBoxSegmentoProducto,List<SegmentoProducto> segmentoproductosLocal)throws Exception {
		try {
			SegmentoProducto  segmentoproductoTemp=null;

			for(SegmentoProducto segmentoproductoAux:segmentoproductosLocal) {
				if(segmentoproductoAux.getId()!=null && segmentoproductoAux.getId().equals(idSegmentoProductoSeleccionado)) {
					segmentoproductoTemp=segmentoproductoAux;
					break;
				}
			}

			jComboBoxSegmentoProducto.setSelectedItem(segmentoproductoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSegmentoProductoGenerico(JComboBox jComboBoxSegmentoProducto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSegmentoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSegmentoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSegmentoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSegmentoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSegmentoProducto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSegmentoProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSegmentoProducto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSegmentoProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSegmentoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSegmentoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			segmentoproducto=(SegmentoProducto) segmentoproductoLogic.getSegmentoProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			segmentoproducto =(SegmentoProducto) segmentoproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!segmentoproducto.getIsNew() && !segmentoproducto.getIsChanged() && !segmentoproducto.getIsDeleted()) {
				sDescripcion=segmentoproducto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=segmentoproducto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoProducto")) {
			//sDescripcion=this.getActualTipoProductoForeignKeyDescripcion((Long)value);
			if(!segmentoproducto.getIsNew() && !segmentoproducto.getIsChanged() && !segmentoproducto.getIsDeleted()) {
				sDescripcion=segmentoproducto.gettipoproducto_descripcion();
			} else {
				//sDescripcion=this.getActualTipoProductoForeignKeyDescripcion((Long)value);
				sDescripcion=segmentoproducto.gettipoproducto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		SegmentoProducto segmentoproductoRow=new SegmentoProducto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			segmentoproductoRow=(SegmentoProducto) segmentoproductoLogic.getSegmentoProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			segmentoproductoRow=(SegmentoProducto) segmentoproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonProductoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,SegmentoProducto segmentoproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormSegmentoProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.segmentoproducto = (SegmentoProducto)this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.segmentoproducto = (SegmentoProducto)this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(segmentoproducto!=null) {
						this.segmentoproducto = segmentoproducto;
					} else {
						this.segmentoproducto = new SegmentoProducto();
					}
				}

				if(this.isTienePermisosProducto && this.permiteMantenimiento(this.segmentoproducto)) {
					ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFramePopup=new ProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFramePopup;
					} else {
						productoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame;
					}

					List<SegmentoProducto> segmentoproductos=new ArrayList<SegmentoProducto>();
					segmentoproductos.add(this.segmentoproducto);
					if(!esRelacionado) {
						//productoBeanSwingJInternalFrame.productoSessionBean.setConGuardarRelaciones(false);
						//productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormSegmentoProducto.cargarProductoBeanSwingJInternalFrame(segmentoproductos,this.segmentoproducto,productoBeanSwingJInternalFrame,/*conInicializar,*/productoBeanSwingJInternalFrame.productoSessionBean.getConGuardarRelaciones(),productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado());
					productoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoBeanSwingJInternalFrame.actualizarEstadoPanelsProducto("no_relacionado");

						productoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoConstantesFunciones.ITAMANIOFILATABLA + (ProductoConstantesFunciones.ITAMANIOFILATABLA/2));

						productoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderSegmentoProducto=(TitledBorder)this.jScrollPanelDatosSegmentoProducto.getBorder();
						TitledBorder titledBorderProducto=(TitledBorder)productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

						titledBorderProducto.setTitle(titledBorderSegmentoProducto.getTitle() + " -> Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoBeanSwingJInternalFrame);
						}

						productoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoBeanSwingJInternalFrame);

						productoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.segmentoproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonParametroInventarioDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,SegmentoProducto segmentoproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormSegmentoProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.segmentoproducto = (SegmentoProducto)this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.segmentoproducto = (SegmentoProducto)this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(segmentoproducto!=null) {
						this.segmentoproducto = segmentoproducto;
					} else {
						this.segmentoproducto = new SegmentoProducto();
					}
				}

				if(this.isTienePermisosParametroInventarioDefecto && this.permiteMantenimiento(this.segmentoproducto)) {
					ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFramePopup=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFramePopup;
					} else {
						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame;
					}

					List<SegmentoProducto> segmentoproductos=new ArrayList<SegmentoProducto>();
					segmentoproductos.add(this.segmentoproducto);
					if(!esRelacionado) {
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setConGuardarRelaciones(false);
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormSegmentoProducto.cargarParametroInventarioDefectoBeanSwingJInternalFrame(segmentoproductos,this.segmentoproducto,parametroinventariodefectoBeanSwingJInternalFrame,/*conInicializar,*/parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getConGuardarRelaciones(),parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("no_relacionado");

						parametroinventariodefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametroinventariodefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderSegmentoProducto=(TitledBorder)this.jScrollPanelDatosSegmentoProducto.getBorder();
						TitledBorder titledBorderParametroInventarioDefecto=(TitledBorder)parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getBorder();

						titledBorderParametroInventarioDefecto.setTitle(titledBorderSegmentoProducto.getTitle() + " -> Parametro Inventario Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametroinventariodefectoBeanSwingJInternalFrame);
						}

						parametroinventariodefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametroinventariodefectoBeanSwingJInternalFrame);

						parametroinventariodefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.segmentoproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Inventario Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSegmentoProducto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSegmentoProducto.setVisible((this.isVisibilidadCeldaNuevoSegmentoProducto && this.isPermisoNuevoSegmentoProducto));			
			this.jButtonDuplicarSegmentoProducto.setVisible((this.isVisibilidadCeldaDuplicarSegmentoProducto && this.isPermisoDuplicarSegmentoProducto));			
			this.jButtonCopiarSegmentoProducto.setVisible((this.isVisibilidadCeldaCopiarSegmentoProducto && this.isPermisoCopiarSegmentoProducto));
			this.jButtonVerFormSegmentoProducto.setVisible((this.isVisibilidadCeldaVerFormSegmentoProducto && this.isPermisoVerFormSegmentoProducto));
			
			this.jButtonAbrirOrderBySegmentoProducto.setVisible((this.isVisibilidadCeldaOrdenSegmentoProducto && this.isPermisoOrdenSegmentoProducto));			
			
			this.jButtonNuevoRelacionesSegmentoProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesSegmentoProducto && this.isPermisoNuevoSegmentoProducto));			
			this.jButtonNuevoGuardarCambiosSegmentoProducto.setVisible((this.isVisibilidadCeldaNuevoSegmentoProducto && this.isPermisoNuevoSegmentoProducto && this.isPermisoGuardarCambiosSegmentoProducto));
			
			if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonModificarSegmentoProducto.setVisible((this.isVisibilidadCeldaModificarSegmentoProducto && this.isPermisoActualizarSegmentoProducto));	
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonActualizarSegmentoProducto.setVisible((this.isVisibilidadCeldaActualizarSegmentoProducto && this.isPermisoActualizarSegmentoProducto));	
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonEliminarSegmentoProducto.setVisible((this.isVisibilidadCeldaEliminarSegmentoProducto && this.isPermisoEliminarSegmentoProducto));
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonCancelarSegmentoProducto.setVisible(this.isVisibilidadCeldaCancelarSegmentoProducto);							
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonGuardarCambiosSegmentoProducto.setVisible((this.isVisibilidadCeldaGuardarSegmentoProducto && this.isPermisoGuardarCambiosSegmentoProducto));			
			
			}
						
			this.jButtonGuardarCambiosTablaSegmentoProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosSegmentoProducto && this.isPermisoGuardarCambiosSegmentoProducto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSegmentoProducto.setVisible((this.isVisibilidadCeldaNuevoSegmentoProducto && this.isPermisoNuevoSegmentoProducto));						
			this.jButtonDuplicarToolBarSegmentoProducto.setVisible((this.isVisibilidadCeldaDuplicarSegmentoProducto && this.isPermisoDuplicarSegmentoProducto));						
			this.jButtonCopiarToolBarSegmentoProducto.setVisible((this.isVisibilidadCeldaCopiarSegmentoProducto && this.isPermisoCopiarSegmentoProducto));			
			this.jButtonVerFormToolBarSegmentoProducto.setVisible((this.isVisibilidadCeldaVerFormSegmentoProducto && this.isPermisoVerFormSegmentoProducto));			
			this.jButtonAbrirOrderByToolBarSegmentoProducto.setVisible((this.isVisibilidadCeldaOrdenSegmentoProducto && this.isPermisoOrdenSegmentoProducto));
			this.jButtonNuevoRelacionesToolBarSegmentoProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesSegmentoProducto && this.isPermisoNuevoSegmentoProducto));			
			this.jButtonNuevoGuardarCambiosToolBarSegmentoProducto.setVisible((this.isVisibilidadCeldaNuevoSegmentoProducto && this.isPermisoNuevoSegmentoProducto && this.isPermisoGuardarCambiosSegmentoProducto));			
			
			if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonModificarToolBarSegmentoProducto.setVisible((this.isVisibilidadCeldaModificarSegmentoProducto && this.isPermisoActualizarSegmentoProducto));	
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonActualizarToolBarSegmentoProducto.setVisible((this.isVisibilidadCeldaActualizarSegmentoProducto  && this.isPermisoActualizarSegmentoProducto));	
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonEliminarToolBarSegmentoProducto.setVisible((this.isVisibilidadCeldaEliminarSegmentoProducto && this.isPermisoEliminarSegmentoProducto));
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonCancelarToolBarSegmentoProducto.setVisible(this.isVisibilidadCeldaCancelarSegmentoProducto);				
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonGuardarCambiosToolBarSegmentoProducto.setVisible((this.isVisibilidadCeldaGuardarSegmentoProducto && this.isPermisoGuardarCambiosSegmentoProducto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSegmentoProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosSegmentoProducto && this.isPermisoGuardarCambiosSegmentoProducto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSegmentoProducto.setVisible((this.isVisibilidadCeldaNuevoSegmentoProducto && this.isPermisoNuevoSegmentoProducto));			
			this.jMenuItemDuplicarSegmentoProducto.setVisible((this.isVisibilidadCeldaDuplicarSegmentoProducto && this.isPermisoDuplicarSegmentoProducto));			
			this.jMenuItemCopiarSegmentoProducto.setVisible((this.isVisibilidadCeldaCopiarSegmentoProducto && this.isPermisoCopiarSegmentoProducto));			
			this.jMenuItemVerFormSegmentoProducto.setVisible((this.isVisibilidadCeldaVerFormSegmentoProducto && this.isPermisoVerFormSegmentoProducto));			
			this.jMenuItemAbrirOrderBySegmentoProducto.setVisible((this.isVisibilidadCeldaOrdenSegmentoProducto && this.isPermisoOrdenSegmentoProducto));			
			//this.jMenuItemMostrarOcultarSegmentoProducto.setVisible((this.isVisibilidadCeldaOrdenSegmentoProducto && this.isPermisoOrdenSegmentoProducto));
			this.jMenuItemDetalleAbrirOrderBySegmentoProducto.setVisible((this.isVisibilidadCeldaOrdenSegmentoProducto && this.isPermisoOrdenSegmentoProducto));			
			//this.jMenuItemDetalleMostrarOcultarSegmentoProducto.setVisible((this.isVisibilidadCeldaOrdenSegmentoProducto && this.isPermisoOrdenSegmentoProducto));			
			this.jMenuItemNuevoRelacionesSegmentoProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesSegmentoProducto && this.isPermisoNuevoSegmentoProducto));			
			this.jMenuItemNuevoGuardarCambiosSegmentoProducto.setVisible((this.isVisibilidadCeldaNuevoSegmentoProducto && this.isPermisoNuevoSegmentoProducto && this.isPermisoGuardarCambiosSegmentoProducto));									
			
			if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
			this.jInternalFrameDetalleFormSegmentoProducto.jMenuItemModificarSegmentoProducto.setVisible((this.isVisibilidadCeldaModificarSegmentoProducto && this.isPermisoActualizarSegmentoProducto));	
			this.jInternalFrameDetalleFormSegmentoProducto.jMenuItemActualizarSegmentoProducto.setVisible((this.isVisibilidadCeldaActualizarSegmentoProducto && this.isPermisoActualizarSegmentoProducto));	
			this.jInternalFrameDetalleFormSegmentoProducto.jMenuItemEliminarSegmentoProducto.setVisible((this.isVisibilidadCeldaEliminarSegmentoProducto && this.isPermisoEliminarSegmentoProducto));
			this.jInternalFrameDetalleFormSegmentoProducto.jMenuItemCancelarSegmentoProducto.setVisible(this.isVisibilidadCeldaCancelarSegmentoProducto);				
			}
			
			this.jMenuItemGuardarCambiosSegmentoProducto.setVisible((this.isVisibilidadCeldaGuardarSegmentoProducto && this.isPermisoGuardarCambiosSegmentoProducto));						
			this.jMenuItemGuardarCambiosTablaSegmentoProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosSegmentoProducto && this.isPermisoGuardarCambiosSegmentoProducto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSegmentoProducto=this.jButtonNuevoSegmentoProducto.isVisible();
			this.isVisibilidadCeldaDuplicarSegmentoProducto=this.jButtonDuplicarSegmentoProducto.isVisible();
			this.isVisibilidadCeldaCopiarSegmentoProducto=this.jButtonCopiarSegmentoProducto.isVisible();
			this.isVisibilidadCeldaVerFormSegmentoProducto=this.jButtonVerFormSegmentoProducto.isVisible();
			
			this.isVisibilidadCeldaOrdenSegmentoProducto=this.jButtonAbrirOrderBySegmentoProducto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSegmentoProducto=this.jButtonNuevoRelacionesSegmentoProducto.isVisible();
			this.isVisibilidadCeldaModificarSegmentoProducto=this.jButtonModificarSegmentoProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
			this.isVisibilidadCeldaActualizarSegmentoProducto=this.jInternalFrameDetalleFormSegmentoProducto.jButtonActualizarSegmentoProducto.isVisible();
			this.isVisibilidadCeldaEliminarSegmentoProducto=this.jInternalFrameDetalleFormSegmentoProducto.jButtonEliminarSegmentoProducto.isVisible();
			this.isVisibilidadCeldaCancelarSegmentoProducto=this.jInternalFrameDetalleFormSegmentoProducto.jButtonCancelarSegmentoProducto.isVisible();
			this.isVisibilidadCeldaGuardarSegmentoProducto=this.jInternalFrameDetalleFormSegmentoProducto.jButtonGuardarCambiosSegmentoProducto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSegmentoProducto=this.jButtonGuardarCambiosTablaSegmentoProducto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSegmentoProducto=this.jButtonNuevoToolBarSegmentoProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSegmentoProducto=this.jButtonNuevoRelacionesToolBarSegmentoProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
			this.isVisibilidadCeldaModificarSegmentoProducto=this.jInternalFrameDetalleFormSegmentoProducto.jButtonModificarToolBarSegmentoProducto.isVisible();
			this.isVisibilidadCeldaActualizarSegmentoProducto=this.jInternalFrameDetalleFormSegmentoProducto.jButtonActualizarToolBarSegmentoProducto.isVisible();
			this.isVisibilidadCeldaEliminarSegmentoProducto=this.jInternalFrameDetalleFormSegmentoProducto.jButtonEliminarToolBarSegmentoProducto.isVisible();
			this.isVisibilidadCeldaCancelarSegmentoProducto=this.jInternalFrameDetalleFormSegmentoProducto.jButtonCancelarToolBarSegmentoProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSegmentoProducto=this.jButtonGuardarCambiosToolBarSegmentoProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSegmentoProducto=this.jButtonGuardarCambiosTablaToolBarSegmentoProducto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSegmentoProducto=this.jMenuItemNuevoSegmentoProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSegmentoProducto=this.jMenuItemNuevoRelacionesSegmentoProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
			this.isVisibilidadCeldaModificarSegmentoProducto=this.jInternalFrameDetalleFormSegmentoProducto.jMenuItemModificarSegmentoProducto.isVisible();
			this.isVisibilidadCeldaActualizarSegmentoProducto=this.jInternalFrameDetalleFormSegmentoProducto.jMenuItemActualizarSegmentoProducto.isVisible();
			this.isVisibilidadCeldaEliminarSegmentoProducto=this.jInternalFrameDetalleFormSegmentoProducto.jMenuItemEliminarSegmentoProducto.isVisible();
			this.isVisibilidadCeldaCancelarSegmentoProducto=this.jInternalFrameDetalleFormSegmentoProducto.jMenuItemCancelarSegmentoProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSegmentoProducto=this.jMenuItemGuardarCambiosSegmentoProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSegmentoProducto=this.jMenuItemGuardarCambiosTablaSegmentoProducto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSegmentoProducto(Boolean esInicializar) {
		if(SegmentoProductoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.segmentoproductoSessionBean.getConGuardarRelaciones()) {
				//if(this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSegmentoProducto();
			}
			
			this.inicializarActualizarBindingBotonesManualSegmentoProducto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSegmentoProducto() {
		this.jButtonNuevoSegmentoProducto.setVisible(this.isPermisoNuevoSegmentoProducto);			
		this.jButtonDuplicarSegmentoProducto.setVisible(this.isPermisoDuplicarSegmentoProducto);			
		this.jButtonCopiarSegmentoProducto.setVisible(this.isPermisoCopiarSegmentoProducto);			
		this.jButtonVerFormSegmentoProducto.setVisible(this.isPermisoVerFormSegmentoProducto);			
		
		this.jButtonAbrirOrderBySegmentoProducto.setVisible(this.isPermisoOrdenSegmentoProducto);					
		
		this.jButtonNuevoRelacionesSegmentoProducto.setVisible(this.isPermisoNuevoSegmentoProducto);			
		
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonModificarSegmentoProducto.setVisible(this.isPermisoActualizarSegmentoProducto);	
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonActualizarSegmentoProducto.setVisible(this.isPermisoActualizarSegmentoProducto);	
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonEliminarSegmentoProducto.setVisible(this.isPermisoEliminarSegmentoProducto);
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonCancelarSegmentoProducto.setVisible(this.isVisibilidadCeldaCancelarSegmentoProducto);						
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonGuardarCambiosSegmentoProducto.setVisible(this.isPermisoGuardarCambiosSegmentoProducto);							
		}
		
		this.jButtonGuardarCambiosTablaSegmentoProducto.setVisible(this.isPermisoActualizarSegmentoProducto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSegmentoProducto() {
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonModificarSegmentoProducto.setVisible(this.isPermisoActualizarSegmentoProducto);	
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonActualizarSegmentoProducto.setVisible(this.isPermisoActualizarSegmentoProducto);	
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonEliminarSegmentoProducto.setVisible(this.isPermisoEliminarSegmentoProducto);
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonCancelarSegmentoProducto.setVisible(this.isVisibilidadCeldaCancelarSegmentoProducto);							
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonGuardarCambiosSegmentoProducto.setVisible((this.isVisibilidadCeldaGuardarSegmentoProducto && this.isPermisoGuardarCambiosSegmentoProducto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSegmentoProducto() {
		if(SegmentoProductoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSegmentoProducto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSegmentoProducto() {
	}
	
	public void jTableDatosSegmentoProductoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSegmentoProducto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSegmentoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSegmentoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSegmentoProducto(this.getsegmentoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSegmentoProducto(this.segmentoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.segmentoproducto =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.segmentoproducto =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.segmentoproducto==null) {
						this.segmentoproducto = new SegmentoProducto();
					}

					this.setVariablesFormularioToObjetoActualSegmentoProducto(this.segmentoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSegmentoProducto(this.segmentoproducto);
				}

				if(this.segmentoproducto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.segmentoproducto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSegmentoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaSegmentoProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebSegmentoProducto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSegmentoProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSegmentoProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSegmentoProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproducto =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.segmentoproducto =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSegmentoProducto(this.getsegmentoproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSegmentoProducto(this.segmentoproducto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.segmentoproductoLogic.getConnexion());

				if(this.segmentoproducto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.segmentoproducto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSegmentoProducto=(TitledBorder)this.jScrollPanelDatosSegmentoProducto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderSegmentoProducto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaSegmentoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSegmentoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSegmentoProducto(this.getsegmentoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSegmentoProducto(this.segmentoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.segmentoproducto =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.segmentoproducto =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.segmentoproducto==null) {
						this.segmentoproducto = new SegmentoProducto();
					}

					this.setVariablesFormularioToObjetoActualSegmentoProducto(this.segmentoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSegmentoProducto(this.segmentoproducto);
				}

				if(this.segmentoproducto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.segmentoproducto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSegmentoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_productoSegmentoProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoproducto=true;

			idTienePermisotipoproducto=this.tienePermisosUsuarioEnPaginaWebSegmentoProducto(TipoProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSegmentoProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSegmentoProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSegmentoProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproducto =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.segmentoproducto =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSegmentoProducto(this.getsegmentoproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSegmentoProducto(this.segmentoproducto);

				this.tipoproductoBeanSwingJInternalFrame=new TipoProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoproductoBeanSwingJInternalFrame.getTipoProductoLogic().setConnexion(this.segmentoproductoLogic.getConnexion());

				if(this.segmentoproducto.getid_tipo_producto()!=null) {
					this.tipoproductoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoproductoBeanSwingJInternalFrame.setIdActual(this.segmentoproducto.getid_tipo_producto());
					this.tipoproductoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoproductoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoProducto();
				}

				JInternalFrameBase jinternalFrame =this.tipoproductoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSegmentoProducto=(TitledBorder)this.jScrollPanelDatosSegmentoProducto.getBorder();
				TitledBorder titledBordertipoproducto=(TitledBorder)this.tipoproductoBeanSwingJInternalFrame.jScrollPanelDatosTipoProducto.getBorder();

				titledBordertipoproducto.setTitle(titledBorderSegmentoProducto.getTitle() + " -> Tipo Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_productoSegmentoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSegmentoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSegmentoProducto(this.getsegmentoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSegmentoProducto(this.segmentoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.segmentoproducto =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.segmentoproducto =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.segmentoproducto==null) {
						this.segmentoproducto = new SegmentoProducto();
					}

					this.setVariablesFormularioToObjetoActualSegmentoProducto(this.segmentoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSegmentoProducto(this.segmentoproducto);
				}

				if(this.segmentoproducto.getid_tipo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_producto = "+this.segmentoproducto.getid_tipo_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSegmentoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoSegmentoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSegmentoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSegmentoProducto(this.getsegmentoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSegmentoProducto(this.segmentoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.segmentoproducto =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.segmentoproducto =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.segmentoproducto==null) {
						this.segmentoproducto = new SegmentoProducto();
					}

					this.setVariablesFormularioToObjetoActualSegmentoProducto(this.segmentoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSegmentoProducto(this.segmentoproducto);
				}

				if(this.segmentoproducto.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.segmentoproducto.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSegmentoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreSegmentoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSegmentoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSegmentoProducto(this.getsegmentoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSegmentoProducto(this.segmentoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.segmentoproducto =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.segmentoproducto =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.segmentoproducto==null) {
						this.segmentoproducto = new SegmentoProducto();
					}

					this.setVariablesFormularioToObjetoActualSegmentoProducto(this.segmentoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSegmentoProducto(this.segmentoproducto);
				}

				if(this.segmentoproducto.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.segmentoproducto.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSegmentoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoSegmentoProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSegmentoProducto(false,false);

			this.getSegmentoProductosBusquedaPorCodigo();

			this.inicializarActualizarBindingSegmentoProducto(false);

			//if(SegmentoProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSegmentoProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreSegmentoProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSegmentoProducto(false,false);

			this.getSegmentoProductosBusquedaPorNombre();

			this.inicializarActualizarBindingSegmentoProducto(false);

			//if(SegmentoProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSegmentoProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaSegmentoProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSegmentoProducto(false,false);

			this.getSegmentoProductosFK_IdEmpresa();

			this.inicializarActualizarBindingSegmentoProducto(false);

			//if(SegmentoProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSegmentoProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoProductoSegmentoProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSegmentoProducto(false,false);

			this.getSegmentoProductosFK_IdTipoProducto();

			this.inicializarActualizarBindingSegmentoProducto(false);

			//if(SegmentoProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSegmentoProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.segmentoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameSegmentoProducto() {
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
		

		if(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
			this.jInternalFrameDetalleFormSegmentoProducto.setVisible(false);	    			
			this.jInternalFrameDetalleFormSegmentoProducto.dispose();
			this.jInternalFrameDetalleFormSegmentoProducto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSegmentoProducto!=null) {
			this.jInternalFrameReporteDinamicoSegmentoProducto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSegmentoProducto.dispose();
			this.jInternalFrameReporteDinamicoSegmentoProducto=null;
		}
		
		if(this.jInternalFrameImportacionSegmentoProducto!=null) {
			this.jInternalFrameImportacionSegmentoProducto.setVisible(false);	    			
			this.jInternalFrameImportacionSegmentoProducto.dispose();
			this.jInternalFrameImportacionSegmentoProducto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSegmentoProducto();
			
			SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
			
			
			if(sTipo.equals("NuevoSegmentoProducto")) {
				jButtonNuevoSegmentoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSegmentoProducto")) {
				jButtonDuplicarSegmentoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSegmentoProducto")) {
				jButtonCopiarSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormSegmentoProducto")) {
				jButtonVerFormSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSegmentoProducto")) {
				jButtonNuevoSegmentoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSegmentoProducto")) {
				jButtonDuplicarSegmentoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSegmentoProducto")) {
				jButtonNuevoSegmentoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSegmentoProducto")) {
				jButtonDuplicarSegmentoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSegmentoProducto")) {
				jButtonNuevoSegmentoProductoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSegmentoProducto")) {
				jButtonNuevoSegmentoProductoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSegmentoProducto")) {
				jButtonNuevoSegmentoProductoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSegmentoProducto")) {
				jButtonModificarSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSegmentoProducto")) {
				jButtonModificarSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSegmentoProducto")) {
				jButtonModificarSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSegmentoProducto")) {
				jButtonActualizarSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSegmentoProducto")) {
				jButtonActualizarSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSegmentoProducto")) {
				jButtonActualizarSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarSegmentoProducto")) {
				jButtonEliminarSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSegmentoProducto")) {
				jButtonEliminarSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSegmentoProducto")) {
				jButtonEliminarSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarSegmentoProducto")) {
				jButtonCancelarSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSegmentoProducto")) {
				jButtonCancelarSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSegmentoProducto")) {
				jButtonCancelarSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarSegmentoProducto")) {
				jButtonCerrarSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSegmentoProducto")) {
				jButtonCerrarSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSegmentoProducto")) {
				jButtonCerrarSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSegmentoProducto")) {
				jButtonMostrarOcultarSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSegmentoProducto")) {
				jButtonCancelarSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSegmentoProducto")) {
				jButtonGuardarCambiosSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSegmentoProducto")) {
				jButtonGuardarCambiosSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSegmentoProducto")) {
				jButtonCopiarSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSegmentoProducto")) {
				jButtonVerFormSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSegmentoProducto")) {
				jButtonGuardarCambiosSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSegmentoProducto")) {
				jButtonCopiarSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSegmentoProducto")) {
				jButtonVerFormSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSegmentoProducto")) {
				jButtonGuardarCambiosSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSegmentoProducto")) {
				jButtonGuardarCambiosSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSegmentoProducto")) {
				jButtonGuardarCambiosSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSegmentoProducto")) {
				jButtonRecargarInformacionSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSegmentoProducto")) {
				jButtonRecargarInformacionSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSegmentoProducto")) {
				jButtonRecargarInformacionSegmentoProductoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSegmentoProducto")) {
				jButtonAnterioresSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSegmentoProducto")) {
				jButtonAnterioresSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSegmentoProducto")) {
				jButtonAnterioresSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSegmentoProducto")) {
				jButtonSiguientesSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSegmentoProducto")) {
				jButtonSiguientesSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSegmentoProducto")) {
				jButtonSiguientesSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySegmentoProducto") || sTipo.equals("MenuItemDetalleAbrirOrderBySegmentoProducto")) {
				jButtonAbrirOrderBySegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSegmentoProducto") || sTipo.equals("MenuItemDetalleMostrarOcultarSegmentoProducto")) {
				jButtonMostrarOcultarSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSegmentoProducto")) {
				jButtonNuevoGuardarCambiosSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSegmentoProducto")) {
				jButtonNuevoGuardarCambiosSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSegmentoProducto")) {
				jButtonNuevoGuardarCambiosSegmentoProductoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSegmentoProducto")) {
				jButtonCerrarReporteDinamicoSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSegmentoProducto")) {
				jButtonGenerarReporteDinamicoSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSegmentoProducto")) {
				
				jButtonGenerarExcelReporteDinamicoSegmentoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSegmentoProducto")) {
				jButtonCerrarImportacionSegmentoProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSegmentoProducto")) {
				
				jButtonGenerarImportacionSegmentoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSegmentoProducto")) {
				
				jButtonAbrirImportacionSegmentoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSegmentoProducto")) {
				jComboBoxTiposAccionesSegmentoProductoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSegmentoProducto")) {
				jComboBoxTiposRelacionesSegmentoProductoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSegmentoProducto")) {
				jComboBoxTiposAccionesSegmentoProductoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSegmentoProducto")) {
				
				jComboBoxTiposSeleccionarSegmentoProductoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSegmentoProducto")) {
				jTextFieldValorCampoGeneralSegmentoProductoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySegmentoProducto")) {
				jButtonAbrirOrderBySegmentoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSegmentoProducto")) {
				jButtonAbrirOrderBySegmentoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySegmentoProducto")) {
				jButtonCerrarOrderBySegmentoProductoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSegmentoProductoBusqueda")) {
				this.jButtonidSegmentoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSegmentoProductoUpdate")) {
				this.jButtonid_empresaSegmentoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSegmentoProductoBusqueda")) {
				this.jButtonid_empresaSegmentoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_productoSegmentoProductoUpdate")) {
				this.jButtonid_tipo_productoSegmentoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_productoSegmentoProductoBusqueda")) {
				this.jButtonid_tipo_productoSegmentoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoSegmentoProductoBusqueda")) {
				this.jButtoncodigoSegmentoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreSegmentoProductoBusqueda")) {
				this.jButtonnombreSegmentoProductoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoSegmentoProducto")) {
				this.jButtonBusquedaPorCodigoSegmentoProductoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreSegmentoProducto")) {
				this.jButtonBusquedaPorNombreSegmentoProductoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoProductoSegmentoProducto")) {
				this.jButtonFK_IdTipoProductoSegmentoProductoActionPerformed(evt);
			}
			
			;
			
			
			SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSegmentoProducto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSegmentoProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.segmentoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.segmentoproducto);
				
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
				
				


				
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SegmentoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SegmentoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			SegmentoProducto segmentoproductoLocal=null;
			
			if(!this.getEsControlTabla()) {
				segmentoproductoLocal=this.segmentoproducto;
			} else {
				segmentoproductoLocal=this.segmentoproductoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.segmentoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.segmentoproducto);
				
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
							
				
				


				
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SegmentoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SegmentoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSegmentoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSegmentoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoAnterior =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.segmentoproductoAnterior =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
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
			
			SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
			
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
			
			


			
			SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSegmentoProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.segmentoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.segmentoproducto);
				
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
								
						
				


				
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SegmentoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SegmentoProducto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.segmentoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.segmentoproducto);
				
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
								
				
				


				
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SegmentoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SegmentoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSegmentoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSegmentoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoAnterior =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.segmentoproductoAnterior =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.segmentoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.segmentoproducto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSegmentoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSegmentoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoAnterior =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.segmentoproductoAnterior =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSegmentoProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.segmentoproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.segmentoproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.segmentoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.segmentoproducto);
				
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
							
				
				


				
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SegmentoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SegmentoProducto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSegmentoProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSegmentoProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.segmentoproductoAnterior =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.segmentoproductoAnterior =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
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
			
			SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
			
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
			
			


			
			SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSegmentoProductoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.segmentoproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.segmentoproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.segmentoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.segmentoproducto);
				
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
								
				
				


				
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SegmentoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SegmentoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSegmentoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSegmentoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoAnterior =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.segmentoproductoAnterior =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSegmentoProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.segmentoproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.segmentoproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSegmentoProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.segmentoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.segmentoproducto);
				
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSegmentoProducto")) {
					jCheckBoxSeleccionarTodosSegmentoProductoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSegmentoProducto")) {
					jCheckBoxSeleccionadosSegmentoProductoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSegmentoProducto")) {
					
				}
				
				


				
				
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SegmentoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SegmentoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.segmentoproducto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.segmentoproducto);
				
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
												
				
				


				
				
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SegmentoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SegmentoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSegmentoProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSegmentoProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.segmentoproductoAnterior =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.segmentoproductoAnterior =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSegmentoProductoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.segmentoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.segmentoproducto);
				
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
				
				
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
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
			
			SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
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
			
			


			
			SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSegmentoProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.segmentoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.segmentoproducto);
				
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SegmentoProducto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SegmentoProducto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.segmentoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.segmentoproducto);
				
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
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
				
				


				
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SegmentoProducto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SegmentoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSegmentoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSegmentoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.segmentoproductoAnterior =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.segmentoproductoAnterior =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSegmentoProducto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSegmentoProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSegmentoProducto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.segmentoproducto =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.segmentoproducto =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.segmentoproducto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSegmentoProducto")) {
				
				}
				
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSegmentoProducto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSegmentoProducto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSegmentoProducto")) {
			
			}
			
			SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSegmentoProducto();
			
			SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
			
			if(sTipo.equals("NuevoSegmentoProducto")) {
				jButtonNuevoSegmentoProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSegmentoProducto")) {
				jButtonDuplicarSegmentoProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSegmentoProducto")) {
				jButtonCopiarSegmentoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSegmentoProducto")) {
				jButtonVerFormSegmentoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSegmentoProducto")) {
				jButtonNuevoSegmentoProductoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSegmentoProducto")) {
				jButtonModificarSegmentoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSegmentoProducto")) {
				jButtonActualizarSegmentoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSegmentoProducto")) {
				jButtonEliminarSegmentoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSegmentoProducto")) {
				jButtonGuardarCambiosSegmentoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSegmentoProducto")) {
				jButtonCancelarSegmentoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSegmentoProducto")) {
				jButtonCerrarSegmentoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSegmentoProducto")) {
				jButtonGuardarCambiosSegmentoProductoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSegmentoProducto")) {
				jButtonNuevoGuardarCambiosSegmentoProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySegmentoProducto")) {
				jButtonAbrirOrderBySegmentoProductoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSegmentoProducto")) {
				jButtonRecargarInformacionSegmentoProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSegmentoProducto")) {
				jButtonAnterioresSegmentoProductoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSegmentoProducto")) {
				jButtonSiguientesSegmentoProductoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSegmentoProductoBusqueda")) {
				this.jButtonidSegmentoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSegmentoProductoUpdate")) {
				this.jButtonid_empresaSegmentoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSegmentoProductoBusqueda")) {
				this.jButtonid_empresaSegmentoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_productoSegmentoProductoUpdate")) {
				this.jButtonid_tipo_productoSegmentoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_productoSegmentoProductoBusqueda")) {
				this.jButtonid_tipo_productoSegmentoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoSegmentoProductoBusqueda")) {
				this.jButtoncodigoSegmentoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreSegmentoProductoBusqueda")) {
				this.jButtonnombreSegmentoProductoBusquedaActionPerformed(evt);
			}
			
			SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSegmentoProducto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSegmentoProducto")) {
				closingInternalFrameSegmentoProducto();
				
			} else if(sTipo.equals("jButtonCancelarSegmentoProducto")) {
				JInternalFrameBase jInternalFrameDetalleFormSegmentoProducto = (JInternalFrameBase)evt.getSource();
	            	
	            SegmentoProductoBeanSwingJInternalFrame jInternalFrameParent=(SegmentoProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormSegmentoProducto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSegmentoProductoActionPerformed(null);
			}
			
			SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.segmentoproducto,new Object(),this.segmentoproductoParameterGeneral,this.segmentoproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSegmentoProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSegmentoProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSegmentoProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.segmentoproducto)) {
			if(!esControlTabla) {
				if(SegmentoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSegmentoProducto(this.segmentoproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSegmentoProducto(this.segmentoproducto);			
				}
				
				if(this.segmentoproductoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSegmentoProducto(this.segmentoproducto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.segmentoproductoReturnGeneral=segmentoproductoLogic.procesarEventosSegmentoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.segmentoproductoLogic.getSegmentoProductos(),this.segmentoproducto,this.segmentoproductoParameterGeneral,this.isEsNuevoSegmentoProducto,classes);//this.segmentoproductoLogic.getSegmentoProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSegmentoProducto(this.segmentoproductoReturnGeneral,this.segmentoproductoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.segmentoproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSegmentoProducto(classes,this.segmentoproductoReturnGeneral,this.segmentoproductoBean,false);
					}
						
					if(this.segmentoproductoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySegmentoProducto(this.segmentoproductoReturnGeneral.getSegmentoProducto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSegmentoProducto(this.segmentoproductoReturnGeneral.getSegmentoProducto());	
					}
						
					if(this.segmentoproductoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSegmentoProducto(this.segmentoproductoReturnGeneral.getSegmentoProducto(),classes);//this.segmentoproductoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSegmentoProducto(this.segmentoproducto,classes);//this.segmentoproductoBean);									
				}
			
				if(SegmentoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSegmentoProducto(this.segmentoproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSegmentoProducto(this.segmentoproducto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.segmentoproductoAnterior!=null) {
						this.segmentoproducto=this.segmentoproductoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.segmentoproductoReturnGeneral=segmentoproductoLogic.procesarEventosSegmentoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.segmentoproductoLogic.getSegmentoProductos(),this.segmentoproducto,this.segmentoproductoParameterGeneral,this.isEsNuevoSegmentoProducto,classes);//this.segmentoproductoLogic.getSegmentoProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.segmentoproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.segmentoproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.segmentoproductoReturnGeneral.getSegmentoProducto(),segmentoproductoLogic.getSegmentoProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.segmentoproductoReturnGeneral.getSegmentoProducto(),this.segmentoproductos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSegmentoProducto.repaint();
				
				//((AbstractTableModel) this.jTableDatosSegmentoProducto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSegmentoProducto();
			}
		}
	}
	
	public void actualizarVisualTableDatosSegmentoProducto() throws Exception {
		
		SegmentoProductoModel segmentoproductoModel=(SegmentoProductoModel)this.jTableDatosSegmentoProducto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			segmentoproductoModel.segmentoproductos=this.segmentoproductoLogic.getSegmentoProductos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			segmentoproductoModel.segmentoproductos=this.segmentoproductos;
		}
		
		
		((SegmentoProductoModel) this.jTableDatosSegmentoProducto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSegmentoProducto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsegmentoproductoAnterior(),this.segmentoproductoLogic.getSegmentoProductos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsegmentoproductoAnterior(),this.segmentoproductos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSegmentoProducto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSegmentoProducto(SegmentoProducto segmentoproducto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(segmentoproducto.getProductos());
					this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(segmentoproducto.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
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
										
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.segmentoproducto,new Object(),generalEntityParameterGeneral,this.segmentoproductoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.segmentoproductoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SegmentoProductoConstantesFunciones.getClassesRelationshipsOfSegmentoProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SegmentoProductoConstantesFunciones.getClassesRelationshipsFromStringsOfSegmentoProducto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSegmentoProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SegmentoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.segmentoproducto,new Object(),generalEntityParameterGeneral,this.segmentoproductoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSegmentoProducto(SegmentoProductoBean segmentoproductoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(segmentoproducto.getProductos());
					this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(segmentoproducto.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSegmentoProducto(ArrayList<Classe> classes,SegmentoProductoReturnGeneral segmentoproductoReturnGeneral,SegmentoProductoBean segmentoproductoBean,Boolean conDefault) throws Exception {
		
			this.segmentoproductoBean.setProductos(segmentoproductoReturnGeneral.getSegmentoProducto().getProductos());
			this.segmentoproductoBean.setParametroInventarioDefectos(segmentoproductoReturnGeneral.getSegmentoProducto().getParametroInventarioDefectos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSegmentoProducto(SegmentoProducto segmentoproducto,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					segmentoproducto.setProductos(this.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					segmentoproducto.setParametroInventarioDefectos(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.segmentoproducto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSegmentoProducto = new SegmentoProductoDetalleFormJInternalFrame(jDesktopPane,this.segmentoproductoSessionBean.getConGuardarRelaciones(),this.segmentoproductoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSegmentoProducto);
		this.jInternalFrameDetalleFormSegmentoProducto.setVisible(false);
		this.jInternalFrameDetalleFormSegmentoProducto.setSelected(false);						
		
		this.jInternalFrameDetalleFormSegmentoProducto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSegmentoProducto.segmentoproductoLogic=this.segmentoproductoLogic;
		
		this.cargarCombosFrameForeignKeySegmentoProducto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSegmentoProducto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSegmentoProducto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySegmentoProducto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySegmentoProducto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSegmentoProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSegmentoProducto"));
		
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonModificarSegmentoProducto.addActionListener(new ButtonActionListener(this,"ModificarSegmentoProducto"));

		
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonModificarToolBarSegmentoProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarSegmentoProducto"));
					
		this.jInternalFrameDetalleFormSegmentoProducto.jMenuItemModificarSegmentoProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarSegmentoProducto"));		
		
		
		
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonActualizarSegmentoProducto.addActionListener (new ButtonActionListener(this,"ActualizarSegmentoProducto"));
		
		
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonActualizarToolBarSegmentoProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSegmentoProducto"));
						
		this.jInternalFrameDetalleFormSegmentoProducto.jMenuItemActualizarSegmentoProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSegmentoProducto"));		
		
		
		
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonEliminarSegmentoProducto.addActionListener (new ButtonActionListener(this,"EliminarSegmentoProducto"));
		
		
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonEliminarToolBarSegmentoProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarSegmentoProducto"));
								
		this.jInternalFrameDetalleFormSegmentoProducto.jMenuItemEliminarSegmentoProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSegmentoProducto"));		
		
		
		
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonCancelarSegmentoProducto.addActionListener (new ButtonActionListener(this,"CancelarSegmentoProducto"));
		
		
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonCancelarToolBarSegmentoProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarSegmentoProducto"));
					
		this.jInternalFrameDetalleFormSegmentoProducto.jMenuItemCancelarSegmentoProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSegmentoProducto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSegmentoProducto.jMenuItemDetalleCerrarSegmentoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSegmentoProducto"));		
		
		
		
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonGuardarCambiosToolBarSegmentoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSegmentoProducto"));
		
		
		
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonGuardarCambiosToolBarSegmentoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSegmentoProducto"));
		
		
		
		this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxTiposAccionesFormularioSegmentoProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSegmentoProducto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonidSegmentoProductoBusqueda.addActionListener(new ButtonActionListener(this,"idSegmentoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonid_empresaSegmentoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSegmentoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonid_empresaSegmentoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSegmentoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonid_tipo_productoSegmentoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_productoSegmentoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonid_tipo_productoSegmentoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_productoSegmentoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSegmentoProducto.jButtoncodigoSegmentoProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoSegmentoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonnombreSegmentoProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreSegmentoProductoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSegmentoProducto.jTabbedPaneRelacionesSegmentoProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSegmentoProducto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSegmentoProducto"));
		
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSegmentoProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSegmentoProducto"));
		}
		
		this.jTableDatosSegmentoProducto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSegmentoProducto"));
		
		this.jTableDatosSegmentoProducto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSegmentoProducto"));
		
		this.jButtonNuevoSegmentoProducto.addActionListener(new ButtonActionListener(this,"NuevoSegmentoProducto"));
		
		this.jButtonDuplicarSegmentoProducto.addActionListener(new ButtonActionListener(this,"DuplicarSegmentoProducto"));
		
		this.jButtonCopiarSegmentoProducto.addActionListener(new ButtonActionListener(this,"CopiarSegmentoProducto"));
		
		this.jButtonVerFormSegmentoProducto.addActionListener(new ButtonActionListener(this,"VerFormSegmentoProducto"));
		
		
		this.jButtonNuevoToolBarSegmentoProducto.addActionListener(new ButtonActionListener(this,"NuevoToolBarSegmentoProducto"));
			
		this.jButtonDuplicarToolBarSegmentoProducto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSegmentoProducto"));
			
		this.jMenuItemNuevoSegmentoProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSegmentoProducto"));
			
		this.jMenuItemDuplicarSegmentoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSegmentoProducto"));		
		
		
		this.jButtonNuevoRelacionesSegmentoProducto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSegmentoProducto"));
		
		
		this.jButtonNuevoRelacionesToolBarSegmentoProducto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSegmentoProducto"));
			
		this.jMenuItemNuevoRelacionesSegmentoProducto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSegmentoProducto"));		
		
		
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonModificarSegmentoProducto.addActionListener(new ButtonActionListener(this,"ModificarSegmentoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonModificarToolBarSegmentoProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarSegmentoProducto"));
			
			this.jInternalFrameDetalleFormSegmentoProducto.jMenuItemModificarSegmentoProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarSegmentoProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonActualizarSegmentoProducto.addActionListener (new ButtonActionListener(this,"ActualizarSegmentoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonActualizarToolBarSegmentoProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSegmentoProducto"));
				
			this.jInternalFrameDetalleFormSegmentoProducto.jMenuItemActualizarSegmentoProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSegmentoProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonEliminarSegmentoProducto.addActionListener (new ButtonActionListener(this,"EliminarSegmentoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonEliminarToolBarSegmentoProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarSegmentoProducto"));
						
			this.jInternalFrameDetalleFormSegmentoProducto.jMenuItemEliminarSegmentoProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSegmentoProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonCancelarSegmentoProducto.addActionListener (new ButtonActionListener(this,"CancelarSegmentoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonCancelarToolBarSegmentoProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarSegmentoProducto"));
			
			this.jInternalFrameDetalleFormSegmentoProducto.jMenuItemCancelarSegmentoProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSegmentoProducto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSegmentoProducto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSegmentoProducto"));		
		
		
		this.jButtonCerrarSegmentoProducto.addActionListener (new ButtonActionListener(this,"CerrarSegmentoProducto"));
		
		
		this.jButtonCerrarToolBarSegmentoProducto.addActionListener (new ButtonActionListener(this,"CerrarToolBarSegmentoProducto"));
			
		this.jMenuItemCerrarSegmentoProducto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSegmentoProducto"));
			
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSegmentoProducto.jMenuItemDetalleCerrarSegmentoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSegmentoProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonGuardarCambiosSegmentoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosSegmentoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSegmentoProducto.jButtonGuardarCambiosToolBarSegmentoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSegmentoProducto"));
		}
		
		this.jButtonCopiarToolBarSegmentoProducto.addActionListener (new ButtonActionListener(this,"CopiarToolBarSegmentoProducto"));
			
		this.jButtonVerFormToolBarSegmentoProducto.addActionListener (new ButtonActionListener(this,"VerFormToolBarSegmentoProducto"));
		
		this.jMenuItemGuardarCambiosSegmentoProducto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSegmentoProducto"));
			
		this.jMenuItemCopiarSegmentoProducto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSegmentoProducto"));		
		
		this.jMenuItemVerFormSegmentoProducto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSegmentoProducto"));		
		
		
		this.jButtonGuardarCambiosTablaSegmentoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSegmentoProducto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSegmentoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSegmentoProducto"));
			
		this.jMenuItemGuardarCambiosTablaSegmentoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSegmentoProducto"));		
		
		
		
		this.jButtonRecargarInformacionSegmentoProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionSegmentoProducto"));
					
		this.jButtonRecargarInformacionToolBarSegmentoProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSegmentoProducto"));
		
		this.jMenuItemRecargarInformacionSegmentoProducto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSegmentoProducto"));		
		
		
		
		this.jButtonAnterioresSegmentoProducto.addActionListener (new ButtonActionListener(this,"AnterioresSegmentoProducto"));
		
		
		this.jButtonAnterioresToolBarSegmentoProducto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSegmentoProducto"));
		
		this.jMenuItemAnterioresSegmentoProducto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSegmentoProducto"));		
		
		
		this.jButtonSiguientesSegmentoProducto.addActionListener (new ButtonActionListener(this,"SiguientesSegmentoProducto"));
		
		
		this.jButtonSiguientesToolBarSegmentoProducto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSegmentoProducto"));
			
		this.jMenuItemSiguientesSegmentoProducto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSegmentoProducto"));
			
		this.jMenuItemAbrirOrderBySegmentoProducto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySegmentoProducto"));
			
		this.jMenuItemMostrarOcultarSegmentoProducto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSegmentoProducto"));
			
		this.jMenuItemDetalleAbrirOrderBySegmentoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySegmentoProducto"));
			
		this.jMenuItemDetalleMostarOcultarSegmentoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSegmentoProducto"));		
		
		
		this.jButtonNuevoGuardarCambiosSegmentoProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSegmentoProducto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSegmentoProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSegmentoProducto"));
			
		this.jMenuItemNuevoGuardarCambiosSegmentoProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSegmentoProducto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSegmentoProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSegmentoProducto"));

		this.jCheckBoxSeleccionadosSegmentoProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSegmentoProducto"));
		
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxTiposAccionesFormularioSegmentoProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSegmentoProducto"));
		}
		
		
		this.jComboBoxTiposRelacionesSegmentoProducto.addActionListener (new ButtonActionListener(this,"TiposRelacionesSegmentoProducto"));
			
		this.jComboBoxTiposAccionesSegmentoProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesSegmentoProducto"));
					
		this.jComboBoxTiposSeleccionarSegmentoProducto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSegmentoProducto"));
			
		this.jTextFieldValorCampoGeneralSegmentoProducto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSegmentoProducto"));		
		
		
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonidSegmentoProductoBusqueda.addActionListener(new ButtonActionListener(this,"idSegmentoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonid_empresaSegmentoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSegmentoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonid_empresaSegmentoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSegmentoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonid_tipo_productoSegmentoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_productoSegmentoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonid_tipo_productoSegmentoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_productoSegmentoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSegmentoProducto.jButtoncodigoSegmentoProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoSegmentoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonnombreSegmentoProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreSegmentoProductoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoSegmentoProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoSegmentoProducto"));

			this.jButtonBusquedaPorNombreSegmentoProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreSegmentoProducto"));

			this.jButtonFK_IdTipoProductoSegmentoProducto.addActionListener(new ButtonActionListener(this,"FK_IdTipoProductoSegmentoProducto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSegmentoProducto!=null) {
				this.jInternalFrameReporteDinamicoSegmentoProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSegmentoProducto"));
				this.jInternalFrameReporteDinamicoSegmentoProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSegmentoProducto"));
				this.jInternalFrameReporteDinamicoSegmentoProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSegmentoProducto"));
			}
			
			//this.jButtonCerrarReporteDinamicoSegmentoProducto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSegmentoProducto"));				
			//this.jButtonGenerarReporteDinamicoSegmentoProducto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSegmentoProducto"));
			//this.jButtonGenerarExcelReporteDinamicoSegmentoProducto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSegmentoProducto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSegmentoProducto!=null) {
				this.jInternalFrameImportacionSegmentoProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSegmentoProducto"));
				this.jInternalFrameImportacionSegmentoProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSegmentoProducto"));
				this.jInternalFrameImportacionSegmentoProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSegmentoProducto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySegmentoProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderBySegmentoProducto"));
			
			this.jButtonAbrirOrderByToolBarSegmentoProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSegmentoProducto"));			
			
			if(this.jInternalFrameOrderBySegmentoProducto!=null) {
				this.jInternalFrameOrderBySegmentoProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySegmentoProducto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSegmentoProducto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSegmentoProducto.jTabbedPaneRelacionesSegmentoProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSegmentoProducto"));
		
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
            		closingInternalFrameSegmentoProducto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSegmentoProducto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSegmentoProducto = (JInternalFrameBase)event.getSource();
	            	
	            SegmentoProductoBeanSwingJInternalFrame jInternalFrameParent=(SegmentoProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormSegmentoProducto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSegmentoProductoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSegmentoProducto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSegmentoProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSegmentoProducto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSegmentoProducto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSegmentoProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSegmentoProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSegmentoProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSegmentoProducto";
		inputMap = this.jButtonNuevoSegmentoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSegmentoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSegmentoProductoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSegmentoProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSegmentoProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSegmentoProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSegmentoProducto";
		inputMap = this.jButtonNuevoRelacionesSegmentoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSegmentoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSegmentoProductoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSegmentoProducto";
		inputMap = this.jButtonModificarSegmentoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSegmentoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSegmentoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSegmentoProducto";
		inputMap = this.jButtonActualizarSegmentoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSegmentoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSegmentoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSegmentoProducto";
		inputMap = this.jButtonEliminarSegmentoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSegmentoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSegmentoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSegmentoProducto";
		inputMap = this.jButtonCancelarSegmentoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSegmentoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSegmentoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSegmentoProducto";
		inputMap = this.jButtonCerrarSegmentoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSegmentoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSegmentoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonGuardarCambiosSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSegmentoProducto";
		inputMap = this.jInternalFrameDetalleFormSegmentoProducto.jButtonGuardarCambiosSegmentoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonGuardarCambiosSegmentoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSegmentoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSegmentoProducto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSegmentoProductoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSegmentoProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSegmentoProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSegmentoProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSegmentoProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSegmentoProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSegmentoProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonidSegmentoProductoBusqueda.addActionListener(new ButtonActionListener(this,"idSegmentoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonid_empresaSegmentoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSegmentoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonid_empresaSegmentoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSegmentoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonid_tipo_productoSegmentoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_productoSegmentoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonid_tipo_productoSegmentoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_productoSegmentoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSegmentoProducto.jButtoncodigoSegmentoProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoSegmentoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSegmentoProducto.jButtonnombreSegmentoProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreSegmentoProductoBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoSegmentoProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoSegmentoProducto"));

		this.jButtonBusquedaPorNombreSegmentoProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreSegmentoProducto"));

		this.jButtonFK_IdTipoProductoSegmentoProducto.addActionListener(new ButtonActionListener(this,"FK_IdTipoProductoSegmentoProducto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSegmentoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSegmentoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSegmentoProductoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSegmentoProducto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSegmentoProducto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(SegmentoProducto segmentoproductoAux:this.segmentoproductoLogic.getSegmentoProductos()) {
					segmentoproductoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SegmentoProducto segmentoproductoAux:segmentoproductos) {
					segmentoproductoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSegmentoProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSegmentoProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SegmentoProducto segmentoproductoAux:this.segmentoproductoLogic.getSegmentoProductos()) {
						segmentoproductoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SegmentoProducto segmentoproductoAux:segmentoproductos) {
						segmentoproductoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(SegmentoProducto segmentoproductoAux:this.segmentoproductoLogic.getSegmentoProductos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SegmentoProducto segmentoproductoAux:segmentoproductos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSegmentoProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSegmentoProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSegmentoProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSegmentoProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSegmentoProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSegmentoProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSegmentoProducto.getSelectedRows();
			
			SegmentoProducto segmentoproductoLocal=new SegmentoProducto();
			
			//this.seleccionarTodosSegmentoProducto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					segmentoproductoLocal =(SegmentoProducto) this.segmentoproductoLogic.getSegmentoProductos().toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					segmentoproductoLocal =(SegmentoProducto) this.segmentoproductos.toArray()[this.jTableDatosSegmentoProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				segmentoproductoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SegmentoProducto segmentoproductoAux:this.segmentoproductoLogic.getSegmentoProductos()) {
						segmentoproductoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SegmentoProducto segmentoproductoAux:segmentoproductos) {
						segmentoproductoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSegmentoProducto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSegmentoProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSegmentoProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSegmentoProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSegmentoProductoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSegmentoProductoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSegmentoProductoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSegmentoProducto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSegmentoProducto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SegmentoProducto segmentoproductoAux:this.segmentoproductoLogic.getSegmentoProductos()) {
				
						if(sTipoSeleccionar.equals(SegmentoProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							segmentoproductoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SegmentoProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							segmentoproductoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SegmentoProducto segmentoproductoAux:segmentoproductos) {
					
						if(sTipoSeleccionar.equals(SegmentoProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							segmentoproductoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SegmentoProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							segmentoproductoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSegmentoProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSegmentoProductoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSegmentoProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSegmentoProducto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSegmentoProducto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxTiposAccionesFormularioSegmentoProducto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSegmentoProducto) {				
					conSplash=true;//false;										
					
					//this.startProcessSegmentoProducto(conSplash);
				
					this.generarReporteSegmentoProductosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSegmentoProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxTiposAccionesFormularioSegmentoProducto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSegmentoProductosSeleccionados();
				//this.jComboBoxTiposAccionesSegmentoProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSegmentoProductosSeleccionados(false);
				//this.jComboBoxTiposAccionesSegmentoProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSegmentoProductosSeleccionados(true);
				//this.jComboBoxTiposAccionesSegmentoProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSegmentoProducto();
				
				this.exportarSegmentoProductosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSegmentoProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxTiposAccionesFormularioSegmentoProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSegmentoProductos();
				//this.importarSegmentoProductos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSegmentoProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxTiposAccionesFormularioSegmentoProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSegmentoProducto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSegmentoProductosSeleccionados();
				//this.jComboBoxTiposAccionesSegmentoProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Segmento Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSegmentoProducto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSegmentoProducto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySegmentoProducto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Segmento Producto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSegmentoProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxTiposAccionesFormularioSegmentoProducto.setSelectedIndex(0);					
				}	
			} 			
			else if(SegmentoProductoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSegmentoProducto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSegmentoProducto(conSplash);
					
						//this.actualizarParametrosGeneralSegmentoProducto();
						
						this.generarReporteProcesoAccionSegmentoProductosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSegmentoProducto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxTiposAccionesFormularioSegmentoProducto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SegmentoProductoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Segmento ProductoS SELECCIONADOS?", "MANTENIMIENTO DE Segmento Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSegmentoProducto();
				
						this.actualizarParametrosGeneralSegmentoProducto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.segmentoproductoReturnGeneral=segmentoproductoLogic.procesarAccionSegmentoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.segmentoproductoLogic.getSegmentoProductos(),this.segmentoproductoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSegmentoProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSegmentoProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxTiposAccionesFormularioSegmentoProducto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSegmentoProducto();
					
					SegmentoProductoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSegmentoProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSegmentoProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxTiposAccionesFormularioSegmentoProducto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSegmentoProducto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSegmentoProductoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSegmentoProducto();
			
			if(this.jInternalFrameDetalleFormSegmentoProducto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<SegmentoProducto> segmentoproductosSeleccionados=new ArrayList<SegmentoProducto>();		
			SegmentoProducto segmentoproducto=new SegmentoProducto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSegmentoProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSegmentoProducto.getSelectedItem();
			
			
			
			
			segmentoproductosSeleccionados=this.getSegmentoProductosSeleccionados(true);
			//this.sTipoAccion;
			
			if(segmentoproductosSeleccionados.size()==1) {
				for(SegmentoProducto segmentoproductoAux:segmentoproductosSeleccionados) {
					segmentoproducto=segmentoproductoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Producto")) {
					jButtonProductoActionPerformed(null,rowIndex,true,false,segmentoproducto);
				}
				else if(this.sTipoRelacion.equals("Parametro Inventario Defecto")) {
					jButtonParametroInventarioDefectoActionPerformed(null,rowIndex,true,false,segmentoproducto);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSegmentoProducto();
			
      		//this.finishProcessSegmentoProducto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSegmentoProductoReturnGeneral() throws Exception {
		if(this.segmentoproductoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.segmentoproductoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.segmentoproductoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.segmentoproductoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.segmentoproductoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.segmentoproductoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSegmentoProducto(false);
		}
		
		if(this.segmentoproductoReturnGeneral.getConRetornoLista() || this.segmentoproductoReturnGeneral.getConRetornoObjeto()) {
			if(this.segmentoproductoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.segmentoproductoLogic.setSegmentoProductos(this.segmentoproductoReturnGeneral.getSegmentoProductos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.segmentoproductoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.segmentoproductoLogic.setSegmentoProducto(this.segmentoproductoReturnGeneral.getSegmentoProducto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingSegmentoProducto(false);
		}
	}
	
	public void actualizarParametrosGeneralSegmentoProducto() throws Exception {
		
		
	}
	
	public ArrayList<SegmentoProducto> getSegmentoProductosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<SegmentoProducto> segmentoproductosSeleccionados=new ArrayList<SegmentoProducto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSegmentoProducto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(SegmentoProducto segmentoproductoAux:segmentoproductoLogic.getSegmentoProductos()) {
					if(segmentoproductoAux.getIsSelected()) {
						segmentoproductosSeleccionados.add(segmentoproductoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SegmentoProducto segmentoproductoAux:this.segmentoproductos) {
					if(segmentoproductoAux.getIsSelected()) {
						segmentoproductosSeleccionados.add(segmentoproductoAux);				
					}
				}
			}
			
			if(segmentoproductosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						segmentoproductosSeleccionados.addAll(this.segmentoproductoLogic.getSegmentoProductos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						segmentoproductosSeleccionados.addAll(this.segmentoproductos);				
					}
				}
			}
		} else {
			segmentoproductosSeleccionados.add(this.segmentoproducto);
		}
		
		return segmentoproductosSeleccionados;
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
	
	public void generarReporteSegmentoProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSegmentoProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSegmentoProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSegmentoProductosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSegmentoProductosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesSegmentoProductosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Segmento Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSegmentoProductosSeleccionados() throws Exception {
		ArrayList<SegmentoProducto> segmentoproductosSeleccionados=new ArrayList<SegmentoProducto>();		
		
		segmentoproductosSeleccionados=this.getSegmentoProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSegmentoProductos("Todos",segmentoproductosSeleccionados);
		
	}	
	
	public void generarReporteNormalSegmentoProductosSeleccionados() throws Exception {
		ArrayList<SegmentoProducto> segmentoproductosSeleccionados=new ArrayList<SegmentoProducto>();		
		
		segmentoproductosSeleccionados=this.getSegmentoProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSegmentoProductos("Todos",segmentoproductosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSegmentoProductosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<SegmentoProducto> segmentoproductosSeleccionados=new ArrayList<SegmentoProducto>();
		
		segmentoproductosSeleccionados=this.getSegmentoProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSegmentoProductos("Todos",segmentoproductosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSegmentoProductosSeleccionados() throws Exception {
		ArrayList<SegmentoProducto> segmentoproductosSeleccionados=new ArrayList<SegmentoProducto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSegmentoProducto();
		
		
		segmentoproductosSeleccionados=this.getSegmentoProductosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSegmentoProducto();
		
		
		//this.generarReporteSegmentoProductos("Todos",segmentoproductosSeleccionados ,segmentoproductoImplementable,segmentoproductoImplementableHome);
	}
	
	public void mostrarImportacionSegmentoProductos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSegmentoProducto();
		
		this.abrirFrameImportacionSegmentoProducto();		
		
			
		//this.generarReporteSegmentoProductos("Todos",segmentoproductosSeleccionados ,segmentoproductoImplementable,segmentoproductoImplementableHome);
	}
	
	public void importarSegmentoProductos() throws Exception {		
	
	}
	
	public void exportarSegmentoProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSegmentoProductosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSegmentoProductosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSegmentoProductosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Segmento Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSegmentoProductosSeleccionados() throws Exception {
		ArrayList<SegmentoProducto> segmentoproductosSeleccionados=new ArrayList<SegmentoProducto>();		
		
		segmentoproductosSeleccionados=this.getSegmentoProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"segmentoproducto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSegmentoProducto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(SegmentoProducto segmentoproductoAux:segmentoproductosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSegmentoProducto(segmentoproductoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//segmentoproductoAux.setsDetalleGeneralEntityReporte(segmentoproductoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Segmento Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSegmentoProducto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SegmentoProductoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SegmentoProductoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SegmentoProductoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SegmentoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SegmentoProductoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SegmentoProductoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSegmentoProducto(SegmentoProducto segmentoproducto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=segmentoproducto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=segmentoproducto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=segmentoproducto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=segmentoproducto.gettipoproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=segmentoproducto.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=segmentoproducto.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSegmentoProductosSeleccionados() throws Exception {
		ArrayList<SegmentoProducto> segmentoproductosSeleccionados=new ArrayList<SegmentoProducto>();		
		
		segmentoproductosSeleccionados=this.getSegmentoProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"segmentoproducto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("SegmentoProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSegmentoProducto(row);				
				iRow++;
			}				
			
			for(SegmentoProducto segmentoproductoAux:segmentoproductosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSegmentoProducto(segmentoproductoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Segmento Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSegmentoProductosSeleccionados() throws Exception {
		ArrayList<SegmentoProducto> segmentoproductosSeleccionados=new ArrayList<SegmentoProducto>();		
		
		segmentoproductosSeleccionados=this.getSegmentoProductosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"segmentoproducto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("segmentoproductos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("segmentoproducto");
			//elementRoot.appendChild(element);
		
			for(SegmentoProducto segmentoproductoAux:segmentoproductosSeleccionados) {
				element = document.createElement("segmentoproducto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSegmentoProducto(segmentoproductoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Segmento Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSegmentoProducto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SegmentoProductoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SegmentoProductoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SegmentoProductoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(SegmentoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(SegmentoProductoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(SegmentoProductoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSegmentoProducto(SegmentoProducto segmentoproducto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(segmentoproducto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(segmentoproducto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(segmentoproducto.gettipoproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(segmentoproducto.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(segmentoproducto.getnombre());				
	}
	
	public void setFilaDatosExportarXmlSegmentoProducto(SegmentoProducto segmentoproducto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SegmentoProductoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(segmentoproducto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SegmentoProductoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(segmentoproducto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(SegmentoProductoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(segmentoproducto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtipoproducto_descripcion = document.createElement(SegmentoProductoConstantesFunciones.IDTIPOPRODUCTO);
		elementtipoproducto_descripcion.appendChild(document.createTextNode(segmentoproducto.gettipoproducto_descripcion()));
		element.appendChild(elementtipoproducto_descripcion);

		Element elementcodigo = document.createElement(SegmentoProductoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(segmentoproducto.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(SegmentoProductoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(segmentoproducto.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoSegmentoProductosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<SegmentoProducto> segmentoproductosSeleccionados=new ArrayList<SegmentoProducto>();
		
		segmentoproductosSeleccionados=this.getSegmentoProductosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSegmentoProducto(segmentoproductosSeleccionados);
		
		this.generarReporteSegmentoProductos("Todos",segmentoproductosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSegmentoProducto(ArrayList<SegmentoProducto> segmentoproductosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(SegmentoProducto segmentoproductoAux:segmentoproductosSeleccionados) {
				segmentoproductoAux.setsDetalleGeneralEntityReporte(segmentoproductoAux.toString());
			
				if(sTipoSeleccionar.equals(SegmentoProductoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					segmentoproductoAux.setsDescripcionGeneralEntityReporte1(segmentoproductoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SegmentoProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO)) {
					existe=true;
					segmentoproductoAux.setsDescripcionGeneralEntityReporte1(segmentoproductoAux.gettipoproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SegmentoProductoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					segmentoproductoAux.setsDescripcionGeneralEntityReporte1(segmentoproductoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(SegmentoProductoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					segmentoproductoAux.setsDescripcionGeneralEntityReporte1(segmentoproductoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SegmentoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSegmentoProducto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSegmentoProducto=true;
				this.isVisibilidadCeldaNuevoRelacionesSegmentoProducto=true;
				this.isVisibilidadCeldaGuardarCambiosSegmentoProducto=true;
			}
			
			this.isVisibilidadCeldaModificarSegmentoProducto=false;
			this.isVisibilidadCeldaActualizarSegmentoProducto=false;
			this.isVisibilidadCeldaEliminarSegmentoProducto=false;
			this.isVisibilidadCeldaCancelarSegmentoProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSegmentoProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarSegmentoProducto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSegmentoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesSegmentoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosSegmentoProducto=false;
			this.isVisibilidadCeldaModificarSegmentoProducto=false;
			this.isVisibilidadCeldaActualizarSegmentoProducto=true;
			this.isVisibilidadCeldaEliminarSegmentoProducto=false;
			this.isVisibilidadCeldaCancelarSegmentoProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSegmentoProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarSegmentoProducto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSegmentoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesSegmentoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosSegmentoProducto=false;
			this.isVisibilidadCeldaModificarSegmentoProducto=false;
			this.isVisibilidadCeldaActualizarSegmentoProducto=true;
			this.isVisibilidadCeldaEliminarSegmentoProducto=true;
			this.isVisibilidadCeldaCancelarSegmentoProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSegmentoProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarSegmentoProducto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSegmentoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesSegmentoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosSegmentoProducto=false;
			this.isVisibilidadCeldaModificarSegmentoProducto=false;
			this.isVisibilidadCeldaActualizarSegmentoProducto=true;
			this.isVisibilidadCeldaEliminarSegmentoProducto=false;
			this.isVisibilidadCeldaCancelarSegmentoProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSegmentoProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarSegmentoProducto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSegmentoProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesSegmentoProducto=true;
			this.isVisibilidadCeldaGuardarCambiosSegmentoProducto=true;
			this.isVisibilidadCeldaModificarSegmentoProducto=false;
			this.isVisibilidadCeldaActualizarSegmentoProducto=false;
			this.isVisibilidadCeldaEliminarSegmentoProducto=false;
			this.isVisibilidadCeldaCancelarSegmentoProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSegmentoProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarSegmentoProducto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSegmentoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesSegmentoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosSegmentoProducto=false;
			this.isVisibilidadCeldaActualizarSegmentoProducto=false;
			this.isVisibilidadCeldaEliminarSegmentoProducto=false;
			this.isVisibilidadCeldaCancelarSegmentoProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSegmentoProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarSegmentoProducto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSegmentoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesSegmentoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosSegmentoProducto=false;
			this.isVisibilidadCeldaModificarSegmentoProducto=true;
			this.isVisibilidadCeldaActualizarSegmentoProducto=false;
			this.isVisibilidadCeldaEliminarSegmentoProducto=false;
			this.isVisibilidadCeldaCancelarSegmentoProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSegmentoProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarSegmentoProducto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SegmentoProductoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSegmentoProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesSegmentoProducto=true;
			this.isVisibilidadCeldaGuardarCambiosSegmentoProducto=true;
		} else {
			this.actualizarEstadoPanelsSegmentoProducto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSegmentoProducto=false;
			//this.isVisibilidadCeldaVerFormSegmentoProducto=false;
			this.isVisibilidadCeldaDuplicarSegmentoProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!segmentoproductoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSegmentoProducto=false;
		} else {
			this.isVisibilidadCeldaNuevoSegmentoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosSegmentoProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(segmentoproductoSessionBean.getEsGuardarRelacionado()) {
			if(!segmentoproductoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSegmentoProducto=false;												
			}
			
			this.jButtonCerrarSegmentoProducto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSegmentoProducto=false;
		}
		
		if(!this.permiteMantenimiento(this.segmentoproducto)) {
			this.isVisibilidadCeldaActualizarSegmentoProducto=false;
			this.isVisibilidadCeldaEliminarSegmentoProducto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSegmentoProducto() {
		this.isVisibilidadCeldaNuevoSegmentoProducto=false;
		this.isVisibilidadCeldaGuardarCambiosSegmentoProducto=false;
	}
	
	public void actualizarEstadoPanelsSegmentoProducto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSegmentoProducto!=null) {
				this.jScrollPanelDatosEdicionSegmentoProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSegmentoProducto!=null) {
				this.jTabbedPaneBusquedasSegmentoProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSegmentoProducto!=null) {
				this.jScrollPanelDatosSegmentoProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionSegmentoProducto!=null) {
				this.jPanelPaginacionSegmentoProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSegmentoProducto!=null) {
				this.jPanelParametrosReportesSegmentoProducto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSegmentoProducto!=null) {
				this.jScrollPanelDatosEdicionSegmentoProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSegmentoProducto!=null) {
				this.jTabbedPaneBusquedasSegmentoProducto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosSegmentoProducto!=null) {
				this.jScrollPanelDatosSegmentoProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionSegmentoProducto!=null) {
				this.jPanelPaginacionSegmentoProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSegmentoProducto!=null) {
				this.jPanelParametrosReportesSegmentoProducto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSegmentoProducto!=null) {
				this.jScrollPanelDatosEdicionSegmentoProducto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSegmentoProducto!=null) {
				this.jTabbedPaneBusquedasSegmentoProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSegmentoProducto!=null) {
				this.jScrollPanelDatosSegmentoProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionSegmentoProducto!=null) {
				this.jPanelPaginacionSegmentoProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSegmentoProducto!=null) {
				this.jPanelParametrosReportesSegmentoProducto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSegmentoProducto!=null) {
				this.jScrollPanelDatosEdicionSegmentoProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSegmentoProducto!=null) {
				this.jTabbedPaneBusquedasSegmentoProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSegmentoProducto!=null) {
				this.jScrollPanelDatosSegmentoProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionSegmentoProducto!=null) {
				this.jPanelPaginacionSegmentoProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSegmentoProducto!=null) {
				this.jPanelParametrosReportesSegmentoProducto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSegmentoProducto!=null) {
				this.jScrollPanelDatosEdicionSegmentoProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSegmentoProducto!=null) {
				this.jTabbedPaneBusquedasSegmentoProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSegmentoProducto!=null) {
				this.jScrollPanelDatosSegmentoProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionSegmentoProducto!=null) {
				this.jPanelPaginacionSegmentoProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSegmentoProducto!=null) {
				this.jPanelParametrosReportesSegmentoProducto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSegmentoProducto!=null) {
				this.jScrollPanelDatosEdicionSegmentoProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSegmentoProducto!=null) {
				this.jTabbedPaneBusquedasSegmentoProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSegmentoProducto!=null) {
				this.jScrollPanelDatosSegmentoProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionSegmentoProducto!=null) {
				this.jPanelPaginacionSegmentoProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSegmentoProducto!=null) {
				this.jPanelParametrosReportesSegmentoProducto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSegmentoProducto!=null) {
				this.jScrollPanelDatosEdicionSegmentoProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSegmentoProducto!=null) {
				this.jTabbedPaneBusquedasSegmentoProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSegmentoProducto!=null) {
				this.jScrollPanelDatosSegmentoProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionSegmentoProducto!=null) {
				this.jPanelPaginacionSegmentoProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSegmentoProducto!=null) {
				this.jPanelParametrosReportesSegmentoProducto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasSegmentoProducto!=null) {
					this.jTabbedPaneBusquedasSegmentoProducto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesSegmentoProducto!=null) {
				this.jPanelParametrosReportesSegmentoProducto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.segmentoproductoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSegmentoProducto!=null) {
				this.jTabbedPaneBusquedasSegmentoProducto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesSegmentoProducto!=null) {
				this.jPanelParametrosReportesSegmentoProducto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasSegmentoProducto.remove(jPanelBusquedaPorCodigoSegmentoProducto);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasSegmentoProducto.remove(jPanelBusquedaPorNombreSegmentoProducto);}

			this.isVisibilidadFK_IdTipoProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoProducto) {this.jTabbedPaneBusquedasSegmentoProducto.remove(jPanelFK_IdTipoProductoSegmentoProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoProducto(Boolean isParaTipoProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoProductoNegation=!isParaTipoProducto;

			this.isVisibilidadBusquedaPorCodigo=isParaTipoProductoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasSegmentoProducto.remove(jPanelBusquedaPorCodigoSegmentoProducto);}

			this.isVisibilidadBusquedaPorNombre=isParaTipoProductoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasSegmentoProducto.remove(jPanelBusquedaPorNombreSegmentoProducto);}

			this.isVisibilidadFK_IdTipoProducto=isParaTipoProducto;
			if(!this.isVisibilidadFK_IdTipoProducto) {this.jTabbedPaneBusquedasSegmentoProducto.remove(jPanelFK_IdTipoProductoSegmentoProducto);}
		}
		
	}
	
	

	public String registrarSesionSegmentoProductoParaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(this.segmentoproductoSessionBean==null) {
				this.segmentoproductoSessionBean=new SegmentoProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormSegmentoProducto.productoSessionBean==null) {
				this.jInternalFrameDetalleFormSegmentoProducto.productoSessionBean=new ProductoSessionBean();
			}

			this.jInternalFrameDetalleFormSegmentoProducto.productoSessionBean.setsPathNavegacionActual(segmentoproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormSegmentoProducto.productoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProducto=this.jInternalFrameDetalleFormSegmentoProducto.productoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormSegmentoProducto.productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			this.jInternalFrameDetalleFormSegmentoProducto.productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(SegmentoProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormSegmentoProducto.productoSessionBean.setisBusquedaDesdeForeignKeySesionSegmentoProducto(true);
			this.jInternalFrameDetalleFormSegmentoProducto.productoSessionBean.setlidSegmentoProductoActual(this.idSegmentoProductoActual);

			segmentoproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeySegmentoProducto(true);
			segmentoproductoSessionBean.setlIdSegmentoProductoActualForeignKey(this.idSegmentoProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionSegmentoProductoParaParametroInventarioDefectos() throws Exception {
		Boolean isPaginaPopupParametroInventarioDefecto=false;

		try {

			if(this.segmentoproductoSessionBean==null) {
				this.segmentoproductoSessionBean=new SegmentoProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoSessionBean==null) {
				this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoSessionBean.setsPathNavegacionActual(segmentoproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroInventarioDefecto=this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(true);
			this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(SegmentoProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionSegmentoProducto(true);
			this.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoSessionBean.setlidSegmentoProductoActual(this.idSegmentoProductoActual);

			segmentoproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeySegmentoProducto(true);
			segmentoproductoSessionBean.setlIdSegmentoProductoActualForeignKey(this.idSegmentoProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//SegmentoProductoSessionBean segmentoproductoSessionBean=new SegmentoProductoSessionBean();
		
		if(this.segmentoproductoSessionBean==null) {
			this.segmentoproductoSessionBean=new SegmentoProductoSessionBean();
		}
		
		this.segmentoproductoSessionBean.setsUltimaBusquedaSegmentoProducto(this.getsAccionBusqueda());
		this.segmentoproductoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.segmentoproductoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			segmentoproductoSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			segmentoproductoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			segmentoproductoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoProducto")) {
			segmentoproductoSessionBean.setid_tipo_producto(this.getid_tipo_productoFK_IdTipoProducto());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//SegmentoProductoSessionBean segmentoproductoSessionBean=new SegmentoProductoSessionBean();
		
		if(this.segmentoproductoSessionBean==null) {
			this.segmentoproductoSessionBean=new SegmentoProductoSessionBean();
		}
		
		if(this.segmentoproductoSessionBean.getsUltimaBusquedaSegmentoProducto()!=null&&!this.segmentoproductoSessionBean.getsUltimaBusquedaSegmentoProducto().equals("")) {
			this.setsAccionBusqueda(segmentoproductoSessionBean.getsUltimaBusquedaSegmentoProducto());
			this.setiNumeroPaginacion(segmentoproductoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(segmentoproductoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(segmentoproductoSessionBean.getcodigo());
				segmentoproductoSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(segmentoproductoSessionBean.getnombre());
				segmentoproductoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(segmentoproductoSessionBean.getid_empresa());
				segmentoproductoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoProducto")) {
				this.setid_tipo_productoFK_IdTipoProducto(segmentoproductoSessionBean.getid_tipo_producto());
				segmentoproductoSessionBean.setid_tipo_producto(-1L);
			}
		}
		
		this.segmentoproductoSessionBean.setsUltimaBusquedaSegmentoProducto("");
		this.segmentoproductoSessionBean.setiNumeroPaginacion(SegmentoProductoConstantesFunciones.INUMEROPAGINACION);
		this.segmentoproductoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaSegmentoProducto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSegmentoProducto() {
		this.updateBorderResaltarBusquedasFormularioSegmentoProducto();
		this.updateVisibilidadBusquedasFormularioSegmentoProducto();
		this.updateHabilitarBusquedasFormularioSegmentoProducto();
	}
	
	public void updateBorderResaltarBusquedasFormularioSegmentoProducto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasSegmentoProducto.getComponents().length>0) {
	

		if(this.segmentoproductoConstantesFunciones.resaltarBusquedaPorCodigoSegmentoProducto!=null) {
			index= this.jTabbedPaneBusquedasSegmentoProducto.indexOfComponent(this.jPanelBusquedaPorCodigoSegmentoProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSegmentoProducto.getComponent(index);
				jPanel.setBorder(this.segmentoproductoConstantesFunciones.resaltarBusquedaPorCodigoSegmentoProducto);
			}
		}

		if(this.segmentoproductoConstantesFunciones.resaltarBusquedaPorNombreSegmentoProducto!=null) {
			index= this.jTabbedPaneBusquedasSegmentoProducto.indexOfComponent(this.jPanelBusquedaPorNombreSegmentoProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSegmentoProducto.getComponent(index);
				jPanel.setBorder(this.segmentoproductoConstantesFunciones.resaltarBusquedaPorNombreSegmentoProducto);
			}
		}

		if(this.segmentoproductoConstantesFunciones.resaltarFK_IdTipoProductoSegmentoProducto!=null) {
			index= this.jTabbedPaneBusquedasSegmentoProducto.indexOfComponent(this.jPanelFK_IdTipoProductoSegmentoProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSegmentoProducto.getComponent(index);
				jPanel.setBorder(this.segmentoproductoConstantesFunciones.resaltarFK_IdTipoProductoSegmentoProducto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioSegmentoProducto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasSegmentoProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSegmentoProducto.indexOfComponent(this.jPanelBusquedaPorCodigoSegmentoProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSegmentoProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.segmentoproductoConstantesFunciones.mostrarBusquedaPorCodigoSegmentoProducto);
			if(!this.segmentoproductoConstantesFunciones.mostrarBusquedaPorCodigoSegmentoProducto && index>-1) {
				this.jTabbedPaneBusquedasSegmentoProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasSegmentoProducto.indexOfComponent(this.jPanelBusquedaPorNombreSegmentoProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSegmentoProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.segmentoproductoConstantesFunciones.mostrarBusquedaPorNombreSegmentoProducto);
			if(!this.segmentoproductoConstantesFunciones.mostrarBusquedaPorNombreSegmentoProducto && index>-1) {
				this.jTabbedPaneBusquedasSegmentoProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasSegmentoProducto.indexOfComponent(this.jPanelFK_IdTipoProductoSegmentoProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSegmentoProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.segmentoproductoConstantesFunciones.mostrarFK_IdTipoProductoSegmentoProducto);
			if(!this.segmentoproductoConstantesFunciones.mostrarFK_IdTipoProductoSegmentoProducto && index>-1) {
				this.jTabbedPaneBusquedasSegmentoProducto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioSegmentoProducto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasSegmentoProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSegmentoProducto.indexOfComponent(this.jPanelBusquedaPorCodigoSegmentoProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSegmentoProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.segmentoproductoConstantesFunciones.activarBusquedaPorCodigoSegmentoProducto);
				this.jTabbedPaneBusquedasSegmentoProducto.setEnabledAt(index,this.segmentoproductoConstantesFunciones.activarBusquedaPorCodigoSegmentoProducto);
			}

			index= this.jTabbedPaneBusquedasSegmentoProducto.indexOfComponent(this.jPanelBusquedaPorNombreSegmentoProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSegmentoProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.segmentoproductoConstantesFunciones.activarBusquedaPorNombreSegmentoProducto);
				this.jTabbedPaneBusquedasSegmentoProducto.setEnabledAt(index,this.segmentoproductoConstantesFunciones.activarBusquedaPorNombreSegmentoProducto);
			}

			index= this.jTabbedPaneBusquedasSegmentoProducto.indexOfComponent(this.jPanelFK_IdTipoProductoSegmentoProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSegmentoProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.segmentoproductoConstantesFunciones.activarFK_IdTipoProductoSegmentoProducto);
				this.jTabbedPaneBusquedasSegmentoProducto.setEnabledAt(index,this.segmentoproductoConstantesFunciones.activarFK_IdTipoProductoSegmentoProducto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaSegmentoProducto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasSegmentoProducto.indexOfComponent(this.jPanelBusquedaPorCodigoSegmentoProducto);

			this.jTabbedPaneBusquedasSegmentoProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSegmentoProducto.getComponent(index);

			this.segmentoproductoConstantesFunciones.setResaltarBusquedaPorCodigoSegmentoProducto(resaltar);

			jPanel.setBorder(this.segmentoproductoConstantesFunciones.resaltarBusquedaPorCodigoSegmentoProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasSegmentoProducto.indexOfComponent(this.jPanelBusquedaPorNombreSegmentoProducto);

			this.jTabbedPaneBusquedasSegmentoProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSegmentoProducto.getComponent(index);

			this.segmentoproductoConstantesFunciones.setResaltarBusquedaPorNombreSegmentoProducto(resaltar);

			jPanel.setBorder(this.segmentoproductoConstantesFunciones.resaltarBusquedaPorNombreSegmentoProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoProducto")) {
			index= this.jTabbedPaneBusquedasSegmentoProducto.indexOfComponent(this.jPanelFK_IdTipoProductoSegmentoProducto);

			this.jTabbedPaneBusquedasSegmentoProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSegmentoProducto.getComponent(index);

			this.segmentoproductoConstantesFunciones.setResaltarFK_IdTipoProductoSegmentoProducto(resaltar);

			jPanel.setBorder(this.segmentoproductoConstantesFunciones.resaltarFK_IdTipoProductoSegmentoProducto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarSegmentoProducto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioSegmentoProducto() throws Exception {

		if(this.jInternalFrameDetalleFormSegmentoProducto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSegmentoProducto();
		this.updateVisibilidadResaltarControlesFormularioSegmentoProducto();
		this.updateHabilitarResaltarControlesFormularioSegmentoProducto();
		
	}
	
	public void updateBorderResaltarControlesFormularioSegmentoProducto() throws Exception {
		if(this.jInternalFrameDetalleFormSegmentoProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.segmentoproductoConstantesFunciones.resaltaridSegmentoProducto!=null && this.jInternalFrameDetalleFormSegmentoProducto!=null) {this.jInternalFrameDetalleFormSegmentoProducto.jLabelidSegmentoProducto.setBorder(this.segmentoproductoConstantesFunciones.resaltaridSegmentoProducto);}
		if(this.segmentoproductoConstantesFunciones.resaltarid_empresaSegmentoProducto!=null && this.jInternalFrameDetalleFormSegmentoProducto!=null) {this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_empresaSegmentoProducto.setBorder(this.segmentoproductoConstantesFunciones.resaltarid_empresaSegmentoProducto);}
		if(this.segmentoproductoConstantesFunciones.resaltarid_tipo_productoSegmentoProducto!=null && this.jInternalFrameDetalleFormSegmentoProducto!=null) {this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_tipo_productoSegmentoProducto.setBorder(this.segmentoproductoConstantesFunciones.resaltarid_tipo_productoSegmentoProducto);}
		if(this.segmentoproductoConstantesFunciones.resaltarcodigoSegmentoProducto!=null && this.jInternalFrameDetalleFormSegmentoProducto!=null) {this.jInternalFrameDetalleFormSegmentoProducto.jTextFieldcodigoSegmentoProducto.setBorder(this.segmentoproductoConstantesFunciones.resaltarcodigoSegmentoProducto);}
		if(this.segmentoproductoConstantesFunciones.resaltarnombreSegmentoProducto!=null && this.jInternalFrameDetalleFormSegmentoProducto!=null) {this.jInternalFrameDetalleFormSegmentoProducto.jTextAreanombreSegmentoProducto.setBorder(this.segmentoproductoConstantesFunciones.resaltarnombreSegmentoProducto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSegmentoProducto() throws Exception {		
		if(this.jInternalFrameDetalleFormSegmentoProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
	
		//this.jInternalFrameDetalleFormSegmentoProducto.jLabelidSegmentoProducto.setVisible(this.segmentoproductoConstantesFunciones.mostraridSegmentoProducto);
		this.jInternalFrameDetalleFormSegmentoProducto.jPanelidSegmentoProducto.setVisible(this.segmentoproductoConstantesFunciones.mostraridSegmentoProducto);
		//this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_empresaSegmentoProducto.setVisible(this.segmentoproductoConstantesFunciones.mostrarid_empresaSegmentoProducto);
		this.jInternalFrameDetalleFormSegmentoProducto.jPanelid_empresaSegmentoProducto.setVisible(this.segmentoproductoConstantesFunciones.mostrarid_empresaSegmentoProducto);
		//this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_tipo_productoSegmentoProducto.setVisible(this.segmentoproductoConstantesFunciones.mostrarid_tipo_productoSegmentoProducto);
		this.jInternalFrameDetalleFormSegmentoProducto.jPanelid_tipo_productoSegmentoProducto.setVisible(this.segmentoproductoConstantesFunciones.mostrarid_tipo_productoSegmentoProducto);
		//this.jInternalFrameDetalleFormSegmentoProducto.jTextFieldcodigoSegmentoProducto.setVisible(this.segmentoproductoConstantesFunciones.mostrarcodigoSegmentoProducto);
		this.jInternalFrameDetalleFormSegmentoProducto.jPanelcodigoSegmentoProducto.setVisible(this.segmentoproductoConstantesFunciones.mostrarcodigoSegmentoProducto);
		//this.jInternalFrameDetalleFormSegmentoProducto.jTextAreanombreSegmentoProducto.setVisible(this.segmentoproductoConstantesFunciones.mostrarnombreSegmentoProducto);
		this.jInternalFrameDetalleFormSegmentoProducto.jPanelnombreSegmentoProducto.setVisible(this.segmentoproductoConstantesFunciones.mostrarnombreSegmentoProducto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSegmentoProducto() throws Exception {
		if(this.jInternalFrameDetalleFormSegmentoProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSegmentoProducto!=null) {
	
		this.jInternalFrameDetalleFormSegmentoProducto.jLabelidSegmentoProducto.setEnabled(this.segmentoproductoConstantesFunciones.activaridSegmentoProducto);
		this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_empresaSegmentoProducto.setEnabled(this.segmentoproductoConstantesFunciones.activarid_empresaSegmentoProducto);
		this.jInternalFrameDetalleFormSegmentoProducto.jComboBoxid_tipo_productoSegmentoProducto.setEnabled(this.segmentoproductoConstantesFunciones.activarid_tipo_productoSegmentoProducto);
		this.jInternalFrameDetalleFormSegmentoProducto.jTextFieldcodigoSegmentoProducto.setEnabled(this.segmentoproductoConstantesFunciones.activarcodigoSegmentoProducto);
		this.jInternalFrameDetalleFormSegmentoProducto.jTextAreanombreSegmentoProducto.setEnabled(this.segmentoproductoConstantesFunciones.activarnombreSegmentoProducto);
		}
	}
	
		
}