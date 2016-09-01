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

import com.bydan.erp.inventario.util.GrupoColorConstantesFunciones;
import com.bydan.erp.inventario.util.GrupoColorParameterReturnGeneral;
//import com.bydan.erp.inventario.util.GrupoColorParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.GrupoColorBean;
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
public class GrupoColorBeanSwingJInternalFrame extends GrupoColorJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(GrupoColorBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<GrupoColor> grupocolorValidator = new ClassValidator<GrupoColor>(GrupoColor.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public GrupoColor grupocolor;	
	public GrupoColor grupocolorAux;
	public GrupoColor grupocolorAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public GrupoColor grupocolorTotales;
	public Long idGrupoColorActual;
	public Long iIdNuevoGrupoColor=0L;
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

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosColorProducto=false;

	public Boolean getIsTienePermisosColorProducto() {
		return isTienePermisosColorProducto;
	}

	public void setIsTienePermisosColorProducto(Boolean isTienePermisosColorProducto) {
		this.isTienePermisosColorProducto= isTienePermisosColorProducto;
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
	
	public Boolean isPermisoTodoGrupoColor;
	public Boolean isPermisoNuevoGrupoColor;
	public Boolean isPermisoActualizarGrupoColor;
	public Boolean isPermisoActualizarOriginalGrupoColor;
	public Boolean isPermisoEliminarGrupoColor;
	public Boolean isPermisoGuardarCambiosGrupoColor;
	public Boolean isPermisoConsultaGrupoColor;
	public Boolean isPermisoBusquedaGrupoColor;
	public Boolean isPermisoReporteGrupoColor;
	public Boolean isPermisoPaginacionMedioGrupoColor;
	public Boolean isPermisoPaginacionAltoGrupoColor;
	public Boolean isPermisoPaginacionTodoGrupoColor;
	public Boolean isPermisoCopiarGrupoColor;
	public Boolean isPermisoVerFormGrupoColor;
	public Boolean isPermisoDuplicarGrupoColor;
	public Boolean isPermisoOrdenGrupoColor;
	
	
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
	
	public GrupoColorParameterReturnGeneral grupocolorReturnGeneral;
	public GrupoColorParameterReturnGeneral grupocolorParameterGeneral;
	
	

	public ColorProductoLogic colorproductoLogic=null;

	public ColorProductoLogic getColorProductoLogic() {
		return colorproductoLogic;
	}

	public void setColorProductoLogic(ColorProductoLogic colorproductoLogic) {
		this.colorproductoLogic = colorproductoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoGrupoColor=false;
	public Boolean esParaAccionDesdeFormularioGrupoColor=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected GrupoColorSessionBeanAdditional grupocolorSessionBeanAdditional=null;
	
	public GrupoColorSessionBeanAdditional getGrupoColorSessionBeanAdditional() {
		return this.grupocolorSessionBeanAdditional;
	}
	
	public void setGrupoColorSessionBeanAdditional(GrupoColorSessionBeanAdditional grupocolorSessionBeanAdditional) {
		try {
			this.grupocolorSessionBeanAdditional=grupocolorSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected GrupoColorBeanSwingJInternalFrameAdditional grupocolorBeanSwingJInternalFrameAdditional=null;
	//public class GrupoColorBeanSwingJInternalFrame
	
	public GrupoColorBeanSwingJInternalFrameAdditional getGrupoColorBeanSwingJInternalFrameAdditional() {
		return this.grupocolorBeanSwingJInternalFrameAdditional;
	}
	
	public void setGrupoColorBeanSwingJInternalFrameAdditional(GrupoColorBeanSwingJInternalFrameAdditional grupocolorBeanSwingJInternalFrameAdditional) {
		try {
			this.grupocolorBeanSwingJInternalFrameAdditional=grupocolorBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public GrupoColorLogic grupocolorLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public GrupoColor grupocolorBean;
	public GrupoColorConstantesFunciones grupocolorConstantesFunciones;
	//public GrupoColorParameterReturnGeneral grupocolorReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	
	//PARAMETROS
	
	
	//public List<GrupoColor> grupocolors;	
	//public List<GrupoColor> grupocolorsEliminados;
	//public List<GrupoColor> grupocolorsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoGrupoColor=false;
	public Boolean isVisibilidadCeldaDuplicarGrupoColor=true;
	public Boolean isVisibilidadCeldaCopiarGrupoColor=true;
	public Boolean isVisibilidadCeldaVerFormGrupoColor=true;
	public Boolean isVisibilidadCeldaOrdenGrupoColor=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesGrupoColor=false;
	public Boolean isVisibilidadCeldaModificarGrupoColor=false;
	public Boolean isVisibilidadCeldaActualizarGrupoColor=false;
	public Boolean isVisibilidadCeldaEliminarGrupoColor=false;
	public Boolean isVisibilidadCeldaCancelarGrupoColor=false;
	public Boolean isVisibilidadCeldaGuardarGrupoColor=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosGrupoColor=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoGrupoColor() {
		return this.iIdNuevoGrupoColor;
	}

	public void setiIdNuevoGrupoColor(Long iIdNuevoGrupoColor) {
		this.iIdNuevoGrupoColor = iIdNuevoGrupoColor;
	}
	
	public Long getidGrupoColorActual() {
		return this.idGrupoColorActual;
	}

	public void setidGrupoColorActual(Long idGrupoColorActual) {
		this.idGrupoColorActual = idGrupoColorActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public GrupoColor getgrupocolor() {
		return this.grupocolor;
	}

	public void setgrupocolor(GrupoColor grupocolor) {
		this.grupocolor = grupocolor;
	}
	
	public GrupoColor getgrupocolorAux() {
		return this.grupocolorAux;
	}

	public void setgrupocolorAux(GrupoColor grupocolorAux) {
		this.grupocolorAux = grupocolorAux;
	}				
	
	public GrupoColor getgrupocolorAnterior() {
		return this.grupocolorAnterior;
	}

	public void setgrupocolorAnterior(GrupoColor grupocolorAnterior) {
		this.grupocolorAnterior = grupocolorAnterior;
	}	
	
	public GrupoColor getgrupocolorTotales() {
		return this.grupocolorTotales;
	}

	public void setgrupocolorTotales(GrupoColor grupocolorTotales) {
		this.grupocolorTotales = grupocolorTotales;
	}	
	
	public GrupoColor getgrupocolorBean() {
		return this.grupocolorBean;
	}

	public void setgrupocolorBean(GrupoColor grupocolorBean) {
		this.grupocolorBean = grupocolorBean;
	}	
	
	public GrupoColorParameterReturnGeneral getgrupocolorReturnGeneral() {
		return this.grupocolorReturnGeneral;
	}

	public void setgrupocolorReturnGeneral(GrupoColorParameterReturnGeneral grupocolorReturnGeneral) {
		this.grupocolorReturnGeneral = grupocolorReturnGeneral;
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

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public GrupoColorLogic getGrupoColorLogic()	{		
		return grupocolorLogic;
	}

	public void setGrupoColorLogic(GrupoColorLogic grupocolorLogic) {
		this.grupocolorLogic = grupocolorLogic;
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
	
	public Boolean getIsEsNuevoGrupoColor() {
		return isEsNuevoGrupoColor;
	}

	public void setIsEsNuevoGrupoColor(Boolean isEsNuevoGrupoColor) {
		this.isEsNuevoGrupoColor = isEsNuevoGrupoColor;
	}

	public Boolean getEsParaAccionDesdeFormularioGrupoColor() {
		return esParaAccionDesdeFormularioGrupoColor;
	}
	
	public void setEsParaAccionDesdeFormularioGrupoColor(Boolean esParaAccionDesdeFormularioGrupoColor) {
		this.esParaAccionDesdeFormularioGrupoColor = esParaAccionDesdeFormularioGrupoColor;
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

			if(this.grupocolorSessionBean==null) {
				this.grupocolorSessionBean=new GrupoColorSessionBean();
			}

			if(!this.grupocolorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(grupocolorSessionBean.getlidEmpresaActual());
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

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.grupocolorSessionBean==null) {
				this.grupocolorSessionBean=new GrupoColorSessionBean();
			}

			if(!this.grupocolorSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(grupocolorSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
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

					if(this.grupocolor!=null) {
						this.grupocolor.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormGrupoColor!=null) {
						this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_empresaGrupoColor.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaGrupoColor.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormGrupoColor!=null) {
						if(this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_empresaGrupoColor.getItemCount()>0) {
							this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_empresaGrupoColor.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaGrupoColorGenerico)throws Exception
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
				jComboBoxid_empresaGrupoColorGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaGrupoColorGenerico!=null && jComboBoxid_empresaGrupoColorGenerico.getItemCount()>0) {
					jComboBoxid_empresaGrupoColorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.grupocolor!=null) {
						this.grupocolor.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormGrupoColor!=null) {
						this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_sucursalGrupoColor.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalGrupoColor.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormGrupoColor!=null) {
						if(this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_sucursalGrupoColor.getItemCount()>0) {
							this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_sucursalGrupoColor.setSelectedIndex(0);
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

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalGrupoColorGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalGrupoColorGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalGrupoColorGenerico!=null && jComboBoxid_sucursalGrupoColorGenerico.getItemCount()>0) {
					jComboBoxid_sucursalGrupoColorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(GrupoColor grupocolor,JComboBox jComboBoxid_empresaGrupoColorGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaGrupoColorGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_empresaGrupoColor.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaGrupoColorGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				grupocolor.setid_empresa(empresaAux.getId());
				grupocolor.setempresa_descripcion(GrupoColorConstantesFunciones.getEmpresaDescripcion(empresaAux));
				grupocolor.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(GrupoColor grupocolor,JComboBox jComboBoxid_sucursalGrupoColorGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalGrupoColorGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_sucursalGrupoColor.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalGrupoColorGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				grupocolor.setid_sucursal(sucursalAux.getId());
				grupocolor.setsucursal_descripcion(GrupoColorConstantesFunciones.getSucursalDescripcion(sucursalAux));
				grupocolor.setSucursal(sucursalAux);			}
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

					if(!GrupoColorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGrupoColor!=null) { 
							this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_empresaGrupoColor.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_empresaGrupoColor.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGrupoColor!=null) { 
					}

					if(!GrupoColorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!GrupoColorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGrupoColor!=null) { 
							this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_sucursalGrupoColor.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_sucursalGrupoColor.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGrupoColor!=null) { 
					}

					if(!GrupoColorJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormGrupoColor!=null) {
							this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_empresaGrupoColor.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormGrupoColor!=null) {
							this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_empresaGrupoColor.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormGrupoColor!=null) {
							this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_sucursalGrupoColor.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormGrupoColor!=null) {
							this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_sucursalGrupoColor.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesGrupoColor() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			GrupoColorConstantesFunciones.refrescarForeignKeysDescripcionesGrupoColor(this.grupocolorLogic.getGrupoColors());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			GrupoColorConstantesFunciones.refrescarForeignKeysDescripcionesGrupoColor(this.grupocolors);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//grupocolorLogic.setGrupoColors(this.grupocolors);
			grupocolorLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public GrupoColorParameterReturnGeneral getGrupoColorParameterGeneral() {
		return this.grupocolorParameterGeneral;
	}
	
	public void setGrupoColorParameterGeneral(GrupoColorParameterReturnGeneral grupocolorParameterGeneral) {
		this.grupocolorParameterGeneral = grupocolorParameterGeneral;
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
	
	public Boolean getIsPermisoTodoGrupoColor() {
		return isPermisoTodoGrupoColor;
	}

	public void setIsPermisoTodoGrupoColor(Boolean isPermisoTodoGrupoColor) {
		this.isPermisoTodoGrupoColor = isPermisoTodoGrupoColor;
	}

	public Boolean getIsPermisoNuevoGrupoColor() {
		return isPermisoNuevoGrupoColor;
	}

	public void setIsPermisoNuevoGrupoColor(Boolean isPermisoNuevoGrupoColor) {
		this.isPermisoNuevoGrupoColor = isPermisoNuevoGrupoColor;
	}

	public Boolean getIsPermisoActualizarGrupoColor() {
		return isPermisoActualizarGrupoColor;
	}

	public void setIsPermisoActualizarGrupoColor(Boolean isPermisoActualizarGrupoColor) {
		this.isPermisoActualizarGrupoColor = isPermisoActualizarGrupoColor;
	}

	public Boolean getIsPermisoEliminarGrupoColor() {
		return isPermisoEliminarGrupoColor;
	}

	public void setIsPermisoEliminarGrupoColor(Boolean isPermisoEliminarGrupoColor) {
		this.isPermisoEliminarGrupoColor = isPermisoEliminarGrupoColor;
	}

	public Boolean getIsPermisoGuardarCambiosGrupoColor() {
		return isPermisoGuardarCambiosGrupoColor;
	}

	public void setIsPermisoGuardarCambiosGrupoColor(Boolean isPermisoGuardarCambiosGrupoColor) {
		this.isPermisoGuardarCambiosGrupoColor = isPermisoGuardarCambiosGrupoColor;
	}
	
	public Boolean getIsPermisoConsultaGrupoColor() {
		return isPermisoConsultaGrupoColor;
	}

	public void setIsPermisoConsultaGrupoColor(Boolean isPermisoConsultaGrupoColor) {
		this.isPermisoConsultaGrupoColor = isPermisoConsultaGrupoColor;
	}

	public Boolean getIsPermisoBusquedaGrupoColor() {
		return isPermisoBusquedaGrupoColor;
	}

	public void setIsPermisoBusquedaGrupoColor(Boolean isPermisoBusquedaGrupoColor) {
		this.isPermisoBusquedaGrupoColor = isPermisoBusquedaGrupoColor;
	}

	public Boolean getIsPermisoReporteGrupoColor() {
		return isPermisoReporteGrupoColor;
	}

	public void setIsPermisoReporteGrupoColor(Boolean isPermisoReporteGrupoColor) {
		this.isPermisoReporteGrupoColor = isPermisoReporteGrupoColor;
	}
	
	public Boolean getIsPermisoPaginacionMedioGrupoColor() {
		return isPermisoPaginacionMedioGrupoColor;
	}

	public void setIsPermisoPaginacionMedioGrupoColor(Boolean isPermisoPaginacionMedioGrupoColor) {
		this.isPermisoPaginacionMedioGrupoColor = isPermisoPaginacionMedioGrupoColor;
	}
	
	public Boolean getIsPermisoPaginacionTodoGrupoColor() {
		return isPermisoPaginacionTodoGrupoColor;
	}

	public void setIsPermisoPaginacionTodoGrupoColor(Boolean isPermisoPaginacionTodoGrupoColor) {
		this.isPermisoPaginacionTodoGrupoColor = isPermisoPaginacionTodoGrupoColor;
	}
	
	public Boolean getIsPermisoPaginacionAltoGrupoColor() {
		return isPermisoPaginacionAltoGrupoColor;
	}

	public void setIsPermisoPaginacionAltoGrupoColor(Boolean isPermisoPaginacionAltoGrupoColor) {
		this.isPermisoPaginacionAltoGrupoColor = isPermisoPaginacionAltoGrupoColor;
	}
	
	public Boolean getIsPermisoCopiarGrupoColor() {
		return isPermisoCopiarGrupoColor;
	}

	public void setIsPermisoCopiarGrupoColor(Boolean isPermisoCopiarGrupoColor) {
		this.isPermisoCopiarGrupoColor = isPermisoCopiarGrupoColor;
	}
	
	public Boolean getIsPermisoVerFormGrupoColor() {
		return isPermisoVerFormGrupoColor;
	}

	public void setIsPermisoVerFormGrupoColor(Boolean isPermisoVerFormGrupoColor) {
		this.isPermisoVerFormGrupoColor = isPermisoVerFormGrupoColor;
	}
	
	public Boolean getIsPermisoDuplicarGrupoColor() {
		return isPermisoDuplicarGrupoColor;
	}

	public void setIsPermisoDuplicarGrupoColor(Boolean isPermisoDuplicarGrupoColor) {
		this.isPermisoDuplicarGrupoColor = isPermisoDuplicarGrupoColor;
	}
	
	public Boolean getIsPermisoOrdenGrupoColor() {
		return isPermisoOrdenGrupoColor;
	}

	public void setIsPermisoOrdenGrupoColor(Boolean isPermisoOrdenGrupoColor) {
		this.isPermisoOrdenGrupoColor = isPermisoOrdenGrupoColor;
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
	
	public Boolean getIsVisibilidadCeldaNuevoGrupoColor() {
		return isVisibilidadCeldaNuevoGrupoColor;
	}

	public void setIsVisibilidadCeldaNuevoGrupoColor(Boolean isVisibilidadCeldaNuevoGrupoColor) {
		this.isVisibilidadCeldaNuevoGrupoColor = isVisibilidadCeldaNuevoGrupoColor;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarGrupoColor() {
		return isVisibilidadCeldaDuplicarGrupoColor;
	}

	public void setIsVisibilidadCeldaDuplicarGrupoColor(Boolean isVisibilidadCeldaDuplicarGrupoColor) {
		this.isVisibilidadCeldaDuplicarGrupoColor = isVisibilidadCeldaDuplicarGrupoColor;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarGrupoColor() {
		return isVisibilidadCeldaCopiarGrupoColor;
	}

	public void setIsVisibilidadCeldaCopiarGrupoColor(Boolean isVisibilidadCeldaCopiarGrupoColor) {
		this.isVisibilidadCeldaCopiarGrupoColor = isVisibilidadCeldaCopiarGrupoColor;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormGrupoColor() {
		return isVisibilidadCeldaVerFormGrupoColor;
	}

	public void setIsVisibilidadCeldaVerFormGrupoColor(Boolean isVisibilidadCeldaVerFormGrupoColor) {
		this.isVisibilidadCeldaVerFormGrupoColor = isVisibilidadCeldaVerFormGrupoColor;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenGrupoColor() {
		return isVisibilidadCeldaOrdenGrupoColor;
	}

	public void setIsVisibilidadCeldaOrdenGrupoColor(Boolean isVisibilidadCeldaOrdenGrupoColor) {
		this.isVisibilidadCeldaOrdenGrupoColor = isVisibilidadCeldaOrdenGrupoColor;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesGrupoColor() {
		return isVisibilidadCeldaNuevoRelacionesGrupoColor;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesGrupoColor(Boolean isVisibilidadCeldaNuevoRelacionesGrupoColor) {
		this.isVisibilidadCeldaNuevoRelacionesGrupoColor = isVisibilidadCeldaNuevoRelacionesGrupoColor;
	}
	
	public Boolean getIsVisibilidadCeldaModificarGrupoColor() {
		return isVisibilidadCeldaModificarGrupoColor;
	}

	public void setIsVisibilidadCeldaModificarGrupoColor(Boolean isVisibilidadCeldaModificarGrupoColor) {
		this.isVisibilidadCeldaModificarGrupoColor = isVisibilidadCeldaModificarGrupoColor;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarGrupoColor() {
		return isVisibilidadCeldaActualizarGrupoColor;
	}

	public void setIsVisibilidadCeldaActualizarGrupoColor(Boolean isVisibilidadCeldaActualizarGrupoColor) {
		this.isVisibilidadCeldaActualizarGrupoColor = isVisibilidadCeldaActualizarGrupoColor;
	}

	public Boolean getIsVisibilidadCeldaEliminarGrupoColor() {
		return isVisibilidadCeldaEliminarGrupoColor;
	}

	public void setIsVisibilidadCeldaEliminarGrupoColor(Boolean isVisibilidadCeldaEliminarGrupoColor) {
		this.isVisibilidadCeldaEliminarGrupoColor = isVisibilidadCeldaEliminarGrupoColor;
	}

	public Boolean getIsVisibilidadCeldaCancelarGrupoColor() {
		return isVisibilidadCeldaCancelarGrupoColor;
	}

	public void setIsVisibilidadCeldaCancelarGrupoColor(Boolean isVisibilidadCeldaCancelarGrupoColor) {
		this.isVisibilidadCeldaCancelarGrupoColor = isVisibilidadCeldaCancelarGrupoColor;
	}

	public Boolean getIsVisibilidadCeldaGuardarGrupoColor() {
		return isVisibilidadCeldaGuardarGrupoColor;
	}

	public void setIsVisibilidadCeldaGuardarGrupoColor(Boolean isVisibilidadCeldaGuardarGrupoColor) {
		this.isVisibilidadCeldaGuardarGrupoColor = isVisibilidadCeldaGuardarGrupoColor;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosGrupoColor() {
		return isVisibilidadCeldaGuardarCambiosGrupoColor;
	}

	public void setIsVisibilidadCeldaGuardarCambiosGrupoColor(Boolean isVisibilidadCeldaGuardarCambiosGrupoColor) {
		this.isVisibilidadCeldaGuardarCambiosGrupoColor = isVisibilidadCeldaGuardarCambiosGrupoColor;
	}
		
	public GrupoColorSessionBean getgrupocolorSessionBean() {
		return this.grupocolorSessionBean;
	}
	
	public void setgrupocolorSessionBean(GrupoColorSessionBean grupocolorSessionBean) {
		this.grupocolorSessionBean=grupocolorSessionBean;
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

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysGrupoColor(GrupoColor grupocolor)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(grupocolor,null);
				this.setActualParaGuardarSucursalForeignKey(grupocolor,null);
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
	
	public void bugActualizarReferenciaActual(GrupoColor grupocolor,GrupoColor grupocolorAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalGrupoColor(grupocolor);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		grupocolorAux.setId(grupocolor.getId());
		grupocolorAux.setVersionRow(grupocolor.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessGrupoColor();
		
			int intSelectedRow = this.jTableDatosGrupoColor.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolor =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.grupocolor =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(GrupoColorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualGrupoColor(this.grupocolor,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoColor(this.grupocolor);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = grupocolorValidator.getInvalidValues(this.grupocolor);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			grupocolorLogic.setDatosCliente(datosCliente);
			grupocolorLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				grupocolorAux=new  GrupoColor();
				
				grupocolorAux.setIsNew(true);
				grupocolorAux.setIsChanged(true);
				
				grupocolorAux.setGrupoColorOriginal(this.grupocolor);
				
				grupocolorAux.setId(this.grupocolor.getId());	
				grupocolorAux.setVersionRow(this.grupocolor.getVersionRow());	
				grupocolorAux.setid_empresa(this.grupocolor.getid_empresa());	
				grupocolorAux.setid_sucursal(this.grupocolor.getid_sucursal());	
				grupocolorAux.setcodigo(this.grupocolor.getcodigo());	
				grupocolorAux.setnombre(this.grupocolor.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.grupocolorSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.grupocolorSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(grupocolorAux,grupocolorLogic.getGrupoColors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(grupocolorAux,grupocolors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.grupocolorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.grupocolorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupocolorLogic.saveGrupoColors();//WithConnection
						//grupocolorLogic.getSetVersionRowGrupoColors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.grupocolor,grupocolorAux);
					
					this.refrescarForeignKeysDescripcionesGrupoColor();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.grupocolorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductoLogic.getColorProductos().addAll(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductos.addAll(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.grupocolorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								grupocolorLogic.saveGrupoColorRelaciones(grupocolorAux,this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductoLogic.getColorProductos());//WithConnection
								//grupocolorLogic.getSetVersionRowGrupoColors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.grupocolor,grupocolorAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductoLogic.setColorProductos(new ArrayList<ColorProducto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductos= new ArrayList<ColorProducto>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							grupocolorAux.setColorProductos(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductoLogic.getColorProductos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.grupocolorSessionBean.getEstaModoGuardarRelaciones() 
									|| this.grupocolorSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(grupocolorAux,grupocolorLogic.getGrupoColors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(grupocolorAux,grupocolors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.grupocolor,grupocolorAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				grupocolorAux=new  GrupoColor();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.grupocolorSessionBean.getEsGuardarRelacionado() 
					|| (this.grupocolorSessionBean.getEsGuardarRelacionado() && this.grupocolor.getId()>=0)) {
						
					grupocolorAux.setIsNew(false);
				}
				
				grupocolorAux.setIsDeleted(false);
			
				grupocolorAux.setId(this.grupocolor.getId());	
				grupocolorAux.setVersionRow(this.grupocolor.getVersionRow());	
				grupocolorAux.setid_empresa(this.grupocolor.getid_empresa());	
				grupocolorAux.setid_sucursal(this.grupocolor.getid_sucursal());	
				grupocolorAux.setcodigo(this.grupocolor.getcodigo());	
				grupocolorAux.setnombre(this.grupocolor.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(grupocolorAux,grupocolorLogic.getGrupoColors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(grupocolorAux,grupocolors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.grupocolorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.grupocolorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupocolorLogic.saveGrupoColors();//WithConnection
						//grupocolorLogic.getSetVersionRowGrupoColors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.grupocolor,grupocolorAux);
					
					this.refrescarForeignKeysDescripcionesGrupoColor();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.grupocolorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductoLogic.getColorProductos().addAll(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductos.addAll(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.grupocolorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								grupocolorLogic.saveGrupoColorRelaciones(grupocolorAux,this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductoLogic.getColorProductos());//WithConnection
								//grupocolorLogic.getSetVersionRowGrupoColors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.grupocolor,grupocolorAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductoLogic.setColorProductos(new ArrayList<ColorProducto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductos= new ArrayList<ColorProducto>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							grupocolorAux.setColorProductos(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductoLogic.getColorProductos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.grupocolorSessionBean.getEstaModoGuardarRelaciones() 
									|| this.grupocolorSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(grupocolorAux,grupocolorLogic.getGrupoColors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(grupocolorAux,grupocolors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.grupocolor,grupocolorAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				grupocolorAux=new  GrupoColor();
				
				grupocolorAux.setIsNew(false);
				grupocolorAux.setIsChanged(false);
				
				grupocolorAux.setIsDeleted(true);
				
				grupocolorAux.setId(this.grupocolor.getId());	
				grupocolorAux.setVersionRow(this.grupocolor.getVersionRow());	
				grupocolorAux.setid_empresa(this.grupocolor.getid_empresa());	
				grupocolorAux.setid_sucursal(this.grupocolor.getid_sucursal());	
				grupocolorAux.setcodigo(this.grupocolor.getcodigo());	
				grupocolorAux.setnombre(this.grupocolor.getnombre());	
				
				if(this.grupocolorSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.grupocolorAux.getId()>=0) {	
						this.grupocolorsEliminados.add(grupocolorAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(grupocolorAux,grupocolorLogic.getGrupoColors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(grupocolorAux,grupocolors);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.grupocolorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.grupocolorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupocolorLogic.saveGrupoColors();//WithConnection
						//grupocolorLogic.getSetVersionRowGrupoColors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.grupocolorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductoLogic.getColorProductos().addAll(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductos.addAll(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.grupocolorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.jInternalFrameDetalleFormColorProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								grupocolorLogic.saveGrupoColorRelaciones(grupocolorAux,this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductoLogic.getColorProductos());//WithConnection
								//grupocolorLogic.getSetVersionRowGrupoColors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductoLogic.setColorProductos(new ArrayList<ColorProducto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductos= new ArrayList<ColorProducto>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							grupocolorAux.setColorProductos(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductoLogic.getColorProductos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.grupocolorSessionBean.getEstaModoGuardarRelaciones() 
								|| this.grupocolorSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(grupocolorAux,grupocolorLogic.getGrupoColors());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(grupocolorAux,grupocolors);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.getGrupoColors().addAll(this.grupocolorsEliminados);
					
					grupocolorLogic.saveGrupoColors();//WithConnection
					//grupocolorLogic.getSetVersionRowGrupoColors();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesGrupoColor();
				
				this.grupocolorsEliminados= new ArrayList<GrupoColor>();		
			}
			
			if(this.grupocolorSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupocolorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Grupo Color GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Grupo Color",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.grupocolor=grupocolorAux;
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
      		//this.finishProcessGrupoColor();
      	}
		
	}	
	
	public void actualizarRelaciones(GrupoColor grupocolorLocal) throws Exception {
		
		if(this.grupocolorSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				grupocolorLocal.setColorProductos(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductoLogic.getColorProductos());
			
			} else {
			
				grupocolorLocal.setColorProductos(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(GrupoColor grupocolorLocal) throws Exception {	
		if(this.grupocolorSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				grupocolorLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				grupocolorLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarGrupoColorActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosGrupoColor.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.grupocolor =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.grupocolor =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = grupocolorValidator.getInvalidValues(this.grupocolor);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(GrupoColor grupocolor,List<GrupoColor> grupocolors) throws Exception {
		try	{		
			GrupoColorConstantesFunciones.actualizarLista(grupocolor,grupocolors,this.grupocolorSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(GrupoColor grupocolor,List<GrupoColor> grupocolors) throws Exception {
		try	{			
			GrupoColorConstantesFunciones.actualizarSelectedLista(grupocolor,grupocolors);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<GrupoColor> grupocolorsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				grupocolorsLocal=this.grupocolorLogic.getGrupoColors();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				grupocolorsLocal=this.grupocolors;
			}
			//ARCHITECTURE
		
			for(GrupoColor grupocolorLocal:grupocolorsLocal) {
				if(this.permiteMantenimiento(grupocolorLocal) && grupocolorLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+GrupoColorConstantesFunciones.getGrupoColorLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(GrupoColorConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoColor.jLabelid_empresaGrupoColor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GrupoColorConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoColor.jLabelid_sucursalGrupoColor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GrupoColorConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoColor.jLabelcodigoGrupoColor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GrupoColorConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoColor.jLabelnombreGrupoColor,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormGrupoColor!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGrupoColor.jLabelid_empresaGrupoColor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGrupoColor.jLabelid_sucursalGrupoColor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGrupoColor.jLabelcodigoGrupoColor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGrupoColor.jLabelnombreGrupoColor,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ColorProducto")) {
			if(this.grupocolor==null) {
				this.grupocolor= new GrupoColor();
			}

			if(this.grupocolorSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoGrupoColor
				this.setVariablesFormularioToObjetoActualGrupoColor(this.grupocolor,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoColor(this.grupocolor);

				this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.getcolorproducto().setGrupoColor(this.grupocolor);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoGrupoColor--;	
		
		
		this.grupocolorAux=new GrupoColor();
		
		this.grupocolorAux.setId(this.iIdNuevoGrupoColor);
		this.grupocolorAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.grupocolorLogic.getGrupoColors().add(this.grupocolorAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.grupocolors.add(this.grupocolorAux);
		}
		//ARCHITECTURE
		
		this.grupocolor=this.grupocolorAux;
		
		if(GrupoColorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioGrupoColor(this.grupocolor);
			this.setVariablesObjetoActualToFormularioForeignKeyGrupoColor(this.grupocolor);
		}
				
		//this.setDefaultControlesGrupoColor();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyGrupoColor();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyGrupoColor();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyGrupoColor();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualGrupoColor(this.grupocolorBean,this.grupocolor,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysGrupoColor(this.grupocolor);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(GrupoColorConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.grupocolorSessionBean.getConGuardarRelaciones()) {
			classes=GrupoColorConstantesFunciones.getClassesRelationshipsOfGrupoColor(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.grupocolorReturnGeneral=grupocolorLogic.procesarEventosGrupoColorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.grupocolorLogic.getGrupoColors(),this.grupocolor,this.grupocolorParameterGeneral,this.isEsNuevoGrupoColor,classes);//this.grupocolorLogic.getGrupoColor()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanGrupoColor(this.grupocolorReturnGeneral,this.grupocolorBean,false);
		
		if(this.grupocolorReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyGrupoColor(this.grupocolorReturnGeneral.getGrupoColor());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioGrupoColor(this.grupocolorReturnGeneral.getGrupoColor());
		}
		
		if(this.grupocolorReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioGrupoColor(this.grupocolorReturnGeneral.getGrupoColor(),classes);//this.grupocolorBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualGrupoColor(this.grupocolor,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyGrupoColor();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyGrupoColor();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			GrupoColorBeanSwingJInternalFrameAdditional.RecargarFormGrupoColor(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingGrupoColor(false);
						
			if(grupocolorSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductoSessionBean.getEsGuardarRelacionado() && ColorProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonColorProductoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(GrupoColorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGrupoColor();
			}
			
			this.actualizarVisualTableDatosGrupoColor();
			
			this.jTableDatosGrupoColor.setRowSelectionInterval(this.getIndiceNuevoGrupoColor(), this.getIndiceNuevoGrupoColor());
			
			this.seleccionarFilaTablaGrupoColorActual();
						
			this.actualizarEstadoCeldasBotonesGrupoColor("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesGrupoColor(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormGrupoColor.jTextFieldcodigoGrupoColor.setEnabled(isHabilitar && this.grupocolorConstantesFunciones.activarcodigoGrupoColor);
		this.jInternalFrameDetalleFormGrupoColor.jTextAreanombreGrupoColor.setEnabled(isHabilitar && this.grupocolorConstantesFunciones.activarnombreGrupoColor);	
		//
		this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_empresaGrupoColor.setEnabled(isHabilitar && this.grupocolorConstantesFunciones.activarid_empresaGrupoColor);//
		this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_sucursalGrupoColor.setEnabled(isHabilitar && this.grupocolorConstantesFunciones.activarid_sucursalGrupoColor);
	};
	
	public void setDefaultControlesGrupoColor() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoGrupoColor(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.grupocolorSessionBean.setConGuardarRelaciones(true);			
			this.grupocolorSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormGrupoColor.jTabbedPaneRelacionesGrupoColor.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.grupocolorSessionBean.setConGuardarRelaciones(false);			
			this.grupocolorSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormGrupoColor.jTabbedPaneRelacionesGrupoColor.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoGrupoColor() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoColor grupocolorAux:this.grupocolorLogic.getGrupoColors()) {
				if(grupocolorAux.getId().equals(this.iIdNuevoGrupoColor)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoColor grupocolorAux:this.grupocolors) {
				if(grupocolorAux.getId().equals(this.iIdNuevoGrupoColor)) {
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
	
	public int getIndiceActualGrupoColor(GrupoColor grupocolor,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoColor grupocolorAux:this.grupocolorLogic.getGrupoColors()) {
				if(grupocolorAux.getId().equals(grupocolor.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoColor grupocolorAux:this.grupocolors) {
				if(grupocolorAux.getId().equals(grupocolor.getId())) {
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
	
	public void setCamposBaseDesdeOriginalGrupoColor(GrupoColor grupocolorOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoColor grupocolorAux:this.grupocolorLogic.getGrupoColors()) {
				if(grupocolorAux.getGrupoColorOriginal().getId().equals(grupocolorOriginal.getId())) {
					existe=true;
					grupocolorOriginal.setId(grupocolorAux.getId());
					grupocolorOriginal.setVersionRow(grupocolorAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoColor grupocolorAux:this.grupocolors) {
				if(grupocolorAux.getGrupoColorOriginal().getId().equals(grupocolorOriginal.getId())) {
					existe=true;
					grupocolorOriginal.setId(grupocolorAux.getId());
					grupocolorOriginal.setVersionRow(grupocolorAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosGrupoColor(Boolean esParaCancelar) throws Exception {
		grupocolorsAux=new ArrayList<GrupoColor>();
		grupocolorAux=new GrupoColor();
		
		if(!this.grupocolorSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(GrupoColor grupocolorAux:this.grupocolorLogic.getGrupoColors()) {
					if(grupocolorAux.getId()<0) {
						grupocolorsAux.add(grupocolorAux);
					}		
				}
				this.iIdNuevoGrupoColor=0L;
				this.grupocolorLogic.getGrupoColors().removeAll(grupocolorsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GrupoColor grupocolorAux:this.grupocolors) {
					if(grupocolorAux.getId()<0) {
						grupocolorsAux.add(grupocolorAux);
					}		
				}
				this.iIdNuevoGrupoColor=0L;
				this.grupocolors.removeAll(grupocolorsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoGrupoColor 
					&& this.grupocolorLogic.getGrupoColors().size()>0
					) {
					grupocolorAux=this.grupocolorLogic.getGrupoColors().get(this.grupocolorLogic.getGrupoColors().size() - 1);
				
					if(grupocolorAux.getId()<0) {
						this.grupocolorLogic.getGrupoColors().remove(grupocolorAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoGrupoColor && this.grupocolors.size()>0) {
					grupocolorAux=this.grupocolors.get(this.grupocolors.size() - 1);
				
					if(grupocolorAux.getId()<0) {
						this.grupocolors.remove(grupocolorAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoGrupoColor(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(grupocolor.getId()<0) {
				this.grupocolorLogic.getGrupoColors().remove(this.grupocolor);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(grupocolor.getId()<0) {
				this.grupocolors.remove(this.grupocolor);
			}
		}			
	}
	
	public void setEstadosInicialesGrupoColor(List<GrupoColor> grupocolorsAux) throws Exception {
		GrupoColorConstantesFunciones.setEstadosInicialesGrupoColor(grupocolorsAux);
	}
	
	public void setEstadosInicialesGrupoColor(GrupoColor grupocolorAux) throws Exception {
		GrupoColorConstantesFunciones.setEstadosInicialesGrupoColor(grupocolorAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarGrupoColorActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesGrupoColor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarGrupoColorActual()) {
				if(!this.isEsNuevoGrupoColor) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesGrupoColor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoGrupoColor=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarGrupoColorActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Grupo Color ?", "MANTENIMIENTO DE Grupo Color", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesGrupoColor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(GrupoColor grupocolor) throws Exception {
		GrupoColorConstantesFunciones.seleccionarAsignar(this.grupocolor,grupocolor);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarGrupoColor=this.isPermisoActualizarOriginalGrupoColor;
			
			
			this.seleccionarAsignar(grupocolor);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			GrupoColorConstantesFunciones.quitarEspaciosGrupoColor(this.grupocolor,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesGrupoColor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.grupocolorSessionBean.setsFuncionBusquedaRapida(this.grupocolorSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoGrupoColor) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosGrupoColor(esParaCancelar);				
				this.cancelarNuevoGrupoColor(esParaCancelar);								
			}
			
			this.grupocolor=new GrupoColor();
			
			this.inicializarGrupoColor();
			
			this.actualizarEstadoCeldasBotonesGrupoColor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarGrupoColor() throws Exception {
		try {
			GrupoColorConstantesFunciones.inicializarGrupoColor(this.grupocolor);
			
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
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.grupocolorLogic.getGrupoColors().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteGrupoColors(String sAccionBusqueda,List<GrupoColor> grupocolorsParaReportes) throws Exception {
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
					sPathReporteFinal="GrupoColor"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="GrupoColorMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("GrupoColorMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="GrupoColor"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Grupo Colores");		
		parameters.put("busquedapor", GrupoColorConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ColorProducto.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					GrupoColorLogic grupocolorLogicAuxiliar=new GrupoColorLogic();
					grupocolorLogicAuxiliar.setDatosCliente(grupocolorLogic.getDatosCliente());				
					grupocolorLogicAuxiliar.setGrupoColors(grupocolorsParaReportes);
					
					grupocolorLogicAuxiliar.cargarRelacionesLoteForeignKeyGrupoColorWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					grupocolorsParaReportes=grupocolorLogicAuxiliar.getGrupoColors();
					
					//grupocolorLogic.getNewConnexionToDeep();
					
					//for (GrupoColor grupocolor:grupocolorsParaReportes) {
					//	grupocolorLogic.deepLoad(grupocolor, false, DeepLoadType.INCLUDE, classes);
					//}						
					//grupocolorLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//grupocolorLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileColorProducto = AuxiliarReportes.class.getResourceAsStream("ColorProductoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_colorproducto", reportFileColorProducto);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceGrupoColor=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			GrupoColorConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			GrupoColorConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceGrupoColor=new JRBeanArrayDataSource(GrupoColorJInternalFrame.TraerGrupoColorBeans(grupocolorsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceGrupoColor);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+GrupoColorConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+GrupoColorConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(GrupoColorBean.TraerGrupoColorBeans(grupocolorsParaReportes).toArray()));
							
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
				this.generarExcelReporteGrupoColors(sAccionBusqueda,sTipoArchivoReporte,grupocolorsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalGrupoColors(sAccionBusqueda,sTipoArchivoReporte,grupocolorsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoGrupoColorActionPerformed(null);
					//this.generarExcelReporteGrupoColors(sAccionBusqueda,sTipoArchivoReporte,grupocolorsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalGrupoColors(sAccionBusqueda,sTipoArchivoReporte,grupocolorsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesGrupoColors(sAccionBusqueda,sTipoArchivoReporte,grupocolorsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesGrupoColors(sAccionBusqueda,sTipoArchivoReporte,grupocolorsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteGrupoColors(String sAccionBusqueda,String sTipoArchivoReporte,List<GrupoColor> grupocolorsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupocolor";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GrupoColors");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderGrupoColor("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(GrupoColor grupocolor : grupocolorsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			GrupoColorConstantesFunciones.generarExcelReporteDataGrupoColor("NORMAL",row,workbook,grupocolor,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupocolorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Color",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderGrupoColor(String sTipo,Row row,Workbook workbook) {
		
		GrupoColorConstantesFunciones.generarExcelReporteHeaderGrupoColor(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalGrupoColors(String sAccionBusqueda,String sTipoArchivoReporte,List<GrupoColor> grupocolorsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupocolor_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GrupoColors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(GrupoColor grupocolor : grupocolorsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(GrupoColorConstantesFunciones.getGrupoColorDescripcion(grupocolor));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GrupoColorConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GrupoColorConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(grupocolor.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GrupoColorConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GrupoColorConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(grupocolor.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GrupoColorConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GrupoColorConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(grupocolor.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GrupoColorConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GrupoColorConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(grupocolor.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupocolorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Color",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesGrupoColors(String sAccionBusqueda,String sTipoArchivoReporte,List<GrupoColor> grupocolorsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<GrupoColor> grupocolorsRespaldo=null;
		
		classes=GrupoColorConstantesFunciones.getClassesRelationshipsOfGrupoColor(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.grupocolorLogic.setDatosCliente(this.datosCliente);
		this.grupocolorLogic.setDatosDeep(this.datosDeep);
		this.grupocolorLogic.setIsConDeep(true);
		
		grupocolorsRespaldo=this.grupocolorLogic.getGrupoColors();
		
		this.grupocolorLogic.setGrupoColors(grupocolorsParaReportes);	
		this.grupocolorLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		grupocolorsParaReportes=this.grupocolorLogic.getGrupoColors();
		this.grupocolorLogic.setGrupoColors(grupocolorsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupocolor_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GrupoColors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderGrupoColor("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(GrupoColor grupocolor : grupocolorsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderGrupoColor("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			GrupoColorConstantesFunciones.generarExcelReporteDataGrupoColor("NORMAL",row,workbook,grupocolor,cellStyleDataAux);
		
			
			


				//ColorProducto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ColorProductoConstantesFunciones.SCLASSWEBTITULO))) {

				if(grupocolor.getColorProductos()!=null && grupocolor.getColorProductos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ColorProductoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ColorProductoConstantesFunciones.generarExcelReporteHeaderColorProducto("RELACIONADO",row,workbook);
				}

				if(grupocolor.getColorProductos()!=null) {
					i2=0;
					for(ColorProducto colorproducto : grupocolor.getColorProductos()) {
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
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(GrupoColorConstantesFunciones.getGrupoColorDescripcion(grupocolor));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupocolorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Color",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoGrupoColor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoColor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoGrupoColor.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoColor.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessGrupoColor() throws Exception {		
		this.startProcessGrupoColor(true);
	}
	
	public void startProcessGrupoColor(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasGrupoColor ,this.jPanelParametrosReportesGrupoColor, this.jScrollPanelDatosGrupoColor,this.jPanelPaginacionGrupoColor, this.jScrollPanelDatosEdicionGrupoColor, this.jPanelAccionesGrupoColor,this.jPanelAccionesFormularioGrupoColor,this.jmenuBarGrupoColor,this.jmenuBarDetalleGrupoColor,this.jTtoolBarGrupoColor,this.jTtoolBarDetalleGrupoColor);		
		
		final JTabbedPane jTabbedPaneBusquedasGrupoColor=this.jTabbedPaneBusquedasGrupoColor; 
		
		final JPanel jPanelParametrosReportesGrupoColor=this.jPanelParametrosReportesGrupoColor;
		//final JScrollPane jScrollPanelDatosGrupoColor=this.jScrollPanelDatosGrupoColor;
		final JTable jTableDatosGrupoColor=this.jTableDatosGrupoColor;		
		final JPanel jPanelPaginacionGrupoColor=this.jPanelPaginacionGrupoColor;
		//final JScrollPane jScrollPanelDatosEdicionGrupoColor=this.jScrollPanelDatosEdicionGrupoColor;
		final JPanel jPanelAccionesGrupoColor=this.jPanelAccionesGrupoColor;
		
		JPanel jPanelCamposAuxiliarGrupoColor=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarGrupoColor=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormGrupoColor!=null) {
			jPanelCamposAuxiliarGrupoColor=this.jInternalFrameDetalleFormGrupoColor.jPanelCamposGrupoColor;
			jPanelAccionesFormularioAuxiliarGrupoColor=this.jInternalFrameDetalleFormGrupoColor.jPanelAccionesFormularioGrupoColor;
		}
		
		final JPanel jPanelCamposGrupoColor=jPanelCamposAuxiliarGrupoColor;
		final JPanel jPanelAccionesFormularioGrupoColor=jPanelAccionesFormularioAuxiliarGrupoColor;
		
		
		final JMenuBar jmenuBarGrupoColor=this.jmenuBarGrupoColor;
		final JToolBar jTtoolBarGrupoColor=this.jTtoolBarGrupoColor;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarGrupoColor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarGrupoColor=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormGrupoColor!=null) {
			jmenuBarDetalleAuxiliarGrupoColor=this.jInternalFrameDetalleFormGrupoColor.jmenuBarDetalleGrupoColor;
			jTtoolBarDetalleAuxiliarGrupoColor=this.jInternalFrameDetalleFormGrupoColor.jTtoolBarDetalleGrupoColor;
		}
		
		final JMenuBar jmenuBarDetalleGrupoColor=jmenuBarDetalleAuxiliarGrupoColor;
		final JToolBar jTtoolBarDetalleGrupoColor=jTtoolBarDetalleAuxiliarGrupoColor;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasGrupoColor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesGrupoColor;
			processRunnable.jTableDatos=jTableDatosGrupoColor;
			processRunnable.jPanelCampos=jPanelCamposGrupoColor;
			processRunnable.jPanelPaginacion=jPanelPaginacionGrupoColor;
			processRunnable.jPanelAcciones=jPanelAccionesGrupoColor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioGrupoColor;
			
			
			processRunnable.jmenuBar=jmenuBarGrupoColor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleGrupoColor;
			processRunnable.jTtoolBar=jTtoolBarGrupoColor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleGrupoColor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasGrupoColor ,jPanelParametrosReportesGrupoColor,jTableDatosGrupoColor, /*jScrollPanelDatosGrupoColor,*/jPanelCamposGrupoColor,jPanelPaginacionGrupoColor, /*jScrollPanelDatosEdicionGrupoColor,*/ jPanelAccionesGrupoColor,jPanelAccionesFormularioGrupoColor,jmenuBarGrupoColor,jmenuBarDetalleGrupoColor,jTtoolBarGrupoColor,jTtoolBarDetalleGrupoColor);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasGrupoColor ,jPanelParametrosReportesGrupoColor, jScrollPanelDatosGrupoColor,jPanelPaginacionGrupoColor, jScrollPanelDatosEdicionGrupoColor, jPanelAccionesGrupoColor,jPanelAccionesFormularioGrupoColor,jmenuBarGrupoColor,jmenuBarDetalleGrupoColor,jTtoolBarGrupoColor,jTtoolBarDetalleGrupoColor);
						
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
	
	public void finishProcessGrupoColor() {// throws Exception 
		this.finishProcessGrupoColor(true);
	}
	
	public void finishProcessGrupoColor(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasGrupoColor ,this.jPanelParametrosReportesGrupoColor, this.jScrollPanelDatosGrupoColor,this.jPanelPaginacionGrupoColor, this.jScrollPanelDatosEdicionGrupoColor, this.jPanelAccionesGrupoColor,this.jPanelAccionesFormularioGrupoColor,this.jmenuBarGrupoColor,this.jmenuBarDetalleGrupoColor,this.jTtoolBarGrupoColor,this.jTtoolBarDetalleGrupoColor);		
		
		final JTabbedPane jTabbedPaneBusquedasGrupoColor=this.jTabbedPaneBusquedasGrupoColor; 
		
		final JPanel jPanelParametrosReportesGrupoColor=this.jPanelParametrosReportesGrupoColor;
		//final JScrollPane jScrollPanelDatosGrupoColor=this.jScrollPanelDatosGrupoColor;
		final JTable jTableDatosGrupoColor=this.jTableDatosGrupoColor;		
		final JPanel jPanelPaginacionGrupoColor=this.jPanelPaginacionGrupoColor;
		//final JScrollPane jScrollPanelDatosEdicionGrupoColor=this.jScrollPanelDatosEdicionGrupoColor;
		final JPanel jPanelAccionesGrupoColor=this.jPanelAccionesGrupoColor;
		
		JPanel jPanelCamposAuxiliarGrupoColor=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarGrupoColor=new JPanel();
		
		if(this.jInternalFrameDetalleFormGrupoColor!=null) {
			jPanelCamposAuxiliarGrupoColor=this.jInternalFrameDetalleFormGrupoColor.jPanelCamposGrupoColor;
			jPanelAccionesFormularioAuxiliarGrupoColor=this.jInternalFrameDetalleFormGrupoColor.jPanelAccionesFormularioGrupoColor;
		}
		
		final JPanel jPanelCamposGrupoColor=jPanelCamposAuxiliarGrupoColor;
		final JPanel jPanelAccionesFormularioGrupoColor=jPanelAccionesFormularioAuxiliarGrupoColor;
		
		
		final JMenuBar jmenuBarGrupoColor=this.jmenuBarGrupoColor;		
		final JToolBar jTtoolBarGrupoColor=this.jTtoolBarGrupoColor;
				
		JMenuBar jmenuBarDetalleAuxiliarGrupoColor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarGrupoColor=new JToolBar();
		
		if(this.jInternalFrameDetalleFormGrupoColor!=null) {
			jmenuBarDetalleAuxiliarGrupoColor=this.jInternalFrameDetalleFormGrupoColor.jmenuBarDetalleGrupoColor;
			jTtoolBarDetalleAuxiliarGrupoColor=this.jInternalFrameDetalleFormGrupoColor.jTtoolBarDetalleGrupoColor;		
		}
		
		final JMenuBar jmenuBarDetalleGrupoColor=jmenuBarDetalleAuxiliarGrupoColor;
		final JToolBar jTtoolBarDetalleGrupoColor=jTtoolBarDetalleAuxiliarGrupoColor;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasGrupoColor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesGrupoColor;
			processRunnable.jTableDatos=jTableDatosGrupoColor;
			processRunnable.jPanelCampos=jPanelCamposGrupoColor;
			processRunnable.jPanelPaginacion=jPanelPaginacionGrupoColor;
			processRunnable.jPanelAcciones=jPanelAccionesGrupoColor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioGrupoColor;
			
			
			processRunnable.jmenuBar=jmenuBarGrupoColor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleGrupoColor;
			processRunnable.jTtoolBar=jTtoolBarGrupoColor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleGrupoColor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasGrupoColor ,jPanelParametrosReportesGrupoColor, jTableDatosGrupoColor,/*jScrollPanelDatosGrupoColor,*/jPanelCamposGrupoColor,jPanelPaginacionGrupoColor, /*jScrollPanelDatosEdicionGrupoColor,*/ jPanelAccionesGrupoColor,jPanelAccionesFormularioGrupoColor,jmenuBarGrupoColor,jmenuBarDetalleGrupoColor,jTtoolBarGrupoColor,jTtoolBarDetalleGrupoColor));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesGrupoColor(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarGrupoColor(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuGrupoColor(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarGrupoColor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarGrupoColor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleGrupoColor,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuGrupoColor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarGrupoColor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleGrupoColor,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.grupocolorConstantesFunciones.getsFinalQueryGrupoColor();
		String  finalQueryPaginacionTodos=this.grupocolorConstantesFunciones.getsFinalQueryGrupoColor();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=GrupoColorConstantesFunciones.getArrayColumnasGlobalesNoGrupoColor(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=GrupoColorConstantesFunciones.getArrayColumnasGlobalesGrupoColor(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,GrupoColorConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.grupocolorsEliminados= new ArrayList<GrupoColor>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessGrupoColor();
		
				///*GrupoColorSessionBean*/this.grupocolorSessionBean=new GrupoColorSessionBean();
			
			if(this.grupocolorSessionBean==null) {
				this.grupocolorSessionBean=new GrupoColorSessionBean();
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
					this.iNumeroPaginacion=GrupoColorConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=GrupoColorConstantesFunciones.getClassesForeignKeysOfGrupoColor(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/grupocolor."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			grupocolorsAux= new ArrayList<GrupoColor>();
			
				
			grupocolorLogic.setDatosCliente(this.datosCliente);
			grupocolorLogic.setDatosDeep(this.datosDeep);
			grupocolorLogic.setIsConDeep(true);
			
			
			grupocolorLogic.getGrupoColorDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					grupocolorLogic.getTodosGrupoColors(finalQueryGlobal,pagination);
					
					//grupocolorLogic.getTodosGrupoColorsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(grupocolorLogic.getGrupoColors()==null|| grupocolorLogic.getGrupoColors().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							grupocolorsAux= new ArrayList<GrupoColor>();
							grupocolorsAux.addAll(grupocolorLogic.getGrupoColors());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupocolorsAux= new ArrayList<GrupoColor>();
							grupocolorsAux.addAll(grupocolors);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							grupocolorLogic.getTodosGrupoColors(finalQueryGlobal+"",this.pagination);												
							
							//grupocolorLogic.getTodosGrupoColorsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteGrupoColors("Todos",grupocolorLogic.getGrupoColors() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							grupocolorLogic.setGrupoColors(new ArrayList<GrupoColor>());					
							grupocolorLogic.getGrupoColors().addAll(grupocolorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupocolors=new ArrayList<GrupoColor>();
							grupocolors.addAll(grupocolorsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idGrupoColor=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idGrupoColor=this.idActual;
				
				} else if(this.idGrupoColorActual!=null && this.idGrupoColorActual!=0L) {
					idGrupoColor=idGrupoColorActual;
				}
				
					
				this.sDetalleReporte=GrupoColorConstantesFunciones.getDetalleIndicePorId(idGrupoColor);
				
				this.grupocolors=new ArrayList<GrupoColor>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					grupocolorLogic.getEntity(idGrupoColor);
					
					//grupocolorLogic.getEntityWithConnection(idGrupoColor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupocolorLogic.setGrupoColors(new ArrayList<GrupoColor>());
					grupocolorLogic.getGrupoColors().add(grupocolorLogic.getGrupoColor());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.grupocolors=new ArrayList<GrupoColor>();
					this.grupocolors.add(grupocolor);
				}
				
				if(grupocolorLogic.getGrupoColor()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=GrupoColorConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					grupocolorLogic.getGrupoColorsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoColorConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoColorConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=grupocolorLogic.getGrupoColors()==null||grupocolorLogic.getGrupoColors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=grupocolors==null|| grupocolors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						grupocolorsAux=new ArrayList<GrupoColor>();
						grupocolorsAux.addAll(grupocolorLogic.getGrupoColors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupocolorsAux=new ArrayList<GrupoColor>();
							grupocolorsAux.addAll(grupocolors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							grupocolorLogic.getGrupoColorsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoColorConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoColorConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGrupoColors("BusquedaPorCodigo",grupocolorLogic.getGrupoColors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGrupoColors("BusquedaPorCodigo",grupocolors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						grupocolorLogic.setGrupoColors(new ArrayList<GrupoColor>());
						grupocolorLogic.getGrupoColors().addAll(grupocolorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupocolors=new ArrayList<GrupoColor>();
							grupocolors.addAll(grupocolorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=GrupoColorConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					grupocolorLogic.getGrupoColorsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoColorConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoColorConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=grupocolorLogic.getGrupoColors()==null||grupocolorLogic.getGrupoColors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=grupocolors==null|| grupocolors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						grupocolorsAux=new ArrayList<GrupoColor>();
						grupocolorsAux.addAll(grupocolorLogic.getGrupoColors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupocolorsAux=new ArrayList<GrupoColor>();
							grupocolorsAux.addAll(grupocolors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							grupocolorLogic.getGrupoColorsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoColorConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoColorConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGrupoColors("BusquedaPorNombre",grupocolorLogic.getGrupoColors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGrupoColors("BusquedaPorNombre",grupocolors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						grupocolorLogic.setGrupoColors(new ArrayList<GrupoColor>());
						grupocolorLogic.getGrupoColors().addAll(grupocolorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupocolors=new ArrayList<GrupoColor>();
							grupocolors.addAll(grupocolorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=GrupoColorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					grupocolorLogic.getGrupoColorsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoColorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoColorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=grupocolorLogic.getGrupoColors()==null||grupocolorLogic.getGrupoColors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=grupocolors==null|| grupocolors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						grupocolorsAux=new ArrayList<GrupoColor>();
						grupocolorsAux.addAll(grupocolorLogic.getGrupoColors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupocolorsAux=new ArrayList<GrupoColor>();
							grupocolorsAux.addAll(grupocolors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							grupocolorLogic.getGrupoColorsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoColorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoColorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGrupoColors("FK_IdEmpresa",grupocolorLogic.getGrupoColors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGrupoColors("FK_IdEmpresa",grupocolors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						grupocolorLogic.setGrupoColors(new ArrayList<GrupoColor>());
						grupocolorLogic.getGrupoColors().addAll(grupocolorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupocolors=new ArrayList<GrupoColor>();
							grupocolors.addAll(grupocolorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=GrupoColorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					grupocolorLogic.getGrupoColorsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoColorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoColorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=grupocolorLogic.getGrupoColors()==null||grupocolorLogic.getGrupoColors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=grupocolors==null|| grupocolors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						grupocolorsAux=new ArrayList<GrupoColor>();
						grupocolorsAux.addAll(grupocolorLogic.getGrupoColors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupocolorsAux=new ArrayList<GrupoColor>();
							grupocolorsAux.addAll(grupocolors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							grupocolorLogic.getGrupoColorsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoColorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoColorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGrupoColors("FK_IdSucursal",grupocolorLogic.getGrupoColors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGrupoColors("FK_IdSucursal",grupocolors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						grupocolorLogic.setGrupoColors(new ArrayList<GrupoColor>());
						grupocolorLogic.getGrupoColors().addAll(grupocolorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupocolors=new ArrayList<GrupoColor>();
							grupocolors.addAll(grupocolorsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesGrupoColor();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessGrupoColor();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=grupocolorLogic.getGrupoColors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=grupocolors.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=grupocolorLogic.getGrupoColors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=grupocolors.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(GrupoColor grupocolor) {
		Boolean permite=true;
		
		if(this.grupocolor.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=GrupoColorConstantesFunciones.getOrderByListaGrupoColor();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=GrupoColorConstantesFunciones.getOrderByListaGrupoColor();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoColor grupocolor:grupocolorLogic.getGrupoColors()) {
				if(grupocolor.getsType().equals(Constantes2.S_TOTALES)) {
					grupocolorTotales=grupocolor;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoColor grupocolor:this.grupocolors) {
				if(grupocolor.getsType().equals(Constantes2.S_TOTALES)) {
					grupocolorTotales=grupocolor;
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
			this.grupocolorAux=new GrupoColor();
			this.grupocolorAux.setsType(Constantes2.S_TOTALES);
			this.grupocolorAux.setIsNew(false);
			this.grupocolorAux.setIsChanged(false);
			this.grupocolorAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				GrupoColorConstantesFunciones.TotalizarValoresFilaGrupoColor(this.grupocolorLogic.getGrupoColors(),this.grupocolorAux);
				
				this.grupocolorLogic.getGrupoColors().add(this.grupocolorAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				GrupoColorConstantesFunciones.TotalizarValoresFilaGrupoColor(this.grupocolors,this.grupocolorAux);
				
				this.grupocolors.add(this.grupocolorAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		grupocolorTotales=new GrupoColor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.grupocolorLogic.getGrupoColors().remove(grupocolorTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.grupocolors.remove(grupocolorTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		grupocolorTotales=new GrupoColor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoColor grupocolor:grupocolorLogic.getGrupoColors()) {
				if(grupocolor.getsType().equals(Constantes2.S_TOTALES)) {
					grupocolorTotales=grupocolor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				GrupoColorConstantesFunciones.TotalizarValoresFilaGrupoColor(this.grupocolorLogic.getGrupoColors(),grupocolorTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoColor grupocolor:this.grupocolors) {
				if(grupocolor.getsType().equals(Constantes2.S_TOTALES)) {
					grupocolorTotales=grupocolor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				GrupoColorConstantesFunciones.TotalizarValoresFilaGrupoColor(this.grupocolors,grupocolorTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getGrupoColorsBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGrupoColorsBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGrupoColorsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGrupoColorsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getGrupoColorsBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupocolorLogic.getGrupoColorsBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGrupoColorsBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupocolorLogic.getGrupoColorsBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGrupoColorsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupocolorLogic.getGrupoColorsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGrupoColorsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupocolorLogic.getGrupoColorsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosGrupoColor() {
		this.isPermisoTodoGrupoColor=false;
		this.isPermisoNuevoGrupoColor=false;
		this.isPermisoActualizarGrupoColor=false;
		this.isPermisoActualizarOriginalGrupoColor=false;
		this.isPermisoEliminarGrupoColor=false;
		this.isPermisoGuardarCambiosGrupoColor=false;
		this.isPermisoConsultaGrupoColor=false;
		this.isPermisoBusquedaGrupoColor=false;
		this.isPermisoReporteGrupoColor=false;		
		this.isPermisoOrdenGrupoColor=false;		
		this.isPermisoPaginacionMedioGrupoColor=false;		
		this.isPermisoPaginacionAltoGrupoColor=false;
		this.isPermisoPaginacionTodoGrupoColor=false;
		this.isPermisoCopiarGrupoColor=false;		
		this.isPermisoVerFormGrupoColor=false;		
		this.isPermisoDuplicarGrupoColor=false;		
		this.isPermisoOrdenGrupoColor=false;		
	}
	
	public void setPermisosUsuarioGrupoColor(Boolean isPermiso) {
		this.isPermisoTodoGrupoColor=isPermiso;
		this.isPermisoNuevoGrupoColor=isPermiso;
		this.isPermisoActualizarGrupoColor=isPermiso;
		this.isPermisoActualizarOriginalGrupoColor=isPermiso;
		this.isPermisoEliminarGrupoColor=isPermiso;
		this.isPermisoGuardarCambiosGrupoColor=isPermiso;
		this.isPermisoConsultaGrupoColor=isPermiso;
		this.isPermisoBusquedaGrupoColor=isPermiso;
		this.isPermisoReporteGrupoColor=isPermiso;
		this.isPermisoOrdenGrupoColor=isPermiso;		
		this.isPermisoPaginacionMedioGrupoColor=isPermiso;		
		this.isPermisoPaginacionAltoGrupoColor=isPermiso;		
		this.isPermisoPaginacionTodoGrupoColor=isPermiso;		
		this.isPermisoCopiarGrupoColor=isPermiso;		
		this.isPermisoVerFormGrupoColor=isPermiso;		
		this.isPermisoDuplicarGrupoColor=isPermiso;
		this.isPermisoOrdenGrupoColor=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioGrupoColor(Boolean isPermiso) {
		//this.isPermisoTodoGrupoColor=isPermiso;
		this.isPermisoNuevoGrupoColor=isPermiso;
		this.isPermisoActualizarGrupoColor=isPermiso;
		this.isPermisoActualizarOriginalGrupoColor=isPermiso;
		this.isPermisoEliminarGrupoColor=isPermiso;
		this.isPermisoGuardarCambiosGrupoColor=isPermiso;
		//this.isPermisoConsultaGrupoColor=isPermiso;
		//this.isPermisoBusquedaGrupoColor=isPermiso;
		//this.isPermisoReporteGrupoColor=isPermiso;
		//this.isPermisoOrdenGrupoColor=isPermiso;		
		//this.isPermisoPaginacionMedioGrupoColor=isPermiso;		
		//this.isPermisoPaginacionAltoGrupoColor=isPermiso;		
		//this.isPermisoPaginacionTodoGrupoColor=isPermiso;		
		//this.isPermisoCopiarGrupoColor=isPermiso;		
		//this.isPermisoDuplicarGrupoColor=isPermiso;
		//this.isPermisoOrdenGrupoColor=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioGrupoColorClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ColorProductoConstantesFunciones.SNOMBREOPCION);
		
		if(GrupoColorJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosColorProducto=false;
		this.isTienePermisosColorProducto=this.verificarGetPermisosUsuarioOpcionGrupoColorClaseRelacionada(this.opcionsRelacionadas,ColorProductoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebGrupoColor(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioGrupoColorClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosColorProducto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioGrupoColorClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionGrupoColorClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioGrupoColorClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosColorProducto && this.jInternalFrameDetalleFormGrupoColor!=null && this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormGrupoColor.jTabbedPaneRelacionesGrupoColor.remove(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioGrupoColor() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(GrupoColorJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.grupocolorSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, GrupoColorConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoGrupoColor=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarGrupoColor=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalGrupoColor=this.isPermisoActualizarGrupoColor;
			this.isPermisoEliminarGrupoColor=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosGrupoColor=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaGrupoColor=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaGrupoColor=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoGrupoColor=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteGrupoColor=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenGrupoColor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioGrupoColor=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoGrupoColor=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoGrupoColor=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarGrupoColor=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormGrupoColor=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarGrupoColor=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenGrupoColor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.grupocolorSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosGrupoColor.setToolTipText(this.jTableDatosGrupoColor.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioGrupoColor(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioGrupoColor(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(GrupoColorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(GrupoColorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioGrupoColor() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosColorProducto && this.grupocolorConstantesFunciones.mostrarColorProductoGrupoColor && !GrupoColorConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Color Producto");
			reporte.setsDescripcion("Color Producto");
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
	public void inicializarCombosForeignKeyGrupoColorListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyGrupoColorListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(GrupoColorJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyGrupoColorListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyGrupoColorListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			GrupoColorParameterReturnGeneral grupocolorReturnGeneral=new GrupoColorParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.grupocolorConstantesFunciones.cargarid_empresaGrupoColor)
					 || (this.esRecargarFks && this.grupocolorConstantesFunciones.cargarid_empresaGrupoColor)) {

					if(!this.grupocolorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+grupocolorSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.grupocolorConstantesFunciones.cargarid_sucursalGrupoColor)
					 || (this.esRecargarFks && this.grupocolorConstantesFunciones.cargarid_sucursalGrupoColor)) {

					if(!this.grupocolorSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+grupocolorSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				grupocolorReturnGeneral=grupocolorLogic.cargarCombosLoteForeignKeyGrupoColor(finalQueryGlobalEmpresa,finalQueryGlobalSucursal);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=grupocolorReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=grupocolorReturnGeneral.getsucursalsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyGrupoColor()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.grupocolorSessionBean==null) {
				this.grupocolorSessionBean=new GrupoColorSessionBean();
			}

			if(!this.grupocolorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.grupocolorSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyGrupoColor()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyGrupoColor(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyGrupoColor()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyGrupoColor();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyGrupoColor(GrupoColor grupocolor)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyGrupoColor(GrupoColor grupocolor,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyGrupoColor()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyGrupoColor()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyGrupoColor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyGrupoColor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroGrupoColor()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyGrupoColor()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyGrupoColor(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyGrupoColor()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_empresaGrupoColor!=null && this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_empresaGrupoColor.getItemCount()>0) {
				this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_empresaGrupoColor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_sucursalGrupoColor!=null && this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_sucursalGrupoColor.getItemCount()>0) {
				this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_sucursalGrupoColor.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public GrupoColorBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public GrupoColorBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public GrupoColorBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.grupocolorSessionBean=new GrupoColorSessionBean(); 
		this.grupocolorConstantesFunciones=new GrupoColorConstantesFunciones(); 
		this.grupocolorBean=new GrupoColor();//(this.grupocolorConstantesFunciones); 		
		this.grupocolorReturnGeneral=new GrupoColorParameterReturnGeneral(); 
		
		this.grupocolorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.grupocolorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public GrupoColorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public GrupoColorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public GrupoColorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessGrupoColor(true);
			
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
			
			this.grupocolorConstantesFunciones=new GrupoColorConstantesFunciones(); 
			this.grupocolorBean=new GrupoColor();//this.grupocolorConstantesFunciones); 			
			this.grupocolorReturnGeneral=new GrupoColorParameterReturnGeneral(); 
		
			GrupoColorBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Grupo Color Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.grupocolor=new GrupoColor();
			this.grupocolors = new ArrayList<GrupoColor>();
			this.grupocolorsAux = new ArrayList<GrupoColor>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic=new GrupoColorLogic();
				this.grupocolorLogic.getNewConnexionToDeep("");
			}
			
			//this.grupocolorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.grupocolorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormGrupoColor);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoGrupoColor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoGrupoColor);	
					}
					
					if(this.jInternalFrameImportacionGrupoColor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionGrupoColor);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByGrupoColor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByGrupoColor);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormGrupoColor!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormGrupoColor);
				this.jInternalFrameDetalleFormGrupoColor.setVisible(false);
				this.jInternalFrameDetalleFormGrupoColor.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoGrupoColor!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoGrupoColor);
					this.jInternalFrameReporteDinamicoGrupoColor.setVisible(false);
					this.jInternalFrameReporteDinamicoGrupoColor.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionGrupoColor!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionGrupoColor);
					this.jInternalFrameImportacionGrupoColor.setVisible(false);
					this.jInternalFrameImportacionGrupoColor.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByGrupoColor!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByGrupoColor);
					this.jInternalFrameOrderByGrupoColor.setVisible(false);
					this.jInternalFrameOrderByGrupoColor.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idGrupoColorActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=GrupoColorConstantesFunciones.INUMEROPAGINACION;
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
			
			this.grupocolorReturnGeneral=new GrupoColorParameterReturnGeneral();
			
			this.grupocolorParameterGeneral=new GrupoColorParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.grupocolorLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.grupocolorSessionBean.getEsGuardarRelacionado()) {
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
			
			if(GrupoColorJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.grupocolorSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ColorProductoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,GrupoColorConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.grupocolorSessionBean.getEsGuardarRelacionado(),this.grupocolorSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,GrupoColorConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.grupocolorSessionBean.getEsGuardarRelacionado(),this.grupocolorSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoGrupoColor=false;
			this.isVisibilidadCeldaDuplicarGrupoColor=true;
			this.isVisibilidadCeldaCopiarGrupoColor=true;
			this.isVisibilidadCeldaVerFormGrupoColor=true;
			this.isVisibilidadCeldaOrdenGrupoColor=true;
			this.isVisibilidadCeldaNuevoRelacionesGrupoColor=false;
			this.isVisibilidadCeldaModificarGrupoColor=false;
			this.isVisibilidadCeldaActualizarGrupoColor=false;
			this.isVisibilidadCeldaEliminarGrupoColor=false;
			this.isVisibilidadCeldaCancelarGrupoColor=false;
			this.isVisibilidadCeldaGuardarGrupoColor=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoColor=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesGrupoColor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosGrupoColor();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioGrupoColor(false);
			
			this.setPermisosUsuarioGrupoColor();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.grupocolorSessionBean.getEsGuardarRelacionado() 
				|| (this.grupocolorSessionBean.getEsGuardarRelacionado() && this.grupocolorSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioGrupoColorClasesRelacionadas();
			}
			
			if(this.grupocolorSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioGrupoColorClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!GrupoColorJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosGrupoColor();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualGrupoColor();
			}
			
			if(!this.isPermisoBusquedaGrupoColor) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasGrupoColor.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.grupocolorSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioGrupoColor,this.isPermisoPaginacionMedioGrupoColor,this.isPermisoPaginacionTodoGrupoColor);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(GrupoColorConstantesFunciones.getTiposSeleccionarGrupoColor());
				
				this.tiposColumnasSelect=GrupoColorConstantesFunciones.getTiposSeleccionarGrupoColor(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectGrupoColor();				
				//this.tiposRelacionesSelect=GrupoColorConstantesFunciones.getTiposRelacionesGrupoColor(true);
				
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
			//if(!this.grupocolorSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioGrupoColor();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioGrupoColor(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioGrupoColor(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesGrupoColor() ;
			
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
			
			
			this.colorproductoLogic=new ColorProductoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				grupocolorImplementable= (GrupoColorImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+GrupoColorConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				grupocolorImplementableHome= (GrupoColorImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+GrupoColorConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.grupocolors= new ArrayList<GrupoColor>();
			this.grupocolorsEliminados= new ArrayList<GrupoColor>();
						
			this.isEsNuevoGrupoColor=false;
			this.esParaAccionDesdeFormularioGrupoColor=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyGrupoColor(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroGrupoColor();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.grupocolorSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			GrupoColorBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=GrupoColorConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesGrupoColor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingGrupoColor(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormGrupoColor!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioGrupoColor();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioGrupoColor();
			}
			
			GrupoColorBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasGrupoColor.getTabCount(); i++) {
					this.jTabbedPaneBusquedasGrupoColor.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasGrupoColor.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessGrupoColor(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga GrupoColor: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectGrupoColor() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ColorProductoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ColorProductoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesGrupoColor")) {
				iIndex=this.jInternalFrameDetalleFormGrupoColor.jTabbedPaneRelacionesGrupoColor.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormGrupoColor.jTabbedPaneRelacionesGrupoColor.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosGrupoColor.getSelectedRow();	
				
				

				if(sTitle.equals("Color Productoes")) {
					if(!ColorProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessGrupoColor();

						this.cargarParteTabPanelRelacionadaColorProducto(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessGrupoColor();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaColorProducto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormGrupoColor.cargarSessionConBeanSwingJInternalFrameColorProducto(false,true,iIndex);
		this.jButtonColorProductoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaColorProducto();

		//this.jTabbedPaneRelacionesGrupoColor.updateUI();
		//this.jTabbedPaneRelacionesGrupoColor.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesGrupoColor.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ColorProducto")) {
				int row=this.jTableDatosGrupoColor.getSelectedRow();
				jButtonColorProductoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.grupocolorSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Color Producto")) {

					if(this.isTienePermisosColorProducto && this.grupocolorConstantesFunciones.mostrarColorProductoGrupoColor && !GrupoColorConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Color Productoes"+"("+ColorProductoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Color Productoes");

						if(grupocolorConstantesFunciones.resaltarColorProductoGrupoColor!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(grupocolorConstantesFunciones.resaltarColorProductoGrupoColor);
						}

						jmenuItem.setEnabled(this.grupocolorConstantesFunciones.activarColorProductoGrupoColor);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ColorProducto"));

						

						this.jInternalFrameDetalleFormGrupoColor.jmenuDetalleGrupoColor.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyGrupoColor(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyGrupoColor(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyGrupoColor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyGrupoColorListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyGrupoColor();
		
		this.cargarCombosFrameForeignKeyGrupoColor();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyGrupoColor();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyGrupoColor();
		}
	}
	
	
	
	public void jButtonNuevoGrupoColorActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.grupocolorSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormGrupoColor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
			
			
			if(jTableDatosGrupoColor.getRowCount()>=1) {
				jTableDatosGrupoColor.removeRowSelectionInterval(0, jTableDatosGrupoColor.getRowCount()-1);						
			}
			
			this.isEsNuevoGrupoColor=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoGrupoColor(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesGrupoColor(true);			
			//this.grupocolor=new GrupoColor();
			//this.grupocolor.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGrupoColor(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGrupoColor() ;
			
			if(GrupoColorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGrupoColor(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.grupocolor);	
			this.actualizarInformacion("INFO_PADRE",false,this.grupocolor);				
			
			GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
			
			if(this.grupocolorSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar GrupoColor: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarGrupoColorActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<GrupoColor> grupocolorsSeleccionados=new ArrayList<GrupoColor>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosGrupoColor.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosGrupoColor.getSelectedRows().length;			
			}
			
			grupocolorsSeleccionados=this.getGrupoColorsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoGrupoColor--;			
				//GrupoColor grupocolorAux= new GrupoColor();			
				//grupocolorAux.setId(this.iIdNuevoGrupoColor);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//GrupoColor grupocolorOrigen=new GrupoColor();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(GrupoColor grupocolorOrigen : grupocolorsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosGrupoColor.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							grupocolorOrigen =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupocolorOrigen =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaGrupoColor();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.grupocolor.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosGrupoColor(grupocolorOrigen,this.grupocolor,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoColor(this.grupocolor);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.grupocolorLogic.getGrupoColors().add(this.grupocolorAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.grupocolors.add(this.grupocolorAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaGrupoColor(false);
				
				this.jTableDatosGrupoColor.setRowSelectionInterval(this.getIndiceNuevoGrupoColor(), this.getIndiceNuevoGrupoColor());
				
				int iLastRow =  this.jTableDatosGrupoColor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosGrupoColor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosGrupoColor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaGrupoColor(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarGrupoColorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<GrupoColor> grupocolorsSeleccionados=new ArrayList<GrupoColor>();									
		
			GrupoColor grupocolorOrigen=new GrupoColor();
			GrupoColor grupocolorDestino=new GrupoColor();
				
			grupocolorsSeleccionados=this.getGrupoColorsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosGrupoColor.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || grupocolorsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosGrupoColor.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupocolorOrigen =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						grupocolorOrigen =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupocolorDestino =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						grupocolorDestino =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				grupocolorOrigen =grupocolorsSeleccionados.get(0);
				grupocolorDestino =grupocolorsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosGrupoColor(grupocolorOrigen,grupocolorDestino,true,false);
				
				grupocolorDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(grupocolorDestino,grupocolorLogic.getGrupoColors());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(grupocolorDestino,grupocolors);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaGrupoColor(false);
				
				//this.jTableDatosGrupoColor.setRowSelectionInterval(this.getIndiceNuevoGrupoColor(), this.getIndiceNuevoGrupoColor());
				
				int iLastRow =  this.jTableDatosGrupoColor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosGrupoColor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosGrupoColor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaGrupoColor(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormGrupoColorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormGrupoColor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormGrupoColor.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarGrupoColorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesGrupoColor.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasGrupoColor.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesGrupoColor.setVisible(!isVisible);
			this.jPanelPaginacionGrupoColor.setVisible(!isVisible);
			this.jPanelAccionesGrupoColor.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarGrupoColorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameGrupoColor();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoGrupoColorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoGrupoColor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionGrupoColorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionGrupoColor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByGrupoColorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByGrupoColor();
			
			this.abrirFrameOrderByGrupoColor();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByGrupoColorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByGrupoColor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleGrupoColor(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormGrupoColor);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormGrupoColor.isMaximum()) {
					this.jInternalFrameDetalleFormGrupoColor.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormGrupoColor.setSize(this.jInternalFrameDetalleFormGrupoColor.iWidthFormulario,this.jInternalFrameDetalleFormGrupoColor.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormGrupoColor.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormGrupoColor.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormGrupoColor.isMaximum()) {
						this.jInternalFrameDetalleFormGrupoColor.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormGrupoColor.jContentPaneDetalleGrupoColor.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormGrupoColor.jTabbedPaneRelacionesGrupoColor.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormGrupoColor.jContentPaneDetalleGrupoColor.getWidth(),GrupoColorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormGrupoColor.jTabbedPaneRelacionesGrupoColor.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormGrupoColor.jContentPaneDetalleGrupoColor.getWidth(),GrupoColorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormGrupoColor.jTabbedPaneRelacionesGrupoColor.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormGrupoColor.jContentPaneDetalleGrupoColor.getWidth(),GrupoColorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ColorProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaColorProducto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormGrupoColor.setVisible(true);
	        this.jInternalFrameDetalleFormGrupoColor.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByGrupoColor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByGrupoColor==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByGrupoColor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGrupoColor,false,this);
				} else {
					this.jInternalFrameOrderByGrupoColor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGrupoColor,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByGrupoColor);
				this.jInternalFrameOrderByGrupoColor.setVisible(false);
				this.jInternalFrameOrderByGrupoColor.setSelected(false);
				
				this.jInternalFrameOrderByGrupoColor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByGrupoColor"));
				
				this.inicializarActualizarBindingTablaOrderByGrupoColor();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionGrupoColor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionGrupoColor==null) {
				
				this.jInternalFrameImportacionGrupoColor=new ImportacionJInternalFrame(GrupoColorConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionGrupoColor);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionGrupoColor);
				this.jInternalFrameImportacionGrupoColor.setVisible(false);
				this.jInternalFrameImportacionGrupoColor.setSelected(false);


				this.jInternalFrameImportacionGrupoColor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionGrupoColor"));
				this.jInternalFrameImportacionGrupoColor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionGrupoColor"));
				this.jInternalFrameImportacionGrupoColor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionGrupoColor"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoGrupoColor() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoGrupoColor==null) {
				this.jInternalFrameReporteDinamicoGrupoColor=new ReporteDinamicoJInternalFrame(GrupoColorConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoGrupoColor);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoGrupoColor);
				this.jInternalFrameReporteDinamicoGrupoColor.setVisible(false);
				this.jInternalFrameReporteDinamicoGrupoColor.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoGrupoColor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGrupoColor"));
				this.jInternalFrameReporteDinamicoGrupoColor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGrupoColor"));
				this.jInternalFrameReporteDinamicoGrupoColor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGrupoColor"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGrupoColor();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaColorProducto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.jScrollPanelDatosColorProducto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormGrupoColor.jContentPaneDetalleGrupoColor.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.jScrollPanelDatosColorProducto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.jScrollPanelDatosColorProducto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.jScrollPanelDatosColorProducto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleGrupoColor() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormGrupoColor);
			
	       	this.jInternalFrameDetalleFormGrupoColor.setVisible(false);
	        this.jInternalFrameDetalleFormGrupoColor.setSelected(false);
			
			//this.jInternalFrameDetalleFormGrupoColor.dispose();
			//this.jInternalFrameDetalleFormGrupoColor=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoGrupoColor() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoGrupoColor.setVisible(true);
	        this.jInternalFrameReporteDinamicoGrupoColor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionGrupoColor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionGrupoColor.setVisible(true);
	        this.jInternalFrameImportacionGrupoColor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByGrupoColor() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByGrupoColor.setVisible(true);
	        this.jInternalFrameOrderByGrupoColor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByGrupoColor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByGrupoColor.setVisible(false);
	        this.jInternalFrameOrderByGrupoColor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoGrupoColor() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoGrupoColor.setVisible(false);
	        this.jInternalFrameReporteDinamicoGrupoColor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionGrupoColor() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionGrupoColor.setVisible(false);
	        this.jInternalFrameImportacionGrupoColor.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarGrupoColorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarGrupoColor(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarGrupoColor(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosGrupoColor.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesGrupoColor(true);
			//this.isEsNuevoGrupoColor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolor =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.grupocolor =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesGrupoColor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGrupoColor(false) ;
			
			if(grupocolorSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductoSessionBean.getEsGuardarRelacionado() && ColorProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonColorProductoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(GrupoColorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGrupoColor(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGrupoColor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaGrupoColorActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosGrupoColor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolor =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupocolor =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarGrupoColor(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormGrupoColor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosGrupoColor.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesGrupoColor(true);
			//this.isEsNuevoGrupoColor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolor =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.grupocolor =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.grupocolor.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesGrupoColor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesGrupoColor(false) ;
			
			if(GrupoColorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGrupoColor(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGrupoColor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	
	public void jButtonActualizarGrupoColorActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesGrupoColor(false);
			
			//if(!this.isEsNuevoGrupoColor) {								
				int intSelectedRow = this.jTableDatosGrupoColor.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolor =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.grupocolor =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(GrupoColorJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualGrupoColor(this.grupocolor,true);
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoColor(this.grupocolor);
				
			}
			
			if(this.permiteMantenimiento(this.grupocolor)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.grupocolorSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoGrupoColor=true;
					this.inicializarActualizarBindingTablaGrupoColor(false);
					this.isEsNuevoGrupoColor=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoGrupoColor=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoGrupoColor=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesGrupoColor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGrupoColor(false);
				
				this.habilitarDeshabilitarControlesGrupoColor(false);
			
												
				
				if(GrupoColorJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleGrupoColor();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoGrupoColorActionPerformed(evt,grupocolorSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualGrupoColor(this.grupocolor,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosGrupoColor.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,grupocolorSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.grupocolor.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(GrupoColor.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoColor.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarGrupoColorActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosGrupoColor.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolor =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				this.grupocolor.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.grupocolor =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				this.grupocolor.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.grupocolor)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.grupocolorSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((GrupoColorModel) this.jTableDatosGrupoColor.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoGrupoColor=true;
				this.inicializarActualizarBindingTablaGrupoColor(false);
				this.isEsNuevoGrupoColor=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesGrupoColor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGrupoColor(false);
				
				this.habilitarDeshabilitarControlesGrupoColor(false);
				
				
				
				if(GrupoColorJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleGrupoColor();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarGrupoColorActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosGrupoColor.getRowCount()>=1) {
				jTableDatosGrupoColor.removeRowSelectionInterval(0, jTableDatosGrupoColor.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesGrupoColor(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaGrupoColor(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGrupoColor(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGrupoColor(false) ;
			
			this.isEsNuevoGrupoColor=false;
			
			if(GrupoColorJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleGrupoColor();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosGrupoColorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingGrupoColor(false);
				
				//SI ES MANUAL
				if(GrupoColorJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualGrupoColor();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosGrupoColorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoGrupoColor--;			
			//GrupoColor grupocolorAux= new GrupoColor();			
			//grupocolorAux.setId(this.iIdNuevoGrupoColor);
			
			if(this.jInternalFrameDetalleFormGrupoColor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaGrupoColor();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysGrupoColor(this.grupocolor);
			
			this.grupocolor.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.grupocolorLogic.getGrupoColors().add(this.grupocolorAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.grupocolors.add(this.grupocolorAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaGrupoColor(false);
			
			this.jTableDatosGrupoColor.setRowSelectionInterval(this.getIndiceNuevoGrupoColor(), this.getIndiceNuevoGrupoColor());
			
			int iLastRow =  this.jTableDatosGrupoColor.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosGrupoColor.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosGrupoColor.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaGrupoColor(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionGrupoColorActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingGrupoColor(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGrupoColor(false);
			
			//SI ES MANUAL
			if(GrupoColorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGrupoColor();
			}
			
			//this.abrirFrameTreeGrupoColor();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionGrupoColorActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Grupo ColorES ?", "MANTENIMIENTO DE Grupo Color", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionGrupoColor.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralGrupoColor();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.grupocolorReturnGeneral=grupocolorLogic.procesarImportacionGrupoColorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.grupocolorParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarGrupoColorReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionGrupoColorActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionGrupoColor.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionGrupoColor.setFileImportacion(this.jInternalFrameImportacionGrupoColor.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionGrupoColor.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionGrupoColor.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionGrupoColor.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionGrupoColor.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoGrupoColorActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<GrupoColor> grupocolorsSeleccionados=new ArrayList<GrupoColor>();		

		grupocolorsSeleccionados=this.getGrupoColorsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGrupoColor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGrupoColor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("GrupoColorBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"GrupoColorBaseDesign.jrxml";
			
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
			
			this.generarReporteGrupoColors("Todos",grupocolorsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupocolorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Color",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoGrupoColor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoColor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case GrupoColorConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GrupoColorConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GrupoColorConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GrupoColorConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoGrupoColor.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoGrupoColor.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoGrupoColor.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case GrupoColorConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case GrupoColorConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case GrupoColorConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case GrupoColorConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoGrupoColor.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case GrupoColorConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case GrupoColorConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case GrupoColorConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case GrupoColorConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoGrupoColor.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoColor.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case GrupoColorConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case GrupoColorConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case GrupoColorConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case GrupoColorConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoGrupoColorActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<GrupoColor> grupocolorsSeleccionados=new ArrayList<GrupoColor>();		
		
		grupocolorsSeleccionados=this.getGrupoColorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupocolor";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("GrupoColors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoGrupoColor.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoColor.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case GrupoColorConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GrupoColorConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(GrupoColor grupocolor:grupocolorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(grupocolor.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GrupoColorConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GrupoColorConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(GrupoColor grupocolor:grupocolorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(grupocolor.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GrupoColorConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GrupoColorConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(GrupoColor grupocolor:grupocolorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(grupocolor.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GrupoColorConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GrupoColorConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(GrupoColor grupocolor:grupocolorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(grupocolor.getnombre());
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
			//	this.getFilaCabeceraExportarExcelGrupoColor(row);				
			//	iRow++;
			//}				
			
			//for(GrupoColor grupocolorAux:grupocolorsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelGrupoColor(grupocolorAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupocolorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Color",JOptionPane.INFORMATION_MESSAGE);
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
				this.grupocolorLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGrupoColor(false);
			
			//SI ES MANUAL
			if(GrupoColorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGrupoColor();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresGrupoColorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGrupoColor(false);
			
			//SI ES MANUAL
			if(GrupoColorJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualGrupoColor();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesGrupoColorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGrupoColor(false);
			
			//SI ES MANUAL
			if(GrupoColorJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualGrupoColor();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaGrupoColor() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosGrupoColor.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosGrupoColor.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosGrupoColor.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosGrupoColor.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosGrupoColor.setMinimumSize(dimensionMinimum);
		this.jTableDatosGrupoColor.setMaximumSize(dimensionMaximum);
		this.jTableDatosGrupoColor.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingGrupoColor(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingGrupoColor(esInicializar,true);
	}
	
	public void inicializarActualizarBindingGrupoColor(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaGrupoColor(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesGrupoColor(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.grupocolorSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasGrupoColor(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesGrupoColor(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesGrupoColor(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !GrupoColorJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!GrupoColorJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualGrupoColor() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaGrupoColor();
		
		this.inicializarActualizarBindingBotonesManualGrupoColor(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.grupocolorSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualGrupoColor();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesGrupoColor() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualGrupoColor(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualGrupoColor(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosGrupoColor.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosGrupoColor.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteGrupoColor.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormGrupoColor!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormGrupoColor.jCheckBoxPostAccionNuevoGrupoColor.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormGrupoColor.jCheckBoxPostAccionSinCerrarGrupoColor.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormGrupoColor.jCheckBoxPostAccionSinMensajeGrupoColor.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosGrupoColor.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosGrupoColor.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteGrupoColor.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormGrupoColor!=null) {
				this.jInternalFrameDetalleFormGrupoColor.jCheckBoxPostAccionNuevoGrupoColor.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormGrupoColor.jCheckBoxPostAccionSinCerrarGrupoColor.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormGrupoColor.jCheckBoxPostAccionSinMensajeGrupoColor.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionGrupoColor.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionGrupoColor.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormGrupoColor!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormGrupoColor.jComboBoxTiposAccionesFormularioGrupoColor.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesGrupoColor.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoGrupoColor!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGrupoColor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesGrupoColor.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesGrupoColor.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarGrupoColor.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesGrupoColor.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoGrupoColor!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGrupoColor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesGrupoColor.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralGrupoColor.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesGrupoColor(Boolean esInicializar) throws Exception {
		try	{	
			if(GrupoColorJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualGrupoColor(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesGrupoColor() throws Exception {
		try	{
			if(GrupoColorJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualGrupoColor();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleGrupoColor() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormGrupoColor.jComboBoxTiposAccionesFormularioGrupoColor.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormGrupoColor.jComboBoxTiposAccionesFormularioGrupoColor.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualGrupoColor() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesGrupoColor.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesGrupoColor.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesGrupoColor.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesGrupoColor.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesGrupoColor.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesGrupoColor.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionGrupoColor.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionGrupoColor.addItem(reporte);
			}
			
			
			if(!this.grupocolorSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionGrupoColor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionGrupoColor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesGrupoColor.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesGrupoColor.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesGrupoColor.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesGrupoColor.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormGrupoColor!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormGrupoColor.jComboBoxTiposAccionesFormularioGrupoColor.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormGrupoColor.jComboBoxTiposAccionesFormularioGrupoColor.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarGrupoColor.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarGrupoColor.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarGrupoColor.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGrupoColor();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGrupoColor() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoGrupoColor!=null) {
				this.jInternalFrameReporteDinamicoGrupoColor.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoGrupoColor.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoGrupoColor!=null) {
				this.jInternalFrameReporteDinamicoGrupoColor.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoGrupoColor.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoGrupoColor!=null) {
				
				if(this.jInternalFrameReporteDinamicoGrupoColor.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoGrupoColor.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGrupoColor.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoGrupoColor.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoGrupoColor.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGrupoColor.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualGrupoColor()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoGrupoColor.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreGrupoColor.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasGrupoColor(Boolean esInicializar) throws Exception {				
		if(GrupoColorJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualGrupoColor();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaGrupoColor() throws Exception {
		this.inicializarActualizarBindingTablaGrupoColor(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByGrupoColor() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByGrupoColor.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByGrupoColor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGrupoColor.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new GrupoColorPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByGrupoColor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGrupoColor.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new GrupoColorPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosGrupoColorOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoColorOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new GrupoColorPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByGrupoColor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGrupoColor.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new GrupoColorPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByGrupoColor.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaGrupoColor(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=grupocolorLogic.getGrupoColors().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=grupocolors.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(GrupoColorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosGrupoColor.setModel(new GrupoColorModel(this.grupocolorLogic.getGrupoColors(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosGrupoColor.setModel(new GrupoColorModel(this.grupocolors,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByGrupoColor!=null && this.jInternalFrameOrderByGrupoColor.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByGrupoColor();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosGrupoColor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoColor,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new GrupoColorPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+GrupoColorConstantesFunciones.SCLASSWEBTITULO,grupocolorConstantesFunciones.resaltarSeleccionarGrupoColor,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+GrupoColorConstantesFunciones.SCLASSWEBTITULO,grupocolorConstantesFunciones.resaltarSeleccionarGrupoColor,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosGrupoColor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoColor,GrupoColorConstantesFunciones.LABEL_ID));

		if(this.grupocolorConstantesFunciones.mostraridGrupoColor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoColorConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.grupocolorConstantesFunciones.resaltaridGrupoColor,this.grupocolorConstantesFunciones.activaridGrupoColor,this,true,"idGrupoColor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.grupocolorConstantesFunciones.resaltaridGrupoColor,this.grupocolorConstantesFunciones.activaridGrupoColor,this,true,"idGrupoColor","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGrupoColor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoColor,GrupoColorConstantesFunciones.LABEL_IDEMPRESA));

		if(this.grupocolorConstantesFunciones.mostrarid_empresaGrupoColor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoColorConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.grupocolorConstantesFunciones.resaltarid_empresaGrupoColor,this,this.grupocolorConstantesFunciones.activarid_empresaGrupoColor));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.grupocolorConstantesFunciones.resaltarid_empresaGrupoColor,this,this.grupocolorConstantesFunciones.activarid_empresaGrupoColor,false,"id_empresaGrupoColor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GrupoColorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGrupoColor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoColor,GrupoColorConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.grupocolorConstantesFunciones.mostrarid_sucursalGrupoColor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoColorConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.grupocolorConstantesFunciones.resaltarid_sucursalGrupoColor,this,this.grupocolorConstantesFunciones.activarid_sucursalGrupoColor));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.grupocolorConstantesFunciones.resaltarid_sucursalGrupoColor,this,this.grupocolorConstantesFunciones.activarid_sucursalGrupoColor,false,"id_sucursalGrupoColor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GrupoColorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGrupoColor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoColor,GrupoColorConstantesFunciones.LABEL_CODIGO));

		if(this.grupocolorConstantesFunciones.mostrarcodigoGrupoColor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoColorConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.grupocolorConstantesFunciones.resaltarcodigoGrupoColor,this.grupocolorConstantesFunciones.activarcodigoGrupoColor,this,true,"codigoGrupoColor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.grupocolorConstantesFunciones.resaltarcodigoGrupoColor,this.grupocolorConstantesFunciones.activarcodigoGrupoColor,this,true,"codigoGrupoColor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GrupoColorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGrupoColor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoColor,GrupoColorConstantesFunciones.LABEL_NOMBRE));

		if(this.grupocolorConstantesFunciones.mostrarnombreGrupoColor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoColorConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.grupocolorConstantesFunciones.resaltarnombreGrupoColor,this.grupocolorConstantesFunciones.activarnombreGrupoColor,this,true,"nombreGrupoColor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.grupocolorConstantesFunciones.resaltarnombreGrupoColor,this.grupocolorConstantesFunciones.activarnombreGrupoColor,this,true,"nombreGrupoColor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GrupoColorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.grupocolorSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosColorProducto && this.grupocolorConstantesFunciones.mostrarColorProductoGrupoColor && !GrupoColorConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Color Productoes");
				tableColumn.setHeaderValue("Color Productoes");
				tableColumn.setCellRenderer(new ColorProductoTableCell(grupocolorConstantesFunciones.resaltarColorProductoGrupoColor,this,this.grupocolorConstantesFunciones.activarColorProductoGrupoColor));
				tableColumn.setCellEditor(new ColorProductoTableCell(grupocolorConstantesFunciones.resaltarColorProductoGrupoColor,this,this.grupocolorConstantesFunciones.activarColorProductoGrupoColor));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosGrupoColor.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.grupocolorSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.grupocolorSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosGrupoColor.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.grupocolorSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.grupocolorSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosGrupoColor.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarGrupoColor && this.isPermisoGuardarCambiosGrupoColor) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.grupocolorSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.grupocolorSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosGrupoColor.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.grupocolorSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosGrupoColor.addColumn(tableColumn);
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
			
			this.jTableDatosGrupoColor.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarGrupoColor && this.isPermisoGuardarCambiosGrupoColor) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.grupocolorSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarGrupoColor && this.isPermisoGuardarCambiosGrupoColor) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosGrupoColor.moveColumn(this.jTableDatosGrupoColor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosGrupoColor.moveColumn(this.jTableDatosGrupoColor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.grupocolorSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosGrupoColor.moveColumn(this.jTableDatosGrupoColor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosGrupoColor.moveColumn(this.jTableDatosGrupoColor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosGrupoColor.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosGrupoColor.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosGrupoColor,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!GrupoColorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosGrupoColor.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosGrupoColor.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!GrupoColorJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!GrupoColorJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosGrupoColor.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosGrupoColor.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosGrupoColor.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=grupocolorLogic.getGrupoColors().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=grupocolors.size()-1;
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
		//this.jTableDatosGrupoColor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosGrupoColor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosGrupoColor();
			
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
				
				//this.isEsNuevoGrupoColor=false;
					
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
			
				if(this.grupocolorSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormGrupoColor==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosGrupoColor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosGrupoColor.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolor =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupocolor =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.grupocolor.getsType().equals("DUPLICADO")
				   || this.grupocolor.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoGrupoColor=true;
				
				} else {
					this.isEsNuevoGrupoColor=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.grupocolorSessionBean.getEsGuardarRelacionado()) {
					if(this.grupocolor.getId()>=0 && !this.grupocolor.getIsNew()) {						
						this.isEsNuevoGrupoColor=false;
						
					} else {
						this.isEsNuevoGrupoColor=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoGrupoColor(esRelaciones);						
				
				this.seleccionarGrupoColor(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.grupocolor.getId()<0) {
					this.isEsNuevoGrupoColor=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarGrupoColor(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarGrupoColor(evt,rowIndex);
				}	
				
				if(this.grupocolorSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion GrupoColor: " + this.dDif); 
					}
				}								
				
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarGrupoColor(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.grupocolor)) {
					if(this.grupocolor.getId()>0) {
						this.grupocolor.setIsDeleted(true);
						
						this.grupocolorsEliminados.add(this.grupocolor);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.grupocolorLogic.getGrupoColors().remove(this.grupocolor);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.grupocolors.remove(this.grupocolor);				
					}
					
					
					((GrupoColorModel) this.jTableDatosGrupoColor.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaGrupoColor(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarGrupoColor(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoGrupoColor) {
			
			if(this.jInternalFrameDetalleFormGrupoColor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosGrupoColor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosGrupoColor.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolor =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupocolor =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(GrupoColorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioGrupoColor(this.grupocolor);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.grupocolorConstantesFunciones.cargarid_empresaGrupoColor || this.grupocolorConstantesFunciones.event_dependid_empresaGrupoColor) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.grupocolor.getid_empresa());
									//this.inicializarActualizarBindingGrupoColor(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(grupocolor.getEmpresa()!=null) {
							this.empresasForeignKey.add(grupocolor.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.grupocolor.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.grupocolorConstantesFunciones.cargarid_sucursalGrupoColor || this.grupocolorConstantesFunciones.event_dependid_sucursalGrupoColor) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.grupocolor.getid_sucursal());
									//this.inicializarActualizarBindingGrupoColor(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(grupocolor.getSucursal()!=null) {
							this.sucursalsForeignKey.add(grupocolor.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.grupocolor.getid_sucursal(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesGrupoColor("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesGrupoColor(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGrupoColor() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoGrupoColor(GrupoColor grupocolor) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoGrupoColor(grupocolor,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoGrupoColor(GrupoColor grupocolor,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioGrupoColor(grupocolor);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyGrupoColor(grupocolor,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyGrupoColor(grupocolor);
	}
	
	public void setVariablesObjetoActualToFormularioGrupoColor(GrupoColor grupocolor) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormGrupoColor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormGrupoColor.jLabelidGrupoColor.setText(grupocolor.getId().toString());
			this.jInternalFrameDetalleFormGrupoColor.jTextFieldcodigoGrupoColor.setText(grupocolor.getcodigo());
			this.jInternalFrameDetalleFormGrupoColor.jTextAreanombreGrupoColor.setText(grupocolor.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,GrupoColor grupocolorLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,grupocolorLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,GrupoColor grupocolorLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				grupocolorLocal=this.grupocolor;
			} else {
				grupocolorLocal=this.grupocolorAnterior;
			}
		}
		
		if(this.permiteMantenimiento(grupocolorLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoGrupoColor(grupocolorLocal,true);
					
					if(grupocolorSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(grupocolorLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.grupocolorSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(grupocolorLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoGrupoColor(GrupoColor grupocolor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualGrupoColor(grupocolor,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysGrupoColor(grupocolor);
	}
	
	public void setVariablesFormularioToObjetoActualGrupoColor(GrupoColor grupocolor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualGrupoColor(grupocolor,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualGrupoColor(GrupoColor grupocolor,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormGrupoColor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormGrupoColor.jLabelidGrupoColor.getText()==null || this.jInternalFrameDetalleFormGrupoColor.jLabelidGrupoColor.getText()=="" || this.jInternalFrameDetalleFormGrupoColor.jLabelidGrupoColor.getText()=="Id") {
				this.jInternalFrameDetalleFormGrupoColor.jLabelidGrupoColor.setText("0");
			}

			if(conColumnasBase) {grupocolor.setId(Long.parseLong(this.jInternalFrameDetalleFormGrupoColor.jLabelidGrupoColor.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GrupoColorConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoColor.jLabelIdGrupoColor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			grupocolor.setcodigo(this.jInternalFrameDetalleFormGrupoColor.jTextFieldcodigoGrupoColor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GrupoColorConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoColor.jLabelcodigoGrupoColor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			grupocolor.setnombre(this.jInternalFrameDetalleFormGrupoColor.jTextAreanombreGrupoColor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GrupoColorConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoColor.jLabelnombreGrupoColor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualGrupoColor(GrupoColor grupocolorBean,GrupoColor grupocolor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosGrupoColor(GrupoColor grupocolorOrigen,GrupoColor grupocolor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && grupocolorOrigen.getId()!=null && !grupocolorOrigen.getId().equals(0L))) {grupocolor.setId(grupocolorOrigen.getId());}}
			if(conDefault || (!conDefault && grupocolorOrigen.getcodigo()!=null && !grupocolorOrigen.getcodigo().equals(""))) {grupocolor.setcodigo(grupocolorOrigen.getcodigo());}
			if(conDefault || (!conDefault && grupocolorOrigen.getnombre()!=null && !grupocolorOrigen.getnombre().equals(""))) {grupocolor.setnombre(grupocolorOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioGrupoColor(GrupoColor grupocolor) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormGrupoColor.jLabelidGrupoColor.setText(grupocolor.getId().toString());
			this.jInternalFrameDetalleFormGrupoColor.jTextFieldcodigoGrupoColor.setText(grupocolor.getcodigo());
			this.jInternalFrameDetalleFormGrupoColor.jTextAreanombreGrupoColor.setText(grupocolor.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioGrupoColor(GrupoColorBean grupocolorBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormGrupoColor.jLabelidGrupoColor.setText(grupocolorBean.getId().toString());
			this.jInternalFrameDetalleFormGrupoColor.jTextFieldcodigoGrupoColor.setText(grupocolorBean.getcodigo());
			this.jInternalFrameDetalleFormGrupoColor.jTextAreanombreGrupoColor.setText(grupocolorBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanGrupoColor(GrupoColorParameterReturnGeneral grupocolorReturnGeneral,GrupoColorBean grupocolorBean,Boolean conDefault) throws Exception { 
		try {
			GrupoColor grupocolorLocal=new GrupoColor();
			
			grupocolorLocal=grupocolorReturnGeneral.getGrupoColor();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && grupocolorLocal.getId()!=null && !grupocolorLocal.getId().equals(0L))) {grupocolorBean.setId(grupocolorLocal.getId());}}
			if(conDefault || (!conDefault && grupocolorLocal.getcodigo()!=null && !grupocolorLocal.getcodigo().equals(""))) {grupocolorBean.setcodigo(grupocolorLocal.getcodigo());}
			if(conDefault || (!conDefault && grupocolorLocal.getnombre()!=null && !grupocolorLocal.getnombre().equals(""))) {grupocolorBean.setnombre(grupocolorLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGrupoColorGenerico(Long idGrupoColorSeleccionado,JComboBox jComboBoxGrupoColor,List<GrupoColor> grupocolorsLocal)throws Exception {
		try {
			GrupoColor  grupocolorTemp=null;

			for(GrupoColor grupocolorAux:grupocolorsLocal) {
				if(grupocolorAux.getId()!=null && grupocolorAux.getId().equals(idGrupoColorSeleccionado)) {
					grupocolorTemp=grupocolorAux;
					break;
				}
			}

			jComboBoxGrupoColor.setSelectedItem(grupocolorTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGrupoColorGenerico(JComboBox jComboBoxGrupoColor,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxGrupoColor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxGrupoColor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxGrupoColor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxGrupoColor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxGrupoColor.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxGrupoColor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxGrupoColor.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxGrupoColor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxGrupoColor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxGrupoColor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ColorProducto")) {
			jButtonColorProductoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			grupocolor=(GrupoColor) grupocolorLogic.getGrupoColors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			grupocolor =(GrupoColor) grupocolors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!grupocolor.getIsNew() && !grupocolor.getIsChanged() && !grupocolor.getIsDeleted()) {
				sDescripcion=grupocolor.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=grupocolor.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!grupocolor.getIsNew() && !grupocolor.getIsChanged() && !grupocolor.getIsDeleted()) {
				sDescripcion=grupocolor.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=grupocolor.getsucursal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		GrupoColor grupocolorRow=new GrupoColor();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			grupocolorRow=(GrupoColor) grupocolorLogic.getGrupoColors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			grupocolorRow=(GrupoColor) grupocolors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonColorProductoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,GrupoColor grupocolor) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormGrupoColor==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupocolor = (GrupoColor)this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.grupocolor = (GrupoColor)this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(grupocolor!=null) {
						this.grupocolor = grupocolor;
					} else {
						this.grupocolor = new GrupoColor();
					}
				}

				if(this.isTienePermisosColorProducto && this.permiteMantenimiento(this.grupocolor)) {
					ColorProductoBeanSwingJInternalFrame colorproductoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFramePopup=new ColorProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						colorproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFramePopup;
					} else {
						colorproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame;
					}

					List<GrupoColor> grupocolors=new ArrayList<GrupoColor>();
					grupocolors.add(this.grupocolor);
					if(!esRelacionado) {
						//colorproductoBeanSwingJInternalFrame.colorproductoSessionBean.setConGuardarRelaciones(false);
						//colorproductoBeanSwingJInternalFrame.colorproductoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					colorproductoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormGrupoColor.cargarColorProductoBeanSwingJInternalFrame(grupocolors,this.grupocolor,colorproductoBeanSwingJInternalFrame,/*conInicializar,*/colorproductoBeanSwingJInternalFrame.colorproductoSessionBean.getConGuardarRelaciones(),colorproductoBeanSwingJInternalFrame.colorproductoSessionBean.getEsGuardarRelacionado());
					colorproductoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						colorproductoBeanSwingJInternalFrame.actualizarEstadoPanelsColorProducto("no_relacionado");

						colorproductoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ColorProductoConstantesFunciones.ITAMANIOFILATABLA + (ColorProductoConstantesFunciones.ITAMANIOFILATABLA/2));

						colorproductoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderGrupoColor=(TitledBorder)this.jScrollPanelDatosGrupoColor.getBorder();
						TitledBorder titledBorderColorProducto=(TitledBorder)colorproductoBeanSwingJInternalFrame.jScrollPanelDatosColorProducto.getBorder();

						titledBorderColorProducto.setTitle(titledBorderGrupoColor.getTitle() + " -> Color Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,colorproductoBeanSwingJInternalFrame);
						}

						colorproductoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(colorproductoBeanSwingJInternalFrame);

						colorproductoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.grupocolorSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Color Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualGrupoColor(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoGrupoColor.setVisible((this.isVisibilidadCeldaNuevoGrupoColor && this.isPermisoNuevoGrupoColor));			
			this.jButtonDuplicarGrupoColor.setVisible((this.isVisibilidadCeldaDuplicarGrupoColor && this.isPermisoDuplicarGrupoColor));			
			this.jButtonCopiarGrupoColor.setVisible((this.isVisibilidadCeldaCopiarGrupoColor && this.isPermisoCopiarGrupoColor));
			this.jButtonVerFormGrupoColor.setVisible((this.isVisibilidadCeldaVerFormGrupoColor && this.isPermisoVerFormGrupoColor));
			
			this.jButtonAbrirOrderByGrupoColor.setVisible((this.isVisibilidadCeldaOrdenGrupoColor && this.isPermisoOrdenGrupoColor));			
			
			this.jButtonNuevoRelacionesGrupoColor.setVisible((this.isVisibilidadCeldaNuevoRelacionesGrupoColor && this.isPermisoNuevoGrupoColor));			
			this.jButtonNuevoGuardarCambiosGrupoColor.setVisible((this.isVisibilidadCeldaNuevoGrupoColor && this.isPermisoNuevoGrupoColor && this.isPermisoGuardarCambiosGrupoColor));
			
			if(this.jInternalFrameDetalleFormGrupoColor!=null) {
			this.jInternalFrameDetalleFormGrupoColor.jButtonModificarGrupoColor.setVisible((this.isVisibilidadCeldaModificarGrupoColor && this.isPermisoActualizarGrupoColor));	
			this.jInternalFrameDetalleFormGrupoColor.jButtonActualizarGrupoColor.setVisible((this.isVisibilidadCeldaActualizarGrupoColor && this.isPermisoActualizarGrupoColor));	
			this.jInternalFrameDetalleFormGrupoColor.jButtonEliminarGrupoColor.setVisible((this.isVisibilidadCeldaEliminarGrupoColor && this.isPermisoEliminarGrupoColor));
			this.jInternalFrameDetalleFormGrupoColor.jButtonCancelarGrupoColor.setVisible(this.isVisibilidadCeldaCancelarGrupoColor);							
			this.jInternalFrameDetalleFormGrupoColor.jButtonGuardarCambiosGrupoColor.setVisible((this.isVisibilidadCeldaGuardarGrupoColor && this.isPermisoGuardarCambiosGrupoColor));			
			
			}
						
			this.jButtonGuardarCambiosTablaGrupoColor.setVisible((this.isVisibilidadCeldaGuardarCambiosGrupoColor && this.isPermisoGuardarCambiosGrupoColor));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarGrupoColor.setVisible((this.isVisibilidadCeldaNuevoGrupoColor && this.isPermisoNuevoGrupoColor));						
			this.jButtonDuplicarToolBarGrupoColor.setVisible((this.isVisibilidadCeldaDuplicarGrupoColor && this.isPermisoDuplicarGrupoColor));						
			this.jButtonCopiarToolBarGrupoColor.setVisible((this.isVisibilidadCeldaCopiarGrupoColor && this.isPermisoCopiarGrupoColor));			
			this.jButtonVerFormToolBarGrupoColor.setVisible((this.isVisibilidadCeldaVerFormGrupoColor && this.isPermisoVerFormGrupoColor));			
			this.jButtonAbrirOrderByToolBarGrupoColor.setVisible((this.isVisibilidadCeldaOrdenGrupoColor && this.isPermisoOrdenGrupoColor));
			this.jButtonNuevoRelacionesToolBarGrupoColor.setVisible((this.isVisibilidadCeldaNuevoRelacionesGrupoColor && this.isPermisoNuevoGrupoColor));			
			this.jButtonNuevoGuardarCambiosToolBarGrupoColor.setVisible((this.isVisibilidadCeldaNuevoGrupoColor && this.isPermisoNuevoGrupoColor && this.isPermisoGuardarCambiosGrupoColor));			
			
			if(this.jInternalFrameDetalleFormGrupoColor!=null) {
			this.jInternalFrameDetalleFormGrupoColor.jButtonModificarToolBarGrupoColor.setVisible((this.isVisibilidadCeldaModificarGrupoColor && this.isPermisoActualizarGrupoColor));	
			this.jInternalFrameDetalleFormGrupoColor.jButtonActualizarToolBarGrupoColor.setVisible((this.isVisibilidadCeldaActualizarGrupoColor  && this.isPermisoActualizarGrupoColor));	
			this.jInternalFrameDetalleFormGrupoColor.jButtonEliminarToolBarGrupoColor.setVisible((this.isVisibilidadCeldaEliminarGrupoColor && this.isPermisoEliminarGrupoColor));
			this.jInternalFrameDetalleFormGrupoColor.jButtonCancelarToolBarGrupoColor.setVisible(this.isVisibilidadCeldaCancelarGrupoColor);				
			this.jInternalFrameDetalleFormGrupoColor.jButtonGuardarCambiosToolBarGrupoColor.setVisible((this.isVisibilidadCeldaGuardarGrupoColor && this.isPermisoGuardarCambiosGrupoColor));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarGrupoColor.setVisible((this.isVisibilidadCeldaGuardarCambiosGrupoColor && this.isPermisoGuardarCambiosGrupoColor));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoGrupoColor.setVisible((this.isVisibilidadCeldaNuevoGrupoColor && this.isPermisoNuevoGrupoColor));			
			this.jMenuItemDuplicarGrupoColor.setVisible((this.isVisibilidadCeldaDuplicarGrupoColor && this.isPermisoDuplicarGrupoColor));			
			this.jMenuItemCopiarGrupoColor.setVisible((this.isVisibilidadCeldaCopiarGrupoColor && this.isPermisoCopiarGrupoColor));			
			this.jMenuItemVerFormGrupoColor.setVisible((this.isVisibilidadCeldaVerFormGrupoColor && this.isPermisoVerFormGrupoColor));			
			this.jMenuItemAbrirOrderByGrupoColor.setVisible((this.isVisibilidadCeldaOrdenGrupoColor && this.isPermisoOrdenGrupoColor));			
			//this.jMenuItemMostrarOcultarGrupoColor.setVisible((this.isVisibilidadCeldaOrdenGrupoColor && this.isPermisoOrdenGrupoColor));
			this.jMenuItemDetalleAbrirOrderByGrupoColor.setVisible((this.isVisibilidadCeldaOrdenGrupoColor && this.isPermisoOrdenGrupoColor));			
			//this.jMenuItemDetalleMostrarOcultarGrupoColor.setVisible((this.isVisibilidadCeldaOrdenGrupoColor && this.isPermisoOrdenGrupoColor));			
			this.jMenuItemNuevoRelacionesGrupoColor.setVisible((this.isVisibilidadCeldaNuevoRelacionesGrupoColor && this.isPermisoNuevoGrupoColor));			
			this.jMenuItemNuevoGuardarCambiosGrupoColor.setVisible((this.isVisibilidadCeldaNuevoGrupoColor && this.isPermisoNuevoGrupoColor && this.isPermisoGuardarCambiosGrupoColor));									
			
			if(this.jInternalFrameDetalleFormGrupoColor!=null) {
			this.jInternalFrameDetalleFormGrupoColor.jMenuItemModificarGrupoColor.setVisible((this.isVisibilidadCeldaModificarGrupoColor && this.isPermisoActualizarGrupoColor));	
			this.jInternalFrameDetalleFormGrupoColor.jMenuItemActualizarGrupoColor.setVisible((this.isVisibilidadCeldaActualizarGrupoColor && this.isPermisoActualizarGrupoColor));	
			this.jInternalFrameDetalleFormGrupoColor.jMenuItemEliminarGrupoColor.setVisible((this.isVisibilidadCeldaEliminarGrupoColor && this.isPermisoEliminarGrupoColor));
			this.jInternalFrameDetalleFormGrupoColor.jMenuItemCancelarGrupoColor.setVisible(this.isVisibilidadCeldaCancelarGrupoColor);				
			}
			
			this.jMenuItemGuardarCambiosGrupoColor.setVisible((this.isVisibilidadCeldaGuardarGrupoColor && this.isPermisoGuardarCambiosGrupoColor));						
			this.jMenuItemGuardarCambiosTablaGrupoColor.setVisible((this.isVisibilidadCeldaGuardarCambiosGrupoColor && this.isPermisoGuardarCambiosGrupoColor));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoGrupoColor=this.jButtonNuevoGrupoColor.isVisible();
			this.isVisibilidadCeldaDuplicarGrupoColor=this.jButtonDuplicarGrupoColor.isVisible();
			this.isVisibilidadCeldaCopiarGrupoColor=this.jButtonCopiarGrupoColor.isVisible();
			this.isVisibilidadCeldaVerFormGrupoColor=this.jButtonVerFormGrupoColor.isVisible();
			
			this.isVisibilidadCeldaOrdenGrupoColor=this.jButtonAbrirOrderByGrupoColor.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesGrupoColor=this.jButtonNuevoRelacionesGrupoColor.isVisible();
			this.isVisibilidadCeldaModificarGrupoColor=this.jButtonModificarGrupoColor.isVisible();
			
			if(this.jInternalFrameDetalleFormGrupoColor!=null) {
			this.isVisibilidadCeldaActualizarGrupoColor=this.jInternalFrameDetalleFormGrupoColor.jButtonActualizarGrupoColor.isVisible();
			this.isVisibilidadCeldaEliminarGrupoColor=this.jInternalFrameDetalleFormGrupoColor.jButtonEliminarGrupoColor.isVisible();
			this.isVisibilidadCeldaCancelarGrupoColor=this.jInternalFrameDetalleFormGrupoColor.jButtonCancelarGrupoColor.isVisible();
			this.isVisibilidadCeldaGuardarGrupoColor=this.jInternalFrameDetalleFormGrupoColor.jButtonGuardarCambiosGrupoColor.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosGrupoColor=this.jButtonGuardarCambiosTablaGrupoColor.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoGrupoColor=this.jButtonNuevoToolBarGrupoColor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesGrupoColor=this.jButtonNuevoRelacionesToolBarGrupoColor.isVisible();
			
			if(this.jInternalFrameDetalleFormGrupoColor!=null) {
			this.isVisibilidadCeldaModificarGrupoColor=this.jInternalFrameDetalleFormGrupoColor.jButtonModificarToolBarGrupoColor.isVisible();
			this.isVisibilidadCeldaActualizarGrupoColor=this.jInternalFrameDetalleFormGrupoColor.jButtonActualizarToolBarGrupoColor.isVisible();
			this.isVisibilidadCeldaEliminarGrupoColor=this.jInternalFrameDetalleFormGrupoColor.jButtonEliminarToolBarGrupoColor.isVisible();
			this.isVisibilidadCeldaCancelarGrupoColor=this.jInternalFrameDetalleFormGrupoColor.jButtonCancelarToolBarGrupoColor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarGrupoColor=this.jButtonGuardarCambiosToolBarGrupoColor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosGrupoColor=this.jButtonGuardarCambiosTablaToolBarGrupoColor.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoGrupoColor=this.jMenuItemNuevoGrupoColor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesGrupoColor=this.jMenuItemNuevoRelacionesGrupoColor.isVisible();
			
			if(this.jInternalFrameDetalleFormGrupoColor!=null) {
			this.isVisibilidadCeldaModificarGrupoColor=this.jInternalFrameDetalleFormGrupoColor.jMenuItemModificarGrupoColor.isVisible();
			this.isVisibilidadCeldaActualizarGrupoColor=this.jInternalFrameDetalleFormGrupoColor.jMenuItemActualizarGrupoColor.isVisible();
			this.isVisibilidadCeldaEliminarGrupoColor=this.jInternalFrameDetalleFormGrupoColor.jMenuItemEliminarGrupoColor.isVisible();
			this.isVisibilidadCeldaCancelarGrupoColor=this.jInternalFrameDetalleFormGrupoColor.jMenuItemCancelarGrupoColor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarGrupoColor=this.jMenuItemGuardarCambiosGrupoColor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosGrupoColor=this.jMenuItemGuardarCambiosTablaGrupoColor.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesGrupoColor(Boolean esInicializar) {
		if(GrupoColorJInternalFrame.ISBINDING_MANUAL) {			
			if(this.grupocolorSessionBean.getConGuardarRelaciones()) {
				//if(this.grupocolorSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesGrupoColor();
			}
			
			this.inicializarActualizarBindingBotonesManualGrupoColor(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualGrupoColor() {
		this.jButtonNuevoGrupoColor.setVisible(this.isPermisoNuevoGrupoColor);			
		this.jButtonDuplicarGrupoColor.setVisible(this.isPermisoDuplicarGrupoColor);			
		this.jButtonCopiarGrupoColor.setVisible(this.isPermisoCopiarGrupoColor);			
		this.jButtonVerFormGrupoColor.setVisible(this.isPermisoVerFormGrupoColor);			
		
		this.jButtonAbrirOrderByGrupoColor.setVisible(this.isPermisoOrdenGrupoColor);					
		
		this.jButtonNuevoRelacionesGrupoColor.setVisible(this.isPermisoNuevoGrupoColor);			
		
		if(this.jInternalFrameDetalleFormGrupoColor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoColor.jButtonModificarGrupoColor.setVisible(this.isPermisoActualizarGrupoColor);	
			this.jInternalFrameDetalleFormGrupoColor.jButtonActualizarGrupoColor.setVisible(this.isPermisoActualizarGrupoColor);	
			this.jInternalFrameDetalleFormGrupoColor.jButtonEliminarGrupoColor.setVisible(this.isPermisoEliminarGrupoColor);
			this.jInternalFrameDetalleFormGrupoColor.jButtonCancelarGrupoColor.setVisible(this.isVisibilidadCeldaCancelarGrupoColor);						
			this.jInternalFrameDetalleFormGrupoColor.jButtonGuardarCambiosGrupoColor.setVisible(this.isPermisoGuardarCambiosGrupoColor);							
		}
		
		this.jButtonGuardarCambiosTablaGrupoColor.setVisible(this.isPermisoActualizarGrupoColor);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleGrupoColor() {
		this.jInternalFrameDetalleFormGrupoColor.jButtonModificarGrupoColor.setVisible(this.isPermisoActualizarGrupoColor);	
		this.jInternalFrameDetalleFormGrupoColor.jButtonActualizarGrupoColor.setVisible(this.isPermisoActualizarGrupoColor);	
		this.jInternalFrameDetalleFormGrupoColor.jButtonEliminarGrupoColor.setVisible(this.isPermisoEliminarGrupoColor);
		this.jInternalFrameDetalleFormGrupoColor.jButtonCancelarGrupoColor.setVisible(this.isVisibilidadCeldaCancelarGrupoColor);							
		this.jInternalFrameDetalleFormGrupoColor.jButtonGuardarCambiosGrupoColor.setVisible((this.isVisibilidadCeldaGuardarGrupoColor && this.isPermisoGuardarCambiosGrupoColor));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosGrupoColor() {
		if(GrupoColorJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualGrupoColor();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesGrupoColor() {
	}
	
	public void jTableDatosGrupoColorListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarGrupoColor(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidGrupoColorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoColor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoColor(this.getgrupocolor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoColor(this.grupocolor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupocolor =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupocolor =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupocolor==null) {
						this.grupocolor = new GrupoColor();
					}

					this.setVariablesFormularioToObjetoActualGrupoColor(this.grupocolor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoColor(this.grupocolor);
				}

				if(this.grupocolor.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.grupocolor.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoColor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaGrupoColorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebGrupoColor(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoColor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGrupoColor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGrupoColor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolor =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.grupocolor =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGrupoColor(this.getgrupocolor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoColor(this.grupocolor);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.grupocolorLogic.getConnexion());

				if(this.grupocolor.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.grupocolor.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGrupoColor=(TitledBorder)this.jScrollPanelDatosGrupoColor.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderGrupoColor.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaGrupoColorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoColor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoColor(this.getgrupocolor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoColor(this.grupocolor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupocolor =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupocolor =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupocolor==null) {
						this.grupocolor = new GrupoColor();
					}

					this.setVariablesFormularioToObjetoActualGrupoColor(this.grupocolor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoColor(this.grupocolor);
				}

				if(this.grupocolor.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.grupocolor.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoColor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalGrupoColorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebGrupoColor(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoColor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGrupoColor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGrupoColor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolor =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.grupocolor =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGrupoColor(this.getgrupocolor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoColor(this.grupocolor);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.grupocolorLogic.getConnexion());

				if(this.grupocolor.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.grupocolor.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGrupoColor=(TitledBorder)this.jScrollPanelDatosGrupoColor.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderGrupoColor.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalGrupoColorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoColor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoColor(this.getgrupocolor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoColor(this.grupocolor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupocolor =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupocolor =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupocolor==null) {
						this.grupocolor = new GrupoColor();
					}

					this.setVariablesFormularioToObjetoActualGrupoColor(this.grupocolor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoColor(this.grupocolor);
				}

				if(this.grupocolor.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.grupocolor.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoColor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoGrupoColorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoColor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoColor(this.getgrupocolor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoColor(this.grupocolor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupocolor =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupocolor =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupocolor==null) {
						this.grupocolor = new GrupoColor();
					}

					this.setVariablesFormularioToObjetoActualGrupoColor(this.grupocolor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoColor(this.grupocolor);
				}

				if(this.grupocolor.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.grupocolor.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoColor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreGrupoColorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoColor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoColor(this.getgrupocolor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoColor(this.grupocolor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupocolor =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupocolor =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupocolor==null) {
						this.grupocolor = new GrupoColor();
					}

					this.setVariablesFormularioToObjetoActualGrupoColor(this.grupocolor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoColor(this.grupocolor);
				}

				if(this.grupocolor.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.grupocolor.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoColor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoGrupoColorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGrupoColor(false,false);

			this.getGrupoColorsBusquedaPorCodigo();

			this.inicializarActualizarBindingGrupoColor(false);

			//if(GrupoColorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGrupoColor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreGrupoColorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGrupoColor(false,false);

			this.getGrupoColorsBusquedaPorNombre();

			this.inicializarActualizarBindingGrupoColor(false);

			//if(GrupoColorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGrupoColor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaGrupoColorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGrupoColor(false,false);

			this.getGrupoColorsFK_IdEmpresa();

			this.inicializarActualizarBindingGrupoColor(false);

			//if(GrupoColorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGrupoColor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalGrupoColorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGrupoColor(false,false);

			this.getGrupoColorsFK_IdSucursal();

			this.inicializarActualizarBindingGrupoColor(false);

			//if(GrupoColorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGrupoColor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupocolorLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameGrupoColor() {
		if(this.jInternalFrameDetalleFormGrupoColor!=null) {
		

		if(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormGrupoColor!=null) {
			this.jInternalFrameDetalleFormGrupoColor.setVisible(false);	    			
			this.jInternalFrameDetalleFormGrupoColor.dispose();
			this.jInternalFrameDetalleFormGrupoColor=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoGrupoColor!=null) {
			this.jInternalFrameReporteDinamicoGrupoColor.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoGrupoColor.dispose();
			this.jInternalFrameReporteDinamicoGrupoColor=null;
		}
		
		if(this.jInternalFrameImportacionGrupoColor!=null) {
			this.jInternalFrameImportacionGrupoColor.setVisible(false);	    			
			this.jInternalFrameImportacionGrupoColor.dispose();
			this.jInternalFrameImportacionGrupoColor=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessGrupoColor();
			
			GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
			
			
			if(sTipo.equals("NuevoGrupoColor")) {
				jButtonNuevoGrupoColorActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarGrupoColor")) {
				jButtonDuplicarGrupoColorActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarGrupoColor")) {
				jButtonCopiarGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("VerFormGrupoColor")) {
				jButtonVerFormGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarGrupoColor")) {
				jButtonNuevoGrupoColorActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarGrupoColor")) {
				jButtonDuplicarGrupoColorActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoGrupoColor")) {
				jButtonNuevoGrupoColorActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarGrupoColor")) {
				jButtonDuplicarGrupoColorActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesGrupoColor")) {
				jButtonNuevoGrupoColorActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarGrupoColor")) {
				jButtonNuevoGrupoColorActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesGrupoColor")) {
				jButtonNuevoGrupoColorActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarGrupoColor")) {
				jButtonModificarGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarGrupoColor")) {
				jButtonModificarGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarGrupoColor")) {
				jButtonModificarGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("ActualizarGrupoColor")) {
				jButtonActualizarGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarGrupoColor")) {
				jButtonActualizarGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarGrupoColor")) {
				jButtonActualizarGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("EliminarGrupoColor")) {
				jButtonEliminarGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarGrupoColor")) {
				jButtonEliminarGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarGrupoColor")) {
				jButtonEliminarGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("CancelarGrupoColor")) {
				jButtonCancelarGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarGrupoColor")) {
				jButtonCancelarGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarGrupoColor")) {
				jButtonCancelarGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("CerrarGrupoColor")) {
				jButtonCerrarGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarGrupoColor")) {
				jButtonCerrarGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarGrupoColor")) {
				jButtonCerrarGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarGrupoColor")) {
				jButtonMostrarOcultarGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarGrupoColor")) {
				jButtonCancelarGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosGrupoColor")) {
				jButtonGuardarCambiosGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarGrupoColor")) {
				jButtonGuardarCambiosGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarGrupoColor")) {
				jButtonCopiarGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarGrupoColor")) {
				jButtonVerFormGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosGrupoColor")) {
				jButtonGuardarCambiosGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarGrupoColor")) {
				jButtonCopiarGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormGrupoColor")) {
				jButtonVerFormGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaGrupoColor")) {
				jButtonGuardarCambiosGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarGrupoColor")) {
				jButtonGuardarCambiosGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaGrupoColor")) {
				jButtonGuardarCambiosGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionGrupoColor")) {
				jButtonRecargarInformacionGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarGrupoColor")) {
				jButtonRecargarInformacionGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionGrupoColor")) {
				jButtonRecargarInformacionGrupoColorActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresGrupoColor")) {
				jButtonAnterioresGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarGrupoColor")) {
				jButtonAnterioresGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreGrupoColor")) {
				jButtonAnterioresGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("SiguientesGrupoColor")) {
				jButtonSiguientesGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarGrupoColor")) {
				jButtonSiguientesGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesGrupoColor")) {
				jButtonSiguientesGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByGrupoColor") || sTipo.equals("MenuItemDetalleAbrirOrderByGrupoColor")) {
				jButtonAbrirOrderByGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarGrupoColor") || sTipo.equals("MenuItemDetalleMostrarOcultarGrupoColor")) {
				jButtonMostrarOcultarGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosGrupoColor")) {
				jButtonNuevoGuardarCambiosGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarGrupoColor")) {
				jButtonNuevoGuardarCambiosGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosGrupoColor")) {
				jButtonNuevoGuardarCambiosGrupoColorActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoGrupoColor")) {
				jButtonCerrarReporteDinamicoGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoGrupoColor")) {
				jButtonGenerarReporteDinamicoGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoGrupoColor")) {
				
				jButtonGenerarExcelReporteDinamicoGrupoColorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionGrupoColor")) {
				jButtonCerrarImportacionGrupoColorActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionGrupoColor")) {
				
				jButtonGenerarImportacionGrupoColorActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionGrupoColor")) {
				
				jButtonAbrirImportacionGrupoColorActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesGrupoColor")) {
				jComboBoxTiposAccionesGrupoColorActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesGrupoColor")) {
				jComboBoxTiposRelacionesGrupoColorActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioGrupoColor")) {
				jComboBoxTiposAccionesGrupoColorActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarGrupoColor")) {
				
				jComboBoxTiposSeleccionarGrupoColorActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralGrupoColor")) {
				jTextFieldValorCampoGeneralGrupoColorActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByGrupoColor")) {
				jButtonAbrirOrderByGrupoColorActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarGrupoColor")) {
				jButtonAbrirOrderByGrupoColorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByGrupoColor")) {
				jButtonCerrarOrderByGrupoColorActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idGrupoColorBusqueda")) {
				this.jButtonidGrupoColorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaGrupoColorUpdate")) {
				this.jButtonid_empresaGrupoColorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaGrupoColorBusqueda")) {
				this.jButtonid_empresaGrupoColorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalGrupoColorUpdate")) {
				this.jButtonid_sucursalGrupoColorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalGrupoColorBusqueda")) {
				this.jButtonid_sucursalGrupoColorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoGrupoColorBusqueda")) {
				this.jButtoncodigoGrupoColorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreGrupoColorBusqueda")) {
				this.jButtonnombreGrupoColorBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoGrupoColor")) {
				this.jButtonBusquedaPorCodigoGrupoColorActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreGrupoColor")) {
				this.jButtonBusquedaPorNombreGrupoColorActionPerformed(evt);
			}
			
			;
			
			
			GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessGrupoColor();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoColorActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocolor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupocolor);
				
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
				
				


				
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoColor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoColor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			GrupoColor grupocolorLocal=null;
			
			if(!this.getEsControlTabla()) {
				grupocolorLocal=this.grupocolor;
			} else {
				grupocolorLocal=this.grupocolorAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocolor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupocolor);
				
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
							
				
				


				
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoColor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoColor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoColorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoColor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorAnterior =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupocolorAnterior =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
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
			
			GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
			
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
			
			


			
			GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoColorActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocolor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupocolor);
				
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
								
						
				


				
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoColor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoColor.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocolor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupocolor);
				
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
								
				
				


				
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoColor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoColor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoColorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoColor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorAnterior =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupocolorAnterior =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocolor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupocolor);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoColorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoColor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorAnterior =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupocolorAnterior =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoColorActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocolor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.grupocolor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocolor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupocolor);
				
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
							
				
				


				
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoColor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoColor.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoColorActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosGrupoColor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupocolorAnterior =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.grupocolorAnterior =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
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
			
			GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
			
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
			
			


			
			GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoColorActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocolor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.grupocolor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocolor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupocolor);
				
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
								
				
				


				
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoColor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoColor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoColorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoColor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorAnterior =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupocolorAnterior =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoColorActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocolor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.grupocolor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoColorActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocolor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupocolor);
				
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosGrupoColor")) {
					jCheckBoxSeleccionarTodosGrupoColorItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosGrupoColor")) {
					jCheckBoxSeleccionadosGrupoColorItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarGrupoColor")) {
					
				}
				
				


				
				
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoColor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoColor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocolor);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.grupocolor);
				
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
												
				
				


				
				
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoColor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoColor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoColorActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosGrupoColor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupocolorAnterior =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.grupocolorAnterior =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoColorActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocolor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupocolor);
				
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
				
				
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
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
			
			GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
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
			
			


			
			GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoColorActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocolor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupocolor);
				
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoColor.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoColor.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupocolor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupocolor);
				
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
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
				
				


				
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoColor.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoColor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoColorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoColor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupocolorAnterior =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupocolorAnterior =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarGrupoColor")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosGrupoColorListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosGrupoColor.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.grupocolor =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.grupocolor =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.grupocolor);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarGrupoColor")) {
				
				}
				
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarGrupoColor")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosGrupoColor.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarGrupoColor")) {
			
			}
			
			GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessGrupoColor();
			
			GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
			
			if(sTipo.equals("NuevoGrupoColor")) {
				jButtonNuevoGrupoColorActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarGrupoColor")) {
				jButtonDuplicarGrupoColorActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarGrupoColor")) {
				jButtonCopiarGrupoColorActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormGrupoColor")) {
				jButtonVerFormGrupoColorActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesGrupoColor")) {
				jButtonNuevoGrupoColorActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarGrupoColor")) {
				jButtonModificarGrupoColorActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarGrupoColor")) {
				jButtonActualizarGrupoColorActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarGrupoColor")) {
				jButtonEliminarGrupoColorActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaGrupoColor")) {
				jButtonGuardarCambiosGrupoColorActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarGrupoColor")) {
				jButtonCancelarGrupoColorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarGrupoColor")) {
				jButtonCerrarGrupoColorActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosGrupoColor")) {
				jButtonGuardarCambiosGrupoColorActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosGrupoColor")) {
				jButtonNuevoGuardarCambiosGrupoColorActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByGrupoColor")) {
				jButtonAbrirOrderByGrupoColorActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionGrupoColor")) {
				jButtonRecargarInformacionGrupoColorActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresGrupoColor")) {
				jButtonAnterioresGrupoColorActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesGrupoColor")) {
				jButtonSiguientesGrupoColorActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idGrupoColorBusqueda")) {
				this.jButtonidGrupoColorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaGrupoColorUpdate")) {
				this.jButtonid_empresaGrupoColorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaGrupoColorBusqueda")) {
				this.jButtonid_empresaGrupoColorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalGrupoColorUpdate")) {
				this.jButtonid_sucursalGrupoColorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalGrupoColorBusqueda")) {
				this.jButtonid_sucursalGrupoColorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoGrupoColorBusqueda")) {
				this.jButtoncodigoGrupoColorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreGrupoColorBusqueda")) {
				this.jButtonnombreGrupoColorBusquedaActionPerformed(evt);
			}
			
			GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessGrupoColor();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameGrupoColor")) {
				closingInternalFrameGrupoColor();
				
			} else if(sTipo.equals("jButtonCancelarGrupoColor")) {
				JInternalFrameBase jInternalFrameDetalleFormGrupoColor = (JInternalFrameBase)evt.getSource();
	            	
	            GrupoColorBeanSwingJInternalFrame jInternalFrameParent=(GrupoColorBeanSwingJInternalFrame)jInternalFrameDetalleFormGrupoColor.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarGrupoColorActionPerformed(null);
			}
			
			GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.grupocolor,new Object(),this.grupocolorParameterGeneral,this.grupocolorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormGrupoColor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormGrupoColor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormGrupoColor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.grupocolor)) {
			if(!esControlTabla) {
				if(GrupoColorJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualGrupoColor(this.grupocolor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoColor(this.grupocolor);			
				}
				
				if(this.grupocolorSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualGrupoColor(this.grupocolor,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.grupocolorReturnGeneral=grupocolorLogic.procesarEventosGrupoColorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.grupocolorLogic.getGrupoColors(),this.grupocolor,this.grupocolorParameterGeneral,this.isEsNuevoGrupoColor,classes);//this.grupocolorLogic.getGrupoColor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanGrupoColor(this.grupocolorReturnGeneral,this.grupocolorBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.grupocolorSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanGrupoColor(classes,this.grupocolorReturnGeneral,this.grupocolorBean,false);
					}
						
					if(this.grupocolorReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyGrupoColor(this.grupocolorReturnGeneral.getGrupoColor());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioGrupoColor(this.grupocolorReturnGeneral.getGrupoColor());	
					}
						
					if(this.grupocolorReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioGrupoColor(this.grupocolorReturnGeneral.getGrupoColor(),classes);//this.grupocolorBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioGrupoColor(this.grupocolor,classes);//this.grupocolorBean);									
				}
			
				if(GrupoColorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualGrupoColor(this.grupocolor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoColor(this.grupocolor);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.grupocolorAnterior!=null) {
						this.grupocolor=this.grupocolorAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.grupocolorReturnGeneral=grupocolorLogic.procesarEventosGrupoColorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.grupocolorLogic.getGrupoColors(),this.grupocolor,this.grupocolorParameterGeneral,this.isEsNuevoGrupoColor,classes);//this.grupocolorLogic.getGrupoColor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.grupocolorSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.grupocolorSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.grupocolorReturnGeneral.getGrupoColor(),grupocolorLogic.getGrupoColors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.grupocolorReturnGeneral.getGrupoColor(),this.grupocolors);
				}
				//ARCHITECTURE
				
				//this.jTableDatosGrupoColor.repaint();
				
				//((AbstractTableModel) this.jTableDatosGrupoColor.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosGrupoColor();
			}
		}
	}
	
	public void actualizarVisualTableDatosGrupoColor() throws Exception {
		
		GrupoColorModel grupocolorModel=(GrupoColorModel)this.jTableDatosGrupoColor.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			grupocolorModel.grupocolors=this.grupocolorLogic.getGrupoColors();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			grupocolorModel.grupocolors=this.grupocolors;
		}
		
		
		((GrupoColorModel) this.jTableDatosGrupoColor.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaGrupoColor() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getgrupocolorAnterior(),this.grupocolorLogic.getGrupoColors());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getgrupocolorAnterior(),this.grupocolors);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosGrupoColor();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioGrupoColor(GrupoColor grupocolor,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ColorProducto.class)) {
					this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductoLogic.setColorProductos(grupocolor.getColorProductos());
					this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaColorProducto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
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
										
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.grupocolor,new Object(),generalEntityParameterGeneral,this.grupocolorReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.grupocolorSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=GrupoColorConstantesFunciones.getClassesRelationshipsOfGrupoColor(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=GrupoColorConstantesFunciones.getClassesRelationshipsFromStringsOfGrupoColor(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormGrupoColor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				GrupoColorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.grupocolor,new Object(),generalEntityParameterGeneral,this.grupocolorReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioGrupoColor(GrupoColorBean grupocolorBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ColorProducto.class)) {
					this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductoLogic.setColorProductos(grupocolor.getColorProductos());
					this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaColorProducto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanGrupoColor(ArrayList<Classe> classes,GrupoColorReturnGeneral grupocolorReturnGeneral,GrupoColorBean grupocolorBean,Boolean conDefault) throws Exception {
		
			this.grupocolorBean.setColorProductos(grupocolorReturnGeneral.getGrupoColor().getColorProductos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualGrupoColor(GrupoColor grupocolor,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ColorProducto.class)) {
					grupocolor.setColorProductos(this.jInternalFrameDetalleFormGrupoColor.colorproductoBeanSwingJInternalFrame.colorproductoLogic.getColorProductos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.grupocolor)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormGrupoColor = new GrupoColorDetalleFormJInternalFrame(jDesktopPane,this.grupocolorSessionBean.getConGuardarRelaciones(),this.grupocolorSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormGrupoColor);
		this.jInternalFrameDetalleFormGrupoColor.setVisible(false);
		this.jInternalFrameDetalleFormGrupoColor.setSelected(false);						
		
		this.jInternalFrameDetalleFormGrupoColor.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormGrupoColor.grupocolorLogic=this.grupocolorLogic;
		
		this.cargarCombosFrameForeignKeyGrupoColor("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleGrupoColor();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleGrupoColor();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyGrupoColor("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyGrupoColor();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormGrupoColor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarGrupoColor"));
		
		this.jInternalFrameDetalleFormGrupoColor.jButtonModificarGrupoColor.addActionListener(new ButtonActionListener(this,"ModificarGrupoColor"));

		
		this.jInternalFrameDetalleFormGrupoColor.jButtonModificarToolBarGrupoColor.addActionListener(new ButtonActionListener(this,"ModificarToolBarGrupoColor"));
					
		this.jInternalFrameDetalleFormGrupoColor.jMenuItemModificarGrupoColor.addActionListener(new ButtonActionListener(this,"MenuItemModificarGrupoColor"));		
		
		
		
		this.jInternalFrameDetalleFormGrupoColor.jButtonActualizarGrupoColor.addActionListener (new ButtonActionListener(this,"ActualizarGrupoColor"));
		
		
		this.jInternalFrameDetalleFormGrupoColor.jButtonActualizarToolBarGrupoColor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarGrupoColor"));
						
		this.jInternalFrameDetalleFormGrupoColor.jMenuItemActualizarGrupoColor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarGrupoColor"));		
		
		
		
		this.jInternalFrameDetalleFormGrupoColor.jButtonEliminarGrupoColor.addActionListener (new ButtonActionListener(this,"EliminarGrupoColor"));
		
		
		this.jInternalFrameDetalleFormGrupoColor.jButtonEliminarToolBarGrupoColor.addActionListener (new ButtonActionListener(this,"EliminarToolBarGrupoColor"));
								
		this.jInternalFrameDetalleFormGrupoColor.jMenuItemEliminarGrupoColor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarGrupoColor"));		
		
		
		
		this.jInternalFrameDetalleFormGrupoColor.jButtonCancelarGrupoColor.addActionListener (new ButtonActionListener(this,"CancelarGrupoColor"));
		
		
		this.jInternalFrameDetalleFormGrupoColor.jButtonCancelarToolBarGrupoColor.addActionListener (new ButtonActionListener(this,"CancelarToolBarGrupoColor"));
					
		this.jInternalFrameDetalleFormGrupoColor.jMenuItemCancelarGrupoColor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarGrupoColor"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormGrupoColor.jMenuItemDetalleCerrarGrupoColor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarGrupoColor"));		
		
		
		
		this.jInternalFrameDetalleFormGrupoColor.jButtonGuardarCambiosToolBarGrupoColor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGrupoColor"));
		
		
		
		this.jInternalFrameDetalleFormGrupoColor.jButtonGuardarCambiosToolBarGrupoColor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGrupoColor"));
		
		
		
		this.jInternalFrameDetalleFormGrupoColor.jComboBoxTiposAccionesFormularioGrupoColor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioGrupoColor"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoColor.jButtonidGrupoColorBusqueda.addActionListener(new ButtonActionListener(this,"idGrupoColorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoColor.jButtonid_empresaGrupoColorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGrupoColorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoColor.jButtonid_empresaGrupoColorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGrupoColorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoColor.jButtonid_sucursalGrupoColorUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalGrupoColorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoColor.jButtonid_sucursalGrupoColorBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalGrupoColorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoColor.jButtoncodigoGrupoColorBusqueda.addActionListener(new ButtonActionListener(this,"codigoGrupoColorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoColor.jButtonnombreGrupoColorBusqueda.addActionListener(new ButtonActionListener(this,"nombreGrupoColorBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormGrupoColor.jTabbedPaneRelacionesGrupoColor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesGrupoColor"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameGrupoColor"));
		
		if(this.jInternalFrameDetalleFormGrupoColor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoColor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarGrupoColor"));
		}
		
		this.jTableDatosGrupoColor.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarGrupoColor"));
		
		this.jTableDatosGrupoColor.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarGrupoColor"));
		
		this.jButtonNuevoGrupoColor.addActionListener(new ButtonActionListener(this,"NuevoGrupoColor"));
		
		this.jButtonDuplicarGrupoColor.addActionListener(new ButtonActionListener(this,"DuplicarGrupoColor"));
		
		this.jButtonCopiarGrupoColor.addActionListener(new ButtonActionListener(this,"CopiarGrupoColor"));
		
		this.jButtonVerFormGrupoColor.addActionListener(new ButtonActionListener(this,"VerFormGrupoColor"));
		
		
		this.jButtonNuevoToolBarGrupoColor.addActionListener(new ButtonActionListener(this,"NuevoToolBarGrupoColor"));
			
		this.jButtonDuplicarToolBarGrupoColor.addActionListener(new ButtonActionListener(this,"DuplicarToolBarGrupoColor"));
			
		this.jMenuItemNuevoGrupoColor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGrupoColor"));
			
		this.jMenuItemDuplicarGrupoColor.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarGrupoColor"));		
		
		
		this.jButtonNuevoRelacionesGrupoColor.addActionListener (new ButtonActionListener(this,"NuevoRelacionesGrupoColor"));
		
		
		this.jButtonNuevoRelacionesToolBarGrupoColor.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarGrupoColor"));
			
		this.jMenuItemNuevoRelacionesGrupoColor.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesGrupoColor"));		
		
		
		if(this.jInternalFrameDetalleFormGrupoColor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoColor.jButtonModificarGrupoColor.addActionListener(new ButtonActionListener(this,"ModificarGrupoColor"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoColor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoColor.jButtonModificarToolBarGrupoColor.addActionListener(new ButtonActionListener(this,"ModificarToolBarGrupoColor"));
			
			this.jInternalFrameDetalleFormGrupoColor.jMenuItemModificarGrupoColor.addActionListener(new ButtonActionListener(this,"MenuItemModificarGrupoColor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoColor!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormGrupoColor.jButtonActualizarGrupoColor.addActionListener (new ButtonActionListener(this,"ActualizarGrupoColor"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoColor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoColor.jButtonActualizarToolBarGrupoColor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarGrupoColor"));
				
			this.jInternalFrameDetalleFormGrupoColor.jMenuItemActualizarGrupoColor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarGrupoColor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoColor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoColor.jButtonEliminarGrupoColor.addActionListener (new ButtonActionListener(this,"EliminarGrupoColor"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoColor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoColor.jButtonEliminarToolBarGrupoColor.addActionListener (new ButtonActionListener(this,"EliminarToolBarGrupoColor"));
						
			this.jInternalFrameDetalleFormGrupoColor.jMenuItemEliminarGrupoColor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarGrupoColor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoColor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoColor.jButtonCancelarGrupoColor.addActionListener (new ButtonActionListener(this,"CancelarGrupoColor"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoColor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoColor.jButtonCancelarToolBarGrupoColor.addActionListener (new ButtonActionListener(this,"CancelarToolBarGrupoColor"));
			
			this.jInternalFrameDetalleFormGrupoColor.jMenuItemCancelarGrupoColor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarGrupoColor"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarGrupoColor.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarGrupoColor"));		
		
		
		this.jButtonCerrarGrupoColor.addActionListener (new ButtonActionListener(this,"CerrarGrupoColor"));
		
		
		this.jButtonCerrarToolBarGrupoColor.addActionListener (new ButtonActionListener(this,"CerrarToolBarGrupoColor"));
			
		this.jMenuItemCerrarGrupoColor.addActionListener (new ButtonActionListener(this,"MenuItemCerrarGrupoColor"));
			
		if(this.jInternalFrameDetalleFormGrupoColor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoColor.jMenuItemDetalleCerrarGrupoColor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarGrupoColor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoColor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoColor.jButtonGuardarCambiosGrupoColor.addActionListener (new ButtonActionListener(this,"GuardarCambiosGrupoColor"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoColor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoColor.jButtonGuardarCambiosToolBarGrupoColor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGrupoColor"));
		}
		
		this.jButtonCopiarToolBarGrupoColor.addActionListener (new ButtonActionListener(this,"CopiarToolBarGrupoColor"));
			
		this.jButtonVerFormToolBarGrupoColor.addActionListener (new ButtonActionListener(this,"VerFormToolBarGrupoColor"));
		
		this.jMenuItemGuardarCambiosGrupoColor.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosGrupoColor"));
			
		this.jMenuItemCopiarGrupoColor.addActionListener (new ButtonActionListener(this,"MenuItemCopiarGrupoColor"));		
		
		this.jMenuItemVerFormGrupoColor.addActionListener (new ButtonActionListener(this,"MenuItemVerFormGrupoColor"));		
		
		
		this.jButtonGuardarCambiosTablaGrupoColor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaGrupoColor"));
		
		
		this.jButtonGuardarCambiosTablaToolBarGrupoColor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarGrupoColor"));
			
		this.jMenuItemGuardarCambiosTablaGrupoColor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaGrupoColor"));		
		
		
		
		this.jButtonRecargarInformacionGrupoColor.addActionListener (new ButtonActionListener(this,"RecargarInformacionGrupoColor"));
					
		this.jButtonRecargarInformacionToolBarGrupoColor.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarGrupoColor"));
		
		this.jMenuItemRecargarInformacionGrupoColor.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionGrupoColor"));		
		
		
		
		this.jButtonAnterioresGrupoColor.addActionListener (new ButtonActionListener(this,"AnterioresGrupoColor"));
		
		
		this.jButtonAnterioresToolBarGrupoColor.addActionListener (new ButtonActionListener(this,"AnterioresToolBarGrupoColor"));
		
		this.jMenuItemAnterioresGrupoColor.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresGrupoColor"));		
		
		
		this.jButtonSiguientesGrupoColor.addActionListener (new ButtonActionListener(this,"SiguientesGrupoColor"));
		
		
		this.jButtonSiguientesToolBarGrupoColor.addActionListener (new ButtonActionListener(this,"SiguientesToolBarGrupoColor"));
			
		this.jMenuItemSiguientesGrupoColor.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesGrupoColor"));
			
		this.jMenuItemAbrirOrderByGrupoColor.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByGrupoColor"));
			
		this.jMenuItemMostrarOcultarGrupoColor.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarGrupoColor"));
			
		this.jMenuItemDetalleAbrirOrderByGrupoColor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByGrupoColor"));
			
		this.jMenuItemDetalleMostarOcultarGrupoColor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarGrupoColor"));		
		
		
		this.jButtonNuevoGuardarCambiosGrupoColor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosGrupoColor"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarGrupoColor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarGrupoColor"));
			
		this.jMenuItemNuevoGuardarCambiosGrupoColor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosGrupoColor"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosGrupoColor.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosGrupoColor"));

		this.jCheckBoxSeleccionadosGrupoColor.addItemListener(new CheckBoxItemListener(this,"SeleccionadosGrupoColor"));
		
		if(this.jInternalFrameDetalleFormGrupoColor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoColor.jComboBoxTiposAccionesFormularioGrupoColor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioGrupoColor"));
		}
		
		
		this.jComboBoxTiposRelacionesGrupoColor.addActionListener (new ButtonActionListener(this,"TiposRelacionesGrupoColor"));
			
		this.jComboBoxTiposAccionesGrupoColor.addActionListener (new ButtonActionListener(this,"TiposAccionesGrupoColor"));
					
		this.jComboBoxTiposSeleccionarGrupoColor.addActionListener (new ButtonActionListener(this,"TiposSeleccionarGrupoColor"));
			
		this.jTextFieldValorCampoGeneralGrupoColor.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralGrupoColor"));		
		
		
		if(this.jInternalFrameDetalleFormGrupoColor!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoColor.jButtonidGrupoColorBusqueda.addActionListener(new ButtonActionListener(this,"idGrupoColorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoColor.jButtonid_empresaGrupoColorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGrupoColorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoColor.jButtonid_empresaGrupoColorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGrupoColorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoColor.jButtonid_sucursalGrupoColorUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalGrupoColorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoColor.jButtonid_sucursalGrupoColorBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalGrupoColorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoColor.jButtoncodigoGrupoColorBusqueda.addActionListener(new ButtonActionListener(this,"codigoGrupoColorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoColor.jButtonnombreGrupoColorBusqueda.addActionListener(new ButtonActionListener(this,"nombreGrupoColorBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoGrupoColor.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoGrupoColor"));

			this.jButtonBusquedaPorNombreGrupoColor.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreGrupoColor"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoGrupoColor!=null) {
				this.jInternalFrameReporteDinamicoGrupoColor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGrupoColor"));
				this.jInternalFrameReporteDinamicoGrupoColor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGrupoColor"));
				this.jInternalFrameReporteDinamicoGrupoColor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGrupoColor"));
			}
			
			//this.jButtonCerrarReporteDinamicoGrupoColor.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGrupoColor"));				
			//this.jButtonGenerarReporteDinamicoGrupoColor.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGrupoColor"));
			//this.jButtonGenerarExcelReporteDinamicoGrupoColor.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGrupoColor"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionGrupoColor!=null) {
				this.jInternalFrameImportacionGrupoColor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionGrupoColor"));
				this.jInternalFrameImportacionGrupoColor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionGrupoColor"));
				this.jInternalFrameImportacionGrupoColor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionGrupoColor"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByGrupoColor.addActionListener (new ButtonActionListener(this,"AbrirOrderByGrupoColor"));
			
			this.jButtonAbrirOrderByToolBarGrupoColor.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarGrupoColor"));			
			
			if(this.jInternalFrameOrderByGrupoColor!=null) {
				this.jInternalFrameOrderByGrupoColor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByGrupoColor"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormGrupoColor!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormGrupoColor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoColor.jTabbedPaneRelacionesGrupoColor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesGrupoColor"));
		
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
            		closingInternalFrameGrupoColor();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormGrupoColor.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormGrupoColor = (JInternalFrameBase)event.getSource();
	            	
	            GrupoColorBeanSwingJInternalFrame jInternalFrameParent=(GrupoColorBeanSwingJInternalFrame)jInternalFrameDetalleFormGrupoColor.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarGrupoColorActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosGrupoColor.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosGrupoColorListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosGrupoColor.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosGrupoColor.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoColorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoColorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoColorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoGrupoColor";
		inputMap = this.jButtonNuevoGrupoColor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoGrupoColor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoGrupoColorActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoColorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoColorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoColorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesGrupoColor";
		inputMap = this.jButtonNuevoRelacionesGrupoColor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesGrupoColor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoGrupoColorActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarGrupoColor";
		inputMap = this.jButtonModificarGrupoColor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarGrupoColor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarGrupoColorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarGrupoColor";
		inputMap = this.jButtonActualizarGrupoColor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarGrupoColor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarGrupoColorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarGrupoColor";
		inputMap = this.jButtonEliminarGrupoColor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarGrupoColor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarGrupoColorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarGrupoColor";
		inputMap = this.jButtonCancelarGrupoColor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarGrupoColor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarGrupoColorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarGrupoColor";
		inputMap = this.jButtonCerrarGrupoColor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarGrupoColor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarGrupoColorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormGrupoColor.jButtonGuardarCambiosGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosGrupoColor";
		inputMap = this.jInternalFrameDetalleFormGrupoColor.jButtonGuardarCambiosGrupoColor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormGrupoColor.jButtonGuardarCambiosGrupoColor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosGrupoColorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosGrupoColor.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosGrupoColorItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesGrupoColor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesGrupoColorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarGrupoColor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarGrupoColorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralGrupoColor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralGrupoColorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoColor.jButtonidGrupoColorBusqueda.addActionListener(new ButtonActionListener(this,"idGrupoColorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoColor.jButtonid_empresaGrupoColorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGrupoColorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoColor.jButtonid_empresaGrupoColorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGrupoColorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoColor.jButtonid_sucursalGrupoColorUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalGrupoColorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoColor.jButtonid_sucursalGrupoColorBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalGrupoColorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoColor.jButtoncodigoGrupoColorBusqueda.addActionListener(new ButtonActionListener(this,"codigoGrupoColorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoColor.jButtonnombreGrupoColorBusqueda.addActionListener(new ButtonActionListener(this,"nombreGrupoColorBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoGrupoColor.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoGrupoColor"));

		this.jButtonBusquedaPorNombreGrupoColor.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreGrupoColor"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionGrupoColor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionGrupoColorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarGrupoColorActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarGrupoColor.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosGrupoColor(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(GrupoColor grupocolorAux:this.grupocolorLogic.getGrupoColors()) {
					grupocolorAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GrupoColor grupocolorAux:grupocolors) {
					grupocolorAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosGrupoColorItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingGrupoColor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(GrupoColor grupocolorAux:this.grupocolorLogic.getGrupoColors()) {
						grupocolorAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GrupoColor grupocolorAux:grupocolors) {
						grupocolorAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(GrupoColor grupocolorAux:this.grupocolorLogic.getGrupoColors()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GrupoColor grupocolorAux:grupocolors) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaGrupoColor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosGrupoColor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosGrupoColor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosGrupoColor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosGrupoColorItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingGrupoColor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosGrupoColor.getSelectedRows();
			
			GrupoColor grupocolorLocal=new GrupoColor();
			
			//this.seleccionarTodosGrupoColor(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupocolorLocal =(GrupoColor) this.grupocolorLogic.getGrupoColors().toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					grupocolorLocal =(GrupoColor) this.grupocolors.toArray()[this.jTableDatosGrupoColor.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				grupocolorLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(GrupoColor grupocolorAux:this.grupocolorLogic.getGrupoColors()) {
						grupocolorAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GrupoColor grupocolorAux:grupocolors) {
						grupocolorAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaGrupoColor(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosGrupoColor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosGrupoColor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosGrupoColor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualGrupoColorItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarGrupoColorParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralGrupoColorActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingGrupoColor(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralGrupoColor.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(GrupoColor grupocolorAux:this.grupocolorLogic.getGrupoColors()) {
				
						if(sTipoSeleccionar.equals(GrupoColorConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							grupocolorAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GrupoColorConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							grupocolorAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GrupoColor grupocolorAux:grupocolors) {
					
						if(sTipoSeleccionar.equals(GrupoColorConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							grupocolorAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GrupoColorConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							grupocolorAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaGrupoColor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesGrupoColorActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingGrupoColor(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioGrupoColor=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesGrupoColor.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormGrupoColor.jComboBoxTiposAccionesFormularioGrupoColor.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteGrupoColor) {				
					conSplash=true;//false;										
					
					//this.startProcessGrupoColor(conSplash);
				
					this.generarReporteGrupoColorsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGrupoColor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGrupoColor.jComboBoxTiposAccionesFormularioGrupoColor.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoGrupoColorsSeleccionados();
				//this.jComboBoxTiposAccionesGrupoColor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoGrupoColorsSeleccionados(false);
				//this.jComboBoxTiposAccionesGrupoColor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoGrupoColorsSeleccionados(true);
				//this.jComboBoxTiposAccionesGrupoColor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessGrupoColor();
				
				this.exportarGrupoColorsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGrupoColor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGrupoColor.jComboBoxTiposAccionesFormularioGrupoColor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionGrupoColors();
				//this.importarGrupoColors();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGrupoColor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGrupoColor.jComboBoxTiposAccionesFormularioGrupoColor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessGrupoColor();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelGrupoColorsSeleccionados();
				//this.jComboBoxTiposAccionesGrupoColor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Grupo Color", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessGrupoColor();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoGrupoColor)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyGrupoColor(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Grupo Color",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGrupoColor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGrupoColor.jComboBoxTiposAccionesFormularioGrupoColor.setSelectedIndex(0);					
				}	
			} 			
			else if(GrupoColorBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteGrupoColor) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessGrupoColor(conSplash);
					
						//this.actualizarParametrosGeneralGrupoColor();
						
						this.generarReporteProcesoAccionGrupoColorsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesGrupoColor.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormGrupoColor.jComboBoxTiposAccionesFormularioGrupoColor.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(GrupoColorBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Grupo ColorES SELECCIONADOS?", "MANTENIMIENTO DE Grupo Color", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessGrupoColor();
				
						this.actualizarParametrosGeneralGrupoColor();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.grupocolorReturnGeneral=grupocolorLogic.procesarAccionGrupoColorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.grupocolorLogic.getGrupoColors(),this.grupocolorParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarGrupoColorReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesGrupoColor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormGrupoColor.jComboBoxTiposAccionesFormularioGrupoColor.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralGrupoColor();
					
					GrupoColorBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarGrupoColorReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesGrupoColor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormGrupoColor.jComboBoxTiposAccionesFormularioGrupoColor.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessGrupoColor(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesGrupoColorActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessGrupoColor();
			
			if(this.jInternalFrameDetalleFormGrupoColor==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<GrupoColor> grupocolorsSeleccionados=new ArrayList<GrupoColor>();		
			GrupoColor grupocolor=new GrupoColor();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingGrupoColor(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesGrupoColor.getSelectedItem();
			
			
			
			
			grupocolorsSeleccionados=this.getGrupoColorsSeleccionados(true);
			//this.sTipoAccion;
			
			if(grupocolorsSeleccionados.size()==1) {
				for(GrupoColor grupocolorAux:grupocolorsSeleccionados) {
					grupocolor=grupocolorAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Color Producto")) {
					jButtonColorProductoActionPerformed(null,rowIndex,true,false,grupocolor);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessGrupoColor();
			
      		//this.finishProcessGrupoColor(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarGrupoColorReturnGeneral() throws Exception {
		if(this.grupocolorReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.grupocolorReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.grupocolorReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.grupocolorReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.grupocolorReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.grupocolorReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingGrupoColor(false);
		}
		
		if(this.grupocolorReturnGeneral.getConRetornoLista() || this.grupocolorReturnGeneral.getConRetornoObjeto()) {
			if(this.grupocolorReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.grupocolorLogic.setGrupoColors(this.grupocolorReturnGeneral.getGrupoColors());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.grupocolorReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.grupocolorLogic.setGrupoColor(this.grupocolorReturnGeneral.getGrupoColor());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingGrupoColor(false);
		}
	}
	
	public void actualizarParametrosGeneralGrupoColor() throws Exception {
		
		
	}
	
	public ArrayList<GrupoColor> getGrupoColorsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<GrupoColor> grupocolorsSeleccionados=new ArrayList<GrupoColor>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioGrupoColor) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(GrupoColor grupocolorAux:grupocolorLogic.getGrupoColors()) {
					if(grupocolorAux.getIsSelected()) {
						grupocolorsSeleccionados.add(grupocolorAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GrupoColor grupocolorAux:this.grupocolors) {
					if(grupocolorAux.getIsSelected()) {
						grupocolorsSeleccionados.add(grupocolorAux);				
					}
				}
			}
			
			if(grupocolorsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						grupocolorsSeleccionados.addAll(this.grupocolorLogic.getGrupoColors());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						grupocolorsSeleccionados.addAll(this.grupocolors);				
					}
				}
			}
		} else {
			grupocolorsSeleccionados.add(this.grupocolor);
		}
		
		return grupocolorsSeleccionados;
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
	
	public void generarReporteGrupoColorsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalGrupoColorsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoGrupoColorsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoGrupoColorsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoGrupoColorsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesGrupoColorsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Grupo Color",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesGrupoColorsSeleccionados() throws Exception {
		ArrayList<GrupoColor> grupocolorsSeleccionados=new ArrayList<GrupoColor>();		
		
		grupocolorsSeleccionados=this.getGrupoColorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteGrupoColors("Todos",grupocolorsSeleccionados);
		
	}	
	
	public void generarReporteNormalGrupoColorsSeleccionados() throws Exception {
		ArrayList<GrupoColor> grupocolorsSeleccionados=new ArrayList<GrupoColor>();		
		
		grupocolorsSeleccionados=this.getGrupoColorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteGrupoColors("Todos",grupocolorsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionGrupoColorsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<GrupoColor> grupocolorsSeleccionados=new ArrayList<GrupoColor>();
		
		grupocolorsSeleccionados=this.getGrupoColorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteGrupoColors("Todos",grupocolorsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoGrupoColorsSeleccionados() throws Exception {
		ArrayList<GrupoColor> grupocolorsSeleccionados=new ArrayList<GrupoColor>();		
		
		
		this.abrirInicializarFrameReporteDinamicoGrupoColor();
		
		
		grupocolorsSeleccionados=this.getGrupoColorsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoGrupoColor();
		
		
		//this.generarReporteGrupoColors("Todos",grupocolorsSeleccionados ,grupocolorImplementable,grupocolorImplementableHome);
	}
	
	public void mostrarImportacionGrupoColors() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionGrupoColor();
		
		this.abrirFrameImportacionGrupoColor();		
		
			
		//this.generarReporteGrupoColors("Todos",grupocolorsSeleccionados ,grupocolorImplementable,grupocolorImplementableHome);
	}
	
	public void importarGrupoColors() throws Exception {		
	
	}
	
	public void exportarGrupoColorsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelGrupoColorsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoGrupoColorsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlGrupoColorsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Grupo Color",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoGrupoColorsSeleccionados() throws Exception {
		ArrayList<GrupoColor> grupocolorsSeleccionados=new ArrayList<GrupoColor>();		
		
		grupocolorsSeleccionados=this.getGrupoColorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupocolor."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarGrupoColor(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(GrupoColor grupocolorAux:grupocolorsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarGrupoColor(grupocolorAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//grupocolorAux.setsDetalleGeneralEntityReporte(grupocolorAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupocolorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Color",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarGrupoColor(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=GrupoColorConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoColorConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoColorConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoColorConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoColorConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoColorConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarGrupoColor(GrupoColor grupocolor,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=grupocolor.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=grupocolor.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=grupocolor.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=grupocolor.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=grupocolor.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=grupocolor.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelGrupoColorsSeleccionados() throws Exception {
		ArrayList<GrupoColor> grupocolorsSeleccionados=new ArrayList<GrupoColor>();		
		
		grupocolorsSeleccionados=this.getGrupoColorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupocolor.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("GrupoColors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelGrupoColor(row);				
				iRow++;
			}				
			
			for(GrupoColor grupocolorAux:grupocolorsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelGrupoColor(grupocolorAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupocolorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Color",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlGrupoColorsSeleccionados() throws Exception {
		ArrayList<GrupoColor> grupocolorsSeleccionados=new ArrayList<GrupoColor>();		
		
		grupocolorsSeleccionados=this.getGrupoColorsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupocolor.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("grupocolors");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("grupocolor");
			//elementRoot.appendChild(element);
		
			for(GrupoColor grupocolorAux:grupocolorsSeleccionados) {
				element = document.createElement("grupocolor");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlGrupoColor(grupocolorAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupocolorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Color",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelGrupoColor(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoColorConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoColorConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(GrupoColorConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoColorConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoColorConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoColorConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelGrupoColor(GrupoColor grupocolor,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(grupocolor.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(grupocolor.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(grupocolor.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(grupocolor.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(grupocolor.getnombre());				
	}
	
	public void setFilaDatosExportarXmlGrupoColor(GrupoColor grupocolor,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(GrupoColorConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(grupocolor.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(GrupoColorConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(grupocolor.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(GrupoColorConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(grupocolor.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(GrupoColorConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(grupocolor.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcodigo = document.createElement(GrupoColorConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(grupocolor.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(GrupoColorConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(grupocolor.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoGrupoColorsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<GrupoColor> grupocolorsSeleccionados=new ArrayList<GrupoColor>();
		
		grupocolorsSeleccionados=this.getGrupoColorsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoGrupoColor(grupocolorsSeleccionados);
		
		this.generarReporteGrupoColors("Todos",grupocolorsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoGrupoColor(ArrayList<GrupoColor> grupocolorsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(GrupoColor grupocolorAux:grupocolorsSeleccionados) {
				grupocolorAux.setsDetalleGeneralEntityReporte(grupocolorAux.toString());
			
				if(sTipoSeleccionar.equals(GrupoColorConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					grupocolorAux.setsDescripcionGeneralEntityReporte1(grupocolorAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GrupoColorConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					grupocolorAux.setsDescripcionGeneralEntityReporte1(grupocolorAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GrupoColorConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					grupocolorAux.setsDescripcionGeneralEntityReporte1(grupocolorAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(GrupoColorConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					grupocolorAux.setsDescripcionGeneralEntityReporte1(grupocolorAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoColorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesGrupoColor(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoGrupoColor=true;
				this.isVisibilidadCeldaNuevoRelacionesGrupoColor=true;
				this.isVisibilidadCeldaGuardarCambiosGrupoColor=true;
			}
			
			this.isVisibilidadCeldaModificarGrupoColor=false;
			this.isVisibilidadCeldaActualizarGrupoColor=false;
			this.isVisibilidadCeldaEliminarGrupoColor=false;
			this.isVisibilidadCeldaCancelarGrupoColor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoColor=true;
				} else {
					this.isVisibilidadCeldaGuardarGrupoColor=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoGrupoColor=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoColor=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoColor=false;
			this.isVisibilidadCeldaModificarGrupoColor=false;
			this.isVisibilidadCeldaActualizarGrupoColor=true;
			this.isVisibilidadCeldaEliminarGrupoColor=false;
			this.isVisibilidadCeldaCancelarGrupoColor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoColor=true;
				} else {
					this.isVisibilidadCeldaGuardarGrupoColor=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoGrupoColor=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoColor=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoColor=false;
			this.isVisibilidadCeldaModificarGrupoColor=false;
			this.isVisibilidadCeldaActualizarGrupoColor=true;
			this.isVisibilidadCeldaEliminarGrupoColor=true;
			this.isVisibilidadCeldaCancelarGrupoColor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoColor=true;
				} else {
					this.isVisibilidadCeldaGuardarGrupoColor=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoGrupoColor=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoColor=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoColor=false;
			this.isVisibilidadCeldaModificarGrupoColor=false;
			this.isVisibilidadCeldaActualizarGrupoColor=true;
			this.isVisibilidadCeldaEliminarGrupoColor=false;
			this.isVisibilidadCeldaCancelarGrupoColor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoColor=false;
				} else {
					this.isVisibilidadCeldaGuardarGrupoColor=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoGrupoColor=true;
			this.isVisibilidadCeldaNuevoRelacionesGrupoColor=true;
			this.isVisibilidadCeldaGuardarCambiosGrupoColor=true;
			this.isVisibilidadCeldaModificarGrupoColor=false;
			this.isVisibilidadCeldaActualizarGrupoColor=false;
			this.isVisibilidadCeldaEliminarGrupoColor=false;
			this.isVisibilidadCeldaCancelarGrupoColor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoColor=true;
				} else {
					this.isVisibilidadCeldaGuardarGrupoColor=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoGrupoColor=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoColor=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoColor=false;
			this.isVisibilidadCeldaActualizarGrupoColor=false;
			this.isVisibilidadCeldaEliminarGrupoColor=false;
			this.isVisibilidadCeldaCancelarGrupoColor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoColor=false;
				} else {
					this.isVisibilidadCeldaGuardarGrupoColor=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoGrupoColor=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoColor=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoColor=false;
			this.isVisibilidadCeldaModificarGrupoColor=true;
			this.isVisibilidadCeldaActualizarGrupoColor=false;
			this.isVisibilidadCeldaEliminarGrupoColor=false;
			this.isVisibilidadCeldaCancelarGrupoColor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoColor=false;
				} else {
					this.isVisibilidadCeldaGuardarGrupoColor=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(GrupoColorJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoGrupoColor=true;
			this.isVisibilidadCeldaNuevoRelacionesGrupoColor=true;
			this.isVisibilidadCeldaGuardarCambiosGrupoColor=true;
		} else {
			this.actualizarEstadoPanelsGrupoColor(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarGrupoColor=false;
			//this.isVisibilidadCeldaVerFormGrupoColor=false;
			this.isVisibilidadCeldaDuplicarGrupoColor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!grupocolorSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesGrupoColor=false;
		} else {
			this.isVisibilidadCeldaNuevoGrupoColor=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoColor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(grupocolorSessionBean.getEsGuardarRelacionado()) {
			if(!grupocolorSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesGrupoColor=false;												
			}
			
			this.jButtonCerrarGrupoColor.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesGrupoColor=false;
		}
		
		if(!this.permiteMantenimiento(this.grupocolor)) {
			this.isVisibilidadCeldaActualizarGrupoColor=false;
			this.isVisibilidadCeldaEliminarGrupoColor=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesGrupoColor() {
		this.isVisibilidadCeldaNuevoGrupoColor=false;
		this.isVisibilidadCeldaGuardarCambiosGrupoColor=false;
	}
	
	public void actualizarEstadoPanelsGrupoColor(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionGrupoColor!=null) {
				this.jScrollPanelDatosEdicionGrupoColor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoColor!=null) {
				this.jTabbedPaneBusquedasGrupoColor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGrupoColor!=null) {
				this.jScrollPanelDatosGrupoColor.setVisible(true);
			}
			
			if(this.jPanelPaginacionGrupoColor!=null) {
				this.jPanelPaginacionGrupoColor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGrupoColor!=null) {
				this.jPanelParametrosReportesGrupoColor.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionGrupoColor!=null) {
				this.jScrollPanelDatosEdicionGrupoColor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoColor!=null) {
				this.jTabbedPaneBusquedasGrupoColor.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosGrupoColor!=null) {
				this.jScrollPanelDatosGrupoColor.setVisible(false);
			}
			
			if(this.jPanelPaginacionGrupoColor!=null) {
				this.jPanelPaginacionGrupoColor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGrupoColor!=null) {
				this.jPanelParametrosReportesGrupoColor.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionGrupoColor!=null) {
				this.jScrollPanelDatosEdicionGrupoColor.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoColor!=null) {
				this.jTabbedPaneBusquedasGrupoColor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosGrupoColor!=null) {
				this.jScrollPanelDatosGrupoColor.setVisible(false);
			}
			
			if(this.jPanelPaginacionGrupoColor!=null) {
				this.jPanelPaginacionGrupoColor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGrupoColor!=null) {
				this.jPanelParametrosReportesGrupoColor.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionGrupoColor!=null) {
				this.jScrollPanelDatosEdicionGrupoColor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoColor!=null) {
				this.jTabbedPaneBusquedasGrupoColor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosGrupoColor!=null) {
				this.jScrollPanelDatosGrupoColor.setVisible(false);
			}
			
			if(this.jPanelPaginacionGrupoColor!=null) {
				this.jPanelPaginacionGrupoColor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGrupoColor!=null) {
				this.jPanelParametrosReportesGrupoColor.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionGrupoColor!=null) {
				this.jScrollPanelDatosEdicionGrupoColor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoColor!=null) {
				this.jTabbedPaneBusquedasGrupoColor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGrupoColor!=null) {
				this.jScrollPanelDatosGrupoColor.setVisible(true);
			}
			
			if(this.jPanelPaginacionGrupoColor!=null) {
				this.jPanelPaginacionGrupoColor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGrupoColor!=null) {
				this.jPanelParametrosReportesGrupoColor.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionGrupoColor!=null) {
				this.jScrollPanelDatosEdicionGrupoColor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoColor!=null) {
				this.jTabbedPaneBusquedasGrupoColor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGrupoColor!=null) {
				this.jScrollPanelDatosGrupoColor.setVisible(true);
			}
			
			if(this.jPanelPaginacionGrupoColor!=null) {
				this.jPanelPaginacionGrupoColor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGrupoColor!=null) {
				this.jPanelParametrosReportesGrupoColor.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionGrupoColor!=null) {
				this.jScrollPanelDatosEdicionGrupoColor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoColor!=null) {
				this.jTabbedPaneBusquedasGrupoColor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGrupoColor!=null) {
				this.jScrollPanelDatosGrupoColor.setVisible(true);
			}
			
			if(this.jPanelPaginacionGrupoColor!=null) {
				this.jPanelPaginacionGrupoColor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGrupoColor!=null) {
				this.jPanelParametrosReportesGrupoColor.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.grupocolorSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasGrupoColor!=null) {
					this.jTabbedPaneBusquedasGrupoColor.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesGrupoColor!=null) {
				this.jPanelParametrosReportesGrupoColor.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.grupocolorSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoColor!=null) {
				this.jTabbedPaneBusquedasGrupoColor.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesGrupoColor!=null) {
				this.jPanelParametrosReportesGrupoColor.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasGrupoColor.remove(jPanelBusquedaPorCodigoGrupoColor);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasGrupoColor.remove(jPanelBusquedaPorNombreGrupoColor);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaPorCodigo=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasGrupoColor.remove(jPanelBusquedaPorCodigoGrupoColor);}

			this.isVisibilidadBusquedaPorNombre=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasGrupoColor.remove(jPanelBusquedaPorNombreGrupoColor);}
		}
		
	}
	
	

	public String registrarSesionGrupoColorParaColorProductoes() throws Exception {
		Boolean isPaginaPopupColorProducto=false;

		try {

			if(this.grupocolorSessionBean==null) {
				this.grupocolorSessionBean=new GrupoColorSessionBean();
			}

			if(this.jInternalFrameDetalleFormGrupoColor.colorproductoSessionBean==null) {
				this.jInternalFrameDetalleFormGrupoColor.colorproductoSessionBean=new ColorProductoSessionBean();
			}

			this.jInternalFrameDetalleFormGrupoColor.colorproductoSessionBean.setsPathNavegacionActual(grupocolorSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ColorProductoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormGrupoColor.colorproductoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupColorProducto=this.jInternalFrameDetalleFormGrupoColor.colorproductoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormGrupoColor.colorproductoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeColorProducto(true);
			this.jInternalFrameDetalleFormGrupoColor.colorproductoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeColorProducto(GrupoColorConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormGrupoColor.colorproductoSessionBean.setisBusquedaDesdeForeignKeySesionGrupoColor(true);
			this.jInternalFrameDetalleFormGrupoColor.colorproductoSessionBean.setlidGrupoColorActual(this.idGrupoColorActual);

			grupocolorSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyGrupoColor(true);
			grupocolorSessionBean.setlIdGrupoColorActualForeignKey(this.idGrupoColorActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//GrupoColorSessionBean grupocolorSessionBean=new GrupoColorSessionBean();
		
		if(this.grupocolorSessionBean==null) {
			this.grupocolorSessionBean=new GrupoColorSessionBean();
		}
		
		this.grupocolorSessionBean.setsUltimaBusquedaGrupoColor(this.getsAccionBusqueda());
		this.grupocolorSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.grupocolorSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			grupocolorSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			grupocolorSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			grupocolorSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			grupocolorSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//GrupoColorSessionBean grupocolorSessionBean=new GrupoColorSessionBean();
		
		if(this.grupocolorSessionBean==null) {
			this.grupocolorSessionBean=new GrupoColorSessionBean();
		}
		
		if(this.grupocolorSessionBean.getsUltimaBusquedaGrupoColor()!=null&&!this.grupocolorSessionBean.getsUltimaBusquedaGrupoColor().equals("")) {
			this.setsAccionBusqueda(grupocolorSessionBean.getsUltimaBusquedaGrupoColor());
			this.setiNumeroPaginacion(grupocolorSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(grupocolorSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(grupocolorSessionBean.getcodigo());
				grupocolorSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(grupocolorSessionBean.getnombre());
				grupocolorSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(grupocolorSessionBean.getid_empresa());
				grupocolorSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(grupocolorSessionBean.getid_sucursal());
				grupocolorSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.grupocolorSessionBean.setsUltimaBusquedaGrupoColor("");
		this.grupocolorSessionBean.setiNumeroPaginacion(GrupoColorConstantesFunciones.INUMEROPAGINACION);
		this.grupocolorSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaGrupoColor(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioGrupoColor() {
		this.updateBorderResaltarBusquedasFormularioGrupoColor();
		this.updateVisibilidadBusquedasFormularioGrupoColor();
		this.updateHabilitarBusquedasFormularioGrupoColor();
	}
	
	public void updateBorderResaltarBusquedasFormularioGrupoColor() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasGrupoColor.getComponents().length>0) {
	

		if(this.grupocolorConstantesFunciones.resaltarBusquedaPorCodigoGrupoColor!=null) {
			index= this.jTabbedPaneBusquedasGrupoColor.indexOfComponent(this.jPanelBusquedaPorCodigoGrupoColor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoColor.getComponent(index);
				jPanel.setBorder(this.grupocolorConstantesFunciones.resaltarBusquedaPorCodigoGrupoColor);
			}
		}

		if(this.grupocolorConstantesFunciones.resaltarBusquedaPorNombreGrupoColor!=null) {
			index= this.jTabbedPaneBusquedasGrupoColor.indexOfComponent(this.jPanelBusquedaPorNombreGrupoColor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoColor.getComponent(index);
				jPanel.setBorder(this.grupocolorConstantesFunciones.resaltarBusquedaPorNombreGrupoColor);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioGrupoColor() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasGrupoColor.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasGrupoColor.indexOfComponent(this.jPanelBusquedaPorCodigoGrupoColor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoColor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.grupocolorConstantesFunciones.mostrarBusquedaPorCodigoGrupoColor);
			if(!this.grupocolorConstantesFunciones.mostrarBusquedaPorCodigoGrupoColor && index>-1) {
				this.jTabbedPaneBusquedasGrupoColor.remove(index);
			}

			index= this.jTabbedPaneBusquedasGrupoColor.indexOfComponent(this.jPanelBusquedaPorNombreGrupoColor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoColor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.grupocolorConstantesFunciones.mostrarBusquedaPorNombreGrupoColor);
			if(!this.grupocolorConstantesFunciones.mostrarBusquedaPorNombreGrupoColor && index>-1) {
				this.jTabbedPaneBusquedasGrupoColor.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioGrupoColor() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasGrupoColor.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasGrupoColor.indexOfComponent(this.jPanelBusquedaPorCodigoGrupoColor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoColor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.grupocolorConstantesFunciones.activarBusquedaPorCodigoGrupoColor);
				this.jTabbedPaneBusquedasGrupoColor.setEnabledAt(index,this.grupocolorConstantesFunciones.activarBusquedaPorCodigoGrupoColor);
			}

			index= this.jTabbedPaneBusquedasGrupoColor.indexOfComponent(this.jPanelBusquedaPorNombreGrupoColor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoColor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.grupocolorConstantesFunciones.activarBusquedaPorNombreGrupoColor);
				this.jTabbedPaneBusquedasGrupoColor.setEnabledAt(index,this.grupocolorConstantesFunciones.activarBusquedaPorNombreGrupoColor);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaGrupoColor(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasGrupoColor.indexOfComponent(this.jPanelBusquedaPorCodigoGrupoColor);

			this.jTabbedPaneBusquedasGrupoColor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoColor.getComponent(index);

			this.grupocolorConstantesFunciones.setResaltarBusquedaPorCodigoGrupoColor(resaltar);

			jPanel.setBorder(this.grupocolorConstantesFunciones.resaltarBusquedaPorCodigoGrupoColor);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasGrupoColor.indexOfComponent(this.jPanelBusquedaPorNombreGrupoColor);

			this.jTabbedPaneBusquedasGrupoColor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoColor.getComponent(index);

			this.grupocolorConstantesFunciones.setResaltarBusquedaPorNombreGrupoColor(resaltar);

			jPanel.setBorder(this.grupocolorConstantesFunciones.resaltarBusquedaPorNombreGrupoColor);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarGrupoColor.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioGrupoColor() throws Exception {

		if(this.jInternalFrameDetalleFormGrupoColor==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioGrupoColor();
		this.updateVisibilidadResaltarControlesFormularioGrupoColor();
		this.updateHabilitarResaltarControlesFormularioGrupoColor();
		
	}
	
	public void updateBorderResaltarControlesFormularioGrupoColor() throws Exception {
		if(this.jInternalFrameDetalleFormGrupoColor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.grupocolorConstantesFunciones.resaltaridGrupoColor!=null && this.jInternalFrameDetalleFormGrupoColor!=null) {this.jInternalFrameDetalleFormGrupoColor.jLabelidGrupoColor.setBorder(this.grupocolorConstantesFunciones.resaltaridGrupoColor);}
		if(this.grupocolorConstantesFunciones.resaltarid_empresaGrupoColor!=null && this.jInternalFrameDetalleFormGrupoColor!=null) {this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_empresaGrupoColor.setBorder(this.grupocolorConstantesFunciones.resaltarid_empresaGrupoColor);}
		if(this.grupocolorConstantesFunciones.resaltarid_sucursalGrupoColor!=null && this.jInternalFrameDetalleFormGrupoColor!=null) {this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_sucursalGrupoColor.setBorder(this.grupocolorConstantesFunciones.resaltarid_sucursalGrupoColor);}
		if(this.grupocolorConstantesFunciones.resaltarcodigoGrupoColor!=null && this.jInternalFrameDetalleFormGrupoColor!=null) {this.jInternalFrameDetalleFormGrupoColor.jTextFieldcodigoGrupoColor.setBorder(this.grupocolorConstantesFunciones.resaltarcodigoGrupoColor);}
		if(this.grupocolorConstantesFunciones.resaltarnombreGrupoColor!=null && this.jInternalFrameDetalleFormGrupoColor!=null) {this.jInternalFrameDetalleFormGrupoColor.jTextAreanombreGrupoColor.setBorder(this.grupocolorConstantesFunciones.resaltarnombreGrupoColor);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioGrupoColor() throws Exception {		
		if(this.jInternalFrameDetalleFormGrupoColor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormGrupoColor!=null) {
	
		//this.jInternalFrameDetalleFormGrupoColor.jLabelidGrupoColor.setVisible(this.grupocolorConstantesFunciones.mostraridGrupoColor);
		this.jInternalFrameDetalleFormGrupoColor.jPanelidGrupoColor.setVisible(this.grupocolorConstantesFunciones.mostraridGrupoColor);
		//this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_empresaGrupoColor.setVisible(this.grupocolorConstantesFunciones.mostrarid_empresaGrupoColor);
		this.jInternalFrameDetalleFormGrupoColor.jPanelid_empresaGrupoColor.setVisible(this.grupocolorConstantesFunciones.mostrarid_empresaGrupoColor);
		//this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_sucursalGrupoColor.setVisible(this.grupocolorConstantesFunciones.mostrarid_sucursalGrupoColor);
		this.jInternalFrameDetalleFormGrupoColor.jPanelid_sucursalGrupoColor.setVisible(this.grupocolorConstantesFunciones.mostrarid_sucursalGrupoColor);
		//this.jInternalFrameDetalleFormGrupoColor.jTextFieldcodigoGrupoColor.setVisible(this.grupocolorConstantesFunciones.mostrarcodigoGrupoColor);
		this.jInternalFrameDetalleFormGrupoColor.jPanelcodigoGrupoColor.setVisible(this.grupocolorConstantesFunciones.mostrarcodigoGrupoColor);
		//this.jInternalFrameDetalleFormGrupoColor.jTextAreanombreGrupoColor.setVisible(this.grupocolorConstantesFunciones.mostrarnombreGrupoColor);
		this.jInternalFrameDetalleFormGrupoColor.jPanelnombreGrupoColor.setVisible(this.grupocolorConstantesFunciones.mostrarnombreGrupoColor);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioGrupoColor() throws Exception {
		if(this.jInternalFrameDetalleFormGrupoColor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormGrupoColor!=null) {
	
		this.jInternalFrameDetalleFormGrupoColor.jLabelidGrupoColor.setEnabled(this.grupocolorConstantesFunciones.activaridGrupoColor);
		this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_empresaGrupoColor.setEnabled(this.grupocolorConstantesFunciones.activarid_empresaGrupoColor);
		this.jInternalFrameDetalleFormGrupoColor.jComboBoxid_sucursalGrupoColor.setEnabled(this.grupocolorConstantesFunciones.activarid_sucursalGrupoColor);
		this.jInternalFrameDetalleFormGrupoColor.jTextFieldcodigoGrupoColor.setEnabled(this.grupocolorConstantesFunciones.activarcodigoGrupoColor);
		this.jInternalFrameDetalleFormGrupoColor.jTextAreanombreGrupoColor.setEnabled(this.grupocolorConstantesFunciones.activarnombreGrupoColor);
		}
	}
	
		
}