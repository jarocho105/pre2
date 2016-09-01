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

import com.bydan.erp.inventario.util.ColorProductoConstantesFunciones;
import com.bydan.erp.inventario.util.ColorProductoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.ColorProductoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.ColorProductoBean;
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
public class ColorProductoBeanSwingJInternalFrame extends ColorProductoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ColorProductoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ColorProducto> colorproductoValidator = new ClassValidator<ColorProducto>(ColorProducto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ColorProducto colorproducto;	
	public ColorProducto colorproductoAux;
	public ColorProducto colorproductoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ColorProducto colorproductoTotales;
	public Long idColorProductoActual;
	public Long iIdNuevoColorProducto=0L;
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

	public String sFinalQueryComboGrupoColor="";

	public List<GrupoColor> grupocolorsForeignKey;

	public List<GrupoColor> getgrupocolorsForeignKey() {
		return grupocolorsForeignKey;
	}

	public void setgrupocolorsForeignKey(List<GrupoColor> grupocolorsForeignKey) {
		this.grupocolorsForeignKey = grupocolorsForeignKey;
	}

	//OBJETO FK ACTUAL
	public GrupoColor grupocolorForeignKey;

	public GrupoColor getgrupocolorForeignKey() {
		return grupocolorForeignKey;
	}

	public void setgrupocolorForeignKey(GrupoColor grupocolorForeignKey) {
		this.grupocolorForeignKey = grupocolorForeignKey;
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
	
	public Boolean isPermisoTodoColorProducto;
	public Boolean isPermisoNuevoColorProducto;
	public Boolean isPermisoActualizarColorProducto;
	public Boolean isPermisoActualizarOriginalColorProducto;
	public Boolean isPermisoEliminarColorProducto;
	public Boolean isPermisoGuardarCambiosColorProducto;
	public Boolean isPermisoConsultaColorProducto;
	public Boolean isPermisoBusquedaColorProducto;
	public Boolean isPermisoReporteColorProducto;
	public Boolean isPermisoPaginacionMedioColorProducto;
	public Boolean isPermisoPaginacionAltoColorProducto;
	public Boolean isPermisoPaginacionTodoColorProducto;
	public Boolean isPermisoCopiarColorProducto;
	public Boolean isPermisoVerFormColorProducto;
	public Boolean isPermisoDuplicarColorProducto;
	public Boolean isPermisoOrdenColorProducto;
	
	
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
	
	public ColorProductoParameterReturnGeneral colorproductoReturnGeneral;
	public ColorProductoParameterReturnGeneral colorproductoParameterGeneral;
	
	

	public ParametroInventarioDefectoLogic parametroinventariodefectoLogic=null;

	public ParametroInventarioDefectoLogic getParametroInventarioDefectoLogic() {
		return parametroinventariodefectoLogic;
	}

	public void setParametroInventarioDefectoLogic(ParametroInventarioDefectoLogic parametroinventariodefectoLogic) {
		this.parametroinventariodefectoLogic = parametroinventariodefectoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoColorProducto=false;
	public Boolean esParaAccionDesdeFormularioColorProducto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ColorProductoSessionBeanAdditional colorproductoSessionBeanAdditional=null;
	
	public ColorProductoSessionBeanAdditional getColorProductoSessionBeanAdditional() {
		return this.colorproductoSessionBeanAdditional;
	}
	
	public void setColorProductoSessionBeanAdditional(ColorProductoSessionBeanAdditional colorproductoSessionBeanAdditional) {
		try {
			this.colorproductoSessionBeanAdditional=colorproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ColorProductoBeanSwingJInternalFrameAdditional colorproductoBeanSwingJInternalFrameAdditional=null;
	//public class ColorProductoBeanSwingJInternalFrame
	
	public ColorProductoBeanSwingJInternalFrameAdditional getColorProductoBeanSwingJInternalFrameAdditional() {
		return this.colorproductoBeanSwingJInternalFrameAdditional;
	}
	
	public void setColorProductoBeanSwingJInternalFrameAdditional(ColorProductoBeanSwingJInternalFrameAdditional colorproductoBeanSwingJInternalFrameAdditional) {
		try {
			this.colorproductoBeanSwingJInternalFrameAdditional=colorproductoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ColorProductoLogic colorproductoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ColorProducto colorproductoBean;
	public ColorProductoConstantesFunciones colorproductoConstantesFunciones;
	//public ColorProductoParameterReturnGeneral colorproductoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoProductoLogic tipoproductoLogic;
	public GrupoColorLogic grupocolorLogic;
	
	//PARAMETROS
	
	
	//public List<ColorProducto> colorproductos;	
	//public List<ColorProducto> colorproductosEliminados;
	//public List<ColorProducto> colorproductosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoColorProducto=false;
	public Boolean isVisibilidadCeldaDuplicarColorProducto=true;
	public Boolean isVisibilidadCeldaCopiarColorProducto=true;
	public Boolean isVisibilidadCeldaVerFormColorProducto=true;
	public Boolean isVisibilidadCeldaOrdenColorProducto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesColorProducto=false;
	public Boolean isVisibilidadCeldaModificarColorProducto=false;
	public Boolean isVisibilidadCeldaActualizarColorProducto=false;
	public Boolean isVisibilidadCeldaEliminarColorProducto=false;
	public Boolean isVisibilidadCeldaCancelarColorProducto=false;
	public Boolean isVisibilidadCeldaGuardarColorProducto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosColorProducto=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdGrupoColor=false;
	public Boolean isVisibilidadFK_IdTipoProducto=false;
	
	public Long getiIdNuevoColorProducto() {
		return this.iIdNuevoColorProducto;
	}

	public void setiIdNuevoColorProducto(Long iIdNuevoColorProducto) {
		this.iIdNuevoColorProducto = iIdNuevoColorProducto;
	}
	
	public Long getidColorProductoActual() {
		return this.idColorProductoActual;
	}

	public void setidColorProductoActual(Long idColorProductoActual) {
		this.idColorProductoActual = idColorProductoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ColorProducto getcolorproducto() {
		return this.colorproducto;
	}

	public void setcolorproducto(ColorProducto colorproducto) {
		this.colorproducto = colorproducto;
	}
	
	public ColorProducto getcolorproductoAux() {
		return this.colorproductoAux;
	}

	public void setcolorproductoAux(ColorProducto colorproductoAux) {
		this.colorproductoAux = colorproductoAux;
	}				
	
	public ColorProducto getcolorproductoAnterior() {
		return this.colorproductoAnterior;
	}

	public void setcolorproductoAnterior(ColorProducto colorproductoAnterior) {
		this.colorproductoAnterior = colorproductoAnterior;
	}	
	
	public ColorProducto getcolorproductoTotales() {
		return this.colorproductoTotales;
	}

	public void setcolorproductoTotales(ColorProducto colorproductoTotales) {
		this.colorproductoTotales = colorproductoTotales;
	}	
	
	public ColorProducto getcolorproductoBean() {
		return this.colorproductoBean;
	}

	public void setcolorproductoBean(ColorProducto colorproductoBean) {
		this.colorproductoBean = colorproductoBean;
	}	
	
	public ColorProductoParameterReturnGeneral getcolorproductoReturnGeneral() {
		return this.colorproductoReturnGeneral;
	}

	public void setcolorproductoReturnGeneral(ColorProductoParameterReturnGeneral colorproductoReturnGeneral) {
		this.colorproductoReturnGeneral = colorproductoReturnGeneral;
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

	public Long id_grupo_colorFK_IdGrupoColor=-1L;

	public Long getid_grupo_colorFK_IdGrupoColor() {
		return this.id_grupo_colorFK_IdGrupoColor;
	}

	public void setid_grupo_colorFK_IdGrupoColor(Long id_grupo_colorFK_IdGrupoColor) {
		this.id_grupo_colorFK_IdGrupoColor = id_grupo_colorFK_IdGrupoColor;
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
	
	
	public ColorProductoLogic getColorProductoLogic()	{		
		return colorproductoLogic;
	}

	public void setColorProductoLogic(ColorProductoLogic colorproductoLogic) {
		this.colorproductoLogic = colorproductoLogic;
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
	
	public Boolean getIsEsNuevoColorProducto() {
		return isEsNuevoColorProducto;
	}

	public void setIsEsNuevoColorProducto(Boolean isEsNuevoColorProducto) {
		this.isEsNuevoColorProducto = isEsNuevoColorProducto;
	}

	public Boolean getEsParaAccionDesdeFormularioColorProducto() {
		return esParaAccionDesdeFormularioColorProducto;
	}
	
	public void setEsParaAccionDesdeFormularioColorProducto(Boolean esParaAccionDesdeFormularioColorProducto) {
		this.esParaAccionDesdeFormularioColorProducto = esParaAccionDesdeFormularioColorProducto;
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

			if(this.colorproductoSessionBean==null) {
				this.colorproductoSessionBean=new ColorProductoSessionBean();
			}

			if(!this.colorproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(colorproductoSessionBean.getlidEmpresaActual());
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

			if(this.colorproductoSessionBean==null) {
				this.colorproductoSessionBean=new ColorProductoSessionBean();
			}

			if(!this.colorproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProducto()) {
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
					tipoproductoLogic.getEntityWithConnection(colorproductoSessionBean.getlidTipoProductoActual());
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

	public void cargarCombosGrupoColorsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.grupocolorsForeignKey=new ArrayList<GrupoColor>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			GrupoColorLogic grupocolorLogic=new GrupoColorLogic();

			//grupocolorLogic.getGrupoColorDataAccess().setIsForForeingKeyData(true);

			if(this.colorproductoSessionBean==null) {
				this.colorproductoSessionBean=new ColorProductoSessionBean();
			}

			if(!this.colorproductoSessionBean.getisBusquedaDesdeForeignKeySesionGrupoColor()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//grupocolorLogic.getGrupoColorDataAccess().setIsForForeingKeyData(true);

					grupocolorLogic.getTodosGrupoColorsWithConnection(sFinalQuery,new Pagination());

					this.grupocolorsForeignKey=grupocolorLogic.getGrupoColors();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaGrupoColor(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupocolorLogic.getEntityWithConnection(colorproductoSessionBean.getlidGrupoColorActual());
					this.grupocolorsForeignKey.add(grupocolorLogic.getGrupoColor());
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

					if(this.colorproducto!=null) {
						this.colorproducto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormColorProducto!=null) {
						this.jInternalFrameDetalleFormColorProducto.jComboBoxid_empresaColorProducto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaColorProducto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormColorProducto!=null) {
						if(this.jInternalFrameDetalleFormColorProducto.jComboBoxid_empresaColorProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormColorProducto.jComboBoxid_empresaColorProducto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaColorProductoGenerico)throws Exception
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
				jComboBoxid_empresaColorProductoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaColorProductoGenerico!=null && jComboBoxid_empresaColorProductoGenerico.getItemCount()>0) {
					jComboBoxid_empresaColorProductoGenerico.setSelectedIndex(0);
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

					if(this.colorproducto!=null) {
						this.colorproducto.setTipoProducto(tipoproductoTemp);
					}

					if(this.jInternalFrameDetalleFormColorProducto!=null) {
						this.jInternalFrameDetalleFormColorProducto.jComboBoxid_tipo_productoColorProducto.setSelectedItem(tipoproductoTemp);
					}
				} else {
					//jComboBoxid_tipo_productoColorProducto.setSelectedItem(tipoproductoTemp);
					if(this.jInternalFrameDetalleFormColorProducto!=null) {
						if(this.jInternalFrameDetalleFormColorProducto.jComboBoxid_tipo_productoColorProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormColorProducto.jComboBoxid_tipo_productoColorProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoproductoTemp!=null && jComboBoxid_tipo_productoFK_IdTipoProductoColorProducto!=null) {
						jComboBoxid_tipo_productoFK_IdTipoProductoColorProducto.setSelectedItem(tipoproductoTemp);
					} else {
						if(jComboBoxid_tipo_productoFK_IdTipoProductoColorProducto!=null) {
							//jComboBoxid_tipo_productoFK_IdTipoProductoColorProducto.setSelectedItem(tipoproductoTemp);
							if(jComboBoxid_tipo_productoFK_IdTipoProductoColorProducto.getItemCount()>0) {
								jComboBoxid_tipo_productoFK_IdTipoProductoColorProducto.setSelectedIndex(0);
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
	public void setActualTipoProductoForeignKeyGenerico(Long idTipoProductoSeleccionado,JComboBox jComboBoxid_tipo_productoColorProductoGenerico)throws Exception
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
				jComboBoxid_tipo_productoColorProductoGenerico.setSelectedItem(tipoproductoTemp);
			} else {
				if(jComboBoxid_tipo_productoColorProductoGenerico!=null && jComboBoxid_tipo_productoColorProductoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_productoColorProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualGrupoColorForeignKey(Long idGrupoColorSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			GrupoColor  grupocolorTemp=null;

			for(GrupoColor grupocolorAux:grupocolorsForeignKey) {
				if(grupocolorAux.getId()!=null && grupocolorAux.getId().equals(idGrupoColorSeleccionado)) {
					grupocolorTemp=grupocolorAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(grupocolorTemp!=null) {

					if(this.colorproducto!=null) {
						this.colorproducto.setGrupoColor(grupocolorTemp);
					}

					if(this.jInternalFrameDetalleFormColorProducto!=null) {
						this.jInternalFrameDetalleFormColorProducto.jComboBoxid_grupo_colorColorProducto.setSelectedItem(grupocolorTemp);
					}
				} else {
					//jComboBoxid_grupo_colorColorProducto.setSelectedItem(grupocolorTemp);
					if(this.jInternalFrameDetalleFormColorProducto!=null) {
						if(this.jInternalFrameDetalleFormColorProducto.jComboBoxid_grupo_colorColorProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormColorProducto.jComboBoxid_grupo_colorColorProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdGrupoColor") || sFormularioTipoBusqueda.equals("Todos")){
					if(grupocolorTemp!=null && jComboBoxid_grupo_colorFK_IdGrupoColorColorProducto!=null) {
						jComboBoxid_grupo_colorFK_IdGrupoColorColorProducto.setSelectedItem(grupocolorTemp);
					} else {
						if(jComboBoxid_grupo_colorFK_IdGrupoColorColorProducto!=null) {
							//jComboBoxid_grupo_colorFK_IdGrupoColorColorProducto.setSelectedItem(grupocolorTemp);
							if(jComboBoxid_grupo_colorFK_IdGrupoColorColorProducto.getItemCount()>0) {
								jComboBoxid_grupo_colorFK_IdGrupoColorColorProducto.setSelectedIndex(0);
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

	public String getActualGrupoColorForeignKeyDescripcion(Long idGrupoColorSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			GrupoColor  grupocolorTemp=null;

			for(GrupoColor grupocolorAux:grupocolorsForeignKey) {
				if(grupocolorAux.getId()!=null && grupocolorAux.getId().equals(idGrupoColorSeleccionado)) {
					grupocolorTemp=grupocolorAux;
					break;
				}
			}


			sDescripcion=GrupoColorConstantesFunciones.getGrupoColorDescripcion(grupocolorTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualGrupoColorForeignKeyGenerico(Long idGrupoColorSeleccionado,JComboBox jComboBoxid_grupo_colorColorProductoGenerico)throws Exception
	{
		try
		{
			GrupoColor  grupocolorTemp=null;

			for(GrupoColor grupocolorAux:grupocolorsForeignKey) {
				if(grupocolorAux.getId()!=null && grupocolorAux.getId().equals(idGrupoColorSeleccionado)) {
					grupocolorTemp=grupocolorAux;
					break;
				}
			}

			if(grupocolorTemp!=null) {
				jComboBoxid_grupo_colorColorProductoGenerico.setSelectedItem(grupocolorTemp);
			} else {
				if(jComboBoxid_grupo_colorColorProductoGenerico!=null && jComboBoxid_grupo_colorColorProductoGenerico.getItemCount()>0) {
					jComboBoxid_grupo_colorColorProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ColorProducto colorproducto,JComboBox jComboBoxid_empresaColorProductoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaColorProductoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormColorProducto.jComboBoxid_empresaColorProducto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaColorProductoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				colorproducto.setid_empresa(empresaAux.getId());
				colorproducto.setempresa_descripcion(ColorProductoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				colorproducto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoProductoForeignKey(ColorProducto colorproducto,JComboBox jComboBoxid_tipo_productoColorProductoGenerico)throws Exception
	{
		try
		{
			TipoProducto  tipoproductoAux=new TipoProducto();

			if(jComboBoxid_tipo_productoColorProductoGenerico==null) {
				tipoproductoAux=(TipoProducto)this.jInternalFrameDetalleFormColorProducto.jComboBoxid_tipo_productoColorProducto.getSelectedItem();
			} else {
				tipoproductoAux=(TipoProducto)jComboBoxid_tipo_productoColorProductoGenerico.getSelectedItem();
			}

			if(tipoproductoAux!=null && tipoproductoAux.getId()!=null) {
				colorproducto.setid_tipo_producto(tipoproductoAux.getId());
				colorproducto.settipoproducto_descripcion(ColorProductoConstantesFunciones.getTipoProductoDescripcion(tipoproductoAux));
				colorproducto.setTipoProducto(tipoproductoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarGrupoColorForeignKey(ColorProducto colorproducto,JComboBox jComboBoxid_grupo_colorColorProductoGenerico)throws Exception
	{
		try
		{
			GrupoColor  grupocolorAux=new GrupoColor();

			if(jComboBoxid_grupo_colorColorProductoGenerico==null) {
				grupocolorAux=(GrupoColor)this.jInternalFrameDetalleFormColorProducto.jComboBoxid_grupo_colorColorProducto.getSelectedItem();
			} else {
				grupocolorAux=(GrupoColor)jComboBoxid_grupo_colorColorProductoGenerico.getSelectedItem();
			}

			if(grupocolorAux!=null && grupocolorAux.getId()!=null) {
				colorproducto.setid_grupo_color(grupocolorAux.getId());
				colorproducto.setgrupocolor_descripcion(ColorProductoConstantesFunciones.getGrupoColorDescripcion(grupocolorAux));
				colorproducto.setGrupoColor(grupocolorAux);			}
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

					if(!ColorProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormColorProducto!=null) { 
							this.jInternalFrameDetalleFormColorProducto.jComboBoxid_empresaColorProducto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormColorProducto.jComboBoxid_empresaColorProducto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormColorProducto!=null) { 
					}

					if(!ColorProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ColorProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormColorProducto!=null) { 
							this.jInternalFrameDetalleFormColorProducto.jComboBoxid_tipo_productoColorProducto.removeAllItems();

							for(TipoProducto tipoproducto:this.tipoproductosForeignKey) {
								this.jInternalFrameDetalleFormColorProducto.jComboBoxid_tipo_productoColorProducto.addItem(tipoproducto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormColorProducto!=null) { 
					}

					if(!ColorProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ColorProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_productoFK_IdTipoProductoColorProducto.removeAllItems();

							for(TipoProducto tipoproducto:this.tipoproductosForeignKey) {
								this.jComboBoxid_tipo_productoFK_IdTipoProductoColorProducto.addItem(tipoproducto);
							}
						}

						if(!ColorProductoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameGrupoColorsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingGrupoColor=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ColorProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormColorProducto!=null) { 
							this.jInternalFrameDetalleFormColorProducto.jComboBoxid_grupo_colorColorProducto.removeAllItems();

							for(GrupoColor grupocolor:this.grupocolorsForeignKey) {
								this.jInternalFrameDetalleFormColorProducto.jComboBoxid_grupo_colorColorProducto.addItem(grupocolor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormColorProducto!=null) { 
					}

					if(!ColorProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdGrupoColor") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ColorProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_grupo_colorFK_IdGrupoColorColorProducto.removeAllItems();

							for(GrupoColor grupocolor:this.grupocolorsForeignKey) {
								this.jComboBoxid_grupo_colorFK_IdGrupoColorColorProducto.addItem(grupocolor);
							}
						}

						if(!ColorProductoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormColorProducto!=null) {
							this.jInternalFrameDetalleFormColorProducto.jComboBoxid_empresaColorProducto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormColorProducto!=null) {
							this.jInternalFrameDetalleFormColorProducto.jComboBoxid_empresaColorProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormColorProducto!=null) {
							this.jInternalFrameDetalleFormColorProducto.jComboBoxid_tipo_productoColorProducto.setSelectedItem(tipoproducto);
						}
					} else {
						if(this.jInternalFrameDetalleFormColorProducto!=null) {
							this.jInternalFrameDetalleFormColorProducto.jComboBoxid_tipo_productoColorProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_productoFK_IdTipoProductoColorProducto.setSelectedItem(tipoproducto);
						} else {
							this.jComboBoxid_tipo_productoFK_IdTipoProductoColorProducto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameGrupoColorForeignKey(GrupoColor grupocolor,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormColorProducto!=null) {
							this.jInternalFrameDetalleFormColorProducto.jComboBoxid_grupo_colorColorProducto.setSelectedItem(grupocolor);
						}
					} else {
						if(this.jInternalFrameDetalleFormColorProducto!=null) {
							this.jInternalFrameDetalleFormColorProducto.jComboBoxid_grupo_colorColorProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_grupo_colorFK_IdGrupoColorColorProducto.setSelectedItem(grupocolor);
						} else {
							this.jComboBoxid_grupo_colorFK_IdGrupoColorColorProducto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesColorProducto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ColorProductoConstantesFunciones.refrescarForeignKeysDescripcionesColorProducto(this.colorproductoLogic.getColorProductos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ColorProductoConstantesFunciones.refrescarForeignKeysDescripcionesColorProducto(this.colorproductos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(TipoProducto.class));
		classes.add(new Classe(GrupoColor.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//colorproductoLogic.setColorProductos(this.colorproductos);
			colorproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ColorProductoParameterReturnGeneral getColorProductoParameterGeneral() {
		return this.colorproductoParameterGeneral;
	}
	
	public void setColorProductoParameterGeneral(ColorProductoParameterReturnGeneral colorproductoParameterGeneral) {
		this.colorproductoParameterGeneral = colorproductoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoColorProducto() {
		return isPermisoTodoColorProducto;
	}

	public void setIsPermisoTodoColorProducto(Boolean isPermisoTodoColorProducto) {
		this.isPermisoTodoColorProducto = isPermisoTodoColorProducto;
	}

	public Boolean getIsPermisoNuevoColorProducto() {
		return isPermisoNuevoColorProducto;
	}

	public void setIsPermisoNuevoColorProducto(Boolean isPermisoNuevoColorProducto) {
		this.isPermisoNuevoColorProducto = isPermisoNuevoColorProducto;
	}

	public Boolean getIsPermisoActualizarColorProducto() {
		return isPermisoActualizarColorProducto;
	}

	public void setIsPermisoActualizarColorProducto(Boolean isPermisoActualizarColorProducto) {
		this.isPermisoActualizarColorProducto = isPermisoActualizarColorProducto;
	}

	public Boolean getIsPermisoEliminarColorProducto() {
		return isPermisoEliminarColorProducto;
	}

	public void setIsPermisoEliminarColorProducto(Boolean isPermisoEliminarColorProducto) {
		this.isPermisoEliminarColorProducto = isPermisoEliminarColorProducto;
	}

	public Boolean getIsPermisoGuardarCambiosColorProducto() {
		return isPermisoGuardarCambiosColorProducto;
	}

	public void setIsPermisoGuardarCambiosColorProducto(Boolean isPermisoGuardarCambiosColorProducto) {
		this.isPermisoGuardarCambiosColorProducto = isPermisoGuardarCambiosColorProducto;
	}
	
	public Boolean getIsPermisoConsultaColorProducto() {
		return isPermisoConsultaColorProducto;
	}

	public void setIsPermisoConsultaColorProducto(Boolean isPermisoConsultaColorProducto) {
		this.isPermisoConsultaColorProducto = isPermisoConsultaColorProducto;
	}

	public Boolean getIsPermisoBusquedaColorProducto() {
		return isPermisoBusquedaColorProducto;
	}

	public void setIsPermisoBusquedaColorProducto(Boolean isPermisoBusquedaColorProducto) {
		this.isPermisoBusquedaColorProducto = isPermisoBusquedaColorProducto;
	}

	public Boolean getIsPermisoReporteColorProducto() {
		return isPermisoReporteColorProducto;
	}

	public void setIsPermisoReporteColorProducto(Boolean isPermisoReporteColorProducto) {
		this.isPermisoReporteColorProducto = isPermisoReporteColorProducto;
	}
	
	public Boolean getIsPermisoPaginacionMedioColorProducto() {
		return isPermisoPaginacionMedioColorProducto;
	}

	public void setIsPermisoPaginacionMedioColorProducto(Boolean isPermisoPaginacionMedioColorProducto) {
		this.isPermisoPaginacionMedioColorProducto = isPermisoPaginacionMedioColorProducto;
	}
	
	public Boolean getIsPermisoPaginacionTodoColorProducto() {
		return isPermisoPaginacionTodoColorProducto;
	}

	public void setIsPermisoPaginacionTodoColorProducto(Boolean isPermisoPaginacionTodoColorProducto) {
		this.isPermisoPaginacionTodoColorProducto = isPermisoPaginacionTodoColorProducto;
	}
	
	public Boolean getIsPermisoPaginacionAltoColorProducto() {
		return isPermisoPaginacionAltoColorProducto;
	}

	public void setIsPermisoPaginacionAltoColorProducto(Boolean isPermisoPaginacionAltoColorProducto) {
		this.isPermisoPaginacionAltoColorProducto = isPermisoPaginacionAltoColorProducto;
	}
	
	public Boolean getIsPermisoCopiarColorProducto() {
		return isPermisoCopiarColorProducto;
	}

	public void setIsPermisoCopiarColorProducto(Boolean isPermisoCopiarColorProducto) {
		this.isPermisoCopiarColorProducto = isPermisoCopiarColorProducto;
	}
	
	public Boolean getIsPermisoVerFormColorProducto() {
		return isPermisoVerFormColorProducto;
	}

	public void setIsPermisoVerFormColorProducto(Boolean isPermisoVerFormColorProducto) {
		this.isPermisoVerFormColorProducto = isPermisoVerFormColorProducto;
	}
	
	public Boolean getIsPermisoDuplicarColorProducto() {
		return isPermisoDuplicarColorProducto;
	}

	public void setIsPermisoDuplicarColorProducto(Boolean isPermisoDuplicarColorProducto) {
		this.isPermisoDuplicarColorProducto = isPermisoDuplicarColorProducto;
	}
	
	public Boolean getIsPermisoOrdenColorProducto() {
		return isPermisoOrdenColorProducto;
	}

	public void setIsPermisoOrdenColorProducto(Boolean isPermisoOrdenColorProducto) {
		this.isPermisoOrdenColorProducto = isPermisoOrdenColorProducto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoColorProducto() {
		return isVisibilidadCeldaNuevoColorProducto;
	}

	public void setIsVisibilidadCeldaNuevoColorProducto(Boolean isVisibilidadCeldaNuevoColorProducto) {
		this.isVisibilidadCeldaNuevoColorProducto = isVisibilidadCeldaNuevoColorProducto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarColorProducto() {
		return isVisibilidadCeldaDuplicarColorProducto;
	}

	public void setIsVisibilidadCeldaDuplicarColorProducto(Boolean isVisibilidadCeldaDuplicarColorProducto) {
		this.isVisibilidadCeldaDuplicarColorProducto = isVisibilidadCeldaDuplicarColorProducto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarColorProducto() {
		return isVisibilidadCeldaCopiarColorProducto;
	}

	public void setIsVisibilidadCeldaCopiarColorProducto(Boolean isVisibilidadCeldaCopiarColorProducto) {
		this.isVisibilidadCeldaCopiarColorProducto = isVisibilidadCeldaCopiarColorProducto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormColorProducto() {
		return isVisibilidadCeldaVerFormColorProducto;
	}

	public void setIsVisibilidadCeldaVerFormColorProducto(Boolean isVisibilidadCeldaVerFormColorProducto) {
		this.isVisibilidadCeldaVerFormColorProducto = isVisibilidadCeldaVerFormColorProducto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenColorProducto() {
		return isVisibilidadCeldaOrdenColorProducto;
	}

	public void setIsVisibilidadCeldaOrdenColorProducto(Boolean isVisibilidadCeldaOrdenColorProducto) {
		this.isVisibilidadCeldaOrdenColorProducto = isVisibilidadCeldaOrdenColorProducto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesColorProducto() {
		return isVisibilidadCeldaNuevoRelacionesColorProducto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesColorProducto(Boolean isVisibilidadCeldaNuevoRelacionesColorProducto) {
		this.isVisibilidadCeldaNuevoRelacionesColorProducto = isVisibilidadCeldaNuevoRelacionesColorProducto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarColorProducto() {
		return isVisibilidadCeldaModificarColorProducto;
	}

	public void setIsVisibilidadCeldaModificarColorProducto(Boolean isVisibilidadCeldaModificarColorProducto) {
		this.isVisibilidadCeldaModificarColorProducto = isVisibilidadCeldaModificarColorProducto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarColorProducto() {
		return isVisibilidadCeldaActualizarColorProducto;
	}

	public void setIsVisibilidadCeldaActualizarColorProducto(Boolean isVisibilidadCeldaActualizarColorProducto) {
		this.isVisibilidadCeldaActualizarColorProducto = isVisibilidadCeldaActualizarColorProducto;
	}

	public Boolean getIsVisibilidadCeldaEliminarColorProducto() {
		return isVisibilidadCeldaEliminarColorProducto;
	}

	public void setIsVisibilidadCeldaEliminarColorProducto(Boolean isVisibilidadCeldaEliminarColorProducto) {
		this.isVisibilidadCeldaEliminarColorProducto = isVisibilidadCeldaEliminarColorProducto;
	}

	public Boolean getIsVisibilidadCeldaCancelarColorProducto() {
		return isVisibilidadCeldaCancelarColorProducto;
	}

	public void setIsVisibilidadCeldaCancelarColorProducto(Boolean isVisibilidadCeldaCancelarColorProducto) {
		this.isVisibilidadCeldaCancelarColorProducto = isVisibilidadCeldaCancelarColorProducto;
	}

	public Boolean getIsVisibilidadCeldaGuardarColorProducto() {
		return isVisibilidadCeldaGuardarColorProducto;
	}

	public void setIsVisibilidadCeldaGuardarColorProducto(Boolean isVisibilidadCeldaGuardarColorProducto) {
		this.isVisibilidadCeldaGuardarColorProducto = isVisibilidadCeldaGuardarColorProducto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosColorProducto() {
		return isVisibilidadCeldaGuardarCambiosColorProducto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosColorProducto(Boolean isVisibilidadCeldaGuardarCambiosColorProducto) {
		this.isVisibilidadCeldaGuardarCambiosColorProducto = isVisibilidadCeldaGuardarCambiosColorProducto;
	}
		
	public ColorProductoSessionBean getcolorproductoSessionBean() {
		return this.colorproductoSessionBean;
	}
	
	public void setcolorproductoSessionBean(ColorProductoSessionBean colorproductoSessionBean) {
		this.colorproductoSessionBean=colorproductoSessionBean;
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

	public Boolean getisVisibilidadFK_IdGrupoColor() {
		return this.isVisibilidadFK_IdGrupoColor;
	}

	public void setisVisibilidadFK_IdGrupoColor(Boolean isVisibilidadFK_IdGrupoColor) {
		this.isVisibilidadFK_IdGrupoColor=isVisibilidadFK_IdGrupoColor;
	}

	public Boolean getisVisibilidadFK_IdTipoProducto() {
		return this.isVisibilidadFK_IdTipoProducto;
	}

	public void setisVisibilidadFK_IdTipoProducto(Boolean isVisibilidadFK_IdTipoProducto) {
		this.isVisibilidadFK_IdTipoProducto=isVisibilidadFK_IdTipoProducto;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysColorProducto(ColorProducto colorproducto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(colorproducto,null);
				this.setActualParaGuardarTipoProductoForeignKey(colorproducto,null);
				this.setActualParaGuardarGrupoColorForeignKey(colorproducto,null);
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
	
	public void bugActualizarReferenciaActual(ColorProducto colorproducto,ColorProducto colorproductoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalColorProducto(colorproducto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		colorproductoAux.setId(colorproducto.getId());
		colorproductoAux.setVersionRow(colorproducto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessColorProducto();
		
			int intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproducto =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.colorproducto =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ColorProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualColorProducto(this.colorproducto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysColorProducto(this.colorproducto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = colorproductoValidator.getInvalidValues(this.colorproducto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			colorproductoLogic.setDatosCliente(datosCliente);
			colorproductoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				colorproductoAux=new  ColorProducto();
				
				colorproductoAux.setIsNew(true);
				colorproductoAux.setIsChanged(true);
				
				colorproductoAux.setColorProductoOriginal(this.colorproducto);
				
				colorproductoAux.setId(this.colorproducto.getId());	
				colorproductoAux.setVersionRow(this.colorproducto.getVersionRow());	
				colorproductoAux.setid_empresa(this.colorproducto.getid_empresa());	
				colorproductoAux.setid_tipo_producto(this.colorproducto.getid_tipo_producto());	
				colorproductoAux.setid_grupo_color(this.colorproducto.getid_grupo_color());	
				colorproductoAux.setcodigo(this.colorproducto.getcodigo());	
				colorproductoAux.setnombre(this.colorproducto.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.colorproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.colorproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(colorproductoAux,colorproductoLogic.getColorProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(colorproductoAux,colorproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.colorproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.colorproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						colorproductoLogic.saveColorProductos();//WithConnection
						//colorproductoLogic.getSetVersionRowColorProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.colorproducto,colorproductoAux);
					
					this.refrescarForeignKeysDescripcionesColorProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.colorproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.colorproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								colorproductoLogic.saveColorProductoRelaciones(colorproductoAux,this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//colorproductoLogic.getSetVersionRowColorProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.colorproducto,colorproductoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							colorproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.colorproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.colorproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(colorproductoAux,colorproductoLogic.getColorProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(colorproductoAux,colorproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.colorproducto,colorproductoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				colorproductoAux=new  ColorProducto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.colorproductoSessionBean.getEsGuardarRelacionado() 
					|| (this.colorproductoSessionBean.getEsGuardarRelacionado() && this.colorproducto.getId()>=0)) {
						
					colorproductoAux.setIsNew(false);
				}
				
				colorproductoAux.setIsDeleted(false);
			
				colorproductoAux.setId(this.colorproducto.getId());	
				colorproductoAux.setVersionRow(this.colorproducto.getVersionRow());	
				colorproductoAux.setid_empresa(this.colorproducto.getid_empresa());	
				colorproductoAux.setid_tipo_producto(this.colorproducto.getid_tipo_producto());	
				colorproductoAux.setid_grupo_color(this.colorproducto.getid_grupo_color());	
				colorproductoAux.setcodigo(this.colorproducto.getcodigo());	
				colorproductoAux.setnombre(this.colorproducto.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(colorproductoAux,colorproductoLogic.getColorProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(colorproductoAux,colorproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.colorproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.colorproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						colorproductoLogic.saveColorProductos();//WithConnection
						//colorproductoLogic.getSetVersionRowColorProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.colorproducto,colorproductoAux);
					
					this.refrescarForeignKeysDescripcionesColorProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.colorproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.colorproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								colorproductoLogic.saveColorProductoRelaciones(colorproductoAux,this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//colorproductoLogic.getSetVersionRowColorProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.colorproducto,colorproductoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							colorproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.colorproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.colorproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(colorproductoAux,colorproductoLogic.getColorProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(colorproductoAux,colorproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.colorproducto,colorproductoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				colorproductoAux=new  ColorProducto();
				
				colorproductoAux.setIsNew(false);
				colorproductoAux.setIsChanged(false);
				
				colorproductoAux.setIsDeleted(true);
				
				colorproductoAux.setId(this.colorproducto.getId());	
				colorproductoAux.setVersionRow(this.colorproducto.getVersionRow());	
				colorproductoAux.setid_empresa(this.colorproducto.getid_empresa());	
				colorproductoAux.setid_tipo_producto(this.colorproducto.getid_tipo_producto());	
				colorproductoAux.setid_grupo_color(this.colorproducto.getid_grupo_color());	
				colorproductoAux.setcodigo(this.colorproducto.getcodigo());	
				colorproductoAux.setnombre(this.colorproducto.getnombre());	
				
				if(this.colorproductoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.colorproductoAux.getId()>=0) {	
						this.colorproductosEliminados.add(colorproductoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(colorproductoAux,colorproductoLogic.getColorProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(colorproductoAux,colorproductos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.colorproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.colorproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						colorproductoLogic.saveColorProductos();//WithConnection
						//colorproductoLogic.getSetVersionRowColorProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.colorproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.colorproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								colorproductoLogic.saveColorProductoRelaciones(colorproductoAux,this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//colorproductoLogic.getSetVersionRowColorProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							colorproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.colorproductoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.colorproductoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(colorproductoAux,colorproductoLogic.getColorProductos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(colorproductoAux,colorproductos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.getColorProductos().addAll(this.colorproductosEliminados);
					
					colorproductoLogic.saveColorProductos();//WithConnection
					//colorproductoLogic.getSetVersionRowColorProductos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesColorProducto();
				
				this.colorproductosEliminados= new ArrayList<ColorProducto>();		
			}
			
			if(this.colorproductoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.colorproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Color Producto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Color Producto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.colorproducto=colorproductoAux;
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
      		//this.finishProcessColorProducto();
      	}
		
	}	
	
	public void actualizarRelaciones(ColorProducto colorproductoLocal) throws Exception {
		
		if(this.colorproductoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				colorproductoLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
			
			} else {
			
				colorproductoLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ColorProducto colorproductoLocal) throws Exception {	
		if(this.colorproductoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				colorproductoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoProductoDetalleFormJInternalFrame.class)) {
				TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrameLocal=(TipoProductoBeanSwingJInternalFrame) ((TipoProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoproductoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoProducto(tipoproductoBeanSwingJInternalFrameLocal.gettipoproducto(),true);
				tipoproductoBeanSwingJInternalFrameLocal.actualizarLista(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto,this.tipoproductosForeignKey);

				tipoproductoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto);

				colorproductoLocal.setTipoProducto(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto);

				this.addItemDefectoCombosForeignKeyTipoProducto();
				this.cargarCombosFrameTipoProductosForeignKey("Formulario");
				this.setActualTipoProductoForeignKey(tipoproductoBeanSwingJInternalFrameLocal.tipoproducto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(GrupoColorDetalleFormJInternalFrame.class)) {
				GrupoColorBeanSwingJInternalFrame grupocolorBeanSwingJInternalFrameLocal=(GrupoColorBeanSwingJInternalFrame) ((GrupoColorDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				grupocolorBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoGrupoColor(grupocolorBeanSwingJInternalFrameLocal.getgrupocolor(),true);
				grupocolorBeanSwingJInternalFrameLocal.actualizarLista(grupocolorBeanSwingJInternalFrameLocal.grupocolor,this.grupocolorsForeignKey);

				grupocolorBeanSwingJInternalFrameLocal.actualizarRelaciones(grupocolorBeanSwingJInternalFrameLocal.grupocolor);

				colorproductoLocal.setGrupoColor(grupocolorBeanSwingJInternalFrameLocal.grupocolor);

				this.addItemDefectoCombosForeignKeyGrupoColor();
				this.cargarCombosFrameGrupoColorsForeignKey("Formulario");
				this.setActualGrupoColorForeignKey(grupocolorBeanSwingJInternalFrameLocal.grupocolor.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarColorProductoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.colorproducto =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.colorproducto =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = colorproductoValidator.getInvalidValues(this.colorproducto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ColorProducto colorproducto,List<ColorProducto> colorproductos) throws Exception {
		try	{		
			ColorProductoConstantesFunciones.actualizarLista(colorproducto,colorproductos,this.colorproductoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ColorProducto colorproducto,List<ColorProducto> colorproductos) throws Exception {
		try	{			
			ColorProductoConstantesFunciones.actualizarSelectedLista(colorproducto,colorproductos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ColorProducto> colorproductosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				colorproductosLocal=this.colorproductoLogic.getColorProductos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				colorproductosLocal=this.colorproductos;
			}
			//ARCHITECTURE
		
			for(ColorProducto colorproductoLocal:colorproductosLocal) {
				if(this.permiteMantenimiento(colorproductoLocal) && colorproductoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ColorProductoConstantesFunciones.getColorProductoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ColorProductoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormColorProducto.jLabelid_empresaColorProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ColorProductoConstantesFunciones.IDTIPOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormColorProducto.jLabelid_tipo_productoColorProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ColorProductoConstantesFunciones.IDGRUPOCOLOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormColorProducto.jLabelid_grupo_colorColorProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ColorProductoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormColorProducto.jLabelcodigoColorProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ColorProductoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormColorProducto.jLabelnombreColorProducto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormColorProducto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormColorProducto.jLabelid_empresaColorProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormColorProducto.jLabelid_tipo_productoColorProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormColorProducto.jLabelid_grupo_colorColorProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormColorProducto.jLabelcodigoColorProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormColorProducto.jLabelnombreColorProducto,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ParametroInventarioDefecto")) {
			if(this.colorproducto==null) {
				this.colorproducto= new ColorProducto();
			}

			if(this.colorproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoColorProducto
				this.setVariablesFormularioToObjetoActualColorProducto(this.colorproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysColorProducto(this.colorproducto);

				this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.getparametroinventariodefecto().setColorProducto(this.colorproducto);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoColorProducto--;	
		
		
		this.colorproductoAux=new ColorProducto();
		
		this.colorproductoAux.setId(this.iIdNuevoColorProducto);
		this.colorproductoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.colorproductoLogic.getColorProductos().add(this.colorproductoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.colorproductos.add(this.colorproductoAux);
		}
		//ARCHITECTURE
		
		this.colorproducto=this.colorproductoAux;
		
		if(ColorProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioColorProducto(this.colorproducto);
			this.setVariablesObjetoActualToFormularioForeignKeyColorProducto(this.colorproducto);
		}
				
		//this.setDefaultControlesColorProducto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyColorProducto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyColorProducto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyColorProducto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualColorProducto(this.colorproductoBean,this.colorproducto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysColorProducto(this.colorproducto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ColorProductoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.colorproductoSessionBean.getConGuardarRelaciones()) {
			classes=ColorProductoConstantesFunciones.getClassesRelationshipsOfColorProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.colorproductoReturnGeneral=colorproductoLogic.procesarEventosColorProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.colorproductoLogic.getColorProductos(),this.colorproducto,this.colorproductoParameterGeneral,this.isEsNuevoColorProducto,classes);//this.colorproductoLogic.getColorProducto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanColorProducto(this.colorproductoReturnGeneral,this.colorproductoBean,false);
		
		if(this.colorproductoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyColorProducto(this.colorproductoReturnGeneral.getColorProducto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioColorProducto(this.colorproductoReturnGeneral.getColorProducto());
		}
		
		if(this.colorproductoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioColorProducto(this.colorproductoReturnGeneral.getColorProducto(),classes);//this.colorproductoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualColorProducto(this.colorproducto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyColorProducto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyColorProducto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ColorProductoBeanSwingJInternalFrameAdditional.RecargarFormColorProducto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingColorProducto(false);
						
			if(colorproductoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(ColorProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualColorProducto();
			}
			
			this.actualizarVisualTableDatosColorProducto();
			
			this.jTableDatosColorProducto.setRowSelectionInterval(this.getIndiceNuevoColorProducto(), this.getIndiceNuevoColorProducto());
			
			this.seleccionarFilaTablaColorProductoActual();
						
			this.actualizarEstadoCeldasBotonesColorProducto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesColorProducto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormColorProducto.jTextFieldcodigoColorProducto.setEnabled(isHabilitar && this.colorproductoConstantesFunciones.activarcodigoColorProducto);
		this.jInternalFrameDetalleFormColorProducto.jTextAreanombreColorProducto.setEnabled(isHabilitar && this.colorproductoConstantesFunciones.activarnombreColorProducto);	
		//
		this.jInternalFrameDetalleFormColorProducto.jComboBoxid_empresaColorProducto.setEnabled(isHabilitar && this.colorproductoConstantesFunciones.activarid_empresaColorProducto);
		this.jInternalFrameDetalleFormColorProducto.jComboBoxid_tipo_productoColorProducto.setEnabled(isHabilitar && this.colorproductoConstantesFunciones.activarid_tipo_productoColorProducto);
		this.jInternalFrameDetalleFormColorProducto.jComboBoxid_grupo_colorColorProducto.setEnabled(isHabilitar && this.colorproductoConstantesFunciones.activarid_grupo_colorColorProducto);
	};
	
	public void setDefaultControlesColorProducto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoColorProducto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.colorproductoSessionBean.setConGuardarRelaciones(true);			
			this.colorproductoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormColorProducto.jTabbedPaneRelacionesColorProducto.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.colorproductoSessionBean.setConGuardarRelaciones(false);			
			this.colorproductoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormColorProducto.jTabbedPaneRelacionesColorProducto.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoColorProducto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ColorProducto colorproductoAux:this.colorproductoLogic.getColorProductos()) {
				if(colorproductoAux.getId().equals(this.iIdNuevoColorProducto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ColorProducto colorproductoAux:this.colorproductos) {
				if(colorproductoAux.getId().equals(this.iIdNuevoColorProducto)) {
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
	
	public int getIndiceActualColorProducto(ColorProducto colorproducto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ColorProducto colorproductoAux:this.colorproductoLogic.getColorProductos()) {
				if(colorproductoAux.getId().equals(colorproducto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ColorProducto colorproductoAux:this.colorproductos) {
				if(colorproductoAux.getId().equals(colorproducto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalColorProducto(ColorProducto colorproductoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ColorProducto colorproductoAux:this.colorproductoLogic.getColorProductos()) {
				if(colorproductoAux.getColorProductoOriginal().getId().equals(colorproductoOriginal.getId())) {
					existe=true;
					colorproductoOriginal.setId(colorproductoAux.getId());
					colorproductoOriginal.setVersionRow(colorproductoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ColorProducto colorproductoAux:this.colorproductos) {
				if(colorproductoAux.getColorProductoOriginal().getId().equals(colorproductoOriginal.getId())) {
					existe=true;
					colorproductoOriginal.setId(colorproductoAux.getId());
					colorproductoOriginal.setVersionRow(colorproductoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosColorProducto(Boolean esParaCancelar) throws Exception {
		colorproductosAux=new ArrayList<ColorProducto>();
		colorproductoAux=new ColorProducto();
		
		if(!this.colorproductoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ColorProducto colorproductoAux:this.colorproductoLogic.getColorProductos()) {
					if(colorproductoAux.getId()<0) {
						colorproductosAux.add(colorproductoAux);
					}		
				}
				this.iIdNuevoColorProducto=0L;
				this.colorproductoLogic.getColorProductos().removeAll(colorproductosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ColorProducto colorproductoAux:this.colorproductos) {
					if(colorproductoAux.getId()<0) {
						colorproductosAux.add(colorproductoAux);
					}		
				}
				this.iIdNuevoColorProducto=0L;
				this.colorproductos.removeAll(colorproductosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoColorProducto 
					&& this.colorproductoLogic.getColorProductos().size()>0
					) {
					colorproductoAux=this.colorproductoLogic.getColorProductos().get(this.colorproductoLogic.getColorProductos().size() - 1);
				
					if(colorproductoAux.getId()<0) {
						this.colorproductoLogic.getColorProductos().remove(colorproductoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoColorProducto && this.colorproductos.size()>0) {
					colorproductoAux=this.colorproductos.get(this.colorproductos.size() - 1);
				
					if(colorproductoAux.getId()<0) {
						this.colorproductos.remove(colorproductoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoColorProducto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(colorproducto.getId()<0) {
				this.colorproductoLogic.getColorProductos().remove(this.colorproducto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(colorproducto.getId()<0) {
				this.colorproductos.remove(this.colorproducto);
			}
		}			
	}
	
	public void setEstadosInicialesColorProducto(List<ColorProducto> colorproductosAux) throws Exception {
		ColorProductoConstantesFunciones.setEstadosInicialesColorProducto(colorproductosAux);
	}
	
	public void setEstadosInicialesColorProducto(ColorProducto colorproductoAux) throws Exception {
		ColorProductoConstantesFunciones.setEstadosInicialesColorProducto(colorproductoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarColorProductoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesColorProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarColorProductoActual()) {
				if(!this.isEsNuevoColorProducto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesColorProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoColorProducto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarColorProductoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Color Producto ?", "MANTENIMIENTO DE Color Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesColorProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ColorProducto colorproducto) throws Exception {
		ColorProductoConstantesFunciones.seleccionarAsignar(this.colorproducto,colorproducto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarColorProducto=this.isPermisoActualizarOriginalColorProducto;
			
			
			this.seleccionarAsignar(colorproducto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ColorProductoConstantesFunciones.quitarEspaciosColorProducto(this.colorproducto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesColorProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.colorproductoSessionBean.setsFuncionBusquedaRapida(this.colorproductoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoColorProducto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosColorProducto(esParaCancelar);				
				this.cancelarNuevoColorProducto(esParaCancelar);								
			}
			
			this.colorproducto=new ColorProducto();
			
			this.inicializarColorProducto();
			
			this.actualizarEstadoCeldasBotonesColorProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarColorProducto() throws Exception {
		try {
			ColorProductoConstantesFunciones.inicializarColorProducto(this.colorproducto);
			
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
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.colorproductoLogic.getColorProductos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteColorProductos(String sAccionBusqueda,List<ColorProducto> colorproductosParaReportes) throws Exception {
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
					sPathReporteFinal="ColorProducto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ColorProductoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ColorProductoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ColorProducto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Color Productoes");		
		parameters.put("busquedapor", ColorProductoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ParametroInventarioDefecto.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					ColorProductoLogic colorproductoLogicAuxiliar=new ColorProductoLogic();
					colorproductoLogicAuxiliar.setDatosCliente(colorproductoLogic.getDatosCliente());				
					colorproductoLogicAuxiliar.setColorProductos(colorproductosParaReportes);
					
					colorproductoLogicAuxiliar.cargarRelacionesLoteForeignKeyColorProductoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					colorproductosParaReportes=colorproductoLogicAuxiliar.getColorProductos();
					
					//colorproductoLogic.getNewConnexionToDeep();
					
					//for (ColorProducto colorproducto:colorproductosParaReportes) {
					//	colorproductoLogic.deepLoad(colorproducto, false, DeepLoadType.INCLUDE, classes);
					//}						
					//colorproductoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//colorproductoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileParametroInventarioDefecto = AuxiliarReportes.class.getResourceAsStream("ParametroInventarioDefectoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametroinventariodefecto", reportFileParametroInventarioDefecto);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceColorProducto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ColorProductoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ColorProductoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceColorProducto=new JRBeanArrayDataSource(ColorProductoJInternalFrame.TraerColorProductoBeans(colorproductosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceColorProducto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ColorProductoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ColorProductoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ColorProductoBean.TraerColorProductoBeans(colorproductosParaReportes).toArray()));
							
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
				this.generarExcelReporteColorProductos(sAccionBusqueda,sTipoArchivoReporte,colorproductosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalColorProductos(sAccionBusqueda,sTipoArchivoReporte,colorproductosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoColorProductoActionPerformed(null);
					//this.generarExcelReporteColorProductos(sAccionBusqueda,sTipoArchivoReporte,colorproductosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalColorProductos(sAccionBusqueda,sTipoArchivoReporte,colorproductosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesColorProductos(sAccionBusqueda,sTipoArchivoReporte,colorproductosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesColorProductos(sAccionBusqueda,sTipoArchivoReporte,colorproductosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteColorProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<ColorProducto> colorproductosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"colorproducto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ColorProductos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderColorProducto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ColorProducto colorproducto : colorproductosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ColorProductoConstantesFunciones.generarExcelReporteDataColorProducto("NORMAL",row,workbook,colorproducto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.colorproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Color Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderColorProducto(String sTipo,Row row,Workbook workbook) {
		
		ColorProductoConstantesFunciones.generarExcelReporteHeaderColorProducto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalColorProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<ColorProducto> colorproductosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"colorproducto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ColorProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ColorProducto colorproducto : colorproductosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ColorProductoConstantesFunciones.getColorProductoDescripcion(colorproducto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ColorProductoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ColorProductoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(colorproducto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ColorProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ColorProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(colorproducto.gettipoproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ColorProductoConstantesFunciones.LABEL_IDGRUPOCOLOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ColorProductoConstantesFunciones.LABEL_IDGRUPOCOLOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(colorproducto.getgrupocolor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ColorProductoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ColorProductoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(colorproducto.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ColorProductoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ColorProductoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(colorproducto.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.colorproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Color Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesColorProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<ColorProducto> colorproductosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ColorProducto> colorproductosRespaldo=null;
		
		classes=ColorProductoConstantesFunciones.getClassesRelationshipsOfColorProducto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.colorproductoLogic.setDatosCliente(this.datosCliente);
		this.colorproductoLogic.setDatosDeep(this.datosDeep);
		this.colorproductoLogic.setIsConDeep(true);
		
		colorproductosRespaldo=this.colorproductoLogic.getColorProductos();
		
		this.colorproductoLogic.setColorProductos(colorproductosParaReportes);	
		this.colorproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		colorproductosParaReportes=this.colorproductoLogic.getColorProductos();
		this.colorproductoLogic.setColorProductos(colorproductosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"colorproducto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ColorProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderColorProducto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ColorProducto colorproducto : colorproductosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderColorProducto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ColorProductoConstantesFunciones.generarExcelReporteDataColorProducto("NORMAL",row,workbook,colorproducto,cellStyleDataAux);
		
			
			


				//ParametroInventarioDefecto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO))) {

				if(colorproducto.getParametroInventarioDefectos()!=null && colorproducto.getParametroInventarioDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroInventarioDefectoConstantesFunciones.generarExcelReporteHeaderParametroInventarioDefecto("RELACIONADO",row,workbook);
				}

				if(colorproducto.getParametroInventarioDefectos()!=null) {
					i2=0;
					for(ParametroInventarioDefecto parametroinventariodefecto : colorproducto.getParametroInventarioDefectos()) {
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
		cell.setCellValue(ColorProductoConstantesFunciones.getColorProductoDescripcion(colorproducto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.colorproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Color Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoColorProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoColorProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoColorProducto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoColorProducto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessColorProducto() throws Exception {		
		this.startProcessColorProducto(true);
	}
	
	public void startProcessColorProducto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasColorProducto ,this.jPanelParametrosReportesColorProducto, this.jScrollPanelDatosColorProducto,this.jPanelPaginacionColorProducto, this.jScrollPanelDatosEdicionColorProducto, this.jPanelAccionesColorProducto,this.jPanelAccionesFormularioColorProducto,this.jmenuBarColorProducto,this.jmenuBarDetalleColorProducto,this.jTtoolBarColorProducto,this.jTtoolBarDetalleColorProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasColorProducto=this.jTabbedPaneBusquedasColorProducto; 
		
		final JPanel jPanelParametrosReportesColorProducto=this.jPanelParametrosReportesColorProducto;
		//final JScrollPane jScrollPanelDatosColorProducto=this.jScrollPanelDatosColorProducto;
		final JTable jTableDatosColorProducto=this.jTableDatosColorProducto;		
		final JPanel jPanelPaginacionColorProducto=this.jPanelPaginacionColorProducto;
		//final JScrollPane jScrollPanelDatosEdicionColorProducto=this.jScrollPanelDatosEdicionColorProducto;
		final JPanel jPanelAccionesColorProducto=this.jPanelAccionesColorProducto;
		
		JPanel jPanelCamposAuxiliarColorProducto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarColorProducto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormColorProducto!=null) {
			jPanelCamposAuxiliarColorProducto=this.jInternalFrameDetalleFormColorProducto.jPanelCamposColorProducto;
			jPanelAccionesFormularioAuxiliarColorProducto=this.jInternalFrameDetalleFormColorProducto.jPanelAccionesFormularioColorProducto;
		}
		
		final JPanel jPanelCamposColorProducto=jPanelCamposAuxiliarColorProducto;
		final JPanel jPanelAccionesFormularioColorProducto=jPanelAccionesFormularioAuxiliarColorProducto;
		
		
		final JMenuBar jmenuBarColorProducto=this.jmenuBarColorProducto;
		final JToolBar jTtoolBarColorProducto=this.jTtoolBarColorProducto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarColorProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarColorProducto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormColorProducto!=null) {
			jmenuBarDetalleAuxiliarColorProducto=this.jInternalFrameDetalleFormColorProducto.jmenuBarDetalleColorProducto;
			jTtoolBarDetalleAuxiliarColorProducto=this.jInternalFrameDetalleFormColorProducto.jTtoolBarDetalleColorProducto;
		}
		
		final JMenuBar jmenuBarDetalleColorProducto=jmenuBarDetalleAuxiliarColorProducto;
		final JToolBar jTtoolBarDetalleColorProducto=jTtoolBarDetalleAuxiliarColorProducto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasColorProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesColorProducto;
			processRunnable.jTableDatos=jTableDatosColorProducto;
			processRunnable.jPanelCampos=jPanelCamposColorProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionColorProducto;
			processRunnable.jPanelAcciones=jPanelAccionesColorProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioColorProducto;
			
			
			processRunnable.jmenuBar=jmenuBarColorProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleColorProducto;
			processRunnable.jTtoolBar=jTtoolBarColorProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleColorProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasColorProducto ,jPanelParametrosReportesColorProducto,jTableDatosColorProducto, /*jScrollPanelDatosColorProducto,*/jPanelCamposColorProducto,jPanelPaginacionColorProducto, /*jScrollPanelDatosEdicionColorProducto,*/ jPanelAccionesColorProducto,jPanelAccionesFormularioColorProducto,jmenuBarColorProducto,jmenuBarDetalleColorProducto,jTtoolBarColorProducto,jTtoolBarDetalleColorProducto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasColorProducto ,jPanelParametrosReportesColorProducto, jScrollPanelDatosColorProducto,jPanelPaginacionColorProducto, jScrollPanelDatosEdicionColorProducto, jPanelAccionesColorProducto,jPanelAccionesFormularioColorProducto,jmenuBarColorProducto,jmenuBarDetalleColorProducto,jTtoolBarColorProducto,jTtoolBarDetalleColorProducto);
						
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
	
	public void finishProcessColorProducto() {// throws Exception 
		this.finishProcessColorProducto(true);
	}
	
	public void finishProcessColorProducto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasColorProducto ,this.jPanelParametrosReportesColorProducto, this.jScrollPanelDatosColorProducto,this.jPanelPaginacionColorProducto, this.jScrollPanelDatosEdicionColorProducto, this.jPanelAccionesColorProducto,this.jPanelAccionesFormularioColorProducto,this.jmenuBarColorProducto,this.jmenuBarDetalleColorProducto,this.jTtoolBarColorProducto,this.jTtoolBarDetalleColorProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasColorProducto=this.jTabbedPaneBusquedasColorProducto; 
		
		final JPanel jPanelParametrosReportesColorProducto=this.jPanelParametrosReportesColorProducto;
		//final JScrollPane jScrollPanelDatosColorProducto=this.jScrollPanelDatosColorProducto;
		final JTable jTableDatosColorProducto=this.jTableDatosColorProducto;		
		final JPanel jPanelPaginacionColorProducto=this.jPanelPaginacionColorProducto;
		//final JScrollPane jScrollPanelDatosEdicionColorProducto=this.jScrollPanelDatosEdicionColorProducto;
		final JPanel jPanelAccionesColorProducto=this.jPanelAccionesColorProducto;
		
		JPanel jPanelCamposAuxiliarColorProducto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarColorProducto=new JPanel();
		
		if(this.jInternalFrameDetalleFormColorProducto!=null) {
			jPanelCamposAuxiliarColorProducto=this.jInternalFrameDetalleFormColorProducto.jPanelCamposColorProducto;
			jPanelAccionesFormularioAuxiliarColorProducto=this.jInternalFrameDetalleFormColorProducto.jPanelAccionesFormularioColorProducto;
		}
		
		final JPanel jPanelCamposColorProducto=jPanelCamposAuxiliarColorProducto;
		final JPanel jPanelAccionesFormularioColorProducto=jPanelAccionesFormularioAuxiliarColorProducto;
		
		
		final JMenuBar jmenuBarColorProducto=this.jmenuBarColorProducto;		
		final JToolBar jTtoolBarColorProducto=this.jTtoolBarColorProducto;
				
		JMenuBar jmenuBarDetalleAuxiliarColorProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarColorProducto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormColorProducto!=null) {
			jmenuBarDetalleAuxiliarColorProducto=this.jInternalFrameDetalleFormColorProducto.jmenuBarDetalleColorProducto;
			jTtoolBarDetalleAuxiliarColorProducto=this.jInternalFrameDetalleFormColorProducto.jTtoolBarDetalleColorProducto;		
		}
		
		final JMenuBar jmenuBarDetalleColorProducto=jmenuBarDetalleAuxiliarColorProducto;
		final JToolBar jTtoolBarDetalleColorProducto=jTtoolBarDetalleAuxiliarColorProducto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasColorProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesColorProducto;
			processRunnable.jTableDatos=jTableDatosColorProducto;
			processRunnable.jPanelCampos=jPanelCamposColorProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionColorProducto;
			processRunnable.jPanelAcciones=jPanelAccionesColorProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioColorProducto;
			
			
			processRunnable.jmenuBar=jmenuBarColorProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleColorProducto;
			processRunnable.jTtoolBar=jTtoolBarColorProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleColorProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasColorProducto ,jPanelParametrosReportesColorProducto, jTableDatosColorProducto,/*jScrollPanelDatosColorProducto,*/jPanelCamposColorProducto,jPanelPaginacionColorProducto, /*jScrollPanelDatosEdicionColorProducto,*/ jPanelAccionesColorProducto,jPanelAccionesFormularioColorProducto,jmenuBarColorProducto,jmenuBarDetalleColorProducto,jTtoolBarColorProducto,jTtoolBarDetalleColorProducto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesColorProducto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarColorProducto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuColorProducto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarColorProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarColorProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleColorProducto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuColorProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarColorProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleColorProducto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.colorproductoConstantesFunciones.getsFinalQueryColorProducto();
		String  finalQueryPaginacionTodos=this.colorproductoConstantesFunciones.getsFinalQueryColorProducto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ColorProductoConstantesFunciones.getArrayColumnasGlobalesNoColorProducto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ColorProductoConstantesFunciones.getArrayColumnasGlobalesColorProducto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ColorProductoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.colorproductosEliminados= new ArrayList<ColorProducto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessColorProducto();
		
				///*ColorProductoSessionBean*/this.colorproductoSessionBean=new ColorProductoSessionBean();
			
			if(this.colorproductoSessionBean==null) {
				this.colorproductoSessionBean=new ColorProductoSessionBean();
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
					this.iNumeroPaginacion=ColorProductoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ColorProductoConstantesFunciones.getClassesForeignKeysOfColorProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/colorproducto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			colorproductosAux= new ArrayList<ColorProducto>();
			
				
			colorproductoLogic.setDatosCliente(this.datosCliente);
			colorproductoLogic.setDatosDeep(this.datosDeep);
			colorproductoLogic.setIsConDeep(true);
			
			
			colorproductoLogic.getColorProductoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					colorproductoLogic.getTodosColorProductos(finalQueryGlobal,pagination);
					
					//colorproductoLogic.getTodosColorProductosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(colorproductoLogic.getColorProductos()==null|| colorproductoLogic.getColorProductos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							colorproductosAux= new ArrayList<ColorProducto>();
							colorproductosAux.addAll(colorproductoLogic.getColorProductos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							colorproductosAux= new ArrayList<ColorProducto>();
							colorproductosAux.addAll(colorproductos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							colorproductoLogic.getTodosColorProductos(finalQueryGlobal+"",this.pagination);												
							
							//colorproductoLogic.getTodosColorProductosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteColorProductos("Todos",colorproductoLogic.getColorProductos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							colorproductoLogic.setColorProductos(new ArrayList<ColorProducto>());					
							colorproductoLogic.getColorProductos().addAll(colorproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							colorproductos=new ArrayList<ColorProducto>();
							colorproductos.addAll(colorproductosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idColorProducto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idColorProducto=this.idActual;
				
				} else if(this.idColorProductoActual!=null && this.idColorProductoActual!=0L) {
					idColorProducto=idColorProductoActual;
				}
				
					
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndicePorId(idColorProducto);
				
				this.colorproductos=new ArrayList<ColorProducto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					colorproductoLogic.getEntity(idColorProducto);
					
					//colorproductoLogic.getEntityWithConnection(idColorProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					colorproductoLogic.setColorProductos(new ArrayList<ColorProducto>());
					colorproductoLogic.getColorProductos().add(colorproductoLogic.getColorProducto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.colorproductos=new ArrayList<ColorProducto>();
					this.colorproductos.add(colorproducto);
				}
				
				if(colorproductoLogic.getColorProducto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					colorproductoLogic.getColorProductosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=colorproductoLogic.getColorProductos()==null||colorproductoLogic.getColorProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=colorproductos==null|| colorproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						colorproductosAux=new ArrayList<ColorProducto>();
						colorproductosAux.addAll(colorproductoLogic.getColorProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							colorproductosAux=new ArrayList<ColorProducto>();
							colorproductosAux.addAll(colorproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							colorproductoLogic.getColorProductosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteColorProductos("BusquedaPorCodigo",colorproductoLogic.getColorProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteColorProductos("BusquedaPorCodigo",colorproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						colorproductoLogic.setColorProductos(new ArrayList<ColorProducto>());
						colorproductoLogic.getColorProductos().addAll(colorproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							colorproductos=new ArrayList<ColorProducto>();
							colorproductos.addAll(colorproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					colorproductoLogic.getColorProductosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=colorproductoLogic.getColorProductos()==null||colorproductoLogic.getColorProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=colorproductos==null|| colorproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						colorproductosAux=new ArrayList<ColorProducto>();
						colorproductosAux.addAll(colorproductoLogic.getColorProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							colorproductosAux=new ArrayList<ColorProducto>();
							colorproductosAux.addAll(colorproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							colorproductoLogic.getColorProductosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteColorProductos("BusquedaPorNombre",colorproductoLogic.getColorProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteColorProductos("BusquedaPorNombre",colorproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						colorproductoLogic.setColorProductos(new ArrayList<ColorProducto>());
						colorproductoLogic.getColorProductos().addAll(colorproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							colorproductos=new ArrayList<ColorProducto>();
							colorproductos.addAll(colorproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					colorproductoLogic.getColorProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=colorproductoLogic.getColorProductos()==null||colorproductoLogic.getColorProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=colorproductos==null|| colorproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						colorproductosAux=new ArrayList<ColorProducto>();
						colorproductosAux.addAll(colorproductoLogic.getColorProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							colorproductosAux=new ArrayList<ColorProducto>();
							colorproductosAux.addAll(colorproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							colorproductoLogic.getColorProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteColorProductos("FK_IdEmpresa",colorproductoLogic.getColorProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteColorProductos("FK_IdEmpresa",colorproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						colorproductoLogic.setColorProductos(new ArrayList<ColorProducto>());
						colorproductoLogic.getColorProductos().addAll(colorproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							colorproductos=new ArrayList<ColorProducto>();
							colorproductos.addAll(colorproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdGrupoColor")) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceFK_IdGrupoColor(id_grupo_colorFK_IdGrupoColor);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					colorproductoLogic.getColorProductosFK_IdGrupoColor(finalQueryGlobal,pagination,id_grupo_colorFK_IdGrupoColor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceFK_IdGrupoColor(id_grupo_colorFK_IdGrupoColor);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceFK_IdGrupoColor(id_grupo_colorFK_IdGrupoColor);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=colorproductoLogic.getColorProductos()==null||colorproductoLogic.getColorProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=colorproductos==null|| colorproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						colorproductosAux=new ArrayList<ColorProducto>();
						colorproductosAux.addAll(colorproductoLogic.getColorProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							colorproductosAux=new ArrayList<ColorProducto>();
							colorproductosAux.addAll(colorproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							colorproductoLogic.getColorProductosFK_IdGrupoColor(finalQueryGlobal,pagination,id_grupo_colorFK_IdGrupoColor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceFK_IdGrupoColor(id_grupo_colorFK_IdGrupoColor);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceFK_IdGrupoColor(id_grupo_colorFK_IdGrupoColor);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteColorProductos("FK_IdGrupoColor",colorproductoLogic.getColorProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteColorProductos("FK_IdGrupoColor",colorproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						colorproductoLogic.setColorProductos(new ArrayList<ColorProducto>());
						colorproductoLogic.getColorProductos().addAll(colorproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							colorproductos=new ArrayList<ColorProducto>();
							colorproductos.addAll(colorproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoProducto")) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					colorproductoLogic.getColorProductosFK_IdTipoProducto(finalQueryGlobal,pagination,id_tipo_productoFK_IdTipoProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=colorproductoLogic.getColorProductos()==null||colorproductoLogic.getColorProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=colorproductos==null|| colorproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						colorproductosAux=new ArrayList<ColorProducto>();
						colorproductosAux.addAll(colorproductoLogic.getColorProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							colorproductosAux=new ArrayList<ColorProducto>();
							colorproductosAux.addAll(colorproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							colorproductoLogic.getColorProductosFK_IdTipoProducto(finalQueryGlobal,pagination,id_tipo_productoFK_IdTipoProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ColorProductoConstantesFunciones.getDetalleIndiceFK_IdTipoProducto(id_tipo_productoFK_IdTipoProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteColorProductos("FK_IdTipoProducto",colorproductoLogic.getColorProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteColorProductos("FK_IdTipoProducto",colorproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						colorproductoLogic.setColorProductos(new ArrayList<ColorProducto>());
						colorproductoLogic.getColorProductos().addAll(colorproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							colorproductos=new ArrayList<ColorProducto>();
							colorproductos.addAll(colorproductosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesColorProducto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessColorProducto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=colorproductoLogic.getColorProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=colorproductos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=colorproductoLogic.getColorProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=colorproductos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ColorProducto colorproducto) {
		Boolean permite=true;
		
		if(this.colorproducto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ColorProductoConstantesFunciones.getOrderByListaColorProducto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ColorProductoConstantesFunciones.getOrderByListaColorProducto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ColorProducto colorproducto:colorproductoLogic.getColorProductos()) {
				if(colorproducto.getsType().equals(Constantes2.S_TOTALES)) {
					colorproductoTotales=colorproducto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ColorProducto colorproducto:this.colorproductos) {
				if(colorproducto.getsType().equals(Constantes2.S_TOTALES)) {
					colorproductoTotales=colorproducto;
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
			this.colorproductoAux=new ColorProducto();
			this.colorproductoAux.setsType(Constantes2.S_TOTALES);
			this.colorproductoAux.setIsNew(false);
			this.colorproductoAux.setIsChanged(false);
			this.colorproductoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ColorProductoConstantesFunciones.TotalizarValoresFilaColorProducto(this.colorproductoLogic.getColorProductos(),this.colorproductoAux);
				
				this.colorproductoLogic.getColorProductos().add(this.colorproductoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ColorProductoConstantesFunciones.TotalizarValoresFilaColorProducto(this.colorproductos,this.colorproductoAux);
				
				this.colorproductos.add(this.colorproductoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		colorproductoTotales=new ColorProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.colorproductoLogic.getColorProductos().remove(colorproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.colorproductos.remove(colorproductoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		colorproductoTotales=new ColorProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ColorProducto colorproducto:colorproductoLogic.getColorProductos()) {
				if(colorproducto.getsType().equals(Constantes2.S_TOTALES)) {
					colorproductoTotales=colorproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ColorProductoConstantesFunciones.TotalizarValoresFilaColorProducto(this.colorproductoLogic.getColorProductos(),colorproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ColorProducto colorproducto:this.colorproductos) {
				if(colorproducto.getsType().equals(Constantes2.S_TOTALES)) {
					colorproductoTotales=colorproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ColorProductoConstantesFunciones.TotalizarValoresFilaColorProducto(this.colorproductos,colorproductoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getColorProductosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getColorProductosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getColorProductosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getColorProductosFK_IdGrupoColor()throws Exception {
		try {
			sAccionBusqueda="FK_IdGrupoColor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getColorProductosFK_IdTipoProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getColorProductosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					colorproductoLogic.getColorProductosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getColorProductosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					colorproductoLogic.getColorProductosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getColorProductosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					colorproductoLogic.getColorProductosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getColorProductosFK_IdGrupoColor(String sFinalQuery,Long id_grupo_color)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					colorproductoLogic.getColorProductosFK_IdGrupoColor(sFinalQuery,this.pagination,id_grupo_color);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getColorProductosFK_IdTipoProducto(String sFinalQuery,Long id_tipo_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					colorproductoLogic.getColorProductosFK_IdTipoProducto(sFinalQuery,this.pagination,id_tipo_producto);
				
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
	
	public void inicializarPermisosColorProducto() {
		this.isPermisoTodoColorProducto=false;
		this.isPermisoNuevoColorProducto=false;
		this.isPermisoActualizarColorProducto=false;
		this.isPermisoActualizarOriginalColorProducto=false;
		this.isPermisoEliminarColorProducto=false;
		this.isPermisoGuardarCambiosColorProducto=false;
		this.isPermisoConsultaColorProducto=false;
		this.isPermisoBusquedaColorProducto=false;
		this.isPermisoReporteColorProducto=false;		
		this.isPermisoOrdenColorProducto=false;		
		this.isPermisoPaginacionMedioColorProducto=false;		
		this.isPermisoPaginacionAltoColorProducto=false;
		this.isPermisoPaginacionTodoColorProducto=false;
		this.isPermisoCopiarColorProducto=false;		
		this.isPermisoVerFormColorProducto=false;		
		this.isPermisoDuplicarColorProducto=false;		
		this.isPermisoOrdenColorProducto=false;		
	}
	
	public void setPermisosUsuarioColorProducto(Boolean isPermiso) {
		this.isPermisoTodoColorProducto=isPermiso;
		this.isPermisoNuevoColorProducto=isPermiso;
		this.isPermisoActualizarColorProducto=isPermiso;
		this.isPermisoActualizarOriginalColorProducto=isPermiso;
		this.isPermisoEliminarColorProducto=isPermiso;
		this.isPermisoGuardarCambiosColorProducto=isPermiso;
		this.isPermisoConsultaColorProducto=isPermiso;
		this.isPermisoBusquedaColorProducto=isPermiso;
		this.isPermisoReporteColorProducto=isPermiso;
		this.isPermisoOrdenColorProducto=isPermiso;		
		this.isPermisoPaginacionMedioColorProducto=isPermiso;		
		this.isPermisoPaginacionAltoColorProducto=isPermiso;		
		this.isPermisoPaginacionTodoColorProducto=isPermiso;		
		this.isPermisoCopiarColorProducto=isPermiso;		
		this.isPermisoVerFormColorProducto=isPermiso;		
		this.isPermisoDuplicarColorProducto=isPermiso;
		this.isPermisoOrdenColorProducto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioColorProducto(Boolean isPermiso) {
		//this.isPermisoTodoColorProducto=isPermiso;
		this.isPermisoNuevoColorProducto=isPermiso;
		this.isPermisoActualizarColorProducto=isPermiso;
		this.isPermisoActualizarOriginalColorProducto=isPermiso;
		this.isPermisoEliminarColorProducto=isPermiso;
		this.isPermisoGuardarCambiosColorProducto=isPermiso;
		//this.isPermisoConsultaColorProducto=isPermiso;
		//this.isPermisoBusquedaColorProducto=isPermiso;
		//this.isPermisoReporteColorProducto=isPermiso;
		//this.isPermisoOrdenColorProducto=isPermiso;		
		//this.isPermisoPaginacionMedioColorProducto=isPermiso;		
		//this.isPermisoPaginacionAltoColorProducto=isPermiso;		
		//this.isPermisoPaginacionTodoColorProducto=isPermiso;		
		//this.isPermisoCopiarColorProducto=isPermiso;		
		//this.isPermisoDuplicarColorProducto=isPermiso;
		//this.isPermisoOrdenColorProducto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioColorProductoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
		if(ColorProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosParametroInventarioDefecto=false;
		this.isTienePermisosParametroInventarioDefecto=this.verificarGetPermisosUsuarioOpcionColorProductoClaseRelacionada(this.opcionsRelacionadas,ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebColorProducto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioColorProductoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosParametroInventarioDefecto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioColorProductoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionColorProductoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioColorProductoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosParametroInventarioDefecto && this.jInternalFrameDetalleFormColorProducto!=null && this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormColorProducto.jTabbedPaneRelacionesColorProducto.remove(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioColorProducto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ColorProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.colorproductoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ColorProductoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoColorProducto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarColorProducto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalColorProducto=this.isPermisoActualizarColorProducto;
			this.isPermisoEliminarColorProducto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosColorProducto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaColorProducto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaColorProducto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoColorProducto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteColorProducto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenColorProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioColorProducto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoColorProducto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoColorProducto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarColorProducto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormColorProducto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarColorProducto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenColorProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.colorproductoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosColorProducto.setToolTipText(this.jTableDatosColorProducto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioColorProducto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioColorProducto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ColorProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ColorProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioColorProducto() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosParametroInventarioDefecto && this.colorproductoConstantesFunciones.mostrarParametroInventarioDefectoColorProducto && !ColorProductoConstantesFunciones.ISGUARDARREL) {

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
	public void inicializarCombosForeignKeyColorProductoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tipoproductosForeignKey=new ArrayList();
				this.grupocolorsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyColorProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ColorProductoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyColorProductoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyGrupoColorListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyGrupoColorListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.grupocolorsForeignKey==null||this.grupocolorsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=GrupoColorConstantesFunciones.getArrayColumnasGlobalesGrupoColor(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,GrupoColorConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=GrupoColorConstantesFunciones.SFINALQUERY;

				this.cargarCombosGrupoColorsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyColorProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ColorProductoParameterReturnGeneral colorproductoReturnGeneral=new ColorProductoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.colorproductoConstantesFunciones.cargarid_empresaColorProducto)
					 || (this.esRecargarFks && this.colorproductoConstantesFunciones.cargarid_empresaColorProducto)) {

					if(!this.colorproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+colorproductoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTipoProducto="";

				if(((this.tipoproductosForeignKey==null||this.tipoproductosForeignKey.size()<=0) && this.colorproductoConstantesFunciones.cargarid_tipo_productoColorProducto)
					 || (this.esRecargarFks && this.colorproductoConstantesFunciones.cargarid_tipo_productoColorProducto)) {

					if(!this.colorproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoProductoConstantesFunciones.getArrayColumnasGlobalesTipoProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoProducto, "");
						finalQueryGlobalTipoProducto+=TipoProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoProducto=" WHERE " + ConstantesSql.ID + "="+colorproductoSessionBean.getlidTipoProductoActual();
					}
				} else {
					finalQueryGlobalTipoProducto="NONE";
				}


				String finalQueryGlobalGrupoColor="";

				if(((this.grupocolorsForeignKey==null||this.grupocolorsForeignKey.size()<=0) && this.colorproductoConstantesFunciones.cargarid_grupo_colorColorProducto)
					 || (this.esRecargarFks && this.colorproductoConstantesFunciones.cargarid_grupo_colorColorProducto)) {

					if(!this.colorproductoSessionBean.getisBusquedaDesdeForeignKeySesionGrupoColor()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=GrupoColorConstantesFunciones.getArrayColumnasGlobalesGrupoColor(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalGrupoColor=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,GrupoColorConstantesFunciones.TABLENAME);

						finalQueryGlobalGrupoColor=Funciones.GetFinalQueryAppend(finalQueryGlobalGrupoColor, "");
						finalQueryGlobalGrupoColor+=GrupoColorConstantesFunciones.SFINALQUERY;

						//this.cargarCombosGrupoColorsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalGrupoColor=" WHERE " + ConstantesSql.ID + "="+colorproductoSessionBean.getlidGrupoColorActual();
					}
				} else {
					finalQueryGlobalGrupoColor="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				colorproductoReturnGeneral=colorproductoLogic.cargarCombosLoteForeignKeyColorProducto(finalQueryGlobalEmpresa,finalQueryGlobalTipoProducto,finalQueryGlobalGrupoColor);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=colorproductoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTipoProducto.equals("NONE")) {
				this.tipoproductosForeignKey=colorproductoReturnGeneral.gettipoproductosForeignKey();
			}

			if(!finalQueryGlobalGrupoColor.equals("NONE")) {
				this.grupocolorsForeignKey=colorproductoReturnGeneral.getgrupocolorsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyColorProducto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoProducto();
			this.addItemDefectoCombosForeignKeyGrupoColor();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.colorproductoSessionBean==null) {
				this.colorproductoSessionBean=new ColorProductoSessionBean();
			}

			if(!this.colorproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.colorproductoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProducto()) {
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

	public void addItemDefectoCombosForeignKeyGrupoColor()throws Exception {
		try {

			if(!this.colorproductoSessionBean.getisBusquedaDesdeForeignKeySesionGrupoColor()) {
				GrupoColor grupocolor=new GrupoColor();
				GrupoColorConstantesFunciones.setGrupoColorDescripcion(grupocolor,Constantes.SMENSAJE_ESCOJA_OPCION);
				grupocolor.setId(null);

				if(!GrupoColorConstantesFunciones.ExisteEnLista(this.grupocolorsForeignKey,grupocolor,true)) {

					this.grupocolorsForeignKey.add(0,grupocolor);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyColorProducto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyColorProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyColorProducto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyColorProducto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyColorProducto(ColorProducto colorproducto)throws Exception {	
		try {
			
			this.setActualTipoProductoForeignKey(colorproducto.getid_tipo_producto(),false,"Formulario");
			this.setActualGrupoColorForeignKey(colorproducto.getid_grupo_color(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyColorProducto(ColorProducto colorproducto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyColorProducto()throws Exception {	
		try {
			
			this.setActualTipoProductoForeignKey(this.colorproductoConstantesFunciones.getid_tipo_producto(),false,"Formulario");
			this.setActualGrupoColorForeignKey(this.colorproductoConstantesFunciones.getid_grupo_color(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyColorProducto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyColorProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyColorProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroColorProducto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyColorProducto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoProductosForeignKey("Todos");
			this.cargarCombosFrameGrupoColorsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyColorProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameGrupoColorsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyColorProducto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormColorProducto.jComboBoxid_empresaColorProducto!=null && this.jInternalFrameDetalleFormColorProducto.jComboBoxid_empresaColorProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormColorProducto.jComboBoxid_empresaColorProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormColorProducto.jComboBoxid_tipo_productoColorProducto!=null && this.jInternalFrameDetalleFormColorProducto.jComboBoxid_tipo_productoColorProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormColorProducto.jComboBoxid_tipo_productoColorProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormColorProducto.jComboBoxid_grupo_colorColorProducto!=null && this.jInternalFrameDetalleFormColorProducto.jComboBoxid_grupo_colorColorProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormColorProducto.jComboBoxid_grupo_colorColorProducto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ColorProductoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ColorProductoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ColorProductoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.colorproductoSessionBean=new ColorProductoSessionBean(); 
		this.colorproductoConstantesFunciones=new ColorProductoConstantesFunciones(); 
		this.colorproductoBean=new ColorProducto();//(this.colorproductoConstantesFunciones); 		
		this.colorproductoReturnGeneral=new ColorProductoParameterReturnGeneral(); 
		
		this.colorproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.colorproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ColorProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ColorProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ColorProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessColorProducto(true);
			
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
			
			this.colorproductoConstantesFunciones=new ColorProductoConstantesFunciones(); 
			this.colorproductoBean=new ColorProducto();//this.colorproductoConstantesFunciones); 			
			this.colorproductoReturnGeneral=new ColorProductoParameterReturnGeneral(); 
		
			ColorProductoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Color Producto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.colorproducto=new ColorProducto();
			this.colorproductos = new ArrayList<ColorProducto>();
			this.colorproductosAux = new ArrayList<ColorProducto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic=new ColorProductoLogic();
				this.colorproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.colorproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.colorproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormColorProducto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoColorProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoColorProducto);	
					}
					
					if(this.jInternalFrameImportacionColorProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionColorProducto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByColorProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByColorProducto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormColorProducto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormColorProducto);
				this.jInternalFrameDetalleFormColorProducto.setVisible(false);
				this.jInternalFrameDetalleFormColorProducto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoColorProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoColorProducto);
					this.jInternalFrameReporteDinamicoColorProducto.setVisible(false);
					this.jInternalFrameReporteDinamicoColorProducto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionColorProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionColorProducto);
					this.jInternalFrameImportacionColorProducto.setVisible(false);
					this.jInternalFrameImportacionColorProducto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByColorProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByColorProducto);
					this.jInternalFrameOrderByColorProducto.setVisible(false);
					this.jInternalFrameOrderByColorProducto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idColorProductoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ColorProductoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.colorproductoReturnGeneral=new ColorProductoParameterReturnGeneral();
			
			this.colorproductoParameterGeneral=new ColorProductoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.colorproductoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.colorproductoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ColorProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.colorproductoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ColorProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.colorproductoSessionBean.getEsGuardarRelacionado(),this.colorproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ColorProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.colorproductoSessionBean.getEsGuardarRelacionado(),this.colorproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoColorProducto=false;
			this.isVisibilidadCeldaDuplicarColorProducto=true;
			this.isVisibilidadCeldaCopiarColorProducto=true;
			this.isVisibilidadCeldaVerFormColorProducto=true;
			this.isVisibilidadCeldaOrdenColorProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesColorProducto=false;
			this.isVisibilidadCeldaModificarColorProducto=false;
			this.isVisibilidadCeldaActualizarColorProducto=false;
			this.isVisibilidadCeldaEliminarColorProducto=false;
			this.isVisibilidadCeldaCancelarColorProducto=false;
			this.isVisibilidadCeldaGuardarColorProducto=false;
			this.isVisibilidadCeldaGuardarCambiosColorProducto=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdGrupoColor=true;
			this.isVisibilidadFK_IdTipoProducto=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesColorProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosColorProducto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioColorProducto(false);
			
			this.setPermisosUsuarioColorProducto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.colorproductoSessionBean.getEsGuardarRelacionado() 
				|| (this.colorproductoSessionBean.getEsGuardarRelacionado() && this.colorproductoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioColorProductoClasesRelacionadas();
			}
			
			if(this.colorproductoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioColorProductoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ColorProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosColorProducto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualColorProducto();
			}
			
			if(!this.isPermisoBusquedaColorProducto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasColorProducto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.colorproductoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioColorProducto,this.isPermisoPaginacionMedioColorProducto,this.isPermisoPaginacionTodoColorProducto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ColorProductoConstantesFunciones.getTiposSeleccionarColorProducto());
				
				this.tiposColumnasSelect=ColorProductoConstantesFunciones.getTiposSeleccionarColorProducto(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectColorProducto();				
				//this.tiposRelacionesSelect=ColorProductoConstantesFunciones.getTiposRelacionesColorProducto(true);
				
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
			//if(!this.colorproductoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioColorProducto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioColorProducto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioColorProducto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesColorProducto() ;
			
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
			
			
			this.parametroinventariodefectoLogic=new ParametroInventarioDefectoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.tipoproductoLogic=new TipoProductoLogic();
			this.grupocolorLogic=new GrupoColorLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				colorproductoImplementable= (ColorProductoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ColorProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				colorproductoImplementableHome= (ColorProductoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ColorProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.colorproductos= new ArrayList<ColorProducto>();
			this.colorproductosEliminados= new ArrayList<ColorProducto>();
						
			this.isEsNuevoColorProducto=false;
			this.esParaAccionDesdeFormularioColorProducto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tipoproductosForeignKey=new ArrayList<TipoProducto>() ;
			this.grupocolorsForeignKey=new ArrayList<GrupoColor>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyColorProducto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroColorProducto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.colorproductoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ColorProductoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ColorProductoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesColorProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingColorProducto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormColorProducto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioColorProducto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioColorProducto();
			}
			
			ColorProductoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasColorProducto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasColorProducto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasColorProducto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessColorProducto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ColorProducto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectColorProducto() {
		Reporte reporte=new Reporte();
		
	

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
			if(sTipo.equals("RelacionesColorProducto")) {
				iIndex=this.jInternalFrameDetalleFormColorProducto.jTabbedPaneRelacionesColorProducto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormColorProducto.jTabbedPaneRelacionesColorProducto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();	
				
				

				if(sTitle.equals("Parametro Inventario Defectos")) {
					if(!ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessColorProducto();

						this.cargarParteTabPanelRelacionadaParametroInventarioDefecto(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessColorProducto();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaParametroInventarioDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormColorProducto.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(false,true,iIndex);
		this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();

		//this.jTabbedPaneRelacionesColorProducto.updateUI();
		//this.jTabbedPaneRelacionesColorProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesColorProducto.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ParametroInventarioDefecto")) {
				int row=this.jTableDatosColorProducto.getSelectedRow();
				jButtonParametroInventarioDefectoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.colorproductoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Parametro Inventario Defecto")) {

					if(this.isTienePermisosParametroInventarioDefecto && this.colorproductoConstantesFunciones.mostrarParametroInventarioDefectoColorProducto && !ColorProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Inventario Defectos"+"("+ParametroInventarioDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Inventario Defectos");

						if(colorproductoConstantesFunciones.resaltarParametroInventarioDefectoColorProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(colorproductoConstantesFunciones.resaltarParametroInventarioDefectoColorProducto);
						}

						jmenuItem.setEnabled(this.colorproductoConstantesFunciones.activarParametroInventarioDefectoColorProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroInventarioDefecto"));

						

						this.jInternalFrameDetalleFormColorProducto.jmenuDetalleColorProducto.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyColorProducto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyColorProducto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyColorProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyColorProductoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyColorProducto();
		
		this.cargarCombosFrameForeignKeyColorProducto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyColorProducto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyColorProducto();
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

	public void cargarCombosForeignKeyGrupoColor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyGrupoColorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyGrupoColor();
				this.cargarCombosFrameGrupoColorsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaGrupoColor(this.grupocolorsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoColorProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.colorproductoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormColorProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
			
			
			if(jTableDatosColorProducto.getRowCount()>=1) {
				jTableDatosColorProducto.removeRowSelectionInterval(0, jTableDatosColorProducto.getRowCount()-1);						
			}
			
			this.isEsNuevoColorProducto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoColorProducto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesColorProducto(true);			
			//this.colorproducto=new ColorProducto();
			//this.colorproducto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesColorProducto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualColorProducto() ;
			
			if(ColorProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleColorProducto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.colorproducto);	
			this.actualizarInformacion("INFO_PADRE",false,this.colorproducto);				
			
			ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
			
			if(this.colorproductoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ColorProducto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarColorProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ColorProducto> colorproductosSeleccionados=new ArrayList<ColorProducto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosColorProducto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosColorProducto.getSelectedRows().length;			
			}
			
			colorproductosSeleccionados=this.getColorProductosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoColorProducto--;			
				//ColorProducto colorproductoAux= new ColorProducto();			
				//colorproductoAux.setId(this.iIdNuevoColorProducto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ColorProducto colorproductoOrigen=new ColorProducto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ColorProducto colorproductoOrigen : colorproductosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							colorproductoOrigen =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							colorproductoOrigen =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaColorProducto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.colorproducto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosColorProducto(colorproductoOrigen,this.colorproducto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysColorProducto(this.colorproducto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.colorproductoLogic.getColorProductos().add(this.colorproductoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.colorproductos.add(this.colorproductoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaColorProducto(false);
				
				this.jTableDatosColorProducto.setRowSelectionInterval(this.getIndiceNuevoColorProducto(), this.getIndiceNuevoColorProducto());
				
				int iLastRow =  this.jTableDatosColorProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosColorProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosColorProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaColorProducto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarColorProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ColorProducto> colorproductosSeleccionados=new ArrayList<ColorProducto>();									
		
			ColorProducto colorproductoOrigen=new ColorProducto();
			ColorProducto colorproductoDestino=new ColorProducto();
				
			colorproductosSeleccionados=this.getColorProductosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosColorProducto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || colorproductosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosColorProducto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						colorproductoOrigen =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						colorproductoOrigen =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						colorproductoDestino =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						colorproductoDestino =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				colorproductoOrigen =colorproductosSeleccionados.get(0);
				colorproductoDestino =colorproductosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosColorProducto(colorproductoOrigen,colorproductoDestino,true,false);
				
				colorproductoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(colorproductoDestino,colorproductoLogic.getColorProductos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(colorproductoDestino,colorproductos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaColorProducto(false);
				
				//this.jTableDatosColorProducto.setRowSelectionInterval(this.getIndiceNuevoColorProducto(), this.getIndiceNuevoColorProducto());
				
				int iLastRow =  this.jTableDatosColorProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosColorProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosColorProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaColorProducto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormColorProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormColorProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormColorProducto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarColorProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesColorProducto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasColorProducto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesColorProducto.setVisible(!isVisible);
			this.jPanelPaginacionColorProducto.setVisible(!isVisible);
			this.jPanelAccionesColorProducto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarColorProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameColorProducto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoColorProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoColorProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionColorProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionColorProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByColorProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByColorProducto();
			
			this.abrirFrameOrderByColorProducto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByColorProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByColorProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleColorProducto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormColorProducto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormColorProducto.isMaximum()) {
					this.jInternalFrameDetalleFormColorProducto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormColorProducto.setSize(this.jInternalFrameDetalleFormColorProducto.iWidthFormulario,this.jInternalFrameDetalleFormColorProducto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormColorProducto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormColorProducto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormColorProducto.isMaximum()) {
						this.jInternalFrameDetalleFormColorProducto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormColorProducto.jContentPaneDetalleColorProducto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormColorProducto.jTabbedPaneRelacionesColorProducto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormColorProducto.jContentPaneDetalleColorProducto.getWidth(),ColorProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormColorProducto.jTabbedPaneRelacionesColorProducto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormColorProducto.jContentPaneDetalleColorProducto.getWidth(),ColorProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormColorProducto.jTabbedPaneRelacionesColorProducto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormColorProducto.jContentPaneDetalleColorProducto.getWidth(),ColorProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormColorProducto.setVisible(true);
	        this.jInternalFrameDetalleFormColorProducto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByColorProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByColorProducto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByColorProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByColorProducto,false,this);
				} else {
					this.jInternalFrameOrderByColorProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByColorProducto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByColorProducto);
				this.jInternalFrameOrderByColorProducto.setVisible(false);
				this.jInternalFrameOrderByColorProducto.setSelected(false);
				
				this.jInternalFrameOrderByColorProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByColorProducto"));
				
				this.inicializarActualizarBindingTablaOrderByColorProducto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionColorProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionColorProducto==null) {
				
				this.jInternalFrameImportacionColorProducto=new ImportacionJInternalFrame(ColorProductoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionColorProducto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionColorProducto);
				this.jInternalFrameImportacionColorProducto.setVisible(false);
				this.jInternalFrameImportacionColorProducto.setSelected(false);


				this.jInternalFrameImportacionColorProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionColorProducto"));
				this.jInternalFrameImportacionColorProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionColorProducto"));
				this.jInternalFrameImportacionColorProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionColorProducto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoColorProducto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoColorProducto==null) {
				this.jInternalFrameReporteDinamicoColorProducto=new ReporteDinamicoJInternalFrame(ColorProductoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoColorProducto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoColorProducto);
				this.jInternalFrameReporteDinamicoColorProducto.setVisible(false);
				this.jInternalFrameReporteDinamicoColorProducto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoColorProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoColorProducto"));
				this.jInternalFrameReporteDinamicoColorProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoColorProducto"));
				this.jInternalFrameReporteDinamicoColorProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoColorProducto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualColorProducto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaParametroInventarioDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormColorProducto.jContentPaneDetalleColorProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleColorProducto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormColorProducto);
			
	       	this.jInternalFrameDetalleFormColorProducto.setVisible(false);
	        this.jInternalFrameDetalleFormColorProducto.setSelected(false);
			
			//this.jInternalFrameDetalleFormColorProducto.dispose();
			//this.jInternalFrameDetalleFormColorProducto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoColorProducto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoColorProducto.setVisible(true);
	        this.jInternalFrameReporteDinamicoColorProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionColorProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionColorProducto.setVisible(true);
	        this.jInternalFrameImportacionColorProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByColorProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByColorProducto.setVisible(true);
	        this.jInternalFrameOrderByColorProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByColorProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByColorProducto.setVisible(false);
	        this.jInternalFrameOrderByColorProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoColorProducto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoColorProducto.setVisible(false);
	        this.jInternalFrameReporteDinamicoColorProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionColorProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionColorProducto.setVisible(false);
	        this.jInternalFrameImportacionColorProducto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarColorProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarColorProducto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarColorProducto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesColorProducto(true);
			//this.isEsNuevoColorProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproducto =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.colorproducto =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesColorProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesColorProducto(false) ;
			
			if(colorproductoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(ColorProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleColorProducto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualColorProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaColorProductoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproducto =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.colorproducto =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarColorProducto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormColorProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesColorProducto(true);
			//this.isEsNuevoColorProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproducto =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.colorproducto =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.colorproducto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesColorProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesColorProducto(false) ;
			
			if(ColorProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleColorProducto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualColorProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoProducto(List<TipoProducto> tipoproductosForeignKey)throws Exception{
		TableColumn tableColumnTipoProducto=this.jTableDatosColorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosColorProducto,ColorProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO));
		TableCellEditor tableCellEditorTipoProducto =tableColumnTipoProducto.getCellEditor();

		TipoProductoTableCell tipoproductoTableCellFk=(TipoProductoTableCell)tableCellEditorTipoProducto;

		if(tipoproductoTableCellFk!=null) {
			tipoproductoTableCellFk.settipoproductosForeignKey(tipoproductosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosColorProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoproductoTableCellFk.setRowActual(intSelectedRow);
			//tipoproductoTableCellFk.settipoproductosForeignKeyActual(tipoproductosForeignKey);
		//}


		if(tipoproductoTableCellFk!=null) {
			tipoproductoTableCellFk.RecargarTipoProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaGrupoColor(List<GrupoColor> grupocolorsForeignKey)throws Exception{
		TableColumn tableColumnGrupoColor=this.jTableDatosColorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosColorProducto,ColorProductoConstantesFunciones.LABEL_IDGRUPOCOLOR));
		TableCellEditor tableCellEditorGrupoColor =tableColumnGrupoColor.getCellEditor();

		GrupoColorTableCell grupocolorTableCellFk=(GrupoColorTableCell)tableCellEditorGrupoColor;

		if(grupocolorTableCellFk!=null) {
			grupocolorTableCellFk.setgrupocolorsForeignKey(grupocolorsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosColorProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//grupocolorTableCellFk.setRowActual(intSelectedRow);
			//grupocolorTableCellFk.setgrupocolorsForeignKeyActual(grupocolorsForeignKey);
		//}


		if(grupocolorTableCellFk!=null) {
			grupocolorTableCellFk.RecargarGrupoColorsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarColorProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesColorProducto(false);
			
			//if(!this.isEsNuevoColorProducto) {								
				int intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproducto =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.colorproducto =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ColorProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualColorProducto(this.colorproducto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysColorProducto(this.colorproducto);
				
			}
			
			if(this.permiteMantenimiento(this.colorproducto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.colorproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoColorProducto=true;
					this.inicializarActualizarBindingTablaColorProducto(false);
					this.isEsNuevoColorProducto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoColorProducto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoColorProducto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesColorProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualColorProducto(false);
				
				this.habilitarDeshabilitarControlesColorProducto(false);
			
												
				
				if(ColorProductoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleColorProducto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoColorProductoActionPerformed(evt,colorproductoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualColorProducto(this.colorproducto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosColorProducto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,colorproductoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.colorproducto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ColorProducto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ColorProducto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarColorProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproducto =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				this.colorproducto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.colorproducto =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				this.colorproducto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.colorproducto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.colorproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ColorProductoModel) this.jTableDatosColorProducto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoColorProducto=true;
				this.inicializarActualizarBindingTablaColorProducto(false);
				this.isEsNuevoColorProducto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesColorProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualColorProducto(false);
				
				this.habilitarDeshabilitarControlesColorProducto(false);
				
				
				
				if(ColorProductoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleColorProducto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarColorProductoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosColorProducto.getRowCount()>=1) {
				jTableDatosColorProducto.removeRowSelectionInterval(0, jTableDatosColorProducto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesColorProducto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaColorProducto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesColorProducto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualColorProducto(false) ;
			
			this.isEsNuevoColorProducto=false;
			
			if(ColorProductoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleColorProducto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosColorProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingColorProducto(false);
				
				//SI ES MANUAL
				if(ColorProductoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualColorProducto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosColorProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoColorProducto--;			
			//ColorProducto colorproductoAux= new ColorProducto();			
			//colorproductoAux.setId(this.iIdNuevoColorProducto);
			
			if(this.jInternalFrameDetalleFormColorProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaColorProducto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysColorProducto(this.colorproducto);
			
			this.colorproducto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.colorproductoLogic.getColorProductos().add(this.colorproductoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.colorproductos.add(this.colorproductoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaColorProducto(false);
			
			this.jTableDatosColorProducto.setRowSelectionInterval(this.getIndiceNuevoColorProducto(), this.getIndiceNuevoColorProducto());
			
			int iLastRow =  this.jTableDatosColorProducto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosColorProducto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosColorProducto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaColorProducto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionColorProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingColorProducto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingColorProducto(false);
			
			//SI ES MANUAL
			if(ColorProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualColorProducto();
			}
			
			//this.abrirFrameTreeColorProducto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionColorProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Color ProductoES ?", "MANTENIMIENTO DE Color Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionColorProducto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralColorProducto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.colorproductoReturnGeneral=colorproductoLogic.procesarImportacionColorProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.colorproductoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarColorProductoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionColorProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionColorProducto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionColorProducto.setFileImportacion(this.jInternalFrameImportacionColorProducto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionColorProducto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionColorProducto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionColorProducto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionColorProducto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoColorProductoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ColorProducto> colorproductosSeleccionados=new ArrayList<ColorProducto>();		

		colorproductosSeleccionados=this.getColorProductosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoColorProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoColorProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ColorProductoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ColorProductoBaseDesign.jrxml";
			
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
			
			this.generarReporteColorProductos("Todos",colorproductosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.colorproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Color Producto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoColorProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoColorProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ColorProductoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ColorProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ColorProductoConstantesFunciones.LABEL_IDGRUPOCOLOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_GrupoColor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_GrupoColor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_GrupoColor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_GrupoColor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ColorProductoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ColorProductoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoColorProducto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoColorProducto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoColorProducto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ColorProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ColorProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					sNombreCampoCategoria="id_tipo_producto";
					break;

				case ColorProductoConstantesFunciones.LABEL_IDGRUPOCOLOR:
					sNombreCampoCategoria="id_grupo_color";
					break;

				case ColorProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ColorProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoColorProducto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ColorProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ColorProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					sNombreCampoCategoriaValor="id_tipo_producto";
					break;

				case ColorProductoConstantesFunciones.LABEL_IDGRUPOCOLOR:
					sNombreCampoCategoriaValor="id_grupo_color";
					break;

				case ColorProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ColorProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoColorProducto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoColorProducto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ColorProductoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ColorProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_producto");
					break;

				case ColorProductoConstantesFunciones.LABEL_IDGRUPOCOLOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Grupo Color",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_grupo_color");
					break;

				case ColorProductoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ColorProductoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoColorProductoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ColorProducto> colorproductosSeleccionados=new ArrayList<ColorProducto>();		
		
		colorproductosSeleccionados=this.getColorProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"colorproducto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ColorProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoColorProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoColorProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ColorProductoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ColorProductoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ColorProducto colorproducto:colorproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(colorproducto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ColorProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ColorProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
					iRow++;

					for(ColorProducto colorproducto:colorproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(colorproducto.gettipoproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ColorProductoConstantesFunciones.LABEL_IDGRUPOCOLOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ColorProductoConstantesFunciones.LABEL_IDGRUPOCOLOR);
					iRow++;

					for(ColorProducto colorproducto:colorproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(colorproducto.getgrupocolor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ColorProductoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ColorProductoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ColorProducto colorproducto:colorproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(colorproducto.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ColorProductoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ColorProductoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ColorProducto colorproducto:colorproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(colorproducto.getnombre());
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
			//	this.getFilaCabeceraExportarExcelColorProducto(row);				
			//	iRow++;
			//}				
			
			//for(ColorProducto colorproductoAux:colorproductosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelColorProducto(colorproductoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.colorproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Color Producto",JOptionPane.INFORMATION_MESSAGE);
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
				this.colorproductoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingColorProducto(false);
			
			//SI ES MANUAL
			if(ColorProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualColorProducto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresColorProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingColorProducto(false);
			
			//SI ES MANUAL
			if(ColorProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualColorProducto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesColorProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingColorProducto(false);
			
			//SI ES MANUAL
			if(ColorProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualColorProducto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaColorProducto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosColorProducto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosColorProducto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosColorProducto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosColorProducto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosColorProducto.setMinimumSize(dimensionMinimum);
		this.jTableDatosColorProducto.setMaximumSize(dimensionMaximum);
		this.jTableDatosColorProducto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingColorProducto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingColorProducto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingColorProducto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaColorProducto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesColorProducto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.colorproductoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasColorProducto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesColorProducto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesColorProducto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ColorProductoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ColorProductoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualColorProducto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaColorProducto();
		
		this.inicializarActualizarBindingBotonesManualColorProducto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.colorproductoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualColorProducto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesColorProducto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualColorProducto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualColorProducto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosColorProducto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosColorProducto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteColorProducto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormColorProducto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormColorProducto.jCheckBoxPostAccionNuevoColorProducto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormColorProducto.jCheckBoxPostAccionSinCerrarColorProducto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormColorProducto.jCheckBoxPostAccionSinMensajeColorProducto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosColorProducto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosColorProducto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteColorProducto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormColorProducto!=null) {
				this.jInternalFrameDetalleFormColorProducto.jCheckBoxPostAccionNuevoColorProducto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormColorProducto.jCheckBoxPostAccionSinCerrarColorProducto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormColorProducto.jCheckBoxPostAccionSinMensajeColorProducto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionColorProducto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionColorProducto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormColorProducto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormColorProducto.jComboBoxTiposAccionesFormularioColorProducto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesColorProducto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoColorProducto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoColorProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesColorProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesColorProducto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarColorProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesColorProducto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoColorProducto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoColorProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesColorProducto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralColorProducto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesColorProducto(Boolean esInicializar) throws Exception {
		try	{	
			if(ColorProductoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualColorProducto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesColorProducto() throws Exception {
		try	{
			if(ColorProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualColorProducto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleColorProducto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormColorProducto.jComboBoxTiposAccionesFormularioColorProducto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormColorProducto.jComboBoxTiposAccionesFormularioColorProducto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualColorProducto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesColorProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesColorProducto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesColorProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesColorProducto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesColorProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesColorProducto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionColorProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionColorProducto.addItem(reporte);
			}
			
			
			if(!this.colorproductoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionColorProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionColorProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesColorProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesColorProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesColorProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesColorProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormColorProducto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormColorProducto.jComboBoxTiposAccionesFormularioColorProducto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormColorProducto.jComboBoxTiposAccionesFormularioColorProducto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarColorProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarColorProducto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarColorProducto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualColorProducto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualColorProducto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoColorProducto!=null) {
				this.jInternalFrameReporteDinamicoColorProducto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoColorProducto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoColorProducto!=null) {
				this.jInternalFrameReporteDinamicoColorProducto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoColorProducto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoColorProducto!=null) {
				
				if(this.jInternalFrameReporteDinamicoColorProducto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoColorProducto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoColorProducto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoColorProducto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoColorProducto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoColorProducto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualColorProducto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoColorProducto.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreColorProducto.getText();
		if(this.jComboBoxid_grupo_colorFK_IdGrupoColorColorProducto.getSelectedItem()!=null){this.id_grupo_colorFK_IdGrupoColor=((GrupoColor)this.jComboBoxid_grupo_colorFK_IdGrupoColorColorProducto.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_productoFK_IdTipoProductoColorProducto.getSelectedItem()!=null){this.id_tipo_productoFK_IdTipoProducto=((TipoProducto)this.jComboBoxid_tipo_productoFK_IdTipoProductoColorProducto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasColorProducto(Boolean esInicializar) throws Exception {				
		if(ColorProductoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualColorProducto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaColorProducto() throws Exception {
		this.inicializarActualizarBindingTablaColorProducto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByColorProducto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByColorProducto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByColorProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByColorProducto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ColorProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByColorProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByColorProducto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ColorProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosColorProductoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosColorProductoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ColorProductoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByColorProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByColorProducto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ColorProductoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByColorProducto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaColorProducto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=colorproductoLogic.getColorProductos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=colorproductos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ColorProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosColorProducto.setModel(new ColorProductoModel(this.colorproductoLogic.getColorProductos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosColorProducto.setModel(new ColorProductoModel(this.colorproductos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByColorProducto!=null && this.jInternalFrameOrderByColorProducto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByColorProducto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosColorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosColorProducto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ColorProductoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ColorProductoConstantesFunciones.SCLASSWEBTITULO,colorproductoConstantesFunciones.resaltarSeleccionarColorProducto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ColorProductoConstantesFunciones.SCLASSWEBTITULO,colorproductoConstantesFunciones.resaltarSeleccionarColorProducto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosColorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosColorProducto,ColorProductoConstantesFunciones.LABEL_ID));

		if(this.colorproductoConstantesFunciones.mostraridColorProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ColorProductoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.colorproductoConstantesFunciones.resaltaridColorProducto,this.colorproductoConstantesFunciones.activaridColorProducto,this,true,"idColorProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.colorproductoConstantesFunciones.resaltaridColorProducto,this.colorproductoConstantesFunciones.activaridColorProducto,this,true,"idColorProducto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosColorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosColorProducto,ColorProductoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.colorproductoConstantesFunciones.mostrarid_empresaColorProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ColorProductoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.colorproductoConstantesFunciones.resaltarid_empresaColorProducto,this,this.colorproductoConstantesFunciones.activarid_empresaColorProducto));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.colorproductoConstantesFunciones.resaltarid_empresaColorProducto,this,this.colorproductoConstantesFunciones.activarid_empresaColorProducto,false,"id_empresaColorProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ColorProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosColorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosColorProducto,ColorProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO));

		if(this.colorproductoConstantesFunciones.mostrarid_tipo_productoColorProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ColorProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoProductoTableCell(this.tipoproductosForeignKey,this.colorproductoConstantesFunciones.resaltarid_tipo_productoColorProducto,this,this.colorproductoConstantesFunciones.activarid_tipo_productoColorProducto));
			tableColumn.setCellEditor(new TipoProductoTableCell(this.tipoproductosForeignKey,this.colorproductoConstantesFunciones.resaltarid_tipo_productoColorProducto,this,this.colorproductoConstantesFunciones.activarid_tipo_productoColorProducto,true,"id_tipo_productoColorProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ColorProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosColorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosColorProducto,ColorProductoConstantesFunciones.LABEL_IDGRUPOCOLOR));

		if(this.colorproductoConstantesFunciones.mostrarid_grupo_colorColorProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ColorProductoConstantesFunciones.LABEL_IDGRUPOCOLOR,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new GrupoColorTableCell(this.grupocolorsForeignKey,this.colorproductoConstantesFunciones.resaltarid_grupo_colorColorProducto,this,this.colorproductoConstantesFunciones.activarid_grupo_colorColorProducto));
			tableColumn.setCellEditor(new GrupoColorTableCell(this.grupocolorsForeignKey,this.colorproductoConstantesFunciones.resaltarid_grupo_colorColorProducto,this,this.colorproductoConstantesFunciones.activarid_grupo_colorColorProducto,true,"id_grupo_colorColorProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ColorProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosColorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosColorProducto,ColorProductoConstantesFunciones.LABEL_CODIGO));

		if(this.colorproductoConstantesFunciones.mostrarcodigoColorProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ColorProductoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.colorproductoConstantesFunciones.resaltarcodigoColorProducto,this.colorproductoConstantesFunciones.activarcodigoColorProducto,this,true,"codigoColorProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.colorproductoConstantesFunciones.resaltarcodigoColorProducto,this.colorproductoConstantesFunciones.activarcodigoColorProducto,this,true,"codigoColorProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ColorProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosColorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosColorProducto,ColorProductoConstantesFunciones.LABEL_NOMBRE));

		if(this.colorproductoConstantesFunciones.mostrarnombreColorProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ColorProductoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.colorproductoConstantesFunciones.resaltarnombreColorProducto,this.colorproductoConstantesFunciones.activarnombreColorProducto,this,true,"nombreColorProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.colorproductoConstantesFunciones.resaltarnombreColorProducto,this.colorproductoConstantesFunciones.activarnombreColorProducto,this,true,"nombreColorProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ColorProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.colorproductoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosParametroInventarioDefecto && this.colorproductoConstantesFunciones.mostrarParametroInventarioDefectoColorProducto && !ColorProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Inventario Defectos");
				tableColumn.setHeaderValue("Parametro Inventario Defectos");
				tableColumn.setCellRenderer(new ParametroInventarioDefectoTableCell(colorproductoConstantesFunciones.resaltarParametroInventarioDefectoColorProducto,this,this.colorproductoConstantesFunciones.activarParametroInventarioDefectoColorProducto));
				tableColumn.setCellEditor(new ParametroInventarioDefectoTableCell(colorproductoConstantesFunciones.resaltarParametroInventarioDefectoColorProducto,this,this.colorproductoConstantesFunciones.activarParametroInventarioDefectoColorProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosColorProducto.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.colorproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.colorproductoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosColorProducto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.colorproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.colorproductoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosColorProducto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarColorProducto && this.isPermisoGuardarCambiosColorProducto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.colorproductoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.colorproductoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosColorProducto.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.colorproductoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosColorProducto.addColumn(tableColumn);
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
			
			this.jTableDatosColorProducto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarColorProducto && this.isPermisoGuardarCambiosColorProducto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.colorproductoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarColorProducto && this.isPermisoGuardarCambiosColorProducto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosColorProducto.moveColumn(this.jTableDatosColorProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosColorProducto.moveColumn(this.jTableDatosColorProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.colorproductoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosColorProducto.moveColumn(this.jTableDatosColorProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosColorProducto.moveColumn(this.jTableDatosColorProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosColorProducto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosColorProducto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosColorProducto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ColorProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosColorProducto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosColorProducto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ColorProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ColorProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosColorProducto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosColorProducto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosColorProducto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=colorproductoLogic.getColorProductos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=colorproductos.size()-1;
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
		//this.jTableDatosColorProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosColorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosColorProducto();
			
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
				
				//this.isEsNuevoColorProducto=false;
					
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
			
				if(this.colorproductoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormColorProducto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosColorProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosColorProducto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproducto =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.colorproducto =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.colorproducto.getsType().equals("DUPLICADO")
				   || this.colorproducto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoColorProducto=true;
				
				} else {
					this.isEsNuevoColorProducto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.colorproductoSessionBean.getEsGuardarRelacionado()) {
					if(this.colorproducto.getId()>=0 && !this.colorproducto.getIsNew()) {						
						this.isEsNuevoColorProducto=false;
						
					} else {
						this.isEsNuevoColorProducto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoColorProducto(esRelaciones);						
				
				this.seleccionarColorProducto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.colorproducto.getId()<0) {
					this.isEsNuevoColorProducto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarColorProducto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarColorProducto(evt,rowIndex);
				}	
				
				if(this.colorproductoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ColorProducto: " + this.dDif); 
					}
				}								
				
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarColorProducto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.colorproducto)) {
					if(this.colorproducto.getId()>0) {
						this.colorproducto.setIsDeleted(true);
						
						this.colorproductosEliminados.add(this.colorproducto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.colorproductoLogic.getColorProductos().remove(this.colorproducto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.colorproductos.remove(this.colorproducto);				
					}
					
					
					((ColorProductoModel) this.jTableDatosColorProducto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaColorProducto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarColorProducto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoColorProducto) {
			
			if(this.jInternalFrameDetalleFormColorProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosColorProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosColorProducto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproducto =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.colorproducto =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ColorProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioColorProducto(this.colorproducto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.colorproductoConstantesFunciones.cargarid_empresaColorProducto || this.colorproductoConstantesFunciones.event_dependid_empresaColorProducto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.colorproducto.getid_empresa());
									//this.inicializarActualizarBindingColorProducto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(colorproducto.getEmpresa()!=null) {
							this.empresasForeignKey.add(colorproducto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.colorproducto.getid_empresa(),false,"Formulario");

					//TipoProducto
					if(!this.colorproductoConstantesFunciones.cargarid_tipo_productoColorProducto || this.colorproductoConstantesFunciones.event_dependid_tipo_productoColorProducto) {
						//this.cargarCombosTipoProductosForeignKeyLista(" where id="+this.colorproducto.getid_tipo_producto());
									//this.inicializarActualizarBindingColorProducto(false,false);
						this.tipoproductosForeignKey=new ArrayList<TipoProducto>();

						if(colorproducto.getTipoProducto()!=null) {
							this.tipoproductosForeignKey.add(colorproducto.getTipoProducto());
						}

						this.addItemDefectoCombosForeignKeyTipoProducto();
						this.cargarCombosFrameTipoProductosForeignKey("Todos");
					}
					this.setActualTipoProductoForeignKey(this.colorproducto.getid_tipo_producto(),false,"Formulario");

					//GrupoColor
					if(!this.colorproductoConstantesFunciones.cargarid_grupo_colorColorProducto || this.colorproductoConstantesFunciones.event_dependid_grupo_colorColorProducto) {
						//this.cargarCombosGrupoColorsForeignKeyLista(" where id="+this.colorproducto.getid_grupo_color());
									//this.inicializarActualizarBindingColorProducto(false,false);
						this.grupocolorsForeignKey=new ArrayList<GrupoColor>();

						if(colorproducto.getGrupoColor()!=null) {
							this.grupocolorsForeignKey.add(colorproducto.getGrupoColor());
						}

						this.addItemDefectoCombosForeignKeyGrupoColor();
						this.cargarCombosFrameGrupoColorsForeignKey("Todos");
					}
					this.setActualGrupoColorForeignKey(this.colorproducto.getid_grupo_color(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesColorProducto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesColorProducto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualColorProducto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoColorProducto(ColorProducto colorproducto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoColorProducto(colorproducto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoColorProducto(ColorProducto colorproducto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioColorProducto(colorproducto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyColorProducto(colorproducto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyColorProducto(colorproducto);
	}
	
	public void setVariablesObjetoActualToFormularioColorProducto(ColorProducto colorproducto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormColorProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormColorProducto.jLabelidColorProducto.setText(colorproducto.getId().toString());
			this.jInternalFrameDetalleFormColorProducto.jTextFieldcodigoColorProducto.setText(colorproducto.getcodigo());
			this.jInternalFrameDetalleFormColorProducto.jTextAreanombreColorProducto.setText(colorproducto.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ColorProducto colorproductoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,colorproductoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ColorProducto colorproductoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				colorproductoLocal=this.colorproducto;
			} else {
				colorproductoLocal=this.colorproductoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(colorproductoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoColorProducto(colorproductoLocal,true);
					
					if(colorproductoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(colorproductoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.colorproductoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(colorproductoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoColorProducto(ColorProducto colorproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualColorProducto(colorproducto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysColorProducto(colorproducto);
	}
	
	public void setVariablesFormularioToObjetoActualColorProducto(ColorProducto colorproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualColorProducto(colorproducto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualColorProducto(ColorProducto colorproducto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormColorProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormColorProducto.jLabelidColorProducto.getText()==null || this.jInternalFrameDetalleFormColorProducto.jLabelidColorProducto.getText()=="" || this.jInternalFrameDetalleFormColorProducto.jLabelidColorProducto.getText()=="Id") {
				this.jInternalFrameDetalleFormColorProducto.jLabelidColorProducto.setText("0");
			}

			if(conColumnasBase) {colorproducto.setId(Long.parseLong(this.jInternalFrameDetalleFormColorProducto.jLabelidColorProducto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ColorProductoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormColorProducto.jLabelIdColorProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			colorproducto.setcodigo(this.jInternalFrameDetalleFormColorProducto.jTextFieldcodigoColorProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ColorProductoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormColorProducto.jLabelcodigoColorProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			colorproducto.setnombre(this.jInternalFrameDetalleFormColorProducto.jTextAreanombreColorProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ColorProductoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormColorProducto.jLabelnombreColorProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualColorProducto(ColorProducto colorproductoBean,ColorProducto colorproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && colorproductoBean.getid_tipo_producto()!=null && !colorproductoBean.getid_tipo_producto().equals(-1L))) {colorproducto.setid_tipo_producto(colorproductoBean.getid_tipo_producto());}
			if(conDefault || (!conDefault && colorproductoBean.getid_grupo_color()!=null && !colorproductoBean.getid_grupo_color().equals(-1L))) {colorproducto.setid_grupo_color(colorproductoBean.getid_grupo_color());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosColorProducto(ColorProducto colorproductoOrigen,ColorProducto colorproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && colorproductoOrigen.getId()!=null && !colorproductoOrigen.getId().equals(0L))) {colorproducto.setId(colorproductoOrigen.getId());}}
			if(conDefault || (!conDefault && colorproductoOrigen.getid_tipo_producto()!=null && !colorproductoOrigen.getid_tipo_producto().equals(-1L))) {colorproducto.setid_tipo_producto(colorproductoOrigen.getid_tipo_producto());}
			if(conDefault || (!conDefault && colorproductoOrigen.getid_grupo_color()!=null && !colorproductoOrigen.getid_grupo_color().equals(-1L))) {colorproducto.setid_grupo_color(colorproductoOrigen.getid_grupo_color());}
			if(conDefault || (!conDefault && colorproductoOrigen.getcodigo()!=null && !colorproductoOrigen.getcodigo().equals(""))) {colorproducto.setcodigo(colorproductoOrigen.getcodigo());}
			if(conDefault || (!conDefault && colorproductoOrigen.getnombre()!=null && !colorproductoOrigen.getnombre().equals(""))) {colorproducto.setnombre(colorproductoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioColorProducto(ColorProducto colorproducto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormColorProducto.jLabelidColorProducto.setText(colorproducto.getId().toString());
			this.jInternalFrameDetalleFormColorProducto.jTextFieldcodigoColorProducto.setText(colorproducto.getcodigo());
			this.jInternalFrameDetalleFormColorProducto.jTextAreanombreColorProducto.setText(colorproducto.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioColorProducto(ColorProductoBean colorproductoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormColorProducto.jLabelidColorProducto.setText(colorproductoBean.getId().toString());
			this.jInternalFrameDetalleFormColorProducto.jTextFieldcodigoColorProducto.setText(colorproductoBean.getcodigo());
			this.jInternalFrameDetalleFormColorProducto.jTextAreanombreColorProducto.setText(colorproductoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanColorProducto(ColorProductoParameterReturnGeneral colorproductoReturnGeneral,ColorProductoBean colorproductoBean,Boolean conDefault) throws Exception { 
		try {
			ColorProducto colorproductoLocal=new ColorProducto();
			
			colorproductoLocal=colorproductoReturnGeneral.getColorProducto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && colorproductoLocal.getId()!=null && !colorproductoLocal.getId().equals(0L))) {colorproductoBean.setId(colorproductoLocal.getId());}}
			if(conDefault || (!conDefault && colorproductoLocal.getid_tipo_producto()!=null && !colorproductoLocal.getid_tipo_producto().equals(-1L))) {colorproductoBean.setid_tipo_producto(colorproductoLocal.getid_tipo_producto());}
			if(conDefault || (!conDefault && colorproductoLocal.getid_grupo_color()!=null && !colorproductoLocal.getid_grupo_color().equals(-1L))) {colorproductoBean.setid_grupo_color(colorproductoLocal.getid_grupo_color());}
			if(conDefault || (!conDefault && colorproductoLocal.getcodigo()!=null && !colorproductoLocal.getcodigo().equals(""))) {colorproductoBean.setcodigo(colorproductoLocal.getcodigo());}
			if(conDefault || (!conDefault && colorproductoLocal.getnombre()!=null && !colorproductoLocal.getnombre().equals(""))) {colorproductoBean.setnombre(colorproductoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxColorProductoGenerico(Long idColorProductoSeleccionado,JComboBox jComboBoxColorProducto,List<ColorProducto> colorproductosLocal)throws Exception {
		try {
			ColorProducto  colorproductoTemp=null;

			for(ColorProducto colorproductoAux:colorproductosLocal) {
				if(colorproductoAux.getId()!=null && colorproductoAux.getId().equals(idColorProductoSeleccionado)) {
					colorproductoTemp=colorproductoAux;
					break;
				}
			}

			jComboBoxColorProducto.setSelectedItem(colorproductoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxColorProductoGenerico(JComboBox jComboBoxColorProducto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxColorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxColorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxColorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxColorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxColorProducto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxColorProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxColorProducto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxColorProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxColorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxColorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ParametroInventarioDefecto")) {
			jButtonParametroInventarioDefectoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			colorproducto=(ColorProducto) colorproductoLogic.getColorProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			colorproducto =(ColorProducto) colorproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!colorproducto.getIsNew() && !colorproducto.getIsChanged() && !colorproducto.getIsDeleted()) {
				sDescripcion=colorproducto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=colorproducto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoProducto")) {
			//sDescripcion=this.getActualTipoProductoForeignKeyDescripcion((Long)value);
			if(!colorproducto.getIsNew() && !colorproducto.getIsChanged() && !colorproducto.getIsDeleted()) {
				sDescripcion=colorproducto.gettipoproducto_descripcion();
			} else {
				//sDescripcion=this.getActualTipoProductoForeignKeyDescripcion((Long)value);
				sDescripcion=colorproducto.gettipoproducto_descripcion();
			}
		}

		if(sTipo.equals("GrupoColor")) {
			//sDescripcion=this.getActualGrupoColorForeignKeyDescripcion((Long)value);
			if(!colorproducto.getIsNew() && !colorproducto.getIsChanged() && !colorproducto.getIsDeleted()) {
				sDescripcion=colorproducto.getgrupocolor_descripcion();
			} else {
				//sDescripcion=this.getActualGrupoColorForeignKeyDescripcion((Long)value);
				sDescripcion=colorproducto.getgrupocolor_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ColorProducto colorproductoRow=new ColorProducto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			colorproductoRow=(ColorProducto) colorproductoLogic.getColorProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			colorproductoRow=(ColorProducto) colorproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonParametroInventarioDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,ColorProducto colorproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormColorProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.colorproducto = (ColorProducto)this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.colorproducto = (ColorProducto)this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(colorproducto!=null) {
						this.colorproducto = colorproducto;
					} else {
						this.colorproducto = new ColorProducto();
					}
				}

				if(this.isTienePermisosParametroInventarioDefecto && this.permiteMantenimiento(this.colorproducto)) {
					ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFramePopup=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFramePopup;
					} else {
						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame;
					}

					List<ColorProducto> colorproductos=new ArrayList<ColorProducto>();
					colorproductos.add(this.colorproducto);
					if(!esRelacionado) {
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setConGuardarRelaciones(false);
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormColorProducto.cargarParametroInventarioDefectoBeanSwingJInternalFrame(colorproductos,this.colorproducto,parametroinventariodefectoBeanSwingJInternalFrame,/*conInicializar,*/parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getConGuardarRelaciones(),parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("no_relacionado");

						parametroinventariodefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametroinventariodefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderColorProducto=(TitledBorder)this.jScrollPanelDatosColorProducto.getBorder();
						TitledBorder titledBorderParametroInventarioDefecto=(TitledBorder)parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getBorder();

						titledBorderParametroInventarioDefecto.setTitle(titledBorderColorProducto.getTitle() + " -> Parametro Inventario Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametroinventariodefectoBeanSwingJInternalFrame);
						}

						parametroinventariodefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametroinventariodefectoBeanSwingJInternalFrame);

						parametroinventariodefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.colorproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Inventario Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualColorProducto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoColorProducto.setVisible((this.isVisibilidadCeldaNuevoColorProducto && this.isPermisoNuevoColorProducto));			
			this.jButtonDuplicarColorProducto.setVisible((this.isVisibilidadCeldaDuplicarColorProducto && this.isPermisoDuplicarColorProducto));			
			this.jButtonCopiarColorProducto.setVisible((this.isVisibilidadCeldaCopiarColorProducto && this.isPermisoCopiarColorProducto));
			this.jButtonVerFormColorProducto.setVisible((this.isVisibilidadCeldaVerFormColorProducto && this.isPermisoVerFormColorProducto));
			
			this.jButtonAbrirOrderByColorProducto.setVisible((this.isVisibilidadCeldaOrdenColorProducto && this.isPermisoOrdenColorProducto));			
			
			this.jButtonNuevoRelacionesColorProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesColorProducto && this.isPermisoNuevoColorProducto));			
			this.jButtonNuevoGuardarCambiosColorProducto.setVisible((this.isVisibilidadCeldaNuevoColorProducto && this.isPermisoNuevoColorProducto && this.isPermisoGuardarCambiosColorProducto));
			
			if(this.jInternalFrameDetalleFormColorProducto!=null) {
			this.jInternalFrameDetalleFormColorProducto.jButtonModificarColorProducto.setVisible((this.isVisibilidadCeldaModificarColorProducto && this.isPermisoActualizarColorProducto));	
			this.jInternalFrameDetalleFormColorProducto.jButtonActualizarColorProducto.setVisible((this.isVisibilidadCeldaActualizarColorProducto && this.isPermisoActualizarColorProducto));	
			this.jInternalFrameDetalleFormColorProducto.jButtonEliminarColorProducto.setVisible((this.isVisibilidadCeldaEliminarColorProducto && this.isPermisoEliminarColorProducto));
			this.jInternalFrameDetalleFormColorProducto.jButtonCancelarColorProducto.setVisible(this.isVisibilidadCeldaCancelarColorProducto);							
			this.jInternalFrameDetalleFormColorProducto.jButtonGuardarCambiosColorProducto.setVisible((this.isVisibilidadCeldaGuardarColorProducto && this.isPermisoGuardarCambiosColorProducto));			
			
			}
						
			this.jButtonGuardarCambiosTablaColorProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosColorProducto && this.isPermisoGuardarCambiosColorProducto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarColorProducto.setVisible((this.isVisibilidadCeldaNuevoColorProducto && this.isPermisoNuevoColorProducto));						
			this.jButtonDuplicarToolBarColorProducto.setVisible((this.isVisibilidadCeldaDuplicarColorProducto && this.isPermisoDuplicarColorProducto));						
			this.jButtonCopiarToolBarColorProducto.setVisible((this.isVisibilidadCeldaCopiarColorProducto && this.isPermisoCopiarColorProducto));			
			this.jButtonVerFormToolBarColorProducto.setVisible((this.isVisibilidadCeldaVerFormColorProducto && this.isPermisoVerFormColorProducto));			
			this.jButtonAbrirOrderByToolBarColorProducto.setVisible((this.isVisibilidadCeldaOrdenColorProducto && this.isPermisoOrdenColorProducto));
			this.jButtonNuevoRelacionesToolBarColorProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesColorProducto && this.isPermisoNuevoColorProducto));			
			this.jButtonNuevoGuardarCambiosToolBarColorProducto.setVisible((this.isVisibilidadCeldaNuevoColorProducto && this.isPermisoNuevoColorProducto && this.isPermisoGuardarCambiosColorProducto));			
			
			if(this.jInternalFrameDetalleFormColorProducto!=null) {
			this.jInternalFrameDetalleFormColorProducto.jButtonModificarToolBarColorProducto.setVisible((this.isVisibilidadCeldaModificarColorProducto && this.isPermisoActualizarColorProducto));	
			this.jInternalFrameDetalleFormColorProducto.jButtonActualizarToolBarColorProducto.setVisible((this.isVisibilidadCeldaActualizarColorProducto  && this.isPermisoActualizarColorProducto));	
			this.jInternalFrameDetalleFormColorProducto.jButtonEliminarToolBarColorProducto.setVisible((this.isVisibilidadCeldaEliminarColorProducto && this.isPermisoEliminarColorProducto));
			this.jInternalFrameDetalleFormColorProducto.jButtonCancelarToolBarColorProducto.setVisible(this.isVisibilidadCeldaCancelarColorProducto);				
			this.jInternalFrameDetalleFormColorProducto.jButtonGuardarCambiosToolBarColorProducto.setVisible((this.isVisibilidadCeldaGuardarColorProducto && this.isPermisoGuardarCambiosColorProducto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarColorProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosColorProducto && this.isPermisoGuardarCambiosColorProducto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoColorProducto.setVisible((this.isVisibilidadCeldaNuevoColorProducto && this.isPermisoNuevoColorProducto));			
			this.jMenuItemDuplicarColorProducto.setVisible((this.isVisibilidadCeldaDuplicarColorProducto && this.isPermisoDuplicarColorProducto));			
			this.jMenuItemCopiarColorProducto.setVisible((this.isVisibilidadCeldaCopiarColorProducto && this.isPermisoCopiarColorProducto));			
			this.jMenuItemVerFormColorProducto.setVisible((this.isVisibilidadCeldaVerFormColorProducto && this.isPermisoVerFormColorProducto));			
			this.jMenuItemAbrirOrderByColorProducto.setVisible((this.isVisibilidadCeldaOrdenColorProducto && this.isPermisoOrdenColorProducto));			
			//this.jMenuItemMostrarOcultarColorProducto.setVisible((this.isVisibilidadCeldaOrdenColorProducto && this.isPermisoOrdenColorProducto));
			this.jMenuItemDetalleAbrirOrderByColorProducto.setVisible((this.isVisibilidadCeldaOrdenColorProducto && this.isPermisoOrdenColorProducto));			
			//this.jMenuItemDetalleMostrarOcultarColorProducto.setVisible((this.isVisibilidadCeldaOrdenColorProducto && this.isPermisoOrdenColorProducto));			
			this.jMenuItemNuevoRelacionesColorProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesColorProducto && this.isPermisoNuevoColorProducto));			
			this.jMenuItemNuevoGuardarCambiosColorProducto.setVisible((this.isVisibilidadCeldaNuevoColorProducto && this.isPermisoNuevoColorProducto && this.isPermisoGuardarCambiosColorProducto));									
			
			if(this.jInternalFrameDetalleFormColorProducto!=null) {
			this.jInternalFrameDetalleFormColorProducto.jMenuItemModificarColorProducto.setVisible((this.isVisibilidadCeldaModificarColorProducto && this.isPermisoActualizarColorProducto));	
			this.jInternalFrameDetalleFormColorProducto.jMenuItemActualizarColorProducto.setVisible((this.isVisibilidadCeldaActualizarColorProducto && this.isPermisoActualizarColorProducto));	
			this.jInternalFrameDetalleFormColorProducto.jMenuItemEliminarColorProducto.setVisible((this.isVisibilidadCeldaEliminarColorProducto && this.isPermisoEliminarColorProducto));
			this.jInternalFrameDetalleFormColorProducto.jMenuItemCancelarColorProducto.setVisible(this.isVisibilidadCeldaCancelarColorProducto);				
			}
			
			this.jMenuItemGuardarCambiosColorProducto.setVisible((this.isVisibilidadCeldaGuardarColorProducto && this.isPermisoGuardarCambiosColorProducto));						
			this.jMenuItemGuardarCambiosTablaColorProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosColorProducto && this.isPermisoGuardarCambiosColorProducto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoColorProducto=this.jButtonNuevoColorProducto.isVisible();
			this.isVisibilidadCeldaDuplicarColorProducto=this.jButtonDuplicarColorProducto.isVisible();
			this.isVisibilidadCeldaCopiarColorProducto=this.jButtonCopiarColorProducto.isVisible();
			this.isVisibilidadCeldaVerFormColorProducto=this.jButtonVerFormColorProducto.isVisible();
			
			this.isVisibilidadCeldaOrdenColorProducto=this.jButtonAbrirOrderByColorProducto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesColorProducto=this.jButtonNuevoRelacionesColorProducto.isVisible();
			this.isVisibilidadCeldaModificarColorProducto=this.jButtonModificarColorProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormColorProducto!=null) {
			this.isVisibilidadCeldaActualizarColorProducto=this.jInternalFrameDetalleFormColorProducto.jButtonActualizarColorProducto.isVisible();
			this.isVisibilidadCeldaEliminarColorProducto=this.jInternalFrameDetalleFormColorProducto.jButtonEliminarColorProducto.isVisible();
			this.isVisibilidadCeldaCancelarColorProducto=this.jInternalFrameDetalleFormColorProducto.jButtonCancelarColorProducto.isVisible();
			this.isVisibilidadCeldaGuardarColorProducto=this.jInternalFrameDetalleFormColorProducto.jButtonGuardarCambiosColorProducto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosColorProducto=this.jButtonGuardarCambiosTablaColorProducto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoColorProducto=this.jButtonNuevoToolBarColorProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesColorProducto=this.jButtonNuevoRelacionesToolBarColorProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormColorProducto!=null) {
			this.isVisibilidadCeldaModificarColorProducto=this.jInternalFrameDetalleFormColorProducto.jButtonModificarToolBarColorProducto.isVisible();
			this.isVisibilidadCeldaActualizarColorProducto=this.jInternalFrameDetalleFormColorProducto.jButtonActualizarToolBarColorProducto.isVisible();
			this.isVisibilidadCeldaEliminarColorProducto=this.jInternalFrameDetalleFormColorProducto.jButtonEliminarToolBarColorProducto.isVisible();
			this.isVisibilidadCeldaCancelarColorProducto=this.jInternalFrameDetalleFormColorProducto.jButtonCancelarToolBarColorProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarColorProducto=this.jButtonGuardarCambiosToolBarColorProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosColorProducto=this.jButtonGuardarCambiosTablaToolBarColorProducto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoColorProducto=this.jMenuItemNuevoColorProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesColorProducto=this.jMenuItemNuevoRelacionesColorProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormColorProducto!=null) {
			this.isVisibilidadCeldaModificarColorProducto=this.jInternalFrameDetalleFormColorProducto.jMenuItemModificarColorProducto.isVisible();
			this.isVisibilidadCeldaActualizarColorProducto=this.jInternalFrameDetalleFormColorProducto.jMenuItemActualizarColorProducto.isVisible();
			this.isVisibilidadCeldaEliminarColorProducto=this.jInternalFrameDetalleFormColorProducto.jMenuItemEliminarColorProducto.isVisible();
			this.isVisibilidadCeldaCancelarColorProducto=this.jInternalFrameDetalleFormColorProducto.jMenuItemCancelarColorProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarColorProducto=this.jMenuItemGuardarCambiosColorProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosColorProducto=this.jMenuItemGuardarCambiosTablaColorProducto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesColorProducto(Boolean esInicializar) {
		if(ColorProductoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.colorproductoSessionBean.getConGuardarRelaciones()) {
				//if(this.colorproductoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesColorProducto();
			}
			
			this.inicializarActualizarBindingBotonesManualColorProducto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualColorProducto() {
		this.jButtonNuevoColorProducto.setVisible(this.isPermisoNuevoColorProducto);			
		this.jButtonDuplicarColorProducto.setVisible(this.isPermisoDuplicarColorProducto);			
		this.jButtonCopiarColorProducto.setVisible(this.isPermisoCopiarColorProducto);			
		this.jButtonVerFormColorProducto.setVisible(this.isPermisoVerFormColorProducto);			
		
		this.jButtonAbrirOrderByColorProducto.setVisible(this.isPermisoOrdenColorProducto);					
		
		this.jButtonNuevoRelacionesColorProducto.setVisible(this.isPermisoNuevoColorProducto);			
		
		if(this.jInternalFrameDetalleFormColorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorProducto.jButtonModificarColorProducto.setVisible(this.isPermisoActualizarColorProducto);	
			this.jInternalFrameDetalleFormColorProducto.jButtonActualizarColorProducto.setVisible(this.isPermisoActualizarColorProducto);	
			this.jInternalFrameDetalleFormColorProducto.jButtonEliminarColorProducto.setVisible(this.isPermisoEliminarColorProducto);
			this.jInternalFrameDetalleFormColorProducto.jButtonCancelarColorProducto.setVisible(this.isVisibilidadCeldaCancelarColorProducto);						
			this.jInternalFrameDetalleFormColorProducto.jButtonGuardarCambiosColorProducto.setVisible(this.isPermisoGuardarCambiosColorProducto);							
		}
		
		this.jButtonGuardarCambiosTablaColorProducto.setVisible(this.isPermisoActualizarColorProducto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleColorProducto() {
		this.jInternalFrameDetalleFormColorProducto.jButtonModificarColorProducto.setVisible(this.isPermisoActualizarColorProducto);	
		this.jInternalFrameDetalleFormColorProducto.jButtonActualizarColorProducto.setVisible(this.isPermisoActualizarColorProducto);	
		this.jInternalFrameDetalleFormColorProducto.jButtonEliminarColorProducto.setVisible(this.isPermisoEliminarColorProducto);
		this.jInternalFrameDetalleFormColorProducto.jButtonCancelarColorProducto.setVisible(this.isVisibilidadCeldaCancelarColorProducto);							
		this.jInternalFrameDetalleFormColorProducto.jButtonGuardarCambiosColorProducto.setVisible((this.isVisibilidadCeldaGuardarColorProducto && this.isPermisoGuardarCambiosColorProducto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosColorProducto() {
		if(ColorProductoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualColorProducto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesColorProducto() {
	}
	
	public void jTableDatosColorProductoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarColorProducto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidColorProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualColorProducto(this.getcolorproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysColorProducto(this.colorproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.colorproducto =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.colorproducto =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.colorproducto==null) {
						this.colorproducto = new ColorProducto();
					}

					this.setVariablesFormularioToObjetoActualColorProducto(this.colorproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysColorProducto(this.colorproducto);
				}

				if(this.colorproducto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.colorproducto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingColorProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaColorProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebColorProducto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosColorProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosColorProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproducto =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.colorproducto =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualColorProducto(this.getcolorproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysColorProducto(this.colorproducto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.colorproductoLogic.getConnexion());

				if(this.colorproducto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.colorproducto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderColorProducto=(TitledBorder)this.jScrollPanelDatosColorProducto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderColorProducto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaColorProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualColorProducto(this.getcolorproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysColorProducto(this.colorproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.colorproducto =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.colorproducto =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.colorproducto==null) {
						this.colorproducto = new ColorProducto();
					}

					this.setVariablesFormularioToObjetoActualColorProducto(this.colorproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysColorProducto(this.colorproducto);
				}

				if(this.colorproducto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.colorproducto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingColorProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_productoColorProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoproducto=true;

			idTienePermisotipoproducto=this.tienePermisosUsuarioEnPaginaWebColorProducto(TipoProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosColorProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosColorProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproducto =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.colorproducto =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualColorProducto(this.getcolorproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysColorProducto(this.colorproducto);

				this.tipoproductoBeanSwingJInternalFrame=new TipoProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoproductoBeanSwingJInternalFrame.getTipoProductoLogic().setConnexion(this.colorproductoLogic.getConnexion());

				if(this.colorproducto.getid_tipo_producto()!=null) {
					this.tipoproductoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoproductoBeanSwingJInternalFrame.setIdActual(this.colorproducto.getid_tipo_producto());
					this.tipoproductoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoproductoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoProducto();
				}

				JInternalFrameBase jinternalFrame =this.tipoproductoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderColorProducto=(TitledBorder)this.jScrollPanelDatosColorProducto.getBorder();
				TitledBorder titledBordertipoproducto=(TitledBorder)this.tipoproductoBeanSwingJInternalFrame.jScrollPanelDatosTipoProducto.getBorder();

				titledBordertipoproducto.setTitle(titledBorderColorProducto.getTitle() + " -> Tipo Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_productoColorProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualColorProducto(this.getcolorproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysColorProducto(this.colorproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.colorproducto =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.colorproducto =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.colorproducto==null) {
						this.colorproducto = new ColorProducto();
					}

					this.setVariablesFormularioToObjetoActualColorProducto(this.colorproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysColorProducto(this.colorproducto);
				}

				if(this.colorproducto.getid_tipo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_producto = "+this.colorproducto.getid_tipo_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingColorProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_grupo_colorColorProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisogrupocolor=true;

			idTienePermisogrupocolor=this.tienePermisosUsuarioEnPaginaWebColorProducto(GrupoColorConstantesFunciones.CLASSNAME);

			if(idTienePermisogrupocolor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosColorProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosColorProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproducto =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.colorproducto =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualColorProducto(this.getcolorproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysColorProducto(this.colorproducto);

				this.grupocolorBeanSwingJInternalFrame=new GrupoColorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.grupocolorBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.grupocolorBeanSwingJInternalFrame.getGrupoColorLogic().setConnexion(this.colorproductoLogic.getConnexion());

				if(this.colorproducto.getid_grupo_color()!=null) {
					this.grupocolorBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.grupocolorBeanSwingJInternalFrame.setIdActual(this.colorproducto.getid_grupo_color());
					this.grupocolorBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.grupocolorBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.grupocolorBeanSwingJInternalFrame.inicializarActualizarBindingTablaGrupoColor();
				}

				JInternalFrameBase jinternalFrame =this.grupocolorBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderColorProducto=(TitledBorder)this.jScrollPanelDatosColorProducto.getBorder();
				TitledBorder titledBordergrupocolor=(TitledBorder)this.grupocolorBeanSwingJInternalFrame.jScrollPanelDatosGrupoColor.getBorder();

				titledBordergrupocolor.setTitle(titledBorderColorProducto.getTitle() + " -> Grupo Color");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_grupo_colorColorProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualColorProducto(this.getcolorproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysColorProducto(this.colorproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.colorproducto =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.colorproducto =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.colorproducto==null) {
						this.colorproducto = new ColorProducto();
					}

					this.setVariablesFormularioToObjetoActualColorProducto(this.colorproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysColorProducto(this.colorproducto);
				}

				if(this.colorproducto.getid_grupo_color()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_grupo_color = "+this.colorproducto.getid_grupo_color().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingColorProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoColorProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualColorProducto(this.getcolorproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysColorProducto(this.colorproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.colorproducto =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.colorproducto =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.colorproducto==null) {
						this.colorproducto = new ColorProducto();
					}

					this.setVariablesFormularioToObjetoActualColorProducto(this.colorproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysColorProducto(this.colorproducto);
				}

				if(this.colorproducto.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.colorproducto.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingColorProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreColorProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualColorProducto(this.getcolorproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysColorProducto(this.colorproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.colorproducto =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.colorproducto =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.colorproducto==null) {
						this.colorproducto = new ColorProducto();
					}

					this.setVariablesFormularioToObjetoActualColorProducto(this.colorproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysColorProducto(this.colorproducto);
				}

				if(this.colorproducto.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.colorproducto.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingColorProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoColorProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingColorProducto(false,false);

			this.getColorProductosBusquedaPorCodigo();

			this.inicializarActualizarBindingColorProducto(false);

			//if(ColorProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingColorProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreColorProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingColorProducto(false,false);

			this.getColorProductosBusquedaPorNombre();

			this.inicializarActualizarBindingColorProducto(false);

			//if(ColorProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingColorProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaColorProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingColorProducto(false,false);

			this.getColorProductosFK_IdEmpresa();

			this.inicializarActualizarBindingColorProducto(false);

			//if(ColorProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingColorProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdGrupoColorColorProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingColorProducto(false,false);

			this.getColorProductosFK_IdGrupoColor();

			this.inicializarActualizarBindingColorProducto(false);

			//if(ColorProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingColorProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoProductoColorProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingColorProducto(false,false);

			this.getColorProductosFK_IdTipoProducto();

			this.inicializarActualizarBindingColorProducto(false);

			//if(ColorProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingColorProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameColorProducto() {
		if(this.jInternalFrameDetalleFormColorProducto!=null) {
		

		if(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormColorProducto!=null) {
			this.jInternalFrameDetalleFormColorProducto.setVisible(false);	    			
			this.jInternalFrameDetalleFormColorProducto.dispose();
			this.jInternalFrameDetalleFormColorProducto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoColorProducto!=null) {
			this.jInternalFrameReporteDinamicoColorProducto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoColorProducto.dispose();
			this.jInternalFrameReporteDinamicoColorProducto=null;
		}
		
		if(this.jInternalFrameImportacionColorProducto!=null) {
			this.jInternalFrameImportacionColorProducto.setVisible(false);	    			
			this.jInternalFrameImportacionColorProducto.dispose();
			this.jInternalFrameImportacionColorProducto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessColorProducto();
			
			ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
			
			
			if(sTipo.equals("NuevoColorProducto")) {
				jButtonNuevoColorProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarColorProducto")) {
				jButtonDuplicarColorProductoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarColorProducto")) {
				jButtonCopiarColorProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormColorProducto")) {
				jButtonVerFormColorProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarColorProducto")) {
				jButtonNuevoColorProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarColorProducto")) {
				jButtonDuplicarColorProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoColorProducto")) {
				jButtonNuevoColorProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarColorProducto")) {
				jButtonDuplicarColorProductoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesColorProducto")) {
				jButtonNuevoColorProductoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarColorProducto")) {
				jButtonNuevoColorProductoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesColorProducto")) {
				jButtonNuevoColorProductoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarColorProducto")) {
				jButtonModificarColorProductoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarColorProducto")) {
				jButtonModificarColorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarColorProducto")) {
				jButtonModificarColorProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarColorProducto")) {
				jButtonActualizarColorProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarColorProducto")) {
				jButtonActualizarColorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarColorProducto")) {
				jButtonActualizarColorProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarColorProducto")) {
				jButtonEliminarColorProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarColorProducto")) {
				jButtonEliminarColorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarColorProducto")) {
				jButtonEliminarColorProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarColorProducto")) {
				jButtonCancelarColorProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarColorProducto")) {
				jButtonCancelarColorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarColorProducto")) {
				jButtonCancelarColorProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarColorProducto")) {
				jButtonCerrarColorProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarColorProducto")) {
				jButtonCerrarColorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarColorProducto")) {
				jButtonCerrarColorProductoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarColorProducto")) {
				jButtonMostrarOcultarColorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarColorProducto")) {
				jButtonCancelarColorProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosColorProducto")) {
				jButtonGuardarCambiosColorProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarColorProducto")) {
				jButtonGuardarCambiosColorProductoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarColorProducto")) {
				jButtonCopiarColorProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarColorProducto")) {
				jButtonVerFormColorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosColorProducto")) {
				jButtonGuardarCambiosColorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarColorProducto")) {
				jButtonCopiarColorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormColorProducto")) {
				jButtonVerFormColorProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaColorProducto")) {
				jButtonGuardarCambiosColorProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarColorProducto")) {
				jButtonGuardarCambiosColorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaColorProducto")) {
				jButtonGuardarCambiosColorProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionColorProducto")) {
				jButtonRecargarInformacionColorProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarColorProducto")) {
				jButtonRecargarInformacionColorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionColorProducto")) {
				jButtonRecargarInformacionColorProductoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresColorProducto")) {
				jButtonAnterioresColorProductoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarColorProducto")) {
				jButtonAnterioresColorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreColorProducto")) {
				jButtonAnterioresColorProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesColorProducto")) {
				jButtonSiguientesColorProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarColorProducto")) {
				jButtonSiguientesColorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesColorProducto")) {
				jButtonSiguientesColorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByColorProducto") || sTipo.equals("MenuItemDetalleAbrirOrderByColorProducto")) {
				jButtonAbrirOrderByColorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarColorProducto") || sTipo.equals("MenuItemDetalleMostrarOcultarColorProducto")) {
				jButtonMostrarOcultarColorProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosColorProducto")) {
				jButtonNuevoGuardarCambiosColorProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarColorProducto")) {
				jButtonNuevoGuardarCambiosColorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosColorProducto")) {
				jButtonNuevoGuardarCambiosColorProductoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoColorProducto")) {
				jButtonCerrarReporteDinamicoColorProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoColorProducto")) {
				jButtonGenerarReporteDinamicoColorProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoColorProducto")) {
				
				jButtonGenerarExcelReporteDinamicoColorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionColorProducto")) {
				jButtonCerrarImportacionColorProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionColorProducto")) {
				
				jButtonGenerarImportacionColorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionColorProducto")) {
				
				jButtonAbrirImportacionColorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesColorProducto")) {
				jComboBoxTiposAccionesColorProductoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesColorProducto")) {
				jComboBoxTiposRelacionesColorProductoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioColorProducto")) {
				jComboBoxTiposAccionesColorProductoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarColorProducto")) {
				
				jComboBoxTiposSeleccionarColorProductoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralColorProducto")) {
				jTextFieldValorCampoGeneralColorProductoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByColorProducto")) {
				jButtonAbrirOrderByColorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarColorProducto")) {
				jButtonAbrirOrderByColorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByColorProducto")) {
				jButtonCerrarOrderByColorProductoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idColorProductoBusqueda")) {
				this.jButtonidColorProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaColorProductoUpdate")) {
				this.jButtonid_empresaColorProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaColorProductoBusqueda")) {
				this.jButtonid_empresaColorProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_productoColorProductoUpdate")) {
				this.jButtonid_tipo_productoColorProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_productoColorProductoBusqueda")) {
				this.jButtonid_tipo_productoColorProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_colorColorProductoUpdate")) {
				this.jButtonid_grupo_colorColorProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_colorColorProductoBusqueda")) {
				this.jButtonid_grupo_colorColorProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoColorProductoBusqueda")) {
				this.jButtoncodigoColorProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreColorProductoBusqueda")) {
				this.jButtonnombreColorProductoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoColorProducto")) {
				this.jButtonBusquedaPorCodigoColorProductoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreColorProducto")) {
				this.jButtonBusquedaPorNombreColorProductoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdGrupoColorColorProducto")) {
				this.jButtonFK_IdGrupoColorColorProductoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoProductoColorProducto")) {
				this.jButtonFK_IdTipoProductoColorProductoActionPerformed(evt);
			}
			
			;
			
			
			ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessColorProducto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaColorProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.colorproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.colorproducto);
				
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
				
				


				
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ColorProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ColorProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ColorProducto colorproductoLocal=null;
			
			if(!this.getEsControlTabla()) {
				colorproductoLocal=this.colorproducto;
			} else {
				colorproductoLocal=this.colorproductoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.colorproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.colorproducto);
				
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
							
				
				


				
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ColorProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ColorProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaColorProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoAnterior =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.colorproductoAnterior =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
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
			
			ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
			
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
			
			


			
			ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaColorProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.colorproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.colorproducto);
				
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
								
						
				


				
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ColorProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ColorProducto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.colorproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.colorproducto);
				
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
								
				
				


				
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ColorProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ColorProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaColorProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoAnterior =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.colorproductoAnterior =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.colorproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.colorproducto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaColorProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoAnterior =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.colorproductoAnterior =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaColorProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.colorproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.colorproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.colorproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.colorproducto);
				
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
							
				
				


				
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ColorProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ColorProducto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaColorProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.colorproductoAnterior =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.colorproductoAnterior =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
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
			
			ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
			
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
			
			


			
			ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaColorProductoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.colorproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.colorproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.colorproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.colorproducto);
				
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
								
				
				


				
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ColorProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ColorProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaColorProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoAnterior =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.colorproductoAnterior =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaColorProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.colorproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.colorproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaColorProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.colorproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.colorproducto);
				
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosColorProducto")) {
					jCheckBoxSeleccionarTodosColorProductoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosColorProducto")) {
					jCheckBoxSeleccionadosColorProductoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarColorProducto")) {
					
				}
				
				


				
				
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ColorProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ColorProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.colorproducto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.colorproducto);
				
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
												
				
				


				
				
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ColorProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ColorProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaColorProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.colorproductoAnterior =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.colorproductoAnterior =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaColorProductoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.colorproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.colorproducto);
				
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
				
				
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
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
			
			ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
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
			
			


			
			ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaColorProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.colorproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.colorproducto);
				
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ColorProducto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ColorProducto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.colorproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.colorproducto);
				
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
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
				
				


				
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ColorProducto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ColorProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaColorProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorproductoAnterior =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.colorproductoAnterior =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarColorProducto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosColorProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosColorProducto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.colorproducto =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.colorproducto =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.colorproducto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarColorProducto")) {
				
				}
				
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarColorProducto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosColorProducto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarColorProducto")) {
			
			}
			
			ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessColorProducto();
			
			ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
			
			if(sTipo.equals("NuevoColorProducto")) {
				jButtonNuevoColorProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarColorProducto")) {
				jButtonDuplicarColorProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarColorProducto")) {
				jButtonCopiarColorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormColorProducto")) {
				jButtonVerFormColorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesColorProducto")) {
				jButtonNuevoColorProductoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarColorProducto")) {
				jButtonModificarColorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarColorProducto")) {
				jButtonActualizarColorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarColorProducto")) {
				jButtonEliminarColorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaColorProducto")) {
				jButtonGuardarCambiosColorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarColorProducto")) {
				jButtonCancelarColorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarColorProducto")) {
				jButtonCerrarColorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosColorProducto")) {
				jButtonGuardarCambiosColorProductoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosColorProducto")) {
				jButtonNuevoGuardarCambiosColorProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByColorProducto")) {
				jButtonAbrirOrderByColorProductoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionColorProducto")) {
				jButtonRecargarInformacionColorProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresColorProducto")) {
				jButtonAnterioresColorProductoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesColorProducto")) {
				jButtonSiguientesColorProductoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idColorProductoBusqueda")) {
				this.jButtonidColorProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaColorProductoUpdate")) {
				this.jButtonid_empresaColorProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaColorProductoBusqueda")) {
				this.jButtonid_empresaColorProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_productoColorProductoUpdate")) {
				this.jButtonid_tipo_productoColorProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_productoColorProductoBusqueda")) {
				this.jButtonid_tipo_productoColorProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_colorColorProductoUpdate")) {
				this.jButtonid_grupo_colorColorProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_colorColorProductoBusqueda")) {
				this.jButtonid_grupo_colorColorProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoColorProductoBusqueda")) {
				this.jButtoncodigoColorProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreColorProductoBusqueda")) {
				this.jButtonnombreColorProductoBusquedaActionPerformed(evt);
			}
			
			ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessColorProducto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameColorProducto")) {
				closingInternalFrameColorProducto();
				
			} else if(sTipo.equals("jButtonCancelarColorProducto")) {
				JInternalFrameBase jInternalFrameDetalleFormColorProducto = (JInternalFrameBase)evt.getSource();
	            	
	            ColorProductoBeanSwingJInternalFrame jInternalFrameParent=(ColorProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormColorProducto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarColorProductoActionPerformed(null);
			}
			
			ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.colorproducto,new Object(),this.colorproductoParameterGeneral,this.colorproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormColorProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormColorProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormColorProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.colorproducto)) {
			if(!esControlTabla) {
				if(ColorProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualColorProducto(this.colorproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysColorProducto(this.colorproducto);			
				}
				
				if(this.colorproductoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualColorProducto(this.colorproducto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.colorproductoReturnGeneral=colorproductoLogic.procesarEventosColorProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.colorproductoLogic.getColorProductos(),this.colorproducto,this.colorproductoParameterGeneral,this.isEsNuevoColorProducto,classes);//this.colorproductoLogic.getColorProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanColorProducto(this.colorproductoReturnGeneral,this.colorproductoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.colorproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanColorProducto(classes,this.colorproductoReturnGeneral,this.colorproductoBean,false);
					}
						
					if(this.colorproductoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyColorProducto(this.colorproductoReturnGeneral.getColorProducto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioColorProducto(this.colorproductoReturnGeneral.getColorProducto());	
					}
						
					if(this.colorproductoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioColorProducto(this.colorproductoReturnGeneral.getColorProducto(),classes);//this.colorproductoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioColorProducto(this.colorproducto,classes);//this.colorproductoBean);									
				}
			
				if(ColorProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualColorProducto(this.colorproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysColorProducto(this.colorproducto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.colorproductoAnterior!=null) {
						this.colorproducto=this.colorproductoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.colorproductoReturnGeneral=colorproductoLogic.procesarEventosColorProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.colorproductoLogic.getColorProductos(),this.colorproducto,this.colorproductoParameterGeneral,this.isEsNuevoColorProducto,classes);//this.colorproductoLogic.getColorProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.colorproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.colorproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.colorproductoReturnGeneral.getColorProducto(),colorproductoLogic.getColorProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.colorproductoReturnGeneral.getColorProducto(),this.colorproductos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosColorProducto.repaint();
				
				//((AbstractTableModel) this.jTableDatosColorProducto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosColorProducto();
			}
		}
	}
	
	public void actualizarVisualTableDatosColorProducto() throws Exception {
		
		ColorProductoModel colorproductoModel=(ColorProductoModel)this.jTableDatosColorProducto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			colorproductoModel.colorproductos=this.colorproductoLogic.getColorProductos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			colorproductoModel.colorproductos=this.colorproductos;
		}
		
		
		((ColorProductoModel) this.jTableDatosColorProducto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaColorProducto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcolorproductoAnterior(),this.colorproductoLogic.getColorProductos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcolorproductoAnterior(),this.colorproductos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosColorProducto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioColorProducto(ColorProducto colorproducto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(colorproducto.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
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
										
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.colorproducto,new Object(),generalEntityParameterGeneral,this.colorproductoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.colorproductoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ColorProductoConstantesFunciones.getClassesRelationshipsOfColorProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ColorProductoConstantesFunciones.getClassesRelationshipsFromStringsOfColorProducto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormColorProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ColorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.colorproducto,new Object(),generalEntityParameterGeneral,this.colorproductoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioColorProducto(ColorProductoBean colorproductoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(colorproducto.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanColorProducto(ArrayList<Classe> classes,ColorProductoReturnGeneral colorproductoReturnGeneral,ColorProductoBean colorproductoBean,Boolean conDefault) throws Exception {
		
			this.colorproductoBean.setParametroInventarioDefectos(colorproductoReturnGeneral.getColorProducto().getParametroInventarioDefectos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualColorProducto(ColorProducto colorproducto,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					colorproducto.setParametroInventarioDefectos(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.colorproducto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormColorProducto = new ColorProductoDetalleFormJInternalFrame(jDesktopPane,this.colorproductoSessionBean.getConGuardarRelaciones(),this.colorproductoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormColorProducto);
		this.jInternalFrameDetalleFormColorProducto.setVisible(false);
		this.jInternalFrameDetalleFormColorProducto.setSelected(false);						
		
		this.jInternalFrameDetalleFormColorProducto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormColorProducto.colorproductoLogic=this.colorproductoLogic;
		
		this.cargarCombosFrameForeignKeyColorProducto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleColorProducto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleColorProducto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyColorProducto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyColorProducto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormColorProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarColorProducto"));
		
		this.jInternalFrameDetalleFormColorProducto.jButtonModificarColorProducto.addActionListener(new ButtonActionListener(this,"ModificarColorProducto"));

		
		this.jInternalFrameDetalleFormColorProducto.jButtonModificarToolBarColorProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarColorProducto"));
					
		this.jInternalFrameDetalleFormColorProducto.jMenuItemModificarColorProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarColorProducto"));		
		
		
		
		this.jInternalFrameDetalleFormColorProducto.jButtonActualizarColorProducto.addActionListener (new ButtonActionListener(this,"ActualizarColorProducto"));
		
		
		this.jInternalFrameDetalleFormColorProducto.jButtonActualizarToolBarColorProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarColorProducto"));
						
		this.jInternalFrameDetalleFormColorProducto.jMenuItemActualizarColorProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarColorProducto"));		
		
		
		
		this.jInternalFrameDetalleFormColorProducto.jButtonEliminarColorProducto.addActionListener (new ButtonActionListener(this,"EliminarColorProducto"));
		
		
		this.jInternalFrameDetalleFormColorProducto.jButtonEliminarToolBarColorProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarColorProducto"));
								
		this.jInternalFrameDetalleFormColorProducto.jMenuItemEliminarColorProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarColorProducto"));		
		
		
		
		this.jInternalFrameDetalleFormColorProducto.jButtonCancelarColorProducto.addActionListener (new ButtonActionListener(this,"CancelarColorProducto"));
		
		
		this.jInternalFrameDetalleFormColorProducto.jButtonCancelarToolBarColorProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarColorProducto"));
					
		this.jInternalFrameDetalleFormColorProducto.jMenuItemCancelarColorProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarColorProducto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormColorProducto.jMenuItemDetalleCerrarColorProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarColorProducto"));		
		
		
		
		this.jInternalFrameDetalleFormColorProducto.jButtonGuardarCambiosToolBarColorProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarColorProducto"));
		
		
		
		this.jInternalFrameDetalleFormColorProducto.jButtonGuardarCambiosToolBarColorProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarColorProducto"));
		
		
		
		this.jInternalFrameDetalleFormColorProducto.jComboBoxTiposAccionesFormularioColorProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioColorProducto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormColorProducto.jButtonidColorProductoBusqueda.addActionListener(new ButtonActionListener(this,"idColorProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormColorProducto.jButtonid_empresaColorProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaColorProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormColorProducto.jButtonid_empresaColorProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaColorProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormColorProducto.jButtonid_tipo_productoColorProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_productoColorProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormColorProducto.jButtonid_tipo_productoColorProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_productoColorProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormColorProducto.jButtonid_grupo_colorColorProductoUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_colorColorProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormColorProducto.jButtonid_grupo_colorColorProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_colorColorProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormColorProducto.jButtoncodigoColorProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoColorProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormColorProducto.jButtonnombreColorProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreColorProductoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormColorProducto.jTabbedPaneRelacionesColorProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesColorProducto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameColorProducto"));
		
		if(this.jInternalFrameDetalleFormColorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarColorProducto"));
		}
		
		this.jTableDatosColorProducto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarColorProducto"));
		
		this.jTableDatosColorProducto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarColorProducto"));
		
		this.jButtonNuevoColorProducto.addActionListener(new ButtonActionListener(this,"NuevoColorProducto"));
		
		this.jButtonDuplicarColorProducto.addActionListener(new ButtonActionListener(this,"DuplicarColorProducto"));
		
		this.jButtonCopiarColorProducto.addActionListener(new ButtonActionListener(this,"CopiarColorProducto"));
		
		this.jButtonVerFormColorProducto.addActionListener(new ButtonActionListener(this,"VerFormColorProducto"));
		
		
		this.jButtonNuevoToolBarColorProducto.addActionListener(new ButtonActionListener(this,"NuevoToolBarColorProducto"));
			
		this.jButtonDuplicarToolBarColorProducto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarColorProducto"));
			
		this.jMenuItemNuevoColorProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoColorProducto"));
			
		this.jMenuItemDuplicarColorProducto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarColorProducto"));		
		
		
		this.jButtonNuevoRelacionesColorProducto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesColorProducto"));
		
		
		this.jButtonNuevoRelacionesToolBarColorProducto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarColorProducto"));
			
		this.jMenuItemNuevoRelacionesColorProducto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesColorProducto"));		
		
		
		if(this.jInternalFrameDetalleFormColorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorProducto.jButtonModificarColorProducto.addActionListener(new ButtonActionListener(this,"ModificarColorProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormColorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorProducto.jButtonModificarToolBarColorProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarColorProducto"));
			
			this.jInternalFrameDetalleFormColorProducto.jMenuItemModificarColorProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarColorProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormColorProducto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormColorProducto.jButtonActualizarColorProducto.addActionListener (new ButtonActionListener(this,"ActualizarColorProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormColorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorProducto.jButtonActualizarToolBarColorProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarColorProducto"));
				
			this.jInternalFrameDetalleFormColorProducto.jMenuItemActualizarColorProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarColorProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormColorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorProducto.jButtonEliminarColorProducto.addActionListener (new ButtonActionListener(this,"EliminarColorProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormColorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorProducto.jButtonEliminarToolBarColorProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarColorProducto"));
						
			this.jInternalFrameDetalleFormColorProducto.jMenuItemEliminarColorProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarColorProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormColorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorProducto.jButtonCancelarColorProducto.addActionListener (new ButtonActionListener(this,"CancelarColorProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormColorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorProducto.jButtonCancelarToolBarColorProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarColorProducto"));
			
			this.jInternalFrameDetalleFormColorProducto.jMenuItemCancelarColorProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarColorProducto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarColorProducto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarColorProducto"));		
		
		
		this.jButtonCerrarColorProducto.addActionListener (new ButtonActionListener(this,"CerrarColorProducto"));
		
		
		this.jButtonCerrarToolBarColorProducto.addActionListener (new ButtonActionListener(this,"CerrarToolBarColorProducto"));
			
		this.jMenuItemCerrarColorProducto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarColorProducto"));
			
		if(this.jInternalFrameDetalleFormColorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorProducto.jMenuItemDetalleCerrarColorProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarColorProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormColorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorProducto.jButtonGuardarCambiosColorProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosColorProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormColorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorProducto.jButtonGuardarCambiosToolBarColorProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarColorProducto"));
		}
		
		this.jButtonCopiarToolBarColorProducto.addActionListener (new ButtonActionListener(this,"CopiarToolBarColorProducto"));
			
		this.jButtonVerFormToolBarColorProducto.addActionListener (new ButtonActionListener(this,"VerFormToolBarColorProducto"));
		
		this.jMenuItemGuardarCambiosColorProducto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosColorProducto"));
			
		this.jMenuItemCopiarColorProducto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarColorProducto"));		
		
		this.jMenuItemVerFormColorProducto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormColorProducto"));		
		
		
		this.jButtonGuardarCambiosTablaColorProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaColorProducto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarColorProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarColorProducto"));
			
		this.jMenuItemGuardarCambiosTablaColorProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaColorProducto"));		
		
		
		
		this.jButtonRecargarInformacionColorProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionColorProducto"));
					
		this.jButtonRecargarInformacionToolBarColorProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarColorProducto"));
		
		this.jMenuItemRecargarInformacionColorProducto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionColorProducto"));		
		
		
		
		this.jButtonAnterioresColorProducto.addActionListener (new ButtonActionListener(this,"AnterioresColorProducto"));
		
		
		this.jButtonAnterioresToolBarColorProducto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarColorProducto"));
		
		this.jMenuItemAnterioresColorProducto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresColorProducto"));		
		
		
		this.jButtonSiguientesColorProducto.addActionListener (new ButtonActionListener(this,"SiguientesColorProducto"));
		
		
		this.jButtonSiguientesToolBarColorProducto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarColorProducto"));
			
		this.jMenuItemSiguientesColorProducto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesColorProducto"));
			
		this.jMenuItemAbrirOrderByColorProducto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByColorProducto"));
			
		this.jMenuItemMostrarOcultarColorProducto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarColorProducto"));
			
		this.jMenuItemDetalleAbrirOrderByColorProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByColorProducto"));
			
		this.jMenuItemDetalleMostarOcultarColorProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarColorProducto"));		
		
		
		this.jButtonNuevoGuardarCambiosColorProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosColorProducto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarColorProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarColorProducto"));
			
		this.jMenuItemNuevoGuardarCambiosColorProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosColorProducto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosColorProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosColorProducto"));

		this.jCheckBoxSeleccionadosColorProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosColorProducto"));
		
		if(this.jInternalFrameDetalleFormColorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorProducto.jComboBoxTiposAccionesFormularioColorProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioColorProducto"));
		}
		
		
		this.jComboBoxTiposRelacionesColorProducto.addActionListener (new ButtonActionListener(this,"TiposRelacionesColorProducto"));
			
		this.jComboBoxTiposAccionesColorProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesColorProducto"));
					
		this.jComboBoxTiposSeleccionarColorProducto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarColorProducto"));
			
		this.jTextFieldValorCampoGeneralColorProducto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralColorProducto"));		
		
		
		if(this.jInternalFrameDetalleFormColorProducto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormColorProducto.jButtonidColorProductoBusqueda.addActionListener(new ButtonActionListener(this,"idColorProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormColorProducto.jButtonid_empresaColorProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaColorProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormColorProducto.jButtonid_empresaColorProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaColorProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormColorProducto.jButtonid_tipo_productoColorProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_productoColorProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormColorProducto.jButtonid_tipo_productoColorProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_productoColorProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormColorProducto.jButtonid_grupo_colorColorProductoUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_colorColorProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormColorProducto.jButtonid_grupo_colorColorProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_colorColorProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormColorProducto.jButtoncodigoColorProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoColorProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormColorProducto.jButtonnombreColorProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreColorProductoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoColorProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoColorProducto"));

			this.jButtonBusquedaPorNombreColorProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreColorProducto"));

			this.jButtonFK_IdGrupoColorColorProducto.addActionListener(new ButtonActionListener(this,"FK_IdGrupoColorColorProducto"));

			this.jButtonFK_IdTipoProductoColorProducto.addActionListener(new ButtonActionListener(this,"FK_IdTipoProductoColorProducto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoColorProducto!=null) {
				this.jInternalFrameReporteDinamicoColorProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoColorProducto"));
				this.jInternalFrameReporteDinamicoColorProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoColorProducto"));
				this.jInternalFrameReporteDinamicoColorProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoColorProducto"));
			}
			
			//this.jButtonCerrarReporteDinamicoColorProducto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoColorProducto"));				
			//this.jButtonGenerarReporteDinamicoColorProducto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoColorProducto"));
			//this.jButtonGenerarExcelReporteDinamicoColorProducto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoColorProducto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionColorProducto!=null) {
				this.jInternalFrameImportacionColorProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionColorProducto"));
				this.jInternalFrameImportacionColorProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionColorProducto"));
				this.jInternalFrameImportacionColorProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionColorProducto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByColorProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByColorProducto"));
			
			this.jButtonAbrirOrderByToolBarColorProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarColorProducto"));			
			
			if(this.jInternalFrameOrderByColorProducto!=null) {
				this.jInternalFrameOrderByColorProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByColorProducto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormColorProducto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormColorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorProducto.jTabbedPaneRelacionesColorProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesColorProducto"));
		
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
            		closingInternalFrameColorProducto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormColorProducto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormColorProducto = (JInternalFrameBase)event.getSource();
	            	
	            ColorProductoBeanSwingJInternalFrame jInternalFrameParent=(ColorProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormColorProducto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarColorProductoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosColorProducto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosColorProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosColorProducto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosColorProducto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoColorProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoColorProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoColorProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoColorProducto";
		inputMap = this.jButtonNuevoColorProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoColorProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoColorProductoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoColorProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoColorProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoColorProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesColorProducto";
		inputMap = this.jButtonNuevoRelacionesColorProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesColorProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoColorProductoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarColorProducto";
		inputMap = this.jButtonModificarColorProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarColorProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarColorProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarColorProducto";
		inputMap = this.jButtonActualizarColorProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarColorProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarColorProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarColorProducto";
		inputMap = this.jButtonEliminarColorProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarColorProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarColorProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarColorProducto";
		inputMap = this.jButtonCancelarColorProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarColorProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarColorProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarColorProducto";
		inputMap = this.jButtonCerrarColorProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarColorProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarColorProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormColorProducto.jButtonGuardarCambiosColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosColorProducto";
		inputMap = this.jInternalFrameDetalleFormColorProducto.jButtonGuardarCambiosColorProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormColorProducto.jButtonGuardarCambiosColorProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosColorProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosColorProducto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosColorProductoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesColorProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesColorProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarColorProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarColorProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralColorProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralColorProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormColorProducto.jButtonidColorProductoBusqueda.addActionListener(new ButtonActionListener(this,"idColorProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormColorProducto.jButtonid_empresaColorProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaColorProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormColorProducto.jButtonid_empresaColorProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaColorProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormColorProducto.jButtonid_tipo_productoColorProductoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_productoColorProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormColorProducto.jButtonid_tipo_productoColorProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_productoColorProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormColorProducto.jButtonid_grupo_colorColorProductoUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_colorColorProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormColorProducto.jButtonid_grupo_colorColorProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_colorColorProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormColorProducto.jButtoncodigoColorProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoColorProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormColorProducto.jButtonnombreColorProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreColorProductoBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoColorProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoColorProducto"));

		this.jButtonBusquedaPorNombreColorProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreColorProducto"));

		this.jButtonFK_IdGrupoColorColorProducto.addActionListener(new ButtonActionListener(this,"FK_IdGrupoColorColorProducto"));

		this.jButtonFK_IdTipoProductoColorProducto.addActionListener(new ButtonActionListener(this,"FK_IdTipoProductoColorProducto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionColorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionColorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarColorProductoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarColorProducto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosColorProducto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ColorProducto colorproductoAux:this.colorproductoLogic.getColorProductos()) {
					colorproductoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ColorProducto colorproductoAux:colorproductos) {
					colorproductoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosColorProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingColorProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ColorProducto colorproductoAux:this.colorproductoLogic.getColorProductos()) {
						colorproductoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ColorProducto colorproductoAux:colorproductos) {
						colorproductoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ColorProducto colorproductoAux:this.colorproductoLogic.getColorProductos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ColorProducto colorproductoAux:colorproductos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaColorProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosColorProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosColorProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosColorProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosColorProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingColorProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosColorProducto.getSelectedRows();
			
			ColorProducto colorproductoLocal=new ColorProducto();
			
			//this.seleccionarTodosColorProducto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					colorproductoLocal =(ColorProducto) this.colorproductoLogic.getColorProductos().toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					colorproductoLocal =(ColorProducto) this.colorproductos.toArray()[this.jTableDatosColorProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				colorproductoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ColorProducto colorproductoAux:this.colorproductoLogic.getColorProductos()) {
						colorproductoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ColorProducto colorproductoAux:colorproductos) {
						colorproductoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaColorProducto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosColorProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosColorProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosColorProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualColorProductoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarColorProductoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralColorProductoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingColorProducto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralColorProducto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ColorProducto colorproductoAux:this.colorproductoLogic.getColorProductos()) {
				
						if(sTipoSeleccionar.equals(ColorProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							colorproductoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ColorProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							colorproductoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ColorProducto colorproductoAux:colorproductos) {
					
						if(sTipoSeleccionar.equals(ColorProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							colorproductoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ColorProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							colorproductoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaColorProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesColorProductoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingColorProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioColorProducto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesColorProducto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormColorProducto.jComboBoxTiposAccionesFormularioColorProducto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteColorProducto) {				
					conSplash=true;//false;										
					
					//this.startProcessColorProducto(conSplash);
				
					this.generarReporteColorProductosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesColorProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormColorProducto.jComboBoxTiposAccionesFormularioColorProducto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoColorProductosSeleccionados();
				//this.jComboBoxTiposAccionesColorProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoColorProductosSeleccionados(false);
				//this.jComboBoxTiposAccionesColorProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoColorProductosSeleccionados(true);
				//this.jComboBoxTiposAccionesColorProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessColorProducto();
				
				this.exportarColorProductosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesColorProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormColorProducto.jComboBoxTiposAccionesFormularioColorProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionColorProductos();
				//this.importarColorProductos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesColorProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormColorProducto.jComboBoxTiposAccionesFormularioColorProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessColorProducto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelColorProductosSeleccionados();
				//this.jComboBoxTiposAccionesColorProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Color Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessColorProducto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoColorProducto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyColorProducto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Color Producto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesColorProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormColorProducto.jComboBoxTiposAccionesFormularioColorProducto.setSelectedIndex(0);					
				}	
			} 			
			else if(ColorProductoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteColorProducto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessColorProducto(conSplash);
					
						//this.actualizarParametrosGeneralColorProducto();
						
						this.generarReporteProcesoAccionColorProductosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesColorProducto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormColorProducto.jComboBoxTiposAccionesFormularioColorProducto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ColorProductoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Color ProductoES SELECCIONADOS?", "MANTENIMIENTO DE Color Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessColorProducto();
				
						this.actualizarParametrosGeneralColorProducto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.colorproductoReturnGeneral=colorproductoLogic.procesarAccionColorProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.colorproductoLogic.getColorProductos(),this.colorproductoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarColorProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesColorProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormColorProducto.jComboBoxTiposAccionesFormularioColorProducto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralColorProducto();
					
					ColorProductoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarColorProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesColorProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormColorProducto.jComboBoxTiposAccionesFormularioColorProducto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessColorProducto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesColorProductoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessColorProducto();
			
			if(this.jInternalFrameDetalleFormColorProducto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ColorProducto> colorproductosSeleccionados=new ArrayList<ColorProducto>();		
			ColorProducto colorproducto=new ColorProducto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingColorProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesColorProducto.getSelectedItem();
			
			
			
			
			colorproductosSeleccionados=this.getColorProductosSeleccionados(true);
			//this.sTipoAccion;
			
			if(colorproductosSeleccionados.size()==1) {
				for(ColorProducto colorproductoAux:colorproductosSeleccionados) {
					colorproducto=colorproductoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Parametro Inventario Defecto")) {
					jButtonParametroInventarioDefectoActionPerformed(null,rowIndex,true,false,colorproducto);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessColorProducto();
			
      		//this.finishProcessColorProducto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarColorProductoReturnGeneral() throws Exception {
		if(this.colorproductoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.colorproductoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.colorproductoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.colorproductoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.colorproductoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.colorproductoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingColorProducto(false);
		}
		
		if(this.colorproductoReturnGeneral.getConRetornoLista() || this.colorproductoReturnGeneral.getConRetornoObjeto()) {
			if(this.colorproductoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.colorproductoLogic.setColorProductos(this.colorproductoReturnGeneral.getColorProductos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.colorproductoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.colorproductoLogic.setColorProducto(this.colorproductoReturnGeneral.getColorProducto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingColorProducto(false);
		}
	}
	
	public void actualizarParametrosGeneralColorProducto() throws Exception {
		
		
	}
	
	public ArrayList<ColorProducto> getColorProductosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ColorProducto> colorproductosSeleccionados=new ArrayList<ColorProducto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioColorProducto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ColorProducto colorproductoAux:colorproductoLogic.getColorProductos()) {
					if(colorproductoAux.getIsSelected()) {
						colorproductosSeleccionados.add(colorproductoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ColorProducto colorproductoAux:this.colorproductos) {
					if(colorproductoAux.getIsSelected()) {
						colorproductosSeleccionados.add(colorproductoAux);				
					}
				}
			}
			
			if(colorproductosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						colorproductosSeleccionados.addAll(this.colorproductoLogic.getColorProductos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						colorproductosSeleccionados.addAll(this.colorproductos);				
					}
				}
			}
		} else {
			colorproductosSeleccionados.add(this.colorproducto);
		}
		
		return colorproductosSeleccionados;
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
	
	public void generarReporteColorProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalColorProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoColorProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoColorProductosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoColorProductosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesColorProductosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Color Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesColorProductosSeleccionados() throws Exception {
		ArrayList<ColorProducto> colorproductosSeleccionados=new ArrayList<ColorProducto>();		
		
		colorproductosSeleccionados=this.getColorProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteColorProductos("Todos",colorproductosSeleccionados);
		
	}	
	
	public void generarReporteNormalColorProductosSeleccionados() throws Exception {
		ArrayList<ColorProducto> colorproductosSeleccionados=new ArrayList<ColorProducto>();		
		
		colorproductosSeleccionados=this.getColorProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteColorProductos("Todos",colorproductosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionColorProductosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ColorProducto> colorproductosSeleccionados=new ArrayList<ColorProducto>();
		
		colorproductosSeleccionados=this.getColorProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteColorProductos("Todos",colorproductosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoColorProductosSeleccionados() throws Exception {
		ArrayList<ColorProducto> colorproductosSeleccionados=new ArrayList<ColorProducto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoColorProducto();
		
		
		colorproductosSeleccionados=this.getColorProductosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoColorProducto();
		
		
		//this.generarReporteColorProductos("Todos",colorproductosSeleccionados ,colorproductoImplementable,colorproductoImplementableHome);
	}
	
	public void mostrarImportacionColorProductos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionColorProducto();
		
		this.abrirFrameImportacionColorProducto();		
		
			
		//this.generarReporteColorProductos("Todos",colorproductosSeleccionados ,colorproductoImplementable,colorproductoImplementableHome);
	}
	
	public void importarColorProductos() throws Exception {		
	
	}
	
	public void exportarColorProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelColorProductosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoColorProductosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlColorProductosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Color Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoColorProductosSeleccionados() throws Exception {
		ArrayList<ColorProducto> colorproductosSeleccionados=new ArrayList<ColorProducto>();		
		
		colorproductosSeleccionados=this.getColorProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"colorproducto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarColorProducto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ColorProducto colorproductoAux:colorproductosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarColorProducto(colorproductoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//colorproductoAux.setsDetalleGeneralEntityReporte(colorproductoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.colorproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Color Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarColorProducto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ColorProductoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ColorProductoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ColorProductoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ColorProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ColorProductoConstantesFunciones.LABEL_IDGRUPOCOLOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ColorProductoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ColorProductoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarColorProducto(ColorProducto colorproducto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=colorproducto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=colorproducto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=colorproducto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=colorproducto.gettipoproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=colorproducto.getgrupocolor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=colorproducto.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=colorproducto.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelColorProductosSeleccionados() throws Exception {
		ArrayList<ColorProducto> colorproductosSeleccionados=new ArrayList<ColorProducto>();		
		
		colorproductosSeleccionados=this.getColorProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"colorproducto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ColorProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelColorProducto(row);				
				iRow++;
			}				
			
			for(ColorProducto colorproductoAux:colorproductosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelColorProducto(colorproductoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.colorproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Color Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlColorProductosSeleccionados() throws Exception {
		ArrayList<ColorProducto> colorproductosSeleccionados=new ArrayList<ColorProducto>();		
		
		colorproductosSeleccionados=this.getColorProductosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"colorproducto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("colorproductos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("colorproducto");
			//elementRoot.appendChild(element);
		
			for(ColorProducto colorproductoAux:colorproductosSeleccionados) {
				element = document.createElement("colorproducto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlColorProducto(colorproductoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.colorproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Color Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelColorProducto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ColorProductoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ColorProductoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ColorProductoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ColorProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ColorProductoConstantesFunciones.LABEL_IDGRUPOCOLOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ColorProductoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ColorProductoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelColorProducto(ColorProducto colorproducto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(colorproducto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(colorproducto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(colorproducto.gettipoproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(colorproducto.getgrupocolor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(colorproducto.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(colorproducto.getnombre());				
	}
	
	public void setFilaDatosExportarXmlColorProducto(ColorProducto colorproducto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ColorProductoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(colorproducto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ColorProductoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(colorproducto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ColorProductoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(colorproducto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtipoproducto_descripcion = document.createElement(ColorProductoConstantesFunciones.IDTIPOPRODUCTO);
		elementtipoproducto_descripcion.appendChild(document.createTextNode(colorproducto.gettipoproducto_descripcion()));
		element.appendChild(elementtipoproducto_descripcion);

		Element elementgrupocolor_descripcion = document.createElement(ColorProductoConstantesFunciones.IDGRUPOCOLOR);
		elementgrupocolor_descripcion.appendChild(document.createTextNode(colorproducto.getgrupocolor_descripcion()));
		element.appendChild(elementgrupocolor_descripcion);

		Element elementcodigo = document.createElement(ColorProductoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(colorproducto.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ColorProductoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(colorproducto.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoColorProductosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ColorProducto> colorproductosSeleccionados=new ArrayList<ColorProducto>();
		
		colorproductosSeleccionados=this.getColorProductosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoColorProducto(colorproductosSeleccionados);
		
		this.generarReporteColorProductos("Todos",colorproductosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoColorProducto(ArrayList<ColorProducto> colorproductosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ColorProducto colorproductoAux:colorproductosSeleccionados) {
				colorproductoAux.setsDetalleGeneralEntityReporte(colorproductoAux.toString());
			
				if(sTipoSeleccionar.equals(ColorProductoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					colorproductoAux.setsDescripcionGeneralEntityReporte1(colorproductoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ColorProductoConstantesFunciones.LABEL_IDTIPOPRODUCTO)) {
					existe=true;
					colorproductoAux.setsDescripcionGeneralEntityReporte1(colorproductoAux.gettipoproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ColorProductoConstantesFunciones.LABEL_IDGRUPOCOLOR)) {
					existe=true;
					colorproductoAux.setsDescripcionGeneralEntityReporte1(colorproductoAux.getgrupocolor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ColorProductoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					colorproductoAux.setsDescripcionGeneralEntityReporte1(colorproductoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ColorProductoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					colorproductoAux.setsDescripcionGeneralEntityReporte1(colorproductoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesColorProducto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoColorProducto=true;
				this.isVisibilidadCeldaNuevoRelacionesColorProducto=true;
				this.isVisibilidadCeldaGuardarCambiosColorProducto=true;
			}
			
			this.isVisibilidadCeldaModificarColorProducto=false;
			this.isVisibilidadCeldaActualizarColorProducto=false;
			this.isVisibilidadCeldaEliminarColorProducto=false;
			this.isVisibilidadCeldaCancelarColorProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarColorProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarColorProducto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoColorProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesColorProducto=false;
			this.isVisibilidadCeldaGuardarCambiosColorProducto=false;
			this.isVisibilidadCeldaModificarColorProducto=false;
			this.isVisibilidadCeldaActualizarColorProducto=true;
			this.isVisibilidadCeldaEliminarColorProducto=false;
			this.isVisibilidadCeldaCancelarColorProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarColorProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarColorProducto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoColorProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesColorProducto=false;
			this.isVisibilidadCeldaGuardarCambiosColorProducto=false;
			this.isVisibilidadCeldaModificarColorProducto=false;
			this.isVisibilidadCeldaActualizarColorProducto=true;
			this.isVisibilidadCeldaEliminarColorProducto=true;
			this.isVisibilidadCeldaCancelarColorProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarColorProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarColorProducto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoColorProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesColorProducto=false;
			this.isVisibilidadCeldaGuardarCambiosColorProducto=false;
			this.isVisibilidadCeldaModificarColorProducto=false;
			this.isVisibilidadCeldaActualizarColorProducto=true;
			this.isVisibilidadCeldaEliminarColorProducto=false;
			this.isVisibilidadCeldaCancelarColorProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarColorProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarColorProducto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoColorProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesColorProducto=true;
			this.isVisibilidadCeldaGuardarCambiosColorProducto=true;
			this.isVisibilidadCeldaModificarColorProducto=false;
			this.isVisibilidadCeldaActualizarColorProducto=false;
			this.isVisibilidadCeldaEliminarColorProducto=false;
			this.isVisibilidadCeldaCancelarColorProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarColorProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarColorProducto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoColorProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesColorProducto=false;
			this.isVisibilidadCeldaGuardarCambiosColorProducto=false;
			this.isVisibilidadCeldaActualizarColorProducto=false;
			this.isVisibilidadCeldaEliminarColorProducto=false;
			this.isVisibilidadCeldaCancelarColorProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarColorProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarColorProducto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoColorProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesColorProducto=false;
			this.isVisibilidadCeldaGuardarCambiosColorProducto=false;
			this.isVisibilidadCeldaModificarColorProducto=true;
			this.isVisibilidadCeldaActualizarColorProducto=false;
			this.isVisibilidadCeldaEliminarColorProducto=false;
			this.isVisibilidadCeldaCancelarColorProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarColorProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarColorProducto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ColorProductoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoColorProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesColorProducto=true;
			this.isVisibilidadCeldaGuardarCambiosColorProducto=true;
		} else {
			this.actualizarEstadoPanelsColorProducto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarColorProducto=false;
			//this.isVisibilidadCeldaVerFormColorProducto=false;
			this.isVisibilidadCeldaDuplicarColorProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!colorproductoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesColorProducto=false;
		} else {
			this.isVisibilidadCeldaNuevoColorProducto=false;
			this.isVisibilidadCeldaGuardarCambiosColorProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(colorproductoSessionBean.getEsGuardarRelacionado()) {
			if(!colorproductoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesColorProducto=false;												
			}
			
			this.jButtonCerrarColorProducto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesColorProducto=false;
		}
		
		if(!this.permiteMantenimiento(this.colorproducto)) {
			this.isVisibilidadCeldaActualizarColorProducto=false;
			this.isVisibilidadCeldaEliminarColorProducto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesColorProducto() {
		this.isVisibilidadCeldaNuevoColorProducto=false;
		this.isVisibilidadCeldaGuardarCambiosColorProducto=false;
	}
	
	public void actualizarEstadoPanelsColorProducto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionColorProducto!=null) {
				this.jScrollPanelDatosEdicionColorProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasColorProducto!=null) {
				this.jTabbedPaneBusquedasColorProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosColorProducto!=null) {
				this.jScrollPanelDatosColorProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionColorProducto!=null) {
				this.jPanelPaginacionColorProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesColorProducto!=null) {
				this.jPanelParametrosReportesColorProducto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionColorProducto!=null) {
				this.jScrollPanelDatosEdicionColorProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasColorProducto!=null) {
				this.jTabbedPaneBusquedasColorProducto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosColorProducto!=null) {
				this.jScrollPanelDatosColorProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionColorProducto!=null) {
				this.jPanelPaginacionColorProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesColorProducto!=null) {
				this.jPanelParametrosReportesColorProducto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionColorProducto!=null) {
				this.jScrollPanelDatosEdicionColorProducto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasColorProducto!=null) {
				this.jTabbedPaneBusquedasColorProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosColorProducto!=null) {
				this.jScrollPanelDatosColorProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionColorProducto!=null) {
				this.jPanelPaginacionColorProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesColorProducto!=null) {
				this.jPanelParametrosReportesColorProducto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionColorProducto!=null) {
				this.jScrollPanelDatosEdicionColorProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasColorProducto!=null) {
				this.jTabbedPaneBusquedasColorProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosColorProducto!=null) {
				this.jScrollPanelDatosColorProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionColorProducto!=null) {
				this.jPanelPaginacionColorProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesColorProducto!=null) {
				this.jPanelParametrosReportesColorProducto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionColorProducto!=null) {
				this.jScrollPanelDatosEdicionColorProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasColorProducto!=null) {
				this.jTabbedPaneBusquedasColorProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosColorProducto!=null) {
				this.jScrollPanelDatosColorProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionColorProducto!=null) {
				this.jPanelPaginacionColorProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesColorProducto!=null) {
				this.jPanelParametrosReportesColorProducto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionColorProducto!=null) {
				this.jScrollPanelDatosEdicionColorProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasColorProducto!=null) {
				this.jTabbedPaneBusquedasColorProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosColorProducto!=null) {
				this.jScrollPanelDatosColorProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionColorProducto!=null) {
				this.jPanelPaginacionColorProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesColorProducto!=null) {
				this.jPanelParametrosReportesColorProducto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionColorProducto!=null) {
				this.jScrollPanelDatosEdicionColorProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasColorProducto!=null) {
				this.jTabbedPaneBusquedasColorProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosColorProducto!=null) {
				this.jScrollPanelDatosColorProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionColorProducto!=null) {
				this.jPanelPaginacionColorProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesColorProducto!=null) {
				this.jPanelParametrosReportesColorProducto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.colorproductoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasColorProducto!=null) {
					this.jTabbedPaneBusquedasColorProducto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesColorProducto!=null) {
				this.jPanelParametrosReportesColorProducto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.colorproductoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasColorProducto!=null) {
				this.jTabbedPaneBusquedasColorProducto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesColorProducto!=null) {
				this.jPanelParametrosReportesColorProducto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasColorProducto.remove(jPanelBusquedaPorCodigoColorProducto);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasColorProducto.remove(jPanelBusquedaPorNombreColorProducto);}

			this.isVisibilidadFK_IdGrupoColor=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdGrupoColor) {this.jTabbedPaneBusquedasColorProducto.remove(jPanelFK_IdGrupoColorColorProducto);}

			this.isVisibilidadFK_IdTipoProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoProducto) {this.jTabbedPaneBusquedasColorProducto.remove(jPanelFK_IdTipoProductoColorProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoProducto(Boolean isParaTipoProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoProductoNegation=!isParaTipoProducto;

			this.isVisibilidadBusquedaPorCodigo=isParaTipoProductoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasColorProducto.remove(jPanelBusquedaPorCodigoColorProducto);}

			this.isVisibilidadBusquedaPorNombre=isParaTipoProductoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasColorProducto.remove(jPanelBusquedaPorNombreColorProducto);}

			this.isVisibilidadFK_IdGrupoColor=isParaTipoProductoNegation;
			if(!this.isVisibilidadFK_IdGrupoColor) {this.jTabbedPaneBusquedasColorProducto.remove(jPanelFK_IdGrupoColorColorProducto);}

			this.isVisibilidadFK_IdTipoProducto=isParaTipoProducto;
			if(!this.isVisibilidadFK_IdTipoProducto) {this.jTabbedPaneBusquedasColorProducto.remove(jPanelFK_IdTipoProductoColorProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaGrupoColor(Boolean isParaGrupoColor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaGrupoColorNegation=!isParaGrupoColor;

			this.isVisibilidadBusquedaPorCodigo=isParaGrupoColorNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasColorProducto.remove(jPanelBusquedaPorCodigoColorProducto);}

			this.isVisibilidadBusquedaPorNombre=isParaGrupoColorNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasColorProducto.remove(jPanelBusquedaPorNombreColorProducto);}

			this.isVisibilidadFK_IdGrupoColor=isParaGrupoColor;
			if(!this.isVisibilidadFK_IdGrupoColor) {this.jTabbedPaneBusquedasColorProducto.remove(jPanelFK_IdGrupoColorColorProducto);}

			this.isVisibilidadFK_IdTipoProducto=isParaGrupoColorNegation;
			if(!this.isVisibilidadFK_IdTipoProducto) {this.jTabbedPaneBusquedasColorProducto.remove(jPanelFK_IdTipoProductoColorProducto);}
		}
		
	}
	
	

	public String registrarSesionColorProductoParaParametroInventarioDefectos() throws Exception {
		Boolean isPaginaPopupParametroInventarioDefecto=false;

		try {

			if(this.colorproductoSessionBean==null) {
				this.colorproductoSessionBean=new ColorProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoSessionBean==null) {
				this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoSessionBean.setsPathNavegacionActual(colorproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroInventarioDefecto=this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(true);
			this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(ColorProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionColorProducto(true);
			this.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoSessionBean.setlidColorProductoActual(this.idColorProductoActual);

			colorproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyColorProducto(true);
			colorproductoSessionBean.setlIdColorProductoActualForeignKey(this.idColorProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ColorProductoSessionBean colorproductoSessionBean=new ColorProductoSessionBean();
		
		if(this.colorproductoSessionBean==null) {
			this.colorproductoSessionBean=new ColorProductoSessionBean();
		}
		
		this.colorproductoSessionBean.setsUltimaBusquedaColorProducto(this.getsAccionBusqueda());
		this.colorproductoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.colorproductoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			colorproductoSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			colorproductoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			colorproductoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdGrupoColor")) {
			colorproductoSessionBean.setid_grupo_color(this.getid_grupo_colorFK_IdGrupoColor());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoProducto")) {
			colorproductoSessionBean.setid_tipo_producto(this.getid_tipo_productoFK_IdTipoProducto());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ColorProductoSessionBean colorproductoSessionBean=new ColorProductoSessionBean();
		
		if(this.colorproductoSessionBean==null) {
			this.colorproductoSessionBean=new ColorProductoSessionBean();
		}
		
		if(this.colorproductoSessionBean.getsUltimaBusquedaColorProducto()!=null&&!this.colorproductoSessionBean.getsUltimaBusquedaColorProducto().equals("")) {
			this.setsAccionBusqueda(colorproductoSessionBean.getsUltimaBusquedaColorProducto());
			this.setiNumeroPaginacion(colorproductoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(colorproductoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(colorproductoSessionBean.getcodigo());
				colorproductoSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(colorproductoSessionBean.getnombre());
				colorproductoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(colorproductoSessionBean.getid_empresa());
				colorproductoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdGrupoColor")) {
				this.setid_grupo_colorFK_IdGrupoColor(colorproductoSessionBean.getid_grupo_color());
				colorproductoSessionBean.setid_grupo_color(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoProducto")) {
				this.setid_tipo_productoFK_IdTipoProducto(colorproductoSessionBean.getid_tipo_producto());
				colorproductoSessionBean.setid_tipo_producto(-1L);
			}
		}
		
		this.colorproductoSessionBean.setsUltimaBusquedaColorProducto("");
		this.colorproductoSessionBean.setiNumeroPaginacion(ColorProductoConstantesFunciones.INUMEROPAGINACION);
		this.colorproductoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaColorProducto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioColorProducto() {
		this.updateBorderResaltarBusquedasFormularioColorProducto();
		this.updateVisibilidadBusquedasFormularioColorProducto();
		this.updateHabilitarBusquedasFormularioColorProducto();
	}
	
	public void updateBorderResaltarBusquedasFormularioColorProducto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasColorProducto.getComponents().length>0) {
	

		if(this.colorproductoConstantesFunciones.resaltarBusquedaPorCodigoColorProducto!=null) {
			index= this.jTabbedPaneBusquedasColorProducto.indexOfComponent(this.jPanelBusquedaPorCodigoColorProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasColorProducto.getComponent(index);
				jPanel.setBorder(this.colorproductoConstantesFunciones.resaltarBusquedaPorCodigoColorProducto);
			}
		}

		if(this.colorproductoConstantesFunciones.resaltarBusquedaPorNombreColorProducto!=null) {
			index= this.jTabbedPaneBusquedasColorProducto.indexOfComponent(this.jPanelBusquedaPorNombreColorProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasColorProducto.getComponent(index);
				jPanel.setBorder(this.colorproductoConstantesFunciones.resaltarBusquedaPorNombreColorProducto);
			}
		}

		if(this.colorproductoConstantesFunciones.resaltarFK_IdGrupoColorColorProducto!=null) {
			index= this.jTabbedPaneBusquedasColorProducto.indexOfComponent(this.jPanelFK_IdGrupoColorColorProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasColorProducto.getComponent(index);
				jPanel.setBorder(this.colorproductoConstantesFunciones.resaltarFK_IdGrupoColorColorProducto);
			}
		}

		if(this.colorproductoConstantesFunciones.resaltarFK_IdTipoProductoColorProducto!=null) {
			index= this.jTabbedPaneBusquedasColorProducto.indexOfComponent(this.jPanelFK_IdTipoProductoColorProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasColorProducto.getComponent(index);
				jPanel.setBorder(this.colorproductoConstantesFunciones.resaltarFK_IdTipoProductoColorProducto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioColorProducto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasColorProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasColorProducto.indexOfComponent(this.jPanelBusquedaPorCodigoColorProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasColorProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.colorproductoConstantesFunciones.mostrarBusquedaPorCodigoColorProducto);
			if(!this.colorproductoConstantesFunciones.mostrarBusquedaPorCodigoColorProducto && index>-1) {
				this.jTabbedPaneBusquedasColorProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasColorProducto.indexOfComponent(this.jPanelBusquedaPorNombreColorProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasColorProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.colorproductoConstantesFunciones.mostrarBusquedaPorNombreColorProducto);
			if(!this.colorproductoConstantesFunciones.mostrarBusquedaPorNombreColorProducto && index>-1) {
				this.jTabbedPaneBusquedasColorProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasColorProducto.indexOfComponent(this.jPanelFK_IdGrupoColorColorProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasColorProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.colorproductoConstantesFunciones.mostrarFK_IdGrupoColorColorProducto);
			if(!this.colorproductoConstantesFunciones.mostrarFK_IdGrupoColorColorProducto && index>-1) {
				this.jTabbedPaneBusquedasColorProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasColorProducto.indexOfComponent(this.jPanelFK_IdTipoProductoColorProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasColorProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.colorproductoConstantesFunciones.mostrarFK_IdTipoProductoColorProducto);
			if(!this.colorproductoConstantesFunciones.mostrarFK_IdTipoProductoColorProducto && index>-1) {
				this.jTabbedPaneBusquedasColorProducto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioColorProducto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasColorProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasColorProducto.indexOfComponent(this.jPanelBusquedaPorCodigoColorProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasColorProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.colorproductoConstantesFunciones.activarBusquedaPorCodigoColorProducto);
				this.jTabbedPaneBusquedasColorProducto.setEnabledAt(index,this.colorproductoConstantesFunciones.activarBusquedaPorCodigoColorProducto);
			}

			index= this.jTabbedPaneBusquedasColorProducto.indexOfComponent(this.jPanelBusquedaPorNombreColorProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasColorProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.colorproductoConstantesFunciones.activarBusquedaPorNombreColorProducto);
				this.jTabbedPaneBusquedasColorProducto.setEnabledAt(index,this.colorproductoConstantesFunciones.activarBusquedaPorNombreColorProducto);
			}

			index= this.jTabbedPaneBusquedasColorProducto.indexOfComponent(this.jPanelFK_IdGrupoColorColorProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasColorProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.colorproductoConstantesFunciones.activarFK_IdGrupoColorColorProducto);
				this.jTabbedPaneBusquedasColorProducto.setEnabledAt(index,this.colorproductoConstantesFunciones.activarFK_IdGrupoColorColorProducto);
			}

			index= this.jTabbedPaneBusquedasColorProducto.indexOfComponent(this.jPanelFK_IdTipoProductoColorProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasColorProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.colorproductoConstantesFunciones.activarFK_IdTipoProductoColorProducto);
				this.jTabbedPaneBusquedasColorProducto.setEnabledAt(index,this.colorproductoConstantesFunciones.activarFK_IdTipoProductoColorProducto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaColorProducto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasColorProducto.indexOfComponent(this.jPanelBusquedaPorCodigoColorProducto);

			this.jTabbedPaneBusquedasColorProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasColorProducto.getComponent(index);

			this.colorproductoConstantesFunciones.setResaltarBusquedaPorCodigoColorProducto(resaltar);

			jPanel.setBorder(this.colorproductoConstantesFunciones.resaltarBusquedaPorCodigoColorProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasColorProducto.indexOfComponent(this.jPanelBusquedaPorNombreColorProducto);

			this.jTabbedPaneBusquedasColorProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasColorProducto.getComponent(index);

			this.colorproductoConstantesFunciones.setResaltarBusquedaPorNombreColorProducto(resaltar);

			jPanel.setBorder(this.colorproductoConstantesFunciones.resaltarBusquedaPorNombreColorProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdGrupoColor")) {
			index= this.jTabbedPaneBusquedasColorProducto.indexOfComponent(this.jPanelFK_IdGrupoColorColorProducto);

			this.jTabbedPaneBusquedasColorProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasColorProducto.getComponent(index);

			this.colorproductoConstantesFunciones.setResaltarFK_IdGrupoColorColorProducto(resaltar);

			jPanel.setBorder(this.colorproductoConstantesFunciones.resaltarFK_IdGrupoColorColorProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoProducto")) {
			index= this.jTabbedPaneBusquedasColorProducto.indexOfComponent(this.jPanelFK_IdTipoProductoColorProducto);

			this.jTabbedPaneBusquedasColorProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasColorProducto.getComponent(index);

			this.colorproductoConstantesFunciones.setResaltarFK_IdTipoProductoColorProducto(resaltar);

			jPanel.setBorder(this.colorproductoConstantesFunciones.resaltarFK_IdTipoProductoColorProducto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarColorProducto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioColorProducto() throws Exception {

		if(this.jInternalFrameDetalleFormColorProducto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioColorProducto();
		this.updateVisibilidadResaltarControlesFormularioColorProducto();
		this.updateHabilitarResaltarControlesFormularioColorProducto();
		
	}
	
	public void updateBorderResaltarControlesFormularioColorProducto() throws Exception {
		if(this.jInternalFrameDetalleFormColorProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.colorproductoConstantesFunciones.resaltaridColorProducto!=null && this.jInternalFrameDetalleFormColorProducto!=null) {this.jInternalFrameDetalleFormColorProducto.jLabelidColorProducto.setBorder(this.colorproductoConstantesFunciones.resaltaridColorProducto);}
		if(this.colorproductoConstantesFunciones.resaltarid_empresaColorProducto!=null && this.jInternalFrameDetalleFormColorProducto!=null) {this.jInternalFrameDetalleFormColorProducto.jComboBoxid_empresaColorProducto.setBorder(this.colorproductoConstantesFunciones.resaltarid_empresaColorProducto);}
		if(this.colorproductoConstantesFunciones.resaltarid_tipo_productoColorProducto!=null && this.jInternalFrameDetalleFormColorProducto!=null) {this.jInternalFrameDetalleFormColorProducto.jComboBoxid_tipo_productoColorProducto.setBorder(this.colorproductoConstantesFunciones.resaltarid_tipo_productoColorProducto);}
		if(this.colorproductoConstantesFunciones.resaltarid_grupo_colorColorProducto!=null && this.jInternalFrameDetalleFormColorProducto!=null) {this.jInternalFrameDetalleFormColorProducto.jComboBoxid_grupo_colorColorProducto.setBorder(this.colorproductoConstantesFunciones.resaltarid_grupo_colorColorProducto);}
		if(this.colorproductoConstantesFunciones.resaltarcodigoColorProducto!=null && this.jInternalFrameDetalleFormColorProducto!=null) {this.jInternalFrameDetalleFormColorProducto.jTextFieldcodigoColorProducto.setBorder(this.colorproductoConstantesFunciones.resaltarcodigoColorProducto);}
		if(this.colorproductoConstantesFunciones.resaltarnombreColorProducto!=null && this.jInternalFrameDetalleFormColorProducto!=null) {this.jInternalFrameDetalleFormColorProducto.jTextAreanombreColorProducto.setBorder(this.colorproductoConstantesFunciones.resaltarnombreColorProducto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioColorProducto() throws Exception {		
		if(this.jInternalFrameDetalleFormColorProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormColorProducto!=null) {
	
		//this.jInternalFrameDetalleFormColorProducto.jLabelidColorProducto.setVisible(this.colorproductoConstantesFunciones.mostraridColorProducto);
		this.jInternalFrameDetalleFormColorProducto.jPanelidColorProducto.setVisible(this.colorproductoConstantesFunciones.mostraridColorProducto);
		//this.jInternalFrameDetalleFormColorProducto.jComboBoxid_empresaColorProducto.setVisible(this.colorproductoConstantesFunciones.mostrarid_empresaColorProducto);
		this.jInternalFrameDetalleFormColorProducto.jPanelid_empresaColorProducto.setVisible(this.colorproductoConstantesFunciones.mostrarid_empresaColorProducto);
		//this.jInternalFrameDetalleFormColorProducto.jComboBoxid_tipo_productoColorProducto.setVisible(this.colorproductoConstantesFunciones.mostrarid_tipo_productoColorProducto);
		this.jInternalFrameDetalleFormColorProducto.jPanelid_tipo_productoColorProducto.setVisible(this.colorproductoConstantesFunciones.mostrarid_tipo_productoColorProducto);
		//this.jInternalFrameDetalleFormColorProducto.jComboBoxid_grupo_colorColorProducto.setVisible(this.colorproductoConstantesFunciones.mostrarid_grupo_colorColorProducto);
		this.jInternalFrameDetalleFormColorProducto.jPanelid_grupo_colorColorProducto.setVisible(this.colorproductoConstantesFunciones.mostrarid_grupo_colorColorProducto);
		//this.jInternalFrameDetalleFormColorProducto.jTextFieldcodigoColorProducto.setVisible(this.colorproductoConstantesFunciones.mostrarcodigoColorProducto);
		this.jInternalFrameDetalleFormColorProducto.jPanelcodigoColorProducto.setVisible(this.colorproductoConstantesFunciones.mostrarcodigoColorProducto);
		//this.jInternalFrameDetalleFormColorProducto.jTextAreanombreColorProducto.setVisible(this.colorproductoConstantesFunciones.mostrarnombreColorProducto);
		this.jInternalFrameDetalleFormColorProducto.jPanelnombreColorProducto.setVisible(this.colorproductoConstantesFunciones.mostrarnombreColorProducto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioColorProducto() throws Exception {
		if(this.jInternalFrameDetalleFormColorProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormColorProducto!=null) {
	
		this.jInternalFrameDetalleFormColorProducto.jLabelidColorProducto.setEnabled(this.colorproductoConstantesFunciones.activaridColorProducto);
		this.jInternalFrameDetalleFormColorProducto.jComboBoxid_empresaColorProducto.setEnabled(this.colorproductoConstantesFunciones.activarid_empresaColorProducto);
		this.jInternalFrameDetalleFormColorProducto.jComboBoxid_tipo_productoColorProducto.setEnabled(this.colorproductoConstantesFunciones.activarid_tipo_productoColorProducto);
		this.jInternalFrameDetalleFormColorProducto.jComboBoxid_grupo_colorColorProducto.setEnabled(this.colorproductoConstantesFunciones.activarid_grupo_colorColorProducto);
		this.jInternalFrameDetalleFormColorProducto.jTextFieldcodigoColorProducto.setEnabled(this.colorproductoConstantesFunciones.activarcodigoColorProducto);
		this.jInternalFrameDetalleFormColorProducto.jTextAreanombreColorProducto.setEnabled(this.colorproductoConstantesFunciones.activarnombreColorProducto);
		}
	}
	
		
}