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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar;


import java.sql.Time;


import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

//import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.cartera.util.ClienteConstantesFunciones;
import com.bydan.erp.cartera.util.ClienteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.ClienteParameterGeneral;

import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.ClienteBeanSwingJInternalFrame;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.produccion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;






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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.ClienteJInternalFrame;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.ClienteDetalleFormJInternalFrame;

import java.util.EventObject;
import java.util.EventListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
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



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.produccion.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class ClienteModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ClienteConstantesFunciones.LABEL_ID
										,ClienteConstantesFunciones.LABEL_IDEMPRESA
										,ClienteConstantesFunciones.LABEL_IDSUCURSAL
										,ClienteConstantesFunciones.LABEL_CODIGO
										,ClienteConstantesFunciones.LABEL_IDTIPOIDENTIFICACION
										,ClienteConstantesFunciones.LABEL_IDENTIFICACION
										,ClienteConstantesFunciones.LABEL_RUC
										,ClienteConstantesFunciones.LABEL_NOMBRE
										,ClienteConstantesFunciones.LABEL_APELLIDO
										,ClienteConstantesFunciones.LABEL_NOMBRECOMPLETO
										,ClienteConstantesFunciones.LABEL_NOMBRECOMERCIAL
										,ClienteConstantesFunciones.LABEL_TELEFONO
										,ClienteConstantesFunciones.LABEL_DIRECCION
										,ClienteConstantesFunciones.LABEL_ESPROVE
										,ClienteConstantesFunciones.LABEL_IDGRUPOCLIENTE
										,ClienteConstantesFunciones.LABEL_IDTITULOCLIENTE
										,ClienteConstantesFunciones.LABEL_IDAREACR
										,ClienteConstantesFunciones.LABEL_IDESTADOCLIENTE
										,ClienteConstantesFunciones.LABEL_OBSERVACION
										,ClienteConstantesFunciones.LABEL_IDPAIS
										,ClienteConstantesFunciones.LABEL_IDREGION
										,ClienteConstantesFunciones.LABEL_IDPROVINCIA
										,ClienteConstantesFunciones.LABEL_IDCIUDAD
										,ClienteConstantesFunciones.LABEL_IDZONA
										,ClienteConstantesFunciones.LABEL_IDPAISNACIONALIDAD
										,ClienteConstantesFunciones.LABEL_IDTIPOCARGOLABO
										,ClienteConstantesFunciones.LABEL_IDTIPONIVELEDU
										,ClienteConstantesFunciones.LABEL_IDPROFESION
										,ClienteConstantesFunciones.LABEL_IDTIPOGENERO
										,ClienteConstantesFunciones.LABEL_IDESTADOCIVIL
										,ClienteConstantesFunciones.LABEL_IDESTADOLEGAL
										,ClienteConstantesFunciones.LABEL_FECHANACIMIENTO
										,ClienteConstantesFunciones.LABEL_PATHIMAGENFIRMA
										,ClienteConstantesFunciones.LABEL_CONTACTO
										,ClienteConstantesFunciones.LABEL_IDCUENTACONTABLE
										,ClienteConstantesFunciones.LABEL_IDRUTA
										,ClienteConstantesFunciones.LABEL_IDVENDEDOR
										,ClienteConstantesFunciones.LABEL_IDCENTROACTIVIDAD
										,ClienteConstantesFunciones.LABEL_REPRESENTANTE
										,ClienteConstantesFunciones.LABEL_IDTIPOGARANTIAEMPRESA
										,ClienteConstantesFunciones.LABEL_NOMBREGARANTIA
										,ClienteConstantesFunciones.LABEL_VALORGARANTIA
										,ClienteConstantesFunciones.LABEL_IDCATETIPOAFILIACION
										,ClienteConstantesFunciones.LABEL_NUMEROCARGA
										,ClienteConstantesFunciones.LABEL_CREDITOUSADO
										,ClienteConstantesFunciones.LABEL_LIMITECREDITO
										,ClienteConstantesFunciones.LABEL_CREDITODISPONIBLE
										,ClienteConstantesFunciones.LABEL_TOTALDOCUMENTOS
										,ClienteConstantesFunciones.LABEL_FECHAULTIMAFACTURA
										,ClienteConstantesFunciones.LABEL_DESCUENTO
										,ClienteConstantesFunciones.LABEL_IDDIA
										,ClienteConstantesFunciones.LABEL_HORAPAGO
										,ClienteConstantesFunciones.LABEL_IDEMPLEADO
										,ClienteConstantesFunciones.LABEL_COBRANZAS
										,ClienteConstantesFunciones.LABEL_MOTIVO
										,ClienteConstantesFunciones.LABEL_PREFERENCIA
										,ClienteConstantesFunciones.LABEL_CONSEPARACIONBIENES
										,ClienteConstantesFunciones.LABEL_IDTIPOPRECIO
										,ClienteConstantesFunciones.LABEL_IDTIPOLISTAPRECIO
										,ClienteConstantesFunciones.LABEL_DETALLEESTADO
										,ClienteConstantesFunciones.LABEL_ESCONTRIBUYENTEESPECIAL
										};
	   
	    public List<Cliente> clientes;
	  	 
	    //NO SE UTILIZA
	    public ClienteModel(List<Cliente> clientes,JInternalFrameBase jInternalFrameBase) {
	    	this.clientes=clientes;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ClienteModel(JInternalFrameBase jInternalFrameBase) {
	    	this.clientes=new ArrayList<Cliente>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.clientes.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.clientes.get(rowIndex).getIsSelected();
	            
				case 1: return this.clientes.get(rowIndex).getId();
				case 2: return this.clientes.get(rowIndex).getid_empresa();
				case 3: return this.clientes.get(rowIndex).getid_sucursal();
				case 4: return this.clientes.get(rowIndex).getcodigo();
				case 5: return this.clientes.get(rowIndex).getid_tipo_identificacion();
				case 6: return this.clientes.get(rowIndex).getidentificacion();
				case 7: return this.clientes.get(rowIndex).getruc();
				case 8: return this.clientes.get(rowIndex).getnombre();
				case 9: return this.clientes.get(rowIndex).getapellido();
				case 10: return this.clientes.get(rowIndex).getnombre_completo();
				case 11: return this.clientes.get(rowIndex).getnombre_comercial();
				case 12: return this.clientes.get(rowIndex).gettelefono();
				case 13: return this.clientes.get(rowIndex).getdireccion();
				case 14: return this.clientes.get(rowIndex).getes_prove();
				case 15: return this.clientes.get(rowIndex).getid_grupo_cliente();
				case 16: return this.clientes.get(rowIndex).getid_titulo_cliente();
				case 17: return this.clientes.get(rowIndex).getid_area_cr();
				case 18: return this.clientes.get(rowIndex).getid_estado_cliente();
				case 19: return this.clientes.get(rowIndex).getobservacion();
				case 20: return this.clientes.get(rowIndex).getid_pais();
				case 21: return this.clientes.get(rowIndex).getid_region();
				case 22: return this.clientes.get(rowIndex).getid_provincia();
				case 23: return this.clientes.get(rowIndex).getid_ciudad();
				case 24: return this.clientes.get(rowIndex).getid_zona();
				case 25: return this.clientes.get(rowIndex).getid_pais_nacionalidad();
				case 26: return this.clientes.get(rowIndex).getid_tipo_cargo_labo();
				case 27: return this.clientes.get(rowIndex).getid_tipo_nivel_edu();
				case 28: return this.clientes.get(rowIndex).getid_profesion();
				case 29: return this.clientes.get(rowIndex).getid_tipo_genero();
				case 30: return this.clientes.get(rowIndex).getid_estado_civil();
				case 31: return this.clientes.get(rowIndex).getid_estado_legal();
				case 32: return this.clientes.get(rowIndex).getfecha_nacimiento();
				case 33: return this.clientes.get(rowIndex).getpath_imagen_firma();
				case 34: return this.clientes.get(rowIndex).getcontacto();
				case 35: return this.clientes.get(rowIndex).getid_cuenta_contable();
				case 36: return this.clientes.get(rowIndex).getid_ruta();
				case 37: return this.clientes.get(rowIndex).getid_vendedor();
				case 38: return this.clientes.get(rowIndex).getid_centro_actividad();
				case 39: return this.clientes.get(rowIndex).getrepresentante();
				case 40: return this.clientes.get(rowIndex).getid_tipo_garantia_empresa();
				case 41: return this.clientes.get(rowIndex).getnombre_garantia();
				case 42: return this.clientes.get(rowIndex).getvalor_garantia();
				case 43: return this.clientes.get(rowIndex).getid_cate_tipo_afiliacion();
				case 44: return this.clientes.get(rowIndex).getnumero_carga();
				case 45: return this.clientes.get(rowIndex).getcredito_usado();
				case 46: return this.clientes.get(rowIndex).getlimite_credito();
				case 47: return this.clientes.get(rowIndex).getcredito_disponible();
				case 48: return this.clientes.get(rowIndex).gettotal_documentos();
				case 49: return this.clientes.get(rowIndex).getfecha_ultima_factura();
				case 50: return this.clientes.get(rowIndex).getdescuento();
				case 51: return this.clientes.get(rowIndex).getid_dia();
				case 52: return this.clientes.get(rowIndex).gethora_pago();
				case 53: return this.clientes.get(rowIndex).getid_empleado();
				case 54: return this.clientes.get(rowIndex).getcobranzas();
				case 55: return this.clientes.get(rowIndex).getmotivo();
				case 56: return this.clientes.get(rowIndex).getpreferencia();
				case 57: return this.clientes.get(rowIndex).getcon_separacion_bienes();
				case 58: return this.clientes.get(rowIndex).getid_tipo_precio();
				case 59: return this.clientes.get(rowIndex).getid_tipo_lista_precio();
				case 60: return this.clientes.get(rowIndex).getdetalle_estado();
				case 61: return this.clientes.get(rowIndex).getes_contribuyente_especial();	            
	            default: return null;
	        }
	    }
	 
	    @Override
	    public Class<?> getColumnClass(int columnIndex) {
	    	switch (columnIndex) {
				case 0: return Boolean.class;
	            
				case 1: return Long.class;
				case 2: return Long.class;
				case 3: return Long.class;
				case 4: return String.class;
				case 5: return Long.class;
				case 6: return String.class;
				case 7: return String.class;
				case 8: return String.class;
				case 9: return String.class;
				case 10: return String.class;
				case 11: return String.class;
				case 12: return String.class;
				case 13: return String.class;
				case 14: return Boolean.class;
				case 15: return Long.class;
				case 16: return Long.class;
				case 17: return Long.class;
				case 18: return Long.class;
				case 19: return String.class;
				case 20: return Long.class;
				case 21: return Long.class;
				case 22: return Long.class;
				case 23: return Long.class;
				case 24: return Long.class;
				case 25: return Long.class;
				case 26: return Long.class;
				case 27: return Long.class;
				case 28: return Long.class;
				case 29: return Long.class;
				case 30: return Long.class;
				case 31: return Long.class;
				case 32: return Date.class;
				case 33: return String.class;
				case 34: return String.class;
				case 35: return Long.class;
				case 36: return Long.class;
				case 37: return Long.class;
				case 38: return Long.class;
				case 39: return String.class;
				case 40: return Long.class;
				case 41: return String.class;
				case 42: return Double.class;
				case 43: return Long.class;
				case 44: return Integer.class;
				case 45: return Double.class;
				case 46: return Double.class;
				case 47: return Double.class;
				case 48: return Double.class;
				case 49: return Date.class;
				case 50: return Double.class;
				case 51: return Long.class;
				case 52: return Time.class;
				case 53: return Long.class;
				case 54: return String.class;
				case 55: return String.class;
				case 56: return String.class;
				case 57: return Boolean.class;
				case 58: return Long.class;
				case 59: return Long.class;
				case 60: return String.class;
				case 61: return Boolean.class;	            
	            default: return String.class;
	        }	    		        
	    }
	 
	    @Override
	    public boolean isCellEditable(int rowIndex, int columnIndex) {
	    	switch (columnIndex) {
				case 0: return true;
            	
				case 1: return true;
				case 2: return true;
				case 3: return true;
				case 4: return true;
				case 5: return true;
				case 6: return true;
				case 7: return true;
				case 8: return true;
				case 9: return true;
				case 10: return true;
				case 11: return true;
				case 12: return true;
				case 13: return true;
				case 14: return true;
				case 15: return true;
				case 16: return true;
				case 17: return true;
				case 18: return true;
				case 19: return true;
				case 20: return true;
				case 21: return true;
				case 22: return true;
				case 23: return true;
				case 24: return true;
				case 25: return true;
				case 26: return true;
				case 27: return true;
				case 28: return true;
				case 29: return true;
				case 30: return true;
				case 31: return true;
				case 32: return true;
				case 33: return true;
				case 34: return true;
				case 35: return true;
				case 36: return true;
				case 37: return true;
				case 38: return true;
				case 39: return true;
				case 40: return true;
				case 41: return true;
				case 42: return true;
				case 43: return true;
				case 44: return true;
				case 45: return true;
				case 46: return true;
				case 47: return true;
				case 48: return true;
				case 49: return true;
				case 50: return true;
				case 51: return true;
				case 52: return true;
				case 53: return true;
				case 54: return true;
				case 55: return true;
				case 56: return true;
				case 57: return true;
				case 58: return true;
				case 59: return true;
				case 60: return true;
				case 61: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	Cliente cliente = this.clientes.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=(ClienteBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {cliente.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {cliente.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {cliente.setid_empresa((Long) value);cliente.setempresa_descripcion(clienteBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {cliente.setid_sucursal((Long) value);cliente.setsucursal_descripcion(clienteBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {cliente.setcodigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {cliente.setid_tipo_identificacion((Long) value);cliente.settipoidentificacion_descripcion(clienteBeanSwingJInternalFrame.getActualTipoIdentificacionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {cliente.setidentificacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {cliente.setruc((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {cliente.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {cliente.setapellido((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {cliente.setnombre_completo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {cliente.setnombre_comercial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {cliente.settelefono((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {cliente.setdireccion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {cliente.setes_prove((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {cliente.setid_grupo_cliente((Long) value);cliente.setgrupocliente_descripcion(clienteBeanSwingJInternalFrame.getActualGrupoClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {cliente.setid_titulo_cliente((Long) value);cliente.settitulocliente_descripcion(clienteBeanSwingJInternalFrame.getActualTituloClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {cliente.setid_area_cr((Long) value);cliente.setareacr_descripcion(clienteBeanSwingJInternalFrame.getActualAreaCrForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {cliente.setid_estado_cliente((Long) value);cliente.setestadocliente_descripcion(clienteBeanSwingJInternalFrame.getActualEstadoClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {cliente.setobservacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {cliente.setid_pais((Long) value);cliente.setpais_descripcion(clienteBeanSwingJInternalFrame.getActualPaisForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {cliente.setid_region((Long) value);cliente.setregion_descripcion(clienteBeanSwingJInternalFrame.getActualRegionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {cliente.setid_provincia((Long) value);cliente.setprovincia_descripcion(clienteBeanSwingJInternalFrame.getActualProvinciaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {cliente.setid_ciudad((Long) value);cliente.setciudad_descripcion(clienteBeanSwingJInternalFrame.getActualCiudadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {cliente.setid_zona((Long) value);cliente.setzona_descripcion(clienteBeanSwingJInternalFrame.getActualZonaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {cliente.setid_pais_nacionalidad((Long) value);cliente.setpaisnacionalidad_descripcion(clienteBeanSwingJInternalFrame.getActualPaisNacionalidadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {cliente.setid_tipo_cargo_labo((Long) value);cliente.settipocargolabo_descripcion(clienteBeanSwingJInternalFrame.getActualTipoCargoLaboForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {cliente.setid_tipo_nivel_edu((Long) value);cliente.settiponiveledu_descripcion(clienteBeanSwingJInternalFrame.getActualTipoNivelEduForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {cliente.setid_profesion((Long) value);cliente.setprofesion_descripcion(clienteBeanSwingJInternalFrame.getActualProfesionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {cliente.setid_tipo_genero((Long) value);cliente.settipogenero_descripcion(clienteBeanSwingJInternalFrame.getActualTipoGeneroForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {cliente.setid_estado_civil((Long) value);cliente.setestadocivil_descripcion(clienteBeanSwingJInternalFrame.getActualEstadoCivilForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {cliente.setid_estado_legal((Long) value);cliente.setestadolegal_descripcion(clienteBeanSwingJInternalFrame.getActualEstadoLegalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {cliente.setfecha_nacimiento((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {cliente.setpath_imagen_firma((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {cliente.setcontacto((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {cliente.setid_cuenta_contable((Long) value);cliente.setcuentacontable_descripcion(clienteBeanSwingJInternalFrame.getActualCuentaContableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 36: try {cliente.setid_ruta((Long) value);cliente.setruta_descripcion(clienteBeanSwingJInternalFrame.getActualRutaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 37: try {cliente.setid_vendedor((Long) value);cliente.setvendedor_descripcion(clienteBeanSwingJInternalFrame.getActualVendedorForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 38: try {cliente.setid_centro_actividad((Long) value);cliente.setcentroactividad_descripcion(clienteBeanSwingJInternalFrame.getActualCentroActividadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 39: try {cliente.setrepresentante((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 40: try {cliente.setid_tipo_garantia_empresa((Long) value);cliente.settipogarantiaempresa_descripcion(clienteBeanSwingJInternalFrame.getActualTipoGarantiaEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 41: try {cliente.setnombre_garantia((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 42: try {cliente.setvalor_garantia((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 43: try {cliente.setid_cate_tipo_afiliacion((Long) value);cliente.setcatetipoafiliacion_descripcion(clienteBeanSwingJInternalFrame.getActualCateTipoAfiliacionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 44: try {cliente.setnumero_carga((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 45: try {cliente.setcredito_usado((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 46: try {cliente.setlimite_credito((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 47: try {cliente.setcredito_disponible((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 48: try {cliente.settotal_documentos((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 49: try {cliente.setfecha_ultima_factura((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 50: try {cliente.setdescuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 51: try {cliente.setid_dia((Long) value);cliente.setdia_descripcion(clienteBeanSwingJInternalFrame.getActualDiaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 52: try {cliente.sethora_pago((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 53: try {cliente.setid_empleado((Long) value);cliente.setempleado_descripcion(clienteBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 54: try {cliente.setcobranzas((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 55: try {cliente.setmotivo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 56: try {cliente.setpreferencia((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 57: try {cliente.setcon_separacion_bienes((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 58: try {cliente.setid_tipo_precio((Long) value);cliente.settipoprecio_descripcion(clienteBeanSwingJInternalFrame.getActualTipoPrecioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 59: try {cliente.setid_tipo_lista_precio((Long) value);cliente.settipolistaprecio_descripcion(clienteBeanSwingJInternalFrame.getActualTipoListaPrecioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 60: try {cliente.setdetalle_estado((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 61: try {cliente.setes_contribuyente_especial((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public ClienteModel(JInternalFrameBase jInternalFrameBase) {
			this.jInternalFrameBase=jInternalFrameBase;
		}
		*/
		
		@Override
		public void propertyChange(PropertyChangeEvent evt) {
			try {
				this.jInternalFrameBase.procesoActualizarFilaTotales();
					
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER FIN
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private ClienteDetalleFormJInternalFrame clienteJInternalFrame=null;
		
		public ClienteModel(ClienteDetalleFormJInternalFrame clienteJInternalFrame) {
			this.clienteJInternalFrame=clienteJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.clienteJInternalFrame.getjButtonActualizarToolBarCliente();
			
			if(component!=null && component.equals(this.clienteJInternalFrame.getjButtonActualizarToolBarCliente())) {
				componentTab=this.clienteJInternalFrame.getjButtonEliminarToolBarCliente();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.clienteJInternalFrame.getjButtonEliminarToolBarCliente())) {
				componentTab=this.clienteJInternalFrame.getjButtonCancelarToolBarCliente();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.clienteJInternalFrame.getjButtonCancelarToolBarCliente())) {
				componentTab=this.clienteJInternalFrame.jComboBoxid_empresaCliente;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.clienteJInternalFrame.jCheckBoxes_contribuyente_especialCliente)) {
				componentTab=this.clienteJInternalFrame.jComboBoxTiposAccionesFormularioCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxTiposAccionesFormularioCliente)) {
				componentTab=this.clienteJInternalFrame.jButtonEliminarCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.clienteJInternalFrame.jButtonEliminarCliente)) {
				componentTab=this.clienteJInternalFrame.jButtonActualizarCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.clienteJInternalFrame.jButtonActualizarCliente)) {
				componentTab=this.clienteJInternalFrame.jButtonCancelarCliente;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_empresaCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_sucursalCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_sucursalCliente)) {
			componentTab=this.clienteJInternalFrame.jTextFieldcodigoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextFieldcodigoCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_tipo_identificacionCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_tipo_identificacionCliente)) {
			componentTab=this.clienteJInternalFrame.jTextFieldidentificacionCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextFieldidentificacionCliente)) {
			componentTab=this.clienteJInternalFrame.jTextFieldrucCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextFieldrucCliente)) {
			componentTab=this.clienteJInternalFrame.jTextAreanombreCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextAreanombreCliente)) {
			componentTab=this.clienteJInternalFrame.jTextAreaapellidoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextAreaapellidoCliente)) {
			componentTab=this.clienteJInternalFrame.jTextAreanombre_comercialCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextAreanombre_comercialCliente)) {
			componentTab=this.clienteJInternalFrame.jTextFieldtelefonoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextFieldtelefonoCliente)) {
			componentTab=this.clienteJInternalFrame.jTextAreadireccionCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextAreadireccionCliente)) {
			componentTab=this.clienteJInternalFrame.jCheckBoxes_proveCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jCheckBoxes_proveCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_grupo_clienteCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_grupo_clienteCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_titulo_clienteCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_titulo_clienteCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_area_crCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_area_crCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_estado_clienteCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_estado_clienteCliente)) {
			componentTab=this.clienteJInternalFrame.jTextAreaobservacionCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextAreaobservacionCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_paisCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_paisCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_regionCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_regionCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_provinciaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_provinciaCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_ciudadCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_ciudadCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_zonaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_zonaCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_pais_nacionalidadCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_pais_nacionalidadCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_tipo_cargo_laboCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_tipo_cargo_laboCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_tipo_nivel_eduCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_tipo_nivel_eduCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_profesionCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_profesionCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_tipo_generoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_tipo_generoCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_estado_civilCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_estado_civilCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_estado_legalCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_estado_legalCliente)) {
			componentTab=this.clienteJInternalFrame.jDateChooserfecha_nacimientoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jDateChooserfecha_nacimientoCliente)) {
			componentTab=this.clienteJInternalFrame.jTextAreapath_imagen_firmaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextAreapath_imagen_firmaCliente)) {
			componentTab=this.clienteJInternalFrame.jTextAreacontactoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextAreacontactoCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_cuenta_contableCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_cuenta_contableCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_rutaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_rutaCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_vendedorCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_vendedorCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_centro_actividadCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_centro_actividadCliente)) {
			componentTab=this.clienteJInternalFrame.jTextArearepresentanteCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextArearepresentanteCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_tipo_garantia_empresaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_tipo_garantia_empresaCliente)) {
			componentTab=this.clienteJInternalFrame.jTextAreanombre_garantiaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextAreanombre_garantiaCliente)) {
			componentTab=this.clienteJInternalFrame.jTextFieldvalor_garantiaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextFieldvalor_garantiaCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_cate_tipo_afiliacionCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_cate_tipo_afiliacionCliente)) {
			componentTab=this.clienteJInternalFrame.jTextFieldnumero_cargaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextFieldnumero_cargaCliente)) {
			componentTab=this.clienteJInternalFrame.jTextFieldcredito_usadoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextFieldcredito_usadoCliente)) {
			componentTab=this.clienteJInternalFrame.jTextFieldlimite_creditoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextFieldlimite_creditoCliente)) {
			componentTab=this.clienteJInternalFrame.jTextFieldcredito_disponibleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextFieldcredito_disponibleCliente)) {
			componentTab=this.clienteJInternalFrame.jTextFieldtotal_documentosCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextFieldtotal_documentosCliente)) {
			componentTab=this.clienteJInternalFrame.jDateChooserfecha_ultima_facturaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jDateChooserfecha_ultima_facturaCliente)) {
			componentTab=this.clienteJInternalFrame.jTextFielddescuentoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextFielddescuentoCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_diaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_diaCliente)) {
			componentTab=this.clienteJInternalFrame.jSpinnerhora_pagoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jSpinnerhora_pagoCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_empleadoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_empleadoCliente)) {
			componentTab=this.clienteJInternalFrame.jTextAreacobranzasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextAreacobranzasCliente)) {
			componentTab=this.clienteJInternalFrame.jTextAreamotivoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextAreamotivoCliente)) {
			componentTab=this.clienteJInternalFrame.jTextAreapreferenciaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextAreapreferenciaCliente)) {
			componentTab=this.clienteJInternalFrame.jCheckBoxcon_separacion_bienesCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jCheckBoxcon_separacion_bienesCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_tipo_precioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_tipo_precioCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_tipo_lista_precioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_tipo_lista_precioCliente)) {
			componentTab=this.clienteJInternalFrame.jTextAreadetalle_estadoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextAreadetalle_estadoCliente)) {
			componentTab=this.clienteJInternalFrame.jCheckBoxes_contribuyente_especialCliente;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.clienteJInternalFrame.getjButtonActualizarToolBarCliente();
			
			if(component!=null && component.equals(this.clienteJInternalFrame.getjButtonEliminarToolBarCliente())) {
				componentTab=this.clienteJInternalFrame.getjButtonActualizarToolBarCliente();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.clienteJInternalFrame.getjButtonCancelarToolBarCliente())) {
				componentTab=this.clienteJInternalFrame.getjButtonEliminarToolBarCliente();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_empresaCliente)) {
				
				componentTab=this.clienteJInternalFrame.getjButtonCancelarToolBarCliente();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxTiposAccionesFormularioCliente)) {
				componentTab=this.clienteJInternalFrame.jCheckBoxes_contribuyente_especialCliente;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.clienteJInternalFrame.jButtonEliminarCliente)) {
				componentTab=this.clienteJInternalFrame.jComboBoxTiposAccionesFormularioCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.clienteJInternalFrame.jButtonActualizarCliente)) {
				componentTab=this.clienteJInternalFrame.jButtonEliminarCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.clienteJInternalFrame.jButtonCancelarCliente)) {
				componentTab=this.clienteJInternalFrame.jButtonActualizarCliente;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_sucursalCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_empresaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextFieldcodigoCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_sucursalCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_tipo_identificacionCliente)) {
			componentTab=this.clienteJInternalFrame.jTextFieldcodigoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextFieldidentificacionCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_tipo_identificacionCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextFieldrucCliente)) {
			componentTab=this.clienteJInternalFrame.jTextFieldidentificacionCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextAreanombreCliente)) {
			componentTab=this.clienteJInternalFrame.jTextFieldrucCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextAreaapellidoCliente)) {
			componentTab=this.clienteJInternalFrame.jTextAreanombreCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextAreanombre_comercialCliente)) {
			componentTab=this.clienteJInternalFrame.jTextAreaapellidoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextFieldtelefonoCliente)) {
			componentTab=this.clienteJInternalFrame.jTextAreanombre_comercialCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextAreadireccionCliente)) {
			componentTab=this.clienteJInternalFrame.jTextFieldtelefonoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jCheckBoxes_proveCliente)) {
			componentTab=this.clienteJInternalFrame.jTextAreadireccionCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_grupo_clienteCliente)) {
			componentTab=this.clienteJInternalFrame.jCheckBoxes_proveCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_titulo_clienteCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_grupo_clienteCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_area_crCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_titulo_clienteCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_estado_clienteCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_area_crCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextAreaobservacionCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_estado_clienteCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_paisCliente)) {
			componentTab=this.clienteJInternalFrame.jTextAreaobservacionCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_regionCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_paisCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_provinciaCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_regionCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_ciudadCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_provinciaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_zonaCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_ciudadCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_pais_nacionalidadCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_zonaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_tipo_cargo_laboCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_pais_nacionalidadCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_tipo_nivel_eduCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_tipo_cargo_laboCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_profesionCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_tipo_nivel_eduCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_tipo_generoCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_profesionCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_estado_civilCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_tipo_generoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_estado_legalCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_estado_civilCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jDateChooserfecha_nacimientoCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_estado_legalCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextAreapath_imagen_firmaCliente)) {
			componentTab=this.clienteJInternalFrame.jDateChooserfecha_nacimientoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextAreacontactoCliente)) {
			componentTab=this.clienteJInternalFrame.jTextAreapath_imagen_firmaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_cuenta_contableCliente)) {
			componentTab=this.clienteJInternalFrame.jTextAreacontactoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_rutaCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_cuenta_contableCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_vendedorCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_rutaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_centro_actividadCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_vendedorCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextArearepresentanteCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_centro_actividadCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_tipo_garantia_empresaCliente)) {
			componentTab=this.clienteJInternalFrame.jTextArearepresentanteCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextAreanombre_garantiaCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_tipo_garantia_empresaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextFieldvalor_garantiaCliente)) {
			componentTab=this.clienteJInternalFrame.jTextAreanombre_garantiaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_cate_tipo_afiliacionCliente)) {
			componentTab=this.clienteJInternalFrame.jTextFieldvalor_garantiaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextFieldnumero_cargaCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_cate_tipo_afiliacionCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextFieldcredito_usadoCliente)) {
			componentTab=this.clienteJInternalFrame.jTextFieldnumero_cargaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextFieldlimite_creditoCliente)) {
			componentTab=this.clienteJInternalFrame.jTextFieldcredito_usadoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextFieldcredito_disponibleCliente)) {
			componentTab=this.clienteJInternalFrame.jTextFieldlimite_creditoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextFieldtotal_documentosCliente)) {
			componentTab=this.clienteJInternalFrame.jTextFieldcredito_disponibleCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jDateChooserfecha_ultima_facturaCliente)) {
			componentTab=this.clienteJInternalFrame.jTextFieldtotal_documentosCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextFielddescuentoCliente)) {
			componentTab=this.clienteJInternalFrame.jDateChooserfecha_ultima_facturaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_diaCliente)) {
			componentTab=this.clienteJInternalFrame.jTextFielddescuentoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jSpinnerhora_pagoCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_diaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_empleadoCliente)) {
			componentTab=this.clienteJInternalFrame.jSpinnerhora_pagoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextAreacobranzasCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_empleadoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextAreamotivoCliente)) {
			componentTab=this.clienteJInternalFrame.jTextAreacobranzasCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextAreapreferenciaCliente)) {
			componentTab=this.clienteJInternalFrame.jTextAreamotivoCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jCheckBoxcon_separacion_bienesCliente)) {
			componentTab=this.clienteJInternalFrame.jTextAreapreferenciaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_tipo_precioCliente)) {
			componentTab=this.clienteJInternalFrame.jCheckBoxcon_separacion_bienesCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jComboBoxid_tipo_lista_precioCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_tipo_precioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jTextAreadetalle_estadoCliente)) {
			componentTab=this.clienteJInternalFrame.jComboBoxid_tipo_lista_precioCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteJInternalFrame.jCheckBoxes_contribuyente_especialCliente)) {
			componentTab=this.clienteJInternalFrame.jTextAreadetalle_estadoCliente;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.clienteJInternalFrame.getjButtonActualizarToolBarCliente();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.clienteJInternalFrame.getjButtonActualizarToolBarCliente();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.clienteJInternalFrame.getjButtonCancelarToolBarCliente();
			
			
			return componentTab;		
		}
		
		public ClienteDetalleFormJInternalFrame getclienteJInternalFrame() {
			return this.clienteJInternalFrame;
		}
		
		public void setclienteJInternalFrame(ClienteDetalleFormJInternalFrame clienteJInternalFrame) {
			this.clienteJInternalFrame=clienteJInternalFrame;
		}
		
		public Component getComponentTab() {
			return this.componentTab;
		}
		
		public void setComponentTab(Component componentTab) {
			this.componentTab=componentTab;
		}
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY FIN*/
		
		
		/*FUNCIONES PARA AbstractTableModel*/
		/*
		Notas:
		* Si Cambia version se copia variables y metodos que no son sobreescritos en esta clase.(Usa Jdk 8)
		* Se copia del Jdk javax.swing.table.AbstractTableModel
		* Los argumentos usados es de tipo Interface TableModel no de Clase AbstractTableModel
		* Si se cambia y/o actualiza jdj, toca actualizar el código nuevamente
		*/
		
		protected EventListenerList listenerList = new EventListenerList();

		public int findColumn(String columnName) {
			for (int i = 0; i < getColumnCount(); i++) {
				if (columnName.equals(getColumnName(i))) {
					return i;
				}
			}
			return -1;
		}
		
		public void addTableModelListener(TableModelListener l) {
        	listenerList.add(TableModelListener.class, l);
    	}
		
		public void removeTableModelListener(TableModelListener l) {
        	listenerList.remove(TableModelListener.class, l);
    	}
		
		public TableModelListener[] getTableModelListeners() {
			return listenerList.getListeners(TableModelListener.class);
		}
		
		public void fireTableDataChanged() {
			fireTableChanged(new TableModelEvent(this));
		}
		
		public void fireTableStructureChanged() {
        	fireTableChanged(new TableModelEvent(this, TableModelEvent.HEADER_ROW));
    	}
		
		public void fireTableRowsInserted(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT));
		}
	
		public void fireTableRowsUpdated(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.UPDATE));
		}
		
		public void fireTableRowsDeleted(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE));
		}
	
		public void fireTableCellUpdated(int row, int column) {
			fireTableChanged(new TableModelEvent(this, row, row, column));
		}
		
		public void fireTableChanged(TableModelEvent e) {
			// Guaranteed to return a non-null array
			Object[] listeners = listenerList.getListenerList();
			// Process the listeners last to first, notifying
			// those that are interested in this event
			for (int i = listeners.length-2; i>=0; i-=2) {
				if (listeners[i]==TableModelListener.class) {
					((TableModelListener)listeners[i+1]).tableChanged(e);
				}
			}
		}
		
		public <T extends EventListener> T[] getListeners(Class<T> listenerType) {
			return listenerList.getListeners(listenerType);
		}
		/*FUNCIONES PARA AbstractTableModel FIN*/
}
