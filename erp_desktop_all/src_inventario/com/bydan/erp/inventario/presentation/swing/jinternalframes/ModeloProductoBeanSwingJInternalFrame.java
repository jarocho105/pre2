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

import com.bydan.erp.inventario.util.ModeloProductoConstantesFunciones;
import com.bydan.erp.inventario.util.ModeloProductoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.ModeloProductoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.ModeloProductoBean;
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
public class ModeloProductoBeanSwingJInternalFrame extends ModeloProductoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ModeloProductoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ModeloProducto> modeloproductoValidator = new ClassValidator<ModeloProducto>(ModeloProducto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ModeloProducto modeloproducto;	
	public ModeloProducto modeloproductoAux;
	public ModeloProducto modeloproductoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ModeloProducto modeloproductoTotales;
	public Long idModeloProductoActual;
	public Long iIdNuevoModeloProducto=0L;
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
	
	public Boolean isPermisoTodoModeloProducto;
	public Boolean isPermisoNuevoModeloProducto;
	public Boolean isPermisoActualizarModeloProducto;
	public Boolean isPermisoActualizarOriginalModeloProducto;
	public Boolean isPermisoEliminarModeloProducto;
	public Boolean isPermisoGuardarCambiosModeloProducto;
	public Boolean isPermisoConsultaModeloProducto;
	public Boolean isPermisoBusquedaModeloProducto;
	public Boolean isPermisoReporteModeloProducto;
	public Boolean isPermisoPaginacionMedioModeloProducto;
	public Boolean isPermisoPaginacionAltoModeloProducto;
	public Boolean isPermisoPaginacionTodoModeloProducto;
	public Boolean isPermisoCopiarModeloProducto;
	public Boolean isPermisoVerFormModeloProducto;
	public Boolean isPermisoDuplicarModeloProducto;
	public Boolean isPermisoOrdenModeloProducto;
	
	
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
	
	public ModeloProductoParameterReturnGeneral modeloproductoReturnGeneral;
	public ModeloProductoParameterReturnGeneral modeloproductoParameterGeneral;
	
	

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
	
	public Boolean isEsNuevoModeloProducto=false;
	public Boolean esParaAccionDesdeFormularioModeloProducto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ModeloProductoSessionBeanAdditional modeloproductoSessionBeanAdditional=null;
	
	public ModeloProductoSessionBeanAdditional getModeloProductoSessionBeanAdditional() {
		return this.modeloproductoSessionBeanAdditional;
	}
	
	public void setModeloProductoSessionBeanAdditional(ModeloProductoSessionBeanAdditional modeloproductoSessionBeanAdditional) {
		try {
			this.modeloproductoSessionBeanAdditional=modeloproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ModeloProductoBeanSwingJInternalFrameAdditional modeloproductoBeanSwingJInternalFrameAdditional=null;
	//public class ModeloProductoBeanSwingJInternalFrame
	
	public ModeloProductoBeanSwingJInternalFrameAdditional getModeloProductoBeanSwingJInternalFrameAdditional() {
		return this.modeloproductoBeanSwingJInternalFrameAdditional;
	}
	
	public void setModeloProductoBeanSwingJInternalFrameAdditional(ModeloProductoBeanSwingJInternalFrameAdditional modeloproductoBeanSwingJInternalFrameAdditional) {
		try {
			this.modeloproductoBeanSwingJInternalFrameAdditional=modeloproductoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ModeloProductoLogic modeloproductoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ModeloProducto modeloproductoBean;
	public ModeloProductoConstantesFunciones modeloproductoConstantesFunciones;
	//public ModeloProductoParameterReturnGeneral modeloproductoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoProductoLogic tipoproductoLogic;
	
	//PARAMETROS
	
	
	//public List<ModeloProducto> modeloproductos;	
	//public List<ModeloProducto> modeloproductosEliminados;
	//public List<ModeloProducto> modeloproductosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoModeloProducto=false;
	public Boolean isVisibilidadCeldaDuplicarModeloProducto=true;
	public Boolean isVisibilidadCeldaCopiarModeloProducto=true;
	public Boolean isVisibilidadCeldaVerFormModeloProducto=true;
	public Boolean isVisibilidadCeldaOrdenModeloProducto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesModeloProducto=false;
	public Boolean isVisibilidadCeldaModificarModeloProducto=false;
	public Boolean isVisibilidadCeldaActualizarModeloProducto=false;
	public Boolean isVisibilidadCeldaEliminarModeloProducto=false;
	public Boolean isVisibilidadCeldaCancelarModeloProducto=false;
	public Boolean isVisibilidadCeldaGuardarModeloProducto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosModeloProducto=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoProducto=false;
	
	public Long getiIdNuevoModeloProducto() {
		return this.iIdNuevoModeloProducto;
	}

	public void setiIdNuevoModeloProducto(Long iIdNuevoModeloProducto) {
		this.iIdNuevoModeloProducto = iIdNuevoModeloProducto;
	}
	
	public Long getidModeloProductoActual() {
		return this.idModeloProductoActual;
	}

	public void setidModeloProductoActual(Long idModeloProductoActual) {
		this.idModeloProductoActual = idModeloProductoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ModeloProducto getmodeloproducto() {
		return this.modeloproducto;
	}

	public void setmodeloproducto(ModeloProducto modeloproducto) {
		this.modeloproducto = modeloproducto;
	}
	
	public ModeloProducto getmodeloproductoAux() {
		return this.modeloproductoAux;
	}

	public void setmodeloproductoAux(ModeloProducto modeloproductoAux) {
		this.modeloproductoAux = modeloproductoAux;
	}				
	
	public ModeloProducto getmodeloproductoAnterior() {
		return this.modeloproductoAnterior;
	}

	public void setmodeloproductoAnterior(ModeloProducto modeloproductoAnterior) {
		this.modeloproductoAnterior = modeloproductoAnterior;
	}	
	
	public ModeloProducto getmodeloproductoTotales() {
		return this.modeloproductoTotales;
	}

	public void setmodeloproductoTotales(ModeloProducto modeloproductoTotales) {
		this.modeloproductoTotales = modeloproductoTotales;
	}	
	
	public ModeloProducto getmodeloproductoBean() {
		return this.modeloproductoBean;
	}

	public void setmodeloproductoBean(ModeloProducto modeloproductoBean) {
		this.modeloproductoBean = modeloproductoBean;
	}	
	
	public ModeloProductoParameterReturnGeneral getmodeloproductoReturnGeneral() {
		return this.modeloproductoReturnGeneral;
	}

	public void setmodeloproductoReturnGeneral(ModeloProductoParameterReturnGeneral modeloproductoReturnGeneral) {
		this.modeloproductoReturnGeneral = modeloproductoReturnGeneral;
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
	
	
	public ModeloProductoLogic getModeloProductoLogic()	{		
		return modeloproductoLogic;
	}

	public void setModeloProductoLogic(ModeloProductoLogic modeloproductoLogic) {
		this.modeloproductoLogic = modeloproductoLogic;
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
	
	public Boolean getIsEsNuevoModeloProducto() {
		return isEsNuevoModeloProducto;
	}

	public void setIsEsNuevoModeloProducto(Boolean isEsNuevoModeloProducto) {
		this.isEsNuevoModeloProducto = isEsNuevoModeloProducto;
	}

	public Boolean getEsParaAccionDesdeFormularioModeloProducto() {
		return esParaAccionDesdeFormularioModeloProducto;
	}
	
	public void setEsParaAccionDesdeFormularioModeloProducto(Boolean esParaAccionDesdeFormularioModeloProducto) {
		this.esParaAccionDesdeFormularioModeloProducto = esParaAccionDesdeFormularioModeloProducto;
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

			if(this.modeloproductoSessionBean==null) {
				this.modeloproductoSessionBean=new ModeloProductoSessionBean();
			}

			if(!this.modeloproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(modeloproductoSessionBean.getlidEmpresaActual());
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

			if(this.modeloproductoSessionBean==null) {
				this.modeloproductoSessionBean=new ModeloProductoSessionBean();
			}

			if(!this.modeloproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProducto()) {
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
					tipoproductoLogic.getEntityWithConnection(modeloproductoSessionBean.getlidTipoProductoActual());
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

					if(this.modeloproducto!=null) {
						this.modeloproducto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormModeloProducto!=null) {
						this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_empresaModeloProducto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaModeloProducto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormModeloProducto!=null) {
						if(this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_empresaModeloProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_empresaModeloProducto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaModeloProductoGenerico)throws Exception
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
				jComboBoxid_empresaModeloProductoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaModeloProductoGenerico!=null && jComboBoxid_empresaModeloProductoGenerico.getItemCount()>0) {
					jComboBoxid_empresaModeloProductoGenerico.setSelectedIndex(0);
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

					if(this.modeloproducto!=null) {
						this.modeloproducto.setTipoProducto(tipoproductoTemp);
					}

					if(this.jInternalFrameDetalleFormModeloProducto!=null) {
						this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_tipo_productoModeloProducto.setSelectedItem(tipoproductoTemp);
					}
				} else {
					//jComboBoxid_tipo_productoModeloProducto.setSelectedItem(tipoproductoTemp);
					if(this.jInternalFrameDetalleFormModeloProducto!=null) {
						if(this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_tipo_productoModeloProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_tipo_productoModeloProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoproductoTemp!=null && jComboBoxid_tipo_productoFK_IdTipoProductoModeloProducto!=null) {
						jComboBoxid_tipo_productoFK_IdTipoProductoModeloProducto.setSelectedItem(tipoproductoTemp);
					} else {
						if(jComboBoxid_tipo_productoFK_IdTipoProductoModeloProducto!=null) {
							//jComboBoxid_tipo_productoFK_IdTipoProductoModeloProducto.setSelectedItem(tipoproductoTemp);
							if(jComboBoxid_tipo_productoFK_IdTipoProductoModeloProducto.getItemCount()>0) {
								jComboBoxid_tipo_productoFK_IdTipoProductoModeloProducto.setSelectedIndex(0);
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
	public void setActualTipoProductoForeignKeyGenerico(Long idTipoProductoSeleccionado,JComboBox jComboBoxid_tipo_productoModeloProductoGenerico)throws Exception
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
				jComboBoxid_tipo_productoModeloProductoGenerico.setSelectedItem(tipoproductoTemp);
			} else {
				if(jComboBoxid_tipo_productoModeloProductoGenerico!=null && jComboBoxid_tipo_productoModeloProductoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_productoModeloProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ModeloProducto modeloproducto,JComboBox jComboBoxid_empresaModeloProductoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaModeloProductoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_empresaModeloProducto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaModeloProductoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				modeloproducto.setid_empresa(empresaAux.getId());
				modeloproducto.setempresa_descripcion(ModeloProductoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				modeloproducto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoProductoForeignKey(ModeloProducto modeloproducto,JComboBox jComboBoxid_tipo_productoModeloProductoGenerico)throws Exception
	{
		try
		{
			TipoProducto  tipoproductoAux=new TipoProducto();

			if(jComboBoxid_tipo_productoModeloProductoGenerico==null) {
				tipoproductoAux=(TipoProducto)this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_tipo_productoModeloProducto.getSelectedItem();
			} else {
				tipoproductoAux=(TipoProducto)jComboBoxid_tipo_productoModeloProductoGenerico.getSelectedItem();
			}

			if(tipoproductoAux!=null && tipoproductoAux.getId()!=null) {
				modeloproducto.setid_tipo_producto(tipoproductoAux.getId());
				modeloproducto.settipoproducto_descripcion(ModeloProductoConstantesFunciones.getTipoProductoDescripcion(tipoproductoAux));
				modeloproducto.setTipoProducto(tipoproductoAux);			}
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

					if(!ModeloProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormModeloProducto!=null) { 
							this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_empresaModeloProducto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_empresaModeloProducto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormModeloProducto!=null) { 
					}

					if(!ModeloProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ModeloProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormModeloProducto!=null) { 
							this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_tipo_productoModeloProducto.removeAllItems();

							for(TipoProducto tipoproducto:this.tipoproductosForeignKey) {
								this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_tipo_productoModeloProducto.addItem(tipoproducto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormModeloProducto!=null) { 
					}

					if(!ModeloProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ModeloProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_productoFK_IdTipoProductoModeloProducto.removeAllItems();

							for(TipoProducto tipoproducto:this.tipoproductosForeignKey) {
								this.jComboBoxid_tipo_productoFK_IdTipoProductoModeloProducto.addItem(tipoproducto);
							}
						}

						if(!ModeloProductoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormModeloProducto!=null) {
							this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_empresaModeloProducto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormModeloProducto!=null) {
							this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_empresaModeloProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormModeloProducto!=null) {
							this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_tipo_productoModeloProducto.setSelectedItem(tipoproducto);
						}
					} else {
						if(this.jInternalFrameDetalleFormModeloProducto!=null) {
							this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_tipo_productoModeloProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_productoFK_IdTipoProductoModeloProducto.setSelectedItem(tipoproducto);
						} else {
							this.jComboBoxid_tipo_productoFK_IdTipoProductoModeloProducto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesModeloProducto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ModeloProductoConstantesFunciones.refrescarForeignKeysDescripcionesModeloProducto(this.modeloproductoLogic.getModeloProductos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ModeloProductoConstantesFunciones.refrescarForeignKeysDescripcionesModeloProducto(this.modeloproductos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(TipoProducto.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//modeloproductoLogic.setModeloProductos(this.modeloproductos);
			modeloproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ModeloProductoParameterReturnGeneral getModeloProductoParameterGeneral() {
		return this.modeloproductoParameterGeneral;
	}
	
	public void setModeloProductoParameterGeneral(ModeloProductoParameterReturnGeneral modeloproductoParameterGeneral) {
		this.modeloproductoParameterGeneral = modeloproductoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoModeloProducto() {
		return isPermisoTodoModeloProducto;
	}

	public void setIsPermisoTodoModeloProducto(Boolean isPermisoTodoModeloProducto) {
		this.isPermisoTodoModeloProducto = isPermisoTodoModeloProducto;
	}

	public Boolean getIsPermisoNuevoModeloProducto() {
		return isPermisoNuevoModeloProducto;
	}

	public void setIsPermisoNuevoModeloProducto(Boolean isPermisoNuevoModeloProducto) {
		this.isPermisoNuevoModeloProducto = isPermisoNuevoModeloProducto;
	}

	public Boolean getIsPermisoActualizarModeloProducto() {
		return isPermisoActualizarModeloProducto;
	}

	public void setIsPermisoActualizarModeloProducto(Boolean isPermisoActualizarModeloProducto) {
		this.isPermisoActualizarModeloProducto = isPermisoActualizarModeloProducto;
	}

	public Boolean getIsPermisoEliminarModeloProducto() {
		return isPermisoEliminarModeloProducto;
	}

	public void setIsPermisoEliminarModeloProducto(Boolean isPermisoEliminarModeloProducto) {
		this.isPermisoEliminarModeloProducto = isPermisoEliminarModeloProducto;
	}

	public Boolean getIsPermisoGuardarCambiosModeloProducto() {
		return isPermisoGuardarCambiosModeloProducto;
	}

	public void setIsPermisoGuardarCambiosModeloProducto(Boolean isPermisoGuardarCambiosModeloProducto) {
		this.isPermisoGuardarCambiosModeloProducto = isPermisoGuardarCambiosModeloProducto;
	}
	
	public Boolean getIsPermisoConsultaModeloProducto() {
		return isPermisoConsultaModeloProducto;
	}

	public void setIsPermisoConsultaModeloProducto(Boolean isPermisoConsultaModeloProducto) {
		this.isPermisoConsultaModeloProducto = isPermisoConsultaModeloProducto;
	}

	public Boolean getIsPermisoBusquedaModeloProducto() {
		return isPermisoBusquedaModeloProducto;
	}

	public void setIsPermisoBusquedaModeloProducto(Boolean isPermisoBusquedaModeloProducto) {
		this.isPermisoBusquedaModeloProducto = isPermisoBusquedaModeloProducto;
	}

	public Boolean getIsPermisoReporteModeloProducto() {
		return isPermisoReporteModeloProducto;
	}

	public void setIsPermisoReporteModeloProducto(Boolean isPermisoReporteModeloProducto) {
		this.isPermisoReporteModeloProducto = isPermisoReporteModeloProducto;
	}
	
	public Boolean getIsPermisoPaginacionMedioModeloProducto() {
		return isPermisoPaginacionMedioModeloProducto;
	}

	public void setIsPermisoPaginacionMedioModeloProducto(Boolean isPermisoPaginacionMedioModeloProducto) {
		this.isPermisoPaginacionMedioModeloProducto = isPermisoPaginacionMedioModeloProducto;
	}
	
	public Boolean getIsPermisoPaginacionTodoModeloProducto() {
		return isPermisoPaginacionTodoModeloProducto;
	}

	public void setIsPermisoPaginacionTodoModeloProducto(Boolean isPermisoPaginacionTodoModeloProducto) {
		this.isPermisoPaginacionTodoModeloProducto = isPermisoPaginacionTodoModeloProducto;
	}
	
	public Boolean getIsPermisoPaginacionAltoModeloProducto() {
		return isPermisoPaginacionAltoModeloProducto;
	}

	public void setIsPermisoPaginacionAltoModeloProducto(Boolean isPermisoPaginacionAltoModeloProducto) {
		this.isPermisoPaginacionAltoModeloProducto = isPermisoPaginacionAltoModeloProducto;
	}
	
	public Boolean getIsPermisoCopiarModeloProducto() {
		return isPermisoCopiarModeloProducto;
	}

	public void setIsPermisoCopiarModeloProducto(Boolean isPermisoCopiarModeloProducto) {
		this.isPermisoCopiarModeloProducto = isPermisoCopiarModeloProducto;
	}
	
	public Boolean getIsPermisoVerFormModeloProducto() {
		return isPermisoVerFormModeloProducto;
	}

	public void setIsPermisoVerFormModeloProducto(Boolean isPermisoVerFormModeloProducto) {
		this.isPermisoVerFormModeloProducto = isPermisoVerFormModeloProducto;
	}
	
	public Boolean getIsPermisoDuplicarModeloProducto() {
		return isPermisoDuplicarModeloProducto;
	}

	public void setIsPermisoDuplicarModeloProducto(Boolean isPermisoDuplicarModeloProducto) {
		this.isPermisoDuplicarModeloProducto = isPermisoDuplicarModeloProducto;
	}
	
	public Boolean getIsPermisoOrdenModeloProducto() {
		return isPermisoOrdenModeloProducto;
	}

	public void setIsPermisoOrdenModeloProducto(Boolean isPermisoOrdenModeloProducto) {
		this.isPermisoOrdenModeloProducto = isPermisoOrdenModeloProducto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoModeloProducto() {
		return isVisibilidadCeldaNuevoModeloProducto;
	}

	public void setIsVisibilidadCeldaNuevoModeloProducto(Boolean isVisibilidadCeldaNuevoModeloProducto) {
		this.isVisibilidadCeldaNuevoModeloProducto = isVisibilidadCeldaNuevoModeloProducto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarModeloProducto() {
		return isVisibilidadCeldaDuplicarModeloProducto;
	}

	public void setIsVisibilidadCeldaDuplicarModeloProducto(Boolean isVisibilidadCeldaDuplicarModeloProducto) {
		this.isVisibilidadCeldaDuplicarModeloProducto = isVisibilidadCeldaDuplicarModeloProducto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarModeloProducto() {
		return isVisibilidadCeldaCopiarModeloProducto;
	}

	public void setIsVisibilidadCeldaCopiarModeloProducto(Boolean isVisibilidadCeldaCopiarModeloProducto) {
		this.isVisibilidadCeldaCopiarModeloProducto = isVisibilidadCeldaCopiarModeloProducto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormModeloProducto() {
		return isVisibilidadCeldaVerFormModeloProducto;
	}

	public void setIsVisibilidadCeldaVerFormModeloProducto(Boolean isVisibilidadCeldaVerFormModeloProducto) {
		this.isVisibilidadCeldaVerFormModeloProducto = isVisibilidadCeldaVerFormModeloProducto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenModeloProducto() {
		return isVisibilidadCeldaOrdenModeloProducto;
	}

	public void setIsVisibilidadCeldaOrdenModeloProducto(Boolean isVisibilidadCeldaOrdenModeloProducto) {
		this.isVisibilidadCeldaOrdenModeloProducto = isVisibilidadCeldaOrdenModeloProducto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesModeloProducto() {
		return isVisibilidadCeldaNuevoRelacionesModeloProducto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesModeloProducto(Boolean isVisibilidadCeldaNuevoRelacionesModeloProducto) {
		this.isVisibilidadCeldaNuevoRelacionesModeloProducto = isVisibilidadCeldaNuevoRelacionesModeloProducto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarModeloProducto() {
		return isVisibilidadCeldaModificarModeloProducto;
	}

	public void setIsVisibilidadCeldaModificarModeloProducto(Boolean isVisibilidadCeldaModificarModeloProducto) {
		this.isVisibilidadCeldaModificarModeloProducto = isVisibilidadCeldaModificarModeloProducto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarModeloProducto() {
		return isVisibilidadCeldaActualizarModeloProducto;
	}

	public void setIsVisibilidadCeldaActualizarModeloProducto(Boolean isVisibilidadCeldaActualizarModeloProducto) {
		this.isVisibilidadCeldaActualizarModeloProducto = isVisibilidadCeldaActualizarModeloProducto;
	}

	public Boolean getIsVisibilidadCeldaEliminarModeloProducto() {
		return isVisibilidadCeldaEliminarModeloProducto;
	}

	public void setIsVisibilidadCeldaEliminarModeloProducto(Boolean isVisibilidadCeldaEliminarModeloProducto) {
		this.isVisibilidadCeldaEliminarModeloProducto = isVisibilidadCeldaEliminarModeloProducto;
	}

	public Boolean getIsVisibilidadCeldaCancelarModeloProducto() {
		return isVisibilidadCeldaCancelarModeloProducto;
	}

	public void setIsVisibilidadCeldaCancelarModeloProducto(Boolean isVisibilidadCeldaCancelarModeloProducto) {
		this.isVisibilidadCeldaCancelarModeloProducto = isVisibilidadCeldaCancelarModeloProducto;
	}

	public Boolean getIsVisibilidadCeldaGuardarModeloProducto() {
		return isVisibilidadCeldaGuardarModeloProducto;
	}

	public void setIsVisibilidadCeldaGuardarModeloProducto(Boolean isVisibilidadCeldaGuardarModeloProducto) {
		this.isVisibilidadCeldaGuardarModeloProducto = isVisibilidadCeldaGuardarModeloProducto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosModeloProducto() {
		return isVisibilidadCeldaGuardarCambiosModeloProducto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosModeloProducto(Boolean isVisibilidadCeldaGuardarCambiosModeloProducto) {
		this.isVisibilidadCeldaGuardarCambiosModeloProducto = isVisibilidadCeldaGuardarCambiosModeloProducto;
	}
		
	public ModeloProductoSessionBean getmodeloproductoSessionBean() {
		return this.modeloproductoSessionBean;
	}
	
	public void setmodeloproductoSessionBean(ModeloProductoSessionBean modeloproductoSessionBean) {
		this.modeloproductoSessionBean=modeloproductoSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysModeloProducto(ModeloProducto modeloproducto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(modeloproducto,null);
				this.setActualParaGuardarTipoProductoForeignKey(modeloproducto,null);
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
	
	public void bugActualizarReferenciaActual(ModeloProducto modeloproducto,ModeloProducto modeloproductoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalModeloProducto(modeloproducto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		modeloproductoAux.setId(modeloproducto.getId());
		modeloproductoAux.setVersionRow(modeloproducto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessModeloProducto();
		
			int intSelectedRow = this.jTableDatosModeloProducto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproducto =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.modeloproducto =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ModeloProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualModeloProducto(this.modeloproducto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysModeloProducto(this.modeloproducto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = modeloproductoValidator.getInvalidValues(this.modeloproducto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			modeloproductoLogic.setDatosCliente(datosCliente);
			modeloproductoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				modeloproductoAux=new  ModeloProducto();
				
				modeloproductoAux.setIsNew(true);
				modeloproductoAux.setIsChanged(true);
				
				modeloproductoAux.setModeloProductoOriginal(this.modeloproducto);
				
				modeloproductoAux.setId(this.modeloproducto.getId());	
				modeloproductoAux.setVersionRow(this.modeloproducto.getVersionRow());	
				modeloproductoAux.setid_empresa(this.modeloproducto.getid_empresa());	
				modeloproductoAux.setid_tipo_producto(this.modeloproducto.getid_tipo_producto());	
				modeloproductoAux.setcodigo(this.modeloproducto.getcodigo());	
				modeloproductoAux.setnombre(this.modeloproducto.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.modeloproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.modeloproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(modeloproductoAux,modeloproductoLogic.getModeloProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(modeloproductoAux,modeloproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.modeloproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.modeloproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						modeloproductoLogic.saveModeloProductos();//WithConnection
						//modeloproductoLogic.getSetVersionRowModeloProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.modeloproducto,modeloproductoAux);
					
					this.refrescarForeignKeysDescripcionesModeloProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.modeloproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								modeloproductoLogic.saveModeloProductoRelaciones(modeloproductoAux,this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//modeloproductoLogic.getSetVersionRowModeloProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.modeloproducto,modeloproductoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							modeloproductoAux.setProductos(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							modeloproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.modeloproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.modeloproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(modeloproductoAux,modeloproductoLogic.getModeloProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(modeloproductoAux,modeloproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.modeloproducto,modeloproductoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				modeloproductoAux=new  ModeloProducto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.modeloproductoSessionBean.getEsGuardarRelacionado() 
					|| (this.modeloproductoSessionBean.getEsGuardarRelacionado() && this.modeloproducto.getId()>=0)) {
						
					modeloproductoAux.setIsNew(false);
				}
				
				modeloproductoAux.setIsDeleted(false);
			
				modeloproductoAux.setId(this.modeloproducto.getId());	
				modeloproductoAux.setVersionRow(this.modeloproducto.getVersionRow());	
				modeloproductoAux.setid_empresa(this.modeloproducto.getid_empresa());	
				modeloproductoAux.setid_tipo_producto(this.modeloproducto.getid_tipo_producto());	
				modeloproductoAux.setcodigo(this.modeloproducto.getcodigo());	
				modeloproductoAux.setnombre(this.modeloproducto.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(modeloproductoAux,modeloproductoLogic.getModeloProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(modeloproductoAux,modeloproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.modeloproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.modeloproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						modeloproductoLogic.saveModeloProductos();//WithConnection
						//modeloproductoLogic.getSetVersionRowModeloProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.modeloproducto,modeloproductoAux);
					
					this.refrescarForeignKeysDescripcionesModeloProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.modeloproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								modeloproductoLogic.saveModeloProductoRelaciones(modeloproductoAux,this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//modeloproductoLogic.getSetVersionRowModeloProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.modeloproducto,modeloproductoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							modeloproductoAux.setProductos(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							modeloproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.modeloproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.modeloproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(modeloproductoAux,modeloproductoLogic.getModeloProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(modeloproductoAux,modeloproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.modeloproducto,modeloproductoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				modeloproductoAux=new  ModeloProducto();
				
				modeloproductoAux.setIsNew(false);
				modeloproductoAux.setIsChanged(false);
				
				modeloproductoAux.setIsDeleted(true);
				
				modeloproductoAux.setId(this.modeloproducto.getId());	
				modeloproductoAux.setVersionRow(this.modeloproducto.getVersionRow());	
				modeloproductoAux.setid_empresa(this.modeloproducto.getid_empresa());	
				modeloproductoAux.setid_tipo_producto(this.modeloproducto.getid_tipo_producto());	
				modeloproductoAux.setcodigo(this.modeloproducto.getcodigo());	
				modeloproductoAux.setnombre(this.modeloproducto.getnombre());	
				
				if(this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.modeloproductoAux.getId()>=0) {	
						this.modeloproductosEliminados.add(modeloproductoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(modeloproductoAux,modeloproductoLogic.getModeloProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(modeloproductoAux,modeloproductos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.modeloproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.modeloproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						modeloproductoLogic.saveModeloProductos();//WithConnection
						//modeloproductoLogic.getSetVersionRowModeloProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.modeloproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								modeloproductoLogic.saveModeloProductoRelaciones(modeloproductoAux,this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//modeloproductoLogic.getSetVersionRowModeloProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							modeloproductoAux.setProductos(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							modeloproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.modeloproductoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.modeloproductoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(modeloproductoAux,modeloproductoLogic.getModeloProductos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(modeloproductoAux,modeloproductos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.getModeloProductos().addAll(this.modeloproductosEliminados);
					
					modeloproductoLogic.saveModeloProductos();//WithConnection
					//modeloproductoLogic.getSetVersionRowModeloProductos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesModeloProducto();
				
				this.modeloproductosEliminados= new ArrayList<ModeloProducto>();		
			}
			
			if(this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.modeloproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Modelo Producto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Modelo Producto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.modeloproducto=modeloproductoAux;
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
      		//this.finishProcessModeloProducto();
      	}
		
	}	
	
	public void actualizarRelaciones(ModeloProducto modeloproductoLocal) throws Exception {
		
		if(this.modeloproductoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				modeloproductoLocal.setProductos(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());
				modeloproductoLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
			
			} else {
			
				modeloproductoLocal.setProductos(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productos);
				modeloproductoLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ModeloProducto modeloproductoLocal) throws Exception {	
		if(this.modeloproductoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				modeloproductoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoProductoDetalleFormJInternalFrame.class)) {
				TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrameLocal=(TipoProductoBeanSwingJInternalFrame) ((TipoProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoproductoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoProducto(tipoproductoBeanSwingJInternalFrameLocal.gettipoproducto(),true);
				tipoproductoBeanSwingJInternalFrameLocal.actualizarLista(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto,this.tipoproductosForeignKey);

				tipoproductoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto);

				modeloproductoLocal.setTipoProducto(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto);

				this.addItemDefectoCombosForeignKeyTipoProducto();
				this.cargarCombosFrameTipoProductosForeignKey("Formulario");
				this.setActualTipoProductoForeignKey(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarModeloProductoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosModeloProducto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.modeloproducto =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.modeloproducto =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = modeloproductoValidator.getInvalidValues(this.modeloproducto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ModeloProducto modeloproducto,List<ModeloProducto> modeloproductos) throws Exception {
		try	{		
			ModeloProductoConstantesFunciones.actualizarLista(modeloproducto,modeloproductos,this.modeloproductoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ModeloProducto modeloproducto,List<ModeloProducto> modeloproductos) throws Exception {
		try	{			
			ModeloProductoConstantesFunciones.actualizarSelectedLista(modeloproducto,modeloproductos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ModeloProducto> modeloproductosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				modeloproductosLocal=this.modeloproductoLogic.getModeloProductos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				modeloproductosLocal=this.modeloproductos;
			}
			//ARCHITECTURE
		
			for(ModeloProducto modeloproductoLocal:modeloproductosLocal) {
				if(this.permiteMantenimiento(modeloproductoLocal) && modeloproductoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ModeloProductoConstantesFunciones.getModeloProductoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ModeloProductoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModeloProducto.jLabelid_empresaModeloProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ModeloProductoConstantesFunciones.IDTIPOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModeloProducto.jLabelid_tipo_productoModeloProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ModeloProductoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModeloProducto.jLabelcodigoModeloProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ModeloProductoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModeloProducto.jLabelnombreModeloProducto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormModeloProducto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormModeloProducto.jLabelid_empresaModeloProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormModeloProducto.jLabelid_tipo_productoModeloProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormModeloProducto.jLabelcodigoModeloProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormModeloProducto.jLabelnombreModeloProducto,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Producto")) {
			if(this.modeloproducto==null) {
				this.modeloproducto= new ModeloProducto();
			}

			if(this.modeloproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoModeloProducto
				this.setVariablesFormularioToObjetoActualModeloProducto(this.modeloproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysModeloProducto(this.modeloproducto);

				this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.getproducto().setModeloProducto(this.modeloproducto);
			}

			return;
		}
		 else  if(sTipo.equals("ParametroInventarioDefecto")) {
			if(this.modeloproducto==null) {
				this.modeloproducto= new ModeloProducto();
			}

			if(this.modeloproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoModeloProducto
				this.setVariablesFormularioToObjetoActualModeloProducto(this.modeloproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysModeloProducto(this.modeloproducto);

				this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.getparametroinventariodefecto().setModeloProducto(this.modeloproducto);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoModeloProducto--;	
		
		
		this.modeloproductoAux=new ModeloProducto();
		
		this.modeloproductoAux.setId(this.iIdNuevoModeloProducto);
		this.modeloproductoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.modeloproductoLogic.getModeloProductos().add(this.modeloproductoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.modeloproductos.add(this.modeloproductoAux);
		}
		//ARCHITECTURE
		
		this.modeloproducto=this.modeloproductoAux;
		
		if(ModeloProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioModeloProducto(this.modeloproducto);
			this.setVariablesObjetoActualToFormularioForeignKeyModeloProducto(this.modeloproducto);
		}
				
		//this.setDefaultControlesModeloProducto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyModeloProducto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyModeloProducto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyModeloProducto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualModeloProducto(this.modeloproductoBean,this.modeloproducto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysModeloProducto(this.modeloproducto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ModeloProductoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.modeloproductoSessionBean.getConGuardarRelaciones()) {
			classes=ModeloProductoConstantesFunciones.getClassesRelationshipsOfModeloProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.modeloproductoReturnGeneral=modeloproductoLogic.procesarEventosModeloProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.modeloproductoLogic.getModeloProductos(),this.modeloproducto,this.modeloproductoParameterGeneral,this.isEsNuevoModeloProducto,classes);//this.modeloproductoLogic.getModeloProducto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanModeloProducto(this.modeloproductoReturnGeneral,this.modeloproductoBean,false);
		
		if(this.modeloproductoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyModeloProducto(this.modeloproductoReturnGeneral.getModeloProducto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioModeloProducto(this.modeloproductoReturnGeneral.getModeloProducto());
		}
		
		if(this.modeloproductoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioModeloProducto(this.modeloproductoReturnGeneral.getModeloProducto(),classes);//this.modeloproductoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualModeloProducto(this.modeloproducto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyModeloProducto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyModeloProducto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ModeloProductoBeanSwingJInternalFrameAdditional.RecargarFormModeloProducto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingModeloProducto(false);
						
			if(modeloproductoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado() && ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(ModeloProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualModeloProducto();
			}
			
			this.actualizarVisualTableDatosModeloProducto();
			
			this.jTableDatosModeloProducto.setRowSelectionInterval(this.getIndiceNuevoModeloProducto(), this.getIndiceNuevoModeloProducto());
			
			this.seleccionarFilaTablaModeloProductoActual();
						
			this.actualizarEstadoCeldasBotonesModeloProducto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesModeloProducto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormModeloProducto.jTextFieldcodigoModeloProducto.setEnabled(isHabilitar && this.modeloproductoConstantesFunciones.activarcodigoModeloProducto);
		this.jInternalFrameDetalleFormModeloProducto.jTextAreanombreModeloProducto.setEnabled(isHabilitar && this.modeloproductoConstantesFunciones.activarnombreModeloProducto);	
		//
		this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_empresaModeloProducto.setEnabled(isHabilitar && this.modeloproductoConstantesFunciones.activarid_empresaModeloProducto);
		this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_tipo_productoModeloProducto.setEnabled(isHabilitar && this.modeloproductoConstantesFunciones.activarid_tipo_productoModeloProducto);
	};
	
	public void setDefaultControlesModeloProducto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoModeloProducto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.modeloproductoSessionBean.setConGuardarRelaciones(true);			
			this.modeloproductoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormModeloProducto.jTabbedPaneRelacionesModeloProducto.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.modeloproductoSessionBean.setConGuardarRelaciones(false);			
			this.modeloproductoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormModeloProducto.jTabbedPaneRelacionesModeloProducto.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoModeloProducto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ModeloProducto modeloproductoAux:this.modeloproductoLogic.getModeloProductos()) {
				if(modeloproductoAux.getId().equals(this.iIdNuevoModeloProducto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ModeloProducto modeloproductoAux:this.modeloproductos) {
				if(modeloproductoAux.getId().equals(this.iIdNuevoModeloProducto)) {
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
	
	public int getIndiceActualModeloProducto(ModeloProducto modeloproducto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ModeloProducto modeloproductoAux:this.modeloproductoLogic.getModeloProductos()) {
				if(modeloproductoAux.getId().equals(modeloproducto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ModeloProducto modeloproductoAux:this.modeloproductos) {
				if(modeloproductoAux.getId().equals(modeloproducto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalModeloProducto(ModeloProducto modeloproductoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ModeloProducto modeloproductoAux:this.modeloproductoLogic.getModeloProductos()) {
				if(modeloproductoAux.getModeloProductoOriginal().getId().equals(modeloproductoOriginal.getId())) {
					existe=true;
					modeloproductoOriginal.setId(modeloproductoAux.getId());
					modeloproductoOriginal.setVersionRow(modeloproductoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ModeloProducto modeloproductoAux:this.modeloproductos) {
				if(modeloproductoAux.getModeloProductoOriginal().getId().equals(modeloproductoOriginal.getId())) {
					existe=true;
					modeloproductoOriginal.setId(modeloproductoAux.getId());
					modeloproductoOriginal.setVersionRow(modeloproductoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosModeloProducto(Boolean esParaCancelar) throws Exception {
		modeloproductosAux=new ArrayList<ModeloProducto>();
		modeloproductoAux=new ModeloProducto();
		
		if(!this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ModeloProducto modeloproductoAux:this.modeloproductoLogic.getModeloProductos()) {
					if(modeloproductoAux.getId()<0) {
						modeloproductosAux.add(modeloproductoAux);
					}		
				}
				this.iIdNuevoModeloProducto=0L;
				this.modeloproductoLogic.getModeloProductos().removeAll(modeloproductosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ModeloProducto modeloproductoAux:this.modeloproductos) {
					if(modeloproductoAux.getId()<0) {
						modeloproductosAux.add(modeloproductoAux);
					}		
				}
				this.iIdNuevoModeloProducto=0L;
				this.modeloproductos.removeAll(modeloproductosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoModeloProducto 
					&& this.modeloproductoLogic.getModeloProductos().size()>0
					) {
					modeloproductoAux=this.modeloproductoLogic.getModeloProductos().get(this.modeloproductoLogic.getModeloProductos().size() - 1);
				
					if(modeloproductoAux.getId()<0) {
						this.modeloproductoLogic.getModeloProductos().remove(modeloproductoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoModeloProducto && this.modeloproductos.size()>0) {
					modeloproductoAux=this.modeloproductos.get(this.modeloproductos.size() - 1);
				
					if(modeloproductoAux.getId()<0) {
						this.modeloproductos.remove(modeloproductoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoModeloProducto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(modeloproducto.getId()<0) {
				this.modeloproductoLogic.getModeloProductos().remove(this.modeloproducto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(modeloproducto.getId()<0) {
				this.modeloproductos.remove(this.modeloproducto);
			}
		}			
	}
	
	public void setEstadosInicialesModeloProducto(List<ModeloProducto> modeloproductosAux) throws Exception {
		ModeloProductoConstantesFunciones.setEstadosInicialesModeloProducto(modeloproductosAux);
	}
	
	public void setEstadosInicialesModeloProducto(ModeloProducto modeloproductoAux) throws Exception {
		ModeloProductoConstantesFunciones.setEstadosInicialesModeloProducto(modeloproductoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarModeloProductoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesModeloProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarModeloProductoActual()) {
				if(!this.isEsNuevoModeloProducto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesModeloProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoModeloProducto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarModeloProductoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Modelo Producto ?", "MANTENIMIENTO DE Modelo Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesModeloProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ModeloProducto modeloproducto) throws Exception {
		ModeloProductoConstantesFunciones.seleccionarAsignar(this.modeloproducto,modeloproducto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarModeloProducto=this.isPermisoActualizarOriginalModeloProducto;
			
			
			this.seleccionarAsignar(modeloproducto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ModeloProductoConstantesFunciones.quitarEspaciosModeloProducto(this.modeloproducto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesModeloProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.modeloproductoSessionBean.setsFuncionBusquedaRapida(this.modeloproductoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoModeloProducto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosModeloProducto(esParaCancelar);				
				this.cancelarNuevoModeloProducto(esParaCancelar);								
			}
			
			this.modeloproducto=new ModeloProducto();
			
			this.inicializarModeloProducto();
			
			this.actualizarEstadoCeldasBotonesModeloProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarModeloProducto() throws Exception {
		try {
			ModeloProductoConstantesFunciones.inicializarModeloProducto(this.modeloproducto);
			
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
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.modeloproductoLogic.getModeloProductos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteModeloProductos(String sAccionBusqueda,List<ModeloProducto> modeloproductosParaReportes) throws Exception {
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
					sPathReporteFinal="ModeloProducto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ModeloProductoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ModeloProductoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ModeloProducto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Modelo Productos");		
		parameters.put("busquedapor", ModeloProductoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
					
					ModeloProductoLogic modeloproductoLogicAuxiliar=new ModeloProductoLogic();
					modeloproductoLogicAuxiliar.setDatosCliente(modeloproductoLogic.getDatosCliente());				
					modeloproductoLogicAuxiliar.setModeloProductos(modeloproductosParaReportes);
					
					modeloproductoLogicAuxiliar.cargarRelacionesLoteForeignKeyModeloProductoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					modeloproductosParaReportes=modeloproductoLogicAuxiliar.getModeloProductos();
					
					//modeloproductoLogic.getNewConnexionToDeep();
					
					//for (ModeloProducto modeloproducto:modeloproductosParaReportes) {
					//	modeloproductoLogic.deepLoad(modeloproducto, false, DeepLoadType.INCLUDE, classes);
					//}						
					//modeloproductoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//modeloproductoLogic.closeNewConnexionToDeep();
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceModeloProducto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ModeloProductoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ModeloProductoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceModeloProducto=new JRBeanArrayDataSource(ModeloProductoJInternalFrame.TraerModeloProductoBeans(modeloproductosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceModeloProducto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ModeloProductoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ModeloProductoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ModeloProductoBean.TraerModeloProductoBeans(modeloproductosParaReportes).toArray()));
							
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
				this.generarExcelReporteModeloProductos(sAccionBusqueda,sTipoArchivoReporte,modeloproductosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalModeloProductos(sAccionBusqueda,sTipoArchivoReporte,modeloproductosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoModeloProductoActionPerformed(null);
					//this.generarExcelReporteModeloProductos(sAccionBusqueda,sTipoArchivoReporte,modeloproductosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalModeloProductos(sAccionBusqueda,sTipoArchivoReporte,modeloproductosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesModeloProductos(sAccionBusqueda,sTipoArchivoReporte,modeloproductosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesModeloProductos(sAccionBusqueda,sTipoArchivoReporte,modeloproductosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteModeloProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<ModeloProducto> modeloproductosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"modeloproducto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ModeloProductos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderModeloProducto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ModeloProducto modeloproducto : modeloproductosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ModeloProductoConstantesFunciones.generarExcelReporteDataModeloProducto("NORMAL",row,workbook,modeloproducto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.modeloproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modelo Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderModeloProducto(String sTipo,Row row,Workbook workbook) {
		
		ModeloProductoConstantesFunciones.generarExcelReporteHeaderModeloProducto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalModeloProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<ModeloProducto> modeloproductosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"modeloproducto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ModeloProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ModeloProducto modeloproducto : modeloproductosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ModeloProductoConstantesFunciones.getModeloProductoDescripcion(modeloproducto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ModeloProductoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ModeloProductoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(modeloproducto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ModeloProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ModeloProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(modeloproducto.gettipoproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ModeloProductoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ModeloProductoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(modeloproducto.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ModeloProductoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ModeloProductoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(modeloproducto.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.modeloproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modelo Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesModeloProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<ModeloProducto> modeloproductosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ModeloProducto> modeloproductosRespaldo=null;
		
		classes=ModeloProductoConstantesFunciones.getClassesRelationshipsOfModeloProducto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.modeloproductoLogic.setDatosCliente(this.datosCliente);
		this.modeloproductoLogic.setDatosDeep(this.datosDeep);
		this.modeloproductoLogic.setIsConDeep(true);
		
		modeloproductosRespaldo=this.modeloproductoLogic.getModeloProductos();
		
		this.modeloproductoLogic.setModeloProductos(modeloproductosParaReportes);	
		this.modeloproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		modeloproductosParaReportes=this.modeloproductoLogic.getModeloProductos();
		this.modeloproductoLogic.setModeloProductos(modeloproductosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"modeloproducto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ModeloProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderModeloProducto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ModeloProducto modeloproducto : modeloproductosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderModeloProducto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ModeloProductoConstantesFunciones.generarExcelReporteDataModeloProducto("NORMAL",row,workbook,modeloproducto,cellStyleDataAux);
		
			
			


				//Producto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoConstantesFunciones.SCLASSWEBTITULO))) {

				if(modeloproducto.getProductos()!=null && modeloproducto.getProductos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoConstantesFunciones.generarExcelReporteHeaderProducto("RELACIONADO",row,workbook);
				}

				if(modeloproducto.getProductos()!=null) {
					i2=0;
					for(Producto producto : modeloproducto.getProductos()) {
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

				if(modeloproducto.getParametroInventarioDefectos()!=null && modeloproducto.getParametroInventarioDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroInventarioDefectoConstantesFunciones.generarExcelReporteHeaderParametroInventarioDefecto("RELACIONADO",row,workbook);
				}

				if(modeloproducto.getParametroInventarioDefectos()!=null) {
					i2=0;
					for(ParametroInventarioDefecto parametroinventariodefecto : modeloproducto.getParametroInventarioDefectos()) {
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
		cell.setCellValue(ModeloProductoConstantesFunciones.getModeloProductoDescripcion(modeloproducto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.modeloproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modelo Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoModeloProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoModeloProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoModeloProducto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoModeloProducto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessModeloProducto() throws Exception {		
		this.startProcessModeloProducto(true);
	}
	
	public void startProcessModeloProducto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasModeloProducto ,this.jPanelParametrosReportesModeloProducto, this.jScrollPanelDatosModeloProducto,this.jPanelPaginacionModeloProducto, this.jScrollPanelDatosEdicionModeloProducto, this.jPanelAccionesModeloProducto,this.jPanelAccionesFormularioModeloProducto,this.jmenuBarModeloProducto,this.jmenuBarDetalleModeloProducto,this.jTtoolBarModeloProducto,this.jTtoolBarDetalleModeloProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasModeloProducto=this.jTabbedPaneBusquedasModeloProducto; 
		
		final JPanel jPanelParametrosReportesModeloProducto=this.jPanelParametrosReportesModeloProducto;
		//final JScrollPane jScrollPanelDatosModeloProducto=this.jScrollPanelDatosModeloProducto;
		final JTable jTableDatosModeloProducto=this.jTableDatosModeloProducto;		
		final JPanel jPanelPaginacionModeloProducto=this.jPanelPaginacionModeloProducto;
		//final JScrollPane jScrollPanelDatosEdicionModeloProducto=this.jScrollPanelDatosEdicionModeloProducto;
		final JPanel jPanelAccionesModeloProducto=this.jPanelAccionesModeloProducto;
		
		JPanel jPanelCamposAuxiliarModeloProducto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarModeloProducto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormModeloProducto!=null) {
			jPanelCamposAuxiliarModeloProducto=this.jInternalFrameDetalleFormModeloProducto.jPanelCamposModeloProducto;
			jPanelAccionesFormularioAuxiliarModeloProducto=this.jInternalFrameDetalleFormModeloProducto.jPanelAccionesFormularioModeloProducto;
		}
		
		final JPanel jPanelCamposModeloProducto=jPanelCamposAuxiliarModeloProducto;
		final JPanel jPanelAccionesFormularioModeloProducto=jPanelAccionesFormularioAuxiliarModeloProducto;
		
		
		final JMenuBar jmenuBarModeloProducto=this.jmenuBarModeloProducto;
		final JToolBar jTtoolBarModeloProducto=this.jTtoolBarModeloProducto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarModeloProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarModeloProducto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormModeloProducto!=null) {
			jmenuBarDetalleAuxiliarModeloProducto=this.jInternalFrameDetalleFormModeloProducto.jmenuBarDetalleModeloProducto;
			jTtoolBarDetalleAuxiliarModeloProducto=this.jInternalFrameDetalleFormModeloProducto.jTtoolBarDetalleModeloProducto;
		}
		
		final JMenuBar jmenuBarDetalleModeloProducto=jmenuBarDetalleAuxiliarModeloProducto;
		final JToolBar jTtoolBarDetalleModeloProducto=jTtoolBarDetalleAuxiliarModeloProducto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasModeloProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesModeloProducto;
			processRunnable.jTableDatos=jTableDatosModeloProducto;
			processRunnable.jPanelCampos=jPanelCamposModeloProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionModeloProducto;
			processRunnable.jPanelAcciones=jPanelAccionesModeloProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioModeloProducto;
			
			
			processRunnable.jmenuBar=jmenuBarModeloProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleModeloProducto;
			processRunnable.jTtoolBar=jTtoolBarModeloProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleModeloProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasModeloProducto ,jPanelParametrosReportesModeloProducto,jTableDatosModeloProducto, /*jScrollPanelDatosModeloProducto,*/jPanelCamposModeloProducto,jPanelPaginacionModeloProducto, /*jScrollPanelDatosEdicionModeloProducto,*/ jPanelAccionesModeloProducto,jPanelAccionesFormularioModeloProducto,jmenuBarModeloProducto,jmenuBarDetalleModeloProducto,jTtoolBarModeloProducto,jTtoolBarDetalleModeloProducto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasModeloProducto ,jPanelParametrosReportesModeloProducto, jScrollPanelDatosModeloProducto,jPanelPaginacionModeloProducto, jScrollPanelDatosEdicionModeloProducto, jPanelAccionesModeloProducto,jPanelAccionesFormularioModeloProducto,jmenuBarModeloProducto,jmenuBarDetalleModeloProducto,jTtoolBarModeloProducto,jTtoolBarDetalleModeloProducto);
						
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
	
	public void finishProcessModeloProducto() {// throws Exception 
		this.finishProcessModeloProducto(true);
	}
	
	public void finishProcessModeloProducto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasModeloProducto ,this.jPanelParametrosReportesModeloProducto, this.jScrollPanelDatosModeloProducto,this.jPanelPaginacionModeloProducto, this.jScrollPanelDatosEdicionModeloProducto, this.jPanelAccionesModeloProducto,this.jPanelAccionesFormularioModeloProducto,this.jmenuBarModeloProducto,this.jmenuBarDetalleModeloProducto,this.jTtoolBarModeloProducto,this.jTtoolBarDetalleModeloProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasModeloProducto=this.jTabbedPaneBusquedasModeloProducto; 
		
		final JPanel jPanelParametrosReportesModeloProducto=this.jPanelParametrosReportesModeloProducto;
		//final JScrollPane jScrollPanelDatosModeloProducto=this.jScrollPanelDatosModeloProducto;
		final JTable jTableDatosModeloProducto=this.jTableDatosModeloProducto;		
		final JPanel jPanelPaginacionModeloProducto=this.jPanelPaginacionModeloProducto;
		//final JScrollPane jScrollPanelDatosEdicionModeloProducto=this.jScrollPanelDatosEdicionModeloProducto;
		final JPanel jPanelAccionesModeloProducto=this.jPanelAccionesModeloProducto;
		
		JPanel jPanelCamposAuxiliarModeloProducto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarModeloProducto=new JPanel();
		
		if(this.jInternalFrameDetalleFormModeloProducto!=null) {
			jPanelCamposAuxiliarModeloProducto=this.jInternalFrameDetalleFormModeloProducto.jPanelCamposModeloProducto;
			jPanelAccionesFormularioAuxiliarModeloProducto=this.jInternalFrameDetalleFormModeloProducto.jPanelAccionesFormularioModeloProducto;
		}
		
		final JPanel jPanelCamposModeloProducto=jPanelCamposAuxiliarModeloProducto;
		final JPanel jPanelAccionesFormularioModeloProducto=jPanelAccionesFormularioAuxiliarModeloProducto;
		
		
		final JMenuBar jmenuBarModeloProducto=this.jmenuBarModeloProducto;		
		final JToolBar jTtoolBarModeloProducto=this.jTtoolBarModeloProducto;
				
		JMenuBar jmenuBarDetalleAuxiliarModeloProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarModeloProducto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormModeloProducto!=null) {
			jmenuBarDetalleAuxiliarModeloProducto=this.jInternalFrameDetalleFormModeloProducto.jmenuBarDetalleModeloProducto;
			jTtoolBarDetalleAuxiliarModeloProducto=this.jInternalFrameDetalleFormModeloProducto.jTtoolBarDetalleModeloProducto;		
		}
		
		final JMenuBar jmenuBarDetalleModeloProducto=jmenuBarDetalleAuxiliarModeloProducto;
		final JToolBar jTtoolBarDetalleModeloProducto=jTtoolBarDetalleAuxiliarModeloProducto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasModeloProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesModeloProducto;
			processRunnable.jTableDatos=jTableDatosModeloProducto;
			processRunnable.jPanelCampos=jPanelCamposModeloProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionModeloProducto;
			processRunnable.jPanelAcciones=jPanelAccionesModeloProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioModeloProducto;
			
			
			processRunnable.jmenuBar=jmenuBarModeloProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleModeloProducto;
			processRunnable.jTtoolBar=jTtoolBarModeloProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleModeloProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasModeloProducto ,jPanelParametrosReportesModeloProducto, jTableDatosModeloProducto,/*jScrollPanelDatosModeloProducto,*/jPanelCamposModeloProducto,jPanelPaginacionModeloProducto, /*jScrollPanelDatosEdicionModeloProducto,*/ jPanelAccionesModeloProducto,jPanelAccionesFormularioModeloProducto,jmenuBarModeloProducto,jmenuBarDetalleModeloProducto,jTtoolBarModeloProducto,jTtoolBarDetalleModeloProducto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesModeloProducto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarModeloProducto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuModeloProducto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarModeloProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarModeloProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleModeloProducto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuModeloProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarModeloProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleModeloProducto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.modeloproductoConstantesFunciones.getsFinalQueryModeloProducto();
		String  finalQueryPaginacionTodos=this.modeloproductoConstantesFunciones.getsFinalQueryModeloProducto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ModeloProductoConstantesFunciones.getArrayColumnasGlobalesNoModeloProducto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ModeloProductoConstantesFunciones.getArrayColumnasGlobalesModeloProducto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ModeloProductoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.modeloproductosEliminados= new ArrayList<ModeloProducto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessModeloProducto();
		
				///*ModeloProductoSessionBean*/this.modeloproductoSessionBean=new ModeloProductoSessionBean();
			
			if(this.modeloproductoSessionBean==null) {
				this.modeloproductoSessionBean=new ModeloProductoSessionBean();
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
					this.iNumeroPaginacion=ModeloProductoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ModeloProductoConstantesFunciones.getClassesForeignKeysOfModeloProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/modeloproducto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			modeloproductosAux= new ArrayList<ModeloProducto>();
			
				
			modeloproductoLogic.setDatosCliente(this.datosCliente);
			modeloproductoLogic.setDatosDeep(this.datosDeep);
			modeloproductoLogic.setIsConDeep(true);
			
			
			modeloproductoLogic.getModeloProductoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					modeloproductoLogic.getTodosModeloProductos(finalQueryGlobal,pagination);
					
					//modeloproductoLogic.getTodosModeloProductosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(modeloproductoLogic.getModeloProductos()==null|| modeloproductoLogic.getModeloProductos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							modeloproductosAux= new ArrayList<ModeloProducto>();
							modeloproductosAux.addAll(modeloproductoLogic.getModeloProductos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							modeloproductosAux= new ArrayList<ModeloProducto>();
							modeloproductosAux.addAll(modeloproductos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							modeloproductoLogic.getTodosModeloProductos(finalQueryGlobal+"",this.pagination);												
							
							//modeloproductoLogic.getTodosModeloProductosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteModeloProductos("Todos",modeloproductoLogic.getModeloProductos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							modeloproductoLogic.setModeloProductos(new ArrayList<ModeloProducto>());					
							modeloproductoLogic.getModeloProductos().addAll(modeloproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							modeloproductos=new ArrayList<ModeloProducto>();
							modeloproductos.addAll(modeloproductosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idModeloProducto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idModeloProducto=this.idActual;
				
				} else if(this.idModeloProductoActual!=null && this.idModeloProductoActual!=0L) {
					idModeloProducto=idModeloProductoActual;
				}
				
					
				this.sDetalleReporte=ModeloProductoConstantesFunciones.getDetalleIndicePorId(idModeloProducto);
				
				this.modeloproductos=new ArrayList<ModeloProducto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					modeloproductoLogic.getEntity(idModeloProducto);
					
					//modeloproductoLogic.getEntityWithConnection(idModeloProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					modeloproductoLogic.setModeloProductos(new ArrayList<ModeloProducto>());
					modeloproductoLogic.getModeloProductos().add(modeloproductoLogic.getModeloProducto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.modeloproductos=new ArrayList<ModeloProducto>();
					this.modeloproductos.add(modeloproducto);
				}
				
				if(modeloproductoLogic.getModeloProducto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=ModeloProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					modeloproductoLogic.getModeloProductosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ModeloProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ModeloProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=modeloproductoLogic.getModeloProductos()==null||modeloproductoLogic.getModeloProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=modeloproductos==null|| modeloproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						modeloproductosAux=new ArrayList<ModeloProducto>();
						modeloproductosAux.addAll(modeloproductoLogic.getModeloProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							modeloproductosAux=new ArrayList<ModeloProducto>();
							modeloproductosAux.addAll(modeloproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							modeloproductoLogic.getModeloProductosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ModeloProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ModeloProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteModeloProductos("BusquedaPorCodigo",modeloproductoLogic.getModeloProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteModeloProductos("BusquedaPorCodigo",modeloproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						modeloproductoLogic.setModeloProductos(new ArrayList<ModeloProducto>());
						modeloproductoLogic.getModeloProductos().addAll(modeloproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							modeloproductos=new ArrayList<ModeloProducto>();
							modeloproductos.addAll(modeloproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=ModeloProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					modeloproductoLogic.getModeloProductosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ModeloProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ModeloProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=modeloproductoLogic.getModeloProductos()==null||modeloproductoLogic.getModeloProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=modeloproductos==null|| modeloproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						modeloproductosAux=new ArrayList<ModeloProducto>();
						modeloproductosAux.addAll(modeloproductoLogic.getModeloProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							modeloproductosAux=new ArrayList<ModeloProducto>();
							modeloproductosAux.addAll(modeloproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							modeloproductoLogic.getModeloProductosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ModeloProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ModeloProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteModeloProductos("BusquedaPorNombre",modeloproductoLogic.getModeloProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteModeloProductos("BusquedaPorNombre",modeloproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						modeloproductoLogic.setModeloProductos(new ArrayList<ModeloProducto>());
						modeloproductoLogic.getModeloProductos().addAll(modeloproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							modeloproductos=new ArrayList<ModeloProducto>();
							modeloproductos.addAll(modeloproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ModeloProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					modeloproductoLogic.getModeloProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ModeloProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ModeloProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=modeloproductoLogic.getModeloProductos()==null||modeloproductoLogic.getModeloProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=modeloproductos==null|| modeloproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						modeloproductosAux=new ArrayList<ModeloProducto>();
						modeloproductosAux.addAll(modeloproductoLogic.getModeloProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							modeloproductosAux=new ArrayList<ModeloProducto>();
							modeloproductosAux.addAll(modeloproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							modeloproductoLogic.getModeloProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ModeloProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ModeloProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteModeloProductos("FK_IdEmpresa",modeloproductoLogic.getModeloProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteModeloProductos("FK_IdEmpresa",modeloproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						modeloproductoLogic.setModeloProductos(new ArrayList<ModeloProducto>());
						modeloproductoLogic.getModeloProductos().addAll(modeloproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							modeloproductos=new ArrayList<ModeloProducto>();
							modeloproductos.addAll(modeloproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoProducto")) {
				this.sDetalleReporte=ModeloProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					modeloproductoLogic.getModeloProductosFK_IdTipoProducto(finalQueryGlobal,pagination,id_tipo_productoFK_IdTipoProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ModeloProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ModeloProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=modeloproductoLogic.getModeloProductos()==null||modeloproductoLogic.getModeloProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=modeloproductos==null|| modeloproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						modeloproductosAux=new ArrayList<ModeloProducto>();
						modeloproductosAux.addAll(modeloproductoLogic.getModeloProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							modeloproductosAux=new ArrayList<ModeloProducto>();
							modeloproductosAux.addAll(modeloproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							modeloproductoLogic.getModeloProductosFK_IdTipoProducto(finalQueryGlobal,pagination,id_tipo_productoFK_IdTipoProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ModeloProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ModeloProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteModeloProductos("FK_IdTipoProducto",modeloproductoLogic.getModeloProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteModeloProductos("FK_IdTipoProducto",modeloproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						modeloproductoLogic.setModeloProductos(new ArrayList<ModeloProducto>());
						modeloproductoLogic.getModeloProductos().addAll(modeloproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							modeloproductos=new ArrayList<ModeloProducto>();
							modeloproductos.addAll(modeloproductosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesModeloProducto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessModeloProducto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=modeloproductoLogic.getModeloProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=modeloproductos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=modeloproductoLogic.getModeloProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=modeloproductos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ModeloProducto modeloproducto) {
		Boolean permite=true;
		
		if(this.modeloproducto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ModeloProductoConstantesFunciones.getOrderByListaModeloProducto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ModeloProductoConstantesFunciones.getOrderByListaModeloProducto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ModeloProducto modeloproducto:modeloproductoLogic.getModeloProductos()) {
				if(modeloproducto.getsType().equals(Constantes2.S_TOTALES)) {
					modeloproductoTotales=modeloproducto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ModeloProducto modeloproducto:this.modeloproductos) {
				if(modeloproducto.getsType().equals(Constantes2.S_TOTALES)) {
					modeloproductoTotales=modeloproducto;
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
			this.modeloproductoAux=new ModeloProducto();
			this.modeloproductoAux.setsType(Constantes2.S_TOTALES);
			this.modeloproductoAux.setIsNew(false);
			this.modeloproductoAux.setIsChanged(false);
			this.modeloproductoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ModeloProductoConstantesFunciones.TotalizarValoresFilaModeloProducto(this.modeloproductoLogic.getModeloProductos(),this.modeloproductoAux);
				
				this.modeloproductoLogic.getModeloProductos().add(this.modeloproductoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ModeloProductoConstantesFunciones.TotalizarValoresFilaModeloProducto(this.modeloproductos,this.modeloproductoAux);
				
				this.modeloproductos.add(this.modeloproductoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		modeloproductoTotales=new ModeloProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.modeloproductoLogic.getModeloProductos().remove(modeloproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.modeloproductos.remove(modeloproductoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		modeloproductoTotales=new ModeloProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ModeloProducto modeloproducto:modeloproductoLogic.getModeloProductos()) {
				if(modeloproducto.getsType().equals(Constantes2.S_TOTALES)) {
					modeloproductoTotales=modeloproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ModeloProductoConstantesFunciones.TotalizarValoresFilaModeloProducto(this.modeloproductoLogic.getModeloProductos(),modeloproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ModeloProducto modeloproducto:this.modeloproductos) {
				if(modeloproducto.getsType().equals(Constantes2.S_TOTALES)) {
					modeloproductoTotales=modeloproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ModeloProductoConstantesFunciones.TotalizarValoresFilaModeloProducto(this.modeloproductos,modeloproductoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getModeloProductosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getModeloProductosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getModeloProductosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getModeloProductosFK_IdTipoProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getModeloProductosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					modeloproductoLogic.getModeloProductosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getModeloProductosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					modeloproductoLogic.getModeloProductosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getModeloProductosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					modeloproductoLogic.getModeloProductosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getModeloProductosFK_IdTipoProducto(String sFinalQuery,Long id_tipo_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					modeloproductoLogic.getModeloProductosFK_IdTipoProducto(sFinalQuery,this.pagination,id_tipo_producto);
				
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
	
	public void inicializarPermisosModeloProducto() {
		this.isPermisoTodoModeloProducto=false;
		this.isPermisoNuevoModeloProducto=false;
		this.isPermisoActualizarModeloProducto=false;
		this.isPermisoActualizarOriginalModeloProducto=false;
		this.isPermisoEliminarModeloProducto=false;
		this.isPermisoGuardarCambiosModeloProducto=false;
		this.isPermisoConsultaModeloProducto=false;
		this.isPermisoBusquedaModeloProducto=false;
		this.isPermisoReporteModeloProducto=false;		
		this.isPermisoOrdenModeloProducto=false;		
		this.isPermisoPaginacionMedioModeloProducto=false;		
		this.isPermisoPaginacionAltoModeloProducto=false;
		this.isPermisoPaginacionTodoModeloProducto=false;
		this.isPermisoCopiarModeloProducto=false;		
		this.isPermisoVerFormModeloProducto=false;		
		this.isPermisoDuplicarModeloProducto=false;		
		this.isPermisoOrdenModeloProducto=false;		
	}
	
	public void setPermisosUsuarioModeloProducto(Boolean isPermiso) {
		this.isPermisoTodoModeloProducto=isPermiso;
		this.isPermisoNuevoModeloProducto=isPermiso;
		this.isPermisoActualizarModeloProducto=isPermiso;
		this.isPermisoActualizarOriginalModeloProducto=isPermiso;
		this.isPermisoEliminarModeloProducto=isPermiso;
		this.isPermisoGuardarCambiosModeloProducto=isPermiso;
		this.isPermisoConsultaModeloProducto=isPermiso;
		this.isPermisoBusquedaModeloProducto=isPermiso;
		this.isPermisoReporteModeloProducto=isPermiso;
		this.isPermisoOrdenModeloProducto=isPermiso;		
		this.isPermisoPaginacionMedioModeloProducto=isPermiso;		
		this.isPermisoPaginacionAltoModeloProducto=isPermiso;		
		this.isPermisoPaginacionTodoModeloProducto=isPermiso;		
		this.isPermisoCopiarModeloProducto=isPermiso;		
		this.isPermisoVerFormModeloProducto=isPermiso;		
		this.isPermisoDuplicarModeloProducto=isPermiso;
		this.isPermisoOrdenModeloProducto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioModeloProducto(Boolean isPermiso) {
		//this.isPermisoTodoModeloProducto=isPermiso;
		this.isPermisoNuevoModeloProducto=isPermiso;
		this.isPermisoActualizarModeloProducto=isPermiso;
		this.isPermisoActualizarOriginalModeloProducto=isPermiso;
		this.isPermisoEliminarModeloProducto=isPermiso;
		this.isPermisoGuardarCambiosModeloProducto=isPermiso;
		//this.isPermisoConsultaModeloProducto=isPermiso;
		//this.isPermisoBusquedaModeloProducto=isPermiso;
		//this.isPermisoReporteModeloProducto=isPermiso;
		//this.isPermisoOrdenModeloProducto=isPermiso;		
		//this.isPermisoPaginacionMedioModeloProducto=isPermiso;		
		//this.isPermisoPaginacionAltoModeloProducto=isPermiso;		
		//this.isPermisoPaginacionTodoModeloProducto=isPermiso;		
		//this.isPermisoCopiarModeloProducto=isPermiso;		
		//this.isPermisoDuplicarModeloProducto=isPermiso;
		//this.isPermisoOrdenModeloProducto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioModeloProductoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ProductoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
		if(ModeloProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosProducto=this.verificarGetPermisosUsuarioOpcionModeloProductoClaseRelacionada(this.opcionsRelacionadas,ProductoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosParametroInventarioDefecto=false;
		this.isTienePermisosParametroInventarioDefecto=this.verificarGetPermisosUsuarioOpcionModeloProductoClaseRelacionada(this.opcionsRelacionadas,ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebModeloProducto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioModeloProductoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosProducto=conPermiso;
		this.isTienePermisosParametroInventarioDefecto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioModeloProductoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionModeloProductoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioModeloProductoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosProducto && this.jInternalFrameDetalleFormModeloProducto!=null && this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormModeloProducto.jTabbedPaneRelacionesModeloProducto.remove(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosParametroInventarioDefecto && this.jInternalFrameDetalleFormModeloProducto!=null && this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormModeloProducto.jTabbedPaneRelacionesModeloProducto.remove(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioModeloProducto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ModeloProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ModeloProductoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoModeloProducto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarModeloProducto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalModeloProducto=this.isPermisoActualizarModeloProducto;
			this.isPermisoEliminarModeloProducto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosModeloProducto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaModeloProducto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaModeloProducto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoModeloProducto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteModeloProducto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenModeloProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioModeloProducto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoModeloProducto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoModeloProducto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarModeloProducto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormModeloProducto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarModeloProducto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenModeloProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosModeloProducto.setToolTipText(this.jTableDatosModeloProducto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioModeloProducto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioModeloProducto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ModeloProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ModeloProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioModeloProducto() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosProducto && this.modeloproductoConstantesFunciones.mostrarProductoModeloProducto && !ModeloProductoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Producto");
			reporte.setsDescripcion("Producto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosParametroInventarioDefecto && this.modeloproductoConstantesFunciones.mostrarParametroInventarioDefectoModeloProducto && !ModeloProductoConstantesFunciones.ISGUARDARREL) {

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
	public void inicializarCombosForeignKeyModeloProductoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tipoproductosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyModeloProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ModeloProductoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyModeloProductoListas(false);
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
	
	public void cargarCombosLoteForeignKeyModeloProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ModeloProductoParameterReturnGeneral modeloproductoReturnGeneral=new ModeloProductoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.modeloproductoConstantesFunciones.cargarid_empresaModeloProducto)
					 || (this.esRecargarFks && this.modeloproductoConstantesFunciones.cargarid_empresaModeloProducto)) {

					if(!this.modeloproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+modeloproductoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTipoProducto="";

				if(((this.tipoproductosForeignKey==null||this.tipoproductosForeignKey.size()<=0) && this.modeloproductoConstantesFunciones.cargarid_tipo_productoModeloProducto)
					 || (this.esRecargarFks && this.modeloproductoConstantesFunciones.cargarid_tipo_productoModeloProducto)) {

					if(!this.modeloproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoProductoConstantesFunciones.getArrayColumnasGlobalesTipoProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoProducto, "");
						finalQueryGlobalTipoProducto+=TipoProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoProducto=" WHERE " + ConstantesSql.ID + "="+modeloproductoSessionBean.getlidTipoProductoActual();
					}
				} else {
					finalQueryGlobalTipoProducto="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				modeloproductoReturnGeneral=modeloproductoLogic.cargarCombosLoteForeignKeyModeloProducto(finalQueryGlobalEmpresa,finalQueryGlobalTipoProducto);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=modeloproductoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTipoProducto.equals("NONE")) {
				this.tipoproductosForeignKey=modeloproductoReturnGeneral.gettipoproductosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyModeloProducto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoProducto();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.modeloproductoSessionBean==null) {
				this.modeloproductoSessionBean=new ModeloProductoSessionBean();
			}

			if(!this.modeloproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.modeloproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProducto()) {
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
	
	public void initActionsCombosTodosForeignKeyModeloProducto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyModeloProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyModeloProducto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyModeloProducto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyModeloProducto(ModeloProducto modeloproducto)throws Exception {	
		try {
			
			this.setActualTipoProductoForeignKey(modeloproducto.getid_tipo_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyModeloProducto(ModeloProducto modeloproducto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyModeloProducto()throws Exception {	
		try {
			
			this.setActualTipoProductoForeignKey(this.modeloproductoConstantesFunciones.getid_tipo_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyModeloProducto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyModeloProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyModeloProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroModeloProducto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyModeloProducto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoProductosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyModeloProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyModeloProducto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_empresaModeloProducto!=null && this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_empresaModeloProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_empresaModeloProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_tipo_productoModeloProducto!=null && this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_tipo_productoModeloProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_tipo_productoModeloProducto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public ModeloProductoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ModeloProductoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ModeloProductoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.modeloproductoSessionBean=new ModeloProductoSessionBean(); 
		this.modeloproductoConstantesFunciones=new ModeloProductoConstantesFunciones(); 
		this.modeloproductoBean=new ModeloProducto();//(this.modeloproductoConstantesFunciones); 		
		this.modeloproductoReturnGeneral=new ModeloProductoParameterReturnGeneral(); 
		
		this.modeloproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.modeloproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ModeloProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ModeloProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ModeloProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessModeloProducto(true);
			
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
			
			this.modeloproductoConstantesFunciones=new ModeloProductoConstantesFunciones(); 
			this.modeloproductoBean=new ModeloProducto();//this.modeloproductoConstantesFunciones); 			
			this.modeloproductoReturnGeneral=new ModeloProductoParameterReturnGeneral(); 
		
			ModeloProductoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Modelo Producto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.modeloproducto=new ModeloProducto();
			this.modeloproductos = new ArrayList<ModeloProducto>();
			this.modeloproductosAux = new ArrayList<ModeloProducto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic=new ModeloProductoLogic();
				this.modeloproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.modeloproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.modeloproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormModeloProducto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoModeloProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoModeloProducto);	
					}
					
					if(this.jInternalFrameImportacionModeloProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionModeloProducto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByModeloProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByModeloProducto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormModeloProducto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormModeloProducto);
				this.jInternalFrameDetalleFormModeloProducto.setVisible(false);
				this.jInternalFrameDetalleFormModeloProducto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoModeloProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoModeloProducto);
					this.jInternalFrameReporteDinamicoModeloProducto.setVisible(false);
					this.jInternalFrameReporteDinamicoModeloProducto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionModeloProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionModeloProducto);
					this.jInternalFrameImportacionModeloProducto.setVisible(false);
					this.jInternalFrameImportacionModeloProducto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByModeloProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByModeloProducto);
					this.jInternalFrameOrderByModeloProducto.setVisible(false);
					this.jInternalFrameOrderByModeloProducto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idModeloProductoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ModeloProductoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.modeloproductoReturnGeneral=new ModeloProductoParameterReturnGeneral();
			
			this.modeloproductoParameterGeneral=new ModeloProductoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.modeloproductoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ModeloProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ProductoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ModeloProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.modeloproductoSessionBean.getEsGuardarRelacionado(),this.modeloproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ModeloProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.modeloproductoSessionBean.getEsGuardarRelacionado(),this.modeloproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoModeloProducto=false;
			this.isVisibilidadCeldaDuplicarModeloProducto=true;
			this.isVisibilidadCeldaCopiarModeloProducto=true;
			this.isVisibilidadCeldaVerFormModeloProducto=true;
			this.isVisibilidadCeldaOrdenModeloProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesModeloProducto=false;
			this.isVisibilidadCeldaModificarModeloProducto=false;
			this.isVisibilidadCeldaActualizarModeloProducto=false;
			this.isVisibilidadCeldaEliminarModeloProducto=false;
			this.isVisibilidadCeldaCancelarModeloProducto=false;
			this.isVisibilidadCeldaGuardarModeloProducto=false;
			this.isVisibilidadCeldaGuardarCambiosModeloProducto=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoProducto=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesModeloProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosModeloProducto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioModeloProducto(false);
			
			this.setPermisosUsuarioModeloProducto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.modeloproductoSessionBean.getEsGuardarRelacionado() 
				|| (this.modeloproductoSessionBean.getEsGuardarRelacionado() && this.modeloproductoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioModeloProductoClasesRelacionadas();
			}
			
			if(this.modeloproductoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioModeloProductoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ModeloProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosModeloProducto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualModeloProducto();
			}
			
			if(!this.isPermisoBusquedaModeloProducto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasModeloProducto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.modeloproductoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioModeloProducto,this.isPermisoPaginacionMedioModeloProducto,this.isPermisoPaginacionTodoModeloProducto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ModeloProductoConstantesFunciones.getTiposSeleccionarModeloProducto());
				
				this.tiposColumnasSelect=ModeloProductoConstantesFunciones.getTiposSeleccionarModeloProducto(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectModeloProducto();				
				//this.tiposRelacionesSelect=ModeloProductoConstantesFunciones.getTiposRelacionesModeloProducto(true);
				
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
			//if(!this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioModeloProducto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioModeloProducto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioModeloProducto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesModeloProducto() ;
			
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
				modeloproductoImplementable= (ModeloProductoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ModeloProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				modeloproductoImplementableHome= (ModeloProductoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ModeloProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.modeloproductos= new ArrayList<ModeloProducto>();
			this.modeloproductosEliminados= new ArrayList<ModeloProducto>();
						
			this.isEsNuevoModeloProducto=false;
			this.esParaAccionDesdeFormularioModeloProducto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tipoproductosForeignKey=new ArrayList<TipoProducto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyModeloProducto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroModeloProducto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ModeloProductoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ModeloProductoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesModeloProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingModeloProducto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormModeloProducto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioModeloProducto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioModeloProducto();
			}
			
			ModeloProductoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasModeloProducto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasModeloProducto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasModeloProducto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessModeloProducto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ModeloProducto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectModeloProducto() {
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
			if(sTipo.equals("RelacionesModeloProducto")) {
				iIndex=this.jInternalFrameDetalleFormModeloProducto.jTabbedPaneRelacionesModeloProducto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormModeloProducto.jTabbedPaneRelacionesModeloProducto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosModeloProducto.getSelectedRow();	
				
				

				if(sTitle.equals("Parametro Inventario Defectos")) {
					if(!ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessModeloProducto();

						this.cargarParteTabPanelRelacionadaParametroInventarioDefecto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Productos")) {
					if(!ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessModeloProducto();

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
				this.finishProcessModeloProducto();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaParametroInventarioDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormModeloProducto.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(false,true,iIndex);
		this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();

		//this.jTabbedPaneRelacionesModeloProducto.updateUI();
		//this.jTabbedPaneRelacionesModeloProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesModeloProducto.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProducto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormModeloProducto.cargarSessionConBeanSwingJInternalFrameProducto(false,true,iIndex);
		this.jButtonProductoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProducto();

		//this.jTabbedPaneRelacionesModeloProducto.updateUI();
		//this.jTabbedPaneRelacionesModeloProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesModeloProducto.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Producto")) {
				int row=this.jTableDatosModeloProducto.getSelectedRow();
				jButtonProductoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ParametroInventarioDefecto")) {
				int row=this.jTableDatosModeloProducto.getSelectedRow();
				jButtonParametroInventarioDefectoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Producto")) {

					if(this.isTienePermisosProducto && this.modeloproductoConstantesFunciones.mostrarProductoModeloProducto && !ModeloProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Productos"+"("+ProductoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Productos");

						if(modeloproductoConstantesFunciones.resaltarProductoModeloProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(modeloproductoConstantesFunciones.resaltarProductoModeloProducto);
						}

						jmenuItem.setEnabled(this.modeloproductoConstantesFunciones.activarProductoModeloProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Producto"));

						

						this.jInternalFrameDetalleFormModeloProducto.jmenuDetalleModeloProducto.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Parametro Inventario Defecto")) {

					if(this.isTienePermisosParametroInventarioDefecto && this.modeloproductoConstantesFunciones.mostrarParametroInventarioDefectoModeloProducto && !ModeloProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Inventario Defectos"+"("+ParametroInventarioDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Inventario Defectos");

						if(modeloproductoConstantesFunciones.resaltarParametroInventarioDefectoModeloProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(modeloproductoConstantesFunciones.resaltarParametroInventarioDefectoModeloProducto);
						}

						jmenuItem.setEnabled(this.modeloproductoConstantesFunciones.activarParametroInventarioDefectoModeloProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroInventarioDefecto"));

						

						this.jInternalFrameDetalleFormModeloProducto.jmenuDetalleModeloProducto.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyModeloProducto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyModeloProducto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyModeloProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyModeloProductoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyModeloProducto();
		
		this.cargarCombosFrameForeignKeyModeloProducto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyModeloProducto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyModeloProducto();
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
	
	public void jButtonNuevoModeloProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.modeloproductoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormModeloProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
			
			
			if(jTableDatosModeloProducto.getRowCount()>=1) {
				jTableDatosModeloProducto.removeRowSelectionInterval(0, jTableDatosModeloProducto.getRowCount()-1);						
			}
			
			this.isEsNuevoModeloProducto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoModeloProducto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesModeloProducto(true);			
			//this.modeloproducto=new ModeloProducto();
			//this.modeloproducto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesModeloProducto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualModeloProducto() ;
			
			if(ModeloProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleModeloProducto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.modeloproducto);	
			this.actualizarInformacion("INFO_PADRE",false,this.modeloproducto);				
			
			ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
			
			if(this.modeloproductoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ModeloProducto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarModeloProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ModeloProducto> modeloproductosSeleccionados=new ArrayList<ModeloProducto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosModeloProducto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosModeloProducto.getSelectedRows().length;			
			}
			
			modeloproductosSeleccionados=this.getModeloProductosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoModeloProducto--;			
				//ModeloProducto modeloproductoAux= new ModeloProducto();			
				//modeloproductoAux.setId(this.iIdNuevoModeloProducto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ModeloProducto modeloproductoOrigen=new ModeloProducto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ModeloProducto modeloproductoOrigen : modeloproductosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosModeloProducto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							modeloproductoOrigen =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							modeloproductoOrigen =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaModeloProducto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.modeloproducto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosModeloProducto(modeloproductoOrigen,this.modeloproducto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysModeloProducto(this.modeloproducto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.modeloproductoLogic.getModeloProductos().add(this.modeloproductoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.modeloproductos.add(this.modeloproductoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaModeloProducto(false);
				
				this.jTableDatosModeloProducto.setRowSelectionInterval(this.getIndiceNuevoModeloProducto(), this.getIndiceNuevoModeloProducto());
				
				int iLastRow =  this.jTableDatosModeloProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosModeloProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosModeloProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaModeloProducto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarModeloProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ModeloProducto> modeloproductosSeleccionados=new ArrayList<ModeloProducto>();									
		
			ModeloProducto modeloproductoOrigen=new ModeloProducto();
			ModeloProducto modeloproductoDestino=new ModeloProducto();
				
			modeloproductosSeleccionados=this.getModeloProductosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosModeloProducto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || modeloproductosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosModeloProducto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						modeloproductoOrigen =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						modeloproductoOrigen =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						modeloproductoDestino =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						modeloproductoDestino =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				modeloproductoOrigen =modeloproductosSeleccionados.get(0);
				modeloproductoDestino =modeloproductosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosModeloProducto(modeloproductoOrigen,modeloproductoDestino,true,false);
				
				modeloproductoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(modeloproductoDestino,modeloproductoLogic.getModeloProductos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(modeloproductoDestino,modeloproductos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaModeloProducto(false);
				
				//this.jTableDatosModeloProducto.setRowSelectionInterval(this.getIndiceNuevoModeloProducto(), this.getIndiceNuevoModeloProducto());
				
				int iLastRow =  this.jTableDatosModeloProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosModeloProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosModeloProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaModeloProducto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormModeloProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormModeloProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormModeloProducto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarModeloProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesModeloProducto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasModeloProducto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesModeloProducto.setVisible(!isVisible);
			this.jPanelPaginacionModeloProducto.setVisible(!isVisible);
			this.jPanelAccionesModeloProducto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarModeloProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameModeloProducto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoModeloProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoModeloProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionModeloProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionModeloProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByModeloProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByModeloProducto();
			
			this.abrirFrameOrderByModeloProducto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByModeloProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByModeloProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleModeloProducto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormModeloProducto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormModeloProducto.isMaximum()) {
					this.jInternalFrameDetalleFormModeloProducto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormModeloProducto.setSize(this.jInternalFrameDetalleFormModeloProducto.iWidthFormulario,this.jInternalFrameDetalleFormModeloProducto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormModeloProducto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormModeloProducto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormModeloProducto.isMaximum()) {
						this.jInternalFrameDetalleFormModeloProducto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormModeloProducto.jContentPaneDetalleModeloProducto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormModeloProducto.jTabbedPaneRelacionesModeloProducto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormModeloProducto.jContentPaneDetalleModeloProducto.getWidth(),ModeloProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormModeloProducto.jTabbedPaneRelacionesModeloProducto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormModeloProducto.jContentPaneDetalleModeloProducto.getWidth(),ModeloProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormModeloProducto.jTabbedPaneRelacionesModeloProducto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormModeloProducto.jContentPaneDetalleModeloProducto.getWidth(),ModeloProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();
					}

					if(ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProducto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormModeloProducto.setVisible(true);
	        this.jInternalFrameDetalleFormModeloProducto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByModeloProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByModeloProducto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByModeloProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByModeloProducto,false,this);
				} else {
					this.jInternalFrameOrderByModeloProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByModeloProducto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByModeloProducto);
				this.jInternalFrameOrderByModeloProducto.setVisible(false);
				this.jInternalFrameOrderByModeloProducto.setSelected(false);
				
				this.jInternalFrameOrderByModeloProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByModeloProducto"));
				
				this.inicializarActualizarBindingTablaOrderByModeloProducto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionModeloProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionModeloProducto==null) {
				
				this.jInternalFrameImportacionModeloProducto=new ImportacionJInternalFrame(ModeloProductoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionModeloProducto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionModeloProducto);
				this.jInternalFrameImportacionModeloProducto.setVisible(false);
				this.jInternalFrameImportacionModeloProducto.setSelected(false);


				this.jInternalFrameImportacionModeloProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionModeloProducto"));
				this.jInternalFrameImportacionModeloProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionModeloProducto"));
				this.jInternalFrameImportacionModeloProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionModeloProducto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoModeloProducto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoModeloProducto==null) {
				this.jInternalFrameReporteDinamicoModeloProducto=new ReporteDinamicoJInternalFrame(ModeloProductoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoModeloProducto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoModeloProducto);
				this.jInternalFrameReporteDinamicoModeloProducto.setVisible(false);
				this.jInternalFrameReporteDinamicoModeloProducto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoModeloProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoModeloProducto"));
				this.jInternalFrameReporteDinamicoModeloProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoModeloProducto"));
				this.jInternalFrameReporteDinamicoModeloProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoModeloProducto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualModeloProducto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaParametroInventarioDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormModeloProducto.jContentPaneDetalleModeloProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProducto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormModeloProducto.jContentPaneDetalleModeloProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleModeloProducto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormModeloProducto);
			
	       	this.jInternalFrameDetalleFormModeloProducto.setVisible(false);
	        this.jInternalFrameDetalleFormModeloProducto.setSelected(false);
			
			//this.jInternalFrameDetalleFormModeloProducto.dispose();
			//this.jInternalFrameDetalleFormModeloProducto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoModeloProducto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoModeloProducto.setVisible(true);
	        this.jInternalFrameReporteDinamicoModeloProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionModeloProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionModeloProducto.setVisible(true);
	        this.jInternalFrameImportacionModeloProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByModeloProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByModeloProducto.setVisible(true);
	        this.jInternalFrameOrderByModeloProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByModeloProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByModeloProducto.setVisible(false);
	        this.jInternalFrameOrderByModeloProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoModeloProducto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoModeloProducto.setVisible(false);
	        this.jInternalFrameReporteDinamicoModeloProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionModeloProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionModeloProducto.setVisible(false);
	        this.jInternalFrameImportacionModeloProducto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarModeloProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarModeloProducto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarModeloProducto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosModeloProducto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesModeloProducto(true);
			//this.isEsNuevoModeloProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproducto =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.modeloproducto =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesModeloProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesModeloProducto(false) ;
			
			if(modeloproductoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado() && ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(ModeloProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleModeloProducto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualModeloProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaModeloProductoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosModeloProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproducto =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.modeloproducto =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarModeloProducto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormModeloProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosModeloProducto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesModeloProducto(true);
			//this.isEsNuevoModeloProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproducto =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.modeloproducto =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.modeloproducto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesModeloProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesModeloProducto(false) ;
			
			if(ModeloProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleModeloProducto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualModeloProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoProducto(List<TipoProducto> tipoproductosForeignKey)throws Exception{
		TableColumn tableColumnTipoProducto=this.jTableDatosModeloProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModeloProducto,ModeloProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO));
		TableCellEditor tableCellEditorTipoProducto =tableColumnTipoProducto.getCellEditor();

		TipoProductoTableCell tipoproductoTableCellFk=(TipoProductoTableCell)tableCellEditorTipoProducto;

		if(tipoproductoTableCellFk!=null) {
			tipoproductoTableCellFk.settipoproductosForeignKey(tipoproductosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosModeloProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoproductoTableCellFk.setRowActual(intSelectedRow);
			//tipoproductoTableCellFk.settipoproductosForeignKeyActual(tipoproductosForeignKey);
		//}


		if(tipoproductoTableCellFk!=null) {
			tipoproductoTableCellFk.RecargarTipoProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarModeloProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesModeloProducto(false);
			
			//if(!this.isEsNuevoModeloProducto) {								
				int intSelectedRow = this.jTableDatosModeloProducto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproducto =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.modeloproducto =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ModeloProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualModeloProducto(this.modeloproducto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysModeloProducto(this.modeloproducto);
				
			}
			
			if(this.permiteMantenimiento(this.modeloproducto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoModeloProducto=true;
					this.inicializarActualizarBindingTablaModeloProducto(false);
					this.isEsNuevoModeloProducto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoModeloProducto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoModeloProducto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesModeloProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualModeloProducto(false);
				
				this.habilitarDeshabilitarControlesModeloProducto(false);
			
												
				
				if(ModeloProductoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleModeloProducto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoModeloProductoActionPerformed(evt,modeloproductoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualModeloProducto(this.modeloproducto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosModeloProducto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,modeloproductoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.modeloproducto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ModeloProducto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ModeloProducto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarModeloProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosModeloProducto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproducto =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				this.modeloproducto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.modeloproducto =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				this.modeloproducto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.modeloproducto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ModeloProductoModel) this.jTableDatosModeloProducto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoModeloProducto=true;
				this.inicializarActualizarBindingTablaModeloProducto(false);
				this.isEsNuevoModeloProducto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesModeloProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualModeloProducto(false);
				
				this.habilitarDeshabilitarControlesModeloProducto(false);
				
				
				
				if(ModeloProductoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleModeloProducto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarModeloProductoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosModeloProducto.getRowCount()>=1) {
				jTableDatosModeloProducto.removeRowSelectionInterval(0, jTableDatosModeloProducto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesModeloProducto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaModeloProducto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesModeloProducto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualModeloProducto(false) ;
			
			this.isEsNuevoModeloProducto=false;
			
			if(ModeloProductoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleModeloProducto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosModeloProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingModeloProducto(false);
				
				//SI ES MANUAL
				if(ModeloProductoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualModeloProducto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosModeloProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoModeloProducto--;			
			//ModeloProducto modeloproductoAux= new ModeloProducto();			
			//modeloproductoAux.setId(this.iIdNuevoModeloProducto);
			
			if(this.jInternalFrameDetalleFormModeloProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaModeloProducto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysModeloProducto(this.modeloproducto);
			
			this.modeloproducto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.modeloproductoLogic.getModeloProductos().add(this.modeloproductoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.modeloproductos.add(this.modeloproductoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaModeloProducto(false);
			
			this.jTableDatosModeloProducto.setRowSelectionInterval(this.getIndiceNuevoModeloProducto(), this.getIndiceNuevoModeloProducto());
			
			int iLastRow =  this.jTableDatosModeloProducto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosModeloProducto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosModeloProducto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaModeloProducto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionModeloProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingModeloProducto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingModeloProducto(false);
			
			//SI ES MANUAL
			if(ModeloProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualModeloProducto();
			}
			
			//this.abrirFrameTreeModeloProducto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionModeloProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Modelo ProductoS ?", "MANTENIMIENTO DE Modelo Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionModeloProducto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralModeloProducto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.modeloproductoReturnGeneral=modeloproductoLogic.procesarImportacionModeloProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.modeloproductoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarModeloProductoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionModeloProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionModeloProducto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionModeloProducto.setFileImportacion(this.jInternalFrameImportacionModeloProducto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionModeloProducto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionModeloProducto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionModeloProducto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionModeloProducto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoModeloProductoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ModeloProducto> modeloproductosSeleccionados=new ArrayList<ModeloProducto>();		

		modeloproductosSeleccionados=this.getModeloProductosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoModeloProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoModeloProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ModeloProductoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ModeloProductoBaseDesign.jrxml";
			
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
			
			this.generarReporteModeloProductos("Todos",modeloproductosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.modeloproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modelo Producto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoModeloProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoModeloProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ModeloProductoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ModeloProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ModeloProductoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ModeloProductoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoModeloProducto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoModeloProducto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoModeloProducto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ModeloProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ModeloProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					sNombreCampoCategoria="id_tipo_producto";
					break;

				case ModeloProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ModeloProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoModeloProducto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ModeloProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ModeloProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					sNombreCampoCategoriaValor="id_tipo_producto";
					break;

				case ModeloProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ModeloProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoModeloProducto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoModeloProducto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ModeloProductoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ModeloProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_producto");
					break;

				case ModeloProductoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ModeloProductoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoModeloProductoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ModeloProducto> modeloproductosSeleccionados=new ArrayList<ModeloProducto>();		
		
		modeloproductosSeleccionados=this.getModeloProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"modeloproducto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ModeloProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoModeloProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoModeloProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ModeloProductoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ModeloProductoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ModeloProducto modeloproducto:modeloproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(modeloproducto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ModeloProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ModeloProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
					iRow++;

					for(ModeloProducto modeloproducto:modeloproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(modeloproducto.gettipoproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ModeloProductoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ModeloProductoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ModeloProducto modeloproducto:modeloproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(modeloproducto.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ModeloProductoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ModeloProductoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ModeloProducto modeloproducto:modeloproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(modeloproducto.getnombre());
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
			//	this.getFilaCabeceraExportarExcelModeloProducto(row);				
			//	iRow++;
			//}				
			
			//for(ModeloProducto modeloproductoAux:modeloproductosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelModeloProducto(modeloproductoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.modeloproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modelo Producto",JOptionPane.INFORMATION_MESSAGE);
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
				this.modeloproductoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingModeloProducto(false);
			
			//SI ES MANUAL
			if(ModeloProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualModeloProducto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresModeloProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingModeloProducto(false);
			
			//SI ES MANUAL
			if(ModeloProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualModeloProducto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesModeloProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingModeloProducto(false);
			
			//SI ES MANUAL
			if(ModeloProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualModeloProducto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaModeloProducto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosModeloProducto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosModeloProducto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosModeloProducto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosModeloProducto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosModeloProducto.setMinimumSize(dimensionMinimum);
		this.jTableDatosModeloProducto.setMaximumSize(dimensionMaximum);
		this.jTableDatosModeloProducto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingModeloProducto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingModeloProducto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingModeloProducto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaModeloProducto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesModeloProducto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasModeloProducto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesModeloProducto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesModeloProducto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ModeloProductoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ModeloProductoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualModeloProducto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaModeloProducto();
		
		this.inicializarActualizarBindingBotonesManualModeloProducto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualModeloProducto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesModeloProducto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualModeloProducto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualModeloProducto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosModeloProducto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosModeloProducto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteModeloProducto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormModeloProducto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormModeloProducto.jCheckBoxPostAccionNuevoModeloProducto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormModeloProducto.jCheckBoxPostAccionSinCerrarModeloProducto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormModeloProducto.jCheckBoxPostAccionSinMensajeModeloProducto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosModeloProducto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosModeloProducto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteModeloProducto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormModeloProducto!=null) {
				this.jInternalFrameDetalleFormModeloProducto.jCheckBoxPostAccionNuevoModeloProducto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormModeloProducto.jCheckBoxPostAccionSinCerrarModeloProducto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormModeloProducto.jCheckBoxPostAccionSinMensajeModeloProducto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionModeloProducto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionModeloProducto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormModeloProducto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormModeloProducto.jComboBoxTiposAccionesFormularioModeloProducto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesModeloProducto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoModeloProducto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoModeloProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesModeloProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesModeloProducto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarModeloProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesModeloProducto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoModeloProducto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoModeloProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesModeloProducto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralModeloProducto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesModeloProducto(Boolean esInicializar) throws Exception {
		try	{	
			if(ModeloProductoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualModeloProducto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesModeloProducto() throws Exception {
		try	{
			if(ModeloProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualModeloProducto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleModeloProducto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormModeloProducto.jComboBoxTiposAccionesFormularioModeloProducto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormModeloProducto.jComboBoxTiposAccionesFormularioModeloProducto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualModeloProducto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesModeloProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesModeloProducto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesModeloProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesModeloProducto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesModeloProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesModeloProducto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionModeloProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionModeloProducto.addItem(reporte);
			}
			
			
			if(!this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionModeloProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionModeloProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesModeloProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesModeloProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesModeloProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesModeloProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormModeloProducto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormModeloProducto.jComboBoxTiposAccionesFormularioModeloProducto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormModeloProducto.jComboBoxTiposAccionesFormularioModeloProducto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarModeloProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarModeloProducto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarModeloProducto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualModeloProducto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualModeloProducto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoModeloProducto!=null) {
				this.jInternalFrameReporteDinamicoModeloProducto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoModeloProducto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoModeloProducto!=null) {
				this.jInternalFrameReporteDinamicoModeloProducto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoModeloProducto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoModeloProducto!=null) {
				
				if(this.jInternalFrameReporteDinamicoModeloProducto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoModeloProducto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoModeloProducto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoModeloProducto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoModeloProducto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoModeloProducto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualModeloProducto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoModeloProducto.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreModeloProducto.getText();
		if(this.jComboBoxid_tipo_productoFK_IdTipoProductoModeloProducto.getSelectedItem()!=null){this.id_tipo_productoFK_IdTipoProducto=((TipoProducto)this.jComboBoxid_tipo_productoFK_IdTipoProductoModeloProducto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasModeloProducto(Boolean esInicializar) throws Exception {				
		if(ModeloProductoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualModeloProducto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaModeloProducto() throws Exception {
		this.inicializarActualizarBindingTablaModeloProducto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByModeloProducto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByModeloProducto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByModeloProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByModeloProducto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ModeloProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByModeloProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByModeloProducto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ModeloProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosModeloProductoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModeloProductoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ModeloProductoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByModeloProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByModeloProducto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ModeloProductoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByModeloProducto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaModeloProducto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=modeloproductoLogic.getModeloProductos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=modeloproductos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ModeloProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosModeloProducto.setModel(new ModeloProductoModel(this.modeloproductoLogic.getModeloProductos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosModeloProducto.setModel(new ModeloProductoModel(this.modeloproductos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByModeloProducto!=null && this.jInternalFrameOrderByModeloProducto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByModeloProducto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosModeloProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModeloProducto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ModeloProductoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO,modeloproductoConstantesFunciones.resaltarSeleccionarModeloProducto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ModeloProductoConstantesFunciones.SCLASSWEBTITULO,modeloproductoConstantesFunciones.resaltarSeleccionarModeloProducto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosModeloProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModeloProducto,ModeloProductoConstantesFunciones.LABEL_ID));

		if(this.modeloproductoConstantesFunciones.mostraridModeloProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModeloProductoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.modeloproductoConstantesFunciones.resaltaridModeloProducto,this.modeloproductoConstantesFunciones.activaridModeloProducto,this,true,"idModeloProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.modeloproductoConstantesFunciones.resaltaridModeloProducto,this.modeloproductoConstantesFunciones.activaridModeloProducto,this,true,"idModeloProducto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosModeloProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModeloProducto,ModeloProductoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.modeloproductoConstantesFunciones.mostrarid_empresaModeloProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModeloProductoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.modeloproductoConstantesFunciones.resaltarid_empresaModeloProducto,this,this.modeloproductoConstantesFunciones.activarid_empresaModeloProducto));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.modeloproductoConstantesFunciones.resaltarid_empresaModeloProducto,this,this.modeloproductoConstantesFunciones.activarid_empresaModeloProducto,false,"id_empresaModeloProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ModeloProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosModeloProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModeloProducto,ModeloProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO));

		if(this.modeloproductoConstantesFunciones.mostrarid_tipo_productoModeloProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModeloProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoProductoTableCell(this.tipoproductosForeignKey,this.modeloproductoConstantesFunciones.resaltarid_tipo_productoModeloProducto,this,this.modeloproductoConstantesFunciones.activarid_tipo_productoModeloProducto));
			tableColumn.setCellEditor(new TipoProductoTableCell(this.tipoproductosForeignKey,this.modeloproductoConstantesFunciones.resaltarid_tipo_productoModeloProducto,this,this.modeloproductoConstantesFunciones.activarid_tipo_productoModeloProducto,true,"id_tipo_productoModeloProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ModeloProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosModeloProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModeloProducto,ModeloProductoConstantesFunciones.LABEL_CODIGO));

		if(this.modeloproductoConstantesFunciones.mostrarcodigoModeloProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModeloProductoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.modeloproductoConstantesFunciones.resaltarcodigoModeloProducto,this.modeloproductoConstantesFunciones.activarcodigoModeloProducto,this,true,"codigoModeloProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.modeloproductoConstantesFunciones.resaltarcodigoModeloProducto,this.modeloproductoConstantesFunciones.activarcodigoModeloProducto,this,true,"codigoModeloProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ModeloProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosModeloProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModeloProducto,ModeloProductoConstantesFunciones.LABEL_NOMBRE));

		if(this.modeloproductoConstantesFunciones.mostrarnombreModeloProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModeloProductoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.modeloproductoConstantesFunciones.resaltarnombreModeloProducto,this.modeloproductoConstantesFunciones.activarnombreModeloProducto,this,true,"nombreModeloProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.modeloproductoConstantesFunciones.resaltarnombreModeloProducto,this.modeloproductoConstantesFunciones.activarnombreModeloProducto,this,true,"nombreModeloProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ModeloProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.modeloproductoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosProducto && this.modeloproductoConstantesFunciones.mostrarProductoModeloProducto && !ModeloProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Productos");
				tableColumn.setHeaderValue("Productos");
				tableColumn.setCellRenderer(new ProductoTableCell(modeloproductoConstantesFunciones.resaltarProductoModeloProducto,this,this.modeloproductoConstantesFunciones.activarProductoModeloProducto));
				tableColumn.setCellEditor(new ProductoTableCell(modeloproductoConstantesFunciones.resaltarProductoModeloProducto,this,this.modeloproductoConstantesFunciones.activarProductoModeloProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosModeloProducto.addColumn(tableColumn);
			}

			if(this.isTienePermisosParametroInventarioDefecto && this.modeloproductoConstantesFunciones.mostrarParametroInventarioDefectoModeloProducto && !ModeloProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Inventario Defectos");
				tableColumn.setHeaderValue("Parametro Inventario Defectos");
				tableColumn.setCellRenderer(new ParametroInventarioDefectoTableCell(modeloproductoConstantesFunciones.resaltarParametroInventarioDefectoModeloProducto,this,this.modeloproductoConstantesFunciones.activarParametroInventarioDefectoModeloProducto));
				tableColumn.setCellEditor(new ParametroInventarioDefectoTableCell(modeloproductoConstantesFunciones.resaltarParametroInventarioDefectoModeloProducto,this,this.modeloproductoConstantesFunciones.activarParametroInventarioDefectoModeloProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosModeloProducto.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.modeloproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.modeloproductoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosModeloProducto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.modeloproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.modeloproductoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosModeloProducto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarModeloProducto && this.isPermisoGuardarCambiosModeloProducto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.modeloproductoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.modeloproductoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosModeloProducto.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.modeloproductoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosModeloProducto.addColumn(tableColumn);
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
			
			this.jTableDatosModeloProducto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarModeloProducto && this.isPermisoGuardarCambiosModeloProducto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.modeloproductoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarModeloProducto && this.isPermisoGuardarCambiosModeloProducto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosModeloProducto.moveColumn(this.jTableDatosModeloProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosModeloProducto.moveColumn(this.jTableDatosModeloProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.modeloproductoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosModeloProducto.moveColumn(this.jTableDatosModeloProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosModeloProducto.moveColumn(this.jTableDatosModeloProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosModeloProducto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosModeloProducto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosModeloProducto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ModeloProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosModeloProducto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosModeloProducto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ModeloProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ModeloProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosModeloProducto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosModeloProducto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosModeloProducto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=modeloproductoLogic.getModeloProductos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=modeloproductos.size()-1;
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
		//this.jTableDatosModeloProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosModeloProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosModeloProducto();
			
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
				
				//this.isEsNuevoModeloProducto=false;
					
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
			
				if(this.modeloproductoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormModeloProducto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosModeloProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosModeloProducto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproducto =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.modeloproducto =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.modeloproducto.getsType().equals("DUPLICADO")
				   || this.modeloproducto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoModeloProducto=true;
				
				} else {
					this.isEsNuevoModeloProducto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
					if(this.modeloproducto.getId()>=0 && !this.modeloproducto.getIsNew()) {						
						this.isEsNuevoModeloProducto=false;
						
					} else {
						this.isEsNuevoModeloProducto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoModeloProducto(esRelaciones);						
				
				this.seleccionarModeloProducto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.modeloproducto.getId()<0) {
					this.isEsNuevoModeloProducto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarModeloProducto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarModeloProducto(evt,rowIndex);
				}	
				
				if(this.modeloproductoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ModeloProducto: " + this.dDif); 
					}
				}								
				
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarModeloProducto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.modeloproducto)) {
					if(this.modeloproducto.getId()>0) {
						this.modeloproducto.setIsDeleted(true);
						
						this.modeloproductosEliminados.add(this.modeloproducto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.modeloproductoLogic.getModeloProductos().remove(this.modeloproducto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.modeloproductos.remove(this.modeloproducto);				
					}
					
					
					((ModeloProductoModel) this.jTableDatosModeloProducto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaModeloProducto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarModeloProducto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoModeloProducto) {
			
			if(this.jInternalFrameDetalleFormModeloProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosModeloProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosModeloProducto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproducto =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.modeloproducto =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ModeloProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioModeloProducto(this.modeloproducto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.modeloproductoConstantesFunciones.cargarid_empresaModeloProducto || this.modeloproductoConstantesFunciones.event_dependid_empresaModeloProducto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.modeloproducto.getid_empresa());
									//this.inicializarActualizarBindingModeloProducto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(modeloproducto.getEmpresa()!=null) {
							this.empresasForeignKey.add(modeloproducto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.modeloproducto.getid_empresa(),false,"Formulario");

					//TipoProducto
					if(!this.modeloproductoConstantesFunciones.cargarid_tipo_productoModeloProducto || this.modeloproductoConstantesFunciones.event_dependid_tipo_productoModeloProducto) {
						//this.cargarCombosTipoProductosForeignKeyLista(" where id="+this.modeloproducto.getid_tipo_producto());
									//this.inicializarActualizarBindingModeloProducto(false,false);
						this.tipoproductosForeignKey=new ArrayList<TipoProducto>();

						if(modeloproducto.getTipoProducto()!=null) {
							this.tipoproductosForeignKey.add(modeloproducto.getTipoProducto());
						}

						this.addItemDefectoCombosForeignKeyTipoProducto();
						this.cargarCombosFrameTipoProductosForeignKey("Todos");
					}
					this.setActualTipoProductoForeignKey(this.modeloproducto.getid_tipo_producto(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesModeloProducto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesModeloProducto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualModeloProducto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoModeloProducto(ModeloProducto modeloproducto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoModeloProducto(modeloproducto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoModeloProducto(ModeloProducto modeloproducto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioModeloProducto(modeloproducto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyModeloProducto(modeloproducto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyModeloProducto(modeloproducto);
	}
	
	public void setVariablesObjetoActualToFormularioModeloProducto(ModeloProducto modeloproducto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormModeloProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormModeloProducto.jLabelidModeloProducto.setText(modeloproducto.getId().toString());
			this.jInternalFrameDetalleFormModeloProducto.jTextFieldcodigoModeloProducto.setText(modeloproducto.getcodigo());
			this.jInternalFrameDetalleFormModeloProducto.jTextAreanombreModeloProducto.setText(modeloproducto.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ModeloProducto modeloproductoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,modeloproductoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ModeloProducto modeloproductoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				modeloproductoLocal=this.modeloproducto;
			} else {
				modeloproductoLocal=this.modeloproductoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(modeloproductoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoModeloProducto(modeloproductoLocal,true);
					
					if(modeloproductoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(modeloproductoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(modeloproductoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoModeloProducto(ModeloProducto modeloproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualModeloProducto(modeloproducto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysModeloProducto(modeloproducto);
	}
	
	public void setVariablesFormularioToObjetoActualModeloProducto(ModeloProducto modeloproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualModeloProducto(modeloproducto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualModeloProducto(ModeloProducto modeloproducto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormModeloProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormModeloProducto.jLabelidModeloProducto.getText()==null || this.jInternalFrameDetalleFormModeloProducto.jLabelidModeloProducto.getText()=="" || this.jInternalFrameDetalleFormModeloProducto.jLabelidModeloProducto.getText()=="Id") {
				this.jInternalFrameDetalleFormModeloProducto.jLabelidModeloProducto.setText("0");
			}

			if(conColumnasBase) {modeloproducto.setId(Long.parseLong(this.jInternalFrameDetalleFormModeloProducto.jLabelidModeloProducto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ModeloProductoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModeloProducto.jLabelIdModeloProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			modeloproducto.setcodigo(this.jInternalFrameDetalleFormModeloProducto.jTextFieldcodigoModeloProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ModeloProductoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModeloProducto.jLabelcodigoModeloProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			modeloproducto.setnombre(this.jInternalFrameDetalleFormModeloProducto.jTextAreanombreModeloProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ModeloProductoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModeloProducto.jLabelnombreModeloProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualModeloProducto(ModeloProducto modeloproductoBean,ModeloProducto modeloproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && modeloproductoBean.getid_tipo_producto()!=null && !modeloproductoBean.getid_tipo_producto().equals(-1L))) {modeloproducto.setid_tipo_producto(modeloproductoBean.getid_tipo_producto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosModeloProducto(ModeloProducto modeloproductoOrigen,ModeloProducto modeloproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && modeloproductoOrigen.getId()!=null && !modeloproductoOrigen.getId().equals(0L))) {modeloproducto.setId(modeloproductoOrigen.getId());}}
			if(conDefault || (!conDefault && modeloproductoOrigen.getid_tipo_producto()!=null && !modeloproductoOrigen.getid_tipo_producto().equals(-1L))) {modeloproducto.setid_tipo_producto(modeloproductoOrigen.getid_tipo_producto());}
			if(conDefault || (!conDefault && modeloproductoOrigen.getcodigo()!=null && !modeloproductoOrigen.getcodigo().equals(""))) {modeloproducto.setcodigo(modeloproductoOrigen.getcodigo());}
			if(conDefault || (!conDefault && modeloproductoOrigen.getnombre()!=null && !modeloproductoOrigen.getnombre().equals(""))) {modeloproducto.setnombre(modeloproductoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioModeloProducto(ModeloProducto modeloproducto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormModeloProducto.jLabelidModeloProducto.setText(modeloproducto.getId().toString());
			this.jInternalFrameDetalleFormModeloProducto.jTextFieldcodigoModeloProducto.setText(modeloproducto.getcodigo());
			this.jInternalFrameDetalleFormModeloProducto.jTextAreanombreModeloProducto.setText(modeloproducto.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioModeloProducto(ModeloProductoBean modeloproductoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormModeloProducto.jLabelidModeloProducto.setText(modeloproductoBean.getId().toString());
			this.jInternalFrameDetalleFormModeloProducto.jTextFieldcodigoModeloProducto.setText(modeloproductoBean.getcodigo());
			this.jInternalFrameDetalleFormModeloProducto.jTextAreanombreModeloProducto.setText(modeloproductoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanModeloProducto(ModeloProductoParameterReturnGeneral modeloproductoReturnGeneral,ModeloProductoBean modeloproductoBean,Boolean conDefault) throws Exception { 
		try {
			ModeloProducto modeloproductoLocal=new ModeloProducto();
			
			modeloproductoLocal=modeloproductoReturnGeneral.getModeloProducto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && modeloproductoLocal.getId()!=null && !modeloproductoLocal.getId().equals(0L))) {modeloproductoBean.setId(modeloproductoLocal.getId());}}
			if(conDefault || (!conDefault && modeloproductoLocal.getid_tipo_producto()!=null && !modeloproductoLocal.getid_tipo_producto().equals(-1L))) {modeloproductoBean.setid_tipo_producto(modeloproductoLocal.getid_tipo_producto());}
			if(conDefault || (!conDefault && modeloproductoLocal.getcodigo()!=null && !modeloproductoLocal.getcodigo().equals(""))) {modeloproductoBean.setcodigo(modeloproductoLocal.getcodigo());}
			if(conDefault || (!conDefault && modeloproductoLocal.getnombre()!=null && !modeloproductoLocal.getnombre().equals(""))) {modeloproductoBean.setnombre(modeloproductoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxModeloProductoGenerico(Long idModeloProductoSeleccionado,JComboBox jComboBoxModeloProducto,List<ModeloProducto> modeloproductosLocal)throws Exception {
		try {
			ModeloProducto  modeloproductoTemp=null;

			for(ModeloProducto modeloproductoAux:modeloproductosLocal) {
				if(modeloproductoAux.getId()!=null && modeloproductoAux.getId().equals(idModeloProductoSeleccionado)) {
					modeloproductoTemp=modeloproductoAux;
					break;
				}
			}

			jComboBoxModeloProducto.setSelectedItem(modeloproductoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxModeloProductoGenerico(JComboBox jComboBoxModeloProducto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxModeloProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxModeloProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxModeloProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxModeloProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxModeloProducto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxModeloProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxModeloProducto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxModeloProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxModeloProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxModeloProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			modeloproducto=(ModeloProducto) modeloproductoLogic.getModeloProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			modeloproducto =(ModeloProducto) modeloproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!modeloproducto.getIsNew() && !modeloproducto.getIsChanged() && !modeloproducto.getIsDeleted()) {
				sDescripcion=modeloproducto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=modeloproducto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoProducto")) {
			//sDescripcion=this.getActualTipoProductoForeignKeyDescripcion((Long)value);
			if(!modeloproducto.getIsNew() && !modeloproducto.getIsChanged() && !modeloproducto.getIsDeleted()) {
				sDescripcion=modeloproducto.gettipoproducto_descripcion();
			} else {
				//sDescripcion=this.getActualTipoProductoForeignKeyDescripcion((Long)value);
				sDescripcion=modeloproducto.gettipoproducto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ModeloProducto modeloproductoRow=new ModeloProducto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			modeloproductoRow=(ModeloProducto) modeloproductoLogic.getModeloProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			modeloproductoRow=(ModeloProducto) modeloproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonProductoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,ModeloProducto modeloproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormModeloProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modeloproducto = (ModeloProducto)this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.modeloproducto = (ModeloProducto)this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(modeloproducto!=null) {
						this.modeloproducto = modeloproducto;
					} else {
						this.modeloproducto = new ModeloProducto();
					}
				}

				if(this.isTienePermisosProducto && this.permiteMantenimiento(this.modeloproducto)) {
					ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFramePopup=new ProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFramePopup;
					} else {
						productoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame;
					}

					List<ModeloProducto> modeloproductos=new ArrayList<ModeloProducto>();
					modeloproductos.add(this.modeloproducto);
					if(!esRelacionado) {
						//productoBeanSwingJInternalFrame.productoSessionBean.setConGuardarRelaciones(false);
						//productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormModeloProducto.cargarProductoBeanSwingJInternalFrame(modeloproductos,this.modeloproducto,productoBeanSwingJInternalFrame,/*conInicializar,*/productoBeanSwingJInternalFrame.productoSessionBean.getConGuardarRelaciones(),productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado());
					productoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoBeanSwingJInternalFrame.actualizarEstadoPanelsProducto("no_relacionado");

						productoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoConstantesFunciones.ITAMANIOFILATABLA + (ProductoConstantesFunciones.ITAMANIOFILATABLA/2));

						productoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderModeloProducto=(TitledBorder)this.jScrollPanelDatosModeloProducto.getBorder();
						TitledBorder titledBorderProducto=(TitledBorder)productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

						titledBorderProducto.setTitle(titledBorderModeloProducto.getTitle() + " -> Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoBeanSwingJInternalFrame);
						}

						productoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoBeanSwingJInternalFrame);

						productoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.modeloproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonParametroInventarioDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,ModeloProducto modeloproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormModeloProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modeloproducto = (ModeloProducto)this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.modeloproducto = (ModeloProducto)this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(modeloproducto!=null) {
						this.modeloproducto = modeloproducto;
					} else {
						this.modeloproducto = new ModeloProducto();
					}
				}

				if(this.isTienePermisosParametroInventarioDefecto && this.permiteMantenimiento(this.modeloproducto)) {
					ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFramePopup=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFramePopup;
					} else {
						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame;
					}

					List<ModeloProducto> modeloproductos=new ArrayList<ModeloProducto>();
					modeloproductos.add(this.modeloproducto);
					if(!esRelacionado) {
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setConGuardarRelaciones(false);
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormModeloProducto.cargarParametroInventarioDefectoBeanSwingJInternalFrame(modeloproductos,this.modeloproducto,parametroinventariodefectoBeanSwingJInternalFrame,/*conInicializar,*/parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getConGuardarRelaciones(),parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("no_relacionado");

						parametroinventariodefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametroinventariodefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderModeloProducto=(TitledBorder)this.jScrollPanelDatosModeloProducto.getBorder();
						TitledBorder titledBorderParametroInventarioDefecto=(TitledBorder)parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getBorder();

						titledBorderParametroInventarioDefecto.setTitle(titledBorderModeloProducto.getTitle() + " -> Parametro Inventario Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametroinventariodefectoBeanSwingJInternalFrame);
						}

						parametroinventariodefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametroinventariodefectoBeanSwingJInternalFrame);

						parametroinventariodefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.modeloproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Inventario Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualModeloProducto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoModeloProducto.setVisible((this.isVisibilidadCeldaNuevoModeloProducto && this.isPermisoNuevoModeloProducto));			
			this.jButtonDuplicarModeloProducto.setVisible((this.isVisibilidadCeldaDuplicarModeloProducto && this.isPermisoDuplicarModeloProducto));			
			this.jButtonCopiarModeloProducto.setVisible((this.isVisibilidadCeldaCopiarModeloProducto && this.isPermisoCopiarModeloProducto));
			this.jButtonVerFormModeloProducto.setVisible((this.isVisibilidadCeldaVerFormModeloProducto && this.isPermisoVerFormModeloProducto));
			
			this.jButtonAbrirOrderByModeloProducto.setVisible((this.isVisibilidadCeldaOrdenModeloProducto && this.isPermisoOrdenModeloProducto));			
			
			this.jButtonNuevoRelacionesModeloProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesModeloProducto && this.isPermisoNuevoModeloProducto));			
			this.jButtonNuevoGuardarCambiosModeloProducto.setVisible((this.isVisibilidadCeldaNuevoModeloProducto && this.isPermisoNuevoModeloProducto && this.isPermisoGuardarCambiosModeloProducto));
			
			if(this.jInternalFrameDetalleFormModeloProducto!=null) {
			this.jInternalFrameDetalleFormModeloProducto.jButtonModificarModeloProducto.setVisible((this.isVisibilidadCeldaModificarModeloProducto && this.isPermisoActualizarModeloProducto));	
			this.jInternalFrameDetalleFormModeloProducto.jButtonActualizarModeloProducto.setVisible((this.isVisibilidadCeldaActualizarModeloProducto && this.isPermisoActualizarModeloProducto));	
			this.jInternalFrameDetalleFormModeloProducto.jButtonEliminarModeloProducto.setVisible((this.isVisibilidadCeldaEliminarModeloProducto && this.isPermisoEliminarModeloProducto));
			this.jInternalFrameDetalleFormModeloProducto.jButtonCancelarModeloProducto.setVisible(this.isVisibilidadCeldaCancelarModeloProducto);							
			this.jInternalFrameDetalleFormModeloProducto.jButtonGuardarCambiosModeloProducto.setVisible((this.isVisibilidadCeldaGuardarModeloProducto && this.isPermisoGuardarCambiosModeloProducto));			
			
			}
						
			this.jButtonGuardarCambiosTablaModeloProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosModeloProducto && this.isPermisoGuardarCambiosModeloProducto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarModeloProducto.setVisible((this.isVisibilidadCeldaNuevoModeloProducto && this.isPermisoNuevoModeloProducto));						
			this.jButtonDuplicarToolBarModeloProducto.setVisible((this.isVisibilidadCeldaDuplicarModeloProducto && this.isPermisoDuplicarModeloProducto));						
			this.jButtonCopiarToolBarModeloProducto.setVisible((this.isVisibilidadCeldaCopiarModeloProducto && this.isPermisoCopiarModeloProducto));			
			this.jButtonVerFormToolBarModeloProducto.setVisible((this.isVisibilidadCeldaVerFormModeloProducto && this.isPermisoVerFormModeloProducto));			
			this.jButtonAbrirOrderByToolBarModeloProducto.setVisible((this.isVisibilidadCeldaOrdenModeloProducto && this.isPermisoOrdenModeloProducto));
			this.jButtonNuevoRelacionesToolBarModeloProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesModeloProducto && this.isPermisoNuevoModeloProducto));			
			this.jButtonNuevoGuardarCambiosToolBarModeloProducto.setVisible((this.isVisibilidadCeldaNuevoModeloProducto && this.isPermisoNuevoModeloProducto && this.isPermisoGuardarCambiosModeloProducto));			
			
			if(this.jInternalFrameDetalleFormModeloProducto!=null) {
			this.jInternalFrameDetalleFormModeloProducto.jButtonModificarToolBarModeloProducto.setVisible((this.isVisibilidadCeldaModificarModeloProducto && this.isPermisoActualizarModeloProducto));	
			this.jInternalFrameDetalleFormModeloProducto.jButtonActualizarToolBarModeloProducto.setVisible((this.isVisibilidadCeldaActualizarModeloProducto  && this.isPermisoActualizarModeloProducto));	
			this.jInternalFrameDetalleFormModeloProducto.jButtonEliminarToolBarModeloProducto.setVisible((this.isVisibilidadCeldaEliminarModeloProducto && this.isPermisoEliminarModeloProducto));
			this.jInternalFrameDetalleFormModeloProducto.jButtonCancelarToolBarModeloProducto.setVisible(this.isVisibilidadCeldaCancelarModeloProducto);				
			this.jInternalFrameDetalleFormModeloProducto.jButtonGuardarCambiosToolBarModeloProducto.setVisible((this.isVisibilidadCeldaGuardarModeloProducto && this.isPermisoGuardarCambiosModeloProducto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarModeloProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosModeloProducto && this.isPermisoGuardarCambiosModeloProducto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoModeloProducto.setVisible((this.isVisibilidadCeldaNuevoModeloProducto && this.isPermisoNuevoModeloProducto));			
			this.jMenuItemDuplicarModeloProducto.setVisible((this.isVisibilidadCeldaDuplicarModeloProducto && this.isPermisoDuplicarModeloProducto));			
			this.jMenuItemCopiarModeloProducto.setVisible((this.isVisibilidadCeldaCopiarModeloProducto && this.isPermisoCopiarModeloProducto));			
			this.jMenuItemVerFormModeloProducto.setVisible((this.isVisibilidadCeldaVerFormModeloProducto && this.isPermisoVerFormModeloProducto));			
			this.jMenuItemAbrirOrderByModeloProducto.setVisible((this.isVisibilidadCeldaOrdenModeloProducto && this.isPermisoOrdenModeloProducto));			
			//this.jMenuItemMostrarOcultarModeloProducto.setVisible((this.isVisibilidadCeldaOrdenModeloProducto && this.isPermisoOrdenModeloProducto));
			this.jMenuItemDetalleAbrirOrderByModeloProducto.setVisible((this.isVisibilidadCeldaOrdenModeloProducto && this.isPermisoOrdenModeloProducto));			
			//this.jMenuItemDetalleMostrarOcultarModeloProducto.setVisible((this.isVisibilidadCeldaOrdenModeloProducto && this.isPermisoOrdenModeloProducto));			
			this.jMenuItemNuevoRelacionesModeloProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesModeloProducto && this.isPermisoNuevoModeloProducto));			
			this.jMenuItemNuevoGuardarCambiosModeloProducto.setVisible((this.isVisibilidadCeldaNuevoModeloProducto && this.isPermisoNuevoModeloProducto && this.isPermisoGuardarCambiosModeloProducto));									
			
			if(this.jInternalFrameDetalleFormModeloProducto!=null) {
			this.jInternalFrameDetalleFormModeloProducto.jMenuItemModificarModeloProducto.setVisible((this.isVisibilidadCeldaModificarModeloProducto && this.isPermisoActualizarModeloProducto));	
			this.jInternalFrameDetalleFormModeloProducto.jMenuItemActualizarModeloProducto.setVisible((this.isVisibilidadCeldaActualizarModeloProducto && this.isPermisoActualizarModeloProducto));	
			this.jInternalFrameDetalleFormModeloProducto.jMenuItemEliminarModeloProducto.setVisible((this.isVisibilidadCeldaEliminarModeloProducto && this.isPermisoEliminarModeloProducto));
			this.jInternalFrameDetalleFormModeloProducto.jMenuItemCancelarModeloProducto.setVisible(this.isVisibilidadCeldaCancelarModeloProducto);				
			}
			
			this.jMenuItemGuardarCambiosModeloProducto.setVisible((this.isVisibilidadCeldaGuardarModeloProducto && this.isPermisoGuardarCambiosModeloProducto));						
			this.jMenuItemGuardarCambiosTablaModeloProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosModeloProducto && this.isPermisoGuardarCambiosModeloProducto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoModeloProducto=this.jButtonNuevoModeloProducto.isVisible();
			this.isVisibilidadCeldaDuplicarModeloProducto=this.jButtonDuplicarModeloProducto.isVisible();
			this.isVisibilidadCeldaCopiarModeloProducto=this.jButtonCopiarModeloProducto.isVisible();
			this.isVisibilidadCeldaVerFormModeloProducto=this.jButtonVerFormModeloProducto.isVisible();
			
			this.isVisibilidadCeldaOrdenModeloProducto=this.jButtonAbrirOrderByModeloProducto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesModeloProducto=this.jButtonNuevoRelacionesModeloProducto.isVisible();
			this.isVisibilidadCeldaModificarModeloProducto=this.jButtonModificarModeloProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormModeloProducto!=null) {
			this.isVisibilidadCeldaActualizarModeloProducto=this.jInternalFrameDetalleFormModeloProducto.jButtonActualizarModeloProducto.isVisible();
			this.isVisibilidadCeldaEliminarModeloProducto=this.jInternalFrameDetalleFormModeloProducto.jButtonEliminarModeloProducto.isVisible();
			this.isVisibilidadCeldaCancelarModeloProducto=this.jInternalFrameDetalleFormModeloProducto.jButtonCancelarModeloProducto.isVisible();
			this.isVisibilidadCeldaGuardarModeloProducto=this.jInternalFrameDetalleFormModeloProducto.jButtonGuardarCambiosModeloProducto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosModeloProducto=this.jButtonGuardarCambiosTablaModeloProducto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoModeloProducto=this.jButtonNuevoToolBarModeloProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesModeloProducto=this.jButtonNuevoRelacionesToolBarModeloProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormModeloProducto!=null) {
			this.isVisibilidadCeldaModificarModeloProducto=this.jInternalFrameDetalleFormModeloProducto.jButtonModificarToolBarModeloProducto.isVisible();
			this.isVisibilidadCeldaActualizarModeloProducto=this.jInternalFrameDetalleFormModeloProducto.jButtonActualizarToolBarModeloProducto.isVisible();
			this.isVisibilidadCeldaEliminarModeloProducto=this.jInternalFrameDetalleFormModeloProducto.jButtonEliminarToolBarModeloProducto.isVisible();
			this.isVisibilidadCeldaCancelarModeloProducto=this.jInternalFrameDetalleFormModeloProducto.jButtonCancelarToolBarModeloProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarModeloProducto=this.jButtonGuardarCambiosToolBarModeloProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosModeloProducto=this.jButtonGuardarCambiosTablaToolBarModeloProducto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoModeloProducto=this.jMenuItemNuevoModeloProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesModeloProducto=this.jMenuItemNuevoRelacionesModeloProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormModeloProducto!=null) {
			this.isVisibilidadCeldaModificarModeloProducto=this.jInternalFrameDetalleFormModeloProducto.jMenuItemModificarModeloProducto.isVisible();
			this.isVisibilidadCeldaActualizarModeloProducto=this.jInternalFrameDetalleFormModeloProducto.jMenuItemActualizarModeloProducto.isVisible();
			this.isVisibilidadCeldaEliminarModeloProducto=this.jInternalFrameDetalleFormModeloProducto.jMenuItemEliminarModeloProducto.isVisible();
			this.isVisibilidadCeldaCancelarModeloProducto=this.jInternalFrameDetalleFormModeloProducto.jMenuItemCancelarModeloProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarModeloProducto=this.jMenuItemGuardarCambiosModeloProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosModeloProducto=this.jMenuItemGuardarCambiosTablaModeloProducto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesModeloProducto(Boolean esInicializar) {
		if(ModeloProductoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.modeloproductoSessionBean.getConGuardarRelaciones()) {
				//if(this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesModeloProducto();
			}
			
			this.inicializarActualizarBindingBotonesManualModeloProducto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualModeloProducto() {
		this.jButtonNuevoModeloProducto.setVisible(this.isPermisoNuevoModeloProducto);			
		this.jButtonDuplicarModeloProducto.setVisible(this.isPermisoDuplicarModeloProducto);			
		this.jButtonCopiarModeloProducto.setVisible(this.isPermisoCopiarModeloProducto);			
		this.jButtonVerFormModeloProducto.setVisible(this.isPermisoVerFormModeloProducto);			
		
		this.jButtonAbrirOrderByModeloProducto.setVisible(this.isPermisoOrdenModeloProducto);					
		
		this.jButtonNuevoRelacionesModeloProducto.setVisible(this.isPermisoNuevoModeloProducto);			
		
		if(this.jInternalFrameDetalleFormModeloProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModeloProducto.jButtonModificarModeloProducto.setVisible(this.isPermisoActualizarModeloProducto);	
			this.jInternalFrameDetalleFormModeloProducto.jButtonActualizarModeloProducto.setVisible(this.isPermisoActualizarModeloProducto);	
			this.jInternalFrameDetalleFormModeloProducto.jButtonEliminarModeloProducto.setVisible(this.isPermisoEliminarModeloProducto);
			this.jInternalFrameDetalleFormModeloProducto.jButtonCancelarModeloProducto.setVisible(this.isVisibilidadCeldaCancelarModeloProducto);						
			this.jInternalFrameDetalleFormModeloProducto.jButtonGuardarCambiosModeloProducto.setVisible(this.isPermisoGuardarCambiosModeloProducto);							
		}
		
		this.jButtonGuardarCambiosTablaModeloProducto.setVisible(this.isPermisoActualizarModeloProducto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleModeloProducto() {
		this.jInternalFrameDetalleFormModeloProducto.jButtonModificarModeloProducto.setVisible(this.isPermisoActualizarModeloProducto);	
		this.jInternalFrameDetalleFormModeloProducto.jButtonActualizarModeloProducto.setVisible(this.isPermisoActualizarModeloProducto);	
		this.jInternalFrameDetalleFormModeloProducto.jButtonEliminarModeloProducto.setVisible(this.isPermisoEliminarModeloProducto);
		this.jInternalFrameDetalleFormModeloProducto.jButtonCancelarModeloProducto.setVisible(this.isVisibilidadCeldaCancelarModeloProducto);							
		this.jInternalFrameDetalleFormModeloProducto.jButtonGuardarCambiosModeloProducto.setVisible((this.isVisibilidadCeldaGuardarModeloProducto && this.isPermisoGuardarCambiosModeloProducto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosModeloProducto() {
		if(ModeloProductoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualModeloProducto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesModeloProducto() {
	}
	
	public void jTableDatosModeloProductoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarModeloProducto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidModeloProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModeloProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModeloProducto(this.getmodeloproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModeloProducto(this.modeloproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modeloproducto =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modeloproducto =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modeloproducto==null) {
						this.modeloproducto = new ModeloProducto();
					}

					this.setVariablesFormularioToObjetoActualModeloProducto(this.modeloproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModeloProducto(this.modeloproducto);
				}

				if(this.modeloproducto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.modeloproducto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModeloProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaModeloProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebModeloProducto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModeloProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosModeloProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosModeloProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproducto =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.modeloproducto =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualModeloProducto(this.getmodeloproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysModeloProducto(this.modeloproducto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.modeloproductoLogic.getConnexion());

				if(this.modeloproducto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.modeloproducto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderModeloProducto=(TitledBorder)this.jScrollPanelDatosModeloProducto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderModeloProducto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaModeloProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModeloProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModeloProducto(this.getmodeloproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModeloProducto(this.modeloproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modeloproducto =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modeloproducto =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modeloproducto==null) {
						this.modeloproducto = new ModeloProducto();
					}

					this.setVariablesFormularioToObjetoActualModeloProducto(this.modeloproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModeloProducto(this.modeloproducto);
				}

				if(this.modeloproducto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.modeloproducto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModeloProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_productoModeloProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoproducto=true;

			idTienePermisotipoproducto=this.tienePermisosUsuarioEnPaginaWebModeloProducto(TipoProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModeloProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosModeloProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosModeloProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproducto =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.modeloproducto =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualModeloProducto(this.getmodeloproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysModeloProducto(this.modeloproducto);

				this.tipoproductoBeanSwingJInternalFrame=new TipoProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoproductoBeanSwingJInternalFrame.getTipoProductoLogic().setConnexion(this.modeloproductoLogic.getConnexion());

				if(this.modeloproducto.getid_tipo_producto()!=null) {
					this.tipoproductoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoproductoBeanSwingJInternalFrame.setIdActual(this.modeloproducto.getid_tipo_producto());
					this.tipoproductoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoproductoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoProducto();
				}

				JInternalFrameBase jinternalFrame =this.tipoproductoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderModeloProducto=(TitledBorder)this.jScrollPanelDatosModeloProducto.getBorder();
				TitledBorder titledBordertipoproducto=(TitledBorder)this.tipoproductoBeanSwingJInternalFrame.jScrollPanelDatosTipoProducto.getBorder();

				titledBordertipoproducto.setTitle(titledBorderModeloProducto.getTitle() + " -> Tipo Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_productoModeloProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModeloProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModeloProducto(this.getmodeloproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModeloProducto(this.modeloproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modeloproducto =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modeloproducto =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modeloproducto==null) {
						this.modeloproducto = new ModeloProducto();
					}

					this.setVariablesFormularioToObjetoActualModeloProducto(this.modeloproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModeloProducto(this.modeloproducto);
				}

				if(this.modeloproducto.getid_tipo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_producto = "+this.modeloproducto.getid_tipo_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModeloProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoModeloProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModeloProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModeloProducto(this.getmodeloproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModeloProducto(this.modeloproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modeloproducto =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modeloproducto =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modeloproducto==null) {
						this.modeloproducto = new ModeloProducto();
					}

					this.setVariablesFormularioToObjetoActualModeloProducto(this.modeloproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModeloProducto(this.modeloproducto);
				}

				if(this.modeloproducto.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.modeloproducto.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModeloProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreModeloProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModeloProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModeloProducto(this.getmodeloproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModeloProducto(this.modeloproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modeloproducto =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modeloproducto =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modeloproducto==null) {
						this.modeloproducto = new ModeloProducto();
					}

					this.setVariablesFormularioToObjetoActualModeloProducto(this.modeloproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModeloProducto(this.modeloproducto);
				}

				if(this.modeloproducto.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.modeloproducto.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModeloProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoModeloProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingModeloProducto(false,false);

			this.getModeloProductosBusquedaPorCodigo();

			this.inicializarActualizarBindingModeloProducto(false);

			//if(ModeloProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingModeloProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreModeloProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingModeloProducto(false,false);

			this.getModeloProductosBusquedaPorNombre();

			this.inicializarActualizarBindingModeloProducto(false);

			//if(ModeloProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingModeloProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaModeloProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingModeloProducto(false,false);

			this.getModeloProductosFK_IdEmpresa();

			this.inicializarActualizarBindingModeloProducto(false);

			//if(ModeloProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingModeloProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoProductoModeloProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingModeloProducto(false,false);

			this.getModeloProductosFK_IdTipoProducto();

			this.inicializarActualizarBindingModeloProducto(false);

			//if(ModeloProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingModeloProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modeloproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameModeloProducto() {
		if(this.jInternalFrameDetalleFormModeloProducto!=null) {
		

		if(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormModeloProducto!=null) {
			this.jInternalFrameDetalleFormModeloProducto.setVisible(false);	    			
			this.jInternalFrameDetalleFormModeloProducto.dispose();
			this.jInternalFrameDetalleFormModeloProducto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoModeloProducto!=null) {
			this.jInternalFrameReporteDinamicoModeloProducto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoModeloProducto.dispose();
			this.jInternalFrameReporteDinamicoModeloProducto=null;
		}
		
		if(this.jInternalFrameImportacionModeloProducto!=null) {
			this.jInternalFrameImportacionModeloProducto.setVisible(false);	    			
			this.jInternalFrameImportacionModeloProducto.dispose();
			this.jInternalFrameImportacionModeloProducto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessModeloProducto();
			
			ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
			
			
			if(sTipo.equals("NuevoModeloProducto")) {
				jButtonNuevoModeloProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarModeloProducto")) {
				jButtonDuplicarModeloProductoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarModeloProducto")) {
				jButtonCopiarModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormModeloProducto")) {
				jButtonVerFormModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarModeloProducto")) {
				jButtonNuevoModeloProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarModeloProducto")) {
				jButtonDuplicarModeloProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoModeloProducto")) {
				jButtonNuevoModeloProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarModeloProducto")) {
				jButtonDuplicarModeloProductoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesModeloProducto")) {
				jButtonNuevoModeloProductoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarModeloProducto")) {
				jButtonNuevoModeloProductoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesModeloProducto")) {
				jButtonNuevoModeloProductoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarModeloProducto")) {
				jButtonModificarModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarModeloProducto")) {
				jButtonModificarModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarModeloProducto")) {
				jButtonModificarModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarModeloProducto")) {
				jButtonActualizarModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarModeloProducto")) {
				jButtonActualizarModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarModeloProducto")) {
				jButtonActualizarModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarModeloProducto")) {
				jButtonEliminarModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarModeloProducto")) {
				jButtonEliminarModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarModeloProducto")) {
				jButtonEliminarModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarModeloProducto")) {
				jButtonCancelarModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarModeloProducto")) {
				jButtonCancelarModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarModeloProducto")) {
				jButtonCancelarModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarModeloProducto")) {
				jButtonCerrarModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarModeloProducto")) {
				jButtonCerrarModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarModeloProducto")) {
				jButtonCerrarModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarModeloProducto")) {
				jButtonMostrarOcultarModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarModeloProducto")) {
				jButtonCancelarModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosModeloProducto")) {
				jButtonGuardarCambiosModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarModeloProducto")) {
				jButtonGuardarCambiosModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarModeloProducto")) {
				jButtonCopiarModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarModeloProducto")) {
				jButtonVerFormModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosModeloProducto")) {
				jButtonGuardarCambiosModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarModeloProducto")) {
				jButtonCopiarModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormModeloProducto")) {
				jButtonVerFormModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaModeloProducto")) {
				jButtonGuardarCambiosModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarModeloProducto")) {
				jButtonGuardarCambiosModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaModeloProducto")) {
				jButtonGuardarCambiosModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionModeloProducto")) {
				jButtonRecargarInformacionModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarModeloProducto")) {
				jButtonRecargarInformacionModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionModeloProducto")) {
				jButtonRecargarInformacionModeloProductoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresModeloProducto")) {
				jButtonAnterioresModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarModeloProducto")) {
				jButtonAnterioresModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreModeloProducto")) {
				jButtonAnterioresModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesModeloProducto")) {
				jButtonSiguientesModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarModeloProducto")) {
				jButtonSiguientesModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesModeloProducto")) {
				jButtonSiguientesModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByModeloProducto") || sTipo.equals("MenuItemDetalleAbrirOrderByModeloProducto")) {
				jButtonAbrirOrderByModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarModeloProducto") || sTipo.equals("MenuItemDetalleMostrarOcultarModeloProducto")) {
				jButtonMostrarOcultarModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosModeloProducto")) {
				jButtonNuevoGuardarCambiosModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarModeloProducto")) {
				jButtonNuevoGuardarCambiosModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosModeloProducto")) {
				jButtonNuevoGuardarCambiosModeloProductoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoModeloProducto")) {
				jButtonCerrarReporteDinamicoModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoModeloProducto")) {
				jButtonGenerarReporteDinamicoModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoModeloProducto")) {
				
				jButtonGenerarExcelReporteDinamicoModeloProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionModeloProducto")) {
				jButtonCerrarImportacionModeloProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionModeloProducto")) {
				
				jButtonGenerarImportacionModeloProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionModeloProducto")) {
				
				jButtonAbrirImportacionModeloProductoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesModeloProducto")) {
				jComboBoxTiposAccionesModeloProductoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesModeloProducto")) {
				jComboBoxTiposRelacionesModeloProductoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioModeloProducto")) {
				jComboBoxTiposAccionesModeloProductoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarModeloProducto")) {
				
				jComboBoxTiposSeleccionarModeloProductoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralModeloProducto")) {
				jTextFieldValorCampoGeneralModeloProductoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByModeloProducto")) {
				jButtonAbrirOrderByModeloProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarModeloProducto")) {
				jButtonAbrirOrderByModeloProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByModeloProducto")) {
				jButtonCerrarOrderByModeloProductoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idModeloProductoBusqueda")) {
				this.jButtonidModeloProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaModeloProductoUpdate")) {
				this.jButtonid_empresaModeloProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaModeloProductoBusqueda")) {
				this.jButtonid_empresaModeloProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_productoModeloProductoUpdate")) {
				this.jButtonid_tipo_productoModeloProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_productoModeloProductoBusqueda")) {
				this.jButtonid_tipo_productoModeloProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoModeloProductoBusqueda")) {
				this.jButtoncodigoModeloProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreModeloProductoBusqueda")) {
				this.jButtonnombreModeloProductoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoModeloProducto")) {
				this.jButtonBusquedaPorCodigoModeloProductoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreModeloProducto")) {
				this.jButtonBusquedaPorNombreModeloProductoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoProductoModeloProducto")) {
				this.jButtonFK_IdTipoProductoModeloProductoActionPerformed(evt);
			}
			
			;
			
			
			ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessModeloProducto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaModeloProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modeloproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modeloproducto);
				
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
				
				


				
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ModeloProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ModeloProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ModeloProducto modeloproductoLocal=null;
			
			if(!this.getEsControlTabla()) {
				modeloproductoLocal=this.modeloproducto;
			} else {
				modeloproductoLocal=this.modeloproductoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modeloproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modeloproducto);
				
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
							
				
				


				
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ModeloProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ModeloProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaModeloProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosModeloProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoAnterior =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.modeloproductoAnterior =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
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
			
			ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
			
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
			
			


			
			ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaModeloProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modeloproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modeloproducto);
				
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
								
						
				


				
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ModeloProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ModeloProducto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modeloproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modeloproducto);
				
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
								
				
				


				
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ModeloProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ModeloProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaModeloProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosModeloProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoAnterior =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.modeloproductoAnterior =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modeloproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modeloproducto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaModeloProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosModeloProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoAnterior =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.modeloproductoAnterior =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaModeloProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.modeloproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.modeloproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modeloproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modeloproducto);
				
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
							
				
				


				
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ModeloProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ModeloProducto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaModeloProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosModeloProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modeloproductoAnterior =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.modeloproductoAnterior =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
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
			
			ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
			
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
			
			


			
			ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaModeloProductoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.modeloproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.modeloproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modeloproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modeloproducto);
				
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
								
				
				


				
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ModeloProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ModeloProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaModeloProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosModeloProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoAnterior =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.modeloproductoAnterior =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaModeloProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.modeloproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.modeloproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaModeloProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modeloproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modeloproducto);
				
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosModeloProducto")) {
					jCheckBoxSeleccionarTodosModeloProductoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosModeloProducto")) {
					jCheckBoxSeleccionadosModeloProductoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarModeloProducto")) {
					
				}
				
				


				
				
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ModeloProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ModeloProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.modeloproducto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.modeloproducto);
				
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
												
				
				


				
				
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ModeloProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ModeloProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaModeloProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosModeloProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modeloproductoAnterior =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.modeloproductoAnterior =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaModeloProductoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modeloproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modeloproducto);
				
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
				
				
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
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
			
			ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
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
			
			


			
			ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaModeloProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modeloproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modeloproducto);
				
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ModeloProducto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ModeloProducto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modeloproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modeloproducto);
				
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
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
				
				


				
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ModeloProducto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ModeloProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaModeloProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosModeloProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modeloproductoAnterior =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.modeloproductoAnterior =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarModeloProducto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosModeloProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosModeloProducto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.modeloproducto =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.modeloproducto =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.modeloproducto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarModeloProducto")) {
				
				}
				
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarModeloProducto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosModeloProducto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarModeloProducto")) {
			
			}
			
			ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessModeloProducto();
			
			ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
			
			if(sTipo.equals("NuevoModeloProducto")) {
				jButtonNuevoModeloProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarModeloProducto")) {
				jButtonDuplicarModeloProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarModeloProducto")) {
				jButtonCopiarModeloProductoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormModeloProducto")) {
				jButtonVerFormModeloProductoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesModeloProducto")) {
				jButtonNuevoModeloProductoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarModeloProducto")) {
				jButtonModificarModeloProductoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarModeloProducto")) {
				jButtonActualizarModeloProductoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarModeloProducto")) {
				jButtonEliminarModeloProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaModeloProducto")) {
				jButtonGuardarCambiosModeloProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarModeloProducto")) {
				jButtonCancelarModeloProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarModeloProducto")) {
				jButtonCerrarModeloProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosModeloProducto")) {
				jButtonGuardarCambiosModeloProductoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosModeloProducto")) {
				jButtonNuevoGuardarCambiosModeloProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByModeloProducto")) {
				jButtonAbrirOrderByModeloProductoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionModeloProducto")) {
				jButtonRecargarInformacionModeloProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresModeloProducto")) {
				jButtonAnterioresModeloProductoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesModeloProducto")) {
				jButtonSiguientesModeloProductoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idModeloProductoBusqueda")) {
				this.jButtonidModeloProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaModeloProductoUpdate")) {
				this.jButtonid_empresaModeloProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaModeloProductoBusqueda")) {
				this.jButtonid_empresaModeloProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_productoModeloProductoUpdate")) {
				this.jButtonid_tipo_productoModeloProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_productoModeloProductoBusqueda")) {
				this.jButtonid_tipo_productoModeloProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoModeloProductoBusqueda")) {
				this.jButtoncodigoModeloProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreModeloProductoBusqueda")) {
				this.jButtonnombreModeloProductoBusquedaActionPerformed(evt);
			}
			
			ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessModeloProducto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameModeloProducto")) {
				closingInternalFrameModeloProducto();
				
			} else if(sTipo.equals("jButtonCancelarModeloProducto")) {
				JInternalFrameBase jInternalFrameDetalleFormModeloProducto = (JInternalFrameBase)evt.getSource();
	            	
	            ModeloProductoBeanSwingJInternalFrame jInternalFrameParent=(ModeloProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormModeloProducto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarModeloProductoActionPerformed(null);
			}
			
			ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.modeloproducto,new Object(),this.modeloproductoParameterGeneral,this.modeloproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormModeloProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormModeloProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormModeloProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.modeloproducto)) {
			if(!esControlTabla) {
				if(ModeloProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualModeloProducto(this.modeloproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysModeloProducto(this.modeloproducto);			
				}
				
				if(this.modeloproductoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualModeloProducto(this.modeloproducto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.modeloproductoReturnGeneral=modeloproductoLogic.procesarEventosModeloProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.modeloproductoLogic.getModeloProductos(),this.modeloproducto,this.modeloproductoParameterGeneral,this.isEsNuevoModeloProducto,classes);//this.modeloproductoLogic.getModeloProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanModeloProducto(this.modeloproductoReturnGeneral,this.modeloproductoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.modeloproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanModeloProducto(classes,this.modeloproductoReturnGeneral,this.modeloproductoBean,false);
					}
						
					if(this.modeloproductoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyModeloProducto(this.modeloproductoReturnGeneral.getModeloProducto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioModeloProducto(this.modeloproductoReturnGeneral.getModeloProducto());	
					}
						
					if(this.modeloproductoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioModeloProducto(this.modeloproductoReturnGeneral.getModeloProducto(),classes);//this.modeloproductoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioModeloProducto(this.modeloproducto,classes);//this.modeloproductoBean);									
				}
			
				if(ModeloProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualModeloProducto(this.modeloproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysModeloProducto(this.modeloproducto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.modeloproductoAnterior!=null) {
						this.modeloproducto=this.modeloproductoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.modeloproductoReturnGeneral=modeloproductoLogic.procesarEventosModeloProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.modeloproductoLogic.getModeloProductos(),this.modeloproducto,this.modeloproductoParameterGeneral,this.isEsNuevoModeloProducto,classes);//this.modeloproductoLogic.getModeloProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.modeloproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.modeloproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.modeloproductoReturnGeneral.getModeloProducto(),modeloproductoLogic.getModeloProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.modeloproductoReturnGeneral.getModeloProducto(),this.modeloproductos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosModeloProducto.repaint();
				
				//((AbstractTableModel) this.jTableDatosModeloProducto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosModeloProducto();
			}
		}
	}
	
	public void actualizarVisualTableDatosModeloProducto() throws Exception {
		
		ModeloProductoModel modeloproductoModel=(ModeloProductoModel)this.jTableDatosModeloProducto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			modeloproductoModel.modeloproductos=this.modeloproductoLogic.getModeloProductos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			modeloproductoModel.modeloproductos=this.modeloproductos;
		}
		
		
		((ModeloProductoModel) this.jTableDatosModeloProducto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaModeloProducto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getmodeloproductoAnterior(),this.modeloproductoLogic.getModeloProductos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getmodeloproductoAnterior(),this.modeloproductos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosModeloProducto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioModeloProducto(ModeloProducto modeloproducto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(modeloproducto.getProductos());
					this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(modeloproducto.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
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
										
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.modeloproducto,new Object(),generalEntityParameterGeneral,this.modeloproductoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.modeloproductoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ModeloProductoConstantesFunciones.getClassesRelationshipsOfModeloProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ModeloProductoConstantesFunciones.getClassesRelationshipsFromStringsOfModeloProducto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormModeloProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ModeloProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.modeloproducto,new Object(),generalEntityParameterGeneral,this.modeloproductoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioModeloProducto(ModeloProductoBean modeloproductoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(modeloproducto.getProductos());
					this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(modeloproducto.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanModeloProducto(ArrayList<Classe> classes,ModeloProductoReturnGeneral modeloproductoReturnGeneral,ModeloProductoBean modeloproductoBean,Boolean conDefault) throws Exception {
		
			this.modeloproductoBean.setProductos(modeloproductoReturnGeneral.getModeloProducto().getProductos());
			this.modeloproductoBean.setParametroInventarioDefectos(modeloproductoReturnGeneral.getModeloProducto().getParametroInventarioDefectos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualModeloProducto(ModeloProducto modeloproducto,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					modeloproducto.setProductos(this.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					modeloproducto.setParametroInventarioDefectos(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.modeloproducto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormModeloProducto = new ModeloProductoDetalleFormJInternalFrame(jDesktopPane,this.modeloproductoSessionBean.getConGuardarRelaciones(),this.modeloproductoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormModeloProducto);
		this.jInternalFrameDetalleFormModeloProducto.setVisible(false);
		this.jInternalFrameDetalleFormModeloProducto.setSelected(false);						
		
		this.jInternalFrameDetalleFormModeloProducto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormModeloProducto.modeloproductoLogic=this.modeloproductoLogic;
		
		this.cargarCombosFrameForeignKeyModeloProducto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleModeloProducto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleModeloProducto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyModeloProducto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyModeloProducto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormModeloProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarModeloProducto"));
		
		this.jInternalFrameDetalleFormModeloProducto.jButtonModificarModeloProducto.addActionListener(new ButtonActionListener(this,"ModificarModeloProducto"));

		
		this.jInternalFrameDetalleFormModeloProducto.jButtonModificarToolBarModeloProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarModeloProducto"));
					
		this.jInternalFrameDetalleFormModeloProducto.jMenuItemModificarModeloProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarModeloProducto"));		
		
		
		
		this.jInternalFrameDetalleFormModeloProducto.jButtonActualizarModeloProducto.addActionListener (new ButtonActionListener(this,"ActualizarModeloProducto"));
		
		
		this.jInternalFrameDetalleFormModeloProducto.jButtonActualizarToolBarModeloProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarModeloProducto"));
						
		this.jInternalFrameDetalleFormModeloProducto.jMenuItemActualizarModeloProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarModeloProducto"));		
		
		
		
		this.jInternalFrameDetalleFormModeloProducto.jButtonEliminarModeloProducto.addActionListener (new ButtonActionListener(this,"EliminarModeloProducto"));
		
		
		this.jInternalFrameDetalleFormModeloProducto.jButtonEliminarToolBarModeloProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarModeloProducto"));
								
		this.jInternalFrameDetalleFormModeloProducto.jMenuItemEliminarModeloProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarModeloProducto"));		
		
		
		
		this.jInternalFrameDetalleFormModeloProducto.jButtonCancelarModeloProducto.addActionListener (new ButtonActionListener(this,"CancelarModeloProducto"));
		
		
		this.jInternalFrameDetalleFormModeloProducto.jButtonCancelarToolBarModeloProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarModeloProducto"));
					
		this.jInternalFrameDetalleFormModeloProducto.jMenuItemCancelarModeloProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarModeloProducto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormModeloProducto.jMenuItemDetalleCerrarModeloProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarModeloProducto"));		
		
		
		
		this.jInternalFrameDetalleFormModeloProducto.jButtonGuardarCambiosToolBarModeloProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarModeloProducto"));
		
		
		
		this.jInternalFrameDetalleFormModeloProducto.jButtonGuardarCambiosToolBarModeloProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarModeloProducto"));
		
		
		
		this.jInternalFrameDetalleFormModeloProducto.jComboBoxTiposAccionesFormularioModeloProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioModeloProducto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModeloProducto.jButtonidModeloProductoBusqueda.addActionListener(new ButtonActionListener(this,"idModeloProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModeloProducto.jButtonid_empresaModeloProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaModeloProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModeloProducto.jButtonid_empresaModeloProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaModeloProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModeloProducto.jButtonid_tipo_productoModeloProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_productoModeloProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModeloProducto.jButtonid_tipo_productoModeloProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_productoModeloProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModeloProducto.jButtoncodigoModeloProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoModeloProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModeloProducto.jButtonnombreModeloProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreModeloProductoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormModeloProducto.jTabbedPaneRelacionesModeloProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesModeloProducto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameModeloProducto"));
		
		if(this.jInternalFrameDetalleFormModeloProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModeloProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarModeloProducto"));
		}
		
		this.jTableDatosModeloProducto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarModeloProducto"));
		
		this.jTableDatosModeloProducto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarModeloProducto"));
		
		this.jButtonNuevoModeloProducto.addActionListener(new ButtonActionListener(this,"NuevoModeloProducto"));
		
		this.jButtonDuplicarModeloProducto.addActionListener(new ButtonActionListener(this,"DuplicarModeloProducto"));
		
		this.jButtonCopiarModeloProducto.addActionListener(new ButtonActionListener(this,"CopiarModeloProducto"));
		
		this.jButtonVerFormModeloProducto.addActionListener(new ButtonActionListener(this,"VerFormModeloProducto"));
		
		
		this.jButtonNuevoToolBarModeloProducto.addActionListener(new ButtonActionListener(this,"NuevoToolBarModeloProducto"));
			
		this.jButtonDuplicarToolBarModeloProducto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarModeloProducto"));
			
		this.jMenuItemNuevoModeloProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoModeloProducto"));
			
		this.jMenuItemDuplicarModeloProducto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarModeloProducto"));		
		
		
		this.jButtonNuevoRelacionesModeloProducto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesModeloProducto"));
		
		
		this.jButtonNuevoRelacionesToolBarModeloProducto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarModeloProducto"));
			
		this.jMenuItemNuevoRelacionesModeloProducto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesModeloProducto"));		
		
		
		if(this.jInternalFrameDetalleFormModeloProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModeloProducto.jButtonModificarModeloProducto.addActionListener(new ButtonActionListener(this,"ModificarModeloProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormModeloProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModeloProducto.jButtonModificarToolBarModeloProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarModeloProducto"));
			
			this.jInternalFrameDetalleFormModeloProducto.jMenuItemModificarModeloProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarModeloProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormModeloProducto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormModeloProducto.jButtonActualizarModeloProducto.addActionListener (new ButtonActionListener(this,"ActualizarModeloProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormModeloProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModeloProducto.jButtonActualizarToolBarModeloProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarModeloProducto"));
				
			this.jInternalFrameDetalleFormModeloProducto.jMenuItemActualizarModeloProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarModeloProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormModeloProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModeloProducto.jButtonEliminarModeloProducto.addActionListener (new ButtonActionListener(this,"EliminarModeloProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormModeloProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModeloProducto.jButtonEliminarToolBarModeloProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarModeloProducto"));
						
			this.jInternalFrameDetalleFormModeloProducto.jMenuItemEliminarModeloProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarModeloProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormModeloProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModeloProducto.jButtonCancelarModeloProducto.addActionListener (new ButtonActionListener(this,"CancelarModeloProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormModeloProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModeloProducto.jButtonCancelarToolBarModeloProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarModeloProducto"));
			
			this.jInternalFrameDetalleFormModeloProducto.jMenuItemCancelarModeloProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarModeloProducto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarModeloProducto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarModeloProducto"));		
		
		
		this.jButtonCerrarModeloProducto.addActionListener (new ButtonActionListener(this,"CerrarModeloProducto"));
		
		
		this.jButtonCerrarToolBarModeloProducto.addActionListener (new ButtonActionListener(this,"CerrarToolBarModeloProducto"));
			
		this.jMenuItemCerrarModeloProducto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarModeloProducto"));
			
		if(this.jInternalFrameDetalleFormModeloProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModeloProducto.jMenuItemDetalleCerrarModeloProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarModeloProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormModeloProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModeloProducto.jButtonGuardarCambiosModeloProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosModeloProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormModeloProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModeloProducto.jButtonGuardarCambiosToolBarModeloProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarModeloProducto"));
		}
		
		this.jButtonCopiarToolBarModeloProducto.addActionListener (new ButtonActionListener(this,"CopiarToolBarModeloProducto"));
			
		this.jButtonVerFormToolBarModeloProducto.addActionListener (new ButtonActionListener(this,"VerFormToolBarModeloProducto"));
		
		this.jMenuItemGuardarCambiosModeloProducto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosModeloProducto"));
			
		this.jMenuItemCopiarModeloProducto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarModeloProducto"));		
		
		this.jMenuItemVerFormModeloProducto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormModeloProducto"));		
		
		
		this.jButtonGuardarCambiosTablaModeloProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaModeloProducto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarModeloProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarModeloProducto"));
			
		this.jMenuItemGuardarCambiosTablaModeloProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaModeloProducto"));		
		
		
		
		this.jButtonRecargarInformacionModeloProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionModeloProducto"));
					
		this.jButtonRecargarInformacionToolBarModeloProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarModeloProducto"));
		
		this.jMenuItemRecargarInformacionModeloProducto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionModeloProducto"));		
		
		
		
		this.jButtonAnterioresModeloProducto.addActionListener (new ButtonActionListener(this,"AnterioresModeloProducto"));
		
		
		this.jButtonAnterioresToolBarModeloProducto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarModeloProducto"));
		
		this.jMenuItemAnterioresModeloProducto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresModeloProducto"));		
		
		
		this.jButtonSiguientesModeloProducto.addActionListener (new ButtonActionListener(this,"SiguientesModeloProducto"));
		
		
		this.jButtonSiguientesToolBarModeloProducto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarModeloProducto"));
			
		this.jMenuItemSiguientesModeloProducto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesModeloProducto"));
			
		this.jMenuItemAbrirOrderByModeloProducto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByModeloProducto"));
			
		this.jMenuItemMostrarOcultarModeloProducto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarModeloProducto"));
			
		this.jMenuItemDetalleAbrirOrderByModeloProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByModeloProducto"));
			
		this.jMenuItemDetalleMostarOcultarModeloProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarModeloProducto"));		
		
		
		this.jButtonNuevoGuardarCambiosModeloProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosModeloProducto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarModeloProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarModeloProducto"));
			
		this.jMenuItemNuevoGuardarCambiosModeloProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosModeloProducto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosModeloProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosModeloProducto"));

		this.jCheckBoxSeleccionadosModeloProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosModeloProducto"));
		
		if(this.jInternalFrameDetalleFormModeloProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModeloProducto.jComboBoxTiposAccionesFormularioModeloProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioModeloProducto"));
		}
		
		
		this.jComboBoxTiposRelacionesModeloProducto.addActionListener (new ButtonActionListener(this,"TiposRelacionesModeloProducto"));
			
		this.jComboBoxTiposAccionesModeloProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesModeloProducto"));
					
		this.jComboBoxTiposSeleccionarModeloProducto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarModeloProducto"));
			
		this.jTextFieldValorCampoGeneralModeloProducto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralModeloProducto"));		
		
		
		if(this.jInternalFrameDetalleFormModeloProducto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModeloProducto.jButtonidModeloProductoBusqueda.addActionListener(new ButtonActionListener(this,"idModeloProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModeloProducto.jButtonid_empresaModeloProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaModeloProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModeloProducto.jButtonid_empresaModeloProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaModeloProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModeloProducto.jButtonid_tipo_productoModeloProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_productoModeloProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModeloProducto.jButtonid_tipo_productoModeloProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_productoModeloProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModeloProducto.jButtoncodigoModeloProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoModeloProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModeloProducto.jButtonnombreModeloProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreModeloProductoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoModeloProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoModeloProducto"));

			this.jButtonBusquedaPorNombreModeloProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreModeloProducto"));

			this.jButtonFK_IdTipoProductoModeloProducto.addActionListener(new ButtonActionListener(this,"FK_IdTipoProductoModeloProducto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoModeloProducto!=null) {
				this.jInternalFrameReporteDinamicoModeloProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoModeloProducto"));
				this.jInternalFrameReporteDinamicoModeloProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoModeloProducto"));
				this.jInternalFrameReporteDinamicoModeloProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoModeloProducto"));
			}
			
			//this.jButtonCerrarReporteDinamicoModeloProducto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoModeloProducto"));				
			//this.jButtonGenerarReporteDinamicoModeloProducto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoModeloProducto"));
			//this.jButtonGenerarExcelReporteDinamicoModeloProducto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoModeloProducto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionModeloProducto!=null) {
				this.jInternalFrameImportacionModeloProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionModeloProducto"));
				this.jInternalFrameImportacionModeloProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionModeloProducto"));
				this.jInternalFrameImportacionModeloProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionModeloProducto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByModeloProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByModeloProducto"));
			
			this.jButtonAbrirOrderByToolBarModeloProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarModeloProducto"));			
			
			if(this.jInternalFrameOrderByModeloProducto!=null) {
				this.jInternalFrameOrderByModeloProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByModeloProducto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormModeloProducto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormModeloProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModeloProducto.jTabbedPaneRelacionesModeloProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesModeloProducto"));
		
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
            		closingInternalFrameModeloProducto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormModeloProducto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormModeloProducto = (JInternalFrameBase)event.getSource();
	            	
	            ModeloProductoBeanSwingJInternalFrame jInternalFrameParent=(ModeloProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormModeloProducto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarModeloProductoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosModeloProducto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosModeloProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosModeloProducto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosModeloProducto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoModeloProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoModeloProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoModeloProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoModeloProducto";
		inputMap = this.jButtonNuevoModeloProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoModeloProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoModeloProductoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoModeloProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoModeloProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoModeloProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesModeloProducto";
		inputMap = this.jButtonNuevoRelacionesModeloProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesModeloProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoModeloProductoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarModeloProducto";
		inputMap = this.jButtonModificarModeloProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarModeloProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarModeloProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarModeloProducto";
		inputMap = this.jButtonActualizarModeloProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarModeloProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarModeloProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarModeloProducto";
		inputMap = this.jButtonEliminarModeloProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarModeloProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarModeloProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarModeloProducto";
		inputMap = this.jButtonCancelarModeloProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarModeloProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarModeloProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarModeloProducto";
		inputMap = this.jButtonCerrarModeloProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarModeloProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarModeloProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormModeloProducto.jButtonGuardarCambiosModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosModeloProducto";
		inputMap = this.jInternalFrameDetalleFormModeloProducto.jButtonGuardarCambiosModeloProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormModeloProducto.jButtonGuardarCambiosModeloProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosModeloProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosModeloProducto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosModeloProductoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesModeloProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesModeloProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarModeloProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarModeloProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralModeloProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralModeloProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModeloProducto.jButtonidModeloProductoBusqueda.addActionListener(new ButtonActionListener(this,"idModeloProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModeloProducto.jButtonid_empresaModeloProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaModeloProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModeloProducto.jButtonid_empresaModeloProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaModeloProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModeloProducto.jButtonid_tipo_productoModeloProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_productoModeloProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModeloProducto.jButtonid_tipo_productoModeloProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_productoModeloProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModeloProducto.jButtoncodigoModeloProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoModeloProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModeloProducto.jButtonnombreModeloProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreModeloProductoBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoModeloProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoModeloProducto"));

		this.jButtonBusquedaPorNombreModeloProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreModeloProducto"));

		this.jButtonFK_IdTipoProductoModeloProducto.addActionListener(new ButtonActionListener(this,"FK_IdTipoProductoModeloProducto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionModeloProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionModeloProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarModeloProductoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarModeloProducto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosModeloProducto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ModeloProducto modeloproductoAux:this.modeloproductoLogic.getModeloProductos()) {
					modeloproductoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ModeloProducto modeloproductoAux:modeloproductos) {
					modeloproductoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosModeloProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingModeloProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ModeloProducto modeloproductoAux:this.modeloproductoLogic.getModeloProductos()) {
						modeloproductoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ModeloProducto modeloproductoAux:modeloproductos) {
						modeloproductoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ModeloProducto modeloproductoAux:this.modeloproductoLogic.getModeloProductos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ModeloProducto modeloproductoAux:modeloproductos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaModeloProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosModeloProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosModeloProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosModeloProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosModeloProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingModeloProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosModeloProducto.getSelectedRows();
			
			ModeloProducto modeloproductoLocal=new ModeloProducto();
			
			//this.seleccionarTodosModeloProducto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					modeloproductoLocal =(ModeloProducto) this.modeloproductoLogic.getModeloProductos().toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					modeloproductoLocal =(ModeloProducto) this.modeloproductos.toArray()[this.jTableDatosModeloProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				modeloproductoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ModeloProducto modeloproductoAux:this.modeloproductoLogic.getModeloProductos()) {
						modeloproductoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ModeloProducto modeloproductoAux:modeloproductos) {
						modeloproductoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaModeloProducto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosModeloProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosModeloProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosModeloProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualModeloProductoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarModeloProductoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralModeloProductoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingModeloProducto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralModeloProducto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ModeloProducto modeloproductoAux:this.modeloproductoLogic.getModeloProductos()) {
				
						if(sTipoSeleccionar.equals(ModeloProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							modeloproductoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ModeloProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							modeloproductoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ModeloProducto modeloproductoAux:modeloproductos) {
					
						if(sTipoSeleccionar.equals(ModeloProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							modeloproductoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ModeloProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							modeloproductoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaModeloProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesModeloProductoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingModeloProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioModeloProducto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesModeloProducto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormModeloProducto.jComboBoxTiposAccionesFormularioModeloProducto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteModeloProducto) {				
					conSplash=true;//false;										
					
					//this.startProcessModeloProducto(conSplash);
				
					this.generarReporteModeloProductosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesModeloProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormModeloProducto.jComboBoxTiposAccionesFormularioModeloProducto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoModeloProductosSeleccionados();
				//this.jComboBoxTiposAccionesModeloProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoModeloProductosSeleccionados(false);
				//this.jComboBoxTiposAccionesModeloProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoModeloProductosSeleccionados(true);
				//this.jComboBoxTiposAccionesModeloProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessModeloProducto();
				
				this.exportarModeloProductosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesModeloProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormModeloProducto.jComboBoxTiposAccionesFormularioModeloProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionModeloProductos();
				//this.importarModeloProductos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesModeloProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormModeloProducto.jComboBoxTiposAccionesFormularioModeloProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessModeloProducto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelModeloProductosSeleccionados();
				//this.jComboBoxTiposAccionesModeloProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Modelo Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessModeloProducto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoModeloProducto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyModeloProducto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Modelo Producto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesModeloProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormModeloProducto.jComboBoxTiposAccionesFormularioModeloProducto.setSelectedIndex(0);					
				}	
			} 			
			else if(ModeloProductoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteModeloProducto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessModeloProducto(conSplash);
					
						//this.actualizarParametrosGeneralModeloProducto();
						
						this.generarReporteProcesoAccionModeloProductosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesModeloProducto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormModeloProducto.jComboBoxTiposAccionesFormularioModeloProducto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ModeloProductoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Modelo ProductoS SELECCIONADOS?", "MANTENIMIENTO DE Modelo Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessModeloProducto();
				
						this.actualizarParametrosGeneralModeloProducto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.modeloproductoReturnGeneral=modeloproductoLogic.procesarAccionModeloProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.modeloproductoLogic.getModeloProductos(),this.modeloproductoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarModeloProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesModeloProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormModeloProducto.jComboBoxTiposAccionesFormularioModeloProducto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralModeloProducto();
					
					ModeloProductoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarModeloProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesModeloProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormModeloProducto.jComboBoxTiposAccionesFormularioModeloProducto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessModeloProducto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesModeloProductoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessModeloProducto();
			
			if(this.jInternalFrameDetalleFormModeloProducto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ModeloProducto> modeloproductosSeleccionados=new ArrayList<ModeloProducto>();		
			ModeloProducto modeloproducto=new ModeloProducto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingModeloProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesModeloProducto.getSelectedItem();
			
			
			
			
			modeloproductosSeleccionados=this.getModeloProductosSeleccionados(true);
			//this.sTipoAccion;
			
			if(modeloproductosSeleccionados.size()==1) {
				for(ModeloProducto modeloproductoAux:modeloproductosSeleccionados) {
					modeloproducto=modeloproductoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Producto")) {
					jButtonProductoActionPerformed(null,rowIndex,true,false,modeloproducto);
				}
				else if(this.sTipoRelacion.equals("Parametro Inventario Defecto")) {
					jButtonParametroInventarioDefectoActionPerformed(null,rowIndex,true,false,modeloproducto);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessModeloProducto();
			
      		//this.finishProcessModeloProducto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarModeloProductoReturnGeneral() throws Exception {
		if(this.modeloproductoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.modeloproductoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.modeloproductoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.modeloproductoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.modeloproductoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.modeloproductoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingModeloProducto(false);
		}
		
		if(this.modeloproductoReturnGeneral.getConRetornoLista() || this.modeloproductoReturnGeneral.getConRetornoObjeto()) {
			if(this.modeloproductoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.modeloproductoLogic.setModeloProductos(this.modeloproductoReturnGeneral.getModeloProductos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.modeloproductoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.modeloproductoLogic.setModeloProducto(this.modeloproductoReturnGeneral.getModeloProducto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingModeloProducto(false);
		}
	}
	
	public void actualizarParametrosGeneralModeloProducto() throws Exception {
		
		
	}
	
	public ArrayList<ModeloProducto> getModeloProductosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ModeloProducto> modeloproductosSeleccionados=new ArrayList<ModeloProducto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioModeloProducto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ModeloProducto modeloproductoAux:modeloproductoLogic.getModeloProductos()) {
					if(modeloproductoAux.getIsSelected()) {
						modeloproductosSeleccionados.add(modeloproductoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ModeloProducto modeloproductoAux:this.modeloproductos) {
					if(modeloproductoAux.getIsSelected()) {
						modeloproductosSeleccionados.add(modeloproductoAux);				
					}
				}
			}
			
			if(modeloproductosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						modeloproductosSeleccionados.addAll(this.modeloproductoLogic.getModeloProductos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						modeloproductosSeleccionados.addAll(this.modeloproductos);				
					}
				}
			}
		} else {
			modeloproductosSeleccionados.add(this.modeloproducto);
		}
		
		return modeloproductosSeleccionados;
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
	
	public void generarReporteModeloProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalModeloProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoModeloProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoModeloProductosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoModeloProductosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesModeloProductosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Modelo Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesModeloProductosSeleccionados() throws Exception {
		ArrayList<ModeloProducto> modeloproductosSeleccionados=new ArrayList<ModeloProducto>();		
		
		modeloproductosSeleccionados=this.getModeloProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteModeloProductos("Todos",modeloproductosSeleccionados);
		
	}	
	
	public void generarReporteNormalModeloProductosSeleccionados() throws Exception {
		ArrayList<ModeloProducto> modeloproductosSeleccionados=new ArrayList<ModeloProducto>();		
		
		modeloproductosSeleccionados=this.getModeloProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteModeloProductos("Todos",modeloproductosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionModeloProductosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ModeloProducto> modeloproductosSeleccionados=new ArrayList<ModeloProducto>();
		
		modeloproductosSeleccionados=this.getModeloProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteModeloProductos("Todos",modeloproductosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoModeloProductosSeleccionados() throws Exception {
		ArrayList<ModeloProducto> modeloproductosSeleccionados=new ArrayList<ModeloProducto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoModeloProducto();
		
		
		modeloproductosSeleccionados=this.getModeloProductosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoModeloProducto();
		
		
		//this.generarReporteModeloProductos("Todos",modeloproductosSeleccionados ,modeloproductoImplementable,modeloproductoImplementableHome);
	}
	
	public void mostrarImportacionModeloProductos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionModeloProducto();
		
		this.abrirFrameImportacionModeloProducto();		
		
			
		//this.generarReporteModeloProductos("Todos",modeloproductosSeleccionados ,modeloproductoImplementable,modeloproductoImplementableHome);
	}
	
	public void importarModeloProductos() throws Exception {		
	
	}
	
	public void exportarModeloProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelModeloProductosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoModeloProductosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlModeloProductosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Modelo Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoModeloProductosSeleccionados() throws Exception {
		ArrayList<ModeloProducto> modeloproductosSeleccionados=new ArrayList<ModeloProducto>();		
		
		modeloproductosSeleccionados=this.getModeloProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"modeloproducto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarModeloProducto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ModeloProducto modeloproductoAux:modeloproductosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarModeloProducto(modeloproductoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//modeloproductoAux.setsDetalleGeneralEntityReporte(modeloproductoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.modeloproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modelo Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarModeloProducto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ModeloProductoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModeloProductoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModeloProductoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModeloProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModeloProductoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModeloProductoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarModeloProducto(ModeloProducto modeloproducto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=modeloproducto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=modeloproducto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=modeloproducto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modeloproducto.gettipoproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modeloproducto.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modeloproducto.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelModeloProductosSeleccionados() throws Exception {
		ArrayList<ModeloProducto> modeloproductosSeleccionados=new ArrayList<ModeloProducto>();		
		
		modeloproductosSeleccionados=this.getModeloProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"modeloproducto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ModeloProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelModeloProducto(row);				
				iRow++;
			}				
			
			for(ModeloProducto modeloproductoAux:modeloproductosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelModeloProducto(modeloproductoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.modeloproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modelo Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlModeloProductosSeleccionados() throws Exception {
		ArrayList<ModeloProducto> modeloproductosSeleccionados=new ArrayList<ModeloProducto>();		
		
		modeloproductosSeleccionados=this.getModeloProductosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"modeloproducto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("modeloproductos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("modeloproducto");
			//elementRoot.appendChild(element);
		
			for(ModeloProducto modeloproductoAux:modeloproductosSeleccionados) {
				element = document.createElement("modeloproducto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlModeloProducto(modeloproductoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.modeloproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modelo Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelModeloProducto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ModeloProductoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ModeloProductoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ModeloProductoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ModeloProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ModeloProductoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ModeloProductoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelModeloProducto(ModeloProducto modeloproducto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(modeloproducto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(modeloproducto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(modeloproducto.gettipoproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(modeloproducto.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(modeloproducto.getnombre());				
	}
	
	public void setFilaDatosExportarXmlModeloProducto(ModeloProducto modeloproducto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ModeloProductoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(modeloproducto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ModeloProductoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(modeloproducto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ModeloProductoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(modeloproducto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtipoproducto_descripcion = document.createElement(ModeloProductoConstantesFunciones.IDTIPOPRODUCTO);
		elementtipoproducto_descripcion.appendChild(document.createTextNode(modeloproducto.gettipoproducto_descripcion()));
		element.appendChild(elementtipoproducto_descripcion);

		Element elementcodigo = document.createElement(ModeloProductoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(modeloproducto.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ModeloProductoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(modeloproducto.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoModeloProductosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ModeloProducto> modeloproductosSeleccionados=new ArrayList<ModeloProducto>();
		
		modeloproductosSeleccionados=this.getModeloProductosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoModeloProducto(modeloproductosSeleccionados);
		
		this.generarReporteModeloProductos("Todos",modeloproductosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoModeloProducto(ArrayList<ModeloProducto> modeloproductosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ModeloProducto modeloproductoAux:modeloproductosSeleccionados) {
				modeloproductoAux.setsDetalleGeneralEntityReporte(modeloproductoAux.toString());
			
				if(sTipoSeleccionar.equals(ModeloProductoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					modeloproductoAux.setsDescripcionGeneralEntityReporte1(modeloproductoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ModeloProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO)) {
					existe=true;
					modeloproductoAux.setsDescripcionGeneralEntityReporte1(modeloproductoAux.gettipoproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ModeloProductoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					modeloproductoAux.setsDescripcionGeneralEntityReporte1(modeloproductoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ModeloProductoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					modeloproductoAux.setsDescripcionGeneralEntityReporte1(modeloproductoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModeloProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesModeloProducto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoModeloProducto=true;
				this.isVisibilidadCeldaNuevoRelacionesModeloProducto=true;
				this.isVisibilidadCeldaGuardarCambiosModeloProducto=true;
			}
			
			this.isVisibilidadCeldaModificarModeloProducto=false;
			this.isVisibilidadCeldaActualizarModeloProducto=false;
			this.isVisibilidadCeldaEliminarModeloProducto=false;
			this.isVisibilidadCeldaCancelarModeloProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarModeloProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarModeloProducto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoModeloProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesModeloProducto=false;
			this.isVisibilidadCeldaGuardarCambiosModeloProducto=false;
			this.isVisibilidadCeldaModificarModeloProducto=false;
			this.isVisibilidadCeldaActualizarModeloProducto=true;
			this.isVisibilidadCeldaEliminarModeloProducto=false;
			this.isVisibilidadCeldaCancelarModeloProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarModeloProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarModeloProducto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoModeloProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesModeloProducto=false;
			this.isVisibilidadCeldaGuardarCambiosModeloProducto=false;
			this.isVisibilidadCeldaModificarModeloProducto=false;
			this.isVisibilidadCeldaActualizarModeloProducto=true;
			this.isVisibilidadCeldaEliminarModeloProducto=true;
			this.isVisibilidadCeldaCancelarModeloProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarModeloProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarModeloProducto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoModeloProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesModeloProducto=false;
			this.isVisibilidadCeldaGuardarCambiosModeloProducto=false;
			this.isVisibilidadCeldaModificarModeloProducto=false;
			this.isVisibilidadCeldaActualizarModeloProducto=true;
			this.isVisibilidadCeldaEliminarModeloProducto=false;
			this.isVisibilidadCeldaCancelarModeloProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarModeloProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarModeloProducto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoModeloProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesModeloProducto=true;
			this.isVisibilidadCeldaGuardarCambiosModeloProducto=true;
			this.isVisibilidadCeldaModificarModeloProducto=false;
			this.isVisibilidadCeldaActualizarModeloProducto=false;
			this.isVisibilidadCeldaEliminarModeloProducto=false;
			this.isVisibilidadCeldaCancelarModeloProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarModeloProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarModeloProducto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoModeloProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesModeloProducto=false;
			this.isVisibilidadCeldaGuardarCambiosModeloProducto=false;
			this.isVisibilidadCeldaActualizarModeloProducto=false;
			this.isVisibilidadCeldaEliminarModeloProducto=false;
			this.isVisibilidadCeldaCancelarModeloProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarModeloProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarModeloProducto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoModeloProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesModeloProducto=false;
			this.isVisibilidadCeldaGuardarCambiosModeloProducto=false;
			this.isVisibilidadCeldaModificarModeloProducto=true;
			this.isVisibilidadCeldaActualizarModeloProducto=false;
			this.isVisibilidadCeldaEliminarModeloProducto=false;
			this.isVisibilidadCeldaCancelarModeloProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarModeloProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarModeloProducto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ModeloProductoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoModeloProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesModeloProducto=true;
			this.isVisibilidadCeldaGuardarCambiosModeloProducto=true;
		} else {
			this.actualizarEstadoPanelsModeloProducto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarModeloProducto=false;
			//this.isVisibilidadCeldaVerFormModeloProducto=false;
			this.isVisibilidadCeldaDuplicarModeloProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!modeloproductoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesModeloProducto=false;
		} else {
			this.isVisibilidadCeldaNuevoModeloProducto=false;
			this.isVisibilidadCeldaGuardarCambiosModeloProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(modeloproductoSessionBean.getEsGuardarRelacionado()) {
			if(!modeloproductoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesModeloProducto=false;												
			}
			
			this.jButtonCerrarModeloProducto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesModeloProducto=false;
		}
		
		if(!this.permiteMantenimiento(this.modeloproducto)) {
			this.isVisibilidadCeldaActualizarModeloProducto=false;
			this.isVisibilidadCeldaEliminarModeloProducto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesModeloProducto() {
		this.isVisibilidadCeldaNuevoModeloProducto=false;
		this.isVisibilidadCeldaGuardarCambiosModeloProducto=false;
	}
	
	public void actualizarEstadoPanelsModeloProducto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionModeloProducto!=null) {
				this.jScrollPanelDatosEdicionModeloProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasModeloProducto!=null) {
				this.jTabbedPaneBusquedasModeloProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosModeloProducto!=null) {
				this.jScrollPanelDatosModeloProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionModeloProducto!=null) {
				this.jPanelPaginacionModeloProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesModeloProducto!=null) {
				this.jPanelParametrosReportesModeloProducto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionModeloProducto!=null) {
				this.jScrollPanelDatosEdicionModeloProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasModeloProducto!=null) {
				this.jTabbedPaneBusquedasModeloProducto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosModeloProducto!=null) {
				this.jScrollPanelDatosModeloProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionModeloProducto!=null) {
				this.jPanelPaginacionModeloProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesModeloProducto!=null) {
				this.jPanelParametrosReportesModeloProducto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionModeloProducto!=null) {
				this.jScrollPanelDatosEdicionModeloProducto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasModeloProducto!=null) {
				this.jTabbedPaneBusquedasModeloProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosModeloProducto!=null) {
				this.jScrollPanelDatosModeloProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionModeloProducto!=null) {
				this.jPanelPaginacionModeloProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesModeloProducto!=null) {
				this.jPanelParametrosReportesModeloProducto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionModeloProducto!=null) {
				this.jScrollPanelDatosEdicionModeloProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasModeloProducto!=null) {
				this.jTabbedPaneBusquedasModeloProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosModeloProducto!=null) {
				this.jScrollPanelDatosModeloProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionModeloProducto!=null) {
				this.jPanelPaginacionModeloProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesModeloProducto!=null) {
				this.jPanelParametrosReportesModeloProducto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionModeloProducto!=null) {
				this.jScrollPanelDatosEdicionModeloProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasModeloProducto!=null) {
				this.jTabbedPaneBusquedasModeloProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosModeloProducto!=null) {
				this.jScrollPanelDatosModeloProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionModeloProducto!=null) {
				this.jPanelPaginacionModeloProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesModeloProducto!=null) {
				this.jPanelParametrosReportesModeloProducto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionModeloProducto!=null) {
				this.jScrollPanelDatosEdicionModeloProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasModeloProducto!=null) {
				this.jTabbedPaneBusquedasModeloProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosModeloProducto!=null) {
				this.jScrollPanelDatosModeloProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionModeloProducto!=null) {
				this.jPanelPaginacionModeloProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesModeloProducto!=null) {
				this.jPanelParametrosReportesModeloProducto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionModeloProducto!=null) {
				this.jScrollPanelDatosEdicionModeloProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasModeloProducto!=null) {
				this.jTabbedPaneBusquedasModeloProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosModeloProducto!=null) {
				this.jScrollPanelDatosModeloProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionModeloProducto!=null) {
				this.jPanelPaginacionModeloProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesModeloProducto!=null) {
				this.jPanelParametrosReportesModeloProducto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasModeloProducto!=null) {
					this.jTabbedPaneBusquedasModeloProducto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesModeloProducto!=null) {
				this.jPanelParametrosReportesModeloProducto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.modeloproductoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasModeloProducto!=null) {
				this.jTabbedPaneBusquedasModeloProducto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesModeloProducto!=null) {
				this.jPanelParametrosReportesModeloProducto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasModeloProducto.remove(jPanelBusquedaPorCodigoModeloProducto);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasModeloProducto.remove(jPanelBusquedaPorNombreModeloProducto);}

			this.isVisibilidadFK_IdTipoProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoProducto) {this.jTabbedPaneBusquedasModeloProducto.remove(jPanelFK_IdTipoProductoModeloProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoProducto(Boolean isParaTipoProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoProductoNegation=!isParaTipoProducto;

			this.isVisibilidadBusquedaPorCodigo=isParaTipoProductoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasModeloProducto.remove(jPanelBusquedaPorCodigoModeloProducto);}

			this.isVisibilidadBusquedaPorNombre=isParaTipoProductoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasModeloProducto.remove(jPanelBusquedaPorNombreModeloProducto);}

			this.isVisibilidadFK_IdTipoProducto=isParaTipoProducto;
			if(!this.isVisibilidadFK_IdTipoProducto) {this.jTabbedPaneBusquedasModeloProducto.remove(jPanelFK_IdTipoProductoModeloProducto);}
		}
		
	}
	
	

	public String registrarSesionModeloProductoParaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(this.modeloproductoSessionBean==null) {
				this.modeloproductoSessionBean=new ModeloProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormModeloProducto.productoSessionBean==null) {
				this.jInternalFrameDetalleFormModeloProducto.productoSessionBean=new ProductoSessionBean();
			}

			this.jInternalFrameDetalleFormModeloProducto.productoSessionBean.setsPathNavegacionActual(modeloproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormModeloProducto.productoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProducto=this.jInternalFrameDetalleFormModeloProducto.productoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormModeloProducto.productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			this.jInternalFrameDetalleFormModeloProducto.productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(ModeloProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormModeloProducto.productoSessionBean.setisBusquedaDesdeForeignKeySesionModeloProducto(true);
			this.jInternalFrameDetalleFormModeloProducto.productoSessionBean.setlidModeloProductoActual(this.idModeloProductoActual);

			modeloproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyModeloProducto(true);
			modeloproductoSessionBean.setlIdModeloProductoActualForeignKey(this.idModeloProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionModeloProductoParaParametroInventarioDefectos() throws Exception {
		Boolean isPaginaPopupParametroInventarioDefecto=false;

		try {

			if(this.modeloproductoSessionBean==null) {
				this.modeloproductoSessionBean=new ModeloProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoSessionBean==null) {
				this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoSessionBean.setsPathNavegacionActual(modeloproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroInventarioDefecto=this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(true);
			this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(ModeloProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionModeloProducto(true);
			this.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoSessionBean.setlidModeloProductoActual(this.idModeloProductoActual);

			modeloproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyModeloProducto(true);
			modeloproductoSessionBean.setlIdModeloProductoActualForeignKey(this.idModeloProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ModeloProductoSessionBean modeloproductoSessionBean=new ModeloProductoSessionBean();
		
		if(this.modeloproductoSessionBean==null) {
			this.modeloproductoSessionBean=new ModeloProductoSessionBean();
		}
		
		this.modeloproductoSessionBean.setsUltimaBusquedaModeloProducto(this.getsAccionBusqueda());
		this.modeloproductoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.modeloproductoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			modeloproductoSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			modeloproductoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			modeloproductoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoProducto")) {
			modeloproductoSessionBean.setid_tipo_producto(this.getid_tipo_productoFK_IdTipoProducto());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ModeloProductoSessionBean modeloproductoSessionBean=new ModeloProductoSessionBean();
		
		if(this.modeloproductoSessionBean==null) {
			this.modeloproductoSessionBean=new ModeloProductoSessionBean();
		}
		
		if(this.modeloproductoSessionBean.getsUltimaBusquedaModeloProducto()!=null&&!this.modeloproductoSessionBean.getsUltimaBusquedaModeloProducto().equals("")) {
			this.setsAccionBusqueda(modeloproductoSessionBean.getsUltimaBusquedaModeloProducto());
			this.setiNumeroPaginacion(modeloproductoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(modeloproductoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(modeloproductoSessionBean.getcodigo());
				modeloproductoSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(modeloproductoSessionBean.getnombre());
				modeloproductoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(modeloproductoSessionBean.getid_empresa());
				modeloproductoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoProducto")) {
				this.setid_tipo_productoFK_IdTipoProducto(modeloproductoSessionBean.getid_tipo_producto());
				modeloproductoSessionBean.setid_tipo_producto(-1L);
			}
		}
		
		this.modeloproductoSessionBean.setsUltimaBusquedaModeloProducto("");
		this.modeloproductoSessionBean.setiNumeroPaginacion(ModeloProductoConstantesFunciones.INUMEROPAGINACION);
		this.modeloproductoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaModeloProducto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioModeloProducto() {
		this.updateBorderResaltarBusquedasFormularioModeloProducto();
		this.updateVisibilidadBusquedasFormularioModeloProducto();
		this.updateHabilitarBusquedasFormularioModeloProducto();
	}
	
	public void updateBorderResaltarBusquedasFormularioModeloProducto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasModeloProducto.getComponents().length>0) {
	

		if(this.modeloproductoConstantesFunciones.resaltarBusquedaPorCodigoModeloProducto!=null) {
			index= this.jTabbedPaneBusquedasModeloProducto.indexOfComponent(this.jPanelBusquedaPorCodigoModeloProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasModeloProducto.getComponent(index);
				jPanel.setBorder(this.modeloproductoConstantesFunciones.resaltarBusquedaPorCodigoModeloProducto);
			}
		}

		if(this.modeloproductoConstantesFunciones.resaltarBusquedaPorNombreModeloProducto!=null) {
			index= this.jTabbedPaneBusquedasModeloProducto.indexOfComponent(this.jPanelBusquedaPorNombreModeloProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasModeloProducto.getComponent(index);
				jPanel.setBorder(this.modeloproductoConstantesFunciones.resaltarBusquedaPorNombreModeloProducto);
			}
		}

		if(this.modeloproductoConstantesFunciones.resaltarFK_IdTipoProductoModeloProducto!=null) {
			index= this.jTabbedPaneBusquedasModeloProducto.indexOfComponent(this.jPanelFK_IdTipoProductoModeloProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasModeloProducto.getComponent(index);
				jPanel.setBorder(this.modeloproductoConstantesFunciones.resaltarFK_IdTipoProductoModeloProducto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioModeloProducto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasModeloProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasModeloProducto.indexOfComponent(this.jPanelBusquedaPorCodigoModeloProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasModeloProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.modeloproductoConstantesFunciones.mostrarBusquedaPorCodigoModeloProducto);
			if(!this.modeloproductoConstantesFunciones.mostrarBusquedaPorCodigoModeloProducto && index>-1) {
				this.jTabbedPaneBusquedasModeloProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasModeloProducto.indexOfComponent(this.jPanelBusquedaPorNombreModeloProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasModeloProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.modeloproductoConstantesFunciones.mostrarBusquedaPorNombreModeloProducto);
			if(!this.modeloproductoConstantesFunciones.mostrarBusquedaPorNombreModeloProducto && index>-1) {
				this.jTabbedPaneBusquedasModeloProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasModeloProducto.indexOfComponent(this.jPanelFK_IdTipoProductoModeloProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasModeloProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.modeloproductoConstantesFunciones.mostrarFK_IdTipoProductoModeloProducto);
			if(!this.modeloproductoConstantesFunciones.mostrarFK_IdTipoProductoModeloProducto && index>-1) {
				this.jTabbedPaneBusquedasModeloProducto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioModeloProducto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasModeloProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasModeloProducto.indexOfComponent(this.jPanelBusquedaPorCodigoModeloProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasModeloProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.modeloproductoConstantesFunciones.activarBusquedaPorCodigoModeloProducto);
				this.jTabbedPaneBusquedasModeloProducto.setEnabledAt(index,this.modeloproductoConstantesFunciones.activarBusquedaPorCodigoModeloProducto);
			}

			index= this.jTabbedPaneBusquedasModeloProducto.indexOfComponent(this.jPanelBusquedaPorNombreModeloProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasModeloProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.modeloproductoConstantesFunciones.activarBusquedaPorNombreModeloProducto);
				this.jTabbedPaneBusquedasModeloProducto.setEnabledAt(index,this.modeloproductoConstantesFunciones.activarBusquedaPorNombreModeloProducto);
			}

			index= this.jTabbedPaneBusquedasModeloProducto.indexOfComponent(this.jPanelFK_IdTipoProductoModeloProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasModeloProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.modeloproductoConstantesFunciones.activarFK_IdTipoProductoModeloProducto);
				this.jTabbedPaneBusquedasModeloProducto.setEnabledAt(index,this.modeloproductoConstantesFunciones.activarFK_IdTipoProductoModeloProducto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaModeloProducto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasModeloProducto.indexOfComponent(this.jPanelBusquedaPorCodigoModeloProducto);

			this.jTabbedPaneBusquedasModeloProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasModeloProducto.getComponent(index);

			this.modeloproductoConstantesFunciones.setResaltarBusquedaPorCodigoModeloProducto(resaltar);

			jPanel.setBorder(this.modeloproductoConstantesFunciones.resaltarBusquedaPorCodigoModeloProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasModeloProducto.indexOfComponent(this.jPanelBusquedaPorNombreModeloProducto);

			this.jTabbedPaneBusquedasModeloProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasModeloProducto.getComponent(index);

			this.modeloproductoConstantesFunciones.setResaltarBusquedaPorNombreModeloProducto(resaltar);

			jPanel.setBorder(this.modeloproductoConstantesFunciones.resaltarBusquedaPorNombreModeloProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoProducto")) {
			index= this.jTabbedPaneBusquedasModeloProducto.indexOfComponent(this.jPanelFK_IdTipoProductoModeloProducto);

			this.jTabbedPaneBusquedasModeloProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasModeloProducto.getComponent(index);

			this.modeloproductoConstantesFunciones.setResaltarFK_IdTipoProductoModeloProducto(resaltar);

			jPanel.setBorder(this.modeloproductoConstantesFunciones.resaltarFK_IdTipoProductoModeloProducto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarModeloProducto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioModeloProducto() throws Exception {

		if(this.jInternalFrameDetalleFormModeloProducto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioModeloProducto();
		this.updateVisibilidadResaltarControlesFormularioModeloProducto();
		this.updateHabilitarResaltarControlesFormularioModeloProducto();
		
	}
	
	public void updateBorderResaltarControlesFormularioModeloProducto() throws Exception {
		if(this.jInternalFrameDetalleFormModeloProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.modeloproductoConstantesFunciones.resaltaridModeloProducto!=null && this.jInternalFrameDetalleFormModeloProducto!=null) {this.jInternalFrameDetalleFormModeloProducto.jLabelidModeloProducto.setBorder(this.modeloproductoConstantesFunciones.resaltaridModeloProducto);}
		if(this.modeloproductoConstantesFunciones.resaltarid_empresaModeloProducto!=null && this.jInternalFrameDetalleFormModeloProducto!=null) {this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_empresaModeloProducto.setBorder(this.modeloproductoConstantesFunciones.resaltarid_empresaModeloProducto);}
		if(this.modeloproductoConstantesFunciones.resaltarid_tipo_productoModeloProducto!=null && this.jInternalFrameDetalleFormModeloProducto!=null) {this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_tipo_productoModeloProducto.setBorder(this.modeloproductoConstantesFunciones.resaltarid_tipo_productoModeloProducto);}
		if(this.modeloproductoConstantesFunciones.resaltarcodigoModeloProducto!=null && this.jInternalFrameDetalleFormModeloProducto!=null) {this.jInternalFrameDetalleFormModeloProducto.jTextFieldcodigoModeloProducto.setBorder(this.modeloproductoConstantesFunciones.resaltarcodigoModeloProducto);}
		if(this.modeloproductoConstantesFunciones.resaltarnombreModeloProducto!=null && this.jInternalFrameDetalleFormModeloProducto!=null) {this.jInternalFrameDetalleFormModeloProducto.jTextAreanombreModeloProducto.setBorder(this.modeloproductoConstantesFunciones.resaltarnombreModeloProducto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioModeloProducto() throws Exception {		
		if(this.jInternalFrameDetalleFormModeloProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormModeloProducto!=null) {
	
		//this.jInternalFrameDetalleFormModeloProducto.jLabelidModeloProducto.setVisible(this.modeloproductoConstantesFunciones.mostraridModeloProducto);
		this.jInternalFrameDetalleFormModeloProducto.jPanelidModeloProducto.setVisible(this.modeloproductoConstantesFunciones.mostraridModeloProducto);
		//this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_empresaModeloProducto.setVisible(this.modeloproductoConstantesFunciones.mostrarid_empresaModeloProducto);
		this.jInternalFrameDetalleFormModeloProducto.jPanelid_empresaModeloProducto.setVisible(this.modeloproductoConstantesFunciones.mostrarid_empresaModeloProducto);
		//this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_tipo_productoModeloProducto.setVisible(this.modeloproductoConstantesFunciones.mostrarid_tipo_productoModeloProducto);
		this.jInternalFrameDetalleFormModeloProducto.jPanelid_tipo_productoModeloProducto.setVisible(this.modeloproductoConstantesFunciones.mostrarid_tipo_productoModeloProducto);
		//this.jInternalFrameDetalleFormModeloProducto.jTextFieldcodigoModeloProducto.setVisible(this.modeloproductoConstantesFunciones.mostrarcodigoModeloProducto);
		this.jInternalFrameDetalleFormModeloProducto.jPanelcodigoModeloProducto.setVisible(this.modeloproductoConstantesFunciones.mostrarcodigoModeloProducto);
		//this.jInternalFrameDetalleFormModeloProducto.jTextAreanombreModeloProducto.setVisible(this.modeloproductoConstantesFunciones.mostrarnombreModeloProducto);
		this.jInternalFrameDetalleFormModeloProducto.jPanelnombreModeloProducto.setVisible(this.modeloproductoConstantesFunciones.mostrarnombreModeloProducto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioModeloProducto() throws Exception {
		if(this.jInternalFrameDetalleFormModeloProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormModeloProducto!=null) {
	
		this.jInternalFrameDetalleFormModeloProducto.jLabelidModeloProducto.setEnabled(this.modeloproductoConstantesFunciones.activaridModeloProducto);
		this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_empresaModeloProducto.setEnabled(this.modeloproductoConstantesFunciones.activarid_empresaModeloProducto);
		this.jInternalFrameDetalleFormModeloProducto.jComboBoxid_tipo_productoModeloProducto.setEnabled(this.modeloproductoConstantesFunciones.activarid_tipo_productoModeloProducto);
		this.jInternalFrameDetalleFormModeloProducto.jTextFieldcodigoModeloProducto.setEnabled(this.modeloproductoConstantesFunciones.activarcodigoModeloProducto);
		this.jInternalFrameDetalleFormModeloProducto.jTextAreanombreModeloProducto.setEnabled(this.modeloproductoConstantesFunciones.activarnombreModeloProducto);
		}
	}
	
		
}