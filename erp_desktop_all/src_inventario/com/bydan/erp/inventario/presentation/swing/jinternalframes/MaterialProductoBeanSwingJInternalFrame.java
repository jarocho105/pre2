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

import com.bydan.erp.inventario.util.MaterialProductoConstantesFunciones;
import com.bydan.erp.inventario.util.MaterialProductoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.MaterialProductoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.MaterialProductoBean;
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
public class MaterialProductoBeanSwingJInternalFrame extends MaterialProductoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(MaterialProductoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<MaterialProducto> materialproductoValidator = new ClassValidator<MaterialProducto>(MaterialProducto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public MaterialProducto materialproducto;	
	public MaterialProducto materialproductoAux;
	public MaterialProducto materialproductoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public MaterialProducto materialproductoTotales;
	public Long idMaterialProductoActual;
	public Long iIdNuevoMaterialProducto=0L;
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
	
	public Boolean isPermisoTodoMaterialProducto;
	public Boolean isPermisoNuevoMaterialProducto;
	public Boolean isPermisoActualizarMaterialProducto;
	public Boolean isPermisoActualizarOriginalMaterialProducto;
	public Boolean isPermisoEliminarMaterialProducto;
	public Boolean isPermisoGuardarCambiosMaterialProducto;
	public Boolean isPermisoConsultaMaterialProducto;
	public Boolean isPermisoBusquedaMaterialProducto;
	public Boolean isPermisoReporteMaterialProducto;
	public Boolean isPermisoPaginacionMedioMaterialProducto;
	public Boolean isPermisoPaginacionAltoMaterialProducto;
	public Boolean isPermisoPaginacionTodoMaterialProducto;
	public Boolean isPermisoCopiarMaterialProducto;
	public Boolean isPermisoVerFormMaterialProducto;
	public Boolean isPermisoDuplicarMaterialProducto;
	public Boolean isPermisoOrdenMaterialProducto;
	
	
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
	
	public MaterialProductoParameterReturnGeneral materialproductoReturnGeneral;
	public MaterialProductoParameterReturnGeneral materialproductoParameterGeneral;
	
	

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
	
	public Boolean isEsNuevoMaterialProducto=false;
	public Boolean esParaAccionDesdeFormularioMaterialProducto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected MaterialProductoSessionBeanAdditional materialproductoSessionBeanAdditional=null;
	
	public MaterialProductoSessionBeanAdditional getMaterialProductoSessionBeanAdditional() {
		return this.materialproductoSessionBeanAdditional;
	}
	
	public void setMaterialProductoSessionBeanAdditional(MaterialProductoSessionBeanAdditional materialproductoSessionBeanAdditional) {
		try {
			this.materialproductoSessionBeanAdditional=materialproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected MaterialProductoBeanSwingJInternalFrameAdditional materialproductoBeanSwingJInternalFrameAdditional=null;
	//public class MaterialProductoBeanSwingJInternalFrame
	
	public MaterialProductoBeanSwingJInternalFrameAdditional getMaterialProductoBeanSwingJInternalFrameAdditional() {
		return this.materialproductoBeanSwingJInternalFrameAdditional;
	}
	
	public void setMaterialProductoBeanSwingJInternalFrameAdditional(MaterialProductoBeanSwingJInternalFrameAdditional materialproductoBeanSwingJInternalFrameAdditional) {
		try {
			this.materialproductoBeanSwingJInternalFrameAdditional=materialproductoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public MaterialProductoLogic materialproductoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public MaterialProducto materialproductoBean;
	public MaterialProductoConstantesFunciones materialproductoConstantesFunciones;
	//public MaterialProductoParameterReturnGeneral materialproductoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoProductoLogic tipoproductoLogic;
	
	//PARAMETROS
	
	
	//public List<MaterialProducto> materialproductos;	
	//public List<MaterialProducto> materialproductosEliminados;
	//public List<MaterialProducto> materialproductosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoMaterialProducto=false;
	public Boolean isVisibilidadCeldaDuplicarMaterialProducto=true;
	public Boolean isVisibilidadCeldaCopiarMaterialProducto=true;
	public Boolean isVisibilidadCeldaVerFormMaterialProducto=true;
	public Boolean isVisibilidadCeldaOrdenMaterialProducto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesMaterialProducto=false;
	public Boolean isVisibilidadCeldaModificarMaterialProducto=false;
	public Boolean isVisibilidadCeldaActualizarMaterialProducto=false;
	public Boolean isVisibilidadCeldaEliminarMaterialProducto=false;
	public Boolean isVisibilidadCeldaCancelarMaterialProducto=false;
	public Boolean isVisibilidadCeldaGuardarMaterialProducto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosMaterialProducto=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoProducto=false;
	
	public Long getiIdNuevoMaterialProducto() {
		return this.iIdNuevoMaterialProducto;
	}

	public void setiIdNuevoMaterialProducto(Long iIdNuevoMaterialProducto) {
		this.iIdNuevoMaterialProducto = iIdNuevoMaterialProducto;
	}
	
	public Long getidMaterialProductoActual() {
		return this.idMaterialProductoActual;
	}

	public void setidMaterialProductoActual(Long idMaterialProductoActual) {
		this.idMaterialProductoActual = idMaterialProductoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public MaterialProducto getmaterialproducto() {
		return this.materialproducto;
	}

	public void setmaterialproducto(MaterialProducto materialproducto) {
		this.materialproducto = materialproducto;
	}
	
	public MaterialProducto getmaterialproductoAux() {
		return this.materialproductoAux;
	}

	public void setmaterialproductoAux(MaterialProducto materialproductoAux) {
		this.materialproductoAux = materialproductoAux;
	}				
	
	public MaterialProducto getmaterialproductoAnterior() {
		return this.materialproductoAnterior;
	}

	public void setmaterialproductoAnterior(MaterialProducto materialproductoAnterior) {
		this.materialproductoAnterior = materialproductoAnterior;
	}	
	
	public MaterialProducto getmaterialproductoTotales() {
		return this.materialproductoTotales;
	}

	public void setmaterialproductoTotales(MaterialProducto materialproductoTotales) {
		this.materialproductoTotales = materialproductoTotales;
	}	
	
	public MaterialProducto getmaterialproductoBean() {
		return this.materialproductoBean;
	}

	public void setmaterialproductoBean(MaterialProducto materialproductoBean) {
		this.materialproductoBean = materialproductoBean;
	}	
	
	public MaterialProductoParameterReturnGeneral getmaterialproductoReturnGeneral() {
		return this.materialproductoReturnGeneral;
	}

	public void setmaterialproductoReturnGeneral(MaterialProductoParameterReturnGeneral materialproductoReturnGeneral) {
		this.materialproductoReturnGeneral = materialproductoReturnGeneral;
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
	
	
	public MaterialProductoLogic getMaterialProductoLogic()	{		
		return materialproductoLogic;
	}

	public void setMaterialProductoLogic(MaterialProductoLogic materialproductoLogic) {
		this.materialproductoLogic = materialproductoLogic;
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
	
	public Boolean getIsEsNuevoMaterialProducto() {
		return isEsNuevoMaterialProducto;
	}

	public void setIsEsNuevoMaterialProducto(Boolean isEsNuevoMaterialProducto) {
		this.isEsNuevoMaterialProducto = isEsNuevoMaterialProducto;
	}

	public Boolean getEsParaAccionDesdeFormularioMaterialProducto() {
		return esParaAccionDesdeFormularioMaterialProducto;
	}
	
	public void setEsParaAccionDesdeFormularioMaterialProducto(Boolean esParaAccionDesdeFormularioMaterialProducto) {
		this.esParaAccionDesdeFormularioMaterialProducto = esParaAccionDesdeFormularioMaterialProducto;
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

			if(this.materialproductoSessionBean==null) {
				this.materialproductoSessionBean=new MaterialProductoSessionBean();
			}

			if(!this.materialproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(materialproductoSessionBean.getlidEmpresaActual());
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

			if(this.materialproductoSessionBean==null) {
				this.materialproductoSessionBean=new MaterialProductoSessionBean();
			}

			if(!this.materialproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProducto()) {
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
					tipoproductoLogic.getEntityWithConnection(materialproductoSessionBean.getlidTipoProductoActual());
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

					if(this.materialproducto!=null) {
						this.materialproducto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
						this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_empresaMaterialProducto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaMaterialProducto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
						if(this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_empresaMaterialProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_empresaMaterialProducto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaMaterialProductoGenerico)throws Exception
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
				jComboBoxid_empresaMaterialProductoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaMaterialProductoGenerico!=null && jComboBoxid_empresaMaterialProductoGenerico.getItemCount()>0) {
					jComboBoxid_empresaMaterialProductoGenerico.setSelectedIndex(0);
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

					if(this.materialproducto!=null) {
						this.materialproducto.setTipoProducto(tipoproductoTemp);
					}

					if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
						this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_tipo_productoMaterialProducto.setSelectedItem(tipoproductoTemp);
					}
				} else {
					//jComboBoxid_tipo_productoMaterialProducto.setSelectedItem(tipoproductoTemp);
					if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
						if(this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_tipo_productoMaterialProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_tipo_productoMaterialProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoproductoTemp!=null && jComboBoxid_tipo_productoFK_IdTipoProductoMaterialProducto!=null) {
						jComboBoxid_tipo_productoFK_IdTipoProductoMaterialProducto.setSelectedItem(tipoproductoTemp);
					} else {
						if(jComboBoxid_tipo_productoFK_IdTipoProductoMaterialProducto!=null) {
							//jComboBoxid_tipo_productoFK_IdTipoProductoMaterialProducto.setSelectedItem(tipoproductoTemp);
							if(jComboBoxid_tipo_productoFK_IdTipoProductoMaterialProducto.getItemCount()>0) {
								jComboBoxid_tipo_productoFK_IdTipoProductoMaterialProducto.setSelectedIndex(0);
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
	public void setActualTipoProductoForeignKeyGenerico(Long idTipoProductoSeleccionado,JComboBox jComboBoxid_tipo_productoMaterialProductoGenerico)throws Exception
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
				jComboBoxid_tipo_productoMaterialProductoGenerico.setSelectedItem(tipoproductoTemp);
			} else {
				if(jComboBoxid_tipo_productoMaterialProductoGenerico!=null && jComboBoxid_tipo_productoMaterialProductoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_productoMaterialProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(MaterialProducto materialproducto,JComboBox jComboBoxid_empresaMaterialProductoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaMaterialProductoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_empresaMaterialProducto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaMaterialProductoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				materialproducto.setid_empresa(empresaAux.getId());
				materialproducto.setempresa_descripcion(MaterialProductoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				materialproducto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoProductoForeignKey(MaterialProducto materialproducto,JComboBox jComboBoxid_tipo_productoMaterialProductoGenerico)throws Exception
	{
		try
		{
			TipoProducto  tipoproductoAux=new TipoProducto();

			if(jComboBoxid_tipo_productoMaterialProductoGenerico==null) {
				tipoproductoAux=(TipoProducto)this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_tipo_productoMaterialProducto.getSelectedItem();
			} else {
				tipoproductoAux=(TipoProducto)jComboBoxid_tipo_productoMaterialProductoGenerico.getSelectedItem();
			}

			if(tipoproductoAux!=null && tipoproductoAux.getId()!=null) {
				materialproducto.setid_tipo_producto(tipoproductoAux.getId());
				materialproducto.settipoproducto_descripcion(MaterialProductoConstantesFunciones.getTipoProductoDescripcion(tipoproductoAux));
				materialproducto.setTipoProducto(tipoproductoAux);			}
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

					if(!MaterialProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMaterialProducto!=null) { 
							this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_empresaMaterialProducto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_empresaMaterialProducto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMaterialProducto!=null) { 
					}

					if(!MaterialProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!MaterialProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMaterialProducto!=null) { 
							this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_tipo_productoMaterialProducto.removeAllItems();

							for(TipoProducto tipoproducto:this.tipoproductosForeignKey) {
								this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_tipo_productoMaterialProducto.addItem(tipoproducto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMaterialProducto!=null) { 
					}

					if(!MaterialProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!MaterialProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_productoFK_IdTipoProductoMaterialProducto.removeAllItems();

							for(TipoProducto tipoproducto:this.tipoproductosForeignKey) {
								this.jComboBoxid_tipo_productoFK_IdTipoProductoMaterialProducto.addItem(tipoproducto);
							}
						}

						if(!MaterialProductoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
							this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_empresaMaterialProducto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
							this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_empresaMaterialProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
							this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_tipo_productoMaterialProducto.setSelectedItem(tipoproducto);
						}
					} else {
						if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
							this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_tipo_productoMaterialProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_productoFK_IdTipoProductoMaterialProducto.setSelectedItem(tipoproducto);
						} else {
							this.jComboBoxid_tipo_productoFK_IdTipoProductoMaterialProducto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesMaterialProducto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			MaterialProductoConstantesFunciones.refrescarForeignKeysDescripcionesMaterialProducto(this.materialproductoLogic.getMaterialProductos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			MaterialProductoConstantesFunciones.refrescarForeignKeysDescripcionesMaterialProducto(this.materialproductos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(TipoProducto.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//materialproductoLogic.setMaterialProductos(this.materialproductos);
			materialproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public MaterialProductoParameterReturnGeneral getMaterialProductoParameterGeneral() {
		return this.materialproductoParameterGeneral;
	}
	
	public void setMaterialProductoParameterGeneral(MaterialProductoParameterReturnGeneral materialproductoParameterGeneral) {
		this.materialproductoParameterGeneral = materialproductoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoMaterialProducto() {
		return isPermisoTodoMaterialProducto;
	}

	public void setIsPermisoTodoMaterialProducto(Boolean isPermisoTodoMaterialProducto) {
		this.isPermisoTodoMaterialProducto = isPermisoTodoMaterialProducto;
	}

	public Boolean getIsPermisoNuevoMaterialProducto() {
		return isPermisoNuevoMaterialProducto;
	}

	public void setIsPermisoNuevoMaterialProducto(Boolean isPermisoNuevoMaterialProducto) {
		this.isPermisoNuevoMaterialProducto = isPermisoNuevoMaterialProducto;
	}

	public Boolean getIsPermisoActualizarMaterialProducto() {
		return isPermisoActualizarMaterialProducto;
	}

	public void setIsPermisoActualizarMaterialProducto(Boolean isPermisoActualizarMaterialProducto) {
		this.isPermisoActualizarMaterialProducto = isPermisoActualizarMaterialProducto;
	}

	public Boolean getIsPermisoEliminarMaterialProducto() {
		return isPermisoEliminarMaterialProducto;
	}

	public void setIsPermisoEliminarMaterialProducto(Boolean isPermisoEliminarMaterialProducto) {
		this.isPermisoEliminarMaterialProducto = isPermisoEliminarMaterialProducto;
	}

	public Boolean getIsPermisoGuardarCambiosMaterialProducto() {
		return isPermisoGuardarCambiosMaterialProducto;
	}

	public void setIsPermisoGuardarCambiosMaterialProducto(Boolean isPermisoGuardarCambiosMaterialProducto) {
		this.isPermisoGuardarCambiosMaterialProducto = isPermisoGuardarCambiosMaterialProducto;
	}
	
	public Boolean getIsPermisoConsultaMaterialProducto() {
		return isPermisoConsultaMaterialProducto;
	}

	public void setIsPermisoConsultaMaterialProducto(Boolean isPermisoConsultaMaterialProducto) {
		this.isPermisoConsultaMaterialProducto = isPermisoConsultaMaterialProducto;
	}

	public Boolean getIsPermisoBusquedaMaterialProducto() {
		return isPermisoBusquedaMaterialProducto;
	}

	public void setIsPermisoBusquedaMaterialProducto(Boolean isPermisoBusquedaMaterialProducto) {
		this.isPermisoBusquedaMaterialProducto = isPermisoBusquedaMaterialProducto;
	}

	public Boolean getIsPermisoReporteMaterialProducto() {
		return isPermisoReporteMaterialProducto;
	}

	public void setIsPermisoReporteMaterialProducto(Boolean isPermisoReporteMaterialProducto) {
		this.isPermisoReporteMaterialProducto = isPermisoReporteMaterialProducto;
	}
	
	public Boolean getIsPermisoPaginacionMedioMaterialProducto() {
		return isPermisoPaginacionMedioMaterialProducto;
	}

	public void setIsPermisoPaginacionMedioMaterialProducto(Boolean isPermisoPaginacionMedioMaterialProducto) {
		this.isPermisoPaginacionMedioMaterialProducto = isPermisoPaginacionMedioMaterialProducto;
	}
	
	public Boolean getIsPermisoPaginacionTodoMaterialProducto() {
		return isPermisoPaginacionTodoMaterialProducto;
	}

	public void setIsPermisoPaginacionTodoMaterialProducto(Boolean isPermisoPaginacionTodoMaterialProducto) {
		this.isPermisoPaginacionTodoMaterialProducto = isPermisoPaginacionTodoMaterialProducto;
	}
	
	public Boolean getIsPermisoPaginacionAltoMaterialProducto() {
		return isPermisoPaginacionAltoMaterialProducto;
	}

	public void setIsPermisoPaginacionAltoMaterialProducto(Boolean isPermisoPaginacionAltoMaterialProducto) {
		this.isPermisoPaginacionAltoMaterialProducto = isPermisoPaginacionAltoMaterialProducto;
	}
	
	public Boolean getIsPermisoCopiarMaterialProducto() {
		return isPermisoCopiarMaterialProducto;
	}

	public void setIsPermisoCopiarMaterialProducto(Boolean isPermisoCopiarMaterialProducto) {
		this.isPermisoCopiarMaterialProducto = isPermisoCopiarMaterialProducto;
	}
	
	public Boolean getIsPermisoVerFormMaterialProducto() {
		return isPermisoVerFormMaterialProducto;
	}

	public void setIsPermisoVerFormMaterialProducto(Boolean isPermisoVerFormMaterialProducto) {
		this.isPermisoVerFormMaterialProducto = isPermisoVerFormMaterialProducto;
	}
	
	public Boolean getIsPermisoDuplicarMaterialProducto() {
		return isPermisoDuplicarMaterialProducto;
	}

	public void setIsPermisoDuplicarMaterialProducto(Boolean isPermisoDuplicarMaterialProducto) {
		this.isPermisoDuplicarMaterialProducto = isPermisoDuplicarMaterialProducto;
	}
	
	public Boolean getIsPermisoOrdenMaterialProducto() {
		return isPermisoOrdenMaterialProducto;
	}

	public void setIsPermisoOrdenMaterialProducto(Boolean isPermisoOrdenMaterialProducto) {
		this.isPermisoOrdenMaterialProducto = isPermisoOrdenMaterialProducto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoMaterialProducto() {
		return isVisibilidadCeldaNuevoMaterialProducto;
	}

	public void setIsVisibilidadCeldaNuevoMaterialProducto(Boolean isVisibilidadCeldaNuevoMaterialProducto) {
		this.isVisibilidadCeldaNuevoMaterialProducto = isVisibilidadCeldaNuevoMaterialProducto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarMaterialProducto() {
		return isVisibilidadCeldaDuplicarMaterialProducto;
	}

	public void setIsVisibilidadCeldaDuplicarMaterialProducto(Boolean isVisibilidadCeldaDuplicarMaterialProducto) {
		this.isVisibilidadCeldaDuplicarMaterialProducto = isVisibilidadCeldaDuplicarMaterialProducto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarMaterialProducto() {
		return isVisibilidadCeldaCopiarMaterialProducto;
	}

	public void setIsVisibilidadCeldaCopiarMaterialProducto(Boolean isVisibilidadCeldaCopiarMaterialProducto) {
		this.isVisibilidadCeldaCopiarMaterialProducto = isVisibilidadCeldaCopiarMaterialProducto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormMaterialProducto() {
		return isVisibilidadCeldaVerFormMaterialProducto;
	}

	public void setIsVisibilidadCeldaVerFormMaterialProducto(Boolean isVisibilidadCeldaVerFormMaterialProducto) {
		this.isVisibilidadCeldaVerFormMaterialProducto = isVisibilidadCeldaVerFormMaterialProducto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenMaterialProducto() {
		return isVisibilidadCeldaOrdenMaterialProducto;
	}

	public void setIsVisibilidadCeldaOrdenMaterialProducto(Boolean isVisibilidadCeldaOrdenMaterialProducto) {
		this.isVisibilidadCeldaOrdenMaterialProducto = isVisibilidadCeldaOrdenMaterialProducto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesMaterialProducto() {
		return isVisibilidadCeldaNuevoRelacionesMaterialProducto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesMaterialProducto(Boolean isVisibilidadCeldaNuevoRelacionesMaterialProducto) {
		this.isVisibilidadCeldaNuevoRelacionesMaterialProducto = isVisibilidadCeldaNuevoRelacionesMaterialProducto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarMaterialProducto() {
		return isVisibilidadCeldaModificarMaterialProducto;
	}

	public void setIsVisibilidadCeldaModificarMaterialProducto(Boolean isVisibilidadCeldaModificarMaterialProducto) {
		this.isVisibilidadCeldaModificarMaterialProducto = isVisibilidadCeldaModificarMaterialProducto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarMaterialProducto() {
		return isVisibilidadCeldaActualizarMaterialProducto;
	}

	public void setIsVisibilidadCeldaActualizarMaterialProducto(Boolean isVisibilidadCeldaActualizarMaterialProducto) {
		this.isVisibilidadCeldaActualizarMaterialProducto = isVisibilidadCeldaActualizarMaterialProducto;
	}

	public Boolean getIsVisibilidadCeldaEliminarMaterialProducto() {
		return isVisibilidadCeldaEliminarMaterialProducto;
	}

	public void setIsVisibilidadCeldaEliminarMaterialProducto(Boolean isVisibilidadCeldaEliminarMaterialProducto) {
		this.isVisibilidadCeldaEliminarMaterialProducto = isVisibilidadCeldaEliminarMaterialProducto;
	}

	public Boolean getIsVisibilidadCeldaCancelarMaterialProducto() {
		return isVisibilidadCeldaCancelarMaterialProducto;
	}

	public void setIsVisibilidadCeldaCancelarMaterialProducto(Boolean isVisibilidadCeldaCancelarMaterialProducto) {
		this.isVisibilidadCeldaCancelarMaterialProducto = isVisibilidadCeldaCancelarMaterialProducto;
	}

	public Boolean getIsVisibilidadCeldaGuardarMaterialProducto() {
		return isVisibilidadCeldaGuardarMaterialProducto;
	}

	public void setIsVisibilidadCeldaGuardarMaterialProducto(Boolean isVisibilidadCeldaGuardarMaterialProducto) {
		this.isVisibilidadCeldaGuardarMaterialProducto = isVisibilidadCeldaGuardarMaterialProducto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosMaterialProducto() {
		return isVisibilidadCeldaGuardarCambiosMaterialProducto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosMaterialProducto(Boolean isVisibilidadCeldaGuardarCambiosMaterialProducto) {
		this.isVisibilidadCeldaGuardarCambiosMaterialProducto = isVisibilidadCeldaGuardarCambiosMaterialProducto;
	}
		
	public MaterialProductoSessionBean getmaterialproductoSessionBean() {
		return this.materialproductoSessionBean;
	}
	
	public void setmaterialproductoSessionBean(MaterialProductoSessionBean materialproductoSessionBean) {
		this.materialproductoSessionBean=materialproductoSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysMaterialProducto(MaterialProducto materialproducto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(materialproducto,null);
				this.setActualParaGuardarTipoProductoForeignKey(materialproducto,null);
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
	
	public void bugActualizarReferenciaActual(MaterialProducto materialproducto,MaterialProducto materialproductoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalMaterialProducto(materialproducto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		materialproductoAux.setId(materialproducto.getId());
		materialproductoAux.setVersionRow(materialproducto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessMaterialProducto();
		
			int intSelectedRow = this.jTableDatosMaterialProducto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproducto =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.materialproducto =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(MaterialProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualMaterialProducto(this.materialproducto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysMaterialProducto(this.materialproducto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = materialproductoValidator.getInvalidValues(this.materialproducto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			materialproductoLogic.setDatosCliente(datosCliente);
			materialproductoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				materialproductoAux=new  MaterialProducto();
				
				materialproductoAux.setIsNew(true);
				materialproductoAux.setIsChanged(true);
				
				materialproductoAux.setMaterialProductoOriginal(this.materialproducto);
				
				materialproductoAux.setId(this.materialproducto.getId());	
				materialproductoAux.setVersionRow(this.materialproducto.getVersionRow());	
				materialproductoAux.setid_empresa(this.materialproducto.getid_empresa());	
				materialproductoAux.setid_tipo_producto(this.materialproducto.getid_tipo_producto());	
				materialproductoAux.setcodigo(this.materialproducto.getcodigo());	
				materialproductoAux.setnombre(this.materialproducto.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.materialproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.materialproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(materialproductoAux,materialproductoLogic.getMaterialProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(materialproductoAux,materialproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.materialproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.materialproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						materialproductoLogic.saveMaterialProductos();//WithConnection
						//materialproductoLogic.getSetVersionRowMaterialProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.materialproducto,materialproductoAux);
					
					this.refrescarForeignKeysDescripcionesMaterialProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.materialproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.materialproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								materialproductoLogic.saveMaterialProductoRelaciones(materialproductoAux,this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//materialproductoLogic.getSetVersionRowMaterialProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.materialproducto,materialproductoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							materialproductoAux.setProductos(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							materialproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.materialproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.materialproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(materialproductoAux,materialproductoLogic.getMaterialProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(materialproductoAux,materialproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.materialproducto,materialproductoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				materialproductoAux=new  MaterialProducto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.materialproductoSessionBean.getEsGuardarRelacionado() 
					|| (this.materialproductoSessionBean.getEsGuardarRelacionado() && this.materialproducto.getId()>=0)) {
						
					materialproductoAux.setIsNew(false);
				}
				
				materialproductoAux.setIsDeleted(false);
			
				materialproductoAux.setId(this.materialproducto.getId());	
				materialproductoAux.setVersionRow(this.materialproducto.getVersionRow());	
				materialproductoAux.setid_empresa(this.materialproducto.getid_empresa());	
				materialproductoAux.setid_tipo_producto(this.materialproducto.getid_tipo_producto());	
				materialproductoAux.setcodigo(this.materialproducto.getcodigo());	
				materialproductoAux.setnombre(this.materialproducto.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(materialproductoAux,materialproductoLogic.getMaterialProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(materialproductoAux,materialproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.materialproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.materialproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						materialproductoLogic.saveMaterialProductos();//WithConnection
						//materialproductoLogic.getSetVersionRowMaterialProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.materialproducto,materialproductoAux);
					
					this.refrescarForeignKeysDescripcionesMaterialProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.materialproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.materialproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								materialproductoLogic.saveMaterialProductoRelaciones(materialproductoAux,this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//materialproductoLogic.getSetVersionRowMaterialProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.materialproducto,materialproductoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							materialproductoAux.setProductos(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							materialproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.materialproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.materialproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(materialproductoAux,materialproductoLogic.getMaterialProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(materialproductoAux,materialproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.materialproducto,materialproductoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				materialproductoAux=new  MaterialProducto();
				
				materialproductoAux.setIsNew(false);
				materialproductoAux.setIsChanged(false);
				
				materialproductoAux.setIsDeleted(true);
				
				materialproductoAux.setId(this.materialproducto.getId());	
				materialproductoAux.setVersionRow(this.materialproducto.getVersionRow());	
				materialproductoAux.setid_empresa(this.materialproducto.getid_empresa());	
				materialproductoAux.setid_tipo_producto(this.materialproducto.getid_tipo_producto());	
				materialproductoAux.setcodigo(this.materialproducto.getcodigo());	
				materialproductoAux.setnombre(this.materialproducto.getnombre());	
				
				if(this.materialproductoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.materialproductoAux.getId()>=0) {	
						this.materialproductosEliminados.add(materialproductoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(materialproductoAux,materialproductoLogic.getMaterialProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(materialproductoAux,materialproductos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.materialproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.materialproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						materialproductoLogic.saveMaterialProductos();//WithConnection
						//materialproductoLogic.getSetVersionRowMaterialProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.materialproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.materialproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								materialproductoLogic.saveMaterialProductoRelaciones(materialproductoAux,this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//materialproductoLogic.getSetVersionRowMaterialProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							materialproductoAux.setProductos(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							materialproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.materialproductoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.materialproductoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(materialproductoAux,materialproductoLogic.getMaterialProductos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(materialproductoAux,materialproductos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.getMaterialProductos().addAll(this.materialproductosEliminados);
					
					materialproductoLogic.saveMaterialProductos();//WithConnection
					//materialproductoLogic.getSetVersionRowMaterialProductos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesMaterialProducto();
				
				this.materialproductosEliminados= new ArrayList<MaterialProducto>();		
			}
			
			if(this.materialproductoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.materialproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Material Producto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Material Producto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.materialproducto=materialproductoAux;
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
      		//this.finishProcessMaterialProducto();
      	}
		
	}	
	
	public void actualizarRelaciones(MaterialProducto materialproductoLocal) throws Exception {
		
		if(this.materialproductoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				materialproductoLocal.setProductos(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());
				materialproductoLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
			
			} else {
			
				materialproductoLocal.setProductos(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productos);
				materialproductoLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(MaterialProducto materialproductoLocal) throws Exception {	
		if(this.materialproductoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				materialproductoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoProductoDetalleFormJInternalFrame.class)) {
				TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrameLocal=(TipoProductoBeanSwingJInternalFrame) ((TipoProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoproductoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoProducto(tipoproductoBeanSwingJInternalFrameLocal.gettipoproducto(),true);
				tipoproductoBeanSwingJInternalFrameLocal.actualizarLista(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto,this.tipoproductosForeignKey);

				tipoproductoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto);

				materialproductoLocal.setTipoProducto(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto);

				this.addItemDefectoCombosForeignKeyTipoProducto();
				this.cargarCombosFrameTipoProductosForeignKey("Formulario");
				this.setActualTipoProductoForeignKey(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarMaterialProductoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosMaterialProducto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.materialproducto =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.materialproducto =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = materialproductoValidator.getInvalidValues(this.materialproducto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(MaterialProducto materialproducto,List<MaterialProducto> materialproductos) throws Exception {
		try	{		
			MaterialProductoConstantesFunciones.actualizarLista(materialproducto,materialproductos,this.materialproductoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(MaterialProducto materialproducto,List<MaterialProducto> materialproductos) throws Exception {
		try	{			
			MaterialProductoConstantesFunciones.actualizarSelectedLista(materialproducto,materialproductos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<MaterialProducto> materialproductosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				materialproductosLocal=this.materialproductoLogic.getMaterialProductos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				materialproductosLocal=this.materialproductos;
			}
			//ARCHITECTURE
		
			for(MaterialProducto materialproductoLocal:materialproductosLocal) {
				if(this.permiteMantenimiento(materialproductoLocal) && materialproductoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+MaterialProductoConstantesFunciones.getMaterialProductoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(MaterialProductoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMaterialProducto.jLabelid_empresaMaterialProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MaterialProductoConstantesFunciones.IDTIPOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMaterialProducto.jLabelid_tipo_productoMaterialProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MaterialProductoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMaterialProducto.jLabelcodigoMaterialProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MaterialProductoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMaterialProducto.jLabelnombreMaterialProducto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMaterialProducto.jLabelid_empresaMaterialProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMaterialProducto.jLabelid_tipo_productoMaterialProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMaterialProducto.jLabelcodigoMaterialProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMaterialProducto.jLabelnombreMaterialProducto,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Producto")) {
			if(this.materialproducto==null) {
				this.materialproducto= new MaterialProducto();
			}

			if(this.materialproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoMaterialProducto
				this.setVariablesFormularioToObjetoActualMaterialProducto(this.materialproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysMaterialProducto(this.materialproducto);

				this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.getproducto().setMaterialProducto(this.materialproducto);
			}

			return;
		}
		 else  if(sTipo.equals("ParametroInventarioDefecto")) {
			if(this.materialproducto==null) {
				this.materialproducto= new MaterialProducto();
			}

			if(this.materialproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoMaterialProducto
				this.setVariablesFormularioToObjetoActualMaterialProducto(this.materialproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysMaterialProducto(this.materialproducto);

				this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.getparametroinventariodefecto().setMaterialProducto(this.materialproducto);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoMaterialProducto--;	
		
		
		this.materialproductoAux=new MaterialProducto();
		
		this.materialproductoAux.setId(this.iIdNuevoMaterialProducto);
		this.materialproductoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.materialproductoLogic.getMaterialProductos().add(this.materialproductoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.materialproductos.add(this.materialproductoAux);
		}
		//ARCHITECTURE
		
		this.materialproducto=this.materialproductoAux;
		
		if(MaterialProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioMaterialProducto(this.materialproducto);
			this.setVariablesObjetoActualToFormularioForeignKeyMaterialProducto(this.materialproducto);
		}
				
		//this.setDefaultControlesMaterialProducto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyMaterialProducto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyMaterialProducto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyMaterialProducto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMaterialProducto(this.materialproductoBean,this.materialproducto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysMaterialProducto(this.materialproducto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(MaterialProductoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.materialproductoSessionBean.getConGuardarRelaciones()) {
			classes=MaterialProductoConstantesFunciones.getClassesRelationshipsOfMaterialProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.materialproductoReturnGeneral=materialproductoLogic.procesarEventosMaterialProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.materialproductoLogic.getMaterialProductos(),this.materialproducto,this.materialproductoParameterGeneral,this.isEsNuevoMaterialProducto,classes);//this.materialproductoLogic.getMaterialProducto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanMaterialProducto(this.materialproductoReturnGeneral,this.materialproductoBean,false);
		
		if(this.materialproductoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyMaterialProducto(this.materialproductoReturnGeneral.getMaterialProducto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioMaterialProducto(this.materialproductoReturnGeneral.getMaterialProducto());
		}
		
		if(this.materialproductoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioMaterialProducto(this.materialproductoReturnGeneral.getMaterialProducto(),classes);//this.materialproductoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualMaterialProducto(this.materialproducto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyMaterialProducto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyMaterialProducto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MaterialProductoBeanSwingJInternalFrameAdditional.RecargarFormMaterialProducto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingMaterialProducto(false);
						
			if(materialproductoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado() && ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(MaterialProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMaterialProducto();
			}
			
			this.actualizarVisualTableDatosMaterialProducto();
			
			this.jTableDatosMaterialProducto.setRowSelectionInterval(this.getIndiceNuevoMaterialProducto(), this.getIndiceNuevoMaterialProducto());
			
			this.seleccionarFilaTablaMaterialProductoActual();
						
			this.actualizarEstadoCeldasBotonesMaterialProducto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesMaterialProducto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormMaterialProducto.jTextFieldcodigoMaterialProducto.setEnabled(isHabilitar && this.materialproductoConstantesFunciones.activarcodigoMaterialProducto);
		this.jInternalFrameDetalleFormMaterialProducto.jTextAreanombreMaterialProducto.setEnabled(isHabilitar && this.materialproductoConstantesFunciones.activarnombreMaterialProducto);	
		//
		this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_empresaMaterialProducto.setEnabled(isHabilitar && this.materialproductoConstantesFunciones.activarid_empresaMaterialProducto);
		this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_tipo_productoMaterialProducto.setEnabled(isHabilitar && this.materialproductoConstantesFunciones.activarid_tipo_productoMaterialProducto);
	};
	
	public void setDefaultControlesMaterialProducto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoMaterialProducto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.materialproductoSessionBean.setConGuardarRelaciones(true);			
			this.materialproductoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormMaterialProducto.jTabbedPaneRelacionesMaterialProducto.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.materialproductoSessionBean.setConGuardarRelaciones(false);			
			this.materialproductoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormMaterialProducto.jTabbedPaneRelacionesMaterialProducto.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoMaterialProducto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MaterialProducto materialproductoAux:this.materialproductoLogic.getMaterialProductos()) {
				if(materialproductoAux.getId().equals(this.iIdNuevoMaterialProducto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MaterialProducto materialproductoAux:this.materialproductos) {
				if(materialproductoAux.getId().equals(this.iIdNuevoMaterialProducto)) {
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
	
	public int getIndiceActualMaterialProducto(MaterialProducto materialproducto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MaterialProducto materialproductoAux:this.materialproductoLogic.getMaterialProductos()) {
				if(materialproductoAux.getId().equals(materialproducto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MaterialProducto materialproductoAux:this.materialproductos) {
				if(materialproductoAux.getId().equals(materialproducto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalMaterialProducto(MaterialProducto materialproductoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MaterialProducto materialproductoAux:this.materialproductoLogic.getMaterialProductos()) {
				if(materialproductoAux.getMaterialProductoOriginal().getId().equals(materialproductoOriginal.getId())) {
					existe=true;
					materialproductoOriginal.setId(materialproductoAux.getId());
					materialproductoOriginal.setVersionRow(materialproductoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MaterialProducto materialproductoAux:this.materialproductos) {
				if(materialproductoAux.getMaterialProductoOriginal().getId().equals(materialproductoOriginal.getId())) {
					existe=true;
					materialproductoOriginal.setId(materialproductoAux.getId());
					materialproductoOriginal.setVersionRow(materialproductoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosMaterialProducto(Boolean esParaCancelar) throws Exception {
		materialproductosAux=new ArrayList<MaterialProducto>();
		materialproductoAux=new MaterialProducto();
		
		if(!this.materialproductoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(MaterialProducto materialproductoAux:this.materialproductoLogic.getMaterialProductos()) {
					if(materialproductoAux.getId()<0) {
						materialproductosAux.add(materialproductoAux);
					}		
				}
				this.iIdNuevoMaterialProducto=0L;
				this.materialproductoLogic.getMaterialProductos().removeAll(materialproductosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MaterialProducto materialproductoAux:this.materialproductos) {
					if(materialproductoAux.getId()<0) {
						materialproductosAux.add(materialproductoAux);
					}		
				}
				this.iIdNuevoMaterialProducto=0L;
				this.materialproductos.removeAll(materialproductosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoMaterialProducto 
					&& this.materialproductoLogic.getMaterialProductos().size()>0
					) {
					materialproductoAux=this.materialproductoLogic.getMaterialProductos().get(this.materialproductoLogic.getMaterialProductos().size() - 1);
				
					if(materialproductoAux.getId()<0) {
						this.materialproductoLogic.getMaterialProductos().remove(materialproductoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoMaterialProducto && this.materialproductos.size()>0) {
					materialproductoAux=this.materialproductos.get(this.materialproductos.size() - 1);
				
					if(materialproductoAux.getId()<0) {
						this.materialproductos.remove(materialproductoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoMaterialProducto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(materialproducto.getId()<0) {
				this.materialproductoLogic.getMaterialProductos().remove(this.materialproducto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(materialproducto.getId()<0) {
				this.materialproductos.remove(this.materialproducto);
			}
		}			
	}
	
	public void setEstadosInicialesMaterialProducto(List<MaterialProducto> materialproductosAux) throws Exception {
		MaterialProductoConstantesFunciones.setEstadosInicialesMaterialProducto(materialproductosAux);
	}
	
	public void setEstadosInicialesMaterialProducto(MaterialProducto materialproductoAux) throws Exception {
		MaterialProductoConstantesFunciones.setEstadosInicialesMaterialProducto(materialproductoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarMaterialProductoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesMaterialProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarMaterialProductoActual()) {
				if(!this.isEsNuevoMaterialProducto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesMaterialProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoMaterialProducto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarMaterialProductoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Material Producto ?", "MANTENIMIENTO DE Material Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesMaterialProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(MaterialProducto materialproducto) throws Exception {
		MaterialProductoConstantesFunciones.seleccionarAsignar(this.materialproducto,materialproducto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarMaterialProducto=this.isPermisoActualizarOriginalMaterialProducto;
			
			
			this.seleccionarAsignar(materialproducto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MaterialProductoConstantesFunciones.quitarEspaciosMaterialProducto(this.materialproducto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesMaterialProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.materialproductoSessionBean.setsFuncionBusquedaRapida(this.materialproductoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoMaterialProducto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosMaterialProducto(esParaCancelar);				
				this.cancelarNuevoMaterialProducto(esParaCancelar);								
			}
			
			this.materialproducto=new MaterialProducto();
			
			this.inicializarMaterialProducto();
			
			this.actualizarEstadoCeldasBotonesMaterialProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarMaterialProducto() throws Exception {
		try {
			MaterialProductoConstantesFunciones.inicializarMaterialProducto(this.materialproducto);
			
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
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.materialproductoLogic.getMaterialProductos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteMaterialProductos(String sAccionBusqueda,List<MaterialProducto> materialproductosParaReportes) throws Exception {
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
					sPathReporteFinal="MaterialProducto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="MaterialProductoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("MaterialProductoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="MaterialProducto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Material Productos");		
		parameters.put("busquedapor", MaterialProductoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
					
					MaterialProductoLogic materialproductoLogicAuxiliar=new MaterialProductoLogic();
					materialproductoLogicAuxiliar.setDatosCliente(materialproductoLogic.getDatosCliente());				
					materialproductoLogicAuxiliar.setMaterialProductos(materialproductosParaReportes);
					
					materialproductoLogicAuxiliar.cargarRelacionesLoteForeignKeyMaterialProductoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					materialproductosParaReportes=materialproductoLogicAuxiliar.getMaterialProductos();
					
					//materialproductoLogic.getNewConnexionToDeep();
					
					//for (MaterialProducto materialproducto:materialproductosParaReportes) {
					//	materialproductoLogic.deepLoad(materialproducto, false, DeepLoadType.INCLUDE, classes);
					//}						
					//materialproductoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//materialproductoLogic.closeNewConnexionToDeep();
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceMaterialProducto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			MaterialProductoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			MaterialProductoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceMaterialProducto=new JRBeanArrayDataSource(MaterialProductoJInternalFrame.TraerMaterialProductoBeans(materialproductosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceMaterialProducto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+MaterialProductoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+MaterialProductoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(MaterialProductoBean.TraerMaterialProductoBeans(materialproductosParaReportes).toArray()));
							
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
				this.generarExcelReporteMaterialProductos(sAccionBusqueda,sTipoArchivoReporte,materialproductosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalMaterialProductos(sAccionBusqueda,sTipoArchivoReporte,materialproductosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoMaterialProductoActionPerformed(null);
					//this.generarExcelReporteMaterialProductos(sAccionBusqueda,sTipoArchivoReporte,materialproductosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalMaterialProductos(sAccionBusqueda,sTipoArchivoReporte,materialproductosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesMaterialProductos(sAccionBusqueda,sTipoArchivoReporte,materialproductosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesMaterialProductos(sAccionBusqueda,sTipoArchivoReporte,materialproductosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteMaterialProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<MaterialProducto> materialproductosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"materialproducto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MaterialProductos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMaterialProducto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(MaterialProducto materialproducto : materialproductosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			MaterialProductoConstantesFunciones.generarExcelReporteDataMaterialProducto("NORMAL",row,workbook,materialproducto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.materialproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Material Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderMaterialProducto(String sTipo,Row row,Workbook workbook) {
		
		MaterialProductoConstantesFunciones.generarExcelReporteHeaderMaterialProducto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalMaterialProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<MaterialProducto> materialproductosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"materialproducto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MaterialProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(MaterialProducto materialproducto : materialproductosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(MaterialProductoConstantesFunciones.getMaterialProductoDescripcion(materialproducto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MaterialProductoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MaterialProductoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(materialproducto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MaterialProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MaterialProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(materialproducto.gettipoproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MaterialProductoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MaterialProductoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(materialproducto.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MaterialProductoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MaterialProductoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(materialproducto.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.materialproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Material Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesMaterialProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<MaterialProducto> materialproductosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<MaterialProducto> materialproductosRespaldo=null;
		
		classes=MaterialProductoConstantesFunciones.getClassesRelationshipsOfMaterialProducto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.materialproductoLogic.setDatosCliente(this.datosCliente);
		this.materialproductoLogic.setDatosDeep(this.datosDeep);
		this.materialproductoLogic.setIsConDeep(true);
		
		materialproductosRespaldo=this.materialproductoLogic.getMaterialProductos();
		
		this.materialproductoLogic.setMaterialProductos(materialproductosParaReportes);	
		this.materialproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		materialproductosParaReportes=this.materialproductoLogic.getMaterialProductos();
		this.materialproductoLogic.setMaterialProductos(materialproductosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"materialproducto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MaterialProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMaterialProducto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(MaterialProducto materialproducto : materialproductosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderMaterialProducto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			MaterialProductoConstantesFunciones.generarExcelReporteDataMaterialProducto("NORMAL",row,workbook,materialproducto,cellStyleDataAux);
		
			
			


				//Producto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoConstantesFunciones.SCLASSWEBTITULO))) {

				if(materialproducto.getProductos()!=null && materialproducto.getProductos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoConstantesFunciones.generarExcelReporteHeaderProducto("RELACIONADO",row,workbook);
				}

				if(materialproducto.getProductos()!=null) {
					i2=0;
					for(Producto producto : materialproducto.getProductos()) {
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

				if(materialproducto.getParametroInventarioDefectos()!=null && materialproducto.getParametroInventarioDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroInventarioDefectoConstantesFunciones.generarExcelReporteHeaderParametroInventarioDefecto("RELACIONADO",row,workbook);
				}

				if(materialproducto.getParametroInventarioDefectos()!=null) {
					i2=0;
					for(ParametroInventarioDefecto parametroinventariodefecto : materialproducto.getParametroInventarioDefectos()) {
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
		cell.setCellValue(MaterialProductoConstantesFunciones.getMaterialProductoDescripcion(materialproducto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.materialproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Material Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoMaterialProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMaterialProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoMaterialProducto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMaterialProducto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessMaterialProducto() throws Exception {		
		this.startProcessMaterialProducto(true);
	}
	
	public void startProcessMaterialProducto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasMaterialProducto ,this.jPanelParametrosReportesMaterialProducto, this.jScrollPanelDatosMaterialProducto,this.jPanelPaginacionMaterialProducto, this.jScrollPanelDatosEdicionMaterialProducto, this.jPanelAccionesMaterialProducto,this.jPanelAccionesFormularioMaterialProducto,this.jmenuBarMaterialProducto,this.jmenuBarDetalleMaterialProducto,this.jTtoolBarMaterialProducto,this.jTtoolBarDetalleMaterialProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasMaterialProducto=this.jTabbedPaneBusquedasMaterialProducto; 
		
		final JPanel jPanelParametrosReportesMaterialProducto=this.jPanelParametrosReportesMaterialProducto;
		//final JScrollPane jScrollPanelDatosMaterialProducto=this.jScrollPanelDatosMaterialProducto;
		final JTable jTableDatosMaterialProducto=this.jTableDatosMaterialProducto;		
		final JPanel jPanelPaginacionMaterialProducto=this.jPanelPaginacionMaterialProducto;
		//final JScrollPane jScrollPanelDatosEdicionMaterialProducto=this.jScrollPanelDatosEdicionMaterialProducto;
		final JPanel jPanelAccionesMaterialProducto=this.jPanelAccionesMaterialProducto;
		
		JPanel jPanelCamposAuxiliarMaterialProducto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarMaterialProducto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
			jPanelCamposAuxiliarMaterialProducto=this.jInternalFrameDetalleFormMaterialProducto.jPanelCamposMaterialProducto;
			jPanelAccionesFormularioAuxiliarMaterialProducto=this.jInternalFrameDetalleFormMaterialProducto.jPanelAccionesFormularioMaterialProducto;
		}
		
		final JPanel jPanelCamposMaterialProducto=jPanelCamposAuxiliarMaterialProducto;
		final JPanel jPanelAccionesFormularioMaterialProducto=jPanelAccionesFormularioAuxiliarMaterialProducto;
		
		
		final JMenuBar jmenuBarMaterialProducto=this.jmenuBarMaterialProducto;
		final JToolBar jTtoolBarMaterialProducto=this.jTtoolBarMaterialProducto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarMaterialProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMaterialProducto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
			jmenuBarDetalleAuxiliarMaterialProducto=this.jInternalFrameDetalleFormMaterialProducto.jmenuBarDetalleMaterialProducto;
			jTtoolBarDetalleAuxiliarMaterialProducto=this.jInternalFrameDetalleFormMaterialProducto.jTtoolBarDetalleMaterialProducto;
		}
		
		final JMenuBar jmenuBarDetalleMaterialProducto=jmenuBarDetalleAuxiliarMaterialProducto;
		final JToolBar jTtoolBarDetalleMaterialProducto=jTtoolBarDetalleAuxiliarMaterialProducto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMaterialProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMaterialProducto;
			processRunnable.jTableDatos=jTableDatosMaterialProducto;
			processRunnable.jPanelCampos=jPanelCamposMaterialProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionMaterialProducto;
			processRunnable.jPanelAcciones=jPanelAccionesMaterialProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMaterialProducto;
			
			
			processRunnable.jmenuBar=jmenuBarMaterialProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMaterialProducto;
			processRunnable.jTtoolBar=jTtoolBarMaterialProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMaterialProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMaterialProducto ,jPanelParametrosReportesMaterialProducto,jTableDatosMaterialProducto, /*jScrollPanelDatosMaterialProducto,*/jPanelCamposMaterialProducto,jPanelPaginacionMaterialProducto, /*jScrollPanelDatosEdicionMaterialProducto,*/ jPanelAccionesMaterialProducto,jPanelAccionesFormularioMaterialProducto,jmenuBarMaterialProducto,jmenuBarDetalleMaterialProducto,jTtoolBarMaterialProducto,jTtoolBarDetalleMaterialProducto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMaterialProducto ,jPanelParametrosReportesMaterialProducto, jScrollPanelDatosMaterialProducto,jPanelPaginacionMaterialProducto, jScrollPanelDatosEdicionMaterialProducto, jPanelAccionesMaterialProducto,jPanelAccionesFormularioMaterialProducto,jmenuBarMaterialProducto,jmenuBarDetalleMaterialProducto,jTtoolBarMaterialProducto,jTtoolBarDetalleMaterialProducto);
						
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
	
	public void finishProcessMaterialProducto() {// throws Exception 
		this.finishProcessMaterialProducto(true);
	}
	
	public void finishProcessMaterialProducto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasMaterialProducto ,this.jPanelParametrosReportesMaterialProducto, this.jScrollPanelDatosMaterialProducto,this.jPanelPaginacionMaterialProducto, this.jScrollPanelDatosEdicionMaterialProducto, this.jPanelAccionesMaterialProducto,this.jPanelAccionesFormularioMaterialProducto,this.jmenuBarMaterialProducto,this.jmenuBarDetalleMaterialProducto,this.jTtoolBarMaterialProducto,this.jTtoolBarDetalleMaterialProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasMaterialProducto=this.jTabbedPaneBusquedasMaterialProducto; 
		
		final JPanel jPanelParametrosReportesMaterialProducto=this.jPanelParametrosReportesMaterialProducto;
		//final JScrollPane jScrollPanelDatosMaterialProducto=this.jScrollPanelDatosMaterialProducto;
		final JTable jTableDatosMaterialProducto=this.jTableDatosMaterialProducto;		
		final JPanel jPanelPaginacionMaterialProducto=this.jPanelPaginacionMaterialProducto;
		//final JScrollPane jScrollPanelDatosEdicionMaterialProducto=this.jScrollPanelDatosEdicionMaterialProducto;
		final JPanel jPanelAccionesMaterialProducto=this.jPanelAccionesMaterialProducto;
		
		JPanel jPanelCamposAuxiliarMaterialProducto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarMaterialProducto=new JPanel();
		
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
			jPanelCamposAuxiliarMaterialProducto=this.jInternalFrameDetalleFormMaterialProducto.jPanelCamposMaterialProducto;
			jPanelAccionesFormularioAuxiliarMaterialProducto=this.jInternalFrameDetalleFormMaterialProducto.jPanelAccionesFormularioMaterialProducto;
		}
		
		final JPanel jPanelCamposMaterialProducto=jPanelCamposAuxiliarMaterialProducto;
		final JPanel jPanelAccionesFormularioMaterialProducto=jPanelAccionesFormularioAuxiliarMaterialProducto;
		
		
		final JMenuBar jmenuBarMaterialProducto=this.jmenuBarMaterialProducto;		
		final JToolBar jTtoolBarMaterialProducto=this.jTtoolBarMaterialProducto;
				
		JMenuBar jmenuBarDetalleAuxiliarMaterialProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMaterialProducto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
			jmenuBarDetalleAuxiliarMaterialProducto=this.jInternalFrameDetalleFormMaterialProducto.jmenuBarDetalleMaterialProducto;
			jTtoolBarDetalleAuxiliarMaterialProducto=this.jInternalFrameDetalleFormMaterialProducto.jTtoolBarDetalleMaterialProducto;		
		}
		
		final JMenuBar jmenuBarDetalleMaterialProducto=jmenuBarDetalleAuxiliarMaterialProducto;
		final JToolBar jTtoolBarDetalleMaterialProducto=jTtoolBarDetalleAuxiliarMaterialProducto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMaterialProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMaterialProducto;
			processRunnable.jTableDatos=jTableDatosMaterialProducto;
			processRunnable.jPanelCampos=jPanelCamposMaterialProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionMaterialProducto;
			processRunnable.jPanelAcciones=jPanelAccionesMaterialProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMaterialProducto;
			
			
			processRunnable.jmenuBar=jmenuBarMaterialProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMaterialProducto;
			processRunnable.jTtoolBar=jTtoolBarMaterialProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMaterialProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasMaterialProducto ,jPanelParametrosReportesMaterialProducto, jTableDatosMaterialProducto,/*jScrollPanelDatosMaterialProducto,*/jPanelCamposMaterialProducto,jPanelPaginacionMaterialProducto, /*jScrollPanelDatosEdicionMaterialProducto,*/ jPanelAccionesMaterialProducto,jPanelAccionesFormularioMaterialProducto,jmenuBarMaterialProducto,jmenuBarDetalleMaterialProducto,jTtoolBarMaterialProducto,jTtoolBarDetalleMaterialProducto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesMaterialProducto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarMaterialProducto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuMaterialProducto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarMaterialProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarMaterialProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleMaterialProducto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuMaterialProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarMaterialProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleMaterialProducto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.materialproductoConstantesFunciones.getsFinalQueryMaterialProducto();
		String  finalQueryPaginacionTodos=this.materialproductoConstantesFunciones.getsFinalQueryMaterialProducto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=MaterialProductoConstantesFunciones.getArrayColumnasGlobalesNoMaterialProducto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=MaterialProductoConstantesFunciones.getArrayColumnasGlobalesMaterialProducto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,MaterialProductoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.materialproductosEliminados= new ArrayList<MaterialProducto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessMaterialProducto();
		
				///*MaterialProductoSessionBean*/this.materialproductoSessionBean=new MaterialProductoSessionBean();
			
			if(this.materialproductoSessionBean==null) {
				this.materialproductoSessionBean=new MaterialProductoSessionBean();
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
					this.iNumeroPaginacion=MaterialProductoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=MaterialProductoConstantesFunciones.getClassesForeignKeysOfMaterialProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/materialproducto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			materialproductosAux= new ArrayList<MaterialProducto>();
			
				
			materialproductoLogic.setDatosCliente(this.datosCliente);
			materialproductoLogic.setDatosDeep(this.datosDeep);
			materialproductoLogic.setIsConDeep(true);
			
			
			materialproductoLogic.getMaterialProductoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					materialproductoLogic.getTodosMaterialProductos(finalQueryGlobal,pagination);
					
					//materialproductoLogic.getTodosMaterialProductosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(materialproductoLogic.getMaterialProductos()==null|| materialproductoLogic.getMaterialProductos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							materialproductosAux= new ArrayList<MaterialProducto>();
							materialproductosAux.addAll(materialproductoLogic.getMaterialProductos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							materialproductosAux= new ArrayList<MaterialProducto>();
							materialproductosAux.addAll(materialproductos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							materialproductoLogic.getTodosMaterialProductos(finalQueryGlobal+"",this.pagination);												
							
							//materialproductoLogic.getTodosMaterialProductosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteMaterialProductos("Todos",materialproductoLogic.getMaterialProductos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							materialproductoLogic.setMaterialProductos(new ArrayList<MaterialProducto>());					
							materialproductoLogic.getMaterialProductos().addAll(materialproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							materialproductos=new ArrayList<MaterialProducto>();
							materialproductos.addAll(materialproductosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idMaterialProducto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idMaterialProducto=this.idActual;
				
				} else if(this.idMaterialProductoActual!=null && this.idMaterialProductoActual!=0L) {
					idMaterialProducto=idMaterialProductoActual;
				}
				
					
				this.sDetalleReporte=MaterialProductoConstantesFunciones.getDetalleIndicePorId(idMaterialProducto);
				
				this.materialproductos=new ArrayList<MaterialProducto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					materialproductoLogic.getEntity(idMaterialProducto);
					
					//materialproductoLogic.getEntityWithConnection(idMaterialProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					materialproductoLogic.setMaterialProductos(new ArrayList<MaterialProducto>());
					materialproductoLogic.getMaterialProductos().add(materialproductoLogic.getMaterialProducto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.materialproductos=new ArrayList<MaterialProducto>();
					this.materialproductos.add(materialproducto);
				}
				
				if(materialproductoLogic.getMaterialProducto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=MaterialProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					materialproductoLogic.getMaterialProductosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MaterialProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MaterialProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=materialproductoLogic.getMaterialProductos()==null||materialproductoLogic.getMaterialProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=materialproductos==null|| materialproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						materialproductosAux=new ArrayList<MaterialProducto>();
						materialproductosAux.addAll(materialproductoLogic.getMaterialProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							materialproductosAux=new ArrayList<MaterialProducto>();
							materialproductosAux.addAll(materialproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							materialproductoLogic.getMaterialProductosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MaterialProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MaterialProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMaterialProductos("BusquedaPorCodigo",materialproductoLogic.getMaterialProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMaterialProductos("BusquedaPorCodigo",materialproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						materialproductoLogic.setMaterialProductos(new ArrayList<MaterialProducto>());
						materialproductoLogic.getMaterialProductos().addAll(materialproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							materialproductos=new ArrayList<MaterialProducto>();
							materialproductos.addAll(materialproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=MaterialProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					materialproductoLogic.getMaterialProductosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MaterialProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MaterialProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=materialproductoLogic.getMaterialProductos()==null||materialproductoLogic.getMaterialProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=materialproductos==null|| materialproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						materialproductosAux=new ArrayList<MaterialProducto>();
						materialproductosAux.addAll(materialproductoLogic.getMaterialProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							materialproductosAux=new ArrayList<MaterialProducto>();
							materialproductosAux.addAll(materialproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							materialproductoLogic.getMaterialProductosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MaterialProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MaterialProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMaterialProductos("BusquedaPorNombre",materialproductoLogic.getMaterialProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMaterialProductos("BusquedaPorNombre",materialproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						materialproductoLogic.setMaterialProductos(new ArrayList<MaterialProducto>());
						materialproductoLogic.getMaterialProductos().addAll(materialproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							materialproductos=new ArrayList<MaterialProducto>();
							materialproductos.addAll(materialproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=MaterialProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					materialproductoLogic.getMaterialProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MaterialProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MaterialProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=materialproductoLogic.getMaterialProductos()==null||materialproductoLogic.getMaterialProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=materialproductos==null|| materialproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						materialproductosAux=new ArrayList<MaterialProducto>();
						materialproductosAux.addAll(materialproductoLogic.getMaterialProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							materialproductosAux=new ArrayList<MaterialProducto>();
							materialproductosAux.addAll(materialproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							materialproductoLogic.getMaterialProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MaterialProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MaterialProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMaterialProductos("FK_IdEmpresa",materialproductoLogic.getMaterialProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMaterialProductos("FK_IdEmpresa",materialproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						materialproductoLogic.setMaterialProductos(new ArrayList<MaterialProducto>());
						materialproductoLogic.getMaterialProductos().addAll(materialproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							materialproductos=new ArrayList<MaterialProducto>();
							materialproductos.addAll(materialproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoProducto")) {
				this.sDetalleReporte=MaterialProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					materialproductoLogic.getMaterialProductosFK_IdTipoProducto(finalQueryGlobal,pagination,id_tipo_productoFK_IdTipoProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MaterialProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MaterialProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=materialproductoLogic.getMaterialProductos()==null||materialproductoLogic.getMaterialProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=materialproductos==null|| materialproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						materialproductosAux=new ArrayList<MaterialProducto>();
						materialproductosAux.addAll(materialproductoLogic.getMaterialProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							materialproductosAux=new ArrayList<MaterialProducto>();
							materialproductosAux.addAll(materialproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							materialproductoLogic.getMaterialProductosFK_IdTipoProducto(finalQueryGlobal,pagination,id_tipo_productoFK_IdTipoProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MaterialProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MaterialProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMaterialProductos("FK_IdTipoProducto",materialproductoLogic.getMaterialProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMaterialProductos("FK_IdTipoProducto",materialproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						materialproductoLogic.setMaterialProductos(new ArrayList<MaterialProducto>());
						materialproductoLogic.getMaterialProductos().addAll(materialproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							materialproductos=new ArrayList<MaterialProducto>();
							materialproductos.addAll(materialproductosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesMaterialProducto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessMaterialProducto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=materialproductoLogic.getMaterialProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=materialproductos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=materialproductoLogic.getMaterialProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=materialproductos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(MaterialProducto materialproducto) {
		Boolean permite=true;
		
		if(this.materialproducto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=MaterialProductoConstantesFunciones.getOrderByListaMaterialProducto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=MaterialProductoConstantesFunciones.getOrderByListaMaterialProducto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MaterialProducto materialproducto:materialproductoLogic.getMaterialProductos()) {
				if(materialproducto.getsType().equals(Constantes2.S_TOTALES)) {
					materialproductoTotales=materialproducto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MaterialProducto materialproducto:this.materialproductos) {
				if(materialproducto.getsType().equals(Constantes2.S_TOTALES)) {
					materialproductoTotales=materialproducto;
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
			this.materialproductoAux=new MaterialProducto();
			this.materialproductoAux.setsType(Constantes2.S_TOTALES);
			this.materialproductoAux.setIsNew(false);
			this.materialproductoAux.setIsChanged(false);
			this.materialproductoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				MaterialProductoConstantesFunciones.TotalizarValoresFilaMaterialProducto(this.materialproductoLogic.getMaterialProductos(),this.materialproductoAux);
				
				this.materialproductoLogic.getMaterialProductos().add(this.materialproductoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				MaterialProductoConstantesFunciones.TotalizarValoresFilaMaterialProducto(this.materialproductos,this.materialproductoAux);
				
				this.materialproductos.add(this.materialproductoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		materialproductoTotales=new MaterialProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.materialproductoLogic.getMaterialProductos().remove(materialproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.materialproductos.remove(materialproductoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		materialproductoTotales=new MaterialProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MaterialProducto materialproducto:materialproductoLogic.getMaterialProductos()) {
				if(materialproducto.getsType().equals(Constantes2.S_TOTALES)) {
					materialproductoTotales=materialproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MaterialProductoConstantesFunciones.TotalizarValoresFilaMaterialProducto(this.materialproductoLogic.getMaterialProductos(),materialproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MaterialProducto materialproducto:this.materialproductos) {
				if(materialproducto.getsType().equals(Constantes2.S_TOTALES)) {
					materialproductoTotales=materialproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MaterialProductoConstantesFunciones.TotalizarValoresFilaMaterialProducto(this.materialproductos,materialproductoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getMaterialProductosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMaterialProductosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMaterialProductosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMaterialProductosFK_IdTipoProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getMaterialProductosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					materialproductoLogic.getMaterialProductosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMaterialProductosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					materialproductoLogic.getMaterialProductosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMaterialProductosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					materialproductoLogic.getMaterialProductosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMaterialProductosFK_IdTipoProducto(String sFinalQuery,Long id_tipo_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					materialproductoLogic.getMaterialProductosFK_IdTipoProducto(sFinalQuery,this.pagination,id_tipo_producto);
				
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
	
	public void inicializarPermisosMaterialProducto() {
		this.isPermisoTodoMaterialProducto=false;
		this.isPermisoNuevoMaterialProducto=false;
		this.isPermisoActualizarMaterialProducto=false;
		this.isPermisoActualizarOriginalMaterialProducto=false;
		this.isPermisoEliminarMaterialProducto=false;
		this.isPermisoGuardarCambiosMaterialProducto=false;
		this.isPermisoConsultaMaterialProducto=false;
		this.isPermisoBusquedaMaterialProducto=false;
		this.isPermisoReporteMaterialProducto=false;		
		this.isPermisoOrdenMaterialProducto=false;		
		this.isPermisoPaginacionMedioMaterialProducto=false;		
		this.isPermisoPaginacionAltoMaterialProducto=false;
		this.isPermisoPaginacionTodoMaterialProducto=false;
		this.isPermisoCopiarMaterialProducto=false;		
		this.isPermisoVerFormMaterialProducto=false;		
		this.isPermisoDuplicarMaterialProducto=false;		
		this.isPermisoOrdenMaterialProducto=false;		
	}
	
	public void setPermisosUsuarioMaterialProducto(Boolean isPermiso) {
		this.isPermisoTodoMaterialProducto=isPermiso;
		this.isPermisoNuevoMaterialProducto=isPermiso;
		this.isPermisoActualizarMaterialProducto=isPermiso;
		this.isPermisoActualizarOriginalMaterialProducto=isPermiso;
		this.isPermisoEliminarMaterialProducto=isPermiso;
		this.isPermisoGuardarCambiosMaterialProducto=isPermiso;
		this.isPermisoConsultaMaterialProducto=isPermiso;
		this.isPermisoBusquedaMaterialProducto=isPermiso;
		this.isPermisoReporteMaterialProducto=isPermiso;
		this.isPermisoOrdenMaterialProducto=isPermiso;		
		this.isPermisoPaginacionMedioMaterialProducto=isPermiso;		
		this.isPermisoPaginacionAltoMaterialProducto=isPermiso;		
		this.isPermisoPaginacionTodoMaterialProducto=isPermiso;		
		this.isPermisoCopiarMaterialProducto=isPermiso;		
		this.isPermisoVerFormMaterialProducto=isPermiso;		
		this.isPermisoDuplicarMaterialProducto=isPermiso;
		this.isPermisoOrdenMaterialProducto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioMaterialProducto(Boolean isPermiso) {
		//this.isPermisoTodoMaterialProducto=isPermiso;
		this.isPermisoNuevoMaterialProducto=isPermiso;
		this.isPermisoActualizarMaterialProducto=isPermiso;
		this.isPermisoActualizarOriginalMaterialProducto=isPermiso;
		this.isPermisoEliminarMaterialProducto=isPermiso;
		this.isPermisoGuardarCambiosMaterialProducto=isPermiso;
		//this.isPermisoConsultaMaterialProducto=isPermiso;
		//this.isPermisoBusquedaMaterialProducto=isPermiso;
		//this.isPermisoReporteMaterialProducto=isPermiso;
		//this.isPermisoOrdenMaterialProducto=isPermiso;		
		//this.isPermisoPaginacionMedioMaterialProducto=isPermiso;		
		//this.isPermisoPaginacionAltoMaterialProducto=isPermiso;		
		//this.isPermisoPaginacionTodoMaterialProducto=isPermiso;		
		//this.isPermisoCopiarMaterialProducto=isPermiso;		
		//this.isPermisoDuplicarMaterialProducto=isPermiso;
		//this.isPermisoOrdenMaterialProducto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioMaterialProductoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ProductoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
		if(MaterialProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosProducto=this.verificarGetPermisosUsuarioOpcionMaterialProductoClaseRelacionada(this.opcionsRelacionadas,ProductoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosParametroInventarioDefecto=false;
		this.isTienePermisosParametroInventarioDefecto=this.verificarGetPermisosUsuarioOpcionMaterialProductoClaseRelacionada(this.opcionsRelacionadas,ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebMaterialProducto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioMaterialProductoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosProducto=conPermiso;
		this.isTienePermisosParametroInventarioDefecto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioMaterialProductoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionMaterialProductoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioMaterialProductoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosProducto && this.jInternalFrameDetalleFormMaterialProducto!=null && this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormMaterialProducto.jTabbedPaneRelacionesMaterialProducto.remove(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosParametroInventarioDefecto && this.jInternalFrameDetalleFormMaterialProducto!=null && this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormMaterialProducto.jTabbedPaneRelacionesMaterialProducto.remove(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioMaterialProducto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(MaterialProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.materialproductoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, MaterialProductoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoMaterialProducto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarMaterialProducto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalMaterialProducto=this.isPermisoActualizarMaterialProducto;
			this.isPermisoEliminarMaterialProducto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosMaterialProducto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaMaterialProducto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaMaterialProducto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoMaterialProducto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteMaterialProducto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMaterialProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioMaterialProducto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoMaterialProducto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoMaterialProducto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarMaterialProducto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormMaterialProducto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarMaterialProducto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMaterialProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.materialproductoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosMaterialProducto.setToolTipText(this.jTableDatosMaterialProducto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioMaterialProducto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioMaterialProducto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(MaterialProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(MaterialProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioMaterialProducto() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosProducto && this.materialproductoConstantesFunciones.mostrarProductoMaterialProducto && !MaterialProductoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Producto");
			reporte.setsDescripcion("Producto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosParametroInventarioDefecto && this.materialproductoConstantesFunciones.mostrarParametroInventarioDefectoMaterialProducto && !MaterialProductoConstantesFunciones.ISGUARDARREL) {

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
	public void inicializarCombosForeignKeyMaterialProductoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tipoproductosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyMaterialProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(MaterialProductoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyMaterialProductoListas(false);
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
	
	public void cargarCombosLoteForeignKeyMaterialProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			MaterialProductoParameterReturnGeneral materialproductoReturnGeneral=new MaterialProductoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.materialproductoConstantesFunciones.cargarid_empresaMaterialProducto)
					 || (this.esRecargarFks && this.materialproductoConstantesFunciones.cargarid_empresaMaterialProducto)) {

					if(!this.materialproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+materialproductoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTipoProducto="";

				if(((this.tipoproductosForeignKey==null||this.tipoproductosForeignKey.size()<=0) && this.materialproductoConstantesFunciones.cargarid_tipo_productoMaterialProducto)
					 || (this.esRecargarFks && this.materialproductoConstantesFunciones.cargarid_tipo_productoMaterialProducto)) {

					if(!this.materialproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoProductoConstantesFunciones.getArrayColumnasGlobalesTipoProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoProducto, "");
						finalQueryGlobalTipoProducto+=TipoProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoProducto=" WHERE " + ConstantesSql.ID + "="+materialproductoSessionBean.getlidTipoProductoActual();
					}
				} else {
					finalQueryGlobalTipoProducto="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				materialproductoReturnGeneral=materialproductoLogic.cargarCombosLoteForeignKeyMaterialProducto(finalQueryGlobalEmpresa,finalQueryGlobalTipoProducto);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=materialproductoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTipoProducto.equals("NONE")) {
				this.tipoproductosForeignKey=materialproductoReturnGeneral.gettipoproductosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyMaterialProducto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoProducto();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.materialproductoSessionBean==null) {
				this.materialproductoSessionBean=new MaterialProductoSessionBean();
			}

			if(!this.materialproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.materialproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProducto()) {
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
	
	public void initActionsCombosTodosForeignKeyMaterialProducto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyMaterialProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyMaterialProducto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyMaterialProducto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyMaterialProducto(MaterialProducto materialproducto)throws Exception {	
		try {
			
			this.setActualTipoProductoForeignKey(materialproducto.getid_tipo_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyMaterialProducto(MaterialProducto materialproducto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyMaterialProducto()throws Exception {	
		try {
			
			this.setActualTipoProductoForeignKey(this.materialproductoConstantesFunciones.getid_tipo_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyMaterialProducto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyMaterialProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyMaterialProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroMaterialProducto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyMaterialProducto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoProductosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyMaterialProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyMaterialProducto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_empresaMaterialProducto!=null && this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_empresaMaterialProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_empresaMaterialProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_tipo_productoMaterialProducto!=null && this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_tipo_productoMaterialProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_tipo_productoMaterialProducto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public MaterialProductoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public MaterialProductoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public MaterialProductoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.materialproductoSessionBean=new MaterialProductoSessionBean(); 
		this.materialproductoConstantesFunciones=new MaterialProductoConstantesFunciones(); 
		this.materialproductoBean=new MaterialProducto();//(this.materialproductoConstantesFunciones); 		
		this.materialproductoReturnGeneral=new MaterialProductoParameterReturnGeneral(); 
		
		this.materialproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.materialproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public MaterialProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public MaterialProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public MaterialProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessMaterialProducto(true);
			
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
			
			this.materialproductoConstantesFunciones=new MaterialProductoConstantesFunciones(); 
			this.materialproductoBean=new MaterialProducto();//this.materialproductoConstantesFunciones); 			
			this.materialproductoReturnGeneral=new MaterialProductoParameterReturnGeneral(); 
		
			MaterialProductoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Material Producto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.materialproducto=new MaterialProducto();
			this.materialproductos = new ArrayList<MaterialProducto>();
			this.materialproductosAux = new ArrayList<MaterialProducto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic=new MaterialProductoLogic();
				this.materialproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.materialproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.materialproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormMaterialProducto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoMaterialProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMaterialProducto);	
					}
					
					if(this.jInternalFrameImportacionMaterialProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMaterialProducto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByMaterialProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByMaterialProducto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormMaterialProducto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormMaterialProducto);
				this.jInternalFrameDetalleFormMaterialProducto.setVisible(false);
				this.jInternalFrameDetalleFormMaterialProducto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoMaterialProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMaterialProducto);
					this.jInternalFrameReporteDinamicoMaterialProducto.setVisible(false);
					this.jInternalFrameReporteDinamicoMaterialProducto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionMaterialProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionMaterialProducto);
					this.jInternalFrameImportacionMaterialProducto.setVisible(false);
					this.jInternalFrameImportacionMaterialProducto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByMaterialProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByMaterialProducto);
					this.jInternalFrameOrderByMaterialProducto.setVisible(false);
					this.jInternalFrameOrderByMaterialProducto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idMaterialProductoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=MaterialProductoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.materialproductoReturnGeneral=new MaterialProductoParameterReturnGeneral();
			
			this.materialproductoParameterGeneral=new MaterialProductoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.materialproductoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.materialproductoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(MaterialProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.materialproductoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ProductoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MaterialProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.materialproductoSessionBean.getEsGuardarRelacionado(),this.materialproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MaterialProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.materialproductoSessionBean.getEsGuardarRelacionado(),this.materialproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoMaterialProducto=false;
			this.isVisibilidadCeldaDuplicarMaterialProducto=true;
			this.isVisibilidadCeldaCopiarMaterialProducto=true;
			this.isVisibilidadCeldaVerFormMaterialProducto=true;
			this.isVisibilidadCeldaOrdenMaterialProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesMaterialProducto=false;
			this.isVisibilidadCeldaModificarMaterialProducto=false;
			this.isVisibilidadCeldaActualizarMaterialProducto=false;
			this.isVisibilidadCeldaEliminarMaterialProducto=false;
			this.isVisibilidadCeldaCancelarMaterialProducto=false;
			this.isVisibilidadCeldaGuardarMaterialProducto=false;
			this.isVisibilidadCeldaGuardarCambiosMaterialProducto=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoProducto=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesMaterialProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosMaterialProducto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioMaterialProducto(false);
			
			this.setPermisosUsuarioMaterialProducto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.materialproductoSessionBean.getEsGuardarRelacionado() 
				|| (this.materialproductoSessionBean.getEsGuardarRelacionado() && this.materialproductoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioMaterialProductoClasesRelacionadas();
			}
			
			if(this.materialproductoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioMaterialProductoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!MaterialProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosMaterialProducto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualMaterialProducto();
			}
			
			if(!this.isPermisoBusquedaMaterialProducto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasMaterialProducto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.materialproductoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioMaterialProducto,this.isPermisoPaginacionMedioMaterialProducto,this.isPermisoPaginacionTodoMaterialProducto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(MaterialProductoConstantesFunciones.getTiposSeleccionarMaterialProducto());
				
				this.tiposColumnasSelect=MaterialProductoConstantesFunciones.getTiposSeleccionarMaterialProducto(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectMaterialProducto();				
				//this.tiposRelacionesSelect=MaterialProductoConstantesFunciones.getTiposRelacionesMaterialProducto(true);
				
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
			//if(!this.materialproductoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioMaterialProducto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioMaterialProducto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioMaterialProducto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesMaterialProducto() ;
			
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
				materialproductoImplementable= (MaterialProductoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MaterialProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				materialproductoImplementableHome= (MaterialProductoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MaterialProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.materialproductos= new ArrayList<MaterialProducto>();
			this.materialproductosEliminados= new ArrayList<MaterialProducto>();
						
			this.isEsNuevoMaterialProducto=false;
			this.esParaAccionDesdeFormularioMaterialProducto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tipoproductosForeignKey=new ArrayList<TipoProducto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyMaterialProducto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroMaterialProducto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.materialproductoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			MaterialProductoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=MaterialProductoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesMaterialProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingMaterialProducto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormMaterialProducto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioMaterialProducto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioMaterialProducto();
			}
			
			MaterialProductoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasMaterialProducto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasMaterialProducto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasMaterialProducto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessMaterialProducto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga MaterialProducto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectMaterialProducto() {
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
			if(sTipo.equals("RelacionesMaterialProducto")) {
				iIndex=this.jInternalFrameDetalleFormMaterialProducto.jTabbedPaneRelacionesMaterialProducto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormMaterialProducto.jTabbedPaneRelacionesMaterialProducto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosMaterialProducto.getSelectedRow();	
				
				

				if(sTitle.equals("Parametro Inventario Defectos")) {
					if(!ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessMaterialProducto();

						this.cargarParteTabPanelRelacionadaParametroInventarioDefecto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Productos")) {
					if(!ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessMaterialProducto();

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
				this.finishProcessMaterialProducto();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaParametroInventarioDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormMaterialProducto.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(false,true,iIndex);
		this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();

		//this.jTabbedPaneRelacionesMaterialProducto.updateUI();
		//this.jTabbedPaneRelacionesMaterialProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesMaterialProducto.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProducto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormMaterialProducto.cargarSessionConBeanSwingJInternalFrameProducto(false,true,iIndex);
		this.jButtonProductoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProducto();

		//this.jTabbedPaneRelacionesMaterialProducto.updateUI();
		//this.jTabbedPaneRelacionesMaterialProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesMaterialProducto.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Producto")) {
				int row=this.jTableDatosMaterialProducto.getSelectedRow();
				jButtonProductoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ParametroInventarioDefecto")) {
				int row=this.jTableDatosMaterialProducto.getSelectedRow();
				jButtonParametroInventarioDefectoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.materialproductoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Producto")) {

					if(this.isTienePermisosProducto && this.materialproductoConstantesFunciones.mostrarProductoMaterialProducto && !MaterialProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Productos"+"("+ProductoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Productos");

						if(materialproductoConstantesFunciones.resaltarProductoMaterialProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(materialproductoConstantesFunciones.resaltarProductoMaterialProducto);
						}

						jmenuItem.setEnabled(this.materialproductoConstantesFunciones.activarProductoMaterialProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Producto"));

						

						this.jInternalFrameDetalleFormMaterialProducto.jmenuDetalleMaterialProducto.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Parametro Inventario Defecto")) {

					if(this.isTienePermisosParametroInventarioDefecto && this.materialproductoConstantesFunciones.mostrarParametroInventarioDefectoMaterialProducto && !MaterialProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Inventario Defectos"+"("+ParametroInventarioDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Inventario Defectos");

						if(materialproductoConstantesFunciones.resaltarParametroInventarioDefectoMaterialProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(materialproductoConstantesFunciones.resaltarParametroInventarioDefectoMaterialProducto);
						}

						jmenuItem.setEnabled(this.materialproductoConstantesFunciones.activarParametroInventarioDefectoMaterialProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroInventarioDefecto"));

						

						this.jInternalFrameDetalleFormMaterialProducto.jmenuDetalleMaterialProducto.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyMaterialProducto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyMaterialProducto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyMaterialProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyMaterialProductoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyMaterialProducto();
		
		this.cargarCombosFrameForeignKeyMaterialProducto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyMaterialProducto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyMaterialProducto();
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
	
	public void jButtonNuevoMaterialProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.materialproductoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormMaterialProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
			
			
			if(jTableDatosMaterialProducto.getRowCount()>=1) {
				jTableDatosMaterialProducto.removeRowSelectionInterval(0, jTableDatosMaterialProducto.getRowCount()-1);						
			}
			
			this.isEsNuevoMaterialProducto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoMaterialProducto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesMaterialProducto(true);			
			//this.materialproducto=new MaterialProducto();
			//this.materialproducto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMaterialProducto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMaterialProducto() ;
			
			if(MaterialProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMaterialProducto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.materialproducto);	
			this.actualizarInformacion("INFO_PADRE",false,this.materialproducto);				
			
			MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
			
			if(this.materialproductoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar MaterialProducto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarMaterialProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<MaterialProducto> materialproductosSeleccionados=new ArrayList<MaterialProducto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosMaterialProducto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosMaterialProducto.getSelectedRows().length;			
			}
			
			materialproductosSeleccionados=this.getMaterialProductosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoMaterialProducto--;			
				//MaterialProducto materialproductoAux= new MaterialProducto();			
				//materialproductoAux.setId(this.iIdNuevoMaterialProducto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//MaterialProducto materialproductoOrigen=new MaterialProducto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(MaterialProducto materialproductoOrigen : materialproductosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosMaterialProducto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							materialproductoOrigen =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							materialproductoOrigen =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaMaterialProducto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.materialproducto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosMaterialProducto(materialproductoOrigen,this.materialproducto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysMaterialProducto(this.materialproducto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.materialproductoLogic.getMaterialProductos().add(this.materialproductoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.materialproductos.add(this.materialproductoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaMaterialProducto(false);
				
				this.jTableDatosMaterialProducto.setRowSelectionInterval(this.getIndiceNuevoMaterialProducto(), this.getIndiceNuevoMaterialProducto());
				
				int iLastRow =  this.jTableDatosMaterialProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMaterialProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMaterialProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMaterialProducto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarMaterialProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<MaterialProducto> materialproductosSeleccionados=new ArrayList<MaterialProducto>();									
		
			MaterialProducto materialproductoOrigen=new MaterialProducto();
			MaterialProducto materialproductoDestino=new MaterialProducto();
				
			materialproductosSeleccionados=this.getMaterialProductosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosMaterialProducto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || materialproductosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosMaterialProducto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						materialproductoOrigen =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						materialproductoOrigen =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						materialproductoDestino =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						materialproductoDestino =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				materialproductoOrigen =materialproductosSeleccionados.get(0);
				materialproductoDestino =materialproductosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosMaterialProducto(materialproductoOrigen,materialproductoDestino,true,false);
				
				materialproductoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(materialproductoDestino,materialproductoLogic.getMaterialProductos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(materialproductoDestino,materialproductos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaMaterialProducto(false);
				
				//this.jTableDatosMaterialProducto.setRowSelectionInterval(this.getIndiceNuevoMaterialProducto(), this.getIndiceNuevoMaterialProducto());
				
				int iLastRow =  this.jTableDatosMaterialProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMaterialProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMaterialProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMaterialProducto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormMaterialProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMaterialProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormMaterialProducto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarMaterialProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesMaterialProducto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasMaterialProducto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesMaterialProducto.setVisible(!isVisible);
			this.jPanelPaginacionMaterialProducto.setVisible(!isVisible);
			this.jPanelAccionesMaterialProducto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarMaterialProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameMaterialProducto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoMaterialProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoMaterialProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionMaterialProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionMaterialProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByMaterialProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByMaterialProducto();
			
			this.abrirFrameOrderByMaterialProducto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByMaterialProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByMaterialProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleMaterialProducto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormMaterialProducto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormMaterialProducto.isMaximum()) {
					this.jInternalFrameDetalleFormMaterialProducto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormMaterialProducto.setSize(this.jInternalFrameDetalleFormMaterialProducto.iWidthFormulario,this.jInternalFrameDetalleFormMaterialProducto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormMaterialProducto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormMaterialProducto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormMaterialProducto.isMaximum()) {
						this.jInternalFrameDetalleFormMaterialProducto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormMaterialProducto.jContentPaneDetalleMaterialProducto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormMaterialProducto.jTabbedPaneRelacionesMaterialProducto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormMaterialProducto.jContentPaneDetalleMaterialProducto.getWidth(),MaterialProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMaterialProducto.jTabbedPaneRelacionesMaterialProducto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormMaterialProducto.jContentPaneDetalleMaterialProducto.getWidth(),MaterialProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMaterialProducto.jTabbedPaneRelacionesMaterialProducto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormMaterialProducto.jContentPaneDetalleMaterialProducto.getWidth(),MaterialProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();
					}

					if(ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProducto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormMaterialProducto.setVisible(true);
	        this.jInternalFrameDetalleFormMaterialProducto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByMaterialProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByMaterialProducto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByMaterialProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMaterialProducto,false,this);
				} else {
					this.jInternalFrameOrderByMaterialProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMaterialProducto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByMaterialProducto);
				this.jInternalFrameOrderByMaterialProducto.setVisible(false);
				this.jInternalFrameOrderByMaterialProducto.setSelected(false);
				
				this.jInternalFrameOrderByMaterialProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMaterialProducto"));
				
				this.inicializarActualizarBindingTablaOrderByMaterialProducto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionMaterialProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionMaterialProducto==null) {
				
				this.jInternalFrameImportacionMaterialProducto=new ImportacionJInternalFrame(MaterialProductoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMaterialProducto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionMaterialProducto);
				this.jInternalFrameImportacionMaterialProducto.setVisible(false);
				this.jInternalFrameImportacionMaterialProducto.setSelected(false);


				this.jInternalFrameImportacionMaterialProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMaterialProducto"));
				this.jInternalFrameImportacionMaterialProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMaterialProducto"));
				this.jInternalFrameImportacionMaterialProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMaterialProducto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoMaterialProducto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoMaterialProducto==null) {
				this.jInternalFrameReporteDinamicoMaterialProducto=new ReporteDinamicoJInternalFrame(MaterialProductoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMaterialProducto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMaterialProducto);
				this.jInternalFrameReporteDinamicoMaterialProducto.setVisible(false);
				this.jInternalFrameReporteDinamicoMaterialProducto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoMaterialProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMaterialProducto"));
				this.jInternalFrameReporteDinamicoMaterialProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMaterialProducto"));
				this.jInternalFrameReporteDinamicoMaterialProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMaterialProducto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMaterialProducto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaParametroInventarioDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormMaterialProducto.jContentPaneDetalleMaterialProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProducto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormMaterialProducto.jContentPaneDetalleMaterialProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleMaterialProducto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormMaterialProducto);
			
	       	this.jInternalFrameDetalleFormMaterialProducto.setVisible(false);
	        this.jInternalFrameDetalleFormMaterialProducto.setSelected(false);
			
			//this.jInternalFrameDetalleFormMaterialProducto.dispose();
			//this.jInternalFrameDetalleFormMaterialProducto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoMaterialProducto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoMaterialProducto.setVisible(true);
	        this.jInternalFrameReporteDinamicoMaterialProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionMaterialProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionMaterialProducto.setVisible(true);
	        this.jInternalFrameImportacionMaterialProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByMaterialProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByMaterialProducto.setVisible(true);
	        this.jInternalFrameOrderByMaterialProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByMaterialProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByMaterialProducto.setVisible(false);
	        this.jInternalFrameOrderByMaterialProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoMaterialProducto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoMaterialProducto.setVisible(false);
	        this.jInternalFrameReporteDinamicoMaterialProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionMaterialProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionMaterialProducto.setVisible(false);
	        this.jInternalFrameImportacionMaterialProducto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarMaterialProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarMaterialProducto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarMaterialProducto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMaterialProducto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesMaterialProducto(true);
			//this.isEsNuevoMaterialProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproducto =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.materialproducto =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesMaterialProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMaterialProducto(false) ;
			
			if(materialproductoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado() && ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(MaterialProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMaterialProducto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMaterialProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaMaterialProductoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosMaterialProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproducto =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.materialproducto =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarMaterialProducto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMaterialProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMaterialProducto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesMaterialProducto(true);
			//this.isEsNuevoMaterialProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproducto =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.materialproducto =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.materialproducto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesMaterialProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesMaterialProducto(false) ;
			
			if(MaterialProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMaterialProducto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMaterialProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoProducto(List<TipoProducto> tipoproductosForeignKey)throws Exception{
		TableColumn tableColumnTipoProducto=this.jTableDatosMaterialProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMaterialProducto,MaterialProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO));
		TableCellEditor tableCellEditorTipoProducto =tableColumnTipoProducto.getCellEditor();

		TipoProductoTableCell tipoproductoTableCellFk=(TipoProductoTableCell)tableCellEditorTipoProducto;

		if(tipoproductoTableCellFk!=null) {
			tipoproductoTableCellFk.settipoproductosForeignKey(tipoproductosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosMaterialProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoproductoTableCellFk.setRowActual(intSelectedRow);
			//tipoproductoTableCellFk.settipoproductosForeignKeyActual(tipoproductosForeignKey);
		//}


		if(tipoproductoTableCellFk!=null) {
			tipoproductoTableCellFk.RecargarTipoProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarMaterialProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesMaterialProducto(false);
			
			//if(!this.isEsNuevoMaterialProducto) {								
				int intSelectedRow = this.jTableDatosMaterialProducto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproducto =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.materialproducto =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(MaterialProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualMaterialProducto(this.materialproducto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysMaterialProducto(this.materialproducto);
				
			}
			
			if(this.permiteMantenimiento(this.materialproducto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.materialproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoMaterialProducto=true;
					this.inicializarActualizarBindingTablaMaterialProducto(false);
					this.isEsNuevoMaterialProducto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoMaterialProducto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoMaterialProducto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMaterialProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMaterialProducto(false);
				
				this.habilitarDeshabilitarControlesMaterialProducto(false);
			
												
				
				if(MaterialProductoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleMaterialProducto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoMaterialProductoActionPerformed(evt,materialproductoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualMaterialProducto(this.materialproducto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosMaterialProducto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,materialproductoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.materialproducto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(MaterialProducto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MaterialProducto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarMaterialProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosMaterialProducto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproducto =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				this.materialproducto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.materialproducto =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				this.materialproducto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.materialproducto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.materialproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((MaterialProductoModel) this.jTableDatosMaterialProducto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoMaterialProducto=true;
				this.inicializarActualizarBindingTablaMaterialProducto(false);
				this.isEsNuevoMaterialProducto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMaterialProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMaterialProducto(false);
				
				this.habilitarDeshabilitarControlesMaterialProducto(false);
				
				
				
				if(MaterialProductoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleMaterialProducto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarMaterialProductoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosMaterialProducto.getRowCount()>=1) {
				jTableDatosMaterialProducto.removeRowSelectionInterval(0, jTableDatosMaterialProducto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesMaterialProducto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaMaterialProducto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMaterialProducto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMaterialProducto(false) ;
			
			this.isEsNuevoMaterialProducto=false;
			
			if(MaterialProductoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleMaterialProducto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosMaterialProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingMaterialProducto(false);
				
				//SI ES MANUAL
				if(MaterialProductoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualMaterialProducto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosMaterialProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoMaterialProducto--;			
			//MaterialProducto materialproductoAux= new MaterialProducto();			
			//materialproductoAux.setId(this.iIdNuevoMaterialProducto);
			
			if(this.jInternalFrameDetalleFormMaterialProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaMaterialProducto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysMaterialProducto(this.materialproducto);
			
			this.materialproducto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.materialproductoLogic.getMaterialProductos().add(this.materialproductoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.materialproductos.add(this.materialproductoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaMaterialProducto(false);
			
			this.jTableDatosMaterialProducto.setRowSelectionInterval(this.getIndiceNuevoMaterialProducto(), this.getIndiceNuevoMaterialProducto());
			
			int iLastRow =  this.jTableDatosMaterialProducto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosMaterialProducto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosMaterialProducto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaMaterialProducto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionMaterialProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingMaterialProducto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMaterialProducto(false);
			
			//SI ES MANUAL
			if(MaterialProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMaterialProducto();
			}
			
			//this.abrirFrameTreeMaterialProducto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionMaterialProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Material ProductoS ?", "MANTENIMIENTO DE Material Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionMaterialProducto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralMaterialProducto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.materialproductoReturnGeneral=materialproductoLogic.procesarImportacionMaterialProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.materialproductoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarMaterialProductoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionMaterialProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionMaterialProducto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionMaterialProducto.setFileImportacion(this.jInternalFrameImportacionMaterialProducto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionMaterialProducto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionMaterialProducto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionMaterialProducto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionMaterialProducto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoMaterialProductoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<MaterialProducto> materialproductosSeleccionados=new ArrayList<MaterialProducto>();		

		materialproductosSeleccionados=this.getMaterialProductosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMaterialProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMaterialProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("MaterialProductoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"MaterialProductoBaseDesign.jrxml";
			
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
			
			this.generarReporteMaterialProductos("Todos",materialproductosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.materialproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Material Producto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoMaterialProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMaterialProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MaterialProductoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MaterialProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MaterialProductoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MaterialProductoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoMaterialProducto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoMaterialProducto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoMaterialProducto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case MaterialProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case MaterialProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					sNombreCampoCategoria="id_tipo_producto";
					break;

				case MaterialProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case MaterialProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoMaterialProducto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case MaterialProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case MaterialProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					sNombreCampoCategoriaValor="id_tipo_producto";
					break;

				case MaterialProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case MaterialProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoMaterialProducto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMaterialProducto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MaterialProductoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case MaterialProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_producto");
					break;

				case MaterialProductoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case MaterialProductoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoMaterialProductoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<MaterialProducto> materialproductosSeleccionados=new ArrayList<MaterialProducto>();		
		
		materialproductosSeleccionados=this.getMaterialProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"materialproducto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("MaterialProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoMaterialProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoMaterialProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case MaterialProductoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MaterialProductoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(MaterialProducto materialproducto:materialproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(materialproducto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MaterialProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MaterialProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
					iRow++;

					for(MaterialProducto materialproducto:materialproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(materialproducto.gettipoproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MaterialProductoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MaterialProductoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(MaterialProducto materialproducto:materialproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(materialproducto.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MaterialProductoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MaterialProductoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(MaterialProducto materialproducto:materialproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(materialproducto.getnombre());
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
			//	this.getFilaCabeceraExportarExcelMaterialProducto(row);				
			//	iRow++;
			//}				
			
			//for(MaterialProducto materialproductoAux:materialproductosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelMaterialProducto(materialproductoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.materialproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Material Producto",JOptionPane.INFORMATION_MESSAGE);
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
				this.materialproductoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMaterialProducto(false);
			
			//SI ES MANUAL
			if(MaterialProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMaterialProducto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresMaterialProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMaterialProducto(false);
			
			//SI ES MANUAL
			if(MaterialProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMaterialProducto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesMaterialProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMaterialProducto(false);
			
			//SI ES MANUAL
			if(MaterialProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMaterialProducto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaMaterialProducto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosMaterialProducto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosMaterialProducto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosMaterialProducto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosMaterialProducto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosMaterialProducto.setMinimumSize(dimensionMinimum);
		this.jTableDatosMaterialProducto.setMaximumSize(dimensionMaximum);
		this.jTableDatosMaterialProducto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingMaterialProducto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingMaterialProducto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingMaterialProducto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaMaterialProducto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesMaterialProducto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.materialproductoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasMaterialProducto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMaterialProducto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesMaterialProducto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !MaterialProductoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!MaterialProductoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualMaterialProducto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaMaterialProducto();
		
		this.inicializarActualizarBindingBotonesManualMaterialProducto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.materialproductoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualMaterialProducto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMaterialProducto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualMaterialProducto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualMaterialProducto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosMaterialProducto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosMaterialProducto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteMaterialProducto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormMaterialProducto.jCheckBoxPostAccionNuevoMaterialProducto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormMaterialProducto.jCheckBoxPostAccionSinCerrarMaterialProducto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormMaterialProducto.jCheckBoxPostAccionSinMensajeMaterialProducto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosMaterialProducto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosMaterialProducto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteMaterialProducto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
				this.jInternalFrameDetalleFormMaterialProducto.jCheckBoxPostAccionNuevoMaterialProducto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormMaterialProducto.jCheckBoxPostAccionSinCerrarMaterialProducto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormMaterialProducto.jCheckBoxPostAccionSinMensajeMaterialProducto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionMaterialProducto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionMaterialProducto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormMaterialProducto.jComboBoxTiposAccionesFormularioMaterialProducto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesMaterialProducto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoMaterialProducto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMaterialProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesMaterialProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesMaterialProducto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarMaterialProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesMaterialProducto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoMaterialProducto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMaterialProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesMaterialProducto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralMaterialProducto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesMaterialProducto(Boolean esInicializar) throws Exception {
		try	{	
			if(MaterialProductoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualMaterialProducto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesMaterialProducto() throws Exception {
		try	{
			if(MaterialProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualMaterialProducto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMaterialProducto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormMaterialProducto.jComboBoxTiposAccionesFormularioMaterialProducto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormMaterialProducto.jComboBoxTiposAccionesFormularioMaterialProducto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualMaterialProducto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesMaterialProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesMaterialProducto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesMaterialProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesMaterialProducto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesMaterialProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesMaterialProducto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionMaterialProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionMaterialProducto.addItem(reporte);
			}
			
			
			if(!this.materialproductoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionMaterialProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionMaterialProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesMaterialProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesMaterialProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesMaterialProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesMaterialProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormMaterialProducto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormMaterialProducto.jComboBoxTiposAccionesFormularioMaterialProducto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormMaterialProducto.jComboBoxTiposAccionesFormularioMaterialProducto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarMaterialProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarMaterialProducto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarMaterialProducto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMaterialProducto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMaterialProducto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMaterialProducto!=null) {
				this.jInternalFrameReporteDinamicoMaterialProducto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoMaterialProducto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMaterialProducto!=null) {
				this.jInternalFrameReporteDinamicoMaterialProducto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoMaterialProducto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoMaterialProducto!=null) {
				
				if(this.jInternalFrameReporteDinamicoMaterialProducto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMaterialProducto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMaterialProducto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoMaterialProducto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMaterialProducto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMaterialProducto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualMaterialProducto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoMaterialProducto.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreMaterialProducto.getText();
		if(this.jComboBoxid_tipo_productoFK_IdTipoProductoMaterialProducto.getSelectedItem()!=null){this.id_tipo_productoFK_IdTipoProducto=((TipoProducto)this.jComboBoxid_tipo_productoFK_IdTipoProductoMaterialProducto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasMaterialProducto(Boolean esInicializar) throws Exception {				
		if(MaterialProductoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualMaterialProducto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaMaterialProducto() throws Exception {
		this.inicializarActualizarBindingTablaMaterialProducto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByMaterialProducto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByMaterialProducto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByMaterialProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMaterialProducto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new MaterialProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByMaterialProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMaterialProducto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new MaterialProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosMaterialProductoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMaterialProductoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new MaterialProductoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByMaterialProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMaterialProducto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new MaterialProductoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByMaterialProducto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaMaterialProducto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=materialproductoLogic.getMaterialProductos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=materialproductos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(MaterialProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosMaterialProducto.setModel(new MaterialProductoModel(this.materialproductoLogic.getMaterialProductos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosMaterialProducto.setModel(new MaterialProductoModel(this.materialproductos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByMaterialProducto!=null && this.jInternalFrameOrderByMaterialProducto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByMaterialProducto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosMaterialProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMaterialProducto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new MaterialProductoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO,materialproductoConstantesFunciones.resaltarSeleccionarMaterialProducto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+MaterialProductoConstantesFunciones.SCLASSWEBTITULO,materialproductoConstantesFunciones.resaltarSeleccionarMaterialProducto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosMaterialProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMaterialProducto,MaterialProductoConstantesFunciones.LABEL_ID));

		if(this.materialproductoConstantesFunciones.mostraridMaterialProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MaterialProductoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.materialproductoConstantesFunciones.resaltaridMaterialProducto,this.materialproductoConstantesFunciones.activaridMaterialProducto,this,true,"idMaterialProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.materialproductoConstantesFunciones.resaltaridMaterialProducto,this.materialproductoConstantesFunciones.activaridMaterialProducto,this,true,"idMaterialProducto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMaterialProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMaterialProducto,MaterialProductoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.materialproductoConstantesFunciones.mostrarid_empresaMaterialProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MaterialProductoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.materialproductoConstantesFunciones.resaltarid_empresaMaterialProducto,this,this.materialproductoConstantesFunciones.activarid_empresaMaterialProducto));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.materialproductoConstantesFunciones.resaltarid_empresaMaterialProducto,this,this.materialproductoConstantesFunciones.activarid_empresaMaterialProducto,false,"id_empresaMaterialProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MaterialProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMaterialProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMaterialProducto,MaterialProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO));

		if(this.materialproductoConstantesFunciones.mostrarid_tipo_productoMaterialProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MaterialProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoProductoTableCell(this.tipoproductosForeignKey,this.materialproductoConstantesFunciones.resaltarid_tipo_productoMaterialProducto,this,this.materialproductoConstantesFunciones.activarid_tipo_productoMaterialProducto));
			tableColumn.setCellEditor(new TipoProductoTableCell(this.tipoproductosForeignKey,this.materialproductoConstantesFunciones.resaltarid_tipo_productoMaterialProducto,this,this.materialproductoConstantesFunciones.activarid_tipo_productoMaterialProducto,true,"id_tipo_productoMaterialProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MaterialProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMaterialProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMaterialProducto,MaterialProductoConstantesFunciones.LABEL_CODIGO));

		if(this.materialproductoConstantesFunciones.mostrarcodigoMaterialProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MaterialProductoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.materialproductoConstantesFunciones.resaltarcodigoMaterialProducto,this.materialproductoConstantesFunciones.activarcodigoMaterialProducto,this,true,"codigoMaterialProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.materialproductoConstantesFunciones.resaltarcodigoMaterialProducto,this.materialproductoConstantesFunciones.activarcodigoMaterialProducto,this,true,"codigoMaterialProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MaterialProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMaterialProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMaterialProducto,MaterialProductoConstantesFunciones.LABEL_NOMBRE));

		if(this.materialproductoConstantesFunciones.mostrarnombreMaterialProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MaterialProductoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.materialproductoConstantesFunciones.resaltarnombreMaterialProducto,this.materialproductoConstantesFunciones.activarnombreMaterialProducto,this,true,"nombreMaterialProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.materialproductoConstantesFunciones.resaltarnombreMaterialProducto,this.materialproductoConstantesFunciones.activarnombreMaterialProducto,this,true,"nombreMaterialProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MaterialProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.materialproductoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosProducto && this.materialproductoConstantesFunciones.mostrarProductoMaterialProducto && !MaterialProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Productos");
				tableColumn.setHeaderValue("Productos");
				tableColumn.setCellRenderer(new ProductoTableCell(materialproductoConstantesFunciones.resaltarProductoMaterialProducto,this,this.materialproductoConstantesFunciones.activarProductoMaterialProducto));
				tableColumn.setCellEditor(new ProductoTableCell(materialproductoConstantesFunciones.resaltarProductoMaterialProducto,this,this.materialproductoConstantesFunciones.activarProductoMaterialProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosMaterialProducto.addColumn(tableColumn);
			}

			if(this.isTienePermisosParametroInventarioDefecto && this.materialproductoConstantesFunciones.mostrarParametroInventarioDefectoMaterialProducto && !MaterialProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Inventario Defectos");
				tableColumn.setHeaderValue("Parametro Inventario Defectos");
				tableColumn.setCellRenderer(new ParametroInventarioDefectoTableCell(materialproductoConstantesFunciones.resaltarParametroInventarioDefectoMaterialProducto,this,this.materialproductoConstantesFunciones.activarParametroInventarioDefectoMaterialProducto));
				tableColumn.setCellEditor(new ParametroInventarioDefectoTableCell(materialproductoConstantesFunciones.resaltarParametroInventarioDefectoMaterialProducto,this,this.materialproductoConstantesFunciones.activarParametroInventarioDefectoMaterialProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosMaterialProducto.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.materialproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.materialproductoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMaterialProducto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.materialproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.materialproductoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMaterialProducto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarMaterialProducto && this.isPermisoGuardarCambiosMaterialProducto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.materialproductoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.materialproductoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosMaterialProducto.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.materialproductoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosMaterialProducto.addColumn(tableColumn);
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
			
			this.jTableDatosMaterialProducto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMaterialProducto && this.isPermisoGuardarCambiosMaterialProducto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.materialproductoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMaterialProducto && this.isPermisoGuardarCambiosMaterialProducto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosMaterialProducto.moveColumn(this.jTableDatosMaterialProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosMaterialProducto.moveColumn(this.jTableDatosMaterialProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.materialproductoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosMaterialProducto.moveColumn(this.jTableDatosMaterialProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosMaterialProducto.moveColumn(this.jTableDatosMaterialProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosMaterialProducto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosMaterialProducto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosMaterialProducto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!MaterialProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosMaterialProducto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosMaterialProducto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!MaterialProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!MaterialProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosMaterialProducto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosMaterialProducto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosMaterialProducto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=materialproductoLogic.getMaterialProductos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=materialproductos.size()-1;
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
		//this.jTableDatosMaterialProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosMaterialProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosMaterialProducto();
			
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
				
				//this.isEsNuevoMaterialProducto=false;
					
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
			
				if(this.materialproductoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormMaterialProducto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMaterialProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMaterialProducto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproducto =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.materialproducto =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.materialproducto.getsType().equals("DUPLICADO")
				   || this.materialproducto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoMaterialProducto=true;
				
				} else {
					this.isEsNuevoMaterialProducto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.materialproductoSessionBean.getEsGuardarRelacionado()) {
					if(this.materialproducto.getId()>=0 && !this.materialproducto.getIsNew()) {						
						this.isEsNuevoMaterialProducto=false;
						
					} else {
						this.isEsNuevoMaterialProducto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoMaterialProducto(esRelaciones);						
				
				this.seleccionarMaterialProducto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.materialproducto.getId()<0) {
					this.isEsNuevoMaterialProducto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarMaterialProducto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarMaterialProducto(evt,rowIndex);
				}	
				
				if(this.materialproductoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion MaterialProducto: " + this.dDif); 
					}
				}								
				
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarMaterialProducto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.materialproducto)) {
					if(this.materialproducto.getId()>0) {
						this.materialproducto.setIsDeleted(true);
						
						this.materialproductosEliminados.add(this.materialproducto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.materialproductoLogic.getMaterialProductos().remove(this.materialproducto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.materialproductos.remove(this.materialproducto);				
					}
					
					
					((MaterialProductoModel) this.jTableDatosMaterialProducto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaMaterialProducto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarMaterialProducto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoMaterialProducto) {
			
			if(this.jInternalFrameDetalleFormMaterialProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMaterialProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMaterialProducto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproducto =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.materialproducto =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(MaterialProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioMaterialProducto(this.materialproducto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.materialproductoConstantesFunciones.cargarid_empresaMaterialProducto || this.materialproductoConstantesFunciones.event_dependid_empresaMaterialProducto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.materialproducto.getid_empresa());
									//this.inicializarActualizarBindingMaterialProducto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(materialproducto.getEmpresa()!=null) {
							this.empresasForeignKey.add(materialproducto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.materialproducto.getid_empresa(),false,"Formulario");

					//TipoProducto
					if(!this.materialproductoConstantesFunciones.cargarid_tipo_productoMaterialProducto || this.materialproductoConstantesFunciones.event_dependid_tipo_productoMaterialProducto) {
						//this.cargarCombosTipoProductosForeignKeyLista(" where id="+this.materialproducto.getid_tipo_producto());
									//this.inicializarActualizarBindingMaterialProducto(false,false);
						this.tipoproductosForeignKey=new ArrayList<TipoProducto>();

						if(materialproducto.getTipoProducto()!=null) {
							this.tipoproductosForeignKey.add(materialproducto.getTipoProducto());
						}

						this.addItemDefectoCombosForeignKeyTipoProducto();
						this.cargarCombosFrameTipoProductosForeignKey("Todos");
					}
					this.setActualTipoProductoForeignKey(this.materialproducto.getid_tipo_producto(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesMaterialProducto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesMaterialProducto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMaterialProducto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoMaterialProducto(MaterialProducto materialproducto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoMaterialProducto(materialproducto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoMaterialProducto(MaterialProducto materialproducto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioMaterialProducto(materialproducto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyMaterialProducto(materialproducto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyMaterialProducto(materialproducto);
	}
	
	public void setVariablesObjetoActualToFormularioMaterialProducto(MaterialProducto materialproducto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormMaterialProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormMaterialProducto.jLabelidMaterialProducto.setText(materialproducto.getId().toString());
			this.jInternalFrameDetalleFormMaterialProducto.jTextFieldcodigoMaterialProducto.setText(materialproducto.getcodigo());
			this.jInternalFrameDetalleFormMaterialProducto.jTextAreanombreMaterialProducto.setText(materialproducto.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,MaterialProducto materialproductoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,materialproductoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,MaterialProducto materialproductoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				materialproductoLocal=this.materialproducto;
			} else {
				materialproductoLocal=this.materialproductoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(materialproductoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoMaterialProducto(materialproductoLocal,true);
					
					if(materialproductoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(materialproductoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.materialproductoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(materialproductoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoMaterialProducto(MaterialProducto materialproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMaterialProducto(materialproducto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysMaterialProducto(materialproducto);
	}
	
	public void setVariablesFormularioToObjetoActualMaterialProducto(MaterialProducto materialproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMaterialProducto(materialproducto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualMaterialProducto(MaterialProducto materialproducto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormMaterialProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormMaterialProducto.jLabelidMaterialProducto.getText()==null || this.jInternalFrameDetalleFormMaterialProducto.jLabelidMaterialProducto.getText()=="" || this.jInternalFrameDetalleFormMaterialProducto.jLabelidMaterialProducto.getText()=="Id") {
				this.jInternalFrameDetalleFormMaterialProducto.jLabelidMaterialProducto.setText("0");
			}

			if(conColumnasBase) {materialproducto.setId(Long.parseLong(this.jInternalFrameDetalleFormMaterialProducto.jLabelidMaterialProducto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MaterialProductoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMaterialProducto.jLabelIdMaterialProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			materialproducto.setcodigo(this.jInternalFrameDetalleFormMaterialProducto.jTextFieldcodigoMaterialProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MaterialProductoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMaterialProducto.jLabelcodigoMaterialProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			materialproducto.setnombre(this.jInternalFrameDetalleFormMaterialProducto.jTextAreanombreMaterialProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MaterialProductoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMaterialProducto.jLabelnombreMaterialProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMaterialProducto(MaterialProducto materialproductoBean,MaterialProducto materialproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && materialproductoBean.getid_tipo_producto()!=null && !materialproductoBean.getid_tipo_producto().equals(-1L))) {materialproducto.setid_tipo_producto(materialproductoBean.getid_tipo_producto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosMaterialProducto(MaterialProducto materialproductoOrigen,MaterialProducto materialproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && materialproductoOrigen.getId()!=null && !materialproductoOrigen.getId().equals(0L))) {materialproducto.setId(materialproductoOrigen.getId());}}
			if(conDefault || (!conDefault && materialproductoOrigen.getid_tipo_producto()!=null && !materialproductoOrigen.getid_tipo_producto().equals(-1L))) {materialproducto.setid_tipo_producto(materialproductoOrigen.getid_tipo_producto());}
			if(conDefault || (!conDefault && materialproductoOrigen.getcodigo()!=null && !materialproductoOrigen.getcodigo().equals(""))) {materialproducto.setcodigo(materialproductoOrigen.getcodigo());}
			if(conDefault || (!conDefault && materialproductoOrigen.getnombre()!=null && !materialproductoOrigen.getnombre().equals(""))) {materialproducto.setnombre(materialproductoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMaterialProducto(MaterialProducto materialproducto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMaterialProducto.jLabelidMaterialProducto.setText(materialproducto.getId().toString());
			this.jInternalFrameDetalleFormMaterialProducto.jTextFieldcodigoMaterialProducto.setText(materialproducto.getcodigo());
			this.jInternalFrameDetalleFormMaterialProducto.jTextAreanombreMaterialProducto.setText(materialproducto.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMaterialProducto(MaterialProductoBean materialproductoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMaterialProducto.jLabelidMaterialProducto.setText(materialproductoBean.getId().toString());
			this.jInternalFrameDetalleFormMaterialProducto.jTextFieldcodigoMaterialProducto.setText(materialproductoBean.getcodigo());
			this.jInternalFrameDetalleFormMaterialProducto.jTextAreanombreMaterialProducto.setText(materialproductoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanMaterialProducto(MaterialProductoParameterReturnGeneral materialproductoReturnGeneral,MaterialProductoBean materialproductoBean,Boolean conDefault) throws Exception { 
		try {
			MaterialProducto materialproductoLocal=new MaterialProducto();
			
			materialproductoLocal=materialproductoReturnGeneral.getMaterialProducto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && materialproductoLocal.getId()!=null && !materialproductoLocal.getId().equals(0L))) {materialproductoBean.setId(materialproductoLocal.getId());}}
			if(conDefault || (!conDefault && materialproductoLocal.getid_tipo_producto()!=null && !materialproductoLocal.getid_tipo_producto().equals(-1L))) {materialproductoBean.setid_tipo_producto(materialproductoLocal.getid_tipo_producto());}
			if(conDefault || (!conDefault && materialproductoLocal.getcodigo()!=null && !materialproductoLocal.getcodigo().equals(""))) {materialproductoBean.setcodigo(materialproductoLocal.getcodigo());}
			if(conDefault || (!conDefault && materialproductoLocal.getnombre()!=null && !materialproductoLocal.getnombre().equals(""))) {materialproductoBean.setnombre(materialproductoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxMaterialProductoGenerico(Long idMaterialProductoSeleccionado,JComboBox jComboBoxMaterialProducto,List<MaterialProducto> materialproductosLocal)throws Exception {
		try {
			MaterialProducto  materialproductoTemp=null;

			for(MaterialProducto materialproductoAux:materialproductosLocal) {
				if(materialproductoAux.getId()!=null && materialproductoAux.getId().equals(idMaterialProductoSeleccionado)) {
					materialproductoTemp=materialproductoAux;
					break;
				}
			}

			jComboBoxMaterialProducto.setSelectedItem(materialproductoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxMaterialProductoGenerico(JComboBox jComboBoxMaterialProducto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxMaterialProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMaterialProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxMaterialProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMaterialProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMaterialProducto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxMaterialProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMaterialProducto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxMaterialProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxMaterialProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxMaterialProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			materialproducto=(MaterialProducto) materialproductoLogic.getMaterialProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			materialproducto =(MaterialProducto) materialproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!materialproducto.getIsNew() && !materialproducto.getIsChanged() && !materialproducto.getIsDeleted()) {
				sDescripcion=materialproducto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=materialproducto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoProducto")) {
			//sDescripcion=this.getActualTipoProductoForeignKeyDescripcion((Long)value);
			if(!materialproducto.getIsNew() && !materialproducto.getIsChanged() && !materialproducto.getIsDeleted()) {
				sDescripcion=materialproducto.gettipoproducto_descripcion();
			} else {
				//sDescripcion=this.getActualTipoProductoForeignKeyDescripcion((Long)value);
				sDescripcion=materialproducto.gettipoproducto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		MaterialProducto materialproductoRow=new MaterialProducto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			materialproductoRow=(MaterialProducto) materialproductoLogic.getMaterialProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			materialproductoRow=(MaterialProducto) materialproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonProductoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,MaterialProducto materialproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormMaterialProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.materialproducto = (MaterialProducto)this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.materialproducto = (MaterialProducto)this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(materialproducto!=null) {
						this.materialproducto = materialproducto;
					} else {
						this.materialproducto = new MaterialProducto();
					}
				}

				if(this.isTienePermisosProducto && this.permiteMantenimiento(this.materialproducto)) {
					ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFramePopup=new ProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFramePopup;
					} else {
						productoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame;
					}

					List<MaterialProducto> materialproductos=new ArrayList<MaterialProducto>();
					materialproductos.add(this.materialproducto);
					if(!esRelacionado) {
						//productoBeanSwingJInternalFrame.productoSessionBean.setConGuardarRelaciones(false);
						//productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormMaterialProducto.cargarProductoBeanSwingJInternalFrame(materialproductos,this.materialproducto,productoBeanSwingJInternalFrame,/*conInicializar,*/productoBeanSwingJInternalFrame.productoSessionBean.getConGuardarRelaciones(),productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado());
					productoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoBeanSwingJInternalFrame.actualizarEstadoPanelsProducto("no_relacionado");

						productoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoConstantesFunciones.ITAMANIOFILATABLA + (ProductoConstantesFunciones.ITAMANIOFILATABLA/2));

						productoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderMaterialProducto=(TitledBorder)this.jScrollPanelDatosMaterialProducto.getBorder();
						TitledBorder titledBorderProducto=(TitledBorder)productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

						titledBorderProducto.setTitle(titledBorderMaterialProducto.getTitle() + " -> Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoBeanSwingJInternalFrame);
						}

						productoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoBeanSwingJInternalFrame);

						productoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.materialproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonParametroInventarioDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,MaterialProducto materialproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormMaterialProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.materialproducto = (MaterialProducto)this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.materialproducto = (MaterialProducto)this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(materialproducto!=null) {
						this.materialproducto = materialproducto;
					} else {
						this.materialproducto = new MaterialProducto();
					}
				}

				if(this.isTienePermisosParametroInventarioDefecto && this.permiteMantenimiento(this.materialproducto)) {
					ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFramePopup=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFramePopup;
					} else {
						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame;
					}

					List<MaterialProducto> materialproductos=new ArrayList<MaterialProducto>();
					materialproductos.add(this.materialproducto);
					if(!esRelacionado) {
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setConGuardarRelaciones(false);
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormMaterialProducto.cargarParametroInventarioDefectoBeanSwingJInternalFrame(materialproductos,this.materialproducto,parametroinventariodefectoBeanSwingJInternalFrame,/*conInicializar,*/parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getConGuardarRelaciones(),parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("no_relacionado");

						parametroinventariodefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametroinventariodefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderMaterialProducto=(TitledBorder)this.jScrollPanelDatosMaterialProducto.getBorder();
						TitledBorder titledBorderParametroInventarioDefecto=(TitledBorder)parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getBorder();

						titledBorderParametroInventarioDefecto.setTitle(titledBorderMaterialProducto.getTitle() + " -> Parametro Inventario Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametroinventariodefectoBeanSwingJInternalFrame);
						}

						parametroinventariodefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametroinventariodefectoBeanSwingJInternalFrame);

						parametroinventariodefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.materialproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Inventario Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualMaterialProducto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoMaterialProducto.setVisible((this.isVisibilidadCeldaNuevoMaterialProducto && this.isPermisoNuevoMaterialProducto));			
			this.jButtonDuplicarMaterialProducto.setVisible((this.isVisibilidadCeldaDuplicarMaterialProducto && this.isPermisoDuplicarMaterialProducto));			
			this.jButtonCopiarMaterialProducto.setVisible((this.isVisibilidadCeldaCopiarMaterialProducto && this.isPermisoCopiarMaterialProducto));
			this.jButtonVerFormMaterialProducto.setVisible((this.isVisibilidadCeldaVerFormMaterialProducto && this.isPermisoVerFormMaterialProducto));
			
			this.jButtonAbrirOrderByMaterialProducto.setVisible((this.isVisibilidadCeldaOrdenMaterialProducto && this.isPermisoOrdenMaterialProducto));			
			
			this.jButtonNuevoRelacionesMaterialProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesMaterialProducto && this.isPermisoNuevoMaterialProducto));			
			this.jButtonNuevoGuardarCambiosMaterialProducto.setVisible((this.isVisibilidadCeldaNuevoMaterialProducto && this.isPermisoNuevoMaterialProducto && this.isPermisoGuardarCambiosMaterialProducto));
			
			if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
			this.jInternalFrameDetalleFormMaterialProducto.jButtonModificarMaterialProducto.setVisible((this.isVisibilidadCeldaModificarMaterialProducto && this.isPermisoActualizarMaterialProducto));	
			this.jInternalFrameDetalleFormMaterialProducto.jButtonActualizarMaterialProducto.setVisible((this.isVisibilidadCeldaActualizarMaterialProducto && this.isPermisoActualizarMaterialProducto));	
			this.jInternalFrameDetalleFormMaterialProducto.jButtonEliminarMaterialProducto.setVisible((this.isVisibilidadCeldaEliminarMaterialProducto && this.isPermisoEliminarMaterialProducto));
			this.jInternalFrameDetalleFormMaterialProducto.jButtonCancelarMaterialProducto.setVisible(this.isVisibilidadCeldaCancelarMaterialProducto);							
			this.jInternalFrameDetalleFormMaterialProducto.jButtonGuardarCambiosMaterialProducto.setVisible((this.isVisibilidadCeldaGuardarMaterialProducto && this.isPermisoGuardarCambiosMaterialProducto));			
			
			}
						
			this.jButtonGuardarCambiosTablaMaterialProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosMaterialProducto && this.isPermisoGuardarCambiosMaterialProducto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarMaterialProducto.setVisible((this.isVisibilidadCeldaNuevoMaterialProducto && this.isPermisoNuevoMaterialProducto));						
			this.jButtonDuplicarToolBarMaterialProducto.setVisible((this.isVisibilidadCeldaDuplicarMaterialProducto && this.isPermisoDuplicarMaterialProducto));						
			this.jButtonCopiarToolBarMaterialProducto.setVisible((this.isVisibilidadCeldaCopiarMaterialProducto && this.isPermisoCopiarMaterialProducto));			
			this.jButtonVerFormToolBarMaterialProducto.setVisible((this.isVisibilidadCeldaVerFormMaterialProducto && this.isPermisoVerFormMaterialProducto));			
			this.jButtonAbrirOrderByToolBarMaterialProducto.setVisible((this.isVisibilidadCeldaOrdenMaterialProducto && this.isPermisoOrdenMaterialProducto));
			this.jButtonNuevoRelacionesToolBarMaterialProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesMaterialProducto && this.isPermisoNuevoMaterialProducto));			
			this.jButtonNuevoGuardarCambiosToolBarMaterialProducto.setVisible((this.isVisibilidadCeldaNuevoMaterialProducto && this.isPermisoNuevoMaterialProducto && this.isPermisoGuardarCambiosMaterialProducto));			
			
			if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
			this.jInternalFrameDetalleFormMaterialProducto.jButtonModificarToolBarMaterialProducto.setVisible((this.isVisibilidadCeldaModificarMaterialProducto && this.isPermisoActualizarMaterialProducto));	
			this.jInternalFrameDetalleFormMaterialProducto.jButtonActualizarToolBarMaterialProducto.setVisible((this.isVisibilidadCeldaActualizarMaterialProducto  && this.isPermisoActualizarMaterialProducto));	
			this.jInternalFrameDetalleFormMaterialProducto.jButtonEliminarToolBarMaterialProducto.setVisible((this.isVisibilidadCeldaEliminarMaterialProducto && this.isPermisoEliminarMaterialProducto));
			this.jInternalFrameDetalleFormMaterialProducto.jButtonCancelarToolBarMaterialProducto.setVisible(this.isVisibilidadCeldaCancelarMaterialProducto);				
			this.jInternalFrameDetalleFormMaterialProducto.jButtonGuardarCambiosToolBarMaterialProducto.setVisible((this.isVisibilidadCeldaGuardarMaterialProducto && this.isPermisoGuardarCambiosMaterialProducto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarMaterialProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosMaterialProducto && this.isPermisoGuardarCambiosMaterialProducto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoMaterialProducto.setVisible((this.isVisibilidadCeldaNuevoMaterialProducto && this.isPermisoNuevoMaterialProducto));			
			this.jMenuItemDuplicarMaterialProducto.setVisible((this.isVisibilidadCeldaDuplicarMaterialProducto && this.isPermisoDuplicarMaterialProducto));			
			this.jMenuItemCopiarMaterialProducto.setVisible((this.isVisibilidadCeldaCopiarMaterialProducto && this.isPermisoCopiarMaterialProducto));			
			this.jMenuItemVerFormMaterialProducto.setVisible((this.isVisibilidadCeldaVerFormMaterialProducto && this.isPermisoVerFormMaterialProducto));			
			this.jMenuItemAbrirOrderByMaterialProducto.setVisible((this.isVisibilidadCeldaOrdenMaterialProducto && this.isPermisoOrdenMaterialProducto));			
			//this.jMenuItemMostrarOcultarMaterialProducto.setVisible((this.isVisibilidadCeldaOrdenMaterialProducto && this.isPermisoOrdenMaterialProducto));
			this.jMenuItemDetalleAbrirOrderByMaterialProducto.setVisible((this.isVisibilidadCeldaOrdenMaterialProducto && this.isPermisoOrdenMaterialProducto));			
			//this.jMenuItemDetalleMostrarOcultarMaterialProducto.setVisible((this.isVisibilidadCeldaOrdenMaterialProducto && this.isPermisoOrdenMaterialProducto));			
			this.jMenuItemNuevoRelacionesMaterialProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesMaterialProducto && this.isPermisoNuevoMaterialProducto));			
			this.jMenuItemNuevoGuardarCambiosMaterialProducto.setVisible((this.isVisibilidadCeldaNuevoMaterialProducto && this.isPermisoNuevoMaterialProducto && this.isPermisoGuardarCambiosMaterialProducto));									
			
			if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
			this.jInternalFrameDetalleFormMaterialProducto.jMenuItemModificarMaterialProducto.setVisible((this.isVisibilidadCeldaModificarMaterialProducto && this.isPermisoActualizarMaterialProducto));	
			this.jInternalFrameDetalleFormMaterialProducto.jMenuItemActualizarMaterialProducto.setVisible((this.isVisibilidadCeldaActualizarMaterialProducto && this.isPermisoActualizarMaterialProducto));	
			this.jInternalFrameDetalleFormMaterialProducto.jMenuItemEliminarMaterialProducto.setVisible((this.isVisibilidadCeldaEliminarMaterialProducto && this.isPermisoEliminarMaterialProducto));
			this.jInternalFrameDetalleFormMaterialProducto.jMenuItemCancelarMaterialProducto.setVisible(this.isVisibilidadCeldaCancelarMaterialProducto);				
			}
			
			this.jMenuItemGuardarCambiosMaterialProducto.setVisible((this.isVisibilidadCeldaGuardarMaterialProducto && this.isPermisoGuardarCambiosMaterialProducto));						
			this.jMenuItemGuardarCambiosTablaMaterialProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosMaterialProducto && this.isPermisoGuardarCambiosMaterialProducto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoMaterialProducto=this.jButtonNuevoMaterialProducto.isVisible();
			this.isVisibilidadCeldaDuplicarMaterialProducto=this.jButtonDuplicarMaterialProducto.isVisible();
			this.isVisibilidadCeldaCopiarMaterialProducto=this.jButtonCopiarMaterialProducto.isVisible();
			this.isVisibilidadCeldaVerFormMaterialProducto=this.jButtonVerFormMaterialProducto.isVisible();
			
			this.isVisibilidadCeldaOrdenMaterialProducto=this.jButtonAbrirOrderByMaterialProducto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesMaterialProducto=this.jButtonNuevoRelacionesMaterialProducto.isVisible();
			this.isVisibilidadCeldaModificarMaterialProducto=this.jButtonModificarMaterialProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
			this.isVisibilidadCeldaActualizarMaterialProducto=this.jInternalFrameDetalleFormMaterialProducto.jButtonActualizarMaterialProducto.isVisible();
			this.isVisibilidadCeldaEliminarMaterialProducto=this.jInternalFrameDetalleFormMaterialProducto.jButtonEliminarMaterialProducto.isVisible();
			this.isVisibilidadCeldaCancelarMaterialProducto=this.jInternalFrameDetalleFormMaterialProducto.jButtonCancelarMaterialProducto.isVisible();
			this.isVisibilidadCeldaGuardarMaterialProducto=this.jInternalFrameDetalleFormMaterialProducto.jButtonGuardarCambiosMaterialProducto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosMaterialProducto=this.jButtonGuardarCambiosTablaMaterialProducto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoMaterialProducto=this.jButtonNuevoToolBarMaterialProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMaterialProducto=this.jButtonNuevoRelacionesToolBarMaterialProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
			this.isVisibilidadCeldaModificarMaterialProducto=this.jInternalFrameDetalleFormMaterialProducto.jButtonModificarToolBarMaterialProducto.isVisible();
			this.isVisibilidadCeldaActualizarMaterialProducto=this.jInternalFrameDetalleFormMaterialProducto.jButtonActualizarToolBarMaterialProducto.isVisible();
			this.isVisibilidadCeldaEliminarMaterialProducto=this.jInternalFrameDetalleFormMaterialProducto.jButtonEliminarToolBarMaterialProducto.isVisible();
			this.isVisibilidadCeldaCancelarMaterialProducto=this.jInternalFrameDetalleFormMaterialProducto.jButtonCancelarToolBarMaterialProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMaterialProducto=this.jButtonGuardarCambiosToolBarMaterialProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMaterialProducto=this.jButtonGuardarCambiosTablaToolBarMaterialProducto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoMaterialProducto=this.jMenuItemNuevoMaterialProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMaterialProducto=this.jMenuItemNuevoRelacionesMaterialProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
			this.isVisibilidadCeldaModificarMaterialProducto=this.jInternalFrameDetalleFormMaterialProducto.jMenuItemModificarMaterialProducto.isVisible();
			this.isVisibilidadCeldaActualizarMaterialProducto=this.jInternalFrameDetalleFormMaterialProducto.jMenuItemActualizarMaterialProducto.isVisible();
			this.isVisibilidadCeldaEliminarMaterialProducto=this.jInternalFrameDetalleFormMaterialProducto.jMenuItemEliminarMaterialProducto.isVisible();
			this.isVisibilidadCeldaCancelarMaterialProducto=this.jInternalFrameDetalleFormMaterialProducto.jMenuItemCancelarMaterialProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMaterialProducto=this.jMenuItemGuardarCambiosMaterialProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMaterialProducto=this.jMenuItemGuardarCambiosTablaMaterialProducto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesMaterialProducto(Boolean esInicializar) {
		if(MaterialProductoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.materialproductoSessionBean.getConGuardarRelaciones()) {
				//if(this.materialproductoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesMaterialProducto();
			}
			
			this.inicializarActualizarBindingBotonesManualMaterialProducto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualMaterialProducto() {
		this.jButtonNuevoMaterialProducto.setVisible(this.isPermisoNuevoMaterialProducto);			
		this.jButtonDuplicarMaterialProducto.setVisible(this.isPermisoDuplicarMaterialProducto);			
		this.jButtonCopiarMaterialProducto.setVisible(this.isPermisoCopiarMaterialProducto);			
		this.jButtonVerFormMaterialProducto.setVisible(this.isPermisoVerFormMaterialProducto);			
		
		this.jButtonAbrirOrderByMaterialProducto.setVisible(this.isPermisoOrdenMaterialProducto);					
		
		this.jButtonNuevoRelacionesMaterialProducto.setVisible(this.isPermisoNuevoMaterialProducto);			
		
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMaterialProducto.jButtonModificarMaterialProducto.setVisible(this.isPermisoActualizarMaterialProducto);	
			this.jInternalFrameDetalleFormMaterialProducto.jButtonActualizarMaterialProducto.setVisible(this.isPermisoActualizarMaterialProducto);	
			this.jInternalFrameDetalleFormMaterialProducto.jButtonEliminarMaterialProducto.setVisible(this.isPermisoEliminarMaterialProducto);
			this.jInternalFrameDetalleFormMaterialProducto.jButtonCancelarMaterialProducto.setVisible(this.isVisibilidadCeldaCancelarMaterialProducto);						
			this.jInternalFrameDetalleFormMaterialProducto.jButtonGuardarCambiosMaterialProducto.setVisible(this.isPermisoGuardarCambiosMaterialProducto);							
		}
		
		this.jButtonGuardarCambiosTablaMaterialProducto.setVisible(this.isPermisoActualizarMaterialProducto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleMaterialProducto() {
		this.jInternalFrameDetalleFormMaterialProducto.jButtonModificarMaterialProducto.setVisible(this.isPermisoActualizarMaterialProducto);	
		this.jInternalFrameDetalleFormMaterialProducto.jButtonActualizarMaterialProducto.setVisible(this.isPermisoActualizarMaterialProducto);	
		this.jInternalFrameDetalleFormMaterialProducto.jButtonEliminarMaterialProducto.setVisible(this.isPermisoEliminarMaterialProducto);
		this.jInternalFrameDetalleFormMaterialProducto.jButtonCancelarMaterialProducto.setVisible(this.isVisibilidadCeldaCancelarMaterialProducto);							
		this.jInternalFrameDetalleFormMaterialProducto.jButtonGuardarCambiosMaterialProducto.setVisible((this.isVisibilidadCeldaGuardarMaterialProducto && this.isPermisoGuardarCambiosMaterialProducto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosMaterialProducto() {
		if(MaterialProductoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualMaterialProducto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesMaterialProducto() {
	}
	
	public void jTableDatosMaterialProductoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarMaterialProducto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidMaterialProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMaterialProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMaterialProducto(this.getmaterialproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMaterialProducto(this.materialproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.materialproducto =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.materialproducto =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.materialproducto==null) {
						this.materialproducto = new MaterialProducto();
					}

					this.setVariablesFormularioToObjetoActualMaterialProducto(this.materialproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMaterialProducto(this.materialproducto);
				}

				if(this.materialproducto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.materialproducto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMaterialProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaMaterialProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebMaterialProducto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMaterialProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMaterialProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMaterialProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproducto =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.materialproducto =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMaterialProducto(this.getmaterialproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMaterialProducto(this.materialproducto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.materialproductoLogic.getConnexion());

				if(this.materialproducto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.materialproducto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMaterialProducto=(TitledBorder)this.jScrollPanelDatosMaterialProducto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderMaterialProducto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaMaterialProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMaterialProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMaterialProducto(this.getmaterialproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMaterialProducto(this.materialproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.materialproducto =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.materialproducto =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.materialproducto==null) {
						this.materialproducto = new MaterialProducto();
					}

					this.setVariablesFormularioToObjetoActualMaterialProducto(this.materialproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMaterialProducto(this.materialproducto);
				}

				if(this.materialproducto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.materialproducto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMaterialProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_productoMaterialProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoproducto=true;

			idTienePermisotipoproducto=this.tienePermisosUsuarioEnPaginaWebMaterialProducto(TipoProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMaterialProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMaterialProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMaterialProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproducto =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.materialproducto =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMaterialProducto(this.getmaterialproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMaterialProducto(this.materialproducto);

				this.tipoproductoBeanSwingJInternalFrame=new TipoProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoproductoBeanSwingJInternalFrame.getTipoProductoLogic().setConnexion(this.materialproductoLogic.getConnexion());

				if(this.materialproducto.getid_tipo_producto()!=null) {
					this.tipoproductoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoproductoBeanSwingJInternalFrame.setIdActual(this.materialproducto.getid_tipo_producto());
					this.tipoproductoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoproductoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoProducto();
				}

				JInternalFrameBase jinternalFrame =this.tipoproductoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMaterialProducto=(TitledBorder)this.jScrollPanelDatosMaterialProducto.getBorder();
				TitledBorder titledBordertipoproducto=(TitledBorder)this.tipoproductoBeanSwingJInternalFrame.jScrollPanelDatosTipoProducto.getBorder();

				titledBordertipoproducto.setTitle(titledBorderMaterialProducto.getTitle() + " -> Tipo Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_productoMaterialProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMaterialProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMaterialProducto(this.getmaterialproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMaterialProducto(this.materialproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.materialproducto =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.materialproducto =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.materialproducto==null) {
						this.materialproducto = new MaterialProducto();
					}

					this.setVariablesFormularioToObjetoActualMaterialProducto(this.materialproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMaterialProducto(this.materialproducto);
				}

				if(this.materialproducto.getid_tipo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_producto = "+this.materialproducto.getid_tipo_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMaterialProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoMaterialProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMaterialProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMaterialProducto(this.getmaterialproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMaterialProducto(this.materialproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.materialproducto =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.materialproducto =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.materialproducto==null) {
						this.materialproducto = new MaterialProducto();
					}

					this.setVariablesFormularioToObjetoActualMaterialProducto(this.materialproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMaterialProducto(this.materialproducto);
				}

				if(this.materialproducto.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.materialproducto.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMaterialProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreMaterialProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMaterialProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMaterialProducto(this.getmaterialproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMaterialProducto(this.materialproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.materialproducto =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.materialproducto =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.materialproducto==null) {
						this.materialproducto = new MaterialProducto();
					}

					this.setVariablesFormularioToObjetoActualMaterialProducto(this.materialproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMaterialProducto(this.materialproducto);
				}

				if(this.materialproducto.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.materialproducto.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMaterialProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoMaterialProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMaterialProducto(false,false);

			this.getMaterialProductosBusquedaPorCodigo();

			this.inicializarActualizarBindingMaterialProducto(false);

			//if(MaterialProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMaterialProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreMaterialProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMaterialProducto(false,false);

			this.getMaterialProductosBusquedaPorNombre();

			this.inicializarActualizarBindingMaterialProducto(false);

			//if(MaterialProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMaterialProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaMaterialProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMaterialProducto(false,false);

			this.getMaterialProductosFK_IdEmpresa();

			this.inicializarActualizarBindingMaterialProducto(false);

			//if(MaterialProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMaterialProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoProductoMaterialProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMaterialProducto(false,false);

			this.getMaterialProductosFK_IdTipoProducto();

			this.inicializarActualizarBindingMaterialProducto(false);

			//if(MaterialProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMaterialProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.materialproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameMaterialProducto() {
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
		

		if(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
			this.jInternalFrameDetalleFormMaterialProducto.setVisible(false);	    			
			this.jInternalFrameDetalleFormMaterialProducto.dispose();
			this.jInternalFrameDetalleFormMaterialProducto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoMaterialProducto!=null) {
			this.jInternalFrameReporteDinamicoMaterialProducto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoMaterialProducto.dispose();
			this.jInternalFrameReporteDinamicoMaterialProducto=null;
		}
		
		if(this.jInternalFrameImportacionMaterialProducto!=null) {
			this.jInternalFrameImportacionMaterialProducto.setVisible(false);	    			
			this.jInternalFrameImportacionMaterialProducto.dispose();
			this.jInternalFrameImportacionMaterialProducto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessMaterialProducto();
			
			MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
			
			
			if(sTipo.equals("NuevoMaterialProducto")) {
				jButtonNuevoMaterialProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarMaterialProducto")) {
				jButtonDuplicarMaterialProductoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarMaterialProducto")) {
				jButtonCopiarMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormMaterialProducto")) {
				jButtonVerFormMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarMaterialProducto")) {
				jButtonNuevoMaterialProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarMaterialProducto")) {
				jButtonDuplicarMaterialProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoMaterialProducto")) {
				jButtonNuevoMaterialProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarMaterialProducto")) {
				jButtonDuplicarMaterialProductoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesMaterialProducto")) {
				jButtonNuevoMaterialProductoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarMaterialProducto")) {
				jButtonNuevoMaterialProductoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesMaterialProducto")) {
				jButtonNuevoMaterialProductoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarMaterialProducto")) {
				jButtonModificarMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarMaterialProducto")) {
				jButtonModificarMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarMaterialProducto")) {
				jButtonModificarMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarMaterialProducto")) {
				jButtonActualizarMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarMaterialProducto")) {
				jButtonActualizarMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarMaterialProducto")) {
				jButtonActualizarMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarMaterialProducto")) {
				jButtonEliminarMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarMaterialProducto")) {
				jButtonEliminarMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarMaterialProducto")) {
				jButtonEliminarMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarMaterialProducto")) {
				jButtonCancelarMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarMaterialProducto")) {
				jButtonCancelarMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarMaterialProducto")) {
				jButtonCancelarMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarMaterialProducto")) {
				jButtonCerrarMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarMaterialProducto")) {
				jButtonCerrarMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarMaterialProducto")) {
				jButtonCerrarMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarMaterialProducto")) {
				jButtonMostrarOcultarMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarMaterialProducto")) {
				jButtonCancelarMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosMaterialProducto")) {
				jButtonGuardarCambiosMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarMaterialProducto")) {
				jButtonGuardarCambiosMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarMaterialProducto")) {
				jButtonCopiarMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarMaterialProducto")) {
				jButtonVerFormMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosMaterialProducto")) {
				jButtonGuardarCambiosMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarMaterialProducto")) {
				jButtonCopiarMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormMaterialProducto")) {
				jButtonVerFormMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaMaterialProducto")) {
				jButtonGuardarCambiosMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarMaterialProducto")) {
				jButtonGuardarCambiosMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaMaterialProducto")) {
				jButtonGuardarCambiosMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionMaterialProducto")) {
				jButtonRecargarInformacionMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarMaterialProducto")) {
				jButtonRecargarInformacionMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionMaterialProducto")) {
				jButtonRecargarInformacionMaterialProductoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresMaterialProducto")) {
				jButtonAnterioresMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarMaterialProducto")) {
				jButtonAnterioresMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreMaterialProducto")) {
				jButtonAnterioresMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesMaterialProducto")) {
				jButtonSiguientesMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarMaterialProducto")) {
				jButtonSiguientesMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesMaterialProducto")) {
				jButtonSiguientesMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByMaterialProducto") || sTipo.equals("MenuItemDetalleAbrirOrderByMaterialProducto")) {
				jButtonAbrirOrderByMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarMaterialProducto") || sTipo.equals("MenuItemDetalleMostrarOcultarMaterialProducto")) {
				jButtonMostrarOcultarMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosMaterialProducto")) {
				jButtonNuevoGuardarCambiosMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarMaterialProducto")) {
				jButtonNuevoGuardarCambiosMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosMaterialProducto")) {
				jButtonNuevoGuardarCambiosMaterialProductoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoMaterialProducto")) {
				jButtonCerrarReporteDinamicoMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoMaterialProducto")) {
				jButtonGenerarReporteDinamicoMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoMaterialProducto")) {
				
				jButtonGenerarExcelReporteDinamicoMaterialProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionMaterialProducto")) {
				jButtonCerrarImportacionMaterialProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionMaterialProducto")) {
				
				jButtonGenerarImportacionMaterialProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionMaterialProducto")) {
				
				jButtonAbrirImportacionMaterialProductoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesMaterialProducto")) {
				jComboBoxTiposAccionesMaterialProductoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesMaterialProducto")) {
				jComboBoxTiposRelacionesMaterialProductoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioMaterialProducto")) {
				jComboBoxTiposAccionesMaterialProductoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarMaterialProducto")) {
				
				jComboBoxTiposSeleccionarMaterialProductoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralMaterialProducto")) {
				jTextFieldValorCampoGeneralMaterialProductoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByMaterialProducto")) {
				jButtonAbrirOrderByMaterialProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarMaterialProducto")) {
				jButtonAbrirOrderByMaterialProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByMaterialProducto")) {
				jButtonCerrarOrderByMaterialProductoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMaterialProductoBusqueda")) {
				this.jButtonidMaterialProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMaterialProductoUpdate")) {
				this.jButtonid_empresaMaterialProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMaterialProductoBusqueda")) {
				this.jButtonid_empresaMaterialProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_productoMaterialProductoUpdate")) {
				this.jButtonid_tipo_productoMaterialProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_productoMaterialProductoBusqueda")) {
				this.jButtonid_tipo_productoMaterialProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoMaterialProductoBusqueda")) {
				this.jButtoncodigoMaterialProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreMaterialProductoBusqueda")) {
				this.jButtonnombreMaterialProductoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoMaterialProducto")) {
				this.jButtonBusquedaPorCodigoMaterialProductoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreMaterialProducto")) {
				this.jButtonBusquedaPorNombreMaterialProductoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoProductoMaterialProducto")) {
				this.jButtonFK_IdTipoProductoMaterialProductoActionPerformed(evt);
			}
			
			;
			
			
			MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessMaterialProducto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMaterialProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.materialproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.materialproducto);
				
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
				
				


				
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MaterialProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MaterialProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			MaterialProducto materialproductoLocal=null;
			
			if(!this.getEsControlTabla()) {
				materialproductoLocal=this.materialproducto;
			} else {
				materialproductoLocal=this.materialproductoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.materialproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.materialproducto);
				
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
							
				
				


				
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MaterialProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MaterialProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMaterialProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMaterialProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoAnterior =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.materialproductoAnterior =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
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
			
			MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
			
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
			
			


			
			MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMaterialProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.materialproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.materialproducto);
				
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
								
						
				


				
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MaterialProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MaterialProducto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.materialproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.materialproducto);
				
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
								
				
				


				
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MaterialProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MaterialProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMaterialProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMaterialProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoAnterior =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.materialproductoAnterior =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.materialproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.materialproducto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMaterialProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMaterialProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoAnterior =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.materialproductoAnterior =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMaterialProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.materialproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.materialproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.materialproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.materialproducto);
				
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
							
				
				


				
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MaterialProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MaterialProducto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMaterialProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMaterialProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.materialproductoAnterior =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.materialproductoAnterior =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
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
			
			MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
			
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
			
			


			
			MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMaterialProductoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.materialproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.materialproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.materialproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.materialproducto);
				
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
								
				
				


				
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MaterialProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MaterialProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMaterialProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMaterialProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoAnterior =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.materialproductoAnterior =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMaterialProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.materialproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.materialproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMaterialProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.materialproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.materialproducto);
				
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosMaterialProducto")) {
					jCheckBoxSeleccionarTodosMaterialProductoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosMaterialProducto")) {
					jCheckBoxSeleccionadosMaterialProductoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarMaterialProducto")) {
					
				}
				
				


				
				
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MaterialProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MaterialProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.materialproducto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.materialproducto);
				
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
												
				
				


				
				
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MaterialProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MaterialProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMaterialProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMaterialProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.materialproductoAnterior =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.materialproductoAnterior =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMaterialProductoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.materialproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.materialproducto);
				
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
				
				
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
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
			
			MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
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
			
			


			
			MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMaterialProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.materialproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.materialproducto);
				
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MaterialProducto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MaterialProducto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.materialproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.materialproducto);
				
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
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
				
				


				
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MaterialProducto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MaterialProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMaterialProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMaterialProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.materialproductoAnterior =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.materialproductoAnterior =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarMaterialProducto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosMaterialProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosMaterialProducto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.materialproducto =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.materialproducto =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.materialproducto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarMaterialProducto")) {
				
				}
				
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarMaterialProducto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosMaterialProducto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarMaterialProducto")) {
			
			}
			
			MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessMaterialProducto();
			
			MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
			
			if(sTipo.equals("NuevoMaterialProducto")) {
				jButtonNuevoMaterialProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarMaterialProducto")) {
				jButtonDuplicarMaterialProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarMaterialProducto")) {
				jButtonCopiarMaterialProductoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormMaterialProducto")) {
				jButtonVerFormMaterialProductoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesMaterialProducto")) {
				jButtonNuevoMaterialProductoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarMaterialProducto")) {
				jButtonModificarMaterialProductoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarMaterialProducto")) {
				jButtonActualizarMaterialProductoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarMaterialProducto")) {
				jButtonEliminarMaterialProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaMaterialProducto")) {
				jButtonGuardarCambiosMaterialProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarMaterialProducto")) {
				jButtonCancelarMaterialProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarMaterialProducto")) {
				jButtonCerrarMaterialProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosMaterialProducto")) {
				jButtonGuardarCambiosMaterialProductoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosMaterialProducto")) {
				jButtonNuevoGuardarCambiosMaterialProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByMaterialProducto")) {
				jButtonAbrirOrderByMaterialProductoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionMaterialProducto")) {
				jButtonRecargarInformacionMaterialProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresMaterialProducto")) {
				jButtonAnterioresMaterialProductoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesMaterialProducto")) {
				jButtonSiguientesMaterialProductoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMaterialProductoBusqueda")) {
				this.jButtonidMaterialProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMaterialProductoUpdate")) {
				this.jButtonid_empresaMaterialProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMaterialProductoBusqueda")) {
				this.jButtonid_empresaMaterialProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_productoMaterialProductoUpdate")) {
				this.jButtonid_tipo_productoMaterialProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_productoMaterialProductoBusqueda")) {
				this.jButtonid_tipo_productoMaterialProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoMaterialProductoBusqueda")) {
				this.jButtoncodigoMaterialProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreMaterialProductoBusqueda")) {
				this.jButtonnombreMaterialProductoBusquedaActionPerformed(evt);
			}
			
			MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessMaterialProducto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameMaterialProducto")) {
				closingInternalFrameMaterialProducto();
				
			} else if(sTipo.equals("jButtonCancelarMaterialProducto")) {
				JInternalFrameBase jInternalFrameDetalleFormMaterialProducto = (JInternalFrameBase)evt.getSource();
	            	
	            MaterialProductoBeanSwingJInternalFrame jInternalFrameParent=(MaterialProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormMaterialProducto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarMaterialProductoActionPerformed(null);
			}
			
			MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.materialproducto,new Object(),this.materialproductoParameterGeneral,this.materialproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormMaterialProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormMaterialProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormMaterialProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.materialproducto)) {
			if(!esControlTabla) {
				if(MaterialProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualMaterialProducto(this.materialproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMaterialProducto(this.materialproducto);			
				}
				
				if(this.materialproductoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualMaterialProducto(this.materialproducto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.materialproductoReturnGeneral=materialproductoLogic.procesarEventosMaterialProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.materialproductoLogic.getMaterialProductos(),this.materialproducto,this.materialproductoParameterGeneral,this.isEsNuevoMaterialProducto,classes);//this.materialproductoLogic.getMaterialProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanMaterialProducto(this.materialproductoReturnGeneral,this.materialproductoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.materialproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanMaterialProducto(classes,this.materialproductoReturnGeneral,this.materialproductoBean,false);
					}
						
					if(this.materialproductoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyMaterialProducto(this.materialproductoReturnGeneral.getMaterialProducto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioMaterialProducto(this.materialproductoReturnGeneral.getMaterialProducto());	
					}
						
					if(this.materialproductoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioMaterialProducto(this.materialproductoReturnGeneral.getMaterialProducto(),classes);//this.materialproductoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioMaterialProducto(this.materialproducto,classes);//this.materialproductoBean);									
				}
			
				if(MaterialProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualMaterialProducto(this.materialproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMaterialProducto(this.materialproducto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.materialproductoAnterior!=null) {
						this.materialproducto=this.materialproductoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.materialproductoReturnGeneral=materialproductoLogic.procesarEventosMaterialProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.materialproductoLogic.getMaterialProductos(),this.materialproducto,this.materialproductoParameterGeneral,this.isEsNuevoMaterialProducto,classes);//this.materialproductoLogic.getMaterialProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.materialproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.materialproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.materialproductoReturnGeneral.getMaterialProducto(),materialproductoLogic.getMaterialProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.materialproductoReturnGeneral.getMaterialProducto(),this.materialproductos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosMaterialProducto.repaint();
				
				//((AbstractTableModel) this.jTableDatosMaterialProducto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosMaterialProducto();
			}
		}
	}
	
	public void actualizarVisualTableDatosMaterialProducto() throws Exception {
		
		MaterialProductoModel materialproductoModel=(MaterialProductoModel)this.jTableDatosMaterialProducto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			materialproductoModel.materialproductos=this.materialproductoLogic.getMaterialProductos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			materialproductoModel.materialproductos=this.materialproductos;
		}
		
		
		((MaterialProductoModel) this.jTableDatosMaterialProducto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaMaterialProducto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getmaterialproductoAnterior(),this.materialproductoLogic.getMaterialProductos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getmaterialproductoAnterior(),this.materialproductos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosMaterialProducto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioMaterialProducto(MaterialProducto materialproducto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(materialproducto.getProductos());
					this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(materialproducto.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
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
										
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.materialproducto,new Object(),generalEntityParameterGeneral,this.materialproductoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.materialproductoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=MaterialProductoConstantesFunciones.getClassesRelationshipsOfMaterialProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=MaterialProductoConstantesFunciones.getClassesRelationshipsFromStringsOfMaterialProducto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormMaterialProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				MaterialProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.materialproducto,new Object(),generalEntityParameterGeneral,this.materialproductoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioMaterialProducto(MaterialProductoBean materialproductoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(materialproducto.getProductos());
					this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(materialproducto.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanMaterialProducto(ArrayList<Classe> classes,MaterialProductoReturnGeneral materialproductoReturnGeneral,MaterialProductoBean materialproductoBean,Boolean conDefault) throws Exception {
		
			this.materialproductoBean.setProductos(materialproductoReturnGeneral.getMaterialProducto().getProductos());
			this.materialproductoBean.setParametroInventarioDefectos(materialproductoReturnGeneral.getMaterialProducto().getParametroInventarioDefectos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualMaterialProducto(MaterialProducto materialproducto,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					materialproducto.setProductos(this.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					materialproducto.setParametroInventarioDefectos(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.materialproducto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormMaterialProducto = new MaterialProductoDetalleFormJInternalFrame(jDesktopPane,this.materialproductoSessionBean.getConGuardarRelaciones(),this.materialproductoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormMaterialProducto);
		this.jInternalFrameDetalleFormMaterialProducto.setVisible(false);
		this.jInternalFrameDetalleFormMaterialProducto.setSelected(false);						
		
		this.jInternalFrameDetalleFormMaterialProducto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormMaterialProducto.materialproductoLogic=this.materialproductoLogic;
		
		this.cargarCombosFrameForeignKeyMaterialProducto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleMaterialProducto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMaterialProducto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyMaterialProducto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyMaterialProducto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormMaterialProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMaterialProducto"));
		
		this.jInternalFrameDetalleFormMaterialProducto.jButtonModificarMaterialProducto.addActionListener(new ButtonActionListener(this,"ModificarMaterialProducto"));

		
		this.jInternalFrameDetalleFormMaterialProducto.jButtonModificarToolBarMaterialProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarMaterialProducto"));
					
		this.jInternalFrameDetalleFormMaterialProducto.jMenuItemModificarMaterialProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarMaterialProducto"));		
		
		
		
		this.jInternalFrameDetalleFormMaterialProducto.jButtonActualizarMaterialProducto.addActionListener (new ButtonActionListener(this,"ActualizarMaterialProducto"));
		
		
		this.jInternalFrameDetalleFormMaterialProducto.jButtonActualizarToolBarMaterialProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMaterialProducto"));
						
		this.jInternalFrameDetalleFormMaterialProducto.jMenuItemActualizarMaterialProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMaterialProducto"));		
		
		
		
		this.jInternalFrameDetalleFormMaterialProducto.jButtonEliminarMaterialProducto.addActionListener (new ButtonActionListener(this,"EliminarMaterialProducto"));
		
		
		this.jInternalFrameDetalleFormMaterialProducto.jButtonEliminarToolBarMaterialProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarMaterialProducto"));
								
		this.jInternalFrameDetalleFormMaterialProducto.jMenuItemEliminarMaterialProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMaterialProducto"));		
		
		
		
		this.jInternalFrameDetalleFormMaterialProducto.jButtonCancelarMaterialProducto.addActionListener (new ButtonActionListener(this,"CancelarMaterialProducto"));
		
		
		this.jInternalFrameDetalleFormMaterialProducto.jButtonCancelarToolBarMaterialProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarMaterialProducto"));
					
		this.jInternalFrameDetalleFormMaterialProducto.jMenuItemCancelarMaterialProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMaterialProducto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormMaterialProducto.jMenuItemDetalleCerrarMaterialProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMaterialProducto"));		
		
		
		
		this.jInternalFrameDetalleFormMaterialProducto.jButtonGuardarCambiosToolBarMaterialProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMaterialProducto"));
		
		
		
		this.jInternalFrameDetalleFormMaterialProducto.jButtonGuardarCambiosToolBarMaterialProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMaterialProducto"));
		
		
		
		this.jInternalFrameDetalleFormMaterialProducto.jComboBoxTiposAccionesFormularioMaterialProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMaterialProducto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMaterialProducto.jButtonidMaterialProductoBusqueda.addActionListener(new ButtonActionListener(this,"idMaterialProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMaterialProducto.jButtonid_empresaMaterialProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMaterialProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMaterialProducto.jButtonid_empresaMaterialProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMaterialProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMaterialProducto.jButtonid_tipo_productoMaterialProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_productoMaterialProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMaterialProducto.jButtonid_tipo_productoMaterialProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_productoMaterialProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMaterialProducto.jButtoncodigoMaterialProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoMaterialProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMaterialProducto.jButtonnombreMaterialProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreMaterialProductoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormMaterialProducto.jTabbedPaneRelacionesMaterialProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMaterialProducto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameMaterialProducto"));
		
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMaterialProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMaterialProducto"));
		}
		
		this.jTableDatosMaterialProducto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarMaterialProducto"));
		
		this.jTableDatosMaterialProducto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarMaterialProducto"));
		
		this.jButtonNuevoMaterialProducto.addActionListener(new ButtonActionListener(this,"NuevoMaterialProducto"));
		
		this.jButtonDuplicarMaterialProducto.addActionListener(new ButtonActionListener(this,"DuplicarMaterialProducto"));
		
		this.jButtonCopiarMaterialProducto.addActionListener(new ButtonActionListener(this,"CopiarMaterialProducto"));
		
		this.jButtonVerFormMaterialProducto.addActionListener(new ButtonActionListener(this,"VerFormMaterialProducto"));
		
		
		this.jButtonNuevoToolBarMaterialProducto.addActionListener(new ButtonActionListener(this,"NuevoToolBarMaterialProducto"));
			
		this.jButtonDuplicarToolBarMaterialProducto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarMaterialProducto"));
			
		this.jMenuItemNuevoMaterialProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoMaterialProducto"));
			
		this.jMenuItemDuplicarMaterialProducto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarMaterialProducto"));		
		
		
		this.jButtonNuevoRelacionesMaterialProducto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesMaterialProducto"));
		
		
		this.jButtonNuevoRelacionesToolBarMaterialProducto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarMaterialProducto"));
			
		this.jMenuItemNuevoRelacionesMaterialProducto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesMaterialProducto"));		
		
		
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMaterialProducto.jButtonModificarMaterialProducto.addActionListener(new ButtonActionListener(this,"ModificarMaterialProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMaterialProducto.jButtonModificarToolBarMaterialProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarMaterialProducto"));
			
			this.jInternalFrameDetalleFormMaterialProducto.jMenuItemModificarMaterialProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarMaterialProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormMaterialProducto.jButtonActualizarMaterialProducto.addActionListener (new ButtonActionListener(this,"ActualizarMaterialProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMaterialProducto.jButtonActualizarToolBarMaterialProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMaterialProducto"));
				
			this.jInternalFrameDetalleFormMaterialProducto.jMenuItemActualizarMaterialProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMaterialProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMaterialProducto.jButtonEliminarMaterialProducto.addActionListener (new ButtonActionListener(this,"EliminarMaterialProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMaterialProducto.jButtonEliminarToolBarMaterialProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarMaterialProducto"));
						
			this.jInternalFrameDetalleFormMaterialProducto.jMenuItemEliminarMaterialProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMaterialProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMaterialProducto.jButtonCancelarMaterialProducto.addActionListener (new ButtonActionListener(this,"CancelarMaterialProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMaterialProducto.jButtonCancelarToolBarMaterialProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarMaterialProducto"));
			
			this.jInternalFrameDetalleFormMaterialProducto.jMenuItemCancelarMaterialProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMaterialProducto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarMaterialProducto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarMaterialProducto"));		
		
		
		this.jButtonCerrarMaterialProducto.addActionListener (new ButtonActionListener(this,"CerrarMaterialProducto"));
		
		
		this.jButtonCerrarToolBarMaterialProducto.addActionListener (new ButtonActionListener(this,"CerrarToolBarMaterialProducto"));
			
		this.jMenuItemCerrarMaterialProducto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarMaterialProducto"));
			
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMaterialProducto.jMenuItemDetalleCerrarMaterialProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMaterialProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMaterialProducto.jButtonGuardarCambiosMaterialProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosMaterialProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMaterialProducto.jButtonGuardarCambiosToolBarMaterialProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMaterialProducto"));
		}
		
		this.jButtonCopiarToolBarMaterialProducto.addActionListener (new ButtonActionListener(this,"CopiarToolBarMaterialProducto"));
			
		this.jButtonVerFormToolBarMaterialProducto.addActionListener (new ButtonActionListener(this,"VerFormToolBarMaterialProducto"));
		
		this.jMenuItemGuardarCambiosMaterialProducto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosMaterialProducto"));
			
		this.jMenuItemCopiarMaterialProducto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarMaterialProducto"));		
		
		this.jMenuItemVerFormMaterialProducto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormMaterialProducto"));		
		
		
		this.jButtonGuardarCambiosTablaMaterialProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMaterialProducto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarMaterialProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarMaterialProducto"));
			
		this.jMenuItemGuardarCambiosTablaMaterialProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMaterialProducto"));		
		
		
		
		this.jButtonRecargarInformacionMaterialProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionMaterialProducto"));
					
		this.jButtonRecargarInformacionToolBarMaterialProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarMaterialProducto"));
		
		this.jMenuItemRecargarInformacionMaterialProducto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionMaterialProducto"));		
		
		
		
		this.jButtonAnterioresMaterialProducto.addActionListener (new ButtonActionListener(this,"AnterioresMaterialProducto"));
		
		
		this.jButtonAnterioresToolBarMaterialProducto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarMaterialProducto"));
		
		this.jMenuItemAnterioresMaterialProducto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresMaterialProducto"));		
		
		
		this.jButtonSiguientesMaterialProducto.addActionListener (new ButtonActionListener(this,"SiguientesMaterialProducto"));
		
		
		this.jButtonSiguientesToolBarMaterialProducto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarMaterialProducto"));
			
		this.jMenuItemSiguientesMaterialProducto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesMaterialProducto"));
			
		this.jMenuItemAbrirOrderByMaterialProducto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByMaterialProducto"));
			
		this.jMenuItemMostrarOcultarMaterialProducto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarMaterialProducto"));
			
		this.jMenuItemDetalleAbrirOrderByMaterialProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByMaterialProducto"));
			
		this.jMenuItemDetalleMostarOcultarMaterialProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarMaterialProducto"));		
		
		
		this.jButtonNuevoGuardarCambiosMaterialProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosMaterialProducto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarMaterialProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarMaterialProducto"));
			
		this.jMenuItemNuevoGuardarCambiosMaterialProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosMaterialProducto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosMaterialProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosMaterialProducto"));

		this.jCheckBoxSeleccionadosMaterialProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosMaterialProducto"));
		
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMaterialProducto.jComboBoxTiposAccionesFormularioMaterialProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMaterialProducto"));
		}
		
		
		this.jComboBoxTiposRelacionesMaterialProducto.addActionListener (new ButtonActionListener(this,"TiposRelacionesMaterialProducto"));
			
		this.jComboBoxTiposAccionesMaterialProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesMaterialProducto"));
					
		this.jComboBoxTiposSeleccionarMaterialProducto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarMaterialProducto"));
			
		this.jTextFieldValorCampoGeneralMaterialProducto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralMaterialProducto"));		
		
		
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMaterialProducto.jButtonidMaterialProductoBusqueda.addActionListener(new ButtonActionListener(this,"idMaterialProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMaterialProducto.jButtonid_empresaMaterialProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMaterialProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMaterialProducto.jButtonid_empresaMaterialProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMaterialProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMaterialProducto.jButtonid_tipo_productoMaterialProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_productoMaterialProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMaterialProducto.jButtonid_tipo_productoMaterialProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_productoMaterialProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMaterialProducto.jButtoncodigoMaterialProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoMaterialProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMaterialProducto.jButtonnombreMaterialProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreMaterialProductoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoMaterialProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoMaterialProducto"));

			this.jButtonBusquedaPorNombreMaterialProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreMaterialProducto"));

			this.jButtonFK_IdTipoProductoMaterialProducto.addActionListener(new ButtonActionListener(this,"FK_IdTipoProductoMaterialProducto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoMaterialProducto!=null) {
				this.jInternalFrameReporteDinamicoMaterialProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMaterialProducto"));
				this.jInternalFrameReporteDinamicoMaterialProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMaterialProducto"));
				this.jInternalFrameReporteDinamicoMaterialProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMaterialProducto"));
			}
			
			//this.jButtonCerrarReporteDinamicoMaterialProducto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMaterialProducto"));				
			//this.jButtonGenerarReporteDinamicoMaterialProducto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMaterialProducto"));
			//this.jButtonGenerarExcelReporteDinamicoMaterialProducto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMaterialProducto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionMaterialProducto!=null) {
				this.jInternalFrameImportacionMaterialProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMaterialProducto"));
				this.jInternalFrameImportacionMaterialProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMaterialProducto"));
				this.jInternalFrameImportacionMaterialProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMaterialProducto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByMaterialProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByMaterialProducto"));
			
			this.jButtonAbrirOrderByToolBarMaterialProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarMaterialProducto"));			
			
			if(this.jInternalFrameOrderByMaterialProducto!=null) {
				this.jInternalFrameOrderByMaterialProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMaterialProducto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormMaterialProducto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMaterialProducto.jTabbedPaneRelacionesMaterialProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMaterialProducto"));
		
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
            		closingInternalFrameMaterialProducto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormMaterialProducto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormMaterialProducto = (JInternalFrameBase)event.getSource();
	            	
	            MaterialProductoBeanSwingJInternalFrame jInternalFrameParent=(MaterialProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormMaterialProducto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarMaterialProductoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosMaterialProducto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosMaterialProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosMaterialProducto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosMaterialProducto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMaterialProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMaterialProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMaterialProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoMaterialProducto";
		inputMap = this.jButtonNuevoMaterialProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoMaterialProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMaterialProductoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMaterialProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMaterialProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMaterialProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesMaterialProducto";
		inputMap = this.jButtonNuevoRelacionesMaterialProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesMaterialProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMaterialProductoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarMaterialProducto";
		inputMap = this.jButtonModificarMaterialProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarMaterialProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarMaterialProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarMaterialProducto";
		inputMap = this.jButtonActualizarMaterialProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarMaterialProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarMaterialProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarMaterialProducto";
		inputMap = this.jButtonEliminarMaterialProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarMaterialProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarMaterialProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarMaterialProducto";
		inputMap = this.jButtonCancelarMaterialProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarMaterialProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarMaterialProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarMaterialProducto";
		inputMap = this.jButtonCerrarMaterialProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarMaterialProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarMaterialProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormMaterialProducto.jButtonGuardarCambiosMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosMaterialProducto";
		inputMap = this.jInternalFrameDetalleFormMaterialProducto.jButtonGuardarCambiosMaterialProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormMaterialProducto.jButtonGuardarCambiosMaterialProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosMaterialProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosMaterialProducto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosMaterialProductoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesMaterialProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesMaterialProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarMaterialProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarMaterialProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralMaterialProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralMaterialProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMaterialProducto.jButtonidMaterialProductoBusqueda.addActionListener(new ButtonActionListener(this,"idMaterialProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMaterialProducto.jButtonid_empresaMaterialProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMaterialProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMaterialProducto.jButtonid_empresaMaterialProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMaterialProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMaterialProducto.jButtonid_tipo_productoMaterialProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_productoMaterialProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMaterialProducto.jButtonid_tipo_productoMaterialProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_productoMaterialProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMaterialProducto.jButtoncodigoMaterialProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoMaterialProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMaterialProducto.jButtonnombreMaterialProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreMaterialProductoBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoMaterialProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoMaterialProducto"));

		this.jButtonBusquedaPorNombreMaterialProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreMaterialProducto"));

		this.jButtonFK_IdTipoProductoMaterialProducto.addActionListener(new ButtonActionListener(this,"FK_IdTipoProductoMaterialProducto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionMaterialProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionMaterialProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarMaterialProductoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarMaterialProducto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosMaterialProducto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(MaterialProducto materialproductoAux:this.materialproductoLogic.getMaterialProductos()) {
					materialproductoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MaterialProducto materialproductoAux:materialproductos) {
					materialproductoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosMaterialProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMaterialProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(MaterialProducto materialproductoAux:this.materialproductoLogic.getMaterialProductos()) {
						materialproductoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MaterialProducto materialproductoAux:materialproductos) {
						materialproductoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(MaterialProducto materialproductoAux:this.materialproductoLogic.getMaterialProductos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MaterialProducto materialproductoAux:materialproductos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaMaterialProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMaterialProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMaterialProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMaterialProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosMaterialProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMaterialProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosMaterialProducto.getSelectedRows();
			
			MaterialProducto materialproductoLocal=new MaterialProducto();
			
			//this.seleccionarTodosMaterialProducto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					materialproductoLocal =(MaterialProducto) this.materialproductoLogic.getMaterialProductos().toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					materialproductoLocal =(MaterialProducto) this.materialproductos.toArray()[this.jTableDatosMaterialProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				materialproductoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(MaterialProducto materialproductoAux:this.materialproductoLogic.getMaterialProductos()) {
						materialproductoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MaterialProducto materialproductoAux:materialproductos) {
						materialproductoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaMaterialProducto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMaterialProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMaterialProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMaterialProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualMaterialProductoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarMaterialProductoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralMaterialProductoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingMaterialProducto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralMaterialProducto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(MaterialProducto materialproductoAux:this.materialproductoLogic.getMaterialProductos()) {
				
						if(sTipoSeleccionar.equals(MaterialProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							materialproductoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MaterialProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							materialproductoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MaterialProducto materialproductoAux:materialproductos) {
					
						if(sTipoSeleccionar.equals(MaterialProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							materialproductoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MaterialProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							materialproductoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaMaterialProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesMaterialProductoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingMaterialProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioMaterialProducto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesMaterialProducto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormMaterialProducto.jComboBoxTiposAccionesFormularioMaterialProducto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteMaterialProducto) {				
					conSplash=true;//false;										
					
					//this.startProcessMaterialProducto(conSplash);
				
					this.generarReporteMaterialProductosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMaterialProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMaterialProducto.jComboBoxTiposAccionesFormularioMaterialProducto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoMaterialProductosSeleccionados();
				//this.jComboBoxTiposAccionesMaterialProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMaterialProductosSeleccionados(false);
				//this.jComboBoxTiposAccionesMaterialProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMaterialProductosSeleccionados(true);
				//this.jComboBoxTiposAccionesMaterialProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMaterialProducto();
				
				this.exportarMaterialProductosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMaterialProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMaterialProducto.jComboBoxTiposAccionesFormularioMaterialProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionMaterialProductos();
				//this.importarMaterialProductos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMaterialProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMaterialProducto.jComboBoxTiposAccionesFormularioMaterialProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMaterialProducto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelMaterialProductosSeleccionados();
				//this.jComboBoxTiposAccionesMaterialProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Material Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessMaterialProducto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoMaterialProducto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyMaterialProducto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Material Producto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMaterialProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMaterialProducto.jComboBoxTiposAccionesFormularioMaterialProducto.setSelectedIndex(0);					
				}	
			} 			
			else if(MaterialProductoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteMaterialProducto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessMaterialProducto(conSplash);
					
						//this.actualizarParametrosGeneralMaterialProducto();
						
						this.generarReporteProcesoAccionMaterialProductosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesMaterialProducto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormMaterialProducto.jComboBoxTiposAccionesFormularioMaterialProducto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(MaterialProductoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Material ProductoS SELECCIONADOS?", "MANTENIMIENTO DE Material Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessMaterialProducto();
				
						this.actualizarParametrosGeneralMaterialProducto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.materialproductoReturnGeneral=materialproductoLogic.procesarAccionMaterialProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.materialproductoLogic.getMaterialProductos(),this.materialproductoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarMaterialProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMaterialProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMaterialProducto.jComboBoxTiposAccionesFormularioMaterialProducto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralMaterialProducto();
					
					MaterialProductoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarMaterialProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMaterialProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMaterialProducto.jComboBoxTiposAccionesFormularioMaterialProducto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessMaterialProducto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesMaterialProductoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessMaterialProducto();
			
			if(this.jInternalFrameDetalleFormMaterialProducto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<MaterialProducto> materialproductosSeleccionados=new ArrayList<MaterialProducto>();		
			MaterialProducto materialproducto=new MaterialProducto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingMaterialProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesMaterialProducto.getSelectedItem();
			
			
			
			
			materialproductosSeleccionados=this.getMaterialProductosSeleccionados(true);
			//this.sTipoAccion;
			
			if(materialproductosSeleccionados.size()==1) {
				for(MaterialProducto materialproductoAux:materialproductosSeleccionados) {
					materialproducto=materialproductoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Producto")) {
					jButtonProductoActionPerformed(null,rowIndex,true,false,materialproducto);
				}
				else if(this.sTipoRelacion.equals("Parametro Inventario Defecto")) {
					jButtonParametroInventarioDefectoActionPerformed(null,rowIndex,true,false,materialproducto);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessMaterialProducto();
			
      		//this.finishProcessMaterialProducto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarMaterialProductoReturnGeneral() throws Exception {
		if(this.materialproductoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.materialproductoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.materialproductoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.materialproductoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.materialproductoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.materialproductoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingMaterialProducto(false);
		}
		
		if(this.materialproductoReturnGeneral.getConRetornoLista() || this.materialproductoReturnGeneral.getConRetornoObjeto()) {
			if(this.materialproductoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.materialproductoLogic.setMaterialProductos(this.materialproductoReturnGeneral.getMaterialProductos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.materialproductoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.materialproductoLogic.setMaterialProducto(this.materialproductoReturnGeneral.getMaterialProducto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingMaterialProducto(false);
		}
	}
	
	public void actualizarParametrosGeneralMaterialProducto() throws Exception {
		
		
	}
	
	public ArrayList<MaterialProducto> getMaterialProductosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<MaterialProducto> materialproductosSeleccionados=new ArrayList<MaterialProducto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioMaterialProducto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(MaterialProducto materialproductoAux:materialproductoLogic.getMaterialProductos()) {
					if(materialproductoAux.getIsSelected()) {
						materialproductosSeleccionados.add(materialproductoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MaterialProducto materialproductoAux:this.materialproductos) {
					if(materialproductoAux.getIsSelected()) {
						materialproductosSeleccionados.add(materialproductoAux);				
					}
				}
			}
			
			if(materialproductosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						materialproductosSeleccionados.addAll(this.materialproductoLogic.getMaterialProductos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						materialproductosSeleccionados.addAll(this.materialproductos);				
					}
				}
			}
		} else {
			materialproductosSeleccionados.add(this.materialproducto);
		}
		
		return materialproductosSeleccionados;
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
	
	public void generarReporteMaterialProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalMaterialProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoMaterialProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMaterialProductosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMaterialProductosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesMaterialProductosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Material Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesMaterialProductosSeleccionados() throws Exception {
		ArrayList<MaterialProducto> materialproductosSeleccionados=new ArrayList<MaterialProducto>();		
		
		materialproductosSeleccionados=this.getMaterialProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteMaterialProductos("Todos",materialproductosSeleccionados);
		
	}	
	
	public void generarReporteNormalMaterialProductosSeleccionados() throws Exception {
		ArrayList<MaterialProducto> materialproductosSeleccionados=new ArrayList<MaterialProducto>();		
		
		materialproductosSeleccionados=this.getMaterialProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteMaterialProductos("Todos",materialproductosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionMaterialProductosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<MaterialProducto> materialproductosSeleccionados=new ArrayList<MaterialProducto>();
		
		materialproductosSeleccionados=this.getMaterialProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteMaterialProductos("Todos",materialproductosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoMaterialProductosSeleccionados() throws Exception {
		ArrayList<MaterialProducto> materialproductosSeleccionados=new ArrayList<MaterialProducto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoMaterialProducto();
		
		
		materialproductosSeleccionados=this.getMaterialProductosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoMaterialProducto();
		
		
		//this.generarReporteMaterialProductos("Todos",materialproductosSeleccionados ,materialproductoImplementable,materialproductoImplementableHome);
	}
	
	public void mostrarImportacionMaterialProductos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionMaterialProducto();
		
		this.abrirFrameImportacionMaterialProducto();		
		
			
		//this.generarReporteMaterialProductos("Todos",materialproductosSeleccionados ,materialproductoImplementable,materialproductoImplementableHome);
	}
	
	public void importarMaterialProductos() throws Exception {		
	
	}
	
	public void exportarMaterialProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelMaterialProductosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoMaterialProductosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlMaterialProductosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Material Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoMaterialProductosSeleccionados() throws Exception {
		ArrayList<MaterialProducto> materialproductosSeleccionados=new ArrayList<MaterialProducto>();		
		
		materialproductosSeleccionados=this.getMaterialProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"materialproducto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarMaterialProducto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(MaterialProducto materialproductoAux:materialproductosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarMaterialProducto(materialproductoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//materialproductoAux.setsDetalleGeneralEntityReporte(materialproductoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.materialproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Material Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarMaterialProducto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=MaterialProductoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MaterialProductoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MaterialProductoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MaterialProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MaterialProductoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MaterialProductoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarMaterialProducto(MaterialProducto materialproducto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=materialproducto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=materialproducto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=materialproducto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=materialproducto.gettipoproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=materialproducto.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=materialproducto.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelMaterialProductosSeleccionados() throws Exception {
		ArrayList<MaterialProducto> materialproductosSeleccionados=new ArrayList<MaterialProducto>();		
		
		materialproductosSeleccionados=this.getMaterialProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"materialproducto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("MaterialProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelMaterialProducto(row);				
				iRow++;
			}				
			
			for(MaterialProducto materialproductoAux:materialproductosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelMaterialProducto(materialproductoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.materialproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Material Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlMaterialProductosSeleccionados() throws Exception {
		ArrayList<MaterialProducto> materialproductosSeleccionados=new ArrayList<MaterialProducto>();		
		
		materialproductosSeleccionados=this.getMaterialProductosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"materialproducto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("materialproductos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("materialproducto");
			//elementRoot.appendChild(element);
		
			for(MaterialProducto materialproductoAux:materialproductosSeleccionados) {
				element = document.createElement("materialproducto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlMaterialProducto(materialproductoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.materialproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Material Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelMaterialProducto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(MaterialProductoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(MaterialProductoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(MaterialProductoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(MaterialProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(MaterialProductoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(MaterialProductoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelMaterialProducto(MaterialProducto materialproducto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(materialproducto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(materialproducto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(materialproducto.gettipoproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(materialproducto.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(materialproducto.getnombre());				
	}
	
	public void setFilaDatosExportarXmlMaterialProducto(MaterialProducto materialproducto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(MaterialProductoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(materialproducto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(MaterialProductoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(materialproducto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(MaterialProductoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(materialproducto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtipoproducto_descripcion = document.createElement(MaterialProductoConstantesFunciones.IDTIPOPRODUCTO);
		elementtipoproducto_descripcion.appendChild(document.createTextNode(materialproducto.gettipoproducto_descripcion()));
		element.appendChild(elementtipoproducto_descripcion);

		Element elementcodigo = document.createElement(MaterialProductoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(materialproducto.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(MaterialProductoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(materialproducto.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoMaterialProductosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<MaterialProducto> materialproductosSeleccionados=new ArrayList<MaterialProducto>();
		
		materialproductosSeleccionados=this.getMaterialProductosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoMaterialProducto(materialproductosSeleccionados);
		
		this.generarReporteMaterialProductos("Todos",materialproductosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoMaterialProducto(ArrayList<MaterialProducto> materialproductosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(MaterialProducto materialproductoAux:materialproductosSeleccionados) {
				materialproductoAux.setsDetalleGeneralEntityReporte(materialproductoAux.toString());
			
				if(sTipoSeleccionar.equals(MaterialProductoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					materialproductoAux.setsDescripcionGeneralEntityReporte1(materialproductoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MaterialProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO)) {
					existe=true;
					materialproductoAux.setsDescripcionGeneralEntityReporte1(materialproductoAux.gettipoproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MaterialProductoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					materialproductoAux.setsDescripcionGeneralEntityReporte1(materialproductoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(MaterialProductoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					materialproductoAux.setsDescripcionGeneralEntityReporte1(materialproductoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MaterialProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesMaterialProducto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoMaterialProducto=true;
				this.isVisibilidadCeldaNuevoRelacionesMaterialProducto=true;
				this.isVisibilidadCeldaGuardarCambiosMaterialProducto=true;
			}
			
			this.isVisibilidadCeldaModificarMaterialProducto=false;
			this.isVisibilidadCeldaActualizarMaterialProducto=false;
			this.isVisibilidadCeldaEliminarMaterialProducto=false;
			this.isVisibilidadCeldaCancelarMaterialProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMaterialProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarMaterialProducto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoMaterialProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesMaterialProducto=false;
			this.isVisibilidadCeldaGuardarCambiosMaterialProducto=false;
			this.isVisibilidadCeldaModificarMaterialProducto=false;
			this.isVisibilidadCeldaActualizarMaterialProducto=true;
			this.isVisibilidadCeldaEliminarMaterialProducto=false;
			this.isVisibilidadCeldaCancelarMaterialProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMaterialProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarMaterialProducto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoMaterialProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesMaterialProducto=false;
			this.isVisibilidadCeldaGuardarCambiosMaterialProducto=false;
			this.isVisibilidadCeldaModificarMaterialProducto=false;
			this.isVisibilidadCeldaActualizarMaterialProducto=true;
			this.isVisibilidadCeldaEliminarMaterialProducto=true;
			this.isVisibilidadCeldaCancelarMaterialProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMaterialProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarMaterialProducto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoMaterialProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesMaterialProducto=false;
			this.isVisibilidadCeldaGuardarCambiosMaterialProducto=false;
			this.isVisibilidadCeldaModificarMaterialProducto=false;
			this.isVisibilidadCeldaActualizarMaterialProducto=true;
			this.isVisibilidadCeldaEliminarMaterialProducto=false;
			this.isVisibilidadCeldaCancelarMaterialProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMaterialProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarMaterialProducto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoMaterialProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesMaterialProducto=true;
			this.isVisibilidadCeldaGuardarCambiosMaterialProducto=true;
			this.isVisibilidadCeldaModificarMaterialProducto=false;
			this.isVisibilidadCeldaActualizarMaterialProducto=false;
			this.isVisibilidadCeldaEliminarMaterialProducto=false;
			this.isVisibilidadCeldaCancelarMaterialProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMaterialProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarMaterialProducto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoMaterialProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesMaterialProducto=false;
			this.isVisibilidadCeldaGuardarCambiosMaterialProducto=false;
			this.isVisibilidadCeldaActualizarMaterialProducto=false;
			this.isVisibilidadCeldaEliminarMaterialProducto=false;
			this.isVisibilidadCeldaCancelarMaterialProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMaterialProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarMaterialProducto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoMaterialProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesMaterialProducto=false;
			this.isVisibilidadCeldaGuardarCambiosMaterialProducto=false;
			this.isVisibilidadCeldaModificarMaterialProducto=true;
			this.isVisibilidadCeldaActualizarMaterialProducto=false;
			this.isVisibilidadCeldaEliminarMaterialProducto=false;
			this.isVisibilidadCeldaCancelarMaterialProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMaterialProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarMaterialProducto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(MaterialProductoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoMaterialProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesMaterialProducto=true;
			this.isVisibilidadCeldaGuardarCambiosMaterialProducto=true;
		} else {
			this.actualizarEstadoPanelsMaterialProducto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarMaterialProducto=false;
			//this.isVisibilidadCeldaVerFormMaterialProducto=false;
			this.isVisibilidadCeldaDuplicarMaterialProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!materialproductoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesMaterialProducto=false;
		} else {
			this.isVisibilidadCeldaNuevoMaterialProducto=false;
			this.isVisibilidadCeldaGuardarCambiosMaterialProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(materialproductoSessionBean.getEsGuardarRelacionado()) {
			if(!materialproductoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesMaterialProducto=false;												
			}
			
			this.jButtonCerrarMaterialProducto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesMaterialProducto=false;
		}
		
		if(!this.permiteMantenimiento(this.materialproducto)) {
			this.isVisibilidadCeldaActualizarMaterialProducto=false;
			this.isVisibilidadCeldaEliminarMaterialProducto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesMaterialProducto() {
		this.isVisibilidadCeldaNuevoMaterialProducto=false;
		this.isVisibilidadCeldaGuardarCambiosMaterialProducto=false;
	}
	
	public void actualizarEstadoPanelsMaterialProducto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionMaterialProducto!=null) {
				this.jScrollPanelDatosEdicionMaterialProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMaterialProducto!=null) {
				this.jTabbedPaneBusquedasMaterialProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMaterialProducto!=null) {
				this.jScrollPanelDatosMaterialProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionMaterialProducto!=null) {
				this.jPanelPaginacionMaterialProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMaterialProducto!=null) {
				this.jPanelParametrosReportesMaterialProducto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionMaterialProducto!=null) {
				this.jScrollPanelDatosEdicionMaterialProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMaterialProducto!=null) {
				this.jTabbedPaneBusquedasMaterialProducto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosMaterialProducto!=null) {
				this.jScrollPanelDatosMaterialProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionMaterialProducto!=null) {
				this.jPanelPaginacionMaterialProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMaterialProducto!=null) {
				this.jPanelParametrosReportesMaterialProducto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionMaterialProducto!=null) {
				this.jScrollPanelDatosEdicionMaterialProducto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMaterialProducto!=null) {
				this.jTabbedPaneBusquedasMaterialProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMaterialProducto!=null) {
				this.jScrollPanelDatosMaterialProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionMaterialProducto!=null) {
				this.jPanelPaginacionMaterialProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMaterialProducto!=null) {
				this.jPanelParametrosReportesMaterialProducto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionMaterialProducto!=null) {
				this.jScrollPanelDatosEdicionMaterialProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMaterialProducto!=null) {
				this.jTabbedPaneBusquedasMaterialProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMaterialProducto!=null) {
				this.jScrollPanelDatosMaterialProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionMaterialProducto!=null) {
				this.jPanelPaginacionMaterialProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMaterialProducto!=null) {
				this.jPanelParametrosReportesMaterialProducto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionMaterialProducto!=null) {
				this.jScrollPanelDatosEdicionMaterialProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMaterialProducto!=null) {
				this.jTabbedPaneBusquedasMaterialProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMaterialProducto!=null) {
				this.jScrollPanelDatosMaterialProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionMaterialProducto!=null) {
				this.jPanelPaginacionMaterialProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMaterialProducto!=null) {
				this.jPanelParametrosReportesMaterialProducto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionMaterialProducto!=null) {
				this.jScrollPanelDatosEdicionMaterialProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMaterialProducto!=null) {
				this.jTabbedPaneBusquedasMaterialProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMaterialProducto!=null) {
				this.jScrollPanelDatosMaterialProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionMaterialProducto!=null) {
				this.jPanelPaginacionMaterialProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMaterialProducto!=null) {
				this.jPanelParametrosReportesMaterialProducto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionMaterialProducto!=null) {
				this.jScrollPanelDatosEdicionMaterialProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMaterialProducto!=null) {
				this.jTabbedPaneBusquedasMaterialProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMaterialProducto!=null) {
				this.jScrollPanelDatosMaterialProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionMaterialProducto!=null) {
				this.jPanelPaginacionMaterialProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMaterialProducto!=null) {
				this.jPanelParametrosReportesMaterialProducto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.materialproductoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasMaterialProducto!=null) {
					this.jTabbedPaneBusquedasMaterialProducto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesMaterialProducto!=null) {
				this.jPanelParametrosReportesMaterialProducto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.materialproductoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMaterialProducto!=null) {
				this.jTabbedPaneBusquedasMaterialProducto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesMaterialProducto!=null) {
				this.jPanelParametrosReportesMaterialProducto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasMaterialProducto.remove(jPanelBusquedaPorCodigoMaterialProducto);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasMaterialProducto.remove(jPanelBusquedaPorNombreMaterialProducto);}

			this.isVisibilidadFK_IdTipoProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoProducto) {this.jTabbedPaneBusquedasMaterialProducto.remove(jPanelFK_IdTipoProductoMaterialProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoProducto(Boolean isParaTipoProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoProductoNegation=!isParaTipoProducto;

			this.isVisibilidadBusquedaPorCodigo=isParaTipoProductoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasMaterialProducto.remove(jPanelBusquedaPorCodigoMaterialProducto);}

			this.isVisibilidadBusquedaPorNombre=isParaTipoProductoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasMaterialProducto.remove(jPanelBusquedaPorNombreMaterialProducto);}

			this.isVisibilidadFK_IdTipoProducto=isParaTipoProducto;
			if(!this.isVisibilidadFK_IdTipoProducto) {this.jTabbedPaneBusquedasMaterialProducto.remove(jPanelFK_IdTipoProductoMaterialProducto);}
		}
		
	}
	
	

	public String registrarSesionMaterialProductoParaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(this.materialproductoSessionBean==null) {
				this.materialproductoSessionBean=new MaterialProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormMaterialProducto.productoSessionBean==null) {
				this.jInternalFrameDetalleFormMaterialProducto.productoSessionBean=new ProductoSessionBean();
			}

			this.jInternalFrameDetalleFormMaterialProducto.productoSessionBean.setsPathNavegacionActual(materialproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormMaterialProducto.productoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProducto=this.jInternalFrameDetalleFormMaterialProducto.productoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormMaterialProducto.productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			this.jInternalFrameDetalleFormMaterialProducto.productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(MaterialProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormMaterialProducto.productoSessionBean.setisBusquedaDesdeForeignKeySesionMaterialProducto(true);
			this.jInternalFrameDetalleFormMaterialProducto.productoSessionBean.setlidMaterialProductoActual(this.idMaterialProductoActual);

			materialproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyMaterialProducto(true);
			materialproductoSessionBean.setlIdMaterialProductoActualForeignKey(this.idMaterialProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionMaterialProductoParaParametroInventarioDefectos() throws Exception {
		Boolean isPaginaPopupParametroInventarioDefecto=false;

		try {

			if(this.materialproductoSessionBean==null) {
				this.materialproductoSessionBean=new MaterialProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoSessionBean==null) {
				this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoSessionBean.setsPathNavegacionActual(materialproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroInventarioDefecto=this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(true);
			this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(MaterialProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionMaterialProducto(true);
			this.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoSessionBean.setlidMaterialProductoActual(this.idMaterialProductoActual);

			materialproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyMaterialProducto(true);
			materialproductoSessionBean.setlIdMaterialProductoActualForeignKey(this.idMaterialProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//MaterialProductoSessionBean materialproductoSessionBean=new MaterialProductoSessionBean();
		
		if(this.materialproductoSessionBean==null) {
			this.materialproductoSessionBean=new MaterialProductoSessionBean();
		}
		
		this.materialproductoSessionBean.setsUltimaBusquedaMaterialProducto(this.getsAccionBusqueda());
		this.materialproductoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.materialproductoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			materialproductoSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			materialproductoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			materialproductoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoProducto")) {
			materialproductoSessionBean.setid_tipo_producto(this.getid_tipo_productoFK_IdTipoProducto());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//MaterialProductoSessionBean materialproductoSessionBean=new MaterialProductoSessionBean();
		
		if(this.materialproductoSessionBean==null) {
			this.materialproductoSessionBean=new MaterialProductoSessionBean();
		}
		
		if(this.materialproductoSessionBean.getsUltimaBusquedaMaterialProducto()!=null&&!this.materialproductoSessionBean.getsUltimaBusquedaMaterialProducto().equals("")) {
			this.setsAccionBusqueda(materialproductoSessionBean.getsUltimaBusquedaMaterialProducto());
			this.setiNumeroPaginacion(materialproductoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(materialproductoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(materialproductoSessionBean.getcodigo());
				materialproductoSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(materialproductoSessionBean.getnombre());
				materialproductoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(materialproductoSessionBean.getid_empresa());
				materialproductoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoProducto")) {
				this.setid_tipo_productoFK_IdTipoProducto(materialproductoSessionBean.getid_tipo_producto());
				materialproductoSessionBean.setid_tipo_producto(-1L);
			}
		}
		
		this.materialproductoSessionBean.setsUltimaBusquedaMaterialProducto("");
		this.materialproductoSessionBean.setiNumeroPaginacion(MaterialProductoConstantesFunciones.INUMEROPAGINACION);
		this.materialproductoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaMaterialProducto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioMaterialProducto() {
		this.updateBorderResaltarBusquedasFormularioMaterialProducto();
		this.updateVisibilidadBusquedasFormularioMaterialProducto();
		this.updateHabilitarBusquedasFormularioMaterialProducto();
	}
	
	public void updateBorderResaltarBusquedasFormularioMaterialProducto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasMaterialProducto.getComponents().length>0) {
	

		if(this.materialproductoConstantesFunciones.resaltarBusquedaPorCodigoMaterialProducto!=null) {
			index= this.jTabbedPaneBusquedasMaterialProducto.indexOfComponent(this.jPanelBusquedaPorCodigoMaterialProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMaterialProducto.getComponent(index);
				jPanel.setBorder(this.materialproductoConstantesFunciones.resaltarBusquedaPorCodigoMaterialProducto);
			}
		}

		if(this.materialproductoConstantesFunciones.resaltarBusquedaPorNombreMaterialProducto!=null) {
			index= this.jTabbedPaneBusquedasMaterialProducto.indexOfComponent(this.jPanelBusquedaPorNombreMaterialProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMaterialProducto.getComponent(index);
				jPanel.setBorder(this.materialproductoConstantesFunciones.resaltarBusquedaPorNombreMaterialProducto);
			}
		}

		if(this.materialproductoConstantesFunciones.resaltarFK_IdTipoProductoMaterialProducto!=null) {
			index= this.jTabbedPaneBusquedasMaterialProducto.indexOfComponent(this.jPanelFK_IdTipoProductoMaterialProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMaterialProducto.getComponent(index);
				jPanel.setBorder(this.materialproductoConstantesFunciones.resaltarFK_IdTipoProductoMaterialProducto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioMaterialProducto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasMaterialProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasMaterialProducto.indexOfComponent(this.jPanelBusquedaPorCodigoMaterialProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasMaterialProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.materialproductoConstantesFunciones.mostrarBusquedaPorCodigoMaterialProducto);
			if(!this.materialproductoConstantesFunciones.mostrarBusquedaPorCodigoMaterialProducto && index>-1) {
				this.jTabbedPaneBusquedasMaterialProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasMaterialProducto.indexOfComponent(this.jPanelBusquedaPorNombreMaterialProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasMaterialProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.materialproductoConstantesFunciones.mostrarBusquedaPorNombreMaterialProducto);
			if(!this.materialproductoConstantesFunciones.mostrarBusquedaPorNombreMaterialProducto && index>-1) {
				this.jTabbedPaneBusquedasMaterialProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasMaterialProducto.indexOfComponent(this.jPanelFK_IdTipoProductoMaterialProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasMaterialProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.materialproductoConstantesFunciones.mostrarFK_IdTipoProductoMaterialProducto);
			if(!this.materialproductoConstantesFunciones.mostrarFK_IdTipoProductoMaterialProducto && index>-1) {
				this.jTabbedPaneBusquedasMaterialProducto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioMaterialProducto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasMaterialProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasMaterialProducto.indexOfComponent(this.jPanelBusquedaPorCodigoMaterialProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasMaterialProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.materialproductoConstantesFunciones.activarBusquedaPorCodigoMaterialProducto);
				this.jTabbedPaneBusquedasMaterialProducto.setEnabledAt(index,this.materialproductoConstantesFunciones.activarBusquedaPorCodigoMaterialProducto);
			}

			index= this.jTabbedPaneBusquedasMaterialProducto.indexOfComponent(this.jPanelBusquedaPorNombreMaterialProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasMaterialProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.materialproductoConstantesFunciones.activarBusquedaPorNombreMaterialProducto);
				this.jTabbedPaneBusquedasMaterialProducto.setEnabledAt(index,this.materialproductoConstantesFunciones.activarBusquedaPorNombreMaterialProducto);
			}

			index= this.jTabbedPaneBusquedasMaterialProducto.indexOfComponent(this.jPanelFK_IdTipoProductoMaterialProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasMaterialProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.materialproductoConstantesFunciones.activarFK_IdTipoProductoMaterialProducto);
				this.jTabbedPaneBusquedasMaterialProducto.setEnabledAt(index,this.materialproductoConstantesFunciones.activarFK_IdTipoProductoMaterialProducto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaMaterialProducto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasMaterialProducto.indexOfComponent(this.jPanelBusquedaPorCodigoMaterialProducto);

			this.jTabbedPaneBusquedasMaterialProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMaterialProducto.getComponent(index);

			this.materialproductoConstantesFunciones.setResaltarBusquedaPorCodigoMaterialProducto(resaltar);

			jPanel.setBorder(this.materialproductoConstantesFunciones.resaltarBusquedaPorCodigoMaterialProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasMaterialProducto.indexOfComponent(this.jPanelBusquedaPorNombreMaterialProducto);

			this.jTabbedPaneBusquedasMaterialProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMaterialProducto.getComponent(index);

			this.materialproductoConstantesFunciones.setResaltarBusquedaPorNombreMaterialProducto(resaltar);

			jPanel.setBorder(this.materialproductoConstantesFunciones.resaltarBusquedaPorNombreMaterialProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoProducto")) {
			index= this.jTabbedPaneBusquedasMaterialProducto.indexOfComponent(this.jPanelFK_IdTipoProductoMaterialProducto);

			this.jTabbedPaneBusquedasMaterialProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMaterialProducto.getComponent(index);

			this.materialproductoConstantesFunciones.setResaltarFK_IdTipoProductoMaterialProducto(resaltar);

			jPanel.setBorder(this.materialproductoConstantesFunciones.resaltarFK_IdTipoProductoMaterialProducto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarMaterialProducto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioMaterialProducto() throws Exception {

		if(this.jInternalFrameDetalleFormMaterialProducto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioMaterialProducto();
		this.updateVisibilidadResaltarControlesFormularioMaterialProducto();
		this.updateHabilitarResaltarControlesFormularioMaterialProducto();
		
	}
	
	public void updateBorderResaltarControlesFormularioMaterialProducto() throws Exception {
		if(this.jInternalFrameDetalleFormMaterialProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.materialproductoConstantesFunciones.resaltaridMaterialProducto!=null && this.jInternalFrameDetalleFormMaterialProducto!=null) {this.jInternalFrameDetalleFormMaterialProducto.jLabelidMaterialProducto.setBorder(this.materialproductoConstantesFunciones.resaltaridMaterialProducto);}
		if(this.materialproductoConstantesFunciones.resaltarid_empresaMaterialProducto!=null && this.jInternalFrameDetalleFormMaterialProducto!=null) {this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_empresaMaterialProducto.setBorder(this.materialproductoConstantesFunciones.resaltarid_empresaMaterialProducto);}
		if(this.materialproductoConstantesFunciones.resaltarid_tipo_productoMaterialProducto!=null && this.jInternalFrameDetalleFormMaterialProducto!=null) {this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_tipo_productoMaterialProducto.setBorder(this.materialproductoConstantesFunciones.resaltarid_tipo_productoMaterialProducto);}
		if(this.materialproductoConstantesFunciones.resaltarcodigoMaterialProducto!=null && this.jInternalFrameDetalleFormMaterialProducto!=null) {this.jInternalFrameDetalleFormMaterialProducto.jTextFieldcodigoMaterialProducto.setBorder(this.materialproductoConstantesFunciones.resaltarcodigoMaterialProducto);}
		if(this.materialproductoConstantesFunciones.resaltarnombreMaterialProducto!=null && this.jInternalFrameDetalleFormMaterialProducto!=null) {this.jInternalFrameDetalleFormMaterialProducto.jTextAreanombreMaterialProducto.setBorder(this.materialproductoConstantesFunciones.resaltarnombreMaterialProducto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioMaterialProducto() throws Exception {		
		if(this.jInternalFrameDetalleFormMaterialProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
	
		//this.jInternalFrameDetalleFormMaterialProducto.jLabelidMaterialProducto.setVisible(this.materialproductoConstantesFunciones.mostraridMaterialProducto);
		this.jInternalFrameDetalleFormMaterialProducto.jPanelidMaterialProducto.setVisible(this.materialproductoConstantesFunciones.mostraridMaterialProducto);
		//this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_empresaMaterialProducto.setVisible(this.materialproductoConstantesFunciones.mostrarid_empresaMaterialProducto);
		this.jInternalFrameDetalleFormMaterialProducto.jPanelid_empresaMaterialProducto.setVisible(this.materialproductoConstantesFunciones.mostrarid_empresaMaterialProducto);
		//this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_tipo_productoMaterialProducto.setVisible(this.materialproductoConstantesFunciones.mostrarid_tipo_productoMaterialProducto);
		this.jInternalFrameDetalleFormMaterialProducto.jPanelid_tipo_productoMaterialProducto.setVisible(this.materialproductoConstantesFunciones.mostrarid_tipo_productoMaterialProducto);
		//this.jInternalFrameDetalleFormMaterialProducto.jTextFieldcodigoMaterialProducto.setVisible(this.materialproductoConstantesFunciones.mostrarcodigoMaterialProducto);
		this.jInternalFrameDetalleFormMaterialProducto.jPanelcodigoMaterialProducto.setVisible(this.materialproductoConstantesFunciones.mostrarcodigoMaterialProducto);
		//this.jInternalFrameDetalleFormMaterialProducto.jTextAreanombreMaterialProducto.setVisible(this.materialproductoConstantesFunciones.mostrarnombreMaterialProducto);
		this.jInternalFrameDetalleFormMaterialProducto.jPanelnombreMaterialProducto.setVisible(this.materialproductoConstantesFunciones.mostrarnombreMaterialProducto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioMaterialProducto() throws Exception {
		if(this.jInternalFrameDetalleFormMaterialProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMaterialProducto!=null) {
	
		this.jInternalFrameDetalleFormMaterialProducto.jLabelidMaterialProducto.setEnabled(this.materialproductoConstantesFunciones.activaridMaterialProducto);
		this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_empresaMaterialProducto.setEnabled(this.materialproductoConstantesFunciones.activarid_empresaMaterialProducto);
		this.jInternalFrameDetalleFormMaterialProducto.jComboBoxid_tipo_productoMaterialProducto.setEnabled(this.materialproductoConstantesFunciones.activarid_tipo_productoMaterialProducto);
		this.jInternalFrameDetalleFormMaterialProducto.jTextFieldcodigoMaterialProducto.setEnabled(this.materialproductoConstantesFunciones.activarcodigoMaterialProducto);
		this.jInternalFrameDetalleFormMaterialProducto.jTextAreanombreMaterialProducto.setEnabled(this.materialproductoConstantesFunciones.activarnombreMaterialProducto);
		}
	}
	
		
}