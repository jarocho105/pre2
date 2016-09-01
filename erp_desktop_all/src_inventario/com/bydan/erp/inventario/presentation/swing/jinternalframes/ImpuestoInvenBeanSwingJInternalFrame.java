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

import com.bydan.erp.inventario.util.ImpuestoInvenConstantesFunciones;
import com.bydan.erp.inventario.util.ImpuestoInvenParameterReturnGeneral;
//import com.bydan.erp.inventario.util.ImpuestoInvenParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.ImpuestoInvenBean;
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

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ImpuestoInvenBeanSwingJInternalFrame extends ImpuestoInvenJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ImpuestoInvenBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ImpuestoInven> impuestoinvenValidator = new ClassValidator<ImpuestoInven>(ImpuestoInven.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ImpuestoInven impuestoinven;	
	public ImpuestoInven impuestoinvenAux;
	public ImpuestoInven impuestoinvenAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ImpuestoInven impuestoinvenTotales;
	public Long idImpuestoInvenActual;
	public Long iIdNuevoImpuestoInven=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosProductoImpuesto=false;

	public Boolean getIsTienePermisosProductoImpuesto() {
		return isTienePermisosProductoImpuesto;
	}

	public void setIsTienePermisosProductoImpuesto(Boolean isTienePermisosProductoImpuesto) {
		this.isTienePermisosProductoImpuesto= isTienePermisosProductoImpuesto;
	}


	public Boolean isTienePermisosDetalleImpuestoInven=false;

	public Boolean getIsTienePermisosDetalleImpuestoInven() {
		return isTienePermisosDetalleImpuestoInven;
	}

	public void setIsTienePermisosDetalleImpuestoInven(Boolean isTienePermisosDetalleImpuestoInven) {
		this.isTienePermisosDetalleImpuestoInven= isTienePermisosDetalleImpuestoInven;
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
	
	public Boolean isPermisoTodoImpuestoInven;
	public Boolean isPermisoNuevoImpuestoInven;
	public Boolean isPermisoActualizarImpuestoInven;
	public Boolean isPermisoActualizarOriginalImpuestoInven;
	public Boolean isPermisoEliminarImpuestoInven;
	public Boolean isPermisoGuardarCambiosImpuestoInven;
	public Boolean isPermisoConsultaImpuestoInven;
	public Boolean isPermisoBusquedaImpuestoInven;
	public Boolean isPermisoReporteImpuestoInven;
	public Boolean isPermisoPaginacionMedioImpuestoInven;
	public Boolean isPermisoPaginacionAltoImpuestoInven;
	public Boolean isPermisoPaginacionTodoImpuestoInven;
	public Boolean isPermisoCopiarImpuestoInven;
	public Boolean isPermisoVerFormImpuestoInven;
	public Boolean isPermisoDuplicarImpuestoInven;
	public Boolean isPermisoOrdenImpuestoInven;
	
	
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
	
	public ImpuestoInvenParameterReturnGeneral impuestoinvenReturnGeneral;
	public ImpuestoInvenParameterReturnGeneral impuestoinvenParameterGeneral;
	
	

	public ProductoImpuestoLogic productoimpuestoLogic=null;

	public ProductoImpuestoLogic getProductoImpuestoLogic() {
		return productoimpuestoLogic;
	}

	public void setProductoImpuestoLogic(ProductoImpuestoLogic productoimpuestoLogic) {
		this.productoimpuestoLogic = productoimpuestoLogic;
	}


	public DetalleImpuestoInvenLogic detalleimpuestoinvenLogic=null;

	public DetalleImpuestoInvenLogic getDetalleImpuestoInvenLogic() {
		return detalleimpuestoinvenLogic;
	}

	public void setDetalleImpuestoInvenLogic(DetalleImpuestoInvenLogic detalleimpuestoinvenLogic) {
		this.detalleimpuestoinvenLogic = detalleimpuestoinvenLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoImpuestoInven=false;
	public Boolean esParaAccionDesdeFormularioImpuestoInven=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ImpuestoInvenSessionBeanAdditional impuestoinvenSessionBeanAdditional=null;
	
	public ImpuestoInvenSessionBeanAdditional getImpuestoInvenSessionBeanAdditional() {
		return this.impuestoinvenSessionBeanAdditional;
	}
	
	public void setImpuestoInvenSessionBeanAdditional(ImpuestoInvenSessionBeanAdditional impuestoinvenSessionBeanAdditional) {
		try {
			this.impuestoinvenSessionBeanAdditional=impuestoinvenSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ImpuestoInvenBeanSwingJInternalFrameAdditional impuestoinvenBeanSwingJInternalFrameAdditional=null;
	//public class ImpuestoInvenBeanSwingJInternalFrame
	
	public ImpuestoInvenBeanSwingJInternalFrameAdditional getImpuestoInvenBeanSwingJInternalFrameAdditional() {
		return this.impuestoinvenBeanSwingJInternalFrameAdditional;
	}
	
	public void setImpuestoInvenBeanSwingJInternalFrameAdditional(ImpuestoInvenBeanSwingJInternalFrameAdditional impuestoinvenBeanSwingJInternalFrameAdditional) {
		try {
			this.impuestoinvenBeanSwingJInternalFrameAdditional=impuestoinvenBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ImpuestoInvenLogic impuestoinvenLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ImpuestoInven impuestoinvenBean;
	public ImpuestoInvenConstantesFunciones impuestoinvenConstantesFunciones;
	//public ImpuestoInvenParameterReturnGeneral impuestoinvenReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<ImpuestoInven> impuestoinvens;	
	//public List<ImpuestoInven> impuestoinvensEliminados;
	//public List<ImpuestoInven> impuestoinvensAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoImpuestoInven=false;
	public Boolean isVisibilidadCeldaDuplicarImpuestoInven=true;
	public Boolean isVisibilidadCeldaCopiarImpuestoInven=true;
	public Boolean isVisibilidadCeldaVerFormImpuestoInven=true;
	public Boolean isVisibilidadCeldaOrdenImpuestoInven=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesImpuestoInven=false;
	public Boolean isVisibilidadCeldaModificarImpuestoInven=false;
	public Boolean isVisibilidadCeldaActualizarImpuestoInven=false;
	public Boolean isVisibilidadCeldaEliminarImpuestoInven=false;
	public Boolean isVisibilidadCeldaCancelarImpuestoInven=false;
	public Boolean isVisibilidadCeldaGuardarImpuestoInven=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosImpuestoInven=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoImpuestoInven() {
		return this.iIdNuevoImpuestoInven;
	}

	public void setiIdNuevoImpuestoInven(Long iIdNuevoImpuestoInven) {
		this.iIdNuevoImpuestoInven = iIdNuevoImpuestoInven;
	}
	
	public Long getidImpuestoInvenActual() {
		return this.idImpuestoInvenActual;
	}

	public void setidImpuestoInvenActual(Long idImpuestoInvenActual) {
		this.idImpuestoInvenActual = idImpuestoInvenActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ImpuestoInven getimpuestoinven() {
		return this.impuestoinven;
	}

	public void setimpuestoinven(ImpuestoInven impuestoinven) {
		this.impuestoinven = impuestoinven;
	}
	
	public ImpuestoInven getimpuestoinvenAux() {
		return this.impuestoinvenAux;
	}

	public void setimpuestoinvenAux(ImpuestoInven impuestoinvenAux) {
		this.impuestoinvenAux = impuestoinvenAux;
	}				
	
	public ImpuestoInven getimpuestoinvenAnterior() {
		return this.impuestoinvenAnterior;
	}

	public void setimpuestoinvenAnterior(ImpuestoInven impuestoinvenAnterior) {
		this.impuestoinvenAnterior = impuestoinvenAnterior;
	}	
	
	public ImpuestoInven getimpuestoinvenTotales() {
		return this.impuestoinvenTotales;
	}

	public void setimpuestoinvenTotales(ImpuestoInven impuestoinvenTotales) {
		this.impuestoinvenTotales = impuestoinvenTotales;
	}	
	
	public ImpuestoInven getimpuestoinvenBean() {
		return this.impuestoinvenBean;
	}

	public void setimpuestoinvenBean(ImpuestoInven impuestoinvenBean) {
		this.impuestoinvenBean = impuestoinvenBean;
	}	
	
	public ImpuestoInvenParameterReturnGeneral getimpuestoinvenReturnGeneral() {
		return this.impuestoinvenReturnGeneral;
	}

	public void setimpuestoinvenReturnGeneral(ImpuestoInvenParameterReturnGeneral impuestoinvenReturnGeneral) {
		this.impuestoinvenReturnGeneral = impuestoinvenReturnGeneral;
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
	
	
	public ImpuestoInvenLogic getImpuestoInvenLogic()	{		
		return impuestoinvenLogic;
	}

	public void setImpuestoInvenLogic(ImpuestoInvenLogic impuestoinvenLogic) {
		this.impuestoinvenLogic = impuestoinvenLogic;
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
	
	public Boolean getIsEsNuevoImpuestoInven() {
		return isEsNuevoImpuestoInven;
	}

	public void setIsEsNuevoImpuestoInven(Boolean isEsNuevoImpuestoInven) {
		this.isEsNuevoImpuestoInven = isEsNuevoImpuestoInven;
	}

	public Boolean getEsParaAccionDesdeFormularioImpuestoInven() {
		return esParaAccionDesdeFormularioImpuestoInven;
	}
	
	public void setEsParaAccionDesdeFormularioImpuestoInven(Boolean esParaAccionDesdeFormularioImpuestoInven) {
		this.esParaAccionDesdeFormularioImpuestoInven = esParaAccionDesdeFormularioImpuestoInven;
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

			if(this.impuestoinvenSessionBean==null) {
				this.impuestoinvenSessionBean=new ImpuestoInvenSessionBean();
			}

			if(!this.impuestoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(impuestoinvenSessionBean.getlidEmpresaActual());
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

					if(this.impuestoinven!=null) {
						this.impuestoinven.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormImpuestoInven!=null) {
						this.jInternalFrameDetalleFormImpuestoInven.jComboBoxid_empresaImpuestoInven.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaImpuestoInven.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormImpuestoInven!=null) {
						if(this.jInternalFrameDetalleFormImpuestoInven.jComboBoxid_empresaImpuestoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormImpuestoInven.jComboBoxid_empresaImpuestoInven.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaImpuestoInvenGenerico)throws Exception
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
				jComboBoxid_empresaImpuestoInvenGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaImpuestoInvenGenerico!=null && jComboBoxid_empresaImpuestoInvenGenerico.getItemCount()>0) {
					jComboBoxid_empresaImpuestoInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ImpuestoInven impuestoinven,JComboBox jComboBoxid_empresaImpuestoInvenGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaImpuestoInvenGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormImpuestoInven.jComboBoxid_empresaImpuestoInven.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaImpuestoInvenGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				impuestoinven.setid_empresa(empresaAux.getId());
				impuestoinven.setempresa_descripcion(ImpuestoInvenConstantesFunciones.getEmpresaDescripcion(empresaAux));
				impuestoinven.setEmpresa(empresaAux);			}
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

					if(!ImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormImpuestoInven!=null) { 
							this.jInternalFrameDetalleFormImpuestoInven.jComboBoxid_empresaImpuestoInven.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormImpuestoInven.jComboBoxid_empresaImpuestoInven.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormImpuestoInven!=null) { 
					}

					if(!ImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormImpuestoInven!=null) {
							this.jInternalFrameDetalleFormImpuestoInven.jComboBoxid_empresaImpuestoInven.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormImpuestoInven!=null) {
							this.jInternalFrameDetalleFormImpuestoInven.jComboBoxid_empresaImpuestoInven.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesImpuestoInven() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ImpuestoInvenConstantesFunciones.refrescarForeignKeysDescripcionesImpuestoInven(this.impuestoinvenLogic.getImpuestoInvens());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ImpuestoInvenConstantesFunciones.refrescarForeignKeysDescripcionesImpuestoInven(this.impuestoinvens);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//impuestoinvenLogic.setImpuestoInvens(this.impuestoinvens);
			impuestoinvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ImpuestoInvenParameterReturnGeneral getImpuestoInvenParameterGeneral() {
		return this.impuestoinvenParameterGeneral;
	}
	
	public void setImpuestoInvenParameterGeneral(ImpuestoInvenParameterReturnGeneral impuestoinvenParameterGeneral) {
		this.impuestoinvenParameterGeneral = impuestoinvenParameterGeneral;
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
	
	public Boolean getIsPermisoTodoImpuestoInven() {
		return isPermisoTodoImpuestoInven;
	}

	public void setIsPermisoTodoImpuestoInven(Boolean isPermisoTodoImpuestoInven) {
		this.isPermisoTodoImpuestoInven = isPermisoTodoImpuestoInven;
	}

	public Boolean getIsPermisoNuevoImpuestoInven() {
		return isPermisoNuevoImpuestoInven;
	}

	public void setIsPermisoNuevoImpuestoInven(Boolean isPermisoNuevoImpuestoInven) {
		this.isPermisoNuevoImpuestoInven = isPermisoNuevoImpuestoInven;
	}

	public Boolean getIsPermisoActualizarImpuestoInven() {
		return isPermisoActualizarImpuestoInven;
	}

	public void setIsPermisoActualizarImpuestoInven(Boolean isPermisoActualizarImpuestoInven) {
		this.isPermisoActualizarImpuestoInven = isPermisoActualizarImpuestoInven;
	}

	public Boolean getIsPermisoEliminarImpuestoInven() {
		return isPermisoEliminarImpuestoInven;
	}

	public void setIsPermisoEliminarImpuestoInven(Boolean isPermisoEliminarImpuestoInven) {
		this.isPermisoEliminarImpuestoInven = isPermisoEliminarImpuestoInven;
	}

	public Boolean getIsPermisoGuardarCambiosImpuestoInven() {
		return isPermisoGuardarCambiosImpuestoInven;
	}

	public void setIsPermisoGuardarCambiosImpuestoInven(Boolean isPermisoGuardarCambiosImpuestoInven) {
		this.isPermisoGuardarCambiosImpuestoInven = isPermisoGuardarCambiosImpuestoInven;
	}
	
	public Boolean getIsPermisoConsultaImpuestoInven() {
		return isPermisoConsultaImpuestoInven;
	}

	public void setIsPermisoConsultaImpuestoInven(Boolean isPermisoConsultaImpuestoInven) {
		this.isPermisoConsultaImpuestoInven = isPermisoConsultaImpuestoInven;
	}

	public Boolean getIsPermisoBusquedaImpuestoInven() {
		return isPermisoBusquedaImpuestoInven;
	}

	public void setIsPermisoBusquedaImpuestoInven(Boolean isPermisoBusquedaImpuestoInven) {
		this.isPermisoBusquedaImpuestoInven = isPermisoBusquedaImpuestoInven;
	}

	public Boolean getIsPermisoReporteImpuestoInven() {
		return isPermisoReporteImpuestoInven;
	}

	public void setIsPermisoReporteImpuestoInven(Boolean isPermisoReporteImpuestoInven) {
		this.isPermisoReporteImpuestoInven = isPermisoReporteImpuestoInven;
	}
	
	public Boolean getIsPermisoPaginacionMedioImpuestoInven() {
		return isPermisoPaginacionMedioImpuestoInven;
	}

	public void setIsPermisoPaginacionMedioImpuestoInven(Boolean isPermisoPaginacionMedioImpuestoInven) {
		this.isPermisoPaginacionMedioImpuestoInven = isPermisoPaginacionMedioImpuestoInven;
	}
	
	public Boolean getIsPermisoPaginacionTodoImpuestoInven() {
		return isPermisoPaginacionTodoImpuestoInven;
	}

	public void setIsPermisoPaginacionTodoImpuestoInven(Boolean isPermisoPaginacionTodoImpuestoInven) {
		this.isPermisoPaginacionTodoImpuestoInven = isPermisoPaginacionTodoImpuestoInven;
	}
	
	public Boolean getIsPermisoPaginacionAltoImpuestoInven() {
		return isPermisoPaginacionAltoImpuestoInven;
	}

	public void setIsPermisoPaginacionAltoImpuestoInven(Boolean isPermisoPaginacionAltoImpuestoInven) {
		this.isPermisoPaginacionAltoImpuestoInven = isPermisoPaginacionAltoImpuestoInven;
	}
	
	public Boolean getIsPermisoCopiarImpuestoInven() {
		return isPermisoCopiarImpuestoInven;
	}

	public void setIsPermisoCopiarImpuestoInven(Boolean isPermisoCopiarImpuestoInven) {
		this.isPermisoCopiarImpuestoInven = isPermisoCopiarImpuestoInven;
	}
	
	public Boolean getIsPermisoVerFormImpuestoInven() {
		return isPermisoVerFormImpuestoInven;
	}

	public void setIsPermisoVerFormImpuestoInven(Boolean isPermisoVerFormImpuestoInven) {
		this.isPermisoVerFormImpuestoInven = isPermisoVerFormImpuestoInven;
	}
	
	public Boolean getIsPermisoDuplicarImpuestoInven() {
		return isPermisoDuplicarImpuestoInven;
	}

	public void setIsPermisoDuplicarImpuestoInven(Boolean isPermisoDuplicarImpuestoInven) {
		this.isPermisoDuplicarImpuestoInven = isPermisoDuplicarImpuestoInven;
	}
	
	public Boolean getIsPermisoOrdenImpuestoInven() {
		return isPermisoOrdenImpuestoInven;
	}

	public void setIsPermisoOrdenImpuestoInven(Boolean isPermisoOrdenImpuestoInven) {
		this.isPermisoOrdenImpuestoInven = isPermisoOrdenImpuestoInven;
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
	
	public Boolean getIsVisibilidadCeldaNuevoImpuestoInven() {
		return isVisibilidadCeldaNuevoImpuestoInven;
	}

	public void setIsVisibilidadCeldaNuevoImpuestoInven(Boolean isVisibilidadCeldaNuevoImpuestoInven) {
		this.isVisibilidadCeldaNuevoImpuestoInven = isVisibilidadCeldaNuevoImpuestoInven;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarImpuestoInven() {
		return isVisibilidadCeldaDuplicarImpuestoInven;
	}

	public void setIsVisibilidadCeldaDuplicarImpuestoInven(Boolean isVisibilidadCeldaDuplicarImpuestoInven) {
		this.isVisibilidadCeldaDuplicarImpuestoInven = isVisibilidadCeldaDuplicarImpuestoInven;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarImpuestoInven() {
		return isVisibilidadCeldaCopiarImpuestoInven;
	}

	public void setIsVisibilidadCeldaCopiarImpuestoInven(Boolean isVisibilidadCeldaCopiarImpuestoInven) {
		this.isVisibilidadCeldaCopiarImpuestoInven = isVisibilidadCeldaCopiarImpuestoInven;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormImpuestoInven() {
		return isVisibilidadCeldaVerFormImpuestoInven;
	}

	public void setIsVisibilidadCeldaVerFormImpuestoInven(Boolean isVisibilidadCeldaVerFormImpuestoInven) {
		this.isVisibilidadCeldaVerFormImpuestoInven = isVisibilidadCeldaVerFormImpuestoInven;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenImpuestoInven() {
		return isVisibilidadCeldaOrdenImpuestoInven;
	}

	public void setIsVisibilidadCeldaOrdenImpuestoInven(Boolean isVisibilidadCeldaOrdenImpuestoInven) {
		this.isVisibilidadCeldaOrdenImpuestoInven = isVisibilidadCeldaOrdenImpuestoInven;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesImpuestoInven() {
		return isVisibilidadCeldaNuevoRelacionesImpuestoInven;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesImpuestoInven(Boolean isVisibilidadCeldaNuevoRelacionesImpuestoInven) {
		this.isVisibilidadCeldaNuevoRelacionesImpuestoInven = isVisibilidadCeldaNuevoRelacionesImpuestoInven;
	}
	
	public Boolean getIsVisibilidadCeldaModificarImpuestoInven() {
		return isVisibilidadCeldaModificarImpuestoInven;
	}

	public void setIsVisibilidadCeldaModificarImpuestoInven(Boolean isVisibilidadCeldaModificarImpuestoInven) {
		this.isVisibilidadCeldaModificarImpuestoInven = isVisibilidadCeldaModificarImpuestoInven;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarImpuestoInven() {
		return isVisibilidadCeldaActualizarImpuestoInven;
	}

	public void setIsVisibilidadCeldaActualizarImpuestoInven(Boolean isVisibilidadCeldaActualizarImpuestoInven) {
		this.isVisibilidadCeldaActualizarImpuestoInven = isVisibilidadCeldaActualizarImpuestoInven;
	}

	public Boolean getIsVisibilidadCeldaEliminarImpuestoInven() {
		return isVisibilidadCeldaEliminarImpuestoInven;
	}

	public void setIsVisibilidadCeldaEliminarImpuestoInven(Boolean isVisibilidadCeldaEliminarImpuestoInven) {
		this.isVisibilidadCeldaEliminarImpuestoInven = isVisibilidadCeldaEliminarImpuestoInven;
	}

	public Boolean getIsVisibilidadCeldaCancelarImpuestoInven() {
		return isVisibilidadCeldaCancelarImpuestoInven;
	}

	public void setIsVisibilidadCeldaCancelarImpuestoInven(Boolean isVisibilidadCeldaCancelarImpuestoInven) {
		this.isVisibilidadCeldaCancelarImpuestoInven = isVisibilidadCeldaCancelarImpuestoInven;
	}

	public Boolean getIsVisibilidadCeldaGuardarImpuestoInven() {
		return isVisibilidadCeldaGuardarImpuestoInven;
	}

	public void setIsVisibilidadCeldaGuardarImpuestoInven(Boolean isVisibilidadCeldaGuardarImpuestoInven) {
		this.isVisibilidadCeldaGuardarImpuestoInven = isVisibilidadCeldaGuardarImpuestoInven;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosImpuestoInven() {
		return isVisibilidadCeldaGuardarCambiosImpuestoInven;
	}

	public void setIsVisibilidadCeldaGuardarCambiosImpuestoInven(Boolean isVisibilidadCeldaGuardarCambiosImpuestoInven) {
		this.isVisibilidadCeldaGuardarCambiosImpuestoInven = isVisibilidadCeldaGuardarCambiosImpuestoInven;
	}
		
	public ImpuestoInvenSessionBean getimpuestoinvenSessionBean() {
		return this.impuestoinvenSessionBean;
	}
	
	public void setimpuestoinvenSessionBean(ImpuestoInvenSessionBean impuestoinvenSessionBean) {
		this.impuestoinvenSessionBean=impuestoinvenSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysImpuestoInven(ImpuestoInven impuestoinven)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(impuestoinven,null);
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
	
	public void bugActualizarReferenciaActual(ImpuestoInven impuestoinven,ImpuestoInven impuestoinvenAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalImpuestoInven(impuestoinven);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		impuestoinvenAux.setId(impuestoinven.getId());
		impuestoinvenAux.setVersionRow(impuestoinven.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessImpuestoInven();
		
			int intSelectedRow = this.jTableDatosImpuestoInven.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinven =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.impuestoinven =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ImpuestoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualImpuestoInven(this.impuestoinven,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysImpuestoInven(this.impuestoinven);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = impuestoinvenValidator.getInvalidValues(this.impuestoinven);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			impuestoinvenLogic.setDatosCliente(datosCliente);
			impuestoinvenLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				impuestoinvenAux=new  ImpuestoInven();
				
				impuestoinvenAux.setIsNew(true);
				impuestoinvenAux.setIsChanged(true);
				
				impuestoinvenAux.setImpuestoInvenOriginal(this.impuestoinven);
				
				impuestoinvenAux.setId(this.impuestoinven.getId());	
				impuestoinvenAux.setVersionRow(this.impuestoinven.getVersionRow());	
				impuestoinvenAux.setid_empresa(this.impuestoinven.getid_empresa());	
				impuestoinvenAux.setnombre(this.impuestoinven.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.impuestoinvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.impuestoinvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(impuestoinvenAux,impuestoinvenLogic.getImpuestoInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(impuestoinvenAux,impuestoinvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.impuestoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.impuestoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						impuestoinvenLogic.saveImpuestoInvens();//WithConnection
						//impuestoinvenLogic.getSetVersionRowImpuestoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.impuestoinven,impuestoinvenAux);
					
					this.refrescarForeignKeysDescripcionesImpuestoInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.impuestoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestoLogic.getProductoImpuestos().addAll(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestosEliminados);
							this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().addAll(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvensEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestos.addAll(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestosEliminados);
							this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvens.addAll(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvensEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								impuestoinvenLogic.saveImpuestoInvenRelaciones(impuestoinvenAux,this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestoLogic.getProductoImpuestos(),this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenLogic.getDetalleImpuestoInvens());//WithConnection
								//impuestoinvenLogic.getSetVersionRowImpuestoInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.impuestoinven,impuestoinvenAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestoLogic.setProductoImpuestos(new ArrayList<ProductoImpuesto>());
							this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenLogic.setDetalleImpuestoInvens(new ArrayList<DetalleImpuestoInven>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestos= new ArrayList<ProductoImpuesto>();
							this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvens= new ArrayList<DetalleImpuestoInven>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.quitarFilaTotales();}
							impuestoinvenAux.setProductoImpuestos(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestoLogic.getProductoImpuestos());

							if(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.quitarFilaTotales();}
							impuestoinvenAux.setDetalleImpuestoInvens(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.impuestoinvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.impuestoinvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(impuestoinvenAux,impuestoinvenLogic.getImpuestoInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(impuestoinvenAux,impuestoinvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.impuestoinven,impuestoinvenAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				impuestoinvenAux=new  ImpuestoInven();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado() 
					|| (this.impuestoinvenSessionBean.getEsGuardarRelacionado() && this.impuestoinven.getId()>=0)) {
						
					impuestoinvenAux.setIsNew(false);
				}
				
				impuestoinvenAux.setIsDeleted(false);
			
				impuestoinvenAux.setId(this.impuestoinven.getId());	
				impuestoinvenAux.setVersionRow(this.impuestoinven.getVersionRow());	
				impuestoinvenAux.setid_empresa(this.impuestoinven.getid_empresa());	
				impuestoinvenAux.setnombre(this.impuestoinven.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(impuestoinvenAux,impuestoinvenLogic.getImpuestoInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(impuestoinvenAux,impuestoinvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.impuestoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.impuestoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						impuestoinvenLogic.saveImpuestoInvens();//WithConnection
						//impuestoinvenLogic.getSetVersionRowImpuestoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.impuestoinven,impuestoinvenAux);
					
					this.refrescarForeignKeysDescripcionesImpuestoInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.impuestoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestoLogic.getProductoImpuestos().addAll(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestosEliminados);
							this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().addAll(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvensEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestos.addAll(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestosEliminados);
							this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvens.addAll(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvensEliminados);
						}
						//ARCHITECTURE
						
						if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								impuestoinvenLogic.saveImpuestoInvenRelaciones(impuestoinvenAux,this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestoLogic.getProductoImpuestos(),this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenLogic.getDetalleImpuestoInvens());//WithConnection
								//impuestoinvenLogic.getSetVersionRowImpuestoInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.impuestoinven,impuestoinvenAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestoLogic.setProductoImpuestos(new ArrayList<ProductoImpuesto>());
							this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenLogic.setDetalleImpuestoInvens(new ArrayList<DetalleImpuestoInven>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestos= new ArrayList<ProductoImpuesto>();
							this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvens= new ArrayList<DetalleImpuestoInven>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.quitarFilaTotales();}
							impuestoinvenAux.setProductoImpuestos(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestoLogic.getProductoImpuestos());

							if(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.quitarFilaTotales();}
							impuestoinvenAux.setDetalleImpuestoInvens(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.impuestoinvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.impuestoinvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(impuestoinvenAux,impuestoinvenLogic.getImpuestoInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(impuestoinvenAux,impuestoinvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.impuestoinven,impuestoinvenAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				impuestoinvenAux=new  ImpuestoInven();
				
				impuestoinvenAux.setIsNew(false);
				impuestoinvenAux.setIsChanged(false);
				
				impuestoinvenAux.setIsDeleted(true);
				
				impuestoinvenAux.setId(this.impuestoinven.getId());	
				impuestoinvenAux.setVersionRow(this.impuestoinven.getVersionRow());	
				impuestoinvenAux.setid_empresa(this.impuestoinven.getid_empresa());	
				impuestoinvenAux.setnombre(this.impuestoinven.getnombre());	
				
				if(this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.impuestoinvenAux.getId()>=0) {	
						this.impuestoinvensEliminados.add(impuestoinvenAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(impuestoinvenAux,impuestoinvenLogic.getImpuestoInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(impuestoinvenAux,impuestoinvens);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.impuestoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.impuestoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						impuestoinvenLogic.saveImpuestoInvens();//WithConnection
						//impuestoinvenLogic.getSetVersionRowImpuestoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.impuestoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestoLogic.getProductoImpuestos().addAll(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestosEliminados);
							this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().addAll(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvensEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestos.addAll(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestosEliminados);
							this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvens.addAll(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvensEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								impuestoinvenLogic.saveImpuestoInvenRelaciones(impuestoinvenAux,this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestoLogic.getProductoImpuestos(),this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenLogic.getDetalleImpuestoInvens());//WithConnection
								//impuestoinvenLogic.getSetVersionRowImpuestoInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestoLogic.setProductoImpuestos(new ArrayList<ProductoImpuesto>());
							this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenLogic.setDetalleImpuestoInvens(new ArrayList<DetalleImpuestoInven>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestos= new ArrayList<ProductoImpuesto>();
							this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvens= new ArrayList<DetalleImpuestoInven>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.quitarFilaTotales();}
							impuestoinvenAux.setProductoImpuestos(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestoLogic.getProductoImpuestos());

							if(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.quitarFilaTotales();}
							impuestoinvenAux.setDetalleImpuestoInvens(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.impuestoinvenSessionBean.getEstaModoGuardarRelaciones() 
								|| this.impuestoinvenSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(impuestoinvenAux,impuestoinvenLogic.getImpuestoInvens());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(impuestoinvenAux,impuestoinvens);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenLogic.getImpuestoInvens().addAll(this.impuestoinvensEliminados);
					
					impuestoinvenLogic.saveImpuestoInvens();//WithConnection
					//impuestoinvenLogic.getSetVersionRowImpuestoInvens();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesImpuestoInven();
				
				this.impuestoinvensEliminados= new ArrayList<ImpuestoInven>();		
			}
			
			if(this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Impuesto Inven GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Impuesto Inven",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.impuestoinven=impuestoinvenAux;
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
      		//this.finishProcessImpuestoInven();
      	}
		
	}	
	
	public void actualizarRelaciones(ImpuestoInven impuestoinvenLocal) throws Exception {
		
		if(this.impuestoinvenSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				impuestoinvenLocal.setProductoImpuestos(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestoLogic.getProductoImpuestos());
				impuestoinvenLocal.setDetalleImpuestoInvens(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
			
			} else {
			
				impuestoinvenLocal.setProductoImpuestos(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestos);
				impuestoinvenLocal.setDetalleImpuestoInvens(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvens);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ImpuestoInven impuestoinvenLocal) throws Exception {	
		if(this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				impuestoinvenLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarImpuestoInvenActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosImpuestoInven.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.impuestoinven =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.impuestoinven =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = impuestoinvenValidator.getInvalidValues(this.impuestoinven);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ImpuestoInven impuestoinven,List<ImpuestoInven> impuestoinvens) throws Exception {
		try	{		
			ImpuestoInvenConstantesFunciones.actualizarLista(impuestoinven,impuestoinvens,this.impuestoinvenSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ImpuestoInven impuestoinven,List<ImpuestoInven> impuestoinvens) throws Exception {
		try	{			
			ImpuestoInvenConstantesFunciones.actualizarSelectedLista(impuestoinven,impuestoinvens);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ImpuestoInven> impuestoinvensLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				impuestoinvensLocal=this.impuestoinvenLogic.getImpuestoInvens();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				impuestoinvensLocal=this.impuestoinvens;
			}
			//ARCHITECTURE
		
			for(ImpuestoInven impuestoinvenLocal:impuestoinvensLocal) {
				if(this.permiteMantenimiento(impuestoinvenLocal) && impuestoinvenLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ImpuestoInvenConstantesFunciones.getImpuestoInvenLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ImpuestoInvenConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormImpuestoInven.jLabelid_empresaImpuestoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ImpuestoInvenConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormImpuestoInven.jLabelnombreImpuestoInven,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormImpuestoInven.jLabelid_empresaImpuestoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormImpuestoInven.jLabelnombreImpuestoInven,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ProductoImpuesto")) {
			if(this.impuestoinven==null) {
				this.impuestoinven= new ImpuestoInven();
			}

			if(this.impuestoinvenSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoImpuestoInven
				this.setVariablesFormularioToObjetoActualImpuestoInven(this.impuestoinven,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysImpuestoInven(this.impuestoinven);

				this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.getproductoimpuesto().setImpuestoInven(this.impuestoinven);
			}

			return;
		}
		 else  if(sTipo.equals("DetalleImpuestoInven")) {
			if(this.impuestoinven==null) {
				this.impuestoinven= new ImpuestoInven();
			}

			if(this.impuestoinvenSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoImpuestoInven
				this.setVariablesFormularioToObjetoActualImpuestoInven(this.impuestoinven,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysImpuestoInven(this.impuestoinven);

				this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.getdetalleimpuestoinven().setImpuestoInven(this.impuestoinven);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoImpuestoInven--;	
		
		
		this.impuestoinvenAux=new ImpuestoInven();
		
		this.impuestoinvenAux.setId(this.iIdNuevoImpuestoInven);
		this.impuestoinvenAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.impuestoinvenLogic.getImpuestoInvens().add(this.impuestoinvenAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.impuestoinvens.add(this.impuestoinvenAux);
		}
		//ARCHITECTURE
		
		this.impuestoinven=this.impuestoinvenAux;
		
		if(ImpuestoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioImpuestoInven(this.impuestoinven);
			this.setVariablesObjetoActualToFormularioForeignKeyImpuestoInven(this.impuestoinven);
		}
				
		//this.setDefaultControlesImpuestoInven();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyImpuestoInven();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyImpuestoInven();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyImpuestoInven();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualImpuestoInven(this.impuestoinvenBean,this.impuestoinven,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysImpuestoInven(this.impuestoinven);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ImpuestoInvenConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.impuestoinvenSessionBean.getConGuardarRelaciones()) {
			classes=ImpuestoInvenConstantesFunciones.getClassesRelationshipsOfImpuestoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.impuestoinvenReturnGeneral=impuestoinvenLogic.procesarEventosImpuestoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.impuestoinvenLogic.getImpuestoInvens(),this.impuestoinven,this.impuestoinvenParameterGeneral,this.isEsNuevoImpuestoInven,classes);//this.impuestoinvenLogic.getImpuestoInven()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanImpuestoInven(this.impuestoinvenReturnGeneral,this.impuestoinvenBean,false);
		
		if(this.impuestoinvenReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyImpuestoInven(this.impuestoinvenReturnGeneral.getImpuestoInven());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioImpuestoInven(this.impuestoinvenReturnGeneral.getImpuestoInven());
		}
		
		if(this.impuestoinvenReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioImpuestoInven(this.impuestoinvenReturnGeneral.getImpuestoInven(),classes);//this.impuestoinvenBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualImpuestoInven(this.impuestoinven,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyImpuestoInven();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyImpuestoInven();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ImpuestoInvenBeanSwingJInternalFrameAdditional.RecargarFormImpuestoInven(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingImpuestoInven(false);
						
			if(impuestoinvenSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestoSessionBean.getEsGuardarRelacionado() && ProductoImpuestoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoImpuestoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado() && DetalleImpuestoInvenJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleImpuestoInvenActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(ImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualImpuestoInven();
			}
			
			this.actualizarVisualTableDatosImpuestoInven();
			
			this.jTableDatosImpuestoInven.setRowSelectionInterval(this.getIndiceNuevoImpuestoInven(), this.getIndiceNuevoImpuestoInven());
			
			this.seleccionarFilaTablaImpuestoInvenActual();
						
			this.actualizarEstadoCeldasBotonesImpuestoInven("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesImpuestoInven(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormImpuestoInven.jTextAreanombreImpuestoInven.setEnabled(isHabilitar && this.impuestoinvenConstantesFunciones.activarnombreImpuestoInven);	
		//
		this.jInternalFrameDetalleFormImpuestoInven.jComboBoxid_empresaImpuestoInven.setEnabled(isHabilitar && this.impuestoinvenConstantesFunciones.activarid_empresaImpuestoInven);
	};
	
	public void setDefaultControlesImpuestoInven() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoImpuestoInven(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.impuestoinvenSessionBean.setConGuardarRelaciones(true);			
			this.impuestoinvenSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormImpuestoInven.jTabbedPaneRelacionesImpuestoInven.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.impuestoinvenSessionBean.setConGuardarRelaciones(false);			
			this.impuestoinvenSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormImpuestoInven.jTabbedPaneRelacionesImpuestoInven.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoImpuestoInven() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ImpuestoInven impuestoinvenAux:this.impuestoinvenLogic.getImpuestoInvens()) {
				if(impuestoinvenAux.getId().equals(this.iIdNuevoImpuestoInven)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ImpuestoInven impuestoinvenAux:this.impuestoinvens) {
				if(impuestoinvenAux.getId().equals(this.iIdNuevoImpuestoInven)) {
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
	
	public int getIndiceActualImpuestoInven(ImpuestoInven impuestoinven,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ImpuestoInven impuestoinvenAux:this.impuestoinvenLogic.getImpuestoInvens()) {
				if(impuestoinvenAux.getId().equals(impuestoinven.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ImpuestoInven impuestoinvenAux:this.impuestoinvens) {
				if(impuestoinvenAux.getId().equals(impuestoinven.getId())) {
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
	
	public void setCamposBaseDesdeOriginalImpuestoInven(ImpuestoInven impuestoinvenOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ImpuestoInven impuestoinvenAux:this.impuestoinvenLogic.getImpuestoInvens()) {
				if(impuestoinvenAux.getImpuestoInvenOriginal().getId().equals(impuestoinvenOriginal.getId())) {
					existe=true;
					impuestoinvenOriginal.setId(impuestoinvenAux.getId());
					impuestoinvenOriginal.setVersionRow(impuestoinvenAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ImpuestoInven impuestoinvenAux:this.impuestoinvens) {
				if(impuestoinvenAux.getImpuestoInvenOriginal().getId().equals(impuestoinvenOriginal.getId())) {
					existe=true;
					impuestoinvenOriginal.setId(impuestoinvenAux.getId());
					impuestoinvenOriginal.setVersionRow(impuestoinvenAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosImpuestoInven(Boolean esParaCancelar) throws Exception {
		impuestoinvensAux=new ArrayList<ImpuestoInven>();
		impuestoinvenAux=new ImpuestoInven();
		
		if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ImpuestoInven impuestoinvenAux:this.impuestoinvenLogic.getImpuestoInvens()) {
					if(impuestoinvenAux.getId()<0) {
						impuestoinvensAux.add(impuestoinvenAux);
					}		
				}
				this.iIdNuevoImpuestoInven=0L;
				this.impuestoinvenLogic.getImpuestoInvens().removeAll(impuestoinvensAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ImpuestoInven impuestoinvenAux:this.impuestoinvens) {
					if(impuestoinvenAux.getId()<0) {
						impuestoinvensAux.add(impuestoinvenAux);
					}		
				}
				this.iIdNuevoImpuestoInven=0L;
				this.impuestoinvens.removeAll(impuestoinvensAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoImpuestoInven 
					&& this.impuestoinvenLogic.getImpuestoInvens().size()>0
					) {
					impuestoinvenAux=this.impuestoinvenLogic.getImpuestoInvens().get(this.impuestoinvenLogic.getImpuestoInvens().size() - 1);
				
					if(impuestoinvenAux.getId()<0) {
						this.impuestoinvenLogic.getImpuestoInvens().remove(impuestoinvenAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoImpuestoInven && this.impuestoinvens.size()>0) {
					impuestoinvenAux=this.impuestoinvens.get(this.impuestoinvens.size() - 1);
				
					if(impuestoinvenAux.getId()<0) {
						this.impuestoinvens.remove(impuestoinvenAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoImpuestoInven(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(impuestoinven.getId()<0) {
				this.impuestoinvenLogic.getImpuestoInvens().remove(this.impuestoinven);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(impuestoinven.getId()<0) {
				this.impuestoinvens.remove(this.impuestoinven);
			}
		}			
	}
	
	public void setEstadosInicialesImpuestoInven(List<ImpuestoInven> impuestoinvensAux) throws Exception {
		ImpuestoInvenConstantesFunciones.setEstadosInicialesImpuestoInven(impuestoinvensAux);
	}
	
	public void setEstadosInicialesImpuestoInven(ImpuestoInven impuestoinvenAux) throws Exception {
		ImpuestoInvenConstantesFunciones.setEstadosInicialesImpuestoInven(impuestoinvenAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarImpuestoInvenActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesImpuestoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarImpuestoInvenActual()) {
				if(!this.isEsNuevoImpuestoInven) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesImpuestoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoImpuestoInven=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarImpuestoInvenActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Impuesto Inven ?", "MANTENIMIENTO DE Impuesto Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesImpuestoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ImpuestoInven impuestoinven) throws Exception {
		ImpuestoInvenConstantesFunciones.seleccionarAsignar(this.impuestoinven,impuestoinven);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarImpuestoInven=this.isPermisoActualizarOriginalImpuestoInven;
			
			
			this.seleccionarAsignar(impuestoinven);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ImpuestoInvenConstantesFunciones.quitarEspaciosImpuestoInven(this.impuestoinven,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesImpuestoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.impuestoinvenSessionBean.setsFuncionBusquedaRapida(this.impuestoinvenSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoImpuestoInven) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosImpuestoInven(esParaCancelar);				
				this.cancelarNuevoImpuestoInven(esParaCancelar);								
			}
			
			this.impuestoinven=new ImpuestoInven();
			
			this.inicializarImpuestoInven();
			
			this.actualizarEstadoCeldasBotonesImpuestoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarImpuestoInven() throws Exception {
		try {
			ImpuestoInvenConstantesFunciones.inicializarImpuestoInven(this.impuestoinven);
			
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
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.impuestoinvenLogic.getImpuestoInvens().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteImpuestoInvens(String sAccionBusqueda,List<ImpuestoInven> impuestoinvensParaReportes) throws Exception {
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
					sPathReporteFinal="ImpuestoInven"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ImpuestoInvenMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ImpuestoInvenMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ImpuestoInven"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Impuesto Invenes");		
		parameters.put("busquedapor", ImpuestoInvenConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ProductoImpuesto.class));
			classes.add(new Classe(DetalleImpuestoInven.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					ImpuestoInvenLogic impuestoinvenLogicAuxiliar=new ImpuestoInvenLogic();
					impuestoinvenLogicAuxiliar.setDatosCliente(impuestoinvenLogic.getDatosCliente());				
					impuestoinvenLogicAuxiliar.setImpuestoInvens(impuestoinvensParaReportes);
					
					impuestoinvenLogicAuxiliar.cargarRelacionesLoteForeignKeyImpuestoInvenWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					impuestoinvensParaReportes=impuestoinvenLogicAuxiliar.getImpuestoInvens();
					
					//impuestoinvenLogic.getNewConnexionToDeep();
					
					//for (ImpuestoInven impuestoinven:impuestoinvensParaReportes) {
					//	impuestoinvenLogic.deepLoad(impuestoinven, false, DeepLoadType.INCLUDE, classes);
					//}						
					//impuestoinvenLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//impuestoinvenLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileProductoImpuesto = AuxiliarReportes.class.getResourceAsStream("ProductoImpuestoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_productoimpuesto", reportFileProductoImpuesto);

			InputStream reportFileDetalleImpuestoInven = AuxiliarReportes.class.getResourceAsStream("DetalleImpuestoInvenDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleimpuestoinven", reportFileDetalleImpuestoInven);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceImpuestoInven=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ImpuestoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ImpuestoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceImpuestoInven=new JRBeanArrayDataSource(ImpuestoInvenJInternalFrame.TraerImpuestoInvenBeans(impuestoinvensParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceImpuestoInven);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ImpuestoInvenConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ImpuestoInvenConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ImpuestoInvenBean.TraerImpuestoInvenBeans(impuestoinvensParaReportes).toArray()));
							
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
				this.generarExcelReporteImpuestoInvens(sAccionBusqueda,sTipoArchivoReporte,impuestoinvensParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalImpuestoInvens(sAccionBusqueda,sTipoArchivoReporte,impuestoinvensParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoImpuestoInvenActionPerformed(null);
					//this.generarExcelReporteImpuestoInvens(sAccionBusqueda,sTipoArchivoReporte,impuestoinvensParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalImpuestoInvens(sAccionBusqueda,sTipoArchivoReporte,impuestoinvensParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesImpuestoInvens(sAccionBusqueda,sTipoArchivoReporte,impuestoinvensParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesImpuestoInvens(sAccionBusqueda,sTipoArchivoReporte,impuestoinvensParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteImpuestoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<ImpuestoInven> impuestoinvensParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"impuestoinven";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ImpuestoInvens");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderImpuestoInven("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ImpuestoInven impuestoinven : impuestoinvensParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ImpuestoInvenConstantesFunciones.generarExcelReporteDataImpuestoInven("NORMAL",row,workbook,impuestoinven,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Impuesto Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderImpuestoInven(String sTipo,Row row,Workbook workbook) {
		
		ImpuestoInvenConstantesFunciones.generarExcelReporteHeaderImpuestoInven(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalImpuestoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<ImpuestoInven> impuestoinvensParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"impuestoinven_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ImpuestoInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ImpuestoInven impuestoinven : impuestoinvensParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ImpuestoInvenConstantesFunciones.getImpuestoInvenDescripcion(impuestoinven));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(impuestoinven.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ImpuestoInvenConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ImpuestoInvenConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(impuestoinven.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Impuesto Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesImpuestoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<ImpuestoInven> impuestoinvensParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ImpuestoInven> impuestoinvensRespaldo=null;
		
		classes=ImpuestoInvenConstantesFunciones.getClassesRelationshipsOfImpuestoInven(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.impuestoinvenLogic.setDatosCliente(this.datosCliente);
		this.impuestoinvenLogic.setDatosDeep(this.datosDeep);
		this.impuestoinvenLogic.setIsConDeep(true);
		
		impuestoinvensRespaldo=this.impuestoinvenLogic.getImpuestoInvens();
		
		this.impuestoinvenLogic.setImpuestoInvens(impuestoinvensParaReportes);	
		this.impuestoinvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		impuestoinvensParaReportes=this.impuestoinvenLogic.getImpuestoInvens();
		this.impuestoinvenLogic.setImpuestoInvens(impuestoinvensRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"impuestoinven_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ImpuestoInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderImpuestoInven("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ImpuestoInven impuestoinven : impuestoinvensParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderImpuestoInven("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ImpuestoInvenConstantesFunciones.generarExcelReporteDataImpuestoInven("NORMAL",row,workbook,impuestoinven,cellStyleDataAux);
		
			
			


				//ProductoImpuesto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO))) {

				if(impuestoinven.getProductoImpuestos()!=null && impuestoinven.getProductoImpuestos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoImpuestoConstantesFunciones.generarExcelReporteHeaderProductoImpuesto("RELACIONADO",row,workbook);
				}

				if(impuestoinven.getProductoImpuestos()!=null) {
					i2=0;
					for(ProductoImpuesto productoimpuesto : impuestoinven.getProductoImpuestos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ProductoImpuestoConstantesFunciones.generarExcelReporteDataProductoImpuesto("RELACIONADO",row,workbook,productoimpuesto,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//DetalleImpuestoInven
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO))) {

				if(impuestoinven.getDetalleImpuestoInvens()!=null && impuestoinven.getDetalleImpuestoInvens().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleImpuestoInvenConstantesFunciones.generarExcelReporteHeaderDetalleImpuestoInven("RELACIONADO",row,workbook);
				}

				if(impuestoinven.getDetalleImpuestoInvens()!=null) {
					i2=0;
					for(DetalleImpuestoInven detalleimpuestoinven : impuestoinven.getDetalleImpuestoInvens()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleImpuestoInvenConstantesFunciones.generarExcelReporteDataDetalleImpuestoInven("RELACIONADO",row,workbook,detalleimpuestoinven,cellStyleDataAuxHijo);
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
		cell.setCellValue(ImpuestoInvenConstantesFunciones.getImpuestoInvenDescripcion(impuestoinven));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Impuesto Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoImpuestoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoImpuestoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoImpuestoInven.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoImpuestoInven.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessImpuestoInven() throws Exception {		
		this.startProcessImpuestoInven(true);
	}
	
	public void startProcessImpuestoInven(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasImpuestoInven ,this.jPanelParametrosReportesImpuestoInven, this.jScrollPanelDatosImpuestoInven,this.jPanelPaginacionImpuestoInven, this.jScrollPanelDatosEdicionImpuestoInven, this.jPanelAccionesImpuestoInven,this.jPanelAccionesFormularioImpuestoInven,this.jmenuBarImpuestoInven,this.jmenuBarDetalleImpuestoInven,this.jTtoolBarImpuestoInven,this.jTtoolBarDetalleImpuestoInven);		
		
		final JTabbedPane jTabbedPaneBusquedasImpuestoInven=this.jTabbedPaneBusquedasImpuestoInven; 
		
		final JPanel jPanelParametrosReportesImpuestoInven=this.jPanelParametrosReportesImpuestoInven;
		//final JScrollPane jScrollPanelDatosImpuestoInven=this.jScrollPanelDatosImpuestoInven;
		final JTable jTableDatosImpuestoInven=this.jTableDatosImpuestoInven;		
		final JPanel jPanelPaginacionImpuestoInven=this.jPanelPaginacionImpuestoInven;
		//final JScrollPane jScrollPanelDatosEdicionImpuestoInven=this.jScrollPanelDatosEdicionImpuestoInven;
		final JPanel jPanelAccionesImpuestoInven=this.jPanelAccionesImpuestoInven;
		
		JPanel jPanelCamposAuxiliarImpuestoInven=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarImpuestoInven=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) {
			jPanelCamposAuxiliarImpuestoInven=this.jInternalFrameDetalleFormImpuestoInven.jPanelCamposImpuestoInven;
			jPanelAccionesFormularioAuxiliarImpuestoInven=this.jInternalFrameDetalleFormImpuestoInven.jPanelAccionesFormularioImpuestoInven;
		}
		
		final JPanel jPanelCamposImpuestoInven=jPanelCamposAuxiliarImpuestoInven;
		final JPanel jPanelAccionesFormularioImpuestoInven=jPanelAccionesFormularioAuxiliarImpuestoInven;
		
		
		final JMenuBar jmenuBarImpuestoInven=this.jmenuBarImpuestoInven;
		final JToolBar jTtoolBarImpuestoInven=this.jTtoolBarImpuestoInven;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarImpuestoInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarImpuestoInven=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) {
			jmenuBarDetalleAuxiliarImpuestoInven=this.jInternalFrameDetalleFormImpuestoInven.jmenuBarDetalleImpuestoInven;
			jTtoolBarDetalleAuxiliarImpuestoInven=this.jInternalFrameDetalleFormImpuestoInven.jTtoolBarDetalleImpuestoInven;
		}
		
		final JMenuBar jmenuBarDetalleImpuestoInven=jmenuBarDetalleAuxiliarImpuestoInven;
		final JToolBar jTtoolBarDetalleImpuestoInven=jTtoolBarDetalleAuxiliarImpuestoInven;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasImpuestoInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesImpuestoInven;
			processRunnable.jTableDatos=jTableDatosImpuestoInven;
			processRunnable.jPanelCampos=jPanelCamposImpuestoInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionImpuestoInven;
			processRunnable.jPanelAcciones=jPanelAccionesImpuestoInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioImpuestoInven;
			
			
			processRunnable.jmenuBar=jmenuBarImpuestoInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleImpuestoInven;
			processRunnable.jTtoolBar=jTtoolBarImpuestoInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleImpuestoInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasImpuestoInven ,jPanelParametrosReportesImpuestoInven,jTableDatosImpuestoInven, /*jScrollPanelDatosImpuestoInven,*/jPanelCamposImpuestoInven,jPanelPaginacionImpuestoInven, /*jScrollPanelDatosEdicionImpuestoInven,*/ jPanelAccionesImpuestoInven,jPanelAccionesFormularioImpuestoInven,jmenuBarImpuestoInven,jmenuBarDetalleImpuestoInven,jTtoolBarImpuestoInven,jTtoolBarDetalleImpuestoInven);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasImpuestoInven ,jPanelParametrosReportesImpuestoInven, jScrollPanelDatosImpuestoInven,jPanelPaginacionImpuestoInven, jScrollPanelDatosEdicionImpuestoInven, jPanelAccionesImpuestoInven,jPanelAccionesFormularioImpuestoInven,jmenuBarImpuestoInven,jmenuBarDetalleImpuestoInven,jTtoolBarImpuestoInven,jTtoolBarDetalleImpuestoInven);
						
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
	
	public void finishProcessImpuestoInven() {// throws Exception 
		this.finishProcessImpuestoInven(true);
	}
	
	public void finishProcessImpuestoInven(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasImpuestoInven ,this.jPanelParametrosReportesImpuestoInven, this.jScrollPanelDatosImpuestoInven,this.jPanelPaginacionImpuestoInven, this.jScrollPanelDatosEdicionImpuestoInven, this.jPanelAccionesImpuestoInven,this.jPanelAccionesFormularioImpuestoInven,this.jmenuBarImpuestoInven,this.jmenuBarDetalleImpuestoInven,this.jTtoolBarImpuestoInven,this.jTtoolBarDetalleImpuestoInven);		
		
		final JTabbedPane jTabbedPaneBusquedasImpuestoInven=this.jTabbedPaneBusquedasImpuestoInven; 
		
		final JPanel jPanelParametrosReportesImpuestoInven=this.jPanelParametrosReportesImpuestoInven;
		//final JScrollPane jScrollPanelDatosImpuestoInven=this.jScrollPanelDatosImpuestoInven;
		final JTable jTableDatosImpuestoInven=this.jTableDatosImpuestoInven;		
		final JPanel jPanelPaginacionImpuestoInven=this.jPanelPaginacionImpuestoInven;
		//final JScrollPane jScrollPanelDatosEdicionImpuestoInven=this.jScrollPanelDatosEdicionImpuestoInven;
		final JPanel jPanelAccionesImpuestoInven=this.jPanelAccionesImpuestoInven;
		
		JPanel jPanelCamposAuxiliarImpuestoInven=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarImpuestoInven=new JPanel();
		
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) {
			jPanelCamposAuxiliarImpuestoInven=this.jInternalFrameDetalleFormImpuestoInven.jPanelCamposImpuestoInven;
			jPanelAccionesFormularioAuxiliarImpuestoInven=this.jInternalFrameDetalleFormImpuestoInven.jPanelAccionesFormularioImpuestoInven;
		}
		
		final JPanel jPanelCamposImpuestoInven=jPanelCamposAuxiliarImpuestoInven;
		final JPanel jPanelAccionesFormularioImpuestoInven=jPanelAccionesFormularioAuxiliarImpuestoInven;
		
		
		final JMenuBar jmenuBarImpuestoInven=this.jmenuBarImpuestoInven;		
		final JToolBar jTtoolBarImpuestoInven=this.jTtoolBarImpuestoInven;
				
		JMenuBar jmenuBarDetalleAuxiliarImpuestoInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarImpuestoInven=new JToolBar();
		
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) {
			jmenuBarDetalleAuxiliarImpuestoInven=this.jInternalFrameDetalleFormImpuestoInven.jmenuBarDetalleImpuestoInven;
			jTtoolBarDetalleAuxiliarImpuestoInven=this.jInternalFrameDetalleFormImpuestoInven.jTtoolBarDetalleImpuestoInven;		
		}
		
		final JMenuBar jmenuBarDetalleImpuestoInven=jmenuBarDetalleAuxiliarImpuestoInven;
		final JToolBar jTtoolBarDetalleImpuestoInven=jTtoolBarDetalleAuxiliarImpuestoInven;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasImpuestoInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesImpuestoInven;
			processRunnable.jTableDatos=jTableDatosImpuestoInven;
			processRunnable.jPanelCampos=jPanelCamposImpuestoInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionImpuestoInven;
			processRunnable.jPanelAcciones=jPanelAccionesImpuestoInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioImpuestoInven;
			
			
			processRunnable.jmenuBar=jmenuBarImpuestoInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleImpuestoInven;
			processRunnable.jTtoolBar=jTtoolBarImpuestoInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleImpuestoInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasImpuestoInven ,jPanelParametrosReportesImpuestoInven, jTableDatosImpuestoInven,/*jScrollPanelDatosImpuestoInven,*/jPanelCamposImpuestoInven,jPanelPaginacionImpuestoInven, /*jScrollPanelDatosEdicionImpuestoInven,*/ jPanelAccionesImpuestoInven,jPanelAccionesFormularioImpuestoInven,jmenuBarImpuestoInven,jmenuBarDetalleImpuestoInven,jTtoolBarImpuestoInven,jTtoolBarDetalleImpuestoInven));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesImpuestoInven(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarImpuestoInven(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuImpuestoInven(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarImpuestoInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarImpuestoInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleImpuestoInven,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuImpuestoInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarImpuestoInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleImpuestoInven,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.impuestoinvenConstantesFunciones.getsFinalQueryImpuestoInven();
		String  finalQueryPaginacionTodos=this.impuestoinvenConstantesFunciones.getsFinalQueryImpuestoInven();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ImpuestoInvenConstantesFunciones.getArrayColumnasGlobalesNoImpuestoInven(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ImpuestoInvenConstantesFunciones.getArrayColumnasGlobalesImpuestoInven(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ImpuestoInvenConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.impuestoinvensEliminados= new ArrayList<ImpuestoInven>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessImpuestoInven();
		
				///*ImpuestoInvenSessionBean*/this.impuestoinvenSessionBean=new ImpuestoInvenSessionBean();
			
			if(this.impuestoinvenSessionBean==null) {
				this.impuestoinvenSessionBean=new ImpuestoInvenSessionBean();
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
					this.iNumeroPaginacion=ImpuestoInvenConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ImpuestoInvenConstantesFunciones.getClassesForeignKeysOfImpuestoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/impuestoinven."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			impuestoinvensAux= new ArrayList<ImpuestoInven>();
			
				
			impuestoinvenLogic.setDatosCliente(this.datosCliente);
			impuestoinvenLogic.setDatosDeep(this.datosDeep);
			impuestoinvenLogic.setIsConDeep(true);
			
			
			impuestoinvenLogic.getImpuestoInvenDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					impuestoinvenLogic.getTodosImpuestoInvens(finalQueryGlobal,pagination);
					
					//impuestoinvenLogic.getTodosImpuestoInvensWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(impuestoinvenLogic.getImpuestoInvens()==null|| impuestoinvenLogic.getImpuestoInvens().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							impuestoinvensAux= new ArrayList<ImpuestoInven>();
							impuestoinvensAux.addAll(impuestoinvenLogic.getImpuestoInvens());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							impuestoinvensAux= new ArrayList<ImpuestoInven>();
							impuestoinvensAux.addAll(impuestoinvens);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							impuestoinvenLogic.getTodosImpuestoInvens(finalQueryGlobal+"",this.pagination);												
							
							//impuestoinvenLogic.getTodosImpuestoInvensWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteImpuestoInvens("Todos",impuestoinvenLogic.getImpuestoInvens() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							impuestoinvenLogic.setImpuestoInvens(new ArrayList<ImpuestoInven>());					
							impuestoinvenLogic.getImpuestoInvens().addAll(impuestoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							impuestoinvens=new ArrayList<ImpuestoInven>();
							impuestoinvens.addAll(impuestoinvensAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idImpuestoInven=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idImpuestoInven=this.idActual;
				
				} else if(this.idImpuestoInvenActual!=null && this.idImpuestoInvenActual!=0L) {
					idImpuestoInven=idImpuestoInvenActual;
				}
				
					
				this.sDetalleReporte=ImpuestoInvenConstantesFunciones.getDetalleIndicePorId(idImpuestoInven);
				
				this.impuestoinvens=new ArrayList<ImpuestoInven>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					impuestoinvenLogic.getEntity(idImpuestoInven);
					
					//impuestoinvenLogic.getEntityWithConnection(idImpuestoInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					impuestoinvenLogic.setImpuestoInvens(new ArrayList<ImpuestoInven>());
					impuestoinvenLogic.getImpuestoInvens().add(impuestoinvenLogic.getImpuestoInven());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.impuestoinvens=new ArrayList<ImpuestoInven>();
					this.impuestoinvens.add(impuestoinven);
				}
				
				if(impuestoinvenLogic.getImpuestoInven()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=ImpuestoInvenConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					impuestoinvenLogic.getImpuestoInvensBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ImpuestoInvenConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ImpuestoInvenConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=impuestoinvenLogic.getImpuestoInvens()==null||impuestoinvenLogic.getImpuestoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=impuestoinvens==null|| impuestoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						impuestoinvensAux=new ArrayList<ImpuestoInven>();
						impuestoinvensAux.addAll(impuestoinvenLogic.getImpuestoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							impuestoinvensAux=new ArrayList<ImpuestoInven>();
							impuestoinvensAux.addAll(impuestoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							impuestoinvenLogic.getImpuestoInvensBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ImpuestoInvenConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ImpuestoInvenConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteImpuestoInvens("BusquedaPorNombre",impuestoinvenLogic.getImpuestoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteImpuestoInvens("BusquedaPorNombre",impuestoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						impuestoinvenLogic.setImpuestoInvens(new ArrayList<ImpuestoInven>());
						impuestoinvenLogic.getImpuestoInvens().addAll(impuestoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							impuestoinvens=new ArrayList<ImpuestoInven>();
							impuestoinvens.addAll(impuestoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					impuestoinvenLogic.getImpuestoInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=impuestoinvenLogic.getImpuestoInvens()==null||impuestoinvenLogic.getImpuestoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=impuestoinvens==null|| impuestoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						impuestoinvensAux=new ArrayList<ImpuestoInven>();
						impuestoinvensAux.addAll(impuestoinvenLogic.getImpuestoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							impuestoinvensAux=new ArrayList<ImpuestoInven>();
							impuestoinvensAux.addAll(impuestoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							impuestoinvenLogic.getImpuestoInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteImpuestoInvens("FK_IdEmpresa",impuestoinvenLogic.getImpuestoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteImpuestoInvens("FK_IdEmpresa",impuestoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						impuestoinvenLogic.setImpuestoInvens(new ArrayList<ImpuestoInven>());
						impuestoinvenLogic.getImpuestoInvens().addAll(impuestoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							impuestoinvens=new ArrayList<ImpuestoInven>();
							impuestoinvens.addAll(impuestoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesImpuestoInven();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessImpuestoInven();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=impuestoinvenLogic.getImpuestoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=impuestoinvens.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=impuestoinvenLogic.getImpuestoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=impuestoinvens.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ImpuestoInven impuestoinven) {
		Boolean permite=true;
		
		if(this.impuestoinven.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ImpuestoInvenConstantesFunciones.getOrderByListaImpuestoInven();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ImpuestoInvenConstantesFunciones.getOrderByListaImpuestoInven();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ImpuestoInven impuestoinven:impuestoinvenLogic.getImpuestoInvens()) {
				if(impuestoinven.getsType().equals(Constantes2.S_TOTALES)) {
					impuestoinvenTotales=impuestoinven;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ImpuestoInven impuestoinven:this.impuestoinvens) {
				if(impuestoinven.getsType().equals(Constantes2.S_TOTALES)) {
					impuestoinvenTotales=impuestoinven;
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
			this.impuestoinvenAux=new ImpuestoInven();
			this.impuestoinvenAux.setsType(Constantes2.S_TOTALES);
			this.impuestoinvenAux.setIsNew(false);
			this.impuestoinvenAux.setIsChanged(false);
			this.impuestoinvenAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ImpuestoInvenConstantesFunciones.TotalizarValoresFilaImpuestoInven(this.impuestoinvenLogic.getImpuestoInvens(),this.impuestoinvenAux);
				
				this.impuestoinvenLogic.getImpuestoInvens().add(this.impuestoinvenAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ImpuestoInvenConstantesFunciones.TotalizarValoresFilaImpuestoInven(this.impuestoinvens,this.impuestoinvenAux);
				
				this.impuestoinvens.add(this.impuestoinvenAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		impuestoinvenTotales=new ImpuestoInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.impuestoinvenLogic.getImpuestoInvens().remove(impuestoinvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.impuestoinvens.remove(impuestoinvenTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		impuestoinvenTotales=new ImpuestoInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ImpuestoInven impuestoinven:impuestoinvenLogic.getImpuestoInvens()) {
				if(impuestoinven.getsType().equals(Constantes2.S_TOTALES)) {
					impuestoinvenTotales=impuestoinven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ImpuestoInvenConstantesFunciones.TotalizarValoresFilaImpuestoInven(this.impuestoinvenLogic.getImpuestoInvens(),impuestoinvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ImpuestoInven impuestoinven:this.impuestoinvens) {
				if(impuestoinven.getsType().equals(Constantes2.S_TOTALES)) {
					impuestoinvenTotales=impuestoinven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ImpuestoInvenConstantesFunciones.TotalizarValoresFilaImpuestoInven(this.impuestoinvens,impuestoinvenTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getImpuestoInvensBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getImpuestoInvensFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getImpuestoInvenPorIdEmpresaPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorIdEmpresaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getImpuestoInvensBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					impuestoinvenLogic.getImpuestoInvensBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getImpuestoInvensFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					impuestoinvenLogic.getImpuestoInvensFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getImpuestoInvenPorIdEmpresaPorNombre(Long id_empresa,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					impuestoinvenLogic.getImpuestoInvenPorIdEmpresaPorNombre(id_empresa,nombre);
				
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
	
	public void inicializarPermisosImpuestoInven() {
		this.isPermisoTodoImpuestoInven=false;
		this.isPermisoNuevoImpuestoInven=false;
		this.isPermisoActualizarImpuestoInven=false;
		this.isPermisoActualizarOriginalImpuestoInven=false;
		this.isPermisoEliminarImpuestoInven=false;
		this.isPermisoGuardarCambiosImpuestoInven=false;
		this.isPermisoConsultaImpuestoInven=false;
		this.isPermisoBusquedaImpuestoInven=false;
		this.isPermisoReporteImpuestoInven=false;		
		this.isPermisoOrdenImpuestoInven=false;		
		this.isPermisoPaginacionMedioImpuestoInven=false;		
		this.isPermisoPaginacionAltoImpuestoInven=false;
		this.isPermisoPaginacionTodoImpuestoInven=false;
		this.isPermisoCopiarImpuestoInven=false;		
		this.isPermisoVerFormImpuestoInven=false;		
		this.isPermisoDuplicarImpuestoInven=false;		
		this.isPermisoOrdenImpuestoInven=false;		
	}
	
	public void setPermisosUsuarioImpuestoInven(Boolean isPermiso) {
		this.isPermisoTodoImpuestoInven=isPermiso;
		this.isPermisoNuevoImpuestoInven=isPermiso;
		this.isPermisoActualizarImpuestoInven=isPermiso;
		this.isPermisoActualizarOriginalImpuestoInven=isPermiso;
		this.isPermisoEliminarImpuestoInven=isPermiso;
		this.isPermisoGuardarCambiosImpuestoInven=isPermiso;
		this.isPermisoConsultaImpuestoInven=isPermiso;
		this.isPermisoBusquedaImpuestoInven=isPermiso;
		this.isPermisoReporteImpuestoInven=isPermiso;
		this.isPermisoOrdenImpuestoInven=isPermiso;		
		this.isPermisoPaginacionMedioImpuestoInven=isPermiso;		
		this.isPermisoPaginacionAltoImpuestoInven=isPermiso;		
		this.isPermisoPaginacionTodoImpuestoInven=isPermiso;		
		this.isPermisoCopiarImpuestoInven=isPermiso;		
		this.isPermisoVerFormImpuestoInven=isPermiso;		
		this.isPermisoDuplicarImpuestoInven=isPermiso;
		this.isPermisoOrdenImpuestoInven=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioImpuestoInven(Boolean isPermiso) {
		//this.isPermisoTodoImpuestoInven=isPermiso;
		this.isPermisoNuevoImpuestoInven=isPermiso;
		this.isPermisoActualizarImpuestoInven=isPermiso;
		this.isPermisoActualizarOriginalImpuestoInven=isPermiso;
		this.isPermisoEliminarImpuestoInven=isPermiso;
		this.isPermisoGuardarCambiosImpuestoInven=isPermiso;
		//this.isPermisoConsultaImpuestoInven=isPermiso;
		//this.isPermisoBusquedaImpuestoInven=isPermiso;
		//this.isPermisoReporteImpuestoInven=isPermiso;
		//this.isPermisoOrdenImpuestoInven=isPermiso;		
		//this.isPermisoPaginacionMedioImpuestoInven=isPermiso;		
		//this.isPermisoPaginacionAltoImpuestoInven=isPermiso;		
		//this.isPermisoPaginacionTodoImpuestoInven=isPermiso;		
		//this.isPermisoCopiarImpuestoInven=isPermiso;		
		//this.isPermisoDuplicarImpuestoInven=isPermiso;
		//this.isPermisoOrdenImpuestoInven=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioImpuestoInvenClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ProductoImpuestoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(DetalleImpuestoInvenConstantesFunciones.SNOMBREOPCION);
		
		if(ImpuestoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosProductoImpuesto=false;
		this.isTienePermisosProductoImpuesto=this.verificarGetPermisosUsuarioOpcionImpuestoInvenClaseRelacionada(this.opcionsRelacionadas,ProductoImpuestoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosDetalleImpuestoInven=false;
		this.isTienePermisosDetalleImpuestoInven=this.verificarGetPermisosUsuarioOpcionImpuestoInvenClaseRelacionada(this.opcionsRelacionadas,DetalleImpuestoInvenConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebImpuestoInven(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioImpuestoInvenClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosProductoImpuesto=conPermiso;
		this.isTienePermisosDetalleImpuestoInven=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioImpuestoInvenClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionImpuestoInvenClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioImpuestoInvenClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosProductoImpuesto && this.jInternalFrameDetalleFormImpuestoInven!=null && this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormImpuestoInven.jTabbedPaneRelacionesImpuestoInven.remove(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosDetalleImpuestoInven && this.jInternalFrameDetalleFormImpuestoInven!=null && this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormImpuestoInven.jTabbedPaneRelacionesImpuestoInven.remove(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioImpuestoInven() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ImpuestoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ImpuestoInvenConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoImpuestoInven=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarImpuestoInven=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalImpuestoInven=this.isPermisoActualizarImpuestoInven;
			this.isPermisoEliminarImpuestoInven=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosImpuestoInven=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaImpuestoInven=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaImpuestoInven=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoImpuestoInven=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteImpuestoInven=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenImpuestoInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioImpuestoInven=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoImpuestoInven=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoImpuestoInven=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarImpuestoInven=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormImpuestoInven=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarImpuestoInven=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenImpuestoInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosImpuestoInven.setToolTipText(this.jTableDatosImpuestoInven.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioImpuestoInven(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioImpuestoInven(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ImpuestoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ImpuestoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioImpuestoInven() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosProductoImpuesto && this.impuestoinvenConstantesFunciones.mostrarProductoImpuestoImpuestoInven && !ImpuestoInvenConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Producto Impuesto");
			reporte.setsDescripcion("Producto Impuesto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosDetalleImpuestoInven && this.impuestoinvenConstantesFunciones.mostrarDetalleImpuestoInvenImpuestoInven && !ImpuestoInvenConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Impuesto Inven");
			reporte.setsDescripcion("Detalle Impuesto Inven");
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
	public void inicializarCombosForeignKeyImpuestoInvenListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyImpuestoInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ImpuestoInvenJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyImpuestoInvenListas(false);
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
	
	public void cargarCombosLoteForeignKeyImpuestoInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ImpuestoInvenParameterReturnGeneral impuestoinvenReturnGeneral=new ImpuestoInvenParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.impuestoinvenConstantesFunciones.cargarid_empresaImpuestoInven)
					 || (this.esRecargarFks && this.impuestoinvenConstantesFunciones.cargarid_empresaImpuestoInven)) {

					if(!this.impuestoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+impuestoinvenSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				impuestoinvenReturnGeneral=impuestoinvenLogic.cargarCombosLoteForeignKeyImpuestoInven(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=impuestoinvenReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyImpuestoInven()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.impuestoinvenSessionBean==null) {
				this.impuestoinvenSessionBean=new ImpuestoInvenSessionBean();
			}

			if(!this.impuestoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyImpuestoInven()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyImpuestoInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyImpuestoInven()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyImpuestoInven();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyImpuestoInven(ImpuestoInven impuestoinven)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyImpuestoInven(ImpuestoInven impuestoinven,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyImpuestoInven()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyImpuestoInven()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyImpuestoInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyImpuestoInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroImpuestoInven()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyImpuestoInven()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyImpuestoInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyImpuestoInven()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormImpuestoInven.jComboBoxid_empresaImpuestoInven!=null && this.jInternalFrameDetalleFormImpuestoInven.jComboBoxid_empresaImpuestoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormImpuestoInven.jComboBoxid_empresaImpuestoInven.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ImpuestoInvenBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ImpuestoInvenBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ImpuestoInvenBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.impuestoinvenSessionBean=new ImpuestoInvenSessionBean(); 
		this.impuestoinvenConstantesFunciones=new ImpuestoInvenConstantesFunciones(); 
		this.impuestoinvenBean=new ImpuestoInven();//(this.impuestoinvenConstantesFunciones); 		
		this.impuestoinvenReturnGeneral=new ImpuestoInvenParameterReturnGeneral(); 
		
		this.impuestoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.impuestoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ImpuestoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ImpuestoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ImpuestoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessImpuestoInven(true);
			
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
			
			this.impuestoinvenConstantesFunciones=new ImpuestoInvenConstantesFunciones(); 
			this.impuestoinvenBean=new ImpuestoInven();//this.impuestoinvenConstantesFunciones); 			
			this.impuestoinvenReturnGeneral=new ImpuestoInvenParameterReturnGeneral(); 
		
			ImpuestoInvenBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Impuesto Inven Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.impuestoinven=new ImpuestoInven();
			this.impuestoinvens = new ArrayList<ImpuestoInven>();
			this.impuestoinvensAux = new ArrayList<ImpuestoInven>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic=new ImpuestoInvenLogic();
				this.impuestoinvenLogic.getNewConnexionToDeep("");
			}
			
			//this.impuestoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.impuestoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormImpuestoInven);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoImpuestoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoImpuestoInven);	
					}
					
					if(this.jInternalFrameImportacionImpuestoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionImpuestoInven);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByImpuestoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByImpuestoInven);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormImpuestoInven!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormImpuestoInven);
				this.jInternalFrameDetalleFormImpuestoInven.setVisible(false);
				this.jInternalFrameDetalleFormImpuestoInven.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoImpuestoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoImpuestoInven);
					this.jInternalFrameReporteDinamicoImpuestoInven.setVisible(false);
					this.jInternalFrameReporteDinamicoImpuestoInven.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionImpuestoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionImpuestoInven);
					this.jInternalFrameImportacionImpuestoInven.setVisible(false);
					this.jInternalFrameImportacionImpuestoInven.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByImpuestoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByImpuestoInven);
					this.jInternalFrameOrderByImpuestoInven.setVisible(false);
					this.jInternalFrameOrderByImpuestoInven.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idImpuestoInvenActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ImpuestoInvenConstantesFunciones.INUMEROPAGINACION;
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
			
			this.impuestoinvenReturnGeneral=new ImpuestoInvenParameterReturnGeneral();
			
			this.impuestoinvenParameterGeneral=new ImpuestoInvenParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.impuestoinvenLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ImpuestoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ProductoImpuestoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(DetalleImpuestoInvenConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ImpuestoInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.impuestoinvenSessionBean.getEsGuardarRelacionado(),this.impuestoinvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ImpuestoInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.impuestoinvenSessionBean.getEsGuardarRelacionado(),this.impuestoinvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoImpuestoInven=false;
			this.isVisibilidadCeldaDuplicarImpuestoInven=true;
			this.isVisibilidadCeldaCopiarImpuestoInven=true;
			this.isVisibilidadCeldaVerFormImpuestoInven=true;
			this.isVisibilidadCeldaOrdenImpuestoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesImpuestoInven=false;
			this.isVisibilidadCeldaModificarImpuestoInven=false;
			this.isVisibilidadCeldaActualizarImpuestoInven=false;
			this.isVisibilidadCeldaEliminarImpuestoInven=false;
			this.isVisibilidadCeldaCancelarImpuestoInven=false;
			this.isVisibilidadCeldaGuardarImpuestoInven=false;
			this.isVisibilidadCeldaGuardarCambiosImpuestoInven=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesImpuestoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosImpuestoInven();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioImpuestoInven(false);
			
			this.setPermisosUsuarioImpuestoInven();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado() 
				|| (this.impuestoinvenSessionBean.getEsGuardarRelacionado() && this.impuestoinvenSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioImpuestoInvenClasesRelacionadas();
			}
			
			if(this.impuestoinvenSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioImpuestoInvenClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosImpuestoInven();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualImpuestoInven();
			}
			
			if(!this.isPermisoBusquedaImpuestoInven) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasImpuestoInven.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioImpuestoInven,this.isPermisoPaginacionMedioImpuestoInven,this.isPermisoPaginacionTodoImpuestoInven);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ImpuestoInvenConstantesFunciones.getTiposSeleccionarImpuestoInven());
				
				this.tiposColumnasSelect=ImpuestoInvenConstantesFunciones.getTiposSeleccionarImpuestoInven(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectImpuestoInven();				
				//this.tiposRelacionesSelect=ImpuestoInvenConstantesFunciones.getTiposRelacionesImpuestoInven(true);
				
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
			//if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioImpuestoInven();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioImpuestoInven(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioImpuestoInven(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesImpuestoInven() ;
			
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
			
			
			this.productoimpuestoLogic=new ProductoImpuestoLogic();
			this.detalleimpuestoinvenLogic=new DetalleImpuestoInvenLogic(); 
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
				impuestoinvenImplementable= (ImpuestoInvenImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ImpuestoInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				impuestoinvenImplementableHome= (ImpuestoInvenImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ImpuestoInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.impuestoinvens= new ArrayList<ImpuestoInven>();
			this.impuestoinvensEliminados= new ArrayList<ImpuestoInven>();
						
			this.isEsNuevoImpuestoInven=false;
			this.esParaAccionDesdeFormularioImpuestoInven=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyImpuestoInven(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroImpuestoInven();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ImpuestoInvenBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ImpuestoInvenConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesImpuestoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingImpuestoInven(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormImpuestoInven!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioImpuestoInven();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioImpuestoInven();
			}
			
			ImpuestoInvenBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasImpuestoInven.getTabCount(); i++) {
					this.jTabbedPaneBusquedasImpuestoInven.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasImpuestoInven.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessImpuestoInven(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ImpuestoInven: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectImpuestoInven() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesImpuestoInven")) {
				iIndex=this.jInternalFrameDetalleFormImpuestoInven.jTabbedPaneRelacionesImpuestoInven.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormImpuestoInven.jTabbedPaneRelacionesImpuestoInven.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosImpuestoInven.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Impuesto Invenes")) {
					if(!DetalleImpuestoInvenJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessImpuestoInven();

						this.cargarParteTabPanelRelacionadaDetalleImpuestoInven(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Producto Impuestos")) {
					if(!ProductoImpuestoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessImpuestoInven();

						this.cargarParteTabPanelRelacionadaProductoImpuesto(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessImpuestoInven();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleImpuestoInven(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormImpuestoInven.cargarSessionConBeanSwingJInternalFrameDetalleImpuestoInven(false,true,iIndex);
		this.jButtonDetalleImpuestoInvenActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleImpuestoInven();

		//this.jTabbedPaneRelacionesImpuestoInven.updateUI();
		//this.jTabbedPaneRelacionesImpuestoInven.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesImpuestoInven.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProductoImpuesto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormImpuestoInven.cargarSessionConBeanSwingJInternalFrameProductoImpuesto(false,true,iIndex);
		this.jButtonProductoImpuestoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProductoImpuesto();

		//this.jTabbedPaneRelacionesImpuestoInven.updateUI();
		//this.jTabbedPaneRelacionesImpuestoInven.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesImpuestoInven.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ProductoImpuesto")) {
				int row=this.jTableDatosImpuestoInven.getSelectedRow();
				jButtonProductoImpuestoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("DetalleImpuestoInven")) {
				int row=this.jTableDatosImpuestoInven.getSelectedRow();
				jButtonDetalleImpuestoInvenActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Producto Impuesto")) {

					if(this.isTienePermisosProductoImpuesto && this.impuestoinvenConstantesFunciones.mostrarProductoImpuestoImpuestoInven && !ImpuestoInvenConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Producto Impuestos"+"("+ProductoImpuestoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Producto Impuestos");

						if(impuestoinvenConstantesFunciones.resaltarProductoImpuestoImpuestoInven!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(impuestoinvenConstantesFunciones.resaltarProductoImpuestoImpuestoInven);
						}

						jmenuItem.setEnabled(this.impuestoinvenConstantesFunciones.activarProductoImpuestoImpuestoInven);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ProductoImpuesto"));

						

						this.jInternalFrameDetalleFormImpuestoInven.jmenuDetalleImpuestoInven.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Detalle Impuesto Inven")) {

					if(this.isTienePermisosDetalleImpuestoInven && this.impuestoinvenConstantesFunciones.mostrarDetalleImpuestoInvenImpuestoInven && !ImpuestoInvenConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Impuesto Invenes"+"("+DetalleImpuestoInvenConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Impuesto Invenes");

						if(impuestoinvenConstantesFunciones.resaltarDetalleImpuestoInvenImpuestoInven!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(impuestoinvenConstantesFunciones.resaltarDetalleImpuestoInvenImpuestoInven);
						}

						jmenuItem.setEnabled(this.impuestoinvenConstantesFunciones.activarDetalleImpuestoInvenImpuestoInven);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleImpuestoInven"));

						

						this.jInternalFrameDetalleFormImpuestoInven.jmenuDetalleImpuestoInven.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyImpuestoInven(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyImpuestoInven(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyImpuestoInven(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyImpuestoInvenListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyImpuestoInven();
		
		this.cargarCombosFrameForeignKeyImpuestoInven();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyImpuestoInven();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyImpuestoInven();
		}
	}
	
	
	
	public void jButtonNuevoImpuestoInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.impuestoinvenSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormImpuestoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
			
			
			if(jTableDatosImpuestoInven.getRowCount()>=1) {
				jTableDatosImpuestoInven.removeRowSelectionInterval(0, jTableDatosImpuestoInven.getRowCount()-1);						
			}
			
			this.isEsNuevoImpuestoInven=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoImpuestoInven(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesImpuestoInven(true);			
			//this.impuestoinven=new ImpuestoInven();
			//this.impuestoinven.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesImpuestoInven(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualImpuestoInven() ;
			
			if(ImpuestoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleImpuestoInven(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.impuestoinven);	
			this.actualizarInformacion("INFO_PADRE",false,this.impuestoinven);				
			
			ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
			
			if(this.impuestoinvenSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ImpuestoInven: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarImpuestoInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ImpuestoInven> impuestoinvensSeleccionados=new ArrayList<ImpuestoInven>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosImpuestoInven.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosImpuestoInven.getSelectedRows().length;			
			}
			
			impuestoinvensSeleccionados=this.getImpuestoInvensSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoImpuestoInven--;			
				//ImpuestoInven impuestoinvenAux= new ImpuestoInven();			
				//impuestoinvenAux.setId(this.iIdNuevoImpuestoInven);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ImpuestoInven impuestoinvenOrigen=new ImpuestoInven();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ImpuestoInven impuestoinvenOrigen : impuestoinvensSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosImpuestoInven.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							impuestoinvenOrigen =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							impuestoinvenOrigen =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaImpuestoInven();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.impuestoinven.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosImpuestoInven(impuestoinvenOrigen,this.impuestoinven,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysImpuestoInven(this.impuestoinven);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.impuestoinvenLogic.getImpuestoInvens().add(this.impuestoinvenAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.impuestoinvens.add(this.impuestoinvenAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaImpuestoInven(false);
				
				this.jTableDatosImpuestoInven.setRowSelectionInterval(this.getIndiceNuevoImpuestoInven(), this.getIndiceNuevoImpuestoInven());
				
				int iLastRow =  this.jTableDatosImpuestoInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosImpuestoInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosImpuestoInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaImpuestoInven(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ImpuestoInven> impuestoinvensSeleccionados=new ArrayList<ImpuestoInven>();									
		
			ImpuestoInven impuestoinvenOrigen=new ImpuestoInven();
			ImpuestoInven impuestoinvenDestino=new ImpuestoInven();
				
			impuestoinvensSeleccionados=this.getImpuestoInvensSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosImpuestoInven.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || impuestoinvensSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosImpuestoInven.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						impuestoinvenOrigen =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						impuestoinvenOrigen =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						impuestoinvenDestino =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						impuestoinvenDestino =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				impuestoinvenOrigen =impuestoinvensSeleccionados.get(0);
				impuestoinvenDestino =impuestoinvensSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosImpuestoInven(impuestoinvenOrigen,impuestoinvenDestino,true,false);
				
				impuestoinvenDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(impuestoinvenDestino,impuestoinvenLogic.getImpuestoInvens());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(impuestoinvenDestino,impuestoinvens);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaImpuestoInven(false);
				
				//this.jTableDatosImpuestoInven.setRowSelectionInterval(this.getIndiceNuevoImpuestoInven(), this.getIndiceNuevoImpuestoInven());
				
				int iLastRow =  this.jTableDatosImpuestoInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosImpuestoInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosImpuestoInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaImpuestoInven(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormImpuestoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormImpuestoInven.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesImpuestoInven.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasImpuestoInven.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesImpuestoInven.setVisible(!isVisible);
			this.jPanelPaginacionImpuestoInven.setVisible(!isVisible);
			this.jPanelAccionesImpuestoInven.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameImpuestoInven();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoImpuestoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionImpuestoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByImpuestoInven();
			
			this.abrirFrameOrderByImpuestoInven();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByImpuestoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleImpuestoInven(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormImpuestoInven);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormImpuestoInven.isMaximum()) {
					this.jInternalFrameDetalleFormImpuestoInven.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormImpuestoInven.setSize(this.jInternalFrameDetalleFormImpuestoInven.iWidthFormulario,this.jInternalFrameDetalleFormImpuestoInven.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormImpuestoInven.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormImpuestoInven.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormImpuestoInven.isMaximum()) {
						this.jInternalFrameDetalleFormImpuestoInven.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormImpuestoInven.jContentPaneDetalleImpuestoInven.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormImpuestoInven.jTabbedPaneRelacionesImpuestoInven.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormImpuestoInven.jContentPaneDetalleImpuestoInven.getWidth(),ImpuestoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormImpuestoInven.jTabbedPaneRelacionesImpuestoInven.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormImpuestoInven.jContentPaneDetalleImpuestoInven.getWidth(),ImpuestoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormImpuestoInven.jTabbedPaneRelacionesImpuestoInven.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormImpuestoInven.jContentPaneDetalleImpuestoInven.getWidth(),ImpuestoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleImpuestoInvenJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleImpuestoInven();
					}

					if(ProductoImpuestoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProductoImpuesto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormImpuestoInven.setVisible(true);
	        this.jInternalFrameDetalleFormImpuestoInven.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByImpuestoInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByImpuestoInven==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByImpuestoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByImpuestoInven,false,this);
				} else {
					this.jInternalFrameOrderByImpuestoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByImpuestoInven,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByImpuestoInven);
				this.jInternalFrameOrderByImpuestoInven.setVisible(false);
				this.jInternalFrameOrderByImpuestoInven.setSelected(false);
				
				this.jInternalFrameOrderByImpuestoInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByImpuestoInven"));
				
				this.inicializarActualizarBindingTablaOrderByImpuestoInven();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionImpuestoInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionImpuestoInven==null) {
				
				this.jInternalFrameImportacionImpuestoInven=new ImportacionJInternalFrame(ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionImpuestoInven);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionImpuestoInven);
				this.jInternalFrameImportacionImpuestoInven.setVisible(false);
				this.jInternalFrameImportacionImpuestoInven.setSelected(false);


				this.jInternalFrameImportacionImpuestoInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionImpuestoInven"));
				this.jInternalFrameImportacionImpuestoInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionImpuestoInven"));
				this.jInternalFrameImportacionImpuestoInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionImpuestoInven"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoImpuestoInven() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoImpuestoInven==null) {
				this.jInternalFrameReporteDinamicoImpuestoInven=new ReporteDinamicoJInternalFrame(ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoImpuestoInven);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoImpuestoInven);
				this.jInternalFrameReporteDinamicoImpuestoInven.setVisible(false);
				this.jInternalFrameReporteDinamicoImpuestoInven.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoImpuestoInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoImpuestoInven"));
				this.jInternalFrameReporteDinamicoImpuestoInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoImpuestoInven"));
				this.jInternalFrameReporteDinamicoImpuestoInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoImpuestoInven"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualImpuestoInven();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleImpuestoInven() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.jScrollPanelDatosDetalleImpuestoInven.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormImpuestoInven.jContentPaneDetalleImpuestoInven.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.jScrollPanelDatosDetalleImpuestoInven.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.jScrollPanelDatosDetalleImpuestoInven.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.jScrollPanelDatosDetalleImpuestoInven.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProductoImpuesto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.jScrollPanelDatosProductoImpuesto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormImpuestoInven.jContentPaneDetalleImpuestoInven.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.jScrollPanelDatosProductoImpuesto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.jScrollPanelDatosProductoImpuesto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.jScrollPanelDatosProductoImpuesto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleImpuestoInven() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormImpuestoInven);
			
	       	this.jInternalFrameDetalleFormImpuestoInven.setVisible(false);
	        this.jInternalFrameDetalleFormImpuestoInven.setSelected(false);
			
			//this.jInternalFrameDetalleFormImpuestoInven.dispose();
			//this.jInternalFrameDetalleFormImpuestoInven=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoImpuestoInven() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoImpuestoInven.setVisible(true);
	        this.jInternalFrameReporteDinamicoImpuestoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionImpuestoInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionImpuestoInven.setVisible(true);
	        this.jInternalFrameImportacionImpuestoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByImpuestoInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByImpuestoInven.setVisible(true);
	        this.jInternalFrameOrderByImpuestoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByImpuestoInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByImpuestoInven.setVisible(false);
	        this.jInternalFrameOrderByImpuestoInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoImpuestoInven() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoImpuestoInven.setVisible(false);
	        this.jInternalFrameReporteDinamicoImpuestoInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionImpuestoInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionImpuestoInven.setVisible(false);
	        this.jInternalFrameImportacionImpuestoInven.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarImpuestoInven(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarImpuestoInven(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosImpuestoInven.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesImpuestoInven(true);
			//this.isEsNuevoImpuestoInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinven =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.impuestoinven =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesImpuestoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesImpuestoInven(false) ;
			
			if(impuestoinvenSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestoSessionBean.getEsGuardarRelacionado() && ProductoImpuestoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoImpuestoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado() && DetalleImpuestoInvenJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleImpuestoInvenActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(ImpuestoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleImpuestoInven(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualImpuestoInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaImpuestoInvenActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosImpuestoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinven =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.impuestoinven =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarImpuestoInven(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormImpuestoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosImpuestoInven.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesImpuestoInven(true);
			//this.isEsNuevoImpuestoInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinven =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.impuestoinven =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.impuestoinven.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesImpuestoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesImpuestoInven(false) ;
			
			if(ImpuestoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleImpuestoInven(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualImpuestoInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesImpuestoInven(false);
			
			//if(!this.isEsNuevoImpuestoInven) {								
				int intSelectedRow = this.jTableDatosImpuestoInven.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinven =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.impuestoinven =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ImpuestoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualImpuestoInven(this.impuestoinven,true);
				this.setVariablesFormularioToObjetoActualForeignKeysImpuestoInven(this.impuestoinven);
				
			}
			
			if(this.permiteMantenimiento(this.impuestoinven)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoImpuestoInven=true;
					this.inicializarActualizarBindingTablaImpuestoInven(false);
					this.isEsNuevoImpuestoInven=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoImpuestoInven=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoImpuestoInven=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesImpuestoInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualImpuestoInven(false);
				
				this.habilitarDeshabilitarControlesImpuestoInven(false);
			
												
				
				if(ImpuestoInvenJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleImpuestoInven();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoImpuestoInvenActionPerformed(evt,impuestoinvenSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualImpuestoInven(this.impuestoinven,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosImpuestoInven.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,impuestoinvenSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.impuestoinven.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ImpuestoInven.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ImpuestoInven.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosImpuestoInven.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinven =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				this.impuestoinven.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.impuestoinven =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				this.impuestoinven.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.impuestoinven)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ImpuestoInvenModel) this.jTableDatosImpuestoInven.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoImpuestoInven=true;
				this.inicializarActualizarBindingTablaImpuestoInven(false);
				this.isEsNuevoImpuestoInven=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesImpuestoInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualImpuestoInven(false);
				
				this.habilitarDeshabilitarControlesImpuestoInven(false);
				
				
				
				if(ImpuestoInvenJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleImpuestoInven();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosImpuestoInven.getRowCount()>=1) {
				jTableDatosImpuestoInven.removeRowSelectionInterval(0, jTableDatosImpuestoInven.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesImpuestoInven(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaImpuestoInven(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesImpuestoInven(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualImpuestoInven(false) ;
			
			this.isEsNuevoImpuestoInven=false;
			
			if(ImpuestoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleImpuestoInven();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingImpuestoInven(false);
				
				//SI ES MANUAL
				if(ImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualImpuestoInven();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoImpuestoInven--;			
			//ImpuestoInven impuestoinvenAux= new ImpuestoInven();			
			//impuestoinvenAux.setId(this.iIdNuevoImpuestoInven);
			
			if(this.jInternalFrameDetalleFormImpuestoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaImpuestoInven();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysImpuestoInven(this.impuestoinven);
			
			this.impuestoinven.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.impuestoinvenLogic.getImpuestoInvens().add(this.impuestoinvenAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.impuestoinvens.add(this.impuestoinvenAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaImpuestoInven(false);
			
			this.jTableDatosImpuestoInven.setRowSelectionInterval(this.getIndiceNuevoImpuestoInven(), this.getIndiceNuevoImpuestoInven());
			
			int iLastRow =  this.jTableDatosImpuestoInven.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosImpuestoInven.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosImpuestoInven.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaImpuestoInven(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingImpuestoInven(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingImpuestoInven(false);
			
			//SI ES MANUAL
			if(ImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualImpuestoInven();
			}
			
			//this.abrirFrameTreeImpuestoInven();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Impuesto InvenES ?", "MANTENIMIENTO DE Impuesto Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionImpuestoInven.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralImpuestoInven();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.impuestoinvenReturnGeneral=impuestoinvenLogic.procesarImportacionImpuestoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.impuestoinvenParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarImpuestoInvenReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionImpuestoInven.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionImpuestoInven.setFileImportacion(this.jInternalFrameImportacionImpuestoInven.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionImpuestoInven.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionImpuestoInven.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionImpuestoInven.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionImpuestoInven.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ImpuestoInven> impuestoinvensSeleccionados=new ArrayList<ImpuestoInven>();		

		impuestoinvensSeleccionados=this.getImpuestoInvensSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoImpuestoInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoImpuestoInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ImpuestoInvenBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ImpuestoInvenBaseDesign.jrxml";
			
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
			
			this.generarReporteImpuestoInvens("Todos",impuestoinvensSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Impuesto Inven",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoImpuestoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoImpuestoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ImpuestoInvenConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoImpuestoInven.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoImpuestoInven.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoImpuestoInven.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ImpuestoInvenConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoImpuestoInven.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ImpuestoInvenConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoImpuestoInven.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoImpuestoInven.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ImpuestoInvenConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ImpuestoInven> impuestoinvensSeleccionados=new ArrayList<ImpuestoInven>();		
		
		impuestoinvensSeleccionados=this.getImpuestoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"impuestoinven";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ImpuestoInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoImpuestoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoImpuestoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ImpuestoInven impuestoinven:impuestoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(impuestoinven.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ImpuestoInvenConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ImpuestoInvenConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ImpuestoInven impuestoinven:impuestoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(impuestoinven.getnombre());
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
			//	this.getFilaCabeceraExportarExcelImpuestoInven(row);				
			//	iRow++;
			//}				
			
			//for(ImpuestoInven impuestoinvenAux:impuestoinvensSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelImpuestoInven(impuestoinvenAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Impuesto Inven",JOptionPane.INFORMATION_MESSAGE);
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
				this.impuestoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingImpuestoInven(false);
			
			//SI ES MANUAL
			if(ImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualImpuestoInven();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingImpuestoInven(false);
			
			//SI ES MANUAL
			if(ImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualImpuestoInven();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingImpuestoInven(false);
			
			//SI ES MANUAL
			if(ImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualImpuestoInven();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaImpuestoInven() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosImpuestoInven.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosImpuestoInven.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosImpuestoInven.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosImpuestoInven.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosImpuestoInven.setMinimumSize(dimensionMinimum);
		this.jTableDatosImpuestoInven.setMaximumSize(dimensionMaximum);
		this.jTableDatosImpuestoInven.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingImpuestoInven(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingImpuestoInven(esInicializar,true);
	}
	
	public void inicializarActualizarBindingImpuestoInven(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaImpuestoInven(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesImpuestoInven(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasImpuestoInven(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesImpuestoInven(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesImpuestoInven(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ImpuestoInvenJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualImpuestoInven() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaImpuestoInven();
		
		this.inicializarActualizarBindingBotonesManualImpuestoInven(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualImpuestoInven();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesImpuestoInven() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualImpuestoInven(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualImpuestoInven(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosImpuestoInven.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosImpuestoInven.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteImpuestoInven.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormImpuestoInven!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormImpuestoInven.jCheckBoxPostAccionNuevoImpuestoInven.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormImpuestoInven.jCheckBoxPostAccionSinCerrarImpuestoInven.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormImpuestoInven.jCheckBoxPostAccionSinMensajeImpuestoInven.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosImpuestoInven.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosImpuestoInven.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteImpuestoInven.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormImpuestoInven!=null) {
				this.jInternalFrameDetalleFormImpuestoInven.jCheckBoxPostAccionNuevoImpuestoInven.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormImpuestoInven.jCheckBoxPostAccionSinCerrarImpuestoInven.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormImpuestoInven.jCheckBoxPostAccionSinMensajeImpuestoInven.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionImpuestoInven.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionImpuestoInven.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormImpuestoInven!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormImpuestoInven.jComboBoxTiposAccionesFormularioImpuestoInven.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesImpuestoInven.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoImpuestoInven!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoImpuestoInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesImpuestoInven.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesImpuestoInven.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarImpuestoInven.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesImpuestoInven.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoImpuestoInven!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoImpuestoInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesImpuestoInven.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralImpuestoInven.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesImpuestoInven(Boolean esInicializar) throws Exception {
		try	{	
			if(ImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualImpuestoInven(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesImpuestoInven() throws Exception {
		try	{
			if(ImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualImpuestoInven();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleImpuestoInven() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormImpuestoInven.jComboBoxTiposAccionesFormularioImpuestoInven.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormImpuestoInven.jComboBoxTiposAccionesFormularioImpuestoInven.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualImpuestoInven() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesImpuestoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesImpuestoInven.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesImpuestoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesImpuestoInven.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesImpuestoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesImpuestoInven.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionImpuestoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionImpuestoInven.addItem(reporte);
			}
			
			
			if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionImpuestoInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionImpuestoInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesImpuestoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesImpuestoInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesImpuestoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesImpuestoInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormImpuestoInven.jComboBoxTiposAccionesFormularioImpuestoInven.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormImpuestoInven.jComboBoxTiposAccionesFormularioImpuestoInven.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarImpuestoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarImpuestoInven.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarImpuestoInven.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualImpuestoInven();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualImpuestoInven() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoImpuestoInven!=null) {
				this.jInternalFrameReporteDinamicoImpuestoInven.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoImpuestoInven.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoImpuestoInven!=null) {
				this.jInternalFrameReporteDinamicoImpuestoInven.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoImpuestoInven.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoImpuestoInven!=null) {
				
				if(this.jInternalFrameReporteDinamicoImpuestoInven.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoImpuestoInven.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoImpuestoInven.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoImpuestoInven.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoImpuestoInven.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoImpuestoInven.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualImpuestoInven()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreImpuestoInven.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasImpuestoInven(Boolean esInicializar) throws Exception {				
		if(ImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualImpuestoInven();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaImpuestoInven() throws Exception {
		this.inicializarActualizarBindingTablaImpuestoInven(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByImpuestoInven() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByImpuestoInven.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByImpuestoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByImpuestoInven.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ImpuestoInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByImpuestoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByImpuestoInven.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ImpuestoInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosImpuestoInvenOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosImpuestoInvenOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ImpuestoInvenPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByImpuestoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByImpuestoInven.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ImpuestoInvenPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByImpuestoInven.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaImpuestoInven(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=impuestoinvenLogic.getImpuestoInvens().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=impuestoinvens.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ImpuestoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosImpuestoInven.setModel(new ImpuestoInvenModel(this.impuestoinvenLogic.getImpuestoInvens(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosImpuestoInven.setModel(new ImpuestoInvenModel(this.impuestoinvens,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByImpuestoInven!=null && this.jInternalFrameOrderByImpuestoInven.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByImpuestoInven();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosImpuestoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosImpuestoInven,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ImpuestoInvenPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO,impuestoinvenConstantesFunciones.resaltarSeleccionarImpuestoInven,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO,impuestoinvenConstantesFunciones.resaltarSeleccionarImpuestoInven,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosImpuestoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosImpuestoInven,ImpuestoInvenConstantesFunciones.LABEL_ID));

		if(this.impuestoinvenConstantesFunciones.mostraridImpuestoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ImpuestoInvenConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.impuestoinvenConstantesFunciones.resaltaridImpuestoInven,this.impuestoinvenConstantesFunciones.activaridImpuestoInven,this,true,"idImpuestoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.impuestoinvenConstantesFunciones.resaltaridImpuestoInven,this.impuestoinvenConstantesFunciones.activaridImpuestoInven,this,true,"idImpuestoInven","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosImpuestoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosImpuestoInven,ImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA));

		if(this.impuestoinvenConstantesFunciones.mostrarid_empresaImpuestoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.impuestoinvenConstantesFunciones.resaltarid_empresaImpuestoInven,this,this.impuestoinvenConstantesFunciones.activarid_empresaImpuestoInven));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.impuestoinvenConstantesFunciones.resaltarid_empresaImpuestoInven,this,this.impuestoinvenConstantesFunciones.activarid_empresaImpuestoInven,false,"id_empresaImpuestoInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ImpuestoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosImpuestoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosImpuestoInven,ImpuestoInvenConstantesFunciones.LABEL_NOMBRE));

		if(this.impuestoinvenConstantesFunciones.mostrarnombreImpuestoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ImpuestoInvenConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.impuestoinvenConstantesFunciones.resaltarnombreImpuestoInven,this.impuestoinvenConstantesFunciones.activarnombreImpuestoInven,this,true,"nombreImpuestoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.impuestoinvenConstantesFunciones.resaltarnombreImpuestoInven,this.impuestoinvenConstantesFunciones.activarnombreImpuestoInven,this,true,"nombreImpuestoInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ImpuestoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosProductoImpuesto && this.impuestoinvenConstantesFunciones.mostrarProductoImpuestoImpuestoInven && !ImpuestoInvenConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Producto Impuestos");
				tableColumn.setHeaderValue("Producto Impuestos");
				tableColumn.setCellRenderer(new ProductoImpuestoTableCell(impuestoinvenConstantesFunciones.resaltarProductoImpuestoImpuestoInven,this,this.impuestoinvenConstantesFunciones.activarProductoImpuestoImpuestoInven));
				tableColumn.setCellEditor(new ProductoImpuestoTableCell(impuestoinvenConstantesFunciones.resaltarProductoImpuestoImpuestoInven,this,this.impuestoinvenConstantesFunciones.activarProductoImpuestoImpuestoInven));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosImpuestoInven.addColumn(tableColumn);
			}

			if(this.isTienePermisosDetalleImpuestoInven && this.impuestoinvenConstantesFunciones.mostrarDetalleImpuestoInvenImpuestoInven && !ImpuestoInvenConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Impuesto Invenes");
				tableColumn.setHeaderValue("Detalle Impuesto Invenes");
				tableColumn.setCellRenderer(new DetalleImpuestoInvenTableCell(impuestoinvenConstantesFunciones.resaltarDetalleImpuestoInvenImpuestoInven,this,this.impuestoinvenConstantesFunciones.activarDetalleImpuestoInvenImpuestoInven));
				tableColumn.setCellEditor(new DetalleImpuestoInvenTableCell(impuestoinvenConstantesFunciones.resaltarDetalleImpuestoInvenImpuestoInven,this,this.impuestoinvenConstantesFunciones.activarDetalleImpuestoInvenImpuestoInven));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosImpuestoInven.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.impuestoinvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.impuestoinvenSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosImpuestoInven.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.impuestoinvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.impuestoinvenSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosImpuestoInven.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarImpuestoInven && this.isPermisoGuardarCambiosImpuestoInven) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.impuestoinvenSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.impuestoinvenSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosImpuestoInven.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.impuestoinvenSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosImpuestoInven.addColumn(tableColumn);
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
			
			this.jTableDatosImpuestoInven.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarImpuestoInven && this.isPermisoGuardarCambiosImpuestoInven) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.impuestoinvenSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarImpuestoInven && this.isPermisoGuardarCambiosImpuestoInven) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosImpuestoInven.moveColumn(this.jTableDatosImpuestoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosImpuestoInven.moveColumn(this.jTableDatosImpuestoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.impuestoinvenSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosImpuestoInven.moveColumn(this.jTableDatosImpuestoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosImpuestoInven.moveColumn(this.jTableDatosImpuestoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosImpuestoInven.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosImpuestoInven.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosImpuestoInven,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ImpuestoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosImpuestoInven.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosImpuestoInven.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ImpuestoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ImpuestoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosImpuestoInven.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosImpuestoInven.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosImpuestoInven.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=impuestoinvenLogic.getImpuestoInvens().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=impuestoinvens.size()-1;
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
		//this.jTableDatosImpuestoInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosImpuestoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosImpuestoInven();
			
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
				
				//this.isEsNuevoImpuestoInven=false;
					
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
			
				if(this.impuestoinvenSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormImpuestoInven==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosImpuestoInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosImpuestoInven.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinven =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.impuestoinven =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.impuestoinven.getsType().equals("DUPLICADO")
				   || this.impuestoinven.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoImpuestoInven=true;
				
				} else {
					this.isEsNuevoImpuestoInven=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
					if(this.impuestoinven.getId()>=0 && !this.impuestoinven.getIsNew()) {						
						this.isEsNuevoImpuestoInven=false;
						
					} else {
						this.isEsNuevoImpuestoInven=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoImpuestoInven(esRelaciones);						
				
				this.seleccionarImpuestoInven(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.impuestoinven.getId()<0) {
					this.isEsNuevoImpuestoInven=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarImpuestoInven(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarImpuestoInven(evt,rowIndex);
				}	
				
				if(this.impuestoinvenSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ImpuestoInven: " + this.dDif); 
					}
				}								
				
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarImpuestoInven(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.impuestoinven)) {
					if(this.impuestoinven.getId()>0) {
						this.impuestoinven.setIsDeleted(true);
						
						this.impuestoinvensEliminados.add(this.impuestoinven);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.impuestoinvenLogic.getImpuestoInvens().remove(this.impuestoinven);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.impuestoinvens.remove(this.impuestoinven);				
					}
					
					
					((ImpuestoInvenModel) this.jTableDatosImpuestoInven.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaImpuestoInven(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarImpuestoInven(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoImpuestoInven) {
			
			if(this.jInternalFrameDetalleFormImpuestoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosImpuestoInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosImpuestoInven.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinven =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.impuestoinven =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ImpuestoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioImpuestoInven(this.impuestoinven);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.impuestoinvenConstantesFunciones.cargarid_empresaImpuestoInven || this.impuestoinvenConstantesFunciones.event_dependid_empresaImpuestoInven) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.impuestoinven.getid_empresa());
									//this.inicializarActualizarBindingImpuestoInven(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(impuestoinven.getEmpresa()!=null) {
							this.empresasForeignKey.add(impuestoinven.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.impuestoinven.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesImpuestoInven("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesImpuestoInven(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualImpuestoInven() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoImpuestoInven(ImpuestoInven impuestoinven) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoImpuestoInven(impuestoinven,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoImpuestoInven(ImpuestoInven impuestoinven,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioImpuestoInven(impuestoinven);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyImpuestoInven(impuestoinven,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyImpuestoInven(impuestoinven);
	}
	
	public void setVariablesObjetoActualToFormularioImpuestoInven(ImpuestoInven impuestoinven) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormImpuestoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormImpuestoInven.jLabelidImpuestoInven.setText(impuestoinven.getId().toString());
			this.jInternalFrameDetalleFormImpuestoInven.jTextAreanombreImpuestoInven.setText(impuestoinven.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ImpuestoInven impuestoinvenLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,impuestoinvenLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ImpuestoInven impuestoinvenLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				impuestoinvenLocal=this.impuestoinven;
			} else {
				impuestoinvenLocal=this.impuestoinvenAnterior;
			}
		}
		
		if(this.permiteMantenimiento(impuestoinvenLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoImpuestoInven(impuestoinvenLocal,true);
					
					if(impuestoinvenSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(impuestoinvenLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(impuestoinvenLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoImpuestoInven(ImpuestoInven impuestoinven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualImpuestoInven(impuestoinven,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysImpuestoInven(impuestoinven);
	}
	
	public void setVariablesFormularioToObjetoActualImpuestoInven(ImpuestoInven impuestoinven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualImpuestoInven(impuestoinven,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualImpuestoInven(ImpuestoInven impuestoinven,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormImpuestoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormImpuestoInven.jLabelidImpuestoInven.getText()==null || this.jInternalFrameDetalleFormImpuestoInven.jLabelidImpuestoInven.getText()=="" || this.jInternalFrameDetalleFormImpuestoInven.jLabelidImpuestoInven.getText()=="Id") {
				this.jInternalFrameDetalleFormImpuestoInven.jLabelidImpuestoInven.setText("0");
			}

			if(conColumnasBase) {impuestoinven.setId(Long.parseLong(this.jInternalFrameDetalleFormImpuestoInven.jLabelidImpuestoInven.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ImpuestoInvenConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormImpuestoInven.jLabelIdImpuestoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			impuestoinven.setnombre(this.jInternalFrameDetalleFormImpuestoInven.jTextAreanombreImpuestoInven.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ImpuestoInvenConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormImpuestoInven.jLabelnombreImpuestoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualImpuestoInven(ImpuestoInven impuestoinvenBean,ImpuestoInven impuestoinven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosImpuestoInven(ImpuestoInven impuestoinvenOrigen,ImpuestoInven impuestoinven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && impuestoinvenOrigen.getId()!=null && !impuestoinvenOrigen.getId().equals(0L))) {impuestoinven.setId(impuestoinvenOrigen.getId());}}
			if(conDefault || (!conDefault && impuestoinvenOrigen.getnombre()!=null && !impuestoinvenOrigen.getnombre().equals(""))) {impuestoinven.setnombre(impuestoinvenOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioImpuestoInven(ImpuestoInven impuestoinven) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormImpuestoInven.jLabelidImpuestoInven.setText(impuestoinven.getId().toString());
			this.jInternalFrameDetalleFormImpuestoInven.jTextAreanombreImpuestoInven.setText(impuestoinven.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioImpuestoInven(ImpuestoInvenBean impuestoinvenBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormImpuestoInven.jLabelidImpuestoInven.setText(impuestoinvenBean.getId().toString());
			this.jInternalFrameDetalleFormImpuestoInven.jTextAreanombreImpuestoInven.setText(impuestoinvenBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanImpuestoInven(ImpuestoInvenParameterReturnGeneral impuestoinvenReturnGeneral,ImpuestoInvenBean impuestoinvenBean,Boolean conDefault) throws Exception { 
		try {
			ImpuestoInven impuestoinvenLocal=new ImpuestoInven();
			
			impuestoinvenLocal=impuestoinvenReturnGeneral.getImpuestoInven();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && impuestoinvenLocal.getId()!=null && !impuestoinvenLocal.getId().equals(0L))) {impuestoinvenBean.setId(impuestoinvenLocal.getId());}}
			if(conDefault || (!conDefault && impuestoinvenLocal.getnombre()!=null && !impuestoinvenLocal.getnombre().equals(""))) {impuestoinvenBean.setnombre(impuestoinvenLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxImpuestoInvenGenerico(Long idImpuestoInvenSeleccionado,JComboBox jComboBoxImpuestoInven,List<ImpuestoInven> impuestoinvensLocal)throws Exception {
		try {
			ImpuestoInven  impuestoinvenTemp=null;

			for(ImpuestoInven impuestoinvenAux:impuestoinvensLocal) {
				if(impuestoinvenAux.getId()!=null && impuestoinvenAux.getId().equals(idImpuestoInvenSeleccionado)) {
					impuestoinvenTemp=impuestoinvenAux;
					break;
				}
			}

			jComboBoxImpuestoInven.setSelectedItem(impuestoinvenTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxImpuestoInvenGenerico(JComboBox jComboBoxImpuestoInven,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxImpuestoInven.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxImpuestoInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxImpuestoInven.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxImpuestoInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ProductoImpuesto")) {
			jButtonProductoImpuestoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("DetalleImpuestoInven")) {
			jButtonDetalleImpuestoInvenActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			impuestoinven=(ImpuestoInven) impuestoinvenLogic.getImpuestoInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			impuestoinven =(ImpuestoInven) impuestoinvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!impuestoinven.getIsNew() && !impuestoinven.getIsChanged() && !impuestoinven.getIsDeleted()) {
				sDescripcion=impuestoinven.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=impuestoinven.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ImpuestoInven impuestoinvenRow=new ImpuestoInven();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			impuestoinvenRow=(ImpuestoInven) impuestoinvenLogic.getImpuestoInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			impuestoinvenRow=(ImpuestoInven) impuestoinvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonProductoImpuestoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,ImpuestoInven impuestoinven) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormImpuestoInven==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.impuestoinven = (ImpuestoInven)this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.impuestoinven = (ImpuestoInven)this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(impuestoinven!=null) {
						this.impuestoinven = impuestoinven;
					} else {
						this.impuestoinven = new ImpuestoInven();
					}
				}

				if(this.isTienePermisosProductoImpuesto && this.permiteMantenimiento(this.impuestoinven)) {
					ProductoImpuestoBeanSwingJInternalFrame productoimpuestoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFramePopup=new ProductoImpuestoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoimpuestoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFramePopup;
					} else {
						productoimpuestoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame;
					}

					List<ImpuestoInven> impuestoinvens=new ArrayList<ImpuestoInven>();
					impuestoinvens.add(this.impuestoinven);
					if(!esRelacionado) {
						//productoimpuestoBeanSwingJInternalFrame.productoimpuestoSessionBean.setConGuardarRelaciones(false);
						//productoimpuestoBeanSwingJInternalFrame.productoimpuestoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoimpuestoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormImpuestoInven.cargarProductoImpuestoBeanSwingJInternalFrame(impuestoinvens,this.impuestoinven,productoimpuestoBeanSwingJInternalFrame,/*conInicializar,*/productoimpuestoBeanSwingJInternalFrame.productoimpuestoSessionBean.getConGuardarRelaciones(),productoimpuestoBeanSwingJInternalFrame.productoimpuestoSessionBean.getEsGuardarRelacionado());
					productoimpuestoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoimpuestoBeanSwingJInternalFrame.actualizarEstadoPanelsProductoImpuesto("no_relacionado");

						productoimpuestoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoImpuestoConstantesFunciones.ITAMANIOFILATABLA + (ProductoImpuestoConstantesFunciones.ITAMANIOFILATABLA/2));

						productoimpuestoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderImpuestoInven=(TitledBorder)this.jScrollPanelDatosImpuestoInven.getBorder();
						TitledBorder titledBorderProductoImpuesto=(TitledBorder)productoimpuestoBeanSwingJInternalFrame.jScrollPanelDatosProductoImpuesto.getBorder();

						titledBorderProductoImpuesto.setTitle(titledBorderImpuestoInven.getTitle() + " -> Producto Impuesto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoimpuestoBeanSwingJInternalFrame);
						}

						productoimpuestoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoimpuestoBeanSwingJInternalFrame);

						productoimpuestoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.impuestoinvenSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Producto Impuesto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonDetalleImpuestoInvenActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,ImpuestoInven impuestoinven) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormImpuestoInven==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.impuestoinven = (ImpuestoInven)this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.impuestoinven = (ImpuestoInven)this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(impuestoinven!=null) {
						this.impuestoinven = impuestoinven;
					} else {
						this.impuestoinven = new ImpuestoInven();
					}
				}

				if(this.isTienePermisosDetalleImpuestoInven && this.permiteMantenimiento(this.impuestoinven)) {
					DetalleImpuestoInvenBeanSwingJInternalFrame detalleimpuestoinvenBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFramePopup=new DetalleImpuestoInvenBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleimpuestoinvenBeanSwingJInternalFrame=this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFramePopup;
					} else {
						detalleimpuestoinvenBeanSwingJInternalFrame=this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame;
					}

					List<ImpuestoInven> impuestoinvens=new ArrayList<ImpuestoInven>();
					impuestoinvens.add(this.impuestoinven);
					if(!esRelacionado) {
						//detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenSessionBean.setConGuardarRelaciones(false);
						//detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleimpuestoinvenBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormImpuestoInven.cargarDetalleImpuestoInvenBeanSwingJInternalFrame(impuestoinvens,this.impuestoinven,detalleimpuestoinvenBeanSwingJInternalFrame,/*conInicializar,*/detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenSessionBean.getConGuardarRelaciones(),detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado());
					detalleimpuestoinvenBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleimpuestoinvenBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleImpuestoInven("no_relacionado");

						detalleimpuestoinvenBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleImpuestoInvenConstantesFunciones.ITAMANIOFILATABLA + (DetalleImpuestoInvenConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleimpuestoinvenBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderImpuestoInven=(TitledBorder)this.jScrollPanelDatosImpuestoInven.getBorder();
						TitledBorder titledBorderDetalleImpuestoInven=(TitledBorder)detalleimpuestoinvenBeanSwingJInternalFrame.jScrollPanelDatosDetalleImpuestoInven.getBorder();

						titledBorderDetalleImpuestoInven.setTitle(titledBorderImpuestoInven.getTitle() + " -> Detalle Impuesto Inven");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleimpuestoinvenBeanSwingJInternalFrame);
						}

						detalleimpuestoinvenBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleimpuestoinvenBeanSwingJInternalFrame);

						detalleimpuestoinvenBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.impuestoinvenSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Impuesto Inven",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualImpuestoInven(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoImpuestoInven.setVisible((this.isVisibilidadCeldaNuevoImpuestoInven && this.isPermisoNuevoImpuestoInven));			
			this.jButtonDuplicarImpuestoInven.setVisible((this.isVisibilidadCeldaDuplicarImpuestoInven && this.isPermisoDuplicarImpuestoInven));			
			this.jButtonCopiarImpuestoInven.setVisible((this.isVisibilidadCeldaCopiarImpuestoInven && this.isPermisoCopiarImpuestoInven));
			this.jButtonVerFormImpuestoInven.setVisible((this.isVisibilidadCeldaVerFormImpuestoInven && this.isPermisoVerFormImpuestoInven));
			
			this.jButtonAbrirOrderByImpuestoInven.setVisible((this.isVisibilidadCeldaOrdenImpuestoInven && this.isPermisoOrdenImpuestoInven));			
			
			this.jButtonNuevoRelacionesImpuestoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesImpuestoInven && this.isPermisoNuevoImpuestoInven));			
			this.jButtonNuevoGuardarCambiosImpuestoInven.setVisible((this.isVisibilidadCeldaNuevoImpuestoInven && this.isPermisoNuevoImpuestoInven && this.isPermisoGuardarCambiosImpuestoInven));
			
			if(this.jInternalFrameDetalleFormImpuestoInven!=null) {
			this.jInternalFrameDetalleFormImpuestoInven.jButtonModificarImpuestoInven.setVisible((this.isVisibilidadCeldaModificarImpuestoInven && this.isPermisoActualizarImpuestoInven));	
			this.jInternalFrameDetalleFormImpuestoInven.jButtonActualizarImpuestoInven.setVisible((this.isVisibilidadCeldaActualizarImpuestoInven && this.isPermisoActualizarImpuestoInven));	
			this.jInternalFrameDetalleFormImpuestoInven.jButtonEliminarImpuestoInven.setVisible((this.isVisibilidadCeldaEliminarImpuestoInven && this.isPermisoEliminarImpuestoInven));
			this.jInternalFrameDetalleFormImpuestoInven.jButtonCancelarImpuestoInven.setVisible(this.isVisibilidadCeldaCancelarImpuestoInven);							
			this.jInternalFrameDetalleFormImpuestoInven.jButtonGuardarCambiosImpuestoInven.setVisible((this.isVisibilidadCeldaGuardarImpuestoInven && this.isPermisoGuardarCambiosImpuestoInven));			
			
			}
						
			this.jButtonGuardarCambiosTablaImpuestoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosImpuestoInven && this.isPermisoGuardarCambiosImpuestoInven));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarImpuestoInven.setVisible((this.isVisibilidadCeldaNuevoImpuestoInven && this.isPermisoNuevoImpuestoInven));						
			this.jButtonDuplicarToolBarImpuestoInven.setVisible((this.isVisibilidadCeldaDuplicarImpuestoInven && this.isPermisoDuplicarImpuestoInven));						
			this.jButtonCopiarToolBarImpuestoInven.setVisible((this.isVisibilidadCeldaCopiarImpuestoInven && this.isPermisoCopiarImpuestoInven));			
			this.jButtonVerFormToolBarImpuestoInven.setVisible((this.isVisibilidadCeldaVerFormImpuestoInven && this.isPermisoVerFormImpuestoInven));			
			this.jButtonAbrirOrderByToolBarImpuestoInven.setVisible((this.isVisibilidadCeldaOrdenImpuestoInven && this.isPermisoOrdenImpuestoInven));
			this.jButtonNuevoRelacionesToolBarImpuestoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesImpuestoInven && this.isPermisoNuevoImpuestoInven));			
			this.jButtonNuevoGuardarCambiosToolBarImpuestoInven.setVisible((this.isVisibilidadCeldaNuevoImpuestoInven && this.isPermisoNuevoImpuestoInven && this.isPermisoGuardarCambiosImpuestoInven));			
			
			if(this.jInternalFrameDetalleFormImpuestoInven!=null) {
			this.jInternalFrameDetalleFormImpuestoInven.jButtonModificarToolBarImpuestoInven.setVisible((this.isVisibilidadCeldaModificarImpuestoInven && this.isPermisoActualizarImpuestoInven));	
			this.jInternalFrameDetalleFormImpuestoInven.jButtonActualizarToolBarImpuestoInven.setVisible((this.isVisibilidadCeldaActualizarImpuestoInven  && this.isPermisoActualizarImpuestoInven));	
			this.jInternalFrameDetalleFormImpuestoInven.jButtonEliminarToolBarImpuestoInven.setVisible((this.isVisibilidadCeldaEliminarImpuestoInven && this.isPermisoEliminarImpuestoInven));
			this.jInternalFrameDetalleFormImpuestoInven.jButtonCancelarToolBarImpuestoInven.setVisible(this.isVisibilidadCeldaCancelarImpuestoInven);				
			this.jInternalFrameDetalleFormImpuestoInven.jButtonGuardarCambiosToolBarImpuestoInven.setVisible((this.isVisibilidadCeldaGuardarImpuestoInven && this.isPermisoGuardarCambiosImpuestoInven));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarImpuestoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosImpuestoInven && this.isPermisoGuardarCambiosImpuestoInven));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoImpuestoInven.setVisible((this.isVisibilidadCeldaNuevoImpuestoInven && this.isPermisoNuevoImpuestoInven));			
			this.jMenuItemDuplicarImpuestoInven.setVisible((this.isVisibilidadCeldaDuplicarImpuestoInven && this.isPermisoDuplicarImpuestoInven));			
			this.jMenuItemCopiarImpuestoInven.setVisible((this.isVisibilidadCeldaCopiarImpuestoInven && this.isPermisoCopiarImpuestoInven));			
			this.jMenuItemVerFormImpuestoInven.setVisible((this.isVisibilidadCeldaVerFormImpuestoInven && this.isPermisoVerFormImpuestoInven));			
			this.jMenuItemAbrirOrderByImpuestoInven.setVisible((this.isVisibilidadCeldaOrdenImpuestoInven && this.isPermisoOrdenImpuestoInven));			
			//this.jMenuItemMostrarOcultarImpuestoInven.setVisible((this.isVisibilidadCeldaOrdenImpuestoInven && this.isPermisoOrdenImpuestoInven));
			this.jMenuItemDetalleAbrirOrderByImpuestoInven.setVisible((this.isVisibilidadCeldaOrdenImpuestoInven && this.isPermisoOrdenImpuestoInven));			
			//this.jMenuItemDetalleMostrarOcultarImpuestoInven.setVisible((this.isVisibilidadCeldaOrdenImpuestoInven && this.isPermisoOrdenImpuestoInven));			
			this.jMenuItemNuevoRelacionesImpuestoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesImpuestoInven && this.isPermisoNuevoImpuestoInven));			
			this.jMenuItemNuevoGuardarCambiosImpuestoInven.setVisible((this.isVisibilidadCeldaNuevoImpuestoInven && this.isPermisoNuevoImpuestoInven && this.isPermisoGuardarCambiosImpuestoInven));									
			
			if(this.jInternalFrameDetalleFormImpuestoInven!=null) {
			this.jInternalFrameDetalleFormImpuestoInven.jMenuItemModificarImpuestoInven.setVisible((this.isVisibilidadCeldaModificarImpuestoInven && this.isPermisoActualizarImpuestoInven));	
			this.jInternalFrameDetalleFormImpuestoInven.jMenuItemActualizarImpuestoInven.setVisible((this.isVisibilidadCeldaActualizarImpuestoInven && this.isPermisoActualizarImpuestoInven));	
			this.jInternalFrameDetalleFormImpuestoInven.jMenuItemEliminarImpuestoInven.setVisible((this.isVisibilidadCeldaEliminarImpuestoInven && this.isPermisoEliminarImpuestoInven));
			this.jInternalFrameDetalleFormImpuestoInven.jMenuItemCancelarImpuestoInven.setVisible(this.isVisibilidadCeldaCancelarImpuestoInven);				
			}
			
			this.jMenuItemGuardarCambiosImpuestoInven.setVisible((this.isVisibilidadCeldaGuardarImpuestoInven && this.isPermisoGuardarCambiosImpuestoInven));						
			this.jMenuItemGuardarCambiosTablaImpuestoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosImpuestoInven && this.isPermisoGuardarCambiosImpuestoInven));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoImpuestoInven=this.jButtonNuevoImpuestoInven.isVisible();
			this.isVisibilidadCeldaDuplicarImpuestoInven=this.jButtonDuplicarImpuestoInven.isVisible();
			this.isVisibilidadCeldaCopiarImpuestoInven=this.jButtonCopiarImpuestoInven.isVisible();
			this.isVisibilidadCeldaVerFormImpuestoInven=this.jButtonVerFormImpuestoInven.isVisible();
			
			this.isVisibilidadCeldaOrdenImpuestoInven=this.jButtonAbrirOrderByImpuestoInven.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesImpuestoInven=this.jButtonNuevoRelacionesImpuestoInven.isVisible();
			this.isVisibilidadCeldaModificarImpuestoInven=this.jButtonModificarImpuestoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormImpuestoInven!=null) {
			this.isVisibilidadCeldaActualizarImpuestoInven=this.jInternalFrameDetalleFormImpuestoInven.jButtonActualizarImpuestoInven.isVisible();
			this.isVisibilidadCeldaEliminarImpuestoInven=this.jInternalFrameDetalleFormImpuestoInven.jButtonEliminarImpuestoInven.isVisible();
			this.isVisibilidadCeldaCancelarImpuestoInven=this.jInternalFrameDetalleFormImpuestoInven.jButtonCancelarImpuestoInven.isVisible();
			this.isVisibilidadCeldaGuardarImpuestoInven=this.jInternalFrameDetalleFormImpuestoInven.jButtonGuardarCambiosImpuestoInven.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosImpuestoInven=this.jButtonGuardarCambiosTablaImpuestoInven.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoImpuestoInven=this.jButtonNuevoToolBarImpuestoInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesImpuestoInven=this.jButtonNuevoRelacionesToolBarImpuestoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormImpuestoInven!=null) {
			this.isVisibilidadCeldaModificarImpuestoInven=this.jInternalFrameDetalleFormImpuestoInven.jButtonModificarToolBarImpuestoInven.isVisible();
			this.isVisibilidadCeldaActualizarImpuestoInven=this.jInternalFrameDetalleFormImpuestoInven.jButtonActualizarToolBarImpuestoInven.isVisible();
			this.isVisibilidadCeldaEliminarImpuestoInven=this.jInternalFrameDetalleFormImpuestoInven.jButtonEliminarToolBarImpuestoInven.isVisible();
			this.isVisibilidadCeldaCancelarImpuestoInven=this.jInternalFrameDetalleFormImpuestoInven.jButtonCancelarToolBarImpuestoInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarImpuestoInven=this.jButtonGuardarCambiosToolBarImpuestoInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosImpuestoInven=this.jButtonGuardarCambiosTablaToolBarImpuestoInven.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoImpuestoInven=this.jMenuItemNuevoImpuestoInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesImpuestoInven=this.jMenuItemNuevoRelacionesImpuestoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormImpuestoInven!=null) {
			this.isVisibilidadCeldaModificarImpuestoInven=this.jInternalFrameDetalleFormImpuestoInven.jMenuItemModificarImpuestoInven.isVisible();
			this.isVisibilidadCeldaActualizarImpuestoInven=this.jInternalFrameDetalleFormImpuestoInven.jMenuItemActualizarImpuestoInven.isVisible();
			this.isVisibilidadCeldaEliminarImpuestoInven=this.jInternalFrameDetalleFormImpuestoInven.jMenuItemEliminarImpuestoInven.isVisible();
			this.isVisibilidadCeldaCancelarImpuestoInven=this.jInternalFrameDetalleFormImpuestoInven.jMenuItemCancelarImpuestoInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarImpuestoInven=this.jMenuItemGuardarCambiosImpuestoInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosImpuestoInven=this.jMenuItemGuardarCambiosTablaImpuestoInven.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesImpuestoInven(Boolean esInicializar) {
		if(ImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {			
			if(this.impuestoinvenSessionBean.getConGuardarRelaciones()) {
				//if(this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesImpuestoInven();
			}
			
			this.inicializarActualizarBindingBotonesManualImpuestoInven(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualImpuestoInven() {
		this.jButtonNuevoImpuestoInven.setVisible(this.isPermisoNuevoImpuestoInven);			
		this.jButtonDuplicarImpuestoInven.setVisible(this.isPermisoDuplicarImpuestoInven);			
		this.jButtonCopiarImpuestoInven.setVisible(this.isPermisoCopiarImpuestoInven);			
		this.jButtonVerFormImpuestoInven.setVisible(this.isPermisoVerFormImpuestoInven);			
		
		this.jButtonAbrirOrderByImpuestoInven.setVisible(this.isPermisoOrdenImpuestoInven);					
		
		this.jButtonNuevoRelacionesImpuestoInven.setVisible(this.isPermisoNuevoImpuestoInven);			
		
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoInven.jButtonModificarImpuestoInven.setVisible(this.isPermisoActualizarImpuestoInven);	
			this.jInternalFrameDetalleFormImpuestoInven.jButtonActualizarImpuestoInven.setVisible(this.isPermisoActualizarImpuestoInven);	
			this.jInternalFrameDetalleFormImpuestoInven.jButtonEliminarImpuestoInven.setVisible(this.isPermisoEliminarImpuestoInven);
			this.jInternalFrameDetalleFormImpuestoInven.jButtonCancelarImpuestoInven.setVisible(this.isVisibilidadCeldaCancelarImpuestoInven);						
			this.jInternalFrameDetalleFormImpuestoInven.jButtonGuardarCambiosImpuestoInven.setVisible(this.isPermisoGuardarCambiosImpuestoInven);							
		}
		
		this.jButtonGuardarCambiosTablaImpuestoInven.setVisible(this.isPermisoActualizarImpuestoInven);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleImpuestoInven() {
		this.jInternalFrameDetalleFormImpuestoInven.jButtonModificarImpuestoInven.setVisible(this.isPermisoActualizarImpuestoInven);	
		this.jInternalFrameDetalleFormImpuestoInven.jButtonActualizarImpuestoInven.setVisible(this.isPermisoActualizarImpuestoInven);	
		this.jInternalFrameDetalleFormImpuestoInven.jButtonEliminarImpuestoInven.setVisible(this.isPermisoEliminarImpuestoInven);
		this.jInternalFrameDetalleFormImpuestoInven.jButtonCancelarImpuestoInven.setVisible(this.isVisibilidadCeldaCancelarImpuestoInven);							
		this.jInternalFrameDetalleFormImpuestoInven.jButtonGuardarCambiosImpuestoInven.setVisible((this.isVisibilidadCeldaGuardarImpuestoInven && this.isPermisoGuardarCambiosImpuestoInven));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosImpuestoInven() {
		if(ImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualImpuestoInven();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesImpuestoInven() {
	}
	
	public void jTableDatosImpuestoInvenListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarImpuestoInven(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidImpuestoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosImpuestoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualImpuestoInven(this.getimpuestoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysImpuestoInven(this.impuestoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.impuestoinven =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.impuestoinven =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.impuestoinven==null) {
						this.impuestoinven = new ImpuestoInven();
					}

					this.setVariablesFormularioToObjetoActualImpuestoInven(this.impuestoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysImpuestoInven(this.impuestoinven);
				}

				if(this.impuestoinven.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.impuestoinven.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingImpuestoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaImpuestoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebImpuestoInven(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosImpuestoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosImpuestoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosImpuestoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinven =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.impuestoinven =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualImpuestoInven(this.getimpuestoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysImpuestoInven(this.impuestoinven);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.impuestoinvenLogic.getConnexion());

				if(this.impuestoinven.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.impuestoinven.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderImpuestoInven=(TitledBorder)this.jScrollPanelDatosImpuestoInven.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderImpuestoInven.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaImpuestoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosImpuestoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualImpuestoInven(this.getimpuestoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysImpuestoInven(this.impuestoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.impuestoinven =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.impuestoinven =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.impuestoinven==null) {
						this.impuestoinven = new ImpuestoInven();
					}

					this.setVariablesFormularioToObjetoActualImpuestoInven(this.impuestoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysImpuestoInven(this.impuestoinven);
				}

				if(this.impuestoinven.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.impuestoinven.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingImpuestoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreImpuestoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosImpuestoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualImpuestoInven(this.getimpuestoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysImpuestoInven(this.impuestoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.impuestoinven =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.impuestoinven =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.impuestoinven==null) {
						this.impuestoinven = new ImpuestoInven();
					}

					this.setVariablesFormularioToObjetoActualImpuestoInven(this.impuestoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysImpuestoInven(this.impuestoinven);
				}

				if(this.impuestoinven.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.impuestoinven.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingImpuestoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingImpuestoInven(false,false);

			this.getImpuestoInvensBusquedaPorNombre();

			this.inicializarActualizarBindingImpuestoInven(false);

			//if(ImpuestoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingImpuestoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingImpuestoInven(false,false);

			this.getImpuestoInvensFK_IdEmpresa();

			this.inicializarActualizarBindingImpuestoInven(false);

			//if(ImpuestoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingImpuestoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.impuestoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameImpuestoInven() {
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) {
		

		if(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) {
			this.jInternalFrameDetalleFormImpuestoInven.setVisible(false);	    			
			this.jInternalFrameDetalleFormImpuestoInven.dispose();
			this.jInternalFrameDetalleFormImpuestoInven=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoImpuestoInven!=null) {
			this.jInternalFrameReporteDinamicoImpuestoInven.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoImpuestoInven.dispose();
			this.jInternalFrameReporteDinamicoImpuestoInven=null;
		}
		
		if(this.jInternalFrameImportacionImpuestoInven!=null) {
			this.jInternalFrameImportacionImpuestoInven.setVisible(false);	    			
			this.jInternalFrameImportacionImpuestoInven.dispose();
			this.jInternalFrameImportacionImpuestoInven=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessImpuestoInven();
			
			ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
			
			
			if(sTipo.equals("NuevoImpuestoInven")) {
				jButtonNuevoImpuestoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarImpuestoInven")) {
				jButtonDuplicarImpuestoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarImpuestoInven")) {
				jButtonCopiarImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormImpuestoInven")) {
				jButtonVerFormImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarImpuestoInven")) {
				jButtonNuevoImpuestoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarImpuestoInven")) {
				jButtonDuplicarImpuestoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoImpuestoInven")) {
				jButtonNuevoImpuestoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarImpuestoInven")) {
				jButtonDuplicarImpuestoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesImpuestoInven")) {
				jButtonNuevoImpuestoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarImpuestoInven")) {
				jButtonNuevoImpuestoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesImpuestoInven")) {
				jButtonNuevoImpuestoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarImpuestoInven")) {
				jButtonModificarImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarImpuestoInven")) {
				jButtonModificarImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarImpuestoInven")) {
				jButtonModificarImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarImpuestoInven")) {
				jButtonActualizarImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarImpuestoInven")) {
				jButtonActualizarImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarImpuestoInven")) {
				jButtonActualizarImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarImpuestoInven")) {
				jButtonEliminarImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarImpuestoInven")) {
				jButtonEliminarImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarImpuestoInven")) {
				jButtonEliminarImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarImpuestoInven")) {
				jButtonCancelarImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarImpuestoInven")) {
				jButtonCancelarImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarImpuestoInven")) {
				jButtonCancelarImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarImpuestoInven")) {
				jButtonCerrarImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarImpuestoInven")) {
				jButtonCerrarImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarImpuestoInven")) {
				jButtonCerrarImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarImpuestoInven")) {
				jButtonMostrarOcultarImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarImpuestoInven")) {
				jButtonCancelarImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosImpuestoInven")) {
				jButtonGuardarCambiosImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarImpuestoInven")) {
				jButtonGuardarCambiosImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarImpuestoInven")) {
				jButtonCopiarImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarImpuestoInven")) {
				jButtonVerFormImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosImpuestoInven")) {
				jButtonGuardarCambiosImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarImpuestoInven")) {
				jButtonCopiarImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormImpuestoInven")) {
				jButtonVerFormImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaImpuestoInven")) {
				jButtonGuardarCambiosImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarImpuestoInven")) {
				jButtonGuardarCambiosImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaImpuestoInven")) {
				jButtonGuardarCambiosImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionImpuestoInven")) {
				jButtonRecargarInformacionImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarImpuestoInven")) {
				jButtonRecargarInformacionImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionImpuestoInven")) {
				jButtonRecargarInformacionImpuestoInvenActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresImpuestoInven")) {
				jButtonAnterioresImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarImpuestoInven")) {
				jButtonAnterioresImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreImpuestoInven")) {
				jButtonAnterioresImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesImpuestoInven")) {
				jButtonSiguientesImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarImpuestoInven")) {
				jButtonSiguientesImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesImpuestoInven")) {
				jButtonSiguientesImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByImpuestoInven") || sTipo.equals("MenuItemDetalleAbrirOrderByImpuestoInven")) {
				jButtonAbrirOrderByImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarImpuestoInven") || sTipo.equals("MenuItemDetalleMostrarOcultarImpuestoInven")) {
				jButtonMostrarOcultarImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosImpuestoInven")) {
				jButtonNuevoGuardarCambiosImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarImpuestoInven")) {
				jButtonNuevoGuardarCambiosImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosImpuestoInven")) {
				jButtonNuevoGuardarCambiosImpuestoInvenActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoImpuestoInven")) {
				jButtonCerrarReporteDinamicoImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoImpuestoInven")) {
				jButtonGenerarReporteDinamicoImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoImpuestoInven")) {
				
				jButtonGenerarExcelReporteDinamicoImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionImpuestoInven")) {
				jButtonCerrarImportacionImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionImpuestoInven")) {
				
				jButtonGenerarImportacionImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionImpuestoInven")) {
				
				jButtonAbrirImportacionImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesImpuestoInven")) {
				jComboBoxTiposAccionesImpuestoInvenActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesImpuestoInven")) {
				jComboBoxTiposRelacionesImpuestoInvenActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioImpuestoInven")) {
				jComboBoxTiposAccionesImpuestoInvenActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarImpuestoInven")) {
				
				jComboBoxTiposSeleccionarImpuestoInvenActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralImpuestoInven")) {
				jTextFieldValorCampoGeneralImpuestoInvenActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByImpuestoInven")) {
				jButtonAbrirOrderByImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarImpuestoInven")) {
				jButtonAbrirOrderByImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByImpuestoInven")) {
				jButtonCerrarOrderByImpuestoInvenActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idImpuestoInvenBusqueda")) {
				this.jButtonidImpuestoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaImpuestoInvenUpdate")) {
				this.jButtonid_empresaImpuestoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaImpuestoInvenBusqueda")) {
				this.jButtonid_empresaImpuestoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreImpuestoInvenBusqueda")) {
				this.jButtonnombreImpuestoInvenBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreImpuestoInven")) {
				this.jButtonBusquedaPorNombreImpuestoInvenActionPerformed(evt);
			}
			
			;
			
			
			ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessImpuestoInven();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaImpuestoInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.impuestoinven);
				
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
				
				


				
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ImpuestoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ImpuestoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ImpuestoInven impuestoinvenLocal=null;
			
			if(!this.getEsControlTabla()) {
				impuestoinvenLocal=this.impuestoinven;
			} else {
				impuestoinvenLocal=this.impuestoinvenAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.impuestoinven);
				
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
							
				
				


				
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ImpuestoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ImpuestoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaImpuestoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosImpuestoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenAnterior =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.impuestoinvenAnterior =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
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
			
			ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
			
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
			
			


			
			ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaImpuestoInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.impuestoinven);
				
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
								
						
				


				
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ImpuestoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ImpuestoInven.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.impuestoinven);
				
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
								
				
				


				
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ImpuestoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ImpuestoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaImpuestoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosImpuestoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenAnterior =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.impuestoinvenAnterior =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.impuestoinven);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaImpuestoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosImpuestoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenAnterior =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.impuestoinvenAnterior =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaImpuestoInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.impuestoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.impuestoinven);
				
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
							
				
				


				
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ImpuestoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ImpuestoInven.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaImpuestoInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosImpuestoInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.impuestoinvenAnterior =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.impuestoinvenAnterior =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
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
			
			ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
			
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
			
			


			
			ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaImpuestoInvenActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.impuestoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.impuestoinven);
				
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
								
				
				


				
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ImpuestoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ImpuestoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaImpuestoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosImpuestoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenAnterior =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.impuestoinvenAnterior =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaImpuestoInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.impuestoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaImpuestoInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.impuestoinven);
				
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosImpuestoInven")) {
					jCheckBoxSeleccionarTodosImpuestoInvenItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosImpuestoInven")) {
					jCheckBoxSeleccionadosImpuestoInvenItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarImpuestoInven")) {
					
				}
				
				


				
				
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ImpuestoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ImpuestoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestoinven);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.impuestoinven);
				
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
												
				
				


				
				
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ImpuestoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ImpuestoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaImpuestoInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosImpuestoInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.impuestoinvenAnterior =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.impuestoinvenAnterior =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaImpuestoInvenActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.impuestoinven);
				
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
				
				
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
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
			
			ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
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
			
			


			
			ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaImpuestoInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.impuestoinven);
				
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ImpuestoInven.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ImpuestoInven.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.impuestoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.impuestoinven);
				
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
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
				
				


				
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ImpuestoInven.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ImpuestoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaImpuestoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosImpuestoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.impuestoinvenAnterior =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.impuestoinvenAnterior =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarImpuestoInven")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosImpuestoInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosImpuestoInven.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.impuestoinven =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.impuestoinven =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.impuestoinven);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarImpuestoInven")) {
				
				}
				
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarImpuestoInven")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosImpuestoInven.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarImpuestoInven")) {
			
			}
			
			ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessImpuestoInven();
			
			ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
			
			if(sTipo.equals("NuevoImpuestoInven")) {
				jButtonNuevoImpuestoInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarImpuestoInven")) {
				jButtonDuplicarImpuestoInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarImpuestoInven")) {
				jButtonCopiarImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormImpuestoInven")) {
				jButtonVerFormImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesImpuestoInven")) {
				jButtonNuevoImpuestoInvenActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarImpuestoInven")) {
				jButtonModificarImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarImpuestoInven")) {
				jButtonActualizarImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarImpuestoInven")) {
				jButtonEliminarImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaImpuestoInven")) {
				jButtonGuardarCambiosImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarImpuestoInven")) {
				jButtonCancelarImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImpuestoInven")) {
				jButtonCerrarImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosImpuestoInven")) {
				jButtonGuardarCambiosImpuestoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosImpuestoInven")) {
				jButtonNuevoGuardarCambiosImpuestoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByImpuestoInven")) {
				jButtonAbrirOrderByImpuestoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionImpuestoInven")) {
				jButtonRecargarInformacionImpuestoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresImpuestoInven")) {
				jButtonAnterioresImpuestoInvenActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesImpuestoInven")) {
				jButtonSiguientesImpuestoInvenActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idImpuestoInvenBusqueda")) {
				this.jButtonidImpuestoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaImpuestoInvenUpdate")) {
				this.jButtonid_empresaImpuestoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaImpuestoInvenBusqueda")) {
				this.jButtonid_empresaImpuestoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreImpuestoInvenBusqueda")) {
				this.jButtonnombreImpuestoInvenBusquedaActionPerformed(evt);
			}
			
			ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessImpuestoInven();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameImpuestoInven")) {
				closingInternalFrameImpuestoInven();
				
			} else if(sTipo.equals("jButtonCancelarImpuestoInven")) {
				JInternalFrameBase jInternalFrameDetalleFormImpuestoInven = (JInternalFrameBase)evt.getSource();
	            	
	            ImpuestoInvenBeanSwingJInternalFrame jInternalFrameParent=(ImpuestoInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormImpuestoInven.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarImpuestoInvenActionPerformed(null);
			}
			
			ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.impuestoinven,new Object(),this.impuestoinvenParameterGeneral,this.impuestoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormImpuestoInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormImpuestoInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormImpuestoInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.impuestoinven)) {
			if(!esControlTabla) {
				if(ImpuestoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualImpuestoInven(this.impuestoinven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysImpuestoInven(this.impuestoinven);			
				}
				
				if(this.impuestoinvenSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualImpuestoInven(this.impuestoinven,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.impuestoinvenReturnGeneral=impuestoinvenLogic.procesarEventosImpuestoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.impuestoinvenLogic.getImpuestoInvens(),this.impuestoinven,this.impuestoinvenParameterGeneral,this.isEsNuevoImpuestoInven,classes);//this.impuestoinvenLogic.getImpuestoInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanImpuestoInven(this.impuestoinvenReturnGeneral,this.impuestoinvenBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.impuestoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanImpuestoInven(classes,this.impuestoinvenReturnGeneral,this.impuestoinvenBean,false);
					}
						
					if(this.impuestoinvenReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyImpuestoInven(this.impuestoinvenReturnGeneral.getImpuestoInven());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioImpuestoInven(this.impuestoinvenReturnGeneral.getImpuestoInven());	
					}
						
					if(this.impuestoinvenReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioImpuestoInven(this.impuestoinvenReturnGeneral.getImpuestoInven(),classes);//this.impuestoinvenBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioImpuestoInven(this.impuestoinven,classes);//this.impuestoinvenBean);									
				}
			
				if(ImpuestoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualImpuestoInven(this.impuestoinven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysImpuestoInven(this.impuestoinven);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.impuestoinvenAnterior!=null) {
						this.impuestoinven=this.impuestoinvenAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.impuestoinvenReturnGeneral=impuestoinvenLogic.procesarEventosImpuestoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.impuestoinvenLogic.getImpuestoInvens(),this.impuestoinven,this.impuestoinvenParameterGeneral,this.isEsNuevoImpuestoInven,classes);//this.impuestoinvenLogic.getImpuestoInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.impuestoinvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.impuestoinvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.impuestoinvenReturnGeneral.getImpuestoInven(),impuestoinvenLogic.getImpuestoInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.impuestoinvenReturnGeneral.getImpuestoInven(),this.impuestoinvens);
				}
				//ARCHITECTURE
				
				//this.jTableDatosImpuestoInven.repaint();
				
				//((AbstractTableModel) this.jTableDatosImpuestoInven.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosImpuestoInven();
			}
		}
	}
	
	public void actualizarVisualTableDatosImpuestoInven() throws Exception {
		
		ImpuestoInvenModel impuestoinvenModel=(ImpuestoInvenModel)this.jTableDatosImpuestoInven.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			impuestoinvenModel.impuestoinvens=this.impuestoinvenLogic.getImpuestoInvens();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			impuestoinvenModel.impuestoinvens=this.impuestoinvens;
		}
		
		
		((ImpuestoInvenModel) this.jTableDatosImpuestoInven.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaImpuestoInven() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getimpuestoinvenAnterior(),this.impuestoinvenLogic.getImpuestoInvens());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getimpuestoinvenAnterior(),this.impuestoinvens);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosImpuestoInven();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioImpuestoInven(ImpuestoInven impuestoinven,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoImpuesto.class)) {
					this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestoLogic.setProductoImpuestos(impuestoinven.getProductoImpuestos());
					this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoImpuesto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleImpuestoInven.class)) {
					this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenLogic.setDetalleImpuestoInvens(impuestoinven.getDetalleImpuestoInvens());
					this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleImpuestoInven(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
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
										
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.impuestoinven,new Object(),generalEntityParameterGeneral,this.impuestoinvenReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.impuestoinvenSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ImpuestoInvenConstantesFunciones.getClassesRelationshipsOfImpuestoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ImpuestoInvenConstantesFunciones.getClassesRelationshipsFromStringsOfImpuestoInven(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormImpuestoInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.impuestoinven,new Object(),generalEntityParameterGeneral,this.impuestoinvenReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioImpuestoInven(ImpuestoInvenBean impuestoinvenBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoImpuesto.class)) {
					this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestoLogic.setProductoImpuestos(impuestoinven.getProductoImpuestos());
					this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoImpuesto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleImpuestoInven.class)) {
					this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenLogic.setDetalleImpuestoInvens(impuestoinven.getDetalleImpuestoInvens());
					this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleImpuestoInven(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanImpuestoInven(ArrayList<Classe> classes,ImpuestoInvenReturnGeneral impuestoinvenReturnGeneral,ImpuestoInvenBean impuestoinvenBean,Boolean conDefault) throws Exception {
		
			this.impuestoinvenBean.setProductoImpuestos(impuestoinvenReturnGeneral.getImpuestoInven().getProductoImpuestos());
			this.impuestoinvenBean.setDetalleImpuestoInvens(impuestoinvenReturnGeneral.getImpuestoInven().getDetalleImpuestoInvens());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualImpuestoInven(ImpuestoInven impuestoinven,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoImpuesto.class)) {
					impuestoinven.setProductoImpuestos(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoBeanSwingJInternalFrame.productoimpuestoLogic.getProductoImpuestos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleImpuestoInven.class)) {
					impuestoinven.setDetalleImpuestoInvens(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenBeanSwingJInternalFrame.detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
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
		if(!paraTabla && !this.permiteMantenimiento(this.impuestoinven)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormImpuestoInven = new ImpuestoInvenDetalleFormJInternalFrame(jDesktopPane,this.impuestoinvenSessionBean.getConGuardarRelaciones(),this.impuestoinvenSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormImpuestoInven);
		this.jInternalFrameDetalleFormImpuestoInven.setVisible(false);
		this.jInternalFrameDetalleFormImpuestoInven.setSelected(false);						
		
		this.jInternalFrameDetalleFormImpuestoInven.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormImpuestoInven.impuestoinvenLogic=this.impuestoinvenLogic;
		
		this.cargarCombosFrameForeignKeyImpuestoInven("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleImpuestoInven();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleImpuestoInven();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyImpuestoInven("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyImpuestoInven();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormImpuestoInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarImpuestoInven"));
		
		this.jInternalFrameDetalleFormImpuestoInven.jButtonModificarImpuestoInven.addActionListener(new ButtonActionListener(this,"ModificarImpuestoInven"));

		
		this.jInternalFrameDetalleFormImpuestoInven.jButtonModificarToolBarImpuestoInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarImpuestoInven"));
					
		this.jInternalFrameDetalleFormImpuestoInven.jMenuItemModificarImpuestoInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarImpuestoInven"));		
		
		
		
		this.jInternalFrameDetalleFormImpuestoInven.jButtonActualizarImpuestoInven.addActionListener (new ButtonActionListener(this,"ActualizarImpuestoInven"));
		
		
		this.jInternalFrameDetalleFormImpuestoInven.jButtonActualizarToolBarImpuestoInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarImpuestoInven"));
						
		this.jInternalFrameDetalleFormImpuestoInven.jMenuItemActualizarImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarImpuestoInven"));		
		
		
		
		this.jInternalFrameDetalleFormImpuestoInven.jButtonEliminarImpuestoInven.addActionListener (new ButtonActionListener(this,"EliminarImpuestoInven"));
		
		
		this.jInternalFrameDetalleFormImpuestoInven.jButtonEliminarToolBarImpuestoInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarImpuestoInven"));
								
		this.jInternalFrameDetalleFormImpuestoInven.jMenuItemEliminarImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarImpuestoInven"));		
		
		
		
		this.jInternalFrameDetalleFormImpuestoInven.jButtonCancelarImpuestoInven.addActionListener (new ButtonActionListener(this,"CancelarImpuestoInven"));
		
		
		this.jInternalFrameDetalleFormImpuestoInven.jButtonCancelarToolBarImpuestoInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarImpuestoInven"));
					
		this.jInternalFrameDetalleFormImpuestoInven.jMenuItemCancelarImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarImpuestoInven"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormImpuestoInven.jMenuItemDetalleCerrarImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarImpuestoInven"));		
		
		
		
		this.jInternalFrameDetalleFormImpuestoInven.jButtonGuardarCambiosToolBarImpuestoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarImpuestoInven"));
		
		
		
		this.jInternalFrameDetalleFormImpuestoInven.jButtonGuardarCambiosToolBarImpuestoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarImpuestoInven"));
		
		
		
		this.jInternalFrameDetalleFormImpuestoInven.jComboBoxTiposAccionesFormularioImpuestoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioImpuestoInven"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoInven.jButtonidImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idImpuestoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormImpuestoInven.jButtonid_empresaImpuestoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaImpuestoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoInven.jButtonid_empresaImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaImpuestoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoInven.jButtonnombreImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"nombreImpuestoInvenBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormImpuestoInven.jTabbedPaneRelacionesImpuestoInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesImpuestoInven"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameImpuestoInven"));
		
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarImpuestoInven"));
		}
		
		this.jTableDatosImpuestoInven.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarImpuestoInven"));
		
		this.jTableDatosImpuestoInven.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarImpuestoInven"));
		
		this.jButtonNuevoImpuestoInven.addActionListener(new ButtonActionListener(this,"NuevoImpuestoInven"));
		
		this.jButtonDuplicarImpuestoInven.addActionListener(new ButtonActionListener(this,"DuplicarImpuestoInven"));
		
		this.jButtonCopiarImpuestoInven.addActionListener(new ButtonActionListener(this,"CopiarImpuestoInven"));
		
		this.jButtonVerFormImpuestoInven.addActionListener(new ButtonActionListener(this,"VerFormImpuestoInven"));
		
		
		this.jButtonNuevoToolBarImpuestoInven.addActionListener(new ButtonActionListener(this,"NuevoToolBarImpuestoInven"));
			
		this.jButtonDuplicarToolBarImpuestoInven.addActionListener(new ButtonActionListener(this,"DuplicarToolBarImpuestoInven"));
			
		this.jMenuItemNuevoImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoImpuestoInven"));
			
		this.jMenuItemDuplicarImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarImpuestoInven"));		
		
		
		this.jButtonNuevoRelacionesImpuestoInven.addActionListener (new ButtonActionListener(this,"NuevoRelacionesImpuestoInven"));
		
		
		this.jButtonNuevoRelacionesToolBarImpuestoInven.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarImpuestoInven"));
			
		this.jMenuItemNuevoRelacionesImpuestoInven.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesImpuestoInven"));		
		
		
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoInven.jButtonModificarImpuestoInven.addActionListener(new ButtonActionListener(this,"ModificarImpuestoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoInven.jButtonModificarToolBarImpuestoInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarImpuestoInven"));
			
			this.jInternalFrameDetalleFormImpuestoInven.jMenuItemModificarImpuestoInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarImpuestoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormImpuestoInven.jButtonActualizarImpuestoInven.addActionListener (new ButtonActionListener(this,"ActualizarImpuestoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoInven.jButtonActualizarToolBarImpuestoInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarImpuestoInven"));
				
			this.jInternalFrameDetalleFormImpuestoInven.jMenuItemActualizarImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarImpuestoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoInven.jButtonEliminarImpuestoInven.addActionListener (new ButtonActionListener(this,"EliminarImpuestoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoInven.jButtonEliminarToolBarImpuestoInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarImpuestoInven"));
						
			this.jInternalFrameDetalleFormImpuestoInven.jMenuItemEliminarImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarImpuestoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoInven.jButtonCancelarImpuestoInven.addActionListener (new ButtonActionListener(this,"CancelarImpuestoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoInven.jButtonCancelarToolBarImpuestoInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarImpuestoInven"));
			
			this.jInternalFrameDetalleFormImpuestoInven.jMenuItemCancelarImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarImpuestoInven"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarImpuestoInven.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarImpuestoInven"));		
		
		
		this.jButtonCerrarImpuestoInven.addActionListener (new ButtonActionListener(this,"CerrarImpuestoInven"));
		
		
		this.jButtonCerrarToolBarImpuestoInven.addActionListener (new ButtonActionListener(this,"CerrarToolBarImpuestoInven"));
			
		this.jMenuItemCerrarImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemCerrarImpuestoInven"));
			
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoInven.jMenuItemDetalleCerrarImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarImpuestoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoInven.jButtonGuardarCambiosImpuestoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosImpuestoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoInven.jButtonGuardarCambiosToolBarImpuestoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarImpuestoInven"));
		}
		
		this.jButtonCopiarToolBarImpuestoInven.addActionListener (new ButtonActionListener(this,"CopiarToolBarImpuestoInven"));
			
		this.jButtonVerFormToolBarImpuestoInven.addActionListener (new ButtonActionListener(this,"VerFormToolBarImpuestoInven"));
		
		this.jMenuItemGuardarCambiosImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosImpuestoInven"));
			
		this.jMenuItemCopiarImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemCopiarImpuestoInven"));		
		
		this.jMenuItemVerFormImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemVerFormImpuestoInven"));		
		
		
		this.jButtonGuardarCambiosTablaImpuestoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaImpuestoInven"));
		
		
		this.jButtonGuardarCambiosTablaToolBarImpuestoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarImpuestoInven"));
			
		this.jMenuItemGuardarCambiosTablaImpuestoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaImpuestoInven"));		
		
		
		
		this.jButtonRecargarInformacionImpuestoInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionImpuestoInven"));
					
		this.jButtonRecargarInformacionToolBarImpuestoInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarImpuestoInven"));
		
		this.jMenuItemRecargarInformacionImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionImpuestoInven"));		
		
		
		
		this.jButtonAnterioresImpuestoInven.addActionListener (new ButtonActionListener(this,"AnterioresImpuestoInven"));
		
		
		this.jButtonAnterioresToolBarImpuestoInven.addActionListener (new ButtonActionListener(this,"AnterioresToolBarImpuestoInven"));
		
		this.jMenuItemAnterioresImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresImpuestoInven"));		
		
		
		this.jButtonSiguientesImpuestoInven.addActionListener (new ButtonActionListener(this,"SiguientesImpuestoInven"));
		
		
		this.jButtonSiguientesToolBarImpuestoInven.addActionListener (new ButtonActionListener(this,"SiguientesToolBarImpuestoInven"));
			
		this.jMenuItemSiguientesImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesImpuestoInven"));
			
		this.jMenuItemAbrirOrderByImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByImpuestoInven"));
			
		this.jMenuItemMostrarOcultarImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarImpuestoInven"));
			
		this.jMenuItemDetalleAbrirOrderByImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByImpuestoInven"));
			
		this.jMenuItemDetalleMostarOcultarImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarImpuestoInven"));		
		
		
		this.jButtonNuevoGuardarCambiosImpuestoInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosImpuestoInven"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarImpuestoInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarImpuestoInven"));
			
		this.jMenuItemNuevoGuardarCambiosImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosImpuestoInven"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosImpuestoInven.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosImpuestoInven"));

		this.jCheckBoxSeleccionadosImpuestoInven.addItemListener(new CheckBoxItemListener(this,"SeleccionadosImpuestoInven"));
		
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoInven.jComboBoxTiposAccionesFormularioImpuestoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioImpuestoInven"));
		}
		
		
		this.jComboBoxTiposRelacionesImpuestoInven.addActionListener (new ButtonActionListener(this,"TiposRelacionesImpuestoInven"));
			
		this.jComboBoxTiposAccionesImpuestoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesImpuestoInven"));
					
		this.jComboBoxTiposSeleccionarImpuestoInven.addActionListener (new ButtonActionListener(this,"TiposSeleccionarImpuestoInven"));
			
		this.jTextFieldValorCampoGeneralImpuestoInven.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralImpuestoInven"));		
		
		
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoInven.jButtonidImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idImpuestoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormImpuestoInven.jButtonid_empresaImpuestoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaImpuestoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoInven.jButtonid_empresaImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaImpuestoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoInven.jButtonnombreImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"nombreImpuestoInvenBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreImpuestoInven.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreImpuestoInven"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoImpuestoInven!=null) {
				this.jInternalFrameReporteDinamicoImpuestoInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoImpuestoInven"));
				this.jInternalFrameReporteDinamicoImpuestoInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoImpuestoInven"));
				this.jInternalFrameReporteDinamicoImpuestoInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoImpuestoInven"));
			}
			
			//this.jButtonCerrarReporteDinamicoImpuestoInven.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoImpuestoInven"));				
			//this.jButtonGenerarReporteDinamicoImpuestoInven.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoImpuestoInven"));
			//this.jButtonGenerarExcelReporteDinamicoImpuestoInven.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoImpuestoInven"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionImpuestoInven!=null) {
				this.jInternalFrameImportacionImpuestoInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionImpuestoInven"));
				this.jInternalFrameImportacionImpuestoInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionImpuestoInven"));
				this.jInternalFrameImportacionImpuestoInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionImpuestoInven"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByImpuestoInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByImpuestoInven"));
			
			this.jButtonAbrirOrderByToolBarImpuestoInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarImpuestoInven"));			
			
			if(this.jInternalFrameOrderByImpuestoInven!=null) {
				this.jInternalFrameOrderByImpuestoInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByImpuestoInven"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormImpuestoInven.jTabbedPaneRelacionesImpuestoInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesImpuestoInven"));
		
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
            		closingInternalFrameImpuestoInven();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormImpuestoInven.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormImpuestoInven = (JInternalFrameBase)event.getSource();
	            	
	            ImpuestoInvenBeanSwingJInternalFrame jInternalFrameParent=(ImpuestoInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormImpuestoInven.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarImpuestoInvenActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosImpuestoInven.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosImpuestoInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosImpuestoInven.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosImpuestoInven.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoImpuestoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoImpuestoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoImpuestoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoImpuestoInven";
		inputMap = this.jButtonNuevoImpuestoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoImpuestoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoImpuestoInvenActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoImpuestoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoImpuestoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoImpuestoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesImpuestoInven";
		inputMap = this.jButtonNuevoRelacionesImpuestoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesImpuestoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoImpuestoInvenActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarImpuestoInven";
		inputMap = this.jButtonModificarImpuestoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarImpuestoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarImpuestoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarImpuestoInven";
		inputMap = this.jButtonActualizarImpuestoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarImpuestoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarImpuestoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarImpuestoInven";
		inputMap = this.jButtonEliminarImpuestoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarImpuestoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarImpuestoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarImpuestoInven";
		inputMap = this.jButtonCancelarImpuestoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarImpuestoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarImpuestoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarImpuestoInven";
		inputMap = this.jButtonCerrarImpuestoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarImpuestoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarImpuestoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormImpuestoInven.jButtonGuardarCambiosImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosImpuestoInven";
		inputMap = this.jInternalFrameDetalleFormImpuestoInven.jButtonGuardarCambiosImpuestoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormImpuestoInven.jButtonGuardarCambiosImpuestoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosImpuestoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosImpuestoInven.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosImpuestoInvenItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesImpuestoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesImpuestoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarImpuestoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarImpuestoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralImpuestoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralImpuestoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoInven.jButtonidImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idImpuestoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormImpuestoInven.jButtonid_empresaImpuestoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaImpuestoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoInven.jButtonid_empresaImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaImpuestoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormImpuestoInven.jButtonnombreImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"nombreImpuestoInvenBusqueda"));
		
		
		this.jButtonBusquedaPorNombreImpuestoInven.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreImpuestoInven"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarImpuestoInvenActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarImpuestoInven.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosImpuestoInven(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ImpuestoInven impuestoinvenAux:this.impuestoinvenLogic.getImpuestoInvens()) {
					impuestoinvenAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ImpuestoInven impuestoinvenAux:impuestoinvens) {
					impuestoinvenAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosImpuestoInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingImpuestoInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ImpuestoInven impuestoinvenAux:this.impuestoinvenLogic.getImpuestoInvens()) {
						impuestoinvenAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ImpuestoInven impuestoinvenAux:impuestoinvens) {
						impuestoinvenAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ImpuestoInven impuestoinvenAux:this.impuestoinvenLogic.getImpuestoInvens()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ImpuestoInven impuestoinvenAux:impuestoinvens) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaImpuestoInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosImpuestoInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosImpuestoInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosImpuestoInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosImpuestoInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingImpuestoInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosImpuestoInven.getSelectedRows();
			
			ImpuestoInven impuestoinvenLocal=new ImpuestoInven();
			
			//this.seleccionarTodosImpuestoInven(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					impuestoinvenLocal =(ImpuestoInven) this.impuestoinvenLogic.getImpuestoInvens().toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					impuestoinvenLocal =(ImpuestoInven) this.impuestoinvens.toArray()[this.jTableDatosImpuestoInven.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				impuestoinvenLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ImpuestoInven impuestoinvenAux:this.impuestoinvenLogic.getImpuestoInvens()) {
						impuestoinvenAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ImpuestoInven impuestoinvenAux:impuestoinvens) {
						impuestoinvenAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaImpuestoInven(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosImpuestoInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosImpuestoInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosImpuestoInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualImpuestoInvenItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarImpuestoInvenParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralImpuestoInvenActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingImpuestoInven(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralImpuestoInven.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ImpuestoInven impuestoinvenAux:this.impuestoinvenLogic.getImpuestoInvens()) {
				
						if(sTipoSeleccionar.equals(ImpuestoInvenConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							impuestoinvenAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ImpuestoInven impuestoinvenAux:impuestoinvens) {
					
						if(sTipoSeleccionar.equals(ImpuestoInvenConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							impuestoinvenAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaImpuestoInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesImpuestoInvenActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingImpuestoInven(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioImpuestoInven=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesImpuestoInven.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormImpuestoInven.jComboBoxTiposAccionesFormularioImpuestoInven.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteImpuestoInven) {				
					conSplash=true;//false;										
					
					//this.startProcessImpuestoInven(conSplash);
				
					this.generarReporteImpuestoInvensSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesImpuestoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormImpuestoInven.jComboBoxTiposAccionesFormularioImpuestoInven.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoImpuestoInvensSeleccionados();
				//this.jComboBoxTiposAccionesImpuestoInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoImpuestoInvensSeleccionados(false);
				//this.jComboBoxTiposAccionesImpuestoInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoImpuestoInvensSeleccionados(true);
				//this.jComboBoxTiposAccionesImpuestoInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessImpuestoInven();
				
				this.exportarImpuestoInvensSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesImpuestoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormImpuestoInven.jComboBoxTiposAccionesFormularioImpuestoInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionImpuestoInvens();
				//this.importarImpuestoInvens();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesImpuestoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormImpuestoInven.jComboBoxTiposAccionesFormularioImpuestoInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessImpuestoInven();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelImpuestoInvensSeleccionados();
				//this.jComboBoxTiposAccionesImpuestoInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Impuesto Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessImpuestoInven();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoImpuestoInven)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyImpuestoInven(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Impuesto Inven",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesImpuestoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormImpuestoInven.jComboBoxTiposAccionesFormularioImpuestoInven.setSelectedIndex(0);					
				}	
			} 			
			else if(ImpuestoInvenBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteImpuestoInven) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessImpuestoInven(conSplash);
					
						//this.actualizarParametrosGeneralImpuestoInven();
						
						this.generarReporteProcesoAccionImpuestoInvensSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesImpuestoInven.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormImpuestoInven.jComboBoxTiposAccionesFormularioImpuestoInven.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ImpuestoInvenBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Impuesto InvenES SELECCIONADOS?", "MANTENIMIENTO DE Impuesto Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessImpuestoInven();
				
						this.actualizarParametrosGeneralImpuestoInven();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.impuestoinvenReturnGeneral=impuestoinvenLogic.procesarAccionImpuestoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.impuestoinvenLogic.getImpuestoInvens(),this.impuestoinvenParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarImpuestoInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesImpuestoInven.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormImpuestoInven.jComboBoxTiposAccionesFormularioImpuestoInven.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralImpuestoInven();
					
					ImpuestoInvenBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarImpuestoInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesImpuestoInven.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormImpuestoInven.jComboBoxTiposAccionesFormularioImpuestoInven.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessImpuestoInven(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesImpuestoInvenActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessImpuestoInven();
			
			if(this.jInternalFrameDetalleFormImpuestoInven==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ImpuestoInven> impuestoinvensSeleccionados=new ArrayList<ImpuestoInven>();		
			ImpuestoInven impuestoinven=new ImpuestoInven();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingImpuestoInven(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesImpuestoInven.getSelectedItem();
			
			
			
			
			impuestoinvensSeleccionados=this.getImpuestoInvensSeleccionados(true);
			//this.sTipoAccion;
			
			if(impuestoinvensSeleccionados.size()==1) {
				for(ImpuestoInven impuestoinvenAux:impuestoinvensSeleccionados) {
					impuestoinven=impuestoinvenAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Producto Impuesto")) {
					jButtonProductoImpuestoActionPerformed(null,rowIndex,true,false,impuestoinven);
				}
				else if(this.sTipoRelacion.equals("Detalle Impuesto Inven")) {
					jButtonDetalleImpuestoInvenActionPerformed(null,rowIndex,true,false,impuestoinven);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessImpuestoInven();
			
      		//this.finishProcessImpuestoInven(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarImpuestoInvenReturnGeneral() throws Exception {
		if(this.impuestoinvenReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.impuestoinvenReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.impuestoinvenReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.impuestoinvenReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.impuestoinvenReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.impuestoinvenReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingImpuestoInven(false);
		}
		
		if(this.impuestoinvenReturnGeneral.getConRetornoLista() || this.impuestoinvenReturnGeneral.getConRetornoObjeto()) {
			if(this.impuestoinvenReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.impuestoinvenLogic.setImpuestoInvens(this.impuestoinvenReturnGeneral.getImpuestoInvens());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.impuestoinvenReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.impuestoinvenLogic.setImpuestoInven(this.impuestoinvenReturnGeneral.getImpuestoInven());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingImpuestoInven(false);
		}
	}
	
	public void actualizarParametrosGeneralImpuestoInven() throws Exception {
		
		
	}
	
	public ArrayList<ImpuestoInven> getImpuestoInvensSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ImpuestoInven> impuestoinvensSeleccionados=new ArrayList<ImpuestoInven>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioImpuestoInven) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ImpuestoInven impuestoinvenAux:impuestoinvenLogic.getImpuestoInvens()) {
					if(impuestoinvenAux.getIsSelected()) {
						impuestoinvensSeleccionados.add(impuestoinvenAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ImpuestoInven impuestoinvenAux:this.impuestoinvens) {
					if(impuestoinvenAux.getIsSelected()) {
						impuestoinvensSeleccionados.add(impuestoinvenAux);				
					}
				}
			}
			
			if(impuestoinvensSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						impuestoinvensSeleccionados.addAll(this.impuestoinvenLogic.getImpuestoInvens());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						impuestoinvensSeleccionados.addAll(this.impuestoinvens);				
					}
				}
			}
		} else {
			impuestoinvensSeleccionados.add(this.impuestoinven);
		}
		
		return impuestoinvensSeleccionados;
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
	
	public void generarReporteImpuestoInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalImpuestoInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoImpuestoInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoImpuestoInvensSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoImpuestoInvensSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesImpuestoInvensSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Impuesto Inven",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesImpuestoInvensSeleccionados() throws Exception {
		ArrayList<ImpuestoInven> impuestoinvensSeleccionados=new ArrayList<ImpuestoInven>();		
		
		impuestoinvensSeleccionados=this.getImpuestoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteImpuestoInvens("Todos",impuestoinvensSeleccionados);
		
	}	
	
	public void generarReporteNormalImpuestoInvensSeleccionados() throws Exception {
		ArrayList<ImpuestoInven> impuestoinvensSeleccionados=new ArrayList<ImpuestoInven>();		
		
		impuestoinvensSeleccionados=this.getImpuestoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteImpuestoInvens("Todos",impuestoinvensSeleccionados);
	}		
	
	public void generarReporteProcesoAccionImpuestoInvensSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ImpuestoInven> impuestoinvensSeleccionados=new ArrayList<ImpuestoInven>();
		
		impuestoinvensSeleccionados=this.getImpuestoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteImpuestoInvens("Todos",impuestoinvensSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoImpuestoInvensSeleccionados() throws Exception {
		ArrayList<ImpuestoInven> impuestoinvensSeleccionados=new ArrayList<ImpuestoInven>();		
		
		
		this.abrirInicializarFrameReporteDinamicoImpuestoInven();
		
		
		impuestoinvensSeleccionados=this.getImpuestoInvensSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoImpuestoInven();
		
		
		//this.generarReporteImpuestoInvens("Todos",impuestoinvensSeleccionados ,impuestoinvenImplementable,impuestoinvenImplementableHome);
	}
	
	public void mostrarImportacionImpuestoInvens() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionImpuestoInven();
		
		this.abrirFrameImportacionImpuestoInven();		
		
			
		//this.generarReporteImpuestoInvens("Todos",impuestoinvensSeleccionados ,impuestoinvenImplementable,impuestoinvenImplementableHome);
	}
	
	public void importarImpuestoInvens() throws Exception {		
	
	}
	
	public void exportarImpuestoInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelImpuestoInvensSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoImpuestoInvensSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlImpuestoInvensSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Impuesto Inven",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoImpuestoInvensSeleccionados() throws Exception {
		ArrayList<ImpuestoInven> impuestoinvensSeleccionados=new ArrayList<ImpuestoInven>();		
		
		impuestoinvensSeleccionados=this.getImpuestoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"impuestoinven."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarImpuestoInven(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ImpuestoInven impuestoinvenAux:impuestoinvensSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarImpuestoInven(impuestoinvenAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//impuestoinvenAux.setsDetalleGeneralEntityReporte(impuestoinvenAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Impuesto Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarImpuestoInven(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ImpuestoInvenConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ImpuestoInvenConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ImpuestoInvenConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarImpuestoInven(ImpuestoInven impuestoinven,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=impuestoinven.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=impuestoinven.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=impuestoinven.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=impuestoinven.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelImpuestoInvensSeleccionados() throws Exception {
		ArrayList<ImpuestoInven> impuestoinvensSeleccionados=new ArrayList<ImpuestoInven>();		
		
		impuestoinvensSeleccionados=this.getImpuestoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"impuestoinven.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ImpuestoInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelImpuestoInven(row);				
				iRow++;
			}				
			
			for(ImpuestoInven impuestoinvenAux:impuestoinvensSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelImpuestoInven(impuestoinvenAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Impuesto Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlImpuestoInvensSeleccionados() throws Exception {
		ArrayList<ImpuestoInven> impuestoinvensSeleccionados=new ArrayList<ImpuestoInven>();		
		
		impuestoinvensSeleccionados=this.getImpuestoInvensSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"impuestoinven.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("impuestoinvens");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("impuestoinven");
			//elementRoot.appendChild(element);
		
			for(ImpuestoInven impuestoinvenAux:impuestoinvensSeleccionados) {
				element = document.createElement("impuestoinven");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlImpuestoInven(impuestoinvenAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Impuesto Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelImpuestoInven(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ImpuestoInvenConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ImpuestoInvenConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ImpuestoInvenConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelImpuestoInven(ImpuestoInven impuestoinven,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(impuestoinven.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(impuestoinven.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(impuestoinven.getnombre());				
	}
	
	public void setFilaDatosExportarXmlImpuestoInven(ImpuestoInven impuestoinven,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ImpuestoInvenConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(impuestoinven.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ImpuestoInvenConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(impuestoinven.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ImpuestoInvenConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(impuestoinven.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(ImpuestoInvenConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(impuestoinven.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoImpuestoInvensSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ImpuestoInven> impuestoinvensSeleccionados=new ArrayList<ImpuestoInven>();
		
		impuestoinvensSeleccionados=this.getImpuestoInvensSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoImpuestoInven(impuestoinvensSeleccionados);
		
		this.generarReporteImpuestoInvens("Todos",impuestoinvensSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoImpuestoInven(ArrayList<ImpuestoInven> impuestoinvensSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ImpuestoInven impuestoinvenAux:impuestoinvensSeleccionados) {
				impuestoinvenAux.setsDetalleGeneralEntityReporte(impuestoinvenAux.toString());
			
				if(sTipoSeleccionar.equals(ImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					impuestoinvenAux.setsDescripcionGeneralEntityReporte1(impuestoinvenAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ImpuestoInvenConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					impuestoinvenAux.setsDescripcionGeneralEntityReporte1(impuestoinvenAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesImpuestoInven(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoImpuestoInven=true;
				this.isVisibilidadCeldaNuevoRelacionesImpuestoInven=true;
				this.isVisibilidadCeldaGuardarCambiosImpuestoInven=true;
			}
			
			this.isVisibilidadCeldaModificarImpuestoInven=false;
			this.isVisibilidadCeldaActualizarImpuestoInven=false;
			this.isVisibilidadCeldaEliminarImpuestoInven=false;
			this.isVisibilidadCeldaCancelarImpuestoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarImpuestoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarImpuestoInven=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoImpuestoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesImpuestoInven=false;
			this.isVisibilidadCeldaGuardarCambiosImpuestoInven=false;
			this.isVisibilidadCeldaModificarImpuestoInven=false;
			this.isVisibilidadCeldaActualizarImpuestoInven=true;
			this.isVisibilidadCeldaEliminarImpuestoInven=false;
			this.isVisibilidadCeldaCancelarImpuestoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarImpuestoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarImpuestoInven=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoImpuestoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesImpuestoInven=false;
			this.isVisibilidadCeldaGuardarCambiosImpuestoInven=false;
			this.isVisibilidadCeldaModificarImpuestoInven=false;
			this.isVisibilidadCeldaActualizarImpuestoInven=true;
			this.isVisibilidadCeldaEliminarImpuestoInven=true;
			this.isVisibilidadCeldaCancelarImpuestoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarImpuestoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarImpuestoInven=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoImpuestoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesImpuestoInven=false;
			this.isVisibilidadCeldaGuardarCambiosImpuestoInven=false;
			this.isVisibilidadCeldaModificarImpuestoInven=false;
			this.isVisibilidadCeldaActualizarImpuestoInven=true;
			this.isVisibilidadCeldaEliminarImpuestoInven=false;
			this.isVisibilidadCeldaCancelarImpuestoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarImpuestoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarImpuestoInven=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoImpuestoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesImpuestoInven=true;
			this.isVisibilidadCeldaGuardarCambiosImpuestoInven=true;
			this.isVisibilidadCeldaModificarImpuestoInven=false;
			this.isVisibilidadCeldaActualizarImpuestoInven=false;
			this.isVisibilidadCeldaEliminarImpuestoInven=false;
			this.isVisibilidadCeldaCancelarImpuestoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarImpuestoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarImpuestoInven=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoImpuestoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesImpuestoInven=false;
			this.isVisibilidadCeldaGuardarCambiosImpuestoInven=false;
			this.isVisibilidadCeldaActualizarImpuestoInven=false;
			this.isVisibilidadCeldaEliminarImpuestoInven=false;
			this.isVisibilidadCeldaCancelarImpuestoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarImpuestoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarImpuestoInven=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoImpuestoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesImpuestoInven=false;
			this.isVisibilidadCeldaGuardarCambiosImpuestoInven=false;
			this.isVisibilidadCeldaModificarImpuestoInven=true;
			this.isVisibilidadCeldaActualizarImpuestoInven=false;
			this.isVisibilidadCeldaEliminarImpuestoInven=false;
			this.isVisibilidadCeldaCancelarImpuestoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarImpuestoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarImpuestoInven=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ImpuestoInvenJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoImpuestoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesImpuestoInven=true;
			this.isVisibilidadCeldaGuardarCambiosImpuestoInven=true;
		} else {
			this.actualizarEstadoPanelsImpuestoInven(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarImpuestoInven=false;
			//this.isVisibilidadCeldaVerFormImpuestoInven=false;
			this.isVisibilidadCeldaDuplicarImpuestoInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!impuestoinvenSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesImpuestoInven=false;
		} else {
			this.isVisibilidadCeldaNuevoImpuestoInven=false;
			this.isVisibilidadCeldaGuardarCambiosImpuestoInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(impuestoinvenSessionBean.getEsGuardarRelacionado()) {
			if(!impuestoinvenSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesImpuestoInven=false;												
			}
			
			this.jButtonCerrarImpuestoInven.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesImpuestoInven=false;
		}
		
		if(!this.permiteMantenimiento(this.impuestoinven)) {
			this.isVisibilidadCeldaActualizarImpuestoInven=false;
			this.isVisibilidadCeldaEliminarImpuestoInven=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesImpuestoInven() {
		this.isVisibilidadCeldaNuevoImpuestoInven=false;
		this.isVisibilidadCeldaGuardarCambiosImpuestoInven=false;
	}
	
	public void actualizarEstadoPanelsImpuestoInven(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionImpuestoInven!=null) {
				this.jScrollPanelDatosEdicionImpuestoInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasImpuestoInven!=null) {
				this.jTabbedPaneBusquedasImpuestoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosImpuestoInven!=null) {
				this.jScrollPanelDatosImpuestoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionImpuestoInven!=null) {
				this.jPanelPaginacionImpuestoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesImpuestoInven!=null) {
				this.jPanelParametrosReportesImpuestoInven.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionImpuestoInven!=null) {
				this.jScrollPanelDatosEdicionImpuestoInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasImpuestoInven!=null) {
				this.jTabbedPaneBusquedasImpuestoInven.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosImpuestoInven!=null) {
				this.jScrollPanelDatosImpuestoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionImpuestoInven!=null) {
				this.jPanelPaginacionImpuestoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesImpuestoInven!=null) {
				this.jPanelParametrosReportesImpuestoInven.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionImpuestoInven!=null) {
				this.jScrollPanelDatosEdicionImpuestoInven.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasImpuestoInven!=null) {
				this.jTabbedPaneBusquedasImpuestoInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosImpuestoInven!=null) {
				this.jScrollPanelDatosImpuestoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionImpuestoInven!=null) {
				this.jPanelPaginacionImpuestoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesImpuestoInven!=null) {
				this.jPanelParametrosReportesImpuestoInven.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionImpuestoInven!=null) {
				this.jScrollPanelDatosEdicionImpuestoInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasImpuestoInven!=null) {
				this.jTabbedPaneBusquedasImpuestoInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosImpuestoInven!=null) {
				this.jScrollPanelDatosImpuestoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionImpuestoInven!=null) {
				this.jPanelPaginacionImpuestoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesImpuestoInven!=null) {
				this.jPanelParametrosReportesImpuestoInven.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionImpuestoInven!=null) {
				this.jScrollPanelDatosEdicionImpuestoInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasImpuestoInven!=null) {
				this.jTabbedPaneBusquedasImpuestoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosImpuestoInven!=null) {
				this.jScrollPanelDatosImpuestoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionImpuestoInven!=null) {
				this.jPanelPaginacionImpuestoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesImpuestoInven!=null) {
				this.jPanelParametrosReportesImpuestoInven.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionImpuestoInven!=null) {
				this.jScrollPanelDatosEdicionImpuestoInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasImpuestoInven!=null) {
				this.jTabbedPaneBusquedasImpuestoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosImpuestoInven!=null) {
				this.jScrollPanelDatosImpuestoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionImpuestoInven!=null) {
				this.jPanelPaginacionImpuestoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesImpuestoInven!=null) {
				this.jPanelParametrosReportesImpuestoInven.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionImpuestoInven!=null) {
				this.jScrollPanelDatosEdicionImpuestoInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasImpuestoInven!=null) {
				this.jTabbedPaneBusquedasImpuestoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosImpuestoInven!=null) {
				this.jScrollPanelDatosImpuestoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionImpuestoInven!=null) {
				this.jPanelPaginacionImpuestoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesImpuestoInven!=null) {
				this.jPanelParametrosReportesImpuestoInven.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasImpuestoInven!=null) {
					this.jTabbedPaneBusquedasImpuestoInven.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesImpuestoInven!=null) {
				this.jPanelParametrosReportesImpuestoInven.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasImpuestoInven!=null) {
				this.jTabbedPaneBusquedasImpuestoInven.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesImpuestoInven!=null) {
				this.jPanelParametrosReportesImpuestoInven.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasImpuestoInven.remove(jPanelBusquedaPorNombreImpuestoInven);}
		}
		
	}
	
	

	public String registrarSesionImpuestoInvenParaProductoImpuestos() throws Exception {
		Boolean isPaginaPopupProductoImpuesto=false;

		try {

			if(this.impuestoinvenSessionBean==null) {
				this.impuestoinvenSessionBean=new ImpuestoInvenSessionBean();
			}

			if(this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoSessionBean==null) {
				this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoSessionBean=new ProductoImpuestoSessionBean();
			}

			this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoSessionBean.setsPathNavegacionActual(impuestoinvenSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProductoImpuesto=this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProductoImpuesto(true);
			this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoImpuesto(ImpuestoInvenConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoSessionBean.setisBusquedaDesdeForeignKeySesionImpuestoInven(true);
			this.jInternalFrameDetalleFormImpuestoInven.productoimpuestoSessionBean.setlidImpuestoInvenActual(this.idImpuestoInvenActual);

			impuestoinvenSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyImpuestoInven(true);
			impuestoinvenSessionBean.setlIdImpuestoInvenActualForeignKey(this.idImpuestoInvenActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionImpuestoInvenParaDetalleImpuestoInvenes() throws Exception {
		Boolean isPaginaPopupDetalleImpuestoInven=false;

		try {

			if(this.impuestoinvenSessionBean==null) {
				this.impuestoinvenSessionBean=new ImpuestoInvenSessionBean();
			}

			if(this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenSessionBean==null) {
				this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenSessionBean=new DetalleImpuestoInvenSessionBean();
			}

			this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenSessionBean.setsPathNavegacionActual(impuestoinvenSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleImpuestoInven=this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleImpuestoInven(true);
			this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleImpuestoInven(ImpuestoInvenConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenSessionBean.setisBusquedaDesdeForeignKeySesionImpuestoInven(true);
			this.jInternalFrameDetalleFormImpuestoInven.detalleimpuestoinvenSessionBean.setlidImpuestoInvenActual(this.idImpuestoInvenActual);

			impuestoinvenSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyImpuestoInven(true);
			impuestoinvenSessionBean.setlIdImpuestoInvenActualForeignKey(this.idImpuestoInvenActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ImpuestoInvenSessionBean impuestoinvenSessionBean=new ImpuestoInvenSessionBean();
		
		if(this.impuestoinvenSessionBean==null) {
			this.impuestoinvenSessionBean=new ImpuestoInvenSessionBean();
		}
		
		this.impuestoinvenSessionBean.setsUltimaBusquedaImpuestoInven(this.getsAccionBusqueda());
		this.impuestoinvenSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.impuestoinvenSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			impuestoinvenSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			impuestoinvenSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ImpuestoInvenSessionBean impuestoinvenSessionBean=new ImpuestoInvenSessionBean();
		
		if(this.impuestoinvenSessionBean==null) {
			this.impuestoinvenSessionBean=new ImpuestoInvenSessionBean();
		}
		
		if(this.impuestoinvenSessionBean.getsUltimaBusquedaImpuestoInven()!=null&&!this.impuestoinvenSessionBean.getsUltimaBusquedaImpuestoInven().equals("")) {
			this.setsAccionBusqueda(impuestoinvenSessionBean.getsUltimaBusquedaImpuestoInven());
			this.setiNumeroPaginacion(impuestoinvenSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(impuestoinvenSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(impuestoinvenSessionBean.getnombre());
				impuestoinvenSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(impuestoinvenSessionBean.getid_empresa());
				impuestoinvenSessionBean.setid_empresa(-1L);
			}
		}
		
		this.impuestoinvenSessionBean.setsUltimaBusquedaImpuestoInven("");
		this.impuestoinvenSessionBean.setiNumeroPaginacion(ImpuestoInvenConstantesFunciones.INUMEROPAGINACION);
		this.impuestoinvenSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaImpuestoInven(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioImpuestoInven() {
		this.updateBorderResaltarBusquedasFormularioImpuestoInven();
		this.updateVisibilidadBusquedasFormularioImpuestoInven();
		this.updateHabilitarBusquedasFormularioImpuestoInven();
	}
	
	public void updateBorderResaltarBusquedasFormularioImpuestoInven() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasImpuestoInven.getComponents().length>0) {
	

		if(this.impuestoinvenConstantesFunciones.resaltarBusquedaPorNombreImpuestoInven!=null) {
			index= this.jTabbedPaneBusquedasImpuestoInven.indexOfComponent(this.jPanelBusquedaPorNombreImpuestoInven);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasImpuestoInven.getComponent(index);
				jPanel.setBorder(this.impuestoinvenConstantesFunciones.resaltarBusquedaPorNombreImpuestoInven);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioImpuestoInven() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasImpuestoInven.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasImpuestoInven.indexOfComponent(this.jPanelBusquedaPorNombreImpuestoInven);
			jPanel=(JPanel)this.jTabbedPaneBusquedasImpuestoInven.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.impuestoinvenConstantesFunciones.mostrarBusquedaPorNombreImpuestoInven);
			if(!this.impuestoinvenConstantesFunciones.mostrarBusquedaPorNombreImpuestoInven && index>-1) {
				this.jTabbedPaneBusquedasImpuestoInven.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioImpuestoInven() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasImpuestoInven.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasImpuestoInven.indexOfComponent(this.jPanelBusquedaPorNombreImpuestoInven);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasImpuestoInven.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.impuestoinvenConstantesFunciones.activarBusquedaPorNombreImpuestoInven);
				this.jTabbedPaneBusquedasImpuestoInven.setEnabledAt(index,this.impuestoinvenConstantesFunciones.activarBusquedaPorNombreImpuestoInven);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaImpuestoInven(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasImpuestoInven.indexOfComponent(this.jPanelBusquedaPorNombreImpuestoInven);

			this.jTabbedPaneBusquedasImpuestoInven.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasImpuestoInven.getComponent(index);

			this.impuestoinvenConstantesFunciones.setResaltarBusquedaPorNombreImpuestoInven(resaltar);

			jPanel.setBorder(this.impuestoinvenConstantesFunciones.resaltarBusquedaPorNombreImpuestoInven);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarImpuestoInven.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioImpuestoInven() throws Exception {

		if(this.jInternalFrameDetalleFormImpuestoInven==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioImpuestoInven();
		this.updateVisibilidadResaltarControlesFormularioImpuestoInven();
		this.updateHabilitarResaltarControlesFormularioImpuestoInven();
		
	}
	
	public void updateBorderResaltarControlesFormularioImpuestoInven() throws Exception {
		if(this.jInternalFrameDetalleFormImpuestoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.impuestoinvenConstantesFunciones.resaltaridImpuestoInven!=null && this.jInternalFrameDetalleFormImpuestoInven!=null) {this.jInternalFrameDetalleFormImpuestoInven.jLabelidImpuestoInven.setBorder(this.impuestoinvenConstantesFunciones.resaltaridImpuestoInven);}
		if(this.impuestoinvenConstantesFunciones.resaltarid_empresaImpuestoInven!=null && this.jInternalFrameDetalleFormImpuestoInven!=null) {this.jInternalFrameDetalleFormImpuestoInven.jComboBoxid_empresaImpuestoInven.setBorder(this.impuestoinvenConstantesFunciones.resaltarid_empresaImpuestoInven);}
		if(this.impuestoinvenConstantesFunciones.resaltarnombreImpuestoInven!=null && this.jInternalFrameDetalleFormImpuestoInven!=null) {this.jInternalFrameDetalleFormImpuestoInven.jTextAreanombreImpuestoInven.setBorder(this.impuestoinvenConstantesFunciones.resaltarnombreImpuestoInven);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioImpuestoInven() throws Exception {		
		if(this.jInternalFrameDetalleFormImpuestoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) {
	
		//this.jInternalFrameDetalleFormImpuestoInven.jLabelidImpuestoInven.setVisible(this.impuestoinvenConstantesFunciones.mostraridImpuestoInven);
		this.jInternalFrameDetalleFormImpuestoInven.jPanelidImpuestoInven.setVisible(this.impuestoinvenConstantesFunciones.mostraridImpuestoInven);
		//this.jInternalFrameDetalleFormImpuestoInven.jComboBoxid_empresaImpuestoInven.setVisible(this.impuestoinvenConstantesFunciones.mostrarid_empresaImpuestoInven);
		this.jInternalFrameDetalleFormImpuestoInven.jPanelid_empresaImpuestoInven.setVisible(this.impuestoinvenConstantesFunciones.mostrarid_empresaImpuestoInven);
		//this.jInternalFrameDetalleFormImpuestoInven.jTextAreanombreImpuestoInven.setVisible(this.impuestoinvenConstantesFunciones.mostrarnombreImpuestoInven);
		this.jInternalFrameDetalleFormImpuestoInven.jPanelnombreImpuestoInven.setVisible(this.impuestoinvenConstantesFunciones.mostrarnombreImpuestoInven);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioImpuestoInven() throws Exception {
		if(this.jInternalFrameDetalleFormImpuestoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormImpuestoInven!=null) {
	
		this.jInternalFrameDetalleFormImpuestoInven.jLabelidImpuestoInven.setEnabled(this.impuestoinvenConstantesFunciones.activaridImpuestoInven);
		this.jInternalFrameDetalleFormImpuestoInven.jComboBoxid_empresaImpuestoInven.setEnabled(this.impuestoinvenConstantesFunciones.activarid_empresaImpuestoInven);
		this.jInternalFrameDetalleFormImpuestoInven.jTextAreanombreImpuestoInven.setEnabled(this.impuestoinvenConstantesFunciones.activarnombreImpuestoInven);
		}
	}
	
		
}