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

import com.bydan.erp.inventario.util.TallaProductoConstantesFunciones;
import com.bydan.erp.inventario.util.TallaProductoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.TallaProductoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.TallaProductoBean;
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
public class TallaProductoBeanSwingJInternalFrame extends TallaProductoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TallaProductoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TallaProducto> tallaproductoValidator = new ClassValidator<TallaProducto>(TallaProducto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TallaProducto tallaproducto;	
	public TallaProducto tallaproductoAux;
	public TallaProducto tallaproductoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TallaProducto tallaproductoTotales;
	public Long idTallaProductoActual;
	public Long iIdNuevoTallaProducto=0L;
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
	
	public Boolean isPermisoTodoTallaProducto;
	public Boolean isPermisoNuevoTallaProducto;
	public Boolean isPermisoActualizarTallaProducto;
	public Boolean isPermisoActualizarOriginalTallaProducto;
	public Boolean isPermisoEliminarTallaProducto;
	public Boolean isPermisoGuardarCambiosTallaProducto;
	public Boolean isPermisoConsultaTallaProducto;
	public Boolean isPermisoBusquedaTallaProducto;
	public Boolean isPermisoReporteTallaProducto;
	public Boolean isPermisoPaginacionMedioTallaProducto;
	public Boolean isPermisoPaginacionAltoTallaProducto;
	public Boolean isPermisoPaginacionTodoTallaProducto;
	public Boolean isPermisoCopiarTallaProducto;
	public Boolean isPermisoVerFormTallaProducto;
	public Boolean isPermisoDuplicarTallaProducto;
	public Boolean isPermisoOrdenTallaProducto;
	
	
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
	
	public TallaProductoParameterReturnGeneral tallaproductoReturnGeneral;
	public TallaProductoParameterReturnGeneral tallaproductoParameterGeneral;
	
	

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
	
	public Boolean isEsNuevoTallaProducto=false;
	public Boolean esParaAccionDesdeFormularioTallaProducto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TallaProductoSessionBeanAdditional tallaproductoSessionBeanAdditional=null;
	
	public TallaProductoSessionBeanAdditional getTallaProductoSessionBeanAdditional() {
		return this.tallaproductoSessionBeanAdditional;
	}
	
	public void setTallaProductoSessionBeanAdditional(TallaProductoSessionBeanAdditional tallaproductoSessionBeanAdditional) {
		try {
			this.tallaproductoSessionBeanAdditional=tallaproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TallaProductoBeanSwingJInternalFrameAdditional tallaproductoBeanSwingJInternalFrameAdditional=null;
	//public class TallaProductoBeanSwingJInternalFrame
	
	public TallaProductoBeanSwingJInternalFrameAdditional getTallaProductoBeanSwingJInternalFrameAdditional() {
		return this.tallaproductoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTallaProductoBeanSwingJInternalFrameAdditional(TallaProductoBeanSwingJInternalFrameAdditional tallaproductoBeanSwingJInternalFrameAdditional) {
		try {
			this.tallaproductoBeanSwingJInternalFrameAdditional=tallaproductoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TallaProductoLogic tallaproductoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TallaProducto tallaproductoBean;
	public TallaProductoConstantesFunciones tallaproductoConstantesFunciones;
	//public TallaProductoParameterReturnGeneral tallaproductoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoProductoLogic tipoproductoLogic;
	
	//PARAMETROS
	
	
	//public List<TallaProducto> tallaproductos;	
	//public List<TallaProducto> tallaproductosEliminados;
	//public List<TallaProducto> tallaproductosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTallaProducto=false;
	public Boolean isVisibilidadCeldaDuplicarTallaProducto=true;
	public Boolean isVisibilidadCeldaCopiarTallaProducto=true;
	public Boolean isVisibilidadCeldaVerFormTallaProducto=true;
	public Boolean isVisibilidadCeldaOrdenTallaProducto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTallaProducto=false;
	public Boolean isVisibilidadCeldaModificarTallaProducto=false;
	public Boolean isVisibilidadCeldaActualizarTallaProducto=false;
	public Boolean isVisibilidadCeldaEliminarTallaProducto=false;
	public Boolean isVisibilidadCeldaCancelarTallaProducto=false;
	public Boolean isVisibilidadCeldaGuardarTallaProducto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTallaProducto=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoProducto=false;
	
	public Long getiIdNuevoTallaProducto() {
		return this.iIdNuevoTallaProducto;
	}

	public void setiIdNuevoTallaProducto(Long iIdNuevoTallaProducto) {
		this.iIdNuevoTallaProducto = iIdNuevoTallaProducto;
	}
	
	public Long getidTallaProductoActual() {
		return this.idTallaProductoActual;
	}

	public void setidTallaProductoActual(Long idTallaProductoActual) {
		this.idTallaProductoActual = idTallaProductoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TallaProducto gettallaproducto() {
		return this.tallaproducto;
	}

	public void settallaproducto(TallaProducto tallaproducto) {
		this.tallaproducto = tallaproducto;
	}
	
	public TallaProducto gettallaproductoAux() {
		return this.tallaproductoAux;
	}

	public void settallaproductoAux(TallaProducto tallaproductoAux) {
		this.tallaproductoAux = tallaproductoAux;
	}				
	
	public TallaProducto gettallaproductoAnterior() {
		return this.tallaproductoAnterior;
	}

	public void settallaproductoAnterior(TallaProducto tallaproductoAnterior) {
		this.tallaproductoAnterior = tallaproductoAnterior;
	}	
	
	public TallaProducto gettallaproductoTotales() {
		return this.tallaproductoTotales;
	}

	public void settallaproductoTotales(TallaProducto tallaproductoTotales) {
		this.tallaproductoTotales = tallaproductoTotales;
	}	
	
	public TallaProducto gettallaproductoBean() {
		return this.tallaproductoBean;
	}

	public void settallaproductoBean(TallaProducto tallaproductoBean) {
		this.tallaproductoBean = tallaproductoBean;
	}	
	
	public TallaProductoParameterReturnGeneral gettallaproductoReturnGeneral() {
		return this.tallaproductoReturnGeneral;
	}

	public void settallaproductoReturnGeneral(TallaProductoParameterReturnGeneral tallaproductoReturnGeneral) {
		this.tallaproductoReturnGeneral = tallaproductoReturnGeneral;
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
	
	
	public TallaProductoLogic getTallaProductoLogic()	{		
		return tallaproductoLogic;
	}

	public void setTallaProductoLogic(TallaProductoLogic tallaproductoLogic) {
		this.tallaproductoLogic = tallaproductoLogic;
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
	
	public Boolean getIsEsNuevoTallaProducto() {
		return isEsNuevoTallaProducto;
	}

	public void setIsEsNuevoTallaProducto(Boolean isEsNuevoTallaProducto) {
		this.isEsNuevoTallaProducto = isEsNuevoTallaProducto;
	}

	public Boolean getEsParaAccionDesdeFormularioTallaProducto() {
		return esParaAccionDesdeFormularioTallaProducto;
	}
	
	public void setEsParaAccionDesdeFormularioTallaProducto(Boolean esParaAccionDesdeFormularioTallaProducto) {
		this.esParaAccionDesdeFormularioTallaProducto = esParaAccionDesdeFormularioTallaProducto;
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

			if(this.tallaproductoSessionBean==null) {
				this.tallaproductoSessionBean=new TallaProductoSessionBean();
			}

			if(!this.tallaproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tallaproductoSessionBean.getlidEmpresaActual());
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

			if(this.tallaproductoSessionBean==null) {
				this.tallaproductoSessionBean=new TallaProductoSessionBean();
			}

			if(!this.tallaproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProducto()) {
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
					tipoproductoLogic.getEntityWithConnection(tallaproductoSessionBean.getlidTipoProductoActual());
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

					if(this.tallaproducto!=null) {
						this.tallaproducto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTallaProducto!=null) {
						this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_empresaTallaProducto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTallaProducto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTallaProducto!=null) {
						if(this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_empresaTallaProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_empresaTallaProducto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTallaProductoGenerico)throws Exception
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
				jComboBoxid_empresaTallaProductoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTallaProductoGenerico!=null && jComboBoxid_empresaTallaProductoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTallaProductoGenerico.setSelectedIndex(0);
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

					if(this.tallaproducto!=null) {
						this.tallaproducto.setTipoProducto(tipoproductoTemp);
					}

					if(this.jInternalFrameDetalleFormTallaProducto!=null) {
						this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_tipo_productoTallaProducto.setSelectedItem(tipoproductoTemp);
					}
				} else {
					//jComboBoxid_tipo_productoTallaProducto.setSelectedItem(tipoproductoTemp);
					if(this.jInternalFrameDetalleFormTallaProducto!=null) {
						if(this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_tipo_productoTallaProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_tipo_productoTallaProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoproductoTemp!=null && jComboBoxid_tipo_productoFK_IdTipoProductoTallaProducto!=null) {
						jComboBoxid_tipo_productoFK_IdTipoProductoTallaProducto.setSelectedItem(tipoproductoTemp);
					} else {
						if(jComboBoxid_tipo_productoFK_IdTipoProductoTallaProducto!=null) {
							//jComboBoxid_tipo_productoFK_IdTipoProductoTallaProducto.setSelectedItem(tipoproductoTemp);
							if(jComboBoxid_tipo_productoFK_IdTipoProductoTallaProducto.getItemCount()>0) {
								jComboBoxid_tipo_productoFK_IdTipoProductoTallaProducto.setSelectedIndex(0);
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
	public void setActualTipoProductoForeignKeyGenerico(Long idTipoProductoSeleccionado,JComboBox jComboBoxid_tipo_productoTallaProductoGenerico)throws Exception
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
				jComboBoxid_tipo_productoTallaProductoGenerico.setSelectedItem(tipoproductoTemp);
			} else {
				if(jComboBoxid_tipo_productoTallaProductoGenerico!=null && jComboBoxid_tipo_productoTallaProductoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_productoTallaProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TallaProducto tallaproducto,JComboBox jComboBoxid_empresaTallaProductoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTallaProductoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_empresaTallaProducto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTallaProductoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tallaproducto.setid_empresa(empresaAux.getId());
				tallaproducto.setempresa_descripcion(TallaProductoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tallaproducto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoProductoForeignKey(TallaProducto tallaproducto,JComboBox jComboBoxid_tipo_productoTallaProductoGenerico)throws Exception
	{
		try
		{
			TipoProducto  tipoproductoAux=new TipoProducto();

			if(jComboBoxid_tipo_productoTallaProductoGenerico==null) {
				tipoproductoAux=(TipoProducto)this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_tipo_productoTallaProducto.getSelectedItem();
			} else {
				tipoproductoAux=(TipoProducto)jComboBoxid_tipo_productoTallaProductoGenerico.getSelectedItem();
			}

			if(tipoproductoAux!=null && tipoproductoAux.getId()!=null) {
				tallaproducto.setid_tipo_producto(tipoproductoAux.getId());
				tallaproducto.settipoproducto_descripcion(TallaProductoConstantesFunciones.getTipoProductoDescripcion(tipoproductoAux));
				tallaproducto.setTipoProducto(tipoproductoAux);			}
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

					if(!TallaProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTallaProducto!=null) { 
							this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_empresaTallaProducto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_empresaTallaProducto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTallaProducto!=null) { 
					}

					if(!TallaProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TallaProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTallaProducto!=null) { 
							this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_tipo_productoTallaProducto.removeAllItems();

							for(TipoProducto tipoproducto:this.tipoproductosForeignKey) {
								this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_tipo_productoTallaProducto.addItem(tipoproducto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTallaProducto!=null) { 
					}

					if(!TallaProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TallaProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_productoFK_IdTipoProductoTallaProducto.removeAllItems();

							for(TipoProducto tipoproducto:this.tipoproductosForeignKey) {
								this.jComboBoxid_tipo_productoFK_IdTipoProductoTallaProducto.addItem(tipoproducto);
							}
						}

						if(!TallaProductoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTallaProducto!=null) {
							this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_empresaTallaProducto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTallaProducto!=null) {
							this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_empresaTallaProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTallaProducto!=null) {
							this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_tipo_productoTallaProducto.setSelectedItem(tipoproducto);
						}
					} else {
						if(this.jInternalFrameDetalleFormTallaProducto!=null) {
							this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_tipo_productoTallaProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_productoFK_IdTipoProductoTallaProducto.setSelectedItem(tipoproducto);
						} else {
							this.jComboBoxid_tipo_productoFK_IdTipoProductoTallaProducto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTallaProducto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TallaProductoConstantesFunciones.refrescarForeignKeysDescripcionesTallaProducto(this.tallaproductoLogic.getTallaProductos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TallaProductoConstantesFunciones.refrescarForeignKeysDescripcionesTallaProducto(this.tallaproductos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(TipoProducto.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tallaproductoLogic.setTallaProductos(this.tallaproductos);
			tallaproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TallaProductoParameterReturnGeneral getTallaProductoParameterGeneral() {
		return this.tallaproductoParameterGeneral;
	}
	
	public void setTallaProductoParameterGeneral(TallaProductoParameterReturnGeneral tallaproductoParameterGeneral) {
		this.tallaproductoParameterGeneral = tallaproductoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTallaProducto() {
		return isPermisoTodoTallaProducto;
	}

	public void setIsPermisoTodoTallaProducto(Boolean isPermisoTodoTallaProducto) {
		this.isPermisoTodoTallaProducto = isPermisoTodoTallaProducto;
	}

	public Boolean getIsPermisoNuevoTallaProducto() {
		return isPermisoNuevoTallaProducto;
	}

	public void setIsPermisoNuevoTallaProducto(Boolean isPermisoNuevoTallaProducto) {
		this.isPermisoNuevoTallaProducto = isPermisoNuevoTallaProducto;
	}

	public Boolean getIsPermisoActualizarTallaProducto() {
		return isPermisoActualizarTallaProducto;
	}

	public void setIsPermisoActualizarTallaProducto(Boolean isPermisoActualizarTallaProducto) {
		this.isPermisoActualizarTallaProducto = isPermisoActualizarTallaProducto;
	}

	public Boolean getIsPermisoEliminarTallaProducto() {
		return isPermisoEliminarTallaProducto;
	}

	public void setIsPermisoEliminarTallaProducto(Boolean isPermisoEliminarTallaProducto) {
		this.isPermisoEliminarTallaProducto = isPermisoEliminarTallaProducto;
	}

	public Boolean getIsPermisoGuardarCambiosTallaProducto() {
		return isPermisoGuardarCambiosTallaProducto;
	}

	public void setIsPermisoGuardarCambiosTallaProducto(Boolean isPermisoGuardarCambiosTallaProducto) {
		this.isPermisoGuardarCambiosTallaProducto = isPermisoGuardarCambiosTallaProducto;
	}
	
	public Boolean getIsPermisoConsultaTallaProducto() {
		return isPermisoConsultaTallaProducto;
	}

	public void setIsPermisoConsultaTallaProducto(Boolean isPermisoConsultaTallaProducto) {
		this.isPermisoConsultaTallaProducto = isPermisoConsultaTallaProducto;
	}

	public Boolean getIsPermisoBusquedaTallaProducto() {
		return isPermisoBusquedaTallaProducto;
	}

	public void setIsPermisoBusquedaTallaProducto(Boolean isPermisoBusquedaTallaProducto) {
		this.isPermisoBusquedaTallaProducto = isPermisoBusquedaTallaProducto;
	}

	public Boolean getIsPermisoReporteTallaProducto() {
		return isPermisoReporteTallaProducto;
	}

	public void setIsPermisoReporteTallaProducto(Boolean isPermisoReporteTallaProducto) {
		this.isPermisoReporteTallaProducto = isPermisoReporteTallaProducto;
	}
	
	public Boolean getIsPermisoPaginacionMedioTallaProducto() {
		return isPermisoPaginacionMedioTallaProducto;
	}

	public void setIsPermisoPaginacionMedioTallaProducto(Boolean isPermisoPaginacionMedioTallaProducto) {
		this.isPermisoPaginacionMedioTallaProducto = isPermisoPaginacionMedioTallaProducto;
	}
	
	public Boolean getIsPermisoPaginacionTodoTallaProducto() {
		return isPermisoPaginacionTodoTallaProducto;
	}

	public void setIsPermisoPaginacionTodoTallaProducto(Boolean isPermisoPaginacionTodoTallaProducto) {
		this.isPermisoPaginacionTodoTallaProducto = isPermisoPaginacionTodoTallaProducto;
	}
	
	public Boolean getIsPermisoPaginacionAltoTallaProducto() {
		return isPermisoPaginacionAltoTallaProducto;
	}

	public void setIsPermisoPaginacionAltoTallaProducto(Boolean isPermisoPaginacionAltoTallaProducto) {
		this.isPermisoPaginacionAltoTallaProducto = isPermisoPaginacionAltoTallaProducto;
	}
	
	public Boolean getIsPermisoCopiarTallaProducto() {
		return isPermisoCopiarTallaProducto;
	}

	public void setIsPermisoCopiarTallaProducto(Boolean isPermisoCopiarTallaProducto) {
		this.isPermisoCopiarTallaProducto = isPermisoCopiarTallaProducto;
	}
	
	public Boolean getIsPermisoVerFormTallaProducto() {
		return isPermisoVerFormTallaProducto;
	}

	public void setIsPermisoVerFormTallaProducto(Boolean isPermisoVerFormTallaProducto) {
		this.isPermisoVerFormTallaProducto = isPermisoVerFormTallaProducto;
	}
	
	public Boolean getIsPermisoDuplicarTallaProducto() {
		return isPermisoDuplicarTallaProducto;
	}

	public void setIsPermisoDuplicarTallaProducto(Boolean isPermisoDuplicarTallaProducto) {
		this.isPermisoDuplicarTallaProducto = isPermisoDuplicarTallaProducto;
	}
	
	public Boolean getIsPermisoOrdenTallaProducto() {
		return isPermisoOrdenTallaProducto;
	}

	public void setIsPermisoOrdenTallaProducto(Boolean isPermisoOrdenTallaProducto) {
		this.isPermisoOrdenTallaProducto = isPermisoOrdenTallaProducto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTallaProducto() {
		return isVisibilidadCeldaNuevoTallaProducto;
	}

	public void setIsVisibilidadCeldaNuevoTallaProducto(Boolean isVisibilidadCeldaNuevoTallaProducto) {
		this.isVisibilidadCeldaNuevoTallaProducto = isVisibilidadCeldaNuevoTallaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTallaProducto() {
		return isVisibilidadCeldaDuplicarTallaProducto;
	}

	public void setIsVisibilidadCeldaDuplicarTallaProducto(Boolean isVisibilidadCeldaDuplicarTallaProducto) {
		this.isVisibilidadCeldaDuplicarTallaProducto = isVisibilidadCeldaDuplicarTallaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTallaProducto() {
		return isVisibilidadCeldaCopiarTallaProducto;
	}

	public void setIsVisibilidadCeldaCopiarTallaProducto(Boolean isVisibilidadCeldaCopiarTallaProducto) {
		this.isVisibilidadCeldaCopiarTallaProducto = isVisibilidadCeldaCopiarTallaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTallaProducto() {
		return isVisibilidadCeldaVerFormTallaProducto;
	}

	public void setIsVisibilidadCeldaVerFormTallaProducto(Boolean isVisibilidadCeldaVerFormTallaProducto) {
		this.isVisibilidadCeldaVerFormTallaProducto = isVisibilidadCeldaVerFormTallaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTallaProducto() {
		return isVisibilidadCeldaOrdenTallaProducto;
	}

	public void setIsVisibilidadCeldaOrdenTallaProducto(Boolean isVisibilidadCeldaOrdenTallaProducto) {
		this.isVisibilidadCeldaOrdenTallaProducto = isVisibilidadCeldaOrdenTallaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTallaProducto() {
		return isVisibilidadCeldaNuevoRelacionesTallaProducto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTallaProducto(Boolean isVisibilidadCeldaNuevoRelacionesTallaProducto) {
		this.isVisibilidadCeldaNuevoRelacionesTallaProducto = isVisibilidadCeldaNuevoRelacionesTallaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTallaProducto() {
		return isVisibilidadCeldaModificarTallaProducto;
	}

	public void setIsVisibilidadCeldaModificarTallaProducto(Boolean isVisibilidadCeldaModificarTallaProducto) {
		this.isVisibilidadCeldaModificarTallaProducto = isVisibilidadCeldaModificarTallaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTallaProducto() {
		return isVisibilidadCeldaActualizarTallaProducto;
	}

	public void setIsVisibilidadCeldaActualizarTallaProducto(Boolean isVisibilidadCeldaActualizarTallaProducto) {
		this.isVisibilidadCeldaActualizarTallaProducto = isVisibilidadCeldaActualizarTallaProducto;
	}

	public Boolean getIsVisibilidadCeldaEliminarTallaProducto() {
		return isVisibilidadCeldaEliminarTallaProducto;
	}

	public void setIsVisibilidadCeldaEliminarTallaProducto(Boolean isVisibilidadCeldaEliminarTallaProducto) {
		this.isVisibilidadCeldaEliminarTallaProducto = isVisibilidadCeldaEliminarTallaProducto;
	}

	public Boolean getIsVisibilidadCeldaCancelarTallaProducto() {
		return isVisibilidadCeldaCancelarTallaProducto;
	}

	public void setIsVisibilidadCeldaCancelarTallaProducto(Boolean isVisibilidadCeldaCancelarTallaProducto) {
		this.isVisibilidadCeldaCancelarTallaProducto = isVisibilidadCeldaCancelarTallaProducto;
	}

	public Boolean getIsVisibilidadCeldaGuardarTallaProducto() {
		return isVisibilidadCeldaGuardarTallaProducto;
	}

	public void setIsVisibilidadCeldaGuardarTallaProducto(Boolean isVisibilidadCeldaGuardarTallaProducto) {
		this.isVisibilidadCeldaGuardarTallaProducto = isVisibilidadCeldaGuardarTallaProducto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTallaProducto() {
		return isVisibilidadCeldaGuardarCambiosTallaProducto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTallaProducto(Boolean isVisibilidadCeldaGuardarCambiosTallaProducto) {
		this.isVisibilidadCeldaGuardarCambiosTallaProducto = isVisibilidadCeldaGuardarCambiosTallaProducto;
	}
		
	public TallaProductoSessionBean gettallaproductoSessionBean() {
		return this.tallaproductoSessionBean;
	}
	
	public void settallaproductoSessionBean(TallaProductoSessionBean tallaproductoSessionBean) {
		this.tallaproductoSessionBean=tallaproductoSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTallaProducto(TallaProducto tallaproducto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tallaproducto,null);
				this.setActualParaGuardarTipoProductoForeignKey(tallaproducto,null);
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
	
	public void bugActualizarReferenciaActual(TallaProducto tallaproducto,TallaProducto tallaproductoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTallaProducto(tallaproducto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tallaproductoAux.setId(tallaproducto.getId());
		tallaproductoAux.setVersionRow(tallaproducto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTallaProducto();
		
			int intSelectedRow = this.jTableDatosTallaProducto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproducto =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tallaproducto =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TallaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTallaProducto(this.tallaproducto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTallaProducto(this.tallaproducto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tallaproductoValidator.getInvalidValues(this.tallaproducto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tallaproductoLogic.setDatosCliente(datosCliente);
			tallaproductoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tallaproductoAux=new  TallaProducto();
				
				tallaproductoAux.setIsNew(true);
				tallaproductoAux.setIsChanged(true);
				
				tallaproductoAux.setTallaProductoOriginal(this.tallaproducto);
				
				tallaproductoAux.setId(this.tallaproducto.getId());	
				tallaproductoAux.setVersionRow(this.tallaproducto.getVersionRow());	
				tallaproductoAux.setid_empresa(this.tallaproducto.getid_empresa());	
				tallaproductoAux.setid_tipo_producto(this.tallaproducto.getid_tipo_producto());	
				tallaproductoAux.setcodigo(this.tallaproducto.getcodigo());	
				tallaproductoAux.setnombre(this.tallaproducto.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tallaproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tallaproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tallaproductoAux,tallaproductoLogic.getTallaProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tallaproductoAux,tallaproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tallaproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tallaproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tallaproductoLogic.saveTallaProductos();//WithConnection
						//tallaproductoLogic.getSetVersionRowTallaProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tallaproducto,tallaproductoAux);
					
					this.refrescarForeignKeysDescripcionesTallaProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tallaproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tallaproductoLogic.saveTallaProductoRelaciones(tallaproductoAux,this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//tallaproductoLogic.getSetVersionRowTallaProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tallaproducto,tallaproductoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							tallaproductoAux.setProductos(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tallaproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tallaproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tallaproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tallaproductoAux,tallaproductoLogic.getTallaProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tallaproductoAux,tallaproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tallaproducto,tallaproductoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tallaproductoAux=new  TallaProducto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tallaproductoSessionBean.getEsGuardarRelacionado() 
					|| (this.tallaproductoSessionBean.getEsGuardarRelacionado() && this.tallaproducto.getId()>=0)) {
						
					tallaproductoAux.setIsNew(false);
				}
				
				tallaproductoAux.setIsDeleted(false);
			
				tallaproductoAux.setId(this.tallaproducto.getId());	
				tallaproductoAux.setVersionRow(this.tallaproducto.getVersionRow());	
				tallaproductoAux.setid_empresa(this.tallaproducto.getid_empresa());	
				tallaproductoAux.setid_tipo_producto(this.tallaproducto.getid_tipo_producto());	
				tallaproductoAux.setcodigo(this.tallaproducto.getcodigo());	
				tallaproductoAux.setnombre(this.tallaproducto.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tallaproductoAux,tallaproductoLogic.getTallaProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tallaproductoAux,tallaproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tallaproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tallaproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tallaproductoLogic.saveTallaProductos();//WithConnection
						//tallaproductoLogic.getSetVersionRowTallaProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tallaproducto,tallaproductoAux);
					
					this.refrescarForeignKeysDescripcionesTallaProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tallaproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tallaproductoLogic.saveTallaProductoRelaciones(tallaproductoAux,this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//tallaproductoLogic.getSetVersionRowTallaProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tallaproducto,tallaproductoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							tallaproductoAux.setProductos(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tallaproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tallaproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tallaproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tallaproductoAux,tallaproductoLogic.getTallaProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tallaproductoAux,tallaproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tallaproducto,tallaproductoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tallaproductoAux=new  TallaProducto();
				
				tallaproductoAux.setIsNew(false);
				tallaproductoAux.setIsChanged(false);
				
				tallaproductoAux.setIsDeleted(true);
				
				tallaproductoAux.setId(this.tallaproducto.getId());	
				tallaproductoAux.setVersionRow(this.tallaproducto.getVersionRow());	
				tallaproductoAux.setid_empresa(this.tallaproducto.getid_empresa());	
				tallaproductoAux.setid_tipo_producto(this.tallaproducto.getid_tipo_producto());	
				tallaproductoAux.setcodigo(this.tallaproducto.getcodigo());	
				tallaproductoAux.setnombre(this.tallaproducto.getnombre());	
				
				if(this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tallaproductoAux.getId()>=0) {	
						this.tallaproductosEliminados.add(tallaproductoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tallaproductoAux,tallaproductoLogic.getTallaProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tallaproductoAux,tallaproductos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tallaproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tallaproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tallaproductoLogic.saveTallaProductos();//WithConnection
						//tallaproductoLogic.getSetVersionRowTallaProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tallaproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tallaproductoLogic.saveTallaProductoRelaciones(tallaproductoAux,this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//tallaproductoLogic.getSetVersionRowTallaProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							tallaproductoAux.setProductos(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tallaproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tallaproductoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tallaproductoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tallaproductoAux,tallaproductoLogic.getTallaProductos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tallaproductoAux,tallaproductos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.getTallaProductos().addAll(this.tallaproductosEliminados);
					
					tallaproductoLogic.saveTallaProductos();//WithConnection
					//tallaproductoLogic.getSetVersionRowTallaProductos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTallaProducto();
				
				this.tallaproductosEliminados= new ArrayList<TallaProducto>();		
			}
			
			if(this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tallaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Talla Producto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Talla Producto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tallaproducto=tallaproductoAux;
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
      		//this.finishProcessTallaProducto();
      	}
		
	}	
	
	public void actualizarRelaciones(TallaProducto tallaproductoLocal) throws Exception {
		
		if(this.tallaproductoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tallaproductoLocal.setProductos(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());
				tallaproductoLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
			
			} else {
			
				tallaproductoLocal.setProductos(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productos);
				tallaproductoLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TallaProducto tallaproductoLocal) throws Exception {	
		if(this.tallaproductoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tallaproductoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoProductoDetalleFormJInternalFrame.class)) {
				TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrameLocal=(TipoProductoBeanSwingJInternalFrame) ((TipoProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoproductoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoProducto(tipoproductoBeanSwingJInternalFrameLocal.gettipoproducto(),true);
				tipoproductoBeanSwingJInternalFrameLocal.actualizarLista(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto,this.tipoproductosForeignKey);

				tipoproductoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto);

				tallaproductoLocal.setTipoProducto(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto);

				this.addItemDefectoCombosForeignKeyTipoProducto();
				this.cargarCombosFrameTipoProductosForeignKey("Formulario");
				this.setActualTipoProductoForeignKey(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTallaProductoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTallaProducto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tallaproducto =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tallaproducto =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tallaproductoValidator.getInvalidValues(this.tallaproducto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TallaProducto tallaproducto,List<TallaProducto> tallaproductos) throws Exception {
		try	{		
			TallaProductoConstantesFunciones.actualizarLista(tallaproducto,tallaproductos,this.tallaproductoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TallaProducto tallaproducto,List<TallaProducto> tallaproductos) throws Exception {
		try	{			
			TallaProductoConstantesFunciones.actualizarSelectedLista(tallaproducto,tallaproductos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TallaProducto> tallaproductosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tallaproductosLocal=this.tallaproductoLogic.getTallaProductos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tallaproductosLocal=this.tallaproductos;
			}
			//ARCHITECTURE
		
			for(TallaProducto tallaproductoLocal:tallaproductosLocal) {
				if(this.permiteMantenimiento(tallaproductoLocal) && tallaproductoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TallaProductoConstantesFunciones.getTallaProductoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TallaProductoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTallaProducto.jLabelid_empresaTallaProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TallaProductoConstantesFunciones.IDTIPOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTallaProducto.jLabelid_tipo_productoTallaProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TallaProductoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTallaProducto.jLabelcodigoTallaProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TallaProductoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTallaProducto.jLabelnombreTallaProducto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTallaProducto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTallaProducto.jLabelid_empresaTallaProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTallaProducto.jLabelid_tipo_productoTallaProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTallaProducto.jLabelcodigoTallaProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTallaProducto.jLabelnombreTallaProducto,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Producto")) {
			if(this.tallaproducto==null) {
				this.tallaproducto= new TallaProducto();
			}

			if(this.tallaproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTallaProducto
				this.setVariablesFormularioToObjetoActualTallaProducto(this.tallaproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTallaProducto(this.tallaproducto);

				this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.getproducto().setTallaProducto(this.tallaproducto);
			}

			return;
		}
		 else  if(sTipo.equals("ParametroInventarioDefecto")) {
			if(this.tallaproducto==null) {
				this.tallaproducto= new TallaProducto();
			}

			if(this.tallaproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTallaProducto
				this.setVariablesFormularioToObjetoActualTallaProducto(this.tallaproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTallaProducto(this.tallaproducto);

				this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.getparametroinventariodefecto().setTallaProducto(this.tallaproducto);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTallaProducto--;	
		
		
		this.tallaproductoAux=new TallaProducto();
		
		this.tallaproductoAux.setId(this.iIdNuevoTallaProducto);
		this.tallaproductoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tallaproductoLogic.getTallaProductos().add(this.tallaproductoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tallaproductos.add(this.tallaproductoAux);
		}
		//ARCHITECTURE
		
		this.tallaproducto=this.tallaproductoAux;
		
		if(TallaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTallaProducto(this.tallaproducto);
			this.setVariablesObjetoActualToFormularioForeignKeyTallaProducto(this.tallaproducto);
		}
				
		//this.setDefaultControlesTallaProducto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTallaProducto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTallaProducto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTallaProducto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTallaProducto(this.tallaproductoBean,this.tallaproducto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTallaProducto(this.tallaproducto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TallaProductoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tallaproductoSessionBean.getConGuardarRelaciones()) {
			classes=TallaProductoConstantesFunciones.getClassesRelationshipsOfTallaProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tallaproductoReturnGeneral=tallaproductoLogic.procesarEventosTallaProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tallaproductoLogic.getTallaProductos(),this.tallaproducto,this.tallaproductoParameterGeneral,this.isEsNuevoTallaProducto,classes);//this.tallaproductoLogic.getTallaProducto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTallaProducto(this.tallaproductoReturnGeneral,this.tallaproductoBean,false);
		
		if(this.tallaproductoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTallaProducto(this.tallaproductoReturnGeneral.getTallaProducto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTallaProducto(this.tallaproductoReturnGeneral.getTallaProducto());
		}
		
		if(this.tallaproductoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTallaProducto(this.tallaproductoReturnGeneral.getTallaProducto(),classes);//this.tallaproductoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTallaProducto(this.tallaproducto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTallaProducto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTallaProducto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TallaProductoBeanSwingJInternalFrameAdditional.RecargarFormTallaProducto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTallaProducto(false);
						
			if(tallaproductoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado() && ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TallaProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTallaProducto();
			}
			
			this.actualizarVisualTableDatosTallaProducto();
			
			this.jTableDatosTallaProducto.setRowSelectionInterval(this.getIndiceNuevoTallaProducto(), this.getIndiceNuevoTallaProducto());
			
			this.seleccionarFilaTablaTallaProductoActual();
						
			this.actualizarEstadoCeldasBotonesTallaProducto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTallaProducto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTallaProducto.jTextFieldcodigoTallaProducto.setEnabled(isHabilitar && this.tallaproductoConstantesFunciones.activarcodigoTallaProducto);
		this.jInternalFrameDetalleFormTallaProducto.jTextAreanombreTallaProducto.setEnabled(isHabilitar && this.tallaproductoConstantesFunciones.activarnombreTallaProducto);	
		//
		this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_empresaTallaProducto.setEnabled(isHabilitar && this.tallaproductoConstantesFunciones.activarid_empresaTallaProducto);
		this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_tipo_productoTallaProducto.setEnabled(isHabilitar && this.tallaproductoConstantesFunciones.activarid_tipo_productoTallaProducto);
	};
	
	public void setDefaultControlesTallaProducto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTallaProducto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tallaproductoSessionBean.setConGuardarRelaciones(true);			
			this.tallaproductoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTallaProducto.jTabbedPaneRelacionesTallaProducto.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tallaproductoSessionBean.setConGuardarRelaciones(false);			
			this.tallaproductoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTallaProducto.jTabbedPaneRelacionesTallaProducto.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTallaProducto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TallaProducto tallaproductoAux:this.tallaproductoLogic.getTallaProductos()) {
				if(tallaproductoAux.getId().equals(this.iIdNuevoTallaProducto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TallaProducto tallaproductoAux:this.tallaproductos) {
				if(tallaproductoAux.getId().equals(this.iIdNuevoTallaProducto)) {
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
	
	public int getIndiceActualTallaProducto(TallaProducto tallaproducto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TallaProducto tallaproductoAux:this.tallaproductoLogic.getTallaProductos()) {
				if(tallaproductoAux.getId().equals(tallaproducto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TallaProducto tallaproductoAux:this.tallaproductos) {
				if(tallaproductoAux.getId().equals(tallaproducto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTallaProducto(TallaProducto tallaproductoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TallaProducto tallaproductoAux:this.tallaproductoLogic.getTallaProductos()) {
				if(tallaproductoAux.getTallaProductoOriginal().getId().equals(tallaproductoOriginal.getId())) {
					existe=true;
					tallaproductoOriginal.setId(tallaproductoAux.getId());
					tallaproductoOriginal.setVersionRow(tallaproductoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TallaProducto tallaproductoAux:this.tallaproductos) {
				if(tallaproductoAux.getTallaProductoOriginal().getId().equals(tallaproductoOriginal.getId())) {
					existe=true;
					tallaproductoOriginal.setId(tallaproductoAux.getId());
					tallaproductoOriginal.setVersionRow(tallaproductoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTallaProducto(Boolean esParaCancelar) throws Exception {
		tallaproductosAux=new ArrayList<TallaProducto>();
		tallaproductoAux=new TallaProducto();
		
		if(!this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TallaProducto tallaproductoAux:this.tallaproductoLogic.getTallaProductos()) {
					if(tallaproductoAux.getId()<0) {
						tallaproductosAux.add(tallaproductoAux);
					}		
				}
				this.iIdNuevoTallaProducto=0L;
				this.tallaproductoLogic.getTallaProductos().removeAll(tallaproductosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TallaProducto tallaproductoAux:this.tallaproductos) {
					if(tallaproductoAux.getId()<0) {
						tallaproductosAux.add(tallaproductoAux);
					}		
				}
				this.iIdNuevoTallaProducto=0L;
				this.tallaproductos.removeAll(tallaproductosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTallaProducto 
					&& this.tallaproductoLogic.getTallaProductos().size()>0
					) {
					tallaproductoAux=this.tallaproductoLogic.getTallaProductos().get(this.tallaproductoLogic.getTallaProductos().size() - 1);
				
					if(tallaproductoAux.getId()<0) {
						this.tallaproductoLogic.getTallaProductos().remove(tallaproductoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTallaProducto && this.tallaproductos.size()>0) {
					tallaproductoAux=this.tallaproductos.get(this.tallaproductos.size() - 1);
				
					if(tallaproductoAux.getId()<0) {
						this.tallaproductos.remove(tallaproductoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTallaProducto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tallaproducto.getId()<0) {
				this.tallaproductoLogic.getTallaProductos().remove(this.tallaproducto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tallaproducto.getId()<0) {
				this.tallaproductos.remove(this.tallaproducto);
			}
		}			
	}
	
	public void setEstadosInicialesTallaProducto(List<TallaProducto> tallaproductosAux) throws Exception {
		TallaProductoConstantesFunciones.setEstadosInicialesTallaProducto(tallaproductosAux);
	}
	
	public void setEstadosInicialesTallaProducto(TallaProducto tallaproductoAux) throws Exception {
		TallaProductoConstantesFunciones.setEstadosInicialesTallaProducto(tallaproductoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTallaProductoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTallaProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTallaProductoActual()) {
				if(!this.isEsNuevoTallaProducto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTallaProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTallaProducto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTallaProductoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Talla Producto ?", "MANTENIMIENTO DE Talla Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTallaProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TallaProducto tallaproducto) throws Exception {
		TallaProductoConstantesFunciones.seleccionarAsignar(this.tallaproducto,tallaproducto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTallaProducto=this.isPermisoActualizarOriginalTallaProducto;
			
			
			this.seleccionarAsignar(tallaproducto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TallaProductoConstantesFunciones.quitarEspaciosTallaProducto(this.tallaproducto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTallaProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tallaproductoSessionBean.setsFuncionBusquedaRapida(this.tallaproductoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTallaProducto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTallaProducto(esParaCancelar);				
				this.cancelarNuevoTallaProducto(esParaCancelar);								
			}
			
			this.tallaproducto=new TallaProducto();
			
			this.inicializarTallaProducto();
			
			this.actualizarEstadoCeldasBotonesTallaProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTallaProducto() throws Exception {
		try {
			TallaProductoConstantesFunciones.inicializarTallaProducto(this.tallaproducto);
			
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
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tallaproductoLogic.getTallaProductos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTallaProductos(String sAccionBusqueda,List<TallaProducto> tallaproductosParaReportes) throws Exception {
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
					sPathReporteFinal="TallaProducto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TallaProductoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TallaProductoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TallaProducto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Talla Productos");		
		parameters.put("busquedapor", TallaProductoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
					
					TallaProductoLogic tallaproductoLogicAuxiliar=new TallaProductoLogic();
					tallaproductoLogicAuxiliar.setDatosCliente(tallaproductoLogic.getDatosCliente());				
					tallaproductoLogicAuxiliar.setTallaProductos(tallaproductosParaReportes);
					
					tallaproductoLogicAuxiliar.cargarRelacionesLoteForeignKeyTallaProductoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tallaproductosParaReportes=tallaproductoLogicAuxiliar.getTallaProductos();
					
					//tallaproductoLogic.getNewConnexionToDeep();
					
					//for (TallaProducto tallaproducto:tallaproductosParaReportes) {
					//	tallaproductoLogic.deepLoad(tallaproducto, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tallaproductoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tallaproductoLogic.closeNewConnexionToDeep();
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTallaProducto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TallaProductoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TallaProductoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTallaProducto=new JRBeanArrayDataSource(TallaProductoJInternalFrame.TraerTallaProductoBeans(tallaproductosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTallaProducto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TallaProductoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TallaProductoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TallaProductoBean.TraerTallaProductoBeans(tallaproductosParaReportes).toArray()));
							
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
				this.generarExcelReporteTallaProductos(sAccionBusqueda,sTipoArchivoReporte,tallaproductosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTallaProductos(sAccionBusqueda,sTipoArchivoReporte,tallaproductosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTallaProductoActionPerformed(null);
					//this.generarExcelReporteTallaProductos(sAccionBusqueda,sTipoArchivoReporte,tallaproductosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTallaProductos(sAccionBusqueda,sTipoArchivoReporte,tallaproductosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTallaProductos(sAccionBusqueda,sTipoArchivoReporte,tallaproductosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTallaProductos(sAccionBusqueda,sTipoArchivoReporte,tallaproductosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTallaProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<TallaProducto> tallaproductosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tallaproducto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TallaProductos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTallaProducto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TallaProducto tallaproducto : tallaproductosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TallaProductoConstantesFunciones.generarExcelReporteDataTallaProducto("NORMAL",row,workbook,tallaproducto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tallaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Talla Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTallaProducto(String sTipo,Row row,Workbook workbook) {
		
		TallaProductoConstantesFunciones.generarExcelReporteHeaderTallaProducto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTallaProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<TallaProducto> tallaproductosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tallaproducto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TallaProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TallaProducto tallaproducto : tallaproductosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TallaProductoConstantesFunciones.getTallaProductoDescripcion(tallaproducto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TallaProductoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TallaProductoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tallaproducto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TallaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TallaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tallaproducto.gettipoproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TallaProductoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TallaProductoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tallaproducto.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TallaProductoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TallaProductoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tallaproducto.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tallaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Talla Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTallaProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<TallaProducto> tallaproductosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TallaProducto> tallaproductosRespaldo=null;
		
		classes=TallaProductoConstantesFunciones.getClassesRelationshipsOfTallaProducto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tallaproductoLogic.setDatosCliente(this.datosCliente);
		this.tallaproductoLogic.setDatosDeep(this.datosDeep);
		this.tallaproductoLogic.setIsConDeep(true);
		
		tallaproductosRespaldo=this.tallaproductoLogic.getTallaProductos();
		
		this.tallaproductoLogic.setTallaProductos(tallaproductosParaReportes);	
		this.tallaproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tallaproductosParaReportes=this.tallaproductoLogic.getTallaProductos();
		this.tallaproductoLogic.setTallaProductos(tallaproductosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tallaproducto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TallaProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTallaProducto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TallaProducto tallaproducto : tallaproductosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTallaProducto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TallaProductoConstantesFunciones.generarExcelReporteDataTallaProducto("NORMAL",row,workbook,tallaproducto,cellStyleDataAux);
		
			
			


				//Producto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tallaproducto.getProductos()!=null && tallaproducto.getProductos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoConstantesFunciones.generarExcelReporteHeaderProducto("RELACIONADO",row,workbook);
				}

				if(tallaproducto.getProductos()!=null) {
					i2=0;
					for(Producto producto : tallaproducto.getProductos()) {
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

				if(tallaproducto.getParametroInventarioDefectos()!=null && tallaproducto.getParametroInventarioDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroInventarioDefectoConstantesFunciones.generarExcelReporteHeaderParametroInventarioDefecto("RELACIONADO",row,workbook);
				}

				if(tallaproducto.getParametroInventarioDefectos()!=null) {
					i2=0;
					for(ParametroInventarioDefecto parametroinventariodefecto : tallaproducto.getParametroInventarioDefectos()) {
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
		cell.setCellValue(TallaProductoConstantesFunciones.getTallaProductoDescripcion(tallaproducto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tallaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Talla Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTallaProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTallaProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTallaProducto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTallaProducto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTallaProducto() throws Exception {		
		this.startProcessTallaProducto(true);
	}
	
	public void startProcessTallaProducto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTallaProducto ,this.jPanelParametrosReportesTallaProducto, this.jScrollPanelDatosTallaProducto,this.jPanelPaginacionTallaProducto, this.jScrollPanelDatosEdicionTallaProducto, this.jPanelAccionesTallaProducto,this.jPanelAccionesFormularioTallaProducto,this.jmenuBarTallaProducto,this.jmenuBarDetalleTallaProducto,this.jTtoolBarTallaProducto,this.jTtoolBarDetalleTallaProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasTallaProducto=this.jTabbedPaneBusquedasTallaProducto; 
		
		final JPanel jPanelParametrosReportesTallaProducto=this.jPanelParametrosReportesTallaProducto;
		//final JScrollPane jScrollPanelDatosTallaProducto=this.jScrollPanelDatosTallaProducto;
		final JTable jTableDatosTallaProducto=this.jTableDatosTallaProducto;		
		final JPanel jPanelPaginacionTallaProducto=this.jPanelPaginacionTallaProducto;
		//final JScrollPane jScrollPanelDatosEdicionTallaProducto=this.jScrollPanelDatosEdicionTallaProducto;
		final JPanel jPanelAccionesTallaProducto=this.jPanelAccionesTallaProducto;
		
		JPanel jPanelCamposAuxiliarTallaProducto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTallaProducto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTallaProducto!=null) {
			jPanelCamposAuxiliarTallaProducto=this.jInternalFrameDetalleFormTallaProducto.jPanelCamposTallaProducto;
			jPanelAccionesFormularioAuxiliarTallaProducto=this.jInternalFrameDetalleFormTallaProducto.jPanelAccionesFormularioTallaProducto;
		}
		
		final JPanel jPanelCamposTallaProducto=jPanelCamposAuxiliarTallaProducto;
		final JPanel jPanelAccionesFormularioTallaProducto=jPanelAccionesFormularioAuxiliarTallaProducto;
		
		
		final JMenuBar jmenuBarTallaProducto=this.jmenuBarTallaProducto;
		final JToolBar jTtoolBarTallaProducto=this.jTtoolBarTallaProducto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTallaProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTallaProducto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTallaProducto!=null) {
			jmenuBarDetalleAuxiliarTallaProducto=this.jInternalFrameDetalleFormTallaProducto.jmenuBarDetalleTallaProducto;
			jTtoolBarDetalleAuxiliarTallaProducto=this.jInternalFrameDetalleFormTallaProducto.jTtoolBarDetalleTallaProducto;
		}
		
		final JMenuBar jmenuBarDetalleTallaProducto=jmenuBarDetalleAuxiliarTallaProducto;
		final JToolBar jTtoolBarDetalleTallaProducto=jTtoolBarDetalleAuxiliarTallaProducto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTallaProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTallaProducto;
			processRunnable.jTableDatos=jTableDatosTallaProducto;
			processRunnable.jPanelCampos=jPanelCamposTallaProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionTallaProducto;
			processRunnable.jPanelAcciones=jPanelAccionesTallaProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTallaProducto;
			
			
			processRunnable.jmenuBar=jmenuBarTallaProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTallaProducto;
			processRunnable.jTtoolBar=jTtoolBarTallaProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTallaProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTallaProducto ,jPanelParametrosReportesTallaProducto,jTableDatosTallaProducto, /*jScrollPanelDatosTallaProducto,*/jPanelCamposTallaProducto,jPanelPaginacionTallaProducto, /*jScrollPanelDatosEdicionTallaProducto,*/ jPanelAccionesTallaProducto,jPanelAccionesFormularioTallaProducto,jmenuBarTallaProducto,jmenuBarDetalleTallaProducto,jTtoolBarTallaProducto,jTtoolBarDetalleTallaProducto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTallaProducto ,jPanelParametrosReportesTallaProducto, jScrollPanelDatosTallaProducto,jPanelPaginacionTallaProducto, jScrollPanelDatosEdicionTallaProducto, jPanelAccionesTallaProducto,jPanelAccionesFormularioTallaProducto,jmenuBarTallaProducto,jmenuBarDetalleTallaProducto,jTtoolBarTallaProducto,jTtoolBarDetalleTallaProducto);
						
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
	
	public void finishProcessTallaProducto() {// throws Exception 
		this.finishProcessTallaProducto(true);
	}
	
	public void finishProcessTallaProducto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTallaProducto ,this.jPanelParametrosReportesTallaProducto, this.jScrollPanelDatosTallaProducto,this.jPanelPaginacionTallaProducto, this.jScrollPanelDatosEdicionTallaProducto, this.jPanelAccionesTallaProducto,this.jPanelAccionesFormularioTallaProducto,this.jmenuBarTallaProducto,this.jmenuBarDetalleTallaProducto,this.jTtoolBarTallaProducto,this.jTtoolBarDetalleTallaProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasTallaProducto=this.jTabbedPaneBusquedasTallaProducto; 
		
		final JPanel jPanelParametrosReportesTallaProducto=this.jPanelParametrosReportesTallaProducto;
		//final JScrollPane jScrollPanelDatosTallaProducto=this.jScrollPanelDatosTallaProducto;
		final JTable jTableDatosTallaProducto=this.jTableDatosTallaProducto;		
		final JPanel jPanelPaginacionTallaProducto=this.jPanelPaginacionTallaProducto;
		//final JScrollPane jScrollPanelDatosEdicionTallaProducto=this.jScrollPanelDatosEdicionTallaProducto;
		final JPanel jPanelAccionesTallaProducto=this.jPanelAccionesTallaProducto;
		
		JPanel jPanelCamposAuxiliarTallaProducto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTallaProducto=new JPanel();
		
		if(this.jInternalFrameDetalleFormTallaProducto!=null) {
			jPanelCamposAuxiliarTallaProducto=this.jInternalFrameDetalleFormTallaProducto.jPanelCamposTallaProducto;
			jPanelAccionesFormularioAuxiliarTallaProducto=this.jInternalFrameDetalleFormTallaProducto.jPanelAccionesFormularioTallaProducto;
		}
		
		final JPanel jPanelCamposTallaProducto=jPanelCamposAuxiliarTallaProducto;
		final JPanel jPanelAccionesFormularioTallaProducto=jPanelAccionesFormularioAuxiliarTallaProducto;
		
		
		final JMenuBar jmenuBarTallaProducto=this.jmenuBarTallaProducto;		
		final JToolBar jTtoolBarTallaProducto=this.jTtoolBarTallaProducto;
				
		JMenuBar jmenuBarDetalleAuxiliarTallaProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTallaProducto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTallaProducto!=null) {
			jmenuBarDetalleAuxiliarTallaProducto=this.jInternalFrameDetalleFormTallaProducto.jmenuBarDetalleTallaProducto;
			jTtoolBarDetalleAuxiliarTallaProducto=this.jInternalFrameDetalleFormTallaProducto.jTtoolBarDetalleTallaProducto;		
		}
		
		final JMenuBar jmenuBarDetalleTallaProducto=jmenuBarDetalleAuxiliarTallaProducto;
		final JToolBar jTtoolBarDetalleTallaProducto=jTtoolBarDetalleAuxiliarTallaProducto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTallaProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTallaProducto;
			processRunnable.jTableDatos=jTableDatosTallaProducto;
			processRunnable.jPanelCampos=jPanelCamposTallaProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionTallaProducto;
			processRunnable.jPanelAcciones=jPanelAccionesTallaProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTallaProducto;
			
			
			processRunnable.jmenuBar=jmenuBarTallaProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTallaProducto;
			processRunnable.jTtoolBar=jTtoolBarTallaProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTallaProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTallaProducto ,jPanelParametrosReportesTallaProducto, jTableDatosTallaProducto,/*jScrollPanelDatosTallaProducto,*/jPanelCamposTallaProducto,jPanelPaginacionTallaProducto, /*jScrollPanelDatosEdicionTallaProducto,*/ jPanelAccionesTallaProducto,jPanelAccionesFormularioTallaProducto,jmenuBarTallaProducto,jmenuBarDetalleTallaProducto,jTtoolBarTallaProducto,jTtoolBarDetalleTallaProducto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTallaProducto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTallaProducto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTallaProducto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTallaProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTallaProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTallaProducto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTallaProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTallaProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTallaProducto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tallaproductoConstantesFunciones.getsFinalQueryTallaProducto();
		String  finalQueryPaginacionTodos=this.tallaproductoConstantesFunciones.getsFinalQueryTallaProducto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TallaProductoConstantesFunciones.getArrayColumnasGlobalesNoTallaProducto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TallaProductoConstantesFunciones.getArrayColumnasGlobalesTallaProducto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TallaProductoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tallaproductosEliminados= new ArrayList<TallaProducto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTallaProducto();
		
				///*TallaProductoSessionBean*/this.tallaproductoSessionBean=new TallaProductoSessionBean();
			
			if(this.tallaproductoSessionBean==null) {
				this.tallaproductoSessionBean=new TallaProductoSessionBean();
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
					this.iNumeroPaginacion=TallaProductoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TallaProductoConstantesFunciones.getClassesForeignKeysOfTallaProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tallaproducto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tallaproductosAux= new ArrayList<TallaProducto>();
			
				
			tallaproductoLogic.setDatosCliente(this.datosCliente);
			tallaproductoLogic.setDatosDeep(this.datosDeep);
			tallaproductoLogic.setIsConDeep(true);
			
			
			tallaproductoLogic.getTallaProductoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tallaproductoLogic.getTodosTallaProductos(finalQueryGlobal,pagination);
					
					//tallaproductoLogic.getTodosTallaProductosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tallaproductoLogic.getTallaProductos()==null|| tallaproductoLogic.getTallaProductos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tallaproductosAux= new ArrayList<TallaProducto>();
							tallaproductosAux.addAll(tallaproductoLogic.getTallaProductos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tallaproductosAux= new ArrayList<TallaProducto>();
							tallaproductosAux.addAll(tallaproductos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tallaproductoLogic.getTodosTallaProductos(finalQueryGlobal+"",this.pagination);												
							
							//tallaproductoLogic.getTodosTallaProductosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTallaProductos("Todos",tallaproductoLogic.getTallaProductos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tallaproductoLogic.setTallaProductos(new ArrayList<TallaProducto>());					
							tallaproductoLogic.getTallaProductos().addAll(tallaproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tallaproductos=new ArrayList<TallaProducto>();
							tallaproductos.addAll(tallaproductosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTallaProducto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTallaProducto=this.idActual;
				
				} else if(this.idTallaProductoActual!=null && this.idTallaProductoActual!=0L) {
					idTallaProducto=idTallaProductoActual;
				}
				
					
				this.sDetalleReporte=TallaProductoConstantesFunciones.getDetalleIndicePorId(idTallaProducto);
				
				this.tallaproductos=new ArrayList<TallaProducto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tallaproductoLogic.getEntity(idTallaProducto);
					
					//tallaproductoLogic.getEntityWithConnection(idTallaProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tallaproductoLogic.setTallaProductos(new ArrayList<TallaProducto>());
					tallaproductoLogic.getTallaProductos().add(tallaproductoLogic.getTallaProducto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tallaproductos=new ArrayList<TallaProducto>();
					this.tallaproductos.add(tallaproducto);
				}
				
				if(tallaproductoLogic.getTallaProducto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TallaProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tallaproductoLogic.getTallaProductosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TallaProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TallaProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tallaproductoLogic.getTallaProductos()==null||tallaproductoLogic.getTallaProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tallaproductos==null|| tallaproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tallaproductosAux=new ArrayList<TallaProducto>();
						tallaproductosAux.addAll(tallaproductoLogic.getTallaProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tallaproductosAux=new ArrayList<TallaProducto>();
							tallaproductosAux.addAll(tallaproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tallaproductoLogic.getTallaProductosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TallaProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TallaProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTallaProductos("BusquedaPorCodigo",tallaproductoLogic.getTallaProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTallaProductos("BusquedaPorCodigo",tallaproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tallaproductoLogic.setTallaProductos(new ArrayList<TallaProducto>());
						tallaproductoLogic.getTallaProductos().addAll(tallaproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tallaproductos=new ArrayList<TallaProducto>();
							tallaproductos.addAll(tallaproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TallaProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tallaproductoLogic.getTallaProductosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TallaProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TallaProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tallaproductoLogic.getTallaProductos()==null||tallaproductoLogic.getTallaProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tallaproductos==null|| tallaproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tallaproductosAux=new ArrayList<TallaProducto>();
						tallaproductosAux.addAll(tallaproductoLogic.getTallaProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tallaproductosAux=new ArrayList<TallaProducto>();
							tallaproductosAux.addAll(tallaproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tallaproductoLogic.getTallaProductosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TallaProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TallaProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTallaProductos("BusquedaPorNombre",tallaproductoLogic.getTallaProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTallaProductos("BusquedaPorNombre",tallaproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tallaproductoLogic.setTallaProductos(new ArrayList<TallaProducto>());
						tallaproductoLogic.getTallaProductos().addAll(tallaproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tallaproductos=new ArrayList<TallaProducto>();
							tallaproductos.addAll(tallaproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TallaProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tallaproductoLogic.getTallaProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TallaProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TallaProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tallaproductoLogic.getTallaProductos()==null||tallaproductoLogic.getTallaProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tallaproductos==null|| tallaproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tallaproductosAux=new ArrayList<TallaProducto>();
						tallaproductosAux.addAll(tallaproductoLogic.getTallaProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tallaproductosAux=new ArrayList<TallaProducto>();
							tallaproductosAux.addAll(tallaproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tallaproductoLogic.getTallaProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TallaProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TallaProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTallaProductos("FK_IdEmpresa",tallaproductoLogic.getTallaProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTallaProductos("FK_IdEmpresa",tallaproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tallaproductoLogic.setTallaProductos(new ArrayList<TallaProducto>());
						tallaproductoLogic.getTallaProductos().addAll(tallaproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tallaproductos=new ArrayList<TallaProducto>();
							tallaproductos.addAll(tallaproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoProducto")) {
				this.sDetalleReporte=TallaProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tallaproductoLogic.getTallaProductosFK_IdTipoProducto(finalQueryGlobal,pagination,id_tipo_productoFK_IdTipoProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TallaProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TallaProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tallaproductoLogic.getTallaProductos()==null||tallaproductoLogic.getTallaProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tallaproductos==null|| tallaproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tallaproductosAux=new ArrayList<TallaProducto>();
						tallaproductosAux.addAll(tallaproductoLogic.getTallaProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tallaproductosAux=new ArrayList<TallaProducto>();
							tallaproductosAux.addAll(tallaproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tallaproductoLogic.getTallaProductosFK_IdTipoProducto(finalQueryGlobal,pagination,id_tipo_productoFK_IdTipoProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TallaProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TallaProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTallaProductos("FK_IdTipoProducto",tallaproductoLogic.getTallaProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTallaProductos("FK_IdTipoProducto",tallaproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tallaproductoLogic.setTallaProductos(new ArrayList<TallaProducto>());
						tallaproductoLogic.getTallaProductos().addAll(tallaproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tallaproductos=new ArrayList<TallaProducto>();
							tallaproductos.addAll(tallaproductosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTallaProducto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTallaProducto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tallaproductoLogic.getTallaProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tallaproductos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tallaproductoLogic.getTallaProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tallaproductos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TallaProducto tallaproducto) {
		Boolean permite=true;
		
		if(this.tallaproducto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TallaProductoConstantesFunciones.getOrderByListaTallaProducto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TallaProductoConstantesFunciones.getOrderByListaTallaProducto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TallaProducto tallaproducto:tallaproductoLogic.getTallaProductos()) {
				if(tallaproducto.getsType().equals(Constantes2.S_TOTALES)) {
					tallaproductoTotales=tallaproducto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TallaProducto tallaproducto:this.tallaproductos) {
				if(tallaproducto.getsType().equals(Constantes2.S_TOTALES)) {
					tallaproductoTotales=tallaproducto;
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
			this.tallaproductoAux=new TallaProducto();
			this.tallaproductoAux.setsType(Constantes2.S_TOTALES);
			this.tallaproductoAux.setIsNew(false);
			this.tallaproductoAux.setIsChanged(false);
			this.tallaproductoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TallaProductoConstantesFunciones.TotalizarValoresFilaTallaProducto(this.tallaproductoLogic.getTallaProductos(),this.tallaproductoAux);
				
				this.tallaproductoLogic.getTallaProductos().add(this.tallaproductoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TallaProductoConstantesFunciones.TotalizarValoresFilaTallaProducto(this.tallaproductos,this.tallaproductoAux);
				
				this.tallaproductos.add(this.tallaproductoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tallaproductoTotales=new TallaProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tallaproductoLogic.getTallaProductos().remove(tallaproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tallaproductos.remove(tallaproductoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tallaproductoTotales=new TallaProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TallaProducto tallaproducto:tallaproductoLogic.getTallaProductos()) {
				if(tallaproducto.getsType().equals(Constantes2.S_TOTALES)) {
					tallaproductoTotales=tallaproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TallaProductoConstantesFunciones.TotalizarValoresFilaTallaProducto(this.tallaproductoLogic.getTallaProductos(),tallaproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TallaProducto tallaproducto:this.tallaproductos) {
				if(tallaproducto.getsType().equals(Constantes2.S_TOTALES)) {
					tallaproductoTotales=tallaproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TallaProductoConstantesFunciones.TotalizarValoresFilaTallaProducto(this.tallaproductos,tallaproductoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTallaProductosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTallaProductosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTallaProductosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTallaProductosFK_IdTipoProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTallaProductosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tallaproductoLogic.getTallaProductosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTallaProductosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tallaproductoLogic.getTallaProductosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTallaProductosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tallaproductoLogic.getTallaProductosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTallaProductosFK_IdTipoProducto(String sFinalQuery,Long id_tipo_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tallaproductoLogic.getTallaProductosFK_IdTipoProducto(sFinalQuery,this.pagination,id_tipo_producto);
				
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
	
	public void inicializarPermisosTallaProducto() {
		this.isPermisoTodoTallaProducto=false;
		this.isPermisoNuevoTallaProducto=false;
		this.isPermisoActualizarTallaProducto=false;
		this.isPermisoActualizarOriginalTallaProducto=false;
		this.isPermisoEliminarTallaProducto=false;
		this.isPermisoGuardarCambiosTallaProducto=false;
		this.isPermisoConsultaTallaProducto=false;
		this.isPermisoBusquedaTallaProducto=false;
		this.isPermisoReporteTallaProducto=false;		
		this.isPermisoOrdenTallaProducto=false;		
		this.isPermisoPaginacionMedioTallaProducto=false;		
		this.isPermisoPaginacionAltoTallaProducto=false;
		this.isPermisoPaginacionTodoTallaProducto=false;
		this.isPermisoCopiarTallaProducto=false;		
		this.isPermisoVerFormTallaProducto=false;		
		this.isPermisoDuplicarTallaProducto=false;		
		this.isPermisoOrdenTallaProducto=false;		
	}
	
	public void setPermisosUsuarioTallaProducto(Boolean isPermiso) {
		this.isPermisoTodoTallaProducto=isPermiso;
		this.isPermisoNuevoTallaProducto=isPermiso;
		this.isPermisoActualizarTallaProducto=isPermiso;
		this.isPermisoActualizarOriginalTallaProducto=isPermiso;
		this.isPermisoEliminarTallaProducto=isPermiso;
		this.isPermisoGuardarCambiosTallaProducto=isPermiso;
		this.isPermisoConsultaTallaProducto=isPermiso;
		this.isPermisoBusquedaTallaProducto=isPermiso;
		this.isPermisoReporteTallaProducto=isPermiso;
		this.isPermisoOrdenTallaProducto=isPermiso;		
		this.isPermisoPaginacionMedioTallaProducto=isPermiso;		
		this.isPermisoPaginacionAltoTallaProducto=isPermiso;		
		this.isPermisoPaginacionTodoTallaProducto=isPermiso;		
		this.isPermisoCopiarTallaProducto=isPermiso;		
		this.isPermisoVerFormTallaProducto=isPermiso;		
		this.isPermisoDuplicarTallaProducto=isPermiso;
		this.isPermisoOrdenTallaProducto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTallaProducto(Boolean isPermiso) {
		//this.isPermisoTodoTallaProducto=isPermiso;
		this.isPermisoNuevoTallaProducto=isPermiso;
		this.isPermisoActualizarTallaProducto=isPermiso;
		this.isPermisoActualizarOriginalTallaProducto=isPermiso;
		this.isPermisoEliminarTallaProducto=isPermiso;
		this.isPermisoGuardarCambiosTallaProducto=isPermiso;
		//this.isPermisoConsultaTallaProducto=isPermiso;
		//this.isPermisoBusquedaTallaProducto=isPermiso;
		//this.isPermisoReporteTallaProducto=isPermiso;
		//this.isPermisoOrdenTallaProducto=isPermiso;		
		//this.isPermisoPaginacionMedioTallaProducto=isPermiso;		
		//this.isPermisoPaginacionAltoTallaProducto=isPermiso;		
		//this.isPermisoPaginacionTodoTallaProducto=isPermiso;		
		//this.isPermisoCopiarTallaProducto=isPermiso;		
		//this.isPermisoDuplicarTallaProducto=isPermiso;
		//this.isPermisoOrdenTallaProducto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTallaProductoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ProductoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
		if(TallaProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosProducto=this.verificarGetPermisosUsuarioOpcionTallaProductoClaseRelacionada(this.opcionsRelacionadas,ProductoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosParametroInventarioDefecto=false;
		this.isTienePermisosParametroInventarioDefecto=this.verificarGetPermisosUsuarioOpcionTallaProductoClaseRelacionada(this.opcionsRelacionadas,ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTallaProducto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTallaProductoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosProducto=conPermiso;
		this.isTienePermisosParametroInventarioDefecto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTallaProductoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTallaProductoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTallaProductoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosProducto && this.jInternalFrameDetalleFormTallaProducto!=null && this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTallaProducto.jTabbedPaneRelacionesTallaProducto.remove(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosParametroInventarioDefecto && this.jInternalFrameDetalleFormTallaProducto!=null && this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTallaProducto.jTabbedPaneRelacionesTallaProducto.remove(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTallaProducto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TallaProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TallaProductoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTallaProducto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTallaProducto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTallaProducto=this.isPermisoActualizarTallaProducto;
			this.isPermisoEliminarTallaProducto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTallaProducto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTallaProducto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTallaProducto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTallaProducto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTallaProducto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTallaProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTallaProducto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTallaProducto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTallaProducto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTallaProducto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTallaProducto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTallaProducto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTallaProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTallaProducto.setToolTipText(this.jTableDatosTallaProducto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTallaProducto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTallaProducto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TallaProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TallaProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTallaProducto() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosProducto && this.tallaproductoConstantesFunciones.mostrarProductoTallaProducto && !TallaProductoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Producto");
			reporte.setsDescripcion("Producto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosParametroInventarioDefecto && this.tallaproductoConstantesFunciones.mostrarParametroInventarioDefectoTallaProducto && !TallaProductoConstantesFunciones.ISGUARDARREL) {

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
	public void inicializarCombosForeignKeyTallaProductoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tipoproductosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTallaProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TallaProductoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTallaProductoListas(false);
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
	
	public void cargarCombosLoteForeignKeyTallaProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TallaProductoParameterReturnGeneral tallaproductoReturnGeneral=new TallaProductoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tallaproductoConstantesFunciones.cargarid_empresaTallaProducto)
					 || (this.esRecargarFks && this.tallaproductoConstantesFunciones.cargarid_empresaTallaProducto)) {

					if(!this.tallaproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tallaproductoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTipoProducto="";

				if(((this.tipoproductosForeignKey==null||this.tipoproductosForeignKey.size()<=0) && this.tallaproductoConstantesFunciones.cargarid_tipo_productoTallaProducto)
					 || (this.esRecargarFks && this.tallaproductoConstantesFunciones.cargarid_tipo_productoTallaProducto)) {

					if(!this.tallaproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoProductoConstantesFunciones.getArrayColumnasGlobalesTipoProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoProducto, "");
						finalQueryGlobalTipoProducto+=TipoProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoProducto=" WHERE " + ConstantesSql.ID + "="+tallaproductoSessionBean.getlidTipoProductoActual();
					}
				} else {
					finalQueryGlobalTipoProducto="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tallaproductoReturnGeneral=tallaproductoLogic.cargarCombosLoteForeignKeyTallaProducto(finalQueryGlobalEmpresa,finalQueryGlobalTipoProducto);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tallaproductoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTipoProducto.equals("NONE")) {
				this.tipoproductosForeignKey=tallaproductoReturnGeneral.gettipoproductosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTallaProducto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoProducto();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tallaproductoSessionBean==null) {
				this.tallaproductoSessionBean=new TallaProductoSessionBean();
			}

			if(!this.tallaproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.tallaproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProducto()) {
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
	
	public void initActionsCombosTodosForeignKeyTallaProducto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTallaProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTallaProducto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTallaProducto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTallaProducto(TallaProducto tallaproducto)throws Exception {	
		try {
			
			this.setActualTipoProductoForeignKey(tallaproducto.getid_tipo_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTallaProducto(TallaProducto tallaproducto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTallaProducto()throws Exception {	
		try {
			
			this.setActualTipoProductoForeignKey(this.tallaproductoConstantesFunciones.getid_tipo_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTallaProducto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTallaProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTallaProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTallaProducto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTallaProducto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoProductosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTallaProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTallaProducto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_empresaTallaProducto!=null && this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_empresaTallaProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_empresaTallaProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_tipo_productoTallaProducto!=null && this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_tipo_productoTallaProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_tipo_productoTallaProducto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public TallaProductoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TallaProductoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TallaProductoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tallaproductoSessionBean=new TallaProductoSessionBean(); 
		this.tallaproductoConstantesFunciones=new TallaProductoConstantesFunciones(); 
		this.tallaproductoBean=new TallaProducto();//(this.tallaproductoConstantesFunciones); 		
		this.tallaproductoReturnGeneral=new TallaProductoParameterReturnGeneral(); 
		
		this.tallaproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tallaproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TallaProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TallaProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TallaProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTallaProducto(true);
			
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
			
			this.tallaproductoConstantesFunciones=new TallaProductoConstantesFunciones(); 
			this.tallaproductoBean=new TallaProducto();//this.tallaproductoConstantesFunciones); 			
			this.tallaproductoReturnGeneral=new TallaProductoParameterReturnGeneral(); 
		
			TallaProductoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Talla Producto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tallaproducto=new TallaProducto();
			this.tallaproductos = new ArrayList<TallaProducto>();
			this.tallaproductosAux = new ArrayList<TallaProducto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic=new TallaProductoLogic();
				this.tallaproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.tallaproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tallaproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTallaProducto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTallaProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTallaProducto);	
					}
					
					if(this.jInternalFrameImportacionTallaProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTallaProducto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTallaProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTallaProducto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTallaProducto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTallaProducto);
				this.jInternalFrameDetalleFormTallaProducto.setVisible(false);
				this.jInternalFrameDetalleFormTallaProducto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTallaProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTallaProducto);
					this.jInternalFrameReporteDinamicoTallaProducto.setVisible(false);
					this.jInternalFrameReporteDinamicoTallaProducto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTallaProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTallaProducto);
					this.jInternalFrameImportacionTallaProducto.setVisible(false);
					this.jInternalFrameImportacionTallaProducto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTallaProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTallaProducto);
					this.jInternalFrameOrderByTallaProducto.setVisible(false);
					this.jInternalFrameOrderByTallaProducto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTallaProductoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TallaProductoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tallaproductoReturnGeneral=new TallaProductoParameterReturnGeneral();
			
			this.tallaproductoParameterGeneral=new TallaProductoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tallaproductoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TallaProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ProductoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TallaProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tallaproductoSessionBean.getEsGuardarRelacionado(),this.tallaproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TallaProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tallaproductoSessionBean.getEsGuardarRelacionado(),this.tallaproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTallaProducto=false;
			this.isVisibilidadCeldaDuplicarTallaProducto=true;
			this.isVisibilidadCeldaCopiarTallaProducto=true;
			this.isVisibilidadCeldaVerFormTallaProducto=true;
			this.isVisibilidadCeldaOrdenTallaProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesTallaProducto=false;
			this.isVisibilidadCeldaModificarTallaProducto=false;
			this.isVisibilidadCeldaActualizarTallaProducto=false;
			this.isVisibilidadCeldaEliminarTallaProducto=false;
			this.isVisibilidadCeldaCancelarTallaProducto=false;
			this.isVisibilidadCeldaGuardarTallaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosTallaProducto=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoProducto=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTallaProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTallaProducto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTallaProducto(false);
			
			this.setPermisosUsuarioTallaProducto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tallaproductoSessionBean.getEsGuardarRelacionado() 
				|| (this.tallaproductoSessionBean.getEsGuardarRelacionado() && this.tallaproductoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTallaProductoClasesRelacionadas();
			}
			
			if(this.tallaproductoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTallaProductoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TallaProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTallaProducto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTallaProducto();
			}
			
			if(!this.isPermisoBusquedaTallaProducto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTallaProducto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tallaproductoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTallaProducto,this.isPermisoPaginacionMedioTallaProducto,this.isPermisoPaginacionTodoTallaProducto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TallaProductoConstantesFunciones.getTiposSeleccionarTallaProducto());
				
				this.tiposColumnasSelect=TallaProductoConstantesFunciones.getTiposSeleccionarTallaProducto(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTallaProducto();				
				//this.tiposRelacionesSelect=TallaProductoConstantesFunciones.getTiposRelacionesTallaProducto(true);
				
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
			//if(!this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTallaProducto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTallaProducto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTallaProducto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTallaProducto() ;
			
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
				tallaproductoImplementable= (TallaProductoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TallaProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tallaproductoImplementableHome= (TallaProductoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TallaProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tallaproductos= new ArrayList<TallaProducto>();
			this.tallaproductosEliminados= new ArrayList<TallaProducto>();
						
			this.isEsNuevoTallaProducto=false;
			this.esParaAccionDesdeFormularioTallaProducto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tipoproductosForeignKey=new ArrayList<TipoProducto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTallaProducto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTallaProducto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TallaProductoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TallaProductoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTallaProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTallaProducto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTallaProducto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTallaProducto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTallaProducto();
			}
			
			TallaProductoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTallaProducto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTallaProducto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTallaProducto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTallaProducto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TallaProducto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTallaProducto() {
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
			if(sTipo.equals("RelacionesTallaProducto")) {
				iIndex=this.jInternalFrameDetalleFormTallaProducto.jTabbedPaneRelacionesTallaProducto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTallaProducto.jTabbedPaneRelacionesTallaProducto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTallaProducto.getSelectedRow();	
				
				

				if(sTitle.equals("Parametro Inventario Defectos")) {
					if(!ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTallaProducto();

						this.cargarParteTabPanelRelacionadaParametroInventarioDefecto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Productos")) {
					if(!ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTallaProducto();

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
				this.finishProcessTallaProducto();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaParametroInventarioDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTallaProducto.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(false,true,iIndex);
		this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();

		//this.jTabbedPaneRelacionesTallaProducto.updateUI();
		//this.jTabbedPaneRelacionesTallaProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTallaProducto.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProducto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTallaProducto.cargarSessionConBeanSwingJInternalFrameProducto(false,true,iIndex);
		this.jButtonProductoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProducto();

		//this.jTabbedPaneRelacionesTallaProducto.updateUI();
		//this.jTabbedPaneRelacionesTallaProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTallaProducto.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Producto")) {
				int row=this.jTableDatosTallaProducto.getSelectedRow();
				jButtonProductoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ParametroInventarioDefecto")) {
				int row=this.jTableDatosTallaProducto.getSelectedRow();
				jButtonParametroInventarioDefectoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Producto")) {

					if(this.isTienePermisosProducto && this.tallaproductoConstantesFunciones.mostrarProductoTallaProducto && !TallaProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Productos"+"("+ProductoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Productos");

						if(tallaproductoConstantesFunciones.resaltarProductoTallaProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tallaproductoConstantesFunciones.resaltarProductoTallaProducto);
						}

						jmenuItem.setEnabled(this.tallaproductoConstantesFunciones.activarProductoTallaProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Producto"));

						

						this.jInternalFrameDetalleFormTallaProducto.jmenuDetalleTallaProducto.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Parametro Inventario Defecto")) {

					if(this.isTienePermisosParametroInventarioDefecto && this.tallaproductoConstantesFunciones.mostrarParametroInventarioDefectoTallaProducto && !TallaProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Inventario Defectos"+"("+ParametroInventarioDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Inventario Defectos");

						if(tallaproductoConstantesFunciones.resaltarParametroInventarioDefectoTallaProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tallaproductoConstantesFunciones.resaltarParametroInventarioDefectoTallaProducto);
						}

						jmenuItem.setEnabled(this.tallaproductoConstantesFunciones.activarParametroInventarioDefectoTallaProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroInventarioDefecto"));

						

						this.jInternalFrameDetalleFormTallaProducto.jmenuDetalleTallaProducto.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTallaProducto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTallaProducto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTallaProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTallaProductoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTallaProducto();
		
		this.cargarCombosFrameForeignKeyTallaProducto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTallaProducto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTallaProducto();
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
	
	public void jButtonNuevoTallaProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tallaproductoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTallaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
			
			
			if(jTableDatosTallaProducto.getRowCount()>=1) {
				jTableDatosTallaProducto.removeRowSelectionInterval(0, jTableDatosTallaProducto.getRowCount()-1);						
			}
			
			this.isEsNuevoTallaProducto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTallaProducto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTallaProducto(true);			
			//this.tallaproducto=new TallaProducto();
			//this.tallaproducto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTallaProducto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTallaProducto() ;
			
			if(TallaProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTallaProducto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tallaproducto);	
			this.actualizarInformacion("INFO_PADRE",false,this.tallaproducto);				
			
			TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
			
			if(this.tallaproductoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TallaProducto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTallaProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TallaProducto> tallaproductosSeleccionados=new ArrayList<TallaProducto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTallaProducto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTallaProducto.getSelectedRows().length;			
			}
			
			tallaproductosSeleccionados=this.getTallaProductosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTallaProducto--;			
				//TallaProducto tallaproductoAux= new TallaProducto();			
				//tallaproductoAux.setId(this.iIdNuevoTallaProducto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TallaProducto tallaproductoOrigen=new TallaProducto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TallaProducto tallaproductoOrigen : tallaproductosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTallaProducto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tallaproductoOrigen =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tallaproductoOrigen =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTallaProducto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tallaproducto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTallaProducto(tallaproductoOrigen,this.tallaproducto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTallaProducto(this.tallaproducto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tallaproductoLogic.getTallaProductos().add(this.tallaproductoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tallaproductos.add(this.tallaproductoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTallaProducto(false);
				
				this.jTableDatosTallaProducto.setRowSelectionInterval(this.getIndiceNuevoTallaProducto(), this.getIndiceNuevoTallaProducto());
				
				int iLastRow =  this.jTableDatosTallaProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTallaProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTallaProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTallaProducto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTallaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TallaProducto> tallaproductosSeleccionados=new ArrayList<TallaProducto>();									
		
			TallaProducto tallaproductoOrigen=new TallaProducto();
			TallaProducto tallaproductoDestino=new TallaProducto();
				
			tallaproductosSeleccionados=this.getTallaProductosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTallaProducto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tallaproductosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTallaProducto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tallaproductoOrigen =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tallaproductoOrigen =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tallaproductoDestino =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tallaproductoDestino =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tallaproductoOrigen =tallaproductosSeleccionados.get(0);
				tallaproductoDestino =tallaproductosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTallaProducto(tallaproductoOrigen,tallaproductoDestino,true,false);
				
				tallaproductoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tallaproductoDestino,tallaproductoLogic.getTallaProductos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tallaproductoDestino,tallaproductos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTallaProducto(false);
				
				//this.jTableDatosTallaProducto.setRowSelectionInterval(this.getIndiceNuevoTallaProducto(), this.getIndiceNuevoTallaProducto());
				
				int iLastRow =  this.jTableDatosTallaProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTallaProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTallaProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTallaProducto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTallaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTallaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTallaProducto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTallaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTallaProducto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTallaProducto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTallaProducto.setVisible(!isVisible);
			this.jPanelPaginacionTallaProducto.setVisible(!isVisible);
			this.jPanelAccionesTallaProducto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTallaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTallaProducto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTallaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTallaProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTallaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTallaProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTallaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTallaProducto();
			
			this.abrirFrameOrderByTallaProducto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTallaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTallaProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTallaProducto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTallaProducto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTallaProducto.isMaximum()) {
					this.jInternalFrameDetalleFormTallaProducto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTallaProducto.setSize(this.jInternalFrameDetalleFormTallaProducto.iWidthFormulario,this.jInternalFrameDetalleFormTallaProducto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTallaProducto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTallaProducto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTallaProducto.isMaximum()) {
						this.jInternalFrameDetalleFormTallaProducto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTallaProducto.jContentPaneDetalleTallaProducto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTallaProducto.jTabbedPaneRelacionesTallaProducto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTallaProducto.jContentPaneDetalleTallaProducto.getWidth(),TallaProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTallaProducto.jTabbedPaneRelacionesTallaProducto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTallaProducto.jContentPaneDetalleTallaProducto.getWidth(),TallaProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTallaProducto.jTabbedPaneRelacionesTallaProducto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTallaProducto.jContentPaneDetalleTallaProducto.getWidth(),TallaProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();
					}

					if(ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProducto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTallaProducto.setVisible(true);
	        this.jInternalFrameDetalleFormTallaProducto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTallaProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTallaProducto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTallaProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTallaProducto,false,this);
				} else {
					this.jInternalFrameOrderByTallaProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTallaProducto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTallaProducto);
				this.jInternalFrameOrderByTallaProducto.setVisible(false);
				this.jInternalFrameOrderByTallaProducto.setSelected(false);
				
				this.jInternalFrameOrderByTallaProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTallaProducto"));
				
				this.inicializarActualizarBindingTablaOrderByTallaProducto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTallaProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTallaProducto==null) {
				
				this.jInternalFrameImportacionTallaProducto=new ImportacionJInternalFrame(TallaProductoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTallaProducto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTallaProducto);
				this.jInternalFrameImportacionTallaProducto.setVisible(false);
				this.jInternalFrameImportacionTallaProducto.setSelected(false);


				this.jInternalFrameImportacionTallaProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTallaProducto"));
				this.jInternalFrameImportacionTallaProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTallaProducto"));
				this.jInternalFrameImportacionTallaProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTallaProducto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTallaProducto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTallaProducto==null) {
				this.jInternalFrameReporteDinamicoTallaProducto=new ReporteDinamicoJInternalFrame(TallaProductoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTallaProducto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTallaProducto);
				this.jInternalFrameReporteDinamicoTallaProducto.setVisible(false);
				this.jInternalFrameReporteDinamicoTallaProducto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTallaProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTallaProducto"));
				this.jInternalFrameReporteDinamicoTallaProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTallaProducto"));
				this.jInternalFrameReporteDinamicoTallaProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTallaProducto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTallaProducto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaParametroInventarioDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTallaProducto.jContentPaneDetalleTallaProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProducto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTallaProducto.jContentPaneDetalleTallaProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTallaProducto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTallaProducto);
			
	       	this.jInternalFrameDetalleFormTallaProducto.setVisible(false);
	        this.jInternalFrameDetalleFormTallaProducto.setSelected(false);
			
			//this.jInternalFrameDetalleFormTallaProducto.dispose();
			//this.jInternalFrameDetalleFormTallaProducto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTallaProducto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTallaProducto.setVisible(true);
	        this.jInternalFrameReporteDinamicoTallaProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTallaProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTallaProducto.setVisible(true);
	        this.jInternalFrameImportacionTallaProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTallaProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTallaProducto.setVisible(true);
	        this.jInternalFrameOrderByTallaProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTallaProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTallaProducto.setVisible(false);
	        this.jInternalFrameOrderByTallaProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTallaProducto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTallaProducto.setVisible(false);
	        this.jInternalFrameReporteDinamicoTallaProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTallaProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTallaProducto.setVisible(false);
	        this.jInternalFrameImportacionTallaProducto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTallaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTallaProducto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTallaProducto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTallaProducto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTallaProducto(true);
			//this.isEsNuevoTallaProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproducto =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tallaproducto =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTallaProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTallaProducto(false) ;
			
			if(tallaproductoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado() && ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TallaProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTallaProducto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTallaProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTallaProductoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTallaProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproducto =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tallaproducto =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTallaProducto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTallaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTallaProducto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTallaProducto(true);
			//this.isEsNuevoTallaProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproducto =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tallaproducto =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tallaproducto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTallaProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTallaProducto(false) ;
			
			if(TallaProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTallaProducto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTallaProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoProducto(List<TipoProducto> tipoproductosForeignKey)throws Exception{
		TableColumn tableColumnTipoProducto=this.jTableDatosTallaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTallaProducto,TallaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO));
		TableCellEditor tableCellEditorTipoProducto =tableColumnTipoProducto.getCellEditor();

		TipoProductoTableCell tipoproductoTableCellFk=(TipoProductoTableCell)tableCellEditorTipoProducto;

		if(tipoproductoTableCellFk!=null) {
			tipoproductoTableCellFk.settipoproductosForeignKey(tipoproductosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTallaProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoproductoTableCellFk.setRowActual(intSelectedRow);
			//tipoproductoTableCellFk.settipoproductosForeignKeyActual(tipoproductosForeignKey);
		//}


		if(tipoproductoTableCellFk!=null) {
			tipoproductoTableCellFk.RecargarTipoProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTallaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTallaProducto(false);
			
			//if(!this.isEsNuevoTallaProducto) {								
				int intSelectedRow = this.jTableDatosTallaProducto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproducto =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tallaproducto =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TallaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTallaProducto(this.tallaproducto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTallaProducto(this.tallaproducto);
				
			}
			
			if(this.permiteMantenimiento(this.tallaproducto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTallaProducto=true;
					this.inicializarActualizarBindingTablaTallaProducto(false);
					this.isEsNuevoTallaProducto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTallaProducto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTallaProducto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTallaProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTallaProducto(false);
				
				this.habilitarDeshabilitarControlesTallaProducto(false);
			
												
				
				if(TallaProductoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTallaProducto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTallaProductoActionPerformed(evt,tallaproductoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTallaProducto(this.tallaproducto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTallaProducto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tallaproductoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tallaproducto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TallaProducto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TallaProducto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTallaProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTallaProducto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproducto =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				this.tallaproducto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tallaproducto =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				this.tallaproducto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tallaproducto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TallaProductoModel) this.jTableDatosTallaProducto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTallaProducto=true;
				this.inicializarActualizarBindingTablaTallaProducto(false);
				this.isEsNuevoTallaProducto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTallaProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTallaProducto(false);
				
				this.habilitarDeshabilitarControlesTallaProducto(false);
				
				
				
				if(TallaProductoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTallaProducto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTallaProductoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTallaProducto.getRowCount()>=1) {
				jTableDatosTallaProducto.removeRowSelectionInterval(0, jTableDatosTallaProducto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTallaProducto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTallaProducto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTallaProducto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTallaProducto(false) ;
			
			this.isEsNuevoTallaProducto=false;
			
			if(TallaProductoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTallaProducto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTallaProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTallaProducto(false);
				
				//SI ES MANUAL
				if(TallaProductoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTallaProducto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTallaProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTallaProducto--;			
			//TallaProducto tallaproductoAux= new TallaProducto();			
			//tallaproductoAux.setId(this.iIdNuevoTallaProducto);
			
			if(this.jInternalFrameDetalleFormTallaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTallaProducto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTallaProducto(this.tallaproducto);
			
			this.tallaproducto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tallaproductoLogic.getTallaProductos().add(this.tallaproductoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tallaproductos.add(this.tallaproductoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTallaProducto(false);
			
			this.jTableDatosTallaProducto.setRowSelectionInterval(this.getIndiceNuevoTallaProducto(), this.getIndiceNuevoTallaProducto());
			
			int iLastRow =  this.jTableDatosTallaProducto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTallaProducto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTallaProducto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTallaProducto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTallaProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTallaProducto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTallaProducto(false);
			
			//SI ES MANUAL
			if(TallaProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTallaProducto();
			}
			
			//this.abrirFrameTreeTallaProducto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTallaProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Talla ProductoS ?", "MANTENIMIENTO DE Talla Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTallaProducto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTallaProducto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tallaproductoReturnGeneral=tallaproductoLogic.procesarImportacionTallaProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tallaproductoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTallaProductoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTallaProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTallaProducto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTallaProducto.setFileImportacion(this.jInternalFrameImportacionTallaProducto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTallaProducto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTallaProducto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTallaProducto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTallaProducto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTallaProductoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TallaProducto> tallaproductosSeleccionados=new ArrayList<TallaProducto>();		

		tallaproductosSeleccionados=this.getTallaProductosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTallaProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTallaProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TallaProductoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TallaProductoBaseDesign.jrxml";
			
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
			
			this.generarReporteTallaProductos("Todos",tallaproductosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tallaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Talla Producto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTallaProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTallaProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TallaProductoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TallaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TallaProductoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TallaProductoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTallaProducto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTallaProducto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTallaProducto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TallaProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TallaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					sNombreCampoCategoria="id_tipo_producto";
					break;

				case TallaProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TallaProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTallaProducto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TallaProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TallaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					sNombreCampoCategoriaValor="id_tipo_producto";
					break;

				case TallaProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TallaProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTallaProducto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTallaProducto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TallaProductoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TallaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_producto");
					break;

				case TallaProductoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TallaProductoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTallaProductoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TallaProducto> tallaproductosSeleccionados=new ArrayList<TallaProducto>();		
		
		tallaproductosSeleccionados=this.getTallaProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tallaproducto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TallaProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTallaProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTallaProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TallaProductoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TallaProductoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TallaProducto tallaproducto:tallaproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tallaproducto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TallaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TallaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
					iRow++;

					for(TallaProducto tallaproducto:tallaproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tallaproducto.gettipoproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TallaProductoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TallaProductoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TallaProducto tallaproducto:tallaproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tallaproducto.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TallaProductoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TallaProductoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TallaProducto tallaproducto:tallaproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tallaproducto.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTallaProducto(row);				
			//	iRow++;
			//}				
			
			//for(TallaProducto tallaproductoAux:tallaproductosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTallaProducto(tallaproductoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tallaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Talla Producto",JOptionPane.INFORMATION_MESSAGE);
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
				this.tallaproductoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTallaProducto(false);
			
			//SI ES MANUAL
			if(TallaProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTallaProducto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTallaProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTallaProducto(false);
			
			//SI ES MANUAL
			if(TallaProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTallaProducto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTallaProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTallaProducto(false);
			
			//SI ES MANUAL
			if(TallaProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTallaProducto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTallaProducto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTallaProducto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTallaProducto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTallaProducto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTallaProducto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTallaProducto.setMinimumSize(dimensionMinimum);
		this.jTableDatosTallaProducto.setMaximumSize(dimensionMaximum);
		this.jTableDatosTallaProducto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTallaProducto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTallaProducto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTallaProducto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTallaProducto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTallaProducto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTallaProducto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTallaProducto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTallaProducto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TallaProductoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TallaProductoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTallaProducto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTallaProducto();
		
		this.inicializarActualizarBindingBotonesManualTallaProducto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTallaProducto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTallaProducto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTallaProducto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTallaProducto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTallaProducto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTallaProducto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTallaProducto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTallaProducto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTallaProducto.jCheckBoxPostAccionNuevoTallaProducto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTallaProducto.jCheckBoxPostAccionSinCerrarTallaProducto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTallaProducto.jCheckBoxPostAccionSinMensajeTallaProducto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTallaProducto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTallaProducto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTallaProducto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTallaProducto!=null) {
				this.jInternalFrameDetalleFormTallaProducto.jCheckBoxPostAccionNuevoTallaProducto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTallaProducto.jCheckBoxPostAccionSinCerrarTallaProducto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTallaProducto.jCheckBoxPostAccionSinMensajeTallaProducto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTallaProducto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTallaProducto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTallaProducto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTallaProducto.jComboBoxTiposAccionesFormularioTallaProducto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTallaProducto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTallaProducto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTallaProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTallaProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTallaProducto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTallaProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTallaProducto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTallaProducto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTallaProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTallaProducto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTallaProducto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTallaProducto(Boolean esInicializar) throws Exception {
		try	{	
			if(TallaProductoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTallaProducto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTallaProducto() throws Exception {
		try	{
			if(TallaProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTallaProducto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTallaProducto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTallaProducto.jComboBoxTiposAccionesFormularioTallaProducto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTallaProducto.jComboBoxTiposAccionesFormularioTallaProducto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTallaProducto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTallaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTallaProducto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTallaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTallaProducto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTallaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTallaProducto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTallaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTallaProducto.addItem(reporte);
			}
			
			
			if(!this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTallaProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTallaProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTallaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTallaProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTallaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTallaProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTallaProducto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTallaProducto.jComboBoxTiposAccionesFormularioTallaProducto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTallaProducto.jComboBoxTiposAccionesFormularioTallaProducto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTallaProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTallaProducto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTallaProducto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTallaProducto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTallaProducto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTallaProducto!=null) {
				this.jInternalFrameReporteDinamicoTallaProducto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTallaProducto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTallaProducto!=null) {
				this.jInternalFrameReporteDinamicoTallaProducto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTallaProducto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTallaProducto!=null) {
				
				if(this.jInternalFrameReporteDinamicoTallaProducto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTallaProducto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTallaProducto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTallaProducto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTallaProducto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTallaProducto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTallaProducto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTallaProducto.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTallaProducto.getText();
		if(this.jComboBoxid_tipo_productoFK_IdTipoProductoTallaProducto.getSelectedItem()!=null){this.id_tipo_productoFK_IdTipoProducto=((TipoProducto)this.jComboBoxid_tipo_productoFK_IdTipoProductoTallaProducto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTallaProducto(Boolean esInicializar) throws Exception {				
		if(TallaProductoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTallaProducto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTallaProducto() throws Exception {
		this.inicializarActualizarBindingTablaTallaProducto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTallaProducto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTallaProducto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTallaProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTallaProducto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TallaProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTallaProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTallaProducto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TallaProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTallaProductoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTallaProductoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TallaProductoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTallaProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTallaProducto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TallaProductoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTallaProducto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTallaProducto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tallaproductoLogic.getTallaProductos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tallaproductos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TallaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTallaProducto.setModel(new TallaProductoModel(this.tallaproductoLogic.getTallaProductos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTallaProducto.setModel(new TallaProductoModel(this.tallaproductos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTallaProducto!=null && this.jInternalFrameOrderByTallaProducto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTallaProducto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTallaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTallaProducto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TallaProductoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TallaProductoConstantesFunciones.SCLASSWEBTITULO,tallaproductoConstantesFunciones.resaltarSeleccionarTallaProducto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TallaProductoConstantesFunciones.SCLASSWEBTITULO,tallaproductoConstantesFunciones.resaltarSeleccionarTallaProducto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTallaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTallaProducto,TallaProductoConstantesFunciones.LABEL_ID));

		if(this.tallaproductoConstantesFunciones.mostraridTallaProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TallaProductoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tallaproductoConstantesFunciones.resaltaridTallaProducto,this.tallaproductoConstantesFunciones.activaridTallaProducto,this,true,"idTallaProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tallaproductoConstantesFunciones.resaltaridTallaProducto,this.tallaproductoConstantesFunciones.activaridTallaProducto,this,true,"idTallaProducto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTallaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTallaProducto,TallaProductoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tallaproductoConstantesFunciones.mostrarid_empresaTallaProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TallaProductoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tallaproductoConstantesFunciones.resaltarid_empresaTallaProducto,this,this.tallaproductoConstantesFunciones.activarid_empresaTallaProducto));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tallaproductoConstantesFunciones.resaltarid_empresaTallaProducto,this,this.tallaproductoConstantesFunciones.activarid_empresaTallaProducto,false,"id_empresaTallaProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TallaProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTallaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTallaProducto,TallaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO));

		if(this.tallaproductoConstantesFunciones.mostrarid_tipo_productoTallaProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TallaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoProductoTableCell(this.tipoproductosForeignKey,this.tallaproductoConstantesFunciones.resaltarid_tipo_productoTallaProducto,this,this.tallaproductoConstantesFunciones.activarid_tipo_productoTallaProducto));
			tableColumn.setCellEditor(new TipoProductoTableCell(this.tipoproductosForeignKey,this.tallaproductoConstantesFunciones.resaltarid_tipo_productoTallaProducto,this,this.tallaproductoConstantesFunciones.activarid_tipo_productoTallaProducto,true,"id_tipo_productoTallaProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TallaProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTallaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTallaProducto,TallaProductoConstantesFunciones.LABEL_CODIGO));

		if(this.tallaproductoConstantesFunciones.mostrarcodigoTallaProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TallaProductoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tallaproductoConstantesFunciones.resaltarcodigoTallaProducto,this.tallaproductoConstantesFunciones.activarcodigoTallaProducto,this,true,"codigoTallaProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tallaproductoConstantesFunciones.resaltarcodigoTallaProducto,this.tallaproductoConstantesFunciones.activarcodigoTallaProducto,this,true,"codigoTallaProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TallaProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTallaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTallaProducto,TallaProductoConstantesFunciones.LABEL_NOMBRE));

		if(this.tallaproductoConstantesFunciones.mostrarnombreTallaProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TallaProductoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tallaproductoConstantesFunciones.resaltarnombreTallaProducto,this.tallaproductoConstantesFunciones.activarnombreTallaProducto,this,true,"nombreTallaProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tallaproductoConstantesFunciones.resaltarnombreTallaProducto,this.tallaproductoConstantesFunciones.activarnombreTallaProducto,this,true,"nombreTallaProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TallaProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tallaproductoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosProducto && this.tallaproductoConstantesFunciones.mostrarProductoTallaProducto && !TallaProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Productos");
				tableColumn.setHeaderValue("Productos");
				tableColumn.setCellRenderer(new ProductoTableCell(tallaproductoConstantesFunciones.resaltarProductoTallaProducto,this,this.tallaproductoConstantesFunciones.activarProductoTallaProducto));
				tableColumn.setCellEditor(new ProductoTableCell(tallaproductoConstantesFunciones.resaltarProductoTallaProducto,this,this.tallaproductoConstantesFunciones.activarProductoTallaProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTallaProducto.addColumn(tableColumn);
			}

			if(this.isTienePermisosParametroInventarioDefecto && this.tallaproductoConstantesFunciones.mostrarParametroInventarioDefectoTallaProducto && !TallaProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Inventario Defectos");
				tableColumn.setHeaderValue("Parametro Inventario Defectos");
				tableColumn.setCellRenderer(new ParametroInventarioDefectoTableCell(tallaproductoConstantesFunciones.resaltarParametroInventarioDefectoTallaProducto,this,this.tallaproductoConstantesFunciones.activarParametroInventarioDefectoTallaProducto));
				tableColumn.setCellEditor(new ParametroInventarioDefectoTableCell(tallaproductoConstantesFunciones.resaltarParametroInventarioDefectoTallaProducto,this,this.tallaproductoConstantesFunciones.activarParametroInventarioDefectoTallaProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTallaProducto.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tallaproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tallaproductoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTallaProducto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tallaproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tallaproductoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTallaProducto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTallaProducto && this.isPermisoGuardarCambiosTallaProducto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tallaproductoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tallaproductoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTallaProducto.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tallaproductoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTallaProducto.addColumn(tableColumn);
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
			
			this.jTableDatosTallaProducto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTallaProducto && this.isPermisoGuardarCambiosTallaProducto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tallaproductoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTallaProducto && this.isPermisoGuardarCambiosTallaProducto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTallaProducto.moveColumn(this.jTableDatosTallaProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTallaProducto.moveColumn(this.jTableDatosTallaProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tallaproductoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTallaProducto.moveColumn(this.jTableDatosTallaProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTallaProducto.moveColumn(this.jTableDatosTallaProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTallaProducto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTallaProducto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTallaProducto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TallaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTallaProducto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTallaProducto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TallaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TallaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTallaProducto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTallaProducto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTallaProducto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tallaproductoLogic.getTallaProductos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tallaproductos.size()-1;
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
		//this.jTableDatosTallaProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTallaProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTallaProducto();
			
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
				
				//this.isEsNuevoTallaProducto=false;
					
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
			
				if(this.tallaproductoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTallaProducto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTallaProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTallaProducto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproducto =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tallaproducto =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tallaproducto.getsType().equals("DUPLICADO")
				   || this.tallaproducto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTallaProducto=true;
				
				} else {
					this.isEsNuevoTallaProducto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
					if(this.tallaproducto.getId()>=0 && !this.tallaproducto.getIsNew()) {						
						this.isEsNuevoTallaProducto=false;
						
					} else {
						this.isEsNuevoTallaProducto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTallaProducto(esRelaciones);						
				
				this.seleccionarTallaProducto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tallaproducto.getId()<0) {
					this.isEsNuevoTallaProducto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTallaProducto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTallaProducto(evt,rowIndex);
				}	
				
				if(this.tallaproductoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TallaProducto: " + this.dDif); 
					}
				}								
				
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTallaProducto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tallaproducto)) {
					if(this.tallaproducto.getId()>0) {
						this.tallaproducto.setIsDeleted(true);
						
						this.tallaproductosEliminados.add(this.tallaproducto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tallaproductoLogic.getTallaProductos().remove(this.tallaproducto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tallaproductos.remove(this.tallaproducto);				
					}
					
					
					((TallaProductoModel) this.jTableDatosTallaProducto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTallaProducto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTallaProducto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTallaProducto) {
			
			if(this.jInternalFrameDetalleFormTallaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTallaProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTallaProducto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproducto =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tallaproducto =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TallaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTallaProducto(this.tallaproducto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tallaproductoConstantesFunciones.cargarid_empresaTallaProducto || this.tallaproductoConstantesFunciones.event_dependid_empresaTallaProducto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tallaproducto.getid_empresa());
									//this.inicializarActualizarBindingTallaProducto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tallaproducto.getEmpresa()!=null) {
							this.empresasForeignKey.add(tallaproducto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tallaproducto.getid_empresa(),false,"Formulario");

					//TipoProducto
					if(!this.tallaproductoConstantesFunciones.cargarid_tipo_productoTallaProducto || this.tallaproductoConstantesFunciones.event_dependid_tipo_productoTallaProducto) {
						//this.cargarCombosTipoProductosForeignKeyLista(" where id="+this.tallaproducto.getid_tipo_producto());
									//this.inicializarActualizarBindingTallaProducto(false,false);
						this.tipoproductosForeignKey=new ArrayList<TipoProducto>();

						if(tallaproducto.getTipoProducto()!=null) {
							this.tipoproductosForeignKey.add(tallaproducto.getTipoProducto());
						}

						this.addItemDefectoCombosForeignKeyTipoProducto();
						this.cargarCombosFrameTipoProductosForeignKey("Todos");
					}
					this.setActualTipoProductoForeignKey(this.tallaproducto.getid_tipo_producto(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTallaProducto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTallaProducto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTallaProducto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTallaProducto(TallaProducto tallaproducto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTallaProducto(tallaproducto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTallaProducto(TallaProducto tallaproducto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTallaProducto(tallaproducto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTallaProducto(tallaproducto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTallaProducto(tallaproducto);
	}
	
	public void setVariablesObjetoActualToFormularioTallaProducto(TallaProducto tallaproducto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTallaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTallaProducto.jLabelidTallaProducto.setText(tallaproducto.getId().toString());
			this.jInternalFrameDetalleFormTallaProducto.jTextFieldcodigoTallaProducto.setText(tallaproducto.getcodigo());
			this.jInternalFrameDetalleFormTallaProducto.jTextAreanombreTallaProducto.setText(tallaproducto.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TallaProducto tallaproductoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tallaproductoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TallaProducto tallaproductoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tallaproductoLocal=this.tallaproducto;
			} else {
				tallaproductoLocal=this.tallaproductoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tallaproductoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTallaProducto(tallaproductoLocal,true);
					
					if(tallaproductoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tallaproductoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tallaproductoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTallaProducto(TallaProducto tallaproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTallaProducto(tallaproducto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTallaProducto(tallaproducto);
	}
	
	public void setVariablesFormularioToObjetoActualTallaProducto(TallaProducto tallaproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTallaProducto(tallaproducto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTallaProducto(TallaProducto tallaproducto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTallaProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTallaProducto.jLabelidTallaProducto.getText()==null || this.jInternalFrameDetalleFormTallaProducto.jLabelidTallaProducto.getText()=="" || this.jInternalFrameDetalleFormTallaProducto.jLabelidTallaProducto.getText()=="Id") {
				this.jInternalFrameDetalleFormTallaProducto.jLabelidTallaProducto.setText("0");
			}

			if(conColumnasBase) {tallaproducto.setId(Long.parseLong(this.jInternalFrameDetalleFormTallaProducto.jLabelidTallaProducto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TallaProductoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTallaProducto.jLabelIdTallaProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tallaproducto.setcodigo(this.jInternalFrameDetalleFormTallaProducto.jTextFieldcodigoTallaProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TallaProductoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTallaProducto.jLabelcodigoTallaProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tallaproducto.setnombre(this.jInternalFrameDetalleFormTallaProducto.jTextAreanombreTallaProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TallaProductoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTallaProducto.jLabelnombreTallaProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTallaProducto(TallaProducto tallaproductoBean,TallaProducto tallaproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tallaproductoBean.getid_tipo_producto()!=null && !tallaproductoBean.getid_tipo_producto().equals(-1L))) {tallaproducto.setid_tipo_producto(tallaproductoBean.getid_tipo_producto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTallaProducto(TallaProducto tallaproductoOrigen,TallaProducto tallaproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tallaproductoOrigen.getId()!=null && !tallaproductoOrigen.getId().equals(0L))) {tallaproducto.setId(tallaproductoOrigen.getId());}}
			if(conDefault || (!conDefault && tallaproductoOrigen.getid_tipo_producto()!=null && !tallaproductoOrigen.getid_tipo_producto().equals(-1L))) {tallaproducto.setid_tipo_producto(tallaproductoOrigen.getid_tipo_producto());}
			if(conDefault || (!conDefault && tallaproductoOrigen.getcodigo()!=null && !tallaproductoOrigen.getcodigo().equals(""))) {tallaproducto.setcodigo(tallaproductoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tallaproductoOrigen.getnombre()!=null && !tallaproductoOrigen.getnombre().equals(""))) {tallaproducto.setnombre(tallaproductoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTallaProducto(TallaProducto tallaproducto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTallaProducto.jLabelidTallaProducto.setText(tallaproducto.getId().toString());
			this.jInternalFrameDetalleFormTallaProducto.jTextFieldcodigoTallaProducto.setText(tallaproducto.getcodigo());
			this.jInternalFrameDetalleFormTallaProducto.jTextAreanombreTallaProducto.setText(tallaproducto.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTallaProducto(TallaProductoBean tallaproductoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTallaProducto.jLabelidTallaProducto.setText(tallaproductoBean.getId().toString());
			this.jInternalFrameDetalleFormTallaProducto.jTextFieldcodigoTallaProducto.setText(tallaproductoBean.getcodigo());
			this.jInternalFrameDetalleFormTallaProducto.jTextAreanombreTallaProducto.setText(tallaproductoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTallaProducto(TallaProductoParameterReturnGeneral tallaproductoReturnGeneral,TallaProductoBean tallaproductoBean,Boolean conDefault) throws Exception { 
		try {
			TallaProducto tallaproductoLocal=new TallaProducto();
			
			tallaproductoLocal=tallaproductoReturnGeneral.getTallaProducto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tallaproductoLocal.getId()!=null && !tallaproductoLocal.getId().equals(0L))) {tallaproductoBean.setId(tallaproductoLocal.getId());}}
			if(conDefault || (!conDefault && tallaproductoLocal.getid_tipo_producto()!=null && !tallaproductoLocal.getid_tipo_producto().equals(-1L))) {tallaproductoBean.setid_tipo_producto(tallaproductoLocal.getid_tipo_producto());}
			if(conDefault || (!conDefault && tallaproductoLocal.getcodigo()!=null && !tallaproductoLocal.getcodigo().equals(""))) {tallaproductoBean.setcodigo(tallaproductoLocal.getcodigo());}
			if(conDefault || (!conDefault && tallaproductoLocal.getnombre()!=null && !tallaproductoLocal.getnombre().equals(""))) {tallaproductoBean.setnombre(tallaproductoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTallaProductoGenerico(Long idTallaProductoSeleccionado,JComboBox jComboBoxTallaProducto,List<TallaProducto> tallaproductosLocal)throws Exception {
		try {
			TallaProducto  tallaproductoTemp=null;

			for(TallaProducto tallaproductoAux:tallaproductosLocal) {
				if(tallaproductoAux.getId()!=null && tallaproductoAux.getId().equals(idTallaProductoSeleccionado)) {
					tallaproductoTemp=tallaproductoAux;
					break;
				}
			}

			jComboBoxTallaProducto.setSelectedItem(tallaproductoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTallaProductoGenerico(JComboBox jComboBoxTallaProducto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTallaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTallaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTallaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTallaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTallaProducto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTallaProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTallaProducto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTallaProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTallaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTallaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tallaproducto=(TallaProducto) tallaproductoLogic.getTallaProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tallaproducto =(TallaProducto) tallaproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tallaproducto.getIsNew() && !tallaproducto.getIsChanged() && !tallaproducto.getIsDeleted()) {
				sDescripcion=tallaproducto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tallaproducto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoProducto")) {
			//sDescripcion=this.getActualTipoProductoForeignKeyDescripcion((Long)value);
			if(!tallaproducto.getIsNew() && !tallaproducto.getIsChanged() && !tallaproducto.getIsDeleted()) {
				sDescripcion=tallaproducto.gettipoproducto_descripcion();
			} else {
				//sDescripcion=this.getActualTipoProductoForeignKeyDescripcion((Long)value);
				sDescripcion=tallaproducto.gettipoproducto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TallaProducto tallaproductoRow=new TallaProducto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tallaproductoRow=(TallaProducto) tallaproductoLogic.getTallaProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tallaproductoRow=(TallaProducto) tallaproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonProductoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TallaProducto tallaproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTallaProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tallaproducto = (TallaProducto)this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tallaproducto = (TallaProducto)this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tallaproducto!=null) {
						this.tallaproducto = tallaproducto;
					} else {
						this.tallaproducto = new TallaProducto();
					}
				}

				if(this.isTienePermisosProducto && this.permiteMantenimiento(this.tallaproducto)) {
					ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFramePopup=new ProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFramePopup;
					} else {
						productoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame;
					}

					List<TallaProducto> tallaproductos=new ArrayList<TallaProducto>();
					tallaproductos.add(this.tallaproducto);
					if(!esRelacionado) {
						//productoBeanSwingJInternalFrame.productoSessionBean.setConGuardarRelaciones(false);
						//productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTallaProducto.cargarProductoBeanSwingJInternalFrame(tallaproductos,this.tallaproducto,productoBeanSwingJInternalFrame,/*conInicializar,*/productoBeanSwingJInternalFrame.productoSessionBean.getConGuardarRelaciones(),productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado());
					productoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoBeanSwingJInternalFrame.actualizarEstadoPanelsProducto("no_relacionado");

						productoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoConstantesFunciones.ITAMANIOFILATABLA + (ProductoConstantesFunciones.ITAMANIOFILATABLA/2));

						productoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTallaProducto=(TitledBorder)this.jScrollPanelDatosTallaProducto.getBorder();
						TitledBorder titledBorderProducto=(TitledBorder)productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

						titledBorderProducto.setTitle(titledBorderTallaProducto.getTitle() + " -> Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoBeanSwingJInternalFrame);
						}

						productoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoBeanSwingJInternalFrame);

						productoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tallaproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonParametroInventarioDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TallaProducto tallaproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTallaProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tallaproducto = (TallaProducto)this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tallaproducto = (TallaProducto)this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tallaproducto!=null) {
						this.tallaproducto = tallaproducto;
					} else {
						this.tallaproducto = new TallaProducto();
					}
				}

				if(this.isTienePermisosParametroInventarioDefecto && this.permiteMantenimiento(this.tallaproducto)) {
					ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFramePopup=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFramePopup;
					} else {
						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame;
					}

					List<TallaProducto> tallaproductos=new ArrayList<TallaProducto>();
					tallaproductos.add(this.tallaproducto);
					if(!esRelacionado) {
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setConGuardarRelaciones(false);
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTallaProducto.cargarParametroInventarioDefectoBeanSwingJInternalFrame(tallaproductos,this.tallaproducto,parametroinventariodefectoBeanSwingJInternalFrame,/*conInicializar,*/parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getConGuardarRelaciones(),parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("no_relacionado");

						parametroinventariodefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametroinventariodefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTallaProducto=(TitledBorder)this.jScrollPanelDatosTallaProducto.getBorder();
						TitledBorder titledBorderParametroInventarioDefecto=(TitledBorder)parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getBorder();

						titledBorderParametroInventarioDefecto.setTitle(titledBorderTallaProducto.getTitle() + " -> Parametro Inventario Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametroinventariodefectoBeanSwingJInternalFrame);
						}

						parametroinventariodefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametroinventariodefectoBeanSwingJInternalFrame);

						parametroinventariodefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tallaproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Inventario Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTallaProducto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTallaProducto.setVisible((this.isVisibilidadCeldaNuevoTallaProducto && this.isPermisoNuevoTallaProducto));			
			this.jButtonDuplicarTallaProducto.setVisible((this.isVisibilidadCeldaDuplicarTallaProducto && this.isPermisoDuplicarTallaProducto));			
			this.jButtonCopiarTallaProducto.setVisible((this.isVisibilidadCeldaCopiarTallaProducto && this.isPermisoCopiarTallaProducto));
			this.jButtonVerFormTallaProducto.setVisible((this.isVisibilidadCeldaVerFormTallaProducto && this.isPermisoVerFormTallaProducto));
			
			this.jButtonAbrirOrderByTallaProducto.setVisible((this.isVisibilidadCeldaOrdenTallaProducto && this.isPermisoOrdenTallaProducto));			
			
			this.jButtonNuevoRelacionesTallaProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesTallaProducto && this.isPermisoNuevoTallaProducto));			
			this.jButtonNuevoGuardarCambiosTallaProducto.setVisible((this.isVisibilidadCeldaNuevoTallaProducto && this.isPermisoNuevoTallaProducto && this.isPermisoGuardarCambiosTallaProducto));
			
			if(this.jInternalFrameDetalleFormTallaProducto!=null) {
			this.jInternalFrameDetalleFormTallaProducto.jButtonModificarTallaProducto.setVisible((this.isVisibilidadCeldaModificarTallaProducto && this.isPermisoActualizarTallaProducto));	
			this.jInternalFrameDetalleFormTallaProducto.jButtonActualizarTallaProducto.setVisible((this.isVisibilidadCeldaActualizarTallaProducto && this.isPermisoActualizarTallaProducto));	
			this.jInternalFrameDetalleFormTallaProducto.jButtonEliminarTallaProducto.setVisible((this.isVisibilidadCeldaEliminarTallaProducto && this.isPermisoEliminarTallaProducto));
			this.jInternalFrameDetalleFormTallaProducto.jButtonCancelarTallaProducto.setVisible(this.isVisibilidadCeldaCancelarTallaProducto);							
			this.jInternalFrameDetalleFormTallaProducto.jButtonGuardarCambiosTallaProducto.setVisible((this.isVisibilidadCeldaGuardarTallaProducto && this.isPermisoGuardarCambiosTallaProducto));			
			
			}
						
			this.jButtonGuardarCambiosTablaTallaProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosTallaProducto && this.isPermisoGuardarCambiosTallaProducto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTallaProducto.setVisible((this.isVisibilidadCeldaNuevoTallaProducto && this.isPermisoNuevoTallaProducto));						
			this.jButtonDuplicarToolBarTallaProducto.setVisible((this.isVisibilidadCeldaDuplicarTallaProducto && this.isPermisoDuplicarTallaProducto));						
			this.jButtonCopiarToolBarTallaProducto.setVisible((this.isVisibilidadCeldaCopiarTallaProducto && this.isPermisoCopiarTallaProducto));			
			this.jButtonVerFormToolBarTallaProducto.setVisible((this.isVisibilidadCeldaVerFormTallaProducto && this.isPermisoVerFormTallaProducto));			
			this.jButtonAbrirOrderByToolBarTallaProducto.setVisible((this.isVisibilidadCeldaOrdenTallaProducto && this.isPermisoOrdenTallaProducto));
			this.jButtonNuevoRelacionesToolBarTallaProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesTallaProducto && this.isPermisoNuevoTallaProducto));			
			this.jButtonNuevoGuardarCambiosToolBarTallaProducto.setVisible((this.isVisibilidadCeldaNuevoTallaProducto && this.isPermisoNuevoTallaProducto && this.isPermisoGuardarCambiosTallaProducto));			
			
			if(this.jInternalFrameDetalleFormTallaProducto!=null) {
			this.jInternalFrameDetalleFormTallaProducto.jButtonModificarToolBarTallaProducto.setVisible((this.isVisibilidadCeldaModificarTallaProducto && this.isPermisoActualizarTallaProducto));	
			this.jInternalFrameDetalleFormTallaProducto.jButtonActualizarToolBarTallaProducto.setVisible((this.isVisibilidadCeldaActualizarTallaProducto  && this.isPermisoActualizarTallaProducto));	
			this.jInternalFrameDetalleFormTallaProducto.jButtonEliminarToolBarTallaProducto.setVisible((this.isVisibilidadCeldaEliminarTallaProducto && this.isPermisoEliminarTallaProducto));
			this.jInternalFrameDetalleFormTallaProducto.jButtonCancelarToolBarTallaProducto.setVisible(this.isVisibilidadCeldaCancelarTallaProducto);				
			this.jInternalFrameDetalleFormTallaProducto.jButtonGuardarCambiosToolBarTallaProducto.setVisible((this.isVisibilidadCeldaGuardarTallaProducto && this.isPermisoGuardarCambiosTallaProducto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTallaProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosTallaProducto && this.isPermisoGuardarCambiosTallaProducto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTallaProducto.setVisible((this.isVisibilidadCeldaNuevoTallaProducto && this.isPermisoNuevoTallaProducto));			
			this.jMenuItemDuplicarTallaProducto.setVisible((this.isVisibilidadCeldaDuplicarTallaProducto && this.isPermisoDuplicarTallaProducto));			
			this.jMenuItemCopiarTallaProducto.setVisible((this.isVisibilidadCeldaCopiarTallaProducto && this.isPermisoCopiarTallaProducto));			
			this.jMenuItemVerFormTallaProducto.setVisible((this.isVisibilidadCeldaVerFormTallaProducto && this.isPermisoVerFormTallaProducto));			
			this.jMenuItemAbrirOrderByTallaProducto.setVisible((this.isVisibilidadCeldaOrdenTallaProducto && this.isPermisoOrdenTallaProducto));			
			//this.jMenuItemMostrarOcultarTallaProducto.setVisible((this.isVisibilidadCeldaOrdenTallaProducto && this.isPermisoOrdenTallaProducto));
			this.jMenuItemDetalleAbrirOrderByTallaProducto.setVisible((this.isVisibilidadCeldaOrdenTallaProducto && this.isPermisoOrdenTallaProducto));			
			//this.jMenuItemDetalleMostrarOcultarTallaProducto.setVisible((this.isVisibilidadCeldaOrdenTallaProducto && this.isPermisoOrdenTallaProducto));			
			this.jMenuItemNuevoRelacionesTallaProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesTallaProducto && this.isPermisoNuevoTallaProducto));			
			this.jMenuItemNuevoGuardarCambiosTallaProducto.setVisible((this.isVisibilidadCeldaNuevoTallaProducto && this.isPermisoNuevoTallaProducto && this.isPermisoGuardarCambiosTallaProducto));									
			
			if(this.jInternalFrameDetalleFormTallaProducto!=null) {
			this.jInternalFrameDetalleFormTallaProducto.jMenuItemModificarTallaProducto.setVisible((this.isVisibilidadCeldaModificarTallaProducto && this.isPermisoActualizarTallaProducto));	
			this.jInternalFrameDetalleFormTallaProducto.jMenuItemActualizarTallaProducto.setVisible((this.isVisibilidadCeldaActualizarTallaProducto && this.isPermisoActualizarTallaProducto));	
			this.jInternalFrameDetalleFormTallaProducto.jMenuItemEliminarTallaProducto.setVisible((this.isVisibilidadCeldaEliminarTallaProducto && this.isPermisoEliminarTallaProducto));
			this.jInternalFrameDetalleFormTallaProducto.jMenuItemCancelarTallaProducto.setVisible(this.isVisibilidadCeldaCancelarTallaProducto);				
			}
			
			this.jMenuItemGuardarCambiosTallaProducto.setVisible((this.isVisibilidadCeldaGuardarTallaProducto && this.isPermisoGuardarCambiosTallaProducto));						
			this.jMenuItemGuardarCambiosTablaTallaProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosTallaProducto && this.isPermisoGuardarCambiosTallaProducto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTallaProducto=this.jButtonNuevoTallaProducto.isVisible();
			this.isVisibilidadCeldaDuplicarTallaProducto=this.jButtonDuplicarTallaProducto.isVisible();
			this.isVisibilidadCeldaCopiarTallaProducto=this.jButtonCopiarTallaProducto.isVisible();
			this.isVisibilidadCeldaVerFormTallaProducto=this.jButtonVerFormTallaProducto.isVisible();
			
			this.isVisibilidadCeldaOrdenTallaProducto=this.jButtonAbrirOrderByTallaProducto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTallaProducto=this.jButtonNuevoRelacionesTallaProducto.isVisible();
			this.isVisibilidadCeldaModificarTallaProducto=this.jButtonModificarTallaProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormTallaProducto!=null) {
			this.isVisibilidadCeldaActualizarTallaProducto=this.jInternalFrameDetalleFormTallaProducto.jButtonActualizarTallaProducto.isVisible();
			this.isVisibilidadCeldaEliminarTallaProducto=this.jInternalFrameDetalleFormTallaProducto.jButtonEliminarTallaProducto.isVisible();
			this.isVisibilidadCeldaCancelarTallaProducto=this.jInternalFrameDetalleFormTallaProducto.jButtonCancelarTallaProducto.isVisible();
			this.isVisibilidadCeldaGuardarTallaProducto=this.jInternalFrameDetalleFormTallaProducto.jButtonGuardarCambiosTallaProducto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTallaProducto=this.jButtonGuardarCambiosTablaTallaProducto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTallaProducto=this.jButtonNuevoToolBarTallaProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTallaProducto=this.jButtonNuevoRelacionesToolBarTallaProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormTallaProducto!=null) {
			this.isVisibilidadCeldaModificarTallaProducto=this.jInternalFrameDetalleFormTallaProducto.jButtonModificarToolBarTallaProducto.isVisible();
			this.isVisibilidadCeldaActualizarTallaProducto=this.jInternalFrameDetalleFormTallaProducto.jButtonActualizarToolBarTallaProducto.isVisible();
			this.isVisibilidadCeldaEliminarTallaProducto=this.jInternalFrameDetalleFormTallaProducto.jButtonEliminarToolBarTallaProducto.isVisible();
			this.isVisibilidadCeldaCancelarTallaProducto=this.jInternalFrameDetalleFormTallaProducto.jButtonCancelarToolBarTallaProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTallaProducto=this.jButtonGuardarCambiosToolBarTallaProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTallaProducto=this.jButtonGuardarCambiosTablaToolBarTallaProducto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTallaProducto=this.jMenuItemNuevoTallaProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTallaProducto=this.jMenuItemNuevoRelacionesTallaProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormTallaProducto!=null) {
			this.isVisibilidadCeldaModificarTallaProducto=this.jInternalFrameDetalleFormTallaProducto.jMenuItemModificarTallaProducto.isVisible();
			this.isVisibilidadCeldaActualizarTallaProducto=this.jInternalFrameDetalleFormTallaProducto.jMenuItemActualizarTallaProducto.isVisible();
			this.isVisibilidadCeldaEliminarTallaProducto=this.jInternalFrameDetalleFormTallaProducto.jMenuItemEliminarTallaProducto.isVisible();
			this.isVisibilidadCeldaCancelarTallaProducto=this.jInternalFrameDetalleFormTallaProducto.jMenuItemCancelarTallaProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTallaProducto=this.jMenuItemGuardarCambiosTallaProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTallaProducto=this.jMenuItemGuardarCambiosTablaTallaProducto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTallaProducto(Boolean esInicializar) {
		if(TallaProductoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tallaproductoSessionBean.getConGuardarRelaciones()) {
				//if(this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTallaProducto();
			}
			
			this.inicializarActualizarBindingBotonesManualTallaProducto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTallaProducto() {
		this.jButtonNuevoTallaProducto.setVisible(this.isPermisoNuevoTallaProducto);			
		this.jButtonDuplicarTallaProducto.setVisible(this.isPermisoDuplicarTallaProducto);			
		this.jButtonCopiarTallaProducto.setVisible(this.isPermisoCopiarTallaProducto);			
		this.jButtonVerFormTallaProducto.setVisible(this.isPermisoVerFormTallaProducto);			
		
		this.jButtonAbrirOrderByTallaProducto.setVisible(this.isPermisoOrdenTallaProducto);					
		
		this.jButtonNuevoRelacionesTallaProducto.setVisible(this.isPermisoNuevoTallaProducto);			
		
		if(this.jInternalFrameDetalleFormTallaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaProducto.jButtonModificarTallaProducto.setVisible(this.isPermisoActualizarTallaProducto);	
			this.jInternalFrameDetalleFormTallaProducto.jButtonActualizarTallaProducto.setVisible(this.isPermisoActualizarTallaProducto);	
			this.jInternalFrameDetalleFormTallaProducto.jButtonEliminarTallaProducto.setVisible(this.isPermisoEliminarTallaProducto);
			this.jInternalFrameDetalleFormTallaProducto.jButtonCancelarTallaProducto.setVisible(this.isVisibilidadCeldaCancelarTallaProducto);						
			this.jInternalFrameDetalleFormTallaProducto.jButtonGuardarCambiosTallaProducto.setVisible(this.isPermisoGuardarCambiosTallaProducto);							
		}
		
		this.jButtonGuardarCambiosTablaTallaProducto.setVisible(this.isPermisoActualizarTallaProducto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTallaProducto() {
		this.jInternalFrameDetalleFormTallaProducto.jButtonModificarTallaProducto.setVisible(this.isPermisoActualizarTallaProducto);	
		this.jInternalFrameDetalleFormTallaProducto.jButtonActualizarTallaProducto.setVisible(this.isPermisoActualizarTallaProducto);	
		this.jInternalFrameDetalleFormTallaProducto.jButtonEliminarTallaProducto.setVisible(this.isPermisoEliminarTallaProducto);
		this.jInternalFrameDetalleFormTallaProducto.jButtonCancelarTallaProducto.setVisible(this.isVisibilidadCeldaCancelarTallaProducto);							
		this.jInternalFrameDetalleFormTallaProducto.jButtonGuardarCambiosTallaProducto.setVisible((this.isVisibilidadCeldaGuardarTallaProducto && this.isPermisoGuardarCambiosTallaProducto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTallaProducto() {
		if(TallaProductoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTallaProducto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTallaProducto() {
	}
	
	public void jTableDatosTallaProductoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTallaProducto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTallaProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTallaProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTallaProducto(this.gettallaproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaProducto(this.tallaproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tallaproducto =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tallaproducto =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tallaproducto==null) {
						this.tallaproducto = new TallaProducto();
					}

					this.setVariablesFormularioToObjetoActualTallaProducto(this.tallaproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaProducto(this.tallaproducto);
				}

				if(this.tallaproducto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tallaproducto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTallaProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTallaProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTallaProducto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTallaProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTallaProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTallaProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproducto =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tallaproducto =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTallaProducto(this.gettallaproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTallaProducto(this.tallaproducto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tallaproductoLogic.getConnexion());

				if(this.tallaproducto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tallaproducto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTallaProducto=(TitledBorder)this.jScrollPanelDatosTallaProducto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTallaProducto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTallaProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTallaProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTallaProducto(this.gettallaproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaProducto(this.tallaproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tallaproducto =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tallaproducto =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tallaproducto==null) {
						this.tallaproducto = new TallaProducto();
					}

					this.setVariablesFormularioToObjetoActualTallaProducto(this.tallaproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaProducto(this.tallaproducto);
				}

				if(this.tallaproducto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tallaproducto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTallaProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_productoTallaProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoproducto=true;

			idTienePermisotipoproducto=this.tienePermisosUsuarioEnPaginaWebTallaProducto(TipoProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTallaProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTallaProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTallaProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproducto =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tallaproducto =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTallaProducto(this.gettallaproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTallaProducto(this.tallaproducto);

				this.tipoproductoBeanSwingJInternalFrame=new TipoProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoproductoBeanSwingJInternalFrame.getTipoProductoLogic().setConnexion(this.tallaproductoLogic.getConnexion());

				if(this.tallaproducto.getid_tipo_producto()!=null) {
					this.tipoproductoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoproductoBeanSwingJInternalFrame.setIdActual(this.tallaproducto.getid_tipo_producto());
					this.tipoproductoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoproductoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoProducto();
				}

				JInternalFrameBase jinternalFrame =this.tipoproductoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTallaProducto=(TitledBorder)this.jScrollPanelDatosTallaProducto.getBorder();
				TitledBorder titledBordertipoproducto=(TitledBorder)this.tipoproductoBeanSwingJInternalFrame.jScrollPanelDatosTipoProducto.getBorder();

				titledBordertipoproducto.setTitle(titledBorderTallaProducto.getTitle() + " -> Tipo Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_productoTallaProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTallaProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTallaProducto(this.gettallaproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaProducto(this.tallaproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tallaproducto =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tallaproducto =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tallaproducto==null) {
						this.tallaproducto = new TallaProducto();
					}

					this.setVariablesFormularioToObjetoActualTallaProducto(this.tallaproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaProducto(this.tallaproducto);
				}

				if(this.tallaproducto.getid_tipo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_producto = "+this.tallaproducto.getid_tipo_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTallaProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTallaProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTallaProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTallaProducto(this.gettallaproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaProducto(this.tallaproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tallaproducto =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tallaproducto =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tallaproducto==null) {
						this.tallaproducto = new TallaProducto();
					}

					this.setVariablesFormularioToObjetoActualTallaProducto(this.tallaproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaProducto(this.tallaproducto);
				}

				if(this.tallaproducto.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tallaproducto.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTallaProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTallaProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTallaProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTallaProducto(this.gettallaproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaProducto(this.tallaproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tallaproducto =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tallaproducto =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tallaproducto==null) {
						this.tallaproducto = new TallaProducto();
					}

					this.setVariablesFormularioToObjetoActualTallaProducto(this.tallaproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaProducto(this.tallaproducto);
				}

				if(this.tallaproducto.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tallaproducto.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTallaProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTallaProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTallaProducto(false,false);

			this.getTallaProductosBusquedaPorCodigo();

			this.inicializarActualizarBindingTallaProducto(false);

			//if(TallaProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTallaProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTallaProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTallaProducto(false,false);

			this.getTallaProductosBusquedaPorNombre();

			this.inicializarActualizarBindingTallaProducto(false);

			//if(TallaProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTallaProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTallaProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTallaProducto(false,false);

			this.getTallaProductosFK_IdEmpresa();

			this.inicializarActualizarBindingTallaProducto(false);

			//if(TallaProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTallaProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoProductoTallaProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTallaProducto(false,false);

			this.getTallaProductosFK_IdTipoProducto();

			this.inicializarActualizarBindingTallaProducto(false);

			//if(TallaProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTallaProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tallaproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTallaProducto() {
		if(this.jInternalFrameDetalleFormTallaProducto!=null) {
		

		if(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTallaProducto!=null) {
			this.jInternalFrameDetalleFormTallaProducto.setVisible(false);	    			
			this.jInternalFrameDetalleFormTallaProducto.dispose();
			this.jInternalFrameDetalleFormTallaProducto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTallaProducto!=null) {
			this.jInternalFrameReporteDinamicoTallaProducto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTallaProducto.dispose();
			this.jInternalFrameReporteDinamicoTallaProducto=null;
		}
		
		if(this.jInternalFrameImportacionTallaProducto!=null) {
			this.jInternalFrameImportacionTallaProducto.setVisible(false);	    			
			this.jInternalFrameImportacionTallaProducto.dispose();
			this.jInternalFrameImportacionTallaProducto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTallaProducto();
			
			TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTallaProducto")) {
				jButtonNuevoTallaProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTallaProducto")) {
				jButtonDuplicarTallaProductoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTallaProducto")) {
				jButtonCopiarTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTallaProducto")) {
				jButtonVerFormTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTallaProducto")) {
				jButtonNuevoTallaProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTallaProducto")) {
				jButtonDuplicarTallaProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTallaProducto")) {
				jButtonNuevoTallaProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTallaProducto")) {
				jButtonDuplicarTallaProductoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTallaProducto")) {
				jButtonNuevoTallaProductoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTallaProducto")) {
				jButtonNuevoTallaProductoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTallaProducto")) {
				jButtonNuevoTallaProductoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTallaProducto")) {
				jButtonModificarTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTallaProducto")) {
				jButtonModificarTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTallaProducto")) {
				jButtonModificarTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTallaProducto")) {
				jButtonActualizarTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTallaProducto")) {
				jButtonActualizarTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTallaProducto")) {
				jButtonActualizarTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTallaProducto")) {
				jButtonEliminarTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTallaProducto")) {
				jButtonEliminarTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTallaProducto")) {
				jButtonEliminarTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTallaProducto")) {
				jButtonCancelarTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTallaProducto")) {
				jButtonCancelarTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTallaProducto")) {
				jButtonCancelarTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTallaProducto")) {
				jButtonCerrarTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTallaProducto")) {
				jButtonCerrarTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTallaProducto")) {
				jButtonCerrarTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTallaProducto")) {
				jButtonMostrarOcultarTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTallaProducto")) {
				jButtonCancelarTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTallaProducto")) {
				jButtonGuardarCambiosTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTallaProducto")) {
				jButtonGuardarCambiosTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTallaProducto")) {
				jButtonCopiarTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTallaProducto")) {
				jButtonVerFormTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTallaProducto")) {
				jButtonGuardarCambiosTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTallaProducto")) {
				jButtonCopiarTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTallaProducto")) {
				jButtonVerFormTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTallaProducto")) {
				jButtonGuardarCambiosTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTallaProducto")) {
				jButtonGuardarCambiosTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTallaProducto")) {
				jButtonGuardarCambiosTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTallaProducto")) {
				jButtonRecargarInformacionTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTallaProducto")) {
				jButtonRecargarInformacionTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTallaProducto")) {
				jButtonRecargarInformacionTallaProductoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTallaProducto")) {
				jButtonAnterioresTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTallaProducto")) {
				jButtonAnterioresTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTallaProducto")) {
				jButtonAnterioresTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTallaProducto")) {
				jButtonSiguientesTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTallaProducto")) {
				jButtonSiguientesTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTallaProducto")) {
				jButtonSiguientesTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTallaProducto") || sTipo.equals("MenuItemDetalleAbrirOrderByTallaProducto")) {
				jButtonAbrirOrderByTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTallaProducto") || sTipo.equals("MenuItemDetalleMostrarOcultarTallaProducto")) {
				jButtonMostrarOcultarTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTallaProducto")) {
				jButtonNuevoGuardarCambiosTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTallaProducto")) {
				jButtonNuevoGuardarCambiosTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTallaProducto")) {
				jButtonNuevoGuardarCambiosTallaProductoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTallaProducto")) {
				jButtonCerrarReporteDinamicoTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTallaProducto")) {
				jButtonGenerarReporteDinamicoTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTallaProducto")) {
				
				jButtonGenerarExcelReporteDinamicoTallaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTallaProducto")) {
				jButtonCerrarImportacionTallaProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTallaProducto")) {
				
				jButtonGenerarImportacionTallaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTallaProducto")) {
				
				jButtonAbrirImportacionTallaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTallaProducto")) {
				jComboBoxTiposAccionesTallaProductoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTallaProducto")) {
				jComboBoxTiposRelacionesTallaProductoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTallaProducto")) {
				jComboBoxTiposAccionesTallaProductoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTallaProducto")) {
				
				jComboBoxTiposSeleccionarTallaProductoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTallaProducto")) {
				jTextFieldValorCampoGeneralTallaProductoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTallaProducto")) {
				jButtonAbrirOrderByTallaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTallaProducto")) {
				jButtonAbrirOrderByTallaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTallaProducto")) {
				jButtonCerrarOrderByTallaProductoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTallaProductoBusqueda")) {
				this.jButtonidTallaProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTallaProductoUpdate")) {
				this.jButtonid_empresaTallaProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTallaProductoBusqueda")) {
				this.jButtonid_empresaTallaProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_productoTallaProductoUpdate")) {
				this.jButtonid_tipo_productoTallaProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_productoTallaProductoBusqueda")) {
				this.jButtonid_tipo_productoTallaProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTallaProductoBusqueda")) {
				this.jButtoncodigoTallaProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTallaProductoBusqueda")) {
				this.jButtonnombreTallaProductoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTallaProducto")) {
				this.jButtonBusquedaPorCodigoTallaProductoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTallaProducto")) {
				this.jButtonBusquedaPorNombreTallaProductoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoProductoTallaProducto")) {
				this.jButtonFK_IdTipoProductoTallaProductoActionPerformed(evt);
			}
			
			;
			
			
			TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTallaProducto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTallaProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tallaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tallaproducto);
				
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
				
				


				
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TallaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TallaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TallaProducto tallaproductoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tallaproductoLocal=this.tallaproducto;
			} else {
				tallaproductoLocal=this.tallaproductoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tallaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tallaproducto);
				
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
							
				
				


				
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TallaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TallaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTallaProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTallaProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoAnterior =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tallaproductoAnterior =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
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
			
			TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
			
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
			
			


			
			TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTallaProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tallaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tallaproducto);
				
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
								
						
				


				
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TallaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TallaProducto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tallaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tallaproducto);
				
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
								
				
				


				
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TallaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TallaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTallaProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTallaProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoAnterior =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tallaproductoAnterior =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tallaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tallaproducto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTallaProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTallaProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoAnterior =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tallaproductoAnterior =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTallaProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tallaproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tallaproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tallaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tallaproducto);
				
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
							
				
				


				
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TallaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TallaProducto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTallaProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTallaProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tallaproductoAnterior =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tallaproductoAnterior =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
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
			
			TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
			
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
			
			


			
			TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTallaProductoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tallaproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tallaproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tallaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tallaproducto);
				
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
								
				
				


				
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TallaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TallaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTallaProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTallaProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoAnterior =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tallaproductoAnterior =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTallaProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tallaproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tallaproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTallaProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tallaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tallaproducto);
				
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTallaProducto")) {
					jCheckBoxSeleccionarTodosTallaProductoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTallaProducto")) {
					jCheckBoxSeleccionadosTallaProductoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTallaProducto")) {
					
				}
				
				


				
				
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TallaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TallaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tallaproducto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tallaproducto);
				
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
												
				
				


				
				
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TallaProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TallaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTallaProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTallaProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tallaproductoAnterior =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tallaproductoAnterior =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTallaProductoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tallaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tallaproducto);
				
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
				
				
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
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
			
			TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
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
			
			


			
			TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTallaProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tallaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tallaproducto);
				
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TallaProducto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TallaProducto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tallaproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tallaproducto);
				
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
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
				
				


				
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TallaProducto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TallaProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTallaProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTallaProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tallaproductoAnterior =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tallaproductoAnterior =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTallaProducto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTallaProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTallaProducto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tallaproducto =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tallaproducto =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tallaproducto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTallaProducto")) {
				
				}
				
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTallaProducto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTallaProducto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTallaProducto")) {
			
			}
			
			TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTallaProducto();
			
			TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
			
			if(sTipo.equals("NuevoTallaProducto")) {
				jButtonNuevoTallaProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTallaProducto")) {
				jButtonDuplicarTallaProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTallaProducto")) {
				jButtonCopiarTallaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTallaProducto")) {
				jButtonVerFormTallaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTallaProducto")) {
				jButtonNuevoTallaProductoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTallaProducto")) {
				jButtonModificarTallaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTallaProducto")) {
				jButtonActualizarTallaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTallaProducto")) {
				jButtonEliminarTallaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTallaProducto")) {
				jButtonGuardarCambiosTallaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTallaProducto")) {
				jButtonCancelarTallaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTallaProducto")) {
				jButtonCerrarTallaProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTallaProducto")) {
				jButtonGuardarCambiosTallaProductoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTallaProducto")) {
				jButtonNuevoGuardarCambiosTallaProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTallaProducto")) {
				jButtonAbrirOrderByTallaProductoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTallaProducto")) {
				jButtonRecargarInformacionTallaProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTallaProducto")) {
				jButtonAnterioresTallaProductoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTallaProducto")) {
				jButtonSiguientesTallaProductoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTallaProductoBusqueda")) {
				this.jButtonidTallaProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTallaProductoUpdate")) {
				this.jButtonid_empresaTallaProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTallaProductoBusqueda")) {
				this.jButtonid_empresaTallaProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_productoTallaProductoUpdate")) {
				this.jButtonid_tipo_productoTallaProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_productoTallaProductoBusqueda")) {
				this.jButtonid_tipo_productoTallaProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTallaProductoBusqueda")) {
				this.jButtoncodigoTallaProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTallaProductoBusqueda")) {
				this.jButtonnombreTallaProductoBusquedaActionPerformed(evt);
			}
			
			TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTallaProducto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTallaProducto")) {
				closingInternalFrameTallaProducto();
				
			} else if(sTipo.equals("jButtonCancelarTallaProducto")) {
				JInternalFrameBase jInternalFrameDetalleFormTallaProducto = (JInternalFrameBase)evt.getSource();
	            	
	            TallaProductoBeanSwingJInternalFrame jInternalFrameParent=(TallaProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormTallaProducto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTallaProductoActionPerformed(null);
			}
			
			TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tallaproducto,new Object(),this.tallaproductoParameterGeneral,this.tallaproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTallaProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTallaProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTallaProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tallaproducto)) {
			if(!esControlTabla) {
				if(TallaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTallaProducto(this.tallaproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaProducto(this.tallaproducto);			
				}
				
				if(this.tallaproductoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTallaProducto(this.tallaproducto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tallaproductoReturnGeneral=tallaproductoLogic.procesarEventosTallaProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tallaproductoLogic.getTallaProductos(),this.tallaproducto,this.tallaproductoParameterGeneral,this.isEsNuevoTallaProducto,classes);//this.tallaproductoLogic.getTallaProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTallaProducto(this.tallaproductoReturnGeneral,this.tallaproductoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tallaproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTallaProducto(classes,this.tallaproductoReturnGeneral,this.tallaproductoBean,false);
					}
						
					if(this.tallaproductoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTallaProducto(this.tallaproductoReturnGeneral.getTallaProducto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTallaProducto(this.tallaproductoReturnGeneral.getTallaProducto());	
					}
						
					if(this.tallaproductoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTallaProducto(this.tallaproductoReturnGeneral.getTallaProducto(),classes);//this.tallaproductoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTallaProducto(this.tallaproducto,classes);//this.tallaproductoBean);									
				}
			
				if(TallaProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTallaProducto(this.tallaproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTallaProducto(this.tallaproducto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tallaproductoAnterior!=null) {
						this.tallaproducto=this.tallaproductoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tallaproductoReturnGeneral=tallaproductoLogic.procesarEventosTallaProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tallaproductoLogic.getTallaProductos(),this.tallaproducto,this.tallaproductoParameterGeneral,this.isEsNuevoTallaProducto,classes);//this.tallaproductoLogic.getTallaProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tallaproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tallaproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tallaproductoReturnGeneral.getTallaProducto(),tallaproductoLogic.getTallaProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tallaproductoReturnGeneral.getTallaProducto(),this.tallaproductos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTallaProducto.repaint();
				
				//((AbstractTableModel) this.jTableDatosTallaProducto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTallaProducto();
			}
		}
	}
	
	public void actualizarVisualTableDatosTallaProducto() throws Exception {
		
		TallaProductoModel tallaproductoModel=(TallaProductoModel)this.jTableDatosTallaProducto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tallaproductoModel.tallaproductos=this.tallaproductoLogic.getTallaProductos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tallaproductoModel.tallaproductos=this.tallaproductos;
		}
		
		
		((TallaProductoModel) this.jTableDatosTallaProducto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTallaProducto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettallaproductoAnterior(),this.tallaproductoLogic.getTallaProductos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettallaproductoAnterior(),this.tallaproductos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTallaProducto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTallaProducto(TallaProducto tallaproducto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(tallaproducto.getProductos());
					this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(tallaproducto.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
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
										
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tallaproducto,new Object(),generalEntityParameterGeneral,this.tallaproductoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tallaproductoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TallaProductoConstantesFunciones.getClassesRelationshipsOfTallaProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TallaProductoConstantesFunciones.getClassesRelationshipsFromStringsOfTallaProducto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTallaProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TallaProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tallaproducto,new Object(),generalEntityParameterGeneral,this.tallaproductoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTallaProducto(TallaProductoBean tallaproductoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(tallaproducto.getProductos());
					this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(tallaproducto.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTallaProducto(ArrayList<Classe> classes,TallaProductoReturnGeneral tallaproductoReturnGeneral,TallaProductoBean tallaproductoBean,Boolean conDefault) throws Exception {
		
			this.tallaproductoBean.setProductos(tallaproductoReturnGeneral.getTallaProducto().getProductos());
			this.tallaproductoBean.setParametroInventarioDefectos(tallaproductoReturnGeneral.getTallaProducto().getParametroInventarioDefectos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTallaProducto(TallaProducto tallaproducto,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					tallaproducto.setProductos(this.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					tallaproducto.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tallaproducto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTallaProducto = new TallaProductoDetalleFormJInternalFrame(jDesktopPane,this.tallaproductoSessionBean.getConGuardarRelaciones(),this.tallaproductoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTallaProducto);
		this.jInternalFrameDetalleFormTallaProducto.setVisible(false);
		this.jInternalFrameDetalleFormTallaProducto.setSelected(false);						
		
		this.jInternalFrameDetalleFormTallaProducto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTallaProducto.tallaproductoLogic=this.tallaproductoLogic;
		
		this.cargarCombosFrameForeignKeyTallaProducto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTallaProducto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTallaProducto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTallaProducto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTallaProducto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTallaProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTallaProducto"));
		
		this.jInternalFrameDetalleFormTallaProducto.jButtonModificarTallaProducto.addActionListener(new ButtonActionListener(this,"ModificarTallaProducto"));

		
		this.jInternalFrameDetalleFormTallaProducto.jButtonModificarToolBarTallaProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarTallaProducto"));
					
		this.jInternalFrameDetalleFormTallaProducto.jMenuItemModificarTallaProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarTallaProducto"));		
		
		
		
		this.jInternalFrameDetalleFormTallaProducto.jButtonActualizarTallaProducto.addActionListener (new ButtonActionListener(this,"ActualizarTallaProducto"));
		
		
		this.jInternalFrameDetalleFormTallaProducto.jButtonActualizarToolBarTallaProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTallaProducto"));
						
		this.jInternalFrameDetalleFormTallaProducto.jMenuItemActualizarTallaProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTallaProducto"));		
		
		
		
		this.jInternalFrameDetalleFormTallaProducto.jButtonEliminarTallaProducto.addActionListener (new ButtonActionListener(this,"EliminarTallaProducto"));
		
		
		this.jInternalFrameDetalleFormTallaProducto.jButtonEliminarToolBarTallaProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarTallaProducto"));
								
		this.jInternalFrameDetalleFormTallaProducto.jMenuItemEliminarTallaProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTallaProducto"));		
		
		
		
		this.jInternalFrameDetalleFormTallaProducto.jButtonCancelarTallaProducto.addActionListener (new ButtonActionListener(this,"CancelarTallaProducto"));
		
		
		this.jInternalFrameDetalleFormTallaProducto.jButtonCancelarToolBarTallaProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarTallaProducto"));
					
		this.jInternalFrameDetalleFormTallaProducto.jMenuItemCancelarTallaProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTallaProducto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTallaProducto.jMenuItemDetalleCerrarTallaProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTallaProducto"));		
		
		
		
		this.jInternalFrameDetalleFormTallaProducto.jButtonGuardarCambiosToolBarTallaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTallaProducto"));
		
		
		
		this.jInternalFrameDetalleFormTallaProducto.jButtonGuardarCambiosToolBarTallaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTallaProducto"));
		
		
		
		this.jInternalFrameDetalleFormTallaProducto.jComboBoxTiposAccionesFormularioTallaProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTallaProducto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaProducto.jButtonidTallaProductoBusqueda.addActionListener(new ButtonActionListener(this,"idTallaProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTallaProducto.jButtonid_empresaTallaProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTallaProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaProducto.jButtonid_empresaTallaProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTallaProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTallaProducto.jButtonid_tipo_productoTallaProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_productoTallaProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaProducto.jButtonid_tipo_productoTallaProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_productoTallaProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaProducto.jButtoncodigoTallaProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTallaProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaProducto.jButtonnombreTallaProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTallaProductoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTallaProducto.jTabbedPaneRelacionesTallaProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTallaProducto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTallaProducto"));
		
		if(this.jInternalFrameDetalleFormTallaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTallaProducto"));
		}
		
		this.jTableDatosTallaProducto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTallaProducto"));
		
		this.jTableDatosTallaProducto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTallaProducto"));
		
		this.jButtonNuevoTallaProducto.addActionListener(new ButtonActionListener(this,"NuevoTallaProducto"));
		
		this.jButtonDuplicarTallaProducto.addActionListener(new ButtonActionListener(this,"DuplicarTallaProducto"));
		
		this.jButtonCopiarTallaProducto.addActionListener(new ButtonActionListener(this,"CopiarTallaProducto"));
		
		this.jButtonVerFormTallaProducto.addActionListener(new ButtonActionListener(this,"VerFormTallaProducto"));
		
		
		this.jButtonNuevoToolBarTallaProducto.addActionListener(new ButtonActionListener(this,"NuevoToolBarTallaProducto"));
			
		this.jButtonDuplicarToolBarTallaProducto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTallaProducto"));
			
		this.jMenuItemNuevoTallaProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTallaProducto"));
			
		this.jMenuItemDuplicarTallaProducto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTallaProducto"));		
		
		
		this.jButtonNuevoRelacionesTallaProducto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTallaProducto"));
		
		
		this.jButtonNuevoRelacionesToolBarTallaProducto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTallaProducto"));
			
		this.jMenuItemNuevoRelacionesTallaProducto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTallaProducto"));		
		
		
		if(this.jInternalFrameDetalleFormTallaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaProducto.jButtonModificarTallaProducto.addActionListener(new ButtonActionListener(this,"ModificarTallaProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTallaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaProducto.jButtonModificarToolBarTallaProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarTallaProducto"));
			
			this.jInternalFrameDetalleFormTallaProducto.jMenuItemModificarTallaProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarTallaProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTallaProducto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTallaProducto.jButtonActualizarTallaProducto.addActionListener (new ButtonActionListener(this,"ActualizarTallaProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTallaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaProducto.jButtonActualizarToolBarTallaProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTallaProducto"));
				
			this.jInternalFrameDetalleFormTallaProducto.jMenuItemActualizarTallaProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTallaProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTallaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaProducto.jButtonEliminarTallaProducto.addActionListener (new ButtonActionListener(this,"EliminarTallaProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTallaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaProducto.jButtonEliminarToolBarTallaProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarTallaProducto"));
						
			this.jInternalFrameDetalleFormTallaProducto.jMenuItemEliminarTallaProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTallaProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTallaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaProducto.jButtonCancelarTallaProducto.addActionListener (new ButtonActionListener(this,"CancelarTallaProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTallaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaProducto.jButtonCancelarToolBarTallaProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarTallaProducto"));
			
			this.jInternalFrameDetalleFormTallaProducto.jMenuItemCancelarTallaProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTallaProducto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTallaProducto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTallaProducto"));		
		
		
		this.jButtonCerrarTallaProducto.addActionListener (new ButtonActionListener(this,"CerrarTallaProducto"));
		
		
		this.jButtonCerrarToolBarTallaProducto.addActionListener (new ButtonActionListener(this,"CerrarToolBarTallaProducto"));
			
		this.jMenuItemCerrarTallaProducto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTallaProducto"));
			
		if(this.jInternalFrameDetalleFormTallaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaProducto.jMenuItemDetalleCerrarTallaProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTallaProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTallaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaProducto.jButtonGuardarCambiosTallaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTallaProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTallaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaProducto.jButtonGuardarCambiosToolBarTallaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTallaProducto"));
		}
		
		this.jButtonCopiarToolBarTallaProducto.addActionListener (new ButtonActionListener(this,"CopiarToolBarTallaProducto"));
			
		this.jButtonVerFormToolBarTallaProducto.addActionListener (new ButtonActionListener(this,"VerFormToolBarTallaProducto"));
		
		this.jMenuItemGuardarCambiosTallaProducto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTallaProducto"));
			
		this.jMenuItemCopiarTallaProducto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTallaProducto"));		
		
		this.jMenuItemVerFormTallaProducto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTallaProducto"));		
		
		
		this.jButtonGuardarCambiosTablaTallaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTallaProducto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTallaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTallaProducto"));
			
		this.jMenuItemGuardarCambiosTablaTallaProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTallaProducto"));		
		
		
		
		this.jButtonRecargarInformacionTallaProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionTallaProducto"));
					
		this.jButtonRecargarInformacionToolBarTallaProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTallaProducto"));
		
		this.jMenuItemRecargarInformacionTallaProducto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTallaProducto"));		
		
		
		
		this.jButtonAnterioresTallaProducto.addActionListener (new ButtonActionListener(this,"AnterioresTallaProducto"));
		
		
		this.jButtonAnterioresToolBarTallaProducto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTallaProducto"));
		
		this.jMenuItemAnterioresTallaProducto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTallaProducto"));		
		
		
		this.jButtonSiguientesTallaProducto.addActionListener (new ButtonActionListener(this,"SiguientesTallaProducto"));
		
		
		this.jButtonSiguientesToolBarTallaProducto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTallaProducto"));
			
		this.jMenuItemSiguientesTallaProducto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTallaProducto"));
			
		this.jMenuItemAbrirOrderByTallaProducto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTallaProducto"));
			
		this.jMenuItemMostrarOcultarTallaProducto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTallaProducto"));
			
		this.jMenuItemDetalleAbrirOrderByTallaProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTallaProducto"));
			
		this.jMenuItemDetalleMostarOcultarTallaProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTallaProducto"));		
		
		
		this.jButtonNuevoGuardarCambiosTallaProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTallaProducto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTallaProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTallaProducto"));
			
		this.jMenuItemNuevoGuardarCambiosTallaProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTallaProducto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTallaProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTallaProducto"));

		this.jCheckBoxSeleccionadosTallaProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTallaProducto"));
		
		if(this.jInternalFrameDetalleFormTallaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaProducto.jComboBoxTiposAccionesFormularioTallaProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTallaProducto"));
		}
		
		
		this.jComboBoxTiposRelacionesTallaProducto.addActionListener (new ButtonActionListener(this,"TiposRelacionesTallaProducto"));
			
		this.jComboBoxTiposAccionesTallaProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesTallaProducto"));
					
		this.jComboBoxTiposSeleccionarTallaProducto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTallaProducto"));
			
		this.jTextFieldValorCampoGeneralTallaProducto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTallaProducto"));		
		
		
		if(this.jInternalFrameDetalleFormTallaProducto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaProducto.jButtonidTallaProductoBusqueda.addActionListener(new ButtonActionListener(this,"idTallaProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTallaProducto.jButtonid_empresaTallaProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTallaProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaProducto.jButtonid_empresaTallaProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTallaProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTallaProducto.jButtonid_tipo_productoTallaProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_productoTallaProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaProducto.jButtonid_tipo_productoTallaProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_productoTallaProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaProducto.jButtoncodigoTallaProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTallaProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaProducto.jButtonnombreTallaProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTallaProductoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTallaProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTallaProducto"));

			this.jButtonBusquedaPorNombreTallaProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTallaProducto"));

			this.jButtonFK_IdTipoProductoTallaProducto.addActionListener(new ButtonActionListener(this,"FK_IdTipoProductoTallaProducto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTallaProducto!=null) {
				this.jInternalFrameReporteDinamicoTallaProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTallaProducto"));
				this.jInternalFrameReporteDinamicoTallaProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTallaProducto"));
				this.jInternalFrameReporteDinamicoTallaProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTallaProducto"));
			}
			
			//this.jButtonCerrarReporteDinamicoTallaProducto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTallaProducto"));				
			//this.jButtonGenerarReporteDinamicoTallaProducto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTallaProducto"));
			//this.jButtonGenerarExcelReporteDinamicoTallaProducto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTallaProducto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTallaProducto!=null) {
				this.jInternalFrameImportacionTallaProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTallaProducto"));
				this.jInternalFrameImportacionTallaProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTallaProducto"));
				this.jInternalFrameImportacionTallaProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTallaProducto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTallaProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByTallaProducto"));
			
			this.jButtonAbrirOrderByToolBarTallaProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTallaProducto"));			
			
			if(this.jInternalFrameOrderByTallaProducto!=null) {
				this.jInternalFrameOrderByTallaProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTallaProducto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTallaProducto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTallaProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTallaProducto.jTabbedPaneRelacionesTallaProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTallaProducto"));
		
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
            		closingInternalFrameTallaProducto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTallaProducto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTallaProducto = (JInternalFrameBase)event.getSource();
	            	
	            TallaProductoBeanSwingJInternalFrame jInternalFrameParent=(TallaProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormTallaProducto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTallaProductoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTallaProducto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTallaProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTallaProducto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTallaProducto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTallaProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTallaProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTallaProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTallaProducto";
		inputMap = this.jButtonNuevoTallaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTallaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTallaProductoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTallaProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTallaProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTallaProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTallaProducto";
		inputMap = this.jButtonNuevoRelacionesTallaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTallaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTallaProductoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTallaProducto";
		inputMap = this.jButtonModificarTallaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTallaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTallaProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTallaProducto";
		inputMap = this.jButtonActualizarTallaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTallaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTallaProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTallaProducto";
		inputMap = this.jButtonEliminarTallaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTallaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTallaProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTallaProducto";
		inputMap = this.jButtonCancelarTallaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTallaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTallaProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTallaProducto";
		inputMap = this.jButtonCerrarTallaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTallaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTallaProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTallaProducto.jButtonGuardarCambiosTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTallaProducto";
		inputMap = this.jInternalFrameDetalleFormTallaProducto.jButtonGuardarCambiosTallaProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTallaProducto.jButtonGuardarCambiosTallaProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTallaProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTallaProducto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTallaProductoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTallaProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTallaProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTallaProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTallaProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTallaProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTallaProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaProducto.jButtonidTallaProductoBusqueda.addActionListener(new ButtonActionListener(this,"idTallaProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTallaProducto.jButtonid_empresaTallaProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTallaProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaProducto.jButtonid_empresaTallaProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTallaProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTallaProducto.jButtonid_tipo_productoTallaProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_productoTallaProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaProducto.jButtonid_tipo_productoTallaProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_productoTallaProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaProducto.jButtoncodigoTallaProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTallaProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTallaProducto.jButtonnombreTallaProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTallaProductoBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTallaProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTallaProducto"));

		this.jButtonBusquedaPorNombreTallaProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTallaProducto"));

		this.jButtonFK_IdTipoProductoTallaProducto.addActionListener(new ButtonActionListener(this,"FK_IdTipoProductoTallaProducto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTallaProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTallaProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTallaProductoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTallaProducto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTallaProducto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TallaProducto tallaproductoAux:this.tallaproductoLogic.getTallaProductos()) {
					tallaproductoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TallaProducto tallaproductoAux:tallaproductos) {
					tallaproductoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTallaProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTallaProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TallaProducto tallaproductoAux:this.tallaproductoLogic.getTallaProductos()) {
						tallaproductoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TallaProducto tallaproductoAux:tallaproductos) {
						tallaproductoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TallaProducto tallaproductoAux:this.tallaproductoLogic.getTallaProductos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TallaProducto tallaproductoAux:tallaproductos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTallaProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTallaProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTallaProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTallaProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTallaProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTallaProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTallaProducto.getSelectedRows();
			
			TallaProducto tallaproductoLocal=new TallaProducto();
			
			//this.seleccionarTodosTallaProducto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tallaproductoLocal =(TallaProducto) this.tallaproductoLogic.getTallaProductos().toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tallaproductoLocal =(TallaProducto) this.tallaproductos.toArray()[this.jTableDatosTallaProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tallaproductoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TallaProducto tallaproductoAux:this.tallaproductoLogic.getTallaProductos()) {
						tallaproductoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TallaProducto tallaproductoAux:tallaproductos) {
						tallaproductoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTallaProducto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTallaProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTallaProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTallaProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTallaProductoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTallaProductoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTallaProductoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTallaProducto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTallaProducto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TallaProducto tallaproductoAux:this.tallaproductoLogic.getTallaProductos()) {
				
						if(sTipoSeleccionar.equals(TallaProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tallaproductoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TallaProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tallaproductoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TallaProducto tallaproductoAux:tallaproductos) {
					
						if(sTipoSeleccionar.equals(TallaProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tallaproductoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TallaProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tallaproductoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTallaProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTallaProductoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTallaProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTallaProducto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTallaProducto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTallaProducto.jComboBoxTiposAccionesFormularioTallaProducto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTallaProducto) {				
					conSplash=true;//false;										
					
					//this.startProcessTallaProducto(conSplash);
				
					this.generarReporteTallaProductosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTallaProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTallaProducto.jComboBoxTiposAccionesFormularioTallaProducto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTallaProductosSeleccionados();
				//this.jComboBoxTiposAccionesTallaProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTallaProductosSeleccionados(false);
				//this.jComboBoxTiposAccionesTallaProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTallaProductosSeleccionados(true);
				//this.jComboBoxTiposAccionesTallaProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTallaProducto();
				
				this.exportarTallaProductosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTallaProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTallaProducto.jComboBoxTiposAccionesFormularioTallaProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTallaProductos();
				//this.importarTallaProductos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTallaProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTallaProducto.jComboBoxTiposAccionesFormularioTallaProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTallaProducto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTallaProductosSeleccionados();
				//this.jComboBoxTiposAccionesTallaProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Talla Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTallaProducto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTallaProducto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTallaProducto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Talla Producto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTallaProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTallaProducto.jComboBoxTiposAccionesFormularioTallaProducto.setSelectedIndex(0);					
				}	
			} 			
			else if(TallaProductoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTallaProducto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTallaProducto(conSplash);
					
						//this.actualizarParametrosGeneralTallaProducto();
						
						this.generarReporteProcesoAccionTallaProductosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTallaProducto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTallaProducto.jComboBoxTiposAccionesFormularioTallaProducto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TallaProductoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Talla ProductoS SELECCIONADOS?", "MANTENIMIENTO DE Talla Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTallaProducto();
				
						this.actualizarParametrosGeneralTallaProducto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tallaproductoReturnGeneral=tallaproductoLogic.procesarAccionTallaProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tallaproductoLogic.getTallaProductos(),this.tallaproductoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTallaProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTallaProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTallaProducto.jComboBoxTiposAccionesFormularioTallaProducto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTallaProducto();
					
					TallaProductoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTallaProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTallaProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTallaProducto.jComboBoxTiposAccionesFormularioTallaProducto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTallaProducto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTallaProductoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTallaProducto();
			
			if(this.jInternalFrameDetalleFormTallaProducto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TallaProducto> tallaproductosSeleccionados=new ArrayList<TallaProducto>();		
			TallaProducto tallaproducto=new TallaProducto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTallaProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTallaProducto.getSelectedItem();
			
			
			
			
			tallaproductosSeleccionados=this.getTallaProductosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tallaproductosSeleccionados.size()==1) {
				for(TallaProducto tallaproductoAux:tallaproductosSeleccionados) {
					tallaproducto=tallaproductoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Producto")) {
					jButtonProductoActionPerformed(null,rowIndex,true,false,tallaproducto);
				}
				else if(this.sTipoRelacion.equals("Parametro Inventario Defecto")) {
					jButtonParametroInventarioDefectoActionPerformed(null,rowIndex,true,false,tallaproducto);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTallaProducto();
			
      		//this.finishProcessTallaProducto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTallaProductoReturnGeneral() throws Exception {
		if(this.tallaproductoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tallaproductoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tallaproductoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tallaproductoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tallaproductoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tallaproductoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTallaProducto(false);
		}
		
		if(this.tallaproductoReturnGeneral.getConRetornoLista() || this.tallaproductoReturnGeneral.getConRetornoObjeto()) {
			if(this.tallaproductoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tallaproductoLogic.setTallaProductos(this.tallaproductoReturnGeneral.getTallaProductos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tallaproductoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tallaproductoLogic.setTallaProducto(this.tallaproductoReturnGeneral.getTallaProducto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTallaProducto(false);
		}
	}
	
	public void actualizarParametrosGeneralTallaProducto() throws Exception {
		
		
	}
	
	public ArrayList<TallaProducto> getTallaProductosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TallaProducto> tallaproductosSeleccionados=new ArrayList<TallaProducto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTallaProducto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TallaProducto tallaproductoAux:tallaproductoLogic.getTallaProductos()) {
					if(tallaproductoAux.getIsSelected()) {
						tallaproductosSeleccionados.add(tallaproductoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TallaProducto tallaproductoAux:this.tallaproductos) {
					if(tallaproductoAux.getIsSelected()) {
						tallaproductosSeleccionados.add(tallaproductoAux);				
					}
				}
			}
			
			if(tallaproductosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tallaproductosSeleccionados.addAll(this.tallaproductoLogic.getTallaProductos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tallaproductosSeleccionados.addAll(this.tallaproductos);				
					}
				}
			}
		} else {
			tallaproductosSeleccionados.add(this.tallaproducto);
		}
		
		return tallaproductosSeleccionados;
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
	
	public void generarReporteTallaProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTallaProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTallaProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTallaProductosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTallaProductosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTallaProductosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Talla Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTallaProductosSeleccionados() throws Exception {
		ArrayList<TallaProducto> tallaproductosSeleccionados=new ArrayList<TallaProducto>();		
		
		tallaproductosSeleccionados=this.getTallaProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTallaProductos("Todos",tallaproductosSeleccionados);
		
	}	
	
	public void generarReporteNormalTallaProductosSeleccionados() throws Exception {
		ArrayList<TallaProducto> tallaproductosSeleccionados=new ArrayList<TallaProducto>();		
		
		tallaproductosSeleccionados=this.getTallaProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTallaProductos("Todos",tallaproductosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTallaProductosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TallaProducto> tallaproductosSeleccionados=new ArrayList<TallaProducto>();
		
		tallaproductosSeleccionados=this.getTallaProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTallaProductos("Todos",tallaproductosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTallaProductosSeleccionados() throws Exception {
		ArrayList<TallaProducto> tallaproductosSeleccionados=new ArrayList<TallaProducto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTallaProducto();
		
		
		tallaproductosSeleccionados=this.getTallaProductosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTallaProducto();
		
		
		//this.generarReporteTallaProductos("Todos",tallaproductosSeleccionados ,tallaproductoImplementable,tallaproductoImplementableHome);
	}
	
	public void mostrarImportacionTallaProductos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTallaProducto();
		
		this.abrirFrameImportacionTallaProducto();		
		
			
		//this.generarReporteTallaProductos("Todos",tallaproductosSeleccionados ,tallaproductoImplementable,tallaproductoImplementableHome);
	}
	
	public void importarTallaProductos() throws Exception {		
	
	}
	
	public void exportarTallaProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTallaProductosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTallaProductosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTallaProductosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Talla Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTallaProductosSeleccionados() throws Exception {
		ArrayList<TallaProducto> tallaproductosSeleccionados=new ArrayList<TallaProducto>();		
		
		tallaproductosSeleccionados=this.getTallaProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tallaproducto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTallaProducto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TallaProducto tallaproductoAux:tallaproductosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTallaProducto(tallaproductoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tallaproductoAux.setsDetalleGeneralEntityReporte(tallaproductoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tallaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Talla Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTallaProducto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TallaProductoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TallaProductoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TallaProductoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TallaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TallaProductoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TallaProductoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTallaProducto(TallaProducto tallaproducto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tallaproducto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tallaproducto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tallaproducto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tallaproducto.gettipoproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tallaproducto.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tallaproducto.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTallaProductosSeleccionados() throws Exception {
		ArrayList<TallaProducto> tallaproductosSeleccionados=new ArrayList<TallaProducto>();		
		
		tallaproductosSeleccionados=this.getTallaProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tallaproducto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TallaProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTallaProducto(row);				
				iRow++;
			}				
			
			for(TallaProducto tallaproductoAux:tallaproductosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTallaProducto(tallaproductoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tallaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Talla Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTallaProductosSeleccionados() throws Exception {
		ArrayList<TallaProducto> tallaproductosSeleccionados=new ArrayList<TallaProducto>();		
		
		tallaproductosSeleccionados=this.getTallaProductosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tallaproducto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tallaproductos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tallaproducto");
			//elementRoot.appendChild(element);
		
			for(TallaProducto tallaproductoAux:tallaproductosSeleccionados) {
				element = document.createElement("tallaproducto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTallaProducto(tallaproductoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tallaproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Talla Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTallaProducto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TallaProductoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TallaProductoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TallaProductoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TallaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(TallaProductoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TallaProductoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTallaProducto(TallaProducto tallaproducto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tallaproducto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tallaproducto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tallaproducto.gettipoproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tallaproducto.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tallaproducto.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTallaProducto(TallaProducto tallaproducto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TallaProductoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tallaproducto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TallaProductoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tallaproducto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TallaProductoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tallaproducto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtipoproducto_descripcion = document.createElement(TallaProductoConstantesFunciones.IDTIPOPRODUCTO);
		elementtipoproducto_descripcion.appendChild(document.createTextNode(tallaproducto.gettipoproducto_descripcion()));
		element.appendChild(elementtipoproducto_descripcion);

		Element elementcodigo = document.createElement(TallaProductoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tallaproducto.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TallaProductoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tallaproducto.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTallaProductosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TallaProducto> tallaproductosSeleccionados=new ArrayList<TallaProducto>();
		
		tallaproductosSeleccionados=this.getTallaProductosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTallaProducto(tallaproductosSeleccionados);
		
		this.generarReporteTallaProductos("Todos",tallaproductosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTallaProducto(ArrayList<TallaProducto> tallaproductosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TallaProducto tallaproductoAux:tallaproductosSeleccionados) {
				tallaproductoAux.setsDetalleGeneralEntityReporte(tallaproductoAux.toString());
			
				if(sTipoSeleccionar.equals(TallaProductoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tallaproductoAux.setsDescripcionGeneralEntityReporte1(tallaproductoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TallaProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO)) {
					existe=true;
					tallaproductoAux.setsDescripcionGeneralEntityReporte1(tallaproductoAux.gettipoproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TallaProductoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tallaproductoAux.setsDescripcionGeneralEntityReporte1(tallaproductoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TallaProductoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tallaproductoAux.setsDescripcionGeneralEntityReporte1(tallaproductoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TallaProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTallaProducto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTallaProducto=true;
				this.isVisibilidadCeldaNuevoRelacionesTallaProducto=true;
				this.isVisibilidadCeldaGuardarCambiosTallaProducto=true;
			}
			
			this.isVisibilidadCeldaModificarTallaProducto=false;
			this.isVisibilidadCeldaActualizarTallaProducto=false;
			this.isVisibilidadCeldaEliminarTallaProducto=false;
			this.isVisibilidadCeldaCancelarTallaProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTallaProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarTallaProducto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTallaProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesTallaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosTallaProducto=false;
			this.isVisibilidadCeldaModificarTallaProducto=false;
			this.isVisibilidadCeldaActualizarTallaProducto=true;
			this.isVisibilidadCeldaEliminarTallaProducto=false;
			this.isVisibilidadCeldaCancelarTallaProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTallaProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarTallaProducto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTallaProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesTallaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosTallaProducto=false;
			this.isVisibilidadCeldaModificarTallaProducto=false;
			this.isVisibilidadCeldaActualizarTallaProducto=true;
			this.isVisibilidadCeldaEliminarTallaProducto=true;
			this.isVisibilidadCeldaCancelarTallaProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTallaProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarTallaProducto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTallaProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesTallaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosTallaProducto=false;
			this.isVisibilidadCeldaModificarTallaProducto=false;
			this.isVisibilidadCeldaActualizarTallaProducto=true;
			this.isVisibilidadCeldaEliminarTallaProducto=false;
			this.isVisibilidadCeldaCancelarTallaProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTallaProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarTallaProducto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTallaProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesTallaProducto=true;
			this.isVisibilidadCeldaGuardarCambiosTallaProducto=true;
			this.isVisibilidadCeldaModificarTallaProducto=false;
			this.isVisibilidadCeldaActualizarTallaProducto=false;
			this.isVisibilidadCeldaEliminarTallaProducto=false;
			this.isVisibilidadCeldaCancelarTallaProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTallaProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarTallaProducto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTallaProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesTallaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosTallaProducto=false;
			this.isVisibilidadCeldaActualizarTallaProducto=false;
			this.isVisibilidadCeldaEliminarTallaProducto=false;
			this.isVisibilidadCeldaCancelarTallaProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTallaProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarTallaProducto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTallaProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesTallaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosTallaProducto=false;
			this.isVisibilidadCeldaModificarTallaProducto=true;
			this.isVisibilidadCeldaActualizarTallaProducto=false;
			this.isVisibilidadCeldaEliminarTallaProducto=false;
			this.isVisibilidadCeldaCancelarTallaProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTallaProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarTallaProducto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TallaProductoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTallaProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesTallaProducto=true;
			this.isVisibilidadCeldaGuardarCambiosTallaProducto=true;
		} else {
			this.actualizarEstadoPanelsTallaProducto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTallaProducto=false;
			//this.isVisibilidadCeldaVerFormTallaProducto=false;
			this.isVisibilidadCeldaDuplicarTallaProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tallaproductoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTallaProducto=false;
		} else {
			this.isVisibilidadCeldaNuevoTallaProducto=false;
			this.isVisibilidadCeldaGuardarCambiosTallaProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tallaproductoSessionBean.getEsGuardarRelacionado()) {
			if(!tallaproductoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTallaProducto=false;												
			}
			
			this.jButtonCerrarTallaProducto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTallaProducto=false;
		}
		
		if(!this.permiteMantenimiento(this.tallaproducto)) {
			this.isVisibilidadCeldaActualizarTallaProducto=false;
			this.isVisibilidadCeldaEliminarTallaProducto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTallaProducto() {
		this.isVisibilidadCeldaNuevoTallaProducto=false;
		this.isVisibilidadCeldaGuardarCambiosTallaProducto=false;
	}
	
	public void actualizarEstadoPanelsTallaProducto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTallaProducto!=null) {
				this.jScrollPanelDatosEdicionTallaProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTallaProducto!=null) {
				this.jTabbedPaneBusquedasTallaProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTallaProducto!=null) {
				this.jScrollPanelDatosTallaProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionTallaProducto!=null) {
				this.jPanelPaginacionTallaProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTallaProducto!=null) {
				this.jPanelParametrosReportesTallaProducto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTallaProducto!=null) {
				this.jScrollPanelDatosEdicionTallaProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTallaProducto!=null) {
				this.jTabbedPaneBusquedasTallaProducto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTallaProducto!=null) {
				this.jScrollPanelDatosTallaProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionTallaProducto!=null) {
				this.jPanelPaginacionTallaProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTallaProducto!=null) {
				this.jPanelParametrosReportesTallaProducto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTallaProducto!=null) {
				this.jScrollPanelDatosEdicionTallaProducto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTallaProducto!=null) {
				this.jTabbedPaneBusquedasTallaProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTallaProducto!=null) {
				this.jScrollPanelDatosTallaProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionTallaProducto!=null) {
				this.jPanelPaginacionTallaProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTallaProducto!=null) {
				this.jPanelParametrosReportesTallaProducto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTallaProducto!=null) {
				this.jScrollPanelDatosEdicionTallaProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTallaProducto!=null) {
				this.jTabbedPaneBusquedasTallaProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTallaProducto!=null) {
				this.jScrollPanelDatosTallaProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionTallaProducto!=null) {
				this.jPanelPaginacionTallaProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTallaProducto!=null) {
				this.jPanelParametrosReportesTallaProducto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTallaProducto!=null) {
				this.jScrollPanelDatosEdicionTallaProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTallaProducto!=null) {
				this.jTabbedPaneBusquedasTallaProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTallaProducto!=null) {
				this.jScrollPanelDatosTallaProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionTallaProducto!=null) {
				this.jPanelPaginacionTallaProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTallaProducto!=null) {
				this.jPanelParametrosReportesTallaProducto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTallaProducto!=null) {
				this.jScrollPanelDatosEdicionTallaProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTallaProducto!=null) {
				this.jTabbedPaneBusquedasTallaProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTallaProducto!=null) {
				this.jScrollPanelDatosTallaProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionTallaProducto!=null) {
				this.jPanelPaginacionTallaProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTallaProducto!=null) {
				this.jPanelParametrosReportesTallaProducto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTallaProducto!=null) {
				this.jScrollPanelDatosEdicionTallaProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTallaProducto!=null) {
				this.jTabbedPaneBusquedasTallaProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTallaProducto!=null) {
				this.jScrollPanelDatosTallaProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionTallaProducto!=null) {
				this.jPanelPaginacionTallaProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTallaProducto!=null) {
				this.jPanelParametrosReportesTallaProducto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTallaProducto!=null) {
					this.jTabbedPaneBusquedasTallaProducto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTallaProducto!=null) {
				this.jPanelParametrosReportesTallaProducto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tallaproductoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTallaProducto!=null) {
				this.jTabbedPaneBusquedasTallaProducto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTallaProducto!=null) {
				this.jPanelParametrosReportesTallaProducto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTallaProducto.remove(jPanelBusquedaPorCodigoTallaProducto);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTallaProducto.remove(jPanelBusquedaPorNombreTallaProducto);}

			this.isVisibilidadFK_IdTipoProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoProducto) {this.jTabbedPaneBusquedasTallaProducto.remove(jPanelFK_IdTipoProductoTallaProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoProducto(Boolean isParaTipoProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoProductoNegation=!isParaTipoProducto;

			this.isVisibilidadBusquedaPorCodigo=isParaTipoProductoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTallaProducto.remove(jPanelBusquedaPorCodigoTallaProducto);}

			this.isVisibilidadBusquedaPorNombre=isParaTipoProductoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTallaProducto.remove(jPanelBusquedaPorNombreTallaProducto);}

			this.isVisibilidadFK_IdTipoProducto=isParaTipoProducto;
			if(!this.isVisibilidadFK_IdTipoProducto) {this.jTabbedPaneBusquedasTallaProducto.remove(jPanelFK_IdTipoProductoTallaProducto);}
		}
		
	}
	
	

	public String registrarSesionTallaProductoParaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(this.tallaproductoSessionBean==null) {
				this.tallaproductoSessionBean=new TallaProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTallaProducto.productoSessionBean==null) {
				this.jInternalFrameDetalleFormTallaProducto.productoSessionBean=new ProductoSessionBean();
			}

			this.jInternalFrameDetalleFormTallaProducto.productoSessionBean.setsPathNavegacionActual(tallaproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTallaProducto.productoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProducto=this.jInternalFrameDetalleFormTallaProducto.productoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTallaProducto.productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			this.jInternalFrameDetalleFormTallaProducto.productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(TallaProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTallaProducto.productoSessionBean.setisBusquedaDesdeForeignKeySesionTallaProducto(true);
			this.jInternalFrameDetalleFormTallaProducto.productoSessionBean.setlidTallaProductoActual(this.idTallaProductoActual);

			tallaproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTallaProducto(true);
			tallaproductoSessionBean.setlIdTallaProductoActualForeignKey(this.idTallaProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTallaProductoParaParametroInventarioDefectos() throws Exception {
		Boolean isPaginaPopupParametroInventarioDefecto=false;

		try {

			if(this.tallaproductoSessionBean==null) {
				this.tallaproductoSessionBean=new TallaProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoSessionBean==null) {
				this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoSessionBean.setsPathNavegacionActual(tallaproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroInventarioDefecto=this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(true);
			this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(TallaProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionTallaProducto(true);
			this.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoSessionBean.setlidTallaProductoActual(this.idTallaProductoActual);

			tallaproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTallaProducto(true);
			tallaproductoSessionBean.setlIdTallaProductoActualForeignKey(this.idTallaProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TallaProductoSessionBean tallaproductoSessionBean=new TallaProductoSessionBean();
		
		if(this.tallaproductoSessionBean==null) {
			this.tallaproductoSessionBean=new TallaProductoSessionBean();
		}
		
		this.tallaproductoSessionBean.setsUltimaBusquedaTallaProducto(this.getsAccionBusqueda());
		this.tallaproductoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tallaproductoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tallaproductoSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tallaproductoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tallaproductoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoProducto")) {
			tallaproductoSessionBean.setid_tipo_producto(this.getid_tipo_productoFK_IdTipoProducto());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TallaProductoSessionBean tallaproductoSessionBean=new TallaProductoSessionBean();
		
		if(this.tallaproductoSessionBean==null) {
			this.tallaproductoSessionBean=new TallaProductoSessionBean();
		}
		
		if(this.tallaproductoSessionBean.getsUltimaBusquedaTallaProducto()!=null&&!this.tallaproductoSessionBean.getsUltimaBusquedaTallaProducto().equals("")) {
			this.setsAccionBusqueda(tallaproductoSessionBean.getsUltimaBusquedaTallaProducto());
			this.setiNumeroPaginacion(tallaproductoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tallaproductoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tallaproductoSessionBean.getcodigo());
				tallaproductoSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tallaproductoSessionBean.getnombre());
				tallaproductoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tallaproductoSessionBean.getid_empresa());
				tallaproductoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoProducto")) {
				this.setid_tipo_productoFK_IdTipoProducto(tallaproductoSessionBean.getid_tipo_producto());
				tallaproductoSessionBean.setid_tipo_producto(-1L);
			}
		}
		
		this.tallaproductoSessionBean.setsUltimaBusquedaTallaProducto("");
		this.tallaproductoSessionBean.setiNumeroPaginacion(TallaProductoConstantesFunciones.INUMEROPAGINACION);
		this.tallaproductoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTallaProducto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTallaProducto() {
		this.updateBorderResaltarBusquedasFormularioTallaProducto();
		this.updateVisibilidadBusquedasFormularioTallaProducto();
		this.updateHabilitarBusquedasFormularioTallaProducto();
	}
	
	public void updateBorderResaltarBusquedasFormularioTallaProducto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTallaProducto.getComponents().length>0) {
	

		if(this.tallaproductoConstantesFunciones.resaltarBusquedaPorCodigoTallaProducto!=null) {
			index= this.jTabbedPaneBusquedasTallaProducto.indexOfComponent(this.jPanelBusquedaPorCodigoTallaProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTallaProducto.getComponent(index);
				jPanel.setBorder(this.tallaproductoConstantesFunciones.resaltarBusquedaPorCodigoTallaProducto);
			}
		}

		if(this.tallaproductoConstantesFunciones.resaltarBusquedaPorNombreTallaProducto!=null) {
			index= this.jTabbedPaneBusquedasTallaProducto.indexOfComponent(this.jPanelBusquedaPorNombreTallaProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTallaProducto.getComponent(index);
				jPanel.setBorder(this.tallaproductoConstantesFunciones.resaltarBusquedaPorNombreTallaProducto);
			}
		}

		if(this.tallaproductoConstantesFunciones.resaltarFK_IdTipoProductoTallaProducto!=null) {
			index= this.jTabbedPaneBusquedasTallaProducto.indexOfComponent(this.jPanelFK_IdTipoProductoTallaProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTallaProducto.getComponent(index);
				jPanel.setBorder(this.tallaproductoConstantesFunciones.resaltarFK_IdTipoProductoTallaProducto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTallaProducto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTallaProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTallaProducto.indexOfComponent(this.jPanelBusquedaPorCodigoTallaProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTallaProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tallaproductoConstantesFunciones.mostrarBusquedaPorCodigoTallaProducto);
			if(!this.tallaproductoConstantesFunciones.mostrarBusquedaPorCodigoTallaProducto && index>-1) {
				this.jTabbedPaneBusquedasTallaProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasTallaProducto.indexOfComponent(this.jPanelBusquedaPorNombreTallaProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTallaProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tallaproductoConstantesFunciones.mostrarBusquedaPorNombreTallaProducto);
			if(!this.tallaproductoConstantesFunciones.mostrarBusquedaPorNombreTallaProducto && index>-1) {
				this.jTabbedPaneBusquedasTallaProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasTallaProducto.indexOfComponent(this.jPanelFK_IdTipoProductoTallaProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTallaProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tallaproductoConstantesFunciones.mostrarFK_IdTipoProductoTallaProducto);
			if(!this.tallaproductoConstantesFunciones.mostrarFK_IdTipoProductoTallaProducto && index>-1) {
				this.jTabbedPaneBusquedasTallaProducto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTallaProducto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTallaProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTallaProducto.indexOfComponent(this.jPanelBusquedaPorCodigoTallaProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTallaProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tallaproductoConstantesFunciones.activarBusquedaPorCodigoTallaProducto);
				this.jTabbedPaneBusquedasTallaProducto.setEnabledAt(index,this.tallaproductoConstantesFunciones.activarBusquedaPorCodigoTallaProducto);
			}

			index= this.jTabbedPaneBusquedasTallaProducto.indexOfComponent(this.jPanelBusquedaPorNombreTallaProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTallaProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tallaproductoConstantesFunciones.activarBusquedaPorNombreTallaProducto);
				this.jTabbedPaneBusquedasTallaProducto.setEnabledAt(index,this.tallaproductoConstantesFunciones.activarBusquedaPorNombreTallaProducto);
			}

			index= this.jTabbedPaneBusquedasTallaProducto.indexOfComponent(this.jPanelFK_IdTipoProductoTallaProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTallaProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tallaproductoConstantesFunciones.activarFK_IdTipoProductoTallaProducto);
				this.jTabbedPaneBusquedasTallaProducto.setEnabledAt(index,this.tallaproductoConstantesFunciones.activarFK_IdTipoProductoTallaProducto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTallaProducto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTallaProducto.indexOfComponent(this.jPanelBusquedaPorCodigoTallaProducto);

			this.jTabbedPaneBusquedasTallaProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTallaProducto.getComponent(index);

			this.tallaproductoConstantesFunciones.setResaltarBusquedaPorCodigoTallaProducto(resaltar);

			jPanel.setBorder(this.tallaproductoConstantesFunciones.resaltarBusquedaPorCodigoTallaProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTallaProducto.indexOfComponent(this.jPanelBusquedaPorNombreTallaProducto);

			this.jTabbedPaneBusquedasTallaProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTallaProducto.getComponent(index);

			this.tallaproductoConstantesFunciones.setResaltarBusquedaPorNombreTallaProducto(resaltar);

			jPanel.setBorder(this.tallaproductoConstantesFunciones.resaltarBusquedaPorNombreTallaProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoProducto")) {
			index= this.jTabbedPaneBusquedasTallaProducto.indexOfComponent(this.jPanelFK_IdTipoProductoTallaProducto);

			this.jTabbedPaneBusquedasTallaProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTallaProducto.getComponent(index);

			this.tallaproductoConstantesFunciones.setResaltarFK_IdTipoProductoTallaProducto(resaltar);

			jPanel.setBorder(this.tallaproductoConstantesFunciones.resaltarFK_IdTipoProductoTallaProducto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTallaProducto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTallaProducto() throws Exception {

		if(this.jInternalFrameDetalleFormTallaProducto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTallaProducto();
		this.updateVisibilidadResaltarControlesFormularioTallaProducto();
		this.updateHabilitarResaltarControlesFormularioTallaProducto();
		
	}
	
	public void updateBorderResaltarControlesFormularioTallaProducto() throws Exception {
		if(this.jInternalFrameDetalleFormTallaProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tallaproductoConstantesFunciones.resaltaridTallaProducto!=null && this.jInternalFrameDetalleFormTallaProducto!=null) {this.jInternalFrameDetalleFormTallaProducto.jLabelidTallaProducto.setBorder(this.tallaproductoConstantesFunciones.resaltaridTallaProducto);}
		if(this.tallaproductoConstantesFunciones.resaltarid_empresaTallaProducto!=null && this.jInternalFrameDetalleFormTallaProducto!=null) {this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_empresaTallaProducto.setBorder(this.tallaproductoConstantesFunciones.resaltarid_empresaTallaProducto);}
		if(this.tallaproductoConstantesFunciones.resaltarid_tipo_productoTallaProducto!=null && this.jInternalFrameDetalleFormTallaProducto!=null) {this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_tipo_productoTallaProducto.setBorder(this.tallaproductoConstantesFunciones.resaltarid_tipo_productoTallaProducto);}
		if(this.tallaproductoConstantesFunciones.resaltarcodigoTallaProducto!=null && this.jInternalFrameDetalleFormTallaProducto!=null) {this.jInternalFrameDetalleFormTallaProducto.jTextFieldcodigoTallaProducto.setBorder(this.tallaproductoConstantesFunciones.resaltarcodigoTallaProducto);}
		if(this.tallaproductoConstantesFunciones.resaltarnombreTallaProducto!=null && this.jInternalFrameDetalleFormTallaProducto!=null) {this.jInternalFrameDetalleFormTallaProducto.jTextAreanombreTallaProducto.setBorder(this.tallaproductoConstantesFunciones.resaltarnombreTallaProducto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTallaProducto() throws Exception {		
		if(this.jInternalFrameDetalleFormTallaProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTallaProducto!=null) {
	
		//this.jInternalFrameDetalleFormTallaProducto.jLabelidTallaProducto.setVisible(this.tallaproductoConstantesFunciones.mostraridTallaProducto);
		this.jInternalFrameDetalleFormTallaProducto.jPanelidTallaProducto.setVisible(this.tallaproductoConstantesFunciones.mostraridTallaProducto);
		//this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_empresaTallaProducto.setVisible(this.tallaproductoConstantesFunciones.mostrarid_empresaTallaProducto);
		this.jInternalFrameDetalleFormTallaProducto.jPanelid_empresaTallaProducto.setVisible(this.tallaproductoConstantesFunciones.mostrarid_empresaTallaProducto);
		//this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_tipo_productoTallaProducto.setVisible(this.tallaproductoConstantesFunciones.mostrarid_tipo_productoTallaProducto);
		this.jInternalFrameDetalleFormTallaProducto.jPanelid_tipo_productoTallaProducto.setVisible(this.tallaproductoConstantesFunciones.mostrarid_tipo_productoTallaProducto);
		//this.jInternalFrameDetalleFormTallaProducto.jTextFieldcodigoTallaProducto.setVisible(this.tallaproductoConstantesFunciones.mostrarcodigoTallaProducto);
		this.jInternalFrameDetalleFormTallaProducto.jPanelcodigoTallaProducto.setVisible(this.tallaproductoConstantesFunciones.mostrarcodigoTallaProducto);
		//this.jInternalFrameDetalleFormTallaProducto.jTextAreanombreTallaProducto.setVisible(this.tallaproductoConstantesFunciones.mostrarnombreTallaProducto);
		this.jInternalFrameDetalleFormTallaProducto.jPanelnombreTallaProducto.setVisible(this.tallaproductoConstantesFunciones.mostrarnombreTallaProducto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTallaProducto() throws Exception {
		if(this.jInternalFrameDetalleFormTallaProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTallaProducto!=null) {
	
		this.jInternalFrameDetalleFormTallaProducto.jLabelidTallaProducto.setEnabled(this.tallaproductoConstantesFunciones.activaridTallaProducto);
		this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_empresaTallaProducto.setEnabled(this.tallaproductoConstantesFunciones.activarid_empresaTallaProducto);
		this.jInternalFrameDetalleFormTallaProducto.jComboBoxid_tipo_productoTallaProducto.setEnabled(this.tallaproductoConstantesFunciones.activarid_tipo_productoTallaProducto);
		this.jInternalFrameDetalleFormTallaProducto.jTextFieldcodigoTallaProducto.setEnabled(this.tallaproductoConstantesFunciones.activarcodigoTallaProducto);
		this.jInternalFrameDetalleFormTallaProducto.jTextAreanombreTallaProducto.setEnabled(this.tallaproductoConstantesFunciones.activarnombreTallaProducto);
		}
	}
	
		
}