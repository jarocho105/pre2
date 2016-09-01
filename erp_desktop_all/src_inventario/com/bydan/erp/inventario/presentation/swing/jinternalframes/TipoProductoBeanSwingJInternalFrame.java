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

import com.bydan.erp.inventario.util.TipoProductoConstantesFunciones;
import com.bydan.erp.inventario.util.TipoProductoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.TipoProductoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.TipoProductoBean;
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
public class TipoProductoBeanSwingJInternalFrame extends TipoProductoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoProductoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoProducto> tipoproductoValidator = new ClassValidator<TipoProducto>(TipoProducto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoProducto tipoproducto;	
	public TipoProducto tipoproductoAux;
	public TipoProducto tipoproductoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoProducto tipoproductoTotales;
	public Long idTipoProductoActual;
	public Long iIdNuevoTipoProducto=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosModeloProducto=false;

	public Boolean getIsTienePermisosModeloProducto() {
		return isTienePermisosModeloProducto;
	}

	public void setIsTienePermisosModeloProducto(Boolean isTienePermisosModeloProducto) {
		this.isTienePermisosModeloProducto= isTienePermisosModeloProducto;
	}


	public Boolean isTienePermisosMaterialProducto=false;

	public Boolean getIsTienePermisosMaterialProducto() {
		return isTienePermisosMaterialProducto;
	}

	public void setIsTienePermisosMaterialProducto(Boolean isTienePermisosMaterialProducto) {
		this.isTienePermisosMaterialProducto= isTienePermisosMaterialProducto;
	}


	public Boolean isTienePermisosMarcaProducto=false;

	public Boolean getIsTienePermisosMarcaProducto() {
		return isTienePermisosMarcaProducto;
	}

	public void setIsTienePermisosMarcaProducto(Boolean isTienePermisosMarcaProducto) {
		this.isTienePermisosMarcaProducto= isTienePermisosMarcaProducto;
	}


	public Boolean isTienePermisosSegmentoProducto=false;

	public Boolean getIsTienePermisosSegmentoProducto() {
		return isTienePermisosSegmentoProducto;
	}

	public void setIsTienePermisosSegmentoProducto(Boolean isTienePermisosSegmentoProducto) {
		this.isTienePermisosSegmentoProducto= isTienePermisosSegmentoProducto;
	}


	public Boolean isTienePermisosColorProducto=false;

	public Boolean getIsTienePermisosColorProducto() {
		return isTienePermisosColorProducto;
	}

	public void setIsTienePermisosColorProducto(Boolean isTienePermisosColorProducto) {
		this.isTienePermisosColorProducto= isTienePermisosColorProducto;
	}


	public Boolean isTienePermisosEfectoProducto=false;

	public Boolean getIsTienePermisosEfectoProducto() {
		return isTienePermisosEfectoProducto;
	}

	public void setIsTienePermisosEfectoProducto(Boolean isTienePermisosEfectoProducto) {
		this.isTienePermisosEfectoProducto= isTienePermisosEfectoProducto;
	}


	public Boolean isTienePermisosTallaProducto=false;

	public Boolean getIsTienePermisosTallaProducto() {
		return isTienePermisosTallaProducto;
	}

	public void setIsTienePermisosTallaProducto(Boolean isTienePermisosTallaProducto) {
		this.isTienePermisosTallaProducto= isTienePermisosTallaProducto;
	}


	public Boolean isTienePermisosParametroInventarioDefecto=false;

	public Boolean getIsTienePermisosParametroInventarioDefecto() {
		return isTienePermisosParametroInventarioDefecto;
	}

	public void setIsTienePermisosParametroInventarioDefecto(Boolean isTienePermisosParametroInventarioDefecto) {
		this.isTienePermisosParametroInventarioDefecto= isTienePermisosParametroInventarioDefecto;
	}


	public Boolean isTienePermisosClaseProducto=false;

	public Boolean getIsTienePermisosClaseProducto() {
		return isTienePermisosClaseProducto;
	}

	public void setIsTienePermisosClaseProducto(Boolean isTienePermisosClaseProducto) {
		this.isTienePermisosClaseProducto= isTienePermisosClaseProducto;
	}


	public Boolean isTienePermisosProducto=false;

	public Boolean getIsTienePermisosProducto() {
		return isTienePermisosProducto;
	}

	public void setIsTienePermisosProducto(Boolean isTienePermisosProducto) {
		this.isTienePermisosProducto= isTienePermisosProducto;
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
	
	public Boolean isPermisoTodoTipoProducto;
	public Boolean isPermisoNuevoTipoProducto;
	public Boolean isPermisoActualizarTipoProducto;
	public Boolean isPermisoActualizarOriginalTipoProducto;
	public Boolean isPermisoEliminarTipoProducto;
	public Boolean isPermisoGuardarCambiosTipoProducto;
	public Boolean isPermisoConsultaTipoProducto;
	public Boolean isPermisoBusquedaTipoProducto;
	public Boolean isPermisoReporteTipoProducto;
	public Boolean isPermisoPaginacionMedioTipoProducto;
	public Boolean isPermisoPaginacionAltoTipoProducto;
	public Boolean isPermisoPaginacionTodoTipoProducto;
	public Boolean isPermisoCopiarTipoProducto;
	public Boolean isPermisoVerFormTipoProducto;
	public Boolean isPermisoDuplicarTipoProducto;
	public Boolean isPermisoOrdenTipoProducto;
	
	
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
	
	public TipoProductoParameterReturnGeneral tipoproductoReturnGeneral;
	public TipoProductoParameterReturnGeneral tipoproductoParameterGeneral;
	
	

	public ModeloProductoLogic modeloproductoLogic=null;

	public ModeloProductoLogic getModeloProductoLogic() {
		return modeloproductoLogic;
	}

	public void setModeloProductoLogic(ModeloProductoLogic modeloproductoLogic) {
		this.modeloproductoLogic = modeloproductoLogic;
	}


	public MaterialProductoLogic materialproductoLogic=null;

	public MaterialProductoLogic getMaterialProductoLogic() {
		return materialproductoLogic;
	}

	public void setMaterialProductoLogic(MaterialProductoLogic materialproductoLogic) {
		this.materialproductoLogic = materialproductoLogic;
	}


	public MarcaProductoLogic marcaproductoLogic=null;

	public MarcaProductoLogic getMarcaProductoLogic() {
		return marcaproductoLogic;
	}

	public void setMarcaProductoLogic(MarcaProductoLogic marcaproductoLogic) {
		this.marcaproductoLogic = marcaproductoLogic;
	}


	public SegmentoProductoLogic segmentoproductoLogic=null;

	public SegmentoProductoLogic getSegmentoProductoLogic() {
		return segmentoproductoLogic;
	}

	public void setSegmentoProductoLogic(SegmentoProductoLogic segmentoproductoLogic) {
		this.segmentoproductoLogic = segmentoproductoLogic;
	}


	public ColorProductoLogic colorproductoLogic=null;

	public ColorProductoLogic getColorProductoLogic() {
		return colorproductoLogic;
	}

	public void setColorProductoLogic(ColorProductoLogic colorproductoLogic) {
		this.colorproductoLogic = colorproductoLogic;
	}


	public EfectoProductoLogic efectoproductoLogic=null;

	public EfectoProductoLogic getEfectoProductoLogic() {
		return efectoproductoLogic;
	}

	public void setEfectoProductoLogic(EfectoProductoLogic efectoproductoLogic) {
		this.efectoproductoLogic = efectoproductoLogic;
	}


	public TallaProductoLogic tallaproductoLogic=null;

	public TallaProductoLogic getTallaProductoLogic() {
		return tallaproductoLogic;
	}

	public void setTallaProductoLogic(TallaProductoLogic tallaproductoLogic) {
		this.tallaproductoLogic = tallaproductoLogic;
	}


	public ParametroInventarioDefectoLogic parametroinventariodefectoLogic=null;

	public ParametroInventarioDefectoLogic getParametroInventarioDefectoLogic() {
		return parametroinventariodefectoLogic;
	}

	public void setParametroInventarioDefectoLogic(ParametroInventarioDefectoLogic parametroinventariodefectoLogic) {
		this.parametroinventariodefectoLogic = parametroinventariodefectoLogic;
	}


	public ClaseProductoLogic claseproductoLogic=null;

	public ClaseProductoLogic getClaseProductoLogic() {
		return claseproductoLogic;
	}

	public void setClaseProductoLogic(ClaseProductoLogic claseproductoLogic) {
		this.claseproductoLogic = claseproductoLogic;
	}


	public ProductoLogic productoLogic=null;

	public ProductoLogic getProductoLogic() {
		return productoLogic;
	}

	public void setProductoLogic(ProductoLogic productoLogic) {
		this.productoLogic = productoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoProducto=false;
	public Boolean esParaAccionDesdeFormularioTipoProducto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoProductoSessionBeanAdditional tipoproductoSessionBeanAdditional=null;
	
	public TipoProductoSessionBeanAdditional getTipoProductoSessionBeanAdditional() {
		return this.tipoproductoSessionBeanAdditional;
	}
	
	public void setTipoProductoSessionBeanAdditional(TipoProductoSessionBeanAdditional tipoproductoSessionBeanAdditional) {
		try {
			this.tipoproductoSessionBeanAdditional=tipoproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoProductoBeanSwingJInternalFrameAdditional tipoproductoBeanSwingJInternalFrameAdditional=null;
	//public class TipoProductoBeanSwingJInternalFrame
	
	public TipoProductoBeanSwingJInternalFrameAdditional getTipoProductoBeanSwingJInternalFrameAdditional() {
		return this.tipoproductoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoProductoBeanSwingJInternalFrameAdditional(TipoProductoBeanSwingJInternalFrameAdditional tipoproductoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoproductoBeanSwingJInternalFrameAdditional=tipoproductoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoProductoLogic tipoproductoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoProducto tipoproductoBean;
	public TipoProductoConstantesFunciones tipoproductoConstantesFunciones;
	//public TipoProductoParameterReturnGeneral tipoproductoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoProducto> tipoproductos;	
	//public List<TipoProducto> tipoproductosEliminados;
	//public List<TipoProducto> tipoproductosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoProducto=false;
	public Boolean isVisibilidadCeldaDuplicarTipoProducto=true;
	public Boolean isVisibilidadCeldaCopiarTipoProducto=true;
	public Boolean isVisibilidadCeldaVerFormTipoProducto=true;
	public Boolean isVisibilidadCeldaOrdenTipoProducto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoProducto=false;
	public Boolean isVisibilidadCeldaModificarTipoProducto=false;
	public Boolean isVisibilidadCeldaActualizarTipoProducto=false;
	public Boolean isVisibilidadCeldaEliminarTipoProducto=false;
	public Boolean isVisibilidadCeldaCancelarTipoProducto=false;
	public Boolean isVisibilidadCeldaGuardarTipoProducto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoProducto=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoProducto() {
		return this.iIdNuevoTipoProducto;
	}

	public void setiIdNuevoTipoProducto(Long iIdNuevoTipoProducto) {
		this.iIdNuevoTipoProducto = iIdNuevoTipoProducto;
	}
	
	public Long getidTipoProductoActual() {
		return this.idTipoProductoActual;
	}

	public void setidTipoProductoActual(Long idTipoProductoActual) {
		this.idTipoProductoActual = idTipoProductoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoProducto gettipoproducto() {
		return this.tipoproducto;
	}

	public void settipoproducto(TipoProducto tipoproducto) {
		this.tipoproducto = tipoproducto;
	}
	
	public TipoProducto gettipoproductoAux() {
		return this.tipoproductoAux;
	}

	public void settipoproductoAux(TipoProducto tipoproductoAux) {
		this.tipoproductoAux = tipoproductoAux;
	}				
	
	public TipoProducto gettipoproductoAnterior() {
		return this.tipoproductoAnterior;
	}

	public void settipoproductoAnterior(TipoProducto tipoproductoAnterior) {
		this.tipoproductoAnterior = tipoproductoAnterior;
	}	
	
	public TipoProducto gettipoproductoTotales() {
		return this.tipoproductoTotales;
	}

	public void settipoproductoTotales(TipoProducto tipoproductoTotales) {
		this.tipoproductoTotales = tipoproductoTotales;
	}	
	
	public TipoProducto gettipoproductoBean() {
		return this.tipoproductoBean;
	}

	public void settipoproductoBean(TipoProducto tipoproductoBean) {
		this.tipoproductoBean = tipoproductoBean;
	}	
	
	public TipoProductoParameterReturnGeneral gettipoproductoReturnGeneral() {
		return this.tipoproductoReturnGeneral;
	}

	public void settipoproductoReturnGeneral(TipoProductoParameterReturnGeneral tipoproductoReturnGeneral) {
		this.tipoproductoReturnGeneral = tipoproductoReturnGeneral;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoProductoLogic getTipoProductoLogic()	{		
		return tipoproductoLogic;
	}

	public void setTipoProductoLogic(TipoProductoLogic tipoproductoLogic) {
		this.tipoproductoLogic = tipoproductoLogic;
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
	
	public Boolean getIsEsNuevoTipoProducto() {
		return isEsNuevoTipoProducto;
	}

	public void setIsEsNuevoTipoProducto(Boolean isEsNuevoTipoProducto) {
		this.isEsNuevoTipoProducto = isEsNuevoTipoProducto;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoProducto() {
		return esParaAccionDesdeFormularioTipoProducto;
	}
	
	public void setEsParaAccionDesdeFormularioTipoProducto(Boolean esParaAccionDesdeFormularioTipoProducto) {
		this.esParaAccionDesdeFormularioTipoProducto = esParaAccionDesdeFormularioTipoProducto;
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

			if(this.tipoproductoSessionBean==null) {
				this.tipoproductoSessionBean=new TipoProductoSessionBean();
			}

			if(!this.tipoproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoproductoSessionBean.getlidEmpresaActual());
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

					if(this.tipoproducto!=null) {
						this.tipoproducto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoProducto!=null) {
						this.jInternalFrameDetalleFormTipoProducto.jComboBoxid_empresaTipoProducto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoProducto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoProducto!=null) {
						if(this.jInternalFrameDetalleFormTipoProducto.jComboBoxid_empresaTipoProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoProducto.jComboBoxid_empresaTipoProducto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoProductoGenerico)throws Exception
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
				jComboBoxid_empresaTipoProductoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoProductoGenerico!=null && jComboBoxid_empresaTipoProductoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoProducto tipoproducto,JComboBox jComboBoxid_empresaTipoProductoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoProductoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoProducto.jComboBoxid_empresaTipoProducto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoProductoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoproducto.setid_empresa(empresaAux.getId());
				tipoproducto.setempresa_descripcion(TipoProductoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoproducto.setEmpresa(empresaAux);			}
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

					if(!TipoProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoProducto!=null) { 
							this.jInternalFrameDetalleFormTipoProducto.jComboBoxid_empresaTipoProducto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoProducto.jComboBoxid_empresaTipoProducto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoProducto!=null) { 
					}

					if(!TipoProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoProducto!=null) {
							this.jInternalFrameDetalleFormTipoProducto.jComboBoxid_empresaTipoProducto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoProducto!=null) {
							this.jInternalFrameDetalleFormTipoProducto.jComboBoxid_empresaTipoProducto.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoProducto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoProductoConstantesFunciones.refrescarForeignKeysDescripcionesTipoProducto(this.tipoproductoLogic.getTipoProductos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoProductoConstantesFunciones.refrescarForeignKeysDescripcionesTipoProducto(this.tipoproductos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoproductoLogic.setTipoProductos(this.tipoproductos);
			tipoproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoProductoParameterReturnGeneral getTipoProductoParameterGeneral() {
		return this.tipoproductoParameterGeneral;
	}
	
	public void setTipoProductoParameterGeneral(TipoProductoParameterReturnGeneral tipoproductoParameterGeneral) {
		this.tipoproductoParameterGeneral = tipoproductoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoProducto() {
		return isPermisoTodoTipoProducto;
	}

	public void setIsPermisoTodoTipoProducto(Boolean isPermisoTodoTipoProducto) {
		this.isPermisoTodoTipoProducto = isPermisoTodoTipoProducto;
	}

	public Boolean getIsPermisoNuevoTipoProducto() {
		return isPermisoNuevoTipoProducto;
	}

	public void setIsPermisoNuevoTipoProducto(Boolean isPermisoNuevoTipoProducto) {
		this.isPermisoNuevoTipoProducto = isPermisoNuevoTipoProducto;
	}

	public Boolean getIsPermisoActualizarTipoProducto() {
		return isPermisoActualizarTipoProducto;
	}

	public void setIsPermisoActualizarTipoProducto(Boolean isPermisoActualizarTipoProducto) {
		this.isPermisoActualizarTipoProducto = isPermisoActualizarTipoProducto;
	}

	public Boolean getIsPermisoEliminarTipoProducto() {
		return isPermisoEliminarTipoProducto;
	}

	public void setIsPermisoEliminarTipoProducto(Boolean isPermisoEliminarTipoProducto) {
		this.isPermisoEliminarTipoProducto = isPermisoEliminarTipoProducto;
	}

	public Boolean getIsPermisoGuardarCambiosTipoProducto() {
		return isPermisoGuardarCambiosTipoProducto;
	}

	public void setIsPermisoGuardarCambiosTipoProducto(Boolean isPermisoGuardarCambiosTipoProducto) {
		this.isPermisoGuardarCambiosTipoProducto = isPermisoGuardarCambiosTipoProducto;
	}
	
	public Boolean getIsPermisoConsultaTipoProducto() {
		return isPermisoConsultaTipoProducto;
	}

	public void setIsPermisoConsultaTipoProducto(Boolean isPermisoConsultaTipoProducto) {
		this.isPermisoConsultaTipoProducto = isPermisoConsultaTipoProducto;
	}

	public Boolean getIsPermisoBusquedaTipoProducto() {
		return isPermisoBusquedaTipoProducto;
	}

	public void setIsPermisoBusquedaTipoProducto(Boolean isPermisoBusquedaTipoProducto) {
		this.isPermisoBusquedaTipoProducto = isPermisoBusquedaTipoProducto;
	}

	public Boolean getIsPermisoReporteTipoProducto() {
		return isPermisoReporteTipoProducto;
	}

	public void setIsPermisoReporteTipoProducto(Boolean isPermisoReporteTipoProducto) {
		this.isPermisoReporteTipoProducto = isPermisoReporteTipoProducto;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoProducto() {
		return isPermisoPaginacionMedioTipoProducto;
	}

	public void setIsPermisoPaginacionMedioTipoProducto(Boolean isPermisoPaginacionMedioTipoProducto) {
		this.isPermisoPaginacionMedioTipoProducto = isPermisoPaginacionMedioTipoProducto;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoProducto() {
		return isPermisoPaginacionTodoTipoProducto;
	}

	public void setIsPermisoPaginacionTodoTipoProducto(Boolean isPermisoPaginacionTodoTipoProducto) {
		this.isPermisoPaginacionTodoTipoProducto = isPermisoPaginacionTodoTipoProducto;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoProducto() {
		return isPermisoPaginacionAltoTipoProducto;
	}

	public void setIsPermisoPaginacionAltoTipoProducto(Boolean isPermisoPaginacionAltoTipoProducto) {
		this.isPermisoPaginacionAltoTipoProducto = isPermisoPaginacionAltoTipoProducto;
	}
	
	public Boolean getIsPermisoCopiarTipoProducto() {
		return isPermisoCopiarTipoProducto;
	}

	public void setIsPermisoCopiarTipoProducto(Boolean isPermisoCopiarTipoProducto) {
		this.isPermisoCopiarTipoProducto = isPermisoCopiarTipoProducto;
	}
	
	public Boolean getIsPermisoVerFormTipoProducto() {
		return isPermisoVerFormTipoProducto;
	}

	public void setIsPermisoVerFormTipoProducto(Boolean isPermisoVerFormTipoProducto) {
		this.isPermisoVerFormTipoProducto = isPermisoVerFormTipoProducto;
	}
	
	public Boolean getIsPermisoDuplicarTipoProducto() {
		return isPermisoDuplicarTipoProducto;
	}

	public void setIsPermisoDuplicarTipoProducto(Boolean isPermisoDuplicarTipoProducto) {
		this.isPermisoDuplicarTipoProducto = isPermisoDuplicarTipoProducto;
	}
	
	public Boolean getIsPermisoOrdenTipoProducto() {
		return isPermisoOrdenTipoProducto;
	}

	public void setIsPermisoOrdenTipoProducto(Boolean isPermisoOrdenTipoProducto) {
		this.isPermisoOrdenTipoProducto = isPermisoOrdenTipoProducto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoProducto() {
		return isVisibilidadCeldaNuevoTipoProducto;
	}

	public void setIsVisibilidadCeldaNuevoTipoProducto(Boolean isVisibilidadCeldaNuevoTipoProducto) {
		this.isVisibilidadCeldaNuevoTipoProducto = isVisibilidadCeldaNuevoTipoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoProducto() {
		return isVisibilidadCeldaDuplicarTipoProducto;
	}

	public void setIsVisibilidadCeldaDuplicarTipoProducto(Boolean isVisibilidadCeldaDuplicarTipoProducto) {
		this.isVisibilidadCeldaDuplicarTipoProducto = isVisibilidadCeldaDuplicarTipoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoProducto() {
		return isVisibilidadCeldaCopiarTipoProducto;
	}

	public void setIsVisibilidadCeldaCopiarTipoProducto(Boolean isVisibilidadCeldaCopiarTipoProducto) {
		this.isVisibilidadCeldaCopiarTipoProducto = isVisibilidadCeldaCopiarTipoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoProducto() {
		return isVisibilidadCeldaVerFormTipoProducto;
	}

	public void setIsVisibilidadCeldaVerFormTipoProducto(Boolean isVisibilidadCeldaVerFormTipoProducto) {
		this.isVisibilidadCeldaVerFormTipoProducto = isVisibilidadCeldaVerFormTipoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoProducto() {
		return isVisibilidadCeldaOrdenTipoProducto;
	}

	public void setIsVisibilidadCeldaOrdenTipoProducto(Boolean isVisibilidadCeldaOrdenTipoProducto) {
		this.isVisibilidadCeldaOrdenTipoProducto = isVisibilidadCeldaOrdenTipoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoProducto() {
		return isVisibilidadCeldaNuevoRelacionesTipoProducto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoProducto(Boolean isVisibilidadCeldaNuevoRelacionesTipoProducto) {
		this.isVisibilidadCeldaNuevoRelacionesTipoProducto = isVisibilidadCeldaNuevoRelacionesTipoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoProducto() {
		return isVisibilidadCeldaModificarTipoProducto;
	}

	public void setIsVisibilidadCeldaModificarTipoProducto(Boolean isVisibilidadCeldaModificarTipoProducto) {
		this.isVisibilidadCeldaModificarTipoProducto = isVisibilidadCeldaModificarTipoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoProducto() {
		return isVisibilidadCeldaActualizarTipoProducto;
	}

	public void setIsVisibilidadCeldaActualizarTipoProducto(Boolean isVisibilidadCeldaActualizarTipoProducto) {
		this.isVisibilidadCeldaActualizarTipoProducto = isVisibilidadCeldaActualizarTipoProducto;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoProducto() {
		return isVisibilidadCeldaEliminarTipoProducto;
	}

	public void setIsVisibilidadCeldaEliminarTipoProducto(Boolean isVisibilidadCeldaEliminarTipoProducto) {
		this.isVisibilidadCeldaEliminarTipoProducto = isVisibilidadCeldaEliminarTipoProducto;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoProducto() {
		return isVisibilidadCeldaCancelarTipoProducto;
	}

	public void setIsVisibilidadCeldaCancelarTipoProducto(Boolean isVisibilidadCeldaCancelarTipoProducto) {
		this.isVisibilidadCeldaCancelarTipoProducto = isVisibilidadCeldaCancelarTipoProducto;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoProducto() {
		return isVisibilidadCeldaGuardarTipoProducto;
	}

	public void setIsVisibilidadCeldaGuardarTipoProducto(Boolean isVisibilidadCeldaGuardarTipoProducto) {
		this.isVisibilidadCeldaGuardarTipoProducto = isVisibilidadCeldaGuardarTipoProducto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoProducto() {
		return isVisibilidadCeldaGuardarCambiosTipoProducto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoProducto(Boolean isVisibilidadCeldaGuardarCambiosTipoProducto) {
		this.isVisibilidadCeldaGuardarCambiosTipoProducto = isVisibilidadCeldaGuardarCambiosTipoProducto;
	}
		
	public TipoProductoSessionBean gettipoproductoSessionBean() {
		return this.tipoproductoSessionBean;
	}
	
	public void settipoproductoSessionBean(TipoProductoSessionBean tipoproductoSessionBean) {
		this.tipoproductoSessionBean=tipoproductoSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoProducto(TipoProducto tipoproducto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoproducto,null);
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
	
	public void bugActualizarReferenciaActual(TipoProducto tipoproducto,TipoProducto tipoproductoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoProducto(tipoproducto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoproductoAux.setId(tipoproducto.getId());
		tipoproductoAux.setVersionRow(tipoproducto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoProducto();
		
			int intSelectedRow = this.jTableDatosTipoProducto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproducto =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoproducto =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoProducto(this.tipoproducto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoproductoValidator.getInvalidValues(this.tipoproducto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoproductoLogic.setDatosCliente(datosCliente);
			tipoproductoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoproductoAux=new  TipoProducto();
				
				tipoproductoAux.setIsNew(true);
				tipoproductoAux.setIsChanged(true);
				
				tipoproductoAux.setTipoProductoOriginal(this.tipoproducto);
				
				tipoproductoAux.setId(this.tipoproducto.getId());	
				tipoproductoAux.setVersionRow(this.tipoproducto.getVersionRow());	
				tipoproductoAux.setid_empresa(this.tipoproducto.getid_empresa());	
				tipoproductoAux.setcodigo(this.tipoproducto.getcodigo());	
				tipoproductoAux.setnombre(this.tipoproducto.getnombre());	
				tipoproductoAux.setdescripcion(this.tipoproducto.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoproductoAux,tipoproductoLogic.getTipoProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoproductoAux,tipoproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductoLogic.saveTipoProductos();//WithConnection
						//tipoproductoLogic.getSetVersionRowTipoProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoproducto,tipoproductoAux);
					
					this.refrescarForeignKeysDescripcionesTipoProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductoLogic.getModeloProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductoLogic.getMaterialProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductoLogic.getMarcaProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductoLogic.getSegmentoProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductoLogic.getColorProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductoLogic.getEfectoProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductoLogic.getTallaProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductoLogic.getClaseProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductos.addAll(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductos.addAll(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductos.addAll(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductos.addAll(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductos.addAll(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductos.addAll(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductos.addAll(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductos.addAll(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoproductoLogic.saveTipoProductoRelaciones(tipoproductoAux,this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductoLogic.getModeloProductos(),this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductoLogic.getMaterialProductos(),this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductoLogic.getMarcaProductos(),this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductoLogic.getSegmentoProductos(),this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductoLogic.getColorProductos(),this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductoLogic.getEfectoProductos(),this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductoLogic.getTallaProductos(),this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos(),this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductoLogic.getClaseProductos(),this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());//WithConnection
								//tipoproductoLogic.getSetVersionRowTipoProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoproducto,tipoproductoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductoLogic.setModeloProductos(new ArrayList<ModeloProducto>());
							this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductoLogic.setMaterialProductos(new ArrayList<MaterialProducto>());
							this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductoLogic.setMarcaProductos(new ArrayList<MarcaProducto>());
							this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductoLogic.setSegmentoProductos(new ArrayList<SegmentoProducto>());
							this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductoLogic.setColorProductos(new ArrayList<ColorProducto>());
							this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductoLogic.setEfectoProductos(new ArrayList<EfectoProducto>());
							this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductoLogic.setTallaProductos(new ArrayList<TallaProducto>());
							this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductoLogic.setClaseProductos(new ArrayList<ClaseProducto>());
							this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductos= new ArrayList<ModeloProducto>();
							this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductos= new ArrayList<MaterialProducto>();
							this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductos= new ArrayList<MarcaProducto>();
							this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductos= new ArrayList<SegmentoProducto>();
							this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductos= new ArrayList<ColorProducto>();
							this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductos= new ArrayList<EfectoProducto>();
							this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductos= new ArrayList<TallaProducto>();
							this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductos= new ArrayList<ClaseProducto>();
							this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setModeloProductos(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductoLogic.getModeloProductos());

							if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setMaterialProductos(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductoLogic.getMaterialProductos());

							if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setMarcaProductos(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductoLogic.getMarcaProductos());

							if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setSegmentoProductos(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductoLogic.getSegmentoProductos());

							if(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setColorProductos(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductoLogic.getColorProductos());

							if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setEfectoProductos(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductoLogic.getEfectoProductos());

							if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setTallaProductos(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductoLogic.getTallaProductos());

							if(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());

							if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setClaseProductos(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductoLogic.getClaseProductos());

							if(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setProductos(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoproductoAux,tipoproductoLogic.getTipoProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoproductoAux,tipoproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoproducto,tipoproductoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoproductoAux=new  TipoProducto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoproductoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoproductoSessionBean.getEsGuardarRelacionado() && this.tipoproducto.getId()>=0)) {
						
					tipoproductoAux.setIsNew(false);
				}
				
				tipoproductoAux.setIsDeleted(false);
			
				tipoproductoAux.setId(this.tipoproducto.getId());	
				tipoproductoAux.setVersionRow(this.tipoproducto.getVersionRow());	
				tipoproductoAux.setid_empresa(this.tipoproducto.getid_empresa());	
				tipoproductoAux.setcodigo(this.tipoproducto.getcodigo());	
				tipoproductoAux.setnombre(this.tipoproducto.getnombre());	
				tipoproductoAux.setdescripcion(this.tipoproducto.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoproductoAux,tipoproductoLogic.getTipoProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoproductoAux,tipoproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductoLogic.saveTipoProductos();//WithConnection
						//tipoproductoLogic.getSetVersionRowTipoProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoproducto,tipoproductoAux);
					
					this.refrescarForeignKeysDescripcionesTipoProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductoLogic.getModeloProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductoLogic.getMaterialProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductoLogic.getMarcaProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductoLogic.getSegmentoProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductoLogic.getColorProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductoLogic.getEfectoProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductoLogic.getTallaProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductoLogic.getClaseProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductos.addAll(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductos.addAll(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductos.addAll(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductos.addAll(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductos.addAll(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductos.addAll(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductos.addAll(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductos.addAll(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoproductoLogic.saveTipoProductoRelaciones(tipoproductoAux,this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductoLogic.getModeloProductos(),this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductoLogic.getMaterialProductos(),this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductoLogic.getMarcaProductos(),this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductoLogic.getSegmentoProductos(),this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductoLogic.getColorProductos(),this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductoLogic.getEfectoProductos(),this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductoLogic.getTallaProductos(),this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos(),this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductoLogic.getClaseProductos(),this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());//WithConnection
								//tipoproductoLogic.getSetVersionRowTipoProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoproducto,tipoproductoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductoLogic.setModeloProductos(new ArrayList<ModeloProducto>());
							this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductoLogic.setMaterialProductos(new ArrayList<MaterialProducto>());
							this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductoLogic.setMarcaProductos(new ArrayList<MarcaProducto>());
							this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductoLogic.setSegmentoProductos(new ArrayList<SegmentoProducto>());
							this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductoLogic.setColorProductos(new ArrayList<ColorProducto>());
							this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductoLogic.setEfectoProductos(new ArrayList<EfectoProducto>());
							this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductoLogic.setTallaProductos(new ArrayList<TallaProducto>());
							this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductoLogic.setClaseProductos(new ArrayList<ClaseProducto>());
							this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductos= new ArrayList<ModeloProducto>();
							this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductos= new ArrayList<MaterialProducto>();
							this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductos= new ArrayList<MarcaProducto>();
							this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductos= new ArrayList<SegmentoProducto>();
							this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductos= new ArrayList<ColorProducto>();
							this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductos= new ArrayList<EfectoProducto>();
							this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductos= new ArrayList<TallaProducto>();
							this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductos= new ArrayList<ClaseProducto>();
							this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setModeloProductos(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductoLogic.getModeloProductos());

							if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setMaterialProductos(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductoLogic.getMaterialProductos());

							if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setMarcaProductos(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductoLogic.getMarcaProductos());

							if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setSegmentoProductos(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductoLogic.getSegmentoProductos());

							if(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setColorProductos(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductoLogic.getColorProductos());

							if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setEfectoProductos(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductoLogic.getEfectoProductos());

							if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setTallaProductos(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductoLogic.getTallaProductos());

							if(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());

							if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setClaseProductos(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductoLogic.getClaseProductos());

							if(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setProductos(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoproductoAux,tipoproductoLogic.getTipoProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoproductoAux,tipoproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoproducto,tipoproductoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoproductoAux=new  TipoProducto();
				
				tipoproductoAux.setIsNew(false);
				tipoproductoAux.setIsChanged(false);
				
				tipoproductoAux.setIsDeleted(true);
				
				tipoproductoAux.setId(this.tipoproducto.getId());	
				tipoproductoAux.setVersionRow(this.tipoproducto.getVersionRow());	
				tipoproductoAux.setid_empresa(this.tipoproducto.getid_empresa());	
				tipoproductoAux.setcodigo(this.tipoproducto.getcodigo());	
				tipoproductoAux.setnombre(this.tipoproducto.getnombre());	
				tipoproductoAux.setdescripcion(this.tipoproducto.getdescripcion());	
				
				if(this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoproductoAux.getId()>=0) {	
						this.tipoproductosEliminados.add(tipoproductoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoproductoAux,tipoproductoLogic.getTipoProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoproductoAux,tipoproductos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductoLogic.saveTipoProductos();//WithConnection
						//tipoproductoLogic.getSetVersionRowTipoProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductoLogic.getModeloProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductoLogic.getMaterialProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductoLogic.getMarcaProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductoLogic.getSegmentoProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductoLogic.getColorProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductoLogic.getEfectoProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductoLogic.getTallaProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductoLogic.getClaseProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductos.addAll(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductos.addAll(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductos.addAll(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductos.addAll(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductos.addAll(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductos.addAll(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductos.addAll(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductos.addAll(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductosEliminados);
							this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormModeloProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMaterialProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormMarcaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormSegmentoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormEfectoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormTallaProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormClaseProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoproductoLogic.saveTipoProductoRelaciones(tipoproductoAux,this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductoLogic.getModeloProductos(),this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductoLogic.getMaterialProductos(),this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductoLogic.getMarcaProductos(),this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductoLogic.getSegmentoProductos(),this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductoLogic.getColorProductos(),this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductoLogic.getEfectoProductos(),this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductoLogic.getTallaProductos(),this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos(),this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductoLogic.getClaseProductos(),this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());//WithConnection
								//tipoproductoLogic.getSetVersionRowTipoProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductoLogic.setModeloProductos(new ArrayList<ModeloProducto>());
							this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductoLogic.setMaterialProductos(new ArrayList<MaterialProducto>());
							this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductoLogic.setMarcaProductos(new ArrayList<MarcaProducto>());
							this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductoLogic.setSegmentoProductos(new ArrayList<SegmentoProducto>());
							this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductoLogic.setColorProductos(new ArrayList<ColorProducto>());
							this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductoLogic.setEfectoProductos(new ArrayList<EfectoProducto>());
							this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductoLogic.setTallaProductos(new ArrayList<TallaProducto>());
							this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductoLogic.setClaseProductos(new ArrayList<ClaseProducto>());
							this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductos= new ArrayList<ModeloProducto>();
							this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductos= new ArrayList<MaterialProducto>();
							this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductos= new ArrayList<MarcaProducto>();
							this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductos= new ArrayList<SegmentoProducto>();
							this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductos= new ArrayList<ColorProducto>();
							this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductos= new ArrayList<EfectoProducto>();
							this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductos= new ArrayList<TallaProducto>();
							this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductos= new ArrayList<ClaseProducto>();
							this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setModeloProductos(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductoLogic.getModeloProductos());

							if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setMaterialProductos(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductoLogic.getMaterialProductos());

							if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setMarcaProductos(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductoLogic.getMarcaProductos());

							if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setSegmentoProductos(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductoLogic.getSegmentoProductos());

							if(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setColorProductos(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductoLogic.getColorProductos());

							if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setEfectoProductos(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductoLogic.getEfectoProductos());

							if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setTallaProductos(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductoLogic.getTallaProductos());

							if(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());

							if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setClaseProductos(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductoLogic.getClaseProductos());

							if(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproductoAux.setProductos(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoproductoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoproductoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoproductoAux,tipoproductoLogic.getTipoProductos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoproductoAux,tipoproductos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.getTipoProductos().addAll(this.tipoproductosEliminados);
					
					tipoproductoLogic.saveTipoProductos();//WithConnection
					//tipoproductoLogic.getSetVersionRowTipoProductos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoProducto();
				
				this.tipoproductosEliminados= new ArrayList<TipoProducto>();		
			}
			
			if(this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Producto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Producto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoproducto=tipoproductoAux;
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
      		//this.finishProcessTipoProducto();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoProducto tipoproductoLocal) throws Exception {
		
		if(this.tipoproductoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoproductoLocal.setModeloProductos(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductoLogic.getModeloProductos());
				tipoproductoLocal.setMaterialProductos(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductoLogic.getMaterialProductos());
				tipoproductoLocal.setMarcaProductos(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductoLogic.getMarcaProductos());
				tipoproductoLocal.setSegmentoProductos(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductoLogic.getSegmentoProductos());
				tipoproductoLocal.setColorProductos(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductoLogic.getColorProductos());
				tipoproductoLocal.setEfectoProductos(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductoLogic.getEfectoProductos());
				tipoproductoLocal.setTallaProductos(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductoLogic.getTallaProductos());
				tipoproductoLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
				tipoproductoLocal.setClaseProductos(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductoLogic.getClaseProductos());
				tipoproductoLocal.setProductos(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());
			
			} else {
			
				tipoproductoLocal.setModeloProductos(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductos);
				tipoproductoLocal.setMaterialProductos(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductos);
				tipoproductoLocal.setMarcaProductos(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductos);
				tipoproductoLocal.setSegmentoProductos(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductos);
				tipoproductoLocal.setColorProductos(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductos);
				tipoproductoLocal.setEfectoProductos(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductos);
				tipoproductoLocal.setTallaProductos(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductos);
				tipoproductoLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos);
				tipoproductoLocal.setClaseProductos(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductos);
				tipoproductoLocal.setProductos(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoProducto tipoproductoLocal) throws Exception {	
		if(this.tipoproductoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoproductoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoProductoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoProducto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoproducto =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoproducto =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoproductoValidator.getInvalidValues(this.tipoproducto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoProducto tipoproducto,List<TipoProducto> tipoproductos) throws Exception {
		try	{		
			TipoProductoConstantesFunciones.actualizarLista(tipoproducto,tipoproductos,this.tipoproductoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoProducto tipoproducto,List<TipoProducto> tipoproductos) throws Exception {
		try	{			
			TipoProductoConstantesFunciones.actualizarSelectedLista(tipoproducto,tipoproductos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoProducto> tipoproductosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoproductosLocal=this.tipoproductoLogic.getTipoProductos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoproductosLocal=this.tipoproductos;
			}
			//ARCHITECTURE
		
			for(TipoProducto tipoproductoLocal:tipoproductosLocal) {
				if(this.permiteMantenimiento(tipoproductoLocal) && tipoproductoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoProductoConstantesFunciones.getTipoProductoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoProductoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProducto.jLabelid_empresaTipoProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoProductoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProducto.jLabelcodigoTipoProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoProductoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProducto.jLabelnombreTipoProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoProductoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProducto.jLabeldescripcionTipoProducto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoProducto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoProducto.jLabelid_empresaTipoProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoProducto.jLabelcodigoTipoProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoProducto.jLabelnombreTipoProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoProducto.jLabeldescripcionTipoProducto,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ModeloProducto")) {
			if(this.tipoproducto==null) {
				this.tipoproducto= new TipoProducto();
			}

			if(this.tipoproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoProducto
				this.setVariablesFormularioToObjetoActualTipoProducto(this.tipoproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);

				this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.getmodeloproducto().setTipoProducto(this.tipoproducto);
			}

			return;
		}
		 else  if(sTipo.equals("MaterialProducto")) {
			if(this.tipoproducto==null) {
				this.tipoproducto= new TipoProducto();
			}

			if(this.tipoproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoProducto
				this.setVariablesFormularioToObjetoActualTipoProducto(this.tipoproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);

				this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.getmaterialproducto().setTipoProducto(this.tipoproducto);
			}

			return;
		}
		 else  if(sTipo.equals("MarcaProducto")) {
			if(this.tipoproducto==null) {
				this.tipoproducto= new TipoProducto();
			}

			if(this.tipoproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoProducto
				this.setVariablesFormularioToObjetoActualTipoProducto(this.tipoproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);

				this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.getmarcaproducto().setTipoProducto(this.tipoproducto);
			}

			return;
		}
		 else  if(sTipo.equals("SegmentoProducto")) {
			if(this.tipoproducto==null) {
				this.tipoproducto= new TipoProducto();
			}

			if(this.tipoproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoProducto
				this.setVariablesFormularioToObjetoActualTipoProducto(this.tipoproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);

				this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.getsegmentoproducto().setTipoProducto(this.tipoproducto);
			}

			return;
		}
		 else  if(sTipo.equals("ColorProducto")) {
			if(this.tipoproducto==null) {
				this.tipoproducto= new TipoProducto();
			}

			if(this.tipoproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoProducto
				this.setVariablesFormularioToObjetoActualTipoProducto(this.tipoproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);

				this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.getcolorproducto().setTipoProducto(this.tipoproducto);
			}

			return;
		}
		 else  if(sTipo.equals("EfectoProducto")) {
			if(this.tipoproducto==null) {
				this.tipoproducto= new TipoProducto();
			}

			if(this.tipoproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoProducto
				this.setVariablesFormularioToObjetoActualTipoProducto(this.tipoproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);

				this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.getefectoproducto().setTipoProducto(this.tipoproducto);
			}

			return;
		}
		 else  if(sTipo.equals("TallaProducto")) {
			if(this.tipoproducto==null) {
				this.tipoproducto= new TipoProducto();
			}

			if(this.tipoproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoProducto
				this.setVariablesFormularioToObjetoActualTipoProducto(this.tipoproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);

				this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.gettallaproducto().setTipoProducto(this.tipoproducto);
			}

			return;
		}
		 else  if(sTipo.equals("ParametroInventarioDefecto")) {
			if(this.tipoproducto==null) {
				this.tipoproducto= new TipoProducto();
			}

			if(this.tipoproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoProducto
				this.setVariablesFormularioToObjetoActualTipoProducto(this.tipoproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);

				this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.getparametroinventariodefecto().setTipoProducto(this.tipoproducto);
			}

			return;
		}
		 else  if(sTipo.equals("ClaseProducto")) {
			if(this.tipoproducto==null) {
				this.tipoproducto= new TipoProducto();
			}

			if(this.tipoproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoProducto
				this.setVariablesFormularioToObjetoActualTipoProducto(this.tipoproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);

				this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.getclaseproducto().setTipoProducto(this.tipoproducto);
			}

			return;
		}
		 else  if(sTipo.equals("Producto")) {
			if(this.tipoproducto==null) {
				this.tipoproducto= new TipoProducto();
			}

			if(this.tipoproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoProducto
				this.setVariablesFormularioToObjetoActualTipoProducto(this.tipoproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);

				this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.getproducto().setTipoProducto(this.tipoproducto);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoProducto--;	
		
		
		this.tipoproductoAux=new TipoProducto();
		
		this.tipoproductoAux.setId(this.iIdNuevoTipoProducto);
		this.tipoproductoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoproductoLogic.getTipoProductos().add(this.tipoproductoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoproductos.add(this.tipoproductoAux);
		}
		//ARCHITECTURE
		
		this.tipoproducto=this.tipoproductoAux;
		
		if(TipoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoProducto(this.tipoproducto);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoProducto(this.tipoproducto);
		}
				
		//this.setDefaultControlesTipoProducto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoProducto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoProducto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProducto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoProducto(this.tipoproductoBean,this.tipoproducto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoProductoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoproductoSessionBean.getConGuardarRelaciones()) {
			classes=TipoProductoConstantesFunciones.getClassesRelationshipsOfTipoProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoproductoReturnGeneral=tipoproductoLogic.procesarEventosTipoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoproductoLogic.getTipoProductos(),this.tipoproducto,this.tipoproductoParameterGeneral,this.isEsNuevoTipoProducto,classes);//this.tipoproductoLogic.getTipoProducto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoProducto(this.tipoproductoReturnGeneral,this.tipoproductoBean,false);
		
		if(this.tipoproductoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoProducto(this.tipoproductoReturnGeneral.getTipoProducto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoProducto(this.tipoproductoReturnGeneral.getTipoProducto());
		}
		
		if(this.tipoproductoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoProducto(this.tipoproductoReturnGeneral.getTipoProducto(),classes);//this.tipoproductoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoProducto(this.tipoproducto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoProducto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoProducto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoProductoBeanSwingJInternalFrameAdditional.RecargarFormTipoProducto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoProducto(false);
						
			if(tipoproductoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductoSessionBean.getEsGuardarRelacionado() && ModeloProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonModeloProductoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductoSessionBean.getEsGuardarRelacionado() && MaterialProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonMaterialProductoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductoSessionBean.getEsGuardarRelacionado() && MarcaProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonMarcaProductoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductoSessionBean.getEsGuardarRelacionado() && SegmentoProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSegmentoProductoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductoSessionBean.getEsGuardarRelacionado() && ColorProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonColorProductoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductoSessionBean.getEsGuardarRelacionado() && EfectoProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEfectoProductoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductoSessionBean.getEsGuardarRelacionado() && TallaProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTallaProductoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductoSessionBean.getEsGuardarRelacionado() && ClaseProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClaseProductoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado() && ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProducto();
			}
			
			this.actualizarVisualTableDatosTipoProducto();
			
			this.jTableDatosTipoProducto.setRowSelectionInterval(this.getIndiceNuevoTipoProducto(), this.getIndiceNuevoTipoProducto());
			
			this.seleccionarFilaTablaTipoProductoActual();
						
			this.actualizarEstadoCeldasBotonesTipoProducto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoProducto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoProducto.jTextFieldcodigoTipoProducto.setEnabled(isHabilitar && this.tipoproductoConstantesFunciones.activarcodigoTipoProducto);
		this.jInternalFrameDetalleFormTipoProducto.jTextAreanombreTipoProducto.setEnabled(isHabilitar && this.tipoproductoConstantesFunciones.activarnombreTipoProducto);
		this.jInternalFrameDetalleFormTipoProducto.jTextAreadescripcionTipoProducto.setEnabled(isHabilitar && this.tipoproductoConstantesFunciones.activardescripcionTipoProducto);	
		//
		this.jInternalFrameDetalleFormTipoProducto.jComboBoxid_empresaTipoProducto.setEnabled(isHabilitar && this.tipoproductoConstantesFunciones.activarid_empresaTipoProducto);
	};
	
	public void setDefaultControlesTipoProducto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoProducto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoproductoSessionBean.setConGuardarRelaciones(true);			
			this.tipoproductoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoProducto.jTabbedPaneRelacionesTipoProducto.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoproductoSessionBean.setConGuardarRelaciones(false);			
			this.tipoproductoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoProducto.jTabbedPaneRelacionesTipoProducto.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoProducto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProducto tipoproductoAux:this.tipoproductoLogic.getTipoProductos()) {
				if(tipoproductoAux.getId().equals(this.iIdNuevoTipoProducto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProducto tipoproductoAux:this.tipoproductos) {
				if(tipoproductoAux.getId().equals(this.iIdNuevoTipoProducto)) {
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
	
	public int getIndiceActualTipoProducto(TipoProducto tipoproducto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProducto tipoproductoAux:this.tipoproductoLogic.getTipoProductos()) {
				if(tipoproductoAux.getId().equals(tipoproducto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProducto tipoproductoAux:this.tipoproductos) {
				if(tipoproductoAux.getId().equals(tipoproducto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoProducto(TipoProducto tipoproductoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProducto tipoproductoAux:this.tipoproductoLogic.getTipoProductos()) {
				if(tipoproductoAux.getTipoProductoOriginal().getId().equals(tipoproductoOriginal.getId())) {
					existe=true;
					tipoproductoOriginal.setId(tipoproductoAux.getId());
					tipoproductoOriginal.setVersionRow(tipoproductoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProducto tipoproductoAux:this.tipoproductos) {
				if(tipoproductoAux.getTipoProductoOriginal().getId().equals(tipoproductoOriginal.getId())) {
					existe=true;
					tipoproductoOriginal.setId(tipoproductoAux.getId());
					tipoproductoOriginal.setVersionRow(tipoproductoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoProducto(Boolean esParaCancelar) throws Exception {
		tipoproductosAux=new ArrayList<TipoProducto>();
		tipoproductoAux=new TipoProducto();
		
		if(!this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoProducto tipoproductoAux:this.tipoproductoLogic.getTipoProductos()) {
					if(tipoproductoAux.getId()<0) {
						tipoproductosAux.add(tipoproductoAux);
					}		
				}
				this.iIdNuevoTipoProducto=0L;
				this.tipoproductoLogic.getTipoProductos().removeAll(tipoproductosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProducto tipoproductoAux:this.tipoproductos) {
					if(tipoproductoAux.getId()<0) {
						tipoproductosAux.add(tipoproductoAux);
					}		
				}
				this.iIdNuevoTipoProducto=0L;
				this.tipoproductos.removeAll(tipoproductosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoProducto 
					&& this.tipoproductoLogic.getTipoProductos().size()>0
					) {
					tipoproductoAux=this.tipoproductoLogic.getTipoProductos().get(this.tipoproductoLogic.getTipoProductos().size() - 1);
				
					if(tipoproductoAux.getId()<0) {
						this.tipoproductoLogic.getTipoProductos().remove(tipoproductoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoProducto && this.tipoproductos.size()>0) {
					tipoproductoAux=this.tipoproductos.get(this.tipoproductos.size() - 1);
				
					if(tipoproductoAux.getId()<0) {
						this.tipoproductos.remove(tipoproductoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoProducto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoproducto.getId()<0) {
				this.tipoproductoLogic.getTipoProductos().remove(this.tipoproducto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoproducto.getId()<0) {
				this.tipoproductos.remove(this.tipoproducto);
			}
		}			
	}
	
	public void setEstadosInicialesTipoProducto(List<TipoProducto> tipoproductosAux) throws Exception {
		TipoProductoConstantesFunciones.setEstadosInicialesTipoProducto(tipoproductosAux);
	}
	
	public void setEstadosInicialesTipoProducto(TipoProducto tipoproductoAux) throws Exception {
		TipoProductoConstantesFunciones.setEstadosInicialesTipoProducto(tipoproductoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoProductoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoProductoActual()) {
				if(!this.isEsNuevoTipoProducto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoProducto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoProductoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Producto ?", "MANTENIMIENTO DE Tipo Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoProducto tipoproducto) throws Exception {
		TipoProductoConstantesFunciones.seleccionarAsignar(this.tipoproducto,tipoproducto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoProducto=this.isPermisoActualizarOriginalTipoProducto;
			
			
			this.seleccionarAsignar(tipoproducto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoProductoConstantesFunciones.quitarEspaciosTipoProducto(this.tipoproducto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoproductoSessionBean.setsFuncionBusquedaRapida(this.tipoproductoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoProducto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoProducto(esParaCancelar);				
				this.cancelarNuevoTipoProducto(esParaCancelar);								
			}
			
			this.tipoproducto=new TipoProducto();
			
			this.inicializarTipoProducto();
			
			this.actualizarEstadoCeldasBotonesTipoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoProducto() throws Exception {
		try {
			TipoProductoConstantesFunciones.inicializarTipoProducto(this.tipoproducto);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoproductoLogic.getTipoProductos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoProductos(String sAccionBusqueda,List<TipoProducto> tipoproductosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoProducto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoProductoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoProductoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoProducto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Productos");		
		parameters.put("busquedapor", TipoProductoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ModeloProducto.class));
			classes.add(new Classe(MaterialProducto.class));
			classes.add(new Classe(MarcaProducto.class));
			classes.add(new Classe(SegmentoProducto.class));
			classes.add(new Classe(ColorProducto.class));
			classes.add(new Classe(EfectoProducto.class));
			classes.add(new Classe(TallaProducto.class));
			classes.add(new Classe(ParametroInventarioDefecto.class));
			classes.add(new Classe(ClaseProducto.class));
			classes.add(new Classe(Producto.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoProductoLogic tipoproductoLogicAuxiliar=new TipoProductoLogic();
					tipoproductoLogicAuxiliar.setDatosCliente(tipoproductoLogic.getDatosCliente());				
					tipoproductoLogicAuxiliar.setTipoProductos(tipoproductosParaReportes);
					
					tipoproductoLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoProductoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoproductosParaReportes=tipoproductoLogicAuxiliar.getTipoProductos();
					
					//tipoproductoLogic.getNewConnexionToDeep();
					
					//for (TipoProducto tipoproducto:tipoproductosParaReportes) {
					//	tipoproductoLogic.deepLoad(tipoproducto, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoproductoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoproductoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileModeloProducto = AuxiliarReportes.class.getResourceAsStream("ModeloProductoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_modeloproducto", reportFileModeloProducto);

			InputStream reportFileMaterialProducto = AuxiliarReportes.class.getResourceAsStream("MaterialProductoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_materialproducto", reportFileMaterialProducto);

			InputStream reportFileMarcaProducto = AuxiliarReportes.class.getResourceAsStream("MarcaProductoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_marcaproducto", reportFileMarcaProducto);

			InputStream reportFileSegmentoProducto = AuxiliarReportes.class.getResourceAsStream("SegmentoProductoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_segmentoproducto", reportFileSegmentoProducto);

			InputStream reportFileColorProducto = AuxiliarReportes.class.getResourceAsStream("ColorProductoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_colorproducto", reportFileColorProducto);

			InputStream reportFileEfectoProducto = AuxiliarReportes.class.getResourceAsStream("EfectoProductoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_efectoproducto", reportFileEfectoProducto);

			InputStream reportFileTallaProducto = AuxiliarReportes.class.getResourceAsStream("TallaProductoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_tallaproducto", reportFileTallaProducto);

			InputStream reportFileParametroInventarioDefecto = AuxiliarReportes.class.getResourceAsStream("ParametroInventarioDefectoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametroinventariodefecto", reportFileParametroInventarioDefecto);

			InputStream reportFileClaseProducto = AuxiliarReportes.class.getResourceAsStream("ClaseProductoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_claseproducto", reportFileClaseProducto);

			InputStream reportFileProducto = AuxiliarReportes.class.getResourceAsStream("ProductoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_producto", reportFileProducto);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoProducto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoProductoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoProductoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoProducto=new JRBeanArrayDataSource(TipoProductoJInternalFrame.TraerTipoProductoBeans(tipoproductosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoProducto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoProductoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoProductoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoProductoBean.TraerTipoProductoBeans(tipoproductosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoProductos(sAccionBusqueda,sTipoArchivoReporte,tipoproductosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoProductos(sAccionBusqueda,sTipoArchivoReporte,tipoproductosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoProductoActionPerformed(null);
					//this.generarExcelReporteTipoProductos(sAccionBusqueda,sTipoArchivoReporte,tipoproductosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoProductos(sAccionBusqueda,sTipoArchivoReporte,tipoproductosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoProductos(sAccionBusqueda,sTipoArchivoReporte,tipoproductosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoProductos(sAccionBusqueda,sTipoArchivoReporte,tipoproductosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProducto> tipoproductosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproducto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProductos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoProducto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoProducto tipoproducto : tipoproductosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoProductoConstantesFunciones.generarExcelReporteDataTipoProducto("NORMAL",row,workbook,tipoproducto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoProducto(String sTipo,Row row,Workbook workbook) {
		
		TipoProductoConstantesFunciones.generarExcelReporteHeaderTipoProducto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProducto> tipoproductosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproducto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoProducto tipoproducto : tipoproductosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoProductoConstantesFunciones.getTipoProductoDescripcion(tipoproducto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoProductoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoProductoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoproducto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoProductoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoProductoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoproducto.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoProductoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoProductoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoproducto.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoProductoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoProductoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoproducto.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProducto> tipoproductosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoProducto> tipoproductosRespaldo=null;
		
		classes=TipoProductoConstantesFunciones.getClassesRelationshipsOfTipoProducto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoproductoLogic.setDatosCliente(this.datosCliente);
		this.tipoproductoLogic.setDatosDeep(this.datosDeep);
		this.tipoproductoLogic.setIsConDeep(true);
		
		tipoproductosRespaldo=this.tipoproductoLogic.getTipoProductos();
		
		this.tipoproductoLogic.setTipoProductos(tipoproductosParaReportes);	
		this.tipoproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoproductosParaReportes=this.tipoproductoLogic.getTipoProductos();
		this.tipoproductoLogic.setTipoProductos(tipoproductosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproducto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoProducto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoProducto tipoproducto : tipoproductosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoProducto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoProductoConstantesFunciones.generarExcelReporteDataTipoProducto("NORMAL",row,workbook,tipoproducto,cellStyleDataAux);
		
			
			


				//ModeloProducto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ModeloProductoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoproducto.getModeloProductos()!=null && tipoproducto.getModeloProductos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ModeloProductoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ModeloProductoConstantesFunciones.generarExcelReporteHeaderModeloProducto("RELACIONADO",row,workbook);
				}

				if(tipoproducto.getModeloProductos()!=null) {
					i2=0;
					for(ModeloProducto modeloproducto : tipoproducto.getModeloProductos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ModeloProductoConstantesFunciones.generarExcelReporteDataModeloProducto("RELACIONADO",row,workbook,modeloproducto,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//MaterialProducto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(MaterialProductoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoproducto.getMaterialProductos()!=null && tipoproducto.getMaterialProductos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(MaterialProductoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					MaterialProductoConstantesFunciones.generarExcelReporteHeaderMaterialProducto("RELACIONADO",row,workbook);
				}

				if(tipoproducto.getMaterialProductos()!=null) {
					i2=0;
					for(MaterialProducto materialproducto : tipoproducto.getMaterialProductos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						MaterialProductoConstantesFunciones.generarExcelReporteDataMaterialProducto("RELACIONADO",row,workbook,materialproducto,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//MarcaProducto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(MarcaProductoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoproducto.getMarcaProductos()!=null && tipoproducto.getMarcaProductos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(MarcaProductoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					MarcaProductoConstantesFunciones.generarExcelReporteHeaderMarcaProducto("RELACIONADO",row,workbook);
				}

				if(tipoproducto.getMarcaProductos()!=null) {
					i2=0;
					for(MarcaProducto marcaproducto : tipoproducto.getMarcaProductos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						MarcaProductoConstantesFunciones.generarExcelReporteDataMarcaProducto("RELACIONADO",row,workbook,marcaproducto,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//SegmentoProducto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(SegmentoProductoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoproducto.getSegmentoProductos()!=null && tipoproducto.getSegmentoProductos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(SegmentoProductoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					SegmentoProductoConstantesFunciones.generarExcelReporteHeaderSegmentoProducto("RELACIONADO",row,workbook);
				}

				if(tipoproducto.getSegmentoProductos()!=null) {
					i2=0;
					for(SegmentoProducto segmentoproducto : tipoproducto.getSegmentoProductos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						SegmentoProductoConstantesFunciones.generarExcelReporteDataSegmentoProducto("RELACIONADO",row,workbook,segmentoproducto,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ColorProducto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ColorProductoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoproducto.getColorProductos()!=null && tipoproducto.getColorProductos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ColorProductoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ColorProductoConstantesFunciones.generarExcelReporteHeaderColorProducto("RELACIONADO",row,workbook);
				}

				if(tipoproducto.getColorProductos()!=null) {
					i2=0;
					for(ColorProducto colorproducto : tipoproducto.getColorProductos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ColorProductoConstantesFunciones.generarExcelReporteDataColorProducto("RELACIONADO",row,workbook,colorproducto,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//EfectoProducto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(EfectoProductoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoproducto.getEfectoProductos()!=null && tipoproducto.getEfectoProductos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(EfectoProductoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					EfectoProductoConstantesFunciones.generarExcelReporteHeaderEfectoProducto("RELACIONADO",row,workbook);
				}

				if(tipoproducto.getEfectoProductos()!=null) {
					i2=0;
					for(EfectoProducto efectoproducto : tipoproducto.getEfectoProductos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						EfectoProductoConstantesFunciones.generarExcelReporteDataEfectoProducto("RELACIONADO",row,workbook,efectoproducto,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//TallaProducto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(TallaProductoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoproducto.getTallaProductos()!=null && tipoproducto.getTallaProductos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(TallaProductoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					TallaProductoConstantesFunciones.generarExcelReporteHeaderTallaProducto("RELACIONADO",row,workbook);
				}

				if(tipoproducto.getTallaProductos()!=null) {
					i2=0;
					for(TallaProducto tallaproducto : tipoproducto.getTallaProductos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						TallaProductoConstantesFunciones.generarExcelReporteDataTallaProducto("RELACIONADO",row,workbook,tallaproducto,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ParametroInventarioDefecto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoproducto.getParametroInventarioDefectos()!=null && tipoproducto.getParametroInventarioDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroInventarioDefectoConstantesFunciones.generarExcelReporteHeaderParametroInventarioDefecto("RELACIONADO",row,workbook);
				}

				if(tipoproducto.getParametroInventarioDefectos()!=null) {
					i2=0;
					for(ParametroInventarioDefecto parametroinventariodefecto : tipoproducto.getParametroInventarioDefectos()) {
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


				//ClaseProducto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ClaseProductoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoproducto.getClaseProductos()!=null && tipoproducto.getClaseProductos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ClaseProductoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ClaseProductoConstantesFunciones.generarExcelReporteHeaderClaseProducto("RELACIONADO",row,workbook);
				}

				if(tipoproducto.getClaseProductos()!=null) {
					i2=0;
					for(ClaseProducto claseproducto : tipoproducto.getClaseProductos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ClaseProductoConstantesFunciones.generarExcelReporteDataClaseProducto("RELACIONADO",row,workbook,claseproducto,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Producto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoproducto.getProductos()!=null && tipoproducto.getProductos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoConstantesFunciones.generarExcelReporteHeaderProducto("RELACIONADO",row,workbook);
				}

				if(tipoproducto.getProductos()!=null) {
					i2=0;
					for(Producto producto : tipoproducto.getProductos()) {
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
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoProductoConstantesFunciones.getTipoProductoDescripcion(tipoproducto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProducto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProducto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoProducto() throws Exception {		
		this.startProcessTipoProducto(true);
	}
	
	public void startProcessTipoProducto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoProducto ,this.jPanelParametrosReportesTipoProducto, this.jScrollPanelDatosTipoProducto,this.jPanelPaginacionTipoProducto, this.jScrollPanelDatosEdicionTipoProducto, this.jPanelAccionesTipoProducto,this.jPanelAccionesFormularioTipoProducto,this.jmenuBarTipoProducto,this.jmenuBarDetalleTipoProducto,this.jTtoolBarTipoProducto,this.jTtoolBarDetalleTipoProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoProducto=this.jTabbedPaneBusquedasTipoProducto; 
		
		final JPanel jPanelParametrosReportesTipoProducto=this.jPanelParametrosReportesTipoProducto;
		//final JScrollPane jScrollPanelDatosTipoProducto=this.jScrollPanelDatosTipoProducto;
		final JTable jTableDatosTipoProducto=this.jTableDatosTipoProducto;		
		final JPanel jPanelPaginacionTipoProducto=this.jPanelPaginacionTipoProducto;
		//final JScrollPane jScrollPanelDatosEdicionTipoProducto=this.jScrollPanelDatosEdicionTipoProducto;
		final JPanel jPanelAccionesTipoProducto=this.jPanelAccionesTipoProducto;
		
		JPanel jPanelCamposAuxiliarTipoProducto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoProducto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoProducto!=null) {
			jPanelCamposAuxiliarTipoProducto=this.jInternalFrameDetalleFormTipoProducto.jPanelCamposTipoProducto;
			jPanelAccionesFormularioAuxiliarTipoProducto=this.jInternalFrameDetalleFormTipoProducto.jPanelAccionesFormularioTipoProducto;
		}
		
		final JPanel jPanelCamposTipoProducto=jPanelCamposAuxiliarTipoProducto;
		final JPanel jPanelAccionesFormularioTipoProducto=jPanelAccionesFormularioAuxiliarTipoProducto;
		
		
		final JMenuBar jmenuBarTipoProducto=this.jmenuBarTipoProducto;
		final JToolBar jTtoolBarTipoProducto=this.jTtoolBarTipoProducto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoProducto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoProducto!=null) {
			jmenuBarDetalleAuxiliarTipoProducto=this.jInternalFrameDetalleFormTipoProducto.jmenuBarDetalleTipoProducto;
			jTtoolBarDetalleAuxiliarTipoProducto=this.jInternalFrameDetalleFormTipoProducto.jTtoolBarDetalleTipoProducto;
		}
		
		final JMenuBar jmenuBarDetalleTipoProducto=jmenuBarDetalleAuxiliarTipoProducto;
		final JToolBar jTtoolBarDetalleTipoProducto=jTtoolBarDetalleAuxiliarTipoProducto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoProducto;
			processRunnable.jTableDatos=jTableDatosTipoProducto;
			processRunnable.jPanelCampos=jPanelCamposTipoProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoProducto;
			processRunnable.jPanelAcciones=jPanelAccionesTipoProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoProducto;
			
			
			processRunnable.jmenuBar=jmenuBarTipoProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoProducto;
			processRunnable.jTtoolBar=jTtoolBarTipoProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoProducto ,jPanelParametrosReportesTipoProducto,jTableDatosTipoProducto, /*jScrollPanelDatosTipoProducto,*/jPanelCamposTipoProducto,jPanelPaginacionTipoProducto, /*jScrollPanelDatosEdicionTipoProducto,*/ jPanelAccionesTipoProducto,jPanelAccionesFormularioTipoProducto,jmenuBarTipoProducto,jmenuBarDetalleTipoProducto,jTtoolBarTipoProducto,jTtoolBarDetalleTipoProducto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoProducto ,jPanelParametrosReportesTipoProducto, jScrollPanelDatosTipoProducto,jPanelPaginacionTipoProducto, jScrollPanelDatosEdicionTipoProducto, jPanelAccionesTipoProducto,jPanelAccionesFormularioTipoProducto,jmenuBarTipoProducto,jmenuBarDetalleTipoProducto,jTtoolBarTipoProducto,jTtoolBarDetalleTipoProducto);
						
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
	
	public void finishProcessTipoProducto() {// throws Exception 
		this.finishProcessTipoProducto(true);
	}
	
	public void finishProcessTipoProducto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoProducto ,this.jPanelParametrosReportesTipoProducto, this.jScrollPanelDatosTipoProducto,this.jPanelPaginacionTipoProducto, this.jScrollPanelDatosEdicionTipoProducto, this.jPanelAccionesTipoProducto,this.jPanelAccionesFormularioTipoProducto,this.jmenuBarTipoProducto,this.jmenuBarDetalleTipoProducto,this.jTtoolBarTipoProducto,this.jTtoolBarDetalleTipoProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoProducto=this.jTabbedPaneBusquedasTipoProducto; 
		
		final JPanel jPanelParametrosReportesTipoProducto=this.jPanelParametrosReportesTipoProducto;
		//final JScrollPane jScrollPanelDatosTipoProducto=this.jScrollPanelDatosTipoProducto;
		final JTable jTableDatosTipoProducto=this.jTableDatosTipoProducto;		
		final JPanel jPanelPaginacionTipoProducto=this.jPanelPaginacionTipoProducto;
		//final JScrollPane jScrollPanelDatosEdicionTipoProducto=this.jScrollPanelDatosEdicionTipoProducto;
		final JPanel jPanelAccionesTipoProducto=this.jPanelAccionesTipoProducto;
		
		JPanel jPanelCamposAuxiliarTipoProducto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoProducto=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoProducto!=null) {
			jPanelCamposAuxiliarTipoProducto=this.jInternalFrameDetalleFormTipoProducto.jPanelCamposTipoProducto;
			jPanelAccionesFormularioAuxiliarTipoProducto=this.jInternalFrameDetalleFormTipoProducto.jPanelAccionesFormularioTipoProducto;
		}
		
		final JPanel jPanelCamposTipoProducto=jPanelCamposAuxiliarTipoProducto;
		final JPanel jPanelAccionesFormularioTipoProducto=jPanelAccionesFormularioAuxiliarTipoProducto;
		
		
		final JMenuBar jmenuBarTipoProducto=this.jmenuBarTipoProducto;		
		final JToolBar jTtoolBarTipoProducto=this.jTtoolBarTipoProducto;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoProducto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoProducto!=null) {
			jmenuBarDetalleAuxiliarTipoProducto=this.jInternalFrameDetalleFormTipoProducto.jmenuBarDetalleTipoProducto;
			jTtoolBarDetalleAuxiliarTipoProducto=this.jInternalFrameDetalleFormTipoProducto.jTtoolBarDetalleTipoProducto;		
		}
		
		final JMenuBar jmenuBarDetalleTipoProducto=jmenuBarDetalleAuxiliarTipoProducto;
		final JToolBar jTtoolBarDetalleTipoProducto=jTtoolBarDetalleAuxiliarTipoProducto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoProducto;
			processRunnable.jTableDatos=jTableDatosTipoProducto;
			processRunnable.jPanelCampos=jPanelCamposTipoProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoProducto;
			processRunnable.jPanelAcciones=jPanelAccionesTipoProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoProducto;
			
			
			processRunnable.jmenuBar=jmenuBarTipoProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoProducto;
			processRunnable.jTtoolBar=jTtoolBarTipoProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoProducto ,jPanelParametrosReportesTipoProducto, jTableDatosTipoProducto,/*jScrollPanelDatosTipoProducto,*/jPanelCamposTipoProducto,jPanelPaginacionTipoProducto, /*jScrollPanelDatosEdicionTipoProducto,*/ jPanelAccionesTipoProducto,jPanelAccionesFormularioTipoProducto,jmenuBarTipoProducto,jmenuBarDetalleTipoProducto,jTtoolBarTipoProducto,jTtoolBarDetalleTipoProducto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoProducto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoProducto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoProducto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoProducto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoProducto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoproductoConstantesFunciones.getsFinalQueryTipoProducto();
		String  finalQueryPaginacionTodos=this.tipoproductoConstantesFunciones.getsFinalQueryTipoProducto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoProductoConstantesFunciones.getArrayColumnasGlobalesNoTipoProducto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoProductoConstantesFunciones.getArrayColumnasGlobalesTipoProducto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoProductoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoproductosEliminados= new ArrayList<TipoProducto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoProducto();
		
				///*TipoProductoSessionBean*/this.tipoproductoSessionBean=new TipoProductoSessionBean();
			
			if(this.tipoproductoSessionBean==null) {
				this.tipoproductoSessionBean=new TipoProductoSessionBean();
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
					this.iNumeroPaginacion=TipoProductoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoProductoConstantesFunciones.getClassesForeignKeysOfTipoProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoproducto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoproductosAux= new ArrayList<TipoProducto>();
			
				
			tipoproductoLogic.setDatosCliente(this.datosCliente);
			tipoproductoLogic.setDatosDeep(this.datosDeep);
			tipoproductoLogic.setIsConDeep(true);
			
			
			tipoproductoLogic.getTipoProductoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoproductoLogic.getTodosTipoProductos(finalQueryGlobal,pagination);
					
					//tipoproductoLogic.getTodosTipoProductosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoproductoLogic.getTipoProductos()==null|| tipoproductoLogic.getTipoProductos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoproductosAux= new ArrayList<TipoProducto>();
							tipoproductosAux.addAll(tipoproductoLogic.getTipoProductos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoproductosAux= new ArrayList<TipoProducto>();
							tipoproductosAux.addAll(tipoproductos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoproductoLogic.getTodosTipoProductos(finalQueryGlobal+"",this.pagination);												
							
							//tipoproductoLogic.getTodosTipoProductosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoProductos("Todos",tipoproductoLogic.getTipoProductos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoproductoLogic.setTipoProductos(new ArrayList<TipoProducto>());					
							tipoproductoLogic.getTipoProductos().addAll(tipoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoproductos=new ArrayList<TipoProducto>();
							tipoproductos.addAll(tipoproductosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoProducto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoProducto=this.idActual;
				
				} else if(this.idTipoProductoActual!=null && this.idTipoProductoActual!=0L) {
					idTipoProducto=idTipoProductoActual;
				}
				
					
				this.sDetalleReporte=TipoProductoConstantesFunciones.getDetalleIndicePorId(idTipoProducto);
				
				this.tipoproductos=new ArrayList<TipoProducto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoproductoLogic.getEntity(idTipoProducto);
					
					//tipoproductoLogic.getEntityWithConnection(idTipoProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoproductoLogic.setTipoProductos(new ArrayList<TipoProducto>());
					tipoproductoLogic.getTipoProductos().add(tipoproductoLogic.getTipoProducto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoproductos=new ArrayList<TipoProducto>();
					this.tipoproductos.add(tipoproducto);
				}
				
				if(tipoproductoLogic.getTipoProducto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoproductoLogic.getTipoProductosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoproductoLogic.getTipoProductos()==null||tipoproductoLogic.getTipoProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoproductos==null|| tipoproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductosAux=new ArrayList<TipoProducto>();
						tipoproductosAux.addAll(tipoproductoLogic.getTipoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoproductosAux=new ArrayList<TipoProducto>();
							tipoproductosAux.addAll(tipoproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoproductoLogic.getTipoProductosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoProductos("BusquedaPorCodigo",tipoproductoLogic.getTipoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoProductos("BusquedaPorCodigo",tipoproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductoLogic.setTipoProductos(new ArrayList<TipoProducto>());
						tipoproductoLogic.getTipoProductos().addAll(tipoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoproductos=new ArrayList<TipoProducto>();
							tipoproductos.addAll(tipoproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoproductoLogic.getTipoProductosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoproductoLogic.getTipoProductos()==null||tipoproductoLogic.getTipoProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoproductos==null|| tipoproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductosAux=new ArrayList<TipoProducto>();
						tipoproductosAux.addAll(tipoproductoLogic.getTipoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoproductosAux=new ArrayList<TipoProducto>();
							tipoproductosAux.addAll(tipoproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoproductoLogic.getTipoProductosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoProductos("BusquedaPorNombre",tipoproductoLogic.getTipoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoProductos("BusquedaPorNombre",tipoproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductoLogic.setTipoProductos(new ArrayList<TipoProducto>());
						tipoproductoLogic.getTipoProductos().addAll(tipoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoproductos=new ArrayList<TipoProducto>();
							tipoproductos.addAll(tipoproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoproductoLogic.getTipoProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoproductoLogic.getTipoProductos()==null||tipoproductoLogic.getTipoProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoproductos==null|| tipoproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductosAux=new ArrayList<TipoProducto>();
						tipoproductosAux.addAll(tipoproductoLogic.getTipoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoproductosAux=new ArrayList<TipoProducto>();
							tipoproductosAux.addAll(tipoproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoproductoLogic.getTipoProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoProductos("FK_IdEmpresa",tipoproductoLogic.getTipoProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoProductos("FK_IdEmpresa",tipoproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductoLogic.setTipoProductos(new ArrayList<TipoProducto>());
						tipoproductoLogic.getTipoProductos().addAll(tipoproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoproductos=new ArrayList<TipoProducto>();
							tipoproductos.addAll(tipoproductosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoProducto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoProducto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoproductoLogic.getTipoProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoproductos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoproductoLogic.getTipoProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoproductos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoProducto tipoproducto) {
		Boolean permite=true;
		
		if(this.tipoproducto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoProductoConstantesFunciones.getOrderByListaTipoProducto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoProductoConstantesFunciones.getOrderByListaTipoProducto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProducto tipoproducto:tipoproductoLogic.getTipoProductos()) {
				if(tipoproducto.getsType().equals(Constantes2.S_TOTALES)) {
					tipoproductoTotales=tipoproducto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProducto tipoproducto:this.tipoproductos) {
				if(tipoproducto.getsType().equals(Constantes2.S_TOTALES)) {
					tipoproductoTotales=tipoproducto;
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
			this.tipoproductoAux=new TipoProducto();
			this.tipoproductoAux.setsType(Constantes2.S_TOTALES);
			this.tipoproductoAux.setIsNew(false);
			this.tipoproductoAux.setIsChanged(false);
			this.tipoproductoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoProductoConstantesFunciones.TotalizarValoresFilaTipoProducto(this.tipoproductoLogic.getTipoProductos(),this.tipoproductoAux);
				
				this.tipoproductoLogic.getTipoProductos().add(this.tipoproductoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoProductoConstantesFunciones.TotalizarValoresFilaTipoProducto(this.tipoproductos,this.tipoproductoAux);
				
				this.tipoproductos.add(this.tipoproductoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoproductoTotales=new TipoProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoproductoLogic.getTipoProductos().remove(tipoproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoproductos.remove(tipoproductoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoproductoTotales=new TipoProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProducto tipoproducto:tipoproductoLogic.getTipoProductos()) {
				if(tipoproducto.getsType().equals(Constantes2.S_TOTALES)) {
					tipoproductoTotales=tipoproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoProductoConstantesFunciones.TotalizarValoresFilaTipoProducto(this.tipoproductoLogic.getTipoProductos(),tipoproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProducto tipoproducto:this.tipoproductos) {
				if(tipoproducto.getsType().equals(Constantes2.S_TOTALES)) {
					tipoproductoTotales=tipoproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoProductoConstantesFunciones.TotalizarValoresFilaTipoProducto(this.tipoproductos,tipoproductoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoProductosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoProductosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoProductosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoProductosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoproductoLogic.getTipoProductosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoProductosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoproductoLogic.getTipoProductosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoProductosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoproductoLogic.getTipoProductosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoProducto() {
		this.isPermisoTodoTipoProducto=false;
		this.isPermisoNuevoTipoProducto=false;
		this.isPermisoActualizarTipoProducto=false;
		this.isPermisoActualizarOriginalTipoProducto=false;
		this.isPermisoEliminarTipoProducto=false;
		this.isPermisoGuardarCambiosTipoProducto=false;
		this.isPermisoConsultaTipoProducto=false;
		this.isPermisoBusquedaTipoProducto=false;
		this.isPermisoReporteTipoProducto=false;		
		this.isPermisoOrdenTipoProducto=false;		
		this.isPermisoPaginacionMedioTipoProducto=false;		
		this.isPermisoPaginacionAltoTipoProducto=false;
		this.isPermisoPaginacionTodoTipoProducto=false;
		this.isPermisoCopiarTipoProducto=false;		
		this.isPermisoVerFormTipoProducto=false;		
		this.isPermisoDuplicarTipoProducto=false;		
		this.isPermisoOrdenTipoProducto=false;		
	}
	
	public void setPermisosUsuarioTipoProducto(Boolean isPermiso) {
		this.isPermisoTodoTipoProducto=isPermiso;
		this.isPermisoNuevoTipoProducto=isPermiso;
		this.isPermisoActualizarTipoProducto=isPermiso;
		this.isPermisoActualizarOriginalTipoProducto=isPermiso;
		this.isPermisoEliminarTipoProducto=isPermiso;
		this.isPermisoGuardarCambiosTipoProducto=isPermiso;
		this.isPermisoConsultaTipoProducto=isPermiso;
		this.isPermisoBusquedaTipoProducto=isPermiso;
		this.isPermisoReporteTipoProducto=isPermiso;
		this.isPermisoOrdenTipoProducto=isPermiso;		
		this.isPermisoPaginacionMedioTipoProducto=isPermiso;		
		this.isPermisoPaginacionAltoTipoProducto=isPermiso;		
		this.isPermisoPaginacionTodoTipoProducto=isPermiso;		
		this.isPermisoCopiarTipoProducto=isPermiso;		
		this.isPermisoVerFormTipoProducto=isPermiso;		
		this.isPermisoDuplicarTipoProducto=isPermiso;
		this.isPermisoOrdenTipoProducto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoProducto(Boolean isPermiso) {
		//this.isPermisoTodoTipoProducto=isPermiso;
		this.isPermisoNuevoTipoProducto=isPermiso;
		this.isPermisoActualizarTipoProducto=isPermiso;
		this.isPermisoActualizarOriginalTipoProducto=isPermiso;
		this.isPermisoEliminarTipoProducto=isPermiso;
		this.isPermisoGuardarCambiosTipoProducto=isPermiso;
		//this.isPermisoConsultaTipoProducto=isPermiso;
		//this.isPermisoBusquedaTipoProducto=isPermiso;
		//this.isPermisoReporteTipoProducto=isPermiso;
		//this.isPermisoOrdenTipoProducto=isPermiso;		
		//this.isPermisoPaginacionMedioTipoProducto=isPermiso;		
		//this.isPermisoPaginacionAltoTipoProducto=isPermiso;		
		//this.isPermisoPaginacionTodoTipoProducto=isPermiso;		
		//this.isPermisoCopiarTipoProducto=isPermiso;		
		//this.isPermisoDuplicarTipoProducto=isPermiso;
		//this.isPermisoOrdenTipoProducto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoProductoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ModeloProductoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(MaterialProductoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(MarcaProductoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(SegmentoProductoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ColorProductoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(EfectoProductoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(TallaProductoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ClaseProductoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ProductoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosModeloProducto=false;
		this.isTienePermisosModeloProducto=this.verificarGetPermisosUsuarioOpcionTipoProductoClaseRelacionada(this.opcionsRelacionadas,ModeloProductoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosMaterialProducto=false;
		this.isTienePermisosMaterialProducto=this.verificarGetPermisosUsuarioOpcionTipoProductoClaseRelacionada(this.opcionsRelacionadas,MaterialProductoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosMarcaProducto=false;
		this.isTienePermisosMarcaProducto=this.verificarGetPermisosUsuarioOpcionTipoProductoClaseRelacionada(this.opcionsRelacionadas,MarcaProductoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosSegmentoProducto=false;
		this.isTienePermisosSegmentoProducto=this.verificarGetPermisosUsuarioOpcionTipoProductoClaseRelacionada(this.opcionsRelacionadas,SegmentoProductoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosColorProducto=false;
		this.isTienePermisosColorProducto=this.verificarGetPermisosUsuarioOpcionTipoProductoClaseRelacionada(this.opcionsRelacionadas,ColorProductoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosEfectoProducto=false;
		this.isTienePermisosEfectoProducto=this.verificarGetPermisosUsuarioOpcionTipoProductoClaseRelacionada(this.opcionsRelacionadas,EfectoProductoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosTallaProducto=false;
		this.isTienePermisosTallaProducto=this.verificarGetPermisosUsuarioOpcionTipoProductoClaseRelacionada(this.opcionsRelacionadas,TallaProductoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosParametroInventarioDefecto=false;
		this.isTienePermisosParametroInventarioDefecto=this.verificarGetPermisosUsuarioOpcionTipoProductoClaseRelacionada(this.opcionsRelacionadas,ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosClaseProducto=false;
		this.isTienePermisosClaseProducto=this.verificarGetPermisosUsuarioOpcionTipoProductoClaseRelacionada(this.opcionsRelacionadas,ClaseProductoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosProducto=false;
		this.isTienePermisosProducto=this.verificarGetPermisosUsuarioOpcionTipoProductoClaseRelacionada(this.opcionsRelacionadas,ProductoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoProducto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoProductoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosModeloProducto=conPermiso;
		this.isTienePermisosMaterialProducto=conPermiso;
		this.isTienePermisosMarcaProducto=conPermiso;
		this.isTienePermisosSegmentoProducto=conPermiso;
		this.isTienePermisosColorProducto=conPermiso;
		this.isTienePermisosEfectoProducto=conPermiso;
		this.isTienePermisosTallaProducto=conPermiso;
		this.isTienePermisosParametroInventarioDefecto=conPermiso;
		this.isTienePermisosClaseProducto=conPermiso;
		this.isTienePermisosProducto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoProductoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoProductoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoProductoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosModeloProducto && this.jInternalFrameDetalleFormTipoProducto!=null && this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProducto.jTabbedPaneRelacionesTipoProducto.remove(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosMaterialProducto && this.jInternalFrameDetalleFormTipoProducto!=null && this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProducto.jTabbedPaneRelacionesTipoProducto.remove(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosMarcaProducto && this.jInternalFrameDetalleFormTipoProducto!=null && this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProducto.jTabbedPaneRelacionesTipoProducto.remove(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosSegmentoProducto && this.jInternalFrameDetalleFormTipoProducto!=null && this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProducto.jTabbedPaneRelacionesTipoProducto.remove(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosColorProducto && this.jInternalFrameDetalleFormTipoProducto!=null && this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProducto.jTabbedPaneRelacionesTipoProducto.remove(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosEfectoProducto && this.jInternalFrameDetalleFormTipoProducto!=null && this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProducto.jTabbedPaneRelacionesTipoProducto.remove(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosTallaProducto && this.jInternalFrameDetalleFormTipoProducto!=null && this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProducto.jTabbedPaneRelacionesTipoProducto.remove(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosParametroInventarioDefecto && this.jInternalFrameDetalleFormTipoProducto!=null && this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProducto.jTabbedPaneRelacionesTipoProducto.remove(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosClaseProducto && this.jInternalFrameDetalleFormTipoProducto!=null && this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProducto.jTabbedPaneRelacionesTipoProducto.remove(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosProducto && this.jInternalFrameDetalleFormTipoProducto!=null && this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProducto.jTabbedPaneRelacionesTipoProducto.remove(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoProducto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoProductoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoProducto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoProducto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoProducto=this.isPermisoActualizarTipoProducto;
			this.isPermisoEliminarTipoProducto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoProducto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoProducto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoProducto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoProducto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoProducto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoProducto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoProducto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoProducto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoProducto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoProducto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoProducto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoProducto.setToolTipText(this.jTableDatosTipoProducto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoProducto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoProducto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoProducto() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosModeloProducto && this.tipoproductoConstantesFunciones.mostrarModeloProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Modelo Producto");
			reporte.setsDescripcion("Modelo Producto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosMaterialProducto && this.tipoproductoConstantesFunciones.mostrarMaterialProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Material Producto");
			reporte.setsDescripcion("Material Producto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosMarcaProducto && this.tipoproductoConstantesFunciones.mostrarMarcaProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Marca Producto");
			reporte.setsDescripcion("Marca Producto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosSegmentoProducto && this.tipoproductoConstantesFunciones.mostrarSegmentoProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Segmento Producto");
			reporte.setsDescripcion("Segmento Producto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosColorProducto && this.tipoproductoConstantesFunciones.mostrarColorProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Color Producto");
			reporte.setsDescripcion("Color Producto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosEfectoProducto && this.tipoproductoConstantesFunciones.mostrarEfectoProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Efecto Producto");
			reporte.setsDescripcion("Efecto Producto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosTallaProducto && this.tipoproductoConstantesFunciones.mostrarTallaProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Talla Producto");
			reporte.setsDescripcion("Talla Producto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosParametroInventarioDefecto && this.tipoproductoConstantesFunciones.mostrarParametroInventarioDefectoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parametro Inventario Defecto");
			reporte.setsDescripcion("Parametro Inventario Defecto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosClaseProducto && this.tipoproductoConstantesFunciones.mostrarClaseProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Clase Producto");
			reporte.setsDescripcion("Clase Producto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosProducto && this.tipoproductoConstantesFunciones.mostrarProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Producto");
			reporte.setsDescripcion("Producto");
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
	public void inicializarCombosForeignKeyTipoProductoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoProductoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoProductoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyTipoProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoProductoParameterReturnGeneral tipoproductoReturnGeneral=new TipoProductoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoproductoConstantesFunciones.cargarid_empresaTipoProducto)
					 || (this.esRecargarFks && this.tipoproductoConstantesFunciones.cargarid_empresaTipoProducto)) {

					if(!this.tipoproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoproductoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoproductoReturnGeneral=tipoproductoLogic.cargarCombosLoteForeignKeyTipoProducto(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoproductoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoProducto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoproductoSessionBean==null) {
				this.tipoproductoSessionBean=new TipoProductoSessionBean();
			}

			if(!this.tipoproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoProducto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoProducto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProducto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoProducto(TipoProducto tipoproducto)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoProducto(TipoProducto tipoproducto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoProducto()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProducto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoProducto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoProducto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoProducto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoProducto.jComboBoxid_empresaTipoProducto!=null && this.jInternalFrameDetalleFormTipoProducto.jComboBoxid_empresaTipoProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoProducto.jComboBoxid_empresaTipoProducto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoProductoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoProductoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoProductoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoproductoSessionBean=new TipoProductoSessionBean(); 
		this.tipoproductoConstantesFunciones=new TipoProductoConstantesFunciones(); 
		this.tipoproductoBean=new TipoProducto();//(this.tipoproductoConstantesFunciones); 		
		this.tipoproductoReturnGeneral=new TipoProductoParameterReturnGeneral(); 
		
		this.tipoproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoProducto(true);
			
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
			
			this.tipoproductoConstantesFunciones=new TipoProductoConstantesFunciones(); 
			this.tipoproductoBean=new TipoProducto();//this.tipoproductoConstantesFunciones); 			
			this.tipoproductoReturnGeneral=new TipoProductoParameterReturnGeneral(); 
		
			TipoProductoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Producto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoproducto=new TipoProducto();
			this.tipoproductos = new ArrayList<TipoProducto>();
			this.tipoproductosAux = new ArrayList<TipoProducto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic=new TipoProductoLogic();
				this.tipoproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoProducto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoProducto);	
					}
					
					if(this.jInternalFrameImportacionTipoProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoProducto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoProducto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoProducto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoProducto);
				this.jInternalFrameDetalleFormTipoProducto.setVisible(false);
				this.jInternalFrameDetalleFormTipoProducto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoProducto);
					this.jInternalFrameReporteDinamicoTipoProducto.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoProducto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoProducto);
					this.jInternalFrameImportacionTipoProducto.setVisible(false);
					this.jInternalFrameImportacionTipoProducto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoProducto);
					this.jInternalFrameOrderByTipoProducto.setVisible(false);
					this.jInternalFrameOrderByTipoProducto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoProductoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoProductoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoproductoReturnGeneral=new TipoProductoParameterReturnGeneral();
			
			this.tipoproductoParameterGeneral=new TipoProductoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoproductoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ModeloProductoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(MaterialProductoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(MarcaProductoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(SegmentoProductoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ColorProductoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(EfectoProductoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(TallaProductoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ClaseProductoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ProductoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoproductoSessionBean.getEsGuardarRelacionado(),this.tipoproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoproductoSessionBean.getEsGuardarRelacionado(),this.tipoproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoProducto=false;
			this.isVisibilidadCeldaDuplicarTipoProducto=true;
			this.isVisibilidadCeldaCopiarTipoProducto=true;
			this.isVisibilidadCeldaVerFormTipoProducto=true;
			this.isVisibilidadCeldaOrdenTipoProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProducto=false;
			this.isVisibilidadCeldaModificarTipoProducto=false;
			this.isVisibilidadCeldaActualizarTipoProducto=false;
			this.isVisibilidadCeldaEliminarTipoProducto=false;
			this.isVisibilidadCeldaCancelarTipoProducto=false;
			this.isVisibilidadCeldaGuardarTipoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProducto=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoProducto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoProducto(false);
			
			this.setPermisosUsuarioTipoProducto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoproductoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoproductoSessionBean.getEsGuardarRelacionado() && this.tipoproductoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoProductoClasesRelacionadas();
			}
			
			if(this.tipoproductoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoProductoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoProducto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoProducto();
			}
			
			if(!this.isPermisoBusquedaTipoProducto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoProducto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoproductoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoProducto,this.isPermisoPaginacionMedioTipoProducto,this.isPermisoPaginacionTodoTipoProducto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoProductoConstantesFunciones.getTiposSeleccionarTipoProducto());
				
				this.tiposColumnasSelect=TipoProductoConstantesFunciones.getTiposSeleccionarTipoProducto(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoProducto();				
				//this.tiposRelacionesSelect=TipoProductoConstantesFunciones.getTiposRelacionesTipoProducto(true);
				
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
			//if(!this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoProducto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoProducto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoProducto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProducto() ;
			
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
			
			
			this.modeloproductoLogic=new ModeloProductoLogic();
			this.materialproductoLogic=new MaterialProductoLogic();
			this.marcaproductoLogic=new MarcaProductoLogic();
			this.segmentoproductoLogic=new SegmentoProductoLogic();
			this.colorproductoLogic=new ColorProductoLogic();
			this.efectoproductoLogic=new EfectoProductoLogic();
			this.tallaproductoLogic=new TallaProductoLogic();
			this.parametroinventariodefectoLogic=new ParametroInventarioDefectoLogic();
			this.claseproductoLogic=new ClaseProductoLogic();
			this.productoLogic=new ProductoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipoproductoImplementable= (TipoProductoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoproductoImplementableHome= (TipoProductoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoproductos= new ArrayList<TipoProducto>();
			this.tipoproductosEliminados= new ArrayList<TipoProducto>();
						
			this.isEsNuevoTipoProducto=false;
			this.esParaAccionDesdeFormularioTipoProducto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoProducto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoProducto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoProductoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoProductoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoProducto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoProducto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoProducto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoProducto();
			}
			
			TipoProductoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoProducto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoProducto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoProducto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoProducto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoProducto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoProducto() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ModeloProductoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ModeloProductoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(MaterialProductoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(MaterialProductoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(MarcaProductoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(MarcaProductoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(SegmentoProductoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(SegmentoProductoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ColorProductoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ColorProductoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(EfectoProductoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(EfectoProductoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(TallaProductoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(TallaProductoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ClaseProductoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ClaseProductoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ProductoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProductoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoProducto")) {
				iIndex=this.jInternalFrameDetalleFormTipoProducto.jTabbedPaneRelacionesTipoProducto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoProducto.jTabbedPaneRelacionesTipoProducto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoProducto.getSelectedRow();	
				
				

				if(sTitle.equals("Clase Productos")) {
					if(!ClaseProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoProducto();

						this.cargarParteTabPanelRelacionadaClaseProducto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Color Productoes")) {
					if(!ColorProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoProducto();

						this.cargarParteTabPanelRelacionadaColorProducto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Efecto Productos")) {
					if(!EfectoProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoProducto();

						this.cargarParteTabPanelRelacionadaEfectoProducto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Marca Productos")) {
					if(!MarcaProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoProducto();

						this.cargarParteTabPanelRelacionadaMarcaProducto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Material Productos")) {
					if(!MaterialProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoProducto();

						this.cargarParteTabPanelRelacionadaMaterialProducto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Modelo Productos")) {
					if(!ModeloProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoProducto();

						this.cargarParteTabPanelRelacionadaModeloProducto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Parametro Inventario Defectos")) {
					if(!ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoProducto();

						this.cargarParteTabPanelRelacionadaParametroInventarioDefecto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Productos")) {
					if(!ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoProducto();

						this.cargarParteTabPanelRelacionadaProducto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Segmento Productos")) {
					if(!SegmentoProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoProducto();

						this.cargarParteTabPanelRelacionadaSegmentoProducto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Talla Productos")) {
					if(!TallaProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoProducto();

						this.cargarParteTabPanelRelacionadaTallaProducto(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoProducto();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaClaseProducto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoProducto.cargarSessionConBeanSwingJInternalFrameClaseProducto(false,true,iIndex);
		this.jButtonClaseProductoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaClaseProducto();

		//this.jTabbedPaneRelacionesTipoProducto.updateUI();
		//this.jTabbedPaneRelacionesTipoProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoProducto.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaColorProducto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoProducto.cargarSessionConBeanSwingJInternalFrameColorProducto(false,true,iIndex);
		this.jButtonColorProductoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaColorProducto();

		//this.jTabbedPaneRelacionesTipoProducto.updateUI();
		//this.jTabbedPaneRelacionesTipoProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoProducto.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaEfectoProducto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoProducto.cargarSessionConBeanSwingJInternalFrameEfectoProducto(false,true,iIndex);
		this.jButtonEfectoProductoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaEfectoProducto();

		//this.jTabbedPaneRelacionesTipoProducto.updateUI();
		//this.jTabbedPaneRelacionesTipoProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoProducto.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaMarcaProducto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoProducto.cargarSessionConBeanSwingJInternalFrameMarcaProducto(false,true,iIndex);
		this.jButtonMarcaProductoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaMarcaProducto();

		//this.jTabbedPaneRelacionesTipoProducto.updateUI();
		//this.jTabbedPaneRelacionesTipoProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoProducto.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaMaterialProducto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoProducto.cargarSessionConBeanSwingJInternalFrameMaterialProducto(false,true,iIndex);
		this.jButtonMaterialProductoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaMaterialProducto();

		//this.jTabbedPaneRelacionesTipoProducto.updateUI();
		//this.jTabbedPaneRelacionesTipoProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoProducto.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaModeloProducto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoProducto.cargarSessionConBeanSwingJInternalFrameModeloProducto(false,true,iIndex);
		this.jButtonModeloProductoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaModeloProducto();

		//this.jTabbedPaneRelacionesTipoProducto.updateUI();
		//this.jTabbedPaneRelacionesTipoProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoProducto.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaParametroInventarioDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoProducto.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(false,true,iIndex);
		this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();

		//this.jTabbedPaneRelacionesTipoProducto.updateUI();
		//this.jTabbedPaneRelacionesTipoProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoProducto.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProducto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoProducto.cargarSessionConBeanSwingJInternalFrameProducto(false,true,iIndex);
		this.jButtonProductoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProducto();

		//this.jTabbedPaneRelacionesTipoProducto.updateUI();
		//this.jTabbedPaneRelacionesTipoProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoProducto.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaSegmentoProducto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoProducto.cargarSessionConBeanSwingJInternalFrameSegmentoProducto(false,true,iIndex);
		this.jButtonSegmentoProductoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaSegmentoProducto();

		//this.jTabbedPaneRelacionesTipoProducto.updateUI();
		//this.jTabbedPaneRelacionesTipoProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoProducto.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaTallaProducto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoProducto.cargarSessionConBeanSwingJInternalFrameTallaProducto(false,true,iIndex);
		this.jButtonTallaProductoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaTallaProducto();

		//this.jTabbedPaneRelacionesTipoProducto.updateUI();
		//this.jTabbedPaneRelacionesTipoProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoProducto.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ModeloProducto")) {
				int row=this.jTableDatosTipoProducto.getSelectedRow();
				jButtonModeloProductoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("MaterialProducto")) {
				int row=this.jTableDatosTipoProducto.getSelectedRow();
				jButtonMaterialProductoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("MarcaProducto")) {
				int row=this.jTableDatosTipoProducto.getSelectedRow();
				jButtonMarcaProductoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("SegmentoProducto")) {
				int row=this.jTableDatosTipoProducto.getSelectedRow();
				jButtonSegmentoProductoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ColorProducto")) {
				int row=this.jTableDatosTipoProducto.getSelectedRow();
				jButtonColorProductoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("EfectoProducto")) {
				int row=this.jTableDatosTipoProducto.getSelectedRow();
				jButtonEfectoProductoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("TallaProducto")) {
				int row=this.jTableDatosTipoProducto.getSelectedRow();
				jButtonTallaProductoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ParametroInventarioDefecto")) {
				int row=this.jTableDatosTipoProducto.getSelectedRow();
				jButtonParametroInventarioDefectoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ClaseProducto")) {
				int row=this.jTableDatosTipoProducto.getSelectedRow();
				jButtonClaseProductoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Producto")) {
				int row=this.jTableDatosTipoProducto.getSelectedRow();
				jButtonProductoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Modelo Producto")) {

					if(this.isTienePermisosModeloProducto && this.tipoproductoConstantesFunciones.mostrarModeloProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Modelo Productos"+"("+ModeloProductoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Modelo Productos");

						if(tipoproductoConstantesFunciones.resaltarModeloProductoTipoProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoproductoConstantesFunciones.resaltarModeloProductoTipoProducto);
						}

						jmenuItem.setEnabled(this.tipoproductoConstantesFunciones.activarModeloProductoTipoProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ModeloProducto"));

						

						this.jInternalFrameDetalleFormTipoProducto.jmenuDetalleTipoProducto.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Material Producto")) {

					if(this.isTienePermisosMaterialProducto && this.tipoproductoConstantesFunciones.mostrarMaterialProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Material Productos"+"("+MaterialProductoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Material Productos");

						if(tipoproductoConstantesFunciones.resaltarMaterialProductoTipoProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoproductoConstantesFunciones.resaltarMaterialProductoTipoProducto);
						}

						jmenuItem.setEnabled(this.tipoproductoConstantesFunciones.activarMaterialProductoTipoProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"MaterialProducto"));

						

						this.jInternalFrameDetalleFormTipoProducto.jmenuDetalleTipoProducto.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Marca Producto")) {

					if(this.isTienePermisosMarcaProducto && this.tipoproductoConstantesFunciones.mostrarMarcaProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Marca Productos"+"("+MarcaProductoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Marca Productos");

						if(tipoproductoConstantesFunciones.resaltarMarcaProductoTipoProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoproductoConstantesFunciones.resaltarMarcaProductoTipoProducto);
						}

						jmenuItem.setEnabled(this.tipoproductoConstantesFunciones.activarMarcaProductoTipoProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"MarcaProducto"));

						

						this.jInternalFrameDetalleFormTipoProducto.jmenuDetalleTipoProducto.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Segmento Producto")) {

					if(this.isTienePermisosSegmentoProducto && this.tipoproductoConstantesFunciones.mostrarSegmentoProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Segmento Productos"+"("+SegmentoProductoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Segmento Productos");

						if(tipoproductoConstantesFunciones.resaltarSegmentoProductoTipoProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoproductoConstantesFunciones.resaltarSegmentoProductoTipoProducto);
						}

						jmenuItem.setEnabled(this.tipoproductoConstantesFunciones.activarSegmentoProductoTipoProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"SegmentoProducto"));

						

						this.jInternalFrameDetalleFormTipoProducto.jmenuDetalleTipoProducto.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Color Producto")) {

					if(this.isTienePermisosColorProducto && this.tipoproductoConstantesFunciones.mostrarColorProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Color Productoes"+"("+ColorProductoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Color Productoes");

						if(tipoproductoConstantesFunciones.resaltarColorProductoTipoProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoproductoConstantesFunciones.resaltarColorProductoTipoProducto);
						}

						jmenuItem.setEnabled(this.tipoproductoConstantesFunciones.activarColorProductoTipoProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ColorProducto"));

						

						this.jInternalFrameDetalleFormTipoProducto.jmenuDetalleTipoProducto.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Efecto Producto")) {

					if(this.isTienePermisosEfectoProducto && this.tipoproductoConstantesFunciones.mostrarEfectoProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Efecto Productos"+"("+EfectoProductoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Efecto Productos");

						if(tipoproductoConstantesFunciones.resaltarEfectoProductoTipoProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoproductoConstantesFunciones.resaltarEfectoProductoTipoProducto);
						}

						jmenuItem.setEnabled(this.tipoproductoConstantesFunciones.activarEfectoProductoTipoProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"EfectoProducto"));

						

						this.jInternalFrameDetalleFormTipoProducto.jmenuDetalleTipoProducto.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Talla Producto")) {

					if(this.isTienePermisosTallaProducto && this.tipoproductoConstantesFunciones.mostrarTallaProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Talla Productos"+"("+TallaProductoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Talla Productos");

						if(tipoproductoConstantesFunciones.resaltarTallaProductoTipoProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoproductoConstantesFunciones.resaltarTallaProductoTipoProducto);
						}

						jmenuItem.setEnabled(this.tipoproductoConstantesFunciones.activarTallaProductoTipoProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"TallaProducto"));

						

						this.jInternalFrameDetalleFormTipoProducto.jmenuDetalleTipoProducto.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Parametro Inventario Defecto")) {

					if(this.isTienePermisosParametroInventarioDefecto && this.tipoproductoConstantesFunciones.mostrarParametroInventarioDefectoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Inventario Defectos"+"("+ParametroInventarioDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Inventario Defectos");

						if(tipoproductoConstantesFunciones.resaltarParametroInventarioDefectoTipoProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoproductoConstantesFunciones.resaltarParametroInventarioDefectoTipoProducto);
						}

						jmenuItem.setEnabled(this.tipoproductoConstantesFunciones.activarParametroInventarioDefectoTipoProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroInventarioDefecto"));

						

						this.jInternalFrameDetalleFormTipoProducto.jmenuDetalleTipoProducto.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Clase Producto")) {

					if(this.isTienePermisosClaseProducto && this.tipoproductoConstantesFunciones.mostrarClaseProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Clase Productos"+"("+ClaseProductoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Clase Productos");

						if(tipoproductoConstantesFunciones.resaltarClaseProductoTipoProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoproductoConstantesFunciones.resaltarClaseProductoTipoProducto);
						}

						jmenuItem.setEnabled(this.tipoproductoConstantesFunciones.activarClaseProductoTipoProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ClaseProducto"));

						

						this.jInternalFrameDetalleFormTipoProducto.jmenuDetalleTipoProducto.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Producto")) {

					if(this.isTienePermisosProducto && this.tipoproductoConstantesFunciones.mostrarProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Productos"+"("+ProductoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Productos");

						if(tipoproductoConstantesFunciones.resaltarProductoTipoProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoproductoConstantesFunciones.resaltarProductoTipoProducto);
						}

						jmenuItem.setEnabled(this.tipoproductoConstantesFunciones.activarProductoTipoProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Producto"));

						

						this.jInternalFrameDetalleFormTipoProducto.jmenuDetalleTipoProducto.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoProducto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoProducto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoProductoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoProducto();
		
		this.cargarCombosFrameForeignKeyTipoProducto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoProducto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoProducto();
		}
	}
	
	
	
	public void jButtonNuevoTipoProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoproductoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
			
			
			if(jTableDatosTipoProducto.getRowCount()>=1) {
				jTableDatosTipoProducto.removeRowSelectionInterval(0, jTableDatosTipoProducto.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoProducto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoProducto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoProducto(true);			
			//this.tipoproducto=new TipoProducto();
			//this.tipoproducto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProducto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProducto() ;
			
			if(TipoProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProducto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoproducto);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoproducto);				
			
			TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
			
			if(this.tipoproductoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoProducto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoProducto> tipoproductosSeleccionados=new ArrayList<TipoProducto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoProducto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoProducto.getSelectedRows().length;			
			}
			
			tipoproductosSeleccionados=this.getTipoProductosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoProducto--;			
				//TipoProducto tipoproductoAux= new TipoProducto();			
				//tipoproductoAux.setId(this.iIdNuevoTipoProducto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoProducto tipoproductoOrigen=new TipoProducto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoProducto tipoproductoOrigen : tipoproductosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoProducto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoproductoOrigen =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoproductoOrigen =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoProducto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoproducto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoProducto(tipoproductoOrigen,this.tipoproducto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoproductoLogic.getTipoProductos().add(this.tipoproductoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoproductos.add(this.tipoproductoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoProducto(false);
				
				this.jTableDatosTipoProducto.setRowSelectionInterval(this.getIndiceNuevoTipoProducto(), this.getIndiceNuevoTipoProducto());
				
				int iLastRow =  this.jTableDatosTipoProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProducto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoProducto> tipoproductosSeleccionados=new ArrayList<TipoProducto>();									
		
			TipoProducto tipoproductoOrigen=new TipoProducto();
			TipoProducto tipoproductoDestino=new TipoProducto();
				
			tipoproductosSeleccionados=this.getTipoProductosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoProducto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoproductosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoProducto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductoOrigen =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoproductoOrigen =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproductoDestino =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoproductoDestino =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoproductoOrigen =tipoproductosSeleccionados.get(0);
				tipoproductoDestino =tipoproductosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoProducto(tipoproductoOrigen,tipoproductoDestino,true,false);
				
				tipoproductoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoproductoDestino,tipoproductoLogic.getTipoProductos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoproductoDestino,tipoproductos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoProducto(false);
				
				//this.jTableDatosTipoProducto.setRowSelectionInterval(this.getIndiceNuevoTipoProducto(), this.getIndiceNuevoTipoProducto());
				
				int iLastRow =  this.jTableDatosTipoProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProducto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoProducto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoProducto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoProducto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoProducto.setVisible(!isVisible);
			this.jPanelPaginacionTipoProducto.setVisible(!isVisible);
			this.jPanelAccionesTipoProducto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoProducto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoProducto();
			
			this.abrirFrameOrderByTipoProducto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoProducto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoProducto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoProducto.isMaximum()) {
					this.jInternalFrameDetalleFormTipoProducto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoProducto.setSize(this.jInternalFrameDetalleFormTipoProducto.iWidthFormulario,this.jInternalFrameDetalleFormTipoProducto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoProducto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoProducto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoProducto.isMaximum()) {
						this.jInternalFrameDetalleFormTipoProducto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoProducto.jContentPaneDetalleTipoProducto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoProducto.jTabbedPaneRelacionesTipoProducto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoProducto.jContentPaneDetalleTipoProducto.getWidth(),TipoProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoProducto.jTabbedPaneRelacionesTipoProducto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoProducto.jContentPaneDetalleTipoProducto.getWidth(),TipoProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoProducto.jTabbedPaneRelacionesTipoProducto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoProducto.jContentPaneDetalleTipoProducto.getWidth(),TipoProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ClaseProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaClaseProducto();
					}

					if(ColorProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaColorProducto();
					}

					if(EfectoProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaEfectoProducto();
					}

					if(MarcaProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaMarcaProducto();
					}

					if(MaterialProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaMaterialProducto();
					}

					if(ModeloProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaModeloProducto();
					}

					if(ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();
					}

					if(ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProducto();
					}

					if(SegmentoProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaSegmentoProducto();
					}

					if(TallaProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaTallaProducto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoProducto.setVisible(true);
	        this.jInternalFrameDetalleFormTipoProducto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoProducto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProducto,false,this);
				} else {
					this.jInternalFrameOrderByTipoProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProducto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoProducto);
				this.jInternalFrameOrderByTipoProducto.setVisible(false);
				this.jInternalFrameOrderByTipoProducto.setSelected(false);
				
				this.jInternalFrameOrderByTipoProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoProducto"));
				
				this.inicializarActualizarBindingTablaOrderByTipoProducto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoProducto==null) {
				
				this.jInternalFrameImportacionTipoProducto=new ImportacionJInternalFrame(TipoProductoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoProducto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoProducto);
				this.jInternalFrameImportacionTipoProducto.setVisible(false);
				this.jInternalFrameImportacionTipoProducto.setSelected(false);


				this.jInternalFrameImportacionTipoProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoProducto"));
				this.jInternalFrameImportacionTipoProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoProducto"));
				this.jInternalFrameImportacionTipoProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoProducto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoProducto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoProducto==null) {
				this.jInternalFrameReporteDinamicoTipoProducto=new ReporteDinamicoJInternalFrame(TipoProductoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoProducto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoProducto);
				this.jInternalFrameReporteDinamicoTipoProducto.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoProducto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProducto"));
				this.jInternalFrameReporteDinamicoTipoProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProducto"));
				this.jInternalFrameReporteDinamicoTipoProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProducto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProducto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaClaseProducto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jScrollPanelDatosClaseProducto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoProducto.jContentPaneDetalleTipoProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jScrollPanelDatosClaseProducto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jScrollPanelDatosClaseProducto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.jScrollPanelDatosClaseProducto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaColorProducto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.jScrollPanelDatosColorProducto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoProducto.jContentPaneDetalleTipoProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.jScrollPanelDatosColorProducto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.jScrollPanelDatosColorProducto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.jScrollPanelDatosColorProducto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaEfectoProducto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jScrollPanelDatosEfectoProducto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoProducto.jContentPaneDetalleTipoProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jScrollPanelDatosEfectoProducto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jScrollPanelDatosEfectoProducto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.jScrollPanelDatosEfectoProducto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaMarcaProducto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jScrollPanelDatosMarcaProducto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoProducto.jContentPaneDetalleTipoProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jScrollPanelDatosMarcaProducto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jScrollPanelDatosMarcaProducto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.jScrollPanelDatosMarcaProducto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaMaterialProducto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jScrollPanelDatosMaterialProducto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoProducto.jContentPaneDetalleTipoProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jScrollPanelDatosMaterialProducto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jScrollPanelDatosMaterialProducto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.jScrollPanelDatosMaterialProducto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaModeloProducto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jScrollPanelDatosModeloProducto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoProducto.jContentPaneDetalleTipoProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jScrollPanelDatosModeloProducto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jScrollPanelDatosModeloProducto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.jScrollPanelDatosModeloProducto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaParametroInventarioDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoProducto.jContentPaneDetalleTipoProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProducto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoProducto.jContentPaneDetalleTipoProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaSegmentoProducto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jScrollPanelDatosSegmentoProducto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoProducto.jContentPaneDetalleTipoProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jScrollPanelDatosSegmentoProducto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jScrollPanelDatosSegmentoProducto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.jScrollPanelDatosSegmentoProducto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaTallaProducto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jScrollPanelDatosTallaProducto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoProducto.jContentPaneDetalleTipoProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jScrollPanelDatosTallaProducto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jScrollPanelDatosTallaProducto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.jScrollPanelDatosTallaProducto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoProducto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoProducto);
			
	       	this.jInternalFrameDetalleFormTipoProducto.setVisible(false);
	        this.jInternalFrameDetalleFormTipoProducto.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoProducto.dispose();
			//this.jInternalFrameDetalleFormTipoProducto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoProducto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoProducto.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoProducto.setVisible(true);
	        this.jInternalFrameImportacionTipoProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoProducto.setVisible(true);
	        this.jInternalFrameOrderByTipoProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoProducto.setVisible(false);
	        this.jInternalFrameOrderByTipoProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoProducto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoProducto.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoProducto.setVisible(false);
	        this.jInternalFrameImportacionTipoProducto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoProducto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoProducto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoProducto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoProducto(true);
			//this.isEsNuevoTipoProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproducto =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoproducto =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProducto(false) ;
			
			if(tipoproductoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductoSessionBean.getEsGuardarRelacionado() && ModeloProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonModeloProductoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductoSessionBean.getEsGuardarRelacionado() && MaterialProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonMaterialProductoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductoSessionBean.getEsGuardarRelacionado() && MarcaProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonMarcaProductoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductoSessionBean.getEsGuardarRelacionado() && SegmentoProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSegmentoProductoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductoSessionBean.getEsGuardarRelacionado() && ColorProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonColorProductoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductoSessionBean.getEsGuardarRelacionado() && EfectoProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEfectoProductoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductoSessionBean.getEsGuardarRelacionado() && TallaProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTallaProductoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductoSessionBean.getEsGuardarRelacionado() && ClaseProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClaseProductoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado() && ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProducto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoProductoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproducto =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproducto =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoProducto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoProducto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoProducto(true);
			//this.isEsNuevoTipoProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproducto =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoproducto =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoproducto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoProducto(false) ;
			
			if(TipoProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProducto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoProducto(false);
			
			//if(!this.isEsNuevoTipoProducto) {								
				int intSelectedRow = this.jTableDatosTipoProducto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproducto =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoproducto =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoProducto(this.tipoproducto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);
				
			}
			
			if(this.permiteMantenimiento(this.tipoproducto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoProducto=true;
					this.inicializarActualizarBindingTablaTipoProducto(false);
					this.isEsNuevoTipoProducto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoProducto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoProducto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProducto(false);
				
				this.habilitarDeshabilitarControlesTipoProducto(false);
			
												
				
				if(TipoProductoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoProducto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoProductoActionPerformed(evt,tipoproductoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoProducto(this.tipoproducto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoProducto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoproductoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoproducto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoProducto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProducto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoProducto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproducto =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
				this.tipoproducto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoproducto =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
				this.tipoproducto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoproducto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoProductoModel) this.jTableDatosTipoProducto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoProducto=true;
				this.inicializarActualizarBindingTablaTipoProducto(false);
				this.isEsNuevoTipoProducto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProducto(false);
				
				this.habilitarDeshabilitarControlesTipoProducto(false);
				
				
				
				if(TipoProductoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoProducto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoProductoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoProducto.getRowCount()>=1) {
				jTableDatosTipoProducto.removeRowSelectionInterval(0, jTableDatosTipoProducto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoProducto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoProducto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProducto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProducto(false) ;
			
			this.isEsNuevoTipoProducto=false;
			
			if(TipoProductoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoProducto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoProducto(false);
				
				//SI ES MANUAL
				if(TipoProductoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoProducto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoProducto--;			
			//TipoProducto tipoproductoAux= new TipoProducto();			
			//tipoproductoAux.setId(this.iIdNuevoTipoProducto);
			
			if(this.jInternalFrameDetalleFormTipoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoProducto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);
			
			this.tipoproducto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoproductoLogic.getTipoProductos().add(this.tipoproductoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoproductos.add(this.tipoproductoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoProducto(false);
			
			this.jTableDatosTipoProducto.setRowSelectionInterval(this.getIndiceNuevoTipoProducto(), this.getIndiceNuevoTipoProducto());
			
			int iLastRow =  this.jTableDatosTipoProducto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoProducto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoProducto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoProducto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoProducto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProducto(false);
			
			//SI ES MANUAL
			if(TipoProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProducto();
			}
			
			//this.abrirFrameTreeTipoProducto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo ProductoS ?", "MANTENIMIENTO DE Tipo Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoProducto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoProducto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoproductoReturnGeneral=tipoproductoLogic.procesarImportacionTipoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoproductoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoProductoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoProducto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoProducto.setFileImportacion(this.jInternalFrameImportacionTipoProducto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoProducto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoProducto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoProducto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoProducto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoProducto> tipoproductosSeleccionados=new ArrayList<TipoProducto>();		

		tipoproductosSeleccionados=this.getTipoProductosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoProductoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoProductoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoProductos("Todos",tipoproductosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Producto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoProductoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoProductoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoProductoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoProductoConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoTipoProducto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoProducto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoProducto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoProductoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoProducto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoProductoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoProducto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProducto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoProductoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoProductoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoProductoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoProductoConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoProductoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoProducto> tipoproductosSeleccionados=new ArrayList<TipoProducto>();		
		
		tipoproductosSeleccionados=this.getTipoProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproducto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoProductoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoProductoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoProducto tipoproducto:tipoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoproducto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoProductoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoProductoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoProducto tipoproducto:tipoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoproducto.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoProductoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoProductoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoProducto tipoproducto:tipoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoproducto.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoProductoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoProductoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(TipoProducto tipoproducto:tipoproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoproducto.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelTipoProducto(row);				
			//	iRow++;
			//}				
			
			//for(TipoProducto tipoproductoAux:tipoproductosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoProducto(tipoproductoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Producto",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProducto(false);
			
			//SI ES MANUAL
			if(TipoProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProducto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProducto(false);
			
			//SI ES MANUAL
			if(TipoProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoProducto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProducto(false);
			
			//SI ES MANUAL
			if(TipoProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoProducto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoProducto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoProducto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoProducto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoProducto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoProducto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoProducto.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoProducto.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoProducto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoProducto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoProducto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoProducto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoProducto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoProducto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoProducto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProducto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoProducto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoProductoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoProductoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoProducto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoProducto();
		
		this.inicializarActualizarBindingBotonesManualTipoProducto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoProducto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProducto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProducto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProducto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoProducto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoProducto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoProducto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoProducto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoProducto.jCheckBoxPostAccionNuevoTipoProducto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoProducto.jCheckBoxPostAccionSinCerrarTipoProducto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoProducto.jCheckBoxPostAccionSinMensajeTipoProducto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoProducto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoProducto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoProducto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoProducto!=null) {
				this.jInternalFrameDetalleFormTipoProducto.jCheckBoxPostAccionNuevoTipoProducto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoProducto.jCheckBoxPostAccionSinCerrarTipoProducto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoProducto.jCheckBoxPostAccionSinMensajeTipoProducto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoProducto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoProducto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoProducto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoProducto.jComboBoxTiposAccionesFormularioTipoProducto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoProducto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoProducto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoProducto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoProducto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoProducto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoProducto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoProducto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoProducto(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoProductoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProducto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoProducto() throws Exception {
		try	{
			if(TipoProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoProducto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoProducto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoProducto.jComboBoxTiposAccionesFormularioTipoProducto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoProducto.jComboBoxTiposAccionesFormularioTipoProducto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoProducto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoProducto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoProducto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoProducto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoProducto.addItem(reporte);
			}
			
			
			if(!this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoProducto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoProducto.jComboBoxTiposAccionesFormularioTipoProducto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoProducto.jComboBoxTiposAccionesFormularioTipoProducto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoProducto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoProducto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProducto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProducto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoProducto!=null) {
				this.jInternalFrameReporteDinamicoTipoProducto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoProducto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoProducto!=null) {
				this.jInternalFrameReporteDinamicoTipoProducto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoProducto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoProducto!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoProducto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoProducto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoProducto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoProducto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoProducto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoProducto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoProducto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoProducto.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoProducto.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoProducto(Boolean esInicializar) throws Exception {				
		if(TipoProductoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoProducto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoProducto() throws Exception {
		this.inicializarActualizarBindingTablaTipoProducto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoProducto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoProducto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProducto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProducto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoProductoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProductoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoProductoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProducto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoProductoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoProducto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoProducto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoproductoLogic.getTipoProductos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoproductos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoProducto.setModel(new TipoProductoModel(this.tipoproductoLogic.getTipoProductos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoProducto.setModel(new TipoProductoModel(this.tipoproductos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoProducto!=null && this.jInternalFrameOrderByTipoProducto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoProducto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProducto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoProductoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoProductoConstantesFunciones.SCLASSWEBTITULO,tipoproductoConstantesFunciones.resaltarSeleccionarTipoProducto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoProductoConstantesFunciones.SCLASSWEBTITULO,tipoproductoConstantesFunciones.resaltarSeleccionarTipoProducto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProducto,TipoProductoConstantesFunciones.LABEL_ID));

		if(this.tipoproductoConstantesFunciones.mostraridTipoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProductoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoproductoConstantesFunciones.resaltaridTipoProducto,this.tipoproductoConstantesFunciones.activaridTipoProducto,this,true,"idTipoProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoproductoConstantesFunciones.resaltaridTipoProducto,this.tipoproductoConstantesFunciones.activaridTipoProducto,this,true,"idTipoProducto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProducto,TipoProductoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoproductoConstantesFunciones.mostrarid_empresaTipoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProductoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoproductoConstantesFunciones.resaltarid_empresaTipoProducto,this,this.tipoproductoConstantesFunciones.activarid_empresaTipoProducto));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoproductoConstantesFunciones.resaltarid_empresaTipoProducto,this,this.tipoproductoConstantesFunciones.activarid_empresaTipoProducto,false,"id_empresaTipoProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProducto,TipoProductoConstantesFunciones.LABEL_CODIGO));

		if(this.tipoproductoConstantesFunciones.mostrarcodigoTipoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProductoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoproductoConstantesFunciones.resaltarcodigoTipoProducto,this.tipoproductoConstantesFunciones.activarcodigoTipoProducto,this,true,"codigoTipoProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoproductoConstantesFunciones.resaltarcodigoTipoProducto,this.tipoproductoConstantesFunciones.activarcodigoTipoProducto,this,true,"codigoTipoProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProducto,TipoProductoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoproductoConstantesFunciones.mostrarnombreTipoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProductoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoproductoConstantesFunciones.resaltarnombreTipoProducto,this.tipoproductoConstantesFunciones.activarnombreTipoProducto,this,true,"nombreTipoProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoproductoConstantesFunciones.resaltarnombreTipoProducto,this.tipoproductoConstantesFunciones.activarnombreTipoProducto,this,true,"nombreTipoProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProducto,TipoProductoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.tipoproductoConstantesFunciones.mostrardescripcionTipoProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProductoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoproductoConstantesFunciones.resaltardescripcionTipoProducto,this.tipoproductoConstantesFunciones.activardescripcionTipoProducto,this,true,"descripcionTipoProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoproductoConstantesFunciones.resaltardescripcionTipoProducto,this.tipoproductoConstantesFunciones.activardescripcionTipoProducto,this,true,"descripcionTipoProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoproductoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosModeloProducto && this.tipoproductoConstantesFunciones.mostrarModeloProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Modelo Productos");
				tableColumn.setHeaderValue("Modelo Productos");
				tableColumn.setCellRenderer(new ModeloProductoTableCell(tipoproductoConstantesFunciones.resaltarModeloProductoTipoProducto,this,this.tipoproductoConstantesFunciones.activarModeloProductoTipoProducto));
				tableColumn.setCellEditor(new ModeloProductoTableCell(tipoproductoConstantesFunciones.resaltarModeloProductoTipoProducto,this,this.tipoproductoConstantesFunciones.activarModeloProductoTipoProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoProducto.addColumn(tableColumn);
			}

			if(this.isTienePermisosMaterialProducto && this.tipoproductoConstantesFunciones.mostrarMaterialProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Material Productos");
				tableColumn.setHeaderValue("Material Productos");
				tableColumn.setCellRenderer(new MaterialProductoTableCell(tipoproductoConstantesFunciones.resaltarMaterialProductoTipoProducto,this,this.tipoproductoConstantesFunciones.activarMaterialProductoTipoProducto));
				tableColumn.setCellEditor(new MaterialProductoTableCell(tipoproductoConstantesFunciones.resaltarMaterialProductoTipoProducto,this,this.tipoproductoConstantesFunciones.activarMaterialProductoTipoProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoProducto.addColumn(tableColumn);
			}

			if(this.isTienePermisosMarcaProducto && this.tipoproductoConstantesFunciones.mostrarMarcaProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Marca Productos");
				tableColumn.setHeaderValue("Marca Productos");
				tableColumn.setCellRenderer(new MarcaProductoTableCell(tipoproductoConstantesFunciones.resaltarMarcaProductoTipoProducto,this,this.tipoproductoConstantesFunciones.activarMarcaProductoTipoProducto));
				tableColumn.setCellEditor(new MarcaProductoTableCell(tipoproductoConstantesFunciones.resaltarMarcaProductoTipoProducto,this,this.tipoproductoConstantesFunciones.activarMarcaProductoTipoProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoProducto.addColumn(tableColumn);
			}

			if(this.isTienePermisosSegmentoProducto && this.tipoproductoConstantesFunciones.mostrarSegmentoProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Segmento Productos");
				tableColumn.setHeaderValue("Segmento Productos");
				tableColumn.setCellRenderer(new SegmentoProductoTableCell(tipoproductoConstantesFunciones.resaltarSegmentoProductoTipoProducto,this,this.tipoproductoConstantesFunciones.activarSegmentoProductoTipoProducto));
				tableColumn.setCellEditor(new SegmentoProductoTableCell(tipoproductoConstantesFunciones.resaltarSegmentoProductoTipoProducto,this,this.tipoproductoConstantesFunciones.activarSegmentoProductoTipoProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoProducto.addColumn(tableColumn);
			}

			if(this.isTienePermisosColorProducto && this.tipoproductoConstantesFunciones.mostrarColorProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Color Productoes");
				tableColumn.setHeaderValue("Color Productoes");
				tableColumn.setCellRenderer(new ColorProductoTableCell(tipoproductoConstantesFunciones.resaltarColorProductoTipoProducto,this,this.tipoproductoConstantesFunciones.activarColorProductoTipoProducto));
				tableColumn.setCellEditor(new ColorProductoTableCell(tipoproductoConstantesFunciones.resaltarColorProductoTipoProducto,this,this.tipoproductoConstantesFunciones.activarColorProductoTipoProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoProducto.addColumn(tableColumn);
			}

			if(this.isTienePermisosEfectoProducto && this.tipoproductoConstantesFunciones.mostrarEfectoProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Efecto Productos");
				tableColumn.setHeaderValue("Efecto Productos");
				tableColumn.setCellRenderer(new EfectoProductoTableCell(tipoproductoConstantesFunciones.resaltarEfectoProductoTipoProducto,this,this.tipoproductoConstantesFunciones.activarEfectoProductoTipoProducto));
				tableColumn.setCellEditor(new EfectoProductoTableCell(tipoproductoConstantesFunciones.resaltarEfectoProductoTipoProducto,this,this.tipoproductoConstantesFunciones.activarEfectoProductoTipoProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoProducto.addColumn(tableColumn);
			}

			if(this.isTienePermisosTallaProducto && this.tipoproductoConstantesFunciones.mostrarTallaProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Talla Productos");
				tableColumn.setHeaderValue("Talla Productos");
				tableColumn.setCellRenderer(new TallaProductoTableCell(tipoproductoConstantesFunciones.resaltarTallaProductoTipoProducto,this,this.tipoproductoConstantesFunciones.activarTallaProductoTipoProducto));
				tableColumn.setCellEditor(new TallaProductoTableCell(tipoproductoConstantesFunciones.resaltarTallaProductoTipoProducto,this,this.tipoproductoConstantesFunciones.activarTallaProductoTipoProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoProducto.addColumn(tableColumn);
			}

			if(this.isTienePermisosParametroInventarioDefecto && this.tipoproductoConstantesFunciones.mostrarParametroInventarioDefectoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Inventario Defectos");
				tableColumn.setHeaderValue("Parametro Inventario Defectos");
				tableColumn.setCellRenderer(new ParametroInventarioDefectoTableCell(tipoproductoConstantesFunciones.resaltarParametroInventarioDefectoTipoProducto,this,this.tipoproductoConstantesFunciones.activarParametroInventarioDefectoTipoProducto));
				tableColumn.setCellEditor(new ParametroInventarioDefectoTableCell(tipoproductoConstantesFunciones.resaltarParametroInventarioDefectoTipoProducto,this,this.tipoproductoConstantesFunciones.activarParametroInventarioDefectoTipoProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoProducto.addColumn(tableColumn);
			}

			if(this.isTienePermisosClaseProducto && this.tipoproductoConstantesFunciones.mostrarClaseProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Clase Productos");
				tableColumn.setHeaderValue("Clase Productos");
				tableColumn.setCellRenderer(new ClaseProductoTableCell(tipoproductoConstantesFunciones.resaltarClaseProductoTipoProducto,this,this.tipoproductoConstantesFunciones.activarClaseProductoTipoProducto));
				tableColumn.setCellEditor(new ClaseProductoTableCell(tipoproductoConstantesFunciones.resaltarClaseProductoTipoProducto,this,this.tipoproductoConstantesFunciones.activarClaseProductoTipoProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoProducto.addColumn(tableColumn);
			}

			if(this.isTienePermisosProducto && this.tipoproductoConstantesFunciones.mostrarProductoTipoProducto && !TipoProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Productos");
				tableColumn.setHeaderValue("Productos");
				tableColumn.setCellRenderer(new ProductoTableCell(tipoproductoConstantesFunciones.resaltarProductoTipoProducto,this,this.tipoproductoConstantesFunciones.activarProductoTipoProducto));
				tableColumn.setCellEditor(new ProductoTableCell(tipoproductoConstantesFunciones.resaltarProductoTipoProducto,this,this.tipoproductoConstantesFunciones.activarProductoTipoProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoProducto.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoproductoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoProducto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoproductoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoProducto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoProducto && this.isPermisoGuardarCambiosTipoProducto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoproductoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoproductoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoProducto.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoproductoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoProducto.addColumn(tableColumn);
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
			
			this.jTableDatosTipoProducto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoProducto && this.isPermisoGuardarCambiosTipoProducto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoproductoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoProducto && this.isPermisoGuardarCambiosTipoProducto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoProducto.moveColumn(this.jTableDatosTipoProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoProducto.moveColumn(this.jTableDatosTipoProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoproductoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoProducto.moveColumn(this.jTableDatosTipoProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoProducto.moveColumn(this.jTableDatosTipoProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoProducto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoProducto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoProducto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoProducto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoProducto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoProducto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoProducto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoProducto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoproductoLogic.getTipoProductos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoproductos.size()-1;
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
		//this.jTableDatosTipoProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoProducto();
			
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
				
				//this.isEsNuevoTipoProducto=false;
					
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
			
				if(this.tipoproductoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoProducto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoProducto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproducto =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproducto =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoproducto.getsType().equals("DUPLICADO")
				   || this.tipoproducto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoProducto=true;
				
				} else {
					this.isEsNuevoTipoProducto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoproducto.getId()>=0 && !this.tipoproducto.getIsNew()) {						
						this.isEsNuevoTipoProducto=false;
						
					} else {
						this.isEsNuevoTipoProducto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoProducto(esRelaciones);						
				
				this.seleccionarTipoProducto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoproducto.getId()<0) {
					this.isEsNuevoTipoProducto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoProducto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoProducto(evt,rowIndex);
				}	
				
				if(this.tipoproductoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoProducto: " + this.dDif); 
					}
				}								
				
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoProducto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoproducto)) {
					if(this.tipoproducto.getId()>0) {
						this.tipoproducto.setIsDeleted(true);
						
						this.tipoproductosEliminados.add(this.tipoproducto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoproductoLogic.getTipoProductos().remove(this.tipoproducto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoproductos.remove(this.tipoproducto);				
					}
					
					
					((TipoProductoModel) this.jTableDatosTipoProducto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProducto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoProducto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoProducto) {
			
			if(this.jInternalFrameDetalleFormTipoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoProducto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproducto =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproducto =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoProducto(this.tipoproducto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoproductoConstantesFunciones.cargarid_empresaTipoProducto || this.tipoproductoConstantesFunciones.event_dependid_empresaTipoProducto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoproducto.getid_empresa());
									//this.inicializarActualizarBindingTipoProducto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoproducto.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoproducto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoproducto.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoProducto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoProducto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProducto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoProducto(TipoProducto tipoproducto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoProducto(tipoproducto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoProducto(TipoProducto tipoproducto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoProducto(tipoproducto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoProducto(tipoproducto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoProducto(tipoproducto);
	}
	
	public void setVariablesObjetoActualToFormularioTipoProducto(TipoProducto tipoproducto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoProducto.jLabelidTipoProducto.setText(tipoproducto.getId().toString());
			this.jInternalFrameDetalleFormTipoProducto.jTextFieldcodigoTipoProducto.setText(tipoproducto.getcodigo());
			this.jInternalFrameDetalleFormTipoProducto.jTextAreanombreTipoProducto.setText(tipoproducto.getnombre());
			this.jInternalFrameDetalleFormTipoProducto.jTextAreadescripcionTipoProducto.setText(tipoproducto.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoProducto tipoproductoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoproductoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoProducto tipoproductoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoproductoLocal=this.tipoproducto;
			} else {
				tipoproductoLocal=this.tipoproductoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoproductoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoProducto(tipoproductoLocal,true);
					
					if(tipoproductoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoproductoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoproductoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoProducto(TipoProducto tipoproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoProducto(tipoproducto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(tipoproducto);
	}
	
	public void setVariablesFormularioToObjetoActualTipoProducto(TipoProducto tipoproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoProducto(tipoproducto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoProducto(TipoProducto tipoproducto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoProducto.jLabelidTipoProducto.getText()==null || this.jInternalFrameDetalleFormTipoProducto.jLabelidTipoProducto.getText()=="" || this.jInternalFrameDetalleFormTipoProducto.jLabelidTipoProducto.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoProducto.jLabelidTipoProducto.setText("0");
			}

			if(conColumnasBase) {tipoproducto.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoProducto.jLabelidTipoProducto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProductoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProducto.jLabelIdTipoProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoproducto.setcodigo(this.jInternalFrameDetalleFormTipoProducto.jTextFieldcodigoTipoProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProductoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProducto.jLabelcodigoTipoProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoproducto.setnombre(this.jInternalFrameDetalleFormTipoProducto.jTextAreanombreTipoProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProductoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProducto.jLabelnombreTipoProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoproducto.setdescripcion(this.jInternalFrameDetalleFormTipoProducto.jTextAreadescripcionTipoProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProductoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProducto.jLabeldescripcionTipoProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoProducto(TipoProducto tipoproductoBean,TipoProducto tipoproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoProducto(TipoProducto tipoproductoOrigen,TipoProducto tipoproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoproductoOrigen.getId()!=null && !tipoproductoOrigen.getId().equals(0L))) {tipoproducto.setId(tipoproductoOrigen.getId());}}
			if(conDefault || (!conDefault && tipoproductoOrigen.getcodigo()!=null && !tipoproductoOrigen.getcodigo().equals(""))) {tipoproducto.setcodigo(tipoproductoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoproductoOrigen.getnombre()!=null && !tipoproductoOrigen.getnombre().equals(""))) {tipoproducto.setnombre(tipoproductoOrigen.getnombre());}
			if(conDefault || (!conDefault && tipoproductoOrigen.getdescripcion()!=null && !tipoproductoOrigen.getdescripcion().equals(""))) {tipoproducto.setdescripcion(tipoproductoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoProducto(TipoProducto tipoproducto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoProducto.jLabelidTipoProducto.setText(tipoproducto.getId().toString());
			this.jInternalFrameDetalleFormTipoProducto.jTextFieldcodigoTipoProducto.setText(tipoproducto.getcodigo());
			this.jInternalFrameDetalleFormTipoProducto.jTextAreanombreTipoProducto.setText(tipoproducto.getnombre());
			this.jInternalFrameDetalleFormTipoProducto.jTextAreadescripcionTipoProducto.setText(tipoproducto.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoProducto(TipoProductoBean tipoproductoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoProducto.jLabelidTipoProducto.setText(tipoproductoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoProducto.jTextFieldcodigoTipoProducto.setText(tipoproductoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoProducto.jTextAreanombreTipoProducto.setText(tipoproductoBean.getnombre());
			this.jInternalFrameDetalleFormTipoProducto.jTextAreadescripcionTipoProducto.setText(tipoproductoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoProducto(TipoProductoParameterReturnGeneral tipoproductoReturnGeneral,TipoProductoBean tipoproductoBean,Boolean conDefault) throws Exception { 
		try {
			TipoProducto tipoproductoLocal=new TipoProducto();
			
			tipoproductoLocal=tipoproductoReturnGeneral.getTipoProducto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoproductoLocal.getId()!=null && !tipoproductoLocal.getId().equals(0L))) {tipoproductoBean.setId(tipoproductoLocal.getId());}}
			if(conDefault || (!conDefault && tipoproductoLocal.getcodigo()!=null && !tipoproductoLocal.getcodigo().equals(""))) {tipoproductoBean.setcodigo(tipoproductoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoproductoLocal.getnombre()!=null && !tipoproductoLocal.getnombre().equals(""))) {tipoproductoBean.setnombre(tipoproductoLocal.getnombre());}
			if(conDefault || (!conDefault && tipoproductoLocal.getdescripcion()!=null && !tipoproductoLocal.getdescripcion().equals(""))) {tipoproductoBean.setdescripcion(tipoproductoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoProductoGenerico(Long idTipoProductoSeleccionado,JComboBox jComboBoxTipoProducto,List<TipoProducto> tipoproductosLocal)throws Exception {
		try {
			TipoProducto  tipoproductoTemp=null;

			for(TipoProducto tipoproductoAux:tipoproductosLocal) {
				if(tipoproductoAux.getId()!=null && tipoproductoAux.getId().equals(idTipoProductoSeleccionado)) {
					tipoproductoTemp=tipoproductoAux;
					break;
				}
			}

			jComboBoxTipoProducto.setSelectedItem(tipoproductoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoProductoGenerico(JComboBox jComboBoxTipoProducto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoProducto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoProducto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ModeloProducto")) {
			jButtonModeloProductoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("MaterialProducto")) {
			jButtonMaterialProductoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("MarcaProducto")) {
			jButtonMarcaProductoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("SegmentoProducto")) {
			jButtonSegmentoProductoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ColorProducto")) {
			jButtonColorProductoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("EfectoProducto")) {
			jButtonEfectoProductoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("TallaProducto")) {
			jButtonTallaProductoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ParametroInventarioDefecto")) {
			jButtonParametroInventarioDefectoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ClaseProducto")) {
			jButtonClaseProductoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Producto")) {
			jButtonProductoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoproducto=(TipoProducto) tipoproductoLogic.getTipoProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoproducto =(TipoProducto) tipoproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoproducto.getIsNew() && !tipoproducto.getIsChanged() && !tipoproducto.getIsDeleted()) {
				sDescripcion=tipoproducto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoproducto.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoProducto tipoproductoRow=new TipoProducto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoproductoRow=(TipoProducto) tipoproductoLogic.getTipoProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoproductoRow=(TipoProducto) tipoproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonModeloProductoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoProducto tipoproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproducto = (TipoProducto)this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoproducto = (TipoProducto)this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoproducto!=null) {
						this.tipoproducto = tipoproducto;
					} else {
						this.tipoproducto = new TipoProducto();
					}
				}

				if(this.isTienePermisosModeloProducto && this.permiteMantenimiento(this.tipoproducto)) {
					ModeloProductoBeanSwingJInternalFrame modeloproductoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFramePopup=new ModeloProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						modeloproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFramePopup;
					} else {
						modeloproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame;
					}

					List<TipoProducto> tipoproductos=new ArrayList<TipoProducto>();
					tipoproductos.add(this.tipoproducto);
					if(!esRelacionado) {
						//modeloproductoBeanSwingJInternalFrame.modeloproductoSessionBean.setConGuardarRelaciones(false);
						//modeloproductoBeanSwingJInternalFrame.modeloproductoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					modeloproductoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoProducto.cargarModeloProductoBeanSwingJInternalFrame(tipoproductos,this.tipoproducto,modeloproductoBeanSwingJInternalFrame,/*conInicializar,*/modeloproductoBeanSwingJInternalFrame.modeloproductoSessionBean.getConGuardarRelaciones(),modeloproductoBeanSwingJInternalFrame.modeloproductoSessionBean.getEsGuardarRelacionado());
					modeloproductoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						modeloproductoBeanSwingJInternalFrame.actualizarEstadoPanelsModeloProducto("no_relacionado");

						modeloproductoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ModeloProductoConstantesFunciones.ITAMANIOFILATABLA + (ModeloProductoConstantesFunciones.ITAMANIOFILATABLA/2));

						modeloproductoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoProducto=(TitledBorder)this.jScrollPanelDatosTipoProducto.getBorder();
						TitledBorder titledBorderModeloProducto=(TitledBorder)modeloproductoBeanSwingJInternalFrame.jScrollPanelDatosModeloProducto.getBorder();

						titledBorderModeloProducto.setTitle(titledBorderTipoProducto.getTitle() + " -> Modelo Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,modeloproductoBeanSwingJInternalFrame);
						}

						modeloproductoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(modeloproductoBeanSwingJInternalFrame);

						modeloproductoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Modelo Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonMaterialProductoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoProducto tipoproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproducto = (TipoProducto)this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoproducto = (TipoProducto)this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoproducto!=null) {
						this.tipoproducto = tipoproducto;
					} else {
						this.tipoproducto = new TipoProducto();
					}
				}

				if(this.isTienePermisosMaterialProducto && this.permiteMantenimiento(this.tipoproducto)) {
					MaterialProductoBeanSwingJInternalFrame materialproductoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFramePopup=new MaterialProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						materialproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFramePopup;
					} else {
						materialproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame;
					}

					List<TipoProducto> tipoproductos=new ArrayList<TipoProducto>();
					tipoproductos.add(this.tipoproducto);
					if(!esRelacionado) {
						//materialproductoBeanSwingJInternalFrame.materialproductoSessionBean.setConGuardarRelaciones(false);
						//materialproductoBeanSwingJInternalFrame.materialproductoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					materialproductoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoProducto.cargarMaterialProductoBeanSwingJInternalFrame(tipoproductos,this.tipoproducto,materialproductoBeanSwingJInternalFrame,/*conInicializar,*/materialproductoBeanSwingJInternalFrame.materialproductoSessionBean.getConGuardarRelaciones(),materialproductoBeanSwingJInternalFrame.materialproductoSessionBean.getEsGuardarRelacionado());
					materialproductoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						materialproductoBeanSwingJInternalFrame.actualizarEstadoPanelsMaterialProducto("no_relacionado");

						materialproductoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(MaterialProductoConstantesFunciones.ITAMANIOFILATABLA + (MaterialProductoConstantesFunciones.ITAMANIOFILATABLA/2));

						materialproductoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoProducto=(TitledBorder)this.jScrollPanelDatosTipoProducto.getBorder();
						TitledBorder titledBorderMaterialProducto=(TitledBorder)materialproductoBeanSwingJInternalFrame.jScrollPanelDatosMaterialProducto.getBorder();

						titledBorderMaterialProducto.setTitle(titledBorderTipoProducto.getTitle() + " -> Material Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,materialproductoBeanSwingJInternalFrame);
						}

						materialproductoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(materialproductoBeanSwingJInternalFrame);

						materialproductoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Material Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonMarcaProductoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoProducto tipoproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproducto = (TipoProducto)this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoproducto = (TipoProducto)this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoproducto!=null) {
						this.tipoproducto = tipoproducto;
					} else {
						this.tipoproducto = new TipoProducto();
					}
				}

				if(this.isTienePermisosMarcaProducto && this.permiteMantenimiento(this.tipoproducto)) {
					MarcaProductoBeanSwingJInternalFrame marcaproductoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFramePopup=new MarcaProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						marcaproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFramePopup;
					} else {
						marcaproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame;
					}

					List<TipoProducto> tipoproductos=new ArrayList<TipoProducto>();
					tipoproductos.add(this.tipoproducto);
					if(!esRelacionado) {
						//marcaproductoBeanSwingJInternalFrame.marcaproductoSessionBean.setConGuardarRelaciones(false);
						//marcaproductoBeanSwingJInternalFrame.marcaproductoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					marcaproductoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoProducto.cargarMarcaProductoBeanSwingJInternalFrame(tipoproductos,this.tipoproducto,marcaproductoBeanSwingJInternalFrame,/*conInicializar,*/marcaproductoBeanSwingJInternalFrame.marcaproductoSessionBean.getConGuardarRelaciones(),marcaproductoBeanSwingJInternalFrame.marcaproductoSessionBean.getEsGuardarRelacionado());
					marcaproductoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						marcaproductoBeanSwingJInternalFrame.actualizarEstadoPanelsMarcaProducto("no_relacionado");

						marcaproductoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(MarcaProductoConstantesFunciones.ITAMANIOFILATABLA + (MarcaProductoConstantesFunciones.ITAMANIOFILATABLA/2));

						marcaproductoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoProducto=(TitledBorder)this.jScrollPanelDatosTipoProducto.getBorder();
						TitledBorder titledBorderMarcaProducto=(TitledBorder)marcaproductoBeanSwingJInternalFrame.jScrollPanelDatosMarcaProducto.getBorder();

						titledBorderMarcaProducto.setTitle(titledBorderTipoProducto.getTitle() + " -> Marca Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,marcaproductoBeanSwingJInternalFrame);
						}

						marcaproductoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(marcaproductoBeanSwingJInternalFrame);

						marcaproductoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Marca Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonSegmentoProductoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoProducto tipoproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproducto = (TipoProducto)this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoproducto = (TipoProducto)this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoproducto!=null) {
						this.tipoproducto = tipoproducto;
					} else {
						this.tipoproducto = new TipoProducto();
					}
				}

				if(this.isTienePermisosSegmentoProducto && this.permiteMantenimiento(this.tipoproducto)) {
					SegmentoProductoBeanSwingJInternalFrame segmentoproductoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFramePopup=new SegmentoProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						segmentoproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFramePopup;
					} else {
						segmentoproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame;
					}

					List<TipoProducto> tipoproductos=new ArrayList<TipoProducto>();
					tipoproductos.add(this.tipoproducto);
					if(!esRelacionado) {
						//segmentoproductoBeanSwingJInternalFrame.segmentoproductoSessionBean.setConGuardarRelaciones(false);
						//segmentoproductoBeanSwingJInternalFrame.segmentoproductoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					segmentoproductoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoProducto.cargarSegmentoProductoBeanSwingJInternalFrame(tipoproductos,this.tipoproducto,segmentoproductoBeanSwingJInternalFrame,/*conInicializar,*/segmentoproductoBeanSwingJInternalFrame.segmentoproductoSessionBean.getConGuardarRelaciones(),segmentoproductoBeanSwingJInternalFrame.segmentoproductoSessionBean.getEsGuardarRelacionado());
					segmentoproductoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						segmentoproductoBeanSwingJInternalFrame.actualizarEstadoPanelsSegmentoProducto("no_relacionado");

						segmentoproductoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(SegmentoProductoConstantesFunciones.ITAMANIOFILATABLA + (SegmentoProductoConstantesFunciones.ITAMANIOFILATABLA/2));

						segmentoproductoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoProducto=(TitledBorder)this.jScrollPanelDatosTipoProducto.getBorder();
						TitledBorder titledBorderSegmentoProducto=(TitledBorder)segmentoproductoBeanSwingJInternalFrame.jScrollPanelDatosSegmentoProducto.getBorder();

						titledBorderSegmentoProducto.setTitle(titledBorderTipoProducto.getTitle() + " -> Segmento Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,segmentoproductoBeanSwingJInternalFrame);
						}

						segmentoproductoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(segmentoproductoBeanSwingJInternalFrame);

						segmentoproductoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Segmento Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonColorProductoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoProducto tipoproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproducto = (TipoProducto)this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoproducto = (TipoProducto)this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoproducto!=null) {
						this.tipoproducto = tipoproducto;
					} else {
						this.tipoproducto = new TipoProducto();
					}
				}

				if(this.isTienePermisosColorProducto && this.permiteMantenimiento(this.tipoproducto)) {
					ColorProductoBeanSwingJInternalFrame colorproductoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFramePopup=new ColorProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						colorproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFramePopup;
					} else {
						colorproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame;
					}

					List<TipoProducto> tipoproductos=new ArrayList<TipoProducto>();
					tipoproductos.add(this.tipoproducto);
					if(!esRelacionado) {
						//colorproductoBeanSwingJInternalFrame.colorproductoSessionBean.setConGuardarRelaciones(false);
						//colorproductoBeanSwingJInternalFrame.colorproductoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					colorproductoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoProducto.cargarColorProductoBeanSwingJInternalFrame(tipoproductos,this.tipoproducto,colorproductoBeanSwingJInternalFrame,/*conInicializar,*/colorproductoBeanSwingJInternalFrame.colorproductoSessionBean.getConGuardarRelaciones(),colorproductoBeanSwingJInternalFrame.colorproductoSessionBean.getEsGuardarRelacionado());
					colorproductoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						colorproductoBeanSwingJInternalFrame.actualizarEstadoPanelsColorProducto("no_relacionado");

						colorproductoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ColorProductoConstantesFunciones.ITAMANIOFILATABLA + (ColorProductoConstantesFunciones.ITAMANIOFILATABLA/2));

						colorproductoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoProducto=(TitledBorder)this.jScrollPanelDatosTipoProducto.getBorder();
						TitledBorder titledBorderColorProducto=(TitledBorder)colorproductoBeanSwingJInternalFrame.jScrollPanelDatosColorProducto.getBorder();

						titledBorderColorProducto.setTitle(titledBorderTipoProducto.getTitle() + " -> Color Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,colorproductoBeanSwingJInternalFrame);
						}

						colorproductoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(colorproductoBeanSwingJInternalFrame);

						colorproductoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Color Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonEfectoProductoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoProducto tipoproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproducto = (TipoProducto)this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoproducto = (TipoProducto)this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoproducto!=null) {
						this.tipoproducto = tipoproducto;
					} else {
						this.tipoproducto = new TipoProducto();
					}
				}

				if(this.isTienePermisosEfectoProducto && this.permiteMantenimiento(this.tipoproducto)) {
					EfectoProductoBeanSwingJInternalFrame efectoproductoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFramePopup=new EfectoProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						efectoproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFramePopup;
					} else {
						efectoproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame;
					}

					List<TipoProducto> tipoproductos=new ArrayList<TipoProducto>();
					tipoproductos.add(this.tipoproducto);
					if(!esRelacionado) {
						//efectoproductoBeanSwingJInternalFrame.efectoproductoSessionBean.setConGuardarRelaciones(false);
						//efectoproductoBeanSwingJInternalFrame.efectoproductoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					efectoproductoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoProducto.cargarEfectoProductoBeanSwingJInternalFrame(tipoproductos,this.tipoproducto,efectoproductoBeanSwingJInternalFrame,/*conInicializar,*/efectoproductoBeanSwingJInternalFrame.efectoproductoSessionBean.getConGuardarRelaciones(),efectoproductoBeanSwingJInternalFrame.efectoproductoSessionBean.getEsGuardarRelacionado());
					efectoproductoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						efectoproductoBeanSwingJInternalFrame.actualizarEstadoPanelsEfectoProducto("no_relacionado");

						efectoproductoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(EfectoProductoConstantesFunciones.ITAMANIOFILATABLA + (EfectoProductoConstantesFunciones.ITAMANIOFILATABLA/2));

						efectoproductoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoProducto=(TitledBorder)this.jScrollPanelDatosTipoProducto.getBorder();
						TitledBorder titledBorderEfectoProducto=(TitledBorder)efectoproductoBeanSwingJInternalFrame.jScrollPanelDatosEfectoProducto.getBorder();

						titledBorderEfectoProducto.setTitle(titledBorderTipoProducto.getTitle() + " -> Efecto Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,efectoproductoBeanSwingJInternalFrame);
						}

						efectoproductoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(efectoproductoBeanSwingJInternalFrame);

						efectoproductoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Efecto Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonTallaProductoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoProducto tipoproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproducto = (TipoProducto)this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoproducto = (TipoProducto)this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoproducto!=null) {
						this.tipoproducto = tipoproducto;
					} else {
						this.tipoproducto = new TipoProducto();
					}
				}

				if(this.isTienePermisosTallaProducto && this.permiteMantenimiento(this.tipoproducto)) {
					TallaProductoBeanSwingJInternalFrame tallaproductoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFramePopup=new TallaProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						tallaproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFramePopup;
					} else {
						tallaproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame;
					}

					List<TipoProducto> tipoproductos=new ArrayList<TipoProducto>();
					tipoproductos.add(this.tipoproducto);
					if(!esRelacionado) {
						//tallaproductoBeanSwingJInternalFrame.tallaproductoSessionBean.setConGuardarRelaciones(false);
						//tallaproductoBeanSwingJInternalFrame.tallaproductoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					tallaproductoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoProducto.cargarTallaProductoBeanSwingJInternalFrame(tipoproductos,this.tipoproducto,tallaproductoBeanSwingJInternalFrame,/*conInicializar,*/tallaproductoBeanSwingJInternalFrame.tallaproductoSessionBean.getConGuardarRelaciones(),tallaproductoBeanSwingJInternalFrame.tallaproductoSessionBean.getEsGuardarRelacionado());
					tallaproductoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						tallaproductoBeanSwingJInternalFrame.actualizarEstadoPanelsTallaProducto("no_relacionado");

						tallaproductoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(TallaProductoConstantesFunciones.ITAMANIOFILATABLA + (TallaProductoConstantesFunciones.ITAMANIOFILATABLA/2));

						tallaproductoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoProducto=(TitledBorder)this.jScrollPanelDatosTipoProducto.getBorder();
						TitledBorder titledBorderTallaProducto=(TitledBorder)tallaproductoBeanSwingJInternalFrame.jScrollPanelDatosTallaProducto.getBorder();

						titledBorderTallaProducto.setTitle(titledBorderTipoProducto.getTitle() + " -> Talla Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,tallaproductoBeanSwingJInternalFrame);
						}

						tallaproductoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(tallaproductoBeanSwingJInternalFrame);

						tallaproductoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Talla Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonParametroInventarioDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoProducto tipoproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproducto = (TipoProducto)this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoproducto = (TipoProducto)this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoproducto!=null) {
						this.tipoproducto = tipoproducto;
					} else {
						this.tipoproducto = new TipoProducto();
					}
				}

				if(this.isTienePermisosParametroInventarioDefecto && this.permiteMantenimiento(this.tipoproducto)) {
					ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFramePopup=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFramePopup;
					} else {
						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame;
					}

					List<TipoProducto> tipoproductos=new ArrayList<TipoProducto>();
					tipoproductos.add(this.tipoproducto);
					if(!esRelacionado) {
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setConGuardarRelaciones(false);
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoProducto.cargarParametroInventarioDefectoBeanSwingJInternalFrame(tipoproductos,this.tipoproducto,parametroinventariodefectoBeanSwingJInternalFrame,/*conInicializar,*/parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getConGuardarRelaciones(),parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("no_relacionado");

						parametroinventariodefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametroinventariodefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoProducto=(TitledBorder)this.jScrollPanelDatosTipoProducto.getBorder();
						TitledBorder titledBorderParametroInventarioDefecto=(TitledBorder)parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getBorder();

						titledBorderParametroInventarioDefecto.setTitle(titledBorderTipoProducto.getTitle() + " -> Parametro Inventario Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametroinventariodefectoBeanSwingJInternalFrame);
						}

						parametroinventariodefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametroinventariodefectoBeanSwingJInternalFrame);

						parametroinventariodefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Inventario Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonClaseProductoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoProducto tipoproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproducto = (TipoProducto)this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoproducto = (TipoProducto)this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoproducto!=null) {
						this.tipoproducto = tipoproducto;
					} else {
						this.tipoproducto = new TipoProducto();
					}
				}

				if(this.isTienePermisosClaseProducto && this.permiteMantenimiento(this.tipoproducto)) {
					ClaseProductoBeanSwingJInternalFrame claseproductoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFramePopup=new ClaseProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						claseproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFramePopup;
					} else {
						claseproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame;
					}

					List<TipoProducto> tipoproductos=new ArrayList<TipoProducto>();
					tipoproductos.add(this.tipoproducto);
					if(!esRelacionado) {
						//claseproductoBeanSwingJInternalFrame.claseproductoSessionBean.setConGuardarRelaciones(false);
						//claseproductoBeanSwingJInternalFrame.claseproductoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					claseproductoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoProducto.cargarClaseProductoBeanSwingJInternalFrame(tipoproductos,this.tipoproducto,claseproductoBeanSwingJInternalFrame,/*conInicializar,*/claseproductoBeanSwingJInternalFrame.claseproductoSessionBean.getConGuardarRelaciones(),claseproductoBeanSwingJInternalFrame.claseproductoSessionBean.getEsGuardarRelacionado());
					claseproductoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						claseproductoBeanSwingJInternalFrame.actualizarEstadoPanelsClaseProducto("no_relacionado");

						claseproductoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ClaseProductoConstantesFunciones.ITAMANIOFILATABLA + (ClaseProductoConstantesFunciones.ITAMANIOFILATABLA/2));

						claseproductoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoProducto=(TitledBorder)this.jScrollPanelDatosTipoProducto.getBorder();
						TitledBorder titledBorderClaseProducto=(TitledBorder)claseproductoBeanSwingJInternalFrame.jScrollPanelDatosClaseProducto.getBorder();

						titledBorderClaseProducto.setTitle(titledBorderTipoProducto.getTitle() + " -> Clase Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,claseproductoBeanSwingJInternalFrame);
						}

						claseproductoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(claseproductoBeanSwingJInternalFrame);

						claseproductoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Clase Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonProductoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoProducto tipoproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproducto = (TipoProducto)this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoproducto = (TipoProducto)this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoproducto!=null) {
						this.tipoproducto = tipoproducto;
					} else {
						this.tipoproducto = new TipoProducto();
					}
				}

				if(this.isTienePermisosProducto && this.permiteMantenimiento(this.tipoproducto)) {
					ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFramePopup=new ProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFramePopup;
					} else {
						productoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame;
					}

					List<TipoProducto> tipoproductos=new ArrayList<TipoProducto>();
					tipoproductos.add(this.tipoproducto);
					if(!esRelacionado) {
						//productoBeanSwingJInternalFrame.productoSessionBean.setConGuardarRelaciones(false);
						//productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoProducto.cargarProductoBeanSwingJInternalFrame(tipoproductos,this.tipoproducto,productoBeanSwingJInternalFrame,/*conInicializar,*/productoBeanSwingJInternalFrame.productoSessionBean.getConGuardarRelaciones(),productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado());
					productoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoBeanSwingJInternalFrame.actualizarEstadoPanelsProducto("no_relacionado");

						productoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoConstantesFunciones.ITAMANIOFILATABLA + (ProductoConstantesFunciones.ITAMANIOFILATABLA/2));

						productoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoProducto=(TitledBorder)this.jScrollPanelDatosTipoProducto.getBorder();
						TitledBorder titledBorderProducto=(TitledBorder)productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

						titledBorderProducto.setTitle(titledBorderTipoProducto.getTitle() + " -> Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoBeanSwingJInternalFrame);
						}

						productoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoBeanSwingJInternalFrame);

						productoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoProducto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoProducto.setVisible((this.isVisibilidadCeldaNuevoTipoProducto && this.isPermisoNuevoTipoProducto));			
			this.jButtonDuplicarTipoProducto.setVisible((this.isVisibilidadCeldaDuplicarTipoProducto && this.isPermisoDuplicarTipoProducto));			
			this.jButtonCopiarTipoProducto.setVisible((this.isVisibilidadCeldaCopiarTipoProducto && this.isPermisoCopiarTipoProducto));
			this.jButtonVerFormTipoProducto.setVisible((this.isVisibilidadCeldaVerFormTipoProducto && this.isPermisoVerFormTipoProducto));
			
			this.jButtonAbrirOrderByTipoProducto.setVisible((this.isVisibilidadCeldaOrdenTipoProducto && this.isPermisoOrdenTipoProducto));			
			
			this.jButtonNuevoRelacionesTipoProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProducto && this.isPermisoNuevoTipoProducto));			
			this.jButtonNuevoGuardarCambiosTipoProducto.setVisible((this.isVisibilidadCeldaNuevoTipoProducto && this.isPermisoNuevoTipoProducto && this.isPermisoGuardarCambiosTipoProducto));
			
			if(this.jInternalFrameDetalleFormTipoProducto!=null) {
			this.jInternalFrameDetalleFormTipoProducto.jButtonModificarTipoProducto.setVisible((this.isVisibilidadCeldaModificarTipoProducto && this.isPermisoActualizarTipoProducto));	
			this.jInternalFrameDetalleFormTipoProducto.jButtonActualizarTipoProducto.setVisible((this.isVisibilidadCeldaActualizarTipoProducto && this.isPermisoActualizarTipoProducto));	
			this.jInternalFrameDetalleFormTipoProducto.jButtonEliminarTipoProducto.setVisible((this.isVisibilidadCeldaEliminarTipoProducto && this.isPermisoEliminarTipoProducto));
			this.jInternalFrameDetalleFormTipoProducto.jButtonCancelarTipoProducto.setVisible(this.isVisibilidadCeldaCancelarTipoProducto);							
			this.jInternalFrameDetalleFormTipoProducto.jButtonGuardarCambiosTipoProducto.setVisible((this.isVisibilidadCeldaGuardarTipoProducto && this.isPermisoGuardarCambiosTipoProducto));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProducto && this.isPermisoGuardarCambiosTipoProducto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoProducto.setVisible((this.isVisibilidadCeldaNuevoTipoProducto && this.isPermisoNuevoTipoProducto));						
			this.jButtonDuplicarToolBarTipoProducto.setVisible((this.isVisibilidadCeldaDuplicarTipoProducto && this.isPermisoDuplicarTipoProducto));						
			this.jButtonCopiarToolBarTipoProducto.setVisible((this.isVisibilidadCeldaCopiarTipoProducto && this.isPermisoCopiarTipoProducto));			
			this.jButtonVerFormToolBarTipoProducto.setVisible((this.isVisibilidadCeldaVerFormTipoProducto && this.isPermisoVerFormTipoProducto));			
			this.jButtonAbrirOrderByToolBarTipoProducto.setVisible((this.isVisibilidadCeldaOrdenTipoProducto && this.isPermisoOrdenTipoProducto));
			this.jButtonNuevoRelacionesToolBarTipoProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProducto && this.isPermisoNuevoTipoProducto));			
			this.jButtonNuevoGuardarCambiosToolBarTipoProducto.setVisible((this.isVisibilidadCeldaNuevoTipoProducto && this.isPermisoNuevoTipoProducto && this.isPermisoGuardarCambiosTipoProducto));			
			
			if(this.jInternalFrameDetalleFormTipoProducto!=null) {
			this.jInternalFrameDetalleFormTipoProducto.jButtonModificarToolBarTipoProducto.setVisible((this.isVisibilidadCeldaModificarTipoProducto && this.isPermisoActualizarTipoProducto));	
			this.jInternalFrameDetalleFormTipoProducto.jButtonActualizarToolBarTipoProducto.setVisible((this.isVisibilidadCeldaActualizarTipoProducto  && this.isPermisoActualizarTipoProducto));	
			this.jInternalFrameDetalleFormTipoProducto.jButtonEliminarToolBarTipoProducto.setVisible((this.isVisibilidadCeldaEliminarTipoProducto && this.isPermisoEliminarTipoProducto));
			this.jInternalFrameDetalleFormTipoProducto.jButtonCancelarToolBarTipoProducto.setVisible(this.isVisibilidadCeldaCancelarTipoProducto);				
			this.jInternalFrameDetalleFormTipoProducto.jButtonGuardarCambiosToolBarTipoProducto.setVisible((this.isVisibilidadCeldaGuardarTipoProducto && this.isPermisoGuardarCambiosTipoProducto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProducto && this.isPermisoGuardarCambiosTipoProducto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoProducto.setVisible((this.isVisibilidadCeldaNuevoTipoProducto && this.isPermisoNuevoTipoProducto));			
			this.jMenuItemDuplicarTipoProducto.setVisible((this.isVisibilidadCeldaDuplicarTipoProducto && this.isPermisoDuplicarTipoProducto));			
			this.jMenuItemCopiarTipoProducto.setVisible((this.isVisibilidadCeldaCopiarTipoProducto && this.isPermisoCopiarTipoProducto));			
			this.jMenuItemVerFormTipoProducto.setVisible((this.isVisibilidadCeldaVerFormTipoProducto && this.isPermisoVerFormTipoProducto));			
			this.jMenuItemAbrirOrderByTipoProducto.setVisible((this.isVisibilidadCeldaOrdenTipoProducto && this.isPermisoOrdenTipoProducto));			
			//this.jMenuItemMostrarOcultarTipoProducto.setVisible((this.isVisibilidadCeldaOrdenTipoProducto && this.isPermisoOrdenTipoProducto));
			this.jMenuItemDetalleAbrirOrderByTipoProducto.setVisible((this.isVisibilidadCeldaOrdenTipoProducto && this.isPermisoOrdenTipoProducto));			
			//this.jMenuItemDetalleMostrarOcultarTipoProducto.setVisible((this.isVisibilidadCeldaOrdenTipoProducto && this.isPermisoOrdenTipoProducto));			
			this.jMenuItemNuevoRelacionesTipoProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProducto && this.isPermisoNuevoTipoProducto));			
			this.jMenuItemNuevoGuardarCambiosTipoProducto.setVisible((this.isVisibilidadCeldaNuevoTipoProducto && this.isPermisoNuevoTipoProducto && this.isPermisoGuardarCambiosTipoProducto));									
			
			if(this.jInternalFrameDetalleFormTipoProducto!=null) {
			this.jInternalFrameDetalleFormTipoProducto.jMenuItemModificarTipoProducto.setVisible((this.isVisibilidadCeldaModificarTipoProducto && this.isPermisoActualizarTipoProducto));	
			this.jInternalFrameDetalleFormTipoProducto.jMenuItemActualizarTipoProducto.setVisible((this.isVisibilidadCeldaActualizarTipoProducto && this.isPermisoActualizarTipoProducto));	
			this.jInternalFrameDetalleFormTipoProducto.jMenuItemEliminarTipoProducto.setVisible((this.isVisibilidadCeldaEliminarTipoProducto && this.isPermisoEliminarTipoProducto));
			this.jInternalFrameDetalleFormTipoProducto.jMenuItemCancelarTipoProducto.setVisible(this.isVisibilidadCeldaCancelarTipoProducto);				
			}
			
			this.jMenuItemGuardarCambiosTipoProducto.setVisible((this.isVisibilidadCeldaGuardarTipoProducto && this.isPermisoGuardarCambiosTipoProducto));						
			this.jMenuItemGuardarCambiosTablaTipoProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProducto && this.isPermisoGuardarCambiosTipoProducto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoProducto=this.jButtonNuevoTipoProducto.isVisible();
			this.isVisibilidadCeldaDuplicarTipoProducto=this.jButtonDuplicarTipoProducto.isVisible();
			this.isVisibilidadCeldaCopiarTipoProducto=this.jButtonCopiarTipoProducto.isVisible();
			this.isVisibilidadCeldaVerFormTipoProducto=this.jButtonVerFormTipoProducto.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoProducto=this.jButtonAbrirOrderByTipoProducto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoProducto=this.jButtonNuevoRelacionesTipoProducto.isVisible();
			this.isVisibilidadCeldaModificarTipoProducto=this.jButtonModificarTipoProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProducto!=null) {
			this.isVisibilidadCeldaActualizarTipoProducto=this.jInternalFrameDetalleFormTipoProducto.jButtonActualizarTipoProducto.isVisible();
			this.isVisibilidadCeldaEliminarTipoProducto=this.jInternalFrameDetalleFormTipoProducto.jButtonEliminarTipoProducto.isVisible();
			this.isVisibilidadCeldaCancelarTipoProducto=this.jInternalFrameDetalleFormTipoProducto.jButtonCancelarTipoProducto.isVisible();
			this.isVisibilidadCeldaGuardarTipoProducto=this.jInternalFrameDetalleFormTipoProducto.jButtonGuardarCambiosTipoProducto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoProducto=this.jButtonGuardarCambiosTablaTipoProducto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoProducto=this.jButtonNuevoToolBarTipoProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoProducto=this.jButtonNuevoRelacionesToolBarTipoProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProducto!=null) {
			this.isVisibilidadCeldaModificarTipoProducto=this.jInternalFrameDetalleFormTipoProducto.jButtonModificarToolBarTipoProducto.isVisible();
			this.isVisibilidadCeldaActualizarTipoProducto=this.jInternalFrameDetalleFormTipoProducto.jButtonActualizarToolBarTipoProducto.isVisible();
			this.isVisibilidadCeldaEliminarTipoProducto=this.jInternalFrameDetalleFormTipoProducto.jButtonEliminarToolBarTipoProducto.isVisible();
			this.isVisibilidadCeldaCancelarTipoProducto=this.jInternalFrameDetalleFormTipoProducto.jButtonCancelarToolBarTipoProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoProducto=this.jButtonGuardarCambiosToolBarTipoProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoProducto=this.jButtonGuardarCambiosTablaToolBarTipoProducto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoProducto=this.jMenuItemNuevoTipoProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoProducto=this.jMenuItemNuevoRelacionesTipoProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProducto!=null) {
			this.isVisibilidadCeldaModificarTipoProducto=this.jInternalFrameDetalleFormTipoProducto.jMenuItemModificarTipoProducto.isVisible();
			this.isVisibilidadCeldaActualizarTipoProducto=this.jInternalFrameDetalleFormTipoProducto.jMenuItemActualizarTipoProducto.isVisible();
			this.isVisibilidadCeldaEliminarTipoProducto=this.jInternalFrameDetalleFormTipoProducto.jMenuItemEliminarTipoProducto.isVisible();
			this.isVisibilidadCeldaCancelarTipoProducto=this.jInternalFrameDetalleFormTipoProducto.jMenuItemCancelarTipoProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoProducto=this.jMenuItemGuardarCambiosTipoProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoProducto=this.jMenuItemGuardarCambiosTablaTipoProducto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoProducto(Boolean esInicializar) {
		if(TipoProductoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoproductoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoProducto();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoProducto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoProducto() {
		this.jButtonNuevoTipoProducto.setVisible(this.isPermisoNuevoTipoProducto);			
		this.jButtonDuplicarTipoProducto.setVisible(this.isPermisoDuplicarTipoProducto);			
		this.jButtonCopiarTipoProducto.setVisible(this.isPermisoCopiarTipoProducto);			
		this.jButtonVerFormTipoProducto.setVisible(this.isPermisoVerFormTipoProducto);			
		
		this.jButtonAbrirOrderByTipoProducto.setVisible(this.isPermisoOrdenTipoProducto);					
		
		this.jButtonNuevoRelacionesTipoProducto.setVisible(this.isPermisoNuevoTipoProducto);			
		
		if(this.jInternalFrameDetalleFormTipoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProducto.jButtonModificarTipoProducto.setVisible(this.isPermisoActualizarTipoProducto);	
			this.jInternalFrameDetalleFormTipoProducto.jButtonActualizarTipoProducto.setVisible(this.isPermisoActualizarTipoProducto);	
			this.jInternalFrameDetalleFormTipoProducto.jButtonEliminarTipoProducto.setVisible(this.isPermisoEliminarTipoProducto);
			this.jInternalFrameDetalleFormTipoProducto.jButtonCancelarTipoProducto.setVisible(this.isVisibilidadCeldaCancelarTipoProducto);						
			this.jInternalFrameDetalleFormTipoProducto.jButtonGuardarCambiosTipoProducto.setVisible(this.isPermisoGuardarCambiosTipoProducto);							
		}
		
		this.jButtonGuardarCambiosTablaTipoProducto.setVisible(this.isPermisoActualizarTipoProducto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoProducto() {
		this.jInternalFrameDetalleFormTipoProducto.jButtonModificarTipoProducto.setVisible(this.isPermisoActualizarTipoProducto);	
		this.jInternalFrameDetalleFormTipoProducto.jButtonActualizarTipoProducto.setVisible(this.isPermisoActualizarTipoProducto);	
		this.jInternalFrameDetalleFormTipoProducto.jButtonEliminarTipoProducto.setVisible(this.isPermisoEliminarTipoProducto);
		this.jInternalFrameDetalleFormTipoProducto.jButtonCancelarTipoProducto.setVisible(this.isVisibilidadCeldaCancelarTipoProducto);							
		this.jInternalFrameDetalleFormTipoProducto.jButtonGuardarCambiosTipoProducto.setVisible((this.isVisibilidadCeldaGuardarTipoProducto && this.isPermisoGuardarCambiosTipoProducto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoProducto() {
		if(TipoProductoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoProducto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoProducto() {
	}
	
	public void jTableDatosTipoProductoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoProducto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProducto(this.gettipoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproducto =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoproducto =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoproducto==null) {
						this.tipoproducto = new TipoProducto();
					}

					this.setVariablesFormularioToObjetoActualTipoProducto(this.tipoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);
				}

				if(this.tipoproducto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoproducto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoProducto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproducto =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoproducto =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoProducto(this.gettipoproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoproductoLogic.getConnexion());

				if(this.tipoproducto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoproducto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoProducto=(TitledBorder)this.jScrollPanelDatosTipoProducto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoProducto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProducto(this.gettipoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproducto =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoproducto =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoproducto==null) {
						this.tipoproducto = new TipoProducto();
					}

					this.setVariablesFormularioToObjetoActualTipoProducto(this.tipoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);
				}

				if(this.tipoproducto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoproducto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProducto(this.gettipoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproducto =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoproducto =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoproducto==null) {
						this.tipoproducto = new TipoProducto();
					}

					this.setVariablesFormularioToObjetoActualTipoProducto(this.tipoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);
				}

				if(this.tipoproducto.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoproducto.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProducto(this.gettipoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproducto =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoproducto =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoproducto==null) {
						this.tipoproducto = new TipoProducto();
					}

					this.setVariablesFormularioToObjetoActualTipoProducto(this.tipoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);
				}

				if(this.tipoproducto.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoproducto.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTipoProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProducto(this.gettipoproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproducto =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoproducto =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoproducto==null) {
						this.tipoproducto = new TipoProducto();
					}

					this.setVariablesFormularioToObjetoActualTipoProducto(this.tipoproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);
				}

				if(this.tipoproducto.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.tipoproducto.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoProducto(false,false);

			this.getTipoProductosBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoProducto(false);

			//if(TipoProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoProducto(false,false);

			this.getTipoProductosBusquedaPorNombre();

			this.inicializarActualizarBindingTipoProducto(false);

			//if(TipoProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoProducto(false,false);

			this.getTipoProductosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoProducto(false);

			//if(TipoProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoProducto() {
		if(this.jInternalFrameDetalleFormTipoProducto!=null) {
		

		if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoProducto!=null) {
			this.jInternalFrameDetalleFormTipoProducto.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoProducto.dispose();
			this.jInternalFrameDetalleFormTipoProducto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoProducto!=null) {
			this.jInternalFrameReporteDinamicoTipoProducto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoProducto.dispose();
			this.jInternalFrameReporteDinamicoTipoProducto=null;
		}
		
		if(this.jInternalFrameImportacionTipoProducto!=null) {
			this.jInternalFrameImportacionTipoProducto.setVisible(false);	    			
			this.jInternalFrameImportacionTipoProducto.dispose();
			this.jInternalFrameImportacionTipoProducto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoProducto();
			
			TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoProducto")) {
				jButtonNuevoTipoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoProducto")) {
				jButtonDuplicarTipoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoProducto")) {
				jButtonCopiarTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoProducto")) {
				jButtonVerFormTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoProducto")) {
				jButtonNuevoTipoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoProducto")) {
				jButtonDuplicarTipoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoProducto")) {
				jButtonNuevoTipoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoProducto")) {
				jButtonDuplicarTipoProductoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoProducto")) {
				jButtonNuevoTipoProductoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoProducto")) {
				jButtonNuevoTipoProductoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoProducto")) {
				jButtonNuevoTipoProductoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoProducto")) {
				jButtonModificarTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoProducto")) {
				jButtonModificarTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoProducto")) {
				jButtonModificarTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoProducto")) {
				jButtonActualizarTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoProducto")) {
				jButtonActualizarTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoProducto")) {
				jButtonActualizarTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoProducto")) {
				jButtonEliminarTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoProducto")) {
				jButtonEliminarTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoProducto")) {
				jButtonEliminarTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoProducto")) {
				jButtonCancelarTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoProducto")) {
				jButtonCancelarTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoProducto")) {
				jButtonCancelarTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoProducto")) {
				jButtonCerrarTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoProducto")) {
				jButtonCerrarTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoProducto")) {
				jButtonCerrarTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoProducto")) {
				jButtonMostrarOcultarTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoProducto")) {
				jButtonCancelarTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoProducto")) {
				jButtonGuardarCambiosTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoProducto")) {
				jButtonGuardarCambiosTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoProducto")) {
				jButtonCopiarTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoProducto")) {
				jButtonVerFormTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoProducto")) {
				jButtonGuardarCambiosTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoProducto")) {
				jButtonCopiarTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoProducto")) {
				jButtonVerFormTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoProducto")) {
				jButtonGuardarCambiosTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoProducto")) {
				jButtonGuardarCambiosTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoProducto")) {
				jButtonGuardarCambiosTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoProducto")) {
				jButtonRecargarInformacionTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoProducto")) {
				jButtonRecargarInformacionTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoProducto")) {
				jButtonRecargarInformacionTipoProductoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoProducto")) {
				jButtonAnterioresTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoProducto")) {
				jButtonAnterioresTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoProducto")) {
				jButtonAnterioresTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoProducto")) {
				jButtonSiguientesTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoProducto")) {
				jButtonSiguientesTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoProducto")) {
				jButtonSiguientesTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoProducto") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoProducto")) {
				jButtonAbrirOrderByTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoProducto") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoProducto")) {
				jButtonMostrarOcultarTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoProducto")) {
				jButtonNuevoGuardarCambiosTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoProducto")) {
				jButtonNuevoGuardarCambiosTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoProducto")) {
				jButtonNuevoGuardarCambiosTipoProductoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoProducto")) {
				jButtonCerrarReporteDinamicoTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoProducto")) {
				jButtonGenerarReporteDinamicoTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoProducto")) {
				
				jButtonGenerarExcelReporteDinamicoTipoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoProducto")) {
				jButtonCerrarImportacionTipoProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoProducto")) {
				
				jButtonGenerarImportacionTipoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoProducto")) {
				
				jButtonAbrirImportacionTipoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoProducto")) {
				jComboBoxTiposAccionesTipoProductoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoProducto")) {
				jComboBoxTiposRelacionesTipoProductoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoProducto")) {
				jComboBoxTiposAccionesTipoProductoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoProducto")) {
				
				jComboBoxTiposSeleccionarTipoProductoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoProducto")) {
				jTextFieldValorCampoGeneralTipoProductoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoProducto")) {
				jButtonAbrirOrderByTipoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoProducto")) {
				jButtonAbrirOrderByTipoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoProducto")) {
				jButtonCerrarOrderByTipoProductoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoProductoBusqueda")) {
				this.jButtonidTipoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoProductoUpdate")) {
				this.jButtonid_empresaTipoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoProductoBusqueda")) {
				this.jButtonid_empresaTipoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoProductoBusqueda")) {
				this.jButtoncodigoTipoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoProductoBusqueda")) {
				this.jButtonnombreTipoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoProductoBusqueda")) {
				this.jButtondescripcionTipoProductoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoProducto")) {
				this.jButtonBusquedaPorCodigoTipoProductoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoProducto")) {
				this.jButtonBusquedaPorNombreTipoProductoActionPerformed(evt);
			}
			
			;
			
			
			TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoProducto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproducto);
				
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
				
				


				
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoProducto tipoproductoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoproductoLocal=this.tipoproducto;
			} else {
				tipoproductoLocal=this.tipoproductoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproducto);
				
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
							
				
				


				
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoAnterior =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproductoAnterior =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
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
			
			TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
			
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
			
			


			
			TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproducto);
				
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
								
						
				


				
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProducto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproducto);
				
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
								
				
				


				
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoAnterior =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproductoAnterior =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproducto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoAnterior =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproductoAnterior =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproducto);
				
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
							
				
				


				
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProducto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproductoAnterior =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoproductoAnterior =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
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
			
			TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
			
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
			
			


			
			TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProductoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproducto);
				
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
								
				
				


				
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoAnterior =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproductoAnterior =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproducto);
				
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoProducto")) {
					jCheckBoxSeleccionarTodosTipoProductoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoProducto")) {
					jCheckBoxSeleccionadosTipoProductoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoProducto")) {
					
				}
				
				


				
				
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproducto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoproducto);
				
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
												
				
				


				
				
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproductoAnterior =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoproductoAnterior =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProductoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproducto);
				
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
				
				
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
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
			
			TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
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
			
			


			
			TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproducto);
				
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProducto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProducto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproducto);
				
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
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
				
				


				
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProducto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproductoAnterior =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproductoAnterior =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoProducto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoProducto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoproducto =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoproducto =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoproducto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoProducto")) {
				
				}
				
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoProducto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoProducto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoProducto")) {
			
			}
			
			TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoProducto();
			
			TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoProducto")) {
				jButtonNuevoTipoProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoProducto")) {
				jButtonDuplicarTipoProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoProducto")) {
				jButtonCopiarTipoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoProducto")) {
				jButtonVerFormTipoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoProducto")) {
				jButtonNuevoTipoProductoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoProducto")) {
				jButtonModificarTipoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoProducto")) {
				jButtonActualizarTipoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoProducto")) {
				jButtonEliminarTipoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoProducto")) {
				jButtonGuardarCambiosTipoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoProducto")) {
				jButtonCancelarTipoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoProducto")) {
				jButtonCerrarTipoProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoProducto")) {
				jButtonGuardarCambiosTipoProductoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoProducto")) {
				jButtonNuevoGuardarCambiosTipoProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoProducto")) {
				jButtonAbrirOrderByTipoProductoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoProducto")) {
				jButtonRecargarInformacionTipoProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoProducto")) {
				jButtonAnterioresTipoProductoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoProducto")) {
				jButtonSiguientesTipoProductoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoProductoBusqueda")) {
				this.jButtonidTipoProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoProductoUpdate")) {
				this.jButtonid_empresaTipoProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoProductoBusqueda")) {
				this.jButtonid_empresaTipoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoProductoBusqueda")) {
				this.jButtoncodigoTipoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoProductoBusqueda")) {
				this.jButtonnombreTipoProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoProductoBusqueda")) {
				this.jButtondescripcionTipoProductoBusquedaActionPerformed(evt);
			}
			
			TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoProducto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoProducto")) {
				closingInternalFrameTipoProducto();
				
			} else if(sTipo.equals("jButtonCancelarTipoProducto")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoProducto = (JInternalFrameBase)evt.getSource();
	            	
	            TipoProductoBeanSwingJInternalFrame jInternalFrameParent=(TipoProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoProducto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoProductoActionPerformed(null);
			}
			
			TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoproducto,new Object(),this.tipoproductoParameterGeneral,this.tipoproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoproducto)) {
			if(!esControlTabla) {
				if(TipoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoProducto(this.tipoproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);			
				}
				
				if(this.tipoproductoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoProducto(this.tipoproducto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoproductoReturnGeneral=tipoproductoLogic.procesarEventosTipoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoproductoLogic.getTipoProductos(),this.tipoproducto,this.tipoproductoParameterGeneral,this.isEsNuevoTipoProducto,classes);//this.tipoproductoLogic.getTipoProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoProducto(this.tipoproductoReturnGeneral,this.tipoproductoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoProducto(classes,this.tipoproductoReturnGeneral,this.tipoproductoBean,false);
					}
						
					if(this.tipoproductoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoProducto(this.tipoproductoReturnGeneral.getTipoProducto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoProducto(this.tipoproductoReturnGeneral.getTipoProducto());	
					}
						
					if(this.tipoproductoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoProducto(this.tipoproductoReturnGeneral.getTipoProducto(),classes);//this.tipoproductoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoProducto(this.tipoproducto,classes);//this.tipoproductoBean);									
				}
			
				if(TipoProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoProducto(this.tipoproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProducto(this.tipoproducto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoproductoAnterior!=null) {
						this.tipoproducto=this.tipoproductoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoproductoReturnGeneral=tipoproductoLogic.procesarEventosTipoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoproductoLogic.getTipoProductos(),this.tipoproducto,this.tipoproductoParameterGeneral,this.isEsNuevoTipoProducto,classes);//this.tipoproductoLogic.getTipoProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoproductoReturnGeneral.getTipoProducto(),tipoproductoLogic.getTipoProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoproductoReturnGeneral.getTipoProducto(),this.tipoproductos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoProducto.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoProducto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoProducto();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoProducto() throws Exception {
		
		TipoProductoModel tipoproductoModel=(TipoProductoModel)this.jTableDatosTipoProducto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoproductoModel.tipoproductos=this.tipoproductoLogic.getTipoProductos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoproductoModel.tipoproductos=this.tipoproductos;
		}
		
		
		((TipoProductoModel) this.jTableDatosTipoProducto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoProducto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoproductoAnterior(),this.tipoproductoLogic.getTipoProductos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoproductoAnterior(),this.tipoproductos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoProducto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoProducto(TipoProducto tipoproducto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ModeloProducto.class)) {
					this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductoLogic.setModeloProductos(tipoproducto.getModeloProductos());
					this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaModeloProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(MaterialProducto.class)) {
					this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductoLogic.setMaterialProductos(tipoproducto.getMaterialProductos());
					this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaMaterialProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(MarcaProducto.class)) {
					this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductoLogic.setMarcaProductos(tipoproducto.getMarcaProductos());
					this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaMarcaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SegmentoProducto.class)) {
					this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductoLogic.setSegmentoProductos(tipoproducto.getSegmentoProductos());
					this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaSegmentoProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ColorProducto.class)) {
					this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductoLogic.setColorProductos(tipoproducto.getColorProductos());
					this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaColorProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(EfectoProducto.class)) {
					this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductoLogic.setEfectoProductos(tipoproducto.getEfectoProductos());
					this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEfectoProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(TallaProducto.class)) {
					this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductoLogic.setTallaProductos(tipoproducto.getTallaProductos());
					this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTallaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(tipoproducto.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ClaseProducto.class)) {
					this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductoLogic.setClaseProductos(tipoproducto.getClaseProductos());
					this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaClaseProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(tipoproducto.getProductos());
					this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
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
										
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoproducto,new Object(),generalEntityParameterGeneral,this.tipoproductoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoproductoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoProductoConstantesFunciones.getClassesRelationshipsOfTipoProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoProductoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoProducto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoproducto,new Object(),generalEntityParameterGeneral,this.tipoproductoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoProducto(TipoProductoBean tipoproductoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ModeloProducto.class)) {
					this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductoLogic.setModeloProductos(tipoproducto.getModeloProductos());
					this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaModeloProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(MaterialProducto.class)) {
					this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductoLogic.setMaterialProductos(tipoproducto.getMaterialProductos());
					this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaMaterialProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(MarcaProducto.class)) {
					this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductoLogic.setMarcaProductos(tipoproducto.getMarcaProductos());
					this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaMarcaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SegmentoProducto.class)) {
					this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductoLogic.setSegmentoProductos(tipoproducto.getSegmentoProductos());
					this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaSegmentoProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ColorProducto.class)) {
					this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductoLogic.setColorProductos(tipoproducto.getColorProductos());
					this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaColorProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(EfectoProducto.class)) {
					this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductoLogic.setEfectoProductos(tipoproducto.getEfectoProductos());
					this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEfectoProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(TallaProducto.class)) {
					this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductoLogic.setTallaProductos(tipoproducto.getTallaProductos());
					this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTallaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(tipoproducto.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ClaseProducto.class)) {
					this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductoLogic.setClaseProductos(tipoproducto.getClaseProductos());
					this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaClaseProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productoLogic.setProductos(tipoproducto.getProductos());
					this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoProducto(ArrayList<Classe> classes,TipoProductoReturnGeneral tipoproductoReturnGeneral,TipoProductoBean tipoproductoBean,Boolean conDefault) throws Exception {
		
			this.tipoproductoBean.setModeloProductos(tipoproductoReturnGeneral.getTipoProducto().getModeloProductos());
			this.tipoproductoBean.setMaterialProductos(tipoproductoReturnGeneral.getTipoProducto().getMaterialProductos());
			this.tipoproductoBean.setMarcaProductos(tipoproductoReturnGeneral.getTipoProducto().getMarcaProductos());
			this.tipoproductoBean.setSegmentoProductos(tipoproductoReturnGeneral.getTipoProducto().getSegmentoProductos());
			this.tipoproductoBean.setColorProductos(tipoproductoReturnGeneral.getTipoProducto().getColorProductos());
			this.tipoproductoBean.setEfectoProductos(tipoproductoReturnGeneral.getTipoProducto().getEfectoProductos());
			this.tipoproductoBean.setTallaProductos(tipoproductoReturnGeneral.getTipoProducto().getTallaProductos());
			this.tipoproductoBean.setParametroInventarioDefectos(tipoproductoReturnGeneral.getTipoProducto().getParametroInventarioDefectos());
			this.tipoproductoBean.setClaseProductos(tipoproductoReturnGeneral.getTipoProducto().getClaseProductos());
			this.tipoproductoBean.setProductos(tipoproductoReturnGeneral.getTipoProducto().getProductos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoProducto(TipoProducto tipoproducto,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ModeloProducto.class)) {
					tipoproducto.setModeloProductos(this.jInternalFrameDetalleFormTipoProducto.modeloproductoBeanSwingJInternalFrame.modeloproductoLogic.getModeloProductos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(MaterialProducto.class)) {
					tipoproducto.setMaterialProductos(this.jInternalFrameDetalleFormTipoProducto.materialproductoBeanSwingJInternalFrame.materialproductoLogic.getMaterialProductos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(MarcaProducto.class)) {
					tipoproducto.setMarcaProductos(this.jInternalFrameDetalleFormTipoProducto.marcaproductoBeanSwingJInternalFrame.marcaproductoLogic.getMarcaProductos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SegmentoProducto.class)) {
					tipoproducto.setSegmentoProductos(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoBeanSwingJInternalFrame.segmentoproductoLogic.getSegmentoProductos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ColorProducto.class)) {
					tipoproducto.setColorProductos(this.jInternalFrameDetalleFormTipoProducto.colorproductoBeanSwingJInternalFrame.colorproductoLogic.getColorProductos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(EfectoProducto.class)) {
					tipoproducto.setEfectoProductos(this.jInternalFrameDetalleFormTipoProducto.efectoproductoBeanSwingJInternalFrame.efectoproductoLogic.getEfectoProductos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(TallaProducto.class)) {
					tipoproducto.setTallaProductos(this.jInternalFrameDetalleFormTipoProducto.tallaproductoBeanSwingJInternalFrame.tallaproductoLogic.getTallaProductos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					tipoproducto.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ClaseProducto.class)) {
					tipoproducto.setClaseProductos(this.jInternalFrameDetalleFormTipoProducto.claseproductoBeanSwingJInternalFrame.claseproductoLogic.getClaseProductos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					tipoproducto.setProductos(this.jInternalFrameDetalleFormTipoProducto.productoBeanSwingJInternalFrame.productoLogic.getProductos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoproducto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoProducto = new TipoProductoDetalleFormJInternalFrame(jDesktopPane,this.tipoproductoSessionBean.getConGuardarRelaciones(),this.tipoproductoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoProducto);
		this.jInternalFrameDetalleFormTipoProducto.setVisible(false);
		this.jInternalFrameDetalleFormTipoProducto.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoProducto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoProducto.tipoproductoLogic=this.tipoproductoLogic;
		
		this.cargarCombosFrameForeignKeyTipoProducto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoProducto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoProducto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoProducto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoProducto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoProducto"));
		
		this.jInternalFrameDetalleFormTipoProducto.jButtonModificarTipoProducto.addActionListener(new ButtonActionListener(this,"ModificarTipoProducto"));

		
		this.jInternalFrameDetalleFormTipoProducto.jButtonModificarToolBarTipoProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoProducto"));
					
		this.jInternalFrameDetalleFormTipoProducto.jMenuItemModificarTipoProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoProducto"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProducto.jButtonActualizarTipoProducto.addActionListener (new ButtonActionListener(this,"ActualizarTipoProducto"));
		
		
		this.jInternalFrameDetalleFormTipoProducto.jButtonActualizarToolBarTipoProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoProducto"));
						
		this.jInternalFrameDetalleFormTipoProducto.jMenuItemActualizarTipoProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoProducto"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProducto.jButtonEliminarTipoProducto.addActionListener (new ButtonActionListener(this,"EliminarTipoProducto"));
		
		
		this.jInternalFrameDetalleFormTipoProducto.jButtonEliminarToolBarTipoProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoProducto"));
								
		this.jInternalFrameDetalleFormTipoProducto.jMenuItemEliminarTipoProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoProducto"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProducto.jButtonCancelarTipoProducto.addActionListener (new ButtonActionListener(this,"CancelarTipoProducto"));
		
		
		this.jInternalFrameDetalleFormTipoProducto.jButtonCancelarToolBarTipoProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoProducto"));
					
		this.jInternalFrameDetalleFormTipoProducto.jMenuItemCancelarTipoProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoProducto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoProducto.jMenuItemDetalleCerrarTipoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoProducto"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProducto.jButtonGuardarCambiosToolBarTipoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProducto"));
		
		
		
		this.jInternalFrameDetalleFormTipoProducto.jButtonGuardarCambiosToolBarTipoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProducto"));
		
		
		
		this.jInternalFrameDetalleFormTipoProducto.jComboBoxTiposAccionesFormularioTipoProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoProducto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProducto.jButtonidTipoProductoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoProducto.jButtonid_empresaTipoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProducto.jButtonid_empresaTipoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProducto.jButtoncodigoTipoProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProducto.jButtonnombreTipoProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProducto.jButtondescripcionTipoProductoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoProductoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoProducto.jTabbedPaneRelacionesTipoProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoProducto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoProducto"));
		
		if(this.jInternalFrameDetalleFormTipoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoProducto"));
		}
		
		this.jTableDatosTipoProducto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoProducto"));
		
		this.jTableDatosTipoProducto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoProducto"));
		
		this.jButtonNuevoTipoProducto.addActionListener(new ButtonActionListener(this,"NuevoTipoProducto"));
		
		this.jButtonDuplicarTipoProducto.addActionListener(new ButtonActionListener(this,"DuplicarTipoProducto"));
		
		this.jButtonCopiarTipoProducto.addActionListener(new ButtonActionListener(this,"CopiarTipoProducto"));
		
		this.jButtonVerFormTipoProducto.addActionListener(new ButtonActionListener(this,"VerFormTipoProducto"));
		
		
		this.jButtonNuevoToolBarTipoProducto.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoProducto"));
			
		this.jButtonDuplicarToolBarTipoProducto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoProducto"));
			
		this.jMenuItemNuevoTipoProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoProducto"));
			
		this.jMenuItemDuplicarTipoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoProducto"));		
		
		
		this.jButtonNuevoRelacionesTipoProducto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoProducto"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoProducto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoProducto"));
			
		this.jMenuItemNuevoRelacionesTipoProducto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoProducto"));		
		
		
		if(this.jInternalFrameDetalleFormTipoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProducto.jButtonModificarTipoProducto.addActionListener(new ButtonActionListener(this,"ModificarTipoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProducto.jButtonModificarToolBarTipoProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoProducto"));
			
			this.jInternalFrameDetalleFormTipoProducto.jMenuItemModificarTipoProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProducto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoProducto.jButtonActualizarTipoProducto.addActionListener (new ButtonActionListener(this,"ActualizarTipoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProducto.jButtonActualizarToolBarTipoProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoProducto"));
				
			this.jInternalFrameDetalleFormTipoProducto.jMenuItemActualizarTipoProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProducto.jButtonEliminarTipoProducto.addActionListener (new ButtonActionListener(this,"EliminarTipoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProducto.jButtonEliminarToolBarTipoProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoProducto"));
						
			this.jInternalFrameDetalleFormTipoProducto.jMenuItemEliminarTipoProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProducto.jButtonCancelarTipoProducto.addActionListener (new ButtonActionListener(this,"CancelarTipoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProducto.jButtonCancelarToolBarTipoProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoProducto"));
			
			this.jInternalFrameDetalleFormTipoProducto.jMenuItemCancelarTipoProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoProducto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoProducto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoProducto"));		
		
		
		this.jButtonCerrarTipoProducto.addActionListener (new ButtonActionListener(this,"CerrarTipoProducto"));
		
		
		this.jButtonCerrarToolBarTipoProducto.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoProducto"));
			
		this.jMenuItemCerrarTipoProducto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoProducto"));
			
		if(this.jInternalFrameDetalleFormTipoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProducto.jMenuItemDetalleCerrarTipoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProducto.jButtonGuardarCambiosTipoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProducto.jButtonGuardarCambiosToolBarTipoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProducto"));
		}
		
		this.jButtonCopiarToolBarTipoProducto.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoProducto"));
			
		this.jButtonVerFormToolBarTipoProducto.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoProducto"));
		
		this.jMenuItemGuardarCambiosTipoProducto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoProducto"));
			
		this.jMenuItemCopiarTipoProducto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoProducto"));		
		
		this.jMenuItemVerFormTipoProducto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoProducto"));		
		
		
		this.jButtonGuardarCambiosTablaTipoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoProducto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoProducto"));
			
		this.jMenuItemGuardarCambiosTablaTipoProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoProducto"));		
		
		
		
		this.jButtonRecargarInformacionTipoProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoProducto"));
					
		this.jButtonRecargarInformacionToolBarTipoProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoProducto"));
		
		this.jMenuItemRecargarInformacionTipoProducto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoProducto"));		
		
		
		
		this.jButtonAnterioresTipoProducto.addActionListener (new ButtonActionListener(this,"AnterioresTipoProducto"));
		
		
		this.jButtonAnterioresToolBarTipoProducto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoProducto"));
		
		this.jMenuItemAnterioresTipoProducto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoProducto"));		
		
		
		this.jButtonSiguientesTipoProducto.addActionListener (new ButtonActionListener(this,"SiguientesTipoProducto"));
		
		
		this.jButtonSiguientesToolBarTipoProducto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoProducto"));
			
		this.jMenuItemSiguientesTipoProducto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoProducto"));
			
		this.jMenuItemAbrirOrderByTipoProducto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoProducto"));
			
		this.jMenuItemMostrarOcultarTipoProducto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoProducto"));
			
		this.jMenuItemDetalleAbrirOrderByTipoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoProducto"));
			
		this.jMenuItemDetalleMostarOcultarTipoProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoProducto"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoProducto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoProducto"));
			
		this.jMenuItemNuevoGuardarCambiosTipoProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoProducto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoProducto"));

		this.jCheckBoxSeleccionadosTipoProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoProducto"));
		
		if(this.jInternalFrameDetalleFormTipoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProducto.jComboBoxTiposAccionesFormularioTipoProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoProducto"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoProducto.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoProducto"));
			
		this.jComboBoxTiposAccionesTipoProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoProducto"));
					
		this.jComboBoxTiposSeleccionarTipoProducto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoProducto"));
			
		this.jTextFieldValorCampoGeneralTipoProducto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoProducto"));		
		
		
		if(this.jInternalFrameDetalleFormTipoProducto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProducto.jButtonidTipoProductoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoProducto.jButtonid_empresaTipoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProducto.jButtonid_empresaTipoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProducto.jButtoncodigoTipoProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProducto.jButtonnombreTipoProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProducto.jButtondescripcionTipoProductoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoProductoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoProducto"));

			this.jButtonBusquedaPorNombreTipoProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoProducto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoProducto!=null) {
				this.jInternalFrameReporteDinamicoTipoProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProducto"));
				this.jInternalFrameReporteDinamicoTipoProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProducto"));
				this.jInternalFrameReporteDinamicoTipoProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProducto"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoProducto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProducto"));				
			//this.jButtonGenerarReporteDinamicoTipoProducto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProducto"));
			//this.jButtonGenerarExcelReporteDinamicoTipoProducto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProducto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoProducto!=null) {
				this.jInternalFrameImportacionTipoProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoProducto"));
				this.jInternalFrameImportacionTipoProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoProducto"));
				this.jInternalFrameImportacionTipoProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoProducto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoProducto"));
			
			this.jButtonAbrirOrderByToolBarTipoProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoProducto"));			
			
			if(this.jInternalFrameOrderByTipoProducto!=null) {
				this.jInternalFrameOrderByTipoProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoProducto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoProducto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProducto.jTabbedPaneRelacionesTipoProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoProducto"));
		
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
            		closingInternalFrameTipoProducto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoProducto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoProducto = (JInternalFrameBase)event.getSource();
	            	
	            TipoProductoBeanSwingJInternalFrame jInternalFrameParent=(TipoProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoProducto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoProductoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoProducto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoProducto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoProducto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoProducto";
		inputMap = this.jButtonNuevoTipoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoProductoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoProducto";
		inputMap = this.jButtonNuevoRelacionesTipoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoProductoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoProducto";
		inputMap = this.jButtonModificarTipoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoProducto";
		inputMap = this.jButtonActualizarTipoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoProducto";
		inputMap = this.jButtonEliminarTipoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoProducto";
		inputMap = this.jButtonCancelarTipoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoProducto";
		inputMap = this.jButtonCerrarTipoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoProducto.jButtonGuardarCambiosTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoProducto";
		inputMap = this.jInternalFrameDetalleFormTipoProducto.jButtonGuardarCambiosTipoProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoProducto.jButtonGuardarCambiosTipoProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoProducto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoProductoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProducto.jButtonidTipoProductoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoProducto.jButtonid_empresaTipoProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProducto.jButtonid_empresaTipoProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProducto.jButtoncodigoTipoProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProducto.jButtonnombreTipoProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProducto.jButtondescripcionTipoProductoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoProductoBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoProducto"));

		this.jButtonBusquedaPorNombreTipoProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoProducto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoProductoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoProducto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoProducto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoProducto tipoproductoAux:this.tipoproductoLogic.getTipoProductos()) {
					tipoproductoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProducto tipoproductoAux:tipoproductos) {
					tipoproductoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoProducto tipoproductoAux:this.tipoproductoLogic.getTipoProductos()) {
						tipoproductoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProducto tipoproductoAux:tipoproductos) {
						tipoproductoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoProducto tipoproductoAux:this.tipoproductoLogic.getTipoProductos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProducto tipoproductoAux:tipoproductos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoProducto.getSelectedRows();
			
			TipoProducto tipoproductoLocal=new TipoProducto();
			
			//this.seleccionarTodosTipoProducto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoproductoLocal =(TipoProducto) this.tipoproductoLogic.getTipoProductos().toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoproductoLocal =(TipoProducto) this.tipoproductos.toArray()[this.jTableDatosTipoProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoproductoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoProducto tipoproductoAux:this.tipoproductoLogic.getTipoProductos()) {
						tipoproductoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProducto tipoproductoAux:tipoproductos) {
						tipoproductoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoProducto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoProductoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoProductoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoProductoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoProducto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoProducto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoProducto tipoproductoAux:this.tipoproductoLogic.getTipoProductos()) {
				
						if(sTipoSeleccionar.equals(TipoProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoproductoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoproductoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoProductoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipoproductoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProducto tipoproductoAux:tipoproductos) {
					
						if(sTipoSeleccionar.equals(TipoProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoproductoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoproductoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoProductoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipoproductoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoProductoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoProducto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoProducto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoProducto.jComboBoxTiposAccionesFormularioTipoProducto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoProducto) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoProducto(conSplash);
				
					this.generarReporteTipoProductosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProducto.jComboBoxTiposAccionesFormularioTipoProducto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoProductosSeleccionados();
				//this.jComboBoxTiposAccionesTipoProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoProductosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoProductosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoProducto();
				
				this.exportarTipoProductosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProducto.jComboBoxTiposAccionesFormularioTipoProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoProductos();
				//this.importarTipoProductos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProducto.jComboBoxTiposAccionesFormularioTipoProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoProducto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoProductosSeleccionados();
				//this.jComboBoxTiposAccionesTipoProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoProducto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoProducto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoProducto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Producto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProducto.jComboBoxTiposAccionesFormularioTipoProducto.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoProductoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoProducto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoProducto(conSplash);
					
						//this.actualizarParametrosGeneralTipoProducto();
						
						this.generarReporteProcesoAccionTipoProductosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoProducto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoProducto.jComboBoxTiposAccionesFormularioTipoProducto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoProductoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo ProductoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoProducto();
				
						this.actualizarParametrosGeneralTipoProducto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoproductoReturnGeneral=tipoproductoLogic.procesarAccionTipoProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoproductoLogic.getTipoProductos(),this.tipoproductoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoProducto.jComboBoxTiposAccionesFormularioTipoProducto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoProducto();
					
					TipoProductoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoProducto.jComboBoxTiposAccionesFormularioTipoProducto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoProducto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoProductoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoProducto();
			
			if(this.jInternalFrameDetalleFormTipoProducto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoProducto> tipoproductosSeleccionados=new ArrayList<TipoProducto>();		
			TipoProducto tipoproducto=new TipoProducto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoProducto.getSelectedItem();
			
			
			
			
			tipoproductosSeleccionados=this.getTipoProductosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoproductosSeleccionados.size()==1) {
				for(TipoProducto tipoproductoAux:tipoproductosSeleccionados) {
					tipoproducto=tipoproductoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Modelo Producto")) {
					jButtonModeloProductoActionPerformed(null,rowIndex,true,false,tipoproducto);
				}
				else if(this.sTipoRelacion.equals("Material Producto")) {
					jButtonMaterialProductoActionPerformed(null,rowIndex,true,false,tipoproducto);
				}
				else if(this.sTipoRelacion.equals("Marca Producto")) {
					jButtonMarcaProductoActionPerformed(null,rowIndex,true,false,tipoproducto);
				}
				else if(this.sTipoRelacion.equals("Segmento Producto")) {
					jButtonSegmentoProductoActionPerformed(null,rowIndex,true,false,tipoproducto);
				}
				else if(this.sTipoRelacion.equals("Color Producto")) {
					jButtonColorProductoActionPerformed(null,rowIndex,true,false,tipoproducto);
				}
				else if(this.sTipoRelacion.equals("Efecto Producto")) {
					jButtonEfectoProductoActionPerformed(null,rowIndex,true,false,tipoproducto);
				}
				else if(this.sTipoRelacion.equals("Talla Producto")) {
					jButtonTallaProductoActionPerformed(null,rowIndex,true,false,tipoproducto);
				}
				else if(this.sTipoRelacion.equals("Parametro Inventario Defecto")) {
					jButtonParametroInventarioDefectoActionPerformed(null,rowIndex,true,false,tipoproducto);
				}
				else if(this.sTipoRelacion.equals("Clase Producto")) {
					jButtonClaseProductoActionPerformed(null,rowIndex,true,false,tipoproducto);
				}
				else if(this.sTipoRelacion.equals("Producto")) {
					jButtonProductoActionPerformed(null,rowIndex,true,false,tipoproducto);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoProducto();
			
      		//this.finishProcessTipoProducto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoProductoReturnGeneral() throws Exception {
		if(this.tipoproductoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoproductoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoproductoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoproductoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoproductoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoproductoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoProducto(false);
		}
		
		if(this.tipoproductoReturnGeneral.getConRetornoLista() || this.tipoproductoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoproductoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoproductoLogic.setTipoProductos(this.tipoproductoReturnGeneral.getTipoProductos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoproductoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoproductoLogic.setTipoProducto(this.tipoproductoReturnGeneral.getTipoProducto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoProducto(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoProducto() throws Exception {
		
		
	}
	
	public ArrayList<TipoProducto> getTipoProductosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoProducto> tipoproductosSeleccionados=new ArrayList<TipoProducto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoProducto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoProducto tipoproductoAux:tipoproductoLogic.getTipoProductos()) {
					if(tipoproductoAux.getIsSelected()) {
						tipoproductosSeleccionados.add(tipoproductoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProducto tipoproductoAux:this.tipoproductos) {
					if(tipoproductoAux.getIsSelected()) {
						tipoproductosSeleccionados.add(tipoproductoAux);				
					}
				}
			}
			
			if(tipoproductosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoproductosSeleccionados.addAll(this.tipoproductoLogic.getTipoProductos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoproductosSeleccionados.addAll(this.tipoproductos);				
					}
				}
			}
		} else {
			tipoproductosSeleccionados.add(this.tipoproducto);
		}
		
		return tipoproductosSeleccionados;
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
	
	public void generarReporteTipoProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoProductosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoProductosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoProductosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoProductosSeleccionados() throws Exception {
		ArrayList<TipoProducto> tipoproductosSeleccionados=new ArrayList<TipoProducto>();		
		
		tipoproductosSeleccionados=this.getTipoProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoProductos("Todos",tipoproductosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoProductosSeleccionados() throws Exception {
		ArrayList<TipoProducto> tipoproductosSeleccionados=new ArrayList<TipoProducto>();		
		
		tipoproductosSeleccionados=this.getTipoProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoProductos("Todos",tipoproductosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoProductosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoProducto> tipoproductosSeleccionados=new ArrayList<TipoProducto>();
		
		tipoproductosSeleccionados=this.getTipoProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoProductos("Todos",tipoproductosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoProductosSeleccionados() throws Exception {
		ArrayList<TipoProducto> tipoproductosSeleccionados=new ArrayList<TipoProducto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoProducto();
		
		
		tipoproductosSeleccionados=this.getTipoProductosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoProducto();
		
		
		//this.generarReporteTipoProductos("Todos",tipoproductosSeleccionados ,tipoproductoImplementable,tipoproductoImplementableHome);
	}
	
	public void mostrarImportacionTipoProductos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoProducto();
		
		this.abrirFrameImportacionTipoProducto();		
		
			
		//this.generarReporteTipoProductos("Todos",tipoproductosSeleccionados ,tipoproductoImplementable,tipoproductoImplementableHome);
	}
	
	public void importarTipoProductos() throws Exception {		
	
	}
	
	public void exportarTipoProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoProductosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoProductosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoProductosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoProductosSeleccionados() throws Exception {
		ArrayList<TipoProducto> tipoproductosSeleccionados=new ArrayList<TipoProducto>();		
		
		tipoproductosSeleccionados=this.getTipoProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproducto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoProducto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoProducto tipoproductoAux:tipoproductosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoProducto(tipoproductoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoproductoAux.setsDetalleGeneralEntityReporte(tipoproductoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoProducto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoProductoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProductoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProductoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProductoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProductoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProductoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoProducto(TipoProducto tipoproducto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoproducto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoproducto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoproducto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoproducto.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoproducto.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoproducto.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoProductosSeleccionados() throws Exception {
		ArrayList<TipoProducto> tipoproductosSeleccionados=new ArrayList<TipoProducto>();		
		
		tipoproductosSeleccionados=this.getTipoProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproducto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoProducto(row);				
				iRow++;
			}				
			
			for(TipoProducto tipoproductoAux:tipoproductosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoProducto(tipoproductoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoProductosSeleccionados() throws Exception {
		ArrayList<TipoProducto> tipoproductosSeleccionados=new ArrayList<TipoProducto>();		
		
		tipoproductosSeleccionados=this.getTipoProductosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproducto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoproductos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoproducto");
			//elementRoot.appendChild(element);
		
			for(TipoProducto tipoproductoAux:tipoproductosSeleccionados) {
				element = document.createElement("tipoproducto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoProducto(tipoproductoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoProducto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProductoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProductoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoProductoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProductoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProductoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProductoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoProducto(TipoProducto tipoproducto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoproducto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoproducto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoproducto.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoproducto.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoproducto.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlTipoProducto(TipoProducto tipoproducto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoProductoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoproducto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoProductoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoproducto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoProductoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoproducto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoProductoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoproducto.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoProductoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoproducto.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(TipoProductoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(tipoproducto.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoTipoProductosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoProducto> tipoproductosSeleccionados=new ArrayList<TipoProducto>();
		
		tipoproductosSeleccionados=this.getTipoProductosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoProducto(tipoproductosSeleccionados);
		
		this.generarReporteTipoProductos("Todos",tipoproductosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoProducto(ArrayList<TipoProducto> tipoproductosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoProducto tipoproductoAux:tipoproductosSeleccionados) {
				tipoproductoAux.setsDetalleGeneralEntityReporte(tipoproductoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoProductoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoproductoAux.setsDescripcionGeneralEntityReporte1(tipoproductoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoProductoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoproductoAux.setsDescripcionGeneralEntityReporte1(tipoproductoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoProductoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoproductoAux.setsDescripcionGeneralEntityReporte1(tipoproductoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoProductoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					tipoproductoAux.setsDescripcionGeneralEntityReporte1(tipoproductoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoProducto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoProducto=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoProducto=true;
				this.isVisibilidadCeldaGuardarCambiosTipoProducto=true;
			}
			
			this.isVisibilidadCeldaModificarTipoProducto=false;
			this.isVisibilidadCeldaActualizarTipoProducto=false;
			this.isVisibilidadCeldaEliminarTipoProducto=false;
			this.isVisibilidadCeldaCancelarTipoProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProducto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProducto=false;
			this.isVisibilidadCeldaModificarTipoProducto=false;
			this.isVisibilidadCeldaActualizarTipoProducto=true;
			this.isVisibilidadCeldaEliminarTipoProducto=false;
			this.isVisibilidadCeldaCancelarTipoProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProducto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProducto=false;
			this.isVisibilidadCeldaModificarTipoProducto=false;
			this.isVisibilidadCeldaActualizarTipoProducto=true;
			this.isVisibilidadCeldaEliminarTipoProducto=true;
			this.isVisibilidadCeldaCancelarTipoProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProducto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProducto=false;
			this.isVisibilidadCeldaModificarTipoProducto=false;
			this.isVisibilidadCeldaActualizarTipoProducto=true;
			this.isVisibilidadCeldaEliminarTipoProducto=false;
			this.isVisibilidadCeldaCancelarTipoProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProducto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProducto=true;
			this.isVisibilidadCeldaGuardarCambiosTipoProducto=true;
			this.isVisibilidadCeldaModificarTipoProducto=false;
			this.isVisibilidadCeldaActualizarTipoProducto=false;
			this.isVisibilidadCeldaEliminarTipoProducto=false;
			this.isVisibilidadCeldaCancelarTipoProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProducto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProducto=false;
			this.isVisibilidadCeldaActualizarTipoProducto=false;
			this.isVisibilidadCeldaEliminarTipoProducto=false;
			this.isVisibilidadCeldaCancelarTipoProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProducto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProducto=false;
			this.isVisibilidadCeldaModificarTipoProducto=true;
			this.isVisibilidadCeldaActualizarTipoProducto=false;
			this.isVisibilidadCeldaEliminarTipoProducto=false;
			this.isVisibilidadCeldaCancelarTipoProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProducto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoProductoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProducto=true;
			this.isVisibilidadCeldaGuardarCambiosTipoProducto=true;
		} else {
			this.actualizarEstadoPanelsTipoProducto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoProducto=false;
			//this.isVisibilidadCeldaVerFormTipoProducto=false;
			this.isVisibilidadCeldaDuplicarTipoProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoproductoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoProducto=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoProducto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoproductoSessionBean.getEsGuardarRelacionado()) {
			if(!tipoproductoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoProducto=false;												
			}
			
			this.jButtonCerrarTipoProducto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoProducto=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoproducto)) {
			this.isVisibilidadCeldaActualizarTipoProducto=false;
			this.isVisibilidadCeldaEliminarTipoProducto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoProducto() {
		this.isVisibilidadCeldaNuevoTipoProducto=false;
		this.isVisibilidadCeldaGuardarCambiosTipoProducto=false;
	}
	
	public void actualizarEstadoPanelsTipoProducto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoProducto!=null) {
				this.jScrollPanelDatosEdicionTipoProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProducto!=null) {
				this.jTabbedPaneBusquedasTipoProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProducto!=null) {
				this.jScrollPanelDatosTipoProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProducto!=null) {
				this.jPanelPaginacionTipoProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProducto!=null) {
				this.jPanelParametrosReportesTipoProducto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoProducto!=null) {
				this.jScrollPanelDatosEdicionTipoProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProducto!=null) {
				this.jTabbedPaneBusquedasTipoProducto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoProducto!=null) {
				this.jScrollPanelDatosTipoProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProducto!=null) {
				this.jPanelPaginacionTipoProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProducto!=null) {
				this.jPanelParametrosReportesTipoProducto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoProducto!=null) {
				this.jScrollPanelDatosEdicionTipoProducto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProducto!=null) {
				this.jTabbedPaneBusquedasTipoProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoProducto!=null) {
				this.jScrollPanelDatosTipoProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProducto!=null) {
				this.jPanelPaginacionTipoProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProducto!=null) {
				this.jPanelParametrosReportesTipoProducto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoProducto!=null) {
				this.jScrollPanelDatosEdicionTipoProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProducto!=null) {
				this.jTabbedPaneBusquedasTipoProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoProducto!=null) {
				this.jScrollPanelDatosTipoProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProducto!=null) {
				this.jPanelPaginacionTipoProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProducto!=null) {
				this.jPanelParametrosReportesTipoProducto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoProducto!=null) {
				this.jScrollPanelDatosEdicionTipoProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProducto!=null) {
				this.jTabbedPaneBusquedasTipoProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProducto!=null) {
				this.jScrollPanelDatosTipoProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProducto!=null) {
				this.jPanelPaginacionTipoProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProducto!=null) {
				this.jPanelParametrosReportesTipoProducto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoProducto!=null) {
				this.jScrollPanelDatosEdicionTipoProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProducto!=null) {
				this.jTabbedPaneBusquedasTipoProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProducto!=null) {
				this.jScrollPanelDatosTipoProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProducto!=null) {
				this.jPanelPaginacionTipoProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProducto!=null) {
				this.jPanelParametrosReportesTipoProducto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoProducto!=null) {
				this.jScrollPanelDatosEdicionTipoProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProducto!=null) {
				this.jTabbedPaneBusquedasTipoProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProducto!=null) {
				this.jScrollPanelDatosTipoProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProducto!=null) {
				this.jPanelPaginacionTipoProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProducto!=null) {
				this.jPanelParametrosReportesTipoProducto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoProducto!=null) {
					this.jTabbedPaneBusquedasTipoProducto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoProducto!=null) {
				this.jPanelParametrosReportesTipoProducto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoproductoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProducto!=null) {
				this.jTabbedPaneBusquedasTipoProducto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoProducto!=null) {
				this.jPanelParametrosReportesTipoProducto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoProducto.remove(jPanelBusquedaPorCodigoTipoProducto);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoProducto.remove(jPanelBusquedaPorNombreTipoProducto);}
		}
		
	}
	
	

	public String registrarSesionTipoProductoParaModeloProductos() throws Exception {
		Boolean isPaginaPopupModeloProducto=false;

		try {

			if(this.tipoproductoSessionBean==null) {
				this.tipoproductoSessionBean=new TipoProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoProducto.modeloproductoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoProducto.modeloproductoSessionBean=new ModeloProductoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoProducto.modeloproductoSessionBean.setsPathNavegacionActual(tipoproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ModeloProductoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoProducto.modeloproductoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupModeloProducto=this.jInternalFrameDetalleFormTipoProducto.modeloproductoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoProducto.modeloproductoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeModeloProducto(true);
			this.jInternalFrameDetalleFormTipoProducto.modeloproductoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeModeloProducto(TipoProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoProducto.modeloproductoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProducto(true);
			this.jInternalFrameDetalleFormTipoProducto.modeloproductoSessionBean.setlidTipoProductoActual(this.idTipoProductoActual);

			tipoproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoProducto(true);
			tipoproductoSessionBean.setlIdTipoProductoActualForeignKey(this.idTipoProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoProductoParaMaterialProductos() throws Exception {
		Boolean isPaginaPopupMaterialProducto=false;

		try {

			if(this.tipoproductoSessionBean==null) {
				this.tipoproductoSessionBean=new TipoProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoProducto.materialproductoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoProducto.materialproductoSessionBean=new MaterialProductoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoProducto.materialproductoSessionBean.setsPathNavegacionActual(tipoproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+MaterialProductoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoProducto.materialproductoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupMaterialProducto=this.jInternalFrameDetalleFormTipoProducto.materialproductoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoProducto.materialproductoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeMaterialProducto(true);
			this.jInternalFrameDetalleFormTipoProducto.materialproductoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeMaterialProducto(TipoProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoProducto.materialproductoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProducto(true);
			this.jInternalFrameDetalleFormTipoProducto.materialproductoSessionBean.setlidTipoProductoActual(this.idTipoProductoActual);

			tipoproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoProducto(true);
			tipoproductoSessionBean.setlIdTipoProductoActualForeignKey(this.idTipoProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoProductoParaMarcaProductos() throws Exception {
		Boolean isPaginaPopupMarcaProducto=false;

		try {

			if(this.tipoproductoSessionBean==null) {
				this.tipoproductoSessionBean=new TipoProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoProducto.marcaproductoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoProducto.marcaproductoSessionBean=new MarcaProductoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoProducto.marcaproductoSessionBean.setsPathNavegacionActual(tipoproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+MarcaProductoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoProducto.marcaproductoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupMarcaProducto=this.jInternalFrameDetalleFormTipoProducto.marcaproductoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoProducto.marcaproductoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeMarcaProducto(true);
			this.jInternalFrameDetalleFormTipoProducto.marcaproductoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeMarcaProducto(TipoProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoProducto.marcaproductoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProducto(true);
			this.jInternalFrameDetalleFormTipoProducto.marcaproductoSessionBean.setlidTipoProductoActual(this.idTipoProductoActual);

			tipoproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoProducto(true);
			tipoproductoSessionBean.setlIdTipoProductoActualForeignKey(this.idTipoProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoProductoParaSegmentoProductos() throws Exception {
		Boolean isPaginaPopupSegmentoProducto=false;

		try {

			if(this.tipoproductoSessionBean==null) {
				this.tipoproductoSessionBean=new TipoProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoProducto.segmentoproductoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoProducto.segmentoproductoSessionBean=new SegmentoProductoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoProducto.segmentoproductoSessionBean.setsPathNavegacionActual(tipoproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+SegmentoProductoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoProducto.segmentoproductoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupSegmentoProducto=this.jInternalFrameDetalleFormTipoProducto.segmentoproductoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoProducto.segmentoproductoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeSegmentoProducto(true);
			this.jInternalFrameDetalleFormTipoProducto.segmentoproductoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeSegmentoProducto(TipoProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoProducto.segmentoproductoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProducto(true);
			this.jInternalFrameDetalleFormTipoProducto.segmentoproductoSessionBean.setlidTipoProductoActual(this.idTipoProductoActual);

			tipoproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoProducto(true);
			tipoproductoSessionBean.setlIdTipoProductoActualForeignKey(this.idTipoProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoProductoParaColorProductoes() throws Exception {
		Boolean isPaginaPopupColorProducto=false;

		try {

			if(this.tipoproductoSessionBean==null) {
				this.tipoproductoSessionBean=new TipoProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoProducto.colorproductoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoProducto.colorproductoSessionBean=new ColorProductoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoProducto.colorproductoSessionBean.setsPathNavegacionActual(tipoproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ColorProductoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoProducto.colorproductoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupColorProducto=this.jInternalFrameDetalleFormTipoProducto.colorproductoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoProducto.colorproductoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeColorProducto(true);
			this.jInternalFrameDetalleFormTipoProducto.colorproductoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeColorProducto(TipoProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoProducto.colorproductoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProducto(true);
			this.jInternalFrameDetalleFormTipoProducto.colorproductoSessionBean.setlidTipoProductoActual(this.idTipoProductoActual);

			tipoproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoProducto(true);
			tipoproductoSessionBean.setlIdTipoProductoActualForeignKey(this.idTipoProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoProductoParaEfectoProductos() throws Exception {
		Boolean isPaginaPopupEfectoProducto=false;

		try {

			if(this.tipoproductoSessionBean==null) {
				this.tipoproductoSessionBean=new TipoProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoProducto.efectoproductoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoProducto.efectoproductoSessionBean=new EfectoProductoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoProducto.efectoproductoSessionBean.setsPathNavegacionActual(tipoproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EfectoProductoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoProducto.efectoproductoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupEfectoProducto=this.jInternalFrameDetalleFormTipoProducto.efectoproductoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoProducto.efectoproductoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEfectoProducto(true);
			this.jInternalFrameDetalleFormTipoProducto.efectoproductoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEfectoProducto(TipoProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoProducto.efectoproductoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProducto(true);
			this.jInternalFrameDetalleFormTipoProducto.efectoproductoSessionBean.setlidTipoProductoActual(this.idTipoProductoActual);

			tipoproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoProducto(true);
			tipoproductoSessionBean.setlIdTipoProductoActualForeignKey(this.idTipoProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoProductoParaTallaProductos() throws Exception {
		Boolean isPaginaPopupTallaProducto=false;

		try {

			if(this.tipoproductoSessionBean==null) {
				this.tipoproductoSessionBean=new TipoProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoProducto.tallaproductoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoProducto.tallaproductoSessionBean=new TallaProductoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoProducto.tallaproductoSessionBean.setsPathNavegacionActual(tipoproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+TallaProductoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoProducto.tallaproductoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupTallaProducto=this.jInternalFrameDetalleFormTipoProducto.tallaproductoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoProducto.tallaproductoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeTallaProducto(true);
			this.jInternalFrameDetalleFormTipoProducto.tallaproductoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeTallaProducto(TipoProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoProducto.tallaproductoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProducto(true);
			this.jInternalFrameDetalleFormTipoProducto.tallaproductoSessionBean.setlidTipoProductoActual(this.idTipoProductoActual);

			tipoproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoProducto(true);
			tipoproductoSessionBean.setlIdTipoProductoActualForeignKey(this.idTipoProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoProductoParaParametroInventarioDefectos() throws Exception {
		Boolean isPaginaPopupParametroInventarioDefecto=false;

		try {

			if(this.tipoproductoSessionBean==null) {
				this.tipoproductoSessionBean=new TipoProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoSessionBean.setsPathNavegacionActual(tipoproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroInventarioDefecto=this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(true);
			this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(TipoProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProducto(true);
			this.jInternalFrameDetalleFormTipoProducto.parametroinventariodefectoSessionBean.setlidTipoProductoActual(this.idTipoProductoActual);

			tipoproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoProducto(true);
			tipoproductoSessionBean.setlIdTipoProductoActualForeignKey(this.idTipoProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoProductoParaClaseProductos() throws Exception {
		Boolean isPaginaPopupClaseProducto=false;

		try {

			if(this.tipoproductoSessionBean==null) {
				this.tipoproductoSessionBean=new TipoProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoProducto.claseproductoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoProducto.claseproductoSessionBean=new ClaseProductoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoProducto.claseproductoSessionBean.setsPathNavegacionActual(tipoproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClaseProductoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoProducto.claseproductoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupClaseProducto=this.jInternalFrameDetalleFormTipoProducto.claseproductoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoProducto.claseproductoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeClaseProducto(true);
			this.jInternalFrameDetalleFormTipoProducto.claseproductoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeClaseProducto(TipoProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoProducto.claseproductoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProducto(true);
			this.jInternalFrameDetalleFormTipoProducto.claseproductoSessionBean.setlidTipoProductoActual(this.idTipoProductoActual);

			tipoproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoProducto(true);
			tipoproductoSessionBean.setlIdTipoProductoActualForeignKey(this.idTipoProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoProductoParaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(this.tipoproductoSessionBean==null) {
				this.tipoproductoSessionBean=new TipoProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoProducto.productoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoProducto.productoSessionBean=new ProductoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoProducto.productoSessionBean.setsPathNavegacionActual(tipoproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoProducto.productoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProducto=this.jInternalFrameDetalleFormTipoProducto.productoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoProducto.productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			this.jInternalFrameDetalleFormTipoProducto.productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(TipoProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoProducto.productoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProducto(true);
			this.jInternalFrameDetalleFormTipoProducto.productoSessionBean.setlidTipoProductoActual(this.idTipoProductoActual);

			tipoproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoProducto(true);
			tipoproductoSessionBean.setlIdTipoProductoActualForeignKey(this.idTipoProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoProductoSessionBean tipoproductoSessionBean=new TipoProductoSessionBean();
		
		if(this.tipoproductoSessionBean==null) {
			this.tipoproductoSessionBean=new TipoProductoSessionBean();
		}
		
		this.tipoproductoSessionBean.setsUltimaBusquedaTipoProducto(this.getsAccionBusqueda());
		this.tipoproductoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoproductoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tipoproductoSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipoproductoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoproductoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoProductoSessionBean tipoproductoSessionBean=new TipoProductoSessionBean();
		
		if(this.tipoproductoSessionBean==null) {
			this.tipoproductoSessionBean=new TipoProductoSessionBean();
		}
		
		if(this.tipoproductoSessionBean.getsUltimaBusquedaTipoProducto()!=null&&!this.tipoproductoSessionBean.getsUltimaBusquedaTipoProducto().equals("")) {
			this.setsAccionBusqueda(tipoproductoSessionBean.getsUltimaBusquedaTipoProducto());
			this.setiNumeroPaginacion(tipoproductoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoproductoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tipoproductoSessionBean.getcodigo());
				tipoproductoSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipoproductoSessionBean.getnombre());
				tipoproductoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoproductoSessionBean.getid_empresa());
				tipoproductoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoproductoSessionBean.setsUltimaBusquedaTipoProducto("");
		this.tipoproductoSessionBean.setiNumeroPaginacion(TipoProductoConstantesFunciones.INUMEROPAGINACION);
		this.tipoproductoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoProducto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoProducto() {
		this.updateBorderResaltarBusquedasFormularioTipoProducto();
		this.updateVisibilidadBusquedasFormularioTipoProducto();
		this.updateHabilitarBusquedasFormularioTipoProducto();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoProducto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoProducto.getComponents().length>0) {
	

		if(this.tipoproductoConstantesFunciones.resaltarBusquedaPorCodigoTipoProducto!=null) {
			index= this.jTabbedPaneBusquedasTipoProducto.indexOfComponent(this.jPanelBusquedaPorCodigoTipoProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoProducto.getComponent(index);
				jPanel.setBorder(this.tipoproductoConstantesFunciones.resaltarBusquedaPorCodigoTipoProducto);
			}
		}

		if(this.tipoproductoConstantesFunciones.resaltarBusquedaPorNombreTipoProducto!=null) {
			index= this.jTabbedPaneBusquedasTipoProducto.indexOfComponent(this.jPanelBusquedaPorNombreTipoProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoProducto.getComponent(index);
				jPanel.setBorder(this.tipoproductoConstantesFunciones.resaltarBusquedaPorNombreTipoProducto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoProducto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoProducto.indexOfComponent(this.jPanelBusquedaPorCodigoTipoProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoproductoConstantesFunciones.mostrarBusquedaPorCodigoTipoProducto);
			if(!this.tipoproductoConstantesFunciones.mostrarBusquedaPorCodigoTipoProducto && index>-1) {
				this.jTabbedPaneBusquedasTipoProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoProducto.indexOfComponent(this.jPanelBusquedaPorNombreTipoProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoproductoConstantesFunciones.mostrarBusquedaPorNombreTipoProducto);
			if(!this.tipoproductoConstantesFunciones.mostrarBusquedaPorNombreTipoProducto && index>-1) {
				this.jTabbedPaneBusquedasTipoProducto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoProducto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoProducto.indexOfComponent(this.jPanelBusquedaPorCodigoTipoProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoproductoConstantesFunciones.activarBusquedaPorCodigoTipoProducto);
				this.jTabbedPaneBusquedasTipoProducto.setEnabledAt(index,this.tipoproductoConstantesFunciones.activarBusquedaPorCodigoTipoProducto);
			}

			index= this.jTabbedPaneBusquedasTipoProducto.indexOfComponent(this.jPanelBusquedaPorNombreTipoProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoproductoConstantesFunciones.activarBusquedaPorNombreTipoProducto);
				this.jTabbedPaneBusquedasTipoProducto.setEnabledAt(index,this.tipoproductoConstantesFunciones.activarBusquedaPorNombreTipoProducto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoProducto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoProducto.indexOfComponent(this.jPanelBusquedaPorCodigoTipoProducto);

			this.jTabbedPaneBusquedasTipoProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoProducto.getComponent(index);

			this.tipoproductoConstantesFunciones.setResaltarBusquedaPorCodigoTipoProducto(resaltar);

			jPanel.setBorder(this.tipoproductoConstantesFunciones.resaltarBusquedaPorCodigoTipoProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoProducto.indexOfComponent(this.jPanelBusquedaPorNombreTipoProducto);

			this.jTabbedPaneBusquedasTipoProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoProducto.getComponent(index);

			this.tipoproductoConstantesFunciones.setResaltarBusquedaPorNombreTipoProducto(resaltar);

			jPanel.setBorder(this.tipoproductoConstantesFunciones.resaltarBusquedaPorNombreTipoProducto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoProducto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoProducto() throws Exception {

		if(this.jInternalFrameDetalleFormTipoProducto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoProducto();
		this.updateVisibilidadResaltarControlesFormularioTipoProducto();
		this.updateHabilitarResaltarControlesFormularioTipoProducto();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoProducto() throws Exception {
		if(this.jInternalFrameDetalleFormTipoProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoproductoConstantesFunciones.resaltaridTipoProducto!=null && this.jInternalFrameDetalleFormTipoProducto!=null) {this.jInternalFrameDetalleFormTipoProducto.jLabelidTipoProducto.setBorder(this.tipoproductoConstantesFunciones.resaltaridTipoProducto);}
		if(this.tipoproductoConstantesFunciones.resaltarid_empresaTipoProducto!=null && this.jInternalFrameDetalleFormTipoProducto!=null) {this.jInternalFrameDetalleFormTipoProducto.jComboBoxid_empresaTipoProducto.setBorder(this.tipoproductoConstantesFunciones.resaltarid_empresaTipoProducto);}
		if(this.tipoproductoConstantesFunciones.resaltarcodigoTipoProducto!=null && this.jInternalFrameDetalleFormTipoProducto!=null) {this.jInternalFrameDetalleFormTipoProducto.jTextFieldcodigoTipoProducto.setBorder(this.tipoproductoConstantesFunciones.resaltarcodigoTipoProducto);}
		if(this.tipoproductoConstantesFunciones.resaltarnombreTipoProducto!=null && this.jInternalFrameDetalleFormTipoProducto!=null) {this.jInternalFrameDetalleFormTipoProducto.jTextAreanombreTipoProducto.setBorder(this.tipoproductoConstantesFunciones.resaltarnombreTipoProducto);}
		if(this.tipoproductoConstantesFunciones.resaltardescripcionTipoProducto!=null && this.jInternalFrameDetalleFormTipoProducto!=null) {this.jInternalFrameDetalleFormTipoProducto.jTextAreadescripcionTipoProducto.setBorder(this.tipoproductoConstantesFunciones.resaltardescripcionTipoProducto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoProducto() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoProducto!=null) {
	
		//this.jInternalFrameDetalleFormTipoProducto.jLabelidTipoProducto.setVisible(this.tipoproductoConstantesFunciones.mostraridTipoProducto);
		this.jInternalFrameDetalleFormTipoProducto.jPanelidTipoProducto.setVisible(this.tipoproductoConstantesFunciones.mostraridTipoProducto);
		//this.jInternalFrameDetalleFormTipoProducto.jComboBoxid_empresaTipoProducto.setVisible(this.tipoproductoConstantesFunciones.mostrarid_empresaTipoProducto);
		this.jInternalFrameDetalleFormTipoProducto.jPanelid_empresaTipoProducto.setVisible(this.tipoproductoConstantesFunciones.mostrarid_empresaTipoProducto);
		//this.jInternalFrameDetalleFormTipoProducto.jTextFieldcodigoTipoProducto.setVisible(this.tipoproductoConstantesFunciones.mostrarcodigoTipoProducto);
		this.jInternalFrameDetalleFormTipoProducto.jPanelcodigoTipoProducto.setVisible(this.tipoproductoConstantesFunciones.mostrarcodigoTipoProducto);
		//this.jInternalFrameDetalleFormTipoProducto.jTextAreanombreTipoProducto.setVisible(this.tipoproductoConstantesFunciones.mostrarnombreTipoProducto);
		this.jInternalFrameDetalleFormTipoProducto.jPanelnombreTipoProducto.setVisible(this.tipoproductoConstantesFunciones.mostrarnombreTipoProducto);
		//this.jInternalFrameDetalleFormTipoProducto.jTextAreadescripcionTipoProducto.setVisible(this.tipoproductoConstantesFunciones.mostrardescripcionTipoProducto);
		this.jInternalFrameDetalleFormTipoProducto.jPaneldescripcionTipoProducto.setVisible(this.tipoproductoConstantesFunciones.mostrardescripcionTipoProducto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoProducto() throws Exception {
		if(this.jInternalFrameDetalleFormTipoProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoProducto!=null) {
	
		this.jInternalFrameDetalleFormTipoProducto.jLabelidTipoProducto.setEnabled(this.tipoproductoConstantesFunciones.activaridTipoProducto);
		this.jInternalFrameDetalleFormTipoProducto.jComboBoxid_empresaTipoProducto.setEnabled(this.tipoproductoConstantesFunciones.activarid_empresaTipoProducto);
		this.jInternalFrameDetalleFormTipoProducto.jTextFieldcodigoTipoProducto.setEnabled(this.tipoproductoConstantesFunciones.activarcodigoTipoProducto);
		this.jInternalFrameDetalleFormTipoProducto.jTextAreanombreTipoProducto.setEnabled(this.tipoproductoConstantesFunciones.activarnombreTipoProducto);
		this.jInternalFrameDetalleFormTipoProducto.jTextAreadescripcionTipoProducto.setEnabled(this.tipoproductoConstantesFunciones.activardescripcionTipoProducto);
		}
	}
	
		
}